package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSParamDefinition
{
	@Import("isString")
	boolean isString();

	@Import("defaultInt")
	int getDefaultInt();

	@Import("defaultStr")
	String getDefaultStr();
}
