import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jx")
@Implements("NPCDefinition")
public class NPCDefinition extends DualNode {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	public static AbstractArchive NpcDefinition_archive;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	public static AbstractArchive NpcDefinition_modelArchive;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	public static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	public static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -851756363
	)
	public int id;
	@ObfuscatedName("o")
	public String name;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1762851059
	)
	public int size;
	@ObfuscatedName("w")
	int[] models;
	@ObfuscatedName("g")
	int[] field3492;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 594093455
	)
	public int idleSequence;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1970335799
	)
	public int turnLeftSequence;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 136881499
	)
	public int turnRightSequence;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1497603669
	)
	public int walkSequence;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1405079749
	)
	public int walkBackSequence;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -950124131
	)
	public int walkLeftSequence;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1378189657
	)
	public int walkRightSequence;
	@ObfuscatedName("f")
	short[] recolorFrom;
	@ObfuscatedName("y")
	short[] recolorTo;
	@ObfuscatedName("v")
	short[] retextureFrom;
	@ObfuscatedName("j")
	short[] retextureTo;
	@ObfuscatedName("r")
	public String[] actions;
	@ObfuscatedName("u")
	public boolean drawMapDot;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -442899961
	)
	public int combatLevel;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -337235261
	)
	int widthScale;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -541213457
	)
	int heightScale;
	@ObfuscatedName("e")
	public boolean isVisible;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -888518163
	)
	int ambient;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -405765695
	)
	int contrast;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1421208063
	)
	public int headIconPrayer;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 754705433
	)
	public int rotation;
	@ObfuscatedName("an")
	public int[] transforms;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1534025905
	)
	int transformVarbit;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1959008785
	)
	int transformVarp;
	@ObfuscatedName("au")
	public boolean isInteractable;
	@ObfuscatedName("aa")
	public boolean isClickable;
	@ObfuscatedName("ar")
	public boolean isFollower;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1451445441"
	)
	void postDecode() {
	} // L: 68

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lkf;I)V",
		garbageValue = "289970781"
	)
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 72
			if (var2 == 0) { // L: 73
				return; // L: 76
			}

			this.decodeNext(var1, var2); // L: 74
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lkf;II)V",
		garbageValue = "-1568291099"
	)
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
				this.params = PacketWriter.readStringIntParameters(var1, this.params);
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

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljm;ILjm;IB)Ler;",
		garbageValue = "112"
	)
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Lee;",
		garbageValue = "1421247419"
	)
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)Ljx;",
		garbageValue = "795812200"
	)
	public final NPCDefinition transform() {
		int var1 = -1; // L: 224
		if (this.transformVarbit != -1) { // L: 225
			var1 = WorldMapSection1.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 226
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 228
			var2 = this.transforms[var1]; // L: 229
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? Skeleton.getNpcDefinition(var2) : null; // L: 230 231
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "140148621"
	)
	public boolean transformIsVisible() {
		if (this.transforms == null) { // L: 235
			return true;
		} else {
			int var1 = -1; // L: 236
			if (this.transformVarbit != -1) { // L: 237
				var1 = WorldMapSection1.getVarbit(this.transformVarbit);
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1359705510"
	)
	public int getIntParam(int var1, int var2) {
		return Username.method5309(this.params, var1, var2); // L: 244
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "77"
	)
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params; // L: 249
		String var3;
		if (var4 == null) { // L: 251
			var3 = var2; // L: 252
		} else {
			ObjectNode var5 = (ObjectNode)var4.get((long)var1); // L: 255
			if (var5 == null) { // L: 256
				var3 = var2; // L: 257
			} else {
				var3 = (String)var5.obj; // L: 260
			}
		}

		return var3; // L: 262
	}
}
