import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
@Implements("VorbisSample")
public class VorbisSample extends Node {
	@ObfuscatedName("n")
	@Export("VorbisSample_bytes")
	static byte[] VorbisSample_bytes;
	@ObfuscatedName("u")
	@Export("VorbisSample_byteOffset")
	static int VorbisSample_byteOffset;
	@ObfuscatedName("a")
	@Export("VorbisSample_bitOffset")
	static int VorbisSample_bitOffset;
	@ObfuscatedName("z")
	@Export("VorbisSample_blockSize0")
	static int VorbisSample_blockSize0;
	@ObfuscatedName("w")
	@Export("VorbisSample_blockSize1")
	static int VorbisSample_blockSize1;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "[Ldl;"
	)
	@Export("VorbisSample_codebooks")
	static VorbisCodebook[] VorbisSample_codebooks;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "[Ldc;"
	)
	@Export("VorbisSample_floors")
	static VorbisFloor[] VorbisSample_floors;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "[Lde;"
	)
	@Export("VorbisSample_residues")
	static VorbisResidue[] VorbisSample_residues;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "[Ldz;"
	)
	@Export("VorbisSample_mappings")
	static VorbisMapping[] VorbisSample_mappings;
	@ObfuscatedName("r")
	@Export("VorbisSample_blockFlags")
	static boolean[] VorbisSample_blockFlags;
	@ObfuscatedName("s")
	@Export("VorbisSample_mapping")
	static int[] VorbisSample_mapping;
	@ObfuscatedName("v")
	static boolean field1416;
	@ObfuscatedName("x")
	static float[] field1407;
	@ObfuscatedName("b")
	static float[] field1408;
	@ObfuscatedName("i")
	static float[] field1414;
	@ObfuscatedName("f")
	static float[] field1410;
	@ObfuscatedName("ah")
	static float[] field1411;
	@ObfuscatedName("ai")
	static float[] field1412;
	@ObfuscatedName("ao")
	static float[] field1413;
	@ObfuscatedName("ae")
	static int[] field1402;
	@ObfuscatedName("ax")
	static int[] field1415;
	@ObfuscatedName("m")
	byte[][] field1398;
	@ObfuscatedName("o")
	@Export("sampleRate")
	int sampleRate;
	@ObfuscatedName("q")
	@Export("sampleCount")
	int sampleCount;
	@ObfuscatedName("j")
	@Export("start")
	int start;
	@ObfuscatedName("p")
	@Export("end")
	int end;
	@ObfuscatedName("g")
	boolean field1409;
	@ObfuscatedName("d")
	float[] field1385;
	@ObfuscatedName("e")
	int field1392;
	@ObfuscatedName("l")
	int field1405;
	@ObfuscatedName("t")
	boolean field1406;
	@ObfuscatedName("ag")
	@Export("samples")
	byte[] samples;
	@ObfuscatedName("ab")
	int field1417;
	@ObfuscatedName("am")
	int field1388;

	static {
		field1416 = false;
	}

	VorbisSample(byte[] var1) {
		this.read(var1);
	}

	@ObfuscatedName("p")
	@Export("read")
	void read(byte[] var1) {
		Buffer var2 = new Buffer(var1);
		this.sampleRate = var2.readInt();
		this.sampleCount = var2.readInt();
		this.start = var2.readInt();
		this.end = var2.readInt();
		if (this.end < 0) {
			this.end = ~this.end;
			this.field1409 = true;
		}

		int var3 = var2.readInt();
		this.field1398 = new byte[var3][];

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = 0;

			int var6;
			do {
				var6 = var2.readUnsignedByte();
				var5 += var6;
			} while(var6 >= 255);

			byte[] var7 = new byte[var5];
			var2.readBytes(var7, 0, var5);
			this.field1398[var4] = var7;
		}

	}

	@ObfuscatedName("n")
	float[] method2499(int var1) {
		VorbisSample_setData(this.field1398[var1], 0);
		readBit();
		int var2 = readBits(WorldMapSection3.iLog(VorbisSample_mapping.length - 1));
		boolean var3 = VorbisSample_blockFlags[var2];
		int var4 = var3 ? VorbisSample_blockSize1 : VorbisSample_blockSize0;
		boolean var5 = false;
		boolean var6 = false;
		if (var3) {
			var5 = readBit() != 0;
			var6 = readBit() != 0;
		}

		int var7 = var4 >> 1;
		int var8;
		int var9;
		int var10;
		if (var3 && !var5) {
			var8 = (var4 >> 2) - (VorbisSample_blockSize0 >> 2);
			var9 = (VorbisSample_blockSize0 >> 2) + (var4 >> 2);
			var10 = VorbisSample_blockSize0 >> 1;
		} else {
			var8 = 0;
			var9 = var7;
			var10 = var4 >> 1;
		}

		int var11;
		int var12;
		int var13;
		if (var3 && !var6) {
			var11 = var4 - (var4 >> 2) - (VorbisSample_blockSize0 >> 2);
			var12 = (VorbisSample_blockSize0 >> 2) + (var4 - (var4 >> 2));
			var13 = VorbisSample_blockSize0 >> 1;
		} else {
			var11 = var7;
			var12 = var4;
			var13 = var4 >> 1;
		}

		VorbisMapping var14 = VorbisSample_mappings[VorbisSample_mapping[var2]];
		int var16 = var14.mappingMux;
		int var17 = var14.submapFloor[var16];
		boolean var15 = !VorbisSample_floors[var17].readSubmapFloor();
		boolean var45 = var15;

		for (var17 = 0; var17 < var14.submaps; ++var17) {
			VorbisResidue var18 = VorbisSample_residues[var14.submapResidue[var17]];
			float[] var19 = field1407;
			var18.method2652(var19, var4 >> 1, var45);
		}

		int var40;
		if (!var15) {
			var17 = var14.mappingMux;
			var40 = var14.submapFloor[var17];
			VorbisSample_floors[var40].method2536(field1407, var4 >> 1);
		}

		int var41;
		if (var15) {
			for (var17 = var4 >> 1; var17 < var4; ++var17) {
				field1407[var17] = 0.0F;
			}
		} else {
			var17 = var4 >> 1;
			var40 = var4 >> 2;
			var41 = var4 >> 3;
			float[] var20 = field1407;

			int var21;
			for (var21 = 0; var21 < var17; ++var21) {
				var20[var21] *= 0.5F;
			}

			for (var21 = var17; var21 < var4; ++var21) {
				var20[var21] = -var20[var4 - var21 - 1];
			}

			float[] var44 = var3 ? field1411 : field1408;
			float[] var22 = var3 ? field1412 : field1414;
			float[] var23 = var3 ? field1413 : field1410;
			int[] var24 = var3 ? field1415 : field1402;

			int var25;
			float var26;
			float var27;
			float var28;
			float var29;
			for (var25 = 0; var25 < var40; ++var25) {
				var26 = var20[var25 * 4] - var20[var4 - var25 * 4 - 1];
				var27 = var20[var25 * 4 + 2] - var20[var4 - var25 * 4 - 3];
				var28 = var44[var25 * 2];
				var29 = var44[var25 * 2 + 1];
				var20[var4 - var25 * 4 - 1] = var26 * var28 - var27 * var29;
				var20[var4 - var25 * 4 - 3] = var26 * var29 + var27 * var28;
			}

			float var30;
			float var31;
			for (var25 = 0; var25 < var41; ++var25) {
				var26 = var20[var17 + var25 * 4 + 3];
				var27 = var20[var17 + var25 * 4 + 1];
				var28 = var20[var25 * 4 + 3];
				var29 = var20[var25 * 4 + 1];
				var20[var17 + var25 * 4 + 3] = var26 + var28;
				var20[var17 + var25 * 4 + 1] = var27 + var29;
				var30 = var44[var17 - 4 - var25 * 4];
				var31 = var44[var17 - 3 - var25 * 4];
				var20[var25 * 4 + 3] = (var26 - var28) * var30 - (var27 - var29) * var31;
				var20[var25 * 4 + 1] = (var27 - var29) * var30 + (var26 - var28) * var31;
			}

			var25 = WorldMapSection3.iLog(var4 - 1);

			int var47;
			int var48;
			int var49;
			int var50;
			for (var47 = 0; var47 < var25 - 3; ++var47) {
				var48 = var4 >> var47 + 2;
				var49 = 8 << var47;

				for (var50 = 0; var50 < 2 << var47; ++var50) {
					int var51 = var4 - var48 * var50 * 2;
					int var52 = var4 - var48 * (var50 * 2 + 1);

					for (int var32 = 0; var32 < var4 >> var47 + 4; ++var32) {
						int var33 = var32 * 4;
						float var34 = var20[var51 - 1 - var33];
						float var35 = var20[var51 - 3 - var33];
						float var36 = var20[var52 - 1 - var33];
						float var37 = var20[var52 - 3 - var33];
						var20[var51 - 1 - var33] = var34 + var36;
						var20[var51 - 3 - var33] = var35 + var37;
						float var38 = var44[var32 * var49];
						float var39 = var44[var32 * var49 + 1];
						var20[var52 - 1 - var33] = (var34 - var36) * var38 - (var35 - var37) * var39;
						var20[var52 - 3 - var33] = (var35 - var37) * var38 + (var34 - var36) * var39;
					}
				}
			}

			for (var47 = 1; var47 < var41 - 1; ++var47) {
				var48 = var24[var47];
				if (var47 < var48) {
					var49 = var47 * 8;
					var50 = var48 * 8;
					var30 = var20[var49 + 1];
					var20[var49 + 1] = var20[var50 + 1];
					var20[var50 + 1] = var30;
					var30 = var20[var49 + 3];
					var20[var49 + 3] = var20[var50 + 3];
					var20[var50 + 3] = var30;
					var30 = var20[var49 + 5];
					var20[var49 + 5] = var20[var50 + 5];
					var20[var50 + 5] = var30;
					var30 = var20[var49 + 7];
					var20[var49 + 7] = var20[var50 + 7];
					var20[var50 + 7] = var30;
				}
			}

			for (var47 = 0; var47 < var17; ++var47) {
				var20[var47] = var20[var47 * 2 + 1];
			}

			for (var47 = 0; var47 < var41; ++var47) {
				var20[var4 - 1 - var47 * 2] = var20[var47 * 4];
				var20[var4 - 2 - var47 * 2] = var20[var47 * 4 + 1];
				var20[var4 - var40 - 1 - var47 * 2] = var20[var47 * 4 + 2];
				var20[var4 - var40 - 2 - var47 * 2] = var20[var47 * 4 + 3];
			}

			for (var47 = 0; var47 < var41; ++var47) {
				var27 = var23[var47 * 2];
				var28 = var23[var47 * 2 + 1];
				var29 = var20[var17 + var47 * 2];
				var30 = var20[var17 + var47 * 2 + 1];
				var31 = var20[var4 - 2 - var47 * 2];
				float var53 = var20[var4 - 1 - var47 * 2];
				float var54 = var28 * (var29 - var31) + var27 * (var30 + var53);
				var20[var17 + var47 * 2] = (var29 + var31 + var54) * 0.5F;
				var20[var4 - 2 - var47 * 2] = (var29 + var31 - var54) * 0.5F;
				var54 = var28 * (var30 + var53) - var27 * (var29 - var31);
				var20[var17 + var47 * 2 + 1] = (var30 - var53 + var54) * 0.5F;
				var20[var4 - 1 - var47 * 2] = (-var30 + var53 + var54) * 0.5F;
			}

			for (var47 = 0; var47 < var40; ++var47) {
				var20[var47] = var20[var17 + var47 * 2] * var22[var47 * 2] + var20[var17 + var47 * 2 + 1] * var22[var47 * 2 + 1];
				var20[var17 - 1 - var47] = var20[var17 + var47 * 2] * var22[var47 * 2 + 1] - var20[var17 + var47 * 2 + 1] * var22[var47 * 2];
			}

			for (var47 = 0; var47 < var40; ++var47) {
				var20[var47 + (var4 - var40)] = -var20[var47];
			}

			for (var47 = 0; var47 < var40; ++var47) {
				var20[var47] = var20[var40 + var47];
			}

			for (var47 = 0; var47 < var40; ++var47) {
				var20[var40 + var47] = -var20[var40 - var47 - 1];
			}

			for (var47 = 0; var47 < var40; ++var47) {
				var20[var17 + var47] = var20[var4 - var47 - 1];
			}

			float[] var10000;
			for (var47 = var8; var47 < var9; ++var47) {
				var27 = (float)Math.sin(((double)(var47 - var8) + 0.5D) / (double)var10 * 0.5D * 3.141592653589793D);
				var10000 = field1407;
				var10000[var47] *= (float)Math.sin(1.5707963267948966D * (double)var27 * (double)var27);
			}

			for (var47 = var11; var47 < var12; ++var47) {
				var27 = (float)Math.sin(((double)(var47 - var11) + 0.5D) / (double)var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
				var10000 = field1407;
				var10000[var47] *= (float)Math.sin(1.5707963267948966D * (double)var27 * (double)var27);
			}
		}

		float[] var42 = null;
		if (this.field1392 > 0) {
			var40 = var4 + this.field1392 >> 2;
			var42 = new float[var40];
			int var43;
			if (!this.field1406) {
				for (var41 = 0; var41 < this.field1405; ++var41) {
					var43 = var41 + (this.field1392 >> 1);
					var42[var41] += this.field1385[var43];
				}
			}

			if (!var15) {
				for (var41 = var8; var41 < var4 >> 1; ++var41) {
					var43 = var42.length - (var4 >> 1) + var41;
					var42[var43] += field1407[var41];
				}
			}
		}

		float[] var46 = this.field1385;
		this.field1385 = field1407;
		field1407 = var46;
		this.field1392 = var4;
		this.field1405 = var12 - (var4 >> 1);
		this.field1406 = var15;
		return var42;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "([I)Ldp;"
	)
	@Export("toRawSound")
	RawSound toRawSound(int[] var1) {
		if (var1 != null && var1[0] <= 0) {
			return null;
		} else {
			if (this.samples == null) {
				this.field1392 = 0;
				this.field1385 = new float[VorbisSample_blockSize1];
				this.samples = new byte[this.sampleCount];
				this.field1417 = 0;
				this.field1388 = 0;
			}

			for (; this.field1388 < this.field1398.length; ++this.field1388) {
				if (var1 != null && var1[0] <= 0) {
					return null;
				}

				float[] var2 = this.method2499(this.field1388);
				if (var2 != null) {
					int var3 = this.field1417;
					int var4 = var2.length;
					if (var4 > this.sampleCount - var3) {
						var4 = this.sampleCount - var3;
					}

					for (int var5 = 0; var5 < var4; ++var5) {
						int var6 = (int)(128.0F + var2[var5] * 128.0F);
						if ((var6 & -256) != 0) {
							var6 = ~var6 >> 31;
						}

						this.samples[var3++] = (byte)(var6 - 128);
					}

					if (var1 != null) {
						var1[0] -= var3 - this.field1417;
					}

					this.field1417 = var3;
				}
			}

			this.field1385 = null;
			byte[] var7 = this.samples;
			this.samples = null;
			return new RawSound(this.sampleRate, var7, this.start, this.end, this.field1409);
		}
	}

	@ObfuscatedName("m")
	@Export("float32Unpack")
	static float float32Unpack(int var0) {
		int var1 = var0 & 2097151;
		int var2 = var0 & Integer.MIN_VALUE;
		int var3 = (var0 & 2145386496) >> 21;
		if (var2 != 0) {
			var1 = -var1;
		}

		return (float)((double)var1 * Math.pow(2.0D, (double)(var3 - 788)));
	}

	@ObfuscatedName("o")
	@Export("VorbisSample_setData")
	static void VorbisSample_setData(byte[] var0, int var1) {
		VorbisSample_bytes = var0;
		VorbisSample_byteOffset = var1;
		VorbisSample_bitOffset = 0;
	}

	@ObfuscatedName("q")
	@Export("readBit")
	static int readBit() {
		int var0 = VorbisSample_bytes[VorbisSample_byteOffset] >> VorbisSample_bitOffset & 1;
		++VorbisSample_bitOffset;
		VorbisSample_byteOffset += VorbisSample_bitOffset >> 3;
		VorbisSample_bitOffset &= 7;
		return var0;
	}

	@ObfuscatedName("j")
	@Export("readBits")
	static int readBits(int var0) {
		int var1 = 0;

		int var2;
		int var3;
		for (var2 = 0; var0 >= 8 - VorbisSample_bitOffset; var0 -= var3) {
			var3 = 8 - VorbisSample_bitOffset;
			int var4 = (1 << var3) - 1;
			var1 += (VorbisSample_bytes[VorbisSample_byteOffset] >> VorbisSample_bitOffset & var4) << var2;
			VorbisSample_bitOffset = 0;
			++VorbisSample_byteOffset;
			var2 += var3;
		}

		if (var0 > 0) {
			var3 = (1 << var0) - 1;
			var1 += (VorbisSample_bytes[VorbisSample_byteOffset] >> VorbisSample_bitOffset & var3) << var2;
			VorbisSample_bitOffset += var0;
		}

		return var1;
	}

	@ObfuscatedName("g")
	static void method2508(byte[] var0) {
		VorbisSample_setData(var0, 0);
		VorbisSample_blockSize0 = 1 << readBits(4);
		VorbisSample_blockSize1 = 1 << readBits(4);
		field1407 = new float[VorbisSample_blockSize1];

		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		for (var1 = 0; var1 < 2; ++var1) {
			var2 = var1 != 0 ? VorbisSample_blockSize1 : VorbisSample_blockSize0;
			var3 = var2 >> 1;
			var4 = var2 >> 2;
			var5 = var2 >> 3;
			float[] var6 = new float[var3];

			for (int var7 = 0; var7 < var4; ++var7) {
				var6[var7 * 2] = (float)Math.cos((double)(var7 * 4) * 3.141592653589793D / (double)var2);
				var6[var7 * 2 + 1] = -((float)Math.sin((double)(var7 * 4) * 3.141592653589793D / (double)var2));
			}

			float[] var12 = new float[var3];

			for (int var8 = 0; var8 < var4; ++var8) {
				var12[var8 * 2] = (float)Math.cos((double)(var8 * 2 + 1) * 3.141592653589793D / (double)(var2 * 2));
				var12[var8 * 2 + 1] = (float)Math.sin((double)(var8 * 2 + 1) * 3.141592653589793D / (double)(var2 * 2));
			}

			float[] var13 = new float[var4];

			for (int var9 = 0; var9 < var5; ++var9) {
				var13[var9 * 2] = (float)Math.cos((double)(var9 * 4 + 2) * 3.141592653589793D / (double)var2);
				var13[var9 * 2 + 1] = -((float)Math.sin((double)(var9 * 4 + 2) * 3.141592653589793D / (double)var2));
			}

			int[] var14 = new int[var5];
			int var10 = WorldMapSection3.iLog(var5 - 1);

			for (int var11 = 0; var11 < var5; ++var11) {
				var14[var11] = class8.method104(var11, var10);
			}

			if (var1 != 0) {
				field1411 = var6;
				field1412 = var12;
				field1413 = var13;
				field1415 = var14;
			} else {
				field1408 = var6;
				field1414 = var12;
				field1410 = var13;
				field1402 = var14;
			}
		}

		var1 = readBits(8) + 1;
		VorbisSample_codebooks = new VorbisCodebook[var1];

		for (var2 = 0; var2 < var1; ++var2) {
			VorbisSample_codebooks[var2] = new VorbisCodebook();
		}

		var2 = readBits(6) + 1;

		for (var3 = 0; var3 < var2; ++var3) {
			readBits(16);
		}

		var2 = readBits(6) + 1;
		VorbisSample_floors = new VorbisFloor[var2];

		for (var3 = 0; var3 < var2; ++var3) {
			VorbisSample_floors[var3] = new VorbisFloor();
		}

		var3 = readBits(6) + 1;
		VorbisSample_residues = new VorbisResidue[var3];

		for (var4 = 0; var4 < var3; ++var4) {
			VorbisSample_residues[var4] = new VorbisResidue();
		}

		var4 = readBits(6) + 1;
		VorbisSample_mappings = new VorbisMapping[var4];

		for (var5 = 0; var5 < var4; ++var5) {
			VorbisSample_mappings[var5] = new VorbisMapping();
		}

		var5 = readBits(6) + 1;
		VorbisSample_blockFlags = new boolean[var5];
		VorbisSample_mapping = new int[var5];

		for (int var15 = 0; var15 < var5; ++var15) {
			VorbisSample_blockFlags[var15] = readBit() != 0;
			readBits(16);
			readBits(16);
			VorbisSample_mapping[var15] = readBits(8);
		}

	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Lic;)Z"
	)
	static boolean method2500(AbstractArchive var0) {
		if (!field1416) {
			byte[] var1 = var0.takeFile(0, 0);
			if (var1 == null) {
				return false;
			}

			method2508(var1);
			field1416 = true;
		}

		return true;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(Lic;II)Ldi;"
	)
	@Export("readMusicSample")
	static VorbisSample readMusicSample(AbstractArchive var0, int var1, int var2) {
		if (!method2500(var0)) {
			var0.tryLoadFile(var1, var2);
			return null;
		} else {
			byte[] var3 = var0.takeFile(var1, var2);
			return var3 == null ? null : new VorbisSample(var3);
		}
	}
}
