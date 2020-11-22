/*
 * Copyright (c) 2017, Tyler <https://github.com/tylerthardy>
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
package net.runelite.client.config;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import net.runelite.api.Constants;
import net.runelite.client.Notifier;
import net.runelite.client.ui.ContainableFrame;
import net.runelite.client.ui.overlay.components.ComponentConstants;

@ConfigGroup(RuneLiteConfig.GROUP_NAME)
public interface RuneLiteConfig extends Config
{
	String GROUP_NAME = "runelite";

	@ConfigTitleSection(
		keyName = "uiTitle",
		name = "User interface",
		description = "",
		position = 1
	)
	default Title uiTitle()
	{
		return new Title();
	}

	@ConfigItem(
		keyName = "gameSize",
		name = "Game size",
		description = "The game will resize to this resolution upon starting the client",
		position = 2,
		titleSection = "uiTitle"
	)
	@Units(Units.PIXELS)
	default Dimension gameSize()
	{
		return Constants.GAME_FIXED_SIZE;
	}

	@ConfigItem(
		keyName = "automaticResizeType",
		name = "Resize type",
		description = "Choose how the window should resize when opening and closing panels",
		position = 3,
		titleSection = "uiTitle"
	)
	default ExpandResizeType automaticResizeType()
	{
		return ExpandResizeType.KEEP_GAME_SIZE;
	}

	@ConfigItem(
		keyName = "lockWindowSize",
		name = "Lock window size",
		description = "Determines if the window resizing is allowed or not",
		position = 4,
		titleSection = "uiTitle"
	)
	default boolean lockWindowSize()
	{
		return false;
	}

	@ConfigItem(
		keyName = "containInScreen2",
		name = "Contain in screen",
		description = "Makes the client stay contained in the screen when attempted to move out of it.<br>Note: 'Always' only works if custom chrome is enabled.",
		position = 5,
		titleSection = "uiTitle"
	)
	default ContainableFrame.Mode containInScreen()
	{
		return ContainableFrame.Mode.RESIZING;
	}


	@ConfigItem(
		keyName = "uiEnableCustomChrome",
		name = "Enable custom window chrome",
		description = "Use Runelite's custom window title and borders.",
		warning = "Please restart your client after changing this setting.",
		position = 6,
		titleSection = "uiTitle"
	)
	default boolean enableCustomChrome()
	{
		return true;
	}

	@ConfigItem(
		keyName = "borderless",
		name = "Windowed borderless",
		description = "Use windowed borderless mode",
		warning = "Please restart your client after changing this setting.",
		position = 7,
		titleSection = "uiTitle"
	)
	default boolean borderless()
	{
		return false;
	}

	@ConfigItem(
		keyName = "usernameInTitle",
		name = "Show display name in title",
		description = "Toggles displaying of local player's display name in client title",
		position = 8,
		titleSection = "uiTitle"
	)
	default boolean usernameInTitle()
	{
		return true;
	}

	@ConfigTitleSection(
		keyName = "miscTitle",
		name = "Miscellaneous",
		description = "",
		position = 9
	)
	default Title miscTitle()
	{
		return new Title();
	}

	@ConfigItem(
		keyName = "rememberScreenBounds",
		name = "Remember client position",
		description = "Save the position and size of the client after exiting",
		position = 10,
		titleSection = "miscTitle"
	)
	default boolean rememberScreenBounds()
	{
		return true;
	}

	@ConfigItem(
		keyName = "gameAlwaysOnTop",
		name = "Enable client always on top",
		description = "The game will always be on the top of the screen",
		position = 11,
		titleSection = "miscTitle"
	)
	default boolean gameAlwaysOnTop()
	{
		return false;
	}

	@ConfigItem(
		keyName = "warningOnExit",
		name = "Display warning on exit",
		description = "Toggles a warning popup when trying to exit the client",
		position = 12,
		titleSection = "miscTitle"
	)
	default WarningOnExit warningOnExit()
	{
		return WarningOnExit.LOGGED_IN;
	}

	@Range(max = 100, min = 0)
	@ConfigItem(
		keyName = "volume",
		name = "Runelite Volume",
		description = "Sets the volume of custom Runelite sounds (not the client sounds)",
		position = 13,
		titleSection = "miscTitle"
	)
	@Units(Units.PERCENT)
	default int volume()
	{
		return 100;
	}

	@ConfigItem(
		keyName = "tooltipPosition",
		name = "Tooltip Position",
		description = "Configures whether to show the tooltip above or under the cursor",
		position = 14,
		titleSection = "miscTitle"
	)
	default TooltipPositionType tooltipPosition()
	{
		return TooltipPositionType.UNDER_CURSOR;
	}

	@ConfigTitleSection(
		keyName = "notificationsTitle",
		name = "Notifications",
		description = "",
		position = 15
	)
	default Title notificationsTitle()
	{
		return new Title();
	}

	@ConfigItem(
		keyName = "notificationTray",
		name = "Enable tray notifications",
		description = "Enables tray notifications",
		position = 16,
		titleSection = "notificationsTitle"
	)
	default boolean enableTrayNotifications()
	{
		return true;
	}

	@ConfigItem(
		keyName = "notificationRequestFocus",
		name = "Request focus on notification",
		description = "Configures the window focus request type on notification",
		position = 17,
		titleSection = "notificationsTitle"
	)
	default RequestFocusType notificationRequestFocus()
	{
		return RequestFocusType.OFF;
	}

	@ConfigItem(
		keyName = "notificationSound",
		name = "Notification sound",
		description = "Enables the playing of a beep sound when notifications are displayed",
		position = 18,
		titleSection = "notificationsTitle"
	)
	default Notifier.NativeCustomOff notificationSound()
	{
		return Notifier.NativeCustomOff.NATIVE;
	}

	@ConfigItem(
		keyName = "notificationGameMessage",
		name = "Enable game message notifications",
		description = "Puts a notification message in the chatbox",
		position = 19,
		titleSection = "notificationsTitle"
	)
	default boolean enableGameMessageNotification()
	{
		return false;
	}

	@ConfigItem(
		keyName = "notificationFlash",
		name = "Enable flash notification",
		description = "Flashes the game frame as a notification",
		position = 20,
		titleSection = "notificationsTitle"
	)
	default FlashNotification flashNotification()
	{
		return FlashNotification.DISABLED;
	}

	@ConfigItem(
		keyName = "notificationFocused",
		name = "Send notifications when focused",
		description = "Toggles all notifications for when the client is focused",
		position = 21,
		titleSection = "notificationsTitle"
	)
	default boolean sendNotificationsWhenFocused()
	{
		return false;
	}

	@Alpha
	@ConfigItem(
		keyName = "notificationFlashColor",
		name = "Notification Flash Color",
		description = "Sets the color of the notification flashes.",
		position = 22,
		titleSection = "notificationsTitle"
	)
	default Color notificationFlashColor()
	{
		return new Color(255, 0, 0, 70);
	}

	@ConfigTitleSection(
		keyName = "fontTitle",
		name = "Font",
		description = "",
		position = 23
	)
	default Title fontTitle()
	{
		return new Title();
	}

	@ConfigItem(
		keyName = "fontType",
		name = "Dynamic Overlay Font",
		description = "Configures what font type is used for in-game overlays such as player name, ground items, etc.",
		position = 24,
		titleSection = "fontTitle"
	)
	default FontType fontType()
	{
		return FontType.SMALL;
	}

	@ConfigItem(
		keyName = "tooltipFontType",
		name = "Tooltip Font",
		description = "Configures what font type is used for in-game tooltips such as food stats, NPC names, etc.",
		position = 25,
		titleSection = "fontTitle"
	)
	default FontType tooltipFontType()
	{
		return FontType.SMALL;
	}

	@ConfigItem(
		keyName = "interfaceFontType",
		name = "Interface Overlay Font",
		description = "Configures what font type is used for in-game interface overlays such as panels, opponent info, clue scrolls etc.",
		position = 26,
		titleSection = "fontTitle"
	)
	default FontType interfaceFontType()
	{
		return FontType.REGULAR;
	}

	@ConfigTitleSection(
		keyName = "overlayTitle",
		name = "Overlays",
		description = "",
		position = 27
	)
	default Title overlayTitle()
	{
		return new Title();
	}

	@ConfigItem(
		keyName = "menuEntryShift",
		name = "Require Shift for overlay menu",
		description = "Overlay right-click menu will require shift to be added",
		position = 28,
		titleSection = "overlayTitle"
	)
	default boolean menuEntryShift()
	{
		return true;
	}

	@ConfigItem(
		keyName = "overlayBackgroundColor",
		name = "Overlay Color",
		description = "Configures the background color of infoboxes and overlays",
		position = 29,
		titleSection = "overlayTitle"
	)
	@Alpha
	default Color overlayBackgroundColor()
	{
		return ComponentConstants.STANDARD_BACKGROUND_COLOR;
	}

	@ConfigTitleSection(
		keyName = "infoboxTitle",
		name = "Infoboxes",
		description = "",
		position = 30
	)
	default Title infoboxTitle()
	{
		return new Title();
	}

	@ConfigItem(
		keyName = "infoBoxTextOutline",
		name = "Outline infobox text",
		description = "Draw a full outline instead of a simple shadow for infobox text",
		position = 31,
		titleSection = "infoboxTitle"
	)
	default boolean infoBoxTextOutline()
	{
		return false;
	}

	@ConfigItem(
		keyName = "infoBoxVertical",
		name = "Display infoboxes vertically",
		description = "Toggles the infoboxes to display vertically",
		position = 32,
		titleSection = "infoboxTitle",
		hidden = true
	)
	default boolean infoBoxVertical()
	{
		return false;
	}

	@ConfigItem(
		keyName = "infoBoxSize",
		name = "Infobox size",
		description = "Configures the size of each infobox in pixels",
		position = 33,
		titleSection = "infoboxTitle"
	)
	@Units(Units.PIXELS)
	default int infoBoxSize()
	{
		return 35;
	}

	@ConfigTitleSection(
		keyName = "keybindsTitle",
		name = "Key binds",
		description = "",
		position = 34
	)
	default Title keybindsTitle()
	{
		return new Title();
	}

	@ConfigItem(
		keyName = "sidebarToggleKey",
		name = "Sidebar Toggle Key",
		description = "The key that will toggle the sidebar (accepts modifiers)",
		position = 35,
		titleSection = "keybindsTitle"
	)
	default Keybind sidebarToggleKey()
	{
		return new Keybind(KeyEvent.VK_F11, InputEvent.CTRL_DOWN_MASK);
	}

	@ConfigItem(
		keyName = "panelToggleKey",
		name = "Plugin Panel Toggle Key",
		description = "The key that will toggle the current or last opened plugin panel (accepts modifiers)",
		position = 36,
		titleSection = "keybindsTitle"
	)
	default Keybind panelToggleKey()
	{
		return new Keybind(KeyEvent.VK_F12, InputEvent.CTRL_DOWN_MASK);
	}

	@ConfigItem(
		keyName = "blockExtraMouseButtons",
		name = "Block Extra Mouse Buttons",
		description = "Blocks extra mouse buttons (4 and above)",
		position = 37,
		titleSection = "keybindsTitle"
	)
	default boolean blockExtraMouseButtons()
	{
		return false;
	}
}
