/*
 * Copyright (c) 2018, Tomas Slusny <slusnucky@gmail.com>
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
package net.runelite.client.util;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.util.Enumeration;
import java.util.concurrent.Callable;
import java.util.function.BiConsumer;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.LookAndFeel;
import javax.swing.ToolTipManager;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.basic.BasicProgressBarUI;
import lombok.extern.slf4j.Slf4j;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.FontManager;
import net.runelite.client.ui.NavigationButton;
import net.runelite.client.ui.components.CustomScrollBarUI;
import net.runelite.client.ui.skin.SubstanceRuneLiteLookAndFeel;
import org.pushingpixels.substance.internal.SubstanceSynapse;

/**
 * Various Swing utilities.
 */
@Slf4j
public class SwingUtil
{
	private static boolean lookAndFeelIsSet = false;

	/**
	 * Sets some sensible defaults for swing.
	 * IMPORTANT! Needs to be called before main frame creation
	 */
	public static void setupDefaults()
	{
		// Force heavy-weight popups/tooltips.
		// Prevents them from being obscured by the game applet.
		ToolTipManager.sharedInstance().setLightWeightPopupEnabled(false);
		ToolTipManager.sharedInstance().setInitialDelay(300);
		JPopupMenu.setDefaultLightWeightPopupEnabled(false);

		UIManager.put("Button.foreground", Color.WHITE);
		UIManager.put("MenuItem.foreground", Color.WHITE);
		UIManager.put("Panel.background", ColorScheme.DARK_GRAY_COLOR);
		UIManager.put("ScrollBarUI", CustomScrollBarUI.class.getName());
		UIManager.put("TextField.selectionBackground", ColorScheme.BRAND_ORANGE_TRANSPARENT);
		UIManager.put("TextField.selectionForeground", Color.WHITE);
		UIManager.put("FormattedTextField.selectionBackground", ColorScheme.BRAND_ORANGE_TRANSPARENT);
		UIManager.put("FormattedTextField.selectionForeground", Color.WHITE);
		UIManager.put("TextArea.selectionBackground", ColorScheme.BRAND_ORANGE_TRANSPARENT);
		UIManager.put("TextArea.selectionForeground", Color.WHITE);
		UIManager.put("ProgressBar.background", ColorScheme.BRAND_ORANGE_TRANSPARENT.darker());
		UIManager.put("ProgressBar.foreground", ColorScheme.BRAND_ORANGE);
		UIManager.put("ProgressBar.selectionBackground", ColorScheme.BRAND_ORANGE);
		UIManager.put("ProgressBar.selectionForeground", Color.BLACK);
		UIManager.put("ProgressBar.border", new EmptyBorder(0, 0, 0, 0));
		UIManager.put("ProgressBar.verticalSize", new Dimension(12, 10));
		UIManager.put("ProgressBar.horizontalSize", new Dimension(10, 12));
		UIManager.put("ProgressBarUI", BasicProgressBarUI.class.getName());

		// Do not render shadows under popups/tooltips.
		// Fixes black boxes under popups that are above the game applet.
		System.setProperty("jgoodies.popupDropShadowEnabled", "false");

		// Do not fill in background on repaint. Reduces flickering when
		// the applet is resized.
		System.setProperty("sun.awt.noerasebackground", "true");
	}

	/**
	 * Safely sets Swing theme
	 *
	 * @param laf the swing look and feel
	 */
	public static void setTheme(@Nonnull final LookAndFeel laf)
	{
		try
		{
			UIManager.setLookAndFeel(laf);
		}
		catch (UnsupportedLookAndFeelException ex)
		{
			log.warn("Unable to set look and feel", ex);
		}
	}

	/**
	 * Sets default Swing font.
	 * IMPORTANT! Needs to be called before main frame creation
	 *
	 * @param font the new font to use
	 */
	public static void setFont(@Nonnull final Font font)
	{
		final FontUIResource f = new FontUIResource(font);
		final Enumeration keys = UIManager.getDefaults().keys();

		while (keys.hasMoreElements())
		{
			final Object key = keys.nextElement();
			final Object value = UIManager.get(key);

			if (value instanceof FontUIResource)
			{
				UIManager.put(key, f);
			}
		}
	}

