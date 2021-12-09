package net.runelite.rs.api;

import net.runelite.mapping.Import;

import java.io.IOException;

public interface RSAbstractSocket {
    @Import("write")
    void write(byte[] var1, int var2, int var3) throws IOException;
}
