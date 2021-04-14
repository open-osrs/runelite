import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ht")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("k")
	public static short[] field2601;
	@ObfuscatedName("n")
	public static short[][] field2596;
	@ObfuscatedName("l")
	@Export("equipmentIndices")
	static final int[] equipmentIndices;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	@Export("PlayerAppearance_cachedModels")
	public static EvictingDualNodeHashTable PlayerAppearance_cachedModels;
	@ObfuscatedName("f")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("o")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("u")
	@Export("isFemale")
	public boolean isFemale;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1124941233
	)
	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		longValue = -9046432818636348341L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		longValue = -3040880622035732721L
	)
	long field2600;

	static {
		equipmentIndices = new int[]{8, 11, 4, 6, 9, 7, 10}; // L: 23
		PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(260); // L: 24
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([I[IZII)V",
		garbageValue = "-1757144268"
	)
	@Export("update")
	public void update(int[] var1, int[] var2, boolean var3, int var4) {
		if (var1 == null) { // L: 27
			var1 = new int[12]; // L: 28

			for (int var5 = 0; var5 < 7; ++var5) { // L: 29
				for (int var6 = 0; var6 < KitDefinition.KitDefinition_fileCount; ++var6) { // L: 30
					KitDefinition var7 = SpriteMask.KitDefinition_get(var6); // L: 31
					if (var7 != null && !var7.nonSelectable && var7.bodypartID == var5 + (var3 ? 7 : 0)) { // L: 32
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "-86"
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
						if (var3 >= KitDefinition.KitDefinition_fileCount) { // L: 58
							var3 = 0;
						}
					}

					var4 = SpriteMask.KitDefinition_get(var3); // L: 60
				} while(var4 == null || var4.nonSelectable || var4.bodypartID != (this.isFemale ? 7 : 0) + var1); // L: 61

				this.equipment[equipmentIndices[var1]] = var3 + 256; // L: 63
				this.setHash(); // L: 64
			}
		}
	} // L: 65

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "108911198"
	)
	public void method4205(int var1, boolean var2) {
		int var3 = this.bodyColors[var1]; // L: 68
		if (!var2) { // L: 69
			do {
				--var3; // L: 71
				if (var3 < 0) { // L: 72
					var3 = ChatChannel.field1086[var1].length - 1; // L: 73
				}
			} while(!TriBool.method5817(var1, var3)); // L: 75
		} else {
			do {
				++var3; // L: 80
				if (var3 >= ChatChannel.field1086[var1].length) { // L: 81
					var3 = 0;
				}
			} while(!TriBool.method5817(var1, var3)); // L: 82
		}

		this.bodyColors[var1] = var3; // L: 85
		this.setHash(); // L: 86
	} // L: 87

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "280516890"
	)
	@Export("changeSex")
	public void changeSex(boolean var1) {
		if (this.isFemale != var1) { // L: 90
			this.update((int[])null, this.bodyColors, var1, -1); // L: 91
		}
	} // L: 92

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "1914698329"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(this.isFemale ? 1 : 0); // L: 95

		int var2;
		for (var2 = 0; var2 < 7; ++var2) { // L: 96
			int var3 = this.equipment[equipmentIndices[var2]]; // L: 97
			if (var3 == 0) { // L: 98
				var1.writeByte(-1);
			} else {
				var1.writeByte(var3 - 256); // L: 99
			}
		}

		for (var2 = 0; var2 < 5; ++var2) { // L: 101
			var1.writeByte(this.bodyColors[var2]);
		}

	} // L: 102

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2039912675"
	)
	@Export("setHash")
	void setHash() {
		long var1 = this.hash; // L: 105
		int var3 = this.equipment[5]; // L: 106
		int var4 = this.equipment[9]; // L: 107
		this.equipment[5] = var4; // L: 108
		this.equipment[9] = var3; // L: 109
		this.hash = 0L; // L: 110

		int var5;
		for (var5 = 0; var5 < 12; ++var5) { // L: 111
			this.hash <<= 4; // L: 112
			if (this.equipment[var5] >= 256) { // L: 113
				this.hash += (long)(this.equipment[var5] - 256);
			}
		}

		if (this.equipment[0] >= 256) { // L: 115
			this.hash += (long)(this.equipment[0] - 256 >> 4);
		}

		if (this.equipment[1] >= 256) { // L: 116
			this.hash += (long)(this.equipment[1] - 256 >> 8);
		}

		for (var5 = 0; var5 < 5; ++var5) { // L: 117
			this.hash <<= 3; // L: 118
			this.hash += (long)this.bodyColors[var5]; // L: 119
		}

		this.hash <<= 1; // L: 121
		this.hash += (long)(this.isFemale ? 1 : 0); // L: 122
		this.equipment[5] = var3; // L: 123
		this.equipment[9] = var4; // L: 124
		if (var1 != 0L && var1 != this.hash) { // L: 125
			PlayerAppearance_cachedModels.remove(var1);
		}

	} // L: 126

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lkw;ILkw;II)Lgv;",
		garbageValue = "2136869602"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) { // L: 129
			return GraphicsObject.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4); // L: 130
		} else {
			long var5 = this.hash; // L: 132
			int[] var7 = this.equipment; // L: 133
			if (var1 != null && (var1.shield >= 0 || var1.weapon >= 0)) { // L: 134
				var7 = new int[12]; // L: 135

				for (int var8 = 0; var8 < 12; ++var8) { // L: 136
					var7[var8] = this.equipment[var8];
				}

				if (var1.shield >= 0) { // L: 137
					var5 += (long)(var1.shield - this.equipment[5] << 40); // L: 138
					var7[5] = var1.shield; // L: 139
				}

				if (var1.weapon >= 0) { // L: 141
					var5 += (long)(var1.weapon - this.equipment[3] << 48); // L: 142
					var7[3] = var1.weapon; // L: 143
				}
			}

			Model var15 = (Model)PlayerAppearance_cachedModels.get(var5); // L: 146
			if (var15 == null) { // L: 147
				boolean var9 = false; // L: 148

				int var11;
				for (int var10 = 0; var10 < 12; ++var10) { // L: 149
					var11 = var7[var10]; // L: 150
					if (var11 >= 256 && var11 < 512 && !SpriteMask.KitDefinition_get(var11 - 256).ready()) { // L: 151 152
						var9 = true;
					}

					if (var11 >= 512 && !class23.ItemDefinition_get(var11 - 512).hasNoValidModel(this.isFemale)) { // L: 154 155
						var9 = true;
					}
				}

				if (var9) { // L: 158
					if (this.field2600 != -1L) { // L: 159
						var15 = (Model)PlayerAppearance_cachedModels.get(this.field2600);
					}

					if (var15 == null) { // L: 160
						return null;
					}
				}

				if (var15 == null) { // L: 162
					ModelData[] var16 = new ModelData[12]; // L: 163
					var11 = 0; // L: 164

					int var13;
					for (int var12 = 0; var12 < 12; ++var12) { // L: 165
						var13 = var7[var12]; // L: 166
						ModelData var14;
						if (var13 >= 256 && var13 < 512) { // L: 167
							var14 = SpriteMask.KitDefinition_get(var13 - 256).getModelData(); // L: 168
							if (var14 != null) { // L: 169
								var16[var11++] = var14;
							}
						}

						if (var13 >= 512) { // L: 171
							var14 = class23.ItemDefinition_get(var13 - 512).method5280(this.isFemale); // L: 172
							if (var14 != null) { // L: 173
								var16[var11++] = var14;
							}
						}
					}

					ModelData var17 = new ModelData(var16, var11); // L: 176

					for (var13 = 0; var13 < 5; ++var13) { // L: 177
						if (this.bodyColors[var13] < ChatChannel.field1086[var13].length) { // L: 178
							var17.recolor(field2601[var13], ChatChannel.field1086[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < field2596[var13].length) { // L: 179
							var17.recolor(WorldMapSection1.field1753[var13], field2596[var13][this.bodyColors[var13]]);
						}
					}

					var15 = var17.toModel(64, 850, -30, -50, -30); // L: 181
					PlayerAppearance_cachedModels.put(var15, var5); // L: 182
					this.field2600 = var5; // L: 183
				}
			}

			if (var1 == null && var3 == null) { // L: 187
				return var15;
			} else {
				Model var18;
				if (var1 != null && var3 != null) { // L: 188
					var18 = var1.applyTransformations(var15, var2, var3, var4);
				} else if (var1 != null) { // L: 189
					var18 = var1.transformActorModel(var15, var2);
				} else {
					var18 = var3.transformActorModel(var15, var4); // L: 190
				}

				return var18; // L: 191
			}
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Lfs;",
		garbageValue = "-2099433668"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) { // L: 195
			return GraphicsObject.getNpcDefinition(this.npcTransformId).getModelData(); // L: 196
		} else {
			boolean var1 = false; // L: 198

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) { // L: 199
				var3 = this.equipment[var2]; // L: 200
				if (var3 >= 256 && var3 < 512 && !SpriteMask.KitDefinition_get(var3 - 256).method4950()) { // L: 201 202
					var1 = true;
				}

				if (var3 >= 512 && !class23.ItemDefinition_get(var3 - 512).method5237(this.isFemale)) { // L: 204 205
					var1 = true;
				}
			}

			if (var1) { // L: 208
				return null;
			} else {
				ModelData[] var7 = new ModelData[12]; // L: 209
				var3 = 0; // L: 210

				int var5;
				for (int var4 = 0; var4 < 12; ++var4) { // L: 211
					var5 = this.equipment[var4]; // L: 212
					ModelData var6;
					if (var5 >= 256 && var5 < 512) { // L: 213
						var6 = SpriteMask.KitDefinition_get(var5 - 256).getKitDefinitionModels(); // L: 214
						if (var6 != null) { // L: 215
							var7[var3++] = var6;
						}
					}

					if (var5 >= 512) { // L: 217
						var6 = class23.ItemDefinition_get(var5 - 512).method5238(this.isFemale); // L: 218
						if (var6 != null) { // L: 219
							var7[var3++] = var6;
						}
					}
				}

				ModelData var8 = new ModelData(var7, var3); // L: 222

				for (var5 = 0; var5 < 5; ++var5) { // L: 223
					if (this.bodyColors[var5] < ChatChannel.field1086[var5].length) { // L: 224
						var8.recolor(field2601[var5], ChatChannel.field1086[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < field2596[var5].length) { // L: 225
						var8.recolor(WorldMapSection1.field1753[var5], field2596[var5][this.bodyColors[var5]]);
					}
				}

				return var8; // L: 227
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		return this.npcTransformId == -1 ? (this.equipment[0] << 15) + this.equipment[1] + (this.equipment[11] << 5) + (this.equipment[8] << 10) + (this.bodyColors[0] << 25) + (this.bodyColors[4] << 20) : 305419896 + GraphicsObject.getNpcDefinition(this.npcTransformId).id; // L: 231 232
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1122535637"
	)
	@Export("Widget_resetModelFrames")
	static final void Widget_resetModelFrames(int var0) {
		if (class15.loadInterface(var0)) { // L: 11085
			Widget[] var1 = Widget.Widget_interfaceComponents[var0]; // L: 11086

			for (int var2 = 0; var2 < var1.length; ++var2) { // L: 11087
				Widget var3 = var1[var2]; // L: 11088
				if (var3 != null) { // L: 11089
					var3.modelFrame = 0; // L: 11090
					var3.modelFrameCycle = 0; // L: 11091
				}
			}

		}
	} // L: 11093
}
