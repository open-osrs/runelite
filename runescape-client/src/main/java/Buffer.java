import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gr")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("q")
	@Export("crc32Table")
	static int[] crc32Table;
	@ObfuscatedName("o")
	@Export("crc64Table")
	static long[] crc64Table;
	@ObfuscatedName("m")
	@Export("array")
	public byte[] array;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -271438207
	)
	@Export("offset")
	public int offset;

	public Buffer(int var1) {
		this.array = Canvas.method862(var1);
		this.offset = 0;
	}

	public Buffer(byte[] var1) {
		this.array = var1;
		this.offset = 0;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(S)V",
		garbageValue = "13572"
	)
	public void method36() {
		if (this.array != null) {
			VertexNormal.method2984(this.array);
		}

		this.array = null;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-654332799"
	)
	@Export("writeByte")
	public void writeByte(int value) {
		this.array[++this.offset - 1] = (byte)value;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "0"
	)
	@Export("writeShort")
	public void writeShort(int value) {
		this.array[++this.offset - 1] = (byte)(value >> 8);
		this.array[++this.offset - 1] = (byte)value;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "-26"
	)
	@Export("writeMedium")
	public void writeMedium(int value) {
		this.array[++this.offset - 1] = (byte)(value >> 16);
		this.array[++this.offset - 1] = (byte)(value >> 8);
		this.array[++this.offset - 1] = (byte)value;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-106996411"
	)
	@Export("writeInt")
	public void writeInt(int value) {
		this.array[++this.offset - 1] = (byte)(value >> 24);
		this.array[++this.offset - 1] = (byte)(value >> 16);
		this.array[++this.offset - 1] = (byte)(value >> 8);
		this.array[++this.offset - 1] = (byte)value;
	}

	@ObfuscatedName("g")
	@Export("writeLongMedium")
	public void writeLongMedium(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8));
		this.array[++this.offset - 1] = (byte)((int)var1);
	}

	@ObfuscatedName("l")
	@Export("writeLong")
	public void writeLong(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 56));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 48));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8));
		this.array[++this.offset - 1] = (byte)((int)var1);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(ZB)V",
		garbageValue = "-125"
	)
	@Export("writeBoolean")
	public void writeBoolean(boolean value) {
		this.writeByte(value ? 1 : 0);
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;B)V",
		garbageValue = "-9"
	)
	@Export("writeStringCp1252NullTerminated")
	public void writeStringCp1252NullTerminated(String string) {
		int var2 = string.indexOf(0);
		if (var2 >= 0) {
			throw new IllegalArgumentException("");
		}
		this.offset += SoundCache.encodeStringCp1252(string, 0, string.length(), this.array, this.offset);
		this.array[++this.offset - 1] = 0;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;S)V",
		garbageValue = "22356"
	)
	@Export("writeStringCp1252NullCircumfixed")
	public void writeStringCp1252NullCircumfixed(String string) {
		int var2 = string.indexOf(0);
		if (var2 >= 0) {
			throw new IllegalArgumentException("");
		}
		this.array[++this.offset - 1] = 0;
		this.offset += SoundCache.encodeStringCp1252(string, 0, string.length(), this.array, this.offset);
		this.array[++this.offset - 1] = 0;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/CharSequence;B)V",
		garbageValue = "58"
	)
	@Export("writeCESU8")
	public void writeCESU8(CharSequence var1) {
		int var2 = var1.length();
		int var3 = 0;

		for (int var4 = 0; var4 < var2; ++var4) {
			char var5 = var1.charAt(var4);
			if (var5 <= 127) {
				++var3;
			} else if (var5 <= 2047) {
				var3 += 2;
			} else {
				var3 += 3;
			}
		}

		this.array[++this.offset - 1] = 0;
		this.writeVarInt(var3);
		this.offset += class16.method190(this.array, this.offset, var1);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "([BIII)V",
		garbageValue = "-1915344405"
	)
	@Export("writeBytes")
	public void writeBytes(byte[] bytes, int startIdx, int endIdx) {
		for (int var4 = startIdx; var4 < endIdx + startIdx; ++var4) {
			this.array[++this.offset - 1] = bytes[var4];
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-225163682"
	)
	@Export("writeLengthInt")
	public void writeLengthInt(int var1) {
		this.array[this.offset - var1 - 4] = (byte)(var1 >> 24);
		this.array[this.offset - var1 - 3] = (byte)(var1 >> 16);
		this.array[this.offset - var1 - 2] = (byte)(var1 >> 8);
		this.array[this.offset - var1 - 1] = (byte)var1;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-1298210761"
	)
	@Export("writeLengthShort")
	public void writeLengthShort(int var1) {
		this.array[this.offset - var1 - 2] = (byte)(var1 >> 8);
		this.array[this.offset - var1 - 1] = (byte)var1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-1839722163"
	)
	@Export("writeLengthByte")
	public void writeLengthByte(int var1) {
		this.array[this.offset - var1 - 1] = (byte)var1;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "1324532803"
	)
	@Export("writeSmartByteShort")
	public void writeSmartByteShort(int value) {
		if (value >= 0 && value < 128) {
			this.writeByte(value);
		} else {
			if (value < 0 || value >= 32768) {
				throw new IllegalArgumentException();
			}

			this.writeShort(value + 32768);
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "820873705"
	)
	@Export("writeVarInt")
	public void writeVarInt(int var1) {
		if ((var1 & -128) != 0) {
			if ((var1 & -16384) != 0) {
				if ((var1 & -2097152) != 0) {
					if ((var1 & -268435456) != 0) {
						this.writeByte(var1 >>> 28 | 128);
					}

					this.writeByte(var1 >>> 21 | 128);
				}

				this.writeByte(var1 >>> 14 | 128);
			}

			this.writeByte(var1 >>> 7 | 128);
		}

		this.writeByte(var1 & 127);
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "82"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() {
		return this.array[++this.offset - 1] & 255;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "(I)B",
		garbageValue = "-1627696222"
	)
	@Export("readByte")
	public byte readByte() {
		return this.array[++this.offset - 1];
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "-86"
	)
	@Export("readUnsignedShort")
	public int readUnsignedShort() {
		this.offset += 2;
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "1"
	)
	@Export("readShort")
	public int readShort() {
		this.offset += 2;
		int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1080768729"
	)
	@Export("readMedium")
	public int readMedium() {
		this.offset += 3;
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1338012999"
	)
	@Export("readInt")
	public int readInt() {
		this.offset += 4;
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		signature = "(I)J",
		garbageValue = "-2077445946"
	)
	@Export("readLong")
	public long readLong() {
		long var1 = (long)this.readInt() & 4294967295L;
		long var3 = (long)this.readInt() & 4294967295L;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "-2145047746"
	)
	@Export("readBoolean")
	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		signature = "(I)Ljava/lang/String;",
		garbageValue = "377528415"
	)
	@Export("readStringCp1252NullTerminatedOrNull")
	public String readStringCp1252NullTerminatedOrNull() {
		if (this.array[this.offset] == 0) {
			++this.offset;
			return null;
		}
		return this.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		signature = "(I)Ljava/lang/String;",
		garbageValue = "-1079610633"
	)
	@Export("readStringCp1252NullTerminated")
	public String readStringCp1252NullTerminated() {
		int var1 = this.offset;

		while (this.array[++this.offset - 1] != 0) {
		}

		int var2 = this.offset - var1 - 1;
		return var2 == 0 ? "" : InterfaceParent.decodeStringCp1252(this.array, var1, var2);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		signature = "(I)Ljava/lang/String;",
		garbageValue = "-1806000702"
	)
	@Export("readStringCp1252NullCircumfixed")
	public String readStringCp1252NullCircumfixed() {
		byte var1 = this.array[++this.offset - 1];
		if (var1 != 0) {
			throw new IllegalStateException("");
		}
		int var2 = this.offset;

		while (this.array[++this.offset - 1] != 0) {
		}

		int var3 = this.offset - var2 - 1;
		return var3 == 0 ? "" : InterfaceParent.decodeStringCp1252(this.array, var2, var3);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		signature = "(B)Ljava/lang/String;",
		garbageValue = "-14"
	)
	@Export("readCESU8")
	public String readCESU8() {
		byte var1 = this.array[++this.offset - 1];
		if (var1 != 0) {
			throw new IllegalStateException("");
		}
		int var2 = this.readVarInt();
		if (var2 + this.offset > this.array.length) {
			throw new IllegalStateException("");
		}
		byte[] var3 = this.array;
		int var4 = this.offset;
		char[] var5 = new char[var2];
		int var6 = 0;
		int var7 = var4;

		int var8;
		for (int var9 = var4 + var2; var7 < var9; var5[var6++] = (char)var8) {
			int var10 = var3[var7++] & 255;
			if (var10 < 128) {
				if (var10 == 0) {
					var8 = 65533;
				} else {
					var8 = var10;
				}
			} else if (var10 < 192) {
				var8 = 65533;
			} else if (var10 < 224) {
				if (var7 < var9 && (var3[var7] & 192) == 128) {
					var8 = (var10 & 31) << 6 | var3[var7++] & 63;
					if (var8 < 128) {
						var8 = 65533;
					}
				} else {
					var8 = 65533;
				}
			} else if (var10 < 240) {
				if (var7 + 1 < var9 && (var3[var7] & 192) == 128 && (var3[var7 + 1] & 192) == 128) {
					var8 = (var10 & 15) << 12 | (var3[var7++] & 63) << 6 | var3[var7++] & 63;
					if (var8 < 2048) {
						var8 = 65533;
					}
				} else {
					var8 = 65533;
				}
			} else if (var10 < 248) {
				if (var7 + 2 < var9 && (var3[var7] & 192) == 128 && (var3[var7 + 1] & 192) == 128 && (var3[var7 + 2] & 192) == 128) {
					var8 = (var10 & 7) << 18 | (var3[var7++] & 63) << 12 | (var3[var7++] & 63) << 6 | var3[var7++] & 63;
					if (var8 >= 65536 && var8 <= 1114111) {
						var8 = 65533;
					} else {
						var8 = 65533;
					}
				} else {
					var8 = 65533;
				}
			} else {
				var8 = 65533;
			}
		}

		String var11 = new String(var5, 0, var6);
		this.offset += var2;
		return var11;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		signature = "([BIIB)V",
		garbageValue = "-122"
	)
	@Export("readBytes")
	public void readBytes(byte[] b, int off, int len) {
		for (int var4 = off; var4 < len + off; ++var4) {
			b[var4] = this.array[++this.offset - 1];
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "-24"
	)
	@Export("readShortSmart")
	public int readShortSmart() {
		int var1 = this.array[this.offset] & 255;
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "1370512869"
	)
	@Export("readUShortSmart")
	public int readUShortSmart() {
		int var1 = this.array[this.offset] & 255;
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "1177684230"
	)
	public int method49() {
		int var1 = 0;

		int var2;
		for (var2 = this.readUShortSmart(); var2 == 32767; var2 = this.readUShortSmart()) {
			var1 += 32767;
		}

		var1 += var2;
		return var1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "103"
	)
	public int method50() {
		return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1151173205"
	)
	public int method51() {
		if (this.array[this.offset] < 0) {
			return this.readInt() & Integer.MAX_VALUE;
		}
		int var1 = this.readUnsignedShort();
		return var1 == 32767 ? -1 : var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "984135559"
	)
	@Export("readVarInt")
	public int readVarInt() {
		byte var1 = this.array[++this.offset - 1];

		int var2;
		for (var2 = 0; var1 < 0; var1 = this.array[++this.offset - 1]) {
			var2 = (var2 | var1 & 127) << 7;
		}

		return var2 | var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		signature = "([IB)V",
		garbageValue = "36"
	)
	@Export("xteaEncryptAll")
	public void xteaEncryptAll(int[] xteaKey) {
		int var2 = this.offset / 8;
		this.offset = 0;

		for (int var3 = 0; var3 < var2; ++var3) {
			int var4 = this.readInt();
			int var5 = this.readInt();
			int var6 = 0;
			int var7 = -1640531527;

			for (int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ xteaKey[var6 >>> 11 & 3] + var6) {
				var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + xteaKey[var6 & 3];
				var6 += var7;
			}

			this.offset -= 8;
			this.writeInt(var4);
			this.writeInt(var5);
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		signature = "([II)V",
		garbageValue = "1682045100"
	)
	@Export("xteaDecryptAll")
	public void xteaDecryptAll(int[] xteaKey) {
		int var2 = this.offset / 8;
		this.offset = 0;

		for (int var3 = 0; var3 < var2; ++var3) {
			int var4 = this.readInt();
			int var5 = this.readInt();
			int var6 = -957401312;
			int var7 = -1640531527;

			for (int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + xteaKey[var6 & 3]) {
				var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ xteaKey[var6 >>> 11 & 3] + var6;
				var6 -= var7;
			}

			this.offset -= 8;
			this.writeInt(var4);
			this.writeInt(var5);
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		signature = "([IIII)V",
		garbageValue = "-1341435074"
	)
	@Export("xteaEncrypt")
	public void xteaEncrypt(int[] xteaKey, int start, int end) {
		int var4 = this.offset;
		this.offset = start;
		int var5 = (end - start) / 8;

		for (int var6 = 0; var6 < var5; ++var6) {
			int var7 = this.readInt();
			int var8 = this.readInt();
			int var9 = 0;
			int var10 = -1640531527;

			for (int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ xteaKey[var9 >>> 11 & 3] + var9) {
				var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + xteaKey[var9 & 3];
				var9 += var10;
			}

			this.offset -= 8;
			this.writeInt(var7);
			this.writeInt(var8);
		}

		this.offset = var4;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		signature = "([IIII)V",
		garbageValue = "307218624"
	)
	@Export("xteaDecrypt")
	public void xteaDecrypt(int[] xteaKey, int start, int end) {
		int var4 = this.offset;
		this.offset = start;
		int var5 = (end - start) / 8;

		for (int var6 = 0; var6 < var5; ++var6) {
			int var7 = this.readInt();
			int var8 = this.readInt();
			int var9 = -957401312;
			int var10 = -1640531527;

			for (int var11 = 32; var11-- > 0; var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + xteaKey[var9 & 3]) {
				var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ xteaKey[var9 >>> 11 & 3] + var9;
				var9 -= var10;
			}

			this.offset -= 8;
			this.writeInt(var7);
			this.writeInt(var8);
		}

		this.offset = var4;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		signature = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V",
		garbageValue = "-2119154784"
	)
	@Export("encryptRsa")
	public void encryptRsa(BigInteger var1, BigInteger var2) {
		int var3 = this.offset;
		this.offset = 0;
		byte[] var4 = new byte[var3];
		this.readBytes(var4, 0, var3);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(var1, var2);
		byte[] var7 = var6.toByteArray();
		this.offset = 0;
		this.writeShort(var7.length);
		this.writeBytes(var7, 0, var7.length);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		signature = "(II)I",
		garbageValue = "-484928770"
	)
	@Export("writeCrc")
	public int writeCrc(int var1) {
		byte[] var2 = this.array;
		int var3 = this.offset;
		int var4 = -1;

		for (int var5 = var1; var5 < var3; ++var5) {
			var4 = var4 >>> 8 ^ crc32Table[(var4 ^ var2[var5]) & 255];
		}

		var4 = ~var4;
		this.writeInt(var4);
		return var4;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "-11"
	)
	@Export("checkCrc")
	public boolean checkCrc() {
		this.offset -= 4;
		byte[] var1 = this.array;
		int var2 = this.offset;
		int var3 = -1;

		int var4;
		for (var4 = 0; var4 < var2; ++var4) {
			var3 = var3 >>> 8 ^ crc32Table[(var3 ^ var1[var4]) & 255];
		}

		var3 = ~var3;
		var4 = this.readInt();
		return var4 == var3;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "-47"
	)
	public void method55(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-1336494664"
	)
	public void method56(int var1) {
		this.array[++this.offset - 1] = (byte)(0 - var1);
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "21"
	)
	public void method57(int var1) {
		this.array[++this.offset - 1] = (byte)(128 - var1);
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-86972759"
	)
	public int method58() {
		return this.array[++this.offset - 1] - 128 & 255;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-840473648"
	)
	@Export("readUnsignedByteNegate")
	public int readUnsignedByteNegate() {
		return 0 - this.array[++this.offset - 1] & 255;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "359814653"
	)
	public int method59() {
		return 128 - this.array[++this.offset - 1] & 255;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		signature = "(I)B",
		garbageValue = "2130167320"
	)
	public byte method60() {
		return (byte)(this.array[++this.offset - 1] - 128);
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		signature = "(I)B",
		garbageValue = "1415936818"
	)
	public byte method61() {
		return (byte)(0 - this.array[++this.offset - 1]);
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		signature = "(I)B",
		garbageValue = "1496705333"
	)
	public byte method62() {
		return (byte)(128 - this.array[++this.offset - 1]);
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "51"
	)
	@Export("writeShortLE")
	public void writeShortLE(int value) {
		this.array[++this.offset - 1] = (byte)value;
		this.array[++this.offset - 1] = (byte)(value >> 8);
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "189694315"
	)
	public void method63(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)(var1 + 128);
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "-7"
	)
	public void method64(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128);
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "2147134369"
	)
	public int method65() {
		this.offset += 2;
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255);
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1489217204"
	)
	public int method66() {
		this.offset += 2;
		return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8);
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "-86"
	)
	public int method67() {
		this.offset += 2;
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255);
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "54"
	)
	public int method68() {
		this.offset += 2;
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "388487388"
	)
	public int method69() {
		this.offset += 2;
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-88751042"
	)
	public int method70() {
		this.offset += 3;
		return (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 1] & 255) << 16);
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "78"
	)
	@Export("writeIntLE")
	public void writeIntLE(int value) {
		this.array[++this.offset - 1] = (byte)value;
		this.array[++this.offset - 1] = (byte)(value >> 8);
		this.array[++this.offset - 1] = (byte)(value >> 16);
		this.array[++this.offset - 1] = (byte)(value >> 24);
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "80"
	)
	@Export("writeIntME")
	public void writeIntME(int value) {
		this.array[++this.offset - 1] = (byte)(value >> 8);
		this.array[++this.offset - 1] = (byte)value;
		this.array[++this.offset - 1] = (byte)(value >> 24);
		this.array[++this.offset - 1] = (byte)(value >> 16);
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "2115295559"
	)
	@Export("writeIntLE16")
	public void writeIntLE16(int value) {
		this.array[++this.offset - 1] = (byte)(value >> 16);
		this.array[++this.offset - 1] = (byte)(value >> 24);
		this.array[++this.offset - 1] = (byte)value;
		this.array[++this.offset - 1] = (byte)(value >> 8);
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1322860835"
	)
	public int method71() {
		this.offset += 4;
		return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24);
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1731171028"
	)
	public int method72() {
		this.offset += 4;
		return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16);
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "-126"
	)
	public int method73() {
		this.offset += 4;
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24);
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		signature = "([BIII)V",
		garbageValue = "1303287859"
	)
	public void method74(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = (byte)(this.array[++this.offset - 1] - 128);
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "1"
	)
	@Export("HealthBarDefinition_clearCached")
	public static void HealthBarDefinition_clearCached() {
		HealthBarDefinition.HealthBarDefinition_cached.clear();
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear();
	}

	static {
		crc32Table = new int[256];

		int var0;
		for (int var1 = 0; var1 < 256; ++var1) {
			int var2 = var1;

			for (var0 = 0; var0 < 8; ++var0) {
				if ((var2 & 1) == 1) {
					var2 = var2 >>> 1 ^ -306674912;
				} else {
					var2 >>>= 1;
				}
			}

			crc32Table[var1] = var2;
		}

		crc64Table = new long[256];

		for (var0 = 0; var0 < 256; ++var0) {
			long var4 = (long)var0;

			for (int var3 = 0; var3 < 8; ++var3) {
				if ((var4 & 1L) == 1L) {
					var4 = var4 >>> 1 ^ -3932672073523589310L;
				} else {
					var4 >>>= 1;
				}
			}

			crc64Table[var0] = var4;
		}

	}
}
