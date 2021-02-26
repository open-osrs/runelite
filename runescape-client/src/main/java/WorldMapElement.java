import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ic")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("WorldMapElement_archive")
	public static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "[Lic;"
	)
	@Export("WorldMapElement_cached")
	public static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -346827273
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	@Export("WorldMapElement_cachedSprites")
	static EvictingDualNodeHashTable WorldMapElement_cachedSprites;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1832807857
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -928242387
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -342149719
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("e")
	@Export("name")
	public String name;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1722981439
	)
	public int field3245;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1426815711
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("b")
	public boolean field3250;
	@ObfuscatedName("a")
	public boolean field3255;
	@ObfuscatedName("w")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("k")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("i")
	int[] field3258;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -683625561
	)
	int field3253;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -424376699
	)
	int field3259;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -934504639
	)
	int field3261;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -97806191
	)
	int field3262;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lje;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("m")
	int[] field3265;
	@ObfuscatedName("r")
	byte[] field3266;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 922243855
	)
	@Export("category")
	public int category;

	static {
		WorldMapElement_cachedSprites = new EvictingDualNodeHashTable(256); // L: 16
	}

	public WorldMapElement(int var1) {
		this.sprite1 = -1; // L: 18
		this.sprite2 = -1; // L: 19
		this.textSize = 0; // L: 22
		this.field3250 = true; // L: 24
		this.field3255 = false; // L: 25
		this.menuActions = new String[5]; // L: 26
		this.field3253 = Integer.MAX_VALUE; // L: 29
		this.field3259 = Integer.MAX_VALUE; // L: 30
		this.field3261 = Integer.MIN_VALUE; // L: 31
		this.field3262 = Integer.MIN_VALUE; // L: 32
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered; // L: 33
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered; // L: 34
		this.category = -1; // L: 37
		this.objectId = var1; // L: 40
	} // L: 41

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lkx;B)V",
		garbageValue = "-21"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 52
			if (var2 == 0) { // L: 53
				return; // L: 56
			}

			this.decodeNext(var1, var2); // L: 54
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lkx;II)V",
		garbageValue = "835039554"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 59
			this.sprite1 = var1.method5833();
		} else if (var2 == 2) { // L: 60
			this.sprite2 = var1.method5833();
		} else if (var2 == 3) { // L: 61
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 62
			this.field3245 = var1.readMedium();
		} else if (var2 == 5) { // L: 63
			var1.readMedium(); // L: 64
		} else if (var2 == 6) { // L: 66
			this.textSize = var1.readUnsignedByte();
		} else {
			int var3;
			if (var2 == 7) { // L: 67
				var3 = var1.readUnsignedByte(); // L: 68
				if ((var3 & 1) == 0) { // L: 69
					this.field3250 = false;
				}

				if ((var3 & 2) == 2) { // L: 70
					this.field3255 = true;
				}
			} else if (var2 == 8) { // L: 72
				var1.readUnsignedByte(); // L: 73
			} else if (var2 >= 10 && var2 <= 14) { // L: 75
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) { // L: 76
				var3 = var1.readUnsignedByte(); // L: 77
				this.field3258 = new int[var3 * 2]; // L: 78

				int var4;
				for (var4 = 0; var4 < var3 * 2; ++var4) { // L: 79
					this.field3258[var4] = var1.readShort();
				}

				var1.readInt(); // L: 80
				var4 = var1.readUnsignedByte(); // L: 81
				this.field3265 = new int[var4]; // L: 82

				int var5;
				for (var5 = 0; var5 < this.field3265.length; ++var5) { // L: 83
					this.field3265[var5] = var1.readInt();
				}

				this.field3266 = new byte[var3]; // L: 84

				for (var5 = 0; var5 < var3; ++var5) { // L: 85
					this.field3266[var5] = var1.readByte();
				}
			} else if (var2 != 16) { // L: 87
				if (var2 == 17) { // L: 88
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) { // L: 89
					var1.method5833(); // L: 90
				} else if (var2 == 19) { // L: 92
					this.category = var1.readUnsignedShort();
				} else if (var2 == 21) { // L: 93
					var1.readInt(); // L: 94
				} else if (var2 == 22) { // L: 96
					var1.readInt(); // L: 97
				} else if (var2 == 23) { // L: 99
					var1.readUnsignedByte(); // L: 100
					var1.readUnsignedByte(); // L: 101
					var1.readUnsignedByte(); // L: 102
				} else if (var2 == 24) { // L: 104
					var1.readShort(); // L: 105
					var1.readShort(); // L: 106
				} else if (var2 == 25) { // L: 108
					var1.method5833(); // L: 109
				} else if (var2 == 28) {
					var1.readUnsignedByte();
				} else if (var2 == 29) {
					this.horizontalAlignment = (HorizontalAlignment)InterfaceParent.findEnumerated(GameEngine.method1137(), var1.readUnsignedByte());
				} else if (var2 == 30) {
					this.verticalAlignment = (VerticalAlignment)InterfaceParent.findEnumerated(class169.method3631(), var1.readUnsignedByte());
				}
			}
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1040699133"
	)
	public void method4576() {
		if (this.field3258 != null) {
			for (int var1 = 0; var1 < this.field3258.length; var1 += 2) {
				if (this.field3258[var1] < this.field3253) {
					this.field3253 = this.field3258[var1];
				} else if (this.field3258[var1] > this.field3261) {
					this.field3261 = this.field3258[var1];
				}

				if (this.field3258[var1 + 1] < this.field3259) {
					this.field3259 = this.field3258[var1 + 1];
				} else if (this.field3258[var1 + 1] > this.field3262) {
					this.field3262 = this.field3258[var1 + 1];
				}
			}
		}

	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(ZI)Llm;",
		garbageValue = "1411469246"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1;
		return this.getSprite(var2); // L: 136
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)Llm;",
		garbageValue = "3"
	)
	@Export("getSprite")
	SpritePixels getSprite(int var1) {
		if (var1 < 0) {
			return null;
		} else {
			SpritePixels var2 = (SpritePixels)WorldMapElement_cachedSprites.get((long)var1);
			if (var2 != null) {
				return var2;
			} else {
				var2 = BufferedSource.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0);
				if (var2 != null) {
					WorldMapElement_cachedSprites.put(var2, (long)var1);
				}

				return var2; // L: 147
			}
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1309901264"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IILgz;Lfe;B)Z",
		garbageValue = "75"
	)
	public static final boolean method4591(int var0, int var1, RouteStrategy var2, CollisionMap var3) {
		int var4 = var0; // L: 111
		int var5 = var1; // L: 112
		byte var6 = 64; // L: 113
		byte var7 = 64; // L: 114
		int var8 = var0 - var6; // L: 115
		int var9 = var1 - var7; // L: 116
		class182.directions[var6][var7] = 99; // L: 117
		class182.distances[var6][var7] = 0; // L: 118
		byte var10 = 0; // L: 119
		int var11 = 0; // L: 120
		class182.bufferX[var10] = var0; // L: 121
		byte var10001 = var10;
		int var18 = var10 + 1;
		class182.bufferY[var10001] = var1; // L: 122
		int[][] var12 = var3.flags; // L: 123

		while (var18 != var11) { // L: 124
			var4 = class182.bufferX[var11]; // L: 125
			var5 = class182.bufferY[var11]; // L: 126
			var11 = var11 + 1 & 4095; // L: 127
			int var16 = var4 - var8; // L: 128
			int var17 = var5 - var9; // L: 129
			int var13 = var4 - var3.xInset; // L: 130
			int var14 = var5 - var3.yInset; // L: 131
			if (var2.hasArrived(2, var4, var5, var3)) { // L: 132
				class182.field2118 = var4; // L: 133
				class182.field2124 = var5; // L: 134
				return true; // L: 135
			}

			int var15 = class182.distances[var16][var17] + 1; // L: 137
			if (var16 > 0 && class182.directions[var16 - 1][var17] == 0 && (var12[var13 - 1][var14] & 19136782) == 0 && (var12[var13 - 1][var14 + 1] & 19136824) == 0) { // L: 138 139 140 141
				class182.bufferX[var18] = var4 - 1; // L: 142
				class182.bufferY[var18] = var5; // L: 143
				var18 = var18 + 1 & 4095; // L: 144
				class182.directions[var16 - 1][var17] = 2; // L: 145
				class182.distances[var16 - 1][var17] = var15; // L: 146
			}

			if (var16 < 126 && class182.directions[var16 + 1][var17] == 0 && (var12[var13 + 2][var14] & 19136899) == 0 && (var12[var13 + 2][var14 + 1] & 19136992) == 0) { // L: 148 149 150 151
				class182.bufferX[var18] = var4 + 1; // L: 152
				class182.bufferY[var18] = var5; // L: 153
				var18 = var18 + 1 & 4095; // L: 154
				class182.directions[var16 + 1][var17] = 8; // L: 155
				class182.distances[var16 + 1][var17] = var15; // L: 156
			}

			if (var17 > 0 && class182.directions[var16][var17 - 1] == 0 && (var12[var13][var14 - 1] & 19136782) == 0 && (var12[var13 + 1][var14 - 1] & 19136899) == 0) { // L: 158 159 160 161
				class182.bufferX[var18] = var4; // L: 162
				class182.bufferY[var18] = var5 - 1; // L: 163
				var18 = var18 + 1 & 4095; // L: 164
				class182.directions[var16][var17 - 1] = 1; // L: 165
				class182.distances[var16][var17 - 1] = var15; // L: 166
			}

			if (var17 < 126 && class182.directions[var16][var17 + 1] == 0 && (var12[var13][var14 + 2] & 19136824) == 0 && (var12[var13 + 1][var14 + 2] & 19136992) == 0) { // L: 168 169 170 171
				class182.bufferX[var18] = var4; // L: 172
				class182.bufferY[var18] = var5 + 1; // L: 173
				var18 = var18 + 1 & 4095; // L: 174
				class182.directions[var16][var17 + 1] = 4; // L: 175
				class182.distances[var16][var17 + 1] = var15; // L: 176
			}

			if (var16 > 0 && var17 > 0 && class182.directions[var16 - 1][var17 - 1] == 0 && (var12[var13 - 1][var14] & 19136830) == 0 && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13][var14 - 1] & 19136911) == 0) { // L: 178 179 180 181 182
				class182.bufferX[var18] = var4 - 1; // L: 183
				class182.bufferY[var18] = var5 - 1; // L: 184
				var18 = var18 + 1 & 4095; // L: 185
				class182.directions[var16 - 1][var17 - 1] = 3; // L: 186
				class182.distances[var16 - 1][var17 - 1] = var15; // L: 187
			}

			if (var16 < 126 && var17 > 0 && class182.directions[var16 + 1][var17 - 1] == 0 && (var12[var13 + 1][var14 - 1] & 19136911) == 0 && (var12[var13 + 2][var14 - 1] & 19136899) == 0 && (var12[var13 + 2][var14] & 19136995) == 0) { // L: 189 190 191 192 193
				class182.bufferX[var18] = var4 + 1; // L: 194
				class182.bufferY[var18] = var5 - 1; // L: 195
				var18 = var18 + 1 & 4095; // L: 196
				class182.directions[var16 + 1][var17 - 1] = 9; // L: 197
				class182.distances[var16 + 1][var17 - 1] = var15; // L: 198
			}

			if (var16 > 0 && var17 < 126 && class182.directions[var16 - 1][var17 + 1] == 0 && (var12[var13 - 1][var14 + 1] & 19136830) == 0 && (var12[var13 - 1][var14 + 2] & 19136824) == 0 && (var12[var13][var14 + 2] & 19137016) == 0) { // L: 200 201 202 203 204
				class182.bufferX[var18] = var4 - 1; // L: 205
				class182.bufferY[var18] = var5 + 1; // L: 206
				var18 = var18 + 1 & 4095; // L: 207
				class182.directions[var16 - 1][var17 + 1] = 6; // L: 208
				class182.distances[var16 - 1][var17 + 1] = var15; // L: 209
			}

			if (var16 < 126 && var17 < 126 && class182.directions[var16 + 1][var17 + 1] == 0 && (var12[var13 + 1][var14 + 2] & 19137016) == 0 && (var12[var13 + 2][var14 + 2] & 19136992) == 0 && (var12[var13 + 2][var14 + 1] & 19136995) == 0) { // L: 211 212 213 214 215
				class182.bufferX[var18] = var4 + 1; // L: 216
				class182.bufferY[var18] = var5 + 1; // L: 217
				var18 = var18 + 1 & 4095; // L: 218
				class182.directions[var16 + 1][var17 + 1] = 12; // L: 219
				class182.distances[var16 + 1][var17 + 1] = var15; // L: 220
			}
		}

		class182.field2118 = var4; // L: 223
		class182.field2124 = var5; // L: 224
		return false; // L: 225
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(Lbo;B)V",
		garbageValue = "1"
	)
	static final void method4592(PendingSpawn var0) {
		long var1 = 0L; // L: 7271
		int var3 = -1; // L: 7272
		int var4 = 0; // L: 7273
		int var5 = 0; // L: 7274
		if (var0.type == 0) { // L: 7275
			var1 = MilliClock.scene.getBoundaryObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) { // L: 7276
			var1 = MilliClock.scene.getWallDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) { // L: 7277
			var1 = MilliClock.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) {
			var1 = MilliClock.scene.getFloorDecorationTag(var0.plane, var0.x, var0.y); // L: 7278
		}

		if (0L != var1) { // L: 7279
			int var6 = MilliClock.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1); // L: 7280
			var3 = class25.Entity_unpackID(var1); // L: 7281
			var4 = var6 & 31; // L: 7282
			var5 = var6 >> 6 & 3; // L: 7283
		}

		var0.objectId = var3; // L: 7285
		var0.field945 = var4; // L: 7286
		var0.field944 = var5; // L: 7287
	} // L: 7288
}
