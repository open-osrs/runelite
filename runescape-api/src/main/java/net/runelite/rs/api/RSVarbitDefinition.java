package net.runelite.rs.api;

import net.runelite.api.VarbitDefinition;
import net.runelite.mapping.Import;

public interface RSVarbitDefinition extends VarbitDefinition, RSDualNode
{
	@Import("baseVar")
	int getIndex();

	@Import("startBit")
	int getLeastSignificantBit();

	@Import("endBit")
	int getMostSignificantBit();

	@Import("decode")
	void decode(RSBuffer buffer);
}
