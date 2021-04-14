import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("m")
public class class11 {
	@ObfuscatedName("er")
	@ObfuscatedGetter(
		intValue = 278389515
	)
	static int field108;
	@ObfuscatedName("gi")
	@Export("regions")
	static int[] regions;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = 1521848179
	)
	@Export("menuHeight")
	static int menuHeight;
	@ObfuscatedName("nk")
	@ObfuscatedGetter(
		intValue = 883989245
	)
	static int field106;
	@ObfuscatedName("o")
	boolean field77;
	@ObfuscatedName("u")
	boolean field104;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		longValue = 4921630429052482837L
	)
	long field79;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1752668535
	)
	int field80;
	@ObfuscatedName("e")
	public String field81;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1200113713
	)
	int field82;
	@ObfuscatedName("g")
	public boolean field90;
	@ObfuscatedName("h")
	public byte field84;
	@ObfuscatedName("n")
	public byte field83;
	@ObfuscatedName("l")
	public byte field86;
	@ObfuscatedName("m")
	public byte field87;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 2068831427
	)
	public int field88;
	@ObfuscatedName("c")
	long[] field89;
	@ObfuscatedName("j")
	public byte[] field76;
	@ObfuscatedName("r")
	int[] field91;
	@ObfuscatedName("q")
	int[] field92;
	@ObfuscatedName("t")
	public int[] field94;
	@ObfuscatedName("v")
	public boolean[] field78;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -813326745
	)
	public int field100;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1955278431
	)
	public int field96;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1976456997
	)
	public int field97;
	@ObfuscatedName("a")
	long[] field107;
	@ObfuscatedName("w")
	public String[] field99;
	@ObfuscatedName("s")
	public String[] field105;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	IterableNodeHashTable field95;

	@ObfuscatedSignature(
		descriptor = "(Lnu;)V"
	)
	public class11(Buffer var1) {
		this.field80 = 0; // L: 14
		this.field81 = null; // L: 15
		this.field82 = 0;
		this.field100 = -1; // L: 29
		this.field96 = -1;
		this.method181(var1);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1055386571"
	)
	void method140(int var1) {
		if (this.field77) { // L: 47
			if (this.field89 != null) {
				System.arraycopy(this.field89, 0, this.field89 = new long[var1], 0, this.field88);
			} else {
				this.field89 = new long[var1];
			}
		}

		if (this.field104) {
			if (this.field99 != null) { // L: 52
				System.arraycopy(this.field99, 0, this.field99 = new String[var1], 0, this.field88);
			} else {
				this.field99 = new String[var1];
			}
		}

		if (this.field76 != null) {
			System.arraycopy(this.field76, 0, this.field76 = new byte[var1], 0, this.field88);
		} else {
			this.field76 = new byte[var1];
		}

		if (this.field92 != null) {
			System.arraycopy(this.field92, 0, this.field92 = new int[var1], 0, this.field88);
		} else {
			this.field92 = new int[var1]; // L: 58
		}

		if (this.field94 != null) {
			System.arraycopy(this.field94, 0, this.field94 = new int[var1], 0, this.field88);
		} else {
			this.field94 = new int[var1];
		}

		if (this.field78 != null) {
			System.arraycopy(this.field78, 0, this.field78 = new boolean[var1], 0, this.field88);
		} else {
			this.field78 = new boolean[var1];
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "13"
	)
	void method175(int var1) {
		if (this.field77) { // L: 66
			if (this.field107 != null) {
				System.arraycopy(this.field107, 0, this.field107 = new long[var1], 0, this.field97);
			} else {
				this.field107 = new long[var1];
			}
		}

		if (this.field104) {
			if (this.field105 != null) {
				System.arraycopy(this.field105, 0, this.field105 = new String[var1], 0, this.field97);
			} else {
				this.field105 = new String[var1];
			}
		}

	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-933779475"
	)
	public int method142(String var1) {
		if (var1 != null && var1.length() != 0) {
			for (int var2 = 0; var2 < this.field88; ++var2) {
				if (this.field99[var2].equals(var1)) {
					return var2;
				}
			}

			return -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "2138892447"
	)
	public int method143(int var1, int var2, int var3) {
		int var4 = var3 == 31 ? -1 : (1 << var3 + 1) - 1;
		return (this.field92[var1] & var4) >>> var2;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IS)Ljava/lang/Integer;",
		garbageValue = "-30268"
	)
	public Integer method144(int var1) {
		if (this.field95 == null) {
			return null;
		} else {
			Node var2 = this.field95.get((long)var1); // L: 91
			return var2 != null && var2 instanceof IntegerNode ? new Integer(((IntegerNode)var2).integer) : null;
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "645088980"
	)
	public int[] method159() {
		if (this.field91 == null) {
			String[] var1 = new String[this.field88];
			this.field91 = new int[this.field88];

			for (int var2 = 0; var2 < this.field88; this.field91[var2] = var2++) {
				var1[var2] = this.field99[var2];
				if (var1[var2] != null) {
					var1[var2] = var1[var2].toLowerCase();
				}
			}

			int[] var3 = this.field91;
			GrandExchangeOffer.method4633(var1, var3, 0, var1.length - 1);
		}

		return this.field91;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;IB)V",
		garbageValue = "-16"
	)
	void method146(long var1, String var3, int var4) {
		if (var3 != null && var3.length() == 0) {
			var3 = null;
		}

		if (var1 > 0L != this.field77) {
			throw new RuntimeException("");
		} else if (var3 != null != this.field104) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.field89 == null || this.field88 >= this.field89.length) || var3 != null && (this.field99 == null || this.field88 >= this.field99.length)) {
				this.method140(this.field88 + 5);
			}

			if (this.field89 != null) { // L: 118
				this.field89[this.field88] = var1;
			}

			if (this.field99 != null) {
				this.field99[this.field88] = var3;
			}

			if (this.field100 == -1) {
				this.field100 = this.field88;
				this.field76[this.field88] = 126;
			} else {
				this.field76[this.field88] = 0;
			}

			this.field92[this.field88] = 0; // L: 127
			this.field94[this.field88] = var4;
			this.field78[this.field88] = false;
			++this.field88;
			this.field91 = null;
		}
	} // L: 132

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-48"
	)
	void method147(int var1) {
		if (var1 >= 0 && var1 < this.field88) { // L: 135
			--this.field88; // L: 136
			this.field91 = null;
			if (this.field88 == 0) {
				this.field89 = null;
				this.field99 = null; // L: 140
				this.field76 = null;
				this.field92 = null;
				this.field94 = null;
				this.field78 = null;
				this.field100 = -1;
				this.field96 = -1;
			} else {
				System.arraycopy(this.field76, var1 + 1, this.field76, var1, this.field88 - var1); // L: 149
				System.arraycopy(this.field92, var1 + 1, this.field92, var1, this.field88 - var1);
				System.arraycopy(this.field94, var1 + 1, this.field94, var1, this.field88 - var1);
				System.arraycopy(this.field78, var1 + 1, this.field78, var1, this.field88 - var1);
				if (this.field89 != null) {
					System.arraycopy(this.field89, var1 + 1, this.field89, var1, this.field88 - var1);
				}

				if (this.field99 != null) { // L: 154
					System.arraycopy(this.field99, var1 + 1, this.field99, var1, this.field88 - var1);
				}

				this.method164(); // L: 155
			}

		} else {
			throw new RuntimeException("");
		}
	} // L: 157

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	void method164() {
		if (this.field88 == 0) {
			this.field100 = -1;
			this.field96 = -1; // L: 162
		} else {
			this.field100 = -1;
			this.field96 = -1;
			int var1 = 0;
			byte var2 = this.field76[0];

			for (int var3 = 1; var3 < this.field88; ++var3) {
				if (this.field76[var3] > var2) { // L: 170
					if (var2 == 125) { // L: 171
						this.field96 = var1;
					}

					var1 = var3;
					var2 = this.field76[var3];
				} else if (this.field96 == -1 && this.field76[var3] == 125) { // L: 175
					this.field96 = var3;
				}
			}

			this.field100 = var1; // L: 179
			if (this.field100 != -1) { // L: 180
				this.field76[this.field100] = 126;
			}

		}
	} // L: 181

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;I)V",
		garbageValue = "2100738609"
	)
	void method188(long var1, String var3) {
		if (var3 != null && var3.length() == 0) { // L: 184
			var3 = null;
		}

		if (var1 > 0L != this.field77) { // L: 185
			throw new RuntimeException("");
		} else if (this.field104 != (var3 != null)) { // L: 186
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.field107 == null || this.field97 >= this.field107.length) || var3 != null && (this.field105 == null || this.field97 >= this.field105.length)) { // L: 187
				this.method175(this.field97 + 5);
			}

			if (this.field107 != null) { // L: 188
				this.field107[this.field97] = var1;
			}

			if (this.field105 != null) {
				this.field105[this.field97] = var3;
			}

			++this.field97; // L: 190
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-123"
	)
	void method180(int var1) {
		--this.field97; // L: 194
		if (this.field97 == 0) { // L: 195
			this.field107 = null; // L: 196
			this.field105 = null; // L: 197
		} else {
			if (this.field107 != null) { // L: 200
				System.arraycopy(this.field107, var1 + 1, this.field107, var1, this.field97 - var1);
			}

			if (this.field105 != null) {
				System.arraycopy(this.field105, var1 + 1, this.field105, var1, this.field97 - var1); // L: 201
			}
		}

	} // L: 203

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IBB)I",
		garbageValue = "-51"
	)
	int method151(int var1, byte var2) {
		if (var2 != 126 && var2 != 127) { // L: 206
			if (this.field100 == var1 && (this.field96 == -1 || this.field76[this.field96] < 125)) { // L: 207
				return -1;
			} else if (this.field76[var1] == var2) { // L: 208
				return -1;
			} else {
				this.field76[var1] = var2; // L: 209
				this.method164(); // L: 210
				return var1; // L: 211
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-243833615"
	)
	boolean method190(int var1) {
		if (this.field100 != var1 && this.field76[var1] != 126) { // L: 215
			this.field76[this.field100] = 125; // L: 216
			this.field96 = this.field100; // L: 217
			this.field76[var1] = 126; // L: 218
			this.field100 = var1; // L: 219
			return true; // L: 220
		} else {
			return false;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "-1814028575"
	)
	int method153(int var1, boolean var2) {
		if (this.field78[var1] == var2) { // L: 224
			return -1;
		} else {
			this.field78[var1] = var2; // L: 225
			return var1; // L: 226
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "-110007630"
	)
	int method154(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1; // L: 230
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1; // L: 231
		int var7 = var6 ^ var5; // L: 232
		var2 <<= var3; // L: 233
		var2 &= var7; // L: 234
		int var8 = this.field92[var1]; // L: 235
		if ((var8 & var7) == var2) {
			return -1; // L: 236
		} else {
			var8 &= ~var7; // L: 237
			this.field92[var1] = var8 | var2; // L: 238
			return var1; // L: 239
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-418167741"
	)
	boolean method178(int var1, int var2) {
		if (this.field95 != null) { // L: 243
			Node var3 = this.field95.get((long)var1); // L: 244
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
			this.field95 = new IterableNodeHashTable(4); // L: 255
		}

		this.field95.put(new IntegerNode(var2), (long)var1); // L: 256
		return true; // L: 257
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)Z",
		garbageValue = "92"
	)
	boolean method156(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1; // L: 261
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1; // L: 262
		int var7 = var6 ^ var5; // L: 263
		var2 <<= var3; // L: 264
		var2 &= var7; // L: 265
		if (this.field95 != null) { // L: 266
			Node var8 = this.field95.get((long)var1); // L: 267
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
			this.field95 = new IterableNodeHashTable(4); // L: 279
		}

		this.field95.put(new IntegerNode(var2), (long)var1); // L: 280
		return true; // L: 281
	}

	@ObfuscatedName("t")
	boolean method157(int var1, long var2) {
		if (this.field95 != null) { // L: 285
			Node var4 = this.field95.get((long)var1); // L: 286
			if (var4 != null) { // L: 287
				if (var4 instanceof class348) { // L: 288
					class348 var5 = (class348)var4; // L: 289
					if (var5.field3938 == var2) { // L: 290
						return false;
					}

					var5.field3938 = var2; // L: 291
					return true; // L: 292
				}

				var4.remove(); // L: 294
			}
		} else {
			this.field95 = new IterableNodeHashTable(4); // L: 297
		}

		this.field95.put(new class348(var2), (long)var1); // L: 298
		return true; // L: 299
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Z",
		garbageValue = "-222016163"
	)
	boolean method158(int var1, String var2) {
		if (var2 == null) { // L: 303
			var2 = "";
		} else if (var2.length() > 80) { // L: 304
			var2 = var2.substring(0, 80);
		}

		if (this.field95 != null) { // L: 305
			Node var3 = this.field95.get((long)var1); // L: 306
			if (var3 != null) { // L: 307
				if (var3 instanceof ObjectNode) { // L: 308
					ObjectNode var4 = (ObjectNode)var3; // L: 309
					if (var4.obj instanceof String) { // L: 310
						if (var2.equals(var4.obj)) { // L: 311
							return false;
						}

						var4.remove(); // L: 312
						this.field95.put(new ObjectNode(var2), var4.key); // L: 313
						return true; // L: 314
					}
				}

				var3.remove(); // L: 317
			}
		} else {
			this.field95 = new IterableNodeHashTable(4); // L: 320
		}

		this.field95.put(new ObjectNode(var2), (long)var1); // L: 321
		return true; // L: 322
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "495563881"
	)
	void method181(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 326
		if (var2 >= 1 && var2 <= 6) { // L: 327
			int var3 = var1.readUnsignedByte(); // L: 328
			if ((var3 & 1) != 0) { // L: 329
				this.field77 = true;
			}

			if ((var3 & 2) != 0) { // L: 330
				this.field104 = true;
			}

			if (!this.field77) { // L: 331
				this.field89 = null; // L: 332
				this.field107 = null; // L: 333
			}

			if (!this.field104) { // L: 335
				this.field99 = null; // L: 336
				this.field105 = null; // L: 337
			}

			this.field80 = var1.readInt(); // L: 339
			this.field82 = var1.readInt(); // L: 340
			if (var2 <= 3 && this.field82 != 0) { // L: 341
				this.field82 += 16912800;
			}

			this.field88 = var1.readUnsignedShort(); // L: 342
			this.field97 = var1.readUnsignedByte(); // L: 343
			this.field81 = var1.readStringCp1252NullTerminated(); // L: 344
			if (var2 >= 4) { // L: 345
				var1.readInt(); // L: 346
			}

			this.field90 = var1.readUnsignedByte() == 1; // L: 348
			this.field84 = var1.readByte(); // L: 349
			this.field83 = var1.readByte(); // L: 350
			this.field86 = var1.readByte(); // L: 351
			this.field87 = var1.readByte(); // L: 352
			int var4;
			if (this.field88 > 0) { // L: 353
				if (this.field77 && (this.field89 == null || this.field89.length < this.field88)) { // L: 354
					this.field89 = new long[this.field88];
				}

				if (this.field104 && (this.field99 == null || this.field99.length < this.field88)) { // L: 355
					this.field99 = new String[this.field88];
				}

				if (this.field76 == null || this.field76.length < this.field88) { // L: 356
					this.field76 = new byte[this.field88];
				}

				if (this.field92 == null || this.field92.length < this.field88) { // L: 357
					this.field92 = new int[this.field88];
				}

				if (this.field94 == null || this.field94.length < this.field88) { // L: 358
					this.field94 = new int[this.field88];
				}

				if (this.field78 == null || this.field78.length < this.field88) { // L: 359
					this.field78 = new boolean[this.field88];
				}

				for (var4 = 0; var4 < this.field88; ++var4) { // L: 360
					if (this.field77) { // L: 361
						this.field89[var4] = var1.readLong();
					}

					if (this.field104) { // L: 362
						this.field99[var4] = var1.readStringCp1252NullTerminatedOrNull();
					}

					this.field76[var4] = var1.readByte(); // L: 363
					if (var2 >= 2) { // L: 364
						this.field92[var4] = var1.readInt();
					}

					if (var2 >= 5) { // L: 365
						this.field94[var4] = var1.readUnsignedShort();
					} else {
						this.field94[var4] = 0; // L: 366
					}

					if (var2 >= 6) { // L: 367
						this.field78[var4] = var1.readUnsignedByte() == 1;
					} else {
						this.field78[var4] = false; // L: 368
					}
				}

				this.method164(); // L: 370
			}

			if (this.field97 > 0) { // L: 372
				if (this.field77 && (this.field107 == null || this.field107.length < this.field97)) { // L: 373
					this.field107 = new long[this.field97];
				}

				if (this.field104 && (this.field105 == null || this.field105.length < this.field97)) { // L: 374
					this.field105 = new String[this.field97];
				}

				for (var4 = 0; var4 < this.field97; ++var4) { // L: 375
					if (this.field77) { // L: 376
						this.field107[var4] = var1.readLong();
					}

					if (this.field104) { // L: 377
						this.field105[var4] = var1.readStringCp1252NullTerminatedOrNull();
					}
				}
			}

			if (var2 >= 3) { // L: 380
				var4 = var1.readUnsignedShort(); // L: 381
				if (var4 > 0) { // L: 382
					int var5;
					int var6;
					int var7;
					if (var4 < 16) { // L: 384
						var7 = var4 - 1; // L: 388
						var7 |= var7 >>> 1; // L: 389
						var7 |= var7 >>> 2; // L: 390
						var7 |= var7 >>> 4; // L: 391
						var7 |= var7 >>> 8; // L: 392
						var7 |= var7 >>> 16; // L: 393
						var6 = var7 + 1; // L: 394
						var5 = var6; // L: 396
					} else {
						var5 = 16; // L: 398
					}

					this.field95 = new IterableNodeHashTable(var5); // L: 399

					while (var4-- > 0) { // L: 400
						var6 = var1.readInt(); // L: 401
						var7 = var6 & 1073741823; // L: 402
						int var8 = var6 >>> 30; // L: 403
						if (var8 == 0) { // L: 404
							int var13 = var1.readInt(); // L: 405
							this.field95.put(new IntegerNode(var13), (long)var7); // L: 406
						} else if (var8 == 1) { // L: 408
							long var11 = var1.readLong(); // L: 409
							this.field95.put(new class348(var11), (long)var7); // L: 410
						} else if (var8 == 2) { // L: 412
							String var9 = var1.readStringCp1252NullTerminated(); // L: 413
							this.field95.put(new ObjectNode(var9), (long)var7); // L: 414
						}
					}
				}
			}

		} else {
			throw new RuntimeException("" + var2);
		}
	} // L: 419

	@ObfuscatedName("f")
	public static String method196(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) { // L: 16
			if (var0 % 37L == 0L) { // L: 17
				return null;
			} else {
				int var2 = 0; // L: 18

				for (long var3 = var0; 0L != var3; var3 /= 37L) { // L: 19 20 22
					++var2; // L: 21
				}

				StringBuilder var5 = new StringBuilder(var2); // L: 24

				while (0L != var0) { // L: 25
					long var6 = var0; // L: 26
					var0 /= 37L; // L: 27
					var5.append(class304.base37Table[(int)(var6 - 37L * var0)]); // L: 28
				}

				return var5.reverse().toString(); // L: 30
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnk;B)V",
		garbageValue = "37"
	)
	@Export("performReflectionCheck")
	public static void performReflectionCheck(PacketBuffer var0) {
		ReflectionCheck var1 = (ReflectionCheck)class69.reflectionChecks.last(); // L: 31
		if (var1 != null) { // L: 32
			int var2 = var0.offset; // L: 33
			var0.writeInt(var1.id); // L: 34

			for (int var3 = 0; var3 < var1.size; ++var3) { // L: 35
				if (var1.creationErrors[var3] != 0) { // L: 36
					var0.writeByte(var1.creationErrors[var3]); // L: 37
				} else {
					try {
						int var4 = var1.operations[var3]; // L: 41
						Field var5;
						int var6;
						if (var4 == 0) { // L: 42
							var5 = var1.fields[var3]; // L: 43
							var6 = Reflection.getInt(var5, (Object)null); // L: 44
							var0.writeByte(0); // L: 45
							var0.writeInt(var6); // L: 46
						} else if (var4 == 1) { // L: 48
							var5 = var1.fields[var3]; // L: 49
							Reflection.setInt(var5, (Object)null, var1.intReplaceValues[var3]); // L: 50
							var0.writeByte(0); // L: 51
						} else if (var4 == 2) { // L: 53
							var5 = var1.fields[var3]; // L: 54
							var6 = var5.getModifiers(); // L: 55
							var0.writeByte(0); // L: 56
							var0.writeInt(var6); // L: 57
						}

						Method var25;
						if (var4 != 3) { // L: 59
							if (var4 == 4) {
								var25 = var1.methods[var3];
								var6 = var25.getModifiers();
								var0.writeByte(0); // L: 82
								var0.writeInt(var6); // L: 83
							}
						} else {
							var25 = var1.methods[var3]; // L: 60
							byte[][] var10 = var1.arguments[var3]; // L: 61
							Object[] var7 = new Object[var10.length]; // L: 62

							for (int var8 = 0; var8 < var10.length; ++var8) { // L: 63
								ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var10[var8])); // L: 64
								var7[var8] = var9.readObject(); // L: 65
							}

							Object var11 = Reflection.invoke(var25, (Object)null, var7); // L: 67
							if (var11 == null) { // L: 68
								var0.writeByte(0);
							} else if (var11 instanceof Number) { // L: 69
								var0.writeByte(1); // L: 70
								var0.writeLong(((Number)var11).longValue());
							} else if (var11 instanceof String) { // L: 73
								var0.writeByte(2);
								var0.writeStringCp1252NullTerminated((String)var11);
							} else {
								var0.writeByte(4);
							}
						}
					} catch (ClassNotFoundException var13) {
						var0.writeByte(-10);
					} catch (InvalidClassException var14) { // L: 89
						var0.writeByte(-11);
					} catch (StreamCorruptedException var15) { // L: 92
						var0.writeByte(-12);
					} catch (OptionalDataException var16) {
						var0.writeByte(-13); // L: 96
					} catch (IllegalAccessException var17) {
						var0.writeByte(-14);
					} catch (IllegalArgumentException var18) {
						var0.writeByte(-15);
					} catch (InvocationTargetException var19) { // L: 104
						var0.writeByte(-16); // L: 105
					} catch (SecurityException var20) {
						var0.writeByte(-17);
					} catch (IOException var21) { // L: 110
						var0.writeByte(-18); // L: 111
					} catch (NullPointerException var22) { // L: 113
						var0.writeByte(-19); // L: 114
					} catch (Exception var23) {
						var0.writeByte(-20);
					} catch (Throwable var24) {
						var0.writeByte(-21);
					}
				}
			}

			var0.writeCrc(var2);
			var1.remove();
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnk;II)V",
		garbageValue = "-1263790804"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset; // L: 71
		Players.Players_pendingUpdateCount = 0; // L: 72
		int var3 = 0; // L: 74
		var0.importIndex(); // L: 75

		byte[] var10000;
		int var4;
		int var6;
		int var7;
		for (var4 = 0; var4 < Players.Players_count; ++var4) { // L: 76
			var7 = Players.Players_indices[var4]; // L: 77
			if ((Players.field1350[var7] & 1) == 0) { // L: 78
				if (var3 > 0) { // L: 79
					--var3; // L: 80
					var10000 = Players.field1350; // L: 81
					var10000[var7] = (byte)(var10000[var7] | 2);
				} else {
					var6 = var0.readBits(1); // L: 84
					if (var6 == 0) { // L: 85
						var3 = class264.method4680(var0); // L: 86
						var10000 = Players.field1350; // L: 87
						var10000[var7] = (byte)(var10000[var7] | 2);
					} else {
						MenuAction.readPlayerUpdate(var0, var7); // L: 90
					}
				}
			}
		}

		var0.exportIndex(); // L: 93
		if (var3 != 0) { // L: 94
			throw new RuntimeException(); // L: 95
		} else {
			var0.importIndex(); // L: 97

			for (var4 = 0; var4 < Players.Players_count; ++var4) { // L: 98
				var7 = Players.Players_indices[var4]; // L: 99
				if ((Players.field1350[var7] & 1) != 0) { // L: 100
					if (var3 > 0) { // L: 101
						--var3; // L: 102
						var10000 = Players.field1350; // L: 103
						var10000[var7] = (byte)(var10000[var7] | 2);
					} else {
						var6 = var0.readBits(1); // L: 106
						if (var6 == 0) { // L: 107
							var3 = class264.method4680(var0); // L: 108
							var10000 = Players.field1350; // L: 109
							var10000[var7] = (byte)(var10000[var7] | 2);
						} else {
							MenuAction.readPlayerUpdate(var0, var7); // L: 112
						}
					}
				}
			}

			var0.exportIndex(); // L: 115
			if (var3 != 0) { // L: 116
				throw new RuntimeException(); // L: 117
			} else {
				var0.importIndex(); // L: 119

				for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) { // L: 120
					var7 = Players.Players_emptyIndices[var4]; // L: 121
					if ((Players.field1350[var7] & 1) != 0) { // L: 122
						if (var3 > 0) { // L: 123
							--var3; // L: 124
							var10000 = Players.field1350; // L: 125
							var10000[var7] = (byte)(var10000[var7] | 2);
						} else {
							var6 = var0.readBits(1); // L: 128
							if (var6 == 0) { // L: 129
								var3 = class264.method4680(var0); // L: 130
								var10000 = Players.field1350; // L: 131
								var10000[var7] = (byte)(var10000[var7] | 2);
							} else if (WorldMapDecoration.updateExternalPlayer(var0, var7)) { // L: 134
								var10000 = Players.field1350;
								var10000[var7] = (byte)(var10000[var7] | 2);
							}
						}
					}
				}

				var0.exportIndex(); // L: 137
				if (var3 != 0) { // L: 138
					throw new RuntimeException(); // L: 139
				} else {
					var0.importIndex(); // L: 141

					for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) { // L: 142
						var7 = Players.Players_emptyIndices[var4]; // L: 143
						if ((Players.field1350[var7] & 1) == 0) { // L: 144
							if (var3 > 0) { // L: 145
								--var3; // L: 146
								var10000 = Players.field1350; // L: 147
								var10000[var7] = (byte)(var10000[var7] | 2);
							} else {
								var6 = var0.readBits(1); // L: 150
								if (var6 == 0) { // L: 151
									var3 = class264.method4680(var0); // L: 152
									var10000 = Players.field1350; // L: 153
									var10000[var7] = (byte)(var10000[var7] | 2);
								} else if (WorldMapDecoration.updateExternalPlayer(var0, var7)) { // L: 156
									var10000 = Players.field1350;
									var10000[var7] = (byte)(var10000[var7] | 2);
								}
							}
						}
					}

					var0.exportIndex(); // L: 159
					if (var3 != 0) { // L: 160
						throw new RuntimeException(); // L: 161
					} else {
						Players.Players_count = 0; // L: 163
						Players.Players_emptyIdxCount = 0; // L: 164

						for (var4 = 1; var4 < 2048; ++var4) { // L: 165
							var10000 = Players.field1350; // L: 166
							var10000[var4] = (byte)(var10000[var4] >> 1);
							Player var5 = Client.players[var4]; // L: 167
							if (var5 != null) { // L: 168
								Players.Players_indices[++Players.Players_count - 1] = var4;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var4; // L: 169
							}
						}

						PcmPlayer.method857(var0); // L: 172
						if (var0.offset - var2 != var1) { // L: 173
							throw new RuntimeException(var0.offset - var2 + " " + var1); // L: 174
						}
					}
				}
			}
		}
	} // L: 176

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "80"
	)
	static final void method205(String var0) {
		StringBuilder var10000 = new StringBuilder();
		Object var10001 = null; // L: 189
		var10000 = var10000.append("Please remove ").append(var0);
		var10001 = null;
		String var1 = var10000.append(" from your friend list first").toString();
		class69.addGameMessage(30, "", var1); // L: 191
	} // L: 193

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(Lhu;B)Ljava/lang/String;",
		garbageValue = "-44"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (class223.Widget_unpackTargetMask(DirectByteArrayCopier.getWidgetFlags(var0)) == 0) { // L: 11599
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null; // L: 11600 11601 11603
		}
	}
}
