import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gn")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("c")
	static boolean field2084;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("SequenceDefinition_animationsArchive")
	public static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("SequenceDefinition_cached")
	public static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("SequenceDefinition_cachedFrames")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	public static EvictingDualNodeHashTable field2086;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -2061102361
	)
	int field2079;
	@ObfuscatedName("n")
	public Map field2075;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1465456923
	)
	int field2082;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1046662309
	)
	int field2083;
	@ObfuscatedName("v")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("d")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("h")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("g")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1755183367
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("a")
	int[] field2089;
	@ObfuscatedName("u")
	boolean[] field2081;
	@ObfuscatedName("k")
	public boolean field2091;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -68245833
	)
	public int field2092;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1710656193
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1298879717
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1981709083
	)
	public int field2095;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -2129353131
	)
	public int field2096;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 2113674843
	)
	public int field2097;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1259669941
	)
	public int field2078;

	static {
		field2084 = false; // L: 16
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64); // L: 20
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100); // L: 21
		field2086 = new EvictingDualNodeHashTable(100); // L: 22
	}

	SequenceDefinition() {
		this.field2079 = -1; // L: 23
		this.field2082 = 0;
		this.field2083 = 0;
		this.frameCount = -1; // L: 31
		this.field2091 = false; // L: 34
		this.field2092 = 5; // L: 35
		this.shield = -1;
		this.weapon = -1; // L: 37
		this.field2095 = 99; // L: 38
		this.field2096 = -1; // L: 39
		this.field2097 = -1; // L: 40
		this.field2078 = 2; // L: 41
	} // L: 43

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "-31"
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lpi;IB)V",
		garbageValue = "122"
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
			this.field2089 = new int[var3 + 1]; // L: 76

			for (var4 = 0; var4 < var3; ++var4) { // L: 77
				this.field2089[var4] = var1.readUnsignedByte();
			}

			this.field2089[var3] = 9999999; // L: 78
		} else if (var2 == 4) { // L: 80
			this.field2091 = true;
		} else if (var2 == 5) { // L: 81
			this.field2092 = var1.readUnsignedByte();
		} else if (var2 == 6) { // L: 82
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 83
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) { // L: 84
			this.field2095 = var1.readUnsignedByte();
		} else if (var2 == 9) { // L: 85
			this.field2096 = var1.readUnsignedByte();
		} else if (var2 == 10) { // L: 86
			this.field2097 = var1.readUnsignedByte();
		} else if (var2 == 11) { // L: 87
			this.field2078 = var1.readUnsignedByte();
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
			this.field2079 = var1.readInt(); // L: 100
		} else if (var2 == 15) { // L: 102
			var3 = var1.readUnsignedShort(); // L: 103
			this.field2075 = new HashMap(); // L: 104

			for (var4 = 0; var4 < var3; ++var4) { // L: 105
				int var5 = var1.readUnsignedShort(); // L: 106
				int var6 = var1.readMedium(); // L: 107
				this.field2075.put(var5, var6); // L: 108
			}
		} else if (var2 == 16) { // L: 111
			this.field2082 = var1.readUnsignedShort(); // L: 112
			this.field2083 = var1.readUnsignedShort(); // L: 113
		} else if (var2 == 17) { // L: 115
			this.field2081 = new boolean[256]; // L: 116

			for (var3 = 0; var3 < this.field2081.length; ++var3) { // L: 117
				this.field2081[var3] = false; // L: 118
			}

			var3 = var1.readUnsignedByte(); // L: 120

			for (var4 = 0; var4 < var3; ++var4) { // L: 121
				this.field2081[var1.readUnsignedByte()] = true; // L: 122
			}
		}

	} // L: 126

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-68"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field2096 == -1) { // L: 129
			if (this.field2089 == null && this.field2081 == null) { // L: 130
				this.field2096 = 0; // L: 131
			} else {
				this.field2096 = 2;
			}
		}

		if (this.field2097 == -1) { // L: 133
			if (this.field2089 == null && this.field2081 == null) { // L: 134
				this.field2097 = 0; // L: 135
			} else {
				this.field2097 = 2;
			}
		}

	} // L: 137

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lgo;IB)Lgo;",
		garbageValue = "-89"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		Model var4;
		if (!this.method3690()) { // L: 140
			var2 = this.frameIds[var2]; // L: 141
			Frames var5 = ItemComposition.getFrames(var2 >> 16); // L: 142
			var2 &= 65535; // L: 143
			if (var5 == null) { // L: 144
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2)); // L: 145
				var4.animate(var5, var2); // L: 146
				return var4; // L: 147
			}
		} else {
			class120 var3 = JagexCache.method3064(this.field2079); // L: 150
			if (var3 == null) { // L: 151
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var3.method2695()); // L: 152
				var4.method4271(var3, var2); // L: 153
				return var4; // L: 154
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lgo;IIB)Lgo;",
		garbageValue = "-127"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		Model var5;
		if (!this.method3690()) { // L: 159
			var2 = this.frameIds[var2]; // L: 160
			Frames var6 = ItemComposition.getFrames(var2 >> 16); // L: 161
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
				} else if (var3 == 3) { // L: 168
					var5.rotateY90Ccw();
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
			class120 var4 = JagexCache.method3064(this.field2079); // L: 176
			if (var4 == null) { // L: 177
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var4.method2695()); // L: 178
				var3 &= 3; // L: 179
				if (var3 == 1) { // L: 180
					var5.rotateY270Ccw();
				} else if (var3 == 2) { // L: 181
					var5.rotateY180();
				} else if (var3 == 3) { // L: 182
					var5.rotateY90Ccw();
				}

				var5.method4271(var4, var2); // L: 183
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lgo;II)Lgo;",
		garbageValue = "2108768382"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		Model var4;
		if (!this.method3690()) { // L: 192
			var2 = this.frameIds[var2]; // L: 193
			Frames var5 = ItemComposition.getFrames(var2 >> 16); // L: 194
			var2 &= 65535; // L: 195
			if (var5 == null) { // L: 196
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var5.hasAlphaTransform(var2)); // L: 197
				var4.animate(var5, var2); // L: 198
				return var4; // L: 199
			}
		} else {
			class120 var3 = JagexCache.method3064(this.field2079); // L: 202
			if (var3 == null) { // L: 203
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var3.method2695()); // L: 204
				var4.method4271(var3, var2); // L: 205
				return var4; // L: 206
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lgo;ILgn;IB)Lgo;",
		garbageValue = "8"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2084 && !this.method3690() && !var3.method3690()) { // L: 211
			return this.method3674(var1, var2, var3, var4); // L: 212
		} else {
			Model var5 = var1.toSharedSequenceModel(false); // L: 214
			boolean var6 = false; // L: 215
			Frames var7 = null; // L: 216
			class120 var8;
			if (this.method3690()) { // L: 217
				var8 = this.method3648(); // L: 218
				if (var3.method3690() && this.field2081 == null) { // L: 219
					var5.method4271(var8, var2); // L: 220
					return var5; // L: 221
				}

				var5.method4202(var8, var2, this.field2081, false); // L: 223
			} else {
				var2 = this.frameIds[var2]; // L: 226
				var7 = ItemComposition.getFrames(var2 >> 16); // L: 227
				var2 &= 65535; // L: 228
				if (var7 == null) { // L: 229
					return var3.transformActorModel(var1, var4);
				}

				if (!var3.method3690() && (this.field2089 == null || var4 == -1)) { // L: 230
					var5.animate(var7, var2); // L: 231
					return var5; // L: 232
				}

				if (this.field2089 == null || var4 == -1) { // L: 234
					var5.animate(var7, var2); // L: 235
					return var5; // L: 236
				}

				var6 = var3.method3690(); // L: 238
				if (!var6) { // L: 239
					var5.method4203(var7, var2, this.field2089, false); // L: 240
				}
			}

			if (var3.method3690()) { // L: 243
				var8 = var3.method3648(); // L: 244
				var5.method4202(var8, var4, this.field2081, true); // L: 245
			} else {
				var4 = var3.frameIds[var4]; // L: 248
				Frames var9 = ItemComposition.getFrames(var4 >> 16); // L: 249
				var4 &= 65535; // L: 250
				if (var9 == null) { // L: 251
					return this.transformActorModel(var1, var2);
				}

				var5.method4203(var9, var4, this.field2089, true); // L: 252
			}

			if (var6 && var7 != null) { // L: 254
				var5.method4203(var7, var2, this.field2089, false); // L: 255
			}

			var5.resetBounds(); // L: 257
			return var5; // L: 258
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lgo;ILgn;II)Lgo;",
		garbageValue = "-2136022860"
	)
	Model method3674(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2]; // L: 262
		Frames var5 = ItemComposition.getFrames(var2 >> 16); // L: 263
		var2 &= 65535; // L: 264
		if (var5 == null) { // L: 265
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4]; // L: 266
			Frames var6 = ItemComposition.getFrames(var4 >> 16); // L: 267
			var4 &= 65535; // L: 268
			Model var7;
			if (var6 == null) { // L: 269
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2)); // L: 270
				var7.animate(var5, var2); // L: 271
				return var7; // L: 272
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4)); // L: 274
				var7.animate2(var5, var2, var6, var4, this.field2089); // L: 275
				return var7; // L: 276
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lgo;II)Lgo;",
		garbageValue = "1131668881"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.method3690()) { // L: 280
			int var3 = this.frameIds[var2]; // L: 281
			Frames var4 = ItemComposition.getFrames(var3 >> 16); // L: 282
			var3 &= 65535; // L: 283
			if (var4 == null) { // L: 284
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null; // L: 285
				int var6 = 0; // L: 286
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) { // L: 287
					var6 = this.chatFrameIds[var2]; // L: 288
					var5 = ItemComposition.getFrames(var6 >> 16); // L: 289
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1401537933"
	)
	public boolean method3690() {
		return this.field2079 >= 0; // L: 308
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2132950979"
	)
	public int method3647() {
		return this.field2083 - this.field2082; // L: 312
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Ldb;",
		garbageValue = "0"
	)
	public class120 method3648() {
		return this.method3690() ? JagexCache.method3064(this.field2079) : null; // L: 353 354 357
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lpi;S)Ljava/lang/String;",
		garbageValue = "-18009"
	)
	public static String method3689(Buffer var0) {
		String var1;
		try {
			int var2 = var0.readUShortSmart(); // L: 25
			if (var2 > 32767) { // L: 26
				var2 = 32767;
			}

			byte[] var3 = new byte[var2]; // L: 27
			var0.offset += class410.huffman.decompress(var0.array, var0.offset, var3, 0, var2); // L: 28
			String var4 = PendingSpawn.decodeStringCp1252(var3, 0, var2); // L: 29
			var1 = var4; // L: 30
		} catch (Exception var6) { // L: 32
			var1 = "Cabbage"; // L: 33
		}

		return var1; // L: 36
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZI)I",
		garbageValue = "-942937629"
	)
	static int method3640(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) { // L: 2130
			if (GameEngine.friendSystem.field778 == 0) { // L: 2131
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -2;
			} else if (GameEngine.friendSystem.field778 == 1) { // L: 2132
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = GameEngine.friendSystem.friendsList.getSize(); // L: 2133
			}

			return 1; // L: 2134
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 2137
				if (GameEngine.friendSystem.method1728() && var3 >= 0 && var3 < GameEngine.friendSystem.friendsList.getSize()) { // L: 2138
					Friend var8 = (Friend)GameEngine.friendSystem.friendsList.get(var3); // L: 2139
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var8.getName(); // L: 2140
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var8.getPreviousName(); // L: 2141
				} else {
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 2144
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 2145
				}

				return 1; // L: 2147
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 2150
				if (GameEngine.friendSystem.method1728() && var3 >= 0 && var3 < GameEngine.friendSystem.friendsList.getSize()) { // L: 2151
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = ((Buddy)GameEngine.friendSystem.friendsList.get(var3)).world; // L: 2152
				} else {
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 2154
				}

				return 1; // L: 2155
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 2158
				if (GameEngine.friendSystem.method1728() && var3 >= 0 && var3 < GameEngine.friendSystem.friendsList.getSize()) { // L: 2159
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = ((Buddy)GameEngine.friendSystem.friendsList.get(var3)).rank; // L: 2160
				} else {
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 2162
				}

				return 1; // L: 2163
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 2166
					int var6 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 2167
					class113.method2618(var5, var6); // L: 2168
					return 1; // L: 2169
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 2172
					GameEngine.friendSystem.addFriend(var5); // L: 2173
					return 1; // L: 2174
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 2177
					GameEngine.friendSystem.removeFriend(var5); // L: 2178
					return 1; // L: 2179
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 2182
					GameEngine.friendSystem.addIgnore(var5); // L: 2183
					return 1; // L: 2184
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 2187
					GameEngine.friendSystem.removeIgnore(var5); // L: 2188
					return 1; // L: 2189
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 2192
					var5 = AbstractWorldMapData.method4791(var5); // L: 2193
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = GameEngine.friendSystem.isFriended(new Username(var5, class194.loginType), false) ? 1 : 0; // L: 2194
					return 1; // L: 2195
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (Players.friendsChat != null) { // L: 2198
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = Players.friendsChat.name; // L: 2199
					} else {
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 2201
					}

					return 1; // L: 2202
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (Players.friendsChat != null) { // L: 2205
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Players.friendsChat.getSize(); // L: 2206
					} else {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 2208
					}

					return 1; // L: 2209
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 2212
					if (Players.friendsChat != null && var3 < Players.friendsChat.getSize()) { // L: 2213
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = Players.friendsChat.get(var3).getUsername().getName(); // L: 2214
					} else {
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 2216
					}

					return 1; // L: 2217
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 2220
					if (Players.friendsChat != null && var3 < Players.friendsChat.getSize()) { // L: 2221
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = ((Buddy)Players.friendsChat.get(var3)).getWorld(); // L: 2222
					} else {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 2224
					}

					return 1; // L: 2225
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 2228
					if (Players.friendsChat != null && var3 < Players.friendsChat.getSize()) { // L: 2229
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = ((Buddy)Players.friendsChat.get(var3)).rank; // L: 2230
					} else {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 2232
					}

					return 1; // L: 2233
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Players.friendsChat != null ? Players.friendsChat.minKick : 0; // L: 2236
					return 1; // L: 2237
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 2240
					class409.clanKickUser(var5); // L: 2241
					return 1; // L: 2242
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Players.friendsChat != null ? Players.friendsChat.rank * -577246511 * -541938127 : 0; // L: 2245
					return 1; // L: 2246
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 2249
					class141.Clan_joinChat(var5); // L: 2250
					return 1; // L: 2251
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					WorldMapIcon_1.Clan_leaveChat(); // L: 2254
					return 1; // L: 2255
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!GameEngine.friendSystem.method1728()) { // L: 2258
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = GameEngine.friendSystem.ignoreList.getSize(); // L: 2259
					}

					return 1; // L: 2260
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 2263
					if (GameEngine.friendSystem.method1728() && var3 >= 0 && var3 < GameEngine.friendSystem.ignoreList.getSize()) { // L: 2264
						Ignored var4 = (Ignored)GameEngine.friendSystem.ignoreList.get(var3); // L: 2265
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4.getName(); // L: 2266
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4.getPreviousName(); // L: 2267
					} else {
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 2270
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 2271
					}

					return 1; // L: 2273
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 2276
					var5 = AbstractWorldMapData.method4791(var5); // L: 2277
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = GameEngine.friendSystem.isIgnored(new Username(var5, class194.loginType)) ? 1 : 0; // L: 2278
					return 1; // L: 2279
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 2282
					if (Players.friendsChat != null && var3 < Players.friendsChat.getSize() && Players.friendsChat.get(var3).getUsername().equals(class340.localPlayer.username)) { // L: 2283
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 1; // L: 2284
					} else {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 2286
					}

					return 1; // L: 2287
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (Players.friendsChat != null && Players.friendsChat.owner != null) { // L: 2290
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = Players.friendsChat.owner; // L: 2291
					} else {
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 2293
					}

					return 1; // L: 2294
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 2297
					if (Players.friendsChat != null && var3 < Players.friendsChat.getSize() && ((ClanMate)Players.friendsChat.get(var3)).isFriend()) { // L: 2298
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 1; // L: 2299
					} else {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 2301
					}

					return 1; // L: 2302
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						GameEngine.friendSystem.friendsList.removeComparator(); // L: 2313
						return 1; // L: 2314
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 2317
							GameEngine.friendSystem.friendsList.addComparator(new UserComparator1(var7)); // L: 2318
							return 1; // L: 2319
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 2322
							GameEngine.friendSystem.friendsList.addComparator(new UserComparator2(var7)); // L: 2323
							return 1; // L: 2324
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 2327
							GameEngine.friendSystem.friendsList.addComparator(new UserComparator3(var7)); // L: 2328
							return 1; // L: 2329
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 2332
							GameEngine.friendSystem.friendsList.addComparator(new UserComparator4(var7)); // L: 2333
							return 1; // L: 2334
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 2337
							GameEngine.friendSystem.friendsList.addComparator(new UserComparator5(var7)); // L: 2338
							return 1; // L: 2339
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 2342
							GameEngine.friendSystem.friendsList.addComparator(new UserComparator6(var7)); // L: 2343
							return 1; // L: 2344
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 2347
							GameEngine.friendSystem.friendsList.addComparator(new UserComparator7(var7)); // L: 2348
							return 1; // L: 2349
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 2352
							GameEngine.friendSystem.friendsList.addComparator(new UserComparator8(var7)); // L: 2353
							return 1; // L: 2354
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 2357
							GameEngine.friendSystem.friendsList.addComparator(new UserComparator9(var7)); // L: 2358
							return 1; // L: 2359
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 2362
							GameEngine.friendSystem.friendsList.addComparator(new UserComparator10(var7)); // L: 2363
							return 1; // L: 2364
						} else if (var0 == 3639) {
							GameEngine.friendSystem.friendsList.sort(); // L: 2367
							return 1; // L: 2368
						} else if (var0 == 3640) {
							GameEngine.friendSystem.ignoreList.removeComparator(); // L: 2371
							return 1; // L: 2372
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 2375
							GameEngine.friendSystem.ignoreList.addComparator(new UserComparator1(var7)); // L: 2376
							return 1; // L: 2377
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 2380
							GameEngine.friendSystem.ignoreList.addComparator(new UserComparator2(var7)); // L: 2381
							return 1; // L: 2382
						} else if (var0 == 3643) {
							GameEngine.friendSystem.ignoreList.sort(); // L: 2385
							return 1; // L: 2386
						} else if (var0 == 3644) {
							if (Players.friendsChat != null) { // L: 2389
								Players.friendsChat.removeComparator(); // L: 2390
							}

							return 1; // L: 2392
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 2395
							if (Players.friendsChat != null) { // L: 2396
								Players.friendsChat.addComparator(new UserComparator1(var7)); // L: 2397
							}

							return 1; // L: 2399
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 2402
							if (Players.friendsChat != null) { // L: 2403
								Players.friendsChat.addComparator(new UserComparator2(var7)); // L: 2404
							}

							return 1; // L: 2406
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 2409
							if (Players.friendsChat != null) { // L: 2410
								Players.friendsChat.addComparator(new UserComparator3(var7)); // L: 2411
							}

							return 1; // L: 2413
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 2416
							if (Players.friendsChat != null) { // L: 2417
								Players.friendsChat.addComparator(new UserComparator4(var7)); // L: 2418
							}

							return 1; // L: 2420
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 2423
							if (Players.friendsChat != null) { // L: 2424
								Players.friendsChat.addComparator(new UserComparator5(var7)); // L: 2425
							}

							return 1; // L: 2427
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 2430
							if (Players.friendsChat != null) { // L: 2431
								Players.friendsChat.addComparator(new UserComparator6(var7)); // L: 2432
							}

							return 1; // L: 2434
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 2437
							if (Players.friendsChat != null) { // L: 2438
								Players.friendsChat.addComparator(new UserComparator7(var7)); // L: 2439
							}

							return 1; // L: 2441
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 2444
							if (Players.friendsChat != null) { // L: 2445
								Players.friendsChat.addComparator(new UserComparator8(var7)); // L: 2446
							}

							return 1; // L: 2448
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 2451
							if (Players.friendsChat != null) { // L: 2452
								Players.friendsChat.addComparator(new UserComparator9(var7)); // L: 2453
							}

							return 1; // L: 2455
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 2458
							if (Players.friendsChat != null) { // L: 2459
								Players.friendsChat.addComparator(new UserComparator10(var7)); // L: 2460
							}

							return 1; // L: 2462
						} else if (var0 == 3655) {
							if (Players.friendsChat != null) { // L: 2465
								Players.friendsChat.sort(); // L: 2466
							}

							return 1; // L: 2468
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 2471
							GameEngine.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7)); // L: 2472
							return 1; // L: 2473
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 2476
							if (Players.friendsChat != null) { // L: 2477
								Players.friendsChat.addComparator(new BuddyRankComparator(var7)); // L: 2478
							}

							return 1; // L: 2480
						} else {
							return 2; // L: 2482
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 2305
					if (Players.friendsChat != null && var3 < Players.friendsChat.getSize() && ((ClanMate)Players.friendsChat.get(var3)).isIgnored()) { // L: 2306
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 1; // L: 2307
					} else {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 2309
					}

					return 1; // L: 2310
				}
			}
		}
	}
}
