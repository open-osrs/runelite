import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ks")
@Implements("NetCache")
public class NetCache {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("NetCache_socket")
	public static AbstractSocket NetCache_socket;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 963524213
	)
	@Export("NetCache_loadTime")
	public static int NetCache_loadTime;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	@Export("NetCache_pendingPriorityWrites")
	public static NodeHashTable NetCache_pendingPriorityWrites;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -922143367
	)
	@Export("NetCache_pendingPriorityWritesCount")
	public static int NetCache_pendingPriorityWritesCount;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	@Export("NetCache_pendingPriorityResponses")
	public static NodeHashTable NetCache_pendingPriorityResponses;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -2128365645
	)
	@Export("NetCache_pendingPriorityResponsesCount")
	public static int NetCache_pendingPriorityResponsesCount;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	@Export("NetCache_pendingWritesQueue")
	public static DualNodeDeque NetCache_pendingWritesQueue;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	@Export("NetCache_pendingWrites")
	public static NodeHashTable NetCache_pendingWrites;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 939366245
	)
	@Export("NetCache_pendingWritesCount")
	public static int NetCache_pendingWritesCount;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	@Export("NetCache_pendingResponses")
	public static NodeHashTable NetCache_pendingResponses;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1197767617
	)
	@Export("NetCache_pendingResponsesCount")
	public static int NetCache_pendingResponsesCount;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("NetCache_responseHeaderBuffer")
	public static Buffer NetCache_responseHeaderBuffer;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1905341391
	)
	public static int field3736;
	@ObfuscatedName("j")
	@Export("NetCache_crc")
	static CRC32 NetCache_crc;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("NetCache_reference")
	static Buffer NetCache_reference;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "[Lkx;"
	)
	@Export("NetCache_archives")
	static Archive[] NetCache_archives;
	@ObfuscatedName("t")
	public static byte field3735;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1579453389
	)
	@Export("NetCache_crcMismatches")
	public static int NetCache_crcMismatches;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 177319997
	)
	@Export("NetCache_ioExceptions")
	public static int NetCache_ioExceptions;
	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	static AbstractSocket field3738;

	static {
		NetCache_loadTime = 0;
		NetCache_pendingPriorityWrites = new NodeHashTable(4096);
		NetCache_pendingPriorityWritesCount = 0;
		NetCache_pendingPriorityResponses = new NodeHashTable(32);
		NetCache_pendingPriorityResponsesCount = 0;
		NetCache_pendingWritesQueue = new DualNodeDeque();
		NetCache_pendingWrites = new NodeHashTable(4096);
		NetCache_pendingWritesCount = 0;
		NetCache_pendingResponses = new NodeHashTable(4096);
		NetCache_pendingResponsesCount = 0;
		NetCache_responseHeaderBuffer = new Buffer(8);
		field3736 = 0;
		NetCache_crc = new CRC32();
		NetCache_archives = new Archive[256];
		field3735 = 0;
		NetCache_crcMismatches = 0;
		NetCache_ioExceptions = 0;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Loq;II)V",
		garbageValue = "223072322"
	)
	@Export("readPlayerUpdate")
	static void readPlayerUpdate(PacketBuffer var0, int var1) {
		boolean var2 = var0.readBits(1) == 1;
		if (var2) {
			Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
		}

		int var3 = var0.readBits(2);
		Player var4 = Client.players[var1];
		if (var3 == 0) {
			if (var2) {
				var4.field1074 = false;
			} else if (Client.localPlayerIndex == var1) {
				throw new RuntimeException();
			} else {
				Players.Players_regions[var1] = (var4.plane << 28) + (FloorOverlayDefinition.baseX + var4.pathX[0] >> 13 << 14) + (class320.baseY + var4.pathY[0] >> 13);
				if (var4.field1096 != -1) {
					Players.Players_orientations[var1] = var4.field1096;
				} else {
					Players.Players_orientations[var1] = var4.orientation;
				}

				Players.Players_targetIndices[var1] = var4.targetIndex;
				Client.players[var1] = null;
				if (var0.readBits(1) != 0) {
					MusicPatchNode.updateExternalPlayer(var0, var1);
				}

			}
		} else {
			int var5;
			int var6;
			int var7;
			if (var3 == 1) {
				var5 = var0.readBits(3);
				var6 = var4.pathX[0];
				var7 = var4.pathY[0];
				if (var5 == 0) {
					--var6;
					--var7;
				} else if (var5 == 1) {
					--var7;
				} else if (var5 == 2) {
					++var6;
					--var7;
				} else if (var5 == 3) {
					--var6;
				} else if (var5 == 4) {
					++var6;
				} else if (var5 == 5) {
					--var6;
					++var7;
				} else if (var5 == 6) {
					++var7;
				} else if (var5 == 7) {
					++var6;
					++var7;
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
					var4.resetPath(var6, var7);
					var4.field1074 = false;
				} else if (var2) {
					var4.field1074 = true;
					var4.tileX = var6;
					var4.tileY = var7;
				} else {
					var4.field1074 = false;
					var4.method2072(var6, var7, Players.field1245[var1]);
				}

			} else if (var3 == 2) {
				var5 = var0.readBits(4);
				var6 = var4.pathX[0];
				var7 = var4.pathY[0];
				if (var5 == 0) {
					var6 -= 2;
					var7 -= 2;
				} else if (var5 == 1) {
					--var6;
					var7 -= 2;
				} else if (var5 == 2) {
					var7 -= 2;
				} else if (var5 == 3) {
					++var6;
					var7 -= 2;
				} else if (var5 == 4) {
					var6 += 2;
					var7 -= 2;
				} else if (var5 == 5) {
					var6 -= 2;
					--var7;
				} else if (var5 == 6) {
					var6 += 2;
					--var7;
				} else if (var5 == 7) {
					var6 -= 2;
				} else if (var5 == 8) {
					var6 += 2;
				} else if (var5 == 9) {
					var6 -= 2;
					++var7;
				} else if (var5 == 10) {
					var6 += 2;
					++var7;
				} else if (var5 == 11) {
					var6 -= 2;
					var7 += 2;
				} else if (var5 == 12) {
					--var6;
					var7 += 2;
				} else if (var5 == 13) {
					var7 += 2;
				} else if (var5 == 14) {
					++var6;
					var7 += 2;
				} else if (var5 == 15) {
					var6 += 2;
					var7 += 2;
				}

				if (Client.localPlayerIndex != var1 || var4.x >= 1536 && var4.y >= 1536 && var4.x < 11776 && var4.y < 11776) {
					if (var2) {
						var4.field1074 = true;
						var4.tileX = var6;
						var4.tileY = var7;
					} else {
						var4.field1074 = false;
						var4.method2072(var6, var7, Players.field1245[var1]);
					}
				} else {
					var4.resetPath(var6, var7);
					var4.field1074 = false;
				}

			} else {
				var5 = var0.readBits(1);
				int var8;
				int var9;
				int var10;
				int var11;
				if (var5 == 0) {
					var6 = var0.readBits(12);
					var7 = var6 >> 10;
					var8 = var6 >> 5 & 31;
					if (var8 > 15) {
						var8 -= 32;
					}

					var9 = var6 & 31;
					if (var9 > 15) {
						var9 -= 32;
					}

					var10 = var8 + var4.pathX[0];
					var11 = var9 + var4.pathY[0];
					if (Client.localPlayerIndex != var1 || var4.x >= 1536 && var4.y >= 1536 && var4.x < 11776 && var4.y < 11776) {
						if (var2) {
							var4.field1074 = true;
							var4.tileX = var10;
							var4.tileY = var11;
						} else {
							var4.field1074 = false;
							var4.method2072(var10, var11, Players.field1245[var1]);
						}
					} else {
						var4.resetPath(var10, var11);
						var4.field1074 = false;
					}

					var4.plane = (byte)(var7 + var4.plane & 3);
					if (Client.localPlayerIndex == var1) {
						class391.Client_plane = var4.plane;
					}

				} else {
					var6 = var0.readBits(30);
					var7 = var6 >> 28;
					var8 = var6 >> 14 & 16383;
					var9 = var6 & 16383;
					var10 = (var8 + FloorOverlayDefinition.baseX + var4.pathX[0] & 16383) - FloorOverlayDefinition.baseX;
					var11 = (var9 + class320.baseY + var4.pathY[0] & 16383) - class320.baseY;
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
						var4.resetPath(var10, var11);
						var4.field1074 = false;
					} else if (var2) {
						var4.field1074 = true;
						var4.tileX = var10;
						var4.tileY = var11;
					} else {
						var4.field1074 = false;
						var4.method2072(var10, var11, Players.field1245[var1]);
					}

					var4.plane = (byte)(var7 + var4.plane & 3);
					if (Client.localPlayerIndex == var1) {
						class391.Client_plane = var4.plane;
					}

				}
			}
		}
	}
}
