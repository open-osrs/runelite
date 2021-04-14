import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
@Implements("ModelData")
public class ModelData extends Renderable {
	@ObfuscatedName("ax")
	static int[] field1822;
	@ObfuscatedName("as")
	static int[] field1831;
	@ObfuscatedName("ad")
	static int field1832;
	@ObfuscatedName("af")
	@Export("ModelData_sine")
	static int[] ModelData_sine;
	@ObfuscatedName("ao")
	@Export("ModelData_cosine")
	static int[] ModelData_cosine;
	@ObfuscatedName("f")
	@Export("verticesCount")
	int verticesCount;
	@ObfuscatedName("o")
	@Export("verticesX")
	int[] verticesX;
	@ObfuscatedName("u")
	@Export("verticesY")
	int[] verticesY;
	@ObfuscatedName("p")
	@Export("verticesZ")
	int[] verticesZ;
	@ObfuscatedName("b")
	@Export("faceCount")
	int faceCount;
	@ObfuscatedName("e")
	@Export("indices1")
	int[] indices1;
	@ObfuscatedName("k")
	@Export("indices2")
	int[] indices2;
	@ObfuscatedName("g")
	@Export("indices3")
	int[] indices3;
	@ObfuscatedName("h")
	@Export("faceRenderTypes")
	byte[] faceRenderTypes;
	@ObfuscatedName("n")
	@Export("faceRenderPriorities")
	byte[] faceRenderPriorities;
	@ObfuscatedName("l")
	@Export("faceAlphas")
	byte[] faceAlphas;
	@ObfuscatedName("m")
	@Export("textureCoords")
	byte[] textureCoords;
	@ObfuscatedName("d")
	@Export("faceColors")
	short[] faceColors;
	@ObfuscatedName("c")
	@Export("faceTextures")
	short[] faceTextures;
	@ObfuscatedName("j")
	@Export("priority")
	byte priority;
	@ObfuscatedName("r")
	@Export("textureTriangleCount")
	int textureTriangleCount;
	@ObfuscatedName("q")
	@Export("textureRenderTypes")
	byte[] textureRenderTypes;
	@ObfuscatedName("t")
	@Export("texTriangleX")
	short[] texTriangleX;
	@ObfuscatedName("v")
	@Export("texTriangleY")
	short[] texTriangleY;
	@ObfuscatedName("x")
	@Export("texTriangleZ")
	short[] texTriangleZ;
	@ObfuscatedName("z")
	@Export("vertexSkins")
	int[] vertexSkins;
	@ObfuscatedName("i")
	@Export("faceSkins")
	int[] faceSkins;
	@ObfuscatedName("a")
	@Export("vertexLabels")
	int[][] vertexLabels;
	@ObfuscatedName("w")
	@Export("faceLabelsAlpha")
	int[][] faceLabelsAlpha;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "[Lfh;"
	)
	@Export("faceNormals")
	FaceNormal[] faceNormals;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "[Lge;"
	)
	@Export("vertexNormals")
	VertexNormal[] vertexNormals;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Lge;"
	)
	VertexNormal[] field1821;
	@ObfuscatedName("ay")
	@Export("ambient")
	public short ambient;
	@ObfuscatedName("am")
	@Export("contrast")
	public short contrast;
	@ObfuscatedName("ag")
	@Export("isBoundsCalculated")
	boolean isBoundsCalculated;
	@ObfuscatedName("aq")
	int field1819;
	@ObfuscatedName("at")
	int field1826;
	@ObfuscatedName("aj")
	int field1805;
	@ObfuscatedName("aw")
	int field1828;
	@ObfuscatedName("ap")
	int field1829;

	static {
		field1822 = new int[10000]; // L: 44
		field1831 = new int[10000]; // L: 45
		field1832 = 0; // L: 46
		ModelData_sine = Rasterizer3D.Rasterizer3D_sine; // L: 47
		ModelData_cosine = Rasterizer3D.Rasterizer3D_cosine; // L: 48
	}

	ModelData() {
		this.verticesCount = 0;
		this.faceCount = 0;
		this.priority = 0;
		this.isBoundsCalculated = false;
	} // L: 50

	@ObfuscatedSignature(
		descriptor = "([Lfs;I)V"
	)
	public ModelData(ModelData[] var1, int var2) {
		this.verticesCount = 0;
		this.faceCount = 0;
		this.priority = 0;
		this.isBoundsCalculated = false;
		boolean var3 = false; // L: 471
		boolean var4 = false; // L: 472
		boolean var5 = false; // L: 473
		boolean var6 = false; // L: 474
		boolean var7 = false; // L: 475
		boolean var8 = false; // L: 476
		this.verticesCount = 0; // L: 477
		this.faceCount = 0; // L: 478
		this.textureTriangleCount = 0; // L: 479
		this.priority = -1; // L: 480

		int var9;
		ModelData var10;
		for (var9 = 0; var9 < var2; ++var9) { // L: 481
			var10 = var1[var9]; // L: 482
			if (var10 != null) { // L: 483
				this.verticesCount += var10.verticesCount; // L: 484
				this.faceCount += var10.faceCount; // L: 485
				this.textureTriangleCount += var10.textureTriangleCount; // L: 486
				if (var10.faceRenderPriorities != null) { // L: 487
					var4 = true;
				} else {
					if (this.priority == -1) { // L: 489
						this.priority = var10.priority;
					}

					if (this.priority != var10.priority) { // L: 490
						var4 = true;
					}
				}

				var3 |= var10.faceRenderTypes != null; // L: 492
				var5 |= var10.faceAlphas != null; // L: 493
				var6 |= var10.faceSkins != null; // L: 494
				var7 |= var10.faceTextures != null; // L: 495
				var8 |= var10.textureCoords != null; // L: 496
			}
		}

		this.verticesX = new int[this.verticesCount]; // L: 499
		this.verticesY = new int[this.verticesCount]; // L: 500
		this.verticesZ = new int[this.verticesCount]; // L: 501
		this.vertexSkins = new int[this.verticesCount]; // L: 502
		this.indices1 = new int[this.faceCount]; // L: 503
		this.indices2 = new int[this.faceCount]; // L: 504
		this.indices3 = new int[this.faceCount]; // L: 505
		if (var3) { // L: 506
			this.faceRenderTypes = new byte[this.faceCount];
		}

		if (var4) { // L: 507
			this.faceRenderPriorities = new byte[this.faceCount];
		}

		if (var5) { // L: 508
			this.faceAlphas = new byte[this.faceCount];
		}

		if (var6) { // L: 509
			this.faceSkins = new int[this.faceCount];
		}

		if (var7) { // L: 510
			this.faceTextures = new short[this.faceCount];
		}

		if (var8) { // L: 511
			this.textureCoords = new byte[this.faceCount];
		}

		this.faceColors = new short[this.faceCount]; // L: 512
		if (this.textureTriangleCount > 0) { // L: 513
			this.textureRenderTypes = new byte[this.textureTriangleCount]; // L: 514
			this.texTriangleX = new short[this.textureTriangleCount]; // L: 515
			this.texTriangleY = new short[this.textureTriangleCount]; // L: 516
			this.texTriangleZ = new short[this.textureTriangleCount]; // L: 517
		}

		this.verticesCount = 0; // L: 519
		this.faceCount = 0; // L: 520
		this.textureTriangleCount = 0; // L: 521

		for (var9 = 0; var9 < var2; ++var9) { // L: 522
			var10 = var1[var9]; // L: 523
			if (var10 != null) { // L: 524
				int var11;
				for (var11 = 0; var11 < var10.faceCount; ++var11) { // L: 525
					if (var3 && var10.faceRenderTypes != null) { // L: 526 527
						this.faceRenderTypes[this.faceCount] = var10.faceRenderTypes[var11];
					}

					if (var4) { // L: 529
						if (var10.faceRenderPriorities != null) { // L: 530
							this.faceRenderPriorities[this.faceCount] = var10.faceRenderPriorities[var11];
						} else {
							this.faceRenderPriorities[this.faceCount] = var10.priority; // L: 531
						}
					}

					if (var5 && var10.faceAlphas != null) { // L: 533 534
						this.faceAlphas[this.faceCount] = var10.faceAlphas[var11];
					}

					if (var6 && var10.faceSkins != null) { // L: 536 537
						this.faceSkins[this.faceCount] = var10.faceSkins[var11];
					}

					if (var7) { // L: 539
						if (var10.faceTextures != null) { // L: 540
							this.faceTextures[this.faceCount] = var10.faceTextures[var11];
						} else {
							this.faceTextures[this.faceCount] = -1; // L: 541
						}
					}

					if (var8) { // L: 543
						if (var10.textureCoords != null && var10.textureCoords[var11] != -1) { // L: 544
							this.textureCoords[this.faceCount] = (byte)(this.textureTriangleCount + var10.textureCoords[var11]);
						} else {
							this.textureCoords[this.faceCount] = -1; // L: 545
						}
					}

					this.faceColors[this.faceCount] = var10.faceColors[var11]; // L: 547
					this.indices1[this.faceCount] = this.method3316(var10, var10.indices1[var11]); // L: 548
					this.indices2[this.faceCount] = this.method3316(var10, var10.indices2[var11]); // L: 549
					this.indices3[this.faceCount] = this.method3316(var10, var10.indices3[var11]); // L: 550
					++this.faceCount; // L: 551
				}

				for (var11 = 0; var11 < var10.textureTriangleCount; ++var11) { // L: 553
					byte var12 = this.textureRenderTypes[this.textureTriangleCount] = var10.textureRenderTypes[var11]; // L: 554
					if (var12 == 0) { // L: 555
						this.texTriangleX[this.textureTriangleCount] = (short)this.method3316(var10, var10.texTriangleX[var11]); // L: 556
						this.texTriangleY[this.textureTriangleCount] = (short)this.method3316(var10, var10.texTriangleY[var11]); // L: 557
						this.texTriangleZ[this.textureTriangleCount] = (short)this.method3316(var10, var10.texTriangleZ[var11]); // L: 558
					}

					++this.textureTriangleCount; // L: 560
				}
			}
		}

	} // L: 564

	ModelData(byte[] var1) {
		this.verticesCount = 0;
		this.faceCount = 0;
		this.priority = 0;
		this.isBoundsCalculated = false;
		if (var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) { // L: 59
			this.method3276(var1);
		} else {
			this.method3304(var1); // L: 60
		}

	} // L: 61

	@ObfuscatedSignature(
		descriptor = "(Lfs;ZZZZ)V",
		garbageValue = "1"
	)
	public ModelData(ModelData var1, boolean var2, boolean var3, boolean var4, boolean var5) {
		this.verticesCount = 0; // L: 9
		this.faceCount = 0; // L: 13
		this.priority = 0; // L: 23
		this.isBoundsCalculated = false; // L: 38
		this.verticesCount = var1.verticesCount; // L: 588
		this.faceCount = var1.faceCount; // L: 589
		this.textureTriangleCount = var1.textureTriangleCount; // L: 590
		int var6;
		if (var2) { // L: 591
			this.verticesX = var1.verticesX; // L: 592
			this.verticesY = var1.verticesY; // L: 593
			this.verticesZ = var1.verticesZ; // L: 594
		} else {
			this.verticesX = new int[this.verticesCount]; // L: 597
			this.verticesY = new int[this.verticesCount]; // L: 598
			this.verticesZ = new int[this.verticesCount]; // L: 599

			for (var6 = 0; var6 < this.verticesCount; ++var6) { // L: 600
				this.verticesX[var6] = var1.verticesX[var6]; // L: 601
				this.verticesY[var6] = var1.verticesY[var6]; // L: 602
				this.verticesZ[var6] = var1.verticesZ[var6]; // L: 603
			}
		}

		if (var3) { // L: 606
			this.faceColors = var1.faceColors;
		} else {
			this.faceColors = new short[this.faceCount]; // L: 608

			for (var6 = 0; var6 < this.faceCount; ++var6) { // L: 609
				this.faceColors[var6] = var1.faceColors[var6];
			}
		}

		if (!var4 && var1.faceTextures != null) { // L: 611
			this.faceTextures = new short[this.faceCount]; // L: 613

			for (var6 = 0; var6 < this.faceCount; ++var6) { // L: 614
				this.faceTextures[var6] = var1.faceTextures[var6];
			}
		} else {
			this.faceTextures = var1.faceTextures;
		}

		this.faceAlphas = var1.faceAlphas; // L: 616
		this.indices1 = var1.indices1; // L: 626
		this.indices2 = var1.indices2; // L: 627
		this.indices3 = var1.indices3; // L: 628
		this.faceRenderTypes = var1.faceRenderTypes; // L: 629
		this.faceRenderPriorities = var1.faceRenderPriorities; // L: 630
		this.textureCoords = var1.textureCoords; // L: 631
		this.priority = var1.priority; // L: 632
		this.textureRenderTypes = var1.textureRenderTypes; // L: 633
		this.texTriangleX = var1.texTriangleX; // L: 634
		this.texTriangleY = var1.texTriangleY; // L: 635
		this.texTriangleZ = var1.texTriangleZ; // L: 636
		this.vertexSkins = var1.vertexSkins; // L: 637
		this.faceSkins = var1.faceSkins; // L: 638
		this.vertexLabels = var1.vertexLabels; // L: 639
		this.faceLabelsAlpha = var1.faceLabelsAlpha; // L: 640
		this.vertexNormals = var1.vertexNormals; // L: 641
		this.faceNormals = var1.faceNormals; // L: 642
		this.field1821 = var1.field1821; // L: 643
		this.ambient = var1.ambient; // L: 644
		this.contrast = var1.contrast; // L: 645
	}

	@ObfuscatedName("u")
	void method3276(byte[] var1) {
		Buffer var2 = new Buffer(var1); // L: 64
		Buffer var3 = new Buffer(var1); // L: 65
		Buffer var4 = new Buffer(var1); // L: 66
		Buffer var5 = new Buffer(var1); // L: 67
		Buffer var6 = new Buffer(var1); // L: 68
		Buffer var7 = new Buffer(var1); // L: 69
		Buffer var8 = new Buffer(var1); // L: 70
		var2.offset = var1.length - 23; // L: 71
		int var9 = var2.readUnsignedShort(); // L: 72
		int var10 = var2.readUnsignedShort(); // L: 73
		int var11 = var2.readUnsignedByte(); // L: 74
		int var12 = var2.readUnsignedByte(); // L: 75
		int var13 = var2.readUnsignedByte(); // L: 76
		int var14 = var2.readUnsignedByte(); // L: 77
		int var15 = var2.readUnsignedByte(); // L: 78
		int var16 = var2.readUnsignedByte(); // L: 79
		int var17 = var2.readUnsignedByte(); // L: 80
		int var18 = var2.readUnsignedShort(); // L: 81
		int var19 = var2.readUnsignedShort(); // L: 82
		int var20 = var2.readUnsignedShort(); // L: 83
		int var21 = var2.readUnsignedShort(); // L: 84
		int var22 = var2.readUnsignedShort(); // L: 85
		int var23 = 0; // L: 86
		int var24 = 0; // L: 87
		int var25 = 0; // L: 88
		int var26;
		if (var11 > 0) { // L: 89
			this.textureRenderTypes = new byte[var11]; // L: 90
			var2.offset = 0; // L: 91

			for (var26 = 0; var26 < var11; ++var26) { // L: 92
				byte var27 = this.textureRenderTypes[var26] = var2.readByte(); // L: 93
				if (var27 == 0) { // L: 94
					++var23;
				}

				if (var27 >= 1 && var27 <= 3) { // L: 95
					++var24;
				}

				if (var27 == 2) { // L: 96
					++var25;
				}
			}
		}

		var26 = var11 + var9; // L: 101
		int var28 = var26; // L: 102
		if (var12 == 1) { // L: 103
			var26 += var10;
		}

		int var29 = var26; // L: 104
		var26 += var10; // L: 105
		int var30 = var26; // L: 106
		if (var13 == 255) { // L: 107
			var26 += var10;
		}

		int var31 = var26; // L: 108
		if (var15 == 1) { // L: 109
			var26 += var10;
		}

		int var32 = var26; // L: 110
		if (var17 == 1) { // L: 111
			var26 += var9;
		}

		int var33 = var26; // L: 112
		if (var14 == 1) { // L: 113
			var26 += var10;
		}

		int var34 = var26; // L: 114
		var26 += var21; // L: 115
		int var35 = var26; // L: 116
		if (var16 == 1) { // L: 117
			var26 += var10 * 2;
		}

		int var36 = var26; // L: 118
		var26 += var22; // L: 119
		int var37 = var26; // L: 120
		var26 += var10 * 2; // L: 121
		int var38 = var26; // L: 122
		var26 += var18; // L: 123
		int var39 = var26; // L: 124
		var26 += var19; // L: 125
		int var40 = var26; // L: 126
		var26 += var20; // L: 127
		int var41 = var26; // L: 128
		var26 += var23 * 6; // L: 129
		int var42 = var26; // L: 130
		var26 += var24 * 6; // L: 131
		int var43 = var26; // L: 132
		var26 += var24 * 6; // L: 133
		int var44 = var26; // L: 134
		var26 += var24 * 2; // L: 135
		int var45 = var26; // L: 136
		var26 += var24; // L: 137
		int var46 = var26; // L: 138
		var26 += var24 * 2 + var25 * 2; // L: 139
		this.verticesCount = var9; // L: 141
		this.faceCount = var10; // L: 142
		this.textureTriangleCount = var11; // L: 143
		this.verticesX = new int[var9]; // L: 144
		this.verticesY = new int[var9]; // L: 145
		this.verticesZ = new int[var9]; // L: 146
		this.indices1 = new int[var10]; // L: 147
		this.indices2 = new int[var10]; // L: 148
		this.indices3 = new int[var10]; // L: 149
		if (var17 == 1) { // L: 150
			this.vertexSkins = new int[var9];
		}

		if (var12 == 1) { // L: 151
			this.faceRenderTypes = new byte[var10];
		}

		if (var13 == 255) { // L: 152
			this.faceRenderPriorities = new byte[var10];
		} else {
			this.priority = (byte)var13; // L: 153
		}

		if (var14 == 1) { // L: 154
			this.faceAlphas = new byte[var10];
		}

		if (var15 == 1) { // L: 155
			this.faceSkins = new int[var10];
		}

		if (var16 == 1) { // L: 156
			this.faceTextures = new short[var10];
		}

		if (var16 == 1 && var11 > 0) { // L: 157
			this.textureCoords = new byte[var10];
		}

		this.faceColors = new short[var10]; // L: 158
		if (var11 > 0) { // L: 159
			this.texTriangleX = new short[var11]; // L: 160
			this.texTriangleY = new short[var11]; // L: 161
			this.texTriangleZ = new short[var11]; // L: 162
		}

		var2.offset = var11; // L: 164
		var3.offset = var38; // L: 165
		var4.offset = var39; // L: 166
		var5.offset = var40; // L: 167
		var6.offset = var32; // L: 168
		int var48 = 0; // L: 169
		int var49 = 0; // L: 170
		int var50 = 0; // L: 171

		int var51;
		int var52;
		int var53;
		int var54;
		int var55;
		for (var51 = 0; var51 < var9; ++var51) { // L: 172
			var52 = var2.readUnsignedByte(); // L: 173
			var53 = 0; // L: 174
			if ((var52 & 1) != 0) { // L: 175
				var53 = var3.readShortSmart();
			}

			var54 = 0; // L: 176
			if ((var52 & 2) != 0) { // L: 177
				var54 = var4.readShortSmart();
			}

			var55 = 0; // L: 178
			if ((var52 & 4) != 0) { // L: 179
				var55 = var5.readShortSmart();
			}

			this.verticesX[var51] = var48 + var53; // L: 180
			this.verticesY[var51] = var49 + var54; // L: 181
			this.verticesZ[var51] = var50 + var55; // L: 182
			var48 = this.verticesX[var51]; // L: 183
			var49 = this.verticesY[var51]; // L: 184
			var50 = this.verticesZ[var51]; // L: 185
			if (var17 == 1) { // L: 186
				this.vertexSkins[var51] = var6.readUnsignedByte();
			}
		}

		var2.offset = var37; // L: 188
		var3.offset = var28; // L: 189
		var4.offset = var30; // L: 190
		var5.offset = var33; // L: 191
		var6.offset = var31; // L: 192
		var7.offset = var35; // L: 193
		var8.offset = var36; // L: 194

		for (var51 = 0; var51 < var10; ++var51) { // L: 195
			this.faceColors[var51] = (short)var2.readUnsignedShort(); // L: 196
			if (var12 == 1) { // L: 197
				this.faceRenderTypes[var51] = var3.readByte();
			}

			if (var13 == 255) { // L: 198
				this.faceRenderPriorities[var51] = var4.readByte();
			}

			if (var14 == 1) { // L: 199
				this.faceAlphas[var51] = var5.readByte();
			}

			if (var15 == 1) { // L: 200
				this.faceSkins[var51] = var6.readUnsignedByte();
			}

			if (var16 == 1) { // L: 201
				this.faceTextures[var51] = (short)(var7.readUnsignedShort() - 1);
			}

			if (this.textureCoords != null && this.faceTextures[var51] != -1) { // L: 202
				this.textureCoords[var51] = (byte)(var8.readUnsignedByte() - 1);
			}
		}

		var2.offset = var34; // L: 204
		var3.offset = var29; // L: 205
		var51 = 0; // L: 206
		var52 = 0; // L: 207
		var53 = 0; // L: 208
		var54 = 0; // L: 209

		int var56;
		for (var55 = 0; var55 < var10; ++var55) { // L: 210
			var56 = var3.readUnsignedByte(); // L: 211
			if (var56 == 1) { // L: 212
				var51 = var2.readShortSmart() + var54; // L: 213
				var52 = var2.readShortSmart() + var51; // L: 215
				var53 = var2.readShortSmart() + var52; // L: 217
				var54 = var53; // L: 218
				this.indices1[var55] = var51; // L: 219
				this.indices2[var55] = var52; // L: 220
				this.indices3[var55] = var53; // L: 221
			}

			if (var56 == 2) { // L: 223
				var52 = var53; // L: 224
				var53 = var2.readShortSmart() + var54; // L: 225
				var54 = var53; // L: 226
				this.indices1[var55] = var51; // L: 227
				this.indices2[var55] = var52; // L: 228
				this.indices3[var55] = var53; // L: 229
			}

			if (var56 == 3) { // L: 231
				var51 = var53; // L: 232
				var53 = var2.readShortSmart() + var54; // L: 233
				var54 = var53; // L: 234
				this.indices1[var55] = var51; // L: 235
				this.indices2[var55] = var52; // L: 236
				this.indices3[var55] = var53; // L: 237
			}

			if (var56 == 4) { // L: 239
				int var57 = var51; // L: 240
				var51 = var52; // L: 241
				var52 = var57; // L: 242
				var53 = var2.readShortSmart() + var54; // L: 243
				var54 = var53; // L: 244
				this.indices1[var55] = var51; // L: 245
				this.indices2[var55] = var57; // L: 246
				this.indices3[var55] = var53; // L: 247
			}
		}

		var2.offset = var41; // L: 250
		var3.offset = var42; // L: 251
		var4.offset = var43; // L: 252
		var5.offset = var44; // L: 253
		var6.offset = var45; // L: 254
		var7.offset = var46; // L: 255

		for (var55 = 0; var55 < var11; ++var55) { // L: 256
			var56 = this.textureRenderTypes[var55] & 255; // L: 257
			if (var56 == 0) { // L: 258
				this.texTriangleX[var55] = (short)var2.readUnsignedShort(); // L: 259
				this.texTriangleY[var55] = (short)var2.readUnsignedShort(); // L: 260
				this.texTriangleZ[var55] = (short)var2.readUnsignedShort(); // L: 261
			}
		}

		var2.offset = var26; // L: 264
		var55 = var2.readUnsignedByte(); // L: 265
		if (var55 != 0) { // L: 266
			new ModelData0();
			var2.readUnsignedShort(); // L: 268
			var2.readUnsignedShort(); // L: 269
			var2.readUnsignedShort(); // L: 270
			var2.readInt(); // L: 271
		}

	} // L: 273

	@ObfuscatedName("p")
	void method3304(byte[] var1) {
		boolean var2 = false; // L: 276
		boolean var3 = false; // L: 277
		Buffer var4 = new Buffer(var1); // L: 278
		Buffer var5 = new Buffer(var1); // L: 279
		Buffer var6 = new Buffer(var1); // L: 280
		Buffer var7 = new Buffer(var1); // L: 281
		Buffer var8 = new Buffer(var1); // L: 282
		var4.offset = var1.length - 18; // L: 283
		int var9 = var4.readUnsignedShort(); // L: 284
		int var10 = var4.readUnsignedShort(); // L: 285
		int var11 = var4.readUnsignedByte(); // L: 286
		int var12 = var4.readUnsignedByte(); // L: 287
		int var13 = var4.readUnsignedByte(); // L: 288
		int var14 = var4.readUnsignedByte(); // L: 289
		int var15 = var4.readUnsignedByte(); // L: 290
		int var16 = var4.readUnsignedByte(); // L: 291
		int var17 = var4.readUnsignedShort(); // L: 292
		int var18 = var4.readUnsignedShort(); // L: 293
		int var19 = var4.readUnsignedShort(); // L: 294
		int var20 = var4.readUnsignedShort(); // L: 295
		byte var21 = 0; // L: 296
		int var45 = var21 + var9; // L: 298
		int var23 = var45; // L: 299
		var45 += var10; // L: 300
		int var24 = var45; // L: 301
		if (var13 == 255) { // L: 302
			var45 += var10;
		}

		int var25 = var45; // L: 303
		if (var15 == 1) { // L: 304
			var45 += var10;
		}

		int var26 = var45; // L: 305
		if (var12 == 1) { // L: 306
			var45 += var10;
		}

		int var27 = var45; // L: 307
		if (var16 == 1) { // L: 308
			var45 += var9;
		}

		int var28 = var45; // L: 309
		if (var14 == 1) { // L: 310
			var45 += var10;
		}

		int var29 = var45; // L: 311
		var45 += var20; // L: 312
		int var30 = var45; // L: 313
		var45 += var10 * 2; // L: 314
		int var31 = var45; // L: 315
		var45 += var11 * 6; // L: 316
		int var32 = var45; // L: 317
		var45 += var17; // L: 318
		int var33 = var45; // L: 319
		var45 += var18; // L: 320
		int var10000 = var45 + var19; // L: 322
		this.verticesCount = var9; // L: 323
		this.faceCount = var10; // L: 324
		this.textureTriangleCount = var11; // L: 325
		this.verticesX = new int[var9]; // L: 326
		this.verticesY = new int[var9]; // L: 327
		this.verticesZ = new int[var9]; // L: 328
		this.indices1 = new int[var10]; // L: 329
		this.indices2 = new int[var10]; // L: 330
		this.indices3 = new int[var10]; // L: 331
		if (var11 > 0) { // L: 332
			this.textureRenderTypes = new byte[var11]; // L: 333
			this.texTriangleX = new short[var11]; // L: 334
			this.texTriangleY = new short[var11]; // L: 335
			this.texTriangleZ = new short[var11]; // L: 336
		}

		if (var16 == 1) { // L: 338
			this.vertexSkins = new int[var9];
		}

		if (var12 == 1) { // L: 339
			this.faceRenderTypes = new byte[var10]; // L: 340
			this.textureCoords = new byte[var10]; // L: 341
			this.faceTextures = new short[var10]; // L: 342
		}

		if (var13 == 255) { // L: 344
			this.faceRenderPriorities = new byte[var10];
		} else {
			this.priority = (byte)var13; // L: 345
		}

		if (var14 == 1) { // L: 346
			this.faceAlphas = new byte[var10];
		}

		if (var15 == 1) { // L: 347
			this.faceSkins = new int[var10];
		}

		this.faceColors = new short[var10]; // L: 348
		var4.offset = var21; // L: 349
		var5.offset = var32; // L: 350
		var6.offset = var33; // L: 351
		var7.offset = var45; // L: 352
		var8.offset = var27; // L: 353
		int var35 = 0; // L: 354
		int var36 = 0; // L: 355
		int var37 = 0; // L: 356

		int var38;
		int var39;
		int var40;
		int var41;
		int var42;
		for (var38 = 0; var38 < var9; ++var38) { // L: 357
			var39 = var4.readUnsignedByte(); // L: 358
			var40 = 0; // L: 359
			if ((var39 & 1) != 0) { // L: 360
				var40 = var5.readShortSmart();
			}

			var41 = 0; // L: 361
			if ((var39 & 2) != 0) { // L: 362
				var41 = var6.readShortSmart();
			}

			var42 = 0; // L: 363
			if ((var39 & 4) != 0) { // L: 364
				var42 = var7.readShortSmart();
			}

			this.verticesX[var38] = var35 + var40; // L: 365
			this.verticesY[var38] = var36 + var41; // L: 366
			this.verticesZ[var38] = var37 + var42; // L: 367
			var35 = this.verticesX[var38]; // L: 368
			var36 = this.verticesY[var38]; // L: 369
			var37 = this.verticesZ[var38]; // L: 370
			if (var16 == 1) { // L: 371
				this.vertexSkins[var38] = var8.readUnsignedByte();
			}
		}

		var4.offset = var30; // L: 373
		var5.offset = var26; // L: 374
		var6.offset = var24; // L: 375
		var7.offset = var28; // L: 376
		var8.offset = var25; // L: 377

		for (var38 = 0; var38 < var10; ++var38) { // L: 378
			this.faceColors[var38] = (short)var4.readUnsignedShort(); // L: 379
			if (var12 == 1) { // L: 380
				var39 = var5.readUnsignedByte(); // L: 381
				if ((var39 & 1) == 1) { // L: 382
					this.faceRenderTypes[var38] = 1; // L: 383
					var2 = true; // L: 384
				} else {
					this.faceRenderTypes[var38] = 0; // L: 386
				}

				if ((var39 & 2) == 2) { // L: 387
					this.textureCoords[var38] = (byte)(var39 >> 2); // L: 388
					this.faceTextures[var38] = this.faceColors[var38]; // L: 389
					this.faceColors[var38] = 127; // L: 390
					if (this.faceTextures[var38] != -1) { // L: 391
						var3 = true;
					}
				} else {
					this.textureCoords[var38] = -1; // L: 394
					this.faceTextures[var38] = -1; // L: 395
				}
			}

			if (var13 == 255) { // L: 398
				this.faceRenderPriorities[var38] = var6.readByte();
			}

			if (var14 == 1) { // L: 399
				this.faceAlphas[var38] = var7.readByte();
			}

			if (var15 == 1) { // L: 400
				this.faceSkins[var38] = var8.readUnsignedByte();
			}
		}

		var4.offset = var29; // L: 402
		var5.offset = var23; // L: 403
		var38 = 0; // L: 404
		var39 = 0; // L: 405
		var40 = 0; // L: 406
		var41 = 0; // L: 407

		int var43;
		int var44;
		for (var42 = 0; var42 < var10; ++var42) { // L: 408
			var43 = var5.readUnsignedByte(); // L: 409
			if (var43 == 1) { // L: 410
				var38 = var4.readShortSmart() + var41; // L: 411
				var39 = var4.readShortSmart() + var38; // L: 413
				var40 = var4.readShortSmart() + var39; // L: 415
				var41 = var40; // L: 416
				this.indices1[var42] = var38; // L: 417
				this.indices2[var42] = var39; // L: 418
				this.indices3[var42] = var40; // L: 419
			}

			if (var43 == 2) { // L: 421
				var39 = var40; // L: 422
				var40 = var4.readShortSmart() + var41; // L: 423
				var41 = var40; // L: 424
				this.indices1[var42] = var38; // L: 425
				this.indices2[var42] = var39; // L: 426
				this.indices3[var42] = var40; // L: 427
			}

			if (var43 == 3) { // L: 429
				var38 = var40; // L: 430
				var40 = var4.readShortSmart() + var41; // L: 431
				var41 = var40; // L: 432
				this.indices1[var42] = var38; // L: 433
				this.indices2[var42] = var39; // L: 434
				this.indices3[var42] = var40; // L: 435
			}

			if (var43 == 4) { // L: 437
				var44 = var38; // L: 438
				var38 = var39; // L: 439
				var39 = var44; // L: 440
				var40 = var4.readShortSmart() + var41; // L: 441
				var41 = var40; // L: 442
				this.indices1[var42] = var38; // L: 443
				this.indices2[var42] = var44; // L: 444
				this.indices3[var42] = var40; // L: 445
			}
		}

		var4.offset = var31; // L: 448

		for (var42 = 0; var42 < var11; ++var42) { // L: 449
			this.textureRenderTypes[var42] = 0; // L: 450
			this.texTriangleX[var42] = (short)var4.readUnsignedShort(); // L: 451
			this.texTriangleY[var42] = (short)var4.readUnsignedShort(); // L: 452
			this.texTriangleZ[var42] = (short)var4.readUnsignedShort(); // L: 453
		}

		if (this.textureCoords != null) { // L: 455
			boolean var46 = false; // L: 456

			for (var43 = 0; var43 < var10; ++var43) { // L: 457
				var44 = this.textureCoords[var43] & 255; // L: 458
				if (var44 != 255) { // L: 459
					if (this.indices1[var43] == (this.texTriangleX[var44] & '\uffff') && this.indices2[var43] == (this.texTriangleY[var44] & '\uffff') && this.indices3[var43] == (this.texTriangleZ[var44] & '\uffff')) { // L: 460
						this.textureCoords[var43] = -1;
					} else {
						var46 = true; // L: 461
					}
				}
			}

			if (!var46) { // L: 464
				this.textureCoords = null;
			}
		}

		if (!var3) { // L: 466
			this.faceTextures = null;
		}

		if (!var2) { // L: 467
			this.faceRenderTypes = null;
		}

	} // L: 468

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lfs;I)I"
	)
	final int method3316(ModelData var1, int var2) {
		int var3 = -1; // L: 567
		int var4 = var1.verticesX[var2]; // L: 568
		int var5 = var1.verticesY[var2]; // L: 569
		int var6 = var1.verticesZ[var2]; // L: 570

		for (int var7 = 0; var7 < this.verticesCount; ++var7) { // L: 571
			if (var4 == this.verticesX[var7] && var5 == this.verticesY[var7] && var6 == this.verticesZ[var7]) { // L: 572
				var3 = var7; // L: 573
				break;
			}
		}

		if (var3 == -1) { // L: 577
			this.verticesX[this.verticesCount] = var4; // L: 578
			this.verticesY[this.verticesCount] = var5; // L: 579
			this.verticesZ[this.verticesCount] = var6; // L: 580
			if (var1.vertexSkins != null) { // L: 581
				this.vertexSkins[this.verticesCount] = var1.vertexSkins[var2];
			}

			var3 = this.verticesCount++; // L: 582
		}

		return var3; // L: 584
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "()Lfs;"
	)
	public ModelData method3326() {
		ModelData var1 = new ModelData(); // L: 650
		if (this.faceRenderTypes != null) { // L: 651
			var1.faceRenderTypes = new byte[this.faceCount]; // L: 652

			for (int var2 = 0; var2 < this.faceCount; ++var2) { // L: 653
				var1.faceRenderTypes[var2] = this.faceRenderTypes[var2];
			}
		}

		var1.verticesCount = this.verticesCount; // L: 655
		var1.faceCount = this.faceCount; // L: 656
		var1.textureTriangleCount = this.textureTriangleCount; // L: 657
		var1.verticesX = this.verticesX; // L: 658
		var1.verticesY = this.verticesY; // L: 659
		var1.verticesZ = this.verticesZ; // L: 660
		var1.indices1 = this.indices1; // L: 661
		var1.indices2 = this.indices2; // L: 662
		var1.indices3 = this.indices3; // L: 663
		var1.faceRenderPriorities = this.faceRenderPriorities; // L: 664
		var1.faceAlphas = this.faceAlphas; // L: 665
		var1.textureCoords = this.textureCoords; // L: 666
		var1.faceColors = this.faceColors; // L: 667
		var1.faceTextures = this.faceTextures; // L: 668
		var1.priority = this.priority; // L: 669
		var1.textureRenderTypes = this.textureRenderTypes; // L: 670
		var1.texTriangleX = this.texTriangleX; // L: 671
		var1.texTriangleY = this.texTriangleY; // L: 672
		var1.texTriangleZ = this.texTriangleZ; // L: 673
		var1.vertexSkins = this.vertexSkins; // L: 674
		var1.faceSkins = this.faceSkins; // L: 675
		var1.vertexLabels = this.vertexLabels; // L: 676
		var1.faceLabelsAlpha = this.faceLabelsAlpha; // L: 677
		var1.vertexNormals = this.vertexNormals; // L: 678
		var1.faceNormals = this.faceNormals; // L: 679
		var1.ambient = this.ambient; // L: 680
		var1.contrast = this.contrast; // L: 681
		return var1; // L: 682
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "([[IIIIZI)Lfs;"
	)
	public ModelData method3314(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		this.calculateBounds(); // L: 686
		int var7 = var2 + this.field1826; // L: 687
		int var8 = var2 + this.field1805; // L: 688
		int var9 = var4 + this.field1829; // L: 689
		int var10 = var4 + this.field1828; // L: 690
		if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) { // L: 691
			var7 >>= 7; // L: 692
			var8 = var8 + 127 >> 7; // L: 693
			var9 >>= 7; // L: 694
			var10 = var10 + 127 >> 7; // L: 695
			if (var3 == var1[var7][var9] && var3 == var1[var8][var9] && var3 == var1[var7][var10] && var3 == var1[var8][var10]) { // L: 696
				return this;
			} else {
				ModelData var11 = new ModelData(); // L: 699
				var11.verticesCount = this.verticesCount; // L: 700
				var11.faceCount = this.faceCount; // L: 701
				var11.textureTriangleCount = this.textureTriangleCount; // L: 702
				var11.verticesX = this.verticesX; // L: 703
				var11.verticesZ = this.verticesZ; // L: 704
				var11.indices1 = this.indices1; // L: 705
				var11.indices2 = this.indices2; // L: 706
				var11.indices3 = this.indices3; // L: 707
				var11.faceRenderTypes = this.faceRenderTypes; // L: 708
				var11.faceRenderPriorities = this.faceRenderPriorities; // L: 709
				var11.faceAlphas = this.faceAlphas; // L: 710
				var11.textureCoords = this.textureCoords; // L: 711
				var11.faceColors = this.faceColors; // L: 712
				var11.faceTextures = this.faceTextures; // L: 713
				var11.priority = this.priority; // L: 714
				var11.textureRenderTypes = this.textureRenderTypes; // L: 715
				var11.texTriangleX = this.texTriangleX; // L: 716
				var11.texTriangleY = this.texTriangleY; // L: 717
				var11.texTriangleZ = this.texTriangleZ; // L: 718
				var11.vertexSkins = this.vertexSkins; // L: 719
				var11.faceSkins = this.faceSkins; // L: 720
				var11.vertexLabels = this.vertexLabels; // L: 721
				var11.faceLabelsAlpha = this.faceLabelsAlpha; // L: 722
				var11.ambient = this.ambient; // L: 723
				var11.contrast = this.contrast; // L: 724
				var11.verticesY = new int[var11.verticesCount]; // L: 725
				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				int var20;
				int var21;
				if (var6 == 0) { // L: 730
					for (var12 = 0; var12 < var11.verticesCount; ++var12) { // L: 731
						var13 = var2 + this.verticesX[var12]; // L: 732
						var14 = var4 + this.verticesZ[var12]; // L: 733
						var15 = var13 & 127; // L: 734
						var16 = var14 & 127; // L: 735
						var17 = var13 >> 7; // L: 736
						var18 = var14 >> 7; // L: 737
						var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7; // L: 738
						var20 = var1[var17][var18 + 1] * (128 - var15) + var15 * var1[var17 + 1][var18 + 1] >> 7; // L: 739
						var21 = var19 * (128 - var16) + var20 * var16 >> 7; // L: 740
						var11.verticesY[var12] = var21 + this.verticesY[var12] - var3; // L: 741
					}
				} else {
					for (var12 = 0; var12 < var11.verticesCount; ++var12) { // L: 745
						var13 = (-this.verticesY[var12] << 16) / super.height; // L: 746
						if (var13 < var6) { // L: 747
							var14 = var2 + this.verticesX[var12]; // L: 748
							var15 = var4 + this.verticesZ[var12]; // L: 749
							var16 = var14 & 127; // L: 750
							var17 = var15 & 127; // L: 751
							var18 = var14 >> 7; // L: 752
							var19 = var15 >> 7; // L: 753
							var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7; // L: 754
							var21 = var1[var18][var19 + 1] * (128 - var16) + var16 * var1[var18 + 1][var19 + 1] >> 7; // L: 755
							int var22 = var20 * (128 - var17) + var21 * var17 >> 7; // L: 756
							var11.verticesY[var12] = (var6 - var13) * (var22 - var3) / var6 + this.verticesY[var12]; // L: 757
						}
					}
				}

				var11.invalidate(); // L: 761
				return var11; // L: 762
			}
		} else {
			return this;
		}
	}

	@ObfuscatedName("n")
	void method3282() {
		int[] var1;
		int var2;
		int var10002;
		int var3;
		int var4;
		if (this.vertexSkins != null) { // L: 766
			var1 = new int[256]; // L: 767
			var2 = 0; // L: 768

			for (var3 = 0; var3 < this.verticesCount; ++var3) { // L: 769
				var4 = this.vertexSkins[var3]; // L: 770
				var10002 = var1[var4]++; // L: 771
				if (var4 > var2) { // L: 772
					var2 = var4;
				}
			}

			this.vertexLabels = new int[var2 + 1][]; // L: 774

			for (var3 = 0; var3 <= var2; ++var3) { // L: 775
				this.vertexLabels[var3] = new int[var1[var3]]; // L: 776
				var1[var3] = 0; // L: 777
			}

			for (var3 = 0; var3 < this.verticesCount; this.vertexLabels[var4][var1[var4]++] = var3++) { // L: 779 781
				var4 = this.vertexSkins[var3]; // L: 780
			}

			this.vertexSkins = null; // L: 783
		}

		if (this.faceSkins != null) { // L: 785
			var1 = new int[256]; // L: 786
			var2 = 0; // L: 787

			for (var3 = 0; var3 < this.faceCount; ++var3) { // L: 788
				var4 = this.faceSkins[var3]; // L: 789
				var10002 = var1[var4]++; // L: 790
				if (var4 > var2) { // L: 791
					var2 = var4;
				}
			}

			this.faceLabelsAlpha = new int[var2 + 1][]; // L: 793

			for (var3 = 0; var3 <= var2; ++var3) { // L: 794
				this.faceLabelsAlpha[var3] = new int[var1[var3]]; // L: 795
				var1[var3] = 0; // L: 796
			}

			for (var3 = 0; var3 < this.faceCount; this.faceLabelsAlpha[var4][var1[var4]++] = var3++) { // L: 798 800
				var4 = this.faceSkins[var3]; // L: 799
			}

			this.faceSkins = null; // L: 802
		}

	} // L: 804

	@ObfuscatedName("l")
	public void method3303() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 807
			int var2 = this.verticesX[var1]; // L: 808
			this.verticesX[var1] = this.verticesZ[var1]; // L: 809
			this.verticesZ[var1] = -var2; // L: 810
		}

		this.invalidate(); // L: 812
	} // L: 813

	@ObfuscatedName("m")
	public void method3284() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 816
			this.verticesX[var1] = -this.verticesX[var1]; // L: 817
			this.verticesZ[var1] = -this.verticesZ[var1]; // L: 818
		}

		this.invalidate(); // L: 820
	} // L: 821

	@ObfuscatedName("d")
	public void method3285() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 824
			int var2 = this.verticesZ[var1]; // L: 825
			this.verticesZ[var1] = this.verticesX[var1]; // L: 826
			this.verticesX[var1] = -var2; // L: 827
		}

		this.invalidate(); // L: 829
	} // L: 830

	@ObfuscatedName("c")
	public void method3286(int var1) {
		int var2 = ModelData_sine[var1]; // L: 833
		int var3 = ModelData_cosine[var1]; // L: 834

		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 835
			int var5 = var2 * this.verticesZ[var4] + var3 * this.verticesX[var4] >> 16; // L: 836
			this.verticesZ[var4] = var3 * this.verticesZ[var4] - var2 * this.verticesX[var4] >> 16; // L: 837
			this.verticesX[var4] = var5; // L: 838
		}

		this.invalidate(); // L: 840
	} // L: 841

	@ObfuscatedName("j")
	@Export("changeOffset")
	public void changeOffset(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 844
			int[] var10000 = this.verticesX; // L: 845
			var10000[var4] += var1;
			var10000 = this.verticesY; // L: 846
			var10000[var4] += var2;
			var10000 = this.verticesZ; // L: 847
			var10000[var4] += var3;
		}

		this.invalidate(); // L: 849
	} // L: 850

	@ObfuscatedName("r")
	@Export("recolor")
	public void recolor(short var1, short var2) {
		for (int var3 = 0; var3 < this.faceCount; ++var3) { // L: 853
			if (this.faceColors[var3] == var1) { // L: 854
				this.faceColors[var3] = var2;
			}
		}

	} // L: 856

	@ObfuscatedName("q")
	@Export("retexture")
	public void retexture(short var1, short var2) {
		if (this.faceTextures != null) { // L: 859
			for (int var3 = 0; var3 < this.faceCount; ++var3) { // L: 860
				if (this.faceTextures[var3] == var1) {
					this.faceTextures[var3] = var2; // L: 861
				}
			}

		}
	} // L: 863

	@ObfuscatedName("t")
	public void method3290() {
		int var1;
		for (var1 = 0; var1 < this.verticesCount; ++var1) { // L: 866
			this.verticesZ[var1] = -this.verticesZ[var1];
		}

		for (var1 = 0; var1 < this.faceCount; ++var1) { // L: 867
			int var2 = this.indices1[var1]; // L: 868
			this.indices1[var1] = this.indices3[var1]; // L: 869
			this.indices3[var1] = var2; // L: 870
		}

		this.invalidate(); // L: 872
	} // L: 873

	@ObfuscatedName("v")
	@Export("resize")
	public void resize(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 876
			this.verticesX[var4] = this.verticesX[var4] * var1 / 128; // L: 877
			this.verticesY[var4] = var2 * this.verticesY[var4] / 128; // L: 878
			this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128; // L: 879
		}

		this.invalidate(); // L: 881
	} // L: 882

	@ObfuscatedName("x")
	@Export("calculateVertexNormals")
	public void calculateVertexNormals() {
		if (this.vertexNormals == null) { // L: 885
			this.vertexNormals = new VertexNormal[this.verticesCount]; // L: 886

			int var1;
			for (var1 = 0; var1 < this.verticesCount; ++var1) { // L: 887
				this.vertexNormals[var1] = new VertexNormal();
			}

			for (var1 = 0; var1 < this.faceCount; ++var1) { // L: 888
				int var2 = this.indices1[var1]; // L: 889
				int var3 = this.indices2[var1]; // L: 890
				int var4 = this.indices3[var1]; // L: 891
				int var5 = this.verticesX[var3] - this.verticesX[var2]; // L: 892
				int var6 = this.verticesY[var3] - this.verticesY[var2]; // L: 893
				int var7 = this.verticesZ[var3] - this.verticesZ[var2]; // L: 894
				int var8 = this.verticesX[var4] - this.verticesX[var2]; // L: 895
				int var9 = this.verticesY[var4] - this.verticesY[var2]; // L: 896
				int var10 = this.verticesZ[var4] - this.verticesZ[var2]; // L: 897
				int var11 = var6 * var10 - var9 * var7; // L: 898
				int var12 = var7 * var8 - var10 * var5; // L: 899

				int var13;
				for (var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192; var13 >>= 1) { // L: 900 901 904
					var11 >>= 1; // L: 902
					var12 >>= 1; // L: 903
				}

				int var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13)); // L: 906
				if (var14 <= 0) { // L: 907
					var14 = 1;
				}

				var11 = var11 * 256 / var14; // L: 908
				var12 = var12 * 256 / var14; // L: 909
				var13 = var13 * 256 / var14; // L: 910
				byte var15;
				if (this.faceRenderTypes == null) { // L: 912
					var15 = 0;
				} else {
					var15 = this.faceRenderTypes[var1]; // L: 913
				}

				if (var15 == 0) { // L: 914
					VertexNormal var16 = this.vertexNormals[var2]; // L: 916
					var16.x += var11; // L: 917
					var16.y += var12; // L: 918
					var16.z += var13; // L: 919
					++var16.magnitude; // L: 920
					var16 = this.vertexNormals[var3]; // L: 921
					var16.x += var11; // L: 922
					var16.y += var12; // L: 923
					var16.z += var13; // L: 924
					++var16.magnitude; // L: 925
					var16 = this.vertexNormals[var4]; // L: 926
					var16.x += var11; // L: 927
					var16.y += var12; // L: 928
					var16.z += var13; // L: 929
					++var16.magnitude; // L: 930
				} else if (var15 == 1) { // L: 932
					if (this.faceNormals == null) { // L: 933
						this.faceNormals = new FaceNormal[this.faceCount];
					}

					FaceNormal var17 = this.faceNormals[var1] = new FaceNormal(); // L: 934
					var17.x = var11; // L: 935
					var17.y = var12; // L: 936
					var17.z = var13; // L: 937
				}
			}

		}
	} // L: 940

	@ObfuscatedName("z")
	@Export("invalidate")
	void invalidate() {
		this.vertexNormals = null; // L: 943
		this.field1821 = null; // L: 944
		this.faceNormals = null; // L: 945
		this.isBoundsCalculated = false; // L: 946
	} // L: 947

	@ObfuscatedName("i")
	@Export("calculateBounds")
	void calculateBounds() {
		if (!this.isBoundsCalculated) { // L: 950
			super.height = 0; // L: 951
			this.field1819 = 0; // L: 952
			this.field1826 = 999999; // L: 953
			this.field1805 = -999999; // L: 954
			this.field1828 = -99999; // L: 955
			this.field1829 = 99999; // L: 956

			for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 957
				int var2 = this.verticesX[var1]; // L: 958
				int var3 = this.verticesY[var1]; // L: 959
				int var4 = this.verticesZ[var1]; // L: 960
				if (var2 < this.field1826) { // L: 961
					this.field1826 = var2;
				}

				if (var2 > this.field1805) { // L: 962
					this.field1805 = var2;
				}

				if (var4 < this.field1829) { // L: 963
					this.field1829 = var4;
				}

				if (var4 > this.field1828) { // L: 964
					this.field1828 = var4;
				}

				if (-var3 > super.height) { // L: 965
					super.height = -var3;
				}

				if (var3 > this.field1819) { // L: 966
					this.field1819 = var3;
				}
			}

			this.isBoundsCalculated = true; // L: 968
		}
	} // L: 969

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Lgv;"
	)
	@Export("toModel")
	public final Model toModel(int var1, int var2, int var3, int var4, int var5) {
		this.calculateVertexNormals(); // L: 1028
		int var6 = (int)Math.sqrt((double)(var5 * var5 + var3 * var3 + var4 * var4)); // L: 1029
		int var7 = var6 * var2 >> 8; // L: 1030
		Model var8 = new Model(); // L: 1031
		var8.faceColors1 = new int[this.faceCount]; // L: 1032
		var8.faceColors2 = new int[this.faceCount]; // L: 1033
		var8.faceColors3 = new int[this.faceCount]; // L: 1034
		if (this.textureTriangleCount > 0 && this.textureCoords != null) { // L: 1035
			int[] var9 = new int[this.textureTriangleCount]; // L: 1036

			int var10;
			for (var10 = 0; var10 < this.faceCount; ++var10) { // L: 1037
				if (this.textureCoords[var10] != -1) { // L: 1038
					++var9[this.textureCoords[var10] & 255];
				}
			}

			var8.field2081 = 0; // L: 1040

			for (var10 = 0; var10 < this.textureTriangleCount; ++var10) { // L: 1041
				if (var9[var10] > 0 && this.textureRenderTypes[var10] == 0) { // L: 1042
					++var8.field2081;
				}
			}

			var8.field2082 = new int[var8.field2081]; // L: 1044
			var8.field2083 = new int[var8.field2081]; // L: 1045
			var8.field2095 = new int[var8.field2081]; // L: 1046
			var10 = 0; // L: 1047

			int var11;
			for (var11 = 0; var11 < this.textureTriangleCount; ++var11) { // L: 1048
				if (var9[var11] > 0 && this.textureRenderTypes[var11] == 0) { // L: 1049
					var8.field2082[var10] = this.texTriangleX[var11] & '\uffff'; // L: 1050
					var8.field2083[var10] = this.texTriangleY[var11] & '\uffff'; // L: 1051
					var8.field2095[var10] = this.texTriangleZ[var11] & '\uffff'; // L: 1052
					var9[var11] = var10++; // L: 1053
				} else {
					var9[var11] = -1; // L: 1055
				}
			}

			var8.field2078 = new byte[this.faceCount]; // L: 1057

			for (var11 = 0; var11 < this.faceCount; ++var11) { // L: 1058
				if (this.textureCoords[var11] != -1) { // L: 1059
					var8.field2078[var11] = (byte)var9[this.textureCoords[var11] & 255];
				} else {
					var8.field2078[var11] = -1; // L: 1060
				}
			}
		}

		for (int var16 = 0; var16 < this.faceCount; ++var16) { // L: 1063
			byte var17;
			if (this.faceRenderTypes == null) { // L: 1065
				var17 = 0;
			} else {
				var17 = this.faceRenderTypes[var16]; // L: 1066
			}

			byte var18;
			if (this.faceAlphas == null) { // L: 1068
				var18 = 0;
			} else {
				var18 = this.faceAlphas[var16]; // L: 1069
			}

			short var12;
			if (this.faceTextures == null) { // L: 1071
				var12 = -1;
			} else {
				var12 = this.faceTextures[var16]; // L: 1072
			}

			if (var18 == -2) { // L: 1073
				var17 = 3;
			}

			if (var18 == -1) { // L: 1074
				var17 = 2;
			}

			VertexNormal var13;
			int var14;
			FaceNormal var19;
			if (var12 == -1) { // L: 1075
				if (var17 != 0) { // L: 1076
					if (var17 == 1) { // L: 1093
						var19 = this.faceNormals[var16]; // L: 1094
						var14 = (var4 * var19.y + var5 * var19.z + var3 * var19.x) / (var7 / 2 + var7) + var1; // L: 1095
						var8.faceColors1[var16] = method3297(this.faceColors[var16] & '\uffff', var14); // L: 1096
						var8.faceColors3[var16] = -1; // L: 1097
					} else if (var17 == 3) { // L: 1099
						var8.faceColors1[var16] = 128; // L: 1100
						var8.faceColors3[var16] = -1; // L: 1101
					} else {
						var8.faceColors3[var16] = -2; // L: 1104
					}
				} else {
					int var15 = this.faceColors[var16] & '\uffff'; // L: 1079
					if (this.field1821 != null && this.field1821[this.indices1[var16]] != null) { // L: 1080
						var13 = this.field1821[this.indices1[var16]];
					} else {
						var13 = this.vertexNormals[this.indices1[var16]]; // L: 1081
					}

					var14 = (var4 * var13.y + var5 * var13.z + var3 * var13.x) / (var7 * var13.magnitude) + var1; // L: 1082
					var8.faceColors1[var16] = method3297(var15, var14); // L: 1083
					if (this.field1821 != null && this.field1821[this.indices2[var16]] != null) { // L: 1084
						var13 = this.field1821[this.indices2[var16]];
					} else {
						var13 = this.vertexNormals[this.indices2[var16]]; // L: 1085
					}

					var14 = (var4 * var13.y + var5 * var13.z + var3 * var13.x) / (var7 * var13.magnitude) + var1; // L: 1086
					var8.faceColors2[var16] = method3297(var15, var14); // L: 1087
					if (this.field1821 != null && this.field1821[this.indices3[var16]] != null) { // L: 1088
						var13 = this.field1821[this.indices3[var16]];
					} else {
						var13 = this.vertexNormals[this.indices3[var16]]; // L: 1089
					}

					var14 = (var4 * var13.y + var5 * var13.z + var3 * var13.x) / (var7 * var13.magnitude) + var1; // L: 1090
					var8.faceColors3[var16] = method3297(var15, var14); // L: 1091
				}
			} else if (var17 != 0) { // L: 1108
				if (var17 == 1) { // L: 1124
					var19 = this.faceNormals[var16]; // L: 1125
					var14 = (var4 * var19.y + var5 * var19.z + var3 * var19.x) / (var7 / 2 + var7) + var1; // L: 1126
					var8.faceColors1[var16] = method3298(var14); // L: 1127
					var8.faceColors3[var16] = -1; // L: 1128
				} else {
					var8.faceColors3[var16] = -2; // L: 1131
				}
			} else {
				if (this.field1821 != null && this.field1821[this.indices1[var16]] != null) { // L: 1111
					var13 = this.field1821[this.indices1[var16]];
				} else {
					var13 = this.vertexNormals[this.indices1[var16]]; // L: 1112
				}

				var14 = (var4 * var13.y + var5 * var13.z + var3 * var13.x) / (var7 * var13.magnitude) + var1; // L: 1113
				var8.faceColors1[var16] = method3298(var14); // L: 1114
				if (this.field1821 != null && this.field1821[this.indices2[var16]] != null) { // L: 1115
					var13 = this.field1821[this.indices2[var16]];
				} else {
					var13 = this.vertexNormals[this.indices2[var16]]; // L: 1116
				}

				var14 = (var4 * var13.y + var5 * var13.z + var3 * var13.x) / (var7 * var13.magnitude) + var1; // L: 1117
				var8.faceColors2[var16] = method3298(var14); // L: 1118
				if (this.field1821 != null && this.field1821[this.indices3[var16]] != null) { // L: 1119
					var13 = this.field1821[this.indices3[var16]];
				} else {
					var13 = this.vertexNormals[this.indices3[var16]]; // L: 1120
				}

				var14 = (var4 * var13.y + var5 * var13.z + var3 * var13.x) / (var7 * var13.magnitude) + var1; // L: 1121
				var8.faceColors3[var16] = method3298(var14); // L: 1122
			}
		}

		this.method3282(); // L: 1135
		var8.verticesCount = this.verticesCount; // L: 1136
		var8.verticesX = this.verticesX; // L: 1137
		var8.verticesY = this.verticesY; // L: 1138
		var8.verticesZ = this.verticesZ; // L: 1139
		var8.indicesCount = this.faceCount; // L: 1140
		var8.indices1 = this.indices1; // L: 1141
		var8.indices2 = this.indices2; // L: 1142
		var8.indices3 = this.indices3; // L: 1143
		var8.faceRenderPriorities = this.faceRenderPriorities; // L: 1144
		var8.faceAlphas = this.faceAlphas; // L: 1145
		var8.field2080 = this.priority; // L: 1146
		var8.vertexLabels = this.vertexLabels; // L: 1147
		var8.faceLabelsAlpha = this.faceLabelsAlpha; // L: 1148
		var8.faceTextures = this.faceTextures; // L: 1149
		return var8; // L: 1150
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lir;II)Lfs;"
	)
	@Export("ModelData_get")
	public static ModelData ModelData_get(AbstractArchive var0, int var1, int var2) {
		byte[] var3 = var0.takeFile(var1, var2); // L: 53
		return var3 == null ? null : new ModelData(var3); // L: 54
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lfs;Lfs;IIIZ)V"
	)
	static void method3343(ModelData var0, ModelData var1, int var2, int var3, int var4, boolean var5) {
		var0.calculateBounds(); // L: 972
		var0.calculateVertexNormals(); // L: 973
		var1.calculateBounds(); // L: 974
		var1.calculateVertexNormals(); // L: 975
		++field1832; // L: 976
		int var6 = 0; // L: 977
		int[] var7 = var1.verticesX; // L: 978
		int var8 = var1.verticesCount; // L: 979

		int var9;
		for (var9 = 0; var9 < var0.verticesCount; ++var9) { // L: 980
			VertexNormal var10 = var0.vertexNormals[var9]; // L: 981
			if (var10.magnitude != 0) { // L: 982
				int var11 = var0.verticesY[var9] - var3; // L: 983
				if (var11 <= var1.field1819) { // L: 984
					int var12 = var0.verticesX[var9] - var2; // L: 985
					if (var12 >= var1.field1826 && var12 <= var1.field1805) { // L: 986
						int var13 = var0.verticesZ[var9] - var4; // L: 987
						if (var13 >= var1.field1829 && var13 <= var1.field1828) { // L: 988
							for (int var14 = 0; var14 < var8; ++var14) { // L: 989
								VertexNormal var15 = var1.vertexNormals[var14]; // L: 990
								if (var12 == var7[var14] && var13 == var1.verticesZ[var14] && var11 == var1.verticesY[var14] && var15.magnitude != 0) { // L: 991
									if (var0.field1821 == null) { // L: 992
										var0.field1821 = new VertexNormal[var0.verticesCount];
									}

									if (var1.field1821 == null) { // L: 993
										var1.field1821 = new VertexNormal[var8];
									}

									VertexNormal var16 = var0.field1821[var9]; // L: 994
									if (var16 == null) { // L: 995
										var16 = var0.field1821[var9] = new VertexNormal(var10);
									}

									VertexNormal var17 = var1.field1821[var14]; // L: 996
									if (var17 == null) {
										var17 = var1.field1821[var14] = new VertexNormal(var15); // L: 997
									}

									var16.x += var15.x; // L: 998
									var16.y += var15.y; // L: 999
									var16.z += var15.z; // L: 1000
									var16.magnitude += var15.magnitude; // L: 1001
									var17.x += var10.x; // L: 1002
									var17.y += var10.y; // L: 1003
									var17.z += var10.z; // L: 1004
									var17.magnitude += var10.magnitude; // L: 1005
									++var6; // L: 1006
									field1822[var9] = field1832; // L: 1007
									field1831[var14] = field1832; // L: 1008
								}
							}
						}
					}
				}
			}
		}

		if (var6 >= 3 && var5) { // L: 1012
			for (var9 = 0; var9 < var0.faceCount; ++var9) { // L: 1013
				if (field1822[var0.indices1[var9]] == field1832 && field1822[var0.indices2[var9]] == field1832 && field1822[var0.indices3[var9]] == field1832) { // L: 1014
					if (var0.faceRenderTypes == null) { // L: 1015
						var0.faceRenderTypes = new byte[var0.faceCount];
					}

					var0.faceRenderTypes[var9] = 2; // L: 1016
				}
			}

			for (var9 = 0; var9 < var1.faceCount; ++var9) { // L: 1019
				if (field1832 == field1831[var1.indices1[var9]] && field1832 == field1831[var1.indices2[var9]] && field1832 == field1831[var1.indices3[var9]]) { // L: 1020
					if (var1.faceRenderTypes == null) { // L: 1021
						var1.faceRenderTypes = new byte[var1.faceCount];
					}

					var1.faceRenderTypes[var9] = 2; // L: 1022
				}
			}

		}
	} // L: 1025

	@ObfuscatedName("s")
	static final int method3297(int var0, int var1) {
		var1 = (var0 & 127) * var1 >> 7; // L: 1154
		if (var1 < 2) { // L: 1155
			var1 = 2;
		} else if (var1 > 126) { // L: 1156
			var1 = 126;
		}

		return (var0 & 65408) + var1; // L: 1157
	}

	@ObfuscatedName("y")
	static final int method3298(int var0) {
		if (var0 < 2) { // L: 1161
			var0 = 2;
		} else if (var0 > 126) {
			var0 = 126; // L: 1162
		}

		return var0; // L: 1163
	}
}
