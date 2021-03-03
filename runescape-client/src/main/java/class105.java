import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
public class class105 {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("reflectionChecks")
	static IterableNodeDeque reflectionChecks;
	@ObfuscatedName("c")
	@Export("SpriteBuffer_xOffsets")
	public static int[] SpriteBuffer_xOffsets;
	@ObfuscatedName("e")
	public static short[][] field1339;

	static {
		reflectionChecks = new IterableNodeDeque(); // L: 17
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(ZLkd;I)V",
		garbageValue = "1935543269"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0; // L: 4978
		int var2;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		if (!Client.isInInstance) { // L: 4979
			var2 = var1.method5728(); // L: 4980
			int var3 = var1.method5727(); // L: 4981
			var4 = var1.readUnsignedShort(); // L: 4982
			Bounds.xteaKeys = new int[var4][4]; // L: 4983

			for (var5 = 0; var5 < var4; ++var5) { // L: 4984
				for (var6 = 0; var6 < 4; ++var6) { // L: 4985
					Bounds.xteaKeys[var5][var6] = var1.readInt(); // L: 4986
				}
			}

			class238.regions = new int[var4]; // L: 4989
			class92.regionMapArchiveIds = new int[var4]; // L: 4990
			MusicPatchNode2.regionLandArchiveIds = new int[var4]; // L: 4991
			class2.regionLandArchives = new byte[var4][]; // L: 4992
			Interpreter.regionMapArchives = new byte[var4][]; // L: 4993
			boolean var16 = false; // L: 4994
			if ((var3 / 8 == 48 || var3 / 8 == 49) && var2 / 8 == 48) { // L: 4995
				var16 = true;
			}

			if (var3 / 8 == 48 && var2 / 8 == 148) { // L: 4996
				var16 = true;
			}

			var4 = 0; // L: 4997

			for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) { // L: 4998
				for (var7 = (var2 - 6) / 8; var7 <= (var2 + 6) / 8; ++var7) { // L: 4999
					var8 = var7 + (var6 << 8); // L: 5000
					if (!var16 || var7 != 49 && var7 != 149 && var7 != 147 && var6 != 50 && (var6 != 49 || var7 != 47)) { // L: 5001
						class238.regions[var4] = var8; // L: 5002
						class92.regionMapArchiveIds[var4] = class8.archive5.getGroupId("m" + var6 + "_" + var7); // L: 5003
						MusicPatchNode2.regionLandArchiveIds[var4] = class8.archive5.getGroupId("l" + var6 + "_" + var7); // L: 5004
						++var4; // L: 5005
					}
				}
			}

			PcmPlayer.method2661(var3, var2, true); // L: 5008
		} else {
			var2 = var1.method5729(); // L: 5011
			boolean var15 = var1.method5776() == 1; // L: 5012
			var4 = var1.method5727(); // L: 5013
			var5 = var1.readUnsignedShort(); // L: 5014
			var1.importIndex(); // L: 5015

			int var9;
			for (var6 = 0; var6 < 4; ++var6) { // L: 5016
				for (var7 = 0; var7 < 13; ++var7) { // L: 5017
					for (var8 = 0; var8 < 13; ++var8) { // L: 5018
						var9 = var1.readBits(1); // L: 5019
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26); // L: 5020
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1; // L: 5021
						}
					}
				}
			}

			var1.exportIndex(); // L: 5025
			Bounds.xteaKeys = new int[var5][4]; // L: 5026

			for (var6 = 0; var6 < var5; ++var6) { // L: 5027
				for (var7 = 0; var7 < 4; ++var7) { // L: 5028
					Bounds.xteaKeys[var6][var7] = var1.readInt(); // L: 5029
				}
			}

			class238.regions = new int[var5]; // L: 5032
			class92.regionMapArchiveIds = new int[var5]; // L: 5033
			MusicPatchNode2.regionLandArchiveIds = new int[var5]; // L: 5034
			class2.regionLandArchives = new byte[var5][]; // L: 5035
			Interpreter.regionMapArchives = new byte[var5][]; // L: 5036
			var5 = 0; // L: 5037

			for (var6 = 0; var6 < 4; ++var6) { // L: 5038
				for (var7 = 0; var7 < 13; ++var7) { // L: 5039
					for (var8 = 0; var8 < 13; ++var8) { // L: 5040
						var9 = Client.instanceChunkTemplates[var6][var7][var8]; // L: 5041
						if (var9 != -1) { // L: 5042
							int var10 = var9 >> 14 & 1023; // L: 5043
							int var11 = var9 >> 3 & 2047; // L: 5044
							int var12 = (var10 / 8 << 8) + var11 / 8; // L: 5045

							int var13;
							for (var13 = 0; var13 < var5; ++var13) { // L: 5046
								if (class238.regions[var13] == var12) {
									var12 = -1; // L: 5047
									break;
								}
							}

							if (var12 != -1) { // L: 5050
								class238.regions[var5] = var12; // L: 5051
								var13 = var12 >> 8 & 255; // L: 5052
								int var14 = var12 & 255; // L: 5053
								class92.regionMapArchiveIds[var5] = class8.archive5.getGroupId("m" + var13 + "_" + var14); // L: 5054
								MusicPatchNode2.regionLandArchiveIds[var5] = class8.archive5.getGroupId("l" + var13 + "_" + var14); // L: 5055
								++var5; // L: 5056
							}
						}
					}
				}
			}

			PcmPlayer.method2661(var4, var2, !var15); // L: 5062
		}

	} // L: 5064

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1205267134"
	)
	static final void method2448() {
		for (int var0 = 0; var0 < Players.Players_count; ++var0) { // L: 11427
			Player var1 = Client.players[Players.Players_indices[var0]]; // L: 11428
			var1.clearIsFriend(); // L: 11429
		}

		RouteStrategy.method3795(); // L: 11431
		if (WorldMapID.clanChat != null) { // L: 11432
			WorldMapID.clanChat.clearFriends(); // L: 11433
		}

	} // L: 11435
}
