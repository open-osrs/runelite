import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pi")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("a")
	@Export("crc32Table")
	static int[] crc32Table;
	@ObfuscatedName("u")
	@Export("crc64Table")
	static long[] crc64Table;
	@ObfuscatedName("w")
	@Export("array")
	public byte[] array;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -128254341
	)
	@Export("offset")
	public int offset;

	static {
		crc32Table = new int[256]; // L: 16

		int var2;
		for (int var1 = 0; var1 < 256; ++var1) { // L: 21
			int var4 = var1; // L: 22

			for (var2 = 0; var2 < 8; ++var2) { // L: 23
				if ((var4 & 1) == 1) { // L: 24
					var4 = var4 >>> 1 ^ -306674912;
				} else {
					var4 >>>= 1; // L: 25
				}
			}

			crc32Table[var1] = var4; // L: 27
		}

		crc64Table = new long[256]; // L: 31

		for (var2 = 0; var2 < 256; ++var2) { // L: 36
			long var0 = (long)var2; // L: 37

			for (int var3 = 0; var3 < 8; ++var3) { // L: 38
				if ((var0 & 1L) == 1L) { // L: 39
					var0 = var0 >>> 1 ^ -3932672073523589310L;
				} else {
					var0 >>>= 1; // L: 40
				}
			}

			crc64Table[var2] = var0; // L: 42
		}

	} // L: 44

	public Buffer(int var1) {
		this.array = InterfaceParent.ByteArrayPool_getArray(var1); // L: 56
		this.offset = 0; // L: 57
	} // L: 58

	public Buffer(byte[] var1) {
		this.array = var1; // L: 61
		this.offset = 0; // L: 62
	} // L: 63

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "119"
	)
	@Export("releaseArray")
	public void releaseArray() {
		if (this.array != null) { // L: 66
			ScriptEvent.ByteArrayPool_release(this.array);
		}

		this.array = null; // L: 67
	} // L: 68

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "94"
	)
	@Export("writeByte")
	public void writeByte(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 71
	} // L: 72

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "255"
	)
	@Export("writeShort")
	public void writeShort(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 75
		this.array[++this.offset - 1] = (byte)var1; // L: 76
	} // L: 77

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1187655626"
	)
	@Export("writeMedium")
	public void writeMedium(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 80
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 81
		this.array[++this.offset - 1] = (byte)var1; // L: 82
	} // L: 83

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "18"
	)
	@Export("writeInt")
	public void writeInt(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 86
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 87
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 88
		this.array[++this.offset - 1] = (byte)var1; // L: 89
	} // L: 90

	@ObfuscatedName("at")
	@Export("writeLongMedium")
	public void writeLongMedium(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40)); // L: 93
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32)); // L: 94
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24)); // L: 95
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16)); // L: 96
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8)); // L: 97
		this.array[++this.offset - 1] = (byte)((int)var1); // L: 98
	} // L: 99

	@ObfuscatedName("ae")
	@Export("writeLong")
	public void writeLong(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 56)); // L: 102
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 48)); // L: 103
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40)); // L: 104
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32)); // L: 105
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24)); // L: 106
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16)); // L: 107
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8)); // L: 108
		this.array[++this.offset - 1] = (byte)((int)var1); // L: 109
	} // L: 110

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "4"
	)
	@Export("writeBoolean")
	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0); // L: 113
	} // L: 114

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-2105418018"
	)
	@Export("writeStringCp1252NullTerminated")
	public void writeStringCp1252NullTerminated(String var1) {
		int var2 = var1.indexOf(0); // L: 121
		if (var2 >= 0) { // L: 122
			throw new IllegalArgumentException("");
		} else {
			this.offset += class255.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 123
			this.array[++this.offset - 1] = 0; // L: 124
		}
	} // L: 125

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-86251043"
	)
	@Export("writeStringCp1252NullCircumfixed")
	public void writeStringCp1252NullCircumfixed(String var1) {
		int var2 = var1.indexOf(0); // L: 132
		if (var2 >= 0) { // L: 133
			throw new IllegalArgumentException("");
		} else {
			this.array[++this.offset - 1] = 0; // L: 134
			this.offset += class255.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 135
			this.array[++this.offset - 1] = 0; // L: 136
		}
	} // L: 137

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)V",
		garbageValue = "412537347"
	)
	@Export("writeCESU8")
	public void writeCESU8(CharSequence var1) {
		int var2 = class186.method3692(var1); // L: 140
		this.array[++this.offset - 1] = 0; // L: 141
		this.writeVarInt(var2); // L: 142
		this.offset += UrlRequester.method2420(this.array, this.offset, var1); // L: 143
	} // L: 144

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-751072732"
	)
	@Export("writeBytes")
	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) { // L: 147
			this.array[++this.offset - 1] = var1[var4];
		}

	} // L: 148

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "226683380"
	)
	public void method7361(Buffer var1) {
		this.writeBytes(var1.array, 0, var1.offset); // L: 151
	} // L: 152

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-489588257"
	)
	@Export("writeLengthInt")
	public void writeLengthInt(int var1) {
		if (var1 < 0) { // L: 155
			throw new IllegalArgumentException(); // L: 156
		} else {
			this.array[this.offset - var1 - 4] = (byte)(var1 >> 24); // L: 158
			this.array[this.offset - var1 - 3] = (byte)(var1 >> 16); // L: 159
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 160
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 161
		}
	} // L: 162

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "156866960"
	)
	@Export("writeLengthShort")
	public void writeLengthShort(int var1) {
		if (var1 >= 0 && var1 <= 65535) { // L: 165
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 168
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 169
		} else {
			throw new IllegalArgumentException(); // L: 166
		}
	} // L: 170

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2055427525"
	)
	public void method7504(int var1) {
		if (var1 >= 0 && var1 <= 255) { // L: 173
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 176
		} else {
			throw new IllegalArgumentException(); // L: 174
		}
	} // L: 177

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-793889673"
	)
	@Export("writeSmartByteShort")
	public void writeSmartByteShort(int var1) {
		if (var1 >= 0 && var1 < 128) { // L: 180
			this.writeByte(var1); // L: 181
		} else if (var1 >= 0 && var1 < 32768) { // L: 184
			this.writeShort(var1 + 32768); // L: 185
		} else {
			throw new IllegalArgumentException(); // L: 188
		}
	} // L: 182 186

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2108823362"
	)
	@Export("writeVarInt")
	public void writeVarInt(int var1) {
		if ((var1 & -128) != 0) { // L: 192
			if ((var1 & -16384) != 0) { // L: 193
				if ((var1 & -2097152) != 0) { // L: 194
					if ((var1 & -268435456) != 0) { // L: 195
						this.writeByte(var1 >>> 28 | 128);
					}

					this.writeByte(var1 >>> 21 | 128); // L: 196
				}

				this.writeByte(var1 >>> 14 | 128); // L: 198
			}

			this.writeByte(var1 >>> 7 | 128); // L: 200
		}

		this.writeByte(var1 & 127); // L: 202
	} // L: 203

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-879271951"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() {
		return this.array[++this.offset - 1] & 255; // L: 206
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(S)B",
		garbageValue = "255"
	)
	@Export("readByte")
	public byte readByte() {
		return this.array[++this.offset - 1]; // L: 210
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "24"
	)
	@Export("readUnsignedShort")
	public int readUnsignedShort() {
		this.offset += 2; // L: 214
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 215
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "37"
	)
	@Export("readShort")
	public int readShort() {
		this.offset += 2; // L: 219
		int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 220
		if (var1 > 32767) { // L: 221
			var1 -= 65536;
		}

		return var1; // L: 222
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "4032"
	)
	@Export("readMedium")
	public int readMedium() {
		this.offset += 3; // L: 226
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 227
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("readInt")
	public int readInt() {
		this.offset += 4; // L: 231
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24); // L: 232
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-1980860780"
	)
	@Export("readLong")
	public long readLong() {
		long var1 = (long)this.readInt() & 4294967295L; // L: 236
		long var3 = (long)this.readInt() & 4294967295L; // L: 237
		return var3 + (var1 << 32); // L: 238
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "-2022142605"
	)
	public float method7374() {
		return Float.intBitsToFloat(this.readInt()); // L: 242
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "10416"
	)
	@Export("readBoolean")
	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1; // L: 246
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1507200448"
	)
	@Export("readStringCp1252NullTerminatedOrNull")
	public String readStringCp1252NullTerminatedOrNull() {
		if (this.array[this.offset] == 0) { // L: 250
			++this.offset; // L: 251
			return null; // L: 252
		} else {
			return this.readStringCp1252NullTerminated(); // L: 254
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2026301329"
	)
	@Export("readStringCp1252NullTerminated")
	public String readStringCp1252NullTerminated() {
		int var1 = this.offset; // L: 258

		while (this.array[++this.offset - 1] != 0) { // L: 259
		}

		int var2 = this.offset - var1 - 1; // L: 260
		return var2 == 0 ? "" : class140.decodeStringCp1252(this.array, var1, var2); // L: 261 262
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1876672545"
	)
	@Export("readStringCp1252NullCircumfixed")
	public String readStringCp1252NullCircumfixed() {
		byte var1 = this.array[++this.offset - 1]; // L: 266
		if (var1 != 0) { // L: 267
			throw new IllegalStateException("");
		} else {
			int var2 = this.offset; // L: 268

			while (this.array[++this.offset - 1] != 0) { // L: 269
			}

			int var3 = this.offset - var2 - 1; // L: 270
			return var3 == 0 ? "" : class140.decodeStringCp1252(this.array, var2, var3); // L: 271 272
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "-24918"
	)
	@Export("readCESU8")
	public String readCESU8() {
		byte var1 = this.array[++this.offset - 1]; // L: 276
		if (var1 != 0) { // L: 277
			throw new IllegalStateException("");
		} else {
			int var2 = this.readVarInt(); // L: 278
			if (var2 + this.offset > this.array.length) {
				throw new IllegalStateException(""); // L: 279
			} else {
				String var3 = class318.method5786(this.array, this.offset, var2); // L: 280
				this.offset += var2; // L: 281
				return var3; // L: 282
			}
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "([BIIS)V",
		garbageValue = "11937"
	)
	@Export("readBytes")
	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = this.array[++this.offset - 1]; // L: 286
		}

	} // L: 287

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-23"
	)
	@Export("readShortSmart")
	public int readShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 290
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152; // L: 291 292
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1587760461"
	)
	@Export("readUShortSmart")
	public int readUShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 296
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768; // L: 297 298
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1880855554"
	)
	public int method7383() {
		int var1 = 0; // L: 302

		int var2;
		for (var2 = this.readUShortSmart(); var2 == 32767; var2 = this.readUShortSmart()) { // L: 303 304 306
			var1 += 32767; // L: 305
		}

		var1 += var2; // L: 308
		return var1; // L: 309
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1274864235"
	)
	public int method7384() {
		return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort(); // L: 313 314
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "826281746"
	)
	public int method7352() {
		if (this.array[this.offset] < 0) { // L: 318
			return this.readInt() & Integer.MAX_VALUE;
		} else {
			int var1 = this.readUnsignedShort(); // L: 319
			return var1 == 32767 ? -1 : var1; // L: 320
		}
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-86778709"
	)
	@Export("readVarInt")
	public int readVarInt() {
		byte var1 = this.array[++this.offset - 1]; // L: 325

		int var2;
		for (var2 = 0; var1 < 0; var1 = this.array[++this.offset - 1]) { // L: 326 327 329
			var2 = (var2 | var1 & 127) << 7; // L: 328
		}

		return var2 | var1; // L: 331
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "-563987489"
	)
	@Export("xteaEncryptAll")
	public void xteaEncryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 335
		this.offset = 0; // L: 336

		for (int var3 = 0; var3 < var2; ++var3) { // L: 337
			int var4 = this.readInt(); // L: 338
			int var5 = this.readInt(); // L: 339
			int var6 = 0; // L: 340
			int var7 = -1640531527; // L: 341

			for (int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) { // L: 342 343 346
				var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]; // L: 344
				var6 += var7; // L: 345
			}

			this.offset -= 8; // L: 348
			this.writeInt(var4); // L: 349
			this.writeInt(var5); // L: 350
		}

	} // L: 352

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "([IB)V",
		garbageValue = "69"
	)
	@Export("xteaDecryptAll")
	public void xteaDecryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 355
		this.offset = 0; // L: 356

		for (int var3 = 0; var3 < var2; ++var3) { // L: 357
			int var4 = this.readInt(); // L: 358
			int var5 = this.readInt(); // L: 359
			int var6 = -957401312; // L: 360
			int var7 = -1640531527; // L: 361

			for (int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]) { // L: 362 363 366
				var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6; // L: 364
				var6 -= var7; // L: 365
			}

			this.offset -= 8; // L: 368
			this.writeInt(var4); // L: 369
			this.writeInt(var5); // L: 370
		}

	} // L: 372

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "799009571"
	)
	@Export("xteaEncrypt")
	public void xteaEncrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 375
		this.offset = var2; // L: 376
		int var5 = (var3 - var2) / 8; // L: 377

		for (int var6 = 0; var6 < var5; ++var6) { // L: 378
			int var7 = this.readInt(); // L: 379
			int var8 = this.readInt(); // L: 380
			int var9 = 0; // L: 381
			int var10 = -1640531527; // L: 382

			for (int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) { // L: 383 384 387
				var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]; // L: 385
				var9 += var10; // L: 386
			}

			this.offset -= 8; // L: 389
			this.writeInt(var7); // L: 390
			this.writeInt(var8); // L: 391
		}

		this.offset = var4; // L: 393
	} // L: 394

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "1203878548"
	)
	@Export("xteaDecrypt")
	public void xteaDecrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 397
		this.offset = var2; // L: 398
		int var5 = (var3 - var2) / 8; // L: 399

		for (int var6 = 0; var6 < var5; ++var6) { // L: 400
			int var7 = this.readInt(); // L: 401
			int var8 = this.readInt(); // L: 402
			int var9 = -957401312; // L: 403
			int var10 = -1640531527; // L: 404

			for (int var11 = 32; var11-- > 0; var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]) { // L: 405 406 409
				var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9; // L: 407
				var9 -= var10; // L: 408
			}

			this.offset -= 8; // L: 411
			this.writeInt(var7); // L: 412
			this.writeInt(var8); // L: 413
		}

		this.offset = var4; // L: 415
	} // L: 416

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V",
		garbageValue = "-129972442"
	)
	@Export("encryptRsa")
	public void encryptRsa(BigInteger var1, BigInteger var2) {
		int var3 = this.offset; // L: 419
		this.offset = 0; // L: 420
		byte[] var4 = new byte[var3]; // L: 421
		this.readBytes(var4, 0, var3); // L: 422
		BigInteger var5 = new BigInteger(var4); // L: 423
		BigInteger var6 = var5.modPow(var1, var2); // L: 424
		byte[] var7 = var6.toByteArray(); // L: 425
		this.offset = 0; // L: 426
		this.writeShort(var7.length); // L: 427
		this.writeBytes(var7, 0, var7.length); // L: 428
	} // L: 429

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "424794387"
	)
	@Export("writeCrc")
	public int writeCrc(int var1) {
		int var2 = ClientPreferences.method2230(this.array, var1, this.offset); // L: 432
		this.writeInt(var2); // L: 433
		return var2; // L: 434
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "1024"
	)
	@Export("checkCrc")
	public boolean checkCrc() {
		this.offset -= 4; // L: 438
		int var1 = ClientPreferences.method2230(this.array, 0, this.offset); // L: 439
		int var2 = this.readInt(); // L: 440
		return var2 == var1; // L: 441
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1143251662"
	)
	public void method7403(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 446
	} // L: 447

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-26"
	)
	public void method7458(int var1) {
		this.array[++this.offset - 1] = (byte)(0 - var1); // L: 450
	} // L: 451

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-662681481"
	)
	public void method7370(int var1) {
		this.array[++this.offset - 1] = (byte)(128 - var1); // L: 454
	} // L: 455

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1451747396"
	)
	public int method7467() {
		return this.array[++this.offset - 1] - 128 & 255; // L: 458
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-554229996"
	)
	public int method7398() {
		return 0 - this.array[++this.offset - 1] & 255; // L: 462
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "17"
	)
	public int method7399() {
		return 128 - this.array[++this.offset - 1] & 255; // L: 466
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-647604401"
	)
	public byte method7400() {
		return (byte)(this.array[++this.offset - 1] - 128); // L: 470
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(S)B",
		garbageValue = "446"
	)
	public byte method7401() {
		return (byte)(0 - this.array[++this.offset - 1]); // L: 474
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "1"
	)
	public byte method7365() {
		return (byte)(128 - this.array[++this.offset - 1]); // L: 478
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "127"
	)
	public void method7555(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 482
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 483
	} // L: 484

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "77"
	)
	public void method7394(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 487
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 488
	} // L: 489

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-15"
	)
	public void method7405(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 492
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 493
	} // L: 494

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1689370051"
	)
	public int method7562() {
		this.offset += 2; // L: 497
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 498
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-121"
	)
	public int method7414() {
		this.offset += 2; // L: 502
		return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 503
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "4"
	)
	public int method7408() {
		this.offset += 2; // L: 507
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 508
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-25"
	)
	public int method7409() {
		this.offset += 2; // L: 512
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 513
		if (var1 > 32767) { // L: 514
			var1 -= 65536;
		}

		return var1; // L: 515
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-581040641"
	)
	public int method7485() {
		this.offset += 2; // L: 519
		int var1 = (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 520
		if (var1 > 32767) { // L: 521
			var1 -= 65536;
		}

		return var1; // L: 522
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-553338804"
	)
	public int method7411() {
		this.offset += 2; // L: 526
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 527
		if (var1 > 32767) { // L: 528
			var1 -= 65536;
		}

		return var1; // L: 529
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1567459970"
	)
	public int method7412() {
		this.offset += 3; // L: 533
		return (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 1] & 255) << 16); // L: 534
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "614331119"
	)
	@Export("writeIntME")
	public void writeIntME(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 538
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 539
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 540
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 541
	} // L: 542

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1428834929"
	)
	public void method7450(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 545
		this.array[++this.offset - 1] = (byte)var1; // L: 546
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 547
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 548
	} // L: 549

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1468302894"
	)
	public void method7486(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 552
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 553
		this.array[++this.offset - 1] = (byte)var1; // L: 554
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 555
	} // L: 556

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-942513755"
	)
	public int method7416() {
		this.offset += 4; // L: 559
		return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24); // L: 560
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "39"
	)
	public int method7417() {
		this.offset += 4; // L: 564
		return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16); // L: 565
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1726545229"
	)
	public int method7418() {
		this.offset += 4; // L: 569
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24); // L: 570
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "0"
	)
	public void method7419(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = (byte)(this.array[++this.offset - 1] - 128); // L: 574
		}

	} // L: 575

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "-67"
	)
	public void method7564(byte[] var1, int var2, int var3) {
		for (int var4 = var3 + var2 - 1; var4 >= var2; --var4) { // L: 578
			var1[var4] = (byte)(this.array[++this.offset - 1] - 128);
		}

	} // L: 579
}
