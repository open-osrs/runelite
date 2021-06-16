import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nt")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("r")
	@Export("crc32Table")
	static int[] crc32Table;
	@ObfuscatedName("d")
	@Export("crc64Table")
	static long[] crc64Table;
	@ObfuscatedName("o")
	@Export("array")
	public byte[] array;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1763340179
	)
	@Export("offset")
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
				if (1L == (var0 & 1L)) { // L: 37
					var0 = var0 >>> 1 ^ -3932672073523589310L;
				} else {
					var0 >>>= 1; // L: 38
				}
			}

			crc64Table[var2] = var0; // L: 40
		}

	} // L: 42

	public Buffer(int var1) {
		this.array = Occluder.ByteArrayPool_getArray(var1); // L: 58
		this.offset = 0; // L: 59
	} // L: 60

	public Buffer(byte[] var1) {
		this.array = var1; // L: 63
		this.offset = 0; // L: 64
	} // L: 65

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-106"
	)
	@Export("releaseArray")
	public void releaseArray() {
		if (this.array != null) { // L: 68
			SequenceDefinition.ByteArrayPool_release(this.array);
		}

		this.array = null; // L: 69
	} // L: 70

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1863377440"
	)
	@Export("writeByte")
	public void writeByte(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 73
	} // L: 74

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-943246978"
	)
	@Export("writeShort")
	public void writeShort(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 77
		this.array[++this.offset - 1] = (byte)var1; // L: 78
	} // L: 79

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-255804232"
	)
	@Export("writeMedium")
	public void writeMedium(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 82
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 83
		this.array[++this.offset - 1] = (byte)var1; // L: 84
	} // L: 85

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-320118747"
	)
	@Export("writeInt")
	public void writeInt(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 88
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 89
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 90
		this.array[++this.offset - 1] = (byte)var1; // L: 91
	} // L: 92

	@ObfuscatedName("ac")
	@Export("writeLongMedium")
	public void writeLongMedium(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40)); // L: 95
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32)); // L: 96
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24)); // L: 97
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16)); // L: 98
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8)); // L: 99
		this.array[++this.offset - 1] = (byte)((int)var1); // L: 100
	} // L: 101

	@ObfuscatedName("as")
	@Export("writeLong")
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1604340695"
	)
	@Export("writeBoolean")
	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0); // L: 115
	} // L: 116

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "18595"
	)
	@Export("writeStringCp1252NullTerminated")
	public void writeStringCp1252NullTerminated(String var1) {
		int var2 = var1.indexOf(0); // L: 123
		if (var2 >= 0) { // L: 124
			throw new IllegalArgumentException("");
		} else {
			this.offset += HorizontalAlignment.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 125
			this.array[++this.offset - 1] = 0; // L: 126
		}
	} // L: 127

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "856089217"
	)
	@Export("writeStringCp1252NullCircumfixed")
	public void writeStringCp1252NullCircumfixed(String var1) {
		int var2 = var1.indexOf(0); // L: 134
		if (var2 >= 0) { // L: 135
			throw new IllegalArgumentException("");
		} else {
			this.array[++this.offset - 1] = 0; // L: 136
			this.offset += HorizontalAlignment.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 137
			this.array[++this.offset - 1] = 0; // L: 138
		}
	} // L: 139

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)V",
		garbageValue = "-1762854289"
	)
	@Export("writeCESU8")
	public void writeCESU8(CharSequence var1) {
		int var2 = Friend.method5774(var1); // L: 142
		this.array[++this.offset - 1] = 0; // L: 143
		this.writeVarInt(var2); // L: 144
		int var3 = this.offset * -1967454565; // L: 145
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
		this.offset = (var3 + var4 * -1967454565) * 1763340179; // L: 169
	} // L: 170

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "1373881808"
	)
	@Export("writeBytes")
	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			this.array[++this.offset - 1] = var1[var4]; // L: 173
		}

	} // L: 174

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "-2065580787"
	)
	public void method6607(Buffer var1) {
		this.writeBytes(var1.array, 0, var1.offset); // L: 177
	} // L: 178

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-70"
	)
	@Export("writeLengthInt")
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

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-1"
	)
	@Export("writeLengthShort")
	public void writeLengthShort(int var1) {
		if (var1 >= 0 && var1 <= 65535) { // L: 191
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 194
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 195
		} else {
			throw new IllegalArgumentException(); // L: 192
		}
	} // L: 196

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-256020181"
	)
	@Export("writeLengthByte")
	public void writeLengthByte(int var1) {
		if (var1 >= 0 && var1 <= 255) { // L: 199
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 202
		} else {
			throw new IllegalArgumentException(); // L: 200
		}
	} // L: 203

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1840761658"
	)
	@Export("writeSmartByteShort")
	public void writeSmartByteShort(int var1) {
		if (var1 >= 0 && var1 < 128) { // L: 206
			this.writeByte(var1); // L: 207
		} else if (var1 >= 0 && var1 < 32768) { // L: 210
			this.writeShort(var1 + 32768); // L: 211
		} else {
			throw new IllegalArgumentException(); // L: 214
		}
	} // L: 208 212

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1285798772"
	)
	@Export("writeVarInt")
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

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "97"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() {
		return this.array[++this.offset - 1] & 255; // L: 232
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(S)B",
		garbageValue = "14690"
	)
	@Export("readByte")
	public byte readByte() {
		return this.array[++this.offset - 1]; // L: 236
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "61"
	)
	@Export("readUnsignedShort")
	public int readUnsignedShort() {
		this.offset += 2; // L: 240
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 241
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1344760160"
	)
	@Export("readShort")
	public int readShort() {
		this.offset += 2; // L: 245
		int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 246
		if (var1 > 32767) { // L: 247
			var1 -= 65536;
		}

		return var1; // L: 248
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1626768763"
	)
	@Export("readMedium")
	public int readMedium() {
		this.offset += 3; // L: 252
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 253
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-299681912"
	)
	@Export("readInt")
	public int readInt() {
		this.offset += 4; // L: 257
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24); // L: 258
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "1743202445"
	)
	@Export("readLong")
	public long readLong() {
		long var1 = (long)this.readInt() & 4294967295L; // L: 262
		long var3 = (long)this.readInt() & 4294967295L; // L: 263
		return (var1 << 32) + var3; // L: 264
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "80"
	)
	@Export("readBoolean")
	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1; // L: 268
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-615032441"
	)
	@Export("readStringCp1252NullTerminatedOrNull")
	public String readStringCp1252NullTerminatedOrNull() {
		if (this.array[this.offset] == 0) { // L: 272
			++this.offset; // L: 273
			return null; // L: 274
		} else {
			return this.readStringCp1252NullTerminated(); // L: 276
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1193629653"
	)
	@Export("readStringCp1252NullTerminated")
	public String readStringCp1252NullTerminated() {
		int var1 = this.offset; // L: 280

		while (this.array[++this.offset - 1] != 0) { // L: 281
		}

		int var2 = this.offset - var1 - 1; // L: 282
		return var2 == 0 ? "" : Actor.decodeStringCp1252(this.array, var1, var2); // L: 283 284
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1964940148"
	)
	@Export("readStringCp1252NullCircumfixed")
	public String readStringCp1252NullCircumfixed() {
		byte var1 = this.array[++this.offset - 1]; // L: 288
		if (var1 != 0) { // L: 289
			throw new IllegalStateException("");
		} else {
			int var2 = this.offset; // L: 290

			while (this.array[++this.offset - 1] != 0) { // L: 291
			}

			int var3 = this.offset - var2 - 1; // L: 292
			return var3 == 0 ? "" : Actor.decodeStringCp1252(this.array, var2, var3); // L: 293 294
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "-14038"
	)
	@Export("readCESU8")
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
				for (int var9 = var2 + var5; var8 < var9; var6[var7++] = (char)var11) { // L: 309 310 341
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

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-1720169048"
	)
	@Export("readBytes")
	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = this.array[++this.offset - 1]; // L: 351
		}

	} // L: 352

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "9"
	)
	@Export("readShortSmart")
	public int readShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 355
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152; // L: 356 357
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2144461142"
	)
	@Export("readUShortSmart")
	public int readUShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 361
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768; // L: 362 363
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1158750007"
	)
	public int method6628() {
		int var1 = 0; // L: 367

		int var2;
		for (var2 = this.readUShortSmart(); var2 == 32767; var2 = this.readUShortSmart()) { // L: 368 369 371
			var1 += 32767; // L: 370
		}

		var1 += var2; // L: 373
		return var1; // L: 374
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-672544141"
	)
	public int method6629() {
		return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort(); // L: 378 379
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1778675076"
	)
	public int method6630() {
		if (this.array[this.offset] < 0) { // L: 383
			return this.readInt() & Integer.MAX_VALUE;
		} else {
			int var1 = this.readUnsignedShort(); // L: 384
			return var1 == 32767 ? -1 : var1; // L: 385
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "104"
	)
	@Export("readVarInt")
	public int readVarInt() {
		byte var1 = this.array[++this.offset - 1]; // L: 390

		int var2;
		for (var2 = 0; var1 < 0; var1 = this.array[++this.offset - 1]) { // L: 391 392 394
			var2 = (var2 | var1 & 127) << 7; // L: 393
		}

		return var2 | var1; // L: 396
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "([IB)V",
		garbageValue = "57"
	)
	@Export("xteaEncryptAll")
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

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "-2067473238"
	)
	@Export("xteaDecryptAll")
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

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "([IIIB)V",
		garbageValue = "-94"
	)
	@Export("xteaEncrypt")
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

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "-1245486877"
	)
	@Export("xteaDecrypt")
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

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V",
		garbageValue = "421245278"
	)
	@Export("encryptRsa")
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
		garbageValue = "2115415090"
	)
	@Export("writeCrc")
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

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "87"
	)
	@Export("checkCrc")
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

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "107"
	)
	public void method6639(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 533
	} // L: 534

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "402503906"
	)
	public void method6640(int var1) {
		this.array[++this.offset - 1] = (byte)(0 - var1); // L: 537
	} // L: 538

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2121768907"
	)
	public void method6641(int var1) {
		this.array[++this.offset - 1] = (byte)(128 - var1); // L: 541
	} // L: 542

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1750858252"
	)
	public int method6642() {
		return this.array[++this.offset - 1] - 128 & 255; // L: 545
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "505032315"
	)
	public int method6643() {
		return 0 - this.array[++this.offset - 1] & 255; // L: 549
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1048113331"
	)
	public int method6644() {
		return 128 - this.array[++this.offset - 1] & 255; // L: 553
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "258773489"
	)
	public byte method6619() {
		return (byte)(this.array[++this.offset - 1] - 128); // L: 557
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-646501277"
	)
	public byte method6682() {
		return (byte)(0 - this.array[++this.offset - 1]); // L: 561
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-637934068"
	)
	public byte method6750() {
		return (byte)(128 - this.array[++this.offset - 1]); // L: 565
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-162656200"
	)
	public void method6648(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 569
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 570
	} // L: 571

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	public void method6705(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 574
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 575
	} // L: 576

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1684628461"
	)
	public void method6649(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 579
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 580
	} // L: 581

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1073030167"
	)
	public int method6651() {
		this.offset += 2; // L: 584
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 585
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-245391743"
	)
	public int method6652() {
		this.offset += 2; // L: 589
		return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 590
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2016753913"
	)
	public int method6653() {
		this.offset += 2; // L: 594
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 595
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-318250344"
	)
	public int method6654() {
		this.offset += 2; // L: 599
		int var1 = (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 600
		if (var1 > 32767) { // L: 601
			var1 -= 65536;
		}

		return var1; // L: 602
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "84"
	)
	public int method6757() {
		this.offset += 2; // L: 606
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 607
		if (var1 > 32767) { // L: 608
			var1 -= 65536;
		}

		return var1; // L: 609
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-548315775"
	)
	public void method6660(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 613
		this.array[++this.offset - 1] = (byte)var1; // L: 614
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 615
	} // L: 616

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1682759664"
	)
	@Export("writeIntME")
	public void writeIntME(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 619
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 620
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 621
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 622
	} // L: 623

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1397915031"
	)
	public void method6658(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 626
		this.array[++this.offset - 1] = (byte)var1; // L: 627
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 628
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 629
	} // L: 630

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-553744545"
	)
	public void method6659(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 633
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 634
		this.array[++this.offset - 1] = (byte)var1; // L: 635
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 636
	} // L: 637

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1763340179"
	)
	public int method6675() {
		this.offset += 4; // L: 640
		return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24); // L: 641
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "51"
	)
	public int method6725() {
		this.offset += 4; // L: 645
		return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16); // L: 646
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-638503855"
	)
	public int method6662() {
		this.offset += 4; // L: 650
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24); // L: 651
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-954433939"
	)
	public void method6821(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = (byte)(this.array[++this.offset - 1] - 128); // L: 655
		}

	} // L: 656
}
