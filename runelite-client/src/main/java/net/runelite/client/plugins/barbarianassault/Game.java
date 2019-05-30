/*
 * Copyright (c) 2018, https://runelitepl.us
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
package net.runelite.client.plugins.barbarianassault;

import java.awt.Color;
import java.util.ArrayList;
import lombok.Getter;
import net.runelite.api.Client;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.chat.ChatMessageBuilder;
import net.runelite.client.eventbus.Subscribe;

@Getter
public class Game
{
	private Client client;
	private String currentWave;
	private ArrayList<Wave> waves = new ArrayList<>();
	private String[] totalDescriptions = {
		"A: ",
		"; D: ",
		"; C: ",
		"; Vial: ",
		"; H packs: ",
		"; Total: "};
	private String[] otherPointsDescriptions = {
		" A: ",
		"; D: ",
		"; C: ",
		"; H: "
	};
	private int[] totalPoints = new int[6];
	private int[] totalAmounts = new int[6];
	private int[] otherRolesPoints = new int[4];

	Game(Client client)
	{
		this.client = client;
	}

	Game(Client client, ArrayList<Wave> waves)
	{
		this.client = client;
		this.waves = waves;
	}

	@Subscribe
	public void onChatMessage(ChatMessage chatMessage)
	{
		if (chatMessage.getMessage().startsWith("---- Wave:"))
		{
			String[] tempMessage = chatMessage.getMessage().split(" ");
			currentWave = tempMessage[2];
			String[] temp = currentWave.split(" ");
		}
		if (currentWave.equals("1"))
		{
			waves = null;
			totalPoints = new int[6];
			totalAmounts = new int[6];
		}
	}

	ChatMessageBuilder getGameSummary()
	{
		int[] amountsList;
		int[] pointsList;
		int[] otherRolesPointsList;
		ChatMessageBuilder message = new ChatMessageBuilder();
		message.append("Round points: ");
		for (Wave w : waves)
		{
			amountsList = w.getWaveAmounts();
			pointsList = w.getWavePoints();
			otherRolesPointsList = w.getOtherRolesPointsList();
			for (int j = 0; j < totalAmounts.length; j++)
			{
				totalAmounts[j] += amountsList[j];
			}
			for (int k = 0; k < totalPoints.length; k++)
			{
				totalPoints[k] += pointsList[k];
			}
			for (int z = 0; z < otherRolesPoints.length; z++)
			{
				otherRolesPoints[z] += otherRolesPointsList[z];
			}
		}
		for (int i = 0; i < otherRolesPoints.length; i++)
		{
			otherRolesPoints[i] += 80;
		}
		totalAmounts[5] += 80;
		for (int i = 0; i < totalDescriptions.length; i++)
		{
			if (i != 4)
			{
				message.append(totalDescriptions[i]);
				message.append(String.valueOf(totalAmounts[i]));
				message.append("(");
				if (totalPoints[i] < 0)
				{
					message.append(Color.RED, String.valueOf(totalPoints[i]));
				}
				else if (totalPoints[i] > 0)
				{
					message.append(Color.BLUE, String.valueOf(totalPoints[i]));
				}
				else
				{
					message.append(String.valueOf(totalPoints[i]));
				}
				message.append(")");
			}
		}
		message.append(System.getProperty("line.separator"));
		message.append("All roles points this game: ");
		for (int i = 0; i < otherPointsDescriptions.length; i++)
		{
			message.append(otherPointsDescriptions[i]);
			message.append(String.valueOf(otherRolesPoints[i]));
		}
		return message;
	}
}
