import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ji")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1633027795
	)
	int field3308;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("patch")
	MusicPatch patch;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	MusicPatchNode2 field3306;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1595060947
	)
	int field3319;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1588715753
	)
	int field3307;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 694428029
	)
	int field3311;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1945733599
	)
	int field3312;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1493240557
	)
	int field3310;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1183801873
	)
	int field3309;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1743024279
	)
	int field3302;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 181824205
	)
	int field3313;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 883462029
	)
	int field3314;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -2130944147
	)
	int field3315;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1027674077
	)
	int field3316;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1108202467
	)
	int field3317;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 2110000655
	)
	int field3318;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 121475961
	)
	int field3304;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lah;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -2111788587
	)
	int field3321;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 378248553
	)
	int field3322;

	MusicPatchNode() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-115"
	)
	void method5316() {
		this.patch = null;
		this.rawSound = null; // L: 35
		this.field3306 = null;
		this.stream = null;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ldz;FB)F",
		garbageValue = "-47"
	)
	static float method5315(class117 var0, float var1) {
		if (var0 != null && var0.method2695() != 0) { // L: 18
			if (var1 < (float)var0.field1476[0].field1430) { // L: 21
				return var0.field1472 == class116.field1470 ? var0.field1476[0].field1428 : JagexCache.method3159(var0, var1, true); // L: 22 23 25
			} else if (var1 > (float)var0.field1476[var0.method2695() - 1].field1430) { // L: 27
				return var0.field1475 == class116.field1470 ? var0.field1476[var0.method2695() - 1].field1428 : JagexCache.method3159(var0, var1, false); // L: 28 29 31
			} else if (var0.field1487) { // L: 33
				return var0.field1476[0].field1428; // L: 34
			} else {
				class113 var2 = var0.method2707(var1); // L: 36
				boolean var3 = false; // L: 37
				boolean var4 = false; // L: 38
				if (var2 == null) { // L: 39
					return 0.0F; // L: 205
				} else {
					float var7;
					if ((double)var2.field1425 == 0.0D && 0.0D == (double)var2.field1426) { // L: 40
						var3 = true; // L: 41
					} else if (var2.field1425 == Float.MAX_VALUE && Float.MAX_VALUE == var2.field1426) { // L: 43
						var4 = true; // L: 44
					} else if (var2.field1427 != null) { // L: 46
						if (var0.field1482) { // L: 47
							float[] var5 = new float[4]; // L: 48
							float[] var6 = new float[4]; // L: 49
							var5[0] = (float)var2.field1430; // L: 50
							var6[0] = var2.field1428; // L: 51
							var5[1] = var2.field1425 * 0.33333334F + var5[0]; // L: 52
							var6[1] = var6[0] + 0.33333334F * var2.field1426; // L: 53
							var5[3] = (float)var2.field1427.field1430; // L: 54
							var6[3] = var2.field1427.field1428; // L: 55
							var5[2] = var5[3] - var2.field1427.field1423 * 0.33333334F; // L: 56
							var6[2] = var6[3] - var2.field1427.field1424 * 0.33333334F; // L: 57
							if (var0.field1477) { // L: 58
								if (var0 != null) { // L: 60
									var7 = var5[3] - var5[0]; // L: 63
									if ((double)var7 != 0.0D) { // L: 64
										float var8 = var5[1] - var5[0]; // L: 67
										float var9 = var5[2] - var5[0]; // L: 68
										Float var10 = var8 / var7; // L: 69
										Float var11 = var9 / var7; // L: 70
										var0.field1480 = var10 == 0.33333334F && var11 == 0.6666667F; // L: 71
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
												if (var16 + class114.field1435 > 0.0F) { // L: 85
													Float var18;
													if (var14 + class114.field1435 < 1.3333334F) { // L: 89
														float var19 = var14 - 2.0F; // L: 90
														float var20 = var14 - 1.0F; // L: 91
														float var21 = (float)Math.sqrt((double)(var19 * var19 - 4.0F * var20 * var20)); // L: 92
														float var22 = 0.5F * (var21 + -var19); // L: 93
														if (var15 + class114.field1435 > var22) { // L: 94
															var18 = var22 - class114.field1435; // L: 95
														} else {
															var22 = 0.5F * (-var19 - var21); // L: 98
															if (var15 < var22 + class114.field1435) { // L: 99
																var18 = var22 + class114.field1435; // L: 100
															}
														}
													} else {
														Float var17 = 1.3333334F - class114.field1435; // L: 105
														var18 = 0.33333334F - class114.field1435; // L: 106
													}
												}
											}

											var15 = 1.0F - var15; // L: 111
										}

										if (var10 != var12) { // L: 114
											var5[1] = var5[0] + var10 * var7; // L: 115
											if (0.0D != (double)var12) { // L: 116
												var6[1] = var6[0] + (var6[1] - var6[0]) * var10 / var12; // L: 117
											}
										}

										if (var11 != var13) { // L: 120
											var5[2] = var5[0] + var11 * var7; // L: 121
											if ((double)var13 != 1.0D) { // L: 122
												var6[2] = (float)((double)var6[3] - (double)(var6[3] - var6[2]) * (1.0D - (double)var11) / (1.0D - (double)var13)); // L: 123
											}
										}

										var0.field1478 = var5[0]; // L: 126
										var0.field1479 = var5[3]; // L: 127
										class341.method6090(0.0F, var10, var11, 1.0F, var0.field1473); // L: 128
										class341.method6090(var6[0], var6[1], var6[2], var6[3], var0.field1481); // L: 129
									}
								}
							} else {
								class113.method2623(var0, var5, var6); // L: 133
							}

							var0.field1482 = false; // L: 135
						}
					} else {
						var3 = true; // L: 139
					}

					if (var3) { // L: 141
						return var2.field1428; // L: 142
					} else if (var4) { // L: 144
						return (float)var2.field1430 != var1 && var2.field1427 != null ? var2.field1427.field1428 : var2.field1428; // L: 145 146 149
					} else {
						float var23;
						float var24;
						if (var0.field1477) { // L: 152
							if (var0 == null) { // L: 155
								var24 = 0.0F; // L: 156
							} else {
								if (var1 == var0.field1478) { // L: 160
									var23 = 0.0F; // L: 161
								} else if (var0.field1479 == var1) { // L: 163
									var23 = 1.0F; // L: 164
								} else {
									var23 = (var1 - var0.field1478) / (var0.field1479 - var0.field1478); // L: 167
								}

								if (var0.field1480) { // L: 170
									var7 = var23; // L: 171
								} else {
									float[] var25 = new float[]{var0.field1473[0] - var23, var0.field1473[1], var0.field1473[2], var0.field1473[3]}; // L: 174 175 176 177 178
									float[] var26 = new float[5]; // L: 179
									int var27 = GrandExchangeOfferAgeComparator.method5798(var25, 3, 0.0F, true, 1.0F, true, var26); // L: 180
									if (var27 == 1) { // L: 181
										var7 = var26[0]; // L: 182
									} else {
										var7 = 0.0F; // L: 185
									}
								}

								var24 = var0.field1481[0] + var7 * (var0.field1481[1] + (var7 * var0.field1481[3] + var0.field1481[2]) * var7); // L: 188
							}

							return var24; // L: 190
						} else {
							if (var0 == null) { // L: 195
								var24 = 0.0F; // L: 196
							} else {
								var23 = var1 - var0.field1478; // L: 199
								var24 = (var0.field1473[2] + var23 * (var0.field1473[0] * var23 + var0.field1473[1])) * var23 + var0.field1473[3]; // L: 200
							}

							return var24; // L: 202
						}
					}
				}
			}
		} else {
			return 0.0F; // L: 19
		}
	}
}
