import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("c")
	static boolean field2105;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("SequenceDefinition_cached")
	static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("SequenceDefinition_cachedFrames")
	static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("SequenceDefinition_cachedModel")
	static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "[Lpt;"
	)
	@Export("headIconHintSprites")
	static SpritePixels[] headIconHintSprites;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 36227189
	)
	@Export("SequenceDefinition_cachedModelId")
	int SequenceDefinition_cachedModelId;
	@ObfuscatedName("v")
	public Map field2092;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -2142955465
	)
	int field2097;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -2069874317
	)
	int field2094;
	@ObfuscatedName("u")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("h")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("q")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("x")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1476085013
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("n")
	int[] field2100;
	@ObfuscatedName("m")
	boolean[] field2101;
	@ObfuscatedName("d")
	public boolean field2102;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 414443535
	)
	public int field2095;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -100893751
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 922783975
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1203148505
	)
	public int field2108;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -137394199
	)
	public int field2107;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 687984557
	)
	public int field2099;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1794410249
	)
	public int field2109;

	static {
		field2105 = false; // L: 16
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64); // L: 20
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100); // L: 21
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100); // L: 22
	}

	SequenceDefinition() {
		this.SequenceDefinition_cachedModelId = -1; // L: 23
		this.field2097 = 0; // L: 25
		this.field2094 = 0; // L: 26
		this.frameCount = -1;
		this.field2102 = false; // L: 34
		this.field2095 = 5;
		this.shield = -1;
		this.weapon = -1;
		this.field2108 = 99; // L: 38
		this.field2107 = -1; // L: 39
		this.field2099 = -1;
		this.field2109 = 2;
	} // L: 43

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "1476762787"
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lpi;IB)V",
		garbageValue = "-63"
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
			this.field2100 = new int[var3 + 1]; // L: 82

			for (var4 = 0; var4 < var3; ++var4) { // L: 83
				this.field2100[var4] = var1.readUnsignedByte();
			}

			this.field2100[var3] = 9999999; // L: 84
		} else if (var2 == 4) { // L: 86
			this.field2102 = true;
		} else if (var2 == 5) { // L: 87
			this.field2095 = var1.readUnsignedByte();
		} else if (var2 == 6) { // L: 88
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 89
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) { // L: 90
			this.field2108 = var1.readUnsignedByte();
		} else if (var2 == 9) { // L: 91
			this.field2107 = var1.readUnsignedByte();
		} else if (var2 == 10) { // L: 92
			this.field2099 = var1.readUnsignedByte();
		} else if (var2 == 11) { // L: 93
			this.field2109 = var1.readUnsignedByte();
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
			this.field2092 = new HashMap(); // L: 110

			for (var4 = 0; var4 < var3; ++var4) { // L: 111
				int var5 = var1.readUnsignedShort(); // L: 112
				int var6 = var1.readMedium(); // L: 113
				this.field2092.put(var5, var6); // L: 114
			}
		} else if (var2 == 16) { // L: 117
			this.field2097 = var1.readUnsignedShort(); // L: 118
			this.field2094 = var1.readUnsignedShort(); // L: 119
		} else if (var2 == 17) { // L: 121
			this.field2101 = new boolean[256]; // L: 122

			for (var3 = 0; var3 < this.field2101.length; ++var3) { // L: 123
				this.field2101[var3] = false; // L: 124
			}

			var3 = var1.readUnsignedByte(); // L: 126

			for (var4 = 0; var4 < var3; ++var4) { // L: 127
				this.field2101[var1.readUnsignedByte()] = true; // L: 128
			}
		}

	} // L: 132

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-96390146"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field2107 == -1) { // L: 135
			if (this.field2100 == null && this.field2101 == null) { // L: 136
				this.field2107 = 0; // L: 137
			} else {
				this.field2107 = 2;
			}
		}

		if (this.field2099 == -1) { // L: 139
			if (this.field2100 == null && this.field2101 == null) { // L: 140
				this.field2099 = 0; // L: 141
			} else {
				this.field2099 = 2;
			}
		}

	} // L: 143

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lgf;IB)Lgf;",
		garbageValue = "101"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) { // L: 146
			var2 = this.frameIds[var2]; // L: 147
			Frames var5 = MouseHandler.getFrames(var2 >> 16); // L: 148
			var2 &= 65535; // L: 149
			if (var5 == null) { // L: 150
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2)); // L: 151
				var4.animate(var5, var2); // L: 152
				return var4; // L: 153
			}
		} else {
			class120 var3 = WorldMapSectionType.method4724(this.SequenceDefinition_cachedModelId); // L: 156
			if (var3 == null) { // L: 157
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var3.method2697()); // L: 158
				var4.method4140(var3, var2); // L: 159
				return var4; // L: 160
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lgf;IIS)Lgf;",
		garbageValue = "256"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		Model var5;
		if (!this.isCachedModelIdSet()) { // L: 165
			var2 = this.frameIds[var2]; // L: 166
			Frames var6 = MouseHandler.getFrames(var2 >> 16); // L: 167
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
				} else if (var3 == 3) {
					var5.rotateY90Ccw(); // L: 174
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
			class120 var4 = WorldMapSectionType.method4724(this.SequenceDefinition_cachedModelId); // L: 182
			if (var4 == null) { // L: 183
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var4.method2697()); // L: 184
				var3 &= 3; // L: 185
				if (var3 == 1) { // L: 186
					var5.rotateY270Ccw();
				} else if (var3 == 2) { // L: 187
					var5.rotateY180();
				} else if (var3 == 3) { // L: 188
					var5.rotateY90Ccw();
				}

				var5.method4140(var4, var2); // L: 189
				if (var3 == 1) { // L: 190
					var5.rotateY90Ccw();
				} else if (var3 == 2) { // L: 191
					var5.rotateY180();
				} else if (var3 == 3) { // L: 192
					var5.rotateY270Ccw();
				}

				return var5; // L: 193
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lgf;II)Lgf;",
		garbageValue = "-1396727097"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) { // L: 198
			var2 = this.frameIds[var2]; // L: 199
			Frames var5 = MouseHandler.getFrames(var2 >> 16); // L: 200
			var2 &= 65535; // L: 201
			if (var5 == null) { // L: 202
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var5.hasAlphaTransform(var2)); // L: 203
				var4.animate(var5, var2); // L: 204
				return var4; // L: 205
			}
		} else {
			class120 var3 = WorldMapSectionType.method4724(this.SequenceDefinition_cachedModelId); // L: 208
			if (var3 == null) { // L: 209
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var3.method2697()); // L: 210
				var4.method4140(var3, var2); // L: 211
				return var4; // L: 212
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lgf;ILgm;IB)Lgf;",
		garbageValue = "46"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2105 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) { // L: 217
			return this.method3598(var1, var2, var3, var4); // L: 218
		} else {
			Model var5 = var1.toSharedSequenceModel(false); // L: 220
			boolean var6 = false; // L: 221
			Frames var7 = null; // L: 222
			class120 var8;
			if (this.isCachedModelIdSet()) { // L: 223
				var8 = this.method3602(); // L: 224
				if (var3.isCachedModelIdSet() && this.field2101 == null) { // L: 225
					var5.method4140(var8, var2); // L: 226
					return var5; // L: 227
				}

				var5.method4139(var8, var2, this.field2101, false); // L: 229
			} else {
				var2 = this.frameIds[var2]; // L: 232
				var7 = MouseHandler.getFrames(var2 >> 16); // L: 233
				var2 &= 65535; // L: 234
				if (var7 == null) { // L: 235
					return var3.transformActorModel(var1, var4);
				}

				if (!var3.isCachedModelIdSet() && (this.field2100 == null || var4 == -1)) { // L: 236
					var5.animate(var7, var2); // L: 237
					return var5; // L: 238
				}

				if (this.field2100 == null || var4 == -1) { // L: 240
					var5.animate(var7, var2); // L: 241
					return var5; // L: 242
				}

				var6 = var3.isCachedModelIdSet(); // L: 244
				if (!var6) { // L: 245
					var5.method4145(var7, var2, this.field2100, false); // L: 246
				}
			}

			if (var3.isCachedModelIdSet()) { // L: 249
				var8 = var3.method3602(); // L: 250
				var5.method4139(var8, var4, this.field2101, true); // L: 251
			} else {
				var4 = var3.frameIds[var4]; // L: 254
				Frames var9 = MouseHandler.getFrames(var4 >> 16); // L: 255
				var4 &= 65535; // L: 256
				if (var9 == null) { // L: 257
					return this.transformActorModel(var1, var2);
				}

				var5.method4145(var9, var4, this.field2100, true); // L: 258
			}

			if (var6 && var7 != null) { // L: 260
				var5.method4145(var7, var2, this.field2100, false); // L: 261
			}

			var5.resetBounds(); // L: 263
			return var5; // L: 264
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lgf;ILgm;II)Lgf;",
		garbageValue = "1952184409"
	)
	Model method3598(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2]; // L: 268
		Frames var5 = MouseHandler.getFrames(var2 >> 16); // L: 269
		var2 &= 65535; // L: 270
		if (var5 == null) { // L: 271
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4]; // L: 272
			Frames var6 = MouseHandler.getFrames(var4 >> 16); // L: 273
			var4 &= 65535; // L: 274
			Model var7;
			if (var6 == null) { // L: 275
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2)); // L: 276
				var7.animate(var5, var2); // L: 277
				return var7; // L: 278
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4)); // L: 280
				var7.animate2(var5, var2, var6, var4, this.field2100); // L: 281
				return var7; // L: 282
			}
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lgf;IB)Lgf;",
		garbageValue = "-3"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) { // L: 286
			int var3 = this.frameIds[var2]; // L: 287
			Frames var4 = MouseHandler.getFrames(var3 >> 16); // L: 288
			var3 &= 65535; // L: 289
			if (var4 == null) { // L: 290
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null; // L: 291
				int var6 = 0; // L: 292
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) { // L: 293
					var6 = this.chatFrameIds[var2]; // L: 294
					var5 = MouseHandler.getFrames(var6 >> 16); // L: 295
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2140209014"
	)
	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0; // L: 314
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1530125215"
	)
	public int method3637() {
		return this.field2094 - this.field2097; // L: 318
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)Ldw;",
		garbageValue = "-1955299057"
	)
	public class120 method3602() {
		return this.isCachedModelIdSet() ? WorldMapSectionType.method4724(this.SequenceDefinition_cachedModelId) : null; // L: 359 360 363
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-78"
	)
	static void method3623() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 30
			if (var0.stream1 != null) { // L: 31
				class123.pcmStreamMixer.removeSubStream(var0.stream1); // L: 32
				var0.stream1 = null; // L: 33
			}

			if (var0.stream2 != null) { // L: 35
				class123.pcmStreamMixer.removeSubStream(var0.stream2); // L: 36
				var0.stream2 = null; // L: 37
			}
		}

		ObjectSound.objectSounds.clear(); // L: 40
	} // L: 41
}
