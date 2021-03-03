package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSEnumerated
{
	@Import("rsOrdinal")
	int getOrdinal();
}
