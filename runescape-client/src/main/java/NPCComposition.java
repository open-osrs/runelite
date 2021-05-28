import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("qn")
	@ObfuscatedSignature(
		descriptor = "Ll;"
	)
	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("NpcDefinition_archive")
	public static AbstractArchive NpcDefinition_archive;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("NpcDefinition_modelArchive")
	public static AbstractArchive NpcDefinition_modelArchive;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("NpcDefinition_cached")
	public static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("NpcDefinition_cachedModels")
	public static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("compass")
	static SpritePixels compass;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -2060838679
	)
	@Export("id")
	public int id;
	@ObfuscatedName("j")
	@Export("name")
	public String name;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1748856001
	)
	@Export("size")
	public int size;
	@ObfuscatedName("b")
	@Export("models")
	int[] models;
	@ObfuscatedName("d")
	int[] field1638;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1310735685
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1743545491
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1143137827
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1881319333
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -2006031471
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1692683489
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1089328917
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("a")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("k")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("m")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("x")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("z")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("w")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -427478981
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1078672503
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1467757175
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("i")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 2079488611
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1867659125
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1099409813
	)
	@Export("headIconPrayer")
	public int headIconPrayer;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -729878735
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("ad")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -17335253
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1483491067
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("ag")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("ax")
	@Export("isClickable")
	public boolean isClickable;
	@ObfuscatedName("as")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-260686681"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 68

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "1170104499"
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
		descriptor = "(Lnd;IB)V",
		garbageValue = "-16"
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
			this.field1638 = new int[var3]; // L: 123

			for (var4 = 0; var4 < var3; ++var4) { // L: 124
				this.field1638[var4] = var1.readUnsignedShort();
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
				this.params = ModeWhere.readStringIntParameters(var1, this.params);
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lfl;ILfl;II)Lgr;",
		garbageValue = "-26460885"
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(S)Lgm;",
		garbageValue = "7106"
	)
	@Export("getModelData")
	public final ModelData getModelData() {
		if (this.transforms != null) { // L: 199
			NPCComposition var7 = this.transform(); // L: 200
			return var7 == null ? null : var7.getModelData(); // L: 201 202
		} else if (this.field1638 == null) { // L: 204
			return null;
		} else {
			boolean var1 = false; // L: 205

			for (int var2 = 0; var2 < this.field1638.length; ++var2) { // L: 206
				if (!NpcDefinition_modelArchive.tryLoadFile(this.field1638[var2], 0)) {
					var1 = true;
				}
			}

			if (var1) { // L: 207
				return null;
			} else {
				ModelData[] var5 = new ModelData[this.field1638.length]; // L: 208

				for (int var3 = 0; var3 < this.field1638.length; ++var3) { // L: 209
					var5[var3] = ModelData.ModelData_get(NpcDefinition_modelArchive, this.field1638[var3], 0);
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

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)Lef;",
		garbageValue = "5"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1; // L: 227
		if (this.transformVarbit != -1) { // L: 228
			var1 = Skeleton.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 229
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 231
			var2 = this.transforms[var1]; // L: 232
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? StructComposition.getNpcDefinition(var2) : null; // L: 233 234
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1279569027"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) { // L: 238
			return true;
		} else {
			int var1 = -1; // L: 239
			if (this.transformVarbit != -1) { // L: 240
				var1 = Skeleton.getVarbit(this.transformVarbit);
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

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "506916452"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return SecureRandomFuture.method1977(this.params, var1, var2); // L: 247
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-614305753"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return FriendsList.method5650(this.params, var1, var2); // L: 251
	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "-1922"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) { // L: 11298
			PacketBufferNode var1 = class21.getPacketBufferNode(ClientPacket.field2574, Client.packetWriter.isaacCipher); // L: 11300
			var1.packetBuffer.writeByte(Tiles.stringCp1252NullTerminatedByteSize(var0)); // L: 11301
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 11302
			Client.packetWriter.addNode(var1); // L: 11303
		}
	} // L: 11304

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1165253281"
	)
	static void method2791() {
		if (Client.field724 && class93.localPlayer != null) { // L: 11510
			int var0 = class93.localPlayer.pathX[0]; // L: 11511
			int var1 = class93.localPlayer.pathY[0]; // L: 11512
			if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) { // L: 11513
				return;
			}

			RouteStrategy.oculusOrbFocalPointX = class93.localPlayer.x; // L: 11514
			int var2 = class105.getTileHeight(class93.localPlayer.x, class93.localPlayer.y, class22.Client_plane) - Client.camFollowHeight; // L: 11515
			if (var2 < class17.field148) { // L: 11516
				class17.field148 = var2;
			}

			ModelData0.oculusOrbFocalPointY = class93.localPlayer.y; // L: 11517
			Client.field724 = false; // L: 11518
		}

	} // L: 11520
}
