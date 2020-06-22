package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSBuffer extends RSNode
{
	@Import("array")
	byte[] getPayload();

	@Import("array")
	void setPayload(byte[] payload);

	@Import("offset")
	int getOffset();

	@Import("offset")
	void setOffset(int offset);
}