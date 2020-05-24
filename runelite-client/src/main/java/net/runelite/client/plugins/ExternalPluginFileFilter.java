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
public class ExternalPluginFileFilter implements FileFilter
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
		if (!new File(pathName, ExternalPluginManager.DEVELOPMENT_MANIFEST_PATH).exists())
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