	/**
	 * Create tray icon.
	 *
	 * @param icon  the icon
	 * @param title the title
	 * @param frame the frame
	 * @return the tray icon
	 */
	@Nullable
	public static TrayIcon createTrayIcon(@Nonnull final Image icon, @Nonnull final String title, @Nonnull final Frame frame)
	{
		if (!SystemTray.isSupported())
		{
			return null;
		}

		final SystemTray systemTray = SystemTray.getSystemTray();
		final TrayIcon trayIcon = new TrayIcon(icon, title);
		trayIcon.setImageAutoSize(true);

		try
		{
			systemTray.add(trayIcon);
		}
		catch (AWTException ex)
		{
			log.debug("Unable to add system tray icon", ex);
			return trayIcon;
		}

		// Bring to front when tray icon is clicked
		trayIcon.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				frame.setVisible(true);
				frame.setState(Frame.NORMAL); // Restore
			}
		});

		return trayIcon;
	}

	/**
	 * Add graceful exit callback.
	 *
	 * @param frame           the frame
	 * @param callback        the callback
	 * @param confirmRequired the confirm required
	 */
	public static void addGracefulExitCallback(@Nonnull final JFrame frame, @Nonnull final Runnable callback, @Nonnull final Callable<Boolean> confirmRequired)
	{
		frame.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		frame.addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent event)
			{
				int result = JOptionPane.OK_OPTION;

				try
				{
					if (confirmRequired.call())
					{
						result = JOptionPane.showConfirmDialog(
							frame,
							"Are you sure you want to exit?", "Exit",
							JOptionPane.OK_CANCEL_OPTION,
							JOptionPane.QUESTION_MESSAGE);
					}
				}
				catch (Exception e)
				{
					log.warn("Unexpected exception occurred while check for confirm required", e);
				}

				if (result == JOptionPane.OK_OPTION)
				{
					callback.run();
					System.exit(0);
				}
			}
		});
	}

	/**
	 * Create swing button from navigation button.
	 *
	 * @param navigationButton the navigation button
	 * @param iconSize         the icon size (in case it is 0 default icon size will be used)
	 * @param specialCallback  the special callback
	 * @return the swing button
	 */
	public static JButton createSwingButton(
		@Nonnull final NavigationButton navigationButton,
		int iconSize,
		@Nullable final BiConsumer<NavigationButton, JButton> specialCallback)
	{

		final BufferedImage scaledImage = iconSize > 0
			? ImageUtil.resizeImage(navigationButton.getIcon(), iconSize, iconSize)
			: navigationButton.getIcon();

		final JButton button = new JButton();
		button.setSize(scaledImage.getWidth(), scaledImage.getHeight());
		button.setToolTipText(navigationButton.getTooltip());
		button.setIcon(new ImageIcon(scaledImage));
		button.putClientProperty(SubstanceSynapse.FLAT_LOOK, Boolean.TRUE);
		button.setFocusable(false);
		button.addActionListener(e ->
		{
			if (specialCallback != null)
			{
				specialCallback.accept(navigationButton, button);
			}

			if (navigationButton.getOnClick() != null)
			{
				navigationButton.getOnClick().run();
			}
		});

		if (navigationButton.getPopup() != null)
		{
			final JPopupMenu popupMenu = new JPopupMenu();

			navigationButton.getPopup().forEach((name, callback) ->
			{
				final JMenuItem menuItem = new JMenuItem(name);
				menuItem.addActionListener((e) -> callback.run());
				popupMenu.add(menuItem);
			});

			button.setComponentPopupMenu(popupMenu);
		}

		navigationButton.setOnSelect(button::doClick);
		return button;
	}

	/**
	 * Sets up the RuneLite look and feel. Checks to see if the look and feel
	 * was already set up before running in case the splash screen has already
	 * set up the theme.
	 * This must be run inside the Swing Event Dispatch thread.
	 */
	public static void setupRuneLiteLookAndFeel()
	{
		if (!lookAndFeelIsSet)
		{
			lookAndFeelIsSet = true;
			// Set some sensible swing defaults
			SwingUtil.setupDefaults();
			// Use substance look and feel
			SwingUtil.setTheme(new SubstanceRuneLiteLookAndFeel());
			// Use custom UI font
			//TODO : SUPPORT CUSTOM FONT?
			//SwingUtil.setFont(FontManager.getFontOrDefault(config.clientFont()));
			SwingUtil.setFont(FontManager.getRunescapeFont());
		}
	}
}
