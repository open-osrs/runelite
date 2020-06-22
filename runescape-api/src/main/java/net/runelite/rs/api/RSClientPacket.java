package net.runelite.rs.api;

import net.runelite.api.ClientPacket;
import net.runelite.mapping.Import;

public interface RSClientPacket extends ClientPacket
{
	@Import("id")
	@Override
	int getId();

	@Import("id")
	@Override
	void setId(int id);

	@Import("length")
	@Override
	int getLength();

	@Import("length")
	@Override
	void setLength(int length);
}
