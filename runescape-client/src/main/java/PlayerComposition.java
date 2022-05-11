import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kp")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("c")
	public static short[][] field3366;
	@ObfuscatedName("w")
	@Export("equipmentIndices")
	static final int[] equipmentIndices;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("PlayerAppearance_cachedModels")
	public static EvictingDualNodeHashTable PlayerAppearance_cachedModels;
	@ObfuscatedName("o")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("q")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("l")
	@Export("isFemale")
	public boolean isFemale;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 92752325
	)
	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		longValue = -7782152714703146163L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		longValue = -9099438919226183133L
	)
	long field3368;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "[Lfn;"
	)
	class168[] field3364;
	@ObfuscatedName("s")
	boolean field3365;

	static {
		equipmentIndices = new int[]{8, 11, 4, 6, 9, 7, 10}; // L: 26
		PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(260); // L: 27
	}

	public PlayerComposition() {
		this.field3365 = false; // L: 21
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([I[Lfn;Z[IZII)V",
		garbageValue = "2036477706"
	)
	public void method5395(int[] var1, class168[] var2, boolean var3, int[] var4, boolean var5, int var6) {
		this.field3364 = var2; // L: 30
		this.field3365 = var3; // L: 31
		this.update(var1, var4, var5, var6); // L: 32
	} // L: 33

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "([I[IZII)V",
		garbageValue = "-1891855467"
	)
	@Export("update")
	public void update(int[] var1, int[] var2, boolean var3, int var4) {
		if (var1 == null) { // L: 36
			var1 = new int[12]; // L: 37

			for (int var5 = 0; var5 < 7; ++var5) { // L: 38
				for (int var6 = 0; var6 < class147.KitDefinition_fileCount; ++var6) { // L: 39
					KitDefinition var7 = Script.KitDefinition_get(var6); // L: 40
					if (var7 != null && !var7.nonSelectable && var7.bodypartID == var5 + (var3 ? 7 : 0)) { // L: 41
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "983810736"
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
							var3 = class147.KitDefinition_fileCount - 1;
						}
					} else {
						++var3; // L: 66
						if (var3 >= class147.KitDefinition_fileCount) { // L: 67
							var3 = 0;
						}
					}

					var4 = Script.KitDefinition_get(var3); // L: 69
				} while(var4 == null || var4.nonSelectable || (this.isFemale ? 7 : 0) + var1 != var4.bodypartID); // L: 70

				this.equipment[equipmentIndices[var1]] = var3 + 256; // L: 72
				this.setHash(); // L: 73
			}
		}
	} // L: 74

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-2104748199"
	)
	public void method5394(int var1, boolean var2) {
		int var3 = this.bodyColors[var1]; // L: 77
		boolean var4;
		if (!var2) { // L: 78
			do {
				--var3;
				if (var3 < 0) {
					var3 = DesktopPlatformInfoProvider.field4469[var1].length - 1;
				}

				if (var1 == 4 && var3 >= 8) {
					var4 = false; // L: 87
				} else {
					var4 = true;
				}
			} while(!var4); // L: 92
		} else {
			do {
				++var3; // L: 97
				if (var3 >= DesktopPlatformInfoProvider.field4469[var1].length) { // L: 98
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

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "108"
	)
	@Export("changeSex")
	public void changeSex(boolean var1) {
		if (this.isFemale != var1) { // L: 115
			this.update((int[])null, this.bodyColors, var1, -1); // L: 116
		}
	} // L: 117

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "1160486905"
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "28"
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
		if (var1 != 0L && var1 != this.hash || this.field3365) { // L: 150
			PlayerAppearance_cachedModels.remove(var1);
		}

	} // L: 151

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lgq;ILgq;IB)Lhv;",
		garbageValue = "-45"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) { // L: 154
			return WorldMapSectionType.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4); // L: 155
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
					if (var11 >= 256 && var11 < 512 && !Script.KitDefinition_get(var11 - 256).ready()) { // L: 176 177
						var9 = true;
					}

					if (var11 >= 512 && !FileSystem.ItemDefinition_get(var11 - 512).hasNoValidModel(this.isFemale)) { // L: 179 180
						var9 = true;
					}
				}

				if (var9) { // L: 183
					if (this.field3368 != -1L) { // L: 184
						var18 = (Model)PlayerAppearance_cachedModels.get(this.field3368);
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
							ModelData var14 = Script.KitDefinition_get(var13 - 256).getModelData(); // L: 193
							if (var14 != null) { // L: 194
								var19[var11++] = var14;
							}
						}

						if (var13 >= 512) { // L: 196
							ItemComposition var22 = FileSystem.ItemDefinition_get(var13 - 512); // L: 197
							ModelData var15 = var22.method3630(this.isFemale); // L: 198
							if (var15 != null) { // L: 199
								if (this.field3364 != null) { // L: 200
									class168 var16 = this.field3364[var12]; // L: 201
									if (var16 != null) { // L: 202
										int var17;
										if (var16.field1847 != null && var22.recolorFrom != null && var22.recolorTo.length == var16.field1847.length) { // L: 203
											for (var17 = 0; var17 < var22.recolorFrom.length; ++var17) { // L: 204
												var15.recolor(var22.recolorTo[var17], var16.field1847[var17]); // L: 205
											}
										}

										if (var16.field1844 != null && var22.retextureFrom != null && var16.field1844.length == var22.retextureTo.length) { // L: 208
											for (var17 = 0; var17 < var22.retextureFrom.length; ++var17) { // L: 209
												var15.retexture(var22.retextureTo[var17], var16.field1844[var17]); // L: 210
											}
										}
									}
								}

								var19[var11++] = var15; // L: 215
							}
						}
					}

					ModelData var20 = new ModelData(var19, var11); // L: 219

					for (var13 = 0; var13 < 5; ++var13) { // L: 220
						if (this.bodyColors[var13] < DesktopPlatformInfoProvider.field4469[var13].length) { // L: 221
							var20.recolor(Coord.field3352[var13], DesktopPlatformInfoProvider.field4469[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < field3366[var13].length) { // L: 222
							var20.recolor(class340.field4156[var13], field3366[var13][this.bodyColors[var13]]);
						}
					}

					var18 = var20.toModel(64, 850, -30, -50, -30); // L: 224
					PlayerAppearance_cachedModels.put(var18, var5); // L: 225
					this.field3368 = var5; // L: 226
				}
			}

			if (var1 == null && var3 == null) { // L: 230
				return var18;
			} else {
				Model var21;
				if (var1 != null && var3 != null) { // L: 231
					var21 = var1.applyTransformations(var18, var2, var3, var4);
				} else if (var1 != null) { // L: 232
					var21 = var1.transformActorModel(var18, var2);
				} else {
					var21 = var3.transformActorModel(var18, var4); // L: 233
				}

				return var21; // L: 234
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)Lgs;",
		garbageValue = "-25"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) { // L: 238
			return WorldMapSectionType.getNpcDefinition(this.npcTransformId).getModelData(); // L: 239
		} else {
			boolean var1 = false; // L: 241

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) { // L: 242
				var3 = this.equipment[var2]; // L: 243
				if (var3 >= 256 && var3 < 512 && !Script.KitDefinition_get(var3 - 256).method3335()) { // L: 244 245
					var1 = true;
				}

				if (var3 >= 512 && !FileSystem.ItemDefinition_get(var3 - 512).method3631(this.isFemale)) { // L: 247 248
					var1 = true;
				}
			}

			if (var1) { // L: 251
				return null;
			} else {
				ModelData[] var7 = new ModelData[12]; // L: 252
				var3 = 0; // L: 253

				int var5;
				for (int var4 = 0; var4 < 12; ++var4) { // L: 254
					var5 = this.equipment[var4]; // L: 255
					ModelData var6;
					if (var5 >= 256 && var5 < 512) { // L: 256
						var6 = Script.KitDefinition_get(var5 - 256).getKitDefinitionModels(); // L: 257
						if (var6 != null) { // L: 258
							var7[var3++] = var6;
						}
					}

					if (var5 >= 512) { // L: 260
						var6 = FileSystem.ItemDefinition_get(var5 - 512).method3632(this.isFemale); // L: 261
						if (var6 != null) { // L: 262
							var7[var3++] = var6;
						}
					}
				}

				ModelData var8 = new ModelData(var7, var3); // L: 265

				for (var5 = 0; var5 < 5; ++var5) { // L: 266
					if (this.bodyColors[var5] < DesktopPlatformInfoProvider.field4469[var5].length) { // L: 267
						var8.recolor(Coord.field3352[var5], DesktopPlatformInfoProvider.field4469[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < field3366[var5].length) { // L: 268
						var8.recolor(class340.field4156[var5], field3366[var5][this.bodyColors[var5]]);
					}
				}

				return var8; // L: 270
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "695614719"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		return this.npcTransformId == -1 ? (this.equipment[0] << 15) + this.equipment[1] + (this.equipment[11] << 5) + (this.equipment[8] << 10) + (this.bodyColors[0] << 25) + (this.bodyColors[4] << 20) : 305419896 + WorldMapSectionType.getNpcDefinition(this.npcTransformId).id; // L: 274 275
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-10"
	)
	static final void method5408(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) { // L: 79
			for (int var5 = var0; var5 <= var0 + var2; ++var5) { // L: 80
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) { // L: 81
					NPC.field1259[0][var5][var4] = 127; // L: 82
					if (var0 == var5 && var5 > 0) { // L: 83
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}

					if (var5 == var0 + var2 && var5 < 103) { // L: 84
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
					}

					if (var4 == var1 && var4 > 0) { // L: 85
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}

					if (var3 + var1 == var4 && var4 < 103) { // L: 86
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}

	} // L: 90
}
