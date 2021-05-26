package net.runelite.rs.api;

import net.runelite.api.EnumComposition;
import net.runelite.mapping.Import;

public interface RSEnumComposition extends EnumComposition, RSDualNode
{
	@Import("size")
	@Override
	int size();

	@Import("keys")
	@Override
	int[] getKeys();

	@Import("intVals")
	@Override
	int[] getIntVals();

	@Import("strVals")
	@Override
	String[] getStringVals();

	@Import("defaultInt")
	int getDefaultInt();

	@Import("defaultStr")
	String getDefaultString();
}
