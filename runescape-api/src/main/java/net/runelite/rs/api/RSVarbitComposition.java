package net.runelite.rs.api;

import net.runelite.api.VarbitComposition;
import net.runelite.mapping.Import;

public interface RSVarbitComposition extends VarbitComposition, RSDualNode
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
