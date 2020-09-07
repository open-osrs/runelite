import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
@Implements("PlayerAppearance")
public class PlayerAppearance {
	@ObfuscatedName("n")
	@Export("equipmentIndices")
	static final int[] equipmentIndices;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	@Export("PlayerAppearance_cachedModels")
	public static EvictingDualNodeHashTable PlayerAppearance_cachedModels;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 1000886071
	)
	public static int field2581;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("archive14")
	static Archive archive14;
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("archive15")
	static Archive archive15;
	@ObfuscatedName("z")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("k")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("s")
	@Export("isFemale")
	public boolean isFemale;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 32109537
	)
	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		longValue = 7297189778048494063L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = 549450533580292223L
	)
	long field2575;

	static {
		equipmentIndices = new int[]{8, 11, 4, 6, 9, 7, 10};
		PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(260);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "([I[IZII)V",
		garbageValue = "1005364184"
	)
	@Export("update")
	public void update(int[] var1, int[] var2, boolean var3, int var4) {
		if (var1 == null) {
			var1 = new int[12];

			for (int var5 = 0; var5 < 7; ++var5) { // L: 29
				for (int var6 = 0; var6 < KitDefinition.KitDefinition_fileCount; ++var6) { // L: 30
					KitDefinition var7 = FriendSystem.KitDefinition_get(var6); // L: 31
					if (var7 != null && !var7.nonSelectable && (var3 ? 7 : 0) + var5 == var7.bodypartID) { // L: 32
						var1[equipmentIndices[var5]] = var6 + 256; // L: 33
						break; // L: 34
					}
				}
			}
		}

		this.equipment = var1; // L: 39
		this.bodyColors = var2; // L: 40
		this.isFemale = var3; // L: 41
		this.npcTransformId = var4; // L: 42
		this.setHash(); // L: 43
	} // L: 44

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "-97"
	)
	@Export("changeAppearance")
	public void changeAppearance(int var1, boolean var2) {
		if (var1 != 1 || !this.isFemale) { // L: 47
			int var3 = this.equipment[equipmentIndices[var1]]; // L: 48
			if (var3 != 0) { // L: 49
				var3 -= 256; // L: 50

				KitDefinition var4;
				do {
					if (!var2) { // L: 52
						--var3; // L: 53
						if (var3 < 0) { // L: 54
							var3 = KitDefinition.KitDefinition_fileCount - 1;
						}
					} else {
						++var3; // L: 57
						if (var3 >= KitDefinition.KitDefinition_fileCount) {
							var3 = 0; // L: 58
						}
					}

					var4 = FriendSystem.KitDefinition_get(var3); // L: 60
				} while(var4 == null || var4.nonSelectable || var4.bodypartID != var1 + (this.isFemale ? 7 : 0)); // L: 61

				this.equipment[equipmentIndices[var1]] = var3 + 256;
				this.setHash();
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-1662290602"
	)
	public void method4102(int var1, boolean var2) {
		int var3 = this.bodyColors[var1];
		boolean var4;
		if (!var2) {
			do {
				--var3;
				if (var3 < 0) { // L: 72
					var3 = WorldMapSprite.field253[var1].length - 1;
				}

				if (var1 == 4 && var3 >= 8) {
					var4 = false; // L: 78
				} else {
					var4 = true; // L: 81
				}
			} while(!var4); // L: 83
		} else {
			do {
				++var3; // L: 88
				if (var3 >= WorldMapSprite.field253[var1].length) { // L: 89
					var3 = 0;
				}

				if (var1 == 4 && var3 >= 8) { // L: 92
					var4 = false; // L: 93
				} else {
					var4 = true; // L: 96
				}
			} while(!var4); // L: 98
		}

		this.bodyColors[var1] = var3; // L: 101
		this.setHash(); // L: 102
	} // L: 103

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1897659753"
	)
	@Export("changeSex")
	public void changeSex(boolean var1) {
		if (this.isFemale != var1) { // L: 106
			this.update((int[])null, this.bodyColors, var1, -1); // L: 107
		}
	} // L: 108

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lkf;I)V",
		garbageValue = "85946625"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(this.isFemale ? 1 : 0); // L: 111

		int var2;
		for (var2 = 0; var2 < 7; ++var2) { // L: 112
			int var3 = this.equipment[equipmentIndices[var2]]; // L: 113
			if (var3 == 0) { // L: 114
				var1.writeByte(-1);
			} else {
				var1.writeByte(var3 - 256); // L: 115
			}
		}

		for (var2 = 0; var2 < 5; ++var2) { // L: 117
			var1.writeByte(this.bodyColors[var2]);
		}

	} // L: 118

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "6"
	)
	@Export("setHash")
	void setHash() {
		long var1 = this.hash; // L: 121
		int var3 = this.equipment[5]; // L: 122
		int var4 = this.equipment[9]; // L: 123
		this.equipment[5] = var4; // L: 124
		this.equipment[9] = var3; // L: 125
		this.hash = 0L; // L: 126

		int var5;
		for (var5 = 0; var5 < 12; ++var5) { // L: 127
			this.hash <<= 4; // L: 128
			if (this.equipment[var5] >= 256) { // L: 129
				this.hash += (long)(this.equipment[var5] - 256);
			}
		}

		if (this.equipment[0] >= 256) { // L: 131
			this.hash += (long)(this.equipment[0] - 256 >> 4);
		}

		if (this.equipment[1] >= 256) { // L: 132
			this.hash += (long)(this.equipment[1] - 256 >> 8);
		}

		for (var5 = 0; var5 < 5; ++var5) { // L: 133
			this.hash <<= 3; // L: 134
			this.hash += (long)this.bodyColors[var5]; // L: 135
		}

		this.hash <<= 1; // L: 137
		this.hash += (long)(this.isFemale ? 1 : 0); // L: 138
		this.equipment[5] = var3; // L: 139
		this.equipment[9] = var4; // L: 140
		if (var1 != 0L && var1 != this.hash) { // L: 141
			PlayerAppearance_cachedModels.remove(var1);
		}

	} // L: 142

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljm;ILjm;IB)Ler;",
		garbageValue = "-25"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) { // L: 145
			return Skeleton.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4); // L: 146
		} else {
			long var5 = this.hash; // L: 148
			int[] var7 = this.equipment; // L: 149
			if (var1 != null && (var1.shield >= 0 || var1.weapon >= 0)) { // L: 150
				var7 = new int[12]; // L: 151

				for (int var8 = 0; var8 < 12; ++var8) { // L: 152
					var7[var8] = this.equipment[var8];
				}

				if (var1.shield >= 0) { // L: 153
					var5 += (long)(var1.shield - this.equipment[5] << 40); // L: 154
					var7[5] = var1.shield; // L: 155
				}

				if (var1.weapon >= 0) { // L: 157
					var5 += (long)(var1.weapon - this.equipment[3] << 48); // L: 158
					var7[3] = var1.weapon; // L: 159
				}
			}

			Model var15 = (Model)PlayerAppearance_cachedModels.get(var5); // L: 162
			if (var15 == null) { // L: 163
				boolean var9 = false; // L: 164

				int var11;
				for (int var10 = 0; var10 < 12; ++var10) { // L: 165
					var11 = var7[var10]; // L: 166
					if (var11 >= 256 && var11 < 512 && !FriendSystem.KitDefinition_get(var11 - 256).ready()) { // L: 167 168
						var9 = true;
					}

					if (var11 >= 512 && !GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var11 - 512).hasNoValidModel(this.isFemale)) { // L: 170 171
						var9 = true;
					}
				}

				if (var9) { // L: 174
					if (-1L != this.field2575) { // L: 175
						var15 = (Model)PlayerAppearance_cachedModels.get(this.field2575);
					}

					if (var15 == null) { // L: 176
						return null;
					}
				}

				if (var15 == null) { // L: 178
					ModelData[] var16 = new ModelData[12]; // L: 179
					var11 = 0; // L: 180

					int var13;
					for (int var12 = 0; var12 < 12; ++var12) { // L: 181
						var13 = var7[var12]; // L: 182
						ModelData var14;
						if (var13 >= 256 && var13 < 512) { // L: 183
							var14 = FriendSystem.KitDefinition_get(var13 - 256).getModelData(); // L: 184
							if (var14 != null) { // L: 185
								var16[var11++] = var14;
							}
						}

						if (var13 >= 512) { // L: 187
							var14 = GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var13 - 512).method4760(this.isFemale); // L: 188
							if (var14 != null) { // L: 189
								var16[var11++] = var14;
							}
						}
					}

					ModelData var17 = new ModelData(var16, var11); // L: 192

					for (var13 = 0; var13 < 5; ++var13) { // L: 193
						if (this.bodyColors[var13] < WorldMapSprite.field253[var13].length) { // L: 194
							var17.recolor(Calendar.field2535[var13], WorldMapSprite.field253[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < UserComparator7.field2021[var13].length) { // L: 195
							var17.recolor(GrandExchangeOfferTotalQuantityComparator.field83[var13], UserComparator7.field2021[var13][this.bodyColors[var13]]);
						}
					}

					var15 = var17.toModel(64, 850, -30, -50, -30); // L: 197
					PlayerAppearance_cachedModels.put(var15, var5); // L: 198
					this.field2575 = var5; // L: 199
				}
			}

			if (var1 == null && var3 == null) { // L: 203
				return var15;
			} else {
				Model var18;
				if (var1 != null && var3 != null) { // L: 204
					var18 = var1.applyTransformations(var15, var2, var3, var4);
				} else if (var1 != null) { // L: 205
					var18 = var1.transformActorModel(var15, var2);
				} else {
					var18 = var3.transformActorModel(var15, var4); // L: 206
				}

				return var18; // L: 207
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Lee;",
		garbageValue = "491299614"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) { // L: 211
			return Skeleton.getNpcDefinition(this.npcTransformId).getModelData(); // L: 212
		} else {
			boolean var1 = false; // L: 214

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) { // L: 215
				var3 = this.equipment[var2]; // L: 216
				if (var3 >= 256 && var3 < 512 && !FriendSystem.KitDefinition_get(var3 - 256).method4543()) { // L: 217 218
					var1 = true;
				}

				if (var3 >= 512 && !GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var3 - 512).method4805(this.isFemale)) { // L: 220 221
					var1 = true;
				}
			}

			if (var1) { // L: 224
				return null;
			} else {
				ModelData[] var7 = new ModelData[12]; // L: 225
				var3 = 0; // L: 226

				int var5;
				for (int var4 = 0; var4 < 12; ++var4) { // L: 227
					var5 = this.equipment[var4]; // L: 228
					ModelData var6;
					if (var5 >= 256 && var5 < 512) { // L: 229
						var6 = FriendSystem.KitDefinition_get(var5 - 256).getKitDefinitionModels(); // L: 230
						if (var6 != null) { // L: 231
							var7[var3++] = var6;
						}
					}

					if (var5 >= 512) { // L: 233
						var6 = GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var5 - 512).method4762(this.isFemale); // L: 234
						if (var6 != null) { // L: 235
							var7[var3++] = var6;
						}
					}
				}

				ModelData var8 = new ModelData(var7, var3); // L: 238

				for (var5 = 0; var5 < 5; ++var5) { // L: 239
					if (this.bodyColors[var5] < WorldMapSprite.field253[var5].length) { // L: 240
						var8.recolor(Calendar.field2535[var5], WorldMapSprite.field253[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < UserComparator7.field2021[var5].length) { // L: 241
						var8.recolor(GrandExchangeOfferTotalQuantityComparator.field83[var5], UserComparator7.field2021[var5][this.bodyColors[var5]]);
					}
				}

				return var8; // L: 243
			}
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2109600157"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		return this.npcTransformId == -1 ? (this.equipment[0] << 15) + this.equipment[1] + (this.equipment[11] << 5) + (this.equipment[8] << 10) + (this.bodyColors[0] << 25) + (this.bodyColors[4] << 20) : 305419896 + Skeleton.getNpcDefinition(this.npcTransformId).id; // L: 247 248
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IB)Lil;",
		garbageValue = "19"
	)
	@Export("getParamDefinition")
	public static ParamDefinition getParamDefinition(int var0) {
		ParamDefinition var1 = (ParamDefinition)ParamDefinition.ParamDefinition_cached.get((long)var0); // L: 21
		if (var1 != null) { // L: 22
			return var1;
		} else {
			byte[] var2 = ParamDefinition.ParamDefinition_archive.takeFile(11, var0); // L: 23
			var1 = new ParamDefinition(); // L: 24
			if (var2 != null) { // L: 25
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 26
			ParamDefinition.ParamDefinition_cached.put(var1, (long)var0); // L: 27
			return var1; // L: 28
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "401735028"
	)
	static String method4116(byte[] var0, int var1, int var2) {
		StringBuilder var3 = new StringBuilder(); // L: 62

		for (int var4 = var1; var4 < var2 + var1; var4 += 3) { // L: 63
			int var5 = var0[var4] & 255; // L: 64
			var3.append(class299.field3676[var5 >>> 2]); // L: 65
			if (var4 < var2 - 1) { // L: 66
				int var6 = var0[var4 + 1] & 255; // L: 67
				var3.append(class299.field3676[(var5 & 3) << 4 | var6 >>> 4]); // L: 68
				if (var4 < var2 - 2) { // L: 69
					int var7 = var0[var4 + 2] & 255; // L: 70
					var3.append(class299.field3676[(var6 & 15) << 2 | var7 >>> 6]).append(class299.field3676[var7 & 63]); // L: 71
				} else {
					var3.append(class299.field3676[(var6 & 15) << 2]).append("="); // L: 73
				}
			} else {
				var3.append(class299.field3676[(var5 & 3) << 4]).append("=="); // L: 75
			}
		}

		return var3.toString(); // L: 77
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "1591550158"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (WorldMapSprite.loadInterface(var0)) { // L: 8652
			GrandExchangeOfferNameComparator.field115 = null; // L: 8659
			Decimator.drawInterface(Widget.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7); // L: 8660
			if (GrandExchangeOfferNameComparator.field115 != null) { // L: 8661
				Decimator.drawInterface(GrandExchangeOfferNameComparator.field115, -1412584499, var1, var2, var3, var4, Client.field947, class219.field2547, var7); // L: 8662
				GrandExchangeOfferNameComparator.field115 = null; // L: 8663
			}

		} else {
			if (var7 != -1) { // L: 8653
				Client.field882[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) { // L: 8655
					Client.field882[var8] = true;
				}
			}

		}
	} // L: 8657 8665
}
