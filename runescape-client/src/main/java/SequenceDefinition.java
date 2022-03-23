import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("v")
	static boolean field2150;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("SequenceDefinition_animationsArchive")
	public static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("SequenceDefinition_cached")
	public static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("SequenceDefinition_cachedFrames")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("SequenceDefinition_cachedModel")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1904575055
	)
	@Export("SequenceDefinition_cachedModelId")
	int SequenceDefinition_cachedModelId;
	@ObfuscatedName("u")
	public Map field2170;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1007143009
	)
	int field2151;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1999392015
	)
	int field2157;
	@ObfuscatedName("x")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("c")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("j")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("p")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -754201145
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("b")
	int[] field2156;
	@ObfuscatedName("w")
	boolean[] field2164;
	@ObfuscatedName("a")
	public boolean field2165;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1512546953
	)
	public int field2166;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1639485167
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 480167985
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1414981787
	)
	public int field2169;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 142595323
	)
	public int field2162;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1199184569
	)
	public int field2171;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1417760427
	)
	public int field2172;

	static {
		field2150 = false; // L: 16
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64); // L: 20
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100); // L: 21
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100); // L: 22
	}

	SequenceDefinition() {
		this.SequenceDefinition_cachedModelId = -1; // L: 23
		this.field2151 = 0; // L: 25
		this.field2157 = 0; // L: 26
		this.frameCount = -1; // L: 31
		this.field2165 = false; // L: 34
		this.field2166 = 5; // L: 35
		this.shield = -1; // L: 36
		this.weapon = -1; // L: 37
		this.field2169 = 99; // L: 38
		this.field2162 = -1; // L: 39
		this.field2171 = -1; // L: 40
		this.field2172 = 2; // L: 41
	} // L: 43

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpd;B)V",
		garbageValue = "-4"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 58
			if (var2 == 0) { // L: 59
				return; // L: 62
			}

			this.decodeNext(var1, var2); // L: 60
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lpd;II)V",
		garbageValue = "429154180"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) { // L: 65
			var3 = var1.readUnsignedShort(); // L: 66
			this.frameLengths = new int[var3]; // L: 67

			for (var4 = 0; var4 < var3; ++var4) { // L: 68
				this.frameLengths[var4] = var1.readUnsignedShort();
			}

			this.frameIds = new int[var3]; // L: 69

			for (var4 = 0; var4 < var3; ++var4) { // L: 70
				this.frameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) { // L: 71
				this.frameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 2) { // L: 73
			this.frameCount = var1.readUnsignedShort();
		} else if (var2 == 3) { // L: 74
			var3 = var1.readUnsignedByte(); // L: 75
			this.field2156 = new int[var3 + 1]; // L: 76

			for (var4 = 0; var4 < var3; ++var4) { // L: 77
				this.field2156[var4] = var1.readUnsignedByte();
			}

			this.field2156[var3] = 9999999; // L: 78
		} else if (var2 == 4) { // L: 80
			this.field2165 = true;
		} else if (var2 == 5) { // L: 81
			this.field2166 = var1.readUnsignedByte();
		} else if (var2 == 6) { // L: 82
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 83
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) { // L: 84
			this.field2169 = var1.readUnsignedByte();
		} else if (var2 == 9) { // L: 85
			this.field2162 = var1.readUnsignedByte();
		} else if (var2 == 10) { // L: 86
			this.field2171 = var1.readUnsignedByte();
		} else if (var2 == 11) { // L: 87
			this.field2172 = var1.readUnsignedByte();
		} else if (var2 == 12) { // L: 88
			var3 = var1.readUnsignedByte(); // L: 89
			this.chatFrameIds = new int[var3]; // L: 90

			for (var4 = 0; var4 < var3; ++var4) { // L: 91
				this.chatFrameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) { // L: 92
				this.chatFrameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 13) { // L: 94
			var3 = var1.readUnsignedByte(); // L: 95
			this.soundEffects = new int[var3]; // L: 96

			for (var4 = 0; var4 < var3; ++var4) { // L: 97
				this.soundEffects[var4] = var1.readMedium();
			}
		} else if (var2 == 14) { // L: 99
			this.SequenceDefinition_cachedModelId = var1.readInt(); // L: 100
		} else if (var2 == 15) { // L: 102
			var3 = var1.readUnsignedShort(); // L: 103
			this.field2170 = new HashMap(); // L: 104

			for (var4 = 0; var4 < var3; ++var4) { // L: 105
				int var5 = var1.readUnsignedShort(); // L: 106
				int var6 = var1.readMedium(); // L: 107
				this.field2170.put(var5, var6); // L: 108
			}
		} else if (var2 == 16) { // L: 111
			this.field2151 = var1.readUnsignedShort(); // L: 112
			this.field2157 = var1.readUnsignedShort(); // L: 113
		} else if (var2 == 17) { // L: 115
			this.field2164 = new boolean[256]; // L: 116

			for (var3 = 0; var3 < this.field2164.length; ++var3) { // L: 117
				this.field2164[var3] = false; // L: 118
			}

			var3 = var1.readUnsignedByte(); // L: 120

			for (var4 = 0; var4 < var3; ++var4) { // L: 121
				this.field2164[var1.readUnsignedByte()] = true; // L: 122
			}
		}

	} // L: 126

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "45"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field2162 == -1) { // L: 129
			if (this.field2156 == null && this.field2164 == null) { // L: 130
				this.field2162 = 0; // L: 131
			} else {
				this.field2162 = 2;
			}
		}

		if (this.field2171 == -1) { // L: 133
			if (this.field2156 == null && this.field2164 == null) { // L: 134
				this.field2171 = 0; // L: 135
			} else {
				this.field2171 = 2;
			}
		}

	} // L: 137

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lhx;II)Lhx;",
		garbageValue = "1225828332"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) { // L: 140
			var2 = this.frameIds[var2]; // L: 141
			Frames var5 = class143.getFrames(var2 >> 16); // L: 142
			var2 &= 65535; // L: 143
			if (var5 == null) { // L: 144
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2)); // L: 145
				var4.animate(var5, var2); // L: 146
				return var4; // L: 147
			}
		} else {
			class122 var3 = class117.method2724(this.SequenceDefinition_cachedModelId); // L: 150
			if (var3 == null) { // L: 151
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var3.method2784()); // L: 152
				var4.method4363(var3, var2); // L: 153
				return var4; // L: 154
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lhx;III)Lhx;",
		garbageValue = "804450447"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		Model var5;
		if (!this.isCachedModelIdSet()) { // L: 159
			var2 = this.frameIds[var2]; // L: 160
			Frames var6 = class143.getFrames(var2 >> 16); // L: 161
			var2 &= 65535; // L: 162
			if (var6 == null) { // L: 163
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var6.hasAlphaTransform(var2)); // L: 164
				var3 &= 3; // L: 165
				if (var3 == 1) { // L: 166
					var5.rotateY270Ccw();
				} else if (var3 == 2) { // L: 167
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY90Ccw(); // L: 168
				}

				var5.animate(var6, var2); // L: 169
				if (var3 == 1) { // L: 170
					var5.rotateY90Ccw();
				} else if (var3 == 2) { // L: 171
					var5.rotateY180();
				} else if (var3 == 3) { // L: 172
					var5.rotateY270Ccw();
				}

				return var5; // L: 173
			}
		} else {
			class122 var4 = class117.method2724(this.SequenceDefinition_cachedModelId); // L: 176
			if (var4 == null) { // L: 177
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var4.method2784()); // L: 178
				var3 &= 3; // L: 179
				if (var3 == 1) { // L: 180
					var5.rotateY270Ccw();
				} else if (var3 == 2) { // L: 181
					var5.rotateY180();
				} else if (var3 == 3) { // L: 182
					var5.rotateY90Ccw();
				}

				var5.method4363(var4, var2); // L: 183
				if (var3 == 1) { // L: 184
					var5.rotateY90Ccw();
				} else if (var3 == 2) {
					var5.rotateY180(); // L: 185
				} else if (var3 == 3) { // L: 186
					var5.rotateY270Ccw();
				}

				return var5; // L: 187
			}
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lhx;IB)Lhx;",
		garbageValue = "-28"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) { // L: 192
			var2 = this.frameIds[var2]; // L: 193
			Frames var5 = class143.getFrames(var2 >> 16); // L: 194
			var2 &= 65535; // L: 195
			if (var5 == null) { // L: 196
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var5.hasAlphaTransform(var2)); // L: 197
				var4.animate(var5, var2); // L: 198
				return var4; // L: 199
			}
		} else {
			class122 var3 = class117.method2724(this.SequenceDefinition_cachedModelId); // L: 202
			if (var3 == null) { // L: 203
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var3.method2784()); // L: 204
				var4.method4363(var3, var2); // L: 205
				return var4; // L: 206
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lhx;ILgg;II)Lhx;",
		garbageValue = "-181616819"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2150 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) { // L: 211
			return this.method3800(var1, var2, var3, var4); // L: 212
		} else {
			Model var5 = var1.toSharedSequenceModel(false); // L: 214
			boolean var6 = false; // L: 215
			Frames var7 = null; // L: 216
			class122 var8;
			if (this.isCachedModelIdSet()) { // L: 217
				var8 = this.method3801(); // L: 218
				if (var3.isCachedModelIdSet() && this.field2164 == null) { // L: 219
					var5.method4363(var8, var2); // L: 220
					return var5; // L: 221
				}

				var5.method4367(var8, var2, this.field2164, false); // L: 223
			} else {
				var2 = this.frameIds[var2]; // L: 226
				var7 = class143.getFrames(var2 >> 16); // L: 227
				var2 &= 65535; // L: 228
				if (var7 == null) { // L: 229
					return var3.transformActorModel(var1, var4);
				}

				if (!var3.isCachedModelIdSet() && (this.field2156 == null || var4 == -1)) { // L: 230
					var5.animate(var7, var2); // L: 231
					return var5; // L: 232
				}

				if (this.field2156 == null || var4 == -1) { // L: 234
					var5.animate(var7, var2); // L: 235
					return var5; // L: 236
				}

				var6 = var3.isCachedModelIdSet(); // L: 238
				if (!var6) { // L: 239
					var5.method4368(var7, var2, this.field2156, false); // L: 240
				}
			}

			if (var3.isCachedModelIdSet()) { // L: 243
				var8 = var3.method3801(); // L: 244
				var5.method4367(var8, var4, this.field2164, true); // L: 245
			} else {
				var4 = var3.frameIds[var4]; // L: 248
				Frames var9 = class143.getFrames(var4 >> 16); // L: 249
				var4 &= 65535; // L: 250
				if (var9 == null) { // L: 251
					return this.transformActorModel(var1, var2);
				}

				var5.method4368(var9, var4, this.field2156, true); // L: 252
			}

			if (var6 && var7 != null) { // L: 254
				var5.method4368(var7, var2, this.field2156, false); // L: 255
			}

			var5.resetBounds(); // L: 257
			return var5; // L: 258
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lhx;ILgg;IB)Lhx;",
		garbageValue = "-117"
	)
	Model method3800(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2]; // L: 262
		Frames var5 = class143.getFrames(var2 >> 16); // L: 263
		var2 &= 65535; // L: 264
		if (var5 == null) { // L: 265
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4]; // L: 266
			Frames var6 = class143.getFrames(var4 >> 16); // L: 267
			var4 &= 65535; // L: 268
			Model var7;
			if (var6 == null) { // L: 269
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2)); // L: 270
				var7.animate(var5, var2); // L: 271
				return var7; // L: 272
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4)); // L: 274
				var7.animate2(var5, var2, var6, var4, this.field2156); // L: 275
				return var7; // L: 276
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lhx;II)Lhx;",
		garbageValue = "-863329997"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) { // L: 280
			int var3 = this.frameIds[var2]; // L: 281
			Frames var4 = class143.getFrames(var3 >> 16); // L: 282
			var3 &= 65535; // L: 283
			if (var4 == null) { // L: 284
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null; // L: 285
				int var6 = 0; // L: 286
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) { // L: 287
					var6 = this.chatFrameIds[var2]; // L: 288
					var5 = class143.getFrames(var6 >> 16); // L: 289
					var6 &= 65535; // L: 290
				}

				Model var7;
				if (var5 != null && var6 != 65535) { // L: 292
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3) & !var5.hasAlphaTransform(var6)); // L: 297
					var7.animate(var4, var3); // L: 298
					var7.animate(var5, var6); // L: 299
					return var7; // L: 300
				} else {
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3)); // L: 293
					var7.animate(var4, var3); // L: 294
					return var7; // L: 295
				}
			}
		} else {
			return this.transformActorModel(var1, var2); // L: 303
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-5"
	)
	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0; // L: 308
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1948000582"
	)
	public int method3827() {
		return this.field2157 - this.field2151; // L: 312
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Ldu;",
		garbageValue = "-1115190580"
	)
	public class122 method3801() {
		return this.isCachedModelIdSet() ? class117.method2724(this.SequenceDefinition_cachedModelId) : null; // L: 324 325 328
	}
}
