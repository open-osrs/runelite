package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSPacketBufferNode extends RSNode {
    @Import("release")
    void release();

    @Import("clientPacket")
    RSClientPacket getClientPacket();

    @Import("clientPacketLength")
    int getClientPacketLength();

    @Import("packetBuffer")
    RSPacketBuffer getPacketBuffer();

    @Import("index")
    int getIndex();


}
