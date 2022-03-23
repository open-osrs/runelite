import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
public class class146 extends class128 {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1735785845
	)
	int field1653;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -463030185
	)
	int field1652;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lee;)V"
	)
	class146(class131 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpd;B)V",
		garbageValue = "-73"
	)
	void vmethod3107(Buffer var1) {
		this.field1653 = var1.readInt(); // L: 274
		this.field1652 = var1.readInt();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Leh;I)V",
		garbageValue = "-1228032820"
	)
	void vmethod3104(ClanSettings var1) {
		var1.method2927(this.field1653, this.field1652);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IILge;Lgf;B)Z",
		garbageValue = "46"
	)
	static final boolean method3041(int var0, int var1, RouteStrategy var2, CollisionMap var3) {
		int var4 = var0; // L: 197
		int var5 = var1; // L: 198
		byte var6 = 64; // L: 199
		byte var7 = 64; // L: 200
		int var8 = var0 - var6; // L: 201
		int var9 = var1 - var7; // L: 202
		class194.directions[var6][var7] = 99; // L: 203
		class194.distances[var6][var7] = 0; // L: 204
		byte var10 = 0; // L: 205
		int var11 = 0; // L: 206
		class194.bufferX[var10] = var0; // L: 207
		byte var10001 = var10;
		int var18 = var10 + 1;
		class194.bufferY[var10001] = var1; // L: 208
		int[][] var12 = var3.flags; // L: 209

		while (var11 != var18) { // L: 210
			var4 = class194.bufferX[var11]; // L: 211
			var5 = class194.bufferY[var11]; // L: 212
			var11 = var11 + 1 & 4095; // L: 213
			int var16 = var4 - var8; // L: 214
			int var17 = var5 - var9; // L: 215
			int var13 = var4 - var3.xInset; // L: 216
			int var14 = var5 - var3.yInset; // L: 217
			if (var2.hasArrived(2, var4, var5, var3)) { // L: 218
				VarpDefinition.field1819 = var4; // L: 219
				class194.field2202 = var5; // L: 220
				return true; // L: 221
			}

			int var15 = class194.distances[var16][var17] + 1; // L: 223
			if (var16 > 0 && class194.directions[var16 - 1][var17] == 0 && (var12[var13 - 1][var14] & 19136782) == 0 && (var12[var13 - 1][var14 + 1] & 19136824) == 0) { // L: 224 225 226 227
				class194.bufferX[var18] = var4 - 1; // L: 228
				class194.bufferY[var18] = var5; // L: 229
				var18 = var18 + 1 & 4095; // L: 230
				class194.directions[var16 - 1][var17] = 2; // L: 231
				class194.distances[var16 - 1][var17] = var15; // L: 232
			}

			if (var16 < 126 && class194.directions[var16 + 1][var17] == 0 && (var12[var13 + 2][var14] & 19136899) == 0 && (var12[var13 + 2][var14 + 1] & 19136992) == 0) { // L: 234 235 236 237
				class194.bufferX[var18] = var4 + 1; // L: 238
				class194.bufferY[var18] = var5; // L: 239
				var18 = var18 + 1 & 4095; // L: 240
				class194.directions[var16 + 1][var17] = 8; // L: 241
				class194.distances[var16 + 1][var17] = var15; // L: 242
			}

			if (var17 > 0 && class194.directions[var16][var17 - 1] == 0 && (var12[var13][var14 - 1] & 19136782) == 0 && (var12[var13 + 1][var14 - 1] & 19136899) == 0) { // L: 244 245 246 247
				class194.bufferX[var18] = var4; // L: 248
				class194.bufferY[var18] = var5 - 1; // L: 249
				var18 = var18 + 1 & 4095; // L: 250
				class194.directions[var16][var17 - 1] = 1; // L: 251
				class194.distances[var16][var17 - 1] = var15; // L: 252
			}

			if (var17 < 126 && class194.directions[var16][var17 + 1] == 0 && (var12[var13][var14 + 2] & 19136824) == 0 && (var12[var13 + 1][var14 + 2] & 19136992) == 0) { // L: 254 255 256 257
				class194.bufferX[var18] = var4; // L: 258
				class194.bufferY[var18] = var5 + 1; // L: 259
				var18 = var18 + 1 & 4095; // L: 260
				class194.directions[var16][var17 + 1] = 4; // L: 261
				class194.distances[var16][var17 + 1] = var15; // L: 262
			}

			if (var16 > 0 && var17 > 0 && class194.directions[var16 - 1][var17 - 1] == 0 && (var12[var13 - 1][var14] & 19136830) == 0 && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13][var14 - 1] & 19136911) == 0) { // L: 264 265 266 267 268
				class194.bufferX[var18] = var4 - 1; // L: 269
				class194.bufferY[var18] = var5 - 1; // L: 270
				var18 = var18 + 1 & 4095; // L: 271
				class194.directions[var16 - 1][var17 - 1] = 3; // L: 272
				class194.distances[var16 - 1][var17 - 1] = var15; // L: 273
			}

			if (var16 < 126 && var17 > 0 && class194.directions[var16 + 1][var17 - 1] == 0 && (var12[var13 + 1][var14 - 1] & 19136911) == 0 && (var12[var13 + 2][var14 - 1] & 19136899) == 0 && (var12[var13 + 2][var14] & 19136995) == 0) { // L: 275 276 277 278 279
				class194.bufferX[var18] = var4 + 1; // L: 280
				class194.bufferY[var18] = var5 - 1; // L: 281
				var18 = var18 + 1 & 4095; // L: 282
				class194.directions[var16 + 1][var17 - 1] = 9; // L: 283
				class194.distances[var16 + 1][var17 - 1] = var15; // L: 284
			}

			if (var16 > 0 && var17 < 126 && class194.directions[var16 - 1][var17 + 1] == 0 && (var12[var13 - 1][var14 + 1] & 19136830) == 0 && (var12[var13 - 1][var14 + 2] & 19136824) == 0 && (var12[var13][var14 + 2] & 19137016) == 0) { // L: 286 287 288 289 290
				class194.bufferX[var18] = var4 - 1; // L: 291
				class194.bufferY[var18] = var5 + 1; // L: 292
				var18 = var18 + 1 & 4095; // L: 293
				class194.directions[var16 - 1][var17 + 1] = 6; // L: 294
				class194.distances[var16 - 1][var17 + 1] = var15; // L: 295
			}

			if (var16 < 126 && var17 < 126 && class194.directions[var16 + 1][var17 + 1] == 0 && (var12[var13 + 1][var14 + 2] & 19137016) == 0 && (var12[var13 + 2][var14 + 2] & 19136992) == 0 && (var12[var13 + 2][var14 + 1] & 19136995) == 0) { // L: 297 298 299 300 301
				class194.bufferX[var18] = var4 + 1; // L: 302
				class194.bufferY[var18] = var5 + 1; // L: 303
				var18 = var18 + 1 & 4095; // L: 304
				class194.directions[var16 + 1][var17 + 1] = 12; // L: 305
				class194.distances[var16 + 1][var17 + 1] = var15; // L: 306
			}
		}

		VarpDefinition.field1819 = var4; // L: 309
		class194.field2202 = var5; // L: 310
		return false; // L: 311
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1112634096"
	)
	public static void method3040() {
		HitSplatDefinition.HitSplatDefinition_cached.clear(); // L: 171
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear(); // L: 172
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear(); // L: 173
	} // L: 174

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILkn;IIIII[FB)Lkn;",
		garbageValue = "125"
	)
	static Widget method3043(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
		Widget var8 = new Widget(); // L: 897
		var8.type = var0; // L: 898
		var8.parentId = var1.id; // L: 899
		var8.childIndex = var2; // L: 900
		var8.isIf3 = true; // L: 901
		var8.xAlignment = var3; // L: 902
		var8.yAlignment = var4; // L: 903
		var8.widthAlignment = var5; // L: 904
		var8.heightAlignment = var6; // L: 905
		var8.rawX = (int)((float)var1.width * var7[0]); // L: 906
		var8.rawY = (int)(var7[1] * (float)var1.height); // L: 907
		var8.rawWidth = (int)(var7[2] * (float)var1.width); // L: 908
		var8.rawHeight = (int)((float)var1.height * var7[3]); // L: 909
		return var8; // L: 910
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(ZLpy;I)V",
		garbageValue = "1921667201"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0; // L: 5076
		int var2;
		int var3;
		int var5;
		int var6;
		int var7;
		int var8;
		if (!Client.isInInstance) { // L: 5077
			var2 = var1.method7935(); // L: 5078
			var3 = var1.method7935(); // L: 5079
			int var4 = var1.readUnsignedShort(); // L: 5080
			Message.xteaKeys = new int[var4][4]; // L: 5081

			for (var5 = 0; var5 < var4; ++var5) { // L: 5082
				for (var6 = 0; var6 < 4; ++var6) { // L: 5083
					Message.xteaKeys[var5][var6] = var1.readInt(); // L: 5084
				}
			}

			class123.regions = new int[var4]; // L: 5087
			ObjectComposition.regionMapArchiveIds = new int[var4]; // L: 5088
			Message.regionLandArchiveIds = new int[var4]; // L: 5089
			WorldMapSectionType.regionLandArchives = new byte[var4][]; // L: 5090
			Occluder.regionMapArchives = new byte[var4][]; // L: 5091
			boolean var16 = false; // L: 5092
			if (Client.field753) { // L: 5093
				if ((var2 / 8 == 48 || var2 / 8 == 49) && var3 / 8 == 48) { // L: 5094
					var16 = true;
				}

				if (var2 / 8 == 48 && var3 / 8 == 148) { // L: 5095
					var16 = true;
				}
			}

			var4 = 0; // L: 5097

			for (var6 = (var2 - 6) / 8; var6 <= (var2 + 6) / 8; ++var6) { // L: 5098
				for (var7 = (var3 - 6) / 8; var7 <= (var3 + 6) / 8; ++var7) { // L: 5099
					var8 = var7 + (var6 << 8); // L: 5100
					if (!var16 || var7 != 49 && var7 != 149 && var7 != 147 && var6 != 50 && (var6 != 49 || var7 != 47)) { // L: 5101
						class123.regions[var4] = var8; // L: 5102
						ObjectComposition.regionMapArchiveIds[var4] = class302.archive5.getGroupId("m" + var6 + "_" + var7); // L: 5103
						Message.regionLandArchiveIds[var4] = class302.archive5.getGroupId("l" + var6 + "_" + var7); // L: 5104
						++var4; // L: 5105
					}
				}
			}

			class321.method6030(var2, var3, true); // L: 5108
		} else {
			var2 = var1.method7971(); // L: 5111
			var3 = var1.method7798(); // L: 5112
			boolean var15 = var1.readUnsignedByte() == 1; // L: 5113
			var5 = var1.readUnsignedShort(); // L: 5114
			var1.importIndex(); // L: 5115

			int var9;
			for (var6 = 0; var6 < 4; ++var6) { // L: 5116
				for (var7 = 0; var7 < 13; ++var7) { // L: 5117
					for (var8 = 0; var8 < 13; ++var8) { // L: 5118
						var9 = var1.readBits(1); // L: 5119
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26); // L: 5120
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1; // L: 5121
						}
					}
				}
			}

			var1.exportIndex(); // L: 5125
			Message.xteaKeys = new int[var5][4]; // L: 5126

			for (var6 = 0; var6 < var5; ++var6) { // L: 5127
				for (var7 = 0; var7 < 4; ++var7) { // L: 5128
					Message.xteaKeys[var6][var7] = var1.readInt(); // L: 5129
				}
			}

			class123.regions = new int[var5]; // L: 5132
			ObjectComposition.regionMapArchiveIds = new int[var5]; // L: 5133
			Message.regionLandArchiveIds = new int[var5]; // L: 5134
			WorldMapSectionType.regionLandArchives = new byte[var5][]; // L: 5135
			Occluder.regionMapArchives = new byte[var5][]; // L: 5136
			var5 = 0; // L: 5137

			for (var6 = 0; var6 < 4; ++var6) { // L: 5138
				for (var7 = 0; var7 < 13; ++var7) { // L: 5139
					for (var8 = 0; var8 < 13; ++var8) { // L: 5140
						var9 = Client.instanceChunkTemplates[var6][var7][var8]; // L: 5141
						if (var9 != -1) { // L: 5142
							int var10 = var9 >> 14 & 1023; // L: 5143
							int var11 = var9 >> 3 & 2047; // L: 5144
							int var12 = (var10 / 8 << 8) + var11 / 8; // L: 5145

							int var13;
							for (var13 = 0; var13 < var5; ++var13) { // L: 5146
								if (class123.regions[var13] == var12) {
									var12 = -1; // L: 5147
									break; // L: 5148
								}
							}

							if (var12 != -1) { // L: 5150
								class123.regions[var5] = var12; // L: 5151
								var13 = var12 >> 8 & 255; // L: 5152
								int var14 = var12 & 255; // L: 5153
								ObjectComposition.regionMapArchiveIds[var5] = class302.archive5.getGroupId("m" + var13 + "_" + var14); // L: 5154
								Message.regionLandArchiveIds[var5] = class302.archive5.getGroupId("l" + var13 + "_" + var14); // L: 5155
								++var5; // L: 5156
							}
						}
					}
				}
			}

			class321.method6030(var3, var2, !var15); // L: 5162
		}

	} // L: 5164
}
