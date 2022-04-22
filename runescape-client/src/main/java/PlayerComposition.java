import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kp")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("q")
	public static short[] field3304;
	@ObfuscatedName("w")
	@Export("equipmentIndices")
	static final int[] equipmentIndices;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("PlayerAppearance_cachedModels")
	public static EvictingDualNodeHashTable PlayerAppearance_cachedModels;
	@ObfuscatedName("hk")
	@ObfuscatedGetter(
		intValue = -468225065
	)
	static int field3307;
	@ObfuscatedName("v")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("c")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("i")
	@Export("isFemale")
	public boolean isFemale;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1661729967
	)
	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		longValue = -2450730779169477887L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		longValue = -5318511275487729225L
	)
	long field3301;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "[Lfj;"
	)
	class168[] field3302;
	@ObfuscatedName("l")
	boolean field3306;

	static {
		equipmentIndices = new int[]{8, 11, 4, 6, 9, 7, 10}; // L: 26
		PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(260); // L: 27
	}

	public PlayerComposition() {
		this.field3306 = false; // L: 21
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([I[Lfj;Z[IZII)V",
		garbageValue = "-299741271"
	)
	public void method5570(int[] var1, class168[] var2, boolean var3, int[] var4, boolean var5, int var6) {
		this.field3302 = var2; // L: 30
		this.field3306 = var3; // L: 31
		this.update(var1, var4, var5, var6); // L: 32
	} // L: 33

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([I[IZII)V",
		garbageValue = "-1061020993"
	)
	@Export("update")
	public void update(int[] var1, int[] var2, boolean var3, int var4) {
		if (var1 == null) { // L: 36
			var1 = new int[12]; // L: 37

			for (int var5 = 0; var5 < 7; ++var5) { // L: 38
				for (int var6 = 0; var6 < KitDefinition.KitDefinition_fileCount; ++var6) { // L: 39
					KitDefinition var7 = WorldMapLabel.KitDefinition_get(var6); // L: 40
					if (var7 != null && !var7.nonSelectable && var5 + (var3 ? 7 : 0) == var7.bodypartID) { // L: 41
						var1[equipmentIndices[var5]] = var6 + 256; // L: 42
						break; // L: 43
					}
				}
			}
		}

		this.equipment = var1; // L: 48
		this.bodyColors = var2; // L: 49
		this.isFemale = var3; // L: 50
		this.npcTransformId = var4; // L: 51
		this.setHash(); // L: 52
	} // L: 53

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "771015122"
	)
	@Export("changeAppearance")
	public void changeAppearance(int var1, boolean var2) {
		if (var1 != 1 || !this.isFemale) { // L: 56
			int var3 = this.equipment[equipmentIndices[var1]]; // L: 57
			if (var3 != 0) { // L: 58
				var3 -= 256; // L: 59

				KitDefinition var4;
				do {
					if (!var2) { // L: 61
						--var3; // L: 62
						if (var3 < 0) { // L: 63
							var3 = KitDefinition.KitDefinition_fileCount - 1;
						}
					} else {
						++var3; // L: 66
						if (var3 >= KitDefinition.KitDefinition_fileCount) { // L: 67
							var3 = 0;
						}
					}

					var4 = WorldMapLabel.KitDefinition_get(var3); // L: 69
				} while(var4 == null || var4.nonSelectable || var4.bodypartID != (this.isFemale ? 7 : 0) + var1); // L: 70

				this.equipment[equipmentIndices[var1]] = var3 + 256; // L: 72
				this.setHash(); // L: 73
			}
		}
	} // L: 74

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-730659334"
	)
	public void method5594(int var1, boolean var2) {
		int var3 = this.bodyColors[var1]; // L: 77
		boolean var4;
		if (!var2) { // L: 78
			do {
				--var3; // L: 80
				if (var3 < 0) { // L: 81
					var3 = class144.field1629[var1].length - 1; // L: 82
				}

				if (var1 == 4 && var3 >= 8) { // L: 86
					var4 = false; // L: 87
				} else {
					var4 = true; // L: 90
				}
			} while(!var4); // L: 92
		} else {
			do {
				++var3; // L: 97
				if (var3 >= class144.field1629[var1].length) { // L: 98
					var3 = 0;
				}

				if (var1 == 4 && var3 >= 8) { // L: 101
					var4 = false; // L: 102
				} else {
					var4 = true; // L: 105
				}
			} while(!var4); // L: 107
		}

		this.bodyColors[var1] = var3; // L: 110
		this.setHash(); // L: 111
	} // L: 112

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "23"
	)
	@Export("changeSex")
	public void changeSex(boolean var1) {
		if (this.isFemale != var1) { // L: 115
			this.update((int[])null, this.bodyColors, var1, -1); // L: 116
		}
	} // L: 117

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "103"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(this.isFemale ? 1 : 0); // L: 120

		int var2;
		for (var2 = 0; var2 < 7; ++var2) { // L: 121
			int var3 = this.equipment[equipmentIndices[var2]]; // L: 122
			if (var3 == 0) { // L: 123
				var1.writeByte(-1);
			} else {
				var1.writeByte(var3 - 256); // L: 124
			}
		}

		for (var2 = 0; var2 < 5; ++var2) { // L: 126
			var1.writeByte(this.bodyColors[var2]);
		}

	} // L: 127

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "720689587"
	)
	@Export("setHash")
	void setHash() {
		long var1 = this.hash; // L: 130
		int var3 = this.equipment[5]; // L: 131
		int var4 = this.equipment[9]; // L: 132
		this.equipment[5] = var4; // L: 133
		this.equipment[9] = var3; // L: 134
		this.hash = 0L; // L: 135

		int var5;
		for (var5 = 0; var5 < 12; ++var5) { // L: 136
			this.hash <<= 4; // L: 137
			if (this.equipment[var5] >= 256) { // L: 138
				this.hash += (long)(this.equipment[var5] - 256);
			}
		}

		if (this.equipment[0] >= 256) { // L: 140
			this.hash += (long)(this.equipment[0] - 256 >> 4);
		}

		if (this.equipment[1] >= 256) { // L: 141
			this.hash += (long)(this.equipment[1] - 256 >> 8);
		}

		for (var5 = 0; var5 < 5; ++var5) { // L: 142
			this.hash <<= 3; // L: 143
			this.hash += (long)this.bodyColors[var5]; // L: 144
		}

		this.hash <<= 1; // L: 146
		this.hash += (long)(this.isFemale ? 1 : 0); // L: 147
		this.equipment[5] = var3; // L: 148
		this.equipment[9] = var4; // L: 149
		if (0L != var1 && var1 != this.hash || this.field3306) { // L: 150
			PlayerAppearance_cachedModels.remove(var1);
		}

	} // L: 151

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lgw;ILgw;II)Liq;",
		garbageValue = "2065643699"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) { // L: 154
			return KeyHandler.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4); // L: 155
		} else {
			long var5 = this.hash; // L: 157
			int[] var7 = this.equipment; // L: 158
			if (var1 != null && (var1.shield >= 0 || var1.weapon >= 0)) { // L: 159
				var7 = new int[12]; // L: 160

				for (int var8 = 0; var8 < 12; ++var8) { // L: 161
					var7[var8] = this.equipment[var8];
				}

				if (var1.shield >= 0) { // L: 162
					var5 += (long)(var1.shield - this.equipment[5] << 40); // L: 163
					var7[5] = var1.shield; // L: 164
				}

				if (var1.weapon >= 0) { // L: 166
					var5 += (long)(var1.weapon - this.equipment[3] << 48); // L: 167
					var7[3] = var1.weapon; // L: 168
				}
			}

			Model var18 = (Model)PlayerAppearance_cachedModels.get(var5); // L: 171
			if (var18 == null) { // L: 172
				boolean var9 = false; // L: 173

				int var11;
				for (int var10 = 0; var10 < 12; ++var10) { // L: 174
					var11 = var7[var10]; // L: 175
					if (var11 >= 256 && var11 < 512 && !WorldMapLabel.KitDefinition_get(var11 - 256).ready()) { // L: 176 177
						var9 = true;
					}

					if (var11 >= 512 && !class19.ItemDefinition_get(var11 - 512).hasNoValidModel(this.isFemale)) { // L: 179 180
						var9 = true;
					}
				}

				if (var9) { // L: 183
					if (this.field3301 != -1L) { // L: 184
						var18 = (Model)PlayerAppearance_cachedModels.get(this.field3301);
					}

					if (var18 == null) { // L: 185
						return null;
					}
				}

				if (var18 == null) { // L: 187
					ModelData[] var19 = new ModelData[12]; // L: 188
					var11 = 0; // L: 189

					int var13;
					for (int var12 = 0; var12 < 12; ++var12) { // L: 190
						var13 = var7[var12]; // L: 191
						if (var13 >= 256 && var13 < 512) { // L: 192
							ModelData var14 = WorldMapLabel.KitDefinition_get(var13 - 256).getModelData(); // L: 193
							if (var14 != null) { // L: 194
								var19[var11++] = var14;
							}
						}

						if (var13 >= 512) { // L: 196
							ItemComposition var22 = class19.ItemDefinition_get(var13 - 512);
							ModelData var15 = var22.method3719(this.isFemale);
							if (var15 != null) {
								if (this.field3302 != null) {
									class168 var16 = this.field3302[var12];
									if (var16 != null) {
										int var17;
										if (var16.field1791 != null && var22.recolorFrom != null && var16.field1791.length == var22.recolorTo.length) {
											for (var17 = 0; var17 < var22.recolorFrom.length; ++var17) {
												var15.recolor(var22.recolorTo[var17], var16.field1791[var17]); // L: 205
											}
										}

										if (var16.field1790 != null && var22.retextureFrom != null && var22.retextureTo.length == var16.field1790.length) {
											for (var17 = 0; var17 < var22.retextureFrom.length; ++var17) {
												var15.retexture(var22.retextureTo[var17], var16.field1790[var17]);
											}
										}
									}
								}

								var19[var11++] = var15;
							}
						}
					}

					ModelData var20 = new ModelData(var19, var11);

					for (var13 = 0; var13 < 5; ++var13) {
						if (this.bodyColors[var13] < class144.field1629[var13].length) {
							var20.recolor(field3304[var13], class144.field1629[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < WorldMapRectangle.field2356[var13].length) { // L: 222
							var20.recolor(WorldMapIcon_0.field2300[var13], WorldMapRectangle.field2356[var13][this.bodyColors[var13]]);
						}
					}

					var18 = var20.toModel(64, 850, -30, -50, -30);
					PlayerAppearance_cachedModels.put(var18, var5);
					this.field3301 = var5;
				}
			}

			if (var1 == null && var3 == null) {
				return var18;
			} else {
				Model var21;
				if (var1 != null && var3 != null) {
					var21 = var1.applyTransformations(var18, var2, var3, var4);
				} else if (var1 != null) {
					var21 = var1.transformActorModel(var18, var2);
				} else {
					var21 = var3.transformActorModel(var18, var4); // L: 233
				}

				return var21;
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Lhc;",
		garbageValue = "-801308505"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) { // L: 238
			return KeyHandler.getNpcDefinition(this.npcTransformId).getModelData();
		} else {
			boolean var1 = false;

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) { // L: 242
				var3 = this.equipment[var2];
				if (var3 >= 256 && var3 < 512 && !WorldMapLabel.KitDefinition_get(var3 - 256).method3447()) {
					var1 = true;
				}

				if (var3 >= 512 && !class19.ItemDefinition_get(var3 - 512).method3723(this.isFemale)) { // L: 247 248
					var1 = true;
				}
			}

			if (var1) { // L: 251
				return null;
			} else {
				ModelData[] var7 = new ModelData[12];
				var3 = 0; // L: 253

				int var5;
				for (int var4 = 0; var4 < 12; ++var4) {
					var5 = this.equipment[var4];
					ModelData var6;
					if (var5 >= 256 && var5 < 512) {
						var6 = WorldMapLabel.KitDefinition_get(var5 - 256).getKitDefinitionModels();
						if (var6 != null) {
							var7[var3++] = var6;
						}
					}

					if (var5 >= 512) {
						var6 = class19.ItemDefinition_get(var5 - 512).method3718(this.isFemale); // L: 261
						if (var6 != null) {
							var7[var3++] = var6;
						}
					}
				}

				ModelData var8 = new ModelData(var7, var3); // L: 265

				for (var5 = 0; var5 < 5; ++var5) {
					if (this.bodyColors[var5] < class144.field1629[var5].length) {
						var8.recolor(field3304[var5], class144.field1629[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < WorldMapRectangle.field2356[var5].length) {
						var8.recolor(WorldMapIcon_0.field2300[var5], WorldMapRectangle.field2356[var5][this.bodyColors[var5]]);
					}
				}

				return var8; // L: 270
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1675843128"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		return this.npcTransformId == -1 ? (this.equipment[0] << 15) + this.equipment[1] + (this.equipment[11] << 5) + (this.equipment[8] << 10) + (this.bodyColors[0] << 25) + (this.bodyColors[4] << 20) : 305419896 + KeyHandler.getNpcDefinition(this.npcTransformId).id; // L: 274
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lpz;II)V",
		garbageValue = "1476146212"
	)
	@Export("readPlayerUpdate")
	static void readPlayerUpdate(PacketBuffer var0, int var1) {
		boolean var2 = var0.readBits(1) == 1; // L: 197
		if (var2) { // L: 198
			Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
		}

		int var3 = var0.readBits(2); // L: 199
		Player var4 = Client.players[var1]; // L: 200
		if (var3 == 0) { // L: 201
			if (var2) { // L: 202
				var4.field1070 = false; // L: 203
			} else if (Client.localPlayerIndex == var1) { // L: 206
				throw new RuntimeException();
			} else {
				Players.Players_regions[var1] = (var4.plane << 28) + (GrandExchangeOfferOwnWorldComparator.baseX + var4.pathX[0] >> 13 << 14) + (VarcInt.baseY + var4.pathY[0] >> 13); // L: 207
				if (var4.field1121 != -1) { // L: 208
					Players.Players_orientations[var1] = var4.field1121;
				} else {
					Players.Players_orientations[var1] = var4.orientation; // L: 209
				}

				Players.Players_targetIndices[var1] = var4.targetIndex; // L: 210
				Client.players[var1] = null; // L: 211
				if (var0.readBits(1) != 0) { // L: 212
					class175.updateExternalPlayer(var0, var1);
				}

			}
		} else {
			int var5;
			int var6;
			int var7;
			if (var3 == 1) { // L: 215
				var5 = var0.readBits(3); // L: 216
				var6 = var4.pathX[0]; // L: 217
				var7 = var4.pathY[0]; // L: 218
				if (var5 == 0) { // L: 219
					--var6; // L: 220
					--var7; // L: 221
				} else if (var5 == 1) { // L: 223
					--var7;
				} else if (var5 == 2) { // L: 224
					++var6; // L: 225
					--var7; // L: 226
				} else if (var5 == 3) { // L: 228
					--var6;
				} else if (var5 == 4) { // L: 229
					++var6;
				} else if (var5 == 5) { // L: 230
					--var6; // L: 231
					++var7; // L: 232
				} else if (var5 == 6) { // L: 234
					++var7;
				} else if (var5 == 7) { // L: 235
					++var6; // L: 236
					++var7; // L: 237
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 239
					var4.resetPath(var6, var7); // L: 240
					var4.field1070 = false; // L: 241
				} else if (var2) { // L: 243
					var4.field1070 = true; // L: 244
					var4.tileX = var6; // L: 245
					var4.tileY = var7; // L: 246
				} else {
					var4.field1070 = false; // L: 249
					var4.method2125(var6, var7, Players.field1286[var1]); // L: 250
				}

			} else if (var3 == 2) { // L: 254
				var5 = var0.readBits(4); // L: 255
				var6 = var4.pathX[0]; // L: 256
				var7 = var4.pathY[0]; // L: 257
				if (var5 == 0) { // L: 258
					var6 -= 2; // L: 259
					var7 -= 2; // L: 260
				} else if (var5 == 1) { // L: 262
					--var6; // L: 263
					var7 -= 2; // L: 264
				} else if (var5 == 2) { // L: 266
					var7 -= 2;
				} else if (var5 == 3) { // L: 267
					++var6; // L: 268
					var7 -= 2; // L: 269
				} else if (var5 == 4) { // L: 271
					var6 += 2; // L: 272
					var7 -= 2; // L: 273
				} else if (var5 == 5) { // L: 275
					var6 -= 2; // L: 276
					--var7; // L: 277
				} else if (var5 == 6) { // L: 279
					var6 += 2; // L: 280
					--var7; // L: 281
				} else if (var5 == 7) { // L: 283
					var6 -= 2;
				} else if (var5 == 8) { // L: 284
					var6 += 2;
				} else if (var5 == 9) { // L: 285
					var6 -= 2; // L: 286
					++var7; // L: 287
				} else if (var5 == 10) { // L: 289
					var6 += 2; // L: 290
					++var7; // L: 291
				} else if (var5 == 11) { // L: 293
					var6 -= 2; // L: 294
					var7 += 2; // L: 295
				} else if (var5 == 12) { // L: 297
					--var6; // L: 298
					var7 += 2; // L: 299
				} else if (var5 == 13) { // L: 301
					var7 += 2;
				} else if (var5 == 14) { // L: 302
					++var6; // L: 303
					var7 += 2; // L: 304
				} else if (var5 == 15) { // L: 306
					var6 += 2; // L: 307
					var7 += 2; // L: 308
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 310
					var4.resetPath(var6, var7); // L: 311
					var4.field1070 = false; // L: 312
				} else if (var2) { // L: 314
					var4.field1070 = true; // L: 315
					var4.tileX = var6; // L: 316
					var4.tileY = var7; // L: 317
				} else {
					var4.field1070 = false; // L: 320
					var4.method2125(var6, var7, Players.field1286[var1]); // L: 321
				}

			} else {
				var5 = var0.readBits(1); // L: 325
				int var8;
				int var9;
				int var10;
				int var11;
				if (var5 == 0) { // L: 326
					var6 = var0.readBits(12); // L: 327
					var7 = var6 >> 10; // L: 328
					var8 = var6 >> 5 & 31; // L: 329
					if (var8 > 15) { // L: 330
						var8 -= 32;
					}

					var9 = var6 & 31; // L: 331
					if (var9 > 15) { // L: 332
						var9 -= 32;
					}

					var10 = var8 + var4.pathX[0]; // L: 333
					var11 = var9 + var4.pathY[0]; // L: 334
					if (Client.localPlayerIndex != var1 || var4.x >= 1536 && var4.y >= 1536 && var4.x < 11776 && var4.y < 11776) { // L: 335
						if (var2) { // L: 339
							var4.field1070 = true; // L: 340
							var4.tileX = var10; // L: 341
							var4.tileY = var11; // L: 342
						} else {
							var4.field1070 = false; // L: 345
							var4.method2125(var10, var11, Players.field1286[var1]); // L: 346
						}
					} else {
						var4.resetPath(var10, var11); // L: 336
						var4.field1070 = false; // L: 337
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 348
					if (Client.localPlayerIndex == var1) { // L: 349
						class18.Client_plane = var4.plane;
					}

				} else {
					var6 = var0.readBits(30); // L: 352
					var7 = var6 >> 28; // L: 353
					var8 = var6 >> 14 & 16383; // L: 354
					var9 = var6 & 16383; // L: 355
					var10 = (var8 + GrandExchangeOfferOwnWorldComparator.baseX + var4.pathX[0] & 16383) - GrandExchangeOfferOwnWorldComparator.baseX; // L: 356
					var11 = (var9 + VarcInt.baseY + var4.pathY[0] & 16383) - VarcInt.baseY; // L: 357
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 358
						var4.resetPath(var10, var11); // L: 359
						var4.field1070 = false; // L: 360
					} else if (var2) { // L: 362
						var4.field1070 = true; // L: 363
						var4.tileX = var10; // L: 364
						var4.tileY = var11; // L: 365
					} else {
						var4.field1070 = false; // L: 368
						var4.method2125(var10, var11, Players.field1286[var1]); // L: 369
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 371
					if (Client.localPlayerIndex == var1) { // L: 372
						class18.Client_plane = var4.plane;
					}

				}
			}
		}
	} // L: 204 213 252 323 350 373
}
