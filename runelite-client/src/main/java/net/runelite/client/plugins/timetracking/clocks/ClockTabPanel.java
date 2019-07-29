/*
 * Copyright (c) 2018, Daniel Teo <https://github.com/takuyakanbr>
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
package net.runelite.client.plugins.timetracking.clocks;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.runelite.client.plugins.timetracking.TabContentPanel;
import net.runelite.client.plugins.timetracking.TimeTrackingPlugin;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.DynamicGridLayout;
import net.runelite.client.ui.FontManager;
import net.runelite.client.ui.PluginPanel;
import net.runelite.client.ui.components.IconButton;
import net.runelite.client.ui.components.shadowlabel.JShadowedLabel;
import net.runelite.client.util.ImageUtil;

public class ClockTabPanel extends TabContentPanel
{
	static final ImageIcon DELETE_ICON;
	static final ImageIcon DELETE_ICON_HOVER;
	static final ImageIcon LAP_ICON;
	static final ImageIcon LAP_ICON_HOVER;
	static final ImageIcon PAUSE_ICON;
	static final ImageIcon PAUSE_ICON_HOVER;
	static final ImageIcon RESET_ICON;
	static final ImageIcon RESET_ICON_HOVER;
	static final ImageIcon START_ICON;
	static final ImageIcon START_ICON_HOVER;

	private static final ImageIcon ADD_ICON;
	private static final ImageIcon ADD_ICON_HOVER;

	private final ClockManager clockManager;

	private final List<ClockPanel> clockPanels = new ArrayList<>();

	static
	{
		BufferedImage deleteIcon = ImageUtil.getResourceStreamFromClass(TimeTrackingPlugin.class, "delete_icon.png");
		BufferedImage lapIcon = ImageUtil.getResourceStreamFromClass(TimeTrackingPlugin.class, "lap_icon.png");
		BufferedImage pauseIcon = ImageUtil.getResourceStreamFromClass(TimeTrackingPlugin.class, "pause_icon.png");
		BufferedImage resetIcon = ImageUtil.getResourceStreamFromClass(TimeTrackingPlugin.class, "reset_icon.png");
		BufferedImage startIcon = ImageUtil.getResourceStreamFromClass(TimeTrackingPlugin.class, "start_icon.png");
		BufferedImage addIcon = ImageUtil.getResourceStreamFromClass(TimeTrackingPlugin.class, "add_icon.png");

		DELETE_ICON = new ImageIcon(deleteIcon);
		DELETE_ICON_HOVER = new ImageIcon(ImageUtil.grayscaleOffset(deleteIcon, -80));
		LAP_ICON = new ImageIcon(lapIcon);
		LAP_ICON_HOVER = new ImageIcon(ImageUtil.grayscaleOffset(lapIcon, -80));
		PAUSE_ICON = new ImageIcon(pauseIcon);
		PAUSE_ICON_HOVER = new ImageIcon(ImageUtil.grayscaleOffset(pauseIcon, -80));
		RESET_ICON = new ImageIcon(resetIcon);
		RESET_ICON_HOVER = new ImageIcon(ImageUtil.grayscaleOffset(resetIcon, -80));
		START_ICON = new ImageIcon(startIcon);
		START_ICON_HOVER = new ImageIcon(ImageUtil.grayscaleOffset(startIcon, -80));
		ADD_ICON = new ImageIcon(addIcon);
		ADD_ICON_HOVER = new ImageIcon(ImageUtil.alphaOffset(addIcon, 0.53f));
	}

	ClockTabPanel(ClockManager clockManager)
	{
		this.clockManager = clockManager;

		setLayout(new DynamicGridLayout(0, 1, 0, 4));
		setBackground(ColorScheme.DARK_GRAY_COLOR);

		rebuild();
	}

	// The max panel width is 225 but the + sign gets cut off at 225 so we set it at 223
	@Override
	public Dimension getPreferredSize()
	{
		return new Dimension(PluginPanel.PANEL_WIDTH - 2, super.getPreferredSize().height);
	}

	/**
	 * Clears and recreates the components of this panel.
	 * This should be done whenever a clock is added or removed.
	 */
	void rebuild()
	{
		removeAll();
		clockPanels.clear();

		add(createHeaderPanel("Timers", "timer", false, e -> clockManager.addTimer()));

		for (Timer timer : clockManager.getTimers())
		{
			TimerPanel panel = new TimerPanel(clockManager, timer);

			clockPanels.add(panel);
			add(panel);
		}

		if (clockManager.getTimers().isEmpty())
		{
			add(createInfoPanel("Click the + button to add a timer."));
		}

		add(createHeaderPanel("Stopwatches", "stopwatch", true, e -> clockManager.addStopwatch()));

		for (Stopwatch stopwatch : clockManager.getStopwatches())
		{
			StopwatchPanel panel = new StopwatchPanel(clockManager, stopwatch);

			clockPanels.add(panel);
			add(panel);
		}

		if (clockManager.getStopwatches().isEmpty())
		{
			add(createInfoPanel("Click the + button to add a stopwatch."));
		}

		revalidate();
	}

	private JPanel createHeaderPanel(String title, String type, boolean largePadding, ActionListener actionListener)
	{
		JPanel panel = new JPanel(new BorderLayout());
		panel.setBorder(new EmptyBorder(largePadding ? 11 : 0, 0, 0, 0));
		panel.setBackground(ColorScheme.DARK_GRAY_COLOR);

		JLabel headerLabel = new JLabel(title);
		headerLabel.setForeground(Color.WHITE);
		headerLabel.setFont(FontManager.getSmallFont(getFont()));
		panel.add(headerLabel, BorderLayout.CENTER);

		IconButton addButton = new IconButton(ADD_ICON, ADD_ICON_HOVER);
		addButton.setPreferredSize(new Dimension(14, 14));
		addButton.setToolTipText("Add a " + type);
		addButton.addActionListener(actionListener);
		panel.add(addButton, BorderLayout.EAST);

		return panel;
	}

	private JPanel createInfoPanel(String text)
	{
		JPanel panel = new JPanel(new BorderLayout());
		panel.setBorder(new EmptyBorder(7, 8, 6, 8));
		panel.setBackground(ColorScheme.DARK_GRAY_COLOR);

		JLabel infoLabel = new JShadowedLabel(text);
		infoLabel.setForeground(ColorScheme.LIGHT_GRAY_COLOR.darker());
		infoLabel.setFont(FontManager.getSmallFont(getFont()));
		panel.add(infoLabel);

		return panel;
	}

	@Override
	public int getUpdateInterval()
	{
		return 1; // 200 milliseconds
	}

	@Override
	public void update()
	{
		for (ClockPanel panel : clockPanels)
		{
			if (panel.getClock().isActive())
			{
				panel.updateDisplayInput();
			}
		}
	}
}
