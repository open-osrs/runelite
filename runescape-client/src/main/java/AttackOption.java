import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
@Implements("AttackOption")
public enum AttackOption implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lcb;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lcb;"
	)
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lcb;"
	)
	field1273(2),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lcb;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lcb;"
	)
	field1279(4);

	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 22827639
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3; // L: 11979
	} // L: 11980

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "15"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 11984
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ldi;FB)F",
		garbageValue = "76"
	)
	static float method2392(class117 var0, float var1) {
		if (var0 != null && var0.method2706() != 0) { // L: 18
			if (var1 < (float)var0.field1430[0].field1384) { // L: 21
				return var0.field1428 == class116.field1420 ? var0.field1430[0].field1385 : class202.method4111(var0, var1, true); // L: 22 23 25
			} else if (var1 > (float)var0.field1430[var0.method2706() - 1].field1384) { // L: 27
				return var0.field1429 == class116.field1420 ? var0.field1430[var0.method2706() - 1].field1385 : class202.method4111(var0, var1, false); // L: 28 29 31
			} else if (var0.field1427) { // L: 33
				return var0.field1430[0].field1385; // L: 34
			} else {
				class113 var2 = var0.method2705(var1); // L: 36
				boolean var3 = false; // L: 37
				boolean var4 = false; // L: 38
				if (var2 == null) { // L: 39
					return 0.0F; // L: 157
				} else {
					if (0.0D == (double)var2.field1388 && 0.0D == (double)var2.field1389) { // L: 40
						var3 = true; // L: 41
					} else if (Float.MAX_VALUE == var2.field1388 && var2.field1389 == Float.MAX_VALUE) { // L: 43
						var4 = true; // L: 44
					} else if (var2.field1392 != null) { // L: 46
						if (var0.field1442) { // L: 47
							float[] var5 = new float[4]; // L: 48
							float[] var6 = new float[4]; // L: 49
							var5[0] = (float)var2.field1384; // L: 50
							var6[0] = var2.field1385; // L: 51
							var5[1] = var5[0] + var2.field1388 * 0.33333334F; // L: 52
							var6[1] = var2.field1389 * 0.33333334F + var6[0]; // L: 53
							var5[3] = (float)var2.field1392.field1384; // L: 54
							var6[3] = var2.field1392.field1385; // L: 55
							var5[2] = var5[3] - var2.field1392.field1386 * 0.33333334F; // L: 56
							var6[2] = var6[3] - 0.33333334F * var2.field1392.field1390; // L: 57
							float var7;
							float var8;
							float var9;
							float var12;
							float var13;
							if (var0.field1434) { // L: 58
								if (var0 != null) { // L: 60
									var7 = var5[3] - var5[0]; // L: 63
									if (0.0D != (double)var7) { // L: 64
										var8 = var5[1] - var5[0]; // L: 67
										var9 = var5[2] - var5[0]; // L: 68
										Float var15 = var8 / var7; // L: 69
										Float var16 = var9 / var7; // L: 70
										var0.field1438 = var15 == 0.33333334F && var16 == 0.6666667F; // L: 71
										var12 = var15; // L: 72
										var13 = var16; // L: 73
										if ((double)var15 < 0.0D) { // L: 74
											var15 = 0.0F;
										}

										if ((double)var16 > 1.0D) { // L: 75
											var16 = 1.0F;
										}

										if ((double)var15 > 1.0D || var16 < -1.0F) { // L: 76
											class11.method116(var15, var16); // L: 77
										}

										if (var15 != var12) { // L: 79
											var5[1] = var5[0] + var15 * var7; // L: 80
											if ((double)var12 != 0.0D) { // L: 81
												var6[1] = var6[0] + (var6[1] - var6[0]) * var15 / var12; // L: 82
											}
										}

										if (var16 != var13) { // L: 85
											var5[2] = var5[0] + var16 * var7; // L: 86
											if (1.0D != (double)var13) { // L: 87
												var6[2] = (float)((double)var6[3] - (double)(var6[3] - var6[2]) * (1.0D - (double)var16) / (1.0D - (double)var13)); // L: 88
											}
										}

										var0.field1432 = var5[0]; // L: 91
										var0.field1433 = var5[3]; // L: 92
										Frames.method4316(0.0F, var15, var16, 1.0F, var0.field1440); // L: 93
										Frames.method4316(var6[0], var6[1], var6[2], var6[3], var0.field1435); // L: 94
									}
								}
							} else if (var0 != null) { // L: 99
								var0.field1432 = var5[0]; // L: 102
								var7 = var5[3] - var5[0]; // L: 103
								var8 = var6[3] - var6[0]; // L: 104
								var9 = var5[1] - var5[0]; // L: 105
								float var10 = 0.0F; // L: 106
								float var11 = 0.0F; // L: 107
								if (0.0D != (double)var9) { // L: 108
									var10 = (var6[1] - var6[0]) / var9; // L: 109
								}

								var9 = var5[3] - var5[2]; // L: 111
								if (0.0D != (double)var9) { // L: 112
									var11 = (var6[3] - var6[2]) / var9; // L: 113
								}

								var12 = 1.0F / (var7 * var7); // L: 115
								var13 = var7 * var10; // L: 116
								float var14 = var11 * var7; // L: 117
								var0.field1440[0] = var12 * (var13 + var14 - var8 - var8) / var7; // L: 118
								var0.field1440[1] = var12 * (var8 + var8 + var8 - var13 - var13 - var14); // L: 119
								var0.field1440[2] = var10; // L: 120
								var0.field1440[3] = var6[0]; // L: 121
							}

							var0.field1442 = false; // L: 124
						}
					} else {
						var3 = true; // L: 128
					}

					if (var3) { // L: 130
						return var2.field1385; // L: 131
					} else if (var4) { // L: 133
						return (float)var2.field1384 != var1 && var2.field1392 != null ? var2.field1392.field1385 : var2.field1385; // L: 134 135 138
					} else if (var0.field1434) { // L: 141
						return VarbitComposition.method3555(var0, var1); // L: 142
					} else {
						float var18;
						if (var0 == null) { // L: 147
							var18 = 0.0F; // L: 148
						} else {
							float var17 = var1 - var0.field1432; // L: 151
							var18 = var0.field1440[3] + (var0.field1440[2] + var17 * (var0.field1440[1] + var0.field1440[0] * var17)) * var17; // L: 152
						}

						return var18; // L: 154
					}
				}
			}
		} else {
			return 0.0F; // L: 19
		}
	}
}
