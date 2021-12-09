package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSPacketBuffer extends RSBuffer {
    @Import("isaacCipher")
    RSIsaacCipher getIsaacCipher();

    @Import("bitIndex")
    int getBitIndex();

    @Import("newIsaacCipher")
    void newIsaacCipher(int[] var1);

    @Import("setIsaacCipher")
    void setIsaacCipher(RSIsaacCipher var1);

    @Import("writeByteIsaac")
    void writeByteIsaac(int var1);

    @Import("readByteIsaac")
    int readByteIsaac();

    @Import("readSmartByteShortIsaac")
    int readSmartByteShortIsaac();

    @Import("importIndex")
    void importIndex();

    @Import("readBits")
    int readBits(int var1);

    @Import("exportIndex")
    void exportIndex();

    @Import("bitsRemaining")
    int bitsRemaining(int var1);

}
