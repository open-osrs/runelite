import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cp")
@Implements("Players")
public class Players {
	@ObfuscatedName("m")
	static byte[] field1244;
	@ObfuscatedName("k")
	static byte[] field1245;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "[Lot;"
	)
	static Buffer[] field1246;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -398895759
	)
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("z")
	@Export("Players_indices")
	static int[] Players_indices;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -491206921
	)
	@Export("Players_emptyIdxCount")
	static int Players_emptyIdxCount;
	@ObfuscatedName("u")
	@Export("Players_emptyIndices")
	static int[] Players_emptyIndices;
	@ObfuscatedName("e")
	@Export("Players_regions")
	static int[] Players_regions;
	@ObfuscatedName("l")
	@Export("Players_orientations")
	static int[] Players_orientations;
	@ObfuscatedName("y")
	@Export("Players_targetIndices")
	static int[] Players_targetIndices;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 91202637
	)
	@Export("Players_pendingUpdateCount")
	static int Players_pendingUpdateCount;
	@ObfuscatedName("f")
	@Export("Players_pendingUpdateIndices")
	static int[] Players_pendingUpdateIndices;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	static Buffer field1255;

	static {
		field1244 = new byte[2048];
		field1245 = new byte[2048];
		field1246 = new Buffer[2048];
		Players_count = 0;
		Players_indices = new int[2048];
		Players_emptyIdxCount = 0;
		Players_emptyIndices = new int[2048];
		Players_regions = new int[2048];
		Players_orientations = new int[2048];
		Players_targetIndices = new int[2048];
		Players_pendingUpdateCount = 0;
		Players_pendingUpdateIndices = new int[2048];
		field1255 = new Buffer(new byte[5000]);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1886800204"
	)
	static final String method2260(int var0) {
		if (var0 < 100000) {
			return "<col=ffff00>" + var0 + "</col>";
		} else {
			return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + "K" + "</col>" : "<col=00ff80>" + var0 / 1000000 + "M" + "</col>";
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-286848897"
	)
	@Export("isCharPrintable")
	public static boolean isCharPrintable(char var0) {
		if (var0 >= ' ' && var0 <= '~') {
			return true;
		} else if (var0 >= 160 && var0 <= 255) {
			return true;
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376;
		}
	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1654335904"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = FriendSystem.getPacketBufferNode(ClientPacket.field2727, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(0);
		Client.packetWriter.addNode(var0);
	}
}
