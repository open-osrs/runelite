import java.math.BigInteger;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("w")
	static int[] crc32Table;
	@ObfuscatedName("m")
	static long[] crc64Table;
	@ObfuscatedName("o")
	public byte[] array;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -249160527
	)
	public int offset;

	static {
		crc32Table = new int[256]; // L: 14

		int var2;
		for (int var1 = 0; var1 < 256; ++var1) { // L: 19
			int var4 = var1; // L: 20

			for (var2 = 0; var2 < 8; ++var2) { // L: 21
				if ((var4 & 1) == 1) { // L: 22
					var4 = var4 >>> 1 ^ -306674912;
				} else {
					var4 >>>= 1; // L: 23
				}
			}

			crc32Table[var1] = var4; // L: 25
		}

		crc64Table = new long[256]; // L: 29

		for (var2 = 0; var2 < 256; ++var2) { // L: 34
			long var0 = (long)var2; // L: 35

			for (int var3 = 0; var3 < 8; ++var3) { // L: 36
				if ((var0 & 1L) == 1L) { // L: 37
					var0 = var0 >>> 1 ^ -3932672073523589310L;
				} else {
					var0 >>>= 1; // L: 38
				}
			}

			crc64Table[var2] = var0; // L: 40
		}

	} // L: 42

	public Buffer(int var1) {
		this.array = class298.ByteArrayPool_getArray(var1); // L: 58
		this.offset = 0; // L: 59
	} // L: 60

	public Buffer(byte[] var1) {
		this.array = var1; // L: 63
		this.offset = 0; // L: 64
	} // L: 65

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	public void releaseArray() {
		if (this.array != null) { // L: 68
			Canvas.ByteArrayPool_release(this.array);
		}

		this.array = null; // L: 69
	} // L: 70

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "1229"
	)
	public void writeByte(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 73
	} // L: 74

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1689611223"
	)
	public void writeShort(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 77
		this.array[++this.offset - 1] = (byte)var1; // L: 78
	} // L: 79

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "77"
	)
	public void writeMedium(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 82
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 83
		this.array[++this.offset - 1] = (byte)var1; // L: 84
	} // L: 85

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-471050402"
	)
	public void writeInt(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 88
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 89
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 90
		this.array[++this.offset - 1] = (byte)var1; // L: 91
	} // L: 92

	@ObfuscatedName("ak")
	public void writeLongMedium(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40)); // L: 95
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32)); // L: 96
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24)); // L: 97
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16)); // L: 98
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8)); // L: 99
		this.array[++this.offset - 1] = (byte)((int)var1); // L: 100
	} // L: 101

	@ObfuscatedName("ac")
	public void writeLong(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 56)); // L: 104
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 48)); // L: 105
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40)); // L: 106
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32)); // L: 107
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24)); // L: 108
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16)); // L: 109
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8)); // L: 110
		this.array[++this.offset - 1] = (byte)((int)var1); // L: 111
	} // L: 112

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "581507378"
	)
	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0); // L: 115
	} // L: 116

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "349369645"
	)
	public void writeStringCp1252NullTerminated(String var1) {
		int var2 = var1.indexOf(0); // L: 123
		if (var2 >= 0) { // L: 124
			throw new IllegalArgumentException("");
		} else {
			this.offset += SoundSystem.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 125
			this.array[++this.offset - 1] = 0; // L: 126
		}
	} // L: 127

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "99"
	)
	public void writeStringCp1252NullCircumfixed(String var1) {
		int var2 = var1.indexOf(0); // L: 134
		if (var2 >= 0) { // L: 135
			throw new IllegalArgumentException("");
		} else {
			this.array[++this.offset - 1] = 0; // L: 136
			this.offset += SoundSystem.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 137
			this.array[++this.offset - 1] = 0; // L: 138
		}
	} // L: 139

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)V",
		garbageValue = "-1859415815"
	)
	public void writeCESU8(CharSequence var1) {
		int var2 = FloorOverlayDefinition.method4871(var1); // L: 142
		this.array[++this.offset - 1] = 0; // L: 143
		this.writeVarInt(var2); // L: 144
		int var3 = this.offset * -1261786031; // L: 145
		byte[] var5 = this.array; // L: 147
		int var6 = this.offset; // L: 148
		int var7 = var1.length(); // L: 150
		int var8 = var6; // L: 151

		for (int var9 = 0; var9 < var7; ++var9) { // L: 152
			char var10 = var1.charAt(var9); // L: 153
			if (var10 <= 127) { // L: 154
				var5[var8++] = (byte)var10; // L: 155
			} else if (var10 <= 2047) { // L: 157
				var5[var8++] = (byte)(192 | var10 >> 6); // L: 158
				var5[var8++] = (byte)(128 | var10 & '?'); // L: 159
			} else {
				var5[var8++] = (byte)(224 | var10 >> '\f'); // L: 162
				var5[var8++] = (byte)(128 | var10 >> 6 & 63); // L: 163
				var5[var8++] = (byte)(128 | var10 & '?'); // L: 164
			}
		}

		int var4 = var8 - var6; // L: 167
		this.offset = (var3 + var4 * -1261786031) * -249160527; // L: 169
	} // L: 170

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-894436385"
	)
	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) { // L: 173
			this.array[++this.offset - 1] = var1[var4];
		}

	} // L: 174

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lkf;I)V",
		garbageValue = "-2077997319"
	)
	public void method5611(Buffer var1) {
		this.writeBytes(var1.array, 0, var1.offset); // L: 177
	} // L: 178

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-369089618"
	)
	public void writeLengthInt(int var1) {
		if (var1 < 0) { // L: 181
			throw new IllegalArgumentException(); // L: 182
		} else {
			this.array[this.offset - var1 - 4] = (byte)(var1 >> 24); // L: 184
			this.array[this.offset - var1 - 3] = (byte)(var1 >> 16); // L: 185
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 186
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 187
		}
	} // L: 188

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-50"
	)
	public void writeLengthShort(int var1) {
		if (var1 >= 0 && var1 <= 65535) { // L: 191
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 194
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 195
		} else {
			throw new IllegalArgumentException(); // L: 192
		}
	} // L: 196

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1412060467"
	)
	public void writeLengthByte(int var1) {
		if (var1 >= 0 && var1 <= 255) { // L: 199
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 202
		} else {
			throw new IllegalArgumentException(); // L: 200
		}
	} // L: 203

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-92"
	)
	public void writeSmartByteShort(int var1) {
		if (var1 >= 0 && var1 < 128) { // L: 206
			this.writeByte(var1); // L: 207
		} else if (var1 >= 0 && var1 < 32768) { // L: 210
			this.writeShort(var1 + 32768); // L: 211
		} else {
			throw new IllegalArgumentException(); // L: 214
		}
	} // L: 208 212

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-444619487"
	)
	public void writeVarInt(int var1) {
		if ((var1 & -128) != 0) { // L: 218
			if ((var1 & -16384) != 0) { // L: 219
				if ((var1 & -2097152) != 0) { // L: 220
					if ((var1 & -268435456) != 0) { // L: 221
						this.writeByte(var1 >>> 28 | 128);
					}

					this.writeByte(var1 >>> 21 | 128); // L: 222
				}

				this.writeByte(var1 >>> 14 | 128); // L: 224
			}

			this.writeByte(var1 >>> 7 | 128); // L: 226
		}

		this.writeByte(var1 & 127); // L: 228
	} // L: 229

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "600497455"
	)
	public int readUnsignedByte() {
		return this.array[++this.offset - 1] & 255; // L: 232
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "66"
	)
	public byte readByte() {
		return this.array[++this.offset - 1]; // L: 236
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "10687"
	)
	public int readUnsignedShort() {
		this.offset += 2; // L: 240
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 241
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "72"
	)
	public int readShort() {
		this.offset += 2; // L: 245
		int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 246
		if (var1 > 32767) { // L: 247
			var1 -= 65536;
		}

		return var1; // L: 248
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "914016533"
	)
	public int readMedium() {
		this.offset += 3; // L: 252
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 253
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "28464"
	)
	public int readInt() {
		this.offset += 4; // L: 257
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24); // L: 258
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "1145152498"
	)
	public long readLong() {
		long var1 = (long)this.readInt() & 4294967295L; // L: 262
		long var3 = (long)this.readInt() & 4294967295L; // L: 263
		return (var1 << 32) + var3; // L: 264
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "63"
	)
	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1; // L: 268
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "706645017"
	)
	public String readStringCp1252NullTerminatedOrNull() {
		if (this.array[this.offset] == 0) { // L: 272
			++this.offset; // L: 273
			return null; // L: 274
		} else {
			return this.readStringCp1252NullTerminated(); // L: 276
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "95"
	)
	public String readStringCp1252NullTerminated() {
		int var1 = this.offset; // L: 280

		while (this.array[++this.offset - 1] != 0) { // L: 281
		}

		int var2 = this.offset - var1 - 1; // L: 282
		return var2 == 0 ? "" : SpotAnimationDefinition.decodeStringCp1252(this.array, var1, var2); // L: 283 284
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-101"
	)
	public String readStringCp1252NullCircumfixed() {
		byte var1 = this.array[++this.offset - 1]; // L: 288
		if (var1 != 0) { // L: 289
			throw new IllegalStateException("");
		} else {
			int var2 = this.offset; // L: 290

			while (this.array[++this.offset - 1] != 0) { // L: 291
			}

			int var3 = this.offset - var2 - 1; // L: 292
			return var3 == 0 ? "" : SpotAnimationDefinition.decodeStringCp1252(this.array, var2, var3); // L: 293 294
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2118487667"
	)
	public String readCESU8() {
		byte var1 = this.array[++this.offset - 1]; // L: 298
		if (var1 != 0) { // L: 299
			throw new IllegalStateException("");
		} else {
			int var2 = this.readVarInt(); // L: 300
			if (var2 + this.offset > this.array.length) { // L: 301
				throw new IllegalStateException("");
			} else {
				byte[] var4 = this.array; // L: 303
				int var5 = this.offset; // L: 304
				char[] var6 = new char[var2]; // L: 306
				int var7 = 0; // L: 307
				int var8 = var5; // L: 308

				int var11;
				for (int var9 = var5 + var2; var8 < var9; var6[var7++] = (char)var11) { // L: 309 310 341
					int var10 = var4[var8++] & 255; // L: 311
					if (var10 < 128) { // L: 313
						if (var10 == 0) { // L: 314
							var11 = 65533;
						} else {
							var11 = var10; // L: 315
						}
					} else if (var10 < 192) { // L: 317
						var11 = 65533;
					} else if (var10 < 224) { // L: 318
						if (var8 < var9 && (var4[var8] & 192) == 128) { // L: 319
							var11 = (var10 & 31) << 6 | var4[var8++] & 63; // L: 320
							if (var11 < 128) { // L: 321
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 323
						}
					} else if (var10 < 240) { // L: 325
						if (var8 + 1 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128) { // L: 326
							var11 = (var10 & 15) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63; // L: 327
							if (var11 < 2048) { // L: 328
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 330
						}
					} else if (var10 < 248) { // L: 332
						if (var8 + 2 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128 && (var4[var8 + 2] & 192) == 128) { // L: 333
							var11 = (var10 & 7) << 18 | (var4[var8++] & 63) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63; // L: 334
							if (var11 >= 65536 && var11 <= 1114111) { // L: 335
								var11 = 65533; // L: 336
							} else {
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 338
						}
					} else {
						var11 = 65533; // L: 340
					}
				}

				String var3 = new String(var6, 0, var7); // L: 343
				this.offset += var2; // L: 346
				return var3; // L: 347
			}
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "0"
	)
	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = this.array[++this.offset - 1]; // L: 351
		}

	} // L: 352

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	public int readShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 355
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152; // L: 356 357
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "573846843"
	)
	public int readUShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 361
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768; // L: 362 363
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1664654031"
	)
	public int method5632() {
		int var1 = 0; // L: 367

		int var2;
		for (var2 = this.readUShortSmart(); var2 == 32767; var2 = this.readUShortSmart()) { // L: 368 369 371
			var1 += 32767; // L: 370
		}

		var1 += var2; // L: 373
		return var1; // L: 374
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1880158305"
	)
	public int method5666() {
		return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort(); // L: 378 379
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "79"
	)
	public int method5634() {
		if (this.array[this.offset] < 0) { // L: 383
			return this.readInt() & Integer.MAX_VALUE;
		} else {
			int var1 = this.readUnsignedShort(); // L: 384
			return var1 == 32767 ? -1 : var1; // L: 385
		}
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-24"
	)
	public int readVarInt() {
		byte var1 = this.array[++this.offset - 1]; // L: 390

		int var2;
		for (var2 = 0; var1 < 0; var1 = this.array[++this.offset - 1]) { // L: 391 392 394
			var2 = (var2 | var1 & 127) << 7; // L: 393
		}

		return var2 | var1; // L: 396
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "([IB)V",
		garbageValue = "0"
	)
	public void xteaEncryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 400
		this.offset = 0; // L: 401

		for (int var3 = 0; var3 < var2; ++var3) { // L: 402
			int var4 = this.readInt(); // L: 403
			int var5 = this.readInt(); // L: 404
			int var6 = 0; // L: 405
			int var7 = -1640531527; // L: 406

			for (int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) { // L: 407 408 411
				var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]; // L: 409
				var6 += var7; // L: 410
			}

			this.offset -= 8; // L: 413
			this.writeInt(var4); // L: 414
			this.writeInt(var5); // L: 415
		}

	} // L: 417

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "-391802168"
	)
	public void xteaDecryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 420
		this.offset = 0; // L: 421

		for (int var3 = 0; var3 < var2; ++var3) { // L: 422
			int var4 = this.readInt(); // L: 423
			int var5 = this.readInt(); // L: 424
			int var6 = -957401312; // L: 425
			int var7 = -1640531527; // L: 426

			for (int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]) { // L: 427 428 431
				var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6; // L: 429
				var6 -= var7; // L: 430
			}

			this.offset -= 8; // L: 433
			this.writeInt(var4); // L: 434
			this.writeInt(var5); // L: 435
		}

	} // L: 437

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "-1086697970"
	)
	public void xteaEncrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 440
		this.offset = var2; // L: 441
		int var5 = (var3 - var2) / 8; // L: 442

		for (int var6 = 0; var6 < var5; ++var6) { // L: 443
			int var7 = this.readInt(); // L: 444
			int var8 = this.readInt(); // L: 445
			int var9 = 0; // L: 446
			int var10 = -1640531527; // L: 447

			for (int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) { // L: 448 449 452
				var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]; // L: 450
				var9 += var10; // L: 451
			}

			this.offset -= 8; // L: 454
			this.writeInt(var7); // L: 455
			this.writeInt(var8); // L: 456
		}

		this.offset = var4; // L: 458
	} // L: 459

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "([IIIB)V",
		garbageValue = "111"
	)
	public void xteaDecrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 462
		this.offset = var2; // L: 463
		int var5 = (var3 - var2) / 8; // L: 464

		for (int var6 = 0; var6 < var5; ++var6) { // L: 465
			int var7 = this.readInt(); // L: 466
			int var8 = this.readInt(); // L: 467
			int var9 = -957401312; // L: 468
			int var10 = -1640531527; // L: 469

			for (int var11 = 32; var11-- > 0; var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]) { // L: 470 471 474
				var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9; // L: 472
				var9 -= var10; // L: 473
			}

			this.offset -= 8; // L: 476
			this.writeInt(var7); // L: 477
			this.writeInt(var8); // L: 478
		}

		this.offset = var4; // L: 480
	} // L: 481

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V",
		garbageValue = "-1998456113"
	)
	public void encryptRsa(BigInteger var1, BigInteger var2) {
		int var3 = this.offset; // L: 484
		this.offset = 0; // L: 485
		byte[] var4 = new byte[var3]; // L: 486
		this.readBytes(var4, 0, var3); // L: 487
		BigInteger var5 = new BigInteger(var4); // L: 488
		BigInteger var6 = var5.modPow(var1, var2); // L: 489
		byte[] var7 = var6.toByteArray(); // L: 490
		this.offset = 0; // L: 491
		this.writeShort(var7.length); // L: 492
		this.writeBytes(var7, 0, var7.length); // L: 493
	} // L: 494

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "277387180"
	)
	public int writeCrc(int var1) {
		byte[] var3 = this.array; // L: 498
		int var4 = this.offset; // L: 499
		int var5 = -1; // L: 501

		for (int var6 = var1; var6 < var4; ++var6) { // L: 502
			var5 = var5 >>> 8 ^ crc32Table[(var5 ^ var3[var6]) & 255]; // L: 503
		}

		var5 = ~var5; // L: 505
		this.writeInt(var5); // L: 509
		return var5; // L: 510
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1944905387"
	)
	public boolean checkCrc() {
		this.offset -= 4; // L: 514
		byte[] var2 = this.array; // L: 516
		int var3 = this.offset; // L: 517
		int var4 = -1; // L: 519

		int var5;
		for (var5 = 0; var5 < var3; ++var5) { // L: 520
			var4 = var4 >>> 8 ^ crc32Table[(var4 ^ var2[var5]) & 255]; // L: 521
		}

		var4 = ~var4; // L: 523
		var5 = this.readInt(); // L: 527
		return var5 == var4; // L: 528
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1872779472"
	)
	public void method5645(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 533
	} // L: 534

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1958454445"
	)
	public void method5644(int var1) {
		this.array[++this.offset - 1] = (byte)(0 - var1); // L: 537
	} // L: 538

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1046245184"
	)
	public void writeIntME(int var1) {
		this.array[++this.offset - 1] = (byte)(128 - var1); // L: 541
	} // L: 542

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-349157091"
	)
	public int method5646() {
		return this.array[++this.offset - 1] - 128 & 255; // L: 545
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2104060709"
	)
	public int method5639() {
		return 0 - this.array[++this.offset - 1] & 255; // L: 549
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1616346013"
	)
	public int method5612() {
		return 128 - this.array[++this.offset - 1] & 255; // L: 553
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "92"
	)
	public byte method5649() {
		return (byte)(this.array[++this.offset - 1] - 128); // L: 557
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "907230791"
	)
	public byte method5650() {
		return (byte)(0 - this.array[++this.offset - 1]); // L: 561
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-1960161584"
	)
	public byte method5730() {
		return (byte)(128 - this.array[++this.offset - 1]); // L: 565
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-18"
	)
	public void method5665(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 569
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 570
	} // L: 571

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2095246398"
	)
	public void method5653(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 574
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 575
	} // L: 576

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "32"
	)
	public void method5654(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 579
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 580
	} // L: 581

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "359063427"
	)
	public int method5655() {
		this.offset += 2; // L: 584
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 585
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1348032650"
	)
	public int method5656() {
		this.offset += 2; // L: 589
		return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 590
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "14"
	)
	public int method5657() {
		this.offset += 2; // L: 594
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 595
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "44"
	)
	public int method5658() {
		this.offset += 2; // L: 599
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 600
		if (var1 > 32767) { // L: 601
			var1 -= 65536;
		}

		return var1; // L: 602
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2054831893"
	)
	public int method5659() {
		this.offset += 2; // L: 606
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 607
		if (var1 > 32767) { // L: 608
			var1 -= 65536;
		}

		return var1; // L: 609
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "80296845"
	)
	public void method5660(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 613
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 614
		this.array[++this.offset - 1] = (byte)var1; // L: 615
	} // L: 616

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1347720576"
	)
	public int method5740() {
		this.offset += 3; // L: 619
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16); // L: 620
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1701210516"
	)
	public void method5662(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 624
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 625
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 626
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 627
	} // L: 628

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "991573770"
	)
	public void method5663(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 631
		this.array[++this.offset - 1] = (byte)var1; // L: 632
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 633
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 634
	} // L: 635

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-383188135"
	)
	public void writeShortLE(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 638
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 639
		this.array[++this.offset - 1] = (byte)var1; // L: 640
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 641
	} // L: 642

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-640686873"
	)
	public int method5678() {
		this.offset += 4; // L: 645
		return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24); // L: 646
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1384707566"
	)
	public int method5708() {
		this.offset += 4; // L: 650
		return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16); // L: 651
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1723621979"
	)
	public int method5667() {
		this.offset += 4; // L: 655
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24); // L: 656
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "108"
	)
	public void method5749(byte[] var1, int var2, int var3) {
		for (int var4 = var3 + var2 - 1; var4 >= var2; --var4) { // L: 660
			var1[var4] = this.array[++this.offset - 1];
		}

	} // L: 661

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "([BIIS)V",
		garbageValue = "321"
	)
	public void method5697(byte[] var1, int var2, int var3) {
		for (int var4 = var3 + var2 - 1; var4 >= var2; --var4) { // L: 664
			var1[var4] = (byte)(this.array[++this.offset - 1] - 128);
		}

	} // L: 665
}
