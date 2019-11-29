/*
 * Copyright (c) 2018, Adam <Adam@sigterm.info>
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
package net.runelite.client.plugins.chatcommands;

import java.awt.event.KeyEvent;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.ScriptID;
import net.runelite.api.VarClientStr;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.input.KeyListener;
import net.runelite.client.util.Clipboard;

@Singleton
class ChatKeyboardListener implements KeyListener
{
	@Inject
	private ChatCommandsConfig chatCommandsConfig;

	@Inject
	private Client client;

	@Inject
	private ClientThread clientThread;

	@Override
	public void keyTyped(KeyEvent e)
	{

	}

	@Override
	public void keyPressed(KeyEvent e)
	{
		if (!e.isControlDown() || client.getGameState() != GameState.LOGGED_IN)
		{
			return;
		}

		String input = client.getVar(VarClientStr.CHATBOX_TYPED_TEXT);

		switch (e.getKeyCode())
		{
			case KeyEvent.VK_C:
				if (!chatCommandsConfig.clipboardShortcuts())
				{
					break;
				}

				Clipboard.store(input);

				break;
			case KeyEvent.VK_V:
				if (!chatCommandsConfig.clipboardShortcuts())
				{
					break;
				}

				final String clipboard = Clipboard.retrieve();
				if (clipboard != null && !clipboard.isEmpty())
				{
					final String replacement = input + clipboard;

					clientThread.invoke(() -> client.setVar(VarClientStr.CHATBOX_TYPED_TEXT, replacement));
				}

				break;
			case KeyEvent.VK_W:
				if (!chatCommandsConfig.clearShortcuts())
				{
					break;
				}

				if (input != null)
				{
					// remove trailing space
					while (input.endsWith(" "))
					{
						input = input.substring(0, input.length() - 1);
					}

					// find next word
					int idx = input.lastIndexOf(' ');
					final String replacement;
					if (idx != -1)
					{
						replacement = input.substring(0, idx);
					}
					else
					{
						replacement = "";
					}

					clientThread.invoke(() ->
					{
						client.setVar(VarClientStr.CHATBOX_TYPED_TEXT, replacement);
						client.runScript(ScriptID.CHAT_PROMPT_INIT);
					});
				}
				break;
			case KeyEvent.VK_BACK_SPACE:
				clientThread.invoke(() ->
				{
					client.setVar(VarClientStr.CHATBOX_TYPED_TEXT, "");
					client.runScript(ScriptID.CHAT_PROMPT_INIT);
				});
				if (!chatCommandsConfig.clearShortcuts())
				{
					break;
				}

				clientThread.invoke(() -> client.setVar(VarClientStr.CHATBOX_TYPED_TEXT, ""));
				break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e)
	{

	}
}
