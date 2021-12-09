import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("sr")
	@ObfuscatedGetter(
		intValue = -992290139
	)
	static int field3193;
	@ObfuscatedName("n")
	public static short[] field3197;
	@ObfuscatedName("v")
	public static short[][] field3203;
	@ObfuscatedName("d")
	@Export("equipmentIndices")
	static final int[] equipmentIndices;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("Widget_cachedSprites")
	public static EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "[Lpl;"
	)
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSprites;
	@ObfuscatedName("c")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("b")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("p")
	@Export("isFemale")
	public boolean isFemale;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1676394061
	)
	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		longValue = -8763548147665494793L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		longValue = -4642626156461573715L
	)
	long field3201;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "[Lfe;"
	)
	class160[] field3199;
	@ObfuscatedName("w")
	boolean field3200;

	static {
		equipmentIndices = new int[]{8, 11, 4, 6, 9, 7, 10}; // L: 26
		Widget_cachedSprites = new EvictingDualNodeHashTable(260); // L: 27
	}

	public PlayerComposition() {
		this.field3200 = false; // L: 21
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([I[Lfe;Z[IZII)V",
		garbageValue = "1940992993"
	)
	public void method5368(int[] var1, class160[] var2, boolean var3, int[] var4, boolean var5, int var6) {
		this.field3199 = var2; // L: 30
		this.field3200 = var3;
		this.update(var1, var4, var5, var6); // L: 32
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "([I[IZII)V",
		garbageValue = "392643957"
	)
	@Export("update")
	public void update(int[] var1, int[] var2, boolean var3, int var4) {
		if (var1 == null) {
			var1 = new int[12];

			for (int var5 = 0; var5 < 7; ++var5) {
				for (int var6 = 0; var6 < KitDefinition.KitDefinition_fileCount; ++var6) {
					KitDefinition var7 = ArchiveDisk.KitDefinition_get(var6);
					if (var7 != null && !var7.nonSelectable && (var3 ? 7 : 0) + var5 == var7.bodypartID) {
						var1[equipmentIndices[var5]] = var6 + 256;
						break;
					}
				}
			}
		}

		this.equipment = var1; // L: 48
		this.bodyColors = var2;
		this.isFemale = var3;
		this.npcTransformId = var4;
		this.setHash(); // L: 52
	} // L: 53

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "1060805445"
	)
	@Export("changeAppearance")
	public void changeAppearance(int var1, boolean var2) {
		if (var1 != 1 || !this.isFemale) {
			int var3 = this.equipment[equipmentIndices[var1]];
			if (var3 != 0) { // L: 58
				var3 -= 256;

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

					var4 = ArchiveDisk.KitDefinition_get(var3); // L: 69
				} while(var4 == null || var4.nonSelectable || var4.bodypartID != (this.isFemale ? 7 : 0) + var1); // L: 70

				this.equipment[equipmentIndices[var1]] = var3 + 256; // L: 72
				this.setHash(); // L: 73
			}
		}
	} // L: 74

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "1596195653"
	)
	public void method5391(int var1, boolean var2) {
		int var3 = this.bodyColors[var1]; // L: 77
		boolean var4;
		if (!var2) { // L: 78
			do {
				--var3; // L: 80
				if (var3 < 0) { // L: 81
					var3 = class114.field1382[var1].length - 1; // L: 82
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
				if (var3 >= class114.field1382[var1].length) { // L: 98
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

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-86"
	)
	@Export("changeSex")
	public void changeSex(boolean var1) {
		if (this.isFemale != var1) { // L: 115
			this.update((int[])null, this.bodyColors, var1, -1); // L: 116
		}
	} // L: 117

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "1350599640"
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "81"
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
		if (var1 != 0L && var1 != this.hash || this.field3200) { // L: 150
			Widget_cachedSprites.remove(var1);
		}

	} // L: 151

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lgn;ILgn;IB)Lgo;",
		garbageValue = "-18"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) { // L: 154
			return WorldMapLabelSize.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4); // L: 155
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

			Model var18 = (Model)Widget_cachedSprites.get(var5); // L: 171
			if (var18 == null) { // L: 172
				boolean var9 = false; // L: 173

				int var11;
				for (int var10 = 0; var10 < 12; ++var10) { // L: 174
					var11 = var7[var10]; // L: 175
					if (var11 >= 256 && var11 < 512 && !ArchiveDisk.KitDefinition_get(var11 - 256).ready()) { // L: 176 177
						var9 = true;
					}

					if (var11 >= 512 && !UserComparator6.ItemDefinition_get(var11 - 512).hasNoValidModel(this.isFemale)) { // L: 179 180
						var9 = true;
					}
				}

				if (var9) { // L: 183
					if (this.field3201 != -1L) { // L: 184
						var18 = (Model)Widget_cachedSprites.get(this.field3201);
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
							ModelData var14 = ArchiveDisk.KitDefinition_get(var13 - 256).getModelData(); // L: 193
							if (var14 != null) { // L: 194
								var19[var11++] = var14;
							}
						}

						if (var13 >= 512) { // L: 196
							ItemComposition var22 = UserComparator6.ItemDefinition_get(var13 - 512); // L: 197
							ModelData var15 = var22.method3554(this.isFemale); // L: 198
							if (var15 != null) { // L: 199
								if (this.field3199 != null) { // L: 200
									class160 var16 = this.field3199[var12]; // L: 201
									if (var16 != null) { // L: 202
										int var17;
										if (var16.field1732 != null && var22.recolorFrom != null && var22.recolorTo.length == var16.field1732.length) { // L: 203
											for (var17 = 0; var17 < var22.recolorFrom.length; ++var17) { // L: 204
												var15.recolor(var22.recolorTo[var17], var16.field1732[var17]); // L: 205
											}
										}

										if (var16.field1738 != null && var22.retextureFrom != null && var22.retextureTo.length == var16.field1738.length) { // L: 208
											for (var17 = 0; var17 < var22.retextureFrom.length; ++var17) { // L: 209
												var15.retexture(var22.retextureTo[var17], var16.field1738[var17]); // L: 210
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
						if (this.bodyColors[var13] < class114.field1382[var13].length) { // L: 221
							var20.recolor(field3197[var13], class114.field1382[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < field3203[var13].length) { // L: 222
							var20.recolor(class132.field1540[var13], field3203[var13][this.bodyColors[var13]]);
						}
					}

					var18 = var20.toModel(64, 850, -30, -50, -30); // L: 224
					Widget_cachedSprites.put(var18, var5); // L: 225
					this.field3201 = var5; // L: 226
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Lge;",
		garbageValue = "1317025589"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) { // L: 238
			return WorldMapLabelSize.getNpcDefinition(this.npcTransformId).getModelData(); // L: 239
		} else {
			boolean var1 = false; // L: 241

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) { // L: 242
				var3 = this.equipment[var2]; // L: 243
				if (var3 >= 256 && var3 < 512 && !ArchiveDisk.KitDefinition_get(var3 - 256).method3210()) { // L: 244 245
					var1 = true;
				}

				if (var3 >= 512 && !UserComparator6.ItemDefinition_get(var3 - 512).method3555(this.isFemale)) { // L: 247 248
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
						var6 = ArchiveDisk.KitDefinition_get(var5 - 256).getKitDefinitionModels(); // L: 257
						if (var6 != null) { // L: 258
							var7[var3++] = var6;
						}
					}

					if (var5 >= 512) { // L: 260
						var6 = UserComparator6.ItemDefinition_get(var5 - 512).method3601(this.isFemale); // L: 261
						if (var6 != null) { // L: 262
							var7[var3++] = var6;
						}
					}
				}

				ModelData var8 = new ModelData(var7, var3); // L: 265

				for (var5 = 0; var5 < 5; ++var5) { // L: 266
					if (this.bodyColors[var5] < class114.field1382[var5].length) { // L: 267
						var8.recolor(field3197[var5], class114.field1382[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < field3203[var5].length) { // L: 268
						var8.recolor(class132.field1540[var5], field3203[var5][this.bodyColors[var5]]);
					}
				}

				return var8; // L: 270
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-656576529"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		return this.npcTransformId == -1 ? (this.equipment[0] << 15) + this.equipment[1] + (this.equipment[11] << 5) + (this.equipment[8] << 10) + (this.bodyColors[0] << 25) + (this.bodyColors[4] << 20) : 305419896 + WorldMapLabelSize.getNpcDefinition(this.npcTransformId).id; // L: 274 275
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "45"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (HorizontalAlignment.World_request == null) { // L: 31
				HorizontalAlignment.World_request = WorldMapData_1.urlRequester.request(new URL(AbstractWorldMapIcon.field2761));
			} else if (HorizontalAlignment.World_request.isDone()) { // L: 33
				byte[] var0 = HorizontalAlignment.World_request.getResponse(); // L: 34
				Buffer var1 = new Buffer(var0); // L: 35
				var1.readInt(); // L: 36
				World.World_count = var1.readUnsignedShort(); // L: 37
				class334.World_worlds = new World[World.World_count]; // L: 38

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) { // L: 39 47
					var3 = class334.World_worlds[var2] = new World(); // L: 40
					var3.id = var1.readUnsignedShort(); // L: 41
					var3.properties = var1.readInt(); // L: 42
					var3.host = var1.readStringCp1252NullTerminated(); // L: 43
					var3.activity = var1.readStringCp1252NullTerminated();
					var3.location = var1.readUnsignedByte();
					var3.population = var1.readShort();
				}

				UserComparator4.sortWorlds(class334.World_worlds, 0, class334.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 49
				HorizontalAlignment.World_request = null; // L: 50
				return true; // L: 51
			}
		} catch (Exception var4) { // L: 55
			var4.printStackTrace(); // L: 56
			HorizontalAlignment.World_request = null; // L: 57
		}

		return false; // L: 59
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1167234194"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 44
		return var1 == null ? 0 : var1.size(); // L: 45 46
	}
}
