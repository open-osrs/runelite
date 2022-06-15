import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gc")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("c")
	static boolean field2166;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("SequenceDefinition_archive")
	static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("SequenceDefinition_animationsArchive")
	static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("SequenceDefinition_cached")
	public static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("SequenceDefinition_cachedFrames")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("SequenceDefinition_cachedModel")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1654992317
	)
	@Export("SequenceDefinition_cachedModelId")
	int SequenceDefinition_cachedModelId;
	@ObfuscatedName("y")
	public Map field2172;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 197023681
	)
	int field2173;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 310114289
	)
	int field2164;
	@ObfuscatedName("t")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("z")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("r")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("u")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 790194713
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("h")
	int[] field2180;
	@ObfuscatedName("x")
	boolean[] field2181;
	@ObfuscatedName("l")
	public boolean field2182;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1662385101
	)
	public int field2183;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1893104295
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -216403099
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1939539881
	)
	public int field2186;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -174247791
	)
	public int field2187;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1763697953
	)
	public int field2188;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1018362487
	)
	public int field2174;

	static {
		field2166 = false; // L: 16
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64); // L: 20
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100); // L: 21
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100); // L: 22
	}

	SequenceDefinition() {
		this.SequenceDefinition_cachedModelId = -1; // L: 23
		this.field2173 = 0; // L: 25
		this.field2164 = 0; // L: 26
		this.frameCount = -1; // L: 31
		this.field2182 = false; // L: 34
		this.field2183 = 5; // L: 35
		this.shield = -1; // L: 36
		this.weapon = -1; // L: 37
		this.field2186 = 99; // L: 38
		this.field2187 = -1; // L: 39
		this.field2188 = -1; // L: 40
		this.field2174 = 2; // L: 41
	} // L: 43

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqt;I)V",
		garbageValue = "-950901529"
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
		descriptor = "(Lqt;II)V",
		garbageValue = "325602175"
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
			this.field2180 = new int[var3 + 1]; // L: 82

			for (var4 = 0; var4 < var3; ++var4) { // L: 83
				this.field2180[var4] = var1.readUnsignedByte();
			}

			this.field2180[var3] = 9999999; // L: 84
		} else if (var2 == 4) { // L: 86
			this.field2182 = true;
		} else if (var2 == 5) { // L: 87
			this.field2183 = var1.readUnsignedByte();
		} else if (var2 == 6) { // L: 88
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 89
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) { // L: 90
			this.field2186 = var1.readUnsignedByte();
		} else if (var2 == 9) { // L: 91
			this.field2187 = var1.readUnsignedByte();
		} else if (var2 == 10) { // L: 92
			this.field2188 = var1.readUnsignedByte();
		} else if (var2 == 11) { // L: 93
			this.field2174 = var1.readUnsignedByte();
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
			this.field2172 = new HashMap(); // L: 110

			for (var4 = 0; var4 < var3; ++var4) { // L: 111
				int var5 = var1.readUnsignedShort(); // L: 112
				int var6 = var1.readMedium(); // L: 113
				this.field2172.put(var5, var6); // L: 114
			}
		} else if (var2 == 16) { // L: 117
			this.field2173 = var1.readUnsignedShort(); // L: 118
			this.field2164 = var1.readUnsignedShort(); // L: 119
		} else if (var2 == 17) { // L: 121
			this.field2181 = new boolean[256]; // L: 122

			for (var3 = 0; var3 < this.field2181.length; ++var3) { // L: 123
				this.field2181[var3] = false; // L: 124
			}

			var3 = var1.readUnsignedByte(); // L: 126

			for (var4 = 0; var4 < var3; ++var4) { // L: 127
				this.field2181[var1.readUnsignedByte()] = true; // L: 128
			}
		}

	} // L: 132

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "283328116"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field2187 == -1) { // L: 135
			if (this.field2180 == null && this.field2181 == null) { // L: 136
				this.field2187 = 0; // L: 137
			} else {
				this.field2187 = 2;
			}
		}

		if (this.field2188 == -1) { // L: 139
			if (this.field2180 == null && this.field2181 == null) { // L: 140
				this.field2188 = 0; // L: 141
			} else {
				this.field2188 = 2;
			}
		}

	} // L: 143

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lhy;II)Lhy;",
		garbageValue = "-427559290"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) { // L: 146
			var2 = this.frameIds[var2]; // L: 147
			Frames var8 = ParamComposition.getFrames(var2 >> 16); // L: 148
			var2 &= 65535; // L: 149
			if (var8 == null) { // L: 150
				return var1.toSharedSequenceModel(true);
			} else {
				Model var7 = var1.toSharedSequenceModel(!var8.hasAlphaTransform(var2)); // L: 151
				var7.animate(var8, var2); // L: 152
				return var7; // L: 153
			}
		} else {
			int var4 = this.SequenceDefinition_cachedModelId; // L: 157
			class122 var5 = (class122)SequenceDefinition_cachedModel.get((long)var4); // L: 159
			class122 var3;
			if (var5 != null) { // L: 160
				var3 = var5; // L: 161
			} else {
				var5 = SecureRandomFuture.method1963(SequenceDefinition_animationsArchive, SequenceDefinition_skeletonsArchive, var4, false); // L: 164
				if (var5 != null) { // L: 165
					SequenceDefinition_cachedModel.put(var5, (long)var4);
				}

				var3 = var5; // L: 166
			}

			if (var3 == null) { // L: 169
				return var1.toSharedSequenceModel(true);
			} else {
				Model var6 = var1.toSharedSequenceModel(!var3.method2778()); // L: 170
				var6.method4404(var3, var2); // L: 171
				return var6; // L: 172
			}
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lhy;III)Lhy;",
		garbageValue = "-331559312"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		if (!this.isCachedModelIdSet()) { // L: 177
			var2 = this.frameIds[var2]; // L: 178
			Frames var9 = ParamComposition.getFrames(var2 >> 16); // L: 179
			var2 &= 65535; // L: 180
			if (var9 == null) {
				return var1.toSharedSequenceModel(true); // L: 181
			} else {
				Model var8 = var1.toSharedSequenceModel(!var9.hasAlphaTransform(var2)); // L: 182
				var3 &= 3; // L: 183
				if (var3 == 1) { // L: 184
					var8.rotateY270Ccw();
				} else if (var3 == 2) { // L: 185
					var8.rotateY180();
				} else if (var3 == 3) { // L: 186
					var8.rotateY90Ccw();
				}

				var8.animate(var9, var2); // L: 187
				if (var3 == 1) { // L: 188
					var8.rotateY90Ccw();
				} else if (var3 == 2) { // L: 189
					var8.rotateY180();
				} else if (var3 == 3) { // L: 190
					var8.rotateY270Ccw();
				}

				return var8; // L: 191
			}
		} else {
			int var5 = this.SequenceDefinition_cachedModelId; // L: 195
			class122 var6 = (class122)SequenceDefinition_cachedModel.get((long)var5); // L: 197
			class122 var4;
			if (var6 != null) { // L: 198
				var4 = var6; // L: 199
			} else {
				var6 = SecureRandomFuture.method1963(SequenceDefinition_animationsArchive, SequenceDefinition_skeletonsArchive, var5, false); // L: 202
				if (var6 != null) { // L: 203
					SequenceDefinition_cachedModel.put(var6, (long)var5);
				}

				var4 = var6; // L: 204
			}

			if (var4 == null) { // L: 207
				return var1.toSharedSequenceModel(true);
			} else {
				Model var7 = var1.toSharedSequenceModel(!var4.method2778()); // L: 208
				var3 &= 3; // L: 209
				if (var3 == 1) { // L: 210
					var7.rotateY270Ccw();
				} else if (var3 == 2) { // L: 211
					var7.rotateY180();
				} else if (var3 == 3) { // L: 212
					var7.rotateY90Ccw();
				}

				var7.method4404(var4, var2); // L: 213
				if (var3 == 1) { // L: 214
					var7.rotateY90Ccw();
				} else if (var3 == 2) { // L: 215
					var7.rotateY180();
				} else if (var3 == 3) { // L: 216
					var7.rotateY270Ccw();
				}

				return var7; // L: 217
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lhy;II)Lhy;",
		garbageValue = "-1841001380"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) { // L: 222
			var2 = this.frameIds[var2]; // L: 223
			Frames var8 = ParamComposition.getFrames(var2 >> 16); // L: 224
			var2 &= 65535; // L: 225
			if (var8 == null) { // L: 226
				return var1.toSharedSpotAnimationModel(true);
			} else {
				Model var7 = var1.toSharedSpotAnimationModel(!var8.hasAlphaTransform(var2)); // L: 227
				var7.animate(var8, var2); // L: 228
				return var7; // L: 229
			}
		} else {
			int var4 = this.SequenceDefinition_cachedModelId; // L: 233
			class122 var5 = (class122)SequenceDefinition_cachedModel.get((long)var4); // L: 235
			class122 var3;
			if (var5 != null) { // L: 236
				var3 = var5; // L: 237
			} else {
				var5 = SecureRandomFuture.method1963(SequenceDefinition_animationsArchive, SequenceDefinition_skeletonsArchive, var4, false); // L: 240
				if (var5 != null) { // L: 241
					SequenceDefinition_cachedModel.put(var5, (long)var4);
				}

				var3 = var5; // L: 242
			}

			if (var3 == null) { // L: 245
				return var1.toSharedSpotAnimationModel(true);
			} else {
				Model var6 = var1.toSharedSpotAnimationModel(!var3.method2778()); // L: 246
				var6.method4404(var3, var2); // L: 247
				return var6; // L: 248
			}
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lhy;ILgc;II)Lhy;",
		garbageValue = "-1919480423"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2166 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) { // L: 253
			return this.method3828(var1, var2, var3, var4); // L: 254
		} else {
			Model var5 = var1.toSharedSequenceModel(false); // L: 256
			boolean var6 = false; // L: 257
			Frames var7 = null; // L: 258
			class122 var8;
			if (this.isCachedModelIdSet()) { // L: 259
				var8 = this.method3836(); // L: 260
				if (var3.isCachedModelIdSet() && this.field2181 == null) { // L: 261
					var5.method4404(var8, var2); // L: 262
					return var5; // L: 263
				}

				var5.method4399(var8, var2, this.field2181, false); // L: 265
			} else {
				var2 = this.frameIds[var2]; // L: 268
				var7 = ParamComposition.getFrames(var2 >> 16); // L: 269
				var2 &= 65535; // L: 270
				if (var7 == null) { // L: 271
					return var3.transformActorModel(var1, var4);
				}

				if (!var3.isCachedModelIdSet() && (this.field2180 == null || var4 == -1)) { // L: 272
					var5.animate(var7, var2); // L: 273
					return var5; // L: 274
				}

				if (this.field2180 == null || var4 == -1) { // L: 276
					var5.animate(var7, var2); // L: 277
					return var5; // L: 278
				}

				var6 = var3.isCachedModelIdSet(); // L: 280
				if (!var6) { // L: 281
					var5.method4398(var7, var2, this.field2180, false); // L: 282
				}
			}

			if (var3.isCachedModelIdSet()) { // L: 285
				var8 = var3.method3836(); // L: 286
				var5.method4399(var8, var4, this.field2181, true); // L: 287
			} else {
				var4 = var3.frameIds[var4]; // L: 290
				Frames var9 = ParamComposition.getFrames(var4 >> 16); // L: 291
				var4 &= 65535; // L: 292
				if (var9 == null) { // L: 293
					return this.transformActorModel(var1, var2);
				}

				var5.method4398(var9, var4, this.field2180, true); // L: 294
			}

			if (var6 && var7 != null) { // L: 296
				var5.method4398(var7, var2, this.field2180, false); // L: 297
			}

			var5.resetBounds(); // L: 299
			return var5; // L: 300
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lhy;ILgc;IB)Lhy;",
		garbageValue = "63"
	)
	Model method3828(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2]; // L: 304
		Frames var5 = ParamComposition.getFrames(var2 >> 16); // L: 305
		var2 &= 65535; // L: 306
		if (var5 == null) { // L: 307
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4]; // L: 308
			Frames var6 = ParamComposition.getFrames(var4 >> 16); // L: 309
			var4 &= 65535; // L: 310
			Model var7;
			if (var6 == null) { // L: 311
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2)); // L: 312
				var7.animate(var5, var2); // L: 313
				return var7; // L: 314
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4)); // L: 316
				var7.animate2(var5, var2, var6, var4, this.field2180); // L: 317
				return var7; // L: 318
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lhy;II)Lhy;",
		garbageValue = "-212353813"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) { // L: 322
			int var3 = this.frameIds[var2]; // L: 323
			Frames var4 = ParamComposition.getFrames(var3 >> 16); // L: 324
			var3 &= 65535; // L: 325
			if (var4 == null) { // L: 326
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null; // L: 327
				int var6 = 0; // L: 328
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) { // L: 329
					var6 = this.chatFrameIds[var2]; // L: 330
					var5 = ParamComposition.getFrames(var6 >> 16); // L: 331
					var6 &= 65535; // L: 332
				}

				Model var7;
				if (var5 != null && var6 != 65535) { // L: 334
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3) & !var5.hasAlphaTransform(var6)); // L: 339
					var7.animate(var4, var3); // L: 340
					var7.animate(var5, var6); // L: 341
					return var7; // L: 342
				} else {
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3)); // L: 335
					var7.animate(var4, var3); // L: 336
					return var7; // L: 337
				}
			}
		} else {
			return this.transformActorModel(var1, var2); // L: 345
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1630749054"
	)
	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0; // L: 350
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2120991547"
	)
	public int method3835() {
		return this.field2164 - this.field2173; // L: 354
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Lda;",
		garbageValue = "-1352870748"
	)
	public class122 method3836() {
		if (this.isCachedModelIdSet()) { // L: 366
			int var2 = this.SequenceDefinition_cachedModelId; // L: 368
			class122 var3 = (class122)SequenceDefinition_cachedModel.get((long)var2); // L: 370
			class122 var1;
			if (var3 != null) { // L: 371
				var1 = var3; // L: 372
			} else {
				var3 = SecureRandomFuture.method1963(SequenceDefinition_animationsArchive, SequenceDefinition_skeletonsArchive, var2, false); // L: 375
				if (var3 != null) { // L: 376
					SequenceDefinition_cachedModel.put(var3, (long)var2);
				}

				var1 = var3; // L: 377
			}

			return var1; // L: 379
		} else {
			return null; // L: 382
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "-1897967162"
	)
	static final int method3827(int var0, int var1, int var2, int var3) {
		int var4 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var2 * 1024 / var3] >> 1; // L: 900
		return ((65536 - var4) * var0 >> 16) + (var4 * var1 >> 16); // L: 901
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZS)V",
		garbageValue = "26429"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) { // L: 4466
			byte var2 = 4; // L: 4467
			int var3 = var2 + 6; // L: 4468
			int var4 = var2 + 6; // L: 4469
			int var5 = DevicePcmPlayerProvider.fontPlain12.lineWidth(var0, 250); // L: 4470
			int var6 = DevicePcmPlayerProvider.fontPlain12.lineCount(var0, 250) * 13; // L: 4471
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0); // L: 4472
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var5 + var2 + var2, var2 + var6 + var2, 16777215); // L: 4473
			DevicePcmPlayerProvider.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0); // L: 4474
			int var7 = var3 - var2; // L: 4475
			int var8 = var4 - var2; // L: 4476
			int var9 = var2 + var5 + var2; // L: 4477
			int var10 = var2 + var2 + var6; // L: 4478

			int var11;
			for (var11 = 0; var11 < Client.rootWidgetCount; ++var11) { // L: 4480
				if (Client.rootWidgetXs[var11] + Client.rootWidgetWidths[var11] > var7 && Client.rootWidgetXs[var11] < var9 + var7 && Client.rootWidgetHeights[var11] + Client.rootWidgetYs[var11] > var8 && Client.rootWidgetYs[var11] < var8 + var10) { // L: 4481
					Client.field703[var11] = true;
				}
			}

			if (var1) { // L: 4484
				Message.rasterProvider.drawFull(0, 0); // L: 4485
			} else {
				var11 = var3; // L: 4488
				int var12 = var4; // L: 4489
				int var13 = var5; // L: 4490
				int var14 = var6; // L: 4491

				for (int var15 = 0; var15 < Client.rootWidgetCount; ++var15) { // L: 4493
					if (Client.rootWidgetXs[var15] + Client.rootWidgetWidths[var15] > var11 && Client.rootWidgetXs[var15] < var13 + var11 && Client.rootWidgetYs[var15] + Client.rootWidgetHeights[var15] > var12 && Client.rootWidgetYs[var15] < var14 + var12) { // L: 4494
						Client.field704[var15] = true;
					}
				}
			}

		}
	} // L: 4498
}
