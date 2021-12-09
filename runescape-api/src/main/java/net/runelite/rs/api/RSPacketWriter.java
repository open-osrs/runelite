package net.runelite.rs.api;

import net.runelite.api.PacketWriter;
import net.runelite.mapping.Import;

import java.io.IOException;

public interface RSPacketWriter extends PacketWriter {
    @Import("pendingWrites")
    int getPendingWrites();

    @Import("flush")
    void flush() throws IOException;

    @Import("addNode")
    void addNode(RSPacketBufferNode var1);

    @Import("isaacCipher")
    RSIsaacCipher getIsaacCipher();

    @Import("socket")
    RSAbstractSocket getSocket();

    @Import("packetBuffer")
    RSPacketBuffer getPacketBuffer();

}
