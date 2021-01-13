package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSObjectNode extends RSNode
{
	@Import("obj")
	Object getValue();
}
