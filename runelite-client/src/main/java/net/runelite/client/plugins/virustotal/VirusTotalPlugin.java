/*
 * Copyright 2019 Ian William O'Neill <iano2k4@hotmail.com>
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
package net.runelite.client.plugins.virustotal;

import lombok.extern.slf4j.Slf4j;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;

import javax.inject.Inject;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.MessageDigest;

@PluginDescriptor(
		name = "VirusTotalAPI",
		description = "Safeguarding against potentially infected External Plugins.",
		type = PluginType.UTILITY,
		loadWhenOutdated = true,
		hidden = true
)
@Slf4j
public class VirusTotalPlugin extends Plugin
{

	/** TODO: Complete the process...
	 * 1. Check if External Plugins is enabled on startUp.
	 * 2. Scan the "%user.home%/.runelite/plugins/" directory for any files.
	 * 3. Send the SHA-256 Hash to VirusTotal to see if exists.
	 * 4. Check the report: If it has any positives - shutdown. alert user.
	 * 5. If it didn't exist - send the file to VirusTotal.
	 * 6. Check the report: If it has any positives - shutdown. alert user.
	 * 7. If all is good - continue.
	 */

	@Inject
	ConfigManager configManager;

	@Override
	public void startUp()
	{
		if (configManager.getConfiguration("runelite", "enablePlugins").equals("true"))
		{
			// TODO: Check "%user.home%/.runelite/plugins/" for viruses when External Plugins are enabled!!
		}
	}

	public String getPluginSHA256(String fileName) throws Exception
	{
		MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
		try
		{
			FileInputStream file = new FileInputStream(fileName);
			byte[] dataBytes = new byte[1024];
			int nread = 0;
			while ((nread = file.read(dataBytes)) != -1)
			{
				messageDigest.update(dataBytes, 0, nread);
			}
		}
		catch (FileNotFoundException exception)
		{
			exception.printStackTrace();
		}
		byte[] digest = messageDigest.digest();
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < digest.length; i++)
		{
			stringBuffer.append(Integer.toString((digest[i] & 0xff) + 0x100, 16).substring(1));
		}
		return stringBuffer.toString();
	}

}
