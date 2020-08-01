import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kn")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("u")
	@Export("crc32Table")
	static int[] crc32Table;
	@ObfuscatedName("z")
	@Export("crc64Table")
	static long[] crc64Table;
	@ObfuscatedName("g")
	@Export("array")
	public byte[] array;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1437110173
	)
	@Export("offset")
	public int offset;

	static {
		crc32Table = new int[256];

		int var2;
		for (int var1 = 0; var1 < 256; ++var1) {
			int var0 = var1;

			for (var2 = 0; var2 < 8; ++var2) {
				if ((var0 & 1) == 1) {
					var0 = var0 >>> 1 ^ -306674912;
				} else {
					var0 >>>= 1;
				}
			}

			crc32Table[var1] = var0;
		}

		crc64Table = new long[256];

		for (var2 = 0; var2 < 256; ++var2) {
			long var4 = (long)var2;

			for (int var3 = 0; var3 < 8; ++var3) {
				if ((var4 & 1L) == 1L) {
					var4 = var4 >>> 1 ^ -3932672073523589310L;
				} else {
					var4 >>>= 1;
				}
			}

			crc64Table[var2] = var4;
		}

	}

	public Buffer(int var1) {
		this.array = WorldMapIcon_0.ByteArrayPool_getArray(var1);
		this.offset = 0;
	}

	public Buffer(byte[] var1) {
		this.array = var1;
		this.offset = 0;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1332846958"
	)
	@Export("releaseArray")
	public void releaseArray() {
		if (this.array != null) {
			User.ByteArrayPool_release(this.array);
		}

		this.array = null;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-238244279"
	)
	@Export("writeByte")
	public void writeByte(int var1) {
		this.array[++this.offset - 1] = (byte)var1;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2062616020"
	)
	@Export("writeShort")
	public void writeShort(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)var1;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1322343150"
	)
	@Export("writeMedium")
	public void writeMedium(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16);
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)var1;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1526300467"
	)
	@Export("writeInt")
	public void writeInt(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 24);
		this.array[++this.offset - 1] = (byte)(var1 >> 16);
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)var1;
	}

	@ObfuscatedName("bd")
	@Export("writeLongMedium")
	public void writeLongMedium(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8));
		this.array[++this.offset - 1] = (byte)((int)var1);
	}

	@ObfuscatedName("bb")
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

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1754555155"
	)
	@Export("writeBoolean")
	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0);
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "914637380"
	)
	@Export("writeStringCp1252NullTerminated")
	public void writeStringCp1252NullTerminated(String var1) {
		int var2 = var1.indexOf(0);
		if (var2 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.offset += class90.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset);
			this.array[++this.offset - 1] = 0;
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "2130981128"
	)
	@Export("writeStringCp1252NullCircumfixed")
	public void writeStringCp1252NullCircumfixed(String var1) {
		int var2 = var1.indexOf(0);
		if (var2 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.array[++this.offset - 1] = 0;
			this.offset += class90.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset);
			this.array[++this.offset - 1] = 0;
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)V",
		garbageValue = "1273602380"
	)
	@Export("writeCESU8")
	public void writeCESU8(CharSequence var1) {
		int var3 = var1.length();
		int var4 = 0;

		int var5;
		for (var5 = 0; var5 < var3; ++var5) {
			char var6 = var1.charAt(var5);
			if (var6 <= 127) {
				++var4;
			} else if (var6 <= 2047) {
				var4 += 2;
			} else {
				var4 += 3;
			}
		}

		this.array[++this.offset - 1] = 0;
		this.writeVarInt(var4);
		var4 = this.offset * 192844107;
		byte[] var12 = this.array;
		int var7 = this.offset;
		int var8 = var1.length();
		int var9 = var7;

		for (int var10 = 0; var10 < var8; ++var10) {
			char var11 = var1.charAt(var10);
			if (var11 <= 127) {
				var12[var9++] = (byte)var11;
			} else if (var11 <= 2047) {
				var12[var9++] = (byte)(192 | var11 >> 6);
				var12[var9++] = (byte)(128 | var11 & '?');
			} else {
				var12[var9++] = (byte)(224 | var11 >> '\f');
				var12[var9++] = (byte)(128 | var11 >> 6 & 63);
				var12[var9++] = (byte)(128 | var11 & '?');
			}
		}

		var5 = var9 - var7;
		this.offset = (var5 * 192844107 + var4) * -1437110173;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "96"
	)
	@Export("writeBytes")
	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			this.array[++this.offset - 1] = var1[var4];
		}

	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Lkn;I)V",
		garbageValue = "-914578816"
	)
	public void method5711(Buffer var1) {
		this.writeBytes(var1.array, 0, var1.offset);
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1697969107"
	)
	@Export("writeLengthInt")
	public void writeLengthInt(int var1) {
		if (var1 < 0) {
			throw new IllegalArgumentException();
		} else {
			this.array[this.offset - var1 - 4] = (byte)(var1 >> 24);
			this.array[this.offset - var1 - 3] = (byte)(var1 >> 16);
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8);
			this.array[this.offset - var1 - 1] = (byte)var1;
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-510969382"
	)
	@Export("writeLengthShort")
	public void writeLengthShort(int var1) {
		if (var1 >= 0 && var1 <= 65535) {
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8);
			this.array[this.offset - var1 - 1] = (byte)var1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-767264169"
	)
	@Export("writeLengthByte")
	public void writeLengthByte(int var1) {
		if (var1 >= 0 && var1 <= 255) {
			this.array[this.offset - var1 - 1] = (byte)var1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "416798651"
	)
	@Export("writeSmartByteShort")
	public void writeSmartByteShort(int var1) {
		if (var1 >= 0 && var1 < 128) {
			this.writeByte(var1);
		} else if (var1 >= 0 && var1 < 32768) {
			this.writeShort(var1 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "18"
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

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "124"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() {
		return this.array[++this.offset - 1] & 255;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "81"
	)
	@Export("readByte")
	public byte readByte() {
		return this.array[++this.offset - 1];
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "471084162"
	)
	@Export("readUnsignedShort")
	public int readUnsignedShort() {
		this.offset += 2;
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8);
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "87414619"
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

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1982311791"
	)
	@Export("readMedium")
	public int readMedium() {
		this.offset += 3;
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8);
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "94863796"
	)
	@Export("readInt")
	public int readInt() {
		this.offset += 4;
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24);
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-497792504"
	)
	@Export("readLong")
	public long readLong() {
		long var1 = (long)this.readInt() & 4294967295L;
		long var3 = (long)this.readInt() & 4294967295L;
		return var3 + (var1 << 32);
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "364318278"
	)
	@Export("readBoolean")
	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1;
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1669124168"
	)
	@Export("readStringCp1252NullTerminatedOrNull")
	public String readStringCp1252NullTerminatedOrNull() {
		if (this.array[this.offset] == 0) {
			++this.offset;
			return null;
		} else {
			return this.readStringCp1252NullTerminated();
		}
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "60"
	)
	@Export("readStringCp1252NullTerminated")
	public String readStringCp1252NullTerminated() {
		int var1 = this.offset;

		while (this.array[++this.offset - 1] != 0) {
		}

		int var2 = this.offset - var1 - 1;
		return var2 == 0 ? "" : MouseRecorder.decodeStringCp1252(this.array, var1, var2);
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-10"
	)
	@Export("readStringCp1252NullCircumfixed")
	public String readStringCp1252NullCircumfixed() {
		byte var1 = this.array[++this.offset - 1];
		if (var1 != 0) {
			throw new IllegalStateException("");
		} else {
			int var2 = this.offset;

			while (this.array[++this.offset - 1] != 0) {
			}

			int var3 = this.offset - var2 - 1;
			return var3 == 0 ? "" : MouseRecorder.decodeStringCp1252(this.array, var2, var3);
		}
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1123161230"
	)
	@Export("readCESU8")
	public String readCESU8() {
		byte var1 = this.array[++this.offset - 1];
		if (var1 != 0) {
			throw new IllegalStateException("");
		} else {
			int var2 = this.readVarInt();
			if (var2 + this.offset > this.array.length) {
				throw new IllegalStateException("");
			} else {
				String var3 = class4.method48(this.array, this.offset, var2);
				this.offset += var2;
				return var3;
			}
		}
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "2094233778"
	)
	@Export("readBytes")
	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = this.array[++this.offset - 1];
		}

	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1710018513"
	)
	@Export("readShortSmart")
	public int readShortSmart() {
		int var1 = this.array[this.offset] & 255;
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152;
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-96"
	)
	@Export("readUShortSmart")
	public int readUShortSmart() {
		int var1 = this.array[this.offset] & 255;
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768;
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "715402244"
	)
	public int method5732() {
		int var1 = 0;

		int var2;
		for (var2 = this.readUShortSmart(); var2 == 32767; var2 = this.readUShortSmart()) {
			var1 += 32767;
		}

		var1 += var2;
		return var1;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "81140995"
	)
	public int method5733() {
		return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort();
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "11"
	)
	public int method5843() {
		if (this.array[this.offset] < 0) {
			return this.readInt() & Integer.MAX_VALUE;
		} else {
			int var1 = this.readUnsignedShort();
			return var1 == 32767 ? -1 : var1;
		}
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "841550272"
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

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "-1857698855"
	)
	@Export("xteaEncryptAll")
	public void xteaEncryptAll(int[] var1) {
		int var2 = this.offset / 8;
		this.offset = 0;

		for (int var3 = 0; var3 < var2; ++var3) {
			int var4 = this.readInt();
			int var5 = this.readInt();
			int var6 = 0;
			int var7 = -1640531527;

			for (int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) {
				var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3];
				var6 += var7;
			}

			this.offset -= 8;
			this.writeInt(var4);
			this.writeInt(var5);
		}

	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "-1432585027"
	)
	@Export("xteaDecryptAll")
	public void xteaDecryptAll(int[] var1) {
		int var2 = this.offset / 8;
		this.offset = 0;

		for (int var3 = 0; var3 < var2; ++var3) {
			int var4 = this.readInt();
			int var5 = this.readInt();
			int var6 = -957401312;
			int var7 = -1640531527;

			for (int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]) {
				var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6;
				var6 -= var7;
			}

			this.offset -= 8;
			this.writeInt(var4);
			this.writeInt(var5);
		}

	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "-230257638"
	)
	@Export("xteaEncrypt")
	public void xteaEncrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset;
		this.offset = var2;
		int var5 = (var3 - var2) / 8;

		for (int var6 = 0; var6 < var5; ++var6) {
			int var7 = this.readInt();
			int var8 = this.readInt();
			int var9 = 0;
			int var10 = -1640531527;

			for (int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) {
				var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3];
				var9 += var10;
			}

			this.offset -= 8;
			this.writeInt(var7);
			this.writeInt(var8);
		}

		this.offset = var4;
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "1537225216"
	)
	@Export("xteaDecrypt")
	public void xteaDecrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset;
		this.offset = var2;
		int var5 = (var3 - var2) / 8;

		for (int var6 = 0; var6 < var5; ++var6) {
			int var7 = this.readInt();
			int var8 = this.readInt();
			int var9 = -957401312;
			int var10 = -1640531527;

			for (int var11 = 32; var11-- > 0; var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]) {
				var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9;
				var9 -= var10;
			}

			this.offset -= 8;
			this.writeInt(var7);
			this.writeInt(var8);
		}

		this.offset = var4;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V",
		garbageValue = "-859977936"
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

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-693896153"
	)
	@Export("writeCrc")
	public int writeCrc(int var1) {
		int var2 = Actor.method1822(this.array, var1, this.offset);
		this.writeInt(var2);
		return var2;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1948165259"
	)
	@Export("checkCrc")
	public boolean checkCrc() {
		this.offset -= 4;
		int var1 = Actor.method1822(this.array, 0, this.offset);
		int var2 = this.readInt();
		return var2 == var1;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2052645276"
	)
	@Export("writeIntME")
	public void writeIntME(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128);
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	public void method5744(int var1) {
		this.array[++this.offset - 1] = (byte)(0 - var1);
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-394267159"
	)
	public void method5837(int var1) {
		this.array[++this.offset - 1] = (byte)(128 - var1);
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "851416829"
	)
	public int method5746() {
		return this.array[++this.offset - 1] - 128 & 255;
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2135245803"
	)
	public int method5936() {
		return 0 - this.array[++this.offset - 1] & 255;
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1231018339"
	)
	public int method5748() {
		return 128 - this.array[++this.offset - 1] & 255;
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-209851904"
	)
	public byte method5730() {
		return (byte)(this.array[++this.offset - 1] - 128);
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "1146670320"
	)
	public byte method5750() {
		return (byte)(0 - this.array[++this.offset - 1]);
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-658631883"
	)
	public byte method5751() {
		return (byte)(128 - this.array[++this.offset - 1]);
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "118"
	)
	public void method5752(int var1) {
		this.array[++this.offset - 1] = (byte)var1;
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-327298658"
	)
	public void method5753(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)(var1 + 128);
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "137731710"
	)
	public void method5898(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128);
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1619364591"
	)
	public int method5755() {
		this.offset += 2;
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255);
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-31"
	)
	public int method5867() {
		this.offset += 2;
		return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8);
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "713390854"
	)
	public int method5757() {
		this.offset += 2;
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255);
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1572434954"
	)
	public int method5758() {
		this.offset += 2;
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "89596822"
	)
	public int method5759() {
		this.offset += 2;
		int var1 = (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "95"
	)
	public void method5798(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)(var1 >> 16);
		this.array[++this.offset - 1] = (byte)var1;
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	public int method5761() {
		this.offset += 3;
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16);
	}

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-68115848"
	)
	public void method5762(int var1) {
		this.array[++this.offset - 1] = (byte)var1;
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)(var1 >> 16);
		this.array[++this.offset - 1] = (byte)(var1 >> 24);
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-95"
	)
	@Export("writeShortLE")
	public void writeShortLE(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)var1;
		this.array[++this.offset - 1] = (byte)(var1 >> 24);
		this.array[++this.offset - 1] = (byte)(var1 >> 16);
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-18106"
	)
	public void method5764(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16);
		this.array[++this.offset - 1] = (byte)(var1 >> 24);
		this.array[++this.offset - 1] = (byte)var1;
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1451471311"
	)
	public int method5765() {
		this.offset += 4;
		return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24);
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-684888758"
	)
	public int method5766() {
		this.offset += 4;
		return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16);
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2146396815"
	)
	public int method5767() {
		this.offset += 4;
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24);
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-2049590377"
	)
	public void method5821(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = (byte)(this.array[++this.offset - 1] - 128);
		}

	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-801005893"
	)
	static void method5950() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) {
			int var1 = var0.group;
			if (UserComparator4.loadInterface(var1)) {
				boolean var2 = true;
				Widget[] var3 = Widget.Widget_interfaceComponents[var1];

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) {
					if (var3[var4] != null) {
						var2 = var3[var4].isIf3;
						break;
					}
				}

				if (!var2) {
					var4 = (int)var0.key;
					Widget var5 = WorldMapSprite.getWidget(var4);
					if (var5 != null) {
						class234.invalidateWidget(var5);
					}
				}
			}
		}

	}
}
