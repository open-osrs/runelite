package net.runelite.api;

public interface ClientPacket
{
	int getId();
	void setId(int id);

	int getLength();
	void setLength(int length);
}
