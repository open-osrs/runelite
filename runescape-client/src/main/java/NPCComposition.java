import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("NpcDefinition_archive")
	static AbstractArchive NpcDefinition_archive;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("NpcDefinition_modelArchive")
	static AbstractArchive NpcDefinition_modelArchive;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("NpcDefinition_cached")
	static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("NpcDefinition_cachedModels")
	static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1685414723
	)
	@Export("id")
	public int id;
	@ObfuscatedName("o")
	@Export("name")
	public String name;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1333722311
	)
	@Export("size")
	public int size;
	@ObfuscatedName("w")
	@Export("models")
	int[] models;
	@ObfuscatedName("v")
	int[] field1873;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -399378105
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 876660563
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1866450757
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -87988001
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -737304117
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -902438193
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1899469793
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("n")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("m")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("d")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("j")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("f")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("g")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 475724077
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -2063992643
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1828782219
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("z")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -268154821
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1651659541
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 584708191
	)
	@Export("headIconPrayer")
	public int headIconPrayer;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1585237341
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("ar")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1742799129
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1482847539
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("ao")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("aq")
	@Export("isClickable")
	public boolean isClickable;
	@ObfuscatedName("ay")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		NpcDefinition_cached = new EvictingDualNodeHashTable(64); // L: 18
		NpcDefinition_cachedModels = new EvictingDualNodeHashTable(50); // L: 19
	}

	NPCComposition() {
		this.name = "null"; // L: 21
		this.size = 1; // L: 22
		this.idleSequence = -1; // L: 25
		this.turnLeftSequence = -1; // L: 26
		this.turnRightSequence = -1; // L: 27
		this.walkSequence = -1; // L: 28
		this.walkBackSequence = -1; // L: 29
		this.walkLeftSequence = -1; // L: 30
		this.walkRightSequence = -1; // L: 31
		this.actions = new String[5]; // L: 36
		this.drawMapDot = true; // L: 37
		this.combatLevel = -1; // L: 38
		this.widthScale = 128; // L: 39
		this.heightScale = 128; // L: 40
		this.isVisible = false; // L: 41
		this.ambient = 0; // L: 42
		this.contrast = 0; // L: 43
		this.headIconPrayer = -1; // L: 44
		this.rotation = 32; // L: 45
		this.transformVarbit = -1; // L: 47
		this.transformVarp = -1; // L: 48
		this.isInteractable = true; // L: 49
		this.isClickable = true; // L: 50
		this.isFollower = false; // L: 51
	} // L: 54

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2031619296"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 73

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "855279358"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 77
			if (var2 == 0) { // L: 78
				return; // L: 81
			}

			this.decodeNext(var1, var2); // L: 79
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "-1530080680"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) { // L: 84
			var3 = var1.readUnsignedByte(); // L: 85
			this.models = new int[var3]; // L: 86

			for (var4 = 0; var4 < var3; ++var4) { // L: 87
				this.models[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 2) { // L: 89
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 12) { // L: 90
			this.size = var1.readUnsignedByte();
		} else if (var2 == 13) { // L: 91
			this.idleSequence = var1.readUnsignedShort();
		} else if (var2 == 14) { // L: 92
			this.walkSequence = var1.readUnsignedShort();
		} else if (var2 == 15) { // L: 93
			this.turnLeftSequence = var1.readUnsignedShort();
		} else if (var2 == 16) { // L: 94
			this.turnRightSequence = var1.readUnsignedShort();
		} else if (var2 == 17) { // L: 95
			this.walkSequence = var1.readUnsignedShort(); // L: 96
			this.walkBackSequence = var1.readUnsignedShort(); // L: 97
			this.walkLeftSequence = var1.readUnsignedShort(); // L: 98
			this.walkRightSequence = var1.readUnsignedShort(); // L: 99
		} else if (var2 == 18) { // L: 101
			var1.readUnsignedShort(); // L: 102
		} else if (var2 >= 30 && var2 < 35) { // L: 104
			this.actions[var2 - 30] = var1.readStringCp1252NullTerminated(); // L: 105
			if (this.actions[var2 - 30].equalsIgnoreCase("Hidden")) { // L: 106
				this.actions[var2 - 30] = null;
			}
		} else if (var2 == 40) { // L: 108
			var3 = var1.readUnsignedByte(); // L: 109
			this.recolorFrom = new short[var3]; // L: 110
			this.recolorTo = new short[var3]; // L: 111

			for (var4 = 0; var4 < var3; ++var4) { // L: 112
				this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 113
				this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 114
			}
		} else if (var2 == 41) { // L: 117
			var3 = var1.readUnsignedByte(); // L: 118
			this.retextureFrom = new short[var3]; // L: 119
			this.retextureTo = new short[var3]; // L: 120

			for (var4 = 0; var4 < var3; ++var4) { // L: 121
				this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 122
				this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 123
			}
		} else if (var2 == 60) { // L: 126
			var3 = var1.readUnsignedByte(); // L: 127
			this.field1873 = new int[var3]; // L: 128

			for (var4 = 0; var4 < var3; ++var4) { // L: 129
				this.field1873[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 93) { // L: 131
			this.drawMapDot = false;
		} else if (var2 == 95) { // L: 132
			this.combatLevel = var1.readUnsignedShort();
		} else if (var2 == 97) { // L: 133
			this.widthScale = var1.readUnsignedShort();
		} else if (var2 == 98) { // L: 134
			this.heightScale = var1.readUnsignedShort();
		} else if (var2 == 99) { // L: 135
			this.isVisible = true;
		} else if (var2 == 100) { // L: 136
			this.ambient = var1.readByte();
		} else if (var2 == 101) { // L: 137
			this.contrast = var1.readByte() * 5;
		} else if (var2 == 102) { // L: 138
			this.headIconPrayer = var1.readUnsignedShort();
		} else if (var2 == 103) { // L: 139
			this.rotation = var1.readUnsignedShort();
		} else if (var2 != 106 && var2 != 118) { // L: 140
			if (var2 == 107) { // L: 158
				this.isInteractable = false;
			} else if (var2 == 109) { // L: 159
				this.isClickable = false;
			} else if (var2 == 111) { // L: 160
				this.isFollower = true;
			} else if (var2 == 249) { // L: 161
				this.params = class297.readStringIntParameters(var1, this.params);
			}
		} else {
			this.transformVarbit = var1.readUnsignedShort(); // L: 141
			if (this.transformVarbit == 65535) { // L: 142
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort(); // L: 143
			if (this.transformVarp == 65535) { // L: 144
				this.transformVarp = -1;
			}

			var3 = -1; // L: 145
			if (var2 == 118) { // L: 146
				var3 = var1.readUnsignedShort(); // L: 147
				if (var3 == 65535) { // L: 148
					var3 = -1;
				}
			}

			var4 = var1.readUnsignedByte(); // L: 150
			this.transforms = new int[var4 + 2]; // L: 151

			for (int var5 = 0; var5 <= var4; ++var5) { // L: 152
				this.transforms[var5] = var1.readUnsignedShort(); // L: 153
				if (this.transforms[var5] == 65535) { // L: 154
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3; // L: 156
		}

	} // L: 163

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lgm;ILgm;IB)Lgf;",
		garbageValue = "-40"
	)
	@Export("getModel")
	public final Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.transforms != null) { // L: 166
			NPCComposition var12 = this.transform(); // L: 167
			return var12 == null ? null : var12.getModel(var1, var2, var3, var4); // L: 168 169
		} else {
			Model var5 = (Model)NpcDefinition_cachedModels.get((long)this.id); // L: 171
			if (var5 == null) { // L: 172
				boolean var6 = false; // L: 173

				for (int var7 = 0; var7 < this.models.length; ++var7) { // L: 174
					if (!NpcDefinition_modelArchive.tryLoadFile(this.models[var7], 0)) {
						var6 = true;
					}
				}

				if (var6) { // L: 175
					return null;
				}

				ModelData[] var8 = new ModelData[this.models.length]; // L: 177

				int var9;
				for (var9 = 0; var9 < this.models.length; ++var9) { // L: 178
					var8[var9] = ModelData.ModelData_get(NpcDefinition_modelArchive, this.models[var9], 0);
				}

				ModelData var10;
				if (var8.length == 1) { // L: 179
					var10 = var8[0];
				} else {
					var10 = new ModelData(var8, var8.length); // L: 180
				}

				if (this.recolorFrom != null) { // L: 181
					for (var9 = 0; var9 < this.recolorFrom.length; ++var9) { // L: 182
						var10.recolor(this.recolorFrom[var9], this.recolorTo[var9]); // L: 183
					}
				}

				if (this.retextureFrom != null) { // L: 186
					for (var9 = 0; var9 < this.retextureFrom.length; ++var9) { // L: 187
						var10.retexture(this.retextureFrom[var9], this.retextureTo[var9]); // L: 188
					}
				}

				var5 = var10.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30); // L: 191
				NpcDefinition_cachedModels.put(var5, (long)this.id); // L: 192
			}

			Model var11;
			if (var1 != null && var3 != null) { // L: 195
				var11 = var1.applyTransformations(var5, var2, var3, var4);
			} else if (var1 != null) { // L: 196
				var11 = var1.transformActorModel(var5, var2);
			} else if (var3 != null) { // L: 197
				var11 = var3.transformActorModel(var5, var4);
			} else {
				var11 = var5.toSharedSequenceModel(true); // L: 198
			}

			if (this.widthScale != 128 || this.heightScale != 128) { // L: 199
				var11.scale(this.widthScale, this.heightScale, this.widthScale);
			}

			return var11; // L: 200
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Lgq;",
		garbageValue = "1977405718"
	)
	@Export("getModelData")
	public final ModelData getModelData() {
		if (this.transforms != null) { // L: 204
			NPCComposition var7 = this.transform(); // L: 205
			return var7 == null ? null : var7.getModelData(); // L: 206 207
		} else if (this.field1873 == null) { // L: 209
			return null;
		} else {
			boolean var1 = false; // L: 210

			for (int var2 = 0; var2 < this.field1873.length; ++var2) { // L: 211
				if (!NpcDefinition_modelArchive.tryLoadFile(this.field1873[var2], 0)) {
					var1 = true;
				}
			}

			if (var1) { // L: 212
				return null;
			} else {
				ModelData[] var5 = new ModelData[this.field1873.length]; // L: 213

				for (int var3 = 0; var3 < this.field1873.length; ++var3) { // L: 214
					var5[var3] = ModelData.ModelData_get(NpcDefinition_modelArchive, this.field1873[var3], 0);
				}

				ModelData var6;
				if (var5.length == 1) {
					var6 = var5[0]; // L: 216
				} else {
					var6 = new ModelData(var5, var5.length); // L: 217
				}

				int var4;
				if (this.recolorFrom != null) { // L: 218
					for (var4 = 0; var4 < this.recolorFrom.length; ++var4) { // L: 219
						var6.recolor(this.recolorFrom[var4], this.recolorTo[var4]); // L: 220
					}
				}

				if (this.retextureFrom != null) { // L: 223
					for (var4 = 0; var4 < this.retextureFrom.length; ++var4) { // L: 224
						var6.retexture(this.retextureFrom[var4], this.retextureTo[var4]); // L: 225
					}
				}

				return var6; // L: 228
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)Lfj;",
		garbageValue = "8"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1; // L: 232
		if (this.transformVarbit != -1) { // L: 233
			var1 = class375.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 234
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 236
			var2 = this.transforms[var1]; // L: 237
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? UserComparator10.getNpcDefinition(var2) : null; // L: 238 239
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-12"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) { // L: 243
			return true;
		} else {
			int var1 = -1; // L: 244
			if (this.transformVarbit != -1) { // L: 245
				var1 = class375.getVarbit(this.transformVarbit);
			} else if (this.transformVarp != -1) { // L: 246
				var1 = Varps.Varps_main[this.transformVarp];
			}

			if (var1 >= 0 && var1 < this.transforms.length) { // L: 247
				return this.transforms[var1] != -1; // L: 248
			} else {
				return this.transforms[this.transforms.length - 1] != -1;
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "753253125"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return UserComparator1.method7638(this.params, var1, var2); // L: 252
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-934827855"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class292.method5479(this.params, var1, var2); // L: 256
	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(Ljz;IIII)V",
		garbageValue = "2096918369"
	)
	@Export("drawCompass")
	static final void drawCompass(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.getSpriteMask(false); // L: 11835
		if (var4 != null) { // L: 11836
			if (Client.minimapState < 3) { // L: 11837
				class10.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 11838
			}

		}
	} // L: 11839
}
