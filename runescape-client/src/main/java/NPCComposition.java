import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("NpcDefinition_archive")
	static AbstractArchive NpcDefinition_archive;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("NpcDefinition_modelArchive")
	static AbstractArchive NpcDefinition_modelArchive;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("NpcDefinition_cached")
	static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("NpcDefinition_cachedModels")
	static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("fx")
	static int[] field1918;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -2143016853
	)
	@Export("id")
	public int id;
	@ObfuscatedName("n")
	@Export("name")
	public String name;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1363241301
	)
	@Export("size")
	public int size;
	@ObfuscatedName("f")
	@Export("models")
	int[] models;
	@ObfuscatedName("u")
	int[] field1941;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -174401589
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1489915603
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1943936215
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -15491073
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 159519197
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 238467661
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -49692117
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("b")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("w")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("a")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("m")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("q")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("y")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -2021557183
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -674598947
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -2097500577
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("i")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 2003503301
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1146245031
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1820418945
	)
	@Export("headIconPrayer")
	public int headIconPrayer;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -934703889
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("at")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1879234601
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1792687465
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("ae")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("ab")
	@Export("isClickable")
	public boolean isClickable;
	@ObfuscatedName("aa")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "8806"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 73

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lpd;B)V",
		garbageValue = "26"
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lpd;II)V",
		garbageValue = "345201372"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
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
			this.field1941 = new int[var3]; // L: 128

			for (var4 = 0; var4 < var3; ++var4) { // L: 129
				this.field1941[var4] = var1.readUnsignedShort();
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
				this.params = NetFileRequest.readStringIntParameters(var1, this.params);
			}
		} else {
			this.transformVarbit = var1.readUnsignedShort(); // L: 141
			if (this.transformVarbit == 65535) {
				this.transformVarbit = -1; // L: 142
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
		descriptor = "(Lgg;ILgg;II)Lhx;",
		garbageValue = "-1552465915"
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

				var5 = var10.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30);
				NpcDefinition_cachedModels.put(var5, (long)this.id);
			}

			Model var11;
			if (var1 != null && var3 != null) {
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

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)Lgt;",
		garbageValue = "-1424786403"
	)
	@Export("getModelData")
	public final ModelData getModelData() {
		if (this.transforms != null) { // L: 204
			NPCComposition var7 = this.transform(); // L: 205
			return var7 == null ? null : var7.getModelData(); // L: 206 207
		} else if (this.field1941 == null) { // L: 209
			return null;
		} else {
			boolean var1 = false; // L: 210

			for (int var2 = 0; var2 < this.field1941.length; ++var2) { // L: 211
				if (!NpcDefinition_modelArchive.tryLoadFile(this.field1941[var2], 0)) {
					var1 = true;
				}
			}

			if (var1) { // L: 212
				return null;
			} else {
				ModelData[] var5 = new ModelData[this.field1941.length]; // L: 213

				for (int var3 = 0; var3 < this.field1941.length; ++var3) { // L: 214
					var5[var3] = ModelData.ModelData_get(NpcDefinition_modelArchive, this.field1941[var3], 0);
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Lfj;",
		garbageValue = "1331074811"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1; // L: 232
		if (this.transformVarbit != -1) { // L: 233
			var1 = WorldMapRegion.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 234
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 236
			var2 = this.transforms[var1]; // L: 237
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class9.getNpcDefinition(var2) : null; // L: 238 239
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-5"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) { // L: 243
			return true;
		} else {
			int var1 = -1; // L: 244
			if (this.transformVarbit != -1) { // L: 245
				var1 = WorldMapRegion.getVarbit(this.transformVarbit);
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

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1070953519"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return ClanSettings.method2976(this.params, var1, var2); // L: 252
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-777122666"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class19.method315(this.params, var1, var2); // L: 256
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lpy;I)I",
		garbageValue = "1149580844"
	)
	static int method3491(PacketBuffer var0) {
		int var1 = var0.readBits(2); // L: 189
		int var2;
		if (var1 == 0) { // L: 191
			var2 = 0;
		} else if (var1 == 1) {
			var2 = var0.readBits(5); // L: 192
		} else if (var1 == 2) { // L: 193
			var2 = var0.readBits(8);
		} else {
			var2 = var0.readBits(11); // L: 194
		}

		return var2; // L: 195
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Llq;Ljava/lang/String;Ljava/lang/String;I)Lqx;",
		garbageValue = "342414454"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1); // L: 82
		int var4 = var0.getFileId(var3, var2); // L: 83
		return class16.method218(var0, var3, var4); // L: 84
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(Lcx;IIII)V",
		garbageValue = "527518202"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPC var0, int var1, int var2, int var3) {
		NPCComposition var4 = var0.definition; // L: 9391
		if (Client.menuOptionsCount < 400) { // L: 9392
			if (var4.transforms != null) { // L: 9393
				var4 = var4.transform();
			}

			if (var4 != null) { // L: 9394
				if (var4.isInteractable) { // L: 9395
					if (!var4.isFollower || Client.followerIndex == var1) { // L: 9396
						String var5 = var4.name; // L: 9397
						int var6;
						int var9;
						if (var4.combatLevel != 0 && var0.field1161 != 0) { // L: 9398
							var6 = var0.field1161 != -1 ? var0.field1161 * -1966879477 * -544172381 : var4.combatLevel * -2021557183 * -620194879; // L: 9399
							var9 = class19.localPlayer.combatLevel; // L: 9402
							int var10 = var9 - var6; // L: 9404
							String var8;
							if (var10 < -9) { // L: 9405
								var8 = ChatChannel.colorStartTag(16711680); // L: 9406
							} else if (var10 < -6) { // L: 9409
								var8 = ChatChannel.colorStartTag(16723968); // L: 9410
							} else if (var10 < -3) { // L: 9413
								var8 = ChatChannel.colorStartTag(16740352); // L: 9414
							} else if (var10 < 0) { // L: 9417
								var8 = ChatChannel.colorStartTag(16756736); // L: 9418
							} else if (var10 > 9) { // L: 9421
								var8 = ChatChannel.colorStartTag(65280); // L: 9422
							} else if (var10 > 6) { // L: 9425
								var8 = ChatChannel.colorStartTag(4259584); // L: 9426
							} else if (var10 > 3) { // L: 9429
								var8 = ChatChannel.colorStartTag(8453888); // L: 9430
							} else if (var10 > 0) { // L: 9433
								var8 = ChatChannel.colorStartTag(12648192); // L: 9434
							} else {
								var8 = ChatChannel.colorStartTag(16776960); // L: 9437
							}

							var5 = var5 + var8 + " " + " (" + "level-" + var6 + ")"; // L: 9439
						}

						if (var4.isFollower && Client.followerOpsLowPriority) { // L: 9441
							SecureRandomFuture.insertMenuItemNoShift("Examine", ChatChannel.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 9442
						}

						if (Client.isItemSelected == 1) { // L: 9445
							SecureRandomFuture.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + ChatChannel.colorStartTag(16776960) + var5, 7, var1, var2, var3); // L: 9446
						} else if (Client.isSpellSelected) { // L: 9449
							if ((class154.selectedSpellFlags & 2) == 2) { // L: 9450
								SecureRandomFuture.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + ChatChannel.colorStartTag(16776960) + var5, 8, var1, var2, var3); // L: 9451
							}
						} else {
							var6 = var4.isFollower && Client.followerOpsLowPriority ? 2000 : 0; // L: 9456
							String[] var7 = var4.actions; // L: 9457
							int var11;
							if (var7 != null) { // L: 9458
								for (var11 = 4; var11 >= 0; --var11) { // L: 9459
									if (var7[var11] != null && !var7[var11].equalsIgnoreCase("Attack")) { // L: 9460
										var9 = 0; // L: 9461
										if (var11 == 0) { // L: 9462
											var9 = var6 + 9;
										}

										if (var11 == 1) { // L: 9463
											var9 = var6 + 10;
										}

										if (var11 == 2) { // L: 9464
											var9 = var6 + 11;
										}

										if (var11 == 3) { // L: 9465
											var9 = var6 + 12;
										}

										if (var11 == 4) { // L: 9466
											var9 = var6 + 13;
										}

										SecureRandomFuture.insertMenuItemNoShift(var7[var11], ChatChannel.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 9467
									}
								}
							}

							if (var7 != null) { // L: 9472
								for (var11 = 4; var11 >= 0; --var11) { // L: 9473
									if (var7[var11] != null && var7[var11].equalsIgnoreCase("Attack")) { // L: 9474
										short var12 = 0; // L: 9475
										if (Client.npcAttackOption != AttackOption.AttackOption_hidden) { // L: 9476
											if (Client.npcAttackOption == AttackOption.AttackOption_alwaysRightClick || AttackOption.AttackOption_dependsOnCombatLevels == Client.npcAttackOption && var4.combatLevel > class19.localPlayer.combatLevel) { // L: 9477
												var12 = 2000; // L: 9478
											}

											var9 = 0; // L: 9480
											if (var11 == 0) { // L: 9481
												var9 = var12 + 9;
											}

											if (var11 == 1) { // L: 9482
												var9 = var12 + 10;
											}

											if (var11 == 2) { // L: 9483
												var9 = var12 + 11;
											}

											if (var11 == 3) { // L: 9484
												var9 = var12 + 12;
											}

											if (var11 == 4) { // L: 9485
												var9 = var12 + 13;
											}

											SecureRandomFuture.insertMenuItemNoShift(var7[var11], ChatChannel.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 9486
										}
									}
								}
							}

							if (!var4.isFollower || !Client.followerOpsLowPriority) { // L: 9491
								SecureRandomFuture.insertMenuItemNoShift("Examine", ChatChannel.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 9492
							}
						}

					}
				}
			}
		}
	} // L: 9496
}
