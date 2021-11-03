import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("NpcDefinition_archive")
	public static AbstractArchive NpcDefinition_archive;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("NpcDefinition_modelArchive")
	public static AbstractArchive NpcDefinition_modelArchive;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("NpcDefinition_cached")
	public static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("NpcDefinition_cachedModels")
	public static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -644907951
	)
	@Export("id")
	public int id;
	@ObfuscatedName("g")
	@Export("name")
	public String name;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1250402157
	)
	@Export("size")
	public int size;
	@ObfuscatedName("p")
	@Export("models")
	int[] models;
	@ObfuscatedName("j")
	int[] field1722;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -611299157
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1914071611
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 482215935
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1771727167
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1040886561
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1898345849
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1312411327
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("n")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("z")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("q")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("d")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("r")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("m")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1462580569
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 12207147
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 43942703
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("v")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1242498855
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1010788091
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 170889589
	)
	@Export("headIconPrayer")
	public int headIconPrayer;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 387314403
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("am")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -108342367
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1806959031
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("as")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("at")
	@Export("isClickable")
	public boolean isClickable;
	@ObfuscatedName("az")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
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
		this.idleSequence = -1;
		this.turnLeftSequence = -1;
		this.turnRightSequence = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.actions = new String[5];
		this.drawMapDot = true;
		this.combatLevel = -1;
		this.widthScale = 128; // L: 39
		this.heightScale = 128; // L: 40
		this.isVisible = false; // L: 41
		this.ambient = 0; // L: 42
		this.contrast = 0;
		this.headIconPrayer = -1;
		this.rotation = 32;
		this.transformVarbit = -1;
		this.transformVarp = -1;
		this.isInteractable = true;
		this.isClickable = true;
		this.isFollower = false;
	} // L: 54

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1919612079"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 68

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-1322212513"
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

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lop;II)V",
		garbageValue = "2009660839"
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
			this.field1722 = new int[var3]; // L: 123

			for (var4 = 0; var4 < var3; ++var4) { // L: 124
				this.field1722[var4] = var1.readUnsignedShort();
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
				this.params = class13.readStringIntParameters(var1, this.params);
			}
		} else {
			this.transformVarbit = var1.readUnsignedShort(); // L: 136
			if (this.transformVarbit == 65535) { // L: 137
				this.transformVarbit = -1;
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lfm;ILfm;IB)Lhl;",
		garbageValue = "-111"
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)Lgk;",
		garbageValue = "-100"
	)
	@Export("getModelData")
	public final ModelData getModelData() {
		if (this.transforms != null) { // L: 199
			NPCComposition var7 = this.transform(); // L: 200
			return var7 == null ? null : var7.getModelData(); // L: 201 202
		} else if (this.field1722 == null) { // L: 204
			return null;
		} else {
			boolean var1 = false; // L: 205

			for (int var2 = 0; var2 < this.field1722.length; ++var2) { // L: 206
				if (!NpcDefinition_modelArchive.tryLoadFile(this.field1722[var2], 0)) {
					var1 = true;
				}
			}

			if (var1) { // L: 207
				return null;
			} else {
				ModelData[] var5 = new ModelData[this.field1722.length]; // L: 208

				for (int var3 = 0; var3 < this.field1722.length; ++var3) { // L: 209
					var5[var3] = ModelData.ModelData_get(NpcDefinition_modelArchive, this.field1722[var3], 0);
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Lfw;",
		garbageValue = "2130221153"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1; // L: 227
		if (this.transformVarbit != -1) { // L: 228
			var1 = class119.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 229
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 231
			var2 = this.transforms[var1]; // L: 232
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? ScriptFrame.getNpcDefinition(var2) : null; // L: 233 234
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-106692934"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) { // L: 238
			return true;
		} else {
			int var1 = -1; // L: 239
			if (this.transformVarbit != -1) { // L: 240
				var1 = class119.getVarbit(this.transformVarbit);
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1437927998"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return NPC.method2251(this.params, var1, var2); // L: 247
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1913888789"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return VarbitComposition.method3205(this.params, var1, var2); // L: 251
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ILop;B)Ley;",
		garbageValue = "0"
	)
	public static class150 method3152(int var0, Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 24
		boolean var3 = (var2 & 1) != 0; // L: 25
		boolean var4 = (var2 & 2) != 0; // L: 26
		class150 var5 = new class150(var0); // L: 27
		int var6;
		int[] var7;
		boolean var8;
		int var9;
		short var10;
		if (var3) { // L: 28
			var6 = var1.readUnsignedByte(); // L: 29
			var7 = new int[]{var6 & 15, var6 >> 4 & 15}; // L: 30 31 32
			var8 = var5.field1598 != null && var7.length == var5.field1598.length; // L: 33

			for (var9 = 0; var9 < 2; ++var9) { // L: 34
				if (var7[var9] != 15) { // L: 35
					var10 = (short)var1.readUnsignedShort(); // L: 36
					if (var8) { // L: 37
						var5.field1598[var7[var9]] = var10; // L: 38
					}
				}
			}
		}

		if (var4) { // L: 43
			var6 = var1.readUnsignedByte(); // L: 44
			var7 = new int[]{var6 & 15, var6 >> 4 & 15}; // L: 45 46 47
			var8 = var5.field1600 != null && var7.length == var5.field1600.length; // L: 48

			for (var9 = 0; var9 < 2; ++var9) { // L: 49
				if (var7[var9] != 15) { // L: 50
					var10 = (short)var1.readUnsignedShort(); // L: 51
					if (var8) { // L: 52
						var5.field1600[var7[var9]] = var10; // L: 53
					}
				}
			}
		}

		return var5; // L: 58
	}
}
