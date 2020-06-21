package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSPacketBufferNode extends RSNode{
	@Import("packetBuffer")
	RSPacketBuffer getPacketBuffer();
}
