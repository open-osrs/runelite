/*
 * Copyright (c) 2018, Kruithne <kruithne@gmail.com>
 * Copyright (c) 2018, Psikoi <https://github.com/psikoi>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.skillcalculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.inject.Singleton;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import lombok.AccessLevel;
import lombok.Getter;
import net.runelite.api.Client;
import net.runelite.api.Experience;
import net.runelite.api.Skill;
import net.runelite.client.game.ItemManager;
import net.runelite.client.game.SpriteManager;
import net.runelite.client.plugins.skillcalculator.beans.SkillData;
import net.runelite.client.plugins.skillcalculator.beans.SkillDataBonus;
import net.runelite.client.plugins.skillcalculator.beans.SkillDataEntry;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.DynamicGridLayout;
import net.runelite.client.ui.FontManager;
import net.runelite.client.ui.PluginPanel;
import net.runelite.client.ui.components.IconTextField;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

@Singleton
class SkillCalculator extends JPanel
{
	private static final int MAX_XP = 200_000_000;
	private static final DecimalFormat XP_FORMAT = new DecimalFormat("#.#");

	private final UICalculatorInputArea uiInput;
	private final Client client;
	private final SpriteManager spriteManager;
	private final ItemManager itemManager;
	private final List<UIActionSlot> uiActionSlots = new ArrayList<>();
	private final CacheSkillData cacheSkillData = new CacheSkillData();
	@Getter(AccessLevel.PACKAGE)
	private final UICombinedActionSlot combinedActionSlot;
	@Getter(AccessLevel.PACKAGE)
	private final ArrayList<UIActionSlot> combinedActionSlots = new ArrayList<>();
	private final List<JCheckBox> bonusCheckBoxes = new ArrayList<>();
	private final IconTextField searchBar = new IconTextField();

	private SkillData skillData;
	private int currentLevel = 1;
	private int currentXP = Experience.getXpForLevel(currentLevel);
	private int targetLevel = currentLevel + 1;
	private int targetXP = Experience.getXpForLevel(targetLevel);
	private float xpFactor = 1.0f;
	private float lastBonus = 0.0f;
	private CalculatorType calculatorType;

	SkillCalculator(final Client client, final UICalculatorInputArea uiInput, final SpriteManager spriteManager, final ItemManager itemManager)
	{
		this.client = client;
		this.uiInput = uiInput;
		this.spriteManager = spriteManager;
		this.itemManager = itemManager;

		combinedActionSlot = new UICombinedActionSlot(spriteManager);

		searchBar.setIcon(IconTextField.Icon.SEARCH);
		searchBar.setPreferredSize(new Dimension(PluginPanel.PANEL_WIDTH - 20, 30));
		searchBar.setBackground(ColorScheme.DARKER_GRAY_COLOR);
		searchBar.setHoverBackgroundColor(ColorScheme.DARK_GRAY_HOVER_COLOR);
		searchBar.addKeyListener(e -> onSearch());

		setLayout(new DynamicGridLayout(0, 1, 0, 5));

		// Register listeners on the input fields and then move on to the next related text field
		uiInput.getUiFieldCurrentLevel().addActionListener(e ->
		{
			onFieldCurrentLevelUpdated();
			uiInput.getUiFieldTargetLevel().requestFocusInWindow();
		});

		uiInput.getUiFieldCurrentXP().addActionListener(e ->
		{
			onFieldCurrentXPUpdated();
			uiInput.getUiFieldTargetXP().requestFocusInWindow();
		});

		uiInput.getUiFieldTargetLevel().addActionListener(e -> onFieldTargetLevelUpdated());
		uiInput.getUiFieldTargetXP().addActionListener(e -> onFieldTargetXPUpdated());
	}

	void openCalculator(CalculatorType calculatorType)
	{
		this.calculatorType = calculatorType;

		// Load the skill data.
		skillData = cacheSkillData.getSkillData(calculatorType.getDataFile());

		// Reset the XP factor, removing bonuses.
		xpFactor = 1.0f;

		// Update internal skill/XP values.
		updateInternalValues();

		// BankedCalculator prevents these from being editable so just ensure they are editable.
		uiInput.getUiFieldTargetLevel().setEditable(true);
		uiInput.getUiFieldTargetXP().setEditable(true);

		// Remove all components (action slots) from this panel.
		removeAll();

		// Clear the search bar
		searchBar.setText(null);

		// Clear the search bar
		searchBar.setText(null);

		// Add in checkboxes for available skill bonuses.
		renderBonusOptions();

		// Add the combined action slot.
		add(combinedActionSlot);

		// Add the search bar
		add(searchBar);

		// Create action slots for the skill actions.
		renderActionSlots();

		// Update the input fields.
		updateInputFields();
	}

	private void updateInternalValues()
	{
		updateCurrentValues();
		updateTargetValues();
	}

	private void updateCurrentValues()
	{
		currentXP = client.getSkillExperience(calculatorType.getSkill());
		currentLevel = Experience.getLevelForXp(currentXP);
	}

	private void updateTargetValues()
	{
		targetLevel = enforceSkillBounds(currentLevel + 1);
		targetXP = Experience.getXpForLevel(targetLevel);
	}

	private void updateCombinedAction()
	{
		int size = combinedActionSlots.size();
		if (size > 1)
		{
			combinedActionSlot.setTitle(size + " actions selected");
		}
		else if (size == 1)
		{
			combinedActionSlot.setTitle("1 action selected");
		}
		else
		{
			combinedActionSlot.setTitle("No action selected");
			combinedActionSlot.setText("Shift-click to select multiple");
			return;
		}

		int actionCount = 0;
		int neededXP = targetXP - currentXP;
		double xp = 0;

		for (UIActionSlot slot : combinedActionSlots)
		{
			xp += slot.getValue();
		}

		if (neededXP > 0)
		{
			assert xp != 0;
			actionCount = (int) Math.ceil(neededXP / xp);
		}

		combinedActionSlot.setText(formatXPActionString(xp, actionCount, "exp - "));
	}

	private void clearCombinedSlots()
	{
		for (UIActionSlot slot : combinedActionSlots)
		{
			slot.setSelected(false);
		}

		combinedActionSlots.clear();
	}

	private void renderBonusOptions()
	{
		if (skillData.getBonuses() != null)
		{
			List<JCheckBox> uiCheckBoxList = new ArrayList<>();
			lastBonus = 0.0f;

			for (SkillDataBonus bonus : skillData.getBonuses())
			{
				Pair<JPanel, List<JCheckBox>> combinedCheckboxPanel = buildCheckboxPanel(bonus, uiCheckBoxList);
				JPanel checkboxPanel = combinedCheckboxPanel.getKey();
				uiCheckBoxList = combinedCheckboxPanel.getValue();

				add(checkboxPanel);
			}

			add(Box.createRigidArea(new Dimension(0, 5)));
		}
	}

	private Pair<JPanel, List<JCheckBox>> buildCheckboxPanel(SkillDataBonus bonus, List<JCheckBox> uiCheckBoxList)
	{
		JPanel uiOption = new JPanel(new BorderLayout());
		JLabel uiLabel = new JLabel(bonus.getName());
		JCheckBox uiCheckbox = new JCheckBox();

		uiLabel.setForeground(Color.WHITE);
		uiLabel.setFont(FontManager.getSmallFont(getFont()));

		uiOption.setBorder(BorderFactory.createEmptyBorder(3, 7, 3, 0));
		uiOption.setBackground(ColorScheme.DARKER_GRAY_COLOR);

		JCheckBox uiCheckBox = new JCheckBox();
		uiCheckBox.setBackground(ColorScheme.MEDIUM_GRAY_COLOR);
		uiCheckBox.addActionListener(e ->
		{
			if (uiCheckBox.isSelected())
			{
				adjustXPBonus(uiCheckBox.isSelected(), bonus.getValue());
				lastBonus = bonus.getValue();

				for (JCheckBox checkBox : uiCheckBoxList)
				{
					if (checkBox != uiCheckBox)
					{
						checkBox.setSelected(false);
					}
				}
			}
			else if (xpFactor > 1.0)
			{
				xpFactor = 1.0f;
				lastBonus = 0.0f;
				calculate();
			}

			updateCombinedAction();
		});

		uiCheckBoxList.add(uiCheckBox);

		uiOption.add(uiCheckBox, BorderLayout.EAST);

		uiOption.add(uiLabel, BorderLayout.WEST);
		bonusCheckBoxes.add(uiCheckbox);

		return new ImmutablePair<>(uiOption, uiCheckBoxList);
	}

	private void renderActionSlots()
	{
		// Wipe the list of references to the slot components.
		uiActionSlots.clear();

		// Create new components for the action slots.
		for (SkillDataEntry action : skillData.getActions())
		{
			JLabel uiIcon = new JLabel();

			if (action.getIcon() != null)
			{
				itemManager.getImage(action.getIcon()).addTo(uiIcon);
			}
			else if (action.getSprite() != null)
			{
				spriteManager.addSpriteTo(uiIcon, action.getSprite(), 0);
			}

			UIActionSlot slot = new UIActionSlot(action, uiIcon);
			uiActionSlots.add(slot); // Keep our own reference.
			add(slot); // Add component to the panel.

			slot.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mousePressed(MouseEvent e)
				{
					if (!e.isShiftDown())
					{
						clearCombinedSlots();
					}

					if (slot.isSelected())
					{
						combinedActionSlots.remove(slot);
					}
					else
					{
						combinedActionSlots.add(slot);
					}

					slot.setSelected(!slot.isSelected());
					updateCombinedAction();
				}
			});
		}

		// Refresh the rendering of this panel.
		revalidate();
		repaint();
	}

	private void calculate()
	{
		for (UIActionSlot slot : uiActionSlots)
		{
			int actionCount = 0;
			int neededXP = targetXP - currentXP;
			SkillDataEntry action = slot.getAction();
			double xp = (action.isIgnoreBonus()) ? action.getXp() : action.getXp() * xpFactor;

			if (neededXP > 0)
			{
				actionCount = (int) Math.ceil(neededXP / xp);
			}

			slot.setText("Lvl. " + action.getLevel() + " (" + formatXPActionString(xp, actionCount, "exp) - "));
			slot.setAvailable(currentLevel >= action.getLevel());
			slot.setOverlapping(action.getLevel() < targetLevel);
			slot.setValue(xp);
		}

		updateCombinedAction();
	}

	private String formatXPActionString(double xp, int actionCount, String expExpression)
	{
		return XP_FORMAT.format(xp) + expExpression + NumberFormat.getIntegerInstance().format(actionCount) + (actionCount > 1 ? " actions" : " action");
	}

	private void updateInputFields()
	{
		if (targetXP < currentXP)
		{
			targetLevel = enforceSkillBounds(currentLevel + 1);
			targetXP = Experience.getXpForLevel(targetLevel);
		}

		uiInput.setCurrentLevelInput(currentLevel);
		uiInput.setCurrentXPInput(currentXP);
		uiInput.setTargetLevelInput(targetLevel);
		uiInput.setTargetXPInput(targetXP);
		calculate();
	}

	private void adjustXPBonus(boolean addBonus, float value)
	{
		clearLastBonus();
		xpFactor += addBonus ? value : -value;
		calculate();
	}

	private void clearLastBonus()
	{
		xpFactor -= lastBonus;
		calculate();
	}

	private void onFieldCurrentLevelUpdated()
	{
		currentLevel = enforceSkillBounds(uiInput.getCurrentLevelInput());
		currentXP = Experience.getXpForLevel(currentLevel);
		updateInputFields();
	}

	private void onFieldCurrentXPUpdated()
	{
		currentXP = enforceXPBounds(uiInput.getCurrentXPInput());
		currentLevel = Experience.getLevelForXp(currentXP);
		updateInputFields();
	}

	private void onFieldTargetLevelUpdated()
	{
		targetLevel = enforceSkillBounds(uiInput.getTargetLevelInput());
		targetXP = Experience.getXpForLevel(targetLevel);
		updateInputFields();
	}

	private void onFieldTargetXPUpdated()
	{
		targetXP = enforceXPBounds(uiInput.getTargetXPInput());
		targetLevel = Experience.getLevelForXp(targetXP);
		updateInputFields();
	}

	private static int enforceSkillBounds(int input)
	{
		return Math.min(Experience.MAX_VIRT_LEVEL, Math.max(1, input));
	}

	private static int enforceXPBounds(int input)
	{
		return Math.min(MAX_XP, Math.max(0, input));
	}

	private void onSearch()
	{
		//only show slots that match our search text
		uiActionSlots.forEach(slot ->
		{
			if (slotContainsText(slot, searchBar.getText()))
			{
				super.add(slot);
			}
			else
			{
				super.remove(slot);
			}

			revalidate();
		});
	}

	private boolean slotContainsText(UIActionSlot slot, String text)
	{
		return slot.getAction().getName().toLowerCase().contains(text.toLowerCase());
	}

	/**
	 * Updates the current skill calculator (if present)
	 * <p>
	 * This method is invoked by the {@link SkillCalculatorPlugin} event subscriber
	 * when an {@link ExperienceChanged} object is posted to the event bus
	 */
	void updateSkillCalculator(Skill skill)
	{
		// If the user has selected a calculator, update its fields
		Optional.ofNullable(calculatorType).ifPresent(calc ->
		{
			if (skill.equals(calculatorType.getSkill()))
			{
				// Update our model "current" values
				updateCurrentValues();

				// Update the UI to reflect our new model
				updateInputFields();
			}
		});
	}
}