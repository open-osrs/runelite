import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("v")
	static boolean field2151;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("SequenceDefinition_animationsArchive")
	static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("SequenceDefinition_cached")
	public static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("SequenceDefinition_cachedFrames")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("SequenceDefinition_cachedModel")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1013494467
	)
	@Export("SequenceDefinition_cachedModelId")
	int SequenceDefinition_cachedModelId;
	@ObfuscatedName("q")
	public Map field2144;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1880627603
	)
	int field2152;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 2046803879
	)
	int field2160;
	@ObfuscatedName("p")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("w")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("k")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("d")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1070190955
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("u")
	int[] field2146;
	@ObfuscatedName("t")
	boolean[] field2156;
	@ObfuscatedName("g")
	public boolean field2154;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 118490245
	)
	public int field2155;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1252279117
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 221867971
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 290936429
	)
	public int field2138;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1964566761
	)
	public int field2159;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1376607035
	)
	public int field2158;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1493621085
	)
	public int field2161;

	static {
		field2151 = false; // L: 16
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64); // L: 20
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100); // L: 21
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100); // L: 22
	}

	SequenceDefinition() {
		this.SequenceDefinition_cachedModelId = -1; // L: 23
		this.field2152 = 0; // L: 25
		this.field2160 = 0; // L: 26
		this.frameCount = -1; // L: 31
		this.field2154 = false; // L: 34
		this.field2155 = 5; // L: 35
		this.shield = -1; // L: 36
		this.weapon = -1; // L: 37
		this.field2138 = 99; // L: 38
		this.field2159 = -1; // L: 39
		this.field2158 = -1; // L: 40
		this.field2161 = 2; // L: 41
	} // L: 43

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lpi;S)V",
		garbageValue = "-208"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 64
			if (var2 == 0) { // L: 65
				return; // L: 68
			}

			this.decodeNext(var1, var2); // L: 66
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "-1513978235"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) { // L: 71
			var3 = var1.readUnsignedShort(); // L: 72
			this.frameLengths = new int[var3]; // L: 73

			for (var4 = 0; var4 < var3; ++var4) { // L: 74
				this.frameLengths[var4] = var1.readUnsignedShort();
			}

			this.frameIds = new int[var3]; // L: 75

			for (var4 = 0; var4 < var3; ++var4) { // L: 76
				this.frameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) { // L: 77
				this.frameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 2) { // L: 79
			this.frameCount = var1.readUnsignedShort();
		} else if (var2 == 3) { // L: 80
			var3 = var1.readUnsignedByte(); // L: 81
			this.field2146 = new int[var3 + 1]; // L: 82

			for (var4 = 0; var4 < var3; ++var4) { // L: 83
				this.field2146[var4] = var1.readUnsignedByte();
			}

			this.field2146[var3] = 9999999; // L: 84
		} else if (var2 == 4) { // L: 86
			this.field2154 = true;
		} else if (var2 == 5) { // L: 87
			this.field2155 = var1.readUnsignedByte();
		} else if (var2 == 6) { // L: 88
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 89
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) { // L: 90
			this.field2138 = var1.readUnsignedByte();
		} else if (var2 == 9) { // L: 91
			this.field2159 = var1.readUnsignedByte();
		} else if (var2 == 10) { // L: 92
			this.field2158 = var1.readUnsignedByte();
		} else if (var2 == 11) { // L: 93
			this.field2161 = var1.readUnsignedByte();
		} else if (var2 == 12) { // L: 94
			var3 = var1.readUnsignedByte(); // L: 95
			this.chatFrameIds = new int[var3]; // L: 96

			for (var4 = 0; var4 < var3; ++var4) { // L: 97
				this.chatFrameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) { // L: 98
				this.chatFrameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 13) { // L: 100
			var3 = var1.readUnsignedByte(); // L: 101
			this.soundEffects = new int[var3]; // L: 102

			for (var4 = 0; var4 < var3; ++var4) { // L: 103
				this.soundEffects[var4] = var1.readMedium();
			}
		} else if (var2 == 14) { // L: 105
			this.SequenceDefinition_cachedModelId = var1.readInt(); // L: 106
		} else if (var2 == 15) { // L: 108
			var3 = var1.readUnsignedShort(); // L: 109
			this.field2144 = new HashMap(); // L: 110

			for (var4 = 0; var4 < var3; ++var4) { // L: 111
				int var5 = var1.readUnsignedShort(); // L: 112
				int var6 = var1.readMedium(); // L: 113
				this.field2144.put(var5, var6); // L: 114
			}
		} else if (var2 == 16) { // L: 117
			this.field2152 = var1.readUnsignedShort(); // L: 118
			this.field2160 = var1.readUnsignedShort(); // L: 119
		} else if (var2 == 17) { // L: 121
			this.field2156 = new boolean[256]; // L: 122

			for (var3 = 0; var3 < this.field2156.length; ++var3) { // L: 123
				this.field2156[var3] = false; // L: 124
			}

			var3 = var1.readUnsignedByte(); // L: 126

			for (var4 = 0; var4 < var3; ++var4) { // L: 127
				this.field2156[var1.readUnsignedByte()] = true; // L: 128
			}
		}

	} // L: 132

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field2159 == -1) { // L: 135
			if (this.field2146 == null && this.field2156 == null) { // L: 136
				this.field2159 = 0; // L: 137
			} else {
				this.field2159 = 2;
			}
		}

		if (this.field2158 == -1) { // L: 139
			if (this.field2146 == null && this.field2156 == null) { // L: 140
				this.field2158 = 0; // L: 141
			} else {
				this.field2158 = 2;
			}
		}

	} // L: 143

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Liq;II)Liq;",
		garbageValue = "741452141"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) { // L: 146
			var2 = this.frameIds[var2]; // L: 147
			Frames var5 = class115.getFrames(var2 >> 16); // L: 148
			var2 &= 65535; // L: 149
			if (var5 == null) { // L: 150
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2)); // L: 151
				var4.animate(var5, var2); // L: 152
				return var4; // L: 153
			}
		} else {
			class122 var3 = class342.method6314(this.SequenceDefinition_cachedModelId); // L: 156
			if (var3 == null) { // L: 157
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var3.method2768()); // L: 158
				var4.method5000(var3, var2); // L: 159
				return var4; // L: 160
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Liq;III)Liq;",
		garbageValue = "-2020846308"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		Model var5;
		if (!this.isCachedModelIdSet()) { // L: 165
			var2 = this.frameIds[var2]; // L: 166
			Frames var6 = class115.getFrames(var2 >> 16); // L: 167
			var2 &= 65535; // L: 168
			if (var6 == null) { // L: 169
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var6.hasAlphaTransform(var2)); // L: 170
				var3 &= 3; // L: 171
				if (var3 == 1) { // L: 172
					var5.rotateY270Ccw();
				} else if (var3 == 2) { // L: 173
					var5.rotateY180();
				} else if (var3 == 3) { // L: 174
					var5.rotateY90Ccw();
				}

				var5.animate(var6, var2); // L: 175
				if (var3 == 1) { // L: 176
					var5.rotateY90Ccw();
				} else if (var3 == 2) { // L: 177
					var5.rotateY180();
				} else if (var3 == 3) { // L: 178
					var5.rotateY270Ccw();
				}

				return var5; // L: 179
			}
		} else {
			class122 var4 = class342.method6314(this.SequenceDefinition_cachedModelId); // L: 182
			if (var4 == null) { // L: 183
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var4.method2768()); // L: 184
				var3 &= 3; // L: 185
				if (var3 == 1) { // L: 186
					var5.rotateY270Ccw();
				} else if (var3 == 2) { // L: 187
					var5.rotateY180();
				} else if (var3 == 3) { // L: 188
					var5.rotateY90Ccw();
				}

				var5.method5000(var4, var2); // L: 189
				if (var3 == 1) { // L: 190
					var5.rotateY90Ccw();
				} else if (var3 == 2) {
					var5.rotateY180(); // L: 191
				} else if (var3 == 3) { // L: 192
					var5.rotateY270Ccw();
				}

				return var5; // L: 193
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Liq;IS)Liq;",
		garbageValue = "21409"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) { // L: 198
			var2 = this.frameIds[var2]; // L: 199
			Frames var5 = class115.getFrames(var2 >> 16); // L: 200
			var2 &= 65535; // L: 201
			if (var5 == null) { // L: 202
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var5.hasAlphaTransform(var2)); // L: 203
				var4.animate(var5, var2); // L: 204
				return var4; // L: 205
			}
		} else {
			class122 var3 = class342.method6314(this.SequenceDefinition_cachedModelId); // L: 208
			if (var3 == null) { // L: 209
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var3.method2768()); // L: 210
				var4.method5000(var3, var2); // L: 211
				return var4; // L: 212
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Liq;ILgw;IB)Liq;",
		garbageValue = "4"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2151 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) { // L: 217
			return this.method3791(var1, var2, var3, var4); // L: 218
		} else {
			Model var5 = var1.toSharedSequenceModel(false); // L: 220
			boolean var6 = false; // L: 221
			Frames var7 = null; // L: 222
			class122 var8;
			if (this.isCachedModelIdSet()) { // L: 223
				var8 = this.method3801(); // L: 224
				if (var3.isCachedModelIdSet() && this.field2156 == null) { // L: 225
					var5.method5000(var8, var2); // L: 226
					return var5; // L: 227
				}

				var5.method4965(var8, var2, this.field2156, false); // L: 229
			} else {
				var2 = this.frameIds[var2]; // L: 232
				var7 = class115.getFrames(var2 >> 16); // L: 233
				var2 &= 65535; // L: 234
				if (var7 == null) { // L: 235
					return var3.transformActorModel(var1, var4);
				}

				if (!var3.isCachedModelIdSet() && (this.field2146 == null || var4 == -1)) { // L: 236
					var5.animate(var7, var2); // L: 237
					return var5; // L: 238
				}

				if (this.field2146 == null || var4 == -1) { // L: 240
					var5.animate(var7, var2); // L: 241
					return var5; // L: 242
				}

				var6 = var3.isCachedModelIdSet(); // L: 244
				if (!var6) { // L: 245
					var5.method4981(var7, var2, this.field2146, false); // L: 246
				}
			}

			if (var3.isCachedModelIdSet()) { // L: 249
				var8 = var3.method3801(); // L: 250
				var5.method4965(var8, var4, this.field2156, true); // L: 251
			} else {
				var4 = var3.frameIds[var4]; // L: 254
				Frames var9 = class115.getFrames(var4 >> 16); // L: 255
				var4 &= 65535; // L: 256
				if (var9 == null) { // L: 257
					return this.transformActorModel(var1, var2);
				}

				var5.method4981(var9, var4, this.field2146, true); // L: 258
			}

			if (var6 && var7 != null) { // L: 260
				var5.method4981(var7, var2, this.field2146, false); // L: 261
			}

			var5.resetBounds(); // L: 263
			return var5; // L: 264
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Liq;ILgw;II)Liq;",
		garbageValue = "136721627"
	)
	Model method3791(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2]; // L: 268
		Frames var5 = class115.getFrames(var2 >> 16); // L: 269
		var2 &= 65535; // L: 270
		if (var5 == null) { // L: 271
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4]; // L: 272
			Frames var6 = class115.getFrames(var4 >> 16); // L: 273
			var4 &= 65535; // L: 274
			Model var7;
			if (var6 == null) { // L: 275
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2)); // L: 276
				var7.animate(var5, var2); // L: 277
				return var7; // L: 278
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4)); // L: 280
				var7.animate2(var5, var2, var6, var4, this.field2146); // L: 281
				return var7; // L: 282
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Liq;II)Liq;",
		garbageValue = "242613872"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) { // L: 286
			int var3 = this.frameIds[var2]; // L: 287
			Frames var4 = class115.getFrames(var3 >> 16); // L: 288
			var3 &= 65535; // L: 289
			if (var4 == null) { // L: 290
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null; // L: 291
				int var6 = 0; // L: 292
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) { // L: 293
					var6 = this.chatFrameIds[var2]; // L: 294
					var5 = class115.getFrames(var6 >> 16); // L: 295
					var6 &= 65535; // L: 296
				}

				Model var7;
				if (var5 != null && var6 != 65535) { // L: 298
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3) & !var5.hasAlphaTransform(var6)); // L: 303
					var7.animate(var4, var3); // L: 304
					var7.animate(var5, var6); // L: 305
					return var7; // L: 306
				} else {
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3)); // L: 299
					var7.animate(var4, var3); // L: 300
					return var7; // L: 301
				}
			}
		} else {
			return this.transformActorModel(var1, var2); // L: 309
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2016485024"
	)
	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0; // L: 314
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2003317016"
	)
	public int method3844() {
		return this.field2160 - this.field2152; // L: 318
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)Ldo;",
		garbageValue = "-1683695849"
	)
	public class122 method3801() {
		return this.isCachedModelIdSet() ? class342.method6314(this.SequenceDefinition_cachedModelId) : null; // L: 330 331 334
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "646079411"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount; // L: 4430
		if (GrandExchangeEvents.localPlayer.x >> 7 == Client.destinationX && GrandExchangeEvents.localPlayer.y >> 7 == Client.destinationY) { // L: 4432
			Client.destinationX = 0; // L: 4433
		}

		LoginPacket.method5192(); // L: 4436
		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) { // L: 4438
			ArchiveLoader.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false); // L: 4439
		}

		MusicPatch.addNpcsToScene(true); // L: 4442
		Varcs.method2463(); // L: 4443
		MusicPatch.addNpcsToScene(false); // L: 4444

		int var6;
		for (Projectile var4 = (Projectile)Client.projectiles.last(); var4 != null; var4 = (Projectile)Client.projectiles.previous()) { // L: 4446 4447 4464
			if (var4.plane == class18.Client_plane && Client.cycle <= var4.cycleEnd) { // L: 4448
				if (Client.cycle >= var4.cycleStart) { // L: 4449
					if (var4.targetIndex > 0) { // L: 4450
						NPC var23 = Client.npcs[var4.targetIndex - 1]; // L: 4451
						if (var23 != null && var23.x >= 0 && var23.x < 13312 && var23.y >= 0 && var23.y < 13312) { // L: 4452
							var4.setDestination(var23.x, var23.y, WorldMapLabel.getTileHeight(var23.x, var23.y, var4.plane) - var4.endHeight, Client.cycle);
						}
					}

					if (var4.targetIndex < 0) { // L: 4454
						var6 = -var4.targetIndex - 1; // L: 4456
						Player var25;
						if (var6 == Client.localPlayerIndex) { // L: 4457
							var25 = GrandExchangeEvents.localPlayer;
						} else {
							var25 = Client.players[var6]; // L: 4458
						}

						if (var25 != null && var25.x >= 0 && var25.x < 13312 && var25.y >= 0 && var25.y < 13312) { // L: 4459
							var4.setDestination(var25.x, var25.y, WorldMapLabel.getTileHeight(var25.x, var25.y, var4.plane) - var4.endHeight, Client.cycle);
						}
					}

					var4.advance(Client.field556); // L: 4461
					ArchiveLoader.scene.drawEntity(class18.Client_plane, (int)var4.x, (int)var4.y, (int)var4.z, 60, var4, var4.yaw, -1L, false); // L: 4462
				}
			} else {
				var4.remove();
			}
		}

		class128.method2854(); // L: 4467
		class17.setViewportShape(var0, var1, var2, var3, true); // L: 4468
		var0 = Client.viewportOffsetX; // L: 4469
		var1 = Client.viewportOffsetY; // L: 4470
		var2 = Client.viewportWidth; // L: 4471
		var3 = Client.viewportHeight; // L: 4472
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4473
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 4474
		int var22 = Client.camAngleX; // L: 4475
		if (Client.field718 / 256 > var22) { // L: 4476
			var22 = Client.field718 / 256;
		}

		if (Client.field546[4] && Client.field636[4] + 128 > var22) { // L: 4477
			var22 = Client.field636[4] + 128;
		}

		int var5 = Client.camAngleY & 2047; // L: 4478
		var6 = class10.oculusOrbFocalPointX; // L: 4479
		int var7 = Decimator.field397; // L: 4480
		int var8 = ClientPacket.oculusOrbFocalPointY; // L: 4481
		int var9 = var22 * 3 + 600; // L: 4484
		int var10 = class13.method164(var9, var3); // L: 4488
		int var11 = 2048 - var22 & 2047; // L: 4489
		int var12 = 2048 - var5 & 2047; // L: 4490
		int var13 = 0; // L: 4491
		int var14 = 0; // L: 4492
		int var15 = var10; // L: 4493
		int var16;
		int var17;
		int var18;
		if (var11 != 0) { // L: 4494
			var16 = Rasterizer3D.Rasterizer3D_sine[var11]; // L: 4495
			var17 = Rasterizer3D.Rasterizer3D_cosine[var11]; // L: 4496
			var18 = var14 * var17 - var16 * var10 >> 16; // L: 4497
			var15 = var16 * var14 + var10 * var17 >> 16; // L: 4498
			var14 = var18; // L: 4499
		}

		if (var12 != 0) { // L: 4501
			var16 = Rasterizer3D.Rasterizer3D_sine[var12]; // L: 4502
			var17 = Rasterizer3D.Rasterizer3D_cosine[var12]; // L: 4503
			var18 = var17 * var13 + var15 * var16 >> 16; // L: 4504
			var15 = var15 * var17 - var13 * var16 >> 16; // L: 4505
			var13 = var18; // L: 4506
		}

		if (Client.isCameraLocked) { // L: 4508
			class93.field1253 = var6 - var13; // L: 4509
			PcmPlayer.field294 = var7 - var14; // L: 4510
			WorldMapElement.field1837 = var8 - var15; // L: 4511
			ObjectComposition.field2065 = var22; // L: 4512
			class21.field116 = var5; // L: 4513
		} else {
			WorldMapLabelSize.cameraX = var6 - var13; // L: 4516
			ItemContainer.cameraY = var7 - var14; // L: 4517
			class154.cameraZ = var8 - var15; // L: 4518
			class147.cameraPitch = var22; // L: 4519
			class21.cameraYaw = var5; // L: 4520
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (class10.oculusOrbFocalPointX >> 7 != GrandExchangeEvents.localPlayer.x >> 7 || ClientPacket.oculusOrbFocalPointY >> 7 != GrandExchangeEvents.localPlayer.y >> 7)) { // L: 4522 4523
			var16 = GrandExchangeEvents.localPlayer.plane; // L: 4524
			var17 = (class10.oculusOrbFocalPointX >> 7) + GrandExchangeOfferOwnWorldComparator.baseX; // L: 4525
			var18 = (ClientPacket.oculusOrbFocalPointY >> 7) + VarcInt.baseY; // L: 4526
			StructComposition.method3619(var17, var18, var16, true); // L: 4527
		}

		int var19;
		int var20;
		int var21;
		if (!Client.isCameraLocked) { // L: 4532
			if (class131.clientPreferences.method2263()) { // L: 4535
				var12 = class18.Client_plane; // L: 4536
			} else {
				label405: {
					var13 = 3; // L: 4539
					if (class147.cameraPitch < 310) { // L: 4540
						label402: {
							if (Client.oculusOrbState == 1) { // L: 4543
								var14 = class10.oculusOrbFocalPointX >> 7; // L: 4544
								var15 = ClientPacket.oculusOrbFocalPointY >> 7; // L: 4545
							} else {
								var14 = GrandExchangeEvents.localPlayer.x >> 7; // L: 4548
								var15 = GrandExchangeEvents.localPlayer.y >> 7; // L: 4549
							}

							var16 = WorldMapLabelSize.cameraX >> 7; // L: 4551
							var17 = class154.cameraZ >> 7; // L: 4552
							if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) { // L: 4553
								if (var14 >= 0 && var15 >= 0 && var14 < 104 && var15 < 104) { // L: 4557
									if ((Tiles.Tiles_renderFlags[class18.Client_plane][var16][var17] & 4) != 0) { // L: 4561
										var13 = class18.Client_plane;
									}

									if (var14 > var16) { // L: 4563
										var18 = var14 - var16;
									} else {
										var18 = var16 - var14; // L: 4564
									}

									if (var15 > var17) { // L: 4566
										var19 = var15 - var17;
									} else {
										var19 = var17 - var15; // L: 4567
									}

									if (var18 > var19) { // L: 4568
										var20 = var19 * 65536 / var18; // L: 4569
										var21 = 32768; // L: 4570

										while (true) {
											if (var14 == var16) { // L: 4571
												break label402;
											}

											if (var16 < var14) { // L: 4572
												++var16;
											} else if (var16 > var14) { // L: 4573
												--var16;
											}

											if ((Tiles.Tiles_renderFlags[class18.Client_plane][var16][var17] & 4) != 0) { // L: 4574
												var13 = class18.Client_plane;
											}

											var21 += var20; // L: 4575
											if (var21 >= 65536) { // L: 4576
												var21 -= 65536; // L: 4577
												if (var17 < var15) { // L: 4578
													++var17;
												} else if (var17 > var15) { // L: 4579
													--var17;
												}

												if ((Tiles.Tiles_renderFlags[class18.Client_plane][var16][var17] & 4) != 0) { // L: 4580
													var13 = class18.Client_plane;
												}
											}
										}
									} else {
										if (var19 > 0) { // L: 4584
											var20 = var18 * 65536 / var19; // L: 4585
											var21 = 32768; // L: 4586

											while (var15 != var17) { // L: 4587
												if (var17 < var15) { // L: 4588
													++var17;
												} else if (var17 > var15) { // L: 4589
													--var17;
												}

												if ((Tiles.Tiles_renderFlags[class18.Client_plane][var16][var17] & 4) != 0) { // L: 4590
													var13 = class18.Client_plane;
												}

												var21 += var20; // L: 4591
												if (var21 >= 65536) { // L: 4592
													var21 -= 65536; // L: 4593
													if (var16 < var14) { // L: 4594
														++var16;
													} else if (var16 > var14) { // L: 4595
														--var16;
													}

													if ((Tiles.Tiles_renderFlags[class18.Client_plane][var16][var17] & 4) != 0) { // L: 4596
														var13 = class18.Client_plane;
													}
												}
											}
										}
										break label402;
									}
								}

								var12 = class18.Client_plane; // L: 4558
								break label405; // L: 4559
							}

							var12 = class18.Client_plane; // L: 4554
							break label405; // L: 4555
						}
					}

					if (GrandExchangeEvents.localPlayer.x >= 0 && GrandExchangeEvents.localPlayer.y >= 0 && GrandExchangeEvents.localPlayer.x < 13312 && GrandExchangeEvents.localPlayer.y < 13312) { // L: 4601
						if ((Tiles.Tiles_renderFlags[class18.Client_plane][GrandExchangeEvents.localPlayer.x >> 7][GrandExchangeEvents.localPlayer.y >> 7] & 4) != 0) { // L: 4605
							var13 = class18.Client_plane;
						}

						var12 = var13; // L: 4606
					} else {
						var12 = class18.Client_plane; // L: 4602
					}
				}
			}

			var11 = var12; // L: 4608
		} else {
			if (class131.clientPreferences.method2263()) { // L: 4613
				var12 = class18.Client_plane; // L: 4614
			} else {
				var13 = WorldMapLabel.getTileHeight(WorldMapLabelSize.cameraX, class154.cameraZ, class18.Client_plane); // L: 4617
				if (var13 - ItemContainer.cameraY < 800 && (Tiles.Tiles_renderFlags[class18.Client_plane][WorldMapLabelSize.cameraX >> 7][class154.cameraZ >> 7] & 4) != 0) { // L: 4618
					var12 = class18.Client_plane; // L: 4619
				} else {
					var12 = 3; // L: 4622
				}
			}

			var11 = var12; // L: 4624
		}

		var12 = WorldMapLabelSize.cameraX; // L: 4626
		var13 = ItemContainer.cameraY; // L: 4627
		var14 = class154.cameraZ; // L: 4628
		var15 = class147.cameraPitch; // L: 4629
		var16 = class21.cameraYaw; // L: 4630

		for (var17 = 0; var17 < 5; ++var17) { // L: 4631
			if (Client.field546[var17]) { // L: 4632
				var18 = (int)(Math.random() * (double)(Client.field756[var17] * 2 + 1) - (double)Client.field756[var17] + Math.sin((double)Client.field674[var17] / 100.0D * (double)Client.field600[var17]) * (double)Client.field636[var17]); // L: 4633
				if (var17 == 0) { // L: 4634
					WorldMapLabelSize.cameraX += var18;
				}

				if (var17 == 1) { // L: 4635
					ItemContainer.cameraY += var18;
				}

				if (var17 == 2) { // L: 4636
					class154.cameraZ += var18;
				}

				if (var17 == 3) { // L: 4637
					class21.cameraYaw = var18 + class21.cameraYaw & 2047;
				}

				if (var17 == 4) { // L: 4638
					class147.cameraPitch += var18; // L: 4639
					if (class147.cameraPitch < 128) { // L: 4640
						class147.cameraPitch = 128;
					}

					if (class147.cameraPitch > 383) { // L: 4641
						class147.cameraPitch = 383;
					}
				}
			}
		}

		var17 = MouseHandler.MouseHandler_x; // L: 4645
		var18 = MouseHandler.MouseHandler_y; // L: 4646
		if (MouseHandler.MouseHandler_lastButton != 0) { // L: 4647
			var17 = MouseHandler.MouseHandler_lastPressedX; // L: 4648
			var18 = MouseHandler.MouseHandler_lastPressedY; // L: 4649
		}

		if (var17 >= var0 && var17 < var0 + var2 && var18 >= var1 && var18 < var3 + var1) { // L: 4651
			var19 = var17 - var0; // L: 4652
			var20 = var18 - var1; // L: 4653
			ViewportMouse.ViewportMouse_x = var19; // L: 4655
			ViewportMouse.ViewportMouse_y = var20; // L: 4656
			ViewportMouse.ViewportMouse_isInViewport = true; // L: 4657
			ViewportMouse.ViewportMouse_entityCount = 0; // L: 4658
			ViewportMouse.ViewportMouse_false0 = false; // L: 4659
		} else {
			class82.method2104(); // L: 4663
		}

		class116.playPcmPlayers(); // L: 4665
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4666
		class116.playPcmPlayers(); // L: 4667
		var19 = Rasterizer3D.Rasterizer3D_zoom; // L: 4668
		Rasterizer3D.Rasterizer3D_zoom = Client.viewportZoom; // L: 4669
		ArchiveLoader.scene.draw(WorldMapLabelSize.cameraX, ItemContainer.cameraY, class154.cameraZ, class147.cameraPitch, class21.cameraYaw, var11); // L: 4670
		Rasterizer3D.Rasterizer3D_zoom = var19; // L: 4671
		class116.playPcmPlayers(); // L: 4672
		ArchiveLoader.scene.clearTempGameObjects(); // L: 4673
		MouseRecorder.method2096(var0, var1, var2, var3); // L: 4674
		class12.method158(var0, var1); // L: 4675
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).animate(Client.field556); // L: 4676
		class260.method5173(); // L: 4678
		WorldMapLabelSize.cameraX = var12; // L: 4680
		ItemContainer.cameraY = var13; // L: 4681
		class154.cameraZ = var14; // L: 4682
		class147.cameraPitch = var15; // L: 4683
		class21.cameraYaw = var16; // L: 4684
		if (Client.isLoading) { // L: 4685
			byte var24 = 0; // L: 4688
			var21 = var24 + NetCache.NetCache_pendingPriorityWritesCount + NetCache.NetCache_pendingPriorityResponsesCount; // L: 4689
			if (var21 == 0) { // L: 4693
				Client.isLoading = false;
			}
		}

		if (Client.isLoading) { // L: 4695
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4696
			MusicPatch.drawLoadingMessage("Loading - please wait.", false); // L: 4697
		}

	} // L: 4699
}
