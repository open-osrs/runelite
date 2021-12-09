package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSClientPacket {
    @Import("id")
    int getOpcode();

    @Import("length")
    int getExpectedLength();
}
