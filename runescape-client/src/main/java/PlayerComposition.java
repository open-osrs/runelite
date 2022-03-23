import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kq")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("c")
	@Export("equipmentIndices")
	static final int[] equipmentIndices;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("PlayerAppearance_cachedModels")
	public static EvictingDualNodeHashTable PlayerAppearance_cachedModels;
	@ObfuscatedName("v")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("o")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("h")
	@Export("isFemale")
	public boolean isFemale;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -395260877
	)
	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		longValue = 7721446935219214103L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		longValue = -2621435945522732821L
	)
	long field3311;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "[Lff;"
	)
	class168[] field3312;
	@ObfuscatedName("f")
	boolean field3313;

	static {
		equipmentIndices = new int[]{8, 11, 4, 6, 9, 7, 10}; // L: 26
		PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(260); // L: 27
	}

	public PlayerComposition() {
		this.field3313 = false; // L: 21
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([I[Lff;Z[IZII)V",
		garbageValue = "1774075458"
	)
	public void method5604(int[] var1, class168[] var2, boolean var3, int[] var4, boolean var5, int var6) {
		this.field3312 = var2; // L: 30
		this.field3313 = var3; // L: 31
		this.update(var1, var4, var5, var6); // L: 32
	} // L: 33

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([I[IZII)V",
		garbageValue = "1014278237"
	)
	@Export("update")
	public void update(int[] var1, int[] var2, boolean var3, int var4) {
		if (var1 == null) { // L: 36
			var1 = new int[12]; // L: 37

			for (int var5 = 0; var5 < 7; ++var5) { // L: 38
				for (int var6 = 0; var6 < KitDefinition.KitDefinition_fileCount; ++var6) { // L: 39
					KitDefinition var7 = GrandExchangeOfferTotalQuantityComparator.KitDefinition_get(var6); // L: 40
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "1696348567"
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
						if (var3 >= KitDefinition.KitDefinition_fileCount) {
							var3 = 0; // L: 67
						}
					}

					var4 = GrandExchangeOfferTotalQuantityComparator.KitDefinition_get(var3); // L: 69
				} while(var4 == null || var4.nonSelectable || var4.bodypartID != (this.isFemale ? 7 : 0) + var1); // L: 70

				this.equipment[equipmentIndices[var1]] = var3 + 256; // L: 72
				this.setHash(); // L: 73
			}
		}
	} // L: 74

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "-42"
	)
	public void method5610(int var1, boolean var2) {
		int var3 = this.bodyColors[var1]; // L: 77
		if (!var2) { // L: 78
			do {
				--var3; // L: 80
				if (var3 < 0) { // L: 81
					var3 = class20.field102[var1].length - 1; // L: 82
				}
			} while(!Language.method6135(var1, var3)); // L: 84
		} else {
			do {
				++var3; // L: 89
				if (var3 >= class20.field102[var1].length) { // L: 90
					var3 = 0;
				}
			} while(!Language.method6135(var1, var3)); // L: 91
		}

		this.bodyColors[var1] = var3; // L: 94
		this.setHash(); // L: 95
	} // L: 96

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1464762664"
	)
	@Export("changeSex")
	public void changeSex(boolean var1) {
		if (this.isFemale != var1) { // L: 99
			this.update((int[])null, this.bodyColors, var1, -1); // L: 100
		}
	} // L: 101

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lpd;I)V",
		garbageValue = "-186862071"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(this.isFemale ? 1 : 0); // L: 104

		int var2;
		for (var2 = 0; var2 < 7; ++var2) { // L: 105
			int var3 = this.equipment[equipmentIndices[var2]]; // L: 106
			if (var3 == 0) { // L: 107
				var1.writeByte(-1);
			} else {
				var1.writeByte(var3 - 256); // L: 108
			}
		}

		for (var2 = 0; var2 < 5; ++var2) { // L: 110
			var1.writeByte(this.bodyColors[var2]);
		}

	} // L: 111

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1419838377"
	)
	@Export("setHash")
	void setHash() {
		long var1 = this.hash; // L: 114
		int var3 = this.equipment[5]; // L: 115
		int var4 = this.equipment[9]; // L: 116
		this.equipment[5] = var4; // L: 117
		this.equipment[9] = var3; // L: 118
		this.hash = 0L; // L: 119

		int var5;
		for (var5 = 0; var5 < 12; ++var5) { // L: 120
			this.hash <<= 4; // L: 121
			if (this.equipment[var5] >= 256) { // L: 122
				this.hash += (long)(this.equipment[var5] - 256);
			}
		}

		if (this.equipment[0] >= 256) { // L: 124
			this.hash += (long)(this.equipment[0] - 256 >> 4);
		}

		if (this.equipment[1] >= 256) { // L: 125
			this.hash += (long)(this.equipment[1] - 256 >> 8);
		}

		for (var5 = 0; var5 < 5; ++var5) { // L: 126
			this.hash <<= 3; // L: 127
			this.hash += (long)this.bodyColors[var5]; // L: 128
		}

		this.hash <<= 1; // L: 130
		this.hash += (long)(this.isFemale ? 1 : 0); // L: 131
		this.equipment[5] = var3; // L: 132
		this.equipment[9] = var4; // L: 133
		if (0L != var1 && this.hash != var1 || this.field3313) { // L: 134
			PlayerAppearance_cachedModels.remove(var1);
		}

	} // L: 135

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lgg;ILgg;II)Lhx;",
		garbageValue = "755524889"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) { // L: 138
			return class9.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4); // L: 139
		} else {
			long var5 = this.hash; // L: 141
			int[] var7 = this.equipment; // L: 142
			if (var1 != null && (var1.shield >= 0 || var1.weapon >= 0)) { // L: 143
				var7 = new int[12]; // L: 144

				for (int var8 = 0; var8 < 12; ++var8) { // L: 145
					var7[var8] = this.equipment[var8];
				}

				if (var1.shield >= 0) { // L: 146
					var5 += (long)(var1.shield - this.equipment[5] << 40); // L: 147
					var7[5] = var1.shield; // L: 148
				}

				if (var1.weapon >= 0) { // L: 150
					var5 += (long)(var1.weapon - this.equipment[3] << 48); // L: 151
					var7[3] = var1.weapon; // L: 152
				}
			}

			Model var18 = (Model)PlayerAppearance_cachedModels.get(var5); // L: 155
			if (var18 == null) { // L: 156
				boolean var9 = false; // L: 157

				int var11;
				for (int var10 = 0; var10 < 12; ++var10) { // L: 158
					var11 = var7[var10]; // L: 159
					if (var11 >= 256 && var11 < 512 && !GrandExchangeOfferTotalQuantityComparator.KitDefinition_get(var11 - 256).ready()) { // L: 160 161
						var9 = true;
					}

					if (var11 >= 512 && !class67.ItemDefinition_get(var11 - 512).hasNoValidModel(this.isFemale)) { // L: 163 164
						var9 = true;
					}
				}

				if (var9) { // L: 167
					if (this.field3311 != -1L) { // L: 168
						var18 = (Model)PlayerAppearance_cachedModels.get(this.field3311);
					}

					if (var18 == null) { // L: 169
						return null;
					}
				}

				if (var18 == null) { // L: 171
					ModelData[] var19 = new ModelData[12]; // L: 172
					var11 = 0; // L: 173

					int var13;
					for (int var12 = 0; var12 < 12; ++var12) { // L: 174
						var13 = var7[var12]; // L: 175
						if (var13 >= 256 && var13 < 512) { // L: 176
							ModelData var14 = GrandExchangeOfferTotalQuantityComparator.KitDefinition_get(var13 - 256).getModelData(); // L: 177
							if (var14 != null) { // L: 178
								var19[var11++] = var14;
							}
						}

						if (var13 >= 512) { // L: 180
							ItemComposition var22 = class67.ItemDefinition_get(var13 - 512); // L: 181
							ModelData var15 = var22.method3693(this.isFemale); // L: 182
							if (var15 != null) { // L: 183
								if (this.field3312 != null) { // L: 184
									class168 var16 = this.field3312[var12]; // L: 185
									if (var16 != null) { // L: 186
										int var17;
										if (var16.field1804 != null && var22.recolorFrom != null && var22.recolorTo.length == var16.field1804.length) { // L: 187
											for (var17 = 0; var17 < var22.recolorFrom.length; ++var17) { // L: 188
												var15.recolor(var22.recolorTo[var17], var16.field1804[var17]); // L: 189
											}
										}

										if (var16.field1805 != null && var22.retextureFrom != null && var22.retextureTo.length == var16.field1805.length) { // L: 192
											for (var17 = 0; var17 < var22.retextureFrom.length; ++var17) { // L: 193
												var15.retexture(var22.retextureTo[var17], var16.field1805[var17]); // L: 194
											}
										}
									}
								}

								var19[var11++] = var15; // L: 199
							}
						}
					}

					ModelData var20 = new ModelData(var19, var11); // L: 203

					for (var13 = 0; var13 < 5; ++var13) { // L: 204
						if (this.bodyColors[var13] < class20.field102[var13].length) { // L: 205
							var20.recolor(TileItem.field1281[var13], class20.field102[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < class160.field1747[var13].length) { // L: 206
							var20.recolor(VerticalAlignment.field1950[var13], class160.field1747[var13][this.bodyColors[var13]]);
						}
					}

					var18 = var20.toModel(64, 850, -30, -50, -30); // L: 208
					PlayerAppearance_cachedModels.put(var18, var5); // L: 209
					this.field3311 = var5; // L: 210
				}
			}

			if (var1 == null && var3 == null) { // L: 214
				return var18;
			} else {
				Model var21;
				if (var1 != null && var3 != null) { // L: 215
					var21 = var1.applyTransformations(var18, var2, var3, var4);
				} else if (var1 != null) { // L: 216
					var21 = var1.transformActorModel(var18, var2);
				} else {
					var21 = var3.transformActorModel(var18, var4); // L: 217
				}

				return var21; // L: 218
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Lgt;",
		garbageValue = "1206861129"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) { // L: 222
			return class9.getNpcDefinition(this.npcTransformId).getModelData(); // L: 223
		} else {
			boolean var1 = false; // L: 225

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) { // L: 226
				var3 = this.equipment[var2]; // L: 227
				if (var3 >= 256 && var3 < 512 && !GrandExchangeOfferTotalQuantityComparator.KitDefinition_get(var3 - 256).method3397()) { // L: 228 229
					var1 = true;
				}

				if (var3 >= 512 && !class67.ItemDefinition_get(var3 - 512).method3748(this.isFemale)) { // L: 231 232
					var1 = true;
				}
			}

			if (var1) { // L: 235
				return null;
			} else {
				ModelData[] var7 = new ModelData[12]; // L: 236
				var3 = 0; // L: 237

				int var5;
				for (int var4 = 0; var4 < 12; ++var4) { // L: 238
					var5 = this.equipment[var4]; // L: 239
					ModelData var6;
					if (var5 >= 256 && var5 < 512) { // L: 240
						var6 = GrandExchangeOfferTotalQuantityComparator.KitDefinition_get(var5 - 256).getKitDefinitionModels(); // L: 241
						if (var6 != null) { // L: 242
							var7[var3++] = var6;
						}
					}

					if (var5 >= 512) { // L: 244
						var6 = class67.ItemDefinition_get(var5 - 512).method3730(this.isFemale); // L: 245
						if (var6 != null) { // L: 246
							var7[var3++] = var6;
						}
					}
				}

				ModelData var8 = new ModelData(var7, var3); // L: 249

				for (var5 = 0; var5 < 5; ++var5) { // L: 250
					if (this.bodyColors[var5] < class20.field102[var5].length) { // L: 251
						var8.recolor(TileItem.field1281[var5], class20.field102[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < class160.field1747[var5].length) { // L: 252
						var8.recolor(VerticalAlignment.field1950[var5], class160.field1747[var5][this.bodyColors[var5]]);
					}
				}

				return var8; // L: 254
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1711666229"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		return this.npcTransformId == -1 ? (this.equipment[0] << 15) + this.equipment[1] + (this.equipment[11] << 5) + (this.equipment[8] << 10) + (this.bodyColors[0] << 25) + (this.bodyColors[4] << 20) : 305419896 + class9.getNpcDefinition(this.npcTransformId).id; // L: 258 259
	}
}
