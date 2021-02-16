/*
 * Copyright (c) 2020, SwazRGB
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

package net.runelite.client.plugins;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.List;

/**
 * Determines whether a {@link File} is an external plugin folder. To be considered a plugin a folder must:
 * <p>
 * * Must not be a blacklisted name
 * * Have a {@code .gradle.kts} file in the root named after the folder
 * * Have a {@code MANIFEST.MF} located at {@code build/tmp/jar/MANIFEST.MF}
 */
public class OPRSExternalPluginFileFilter implements FileFilter
{
	private static final List<String> blacklist = Arrays.asList(
		".git",
		"build",
		"target",
		"release"
	);

	private static final List<String> buildFiles = Arrays.asList(
		"%s.gradle.kts",
		"%s.gradle"
	);

	@Override
	public boolean accept(File pathName)
	{
		// Check if this path looks like a plugin development directory
		if (!pathName.isDirectory())
		{
			return false;
		}

		String dirName = pathName.getName();
		if (blacklist.contains(dirName))
		{
			return false;
		}

		// Check if the plugin directory has a MANIFEST.MF which si required for loading
		if (!new File(pathName, OPRSExternalPluginManager.DEVELOPMENT_MANIFEST_PATH).exists())
		{
			return false;
		}

		// By convention plugins their directory is $name and they have a $name.gradle.kts or $name.gradle file in their root
		for (String buildFile : buildFiles)
		{
			if (new File(pathName, String.format(buildFile, dirName)).exists())
			{
				return true;
			}
		}

		return false;
	}
}
