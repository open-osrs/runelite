package net.runelite.rs.api;

import net.runelite.api.ClientPacket;
import net.runelite.mapping.Import;

public interface RSClientPacket extends ClientPacket
{
	@Import("id")
	int getId();

	@Import("length")
	int getLength();
}
