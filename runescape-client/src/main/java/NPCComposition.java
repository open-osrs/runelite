import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ey")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("NpcDefinition_archive")
	public static AbstractArchive NpcDefinition_archive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("NpcDefinition_modelArchive")
	public static AbstractArchive NpcDefinition_modelArchive;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("NpcDefinition_cached")
	static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("NpcDefinition_cachedModels")
	static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("hoveredItemContainer")
	static Widget hoveredItemContainer;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1784023543
	)
	@Export("id")
	public int id;
	@ObfuscatedName("z")
	@Export("name")
	public String name;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1638336549
	)
	@Export("size")
	public int size;
	@ObfuscatedName("v")
	@Export("models")
	int[] models;
	@ObfuscatedName("b")
	int[] field1642;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 667265637
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 436341475
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1285622519
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1275856501
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 736514543
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -72987535
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1373331391
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("e")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("d")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("u")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("m")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("j")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("f")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 212636383
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 2045757013
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -139544959
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("n")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -466195845
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1035732171
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -879137791
	)
	@Export("headIconPrayer")
	public int headIconPrayer;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1545649603
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("aw")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1245131695
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 709359433
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("al")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("ap")
	@Export("isClickable")
	public boolean isClickable;
	@ObfuscatedName("am")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("ax")
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "575744744"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 68

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "-516960834"
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lnk;II)V",
		garbageValue = "-1956707108"
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
				this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 109
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
			this.field1642 = new int[var3]; // L: 123

			for (var4 = 0; var4 < var3; ++var4) { // L: 124
				this.field1642[var4] = var1.readUnsignedShort();
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
				this.params = HealthBar.readStringIntParameters(var1, this.params);
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lfb;ILfb;II)Lgj;",
		garbageValue = "1245322712"
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
			if (var1 != null && var3 != null) { // L: 190
				var11 = var1.applyTransformations(var5, var2, var3, var4);
			} else if (var1 != null) { // L: 191
				var11 = var1.transformActorModel(var5, var2);
			} else if (var3 != null) { // L: 192
				var11 = var3.transformActorModel(var5, var4);
			} else {
				var11 = var5.toSharedSequenceModel(true); // L: 193
			}

			if (this.widthScale != 128 || this.heightScale != 128) { // L: 194
				var11.scale(this.widthScale, this.heightScale, this.widthScale);
			}

			return var11; // L: 195
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Lgk;",
		garbageValue = "-45308681"
	)
	@Export("getModelData")
	public final ModelData getModelData() {
		if (this.transforms != null) { // L: 199
			NPCComposition var7 = this.transform(); // L: 200
			return var7 == null ? null : var7.getModelData(); // L: 201 202
		} else if (this.field1642 == null) { // L: 204
			return null;
		} else {
			boolean var1 = false; // L: 205

			for (int var2 = 0; var2 < this.field1642.length; ++var2) { // L: 206
				if (!NpcDefinition_modelArchive.tryLoadFile(this.field1642[var2], 0)) {
					var1 = true;
				}
			}

			if (var1) { // L: 207
				return null;
			} else {
				ModelData[] var5 = new ModelData[this.field1642.length]; // L: 208

				for (int var3 = 0; var3 < this.field1642.length; ++var3) { // L: 209
					var5[var3] = ModelData.ModelData_get(NpcDefinition_modelArchive, this.field1642[var3], 0);
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

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Ley;",
		garbageValue = "-475318325"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1; // L: 227
		if (this.transformVarbit != -1) { // L: 228
			var1 = ObjectComposition.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 229
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 231
			var2 = this.transforms[var1]; // L: 232
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class8.getNpcDefinition(var2) : null; // L: 233 234
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-903840231"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) { // L: 238
			return true;
		} else {
			int var1 = -1; // L: 239
			if (this.transformVarbit != -1) { // L: 240
				var1 = ObjectComposition.getVarbit(this.transformVarbit);
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

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1401953801"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return GraphicsObject.method1937(this.params, var1, var2); // L: 247
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1650549866"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return Varcs.method2326(this.params, var1, var2); // L: 251
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZI)I",
		garbageValue = "2096258072"
	)
	static int method2744(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) { // L: 2604
			var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 2605
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type(); // L: 2606
			return 1; // L: 2607
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) { // L: 2609
			var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 2610
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id; // L: 2611
			return 1; // L: 2612
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) { // L: 2614
			var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 2615
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice; // L: 2616
			return 1; // L: 2617
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) { // L: 2619
			var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 2620
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity; // L: 2621
			return 1; // L: 2622
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) { // L: 2624
			var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 2625
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity; // L: 2626
			return 1; // L: 2627
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) { // L: 2629
			var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 2630
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice; // L: 2631
			return 1; // L: 2632
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) { // L: 2634
				var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 2635
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2636
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0; // L: 2637
				return 1; // L: 2638
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) { // L: 2640
				var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 2641
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2642
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0; // L: 2643
				return 1; // L: 2644
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) { // L: 2646
				var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 2647
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2648
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0; // L: 2649
				return 1; // L: 2650
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) { // L: 2652
				var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 2653
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2654
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0; // L: 2655
				return 1; // L: 2656
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) { // L: 2658
					var12 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 2659
					if (class29.grandExchangeEvents != null) { // L: 2660
						class29.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12); // L: 2661
					}

					return 1; // L: 2663
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) { // L: 2665
					var12 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 2666
					if (class29.grandExchangeEvents != null) { // L: 2667
						class29.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12); // L: 2668
					}

					return 1; // L: 2670
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) { // L: 2672
					WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 2673
					var12 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 2674
					boolean var11 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1] == 1; // L: 2675
					if (class29.grandExchangeEvents != null) { // L: 2676
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11; // L: 2677
						class29.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12); // L: 2678
					}

					return 1; // L: 2680
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) { // L: 2682
					var12 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 2683
					if (class29.grandExchangeEvents != null) { // L: 2684
						class29.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12); // L: 2685
					}

					return 1; // L: 2687
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) { // L: 2689
					var12 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 2690
					if (class29.grandExchangeEvents != null) { // L: 2691
						class29.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12); // L: 2692
					}

					return 1; // L: 2694
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) { // L: 2696
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = class29.grandExchangeEvents == null ? 0 : class29.grandExchangeEvents.events.size(); // L: 2697
					return 1; // L: 2698
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) { // L: 2700
						var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 2701
						var4 = (GrandExchangeEvent)class29.grandExchangeEvents.events.get(var3); // L: 2702
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var4.world; // L: 2703
						return 1; // L: 2704
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) { // L: 2706
						var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 2707
						var4 = (GrandExchangeEvent)class29.grandExchangeEvents.events.get(var3); // L: 2708
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4.getOfferName(); // L: 2709
						return 1; // L: 2710
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) { // L: 2712
						var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 2713
						var4 = (GrandExchangeEvent)class29.grandExchangeEvents.events.get(var3); // L: 2714
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName(); // L: 2715
						return 1; // L: 2716
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) { // L: 2718
						var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 2719
						var4 = (GrandExchangeEvent)class29.grandExchangeEvents.events.get(var3); // L: 2720
						long var5 = Archive.currentTimeMillis() - ChatChannel.field1081 - var4.age; // L: 2721
						int var7 = (int)(var5 / 3600000L); // L: 2722
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L); // L: 2723
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L); // L: 2724
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10; // L: 2725
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var10; // L: 2726
						return 1; // L: 2727
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) { // L: 2729
						var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 2730
						var4 = (GrandExchangeEvent)class29.grandExchangeEvents.events.get(var3); // L: 2731
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity; // L: 2732
						return 1; // L: 2733
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) { // L: 2735
						var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 2736
						var4 = (GrandExchangeEvent)class29.grandExchangeEvents.events.get(var3); // L: 2737
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice; // L: 2738
						return 1; // L: 2739
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) { // L: 2741
						var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 2742
						var4 = (GrandExchangeEvent)class29.grandExchangeEvents.events.get(var3); // L: 2743
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id; // L: 2744
						return 1; // L: 2745
					} else {
						return 2; // L: 2747
					}
				}
			}
		}
	}
}
