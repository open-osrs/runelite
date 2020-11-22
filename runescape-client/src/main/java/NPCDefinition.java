import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
@Implements("NPCDefinition")
public class NPCDefinition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("NpcDefinition_archive")
	public static AbstractArchive NpcDefinition_archive;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("NpcDefinition_modelArchive")
	public static AbstractArchive NpcDefinition_modelArchive;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("NpcDefinition_cached")
	static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("NpcDefinition_cachedModels")
	static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -241449157
	)
	@Export("id")
	public int id;
	@ObfuscatedName("q")
	@Export("name")
	public String name;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 2022516453
	)
	@Export("size")
	public int size;
	@ObfuscatedName("c")
	@Export("models")
	int[] models;
	@ObfuscatedName("u")
	int[] field3492;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 397566937
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1249905269
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1539158423
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1135124357
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1656626847
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 2010823165
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1791628875
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("y")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("s")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("j")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("w")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("v")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("d")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1396717947
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 9158797
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -174548931
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("i")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 917052789
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -787194049
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1315228899
	)
	@Export("headIconPrayer")
	public int headIconPrayer;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -2018130609
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("av")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1301084267
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 281561835
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("ah")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("az")
	@Export("isClickable")
	public boolean isClickable;
	@ObfuscatedName("ak")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		NpcDefinition_cached = new EvictingDualNodeHashTable(64); // L: 18
		NpcDefinition_cachedModels = new EvictingDualNodeHashTable(50); // L: 19
	}

	NPCDefinition() {
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

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "60755671"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 68

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lkb;B)V",
		garbageValue = "1"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 72
			if (var2 == 0) { // L: 73
				return; // L: 76
			}

			this.decodeNext(var1, var2); // L: 74
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lkb;II)V",
		garbageValue = "-1883780506"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) { // L: 79
			var3 = var1.readUnsignedByte(); // L: 80
			this.models = new int[var3]; // L: 81

			for (var4 = 0; var4 < var3; ++var4) { // L: 82
				this.models[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 2) { // L: 84
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 12) { // L: 85
			this.size = var1.readUnsignedByte();
		} else if (var2 == 13) { // L: 86
			this.idleSequence = var1.readUnsignedShort();
		} else if (var2 == 14) { // L: 87
			this.walkSequence = var1.readUnsignedShort();
		} else if (var2 == 15) { // L: 88
			this.turnLeftSequence = var1.readUnsignedShort();
		} else if (var2 == 16) { // L: 89
			this.turnRightSequence = var1.readUnsignedShort();
		} else if (var2 == 17) { // L: 90
			this.walkSequence = var1.readUnsignedShort(); // L: 91
			this.walkBackSequence = var1.readUnsignedShort(); // L: 92
			this.walkLeftSequence = var1.readUnsignedShort(); // L: 93
			this.walkRightSequence = var1.readUnsignedShort(); // L: 94
		} else if (var2 >= 30 && var2 < 35) { // L: 96
			this.actions[var2 - 30] = var1.readStringCp1252NullTerminated(); // L: 97
			if (this.actions[var2 - 30].equalsIgnoreCase("Hidden")) { // L: 98
				this.actions[var2 - 30] = null;
			}
		} else if (var2 == 40) { // L: 100
			var3 = var1.readUnsignedByte(); // L: 101
			this.recolorFrom = new short[var3]; // L: 102
			this.recolorTo = new short[var3]; // L: 103

			for (var4 = 0; var4 < var3; ++var4) { // L: 104
				this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 105
				this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 106
			}
		} else if (var2 == 41) { // L: 109
			var3 = var1.readUnsignedByte(); // L: 110
			this.retextureFrom = new short[var3]; // L: 111
			this.retextureTo = new short[var3]; // L: 112

			for (var4 = 0; var4 < var3; ++var4) { // L: 113
				this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 114
				this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 115
			}
		} else if (var2 == 60) { // L: 118
			var3 = var1.readUnsignedByte(); // L: 119
			this.field3492 = new int[var3]; // L: 120

			for (var4 = 0; var4 < var3; ++var4) { // L: 121
				this.field3492[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 93) { // L: 123
			this.drawMapDot = false;
		} else if (var2 == 95) { // L: 124
			this.combatLevel = var1.readUnsignedShort();
		} else if (var2 == 97) { // L: 125
			this.widthScale = var1.readUnsignedShort();
		} else if (var2 == 98) { // L: 126
			this.heightScale = var1.readUnsignedShort();
		} else if (var2 == 99) { // L: 127
			this.isVisible = true;
		} else if (var2 == 100) { // L: 128
			this.ambient = var1.readByte();
		} else if (var2 == 101) { // L: 129
			this.contrast = var1.readByte() * 5;
		} else if (var2 == 102) { // L: 130
			this.headIconPrayer = var1.readUnsignedShort();
		} else if (var2 == 103) { // L: 131
			this.rotation = var1.readUnsignedShort();
		} else if (var2 != 106 && var2 != 118) { // L: 132
			if (var2 == 107) { // L: 150
				this.isInteractable = false;
			} else if (var2 == 109) { // L: 151
				this.isClickable = false;
			} else if (var2 == 111) { // L: 152
				this.isFollower = true;
			} else if (var2 == 249) { // L: 153
				this.params = InvDefinition.readStringIntParameters(var1, this.params);
			}
		} else {
			this.transformVarbit = var1.readUnsignedShort(); // L: 133
			if (this.transformVarbit == 65535) { // L: 134
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort(); // L: 135
			if (this.transformVarp == 65535) { // L: 136
				this.transformVarp = -1;
			}

			var3 = -1; // L: 137
			if (var2 == 118) { // L: 138
				var3 = var1.readUnsignedShort(); // L: 139
				if (var3 == 65535) { // L: 140
					var3 = -1;
				}
			}

			var4 = var1.readUnsignedByte(); // L: 142
			this.transforms = new int[var4 + 2]; // L: 143

			for (int var5 = 0; var5 <= var4; ++var5) { // L: 144
				this.transforms[var5] = var1.readUnsignedShort(); // L: 145
				if (this.transforms[var5] == 65535) { // L: 146
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3; // L: 148
		}

	} // L: 155

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljg;ILjg;II)Leh;",
		garbageValue = "2096354381"
	)
	@Export("getModel")
	public final Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.transforms != null) { // L: 158
			NPCDefinition var12 = this.transform(); // L: 159
			return var12 == null ? null : var12.getModel(var1, var2, var3, var4); // L: 160 161
		} else {
			Model var5 = (Model)NpcDefinition_cachedModels.get((long)this.id); // L: 163
			if (var5 == null) { // L: 164
				boolean var6 = false; // L: 165

				for (int var7 = 0; var7 < this.models.length; ++var7) { // L: 166
					if (!NpcDefinition_modelArchive.tryLoadFile(this.models[var7], 0)) {
						var6 = true;
					}
				}

				if (var6) { // L: 167
					return null;
				}

				ModelData[] var8 = new ModelData[this.models.length]; // L: 169

				int var9;
				for (var9 = 0; var9 < this.models.length; ++var9) { // L: 170
					var8[var9] = ModelData.ModelData_get(NpcDefinition_modelArchive, this.models[var9], 0);
				}

				ModelData var10;
				if (var8.length == 1) { // L: 171
					var10 = var8[0];
				} else {
					var10 = new ModelData(var8, var8.length); // L: 172
				}

				if (this.recolorFrom != null) { // L: 173
					for (var9 = 0; var9 < this.recolorFrom.length; ++var9) { // L: 174
						var10.recolor(this.recolorFrom[var9], this.recolorTo[var9]); // L: 175
					}
				}

				if (this.retextureFrom != null) { // L: 178
					for (var9 = 0; var9 < this.retextureFrom.length; ++var9) { // L: 179
						var10.retexture(this.retextureFrom[var9], this.retextureTo[var9]); // L: 180
					}
				}

				var5 = var10.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30); // L: 183
				NpcDefinition_cachedModels.put(var5, (long)this.id); // L: 184
			}

			Model var11;
			if (var1 != null && var3 != null) { // L: 187
				var11 = var1.applyTransformations(var5, var2, var3, var4);
			} else if (var1 != null) { // L: 188
				var11 = var1.transformActorModel(var5, var2);
			} else if (var3 != null) { // L: 189
				var11 = var3.transformActorModel(var5, var4);
			} else {
				var11 = var5.toSharedSequenceModel(true); // L: 190
			}

			if (this.widthScale != 128 || this.heightScale != 128) { // L: 191
				var11.scale(this.widthScale, this.heightScale, this.widthScale);
			}

			return var11; // L: 192
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Len;",
		garbageValue = "17"
	)
	@Export("getModelData")
	public final ModelData getModelData() {
		if (this.transforms != null) { // L: 196
			NPCDefinition var7 = this.transform(); // L: 197
			return var7 == null ? null : var7.getModelData(); // L: 198 199
		} else if (this.field3492 == null) { // L: 201
			return null;
		} else {
			boolean var1 = false; // L: 202

			for (int var2 = 0; var2 < this.field3492.length; ++var2) { // L: 203
				if (!NpcDefinition_modelArchive.tryLoadFile(this.field3492[var2], 0)) {
					var1 = true;
				}
			}

			if (var1) { // L: 204
				return null;
			} else {
				ModelData[] var5 = new ModelData[this.field3492.length]; // L: 205

				for (int var3 = 0; var3 < this.field3492.length; ++var3) { // L: 206
					var5[var3] = ModelData.ModelData_get(NpcDefinition_modelArchive, this.field3492[var3], 0);
				}

				ModelData var6;
				if (var5.length == 1) {
					var6 = var5[0]; // L: 208
				} else {
					var6 = new ModelData(var5, var5.length); // L: 209
				}

				int var4;
				if (this.recolorFrom != null) { // L: 210
					for (var4 = 0; var4 < this.recolorFrom.length; ++var4) { // L: 211
						var6.recolor(this.recolorFrom[var4], this.recolorTo[var4]); // L: 212
					}
				}

				if (this.retextureFrom != null) { // L: 215
					for (var4 = 0; var4 < this.retextureFrom.length; ++var4) { // L: 216
						var6.retexture(this.retextureFrom[var4], this.retextureTo[var4]); // L: 217
					}
				}

				return var6; // L: 220
			}
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Ljn;",
		garbageValue = "275766044"
	)
	@Export("transform")
	public final NPCDefinition transform() {
		int var1 = -1; // L: 224
		if (this.transformVarbit != -1) { // L: 225
			var1 = ApproximateRouteStrategy.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 226
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 228
			var2 = this.transforms[var1]; // L: 229
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? Clock.getNpcDefinition(var2) : null; // L: 230 231
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2069847739"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) { // L: 235
			return true;
		} else {
			int var1 = -1; // L: 236
			if (this.transformVarbit != -1) { // L: 237
				var1 = ApproximateRouteStrategy.getVarbit(this.transformVarbit);
			} else if (this.transformVarp != -1) { // L: 238
				var1 = Varps.Varps_main[this.transformVarp];
			}

			if (var1 >= 0 && var1 < this.transforms.length) { // L: 239
				return this.transforms[var1] != -1; // L: 240
			} else {
				return this.transforms[this.transforms.length - 1] != -1;
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "54"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params; // L: 245
		int var3;
		if (var4 == null) { // L: 247
			var3 = var2; // L: 248
		} else {
			IntegerNode var5 = (IntegerNode)var4.get((long)var1); // L: 251
			if (var5 == null) { // L: 252
				var3 = var2; // L: 253
			} else {
				var3 = var5.integer; // L: 256
			}
		}

		return var3; // L: 258
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1966664867"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return WorldMapSection0.method307(this.params, var1, var2); // L: 262
	}
}
