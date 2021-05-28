import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ms")
public class class339 implements class344 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public final class362 field3921;

	@ObfuscatedSignature(
		descriptor = "(Lmt;)V"
	)
	class339(class363 var1) {
		this.field3921 = var1; // L: 14
	} // L: 15

	@ObfuscatedSignature(
		descriptor = "(Lme;)V"
	)
	public class339(class340 var1) {
		this(new class363(var1)); // L: 10
	} // L: 11

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "423690194"
	)
	public int method6014(int var1) {
		return this.field3921.vmethod6362(var1); // L: 18
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljv;IIB)Z",
		garbageValue = "47"
	)
	static boolean method6015(AbstractArchive var0, int var1, int var2) {
		byte[] var3 = var0.takeFile(var1, var2); // L: 182
		if (var3 == null) { // L: 183
			return false;
		} else {
			ItemLayer.SpriteBuffer_decode(var3); // L: 184
			return true; // L: 185
		}
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(ZLnb;I)V",
		garbageValue = "-2130717093"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0; // L: 5048
		int var2;
		int var3;
		int var5;
		int var6;
		int var7;
		int var8;
		if (!Client.isInInstance) { // L: 5049
			var2 = var1.method6605(); // L: 5050
			var3 = var1.method6603(); // L: 5051
			int var4 = var1.readUnsignedShort(); // L: 5052
			WorldMapAreaData.xteaKeys = new int[var4][4]; // L: 5053

			for (var5 = 0; var5 < var4; ++var5) { // L: 5054
				for (var6 = 0; var6 < 4; ++var6) { // L: 5055
					WorldMapAreaData.xteaKeys[var5][var6] = var1.readInt(); // L: 5056
				}
			}

			PlayerComposition.regions = new int[var4]; // L: 5059
			class16.regionMapArchiveIds = new int[var4]; // L: 5060
			class24.regionLandArchiveIds = new int[var4]; // L: 5061
			class18.regionLandArchives = new byte[var4][]; // L: 5062
			class82.regionMapArchives = new byte[var4][]; // L: 5063
			boolean var16 = false; // L: 5064
			if ((var3 / 8 == 48 || var3 / 8 == 49) && var2 / 8 == 48) { // L: 5065
				var16 = true;
			}

			if (var3 / 8 == 48 && var2 / 8 == 148) { // L: 5066
				var16 = true;
			}

			var4 = 0; // L: 5067

			for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) { // L: 5068
				for (var7 = (var2 - 6) / 8; var7 <= (var2 + 6) / 8; ++var7) { // L: 5069
					var8 = var7 + (var6 << 8); // L: 5070
					if (!var16 || var7 != 49 && var7 != 149 && var7 != 147 && var6 != 50 && (var6 != 49 || var7 != 47)) { // L: 5071
						PlayerComposition.regions[var4] = var8; // L: 5072
						class16.regionMapArchiveIds[var4] = class247.archive5.getGroupId("m" + var6 + "_" + var7); // L: 5073
						class24.regionLandArchiveIds[var4] = class247.archive5.getGroupId("l" + var6 + "_" + var7); // L: 5074
						++var4; // L: 5075
					}
				}
			}

			Canvas.method391(var3, var2, true); // L: 5078
		} else {
			var2 = var1.readUnsignedShort(); // L: 5081
			var3 = var1.method6603(); // L: 5082
			boolean var15 = var1.method6549() == 1; // L: 5083
			var5 = var1.readUnsignedShort(); // L: 5084
			var1.importIndex(); // L: 5085

			int var9;
			for (var6 = 0; var6 < 4; ++var6) { // L: 5086
				for (var7 = 0; var7 < 13; ++var7) { // L: 5087
					for (var8 = 0; var8 < 13; ++var8) { // L: 5088
						var9 = var1.readBits(1); // L: 5089
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26); // L: 5090
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1; // L: 5091
						}
					}
				}
			}

			var1.exportIndex(); // L: 5095
			WorldMapAreaData.xteaKeys = new int[var5][4]; // L: 5096

			for (var6 = 0; var6 < var5; ++var6) { // L: 5097
				for (var7 = 0; var7 < 4; ++var7) { // L: 5098
					WorldMapAreaData.xteaKeys[var6][var7] = var1.readInt(); // L: 5099
				}
			}

			PlayerComposition.regions = new int[var5]; // L: 5102
			class16.regionMapArchiveIds = new int[var5]; // L: 5103
			class24.regionLandArchiveIds = new int[var5]; // L: 5104
			class18.regionLandArchives = new byte[var5][]; // L: 5105
			class82.regionMapArchives = new byte[var5][]; // L: 5106
			var5 = 0; // L: 5107

			for (var6 = 0; var6 < 4; ++var6) { // L: 5108
				for (var7 = 0; var7 < 13; ++var7) { // L: 5109
					for (var8 = 0; var8 < 13; ++var8) { // L: 5110
						var9 = Client.instanceChunkTemplates[var6][var7][var8]; // L: 5111
						if (var9 != -1) { // L: 5112
							int var10 = var9 >> 14 & 1023; // L: 5113
							int var11 = var9 >> 3 & 2047; // L: 5114
							int var12 = (var10 / 8 << 8) + var11 / 8; // L: 5115

							int var13;
							for (var13 = 0; var13 < var5; ++var13) { // L: 5116
								if (PlayerComposition.regions[var13] == var12) {
									var12 = -1; // L: 5117
									break; // L: 5118
								}
							}

							if (var12 != -1) { // L: 5120
								PlayerComposition.regions[var5] = var12; // L: 5121
								var13 = var12 >> 8 & 255; // L: 5122
								int var14 = var12 & 255; // L: 5123
								class16.regionMapArchiveIds[var5] = class247.archive5.getGroupId("m" + var13 + "_" + var14); // L: 5124
								class24.regionLandArchiveIds[var5] = class247.archive5.getGroupId("l" + var13 + "_" + var14); // L: 5125
								++var5; // L: 5126
							}
						}
					}
				}
			}

			Canvas.method391(var3, var2, !var15); // L: 5132
		}

	} // L: 5134
}
