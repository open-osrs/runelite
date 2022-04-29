/*
 * Copyright (c) 2016-2018, Adam <Adam@sigterm.info>
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
package net.runelite.client.plugins.openosrs;

import javax.annotation.Nonnull;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OS
{
	public enum OSType
	{
		Windows, MacOS, Linux, Other
	}

	private static final OSType DETECTED_OS;

	static
	{
		final String os = System
			.getProperty("os.name", "generic")
			.toLowerCase();
		DETECTED_OS = parseOs(os);
		log.debug("Detect OS: {}", DETECTED_OS);
	}

	static OSType parseOs(@Nonnull String os)
	{
		os = os.toLowerCase();
		if ((os.contains("mac")) || (os.contains("darwin")))
		{
			return OSType.MacOS;
		}
		else if (os.contains("win"))
		{
			return OSType.Windows;
		}
		else if (os.contains("linux"))
		{
			return OSType.Linux;
		}
		else
		{
			return OSType.Other;
		}
	}

	public static OSType getOs()
	{
		return DETECTED_OS;
	}
}
