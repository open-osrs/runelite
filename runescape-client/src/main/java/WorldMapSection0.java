import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 890498367
	)
	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 766699141
	)
	@Export("newZ")
	int newZ;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 563175329
	)
	@Export("oldX")
	int oldX;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1550449975
	)
	@Export("oldY")
	int oldY;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1600318395
	)
	@Export("newX")
	int newX;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -25921137
	)
	@Export("newY")
	int newY;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1796176271
	)
	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1276314401
	)
	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1500474937
	)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -693533351
	)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -817896745
	)
	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1687649259
	)
	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 731785347
	)
	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1623079757
	)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lhg;I)V",
		garbageValue = "1585435431"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.newX) {
			var1.regionLowX = this.newX;
		}

		if (var1.regionHighX < this.newX) {
			var1.regionHighX = this.newX;
		}

		if (var1.regionLowY > this.newY) {
			var1.regionLowY = this.newY;
		}

		if (var1.regionHighY < this.newY) {
			var1.regionHighY = this.newY;
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-929111713"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.oldZ + this.newZ) {
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-47549823"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7; // L: 42
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-561571792"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{var2 + (this.newX * 64 - this.oldX * 64) + (this.newChunkXLow * 8 - this.oldChunkXLow * 8), var3 + (this.newY * 64 - this.oldY * 64) + (this.newChunkYLow * 8 - this.oldChunkYLow * 8)};
			return var4;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(III)Lkd;",
		garbageValue = "531454030"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.oldX * 64 - this.newX * 64 + (this.oldChunkXLow * 8 - this.newChunkXLow * 8) + var1;
			int var4 = var2 + (this.oldY * 64 - this.newY * 64) + (this.oldChunkYLow * 8 - this.newChunkYLow * 8);
			return new Coord(this.oldZ, var3, var4);
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lqt;B)V",
		garbageValue = "-27"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.oldZ = var1.readUnsignedByte();
		this.newZ = var1.readUnsignedByte();
		this.oldX = var1.readUnsignedShort();
		this.oldChunkXLow = var1.readUnsignedByte();
		this.oldChunkXHigh = var1.readUnsignedByte();
		this.oldY = var1.readUnsignedShort();
		this.oldChunkYLow = var1.readUnsignedByte();
		this.oldChunkYHigh = var1.readUnsignedByte();
		this.newX = var1.readUnsignedShort();
		this.newChunkXLow = var1.readUnsignedByte();
		this.newChunkXHigh = var1.readUnsignedByte(); // L: 78
		this.newY = var1.readUnsignedShort(); // L: 79
		this.newChunkYLow = var1.readUnsignedByte();
		this.newChunkYHigh = var1.readUnsignedByte();
		this.postRead();
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1114054632"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ldo;FB)F",
		garbageValue = "-14"
	)
	static float method4918(class117 var0, float var1) {
		if (var0 != null && var0.method2709() != 0) {
			if (var1 < (float)var0.field1462[0].field1420) { // L: 21
				return var0.field1468 == class116.field1455 ? var0.field1462[0].field1423 : InvDefinition.method3349(var0, var1, true); // L: 22
			} else if (var1 > (float)var0.field1462[var0.method2709() - 1].field1420) {
				return var0.field1461 == class116.field1455 ? var0.field1462[var0.method2709() - 1].field1423 : InvDefinition.method3349(var0, var1, false); // L: 31
			} else if (var0.field1459) {
				return var0.field1462[0].field1423;
			} else {
				class113 var2 = var0.method2717(var1);
				boolean var3 = false;
				boolean var4 = false;
				if (var2 == null) {
					return 0.0F; // L: 183
				} else {
					float var7;
					if (0.0D == (double)var2.field1419 && (double)var2.field1425 == 0.0D) {
						var3 = true; // L: 41
					} else if (Float.MAX_VALUE == var2.field1419 && Float.MAX_VALUE == var2.field1425) {
						var4 = true;
					} else if (var2.field1426 != null) {
						if (var0.field1472) {
							float[] var5 = new float[4]; // L: 48
							float[] var6 = new float[4];
							var5[0] = (float)var2.field1420;
							var6[0] = var2.field1423;
							var5[1] = var5[0] + var2.field1419 * 0.33333334F;
							var6[1] = 0.33333334F * var2.field1425 + var6[0];
							var5[3] = (float)var2.field1426.field1420;
							var6[3] = var2.field1426.field1423;
							var5[2] = var5[3] - 0.33333334F * var2.field1426.field1421; // L: 56
							var6[2] = var6[3] - var2.field1426.field1422 * 0.33333334F; // L: 57
							if (var0.field1463) {
								if (var0 != null) {
									var7 = var5[3] - var5[0];
									if (0.0D != (double)var7) { // L: 64
										float var8 = var5[1] - var5[0]; // L: 67
										float var9 = var5[2] - var5[0]; // L: 68
										Float var10 = var8 / var7; // L: 69
										Float var11 = var9 / var7; // L: 70
										var0.field1470 = var10 == 0.33333334F && var11 == 0.6666667F; // L: 71
										float var12 = var10; // L: 72
										float var13 = var11; // L: 73
										if ((double)var10 < 0.0D) { // L: 74
											var10 = 0.0F;
										}

										if ((double)var11 > 1.0D) { // L: 75
											var11 = 1.0F;
										}

										if ((double)var10 > 1.0D || var11 < -1.0F) { // L: 76
											Float var14 = var10; // L: 77
											Float var15 = 1.0F - var11; // L: 80
											if (var10 < 0.0F) { // L: 81
												var14 = 0.0F;
											}

											if (var15 < 0.0F) { // L: 82
												var15 = 0.0F;
											}

											if (var14 > 1.0F || var15 > 1.0F) { // L: 83
												float var16 = (float)((double)(var14 * (var14 - 2.0F + var15)) + (double)var15 * ((double)var15 - 2.0D) + 1.0D); // L: 84
												if (class114.field1429 + var16 > 0.0F) { // L: 85
													ObjectComposition.method3690(var14, var15); // L: 86
												}
											}

											var15 = 1.0F - var15; // L: 89
										}

										if (var10 != var12) { // L: 92
											var5[1] = var5[0] + var10 * var7; // L: 93
											if ((double)var12 != 0.0D) { // L: 94
												var6[1] = var6[0] + (var6[1] - var6[0]) * var10 / var12; // L: 95
											}
										}

										if (var11 != var13) { // L: 98
											var5[2] = var5[0] + var11 * var7; // L: 99
											if (1.0D != (double)var13) { // L: 100
												var6[2] = (float)((double)var6[3] - (double)(var6[3] - var6[2]) * (1.0D - (double)var11) / (1.0D - (double)var13)); // L: 101
											}
										}

										var0.field1464 = var5[0]; // L: 104
										var0.field1458 = var5[3]; // L: 105
										class388.method7040(0.0F, var10, var11, 1.0F, var0.field1465); // L: 106
										class388.method7040(var6[0], var6[1], var6[2], var6[3], var0.field1467); // L: 107
									}
								}
							} else {
								HealthBar.method2355(var0, var5, var6); // L: 111
							}

							var0.field1472 = false; // L: 113
						}
					} else {
						var3 = true; // L: 117
					}

					if (var3) { // L: 119
						return var2.field1423; // L: 120
					} else if (var4) { // L: 122
						return (float)var2.field1420 != var1 && var2.field1426 != null ? var2.field1426.field1423 : var2.field1423; // L: 123 124 127
					} else {
						float var17;
						float var18;
						if (var0.field1463) { // L: 130
							if (var0 == null) { // L: 133
								var18 = 0.0F; // L: 134
							} else {
								if (var1 == var0.field1464) { // L: 138
									var17 = 0.0F; // L: 139
								} else if (var0.field1458 == var1) { // L: 141
									var17 = 1.0F; // L: 142
								} else {
									var17 = (var1 - var0.field1464) / (var0.field1458 - var0.field1464); // L: 145
								}

								if (var0.field1470) { // L: 148
									var7 = var17; // L: 149
								} else {
									float[] var19 = new float[]{var0.field1465[0] - var17, var0.field1465[1], var0.field1465[2], var0.field1465[3]}; // L: 152 153 154 155 156
									float[] var20 = new float[5]; // L: 157
									int var21 = VerticalAlignment.method3534(var19, 3, 0.0F, true, 1.0F, true, var20); // L: 158
									if (var21 == 1) { // L: 159
										var7 = var20[0]; // L: 160
									} else {
										var7 = 0.0F; // L: 163
									}
								}

								var18 = var0.field1467[0] + var7 * (var0.field1467[1] + (var0.field1467[2] + var7 * var0.field1467[3]) * var7); // L: 166
							}

							return var18; // L: 168
						} else {
							if (var0 == null) { // L: 173
								var18 = 0.0F; // L: 174
							} else {
								var17 = var1 - var0.field1464; // L: 177
								var18 = var17 * ((var17 * var0.field1465[0] + var0.field1465[1]) * var17 + var0.field1465[2]) + var0.field1465[3]; // L: 178
							}

							return var18; // L: 180
						}
					}
				}
			}
		} else {
			return 0.0F;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llh;B)V",
		garbageValue = "0"
	)
	public static void method4936(AbstractArchive var0) {
		EnumComposition.EnumDefinition_archive = var0;
	} // L: 26

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Llb;I)I",
		garbageValue = "-675208875"
	)
	@Export("compareStrings")
	public static int compareStrings(CharSequence var0, CharSequence var1, Language var2) {
		int var3 = var0.length(); // L: 11
		int var4 = var1.length(); // L: 12
		int var5 = 0; // L: 13
		int var6 = 0; // L: 14
		char var7 = 0; // L: 15
		char var8 = 0; // L: 16

		while (var5 - var7 < var3 || var6 - var8 < var4) { // L: 18
			if (var5 - var7 >= var3) { // L: 19
				return -1;
			}

			if (var6 - var8 >= var4) { // L: 20
				return 1;
			}

			char var9;
			if (var7 != 0) { // L: 23
				var9 = var7; // L: 24
				boolean var14 = false; // L: 25
			} else {
				var9 = var0.charAt(var5++); // L: 27
			}

			char var10;
			if (var8 != 0) { // L: 28
				var10 = var8; // L: 29
				boolean var15 = false; // L: 30
			} else {
				var10 = var1.charAt(var6++); // L: 32
			}

			var7 = class127.method2848(var9); // L: 33
			var8 = class127.method2848(var10); // L: 34
			var9 = FileSystem.standardizeChar(var9, var2); // L: 35
			var10 = FileSystem.standardizeChar(var10, var2); // L: 36
			if (var10 != var9 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) { // L: 37
				var9 = Character.toLowerCase(var9); // L: 38
				var10 = Character.toLowerCase(var10); // L: 39
				if (var10 != var9) { // L: 40
					return class137.lowercaseChar(var9, var2) - class137.lowercaseChar(var10, var2);
				}
			}
		}

		int var16 = Math.min(var3, var4); // L: 43

		char var12;
		int var17;
		for (var17 = 0; var17 < var16; ++var17) { // L: 44
			if (var2 == Language.Language_FR) { // L: 45
				var5 = var3 - 1 - var17; // L: 46
				var6 = var4 - 1 - var17; // L: 47
			} else {
				var6 = var17; // L: 49
				var5 = var17;
			}

			char var11 = var0.charAt(var5); // L: 50
			var12 = var1.charAt(var6); // L: 51
			if (var11 != var12 && Character.toUpperCase(var11) != Character.toUpperCase(var12)) { // L: 52
				var11 = Character.toLowerCase(var11); // L: 53
				var12 = Character.toLowerCase(var12); // L: 54
				if (var11 != var12) {
					return class137.lowercaseChar(var11, var2) - class137.lowercaseChar(var12, var2); // L: 55
				}
			}
		}

		var17 = var3 - var4; // L: 58
		if (var17 != 0) { // L: 59
			return var17;
		} else {
			for (int var18 = 0; var18 < var16; ++var18) { // L: 60
				var12 = var0.charAt(var18); // L: 61
				char var13 = var1.charAt(var18); // L: 62
				if (var12 != var13) { // L: 63
					return class137.lowercaseChar(var12, var2) - class137.lowercaseChar(var13, var2);
				}
			}

			return 0; // L: 65
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lkb;I)I",
		garbageValue = "1003329413"
	)
	static int method4947(Widget var0) {
		if (var0.type != 11) { // L: 1248
			Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1249
			return 1; // L: 1250
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1252
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var0.method5626(var1); // L: 1253
			return 1; // L: 1254
		}
	}
}
