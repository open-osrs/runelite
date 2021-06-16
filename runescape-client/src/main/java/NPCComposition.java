import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ev")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("NpcDefinition_archive")
	public static AbstractArchive NpcDefinition_archive;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("NpcDefinition_modelArchive")
	public static AbstractArchive NpcDefinition_modelArchive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("NpcDefinition_cached")
	static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("NpcDefinition_cachedModels")
	static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "[Loa;"
	)
	@Export("crossSprites")
	static SpritePixels[] crossSprites;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 524920995
	)
	@Export("id")
	public int id;
	@ObfuscatedName("o")
	@Export("name")
	public String name;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -382124903
	)
	@Export("size")
	public int size;
	@ObfuscatedName("r")
	@Export("models")
	int[] models;
	@ObfuscatedName("h")
	int[] field1644;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1765271701
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1898618439
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 2020012415
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -941027459
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1631754867
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1695340251
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1096930091
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("x")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("u")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("q")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("s")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("p")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("c")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 880136129
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -759959591
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1143359783
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("a")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 210983141
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -2083023515
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 2052657801
	)
	@Export("headIconPrayer")
	public int headIconPrayer;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1072203595
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("ah")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1263939441
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 2131435543
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("ag")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("ab")
	@Export("isClickable")
	public boolean isClickable;
	@ObfuscatedName("aq")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1067902872"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 68

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnt;B)V",
		garbageValue = "-22"
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

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lnt;IB)V",
		garbageValue = "124"
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
		} else if (var2 == 18) { // L: 96
			var1.readUnsignedShort(); // L: 97
		} else if (var2 >= 30 && var2 < 35) { // L: 99
			this.actions[var2 - 30] = var1.readStringCp1252NullTerminated(); // L: 100
			if (this.actions[var2 - 30].equalsIgnoreCase("Hidden")) { // L: 101
				this.actions[var2 - 30] = null;
			}
		} else if (var2 == 40) { // L: 103
			var3 = var1.readUnsignedByte(); // L: 104
			this.recolorFrom = new short[var3]; // L: 105
			this.recolorTo = new short[var3]; // L: 106

			for (var4 = 0; var4 < var3; ++var4) { // L: 107
				this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 108
				this.recolorTo[var4] = (short)var1.readUnsignedShort();
			}
		} else if (var2 == 41) { // L: 112
			var3 = var1.readUnsignedByte(); // L: 113
			this.retextureFrom = new short[var3]; // L: 114
			this.retextureTo = new short[var3]; // L: 115

			for (var4 = 0; var4 < var3; ++var4) { // L: 116
				this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 117
				this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 118
			}
		} else if (var2 == 60) { // L: 121
			var3 = var1.readUnsignedByte(); // L: 122
			this.field1644 = new int[var3]; // L: 123

			for (var4 = 0; var4 < var3; ++var4) { // L: 124
				this.field1644[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 93) { // L: 126
			this.drawMapDot = false;
		} else if (var2 == 95) { // L: 127
			this.combatLevel = var1.readUnsignedShort();
		} else if (var2 == 97) { // L: 128
			this.widthScale = var1.readUnsignedShort();
		} else if (var2 == 98) { // L: 129
			this.heightScale = var1.readUnsignedShort();
		} else if (var2 == 99) { // L: 130
			this.isVisible = true;
		} else if (var2 == 100) { // L: 131
			this.ambient = var1.readByte();
		} else if (var2 == 101) { // L: 132
			this.contrast = var1.readByte() * 5;
		} else if (var2 == 102) { // L: 133
			this.headIconPrayer = var1.readUnsignedShort();
		} else if (var2 == 103) { // L: 134
			this.rotation = var1.readUnsignedShort();
		} else if (var2 != 106 && var2 != 118) { // L: 135
			if (var2 == 107) { // L: 153
				this.isInteractable = false;
			} else if (var2 == 109) { // L: 154
				this.isClickable = false;
			} else if (var2 == 111) { // L: 155
				this.isFollower = true;
			} else if (var2 == 249) { // L: 156
				this.params = class19.readStringIntParameters(var1, this.params);
			}
		} else {
			this.transformVarbit = var1.readUnsignedShort(); // L: 136
			if (this.transformVarbit == 65535) {
				this.transformVarbit = -1; // L: 137
			}

			this.transformVarp = var1.readUnsignedShort(); // L: 138
			if (this.transformVarp == 65535) { // L: 139
				this.transformVarp = -1;
			}

			var3 = -1; // L: 140
			if (var2 == 118) { // L: 141
				var3 = var1.readUnsignedShort(); // L: 142
				if (var3 == 65535) { // L: 143
					var3 = -1;
				}
			}

			var4 = var1.readUnsignedByte(); // L: 145
			this.transforms = new int[var4 + 2]; // L: 146

			for (int var5 = 0; var5 <= var4; ++var5) { // L: 147
				this.transforms[var5] = var1.readUnsignedShort(); // L: 148
				if (this.transforms[var5] == 65535) { // L: 149
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3; // L: 151
		}

	} // L: 158

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lfm;ILfm;IB)Lgd;",
		garbageValue = "1"
	)
	@Export("getModel")
	public final Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.transforms != null) { // L: 161
			NPCComposition var12 = this.transform(); // L: 162
			return var12 == null ? null : var12.getModel(var1, var2, var3, var4); // L: 163 164
		} else {
			Model var5 = (Model)NpcDefinition_cachedModels.get((long)this.id); // L: 166
			if (var5 == null) { // L: 167
				boolean var6 = false; // L: 168

				for (int var7 = 0; var7 < this.models.length; ++var7) { // L: 169
					if (!NpcDefinition_modelArchive.tryLoadFile(this.models[var7], 0)) {
						var6 = true;
					}
				}

				if (var6) { // L: 170
					return null;
				}

				ModelData[] var8 = new ModelData[this.models.length]; // L: 172

				int var9;
				for (var9 = 0; var9 < this.models.length; ++var9) { // L: 173
					var8[var9] = ModelData.ModelData_get(NpcDefinition_modelArchive, this.models[var9], 0);
				}

				ModelData var10;
				if (var8.length == 1) { // L: 174
					var10 = var8[0];
				} else {
					var10 = new ModelData(var8, var8.length); // L: 175
				}

				if (this.recolorFrom != null) { // L: 176
					for (var9 = 0; var9 < this.recolorFrom.length; ++var9) { // L: 177
						var10.recolor(this.recolorFrom[var9], this.recolorTo[var9]); // L: 178
					}
				}

				if (this.retextureFrom != null) { // L: 181
					for (var9 = 0; var9 < this.retextureFrom.length; ++var9) { // L: 182
						var10.retexture(this.retextureFrom[var9], this.retextureTo[var9]); // L: 183
					}
				}

				var5 = var10.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30); // L: 186
				NpcDefinition_cachedModels.put(var5, (long)this.id); // L: 187
			}

			Model var11;
			if (var1 != null && var3 != null) {
				var11 = var1.applyTransformations(var5, var2, var3, var4);
			} else if (var1 != null) {
				var11 = var1.transformActorModel(var5, var2);
			} else if (var3 != null) {
				var11 = var3.transformActorModel(var5, var4);
			} else {
				var11 = var5.toSharedSequenceModel(true);
			}

			if (this.widthScale != 128 || this.heightScale != 128) {
				var11.scale(this.widthScale, this.heightScale, this.widthScale);
			}

			return var11;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Lga;",
		garbageValue = "936474541"
	)
	@Export("getModelData")
	public final ModelData getModelData() {
		if (this.transforms != null) { // L: 199
			NPCComposition var7 = this.transform(); // L: 200
			return var7 == null ? null : var7.getModelData(); // L: 201 202
		} else if (this.field1644 == null) { // L: 204
			return null;
		} else {
			boolean var1 = false; // L: 205

			for (int var2 = 0; var2 < this.field1644.length; ++var2) { // L: 206
				if (!NpcDefinition_modelArchive.tryLoadFile(this.field1644[var2], 0)) {
					var1 = true;
				}
			}

			if (var1) { // L: 207
				return null;
			} else {
				ModelData[] var5 = new ModelData[this.field1644.length]; // L: 208

				for (int var3 = 0; var3 < this.field1644.length; ++var3) { // L: 209
					var5[var3] = ModelData.ModelData_get(NpcDefinition_modelArchive, this.field1644[var3], 0);
				}

				ModelData var6;
				if (var5.length == 1) {
					var6 = var5[0]; // L: 211
				} else {
					var6 = new ModelData(var5, var5.length); // L: 212
				}

				int var4;
				if (this.recolorFrom != null) { // L: 213
					for (var4 = 0; var4 < this.recolorFrom.length; ++var4) { // L: 214
						var6.recolor(this.recolorFrom[var4], this.recolorTo[var4]); // L: 215
					}
				}

				if (this.retextureFrom != null) { // L: 218
					for (var4 = 0; var4 < this.retextureFrom.length; ++var4) { // L: 219
						var6.retexture(this.retextureFrom[var4], this.retextureTo[var4]); // L: 220
					}
				}

				return var6; // L: 223
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Lev;",
		garbageValue = "1438500977"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1; // L: 227
		if (this.transformVarbit != -1) { // L: 228
			var1 = ScriptFrame.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 229
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 231
			var2 = this.transforms[var1]; // L: 232
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class248.getNpcDefinition(var2) : null; // L: 233 234
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-263969679"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) { // L: 238
			return true;
		} else {
			int var1 = -1; // L: 239
			if (this.transformVarbit != -1) { // L: 240
				var1 = ScriptFrame.getVarbit(this.transformVarbit);
			} else if (this.transformVarp != -1) { // L: 241
				var1 = Varps.Varps_main[this.transformVarp];
			}

			if (var1 >= 0 && var1 < this.transforms.length) { // L: 242
				return this.transforms[var1] != -1; // L: 243
			} else {
				return this.transforms[this.transforms.length - 1] != -1;
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "121544801"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params; // L: 248
		int var3;
		if (var4 == null) { // L: 250
			var3 = var2; // L: 251
		} else {
			IntegerNode var5 = (IntegerNode)var4.get((long)var1); // L: 254
			if (var5 == null) { // L: 255
				var3 = var2; // L: 256
			} else {
				var3 = var5.integer; // L: 259
			}
		}

		return var3; // L: 261
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-2089556399"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return WorldMapElement.method2742(this.params, var1, var2); // L: 265
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljp;Ljp;Ljp;I)V",
		garbageValue = "1926659100"
	)
	public static void method2868(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, AbstractArchive var3) {
		AttackOption.Widget_archive = var0; // L: 190
		class375.Widget_modelsArchive = var1; // L: 191
		class44.Widget_spritesArchive = var2; // L: 192
		ChatChannel.Widget_fontsArchive = var3; // L: 193
		GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents = new Widget[AttackOption.Widget_archive.getGroupCount()][]; // L: 194
		Widget.Widget_loadedInterfaces = new boolean[AttackOption.Widget_archive.getGroupCount()]; // L: 195
	} // L: 196

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "4"
	)
	public static int method2841(int var0, int var1) {
		int var2 = var0 >>> 31; // L: 109
		return (var0 + var2) / var1 - var2; // L: 110
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "-355441861"
	)
	static int method2857(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == ScriptOpcodes.ADD) { // L: 2784
			ChatChannel.Interpreter_intStackSize -= 2; // L: 2785
			var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 2786
			var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 2787
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3 + var4; // L: 2788
			return 1; // L: 2789
		} else if (var0 == ScriptOpcodes.SUB) { // L: 2791
			ChatChannel.Interpreter_intStackSize -= 2; // L: 2792
			var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 2793
			var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 2794
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3 - var4; // L: 2795
			return 1; // L: 2796
		} else if (var0 == ScriptOpcodes.MULTIPLY) { // L: 2798
			ChatChannel.Interpreter_intStackSize -= 2; // L: 2799
			var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 2800
			var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 2801
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3 * var4; // L: 2802
			return 1; // L: 2803
		} else if (var0 == ScriptOpcodes.DIV) { // L: 2805
			ChatChannel.Interpreter_intStackSize -= 2; // L: 2806
			var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 2807
			var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 2808
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3 / var4; // L: 2809
			return 1; // L: 2810
		} else if (var0 == ScriptOpcodes.RANDOM) { // L: 2812
			var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2813
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var3); // L: 2814
			return 1; // L: 2815
		} else if (var0 == ScriptOpcodes.RANDOMINC) { // L: 2817
			var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2818
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var3 + 1)); // L: 2819
			return 1; // L: 2820
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) { // L: 2822
				ChatChannel.Interpreter_intStackSize -= 5; // L: 2823
				var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 2824
				var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 2825
				var5 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 2]; // L: 2826
				var6 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 3]; // L: 2827
				var7 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 4]; // L: 2828
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3 + (var7 - var5) * (var4 - var3) / (var6 - var5); // L: 2829
				return 1; // L: 2830
			} else if (var0 == ScriptOpcodes.ADDPERCENT) { // L: 2832
				ChatChannel.Interpreter_intStackSize -= 2; // L: 2833
				var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 2834
				var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 2835
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3 + var3 * var4 / 100; // L: 2836
				return 1; // L: 2837
			} else if (var0 == ScriptOpcodes.SETBIT) { // L: 2839
				ChatChannel.Interpreter_intStackSize -= 2; // L: 2840
				var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 2841
				var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 2842
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3 | 1 << var4; // L: 2843
				return 1; // L: 2844
			} else if (var0 == ScriptOpcodes.CLEARBIT) { // L: 2846
				ChatChannel.Interpreter_intStackSize -= 2; // L: 2847
				var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 2848
				var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 2849
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3 & -1 - (1 << var4); // L: 2850
				return 1; // L: 2851
			} else if (var0 == ScriptOpcodes.TESTBIT) { // L: 2853
				ChatChannel.Interpreter_intStackSize -= 2; // L: 2854
				var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 2855
				var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 2856
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = (var3 & 1 << var4) != 0 ? 1 : 0; // L: 2857
				return 1; // L: 2858
			} else if (var0 == ScriptOpcodes.MOD) { // L: 2860
				ChatChannel.Interpreter_intStackSize -= 2; // L: 2861
				var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 2862
				var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 2863
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3 % var4; // L: 2864
				return 1; // L: 2865
			} else if (var0 == ScriptOpcodes.POW) { // L: 2867
				ChatChannel.Interpreter_intStackSize -= 2; // L: 2868
				var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 2869
				var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 2870
				if (var3 == 0) { // L: 2871
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, (double)var4); // L: 2872
				}

				return 1; // L: 2873
			} else if (var0 == ScriptOpcodes.INVPOW) { // L: 2875
				ChatChannel.Interpreter_intStackSize -= 2; // L: 2876
				var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 2877
				var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 2878
				if (var3 == 0) { // L: 2879
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 2880
					return 1; // L: 2881
				} else {
					switch(var4) { // L: 2883
					case 0:
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Integer.MAX_VALUE; // L: 2896
						break; // L: 2897
					case 1:
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3; // L: 2906
						break; // L: 2907
					case 2:
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var3); // L: 2886
						break;
					case 3:
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var3); // L: 2891
						break; // L: 2892
					case 4:
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var3)); // L: 2901
						break; // L: 2902
					default:
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, 1.0D / (double)var4); // L: 2911
					}

					return 1; // L: 2915
				}
			} else if (var0 == ScriptOpcodes.AND) { // L: 2917
				ChatChannel.Interpreter_intStackSize -= 2; // L: 2918
				var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 2919
				var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 2920
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3 & var4; // L: 2921
				return 1; // L: 2922
			} else if (var0 == ScriptOpcodes.OR) { // L: 2924
				ChatChannel.Interpreter_intStackSize -= 2; // L: 2925
				var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 2926
				var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 2927
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3 | var4; // L: 2928
				return 1; // L: 2929
			} else if (var0 == ScriptOpcodes.SCALE) { // L: 2931
				ChatChannel.Interpreter_intStackSize -= 3; // L: 2932
				long var9 = (long)Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 2933
				long var11 = (long)Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 2934
				long var13 = (long)Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 2]; // L: 2935
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = (int)(var9 * var13 / var11); // L: 2936
				return 1; // L: 2937
			} else if (var0 == ScriptOpcodes.BITCOUNT) { // L: 2939
				var3 = class269.method4992(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]); // L: 2940
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3; // L: 2941
				return 1; // L: 2942
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) { // L: 2944
				ChatChannel.Interpreter_intStackSize -= 2; // L: 2945
				var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 2946
				var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 2947
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3 ^ 1 << var4; // L: 2948
				return 1; // L: 2949
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) { // L: 2951
				ChatChannel.Interpreter_intStackSize -= 3; // L: 2952
				var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 2953
				var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 2954
				var5 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 2]; // L: 2955
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = WorldMapLabel.method3714(var3, var4, var5); // L: 2956
				return 1; // L: 2957
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) { // L: 2959
				ChatChannel.Interpreter_intStackSize -= 3; // L: 2960
				var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 2961
				var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 2962
				var5 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 2]; // L: 2963
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = AbstractWorldMapIcon.method3785(var3, var4, var5); // L: 2964
				return 1; // L: 2965
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) { // L: 2967
				ChatChannel.Interpreter_intStackSize -= 3; // L: 2968
				var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 2969
				var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 2970
				var5 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 2]; // L: 2971
				var6 = 31 - var5; // L: 2972
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3 << var6 >>> var6 + var4; // L: 2973
				return 1; // L: 2974
			} else if (var0 == 4030) { // L: 2976
				ChatChannel.Interpreter_intStackSize -= 4; // L: 2977
				var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 2978
				var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 2979
				var5 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 2]; // L: 2980
				var6 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 3]; // L: 2981
				var3 = AbstractWorldMapIcon.method3785(var3, var5, var6); // L: 2982
				var7 = UserComparator2.method6890(var6 - var5 + 1); // L: 2983
				if (var4 > var7) { // L: 2984
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3 | var4 << var5; // L: 2985
				return 1; // L: 2986
			} else {
				return 2; // L: 2988
			}
		}
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-5"
	)
	static final void method2882(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 11138
		class4.clientPreferences.areaSoundEffectsVolume = var0; // L: 11139
		Actor.savePreferences(); // L: 11140
	} // L: 11141
}
