import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pi")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("r")
	@Export("crc32Table")
	static int[] crc32Table;
	@ObfuscatedName("v")
	@Export("crc64Table")
	static long[] crc64Table;
	@ObfuscatedName("w")
	@Export("array")
	public byte[] array;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 880174523
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
				if (1L == (var0 & 1L)) { // L: 39
					var0 = var0 >>> 1 ^ -3932672073523589310L;
				} else {
					var0 >>>= 1; // L: 40
				}
			}

			crc64Table[var2] = var0; // L: 42
		}

	} // L: 44

	public Buffer(int var1) {
		this.array = class285.ByteArrayPool_getArray(var1); // L: 56
		this.offset = 0; // L: 57
	} // L: 58

	public Buffer(byte[] var1) {
		this.array = var1; // L: 61
		this.offset = 0; // L: 62
	} // L: 63

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1554155181"
	)
	@Export("releaseArray")
	public void releaseArray() {
		if (this.array != null) { // L: 66
			class144.ByteArrayPool_release(this.array);
		}

		this.array = null; // L: 67
	} // L: 68

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1925776909"
	)
	@Export("writeByte")
	public void writeByte(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 71
	} // L: 72

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-705913708"
	)
	@Export("writeShort")
	public void writeShort(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 75
		this.array[++this.offset - 1] = (byte)var1; // L: 76
	} // L: 77

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "981694226"
	)
	@Export("writeMedium")
	public void writeMedium(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 80
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 81
		this.array[++this.offset - 1] = (byte)var1; // L: 82
	} // L: 83

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-381919842"
	)
	@Export("writeInt")
	public void writeInt(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 86
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 87
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 88
		this.array[++this.offset - 1] = (byte)var1; // L: 89
	} // L: 90

	@ObfuscatedName("aa")
	@Export("writeLongMedium")
	public void writeLongMedium(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40)); // L: 93
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32)); // L: 94
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24)); // L: 95
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16)); // L: 96
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8)); // L: 97
		this.array[++this.offset - 1] = (byte)((int)var1); // L: 98
	} // L: 99

	@ObfuscatedName("as")
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1421662569"
	)
	@Export("writeBoolean")
	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0); // L: 113
	} // L: 114

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "333905694"
	)
	@Export("writeStringCp1252NullTerminated")
	public void writeStringCp1252NullTerminated(String var1) {
		int var2 = var1.indexOf(0); // L: 121
		if (var2 >= 0) { // L: 122
			throw new IllegalArgumentException("");
		} else {
			this.offset += HitSplatDefinition.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 123
			this.array[++this.offset - 1] = 0; // L: 124
		}
	} // L: 125

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-2030941550"
	)
	@Export("writeStringCp1252NullCircumfixed")
	public void writeStringCp1252NullCircumfixed(String var1) {
		int var2 = var1.indexOf(0); // L: 128
		if (var2 >= 0) { // L: 129
			throw new IllegalArgumentException("");
		} else {
			this.array[++this.offset - 1] = 0; // L: 130
			this.offset += HitSplatDefinition.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 131
			this.array[++this.offset - 1] = 0; // L: 132
		}
	} // L: 133

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)V",
		garbageValue = "-1691255738"
	)
	@Export("writeCESU8")
	public void writeCESU8(CharSequence var1) {
		int var3 = var1.length(); // L: 138
		int var4 = 0; // L: 139

		for (int var5 = 0; var5 < var3; ++var5) { // L: 140
			char var6 = var1.charAt(var5); // L: 141
			if (var6 <= 127) { // L: 142
				++var4;
			} else if (var6 <= 2047) { // L: 143
				var4 += 2;
			} else {
				var4 += 3; // L: 144
			}
		}

		this.array[++this.offset - 1] = 0; // L: 149
		this.writeVarInt(var4); // L: 150
		this.offset += class400.method7147(this.array, this.offset, var1); // L: 151
	} // L: 152

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-635018597"
	)
	@Export("writeBytes")
	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) { // L: 155
			this.array[++this.offset - 1] = var1[var4];
		}

	} // L: 156

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "55"
	)
	public void method7356(Buffer var1) {
		this.writeBytes(var1.array, 0, var1.offset); // L: 159
	} // L: 160

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-10"
	)
	@Export("writeLengthInt")
	public void writeLengthInt(int var1) {
		if (var1 < 0) { // L: 163
			throw new IllegalArgumentException(); // L: 164
		} else {
			this.array[this.offset - var1 - 4] = (byte)(var1 >> 24); // L: 166
			this.array[this.offset - var1 - 3] = (byte)(var1 >> 16); // L: 167
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 168
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 169
		}
	} // L: 170

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1377737481"
	)
	@Export("writeLengthShort")
	public void writeLengthShort(int var1) {
		if (var1 >= 0 && var1 <= 65535) { // L: 173
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 176
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 177
		} else {
			throw new IllegalArgumentException(); // L: 174
		}
	} // L: 178

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "852369875"
	)
	public void method7357(int var1) {
		if (var1 >= 0 && var1 <= 255) { // L: 181
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 184
		} else {
			throw new IllegalArgumentException(); // L: 182
		}
	} // L: 185

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	@Export("writeSmartByteShort")
	public void writeSmartByteShort(int var1) {
		if (var1 >= 0 && var1 < 128) { // L: 188
			this.writeByte(var1); // L: 189
		} else if (var1 >= 0 && var1 < 32768) { // L: 192
			this.writeShort(var1 + 32768); // L: 193
		} else {
			throw new IllegalArgumentException(); // L: 196
		}
	} // L: 190 194

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "68"
	)
	@Export("writeVarInt")
	public void writeVarInt(int var1) {
		if ((var1 & -128) != 0) { // L: 200
			if ((var1 & -16384) != 0) { // L: 201
				if ((var1 & -2097152) != 0) { // L: 202
					if ((var1 & -268435456) != 0) { // L: 203
						this.writeByte(var1 >>> 28 | 128);
					}

					this.writeByte(var1 >>> 21 | 128); // L: 204
				}

				this.writeByte(var1 >>> 14 | 128); // L: 206
			}

			this.writeByte(var1 >>> 7 | 128); // L: 208
		}

		this.writeByte(var1 & 127); // L: 210
	} // L: 211

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() {
		return this.array[++this.offset - 1] & 255; // L: 214
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "1210775957"
	)
	@Export("readByte")
	public byte readByte() {
		return this.array[++this.offset - 1]; // L: 218
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1298737604"
	)
	@Export("readUnsignedShort")
	public int readUnsignedShort() {
		this.offset += 2; // L: 222
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 223
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "119"
	)
	@Export("readShort")
	public int readShort() {
		this.offset += 2; // L: 227
		int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 228
		if (var1 > 32767) { // L: 229
			var1 -= 65536;
		}

		return var1; // L: 230
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "349737024"
	)
	@Export("readMedium")
	public int readMedium() {
		this.offset += 3; // L: 234
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 235
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2091317100"
	)
	@Export("readInt")
	public int readInt() {
		this.offset += 4; // L: 239
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24); // L: 240
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "1235603148"
	)
	@Export("readLong")
	public long readLong() {
		long var1 = (long)this.readInt() & 4294967295L; // L: 244
		long var3 = (long)this.readInt() & 4294967295L; // L: 245
		return (var1 << 32) + var3; // L: 246
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "-1631750820"
	)
	public float method7369() {
		return Float.intBitsToFloat(this.readInt()); // L: 250
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-260130890"
	)
	@Export("readBoolean")
	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1; // L: 254
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2019206156"
	)
	@Export("readStringCp1252NullTerminatedOrNull")
	public String readStringCp1252NullTerminatedOrNull() {
		if (this.array[this.offset] == 0) { // L: 258
			++this.offset; // L: 259
			return null; // L: 260
		} else {
			return this.readStringCp1252NullTerminated(); // L: 262
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-96"
	)
	@Export("readStringCp1252NullTerminated")
	public String readStringCp1252NullTerminated() {
		int var1 = this.offset; // L: 266

		while (this.array[++this.offset - 1] != 0) { // L: 267
		}

		int var2 = this.offset - var1 - 1; // L: 268
		return var2 == 0 ? "" : PendingSpawn.decodeStringCp1252(this.array, var1, var2); // L: 269 270
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1092064384"
	)
	@Export("readStringCp1252NullCircumfixed")
	public String readStringCp1252NullCircumfixed() {
		byte var1 = this.array[++this.offset - 1]; // L: 274
		if (var1 != 0) { // L: 275
			throw new IllegalStateException("");
		} else {
			int var2 = this.offset; // L: 276

			while (this.array[++this.offset - 1] != 0) { // L: 277
			}

			int var3 = this.offset - var2 - 1; // L: 278
			return var3 == 0 ? "" : PendingSpawn.decodeStringCp1252(this.array, var2, var3); // L: 279 280
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "97950757"
	)
	@Export("readCESU8")
	public String readCESU8() {
		byte var1 = this.array[++this.offset - 1]; // L: 284
		if (var1 != 0) { // L: 285
			throw new IllegalStateException("");
		} else {
			int var2 = this.readVarInt(); // L: 286
			if (var2 + this.offset > this.array.length) {
				throw new IllegalStateException(""); // L: 287
			} else {
				String var3 = MusicPatchNode.method5294(this.array, this.offset, var2); // L: 288
				this.offset += var2; // L: 289
				return var3; // L: 290
			}
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-2125427032"
	)
	@Export("readBytes")
	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = this.array[++this.offset - 1]; // L: 294
		}

	} // L: 295

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "51904897"
	)
	@Export("readShortSmart")
	public int readShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 298
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152; // L: 299 300
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "76"
	)
	@Export("readUShortSmart")
	public int readUShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 304
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768; // L: 305 306
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-487591152"
	)
	public int method7378() {
		int var1 = 0; // L: 310

		int var2;
		for (var2 = this.readUShortSmart(); var2 == 32767; var2 = this.readUShortSmart()) { // L: 311 312 314
			var1 += 32767; // L: 313
		}

		var1 += var2; // L: 316
		return var1; // L: 317
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2012313947"
	)
	public int method7561() {
		return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort(); // L: 321 322
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-745038115"
	)
	public int method7400() {
		if (this.array[this.offset] < 0) { // L: 326
			return this.readInt() & Integer.MAX_VALUE;
		} else {
			int var1 = this.readUnsignedShort(); // L: 327
			return var1 == 32767 ? -1 : var1; // L: 328
		}
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1765795058"
	)
	@Export("readVarInt")
	public int readVarInt() {
		byte var1 = this.array[++this.offset - 1]; // L: 333

		int var2;
		for (var2 = 0; var1 < 0; var1 = this.array[++this.offset - 1]) { // L: 334 335 337
			var2 = (var2 | var1 & 127) << 7; // L: 336
		}

		return var2 | var1; // L: 339
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "([IB)V",
		garbageValue = "38"
	)
	@Export("xteaEncryptAll")
	public void xteaEncryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 343
		this.offset = 0; // L: 344

		for (int var3 = 0; var3 < var2; ++var3) { // L: 345
			int var4 = this.readInt(); // L: 346
			int var5 = this.readInt(); // L: 347
			int var6 = 0; // L: 348
			int var7 = -1640531527; // L: 349

			for (int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) { // L: 350 351 354
				var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]; // L: 352
				var6 += var7; // L: 353
			}

			this.offset -= 8; // L: 356
			this.writeInt(var4); // L: 357
			this.writeInt(var5); // L: 358
		}

	} // L: 360

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "([IS)V",
		garbageValue = "128"
	)
	@Export("xteaDecryptAll")
	public void xteaDecryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 363
		this.offset = 0; // L: 364

		for (int var3 = 0; var3 < var2; ++var3) { // L: 365
			int var4 = this.readInt(); // L: 366
			int var5 = this.readInt(); // L: 367
			int var6 = -957401312; // L: 368
			int var7 = -1640531527; // L: 369

			for (int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]) { // L: 370 371 374
				var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6; // L: 372
				var6 -= var7; // L: 373
			}

			this.offset -= 8; // L: 376
			this.writeInt(var4); // L: 377
			this.writeInt(var5); // L: 378
		}

	} // L: 380

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "([IIIB)V",
		garbageValue = "0"
	)
	@Export("xteaEncrypt")
	public void xteaEncrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 383
		this.offset = var2; // L: 384
		int var5 = (var3 - var2) / 8; // L: 385

		for (int var6 = 0; var6 < var5; ++var6) { // L: 386
			int var7 = this.readInt(); // L: 387
			int var8 = this.readInt(); // L: 388
			int var9 = 0; // L: 389
			int var10 = -1640531527; // L: 390

			for (int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) { // L: 391 392 395
				var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]; // L: 393
				var9 += var10; // L: 394
			}

			this.offset -= 8; // L: 397
			this.writeInt(var7); // L: 398
			this.writeInt(var8); // L: 399
		}

		this.offset = var4; // L: 401
	} // L: 402

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "1333662453"
	)
	@Export("xteaDecrypt")
	public void xteaDecrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 405
		this.offset = var2; // L: 406
		int var5 = (var3 - var2) / 8; // L: 407

		for (int var6 = 0; var6 < var5; ++var6) { // L: 408
			int var7 = this.readInt(); // L: 409
			int var8 = this.readInt(); // L: 410
			int var9 = -957401312; // L: 411
			int var10 = -1640531527; // L: 412

			for (int var11 = 32; var11-- > 0; var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]) { // L: 413 414 417
				var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9; // L: 415
				var9 -= var10; // L: 416
			}

			this.offset -= 8; // L: 419
			this.writeInt(var7); // L: 420
			this.writeInt(var8); // L: 421
		}

		this.offset = var4; // L: 423
	} // L: 424

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V",
		garbageValue = "377869795"
	)
	@Export("encryptRsa")
	public void encryptRsa(BigInteger var1, BigInteger var2) {
		int var3 = this.offset; // L: 427
		this.offset = 0; // L: 428
		byte[] var4 = new byte[var3]; // L: 429
		this.readBytes(var4, 0, var3); // L: 430
		BigInteger var5 = new BigInteger(var4); // L: 431
		BigInteger var6 = var5.modPow(var1, var2); // L: 432
		byte[] var7 = var6.toByteArray(); // L: 433
		this.offset = 0; // L: 434
		this.writeShort(var7.length); // L: 435
		this.writeBytes(var7, 0, var7.length); // L: 436
	} // L: 437

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-320777848"
	)
	@Export("writeCrc")
	public int writeCrc(int var1) {
		int var2 = Friend.method6298(this.array, var1, this.offset); // L: 440
		this.writeInt(var2); // L: 441
		return var2; // L: 442
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1566510684"
	)
	@Export("checkCrc")
	public boolean checkCrc() {
		this.offset -= 4; // L: 446
		int var1 = Friend.method6298(this.array, 0, this.offset); // L: 447
		int var2 = this.readInt(); // L: 448
		return var2 == var1; // L: 449
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "20"
	)
	public void method7343(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 454
	} // L: 455

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1424242195"
	)
	public void method7390(int var1) {
		this.array[++this.offset - 1] = (byte)(0 - var1); // L: 458
	} // L: 459

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1515798115"
	)
	public void method7362(int var1) {
		this.array[++this.offset - 1] = (byte)(128 - var1); // L: 462
	} // L: 463

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "786739447"
	)
	public int method7392() {
		return this.array[++this.offset - 1] - 128 & 255; // L: 466
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-61"
	)
	public int method7520() {
		return 0 - this.array[++this.offset - 1] & 255; // L: 470
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "100"
	)
	public int method7394() {
		return 128 - this.array[++this.offset - 1] & 255; // L: 474
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-751409747"
	)
	public byte method7465() {
		return (byte)(this.array[++this.offset - 1] - 128); // L: 478
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "91"
	)
	public byte method7396() {
		return (byte)(0 - this.array[++this.offset - 1]); // L: 482
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "31"
	)
	public byte method7397() {
		return (byte)(128 - this.array[++this.offset - 1]); // L: 486
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-546649284"
	)
	public void method7398(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 490
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 491
	} // L: 492

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1845210605"
	)
	public void method7349(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 495
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 496
	} // L: 497

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "719222907"
	)
	public void method7493(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 500
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 501
	} // L: 502

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1146582636"
	)
	public int method7401() {
		this.offset += 2; // L: 505
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 506
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-21"
	)
	public int method7499() {
		this.offset += 2; // L: 510
		return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 511
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "480164745"
	)
	public int method7403() {
		this.offset += 2; // L: 515
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 516
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-890444461"
	)
	public int method7404() {
		this.offset += 2; // L: 520
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 521
		if (var1 > 32767) { // L: 522
			var1 -= 65536;
		}

		return var1; // L: 523
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1356753455"
	)
	public int method7405() {
		this.offset += 2; // L: 527
		int var1 = (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 528
		if (var1 > 32767) { // L: 529
			var1 -= 65536;
		}

		return var1; // L: 530
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-123121164"
	)
	public int method7508() {
		this.offset += 3; // L: 534
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 2] & 255); // L: 535
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "441278727"
	)
	public void method7407(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 539
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 540
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 541
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 542
	} // L: 543

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	public void method7527(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 546
		this.array[++this.offset - 1] = (byte)var1; // L: 547
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 548
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 549
	} // L: 550

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-236068612"
	)
	@Export("writeIntME")
	public void writeIntME(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 553
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 554
		this.array[++this.offset - 1] = (byte)var1; // L: 555
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 556
	} // L: 557

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "520498881"
	)
	public int method7568() {
		this.offset += 4; // L: 560
		return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24); // L: 561
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1906700317"
	)
	public int method7411() {
		this.offset += 4; // L: 565
		return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16); // L: 566
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1988297097"
	)
	public int method7412() {
		this.offset += 4; // L: 570
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24); // L: 571
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "640948899"
	)
	public void method7413(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = (byte)(this.array[++this.offset - 1] - 128); // L: 575
		}

	} // L: 576
}
