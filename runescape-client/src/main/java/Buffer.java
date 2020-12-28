import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kj")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("p")
	@Export("crc32Table")
	static int[] crc32Table;
	@ObfuscatedName("z")
	@Export("crc64Table")
	static long[] crc64Table;
	@ObfuscatedName("j")
	@Export("array")
	public byte[] array;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -889542651
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
		this.array = class25.ByteArrayPool_getArray(var1); // L: 58
		this.offset = 0; // L: 59
	} // L: 60

	public Buffer(byte[] var1) {
		this.array = var1; // L: 63
		this.offset = 0; // L: 64
	} // L: 65

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "118"
	)
	@Export("releaseArray")
	public void releaseArray() {
		if (this.array != null) { // L: 68
			Tile.ByteArrayPool_release(this.array);
		}

		this.array = null; // L: 69
	} // L: 70

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-124"
	)
	@Export("writeByte")
	public void writeByte(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 73
	} // L: 74

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-96"
	)
	@Export("writeShort")
	public void writeShort(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 77
		this.array[++this.offset - 1] = (byte)var1; // L: 78
	} // L: 79

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	@Export("writeMedium")
	public void writeMedium(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 82
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 83
		this.array[++this.offset - 1] = (byte)var1; // L: 84
	} // L: 85

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-37"
	)
	@Export("writeInt")
	public void writeInt(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 88
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 89
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 90
		this.array[++this.offset - 1] = (byte)var1; // L: 91
	} // L: 92

	@ObfuscatedName("af")
	@Export("writeLongMedium")
	public void writeLongMedium(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40)); // L: 95
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32)); // L: 96
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24)); // L: 97
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16)); // L: 98
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8)); // L: 99
		this.array[++this.offset - 1] = (byte)((int)var1); // L: 100
	} // L: 101

	@ObfuscatedName("ar")
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "115"
	)
	@Export("writeBoolean")
	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0); // L: 115
	} // L: 116

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1748540705"
	)
	@Export("writeStringCp1252NullTerminated")
	public void writeStringCp1252NullTerminated(String var1) {
		int var2 = var1.indexOf(0); // L: 123
		if (var2 >= 0) { // L: 124
			throw new IllegalArgumentException("");
		} else {
			this.offset += WorldMapManager.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 125
			this.array[++this.offset - 1] = 0; // L: 126
		}
	} // L: 127

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "1"
	)
	@Export("writeStringCp1252NullCircumfixed")
	public void writeStringCp1252NullCircumfixed(String var1) {
		int var2 = var1.indexOf(0); // L: 134
		if (var2 >= 0) { // L: 135
			throw new IllegalArgumentException("");
		} else {
			this.array[++this.offset - 1] = 0; // L: 136
			this.offset += WorldMapManager.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 137
			this.array[++this.offset - 1] = 0; // L: 138
		}
	} // L: 139

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)V",
		garbageValue = "707162171"
	)
	@Export("writeCESU8")
	public void writeCESU8(CharSequence var1) {
		int var2 = UserComparator5.method3500(var1); // L: 142
		this.array[++this.offset - 1] = 0; // L: 143
		this.writeVarInt(var2); // L: 144
		int var3 = this.offset * -1182276403; // L: 145
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
		this.offset = (var3 + var4 * -1182276403) * -889542651; // L: 169
	} // L: 170

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "1585895405"
	)
	@Export("writeBytes")
	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) { // L: 173
			this.array[++this.offset - 1] = var1[var4];
		}

	} // L: 174

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lkj;I)V",
		garbageValue = "-1843609104"
	)
	public void method5536(Buffer var1) {
		this.writeBytes(var1.array, 0, var1.offset); // L: 177
	} // L: 178

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1998350841"
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

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-50"
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

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1378695030"
	)
	@Export("writeLengthByte")
	public void writeLengthByte(int var1) {
		if (var1 >= 0 && var1 <= 255) { // L: 199
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 202
		} else {
			throw new IllegalArgumentException(); // L: 200
		}
	} // L: 203

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2062071032"
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

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1932364447"
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

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-35"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() {
		return this.array[++this.offset - 1] & 255; // L: 232
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "0"
	)
	@Export("readByte")
	public byte readByte() {
		return this.array[++this.offset - 1]; // L: 236
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1104623987"
	)
	@Export("readUnsignedShort")
	public int readUnsignedShort() {
		this.offset += 2; // L: 240
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 241
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "6226"
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

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "239"
	)
	@Export("readMedium")
	public int readMedium() {
		this.offset += 3; // L: 252
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 253
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "111775970"
	)
	@Export("readInt")
	public int readInt() {
		this.offset += 4; // L: 257
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24); // L: 258
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-1452316601"
	)
	@Export("readLong")
	public long readLong() {
		long var1 = (long)this.readInt() & 4294967295L; // L: 262
		long var3 = (long)this.readInt() & 4294967295L; // L: 263
		return var3 + (var1 << 32); // L: 264
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1305798677"
	)
	@Export("readBoolean")
	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1; // L: 268
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "186780327"
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

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1398193536"
	)
	@Export("readStringCp1252NullTerminated")
	public String readStringCp1252NullTerminated() {
		int var1 = this.offset; // L: 280

		while (this.array[++this.offset - 1] != 0) { // L: 281
		}

		int var2 = this.offset - var1 - 1; // L: 282
		return var2 == 0 ? "" : Clock.decodeStringCp1252(this.array, var1, var2); // L: 283 284
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-519852136"
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
			return var3 == 0 ? "" : Clock.decodeStringCp1252(this.array, var2, var3); // L: 293 294
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-33"
	)
	@Export("readCESU8")
	public String readCESU8() {
		byte var1 = this.array[++this.offset - 1]; // L: 298
		if (var1 != 0) { // L: 299
			throw new IllegalStateException("");
		} else {
			int var2 = this.readVarInt(); // L: 300
			if (var2 + this.offset > this.array.length) {
				throw new IllegalStateException(""); // L: 301
			} else {
				String var3 = class39.method591(this.array, this.offset, var2); // L: 302
				this.offset += var2; // L: 303
				return var3; // L: 304
			}
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "1075075180"
	)
	@Export("readBytes")
	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = this.array[++this.offset - 1]; // L: 308
		}

	} // L: 309

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "130333316"
	)
	@Export("readShortSmart")
	public int readShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 312
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152; // L: 313 314
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "772809583"
	)
	@Export("readUShortSmart")
	public int readUShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 318
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768; // L: 319 320
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-561534600"
	)
	public int method5557() {
		int var1 = 0; // L: 324

		int var2;
		for (var2 = this.readUShortSmart(); var2 == 32767; var2 = this.readUShortSmart()) { // L: 325 326 328
			var1 += 32767; // L: 327
		}

		var1 += var2; // L: 330
		return var1; // L: 331
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "661695765"
	)
	public int method5558() {
		return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort(); // L: 335 336
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "1005"
	)
	public int method5559() {
		if (this.array[this.offset] < 0) { // L: 340
			return this.readInt() & Integer.MAX_VALUE;
		} else {
			int var1 = this.readUnsignedShort(); // L: 341
			return var1 == 32767 ? -1 : var1; // L: 342
		}
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-120"
	)
	@Export("readVarInt")
	public int readVarInt() {
		byte var1 = this.array[++this.offset - 1]; // L: 347

		int var2;
		for (var2 = 0; var1 < 0; var1 = this.array[++this.offset - 1]) { // L: 348 349 351
			var2 = (var2 | var1 & 127) << 7; // L: 350
		}

		return var2 | var1; // L: 353
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "([IB)V",
		garbageValue = "0"
	)
	@Export("xteaEncryptAll")
	public void xteaEncryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 357
		this.offset = 0; // L: 358

		for (int var3 = 0; var3 < var2; ++var3) { // L: 359
			int var4 = this.readInt(); // L: 360
			int var5 = this.readInt(); // L: 361
			int var6 = 0; // L: 362
			int var7 = -1640531527; // L: 363

			for (int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) { // L: 364 365 368
				var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]; // L: 366
				var6 += var7; // L: 367
			}

			this.offset -= 8; // L: 370
			this.writeInt(var4); // L: 371
			this.writeInt(var5); // L: 372
		}

	} // L: 374

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "847845555"
	)
	@Export("xteaDecryptAll")
	public void xteaDecryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 377
		this.offset = 0; // L: 378

		for (int var3 = 0; var3 < var2; ++var3) { // L: 379
			int var4 = this.readInt(); // L: 380
			int var5 = this.readInt(); // L: 381
			int var6 = -957401312; // L: 382
			int var7 = -1640531527; // L: 383

			for (int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]) { // L: 384 385 388
				var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6; // L: 386
				var6 -= var7; // L: 387
			}

			this.offset -= 8; // L: 390
			this.writeInt(var4); // L: 391
			this.writeInt(var5); // L: 392
		}

	} // L: 394

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "-362295115"
	)
	@Export("xteaEncrypt")
	public void xteaEncrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 397
		this.offset = var2; // L: 398
		int var5 = (var3 - var2) / 8; // L: 399

		for (int var6 = 0; var6 < var5; ++var6) { // L: 400
			int var7 = this.readInt(); // L: 401
			int var8 = this.readInt(); // L: 402
			int var9 = 0; // L: 403
			int var10 = -1640531527; // L: 404

			for (int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) { // L: 405 406 409
				var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]; // L: 407
				var9 += var10; // L: 408
			}

			this.offset -= 8; // L: 411
			this.writeInt(var7); // L: 412
			this.writeInt(var8); // L: 413
		}

		this.offset = var4; // L: 415
	} // L: 416

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "-1521995814"
	)
	@Export("xteaDecrypt")
	public void xteaDecrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 419
		this.offset = var2; // L: 420
		int var5 = (var3 - var2) / 8; // L: 421

		for (int var6 = 0; var6 < var5; ++var6) { // L: 422
			int var7 = this.readInt(); // L: 423
			int var8 = this.readInt(); // L: 424
			int var9 = -957401312; // L: 425
			int var10 = -1640531527; // L: 426

			for (int var11 = 32; var11-- > 0; var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]) { // L: 427 428 431
				var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9; // L: 429
				var9 -= var10; // L: 430
			}

			this.offset -= 8; // L: 433
			this.writeInt(var7); // L: 434
			this.writeInt(var8); // L: 435
		}

		this.offset = var4; // L: 437
	} // L: 438

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V",
		garbageValue = "-1385542565"
	)
	@Export("encryptRsa")
	public void encryptRsa(BigInteger var1, BigInteger var2) {
		int var3 = this.offset; // L: 441
		this.offset = 0; // L: 442
		byte[] var4 = new byte[var3]; // L: 443
		this.readBytes(var4, 0, var3); // L: 444
		BigInteger var5 = new BigInteger(var4); // L: 445
		BigInteger var6 = var5.modPow(var1, var2); // L: 446
		byte[] var7 = var6.toByteArray(); // L: 447
		this.offset = 0; // L: 448
		this.writeShort(var7.length); // L: 449
		this.writeBytes(var7, 0, var7.length); // L: 450
	} // L: 451

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1467040648"
	)
	@Export("writeCrc")
	public int writeCrc(int var1) {
		int var2 = WorldMapRectangle.method334(this.array, var1, this.offset); // L: 454
		this.writeInt(var2); // L: 455
		return var2; // L: 456
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-340939132"
	)
	@Export("checkCrc")
	public boolean checkCrc() {
		this.offset -= 4; // L: 460
		int var1 = WorldMapRectangle.method334(this.array, 0, this.offset); // L: 461
		int var2 = this.readInt(); // L: 462
		return var2 == var1; // L: 463
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1712020733"
	)
	public void method5568(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 468
	} // L: 469

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "859798564"
	)
	public void method5569(int var1) {
		this.array[++this.offset - 1] = (byte)(0 - var1); // L: 472
	} // L: 473

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1493586164"
	)
	public void writeIntME(int var1) {
		this.array[++this.offset - 1] = (byte)(128 - var1); // L: 476
	} // L: 477

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-512224346"
	)
	public int method5571() {
		return this.array[++this.offset - 1] - 128 & 255; // L: 480
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1946834755"
	)
	public int method5572() {
		return 0 - this.array[++this.offset - 1] & 255; // L: 484
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-50"
	)
	public int method5573() {
		return 128 - this.array[++this.offset - 1] & 255; // L: 488
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-498797750"
	)
	public byte method5645() {
		return (byte)(this.array[++this.offset - 1] - 128); // L: 492
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "4"
	)
	public byte method5661() {
		return (byte)(0 - this.array[++this.offset - 1]); // L: 496
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "1416440254"
	)
	public byte method5665() {
		return (byte)(128 - this.array[++this.offset - 1]); // L: 500
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "505043972"
	)
	public void method5739(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 504
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 505
	} // L: 506

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-17430"
	)
	public void method5578(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 509
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 510
	} // L: 511

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1133202553"
	)
	public void writeShortLE(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 514
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 515
	} // L: 516

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1856185425"
	)
	public int method5580() {
		this.offset += 2; // L: 519
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 520
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1597569596"
	)
	public int method5539() {
		this.offset += 2; // L: 524
		return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 525
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "468907616"
	)
	public int method5582() {
		this.offset += 2; // L: 529
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 530
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "12"
	)
	public int method5583() {
		this.offset += 2; // L: 534
		int var1 = (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 535
		if (var1 > 32767) { // L: 536
			var1 -= 65536;
		}

		return var1; // L: 537
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "581527575"
	)
	public int method5584() {
		this.offset += 2; // L: 541
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 542
		if (var1 > 32767) { // L: 543
			var1 -= 65536;
		}

		return var1; // L: 544
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1773890421"
	)
	public void method5585(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 548
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 549
		this.array[++this.offset - 1] = (byte)var1; // L: 550
	} // L: 551

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1643414296"
	)
	public int method5586() {
		this.offset += 3; // L: 554
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 2] & 255); // L: 555
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-3"
	)
	public void method5587(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 559
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 560
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 561
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 562
	} // L: 563

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	public void method5588(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 566
		this.array[++this.offset - 1] = (byte)var1; // L: 567
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 568
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 569
	} // L: 570

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "570132050"
	)
	public void method5718(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 573
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 574
		this.array[++this.offset - 1] = (byte)var1; // L: 575
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 576
	} // L: 577

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-380994417"
	)
	public int method5643() {
		this.offset += 4; // L: 580
		return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24); // L: 581
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "4556"
	)
	public int method5591() {
		this.offset += 4; // L: 585
		return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16); // L: 586
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-554811296"
	)
	public int method5592() {
		this.offset += 4; // L: 590
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24); // L: 591
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "15"
	)
	public void method5593(byte[] var1, int var2, int var3) {
		for (int var4 = var3 + var2 - 1; var4 >= var2; --var4) { // L: 595
			var1[var4] = this.array[++this.offset - 1];
		}

	} // L: 596

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "-110"
	)
	public void method5733(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = (byte)(this.array[++this.offset - 1] - 128); // L: 599
		}

	} // L: 600
}
