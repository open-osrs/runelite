import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gq")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("o")
	static boolean field2221;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("SequenceDefinition_archive")
	public static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("SequenceDefinition_animationsArchive")
	public static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	public static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("SequenceDefinition_cached")
	public static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("SequenceDefinition_cachedFrames")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("SequenceDefinition_cachedModel")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -451535761
	)
	@Export("SequenceDefinition_cachedModelId")
	int SequenceDefinition_cachedModelId;
	@ObfuscatedName("r")
	public Map field2209;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1088599689
	)
	int field2207;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 828887833
	)
	int field2202;
	@ObfuscatedName("c")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("w")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("b")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("t")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -242259733
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("x")
	int[] field2217;
	@ObfuscatedName("n")
	boolean[] field2218;
	@ObfuscatedName("e")
	public boolean field2201;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1404138407
	)
	public int field2220;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -681508511
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1106803533
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -256717621
	)
	public int field2223;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1918601831
	)
	public int field2224;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1593140013
	)
	public int field2206;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1948704665
	)
	public int field2208;

	static {
		field2221 = false; // L: 16
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64); // L: 20
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100); // L: 21
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100); // L: 22
	}

	SequenceDefinition() {
		this.SequenceDefinition_cachedModelId = -1; // L: 23
		this.field2207 = 0; // L: 25
		this.field2202 = 0; // L: 26
		this.frameCount = -1; // L: 31
		this.field2201 = false; // L: 34
		this.field2220 = 5; // L: 35
		this.shield = -1; // L: 36
		this.weapon = -1; // L: 37
		this.field2223 = 99; // L: 38
		this.field2224 = -1; // L: 39
		this.field2206 = -1; // L: 40
		this.field2208 = 2; // L: 41
	} // L: 43

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lpx;B)V",
		garbageValue = "106"
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lpx;II)V",
		garbageValue = "696368219"
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
			this.field2217 = new int[var3 + 1]; // L: 76

			for (var4 = 0; var4 < var3; ++var4) { // L: 77
				this.field2217[var4] = var1.readUnsignedByte();
			}

			this.field2217[var3] = 9999999; // L: 78
		} else if (var2 == 4) { // L: 80
			this.field2201 = true;
		} else if (var2 == 5) { // L: 81
			this.field2220 = var1.readUnsignedByte();
		} else if (var2 == 6) { // L: 82
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 83
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) { // L: 84
			this.field2223 = var1.readUnsignedByte();
		} else if (var2 == 9) { // L: 85
			this.field2224 = var1.readUnsignedByte();
		} else if (var2 == 10) { // L: 86
			this.field2206 = var1.readUnsignedByte();
		} else if (var2 == 11) { // L: 87
			this.field2208 = var1.readUnsignedByte();
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
			this.field2209 = new HashMap(); // L: 104

			for (var4 = 0; var4 < var3; ++var4) { // L: 105
				int var5 = var1.readUnsignedShort(); // L: 106
				int var6 = var1.readMedium(); // L: 107
				this.field2209.put(var5, var6); // L: 108
			}
		} else if (var2 == 16) { // L: 111
			this.field2207 = var1.readUnsignedShort(); // L: 112
			this.field2202 = var1.readUnsignedShort(); // L: 113
		} else if (var2 == 17) { // L: 115
			this.field2218 = new boolean[256]; // L: 116

			for (var3 = 0; var3 < this.field2218.length; ++var3) { // L: 117
				this.field2218[var3] = false; // L: 118
			}

			var3 = var1.readUnsignedByte(); // L: 120

			for (var4 = 0; var4 < var3; ++var4) { // L: 121
				this.field2218[var1.readUnsignedByte()] = true; // L: 122
			}
		}

	} // L: 126

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1790392441"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field2224 == -1) { // L: 129
			if (this.field2217 == null && this.field2218 == null) { // L: 130
				this.field2224 = 0; // L: 131
			} else {
				this.field2224 = -1918601831 * 7506;
			}
		}

		if (this.field2206 == -1) { // L: 133
			if (this.field2217 == null && this.field2218 == null) { // L: 134
				this.field2206 = 0; // L: 135
			} else {
				this.field2206 = 2;
			}
		}

	} // L: 137

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lhv;II)Lhv;",
		garbageValue = "-1686484197"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) { // L: 140
			var2 = this.frameIds[var2]; // L: 141
			Frames var5 = class141.getFrames(var2 >> 16); // L: 142
			var2 &= 65535; // L: 143
			if (var5 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var4.animate(var5, var2);
				return var4;
			}
		} else {
			class122 var3 = class146.method2997(this.SequenceDefinition_cachedModelId); // L: 150
			if (var3 == null) { // L: 151
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var3.method2755());
				var4.method4259(var3, var2);
				return var4;
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lhv;III)Lhv;",
		garbageValue = "-680992651"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		Model var5;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var6 = class141.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var6 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var6.hasAlphaTransform(var2));
				var3 &= 3;
				if (var3 == 1) {
					var5.rotateY270Ccw();
				} else if (var3 == 2) { // L: 167
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY90Ccw(); // L: 168
				}

				var5.animate(var6, var2);
				if (var3 == 1) {
					var5.rotateY90Ccw();
				} else if (var3 == 2) { // L: 171
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY270Ccw();
				}

				return var5; // L: 173
			}
		} else {
			class122 var4 = class146.method2997(this.SequenceDefinition_cachedModelId); // L: 176
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var4.method2755());
				var3 &= 3;
				if (var3 == 1) {
					var5.rotateY270Ccw();
				} else if (var3 == 2) { // L: 181
					var5.rotateY180();
				} else if (var3 == 3) { // L: 182
					var5.rotateY90Ccw();
				}

				var5.method4259(var4, var2);
				if (var3 == 1) {
					var5.rotateY90Ccw();
				} else if (var3 == 2) { // L: 185
					var5.rotateY180();
				} else if (var3 == 3) { // L: 186
					var5.rotateY270Ccw();
				}

				return var5; // L: 187
			}
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lhv;II)Lhv;",
		garbageValue = "-1909373486"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var5 = class141.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var5 == null) { // L: 196
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var5.hasAlphaTransform(var2));
				var4.animate(var5, var2);
				return var4; // L: 199
			}
		} else {
			class122 var3 = class146.method2997(this.SequenceDefinition_cachedModelId);
			if (var3 == null) { // L: 203
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var3.method2755()); // L: 204
				var4.method4259(var3, var2); // L: 205
				return var4;
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lhv;ILgq;IB)Lhv;",
		garbageValue = "70"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2221 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) { // L: 211
			return this.method3710(var1, var2, var3, var4);
		} else {
			Model var5 = var1.toSharedSequenceModel(false); // L: 214
			boolean var6 = false;
			Frames var7 = null;
			class122 var8;
			if (this.isCachedModelIdSet()) {
				var8 = this.method3735();
				if (var3.isCachedModelIdSet() && this.field2218 == null) {
					var5.method4259(var8, var2);
					return var5;
				}

				var5.method4263(var8, var2, this.field2218, false); // L: 223
			} else {
				var2 = this.frameIds[var2]; // L: 226
				var7 = class141.getFrames(var2 >> 16); // L: 227
				var2 &= 65535;
				if (var7 == null) {
					return var3.transformActorModel(var1, var4);
				}

				if (!var3.isCachedModelIdSet() && (this.field2217 == null || var4 == -1)) {
					var5.animate(var7, var2);
					return var5; // L: 232
				}

				if (this.field2217 == null || var4 == -1) { // L: 234
					var5.animate(var7, var2); // L: 235
					return var5; // L: 236
				}

				var6 = var3.isCachedModelIdSet();
				if (!var6) {
					var5.method4264(var7, var2, this.field2217, false); // L: 240
				}
			}

			if (var3.isCachedModelIdSet()) {
				var8 = var3.method3735(); // L: 244
				var5.method4263(var8, var4, this.field2218, true);
			} else {
				var4 = var3.frameIds[var4];
				Frames var9 = class141.getFrames(var4 >> 16);
				var4 &= 65535; // L: 250
				if (var9 == null) {
					return this.transformActorModel(var1, var2);
				}

				var5.method4264(var9, var4, this.field2217, true);
			}

			if (var6 && var7 != null) { // L: 254
				var5.method4264(var7, var2, this.field2217, false); // L: 255
			}

			var5.resetBounds(); // L: 257
			return var5;
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lhv;ILgq;IB)Lhv;",
		garbageValue = "-110"
	)
	Model method3710(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2]; // L: 262
		Frames var5 = class141.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var5 == null) { // L: 265
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4]; // L: 266
			Frames var6 = class141.getFrames(var4 >> 16); // L: 267
			var4 &= 65535; // L: 268
			Model var7;
			if (var6 == null) { // L: 269
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2)); // L: 270
				var7.animate(var5, var2); // L: 271
				return var7; // L: 272
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4)); // L: 274
				var7.animate2(var5, var2, var6, var4, this.field2217); // L: 275
				return var7; // L: 276
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lhv;II)Lhv;",
		garbageValue = "771999182"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) { // L: 280
			int var3 = this.frameIds[var2]; // L: 281
			Frames var4 = class141.getFrames(var3 >> 16); // L: 282
			var3 &= 65535; // L: 283
			if (var4 == null) { // L: 284
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null; // L: 285
				int var6 = 0; // L: 286
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) { // L: 287
					var6 = this.chatFrameIds[var2]; // L: 288
					var5 = class141.getFrames(var6 >> 16); // L: 289
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

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1132270109"
	)
	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0; // L: 308
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	public int method3729() {
		return this.field2202 - this.field2207; // L: 312
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Lds;",
		garbageValue = "2065274183"
	)
	public class122 method3735() {
		return this.isCachedModelIdSet() ? class146.method2997(this.SequenceDefinition_cachedModelId) : null; // L: 353 354 357
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;",
		garbageValue = "-1646829162"
	)
	static File method3717(String var0, String var1, int var2) {
		String var3 = var2 == 0 ? "" : "" + var2; // L: 144
		JagexCache.JagexCache_locationFile = new File(BufferedSource.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat"); // L: 145
		String var4 = null; // L: 146
		String var5 = null; // L: 147
		boolean var6 = false; // L: 148
		int var11;
		File var26;
		if (JagexCache.JagexCache_locationFile.exists()) { // L: 149
			try {
				AccessFile var7 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L); // L: 152

				Buffer var8;
				int var9;
				for (var8 = new Buffer((int)var7.length()); var8.offset < var8.array.length; var8.offset += var9) { // L: 153 154 157
					var9 = var7.read(var8.array, var8.offset, var8.array.length - var8.offset); // L: 155
					if (var9 == -1) { // L: 156
						throw new IOException();
					}
				}

				var8.offset = 0; // L: 159
				var9 = var8.readUnsignedByte(); // L: 160
				if (var9 < 1 || var9 > 3) { // L: 161
					throw new IOException("" + var9);
				}

				int var10 = 0; // L: 162
				if (var9 > 1) { // L: 163
					var10 = var8.readUnsignedByte();
				}

				if (var9 <= 2) { // L: 164
					var4 = var8.readStringCp1252NullCircumfixed(); // L: 165
					if (var10 == 1) { // L: 166
						var5 = var8.readStringCp1252NullCircumfixed();
					}
				} else {
					var4 = var8.readCESU8(); // L: 169
					if (var10 == 1) { // L: 170
						var5 = var8.readCESU8();
					}
				}

				var7.close(); // L: 172
			} catch (IOException var24) { // L: 174
				var24.printStackTrace(); // L: 175
			}

			if (var4 != null) { // L: 177
				var26 = new File(var4); // L: 178
				if (!var26.exists()) { // L: 179
					var4 = null; // L: 180
				}
			}

			if (var4 != null) { // L: 183
				var26 = new File(var4, "test.dat"); // L: 184

				boolean var27;
				try {
					RandomAccessFile var15 = new RandomAccessFile(var26, "rw"); // L: 188
					var11 = var15.read(); // L: 189
					var15.seek(0L); // L: 190
					var15.write(var11); // L: 191
					var15.seek(0L); // L: 192
					var15.close(); // L: 193
					var26.delete(); // L: 194
					var27 = true; // L: 195
				} catch (Exception var22) { // L: 197
					var27 = false; // L: 198
				}

				if (!var27) { // L: 201
					var4 = null; // L: 202
				}
			}
		}

		if (var4 == null && var2 == 0) { // L: 206
			label137:
			for (int var16 = 0; var16 < class83.cacheSubPaths.length; ++var16) { // L: 207
				for (int var17 = 0; var17 < SecureRandomCallable.cacheParentPaths.length; ++var17) { // L: 208
					File var18 = new File(SecureRandomCallable.cacheParentPaths[var17] + class83.cacheSubPaths[var16] + File.separatorChar + var0 + File.separatorChar); // L: 209
					if (var18.exists()) { // L: 210
						File var19 = new File(var18, "test.dat"); // L: 212

						boolean var28;
						try {
							RandomAccessFile var12 = new RandomAccessFile(var19, "rw"); // L: 215
							int var13 = var12.read(); // L: 216
							var12.seek(0L); // L: 217
							var12.write(var13); // L: 218
							var12.seek(0L); // L: 219
							var12.close(); // L: 220
							var19.delete(); // L: 221
							var28 = true; // L: 222
						} catch (Exception var21) { // L: 224
							var28 = false; // L: 225
						}

						if (var28) { // L: 228
							var4 = var18.toString(); // L: 229
							var6 = true; // L: 230
							break label137; // L: 231
						}
					}
				}
			}
		}

		if (var4 == null) { // L: 237
			var4 = BufferedSource.userHomeDirectory + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar; // L: 238
			var6 = true; // L: 239
		}

		if (var5 != null) { // L: 241
			File var25 = new File(var5); // L: 242
			var26 = new File(var4); // L: 243

			try {
				File[] var31 = var25.listFiles(); // L: 245
				File[] var30 = var31; // L: 247

				for (var11 = 0; var11 < var30.length; ++var11) { // L: 248
					File var29 = var30[var11]; // L: 249
					File var20 = new File(var26, var29.getName()); // L: 251
					boolean var14 = var29.renameTo(var20); // L: 252
					if (!var14) { // L: 253
						throw new IOException();
					}
				}
			} catch (Exception var23) { // L: 258
				var23.printStackTrace(); // L: 259
			}

			var6 = true; // L: 261
		}

		if (var6) { // L: 263
			class268.method5030(new File(var4), (File)null);
		}

		return new File(var4); // L: 264
	}
}
