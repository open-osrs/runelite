package com.openosrs.client.util;

import java.awt.Desktop;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LinkBrowser extends net.runelite.client.util.LinkBrowser
{
	/**
	 * Tries to open the specified {@code File} with the systems default text editor. If operation fails
	 * an error message is displayed with the option to copy the absolute file path to clipboard.
	 *
	 * @param file the File instance of the log file
	 * @return did the file open successfully?
	 */
	public static boolean openLocalFile(final File file)
	{
		if (file == null || !file.exists())
		{
			return false;
		}

		if (attemptOpenLocalFile(file))
		{
			log.debug("Opened log file through Desktop#edit to {}", file);
			return true;
		}

		showMessageBox("Unable to open log file. Press 'OK' and the file path will be copied to your clipboard", file.getAbsolutePath());
		return false;
	}

	private static boolean attemptOpenLocalFile(final File file)
	{
		if (!Desktop.isDesktopSupported())
		{
			return false;
		}

		final Desktop desktop = Desktop.getDesktop();

		if (!desktop.isSupported(Desktop.Action.OPEN))
		{
			return false;
		}

		try
		{
			desktop.open(file);
			return true;
		}
		catch (IOException ex)
		{
			log.warn("Failed to open Desktop#edit {}", file, ex);
			return false;
		}
	}

	/**
	 * Open swing message box with specified message and copy data to clipboard
	 * @param message message to show
	 */
	private static void showMessageBox(final String message, final String data)
	{
		SwingUtilities.invokeLater(() ->
		{
			final int result = JOptionPane.showConfirmDialog(null, message, "Message",
				JOptionPane.OK_CANCEL_OPTION);

			if (result == JOptionPane.OK_OPTION)
			{
				final StringSelection stringSelection = new StringSelection(data);
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
			}
		});
	}
}
