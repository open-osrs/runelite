import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("x")
public class class11 {
	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;
	@ObfuscatedName("gl")
	@ObfuscatedGetter(
		intValue = 1120032749
	)
	static int field112;
	@ObfuscatedName("c")
	boolean field87;
	@ObfuscatedName("o")
	boolean field88;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		longValue = 3282705810889251661L
	)
	long field103;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1207277285
	)
	int field90;
	@ObfuscatedName("z")
	public String field91;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -87337933
	)
	int field92;
	@ObfuscatedName("v")
	public boolean field93;
	@ObfuscatedName("b")
	public byte field111;
	@ObfuscatedName("q")
	public byte field95;
	@ObfuscatedName("i")
	public byte field96;
	@ObfuscatedName("x")
	public byte field113;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -2021066881
	)
	public int field98;
	@ObfuscatedName("r")
	long[] field97;
	@ObfuscatedName("p")
	public byte[] field100;
	@ObfuscatedName("a")
	int[] field99;
	@ObfuscatedName("e")
	int[] field102;
	@ObfuscatedName("d")
	public int[] field94;
	@ObfuscatedName("u")
	public boolean[] field104;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1715642763
	)
	public int field105;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -267718841
	)
	public int field106;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1432203507
	)
	public int field107;
	@ObfuscatedName("s")
	long[] field108;
	@ObfuscatedName("y")
	public String[] field109;
	@ObfuscatedName("w")
	public String[] field101;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	IterableNodeHashTable field89;

	@ObfuscatedSignature(
		descriptor = "(Lnk;)V"
	)
	public class11(Buffer var1) {
		this.field90 = 0; // L: 14
		this.field91 = null; // L: 15
		this.field92 = 0; // L: 16
		this.field105 = -1; // L: 29
		this.field106 = -1; // L: 30
		this.method135(var1); // L: 43
	} // L: 44

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "241489233"
	)
	void method111(int var1) {
		if (this.field87) { // L: 47
			if (this.field97 != null) { // L: 48
				System.arraycopy(this.field97, 0, this.field97 = new long[var1], 0, this.field98);
			} else {
				this.field97 = new long[var1]; // L: 49
			}
		}

		if (this.field88) { // L: 51
			if (this.field109 != null) { // L: 52
				System.arraycopy(this.field109, 0, this.field109 = new String[var1], 0, this.field98);
			} else {
				this.field109 = new String[var1]; // L: 53
			}
		}

		if (this.field100 != null) { // L: 55
			System.arraycopy(this.field100, 0, this.field100 = new byte[var1], 0, this.field98);
		} else {
			this.field100 = new byte[var1]; // L: 56
		}

		if (this.field102 != null) { // L: 57
			System.arraycopy(this.field102, 0, this.field102 = new int[var1], 0, this.field98);
		} else {
			this.field102 = new int[var1]; // L: 58
		}

		if (this.field94 != null) { // L: 59
			System.arraycopy(this.field94, 0, this.field94 = new int[var1], 0, this.field98);
		} else {
			this.field94 = new int[var1]; // L: 60
		}

		if (this.field104 != null) { // L: 61
			System.arraycopy(this.field104, 0, this.field104 = new boolean[var1], 0, this.field98);
		} else {
			this.field104 = new boolean[var1]; // L: 62
		}

	} // L: 63

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "66"
	)
	void method112(int var1) {
		if (this.field87) { // L: 66
			if (this.field108 != null) {
				System.arraycopy(this.field108, 0, this.field108 = new long[var1], 0, this.field107); // L: 67
			} else {
				this.field108 = new long[var1]; // L: 68
			}
		}

		if (this.field88) { // L: 70
			if (this.field101 != null) { // L: 71
				System.arraycopy(this.field101, 0, this.field101 = new String[var1], 0, this.field107);
			} else {
				this.field101 = new String[var1]; // L: 72
			}
		}

	} // L: 74

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "657242111"
	)
	public int method113(String var1) {
		if (var1 != null && var1.length() != 0) { // L: 77
			for (int var2 = 0; var2 < this.field98; ++var2) { // L: 78
				if (this.field109[var2].equals(var1)) { // L: 79
					return var2;
				}
			}

			return -1; // L: 81
		} else {
			return -1;
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-267718841"
	)
	public int method114(int var1, int var2, int var3) {
		int var4 = var3 == 31 ? -1 : (1 << var3 + 1) - 1; // L: 85
		return (this.field102[var1] & var4) >>> var2; // L: 86
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Integer;",
		garbageValue = "-1499544998"
	)
	public Integer method152(int var1) {
		if (this.field89 == null) { // L: 90
			return null;
		} else {
			Node var2 = this.field89.get((long)var1); // L: 91
			return var2 != null && var2 instanceof IntegerNode ? new Integer(((IntegerNode)var2).integer) : null; // L: 92 93
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1864900948"
	)
	public int[] method167() {
		if (this.field99 == null) { // L: 97
			String[] var1 = new String[this.field98]; // L: 98
			this.field99 = new int[this.field98]; // L: 99

			for (int var2 = 0; var2 < this.field98; this.field99[var2] = var2++) { // L: 100 103
				var1[var2] = this.field109[var2]; // L: 101
				if (var1[var2] != null) { // L: 102
					var1[var2] = var1[var2].toLowerCase();
				}
			}

			int[] var3 = this.field99; // L: 105
			class124.method2500(var1, var3, 0, var1.length - 1); // L: 107
		}

		return this.field99; // L: 110
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;IB)V",
		garbageValue = "61"
	)
	void method117(long var1, String var3, int var4) {
		if (var3 != null && var3.length() == 0) { // L: 114
			var3 = null;
		}

		if (this.field87 != var1 > 0L) { // L: 115
			throw new RuntimeException("");
		} else if (this.field88 != (var3 != null)) { // L: 116
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.field97 == null || this.field98 >= this.field97.length) || var3 != null && (this.field109 == null || this.field98 >= this.field109.length)) { // L: 117
				this.method111(this.field98 + 5);
			}

			if (this.field97 != null) { // L: 118
				this.field97[this.field98] = var1;
			}

			if (this.field109 != null) { // L: 119
				this.field109[this.field98] = var3;
			}

			if (this.field105 == -1) { // L: 120
				this.field105 = this.field98; // L: 121
				this.field100[this.field98] = 126; // L: 122
			} else {
				this.field100[this.field98] = 0; // L: 125
			}

			this.field102[this.field98] = 0; // L: 127
			this.field94[this.field98] = var4; // L: 128
			this.field104[this.field98] = false; // L: 129
			++this.field98; // L: 130
			this.field99 = null; // L: 131
		}
	} // L: 132

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1122092464"
	)
	void method157(int var1) {
		if (var1 >= 0 && var1 < this.field98) { // L: 135
			--this.field98; // L: 136
			this.field99 = null; // L: 137
			if (this.field98 == 0) { // L: 138
				this.field97 = null; // L: 139
				this.field109 = null; // L: 140
				this.field100 = null; // L: 141
				this.field102 = null; // L: 142
				this.field94 = null; // L: 143
				this.field104 = null; // L: 144
				this.field105 = -1; // L: 145
				this.field106 = -1; // L: 146
			} else {
				System.arraycopy(this.field100, var1 + 1, this.field100, var1, this.field98 - var1); // L: 149
				System.arraycopy(this.field102, var1 + 1, this.field102, var1, this.field98 - var1); // L: 150
				System.arraycopy(this.field94, var1 + 1, this.field94, var1, this.field98 - var1); // L: 151
				System.arraycopy(this.field104, var1 + 1, this.field104, var1, this.field98 - var1); // L: 152
				if (this.field97 != null) { // L: 153
					System.arraycopy(this.field97, var1 + 1, this.field97, var1, this.field98 - var1);
				}

				if (this.field109 != null) { // L: 154
					System.arraycopy(this.field109, var1 + 1, this.field109, var1, this.field98 - var1);
				}

				this.method119(); // L: 155
			}

		} else {
			throw new RuntimeException("");
		}
	} // L: 157

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-31"
	)
	void method119() {
		if (this.field98 == 0) { // L: 160
			this.field105 = -1; // L: 161
			this.field106 = -1; // L: 162
		} else {
			this.field105 = -1; // L: 165
			this.field106 = -1; // L: 166
			int var1 = 0; // L: 167
			byte var2 = this.field100[0]; // L: 168

			for (int var3 = 1; var3 < this.field98; ++var3) { // L: 169
				if (this.field100[var3] > var2) { // L: 170
					if (var2 == 125) { // L: 171
						this.field106 = var1;
					}

					var1 = var3; // L: 172
					var2 = this.field100[var3]; // L: 173
				} else if (this.field106 == -1 && this.field100[var3] == 125) { // L: 175
					this.field106 = var3; // L: 176
				}
			}

			this.field105 = var1; // L: 179
			if (this.field105 != -1) { // L: 180
				this.field100[this.field105] = 126;
			}

		}
	} // L: 163 181

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;B)V",
		garbageValue = "63"
	)
	void method120(long var1, String var3) {
		if (var3 != null && var3.length() == 0) { // L: 184
			var3 = null;
		}

		if (this.field87 != var1 > 0L) { // L: 185
			throw new RuntimeException("");
		} else if (var3 != null != this.field88) { // L: 186
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.field108 == null || this.field107 >= this.field108.length) || var3 != null && (this.field101 == null || this.field107 >= this.field101.length)) { // L: 187
				this.method112(this.field107 + 5);
			}

			if (this.field108 != null) { // L: 188
				this.field108[this.field107] = var1;
			}

			if (this.field101 != null) { // L: 189
				this.field101[this.field107] = var3;
			}

			++this.field107; // L: 190
		}
	} // L: 191

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1819056375"
	)
	void method121(int var1) {
		--this.field107; // L: 194
		if (this.field107 == 0) { // L: 195
			this.field108 = null; // L: 196
			this.field101 = null; // L: 197
		} else {
			if (this.field108 != null) { // L: 200
				System.arraycopy(this.field108, var1 + 1, this.field108, var1, this.field107 - var1);
			}

			if (this.field101 != null) {
				System.arraycopy(this.field101, var1 + 1, this.field101, var1, this.field107 - var1); // L: 201
			}
		}

	} // L: 203

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IBI)I",
		garbageValue = "1047518039"
	)
	int method191(int var1, byte var2) {
		if (var2 != 126 && var2 != 127) { // L: 206
			if (this.field105 == var1 && (this.field106 == -1 || this.field100[this.field106] < 125)) { // L: 207
				return -1;
			} else if (this.field100[var1] == var2) {
				return -1; // L: 208
			} else {
				this.field100[var1] = var2; // L: 209
				this.method119(); // L: 210
				return var1; // L: 211
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1333266442"
	)
	boolean method123(int var1) {
		if (this.field105 != var1 && this.field100[var1] != 126) { // L: 215
			this.field100[this.field105] = 125; // L: 216
			this.field106 = this.field105; // L: 217
			this.field100[var1] = 126; // L: 218
			this.field105 = var1; // L: 219
			return true; // L: 220
		} else {
			return false;
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "1187592850"
	)
	int method133(int var1, boolean var2) {
		if (this.field104[var1] == var2) { // L: 224
			return -1;
		} else {
			this.field104[var1] = var2; // L: 225
			return var1; // L: 226
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "-1968754064"
	)
	int method156(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1; // L: 230
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1; // L: 231
		int var7 = var6 ^ var5; // L: 232
		var2 <<= var3; // L: 233
		var2 &= var7; // L: 234
		int var8 = this.field102[var1]; // L: 235
		if ((var8 & var7) == var2) {
			return -1; // L: 236
		} else {
			var8 &= ~var7; // L: 237
			this.field102[var1] = var8 | var2; // L: 238
			return var1; // L: 239
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1937890199"
	)
	boolean method126(int var1, int var2) {
		if (this.field89 != null) { // L: 243
			Node var3 = this.field89.get((long)var1); // L: 244
			if (var3 != null) { // L: 245
				if (var3 instanceof IntegerNode) { // L: 246
					IntegerNode var4 = (IntegerNode)var3; // L: 247
					if (var2 == var4.integer) { // L: 248
						return false;
					}

					var4.integer = var2; // L: 249
					return true; // L: 250
				}

				var3.remove(); // L: 252
			}
		} else {
			this.field89 = new IterableNodeHashTable(4); // L: 255
		}

		this.field89.put(new IntegerNode(var2), (long)var1); // L: 256
		return true; // L: 257
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "-1701986674"
	)
	boolean method127(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1; // L: 261
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1; // L: 262
		int var7 = var6 ^ var5; // L: 263
		var2 <<= var3; // L: 264
		var2 &= var7; // L: 265
		if (this.field89 != null) { // L: 266
			Node var8 = this.field89.get((long)var1); // L: 267
			if (var8 != null) { // L: 268
				if (var8 instanceof IntegerNode) { // L: 269
					IntegerNode var9 = (IntegerNode)var8; // L: 270
					if ((var9.integer & var7) == var2) { // L: 271
						return false;
					}

					var9.integer &= ~var7; // L: 272
					var9.integer |= var2; // L: 273
					return true; // L: 274
				}

				var8.remove(); // L: 276
			}
		} else {
			this.field89 = new IterableNodeHashTable(4); // L: 279
		}

		this.field89.put(new IntegerNode(var2), (long)var1); // L: 280
		return true; // L: 281
	}

	@ObfuscatedName("d")
	boolean method128(int var1, long var2) {
		if (this.field89 != null) { // L: 285
			Node var4 = this.field89.get((long)var1); // L: 286
			if (var4 != null) { // L: 287
				if (var4 instanceof class349) { // L: 288
					class349 var5 = (class349)var4; // L: 289
					if (var5.field3945 == var2) { // L: 290
						return false;
					}

					var5.field3945 = var2; // L: 291
					return true; // L: 292
				}

				var4.remove(); // L: 294
			}
		} else {
			this.field89 = new IterableNodeHashTable(4); // L: 297
		}

		this.field89.put(new class349(var2), (long)var1); // L: 298
		return true; // L: 299
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)Z",
		garbageValue = "1"
	)
	boolean method131(int var1, String var2) {
		if (var2 == null) { // L: 303
			var2 = "";
		} else if (var2.length() > 80) { // L: 304
			var2 = var2.substring(0, 80);
		}

		if (this.field89 != null) { // L: 305
			Node var3 = this.field89.get((long)var1); // L: 306
			if (var3 != null) { // L: 307
				if (var3 instanceof ObjectNode) { // L: 308
					ObjectNode var4 = (ObjectNode)var3; // L: 309
					if (var4.obj instanceof String) { // L: 310
						if (var2.equals(var4.obj)) { // L: 311
							return false;
						}

						var4.remove(); // L: 312
						this.field89.put(new ObjectNode(var2), var4.key); // L: 313
						return true; // L: 314
					}
				}

				var3.remove(); // L: 317
			}
		} else {
			this.field89 = new IterableNodeHashTable(4); // L: 320
		}

		this.field89.put(new ObjectNode(var2), (long)var1); // L: 321
		return true; // L: 322
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "-1322806444"
	)
	void method135(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 326
		if (var2 >= 1 && var2 <= 6) { // L: 327
			int var3 = var1.readUnsignedByte(); // L: 328
			if ((var3 & 1) != 0) { // L: 329
				this.field87 = true;
			}

			if ((var3 & 2) != 0) { // L: 330
				this.field88 = true;
			}

			if (!this.field87) { // L: 331
				this.field97 = null; // L: 332
				this.field108 = null; // L: 333
			}

			if (!this.field88) { // L: 335
				this.field109 = null; // L: 336
				this.field101 = null; // L: 337
			}

			this.field90 = var1.readInt(); // L: 339
			this.field92 = var1.readInt(); // L: 340
			if (var2 <= 3 && this.field92 != 0) { // L: 341
				this.field92 += 16912800;
			}

			this.field98 = var1.readUnsignedShort(); // L: 342
			this.field107 = var1.readUnsignedByte(); // L: 343
			this.field91 = var1.readStringCp1252NullTerminated(); // L: 344
			if (var2 >= 4) { // L: 345
				var1.readInt(); // L: 346
			}

			this.field93 = var1.readUnsignedByte() == 1; // L: 348
			this.field111 = var1.readByte(); // L: 349
			this.field95 = var1.readByte(); // L: 350
			this.field96 = var1.readByte(); // L: 351
			this.field113 = var1.readByte(); // L: 352
			int var4;
			if (this.field98 > 0) { // L: 353
				if (this.field87 && (this.field97 == null || this.field97.length < this.field98)) { // L: 354
					this.field97 = new long[this.field98];
				}

				if (this.field88 && (this.field109 == null || this.field109.length < this.field98)) { // L: 355
					this.field109 = new String[this.field98];
				}

				if (this.field100 == null || this.field100.length < this.field98) { // L: 356
					this.field100 = new byte[this.field98];
				}

				if (this.field102 == null || this.field102.length < this.field98) { // L: 357
					this.field102 = new int[this.field98];
				}

				if (this.field94 == null || this.field94.length < this.field98) { // L: 358
					this.field94 = new int[this.field98];
				}

				if (this.field104 == null || this.field104.length < this.field98) { // L: 359
					this.field104 = new boolean[this.field98];
				}

				for (var4 = 0; var4 < this.field98; ++var4) { // L: 360
					if (this.field87) { // L: 361
						this.field97[var4] = var1.readLong();
					}

					if (this.field88) { // L: 362
						this.field109[var4] = var1.readStringCp1252NullTerminatedOrNull();
					}

					this.field100[var4] = var1.readByte(); // L: 363
					if (var2 >= 2) { // L: 364
						this.field102[var4] = var1.readInt();
					}

					if (var2 >= 5) { // L: 365
						this.field94[var4] = var1.readUnsignedShort();
					} else {
						this.field94[var4] = 0; // L: 366
					}

					if (var2 >= 6) { // L: 367
						this.field104[var4] = var1.readUnsignedByte() == 1;
					} else {
						this.field104[var4] = false; // L: 368
					}
				}

				this.method119(); // L: 370
			}

			if (this.field107 > 0) { // L: 372
				if (this.field87 && (this.field108 == null || this.field108.length < this.field107)) { // L: 373
					this.field108 = new long[this.field107];
				}

				if (this.field88 && (this.field101 == null || this.field101.length < this.field107)) { // L: 374
					this.field101 = new String[this.field107];
				}

				for (var4 = 0; var4 < this.field107; ++var4) { // L: 375
					if (this.field87) { // L: 376
						this.field108[var4] = var1.readLong();
					}

					if (this.field88) { // L: 377
						this.field101[var4] = var1.readStringCp1252NullTerminatedOrNull();
					}
				}
			}

			if (var2 >= 3) { // L: 380
				var4 = var1.readUnsignedShort(); // L: 381
				if (var4 > 0) { // L: 382
					this.field89 = new IterableNodeHashTable(var4 < 16 ? MouseRecorder.method2126(var4) : 16); // L: 383

					while (var4-- > 0) { // L: 384
						int var5 = var1.readInt(); // L: 385
						int var6 = var5 & 1073741823; // L: 386
						int var7 = var5 >>> 30; // L: 387
						if (var7 == 0) { // L: 388
							int var12 = var1.readInt(); // L: 389
							this.field89.put(new IntegerNode(var12), (long)var6); // L: 390
						} else if (var7 == 1) { // L: 392
							long var10 = var1.readLong(); // L: 393
							this.field89.put(new class349(var10), (long)var6); // L: 394
						} else if (var7 == 2) { // L: 396
							String var8 = var1.readStringCp1252NullTerminated(); // L: 397
							this.field89.put(new ObjectNode(var8), (long)var6); // L: 398
						}
					}
				}
			}

		} else {
			throw new RuntimeException("" + var2);
		}
	} // L: 403

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1465463925"
	)
	static final boolean method190() {
		return Client.isMenuOpen; // L: 7898
	}

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(Liv;B)Z",
		garbageValue = "117"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden; // L: 11623
	}
}
