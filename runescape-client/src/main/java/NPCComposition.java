import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jd")
@Implements("NPCDefinition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	@Export("NpcDefinition_archive")
	static AbstractArchive NpcDefinition_archive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	@Export("NpcDefinition_modelArchive")
	static AbstractArchive NpcDefinition_modelArchive;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	@Export("NpcDefinition_cached")
	static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	@Export("NpcDefinition_cachedModels")
	static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1827419891
	)
	@Export("id")
	public int id;
	@ObfuscatedName("j")
	@Export("name")
	public String name;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1550442265
	)
	@Export("size")
	public int size;
	@ObfuscatedName("p")
	@Export("models")
	int[] models;
	@ObfuscatedName("l")
	int[] field3502;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 336574561
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -673738421
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -884212635
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -497441899
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1479864431
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1205423787
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -948681777
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("a")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("b")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("y")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("r")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("q")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("g")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1734384763
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 2070711827
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1419724991
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("d")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -493625907
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1808853841
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -185118159
	)
	@Export("headIconPrayer")
	public int headIconPrayer;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -46619171
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("au")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1883823959
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1506306671
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("ac")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("ak")
	@Export("isClickable")
	public boolean isClickable;
	@ObfuscatedName("av")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lla;"
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1458839985"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 73

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lkj;I)V",
		garbageValue = "-174515624"
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

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lkj;IB)V",
		garbageValue = "-100"
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
		} else if (var2 >= 30 && var2 < 35) { // L: 101
			this.actions[var2 - 30] = var1.readStringCp1252NullTerminated(); // L: 102
			if (this.actions[var2 - 30].equalsIgnoreCase("Hidden")) { // L: 103
				this.actions[var2 - 30] = null;
			}
		} else if (var2 == 40) { // L: 105
			var3 = var1.readUnsignedByte(); // L: 106
			this.recolorFrom = new short[var3]; // L: 107
			this.recolorTo = new short[var3]; // L: 108

			for (var4 = 0; var4 < var3; ++var4) { // L: 109
				this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 110
				this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 111
			}
		} else if (var2 == 41) { // L: 114
			var3 = var1.readUnsignedByte(); // L: 115
			this.retextureFrom = new short[var3]; // L: 116
			this.retextureTo = new short[var3]; // L: 117

			for (var4 = 0; var4 < var3; ++var4) { // L: 118
				this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 119
				this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 120
			}
		} else if (var2 == 60) { // L: 123
			var3 = var1.readUnsignedByte(); // L: 124
			this.field3502 = new int[var3]; // L: 125

			for (var4 = 0; var4 < var3; ++var4) { // L: 126
				this.field3502[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 93) { // L: 128
			this.drawMapDot = false;
		} else if (var2 == 95) { // L: 129
			this.combatLevel = var1.readUnsignedShort();
		} else if (var2 == 97) { // L: 130
			this.widthScale = var1.readUnsignedShort();
		} else if (var2 == 98) { // L: 131
			this.heightScale = var1.readUnsignedShort();
		} else if (var2 == 99) { // L: 132
			this.isVisible = true;
		} else if (var2 == 100) { // L: 133
			this.ambient = var1.readByte();
		} else if (var2 == 101) { // L: 134
			this.contrast = var1.readByte() * 5;
		} else if (var2 == 102) { // L: 135
			this.headIconPrayer = var1.readUnsignedShort();
		} else if (var2 == 103) { // L: 136
			this.rotation = var1.readUnsignedShort();
		} else if (var2 != 106 && var2 != 118) { // L: 137
			if (var2 == 107) { // L: 155
				this.isInteractable = false;
			} else if (var2 == 109) { // L: 156
				this.isClickable = false;
			} else if (var2 == 111) { // L: 157
				this.isFollower = true;
			} else if (var2 == 249) { // L: 158
				this.params = NetSocket.readStringIntParameters(var1, this.params);
			}
		} else {
			this.transformVarbit = var1.readUnsignedShort(); // L: 138
			if (this.transformVarbit == 65535) { // L: 139
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort(); // L: 140
			if (this.transformVarp == 65535) { // L: 141
				this.transformVarp = -1;
			}

			var3 = -1; // L: 142
			if (var2 == 118) { // L: 143
				var3 = var1.readUnsignedShort(); // L: 144
				if (var3 == 65535) { // L: 145
					var3 = -1;
				}
			}

			var4 = var1.readUnsignedByte(); // L: 147
			this.transforms = new int[var4 + 2]; // L: 148

			for (int var5 = 0; var5 <= var4; ++var5) { // L: 149
				this.transforms[var5] = var1.readUnsignedShort(); // L: 150
				if (this.transforms[var5] == 65535) { // L: 151
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3; // L: 153
		}

	} // L: 160

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljy;ILjy;IB)Leh;",
		garbageValue = "86"
	)
	@Export("getModel")
	public final Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.transforms != null) { // L: 163
			NPCComposition var12 = this.transform(); // L: 164
			return var12 == null ? null : var12.getModel(var1, var2, var3, var4); // L: 165 166
		} else {
			Model var5 = (Model)NpcDefinition_cachedModels.get((long)this.id); // L: 168
			if (var5 == null) { // L: 169
				boolean var6 = false; // L: 170

				for (int var7 = 0; var7 < this.models.length; ++var7) { // L: 171
					if (!NpcDefinition_modelArchive.tryLoadFile(this.models[var7], 0)) {
						var6 = true;
					}
				}

				if (var6) { // L: 172
					return null;
				}

				ModelData[] var8 = new ModelData[this.models.length]; // L: 174

				int var9;
				for (var9 = 0; var9 < this.models.length; ++var9) { // L: 175
					var8[var9] = ModelData.ModelData_get(NpcDefinition_modelArchive, this.models[var9], 0);
				}

				ModelData var10;
				if (var8.length == 1) { // L: 176
					var10 = var8[0];
				} else {
					var10 = new ModelData(var8, var8.length); // L: 177
				}

				if (this.recolorFrom != null) { // L: 178
					for (var9 = 0; var9 < this.recolorFrom.length; ++var9) { // L: 179
						var10.recolor(this.recolorFrom[var9], this.recolorTo[var9]); // L: 180
					}
				}

				if (this.retextureFrom != null) { // L: 183
					for (var9 = 0; var9 < this.retextureFrom.length; ++var9) { // L: 184
						var10.retexture(this.retextureFrom[var9], this.retextureTo[var9]); // L: 185
					}
				}

				var5 = var10.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30); // L: 188
				NpcDefinition_cachedModels.put(var5, (long)this.id); // L: 189
			}

			Model var11;
			if (var1 != null && var3 != null) { // L: 192
				var11 = var1.applyTransformations(var5, var2, var3, var4);
			} else if (var1 != null) { // L: 193
				var11 = var1.transformActorModel(var5, var2);
			} else if (var3 != null) { // L: 194
				var11 = var3.transformActorModel(var5, var4);
			} else {
				var11 = var5.toSharedSequenceModel(true); // L: 195
			}

			if (this.widthScale != 128 || this.heightScale != 128) { // L: 196
				var11.scale(this.widthScale, this.heightScale, this.widthScale);
			}

			return var11; // L: 197
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Les;",
		garbageValue = "-1865075990"
	)
	@Export("getModelData")
	public final ModelData getModelData() {
		if (this.transforms != null) { // L: 201
			NPCComposition var7 = this.transform(); // L: 202
			return var7 == null ? null : var7.getModelData(); // L: 203 204
		} else if (this.field3502 == null) { // L: 206
			return null;
		} else {
			boolean var1 = false; // L: 207

			for (int var2 = 0; var2 < this.field3502.length; ++var2) { // L: 208
				if (!NpcDefinition_modelArchive.tryLoadFile(this.field3502[var2], 0)) {
					var1 = true;
				}
			}

			if (var1) { // L: 209
				return null;
			} else {
				ModelData[] var5 = new ModelData[this.field3502.length]; // L: 210

				for (int var3 = 0; var3 < this.field3502.length; ++var3) { // L: 211
					var5[var3] = ModelData.ModelData_get(NpcDefinition_modelArchive, this.field3502[var3], 0);
				}

				ModelData var6;
				if (var5.length == 1) {
					var6 = var5[0]; // L: 213
				} else {
					var6 = new ModelData(var5, var5.length); // L: 214
				}

				int var4;
				if (this.recolorFrom != null) { // L: 215
					for (var4 = 0; var4 < this.recolorFrom.length; ++var4) { // L: 216
						var6.recolor(this.recolorFrom[var4], this.recolorTo[var4]); // L: 217
					}
				}

				if (this.retextureFrom != null) { // L: 220
					for (var4 = 0; var4 < this.retextureFrom.length; ++var4) { // L: 221
						var6.retexture(this.retextureFrom[var4], this.retextureTo[var4]); // L: 222
					}
				}

				return var6; // L: 225
			}
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)Ljd;",
		garbageValue = "-51"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1; // L: 229
		if (this.transformVarbit != -1) { // L: 230
			var1 = Coord.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 231
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 233
			var2 = this.transforms[var1]; // L: 234
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? WorldMapIcon_0.getNpcDefinition(var2) : null; // L: 235 236
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1926927124"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) { // L: 240
			return true;
		} else {
			int var1 = -1; // L: 241
			if (this.transformVarbit != -1) { // L: 242
				var1 = Coord.getVarbit(this.transformVarbit);
			} else if (this.transformVarp != -1) { // L: 243
				var1 = Varps.Varps_main[this.transformVarp];
			}

			if (var1 >= 0 && var1 < this.transforms.length) { // L: 244
				return this.transforms[var1] != -1; // L: 245
			} else {
				return this.transforms[this.transforms.length - 1] != -1;
			}
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "2117097592"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params; // L: 250
		int var3;
		if (var4 == null) { // L: 252
			var3 = var2; // L: 253
		} else {
			IntegerNode var5 = (IntegerNode)var4.get((long)var1); // L: 256
			if (var5 == null) { // L: 257
				var3 = var2; // L: 258
			} else {
				var3 = var5.integer; // L: 261
			}
		}

		return var3; // L: 263
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1136396836"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params; // L: 268
		String var3;
		if (var4 == null) { // L: 270
			var3 = var2; // L: 271
		} else {
			ObjectNode var5 = (ObjectNode)var4.get((long)var1); // L: 274
			if (var5 == null) { // L: 275
				var3 = var2; // L: 276
			} else {
				var3 = (String)var5.obj; // L: 279
			}
		}

		return var3; // L: 281
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1068618315"
	)
	static final void method4759(int var0) {
		if (class41.loadInterface(var0)) { // L: 10591
			Skeleton.drawModelComponents(class9.Widget_interfaceComponents[var0], -1); // L: 10592
		}
	} // L: 10593
}
