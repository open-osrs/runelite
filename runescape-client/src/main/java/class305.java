import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ku")
public final class class305 {
	@ObfuscatedName("v")
	@Export("base37Table")
	public static final char[] base37Table;
	@ObfuscatedName("n")
	static long[] field3751;

	static {
		base37Table = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'}; // L: 4
		field3751 = new long[12]; // L: 5

		for (int var0 = 0; var0 < field3751.length; ++var0) { // L: 8
			field3751[var0] = (long)Math.pow(37.0D, (double)var0);
		}

	} // L: 9

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "28"
	)
	static final void method5533(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) { // L: 11329
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method27()) { // L: 11330
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 11331
				if (var2.rank == -1) { // L: 11332
					PacketWriter var3 = Client.packetWriter; // L: 11333
					PacketBufferNode var4 = class21.getPacketBufferNode(ClientPacket.field2612, var3.isaacCipher); // L: 11334
					var4.packetBuffer.writeByte(3 + Tiles.stringCp1252NullTerminatedByteSize(var2.name)); // L: 11335
					var4.packetBuffer.writeByte(var0); // L: 11336
					var4.packetBuffer.writeShort(var1); // L: 11337
					var4.packetBuffer.writeStringCp1252NullTerminated(var2.name); // L: 11338
					var3.addNode(var4); // L: 11339
				}
			}
		}
	} // L: 11340
}
