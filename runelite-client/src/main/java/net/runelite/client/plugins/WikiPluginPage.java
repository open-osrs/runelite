/*******************************************************************************
 * Copyright (c) 2019 RuneLitePlus
 * Redistributions and modifications of this software are permitted as long as this notice remains in its original unmodified state at the top of this file.
 * If there are any questions comments, or feedback about this software, please direct all inquiries directly to the file authors:
 * ST0NEWALL#9112
 *  RuneLitePlus Discord: https://discord.gg/Q7wFtCe
 *  RuneLitePlus website: https://runelitepl.us
 *
 ******************************************************************************/
package net.runelite.client.plugins;

import java.util.Arrays;
import java.util.List;
import net.runelite.client.config.ConfigItem;

/**
 * A class that represents a Plugin and its configuration in the DokuWiki formatting syntax
 */
public class WikiPluginPage
{
	private final String name;
	private final String description;
	private final String info;
	private final String tags;
	private final List<ConfigItem> configItems;
	private final static String AUTOGENERATED_NOTICE = "**NOTE: This page, along with all other plugin pages is" +
		" autogenerated. Any edits made to this page will be overwritten the next time its updated.";

	/**
	 * @param name        - The plugin name
	 * @param description - The Plugin description
	 * @param tags        - Plugin/wiki tags
	 * @param enabled     - The default PluginDescriptor value
	 * @param hidden      - The default PluginDescriptor value
	 * @param developer   - The default PluginDescriptor value
	 * @param outdated    - The default PluginDescriptor value
	 * @param configItems - A List of the ConfigItem from the plugins config file
	 */
	public WikiPluginPage(String name, String description, String[] tags, boolean enabled, boolean hidden,
						  boolean developer, boolean outdated, List<ConfigItem> configItems)
	{
		this.name = String.format("====== %s ====== \n", name);
		this.description = String.format("===== Description ===== \n <code>%s</code>\n", description);
		;
		this.info = "===== Information ===== \n" +
			String.format("|Enabled by default|%s|\n", enabled ? "Yes" : "No") +
			String.format("|Hidden|%s|\n", hidden ? "Yes" : "No") +
			String.format("|Developer plugin|%s|\n", developer ? "Yes" : "No") +
			String.format("|Load when outdated|%s|\n", outdated ? "Yes" : "No");
		if (tags.length > 0)
		{
			StringBuilder tagStringBuilder = new StringBuilder();
			tagStringBuilder.append("{{tag>");
			Arrays.asList(tags).forEach(s -> tagStringBuilder.append(s.replaceAll(" ",
				"_").toLowerCase()).append(" "));
			tagStringBuilder.append("}}");
			this.tags = tagStringBuilder.toString();
		}
		else
		{
			this.tags = "";
		}
		this.configItems = configItems;
	}

	@Override
	public String toString()
	{
		StringBuilder s = new StringBuilder(this.name + this.description + this.info);
		if (configItems != null)
		{
			s.append("===== Configuration Settings =====\n");
			for (ConfigItem configItem : configItems)
			{
				s.append("  * ").append("**").append(configItem.name())
					.append("**").append(": ").append(configItem.description()).append(" \n");
			}
		}

		s.append("\n" + AUTOGENERATED_NOTICE + "\n");
		s.append(this.tags);
		return s.toString();
	}
}
