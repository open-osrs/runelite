import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
public class class127 extends class126 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1638542091
	)
	int field1523;
	@ObfuscatedName("l")
	boolean field1520;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	final class129 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldk;)V"
	)
	class127(class129 var1) {
		this.this$0 = var1;
		this.field1523 = -1; // L: 178
	} // L: 181

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "703192976"
	)
	void vmethod3019(Buffer var1) {
		this.field1523 = var1.readUnsignedShort(); // L: 184
		this.field1520 = var1.readUnsignedByte() == 1; // L: 185
	} // L: 186

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ley;I)V",
		garbageValue = "750335300"
	)
	void vmethod3020(ClanSettings var1) {
		var1.method2883(this.field1523, this.field1520); // L: 189
	} // L: 190

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ldt;FB)F",
		garbageValue = "32"
	)
	static float method2767(class115 var0, float var1) {
		if (var0 != null && var0.method2617() != 0) { // L: 18
			if (var1 < (float)var0.field1430[0].field1377) { // L: 21
				return var0.field1422 == class114.field1408 ? var0.field1430[0].field1384 : LoginType.method7148(var0, var1, true); // L: 22 23 25
			} else if (var1 > (float)var0.field1430[var0.method2617() - 1].field1377) { // L: 27
				return var0.field1420 == class114.field1408 ? var0.field1430[var0.method2617() - 1].field1384 : LoginType.method7148(var0, var1, false); // L: 28 29 31
			} else if (var0.field1418) { // L: 33
				return var0.field1430[0].field1384; // L: 34
			} else {
				class111 var2 = var0.method2616(var1); // L: 36
				boolean var3 = false; // L: 37
				boolean var4 = false; // L: 38
				if (var2 == null) { // L: 39
					return 0.0F; // L: 137
				} else {
					if (0.0D == (double)var2.field1381 && (double)var2.field1378 == 0.0D) { // L: 40
						var3 = true; // L: 41
					} else if (Float.MAX_VALUE == var2.field1381 && Float.MAX_VALUE == var2.field1378) { // L: 43
						var4 = true; // L: 44
					} else if (var2.field1383 != null) { // L: 46
						if (var0.field1419) { // L: 47
							float[] var5 = new float[4]; // L: 48
							float[] var6 = new float[4]; // L: 49
							var5[0] = (float)var2.field1377; // L: 50
							var6[0] = var2.field1384; // L: 51
							var5[1] = var5[0] + var2.field1381 * 0.33333334F; // L: 52
							var6[1] = var6[0] + 0.33333334F * var2.field1378; // L: 53
							var5[3] = (float)var2.field1383.field1377; // L: 54
							var6[3] = var2.field1383.field1384; // L: 55
							var5[2] = var5[3] - 0.33333334F * var2.field1383.field1379; // L: 56
							var6[2] = var6[3] - 0.33333334F * var2.field1383.field1380; // L: 57
							if (var0.field1434) { // L: 58
								if (var0 != null) { // L: 60
									float var7 = var5[3] - var5[0]; // L: 63
									if ((double)var7 != 0.0D) { // L: 64
										float var8 = var5[1] - var5[0]; // L: 67
										float var9 = var5[2] - var5[0]; // L: 68
										Float var10 = var8 / var7; // L: 69
										Float var11 = var9 / var7; // L: 70
										var0.field1421 = var10 == 0.33333334F && var11 == 0.6666667F; // L: 71
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
												if (class112.field1386 + var16 > 0.0F) { // L: 85
													class12.method155(var14, var15); // L: 86
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

										var0.field1423 = var5[0]; // L: 104
										var0.field1424 = var5[3]; // L: 105
										class344.method6252(0.0F, var10, var11, 1.0F, var0.field1425); // L: 106
										class344.method6252(var6[0], var6[1], var6[2], var6[3], var0.field1426); // L: 107
									}
								}
							} else {
								class147.method2998(var0, var5, var6); // L: 111
							}

							var0.field1419 = false; // L: 113
						}
					} else {
						var3 = true; // L: 117
					}

					if (var3) { // L: 119
						return var2.field1384; // L: 120
					} else if (var4) { // L: 122
						return var1 != (float)var2.field1377 && var2.field1383 != null ? var2.field1383.field1384 : var2.field1384; // L: 123 124 127
					} else {
						return var0.field1434 ? class252.method4974(var0, var1) : SecureRandomFuture.method1973(var0, var1); // L: 130 131 134
					}
				}
			}
		} else {
			return 0.0F; // L: 19
		}
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1705912467"
	)
	static final void method2765(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) { // L: 8164
			if (Client.rootWidgetWidths[var4] + Client.rootWidgetXs[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetYs[var4] + Client.rootWidgetHeights[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) { // L: 8165
				Client.field714[var4] = true;
			}
		}

	} // L: 8167

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(Lcf;ZI)V",
		garbageValue = "-243703217"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group; // L: 11704
		int var3 = (int)var0.key; // L: 11705
		var0.remove(); // L: 11706
		if (var1) { // L: 11707
			MusicPatchNode.method5276(var2);
		}

		for (IntegerNode var4 = (IntegerNode)Client.widgetFlags.first(); var4 != null; var4 = (IntegerNode)Client.widgetFlags.next()) { // L: 11709
			if ((long)var2 == (var4.key >> 48 & 65535L)) { // L: 11710
				var4.remove(); // L: 11711
			}
		}

		Widget var5 = class130.getWidget(var3); // L: 11715
		if (var5 != null) { // L: 11716
			class112.invalidateWidget(var5);
		}

		FontName.decrementMenuEntries(); // L: 11717
		if (Client.rootInterface != -1) { // L: 11718
			DevicePcmPlayerProvider.runIntfCloseListeners(Client.rootInterface, 1);
		}

	} // L: 11719
}
