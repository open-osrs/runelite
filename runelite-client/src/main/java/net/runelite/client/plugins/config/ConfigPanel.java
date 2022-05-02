/*
 * Copyright (c) 2017, Adam <Adam@sigterm.info>
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
package net.runelite.client.plugins.config;

import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Sets;
import com.google.common.primitives.Ints;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import javax.inject.Inject;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListCellRenderer;
import javax.swing.ScrollPaneConstants;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.basic.BasicSpinnerUI;
import javax.swing.text.JTextComponent;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.events.ConfigButtonClicked;
import net.runelite.client.config.Button;
import net.runelite.client.config.ConfigDescriptor;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigItemDescriptor;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.config.ConfigObject;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.ConfigSectionDescriptor;
import net.runelite.client.config.ConfigTitle;
import net.runelite.client.config.ConfigTitleDescriptor;
import net.runelite.client.config.Keybind;
import net.runelite.client.config.ModifierlessKeybind;
import net.runelite.client.config.Range;
import net.runelite.client.config.Units;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.events.ExternalPluginsChanged;
import net.runelite.client.events.PluginChanged;
import net.runelite.client.externalplugins.ExternalPluginManager;
import net.runelite.client.externalplugins.ExternalPluginManifest;
import net.runelite.client.plugins.OPRSExternalPluginManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginManager;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.DynamicGridLayout;
import net.runelite.client.ui.FontManager;
import net.runelite.client.ui.PluginPanel;
import net.runelite.client.ui.components.ColorJButton;
import net.runelite.client.ui.components.ComboBoxListRenderer;
import net.runelite.client.ui.components.ToggleButton;
import net.runelite.client.ui.components.colorpicker.ColorPickerManager;
import net.runelite.client.ui.components.colorpicker.RuneliteColorPicker;
import net.runelite.client.util.ColorUtil;
import net.runelite.client.util.DeferredDocumentChangedListener;
import net.runelite.client.util.ImageUtil;
import net.runelite.client.util.LinkBrowser;
import net.runelite.client.util.SwingUtil;
import net.runelite.client.util.Text;

@Slf4j
class ConfigPanel extends PluginPanel
{
	private static final int SPINNER_FIELD_WIDTH = 6;
	private static final ImageIcon SECTION_EXPAND_ICON;
	private static final ImageIcon SECTION_EXPAND_ICON_HOVER;
	private static final ImageIcon SECTION_RETRACT_ICON;
	private static final ImageIcon SECTION_RETRACT_ICON_HOVER;
	static final ImageIcon BACK_ICON;
	static final ImageIcon BACK_ICON_HOVER;

	private static final Map<ConfigSectionDescriptor, Boolean> sectionExpandStates = new HashMap<>();

	static
	{
		final BufferedImage backIcon = ImageUtil.loadImageResource(ConfigPanel.class, "config_back_icon.png");
		BACK_ICON = new ImageIcon(backIcon);
		BACK_ICON_HOVER = new ImageIcon(ImageUtil.alphaOffset(backIcon, -100));

		BufferedImage sectionRetractIcon = ImageUtil.loadImageResource(ConfigPanel.class, "/util/arrow_right.png");
		sectionRetractIcon = ImageUtil.luminanceOffset(sectionRetractIcon, -121);
		SECTION_EXPAND_ICON = new ImageIcon(sectionRetractIcon);
		SECTION_EXPAND_ICON_HOVER = new ImageIcon(ImageUtil.alphaOffset(sectionRetractIcon, -100));
		final BufferedImage sectionExpandIcon = ImageUtil.rotateImage(sectionRetractIcon, Math.PI / 2);
		SECTION_RETRACT_ICON = new ImageIcon(sectionExpandIcon);
		SECTION_RETRACT_ICON_HOVER = new ImageIcon(ImageUtil.alphaOffset(sectionExpandIcon, -100));
	}

	private final PluginListPanel pluginList;
	private final ConfigManager configManager;
	private final PluginManager pluginManager;
	private final ExternalPluginManager externalPluginManager;
	private final ColorPickerManager colorPickerManager;
	private final OPRSExternalPluginManager oprsExternalPluginManager;
	private final EventBus eventBus;

	private final ListCellRenderer<Enum<?>> listCellRenderer = new ComboBoxListRenderer<>();

	private final JScrollPane scrollPane;
	private final FixedWidthPanel mainPanel;
	private final JLabel title;
	private final PluginToggleButton pluginToggle;

	private PluginConfigurationDescriptor pluginConfig = null;
	private boolean skipRebuild;


	@Inject
	private ConfigPanel(PluginListPanel pluginList, ConfigManager configManager, PluginManager pluginManager,
						ExternalPluginManager externalPluginManager, ColorPickerManager colorPickerManager,
						OPRSExternalPluginManager oprsExternalPluginManager, EventBus eventBus)
	{
		super(false);

		this.pluginList = pluginList;
		this.configManager = configManager;
		this.pluginManager = pluginManager;
		this.externalPluginManager = externalPluginManager;
		this.colorPickerManager = colorPickerManager;
		this.oprsExternalPluginManager = oprsExternalPluginManager;
		this.eventBus = eventBus;

		setLayout(new BorderLayout());
		setBackground(ColorScheme.DARK_GRAY_COLOR);

		JPanel topPanel = new JPanel();
		topPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		topPanel.setLayout(new BorderLayout(0, BORDER_OFFSET));
		add(topPanel, BorderLayout.NORTH);

		mainPanel = new FixedWidthPanel();
		mainPanel.setBorder(new EmptyBorder(8, 10, 10, 10));
		mainPanel.setLayout(new DynamicGridLayout(0, 1, 0, 5));
		mainPanel.setAlignmentX(Component.LEFT_ALIGNMENT);

		JPanel northPanel = new FixedWidthPanel();
		northPanel.setLayout(new BorderLayout());
		northPanel.add(mainPanel, BorderLayout.NORTH);

		scrollPane = new JScrollPane(northPanel);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		add(scrollPane, BorderLayout.CENTER);

		JButton topPanelBackButton = new JButton(BACK_ICON);
		topPanelBackButton.setRolloverIcon(BACK_ICON_HOVER);
		SwingUtil.removeButtonDecorations(topPanelBackButton);
		topPanelBackButton.setPreferredSize(new Dimension(22, 0));
		topPanelBackButton.setBorder(new EmptyBorder(0, 0, 0, 5));
		topPanelBackButton.addActionListener(e -> pluginList.getMuxer().popState());
		topPanelBackButton.setToolTipText("Back");
		topPanel.add(topPanelBackButton, BorderLayout.WEST);

		pluginToggle = new PluginToggleButton();
		topPanel.add(pluginToggle, BorderLayout.EAST);
		title = new JLabel();
		title.setForeground(Color.WHITE);

		topPanel.add(title);
	}

	void init(PluginConfigurationDescriptor pluginConfig)
	{
		assert this.pluginConfig == null;
		this.pluginConfig = pluginConfig;

		scrollPane.getVerticalScrollBar().setValue(0);

		String name = pluginConfig.getName();
		title.setText(name);
		title.setForeground(Color.WHITE);
		title.setToolTipText("<html>" + name + ":<br>" + pluginConfig.getDescription() + "</html>");

		ExternalPluginManifest mf = pluginConfig.getExternalPluginManifest();
		JMenuItem uninstallItem = null;
		if (mf != null)
		{
			uninstallItem = new JMenuItem("Uninstall");
			uninstallItem.addActionListener(ev -> externalPluginManager.remove(mf.getInternalName()));
		}

		PluginListItem.addLabelPopupMenu(title, pluginConfig.createSupportMenuItem(), uninstallItem);

		if (pluginConfig.getPlugin() != null)
		{
			pluginToggle.setConflicts(pluginConfig.getConflicts());
			pluginToggle.setSelected(pluginManager.isPluginEnabled(pluginConfig.getPlugin()));
			pluginToggle.addItemListener(i ->
			{
				if (pluginToggle.isSelected())
				{
					pluginList.startPlugin(pluginConfig.getPlugin());
				}
				else
				{
					pluginList.stopPlugin(pluginConfig.getPlugin());
				}
			});
		}
		else
		{
			pluginToggle.setVisible(false);
		}

		rebuild(false);
	}

	private void toggleSection(ConfigSectionDescriptor csd, JButton button, JPanel contents)
	{
		boolean newState = !contents.isVisible();
		contents.setVisible(newState);
		button.setIcon(newState ? SECTION_RETRACT_ICON : SECTION_EXPAND_ICON);
		button.setRolloverIcon(newState ? SECTION_RETRACT_ICON_HOVER : SECTION_EXPAND_ICON_HOVER);
		button.setToolTipText(newState ? "Retract" : "Expand");
		sectionExpandStates.put(csd, newState);
		SwingUtilities.invokeLater(contents::revalidate);
	}

	private void rebuild(boolean refresh)
	{
		int scrollBarPosition = scrollPane.getVerticalScrollBar().getValue();

		mainPanel.removeAll();

		ConfigDescriptor cd = pluginConfig.getConfigDescriptor();

		Map<String, Map<String, String>> pluginsInfoMap = oprsExternalPluginManager.getPluginsInfoMap();

		if (pluginConfig.getPlugin() != null && pluginsInfoMap.containsKey(pluginConfig.getPlugin().getClass().getSimpleName()))
		{

			JPanel infoPanel = new JPanel();
			infoPanel.setBackground(ColorScheme.DARKER_GRAY_COLOR);
			infoPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
			infoPanel.setLayout(new GridLayout(0, 1));

			final Font smallFont = FontManager.getRunescapeSmallFont();

			Map<String, String> pluginInfo = pluginsInfoMap.get(pluginConfig.getPlugin().getClass().getSimpleName());

			JLabel idLabel = new JLabel(htmlLabel("id", pluginInfo.get("id")));
			idLabel.setFont(smallFont);
			infoPanel.add(idLabel);

			JLabel versionLabel = new JLabel(htmlLabel("version", pluginInfo.get("version")));
			versionLabel.setFont(smallFont);
			infoPanel.add(versionLabel);

			JLabel providerLabel = new JLabel(htmlLabel("provider", pluginInfo.get("provider")));
			providerLabel.setFont(smallFont);
			infoPanel.add(providerLabel);

			JButton button = new JButton("Support");
			button.addActionListener(e -> LinkBrowser.browse(pluginInfo.get("support")));

			JSeparator separator = new JSeparator()
			{
				@Override
				protected void paintComponent(Graphics g)
				{
					int width = this.getSize().width;
					Graphics2D g2 = (Graphics2D) g;
					g2.setStroke(new BasicStroke(2));
					g2.setColor(ColorScheme.BRAND_BLUE);
					g2.drawLine(0, 0, width, 0);
				}
			};

			mainPanel.add(infoPanel);
			mainPanel.add(button);
			mainPanel.add(separator);
		}

		final Map<String, JPanel> sectionWidgets = new HashMap<>();
		final Map<String, JPanel> titleWidgets = new HashMap<>();
		final Map<ConfigObject, JPanel> topLevelPanels = new TreeMap<>((a, b) ->
			ComparisonChain.start()
				.compare(a.position(), b.position())
				.compare(a.name(), b.name())
				.result());

		for (ConfigSectionDescriptor csd : cd.getSections())
		{
			ConfigSection cs = csd.getSection();
			final boolean isOpen = sectionExpandStates.getOrDefault(csd, !cs.closedByDefault());

			final JPanel section = new JPanel();
			section.setLayout(new BoxLayout(section, BoxLayout.Y_AXIS));
			section.setMinimumSize(new Dimension(PANEL_WIDTH, 0));

			final JPanel sectionHeader = new JPanel();
			sectionHeader.setLayout(new BorderLayout());
			sectionHeader.setMinimumSize(new Dimension(PANEL_WIDTH, 0));
			// For whatever reason, the header extends out by a single pixel when closed. Adding a single pixel of
			// border on the right only affects the width when closed, fixing the issue.
			sectionHeader.setBorder(new CompoundBorder(
				new MatteBorder(0, 0, 1, 0, ColorScheme.MEDIUM_GRAY_COLOR),
				new EmptyBorder(0, 0, 3, 1)));
			section.add(sectionHeader, BorderLayout.NORTH);

			final JButton sectionToggle = new JButton(isOpen ? SECTION_RETRACT_ICON : SECTION_EXPAND_ICON);
			sectionToggle.setRolloverIcon(isOpen ? SECTION_RETRACT_ICON_HOVER : SECTION_EXPAND_ICON_HOVER);
			sectionToggle.setPreferredSize(new Dimension(18, 0));
			sectionToggle.setBorder(new EmptyBorder(0, 0, 0, 5));
			sectionToggle.setToolTipText(isOpen ? "Retract" : "Expand");
			SwingUtil.removeButtonDecorations(sectionToggle);
			sectionHeader.add(sectionToggle, BorderLayout.WEST);

			String name = cs.name();
			final JLabel sectionName = new JLabel(name);
			sectionName.setForeground(ColorScheme.BRAND_ORANGE);
			sectionName.setFont(FontManager.getRunescapeBoldFont());
			sectionName.setToolTipText("<html>" + name + ":<br>" + cs.description() + "</html>");
			sectionHeader.add(sectionName, BorderLayout.CENTER);

			final JPanel sectionContents = new JPanel();
			sectionContents.setLayout(new DynamicGridLayout(0, 1, 0, 5));
			sectionContents.setMinimumSize(new Dimension(PANEL_WIDTH, 0));
			sectionContents.setBorder(new CompoundBorder(
				new MatteBorder(0, 0, 1, 0, ColorScheme.MEDIUM_GRAY_COLOR),
				new EmptyBorder(BORDER_OFFSET, 0, BORDER_OFFSET, 0)));
			sectionContents.setVisible(isOpen);
			section.add(sectionContents, BorderLayout.SOUTH);

			// Add listeners to each part of the header so that it's easier to toggle them
			final MouseAdapter adapter = new MouseAdapter()
			{
				@Override
				public void mouseClicked(MouseEvent e)
				{
					toggleSection(csd, sectionToggle, sectionContents);
				}
			};
			sectionToggle.addActionListener(actionEvent -> toggleSection(csd, sectionToggle, sectionContents));
			sectionName.addMouseListener(adapter);
			sectionHeader.addMouseListener(adapter);

			sectionWidgets.put(csd.getKey(), sectionContents);

			topLevelPanels.put(csd, section);
		}

		for (ConfigTitleDescriptor ctd : cd.getTitles())
		{
			ConfigTitle ct = ctd.getTitle();
			final JPanel title = new JPanel();
			title.setLayout(new BoxLayout(title, BoxLayout.Y_AXIS));
			title.setMinimumSize(new Dimension(PANEL_WIDTH, 0));

			final JPanel sectionHeader = new JPanel();
			sectionHeader.setLayout(new BorderLayout());
			sectionHeader.setMinimumSize(new Dimension(PANEL_WIDTH, 0));

			title.add(sectionHeader, BorderLayout.NORTH);

			String name = ct.name();
			final JLabel sectionName = new JLabel(name);
			sectionName.setForeground(ColorScheme.BRAND_ORANGE);
			sectionName.setFont(FontManager.getRunescapeBoldFont());
			sectionName.setToolTipText("<html>" + name + ":<br>" + ct.description() + "</html>");
			sectionName.setBorder(new EmptyBorder(0, 0, 3, 1));
			sectionHeader.add(sectionName, BorderLayout.CENTER);

			final JPanel sectionContents = new JPanel();
			sectionContents.setLayout(new DynamicGridLayout(0, 1, 0, 5));
			sectionContents.setMinimumSize(new Dimension(PANEL_WIDTH, 0));
			sectionContents.setBorder(new EmptyBorder(0, 5, 0, 0));
			title.add(sectionContents, BorderLayout.SOUTH);

			titleWidgets.put(ctd.getKey(), sectionContents);

			// Allow for sub-sections
			JPanel section = sectionWidgets.get(ct.section());
			JPanel titleSection = titleWidgets.get(ct.title());

			if (section != null)
			{
				section.add(title);
			}
			else if (titleSection != null)
			{
				titleSection.add(title);
			}
			else
			{
				topLevelPanels.put(ctd, title);
			}
		}

		for (ConfigItemDescriptor cid : cd.getItems())
		{
			if (!shouldBeHidden(cid))
			{
				continue;
			}

			JPanel item = new JPanel();
			item.setLayout(new BorderLayout());
			item.setMinimumSize(new Dimension(PANEL_WIDTH, 0));
			String name = cid.getItem().name();
			JLabel configEntryName = new JLabel(name);
			configEntryName.setForeground(Color.WHITE);
			configEntryName.setToolTipText("<html>" + name + ":<br>" + cid.getItem().description() + "</html>");
			PluginListItem.addLabelPopupMenu(configEntryName, createResetMenuItem(pluginConfig, cid));
			item.add(configEntryName, BorderLayout.CENTER);

			if (cid.getType() == Button.class)
			{
				item.remove(configEntryName);
				item.add(createButton(cd, cid), BorderLayout.CENTER);
			}
			else if (cid.getType() == boolean.class)
			{
				item.add(createCheckbox(cd, cid), BorderLayout.EAST);
			}
			else if (cid.getType() == int.class)
			{
				item.add(createIntSpinner(cd, cid), BorderLayout.EAST);
			}
			else if (cid.getType() == double.class)
			{
				item.add(createDoubleSpinner(cd, cid), BorderLayout.EAST);
			}
			else if (cid.getType() == String.class)
			{
				JTextComponent textField = createTextField(cd, cid);

				if (cid.getItem().parse())
				{
					JLabel parsingLabel = createParseLabel(cid, textField);

					item.add(configEntryName, BorderLayout.NORTH);
					item.add(textField, BorderLayout.CENTER);

					parseLabel(cid.getItem(), parsingLabel, textField.getText());
					item.add(parsingLabel, BorderLayout.SOUTH);
				}
				else
				{
					item.add(textField, BorderLayout.SOUTH);
				}
			}
			else if (cid.getType() == Color.class)
			{
				item.add(createColorPicker(cd, cid), BorderLayout.EAST);
			}
			else if (cid.getType() == Dimension.class)
			{
				item.add(createDimension(cd, cid), BorderLayout.EAST);
			}
			else if (cid.getType() instanceof Class && ((Class<?>) cid.getType()).isEnum())
			{
				item.add(createComboBox(cd, cid), BorderLayout.EAST);
			}
			else if (cid.getType() == Keybind.class || cid.getType() == ModifierlessKeybind.class)
			{
				item.add(createKeybind(cd, cid), BorderLayout.EAST);
			}
			else if (cid.getType() instanceof ParameterizedType)
			{
				ParameterizedType parameterizedType = (ParameterizedType) cid.getType();
				if (parameterizedType.getRawType() == Set.class)
				{
					item.add(createList(cd, cid), BorderLayout.SOUTH);
				}
				else if (parameterizedType.getRawType() == Consumer.class)
				{
					item.remove(configEntryName);
					item.add(createConsumer(cd, cid), BorderLayout.CENTER);
				}
				else if (parameterizedType.getRawType() == EnumSet.class)
				{
					item.add(createEnumSetLayout(cd, cid), BorderLayout.SOUTH);
				}
			}

			JPanel section = sectionWidgets.get(cid.getItem().section());
			JPanel title = titleWidgets.get(cid.getItem().title());

			if (section != null)
			{
				section.add(item);
			}
			else if (title != null)
			{
				title.add(item);
			}
			else
			{
				topLevelPanels.put(cid, item);
			}
		}

		topLevelPanels.values().forEach(mainPanel::add);

		JButton resetButton = new JButton("Reset");
		resetButton.addActionListener((e) ->
		{
			final int result = JOptionPane.showOptionDialog(resetButton, "Are you sure you want to reset this plugin's configuration?",
				"Are you sure?", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE,
				null, new String[]{"Yes", "No"}, "No");

			if (result == JOptionPane.YES_OPTION)
			{
				configManager.setDefaultConfiguration(pluginConfig.getConfig(), true);

				// Reset non-config panel keys
				Plugin plugin = pluginConfig.getPlugin();
				if (plugin != null)
				{
					plugin.resetConfiguration();
				}

				rebuild(false);
			}
		});
		mainPanel.add(resetButton);

		JButton backButton = new JButton("Back");
		backButton.addActionListener(e -> pluginList.getMuxer().popState());
		mainPanel.add(backButton);

		if (refresh)
		{
			scrollPane.getVerticalScrollBar().setValue(scrollBarPosition);
		}
		else
		{
			scrollPane.getVerticalScrollBar().setValue(0);
		}

		revalidate();
	}

	private JButton createConsumer(ConfigDescriptor cd, ConfigItemDescriptor cid)
	{
		JButton button = new JButton(cid.getItem().name());
		button.addActionListener((e) ->
		{
			log.debug("Running consumer: {}.{}", cd.getGroup().value(), cid.getItem().keyName());
			configManager.getConsumer(cd.getGroup().value(), cid.getItem().keyName()).accept(pluginConfig.getPlugin());
		});

		return button;
	}

	private JButton createButton(ConfigDescriptor cd, ConfigItemDescriptor cid)
	{
		JButton button = new JButton(cid.name());
		button.addActionListener((e) ->
		{
			ConfigButtonClicked event = new ConfigButtonClicked();
			event.setGroup(cd.getGroup().value());
			event.setKey(cid.getItem().keyName());
			eventBus.post(event);
		});

		return button;
	}

	private JCheckBox createCheckbox(ConfigDescriptor cd, ConfigItemDescriptor cid)
	{
		JCheckBox checkbox = new ToggleButton();
		checkbox.setPreferredSize(new Dimension(26, 25));
		checkbox.setSelected(Boolean.parseBoolean(configManager.getConfiguration(cd.getGroup().value(), cid.getItem().keyName())));
		checkbox.addActionListener(ae -> changeConfiguration(checkbox, cd, cid));
		return checkbox;
	}

	private JComponent createIntSpinner(ConfigDescriptor cd, ConfigItemDescriptor cid)
	{
		int value = Integer.parseInt(configManager.getConfiguration(cd.getGroup().value(), cid.getItem().keyName()));

		Units units = cid.getUnits();
		Range range = cid.getRange();
		int min = 0, max = Integer.MAX_VALUE;
		if (range != null)
		{
			min = range.min();
			max = range.max();
		}

		// Config may previously have been out of range
		value = Ints.constrainToRange(value, min, max);

		if (max < Integer.MAX_VALUE)
		{
			JLabel sliderValueLabel = new JLabel();
			JSlider slider = new JSlider(min, max, value);
			slider.setBackground(ColorScheme.DARK_GRAY_COLOR);
			if (units != null)
			{
				sliderValueLabel.setText(slider.getValue() + units.value());
			}
			else
			{
				sliderValueLabel.setText(String.valueOf(slider.getValue()));
			}
			slider.setPreferredSize(new Dimension(80, 25));
			slider.addChangeListener((l) ->
				{
					if (units != null)
					{
						sliderValueLabel.setText(slider.getValue() + units.value());
					}
					else
					{
						sliderValueLabel.setText(String.valueOf(slider.getValue()));
					}

					if (!slider.getValueIsAdjusting())
					{
						changeConfiguration(slider, cd, cid);
					}
				}
			);

			SpinnerModel model = new SpinnerNumberModel(value, min, max, 1);
			JSpinner spinner = new JSpinner(model);
			Component editor = spinner.getEditor();
			JFormattedTextField spinnerTextField = ((JSpinner.DefaultEditor) editor).getTextField();
			spinnerTextField.setColumns(SPINNER_FIELD_WIDTH);
			spinner.setUI(new BasicSpinnerUI()
			{
				protected Component createNextButton()
				{
					return null;
				}

				protected Component createPreviousButton()
				{
					return null;
				}
			});

			JPanel subPanel = new JPanel();
			subPanel.setPreferredSize(new Dimension(110, 25));
			subPanel.setLayout(new BorderLayout());

			spinner.addChangeListener((ce) ->
			{
				changeConfiguration(spinner, cd, cid);

				if (units != null)
				{
					sliderValueLabel.setText(spinner.getValue() + units.value());
				}
				else
				{
					sliderValueLabel.setText(String.valueOf(spinner.getValue()));
				}
				slider.setValue((Integer) spinner.getValue());

				subPanel.add(sliderValueLabel, BorderLayout.WEST);
				subPanel.add(slider, BorderLayout.EAST);
				subPanel.remove(spinner);

				validate();
				repaint();
			});

			sliderValueLabel.addMouseListener(new MouseAdapter()
			{
				public void mouseClicked(MouseEvent e)
				{
					spinner.setValue(slider.getValue());

					subPanel.remove(sliderValueLabel);
					subPanel.remove(slider);
					subPanel.add(spinner, BorderLayout.EAST);

					validate();
					repaint();

					final JTextField tf = ((JSpinner.DefaultEditor) spinner.getEditor()).getTextField();
					tf.requestFocusInWindow();
					SwingUtilities.invokeLater(tf::selectAll);
				}
			});

			subPanel.add(sliderValueLabel, BorderLayout.WEST);
			subPanel.add(slider, BorderLayout.EAST);

			return subPanel;
		}
		else
		{
			SpinnerModel model = new SpinnerNumberModel(value, min, max, 1);
			JSpinner spinner = new JSpinner(model);
			Component editor = spinner.getEditor();
			JFormattedTextField spinnerTextField = ((JSpinner.DefaultEditor) editor).getTextField();
			spinnerTextField.setColumns(SPINNER_FIELD_WIDTH);
			spinner.addChangeListener(ce -> changeConfiguration(spinner, cd, cid));

			if (units != null)
			{
				spinnerTextField.setFormatterFactory(new UnitFormatterFactory(units));
			}

			return spinner;
		}
	}

	private JSpinner createDoubleSpinner(ConfigDescriptor cd, ConfigItemDescriptor cid)
	{
		double value = configManager.getConfiguration(cd.getGroup().value(), cid.getItem().keyName(), double.class);

		SpinnerModel model = new SpinnerNumberModel(value, 0, Double.MAX_VALUE, 0.1);
		JSpinner spinner = new JSpinner(model);
		Component editor = spinner.getEditor();
		JFormattedTextField spinnerTextField = ((JSpinner.DefaultEditor) editor).getTextField();
		spinnerTextField.setColumns(SPINNER_FIELD_WIDTH);
		spinner.addChangeListener(ce -> changeConfiguration(spinner, cd, cid));

		return spinner;
	}

	private JTextComponent createTextField(ConfigDescriptor cd, ConfigItemDescriptor cid)
	{
		JTextComponent textField;

		if (cid.getItem().secret())
		{
			textField = new JPasswordField();
		}
		else
		{
			final JTextArea textArea = new JTextArea();
			textArea.setLineWrap(true);
			textArea.setWrapStyleWord(true);
			textField = textArea;
		}

		textField.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		textField.setText(configManager.getConfiguration(cd.getGroup().value(), cid.getItem().keyName()));

		textField.addFocusListener(new FocusAdapter()
		{
			@Override
			public void focusLost(FocusEvent e)
			{
				changeConfiguration(textField, cd, cid);
			}
		});

		return textField;
	}

	private JLabel createParseLabel(ConfigItemDescriptor cid, JTextComponent textField)
	{
		JLabel parsingLabel = new JLabel();
		parsingLabel.setHorizontalAlignment(SwingConstants.CENTER);
		parsingLabel.setPreferredSize(new Dimension(PANEL_WIDTH, 15));

		DeferredDocumentChangedListener listener = new DeferredDocumentChangedListener();
		listener.addChangeListener(e ->
		{
			if (cid.getItem().parse())
			{
				parseLabel(cid.getItem(), parsingLabel, textField.getText());
			}
		});
		textField.getDocument().addDocumentListener(listener);

		return parsingLabel;
	}

	private ColorJButton createColorPicker(ConfigDescriptor cd, ConfigItemDescriptor cid)
	{
		Color existing = configManager.getConfiguration(cd.getGroup().value(), cid.getItem().keyName(), Color.class);

		ColorJButton colorPickerBtn;

		boolean alphaHidden = cid.getAlpha() == null;

		if (existing == null)
		{
			colorPickerBtn = new ColorJButton("Pick a color", Color.BLACK);
		}
		else
		{
			String colorHex = "#" + (alphaHidden ? ColorUtil.colorToHexCode(existing) : ColorUtil.colorToAlphaHexCode(existing)).toUpperCase();
			colorPickerBtn = new ColorJButton(colorHex, existing);
		}

		colorPickerBtn.setFocusable(false);
		colorPickerBtn.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				RuneliteColorPicker colorPicker = colorPickerManager.create(
					SwingUtilities.windowForComponent(ConfigPanel.this),
					colorPickerBtn.getColor(),
					cid.getItem().name(),
					alphaHidden);
				colorPicker.setLocation(getLocationOnScreen());
				colorPicker.setOnColorChange(c ->
				{
					colorPickerBtn.setColor(c);
					colorPickerBtn.setText("#" + (alphaHidden ? ColorUtil.colorToHexCode(c) : ColorUtil.colorToAlphaHexCode(c)).toUpperCase());
				});
				colorPicker.setOnClose(c -> changeConfiguration(colorPicker, cd, cid));
				colorPicker.setVisible(true);
			}
		});

		return colorPickerBtn;
	}

	private JPanel createDimension(ConfigDescriptor cd, ConfigItemDescriptor cid)
	{
		JPanel dimensionPanel = new JPanel();
		dimensionPanel.setLayout(new BorderLayout());

		String str = configManager.getConfiguration(cd.getGroup().value(), cid.getItem().keyName());
		String[] splitStr = str.split("x");
		int width = Integer.parseInt(splitStr[0]);
		int height = Integer.parseInt(splitStr[1]);

		SpinnerModel widthModel = new SpinnerNumberModel(width, 0, Integer.MAX_VALUE, 1);
		JSpinner widthSpinner = new JSpinner(widthModel);
		Component widthEditor = widthSpinner.getEditor();
		JFormattedTextField widthSpinnerTextField = ((JSpinner.DefaultEditor) widthEditor).getTextField();
		widthSpinnerTextField.setColumns(4);

		SpinnerModel heightModel = new SpinnerNumberModel(height, 0, Integer.MAX_VALUE, 1);
		JSpinner heightSpinner = new JSpinner(heightModel);
		Component heightEditor = heightSpinner.getEditor();
		JFormattedTextField heightSpinnerTextField = ((JSpinner.DefaultEditor) heightEditor).getTextField();
		heightSpinnerTextField.setColumns(4);

		ChangeListener listener = e ->
			configManager.setConfiguration(cd.getGroup().value(), cid.getItem().keyName(), widthSpinner.getValue() + "x" + heightSpinner.getValue());

		widthSpinner.addChangeListener(listener);
		heightSpinner.addChangeListener(listener);

		dimensionPanel.add(widthSpinner, BorderLayout.WEST);
		dimensionPanel.add(new JLabel(" x "), BorderLayout.CENTER);
		dimensionPanel.add(heightSpinner, BorderLayout.EAST);

		return dimensionPanel;
	}

	private JComboBox<Enum<?>> createComboBox(ConfigDescriptor cd, ConfigItemDescriptor cid)
	{
		Class<? extends Enum> type = (Class<? extends Enum>) cid.getType();

		JComboBox<Enum<?>> box = new JComboBox<Enum<?>>(type.getEnumConstants()); // NOPMD: UseDiamondOperator
		// set renderer prior to calling box.getPreferredSize(), since it will invoke the renderer
		// to build components for each combobox element in order to compute the display size of the
		// combobox
		box.setRenderer(listCellRenderer);
		box.setPreferredSize(new Dimension(box.getPreferredSize().width, 25));
		box.setForeground(Color.WHITE);
		box.setFocusable(false);

		try
		{
			Enum<?> selectedItem = Enum.valueOf(type, configManager.getConfiguration(cd.getGroup().value(), cid.getItem().keyName()));
			box.setSelectedItem(selectedItem);
			box.setToolTipText(Text.titleCase(selectedItem));
		}
		catch (IllegalArgumentException ex)
		{
			log.debug("invalid selected item", ex);
		}
		box.addItemListener(e ->
		{
			if (e.getStateChange() == ItemEvent.SELECTED)
			{
				changeConfiguration(box, cd, cid);
				box.setToolTipText(Text.titleCase((Enum<?>) box.getSelectedItem()));
			}
		});

		return box;
	}

	private HotkeyButton createKeybind(ConfigDescriptor cd, ConfigItemDescriptor cid)
	{
		Keybind startingValue = configManager.getConfiguration(cd.getGroup().value(),
			cid.getItem().keyName(),
			(Class<? extends Keybind>) cid.getType());

		HotkeyButton button = new HotkeyButton(startingValue, cid.getType() == ModifierlessKeybind.class);

		button.addFocusListener(new FocusAdapter()
		{
			@Override
			public void focusLost(FocusEvent e)
			{
				changeConfiguration(button, cd, cid);
			}
		});

		return button;
	}

	private JPanel createList(ConfigDescriptor cd, ConfigItemDescriptor cid)
	{
		ParameterizedType parameterizedType = (ParameterizedType) cid.getType();
		Class<? extends Enum> type = (Class<? extends Enum>) parameterizedType.getActualTypeArguments()[0];
		Set<? extends Enum> set = configManager.getConfiguration(cd.getGroup().value(), null,
			cid.getItem().keyName(), parameterizedType);

		JPanel enumsetLayout = new JPanel(new GridLayout(0, 2));
		List<ToggleButton> jcheckboxes = new ArrayList<>();

		Set<?> selectedItems = new HashSet(Objects.requireNonNullElse(set, Collections.emptySet()));

		for (Object obj : type.getEnumConstants())
		{
			ToggleButton checkbox = new ToggleButton(obj);
			checkbox.setBackground(ColorScheme.DARK_GRAY_COLOR);
			checkbox.setSelected(selectedItems.contains(obj));
			jcheckboxes.add(checkbox);

			enumsetLayout.add(checkbox);
		}

		jcheckboxes.forEach(checkbox -> checkbox.addActionListener(ae -> changeConfiguration(jcheckboxes, cd, cid)));

		return enumsetLayout;
	}

	private JPanel createEnumSetLayout(ConfigDescriptor cd, ConfigItemDescriptor cid)
	{
		Class enumType = cid.getItem().enumClass();

		EnumSet enumSet = configManager.getConfiguration(cd.getGroup().value(),
			cid.getItem().keyName(), EnumSet.class);
		if (enumSet == null || enumSet.contains(null))
		{
			enumSet = EnumSet.noneOf(enumType);
		}

		JPanel enumsetLayout = new JPanel(new GridLayout(0, 2));
		List<ToggleButton> jcheckboxes = new ArrayList<>();

		for (Object obj : enumType.getEnumConstants())
		{
			String option = Text.titleCase((Enum<?>) obj);

			ToggleButton checkbox = new ToggleButton(option);
			checkbox.setBackground(ColorScheme.DARK_GRAY_COLOR);
			checkbox.setSelected(enumSet.contains(obj));
			jcheckboxes.add(checkbox);

			enumsetLayout.add(checkbox);
		}

		jcheckboxes.forEach(checkbox -> checkbox.addActionListener(ae -> changeConfiguration(jcheckboxes, cd, cid)));

		return enumsetLayout;
	}

	private Boolean parse(ConfigItem item, String value)
	{
		try
		{
			Method parse = item.clazz().getMethod(item.method(), String.class);

			return (boolean) parse.invoke(null, value);
		}
		catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException ex)
		{
			log.error("Parsing failed: {}", ex.getMessage());
		}

		return null;
	}

	private void parseLabel(ConfigItem item, JLabel label, String value)
	{
		Boolean result = parse(item, value);

		if (result == null)
		{
			label.setForeground(Color.RED);
			label.setText("Parsing failed");
		}
		else if (result)
		{
			label.setForeground(Color.GREEN);
			label.setText("Valid input");
		}
		else
		{
			label.setForeground(Color.RED);
			label.setText("Invalid input");
		}
	}

	private void changeConfiguration(List<ToggleButton> components, ConfigDescriptor cd, ConfigItemDescriptor cid)
	{
		if (cid.getItem().enumClass() != Enum.class)
		{
			EnumSet enumSet = EnumSet.noneOf(cid.getItem().enumClass());

			//noinspection unchecked
			components.forEach(value ->
			{
				if (value.isSelected())
				{
					enumSet.add(Enum.valueOf(cid.getItem().enumClass(), String.valueOf(value.getText()).toUpperCase().replace(" ", "_")));
				}
			});

			configManager.setConfiguration(cd.getGroup().value(), cid.getItem().keyName(), enumSet);
		}
		else
		{
			Set<Object> values = components
				.stream()
				.filter(ToggleButton::isSelected)
				.map(ToggleButton::getObject)
				.collect(Collectors.toSet());
			configManager.setConfiguration(cd.getGroup().value(), cid.getItem().keyName(), values);
		}
	}

	private void changeConfiguration(Component component, ConfigDescriptor cd, ConfigItemDescriptor cid)
	{
		final ConfigItem configItem = cid.getItem();

		if (!Strings.isNullOrEmpty(configItem.warning()))
		{
			final int result = JOptionPane.showOptionDialog(component, configItem.warning(),
				"Are you sure?", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE,
				null, new String[]{"Yes", "No"}, "No");

			if (result != JOptionPane.YES_OPTION)
			{
				rebuild(false);
				return;
			}
		}

		skipRebuild = true;

		if (component instanceof JCheckBox)
		{
			JCheckBox checkbox = (JCheckBox) component;
			configManager.setConfiguration(cd.getGroup().value(), cid.getItem().keyName(), "" + checkbox.isSelected());
		}
		else if (component instanceof JSpinner)
		{
			JSpinner spinner = (JSpinner) component;
			configManager.setConfiguration(cd.getGroup().value(), cid.getItem().keyName(), "" + spinner.getValue());
		}
		else if (component instanceof JSlider)
		{
			JSlider slider = (JSlider) component;
			configManager.setConfiguration(cd.getGroup().value(), cid.getItem().keyName(), slider.getValue());
		}
		else if (component instanceof JTextComponent)
		{
			JTextComponent textField = (JTextComponent) component;
			configManager.setConfiguration(cd.getGroup().value(), cid.getItem().keyName(), textField.getText());
		}
		else if (component instanceof RuneliteColorPicker)
		{
			RuneliteColorPicker colorPicker = (RuneliteColorPicker) component;
			configManager.setConfiguration(cd.getGroup().value(), cid.getItem().keyName(), colorPicker.getSelectedColor().getRGB() + "");
		}
		else if (component instanceof JComboBox)
		{
			JComboBox jComboBox = (JComboBox) component;
			configManager.setConfiguration(cd.getGroup().value(), cid.getItem().keyName(), ((Enum) jComboBox.getSelectedItem()).name());
		}
		else if (component instanceof HotkeyButton)
		{
			HotkeyButton hotkeyButton = (HotkeyButton) component;
			configManager.setConfiguration(cd.getGroup().value(), cid.getItem().keyName(), hotkeyButton.getValue());
		}
		else if (component instanceof JList)
		{
			JList<?> list = (JList<?>) component;
			List<?> selectedValues = list.getSelectedValuesList();

			configManager.setConfiguration(cd.getGroup().value(), cid.getItem().keyName(), Sets.newHashSet(selectedValues));
		}

		if (enableDisable(component, cid)  || hideUnhide(component, cd, cid))
		{
			rebuild(true);
		}
	}

	@Override
	public Dimension getPreferredSize()
	{
		return new Dimension(PANEL_WIDTH + SCROLLBAR_WIDTH, super.getPreferredSize().height);
	}

	@Subscribe
	public void onPluginChanged(PluginChanged event)
	{
		if (event.getPlugin() == this.pluginConfig.getPlugin())
		{
			SwingUtilities.invokeLater(() ->
			{
				pluginToggle.setSelected(event.isLoaded());
			});
		}
	}

	@Subscribe
	private void onExternalPluginsChanged(ExternalPluginsChanged ev)
	{
		if (pluginManager.getPlugins().stream()
			.noneMatch(p -> p == this.pluginConfig.getPlugin()))
		{
			pluginList.getMuxer().popState();
		}
		SwingUtilities.invokeLater(() -> rebuild(false));
	}

	@Subscribe
	private void onConfigChanged(ConfigChanged event)
	{
		if (pluginConfig.getConfigDescriptor() == null)
		{
			return;
		}

		if (!skipRebuild && pluginConfig.getConfigDescriptor().getGroup().value().equals(event.getGroup()))
		{
			SwingUtilities.invokeLater(() -> rebuild(true));
		}

		skipRebuild = false;
	}

	private JMenuItem createResetMenuItem(PluginConfigurationDescriptor pluginConfig, ConfigItemDescriptor configItemDescriptor)
	{
		JMenuItem menuItem = new JMenuItem("Reset");
		menuItem.addActionListener(e ->
		{
			ConfigDescriptor configDescriptor = pluginConfig.getConfigDescriptor();
			ConfigGroup configGroup = configDescriptor.getGroup();
			ConfigItem configItem = configItemDescriptor.getItem();

			// To reset one item we'll just unset it and then apply defaults over the whole group
			configManager.unsetConfiguration(configGroup.value(), configItem.keyName());
			configManager.setDefaultConfiguration(pluginConfig.getConfig(), false);

			rebuild(false);
		});
		return menuItem;
	}

	private boolean hideUnhide(Component component, ConfigDescriptor cd, ConfigItemDescriptor cid)
	{
		boolean rebuild = false;

		if (component instanceof JCheckBox)
		{
			JCheckBox checkbox = (JCheckBox) component;

			for (ConfigItemDescriptor cid2 : cd.getItems())
			{
				if (cid2.getItem().hidden() || !cid2.getItem().hide().isEmpty())
				{
					List<String> itemHide = Splitter
						.onPattern("\\|\\|")
						.trimResults()
						.omitEmptyStrings()
						.splitToList(String.format("%s || %s", cid2.getItem().unhide(), cid2.getItem().hide()));

					if (itemHide.contains(cid.getItem().keyName()))
					{
						rebuild = true;
					}
				}

				if (checkbox.isSelected())
				{
					if (cid2.getItem().enabledBy().contains(cid.getItem().keyName()))
					{
						skipRebuild = true;
						configManager.setConfiguration(cd.getGroup().value(), cid2.getItem().keyName(), "true");
						rebuild = true;
					}
					else if (cid2.getItem().disabledBy().contains(cid.getItem().keyName()))
					{
						skipRebuild = true;
						configManager.setConfiguration(cd.getGroup().value(), cid2.getItem().keyName(), "false");
						rebuild = true;
					}
				}
			}
		}
		else if (component instanceof JComboBox)
		{
			JComboBox jComboBox = (JComboBox) component;

			for (ConfigItemDescriptor cid2 : cd.getItems())
			{
				if (cid2.getItem().hidden() || !cid2.getItem().hide().isEmpty())
				{
					List<String> itemHide = Splitter
						.onPattern("\\|\\|")
						.trimResults()
						.omitEmptyStrings()
						.splitToList(String.format("%s || %s", cid2.getItem().unhide(), cid2.getItem().hide()));

					String changedVal = ((Enum) jComboBox.getSelectedItem()).name();

					if (cid2.getItem().enabledBy().contains(cid.getItem().keyName()) && cid2.getItem().enabledByValue().equals(changedVal))
					{
						skipRebuild = true;
						configManager.setConfiguration(cd.getGroup().value(), cid2.getItem().keyName(), "true");
						rebuild = true;
					}
					else if (cid2.getItem().disabledBy().contains(cid.getItem().keyName()) && cid2.getItem().disabledByValue().equals(changedVal))
					{
						skipRebuild = true;
						configManager.setConfiguration(cd.getGroup().value(), cid2.getItem().keyName(), "false");
						rebuild = true;
					}
					else if (itemHide.contains(cid.getItem().keyName()))
					{
						rebuild = true;
					}
				}
			}
		}
		else if (component instanceof JList)
		{
			JList jList = (JList) component;

			for (ConfigItemDescriptor cid2 : cd.getItems())
			{
				if (cid2.getItem().hidden() || !cid2.getItem().hide().isEmpty())
				{
					List<String> itemHide = Splitter
						.onPattern("\\|\\|")
						.trimResults()
						.omitEmptyStrings()
						.splitToList(String.format("%s || %s", cid2.getItem().unhide(), cid2.getItem().hide()));

					String changedVal = String.valueOf((jList.getSelectedValues()));

					if (cid2.getItem().enabledBy().contains(cid.getItem().keyName()) && cid2.getItem().enabledByValue().equals(changedVal))
					{
						skipRebuild = true;
						configManager.setConfiguration(cd.getGroup().value(), cid2.getItem().keyName(), "true");
						rebuild = true;
					}
					else if (cid2.getItem().disabledBy().contains(cid.getItem().keyName()) && cid2.getItem().disabledByValue().equals(changedVal))
					{
						skipRebuild = true;
						configManager.setConfiguration(cd.getGroup().value(), cid2.getItem().keyName(), "false");
						rebuild = true;
					}
					else if (itemHide.contains(cid.getItem().keyName()))
					{
						rebuild = true;
					}
				}
			}
		}

		return rebuild;
	}

	private boolean shouldBeHidden(ConfigItemDescriptor cid)
	{
		ConfigDescriptor cd = pluginConfig.getConfigDescriptor();

		boolean unhide = cid.getItem().hidden();
		boolean hide = !cid.getItem().hide().isEmpty();

		if (unhide || hide)
		{
			boolean show = false;

			List<String> itemHide = Splitter
				.onPattern("\\|\\|")
				.trimResults()
				.omitEmptyStrings()
				.splitToList(String.format("%s || %s", cid.getItem().unhide(), cid.getItem().hide()));

			for (ConfigItemDescriptor cid2 : cd.getItems())
			{
				if (itemHide.contains(cid2.getItem().keyName()))
				{
					if (cid2.getType() == boolean.class)
					{
						show = Boolean.parseBoolean(configManager.getConfiguration(cd.getGroup().value(), cid2.getItem().keyName()));
					}
					else if (cid2.getType() instanceof Class && ((Class<?>) cid2.getType()).isEnum())
					{
						Class<? extends Enum> type = (Class<? extends Enum>) cid2.getType();
						try
						{
							Enum selectedItem = Enum.valueOf(type, configManager.getConfiguration(cd.getGroup().value(), cid2.getItem().keyName()));
							if (!cid.getItem().unhideValue().equals(""))
							{
								List<String> unhideValue = Splitter
									.onPattern("\\|\\|")
									.trimResults()
									.omitEmptyStrings()
									.splitToList(cid.getItem().unhideValue());

								show = unhideValue.contains(selectedItem.toString());
							}
							else if (!cid.getItem().hideValue().equals(""))
							{
								List<String> hideValue = Splitter
									.onPattern("\\|\\|")
									.trimResults()
									.omitEmptyStrings()
									.splitToList(cid.getItem().hideValue());

								show = !hideValue.contains(selectedItem.toString());
							}
						}
						catch (IllegalArgumentException ignored)
						{
						}
					}
				}
			}

			return (!unhide || show) && (!hide || !show);
		}

		return true;
	}

	private boolean enableDisable(Component component, ConfigItemDescriptor cid)
	{
		boolean rebuild = false;

		ConfigDescriptor cd = pluginConfig.getConfigDescriptor();

		if (component instanceof JCheckBox)
		{
			JCheckBox checkbox = (JCheckBox) component;

			for (ConfigItemDescriptor cid2 : cd.getItems())
			{
				if (checkbox.isSelected())
				{
					if (cid2.getItem().enabledBy().contains(cid.getItem().keyName()))
					{
						skipRebuild = true;
						configManager.setConfiguration(cd.getGroup().value(), cid2.getItem().keyName(), "true");
						rebuild = true;
					}
					else if (cid2.getItem().disabledBy().contains(cid.getItem().keyName()))
					{
						skipRebuild = true;
						configManager.setConfiguration(cd.getGroup().value(), cid2.getItem().keyName(), "false");
						rebuild = true;
					}
				}
			}
		}
		else if (component instanceof JComboBox)
		{
			JComboBox jComboBox = (JComboBox) component;

			for (ConfigItemDescriptor cid2 : cd.getItems())
			{
				String changedVal = ((Enum) jComboBox.getSelectedItem()).name();

				if (cid2.getItem().enabledBy().contains(cid.getItem().keyName()) && cid2.getItem().enabledByValue().equals(changedVal))
				{
					skipRebuild = true;
					configManager.setConfiguration(cd.getGroup().value(), cid2.getItem().keyName(), "true");
					rebuild = true;
				}
				else if (cid2.getItem().disabledBy().contains(cid.getItem().keyName()) && cid2.getItem().disabledByValue().equals(changedVal))
				{
					skipRebuild = true;
					configManager.setConfiguration(cd.getGroup().value(), cid2.getItem().keyName(), "false");
					rebuild = true;
				}
			}
		}

		return rebuild;
	}

	private static String htmlLabel(String key, String value)
	{
		return "<html><body style = 'color:#a5a5a5'>" + key + ": <span style = 'color:white'>" + value + "</span></body></html>";
	}
}
