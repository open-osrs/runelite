import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("NpcDefinition_archive")
	static AbstractArchive NpcDefinition_archive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("NpcDefinition_modelArchive")
	static AbstractArchive NpcDefinition_modelArchive;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("NpcDefinition_cached")
	public static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("NpcDefinition_cachedModels")
	public static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1249839807
	)
	@Export("id")
	public int id;
	@ObfuscatedName("n")
	@Export("name")
	public String name;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 53350769
	)
	@Export("size")
	public int size;
	@ObfuscatedName("l")
	@Export("models")
	int[] models;
	@ObfuscatedName("q")
	int[] field1900;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1838894863
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -360120719
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1182294529
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1120334565
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1091660001
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1992227181
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1710177657
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("u")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("t")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("g")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("x")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("a")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("y")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -867920465
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1011803827
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -2073300725
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("h")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1984476119
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1324751059
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -247585293
	)
	@Export("headIconPrayer")
	public int headIconPrayer;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1502698673
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("ak")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1082735029
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 322255095
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("al")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("av")
	@Export("isClickable")
	public boolean isClickable;
	@ObfuscatedName("at")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
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
		this.isClickable = true;
		this.isFollower = false;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-46"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 73

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "-28"
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

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "-109994635"
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
			this.field1900 = new int[var3]; // L: 128

			for (var4 = 0; var4 < var3; ++var4) { // L: 129
				this.field1900[var4] = var1.readUnsignedShort();
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
				this.params = class214.readStringIntParameters(var1, this.params);
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lgw;ILgw;II)Liq;",
		garbageValue = "1025368138"
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Lhc;",
		garbageValue = "-2018540961"
	)
	@Export("getModelData")
	public final ModelData getModelData() {
		if (this.transforms != null) { // L: 204
			NPCComposition var7 = this.transform(); // L: 205
			return var7 == null ? null : var7.getModelData(); // L: 206 207
		} else if (this.field1900 == null) { // L: 209
			return null;
		} else {
			boolean var1 = false; // L: 210

			for (int var2 = 0; var2 < this.field1900.length; ++var2) { // L: 211
				if (!NpcDefinition_modelArchive.tryLoadFile(this.field1900[var2], 0)) {
					var1 = true;
				}
			}

			if (var1) { // L: 212
				return null;
			} else {
				ModelData[] var5 = new ModelData[this.field1900.length]; // L: 213

				for (int var3 = 0; var3 < this.field1900.length; ++var3) { // L: 214
					var5[var3] = ModelData.ModelData_get(NpcDefinition_modelArchive, this.field1900[var3], 0);
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Lft;",
		garbageValue = "-1663507633"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1; // L: 232
		if (this.transformVarbit != -1) { // L: 233
			var1 = SecureRandomCallable.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 234
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 236
			var2 = this.transforms[var1]; // L: 237
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? KeyHandler.getNpcDefinition(var2) : null; // L: 238 239
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "155918530"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) { // L: 243
			return true;
		} else {
			int var1 = -1; // L: 244
			if (this.transformVarbit != -1) { // L: 245
				var1 = SecureRandomCallable.getVarbit(this.transformVarbit);
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "17259"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params; // L: 253
		int var3;
		if (var4 == null) { // L: 255
			var3 = var2; // L: 256
		} else {
			IntegerNode var5 = (IntegerNode)var4.get((long)var1); // L: 259
			if (var5 == null) { // L: 260
				var3 = var2; // L: 261
			} else {
				var3 = var5.integer; // L: 264
			}
		}

		return var3; // L: 266
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "943206349"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params; // L: 271
		String var3;
		if (var4 == null) { // L: 273
			var3 = var2; // L: 274
		} else {
			ObjectNode var5 = (ObjectNode)var4.get((long)var1); // L: 277
			if (var5 == null) { // L: 278
				var3 = var2; // L: 279
			} else {
				var3 = (String)var5.obj; // L: 282
			}
		}

		return var3; // L: 284
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILln;IIIZB)V",
		garbageValue = "-11"
	)
	public static void method3530(int var0, AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		class273.musicPlayerStatus = 1; // L: 50
		class273.musicTrackArchive = var1; // L: 51
		AccessFile.musicTrackGroupId = var2; // L: 52
		class273.musicTrackFileId = var3; // L: 53
		class273.musicTrackVolume = var4; // L: 54
		class17.musicTrackBoolean = var5; // L: 55
		class273.pcmSampleLength = var0; // L: 56
	} // L: 57

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-43"
	)
	static boolean method3531() {
		return (Client.drawPlayerNames & 4) != 0; // L: 4849
	}
}
