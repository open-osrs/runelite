import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jx")
@Implements("NetCache")
public class NetCache {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("NetCache_socket")
	public static AbstractSocket NetCache_socket;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 356448421
	)
	@Export("NetCache_loadTime")
	public static int NetCache_loadTime;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("NetCache_pendingPriorityWrites")
	public static NodeHashTable NetCache_pendingPriorityWrites;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1204808007
	)
	@Export("NetCache_pendingPriorityWritesCount")
	public static int NetCache_pendingPriorityWritesCount;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("NetCache_pendingPriorityResponses")
	public static NodeHashTable NetCache_pendingPriorityResponses;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 317801023
	)
	@Export("NetCache_pendingPriorityResponsesCount")
	public static int NetCache_pendingPriorityResponsesCount;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("NetCache_pendingWritesQueue")
	public static DualNodeDeque NetCache_pendingWritesQueue;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("NetCache_pendingWrites")
	public static NodeHashTable NetCache_pendingWrites;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -2006204735
	)
	@Export("NetCache_pendingWritesCount")
	public static int NetCache_pendingWritesCount;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("NetCache_pendingResponses")
	public static NodeHashTable NetCache_pendingResponses;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1362666837
	)
	@Export("NetCache_pendingResponsesCount")
	public static int NetCache_pendingResponsesCount;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("NetCache_responseHeaderBuffer")
	public static Buffer NetCache_responseHeaderBuffer;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -288041073
	)
	public static int field3612;
	@ObfuscatedName("m")
	@Export("NetCache_crc")
	public static CRC32 NetCache_crc;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "[Ljp;"
	)
	@Export("NetCache_archives")
	public static Archive[] NetCache_archives;
	@ObfuscatedName("w")
	public static byte field3607;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1063840627
	)
	@Export("NetCache_crcMismatches")
	public static int NetCache_crcMismatches;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1965429235
	)
	@Export("NetCache_ioExceptions")
	public static int NetCache_ioExceptions;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("archive0")
	static Archive archive0;

	static {
		NetCache_loadTime = 0; // L: 13
		NetCache_pendingPriorityWrites = new NodeHashTable(4096); // L: 15
		NetCache_pendingPriorityWritesCount = 0; // L: 16
		NetCache_pendingPriorityResponses = new NodeHashTable(32); // L: 17
		NetCache_pendingPriorityResponsesCount = 0; // L: 18
		NetCache_pendingWritesQueue = new DualNodeDeque(); // L: 19
		NetCache_pendingWrites = new NodeHashTable(4096); // L: 20
		NetCache_pendingWritesCount = 0; // L: 21
		NetCache_pendingResponses = new NodeHashTable(4096); // L: 22
		NetCache_pendingResponsesCount = 0; // L: 23
		NetCache_responseHeaderBuffer = new Buffer(8); // L: 26
		field3612 = 0; // L: 28
		NetCache_crc = new CRC32(); // L: 30
		NetCache_archives = new Archive[256]; // L: 32
		field3607 = 0; // L: 33
		NetCache_crcMismatches = 0; // L: 34
		NetCache_ioExceptions = 0; // L: 35
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1592550546"
	)
	static final void method5025(int var0, int var1, int var2, int var3) {
		Client.overheadTextCount = 0; // L: 4886
		boolean var4 = false; // L: 4887
		int var5 = -1; // L: 4888
		int var6 = -1; // L: 4889
		int var7 = Players.Players_count; // L: 4890
		int[] var8 = Players.Players_indices; // L: 4891

		int var9;
		for (var9 = 0; var9 < var7 + Client.npcCount; ++var9) { // L: 4892
			Object var20;
			if (var9 < var7) { // L: 4894
				var20 = Client.players[var8[var9]]; // L: 4895
				if (var8[var9] == Client.combatTargetPlayerIndex) { // L: 4896
					var4 = true; // L: 4897
					var5 = var9; // L: 4898
					continue;
				}

				if (var20 == class93.localPlayer) { // L: 4901
					var6 = var9; // L: 4902
					continue; // L: 4903
				}
			} else {
				var20 = Client.npcs[Client.npcIndices[var9 - var7]]; // L: 4906
			}

			Ignored.drawActor2d((Actor)var20, var9, var0, var1, var2, var3); // L: 4907
		}

		if (Client.renderSelf && var6 != -1) { // L: 4909
			Ignored.drawActor2d(class93.localPlayer, var6, var0, var1, var2, var3); // L: 4910
		}

		if (var4) { // L: 4912
			Ignored.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var5, var0, var1, var2, var3); // L: 4913
		}

		for (var9 = 0; var9 < Client.overheadTextCount; ++var9) { // L: 4915
			int var10 = Client.overheadTextXs[var9]; // L: 4916
			int var11 = Client.overheadTextYs[var9]; // L: 4917
			int var12 = Client.overheadTextXOffsets[var9]; // L: 4918
			int var13 = Client.overheadTextAscents[var9]; // L: 4919
			boolean var14 = true; // L: 4920

			while (var14) {
				var14 = false; // L: 4922

				for (int var19 = 0; var19 < var9; ++var19) { // L: 4923
					if (var11 + 2 > Client.overheadTextYs[var19] - Client.overheadTextAscents[var19] && var11 - var13 < Client.overheadTextYs[var19] + 2 && var10 - var12 < Client.overheadTextXs[var19] + Client.overheadTextXOffsets[var19] && var12 + var10 > Client.overheadTextXs[var19] - Client.overheadTextXOffsets[var19] && Client.overheadTextYs[var19] - Client.overheadTextAscents[var19] < var11) { // L: 4924 4925
						var11 = Client.overheadTextYs[var19] - Client.overheadTextAscents[var19]; // L: 4926
						var14 = true; // L: 4927
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var9]; // L: 4932
			Client.viewportTempY = Client.overheadTextYs[var9] = var11; // L: 4933
			String var15 = Client.overheadText[var9]; // L: 4934
			if (Client.chatEffects == 0) { // L: 4935
				int var16 = 16776960; // L: 4936
				if (Client.overheadTextColors[var9] < 6) { // L: 4937
					var16 = Client.field877[Client.overheadTextColors[var9]];
				}

				if (Client.overheadTextColors[var9] == 6) { // L: 4938
					var16 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var9] == 7) { // L: 4939
					var16 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.overheadTextColors[var9] == 8) { // L: 4940
					var16 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var17;
				if (Client.overheadTextColors[var9] == 9) { // L: 4941
					var17 = 150 - Client.overheadTextCyclesRemaining[var9]; // L: 4942
					if (var17 < 50) { // L: 4943
						var16 = var17 * 1280 + 16711680;
					} else if (var17 < 100) { // L: 4944
						var16 = 16776960 - (var17 - 50) * 327680;
					} else if (var17 < 150) { // L: 4945
						var16 = (var17 - 100) * 5 + 65280;
					}
				}

				if (Client.overheadTextColors[var9] == 10) { // L: 4947
					var17 = 150 - Client.overheadTextCyclesRemaining[var9]; // L: 4948
					if (var17 < 50) { // L: 4949
						var16 = var17 * 5 + 16711680;
					} else if (var17 < 100) { // L: 4950
						var16 = 16711935 - (var17 - 50) * 327680;
					} else if (var17 < 150) { // L: 4951
						var16 = (var17 - 100) * 327680 + 255 - (var17 - 100) * 5;
					}
				}

				if (Client.overheadTextColors[var9] == 11) { // L: 4953
					var17 = 150 - Client.overheadTextCyclesRemaining[var9]; // L: 4954
					if (var17 < 50) { // L: 4955
						var16 = 16777215 - var17 * 327685;
					} else if (var17 < 100) { // L: 4956
						var16 = (var17 - 50) * 327685 + 65280;
					} else if (var17 < 150) { // L: 4957
						var16 = 16777215 - (var17 - 100) * 327680;
					}
				}

				if (Client.overheadTextEffects[var9] == 0) { // L: 4959
					Widget.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0);
				}

				if (Client.overheadTextEffects[var9] == 1) { // L: 4960
					Widget.fontBold12.drawCenteredWave(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var9] == 2) { // L: 4961
					Widget.fontBold12.drawCenteredWave2(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var9] == 3) { // L: 4962
					Widget.fontBold12.drawCenteredShake(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var9]);
				}

				if (Client.overheadTextEffects[var9] == 4) { // L: 4963
					var17 = (150 - Client.overheadTextCyclesRemaining[var9]) * (Widget.fontBold12.stringWidth(var15) + 100) / 150; // L: 4964
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1); // L: 4965
					Widget.fontBold12.draw(var15, var0 + Client.viewportTempX + 50 - var17, Client.viewportTempY + var1, var16, 0); // L: 4966
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4967
				}

				if (Client.overheadTextEffects[var9] == 5) { // L: 4969
					var17 = 150 - Client.overheadTextCyclesRemaining[var9]; // L: 4970
					int var18 = 0; // L: 4971
					if (var17 < 25) { // L: 4972
						var18 = var17 - 25;
					} else if (var17 > 125) { // L: 4973
						var18 = var17 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - Widget.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5); // L: 4974
					Widget.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, var18 + Client.viewportTempY + var1, var16, 0); // L: 4975
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4976
				}
			} else {
				Widget.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0); // L: 4980
			}
		}

	} // L: 4983
}
