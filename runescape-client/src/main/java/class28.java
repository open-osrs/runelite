import java.awt.FontMetrics;
import java.util.Date;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("aq")
public class class28 {
	@ObfuscatedName("g")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;
	@ObfuscatedName("am")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;

	static {
		ImageIO.setUseCache(false); // L: 12
	} // L: 13

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lko;B)V",
		garbageValue = "-86"
	)
	public static void method405(AbstractArchive var0) {
		StructComposition.StructDefinition_archive = var0; // L: 19
	} // L: 20

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lko;I)V",
		garbageValue = "1798732043"
	)
	public static void method400(AbstractArchive var0) {
		ParamComposition.ParamDefinition_archive = var0; // L: 21
	} // L: 22

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "-1720106594"
	)
	static char method399(char var0) {
		if (var0 == 198) { // L: 95
			return 'E';
		} else if (var0 == 230) { // L: 96
			return 'e';
		} else if (var0 == 223) {
			return 's'; // L: 97
		} else if (var0 == 338) { // L: 98
			return 'E';
		} else {
			return (char)(var0 == 339 ? 'e' : '\u0000'); // L: 99 100
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "765864146"
	)
	static int method401(int var0, Script var1, boolean var2) {
		String var3;
		int var9;
		if (var0 == ScriptOpcodes.APPEND_NUM) { // L: 3059
			var3 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]; // L: 3060
			var9 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 3061
			Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var3 + var9; // L: 3062
			return 1; // L: 3063
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) { // L: 3065
				class295.Interpreter_stringStackSize -= 2; // L: 3066
				var3 = Interpreter.Interpreter_stringStack[class295.Interpreter_stringStackSize]; // L: 3067
				var4 = Interpreter.Interpreter_stringStack[class295.Interpreter_stringStackSize + 1]; // L: 3068
				Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var3 + var4; // L: 3069
				return 1; // L: 3070
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) { // L: 3072
				var3 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]; // L: 3073
				var9 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 3074
				Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var3 + MusicPatchNode2.intToString(var9, true); // L: 3075
				return 1; // L: 3076
			} else if (var0 == ScriptOpcodes.LOWERCASE) { // L: 3078
				var3 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]; // L: 3079
				Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var3.toLowerCase(); // L: 3080
				return 1; // L: 3081
			} else {
				int var6;
				int var10;
				if (var0 == ScriptOpcodes.FROMDATE) { // L: 3083
					var10 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 3084
					long var13 = (11745L + (long)var10) * 86400000L; // L: 3085
					Interpreter.Interpreter_calendar.setTime(new Date(var13)); // L: 3086
					var6 = Interpreter.Interpreter_calendar.get(5); // L: 3087
					int var17 = Interpreter.Interpreter_calendar.get(2); // L: 3088
					int var8 = Interpreter.Interpreter_calendar.get(1); // L: 3089
					Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8; // L: 3090
					return 1; // L: 3091
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) { // L: 3093
					if (var0 == ScriptOpcodes.TOSTRING) { // L: 3101
						var10 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 3102
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = Integer.toString(var10); // L: 3103
						return 1; // L: 3104
					} else if (var0 == ScriptOpcodes.COMPARE) { // L: 3106
						class295.Interpreter_stringStackSize -= 2; // L: 3107
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = SecureRandomCallable.method2047(AttackOption.compareStrings(Interpreter.Interpreter_stringStack[class295.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[class295.Interpreter_stringStackSize + 1], MouseHandler.clientLanguage)); // L: 3108
						return 1; // L: 3109
					} else {
						int var5;
						byte[] var11;
						Font var12;
						if (var0 == ScriptOpcodes.PARAHEIGHT) { // L: 3111
							var3 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]; // L: 3112
							class14.Interpreter_intStackSize -= 2; // L: 3113
							var9 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 3114
							var5 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]; // L: 3115
							var11 = LoginScreenAnimation.archive13.takeFile(var5, 0); // L: 3116
							var12 = new Font(var11); // L: 3117
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var12.lineCount(var3, var9); // L: 3118
							return 1; // L: 3119
						} else if (var0 == ScriptOpcodes.PARAWIDTH) { // L: 3121
							var3 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]; // L: 3122
							class14.Interpreter_intStackSize -= 2; // L: 3123
							var9 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 3124
							var5 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]; // L: 3125
							var11 = LoginScreenAnimation.archive13.takeFile(var5, 0); // L: 3126
							var12 = new Font(var11); // L: 3127
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var12.lineWidth(var3, var9); // L: 3128
							return 1; // L: 3129
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) { // L: 3131
							class295.Interpreter_stringStackSize -= 2; // L: 3132
							var3 = Interpreter.Interpreter_stringStack[class295.Interpreter_stringStackSize]; // L: 3133
							var4 = Interpreter.Interpreter_stringStack[class295.Interpreter_stringStackSize + 1]; // L: 3134
							if (Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1) { // L: 3135
								Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var4; // L: 3136
							}

							return 1; // L: 3137
						} else if (var0 == ScriptOpcodes.ESCAPE) { // L: 3139
							var3 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]; // L: 3140
							Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3); // L: 3141
							return 1; // L: 3142
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) { // L: 3144
							var3 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]; // L: 3145
							var9 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 3146
							Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var3 + (char)var9; // L: 3147
							return 1; // L: 3148
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) { // L: 3150
							var10 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 3151
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Skills.isCharPrintable((char)var10) ? 1 : 0; // L: 3152
							return 1; // L: 3153
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) { // L: 3155
							var10 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 3156
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = ObjectComposition.isAlphaNumeric((char)var10) ? 1 : 0; // L: 3157
							return 1; // L: 3158
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) { // L: 3160
							var10 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 3161
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = SpriteMask.isCharAlphabetic((char)var10) ? 1 : 0; // L: 3162
							return 1; // L: 3163
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) { // L: 3165
							var10 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 3166
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class117.isDigit((char)var10) ? 1 : 0; // L: 3167
							return 1; // L: 3168
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) { // L: 3170
							var3 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]; // L: 3171
							if (var3 != null) { // L: 3172
								Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 3173
							}

							return 1; // L: 3174
						} else if (var0 == ScriptOpcodes.SUBSTRING) { // L: 3176
							var3 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]; // L: 3177
							class14.Interpreter_intStackSize -= 2; // L: 3178
							var9 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 3179
							var5 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]; // L: 3180
							Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var3.substring(var9, var5); // L: 3181
							return 1; // L: 3182
						} else if (var0 == ScriptOpcodes.REMOVETAGS) { // L: 3184
							var3 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]; // L: 3185
							StringBuilder var15 = new StringBuilder(var3.length()); // L: 3186
							boolean var16 = false; // L: 3187

							for (var6 = 0; var6 < var3.length(); ++var6) { // L: 3188
								char var7 = var3.charAt(var6); // L: 3189
								if (var7 == '<') { // L: 3190
									var16 = true;
								} else if (var7 == '>') { // L: 3191
									var16 = false;
								} else if (!var16) { // L: 3192
									var15.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var15.toString(); // L: 3194
							return 1; // L: 3195
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) { // L: 3197
							var3 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]; // L: 3198
							var9 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 3199
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.indexOf(var9); // L: 3200
							return 1; // L: 3201
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) { // L: 3203
							class295.Interpreter_stringStackSize -= 2; // L: 3204
							var3 = Interpreter.Interpreter_stringStack[class295.Interpreter_stringStackSize]; // L: 3205
							var4 = Interpreter.Interpreter_stringStack[class295.Interpreter_stringStackSize + 1]; // L: 3206
							var5 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 3207
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.indexOf(var4, var5); // L: 3208
							return 1; // L: 3209
						} else if (var0 == 4122) { // L: 3211
							var3 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]; // L: 3212
							Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var3.toUpperCase(); // L: 3213
							return 1; // L: 3214
						} else {
							return 2; // L: 3216
						}
					}
				} else {
					class295.Interpreter_stringStackSize -= 2; // L: 3094
					var3 = Interpreter.Interpreter_stringStack[class295.Interpreter_stringStackSize]; // L: 3095
					var4 = Interpreter.Interpreter_stringStack[class295.Interpreter_stringStackSize + 1]; // L: 3096
					if (HealthBarDefinition.localPlayer.appearance != null && HealthBarDefinition.localPlayer.appearance.isFemale) { // L: 3097
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var4;
					} else {
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var3; // L: 3098
					}

					return 1; // L: 3099
				}
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "-320587085"
	)
	static int method402(int var0, Script var1, boolean var2) {
		if (var0 >= 7200 && var0 < 7204) { // L: 4432
			class14.Interpreter_intStackSize -= 5; // L: 4433
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1; // L: 4434
			return 1; // L: 4435
		} else if (var0 == 7204) { // L: 4437
			class14.Interpreter_intStackSize -= 6; // L: 4438
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1; // L: 4439
			return 1; // L: 4440
		} else if (var0 >= 7205 && var0 < 7209) { // L: 4442
			Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize - 1] = -1; // L: 4443
			return 1; // L: 4444
		} else if (var0 == 7209) { // L: 4446
			class14.Interpreter_intStackSize -= 2; // L: 4447
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1; // L: 4448
			return 1; // L: 4449
		} else if (var0 >= 7210 && var0 < 7214) { // L: 4451
			--class14.Interpreter_intStackSize; // L: 4452
			return 1; // L: 4453
		} else if (var0 == 7214) { // L: 4455
			class14.Interpreter_intStackSize -= 2; // L: 4456
			return 1; // L: 4457
		} else {
			return 2; // L: 4459
		}
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "644552433"
	)
	static final int method404() {
		if (class408.clientPreferences.roofsHidden) { // L: 5121
			return GrandExchangeOfferTotalQuantityComparator.Client_plane;
		} else {
			int var0 = class392.getTileHeight(WorldMapSectionType.cameraX, class65.cameraZ, GrandExchangeOfferTotalQuantityComparator.Client_plane); // L: 5122
			return var0 - class174.cameraY < 800 && (Tiles.Tiles_renderFlags[GrandExchangeOfferTotalQuantityComparator.Client_plane][WorldMapSectionType.cameraX >> 7][class65.cameraZ >> 7] & 4) != 0 ? GrandExchangeOfferTotalQuantityComparator.Client_plane : 3; // L: 5123 5124
		}
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "([Ljf;IIIIIIIII)V",
		garbageValue = "-973397916"
	)
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9693
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 9694

		for (int var9 = 0; var9 < var0.length; ++var9) { // L: 9695
			Widget var10 = var0[var9]; // L: 9696
			if (var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.clickedWidget)) { // L: 9697 9698
				int var11;
				if (var8 == -1) { // L: 9700
					Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6; // L: 9701
					Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y; // L: 9702
					Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width; // L: 9703
					Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height; // L: 9704
					var11 = ++Client.rootWidgetCount - 1; // L: 9705
				} else {
					var11 = var8; // L: 9707
				}

				var10.rootIndex = var11; // L: 9708
				var10.cycle = Client.cycle; // L: 9709
				if (!var10.isIf3 || !Varcs.isComponentHidden(var10)) { // L: 9710
					if (var10.contentType > 0) { // L: 9711
						class137.method2826(var10);
					}

					int var12 = var10.x + var6; // L: 9712
					int var13 = var7 + var10.y; // L: 9713
					int var14 = var10.transparencyTop; // L: 9714
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) { // L: 9715
						if (var1 != -1412584499 && !var10.isScrollBar) { // L: 9716
							NPC.field1207 = var0; // L: 9717
							Varcs.field1263 = var6; // L: 9718
							class150.field1604 = var7; // L: 9719
							continue; // L: 9720
						}

						if (Client.isDraggingWidget && Client.field648) { // L: 9722
							var15 = MouseHandler.MouseHandler_x; // L: 9723
							var16 = MouseHandler.MouseHandler_y; // L: 9724
							var15 -= Client.widgetClickX; // L: 9725
							var16 -= Client.widgetClickY; // L: 9726
							if (var15 < Client.field649) { // L: 9727
								var15 = Client.field649;
							}

							if (var15 + var10.width > Client.field649 + Client.clickedWidgetParent.width) { // L: 9728
								var15 = Client.field649 + Client.clickedWidgetParent.width - var10.width;
							}

							if (var16 < Client.field650) { // L: 9729
								var16 = Client.field650;
							}

							if (var16 + var10.height > Client.field650 + Client.clickedWidgetParent.height) { // L: 9730
								var16 = Client.field650 + Client.clickedWidgetParent.height - var10.height;
							}

							var12 = var15; // L: 9731
							var13 = var16; // L: 9732
						}

						if (!var10.isScrollBar) { // L: 9734
							var14 = 128;
						}
					}

					int var17;
					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.type == 2) { // L: 9740
						var15 = var2; // L: 9741
						var16 = var3; // L: 9742
						var17 = var4; // L: 9743
						var18 = var5; // L: 9744
					} else if (var10.type == 9) { // L: 9746
						var19 = var12; // L: 9747
						var20 = var13; // L: 9748
						var21 = var12 + var10.width; // L: 9749
						var22 = var13 + var10.height; // L: 9750
						if (var21 < var12) { // L: 9751
							var19 = var21; // L: 9753
							var21 = var12; // L: 9754
						}

						if (var22 < var13) { // L: 9756
							var20 = var22; // L: 9758
							var22 = var13; // L: 9759
						}

						++var21; // L: 9761
						++var22; // L: 9762
						var15 = var19 > var2 ? var19 : var2; // L: 9763
						var16 = var20 > var3 ? var20 : var3; // L: 9764
						var17 = var21 < var4 ? var21 : var4; // L: 9765
						var18 = var22 < var5 ? var22 : var5; // L: 9766
					} else {
						var19 = var12 + var10.width; // L: 9769
						var20 = var13 + var10.height; // L: 9770
						var15 = var12 > var2 ? var12 : var2; // L: 9771
						var16 = var13 > var3 ? var13 : var3; // L: 9772
						var17 = var19 < var4 ? var19 : var4; // L: 9773
						var18 = var20 < var5 ? var20 : var5; // L: 9774
					}

					if (!var10.isIf3 || var15 < var17 && var16 < var18) { // L: 9776
						if (var10.contentType != 0) { // L: 9777
							if (var10.contentType == 1336) { // L: 9778
								if (Client.displayFps) { // L: 9779
									var13 += 15; // L: 9780
									class6.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1); // L: 9781
									var13 += 15; // L: 9782
									Runtime var42 = Runtime.getRuntime(); // L: 9783
									var20 = (int)((var42.totalMemory() - var42.freeMemory()) / 1024L); // L: 9784
									var21 = 16776960; // L: 9785
									if (var20 > 327680 && !Client.isLowDetail) { // L: 9786
										var21 = 16711680;
									}

									class6.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1); // L: 9787
									var13 += 15; // L: 9788
								}
								continue;
							}

							if (var10.contentType == 1337) { // L: 9792
								Client.viewportX = var12; // L: 9793
								Client.viewportY = var13; // L: 9794
								Projectile.drawEntities(var12, var13, var10.width, var10.height); // L: 9795
								Client.field594[var10.rootIndex] = true; // L: 9796
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9797
								continue; // L: 9798
							}

							if (var10.contentType == 1338) { // L: 9800
								WallDecoration.drawMinimap(var10, var12, var13, var11); // L: 9801
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9802
								continue; // L: 9803
							}

							if (var10.contentType == 1339) { // L: 9805
								GameObject.drawCompass(var10, var12, var13, var11); // L: 9806
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9807
								continue; // L: 9808
							}

							if (var10.contentType == 1400) { // L: 9810
								class133.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle); // L: 9811
							}

							if (var10.contentType == 1401) { // L: 9813
								class133.worldMap.drawOverview(var12, var13, var10.width, var10.height); // L: 9814
							}

							if (var10.contentType == 1402) { // L: 9816
								Login.loginScreenRunesAnimation.draw(var12, Client.cycle); // L: 9817
							}
						}

						if (var10.type == 0) { // L: 9820
							if (!var10.isIf3 && Varcs.isComponentHidden(var10) && var10 != WorldMapData_0.mousedOverWidgetIf1) { // L: 9821
								continue;
							}

							if (!var10.isIf3) { // L: 9822
								if (var10.scrollY > var10.scrollHeight - var10.height) { // L: 9823
									var10.scrollY = var10.scrollHeight - var10.height;
								}

								if (var10.scrollY < 0) { // L: 9824
									var10.scrollY = 0;
								}
							}

							drawInterface(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11); // L: 9826
							if (var10.children != null) { // L: 9827
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							InterfaceParent var30 = (InterfaceParent)Client.interfaceParents.get((long)var10.id); // L: 9828
							if (var30 != null) { // L: 9829
								HorizontalAlignment.drawWidgets(var30.group, var15, var16, var17, var18, var12, var13, var11); // L: 9830
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9832
							Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 9833
						}

						if (Client.isResizable || Client.field651[var11] || Client.gameDrawingMode > 1) { // L: 9835
							if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) { // L: 9836 9837
								class92.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
							}

							if (var10.type != 1) { // L: 9839
								int var23;
								int var24;
								int var25;
								int var26;
								if (var10.type == 2) { // L: 9842
									var19 = 0; // L: 9843

									for (var20 = 0; var20 < var10.rawHeight; ++var20) { // L: 9844
										for (var21 = 0; var21 < var10.rawWidth; ++var21) { // L: 9845
											var22 = var12 + var21 * (var10.paddingX + 32); // L: 9846
											var23 = var13 + var20 * (var10.paddingY + 32); // L: 9847
											if (var19 < 20) { // L: 9848
												var22 += var10.inventoryXOffsets[var19]; // L: 9849
												var23 += var10.inventoryYOffsets[var19]; // L: 9850
											}

											if (var10.itemIds[var19] <= 0) { // L: 9852
												if (var10.inventorySprites != null && var19 < 20) { // L: 9897
													SpritePixels var46 = var10.getInventorySprite(var19); // L: 9898
													if (var46 != null) { // L: 9899
														var46.drawTransBgAt(var22, var23);
													} else if (Widget.field3049) { // L: 9900
														class184.invalidateWidget(var10);
													}
												}
											} else {
												boolean var37 = false; // L: 9853
												boolean var38 = false; // L: 9854
												var26 = var10.itemIds[var19] - 1; // L: 9855
												if (var22 + 32 > var2 && var22 < var4 && var23 + 32 > var3 && var23 < var5 || var10 == class247.dragInventoryWidget && var19 == Client.dragItemSlotSource) { // L: 9856
													SpritePixels var35;
													if (Client.isItemSelected == 1 && var19 == ReflectionCheck.selectedItemSlot && var10.id == MouseHandler.selectedItemWidget) { // L: 9858
														var35 = class117.getItemSprite(var26, var10.itemQuantities[var19], 2, 0, 2, false);
													} else {
														var35 = class117.getItemSprite(var26, var10.itemQuantities[var19], 1, 3153952, 2, false); // L: 9859
													}

													if (var35 != null) { // L: 9860
														if (var10 == class247.dragInventoryWidget && var19 == Client.dragItemSlotSource) { // L: 9861
															var24 = MouseHandler.MouseHandler_x - Client.draggedWidgetX; // L: 9862
															var25 = MouseHandler.MouseHandler_y - Client.draggedWidgetY; // L: 9863
															if (var24 < 5 && var24 > -5) { // L: 9864
																var24 = 0;
															}

															if (var25 < 5 && var25 > -5) { // L: 9865
																var25 = 0;
															}

															if (Client.itemDragDuration < 5) { // L: 9866
																var24 = 0; // L: 9867
																var25 = 0; // L: 9868
															}

															var35.drawTransAt(var24 + var22, var25 + var23, 128); // L: 9870
															if (var1 != -1) { // L: 9871
																Widget var28 = var0[var1 & 65535]; // L: 9872
																int var29;
																if (var23 + var25 < Rasterizer2D.Rasterizer2D_yClipStart && var28.scrollY > 0) { // L: 9873
																	var29 = (Rasterizer2D.Rasterizer2D_yClipStart - var23 - var25) * Client.field531 / 3; // L: 9874
																	if (var29 > Client.field531 * 10) { // L: 9875
																		var29 = Client.field531 * 10;
																	}

																	if (var29 > var28.scrollY) { // L: 9876
																		var29 = var28.scrollY;
																	}

																	var28.scrollY -= var29; // L: 9877
																	Client.draggedWidgetY += var29; // L: 9878
																	class184.invalidateWidget(var28); // L: 9879
																}

																if (var25 + var23 + 32 > Rasterizer2D.Rasterizer2D_yClipEnd && var28.scrollY < var28.scrollHeight - var28.height) { // L: 9881
																	var29 = (var23 + var25 + 32 - Rasterizer2D.Rasterizer2D_yClipEnd) * Client.field531 / 3; // L: 9882
																	if (var29 > Client.field531 * 10) { // L: 9883
																		var29 = Client.field531 * 10;
																	}

																	if (var29 > var28.scrollHeight - var28.height - var28.scrollY) { // L: 9884
																		var29 = var28.scrollHeight - var28.height - var28.scrollY;
																	}

																	var28.scrollY += var29; // L: 9885
																	Client.draggedWidgetY -= var29; // L: 9886
																	class184.invalidateWidget(var28); // L: 9887
																}
															}
														} else if (var10 == WorldMapSection2.field2037 && var19 == Client.field577) { // L: 9891
															var35.drawTransAt(var22, var23, 128);
														} else {
															var35.drawTransBgAt(var22, var23); // L: 9892
														}
													} else {
														class184.invalidateWidget(var10); // L: 9894
													}
												}
											}

											++var19; // L: 9902
										}
									}
								} else if (var10.type == 3) { // L: 9907
									if (class128.runCs1(var10)) { // L: 9909
										var19 = var10.color2; // L: 9910
										if (var10 == WorldMapData_0.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) { // L: 9911
											var19 = var10.mouseOverColor2;
										}
									} else {
										var19 = var10.color; // L: 9914
										if (var10 == WorldMapData_0.mousedOverWidgetIf1 && var10.mouseOverColor != 0) { // L: 9915
											var19 = var10.mouseOverColor;
										}
									}

									if (var10.fill) { // L: 9917
										switch(var10.fillMode.field4379) { // L: 9918
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2); // L: 9920
											break; // L: 9921
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255)); // L: 9923
											break; // L: 9924
										default:
											if (var14 == 0) { // L: 9926
												Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var19);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 9927
											}
										}
									} else if (var14 == 0) { // L: 9932
										Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width, var10.height, var19);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 9933
									}
								} else {
									Font var39;
									if (var10.type == 4) { // L: 9937
										var39 = var10.getFont(); // L: 9938
										if (var39 == null) { // L: 9939
											if (Widget.field3049) { // L: 9940
												class184.invalidateWidget(var10);
											}
										} else {
											String var44 = var10.text; // L: 9944
											if (class128.runCs1(var10)) { // L: 9945
												var20 = var10.color2; // L: 9946
												if (var10 == WorldMapData_0.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) { // L: 9947
													var20 = var10.mouseOverColor2;
												}

												if (var10.text2.length() > 0) { // L: 9948
													var44 = var10.text2;
												}
											} else {
												var20 = var10.color; // L: 9951
												if (var10 == WorldMapData_0.mousedOverWidgetIf1 && var10.mouseOverColor != 0) { // L: 9952
													var20 = var10.mouseOverColor;
												}
											}

											if (var10.isIf3 && var10.itemId != -1) { // L: 9954
												ItemComposition var45 = TaskHandler.ItemDefinition_get(var10.itemId); // L: 9955
												var44 = var45.name; // L: 9956
												if (var44 == null) { // L: 9957
													var44 = "null";
												}

												if ((var45.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) { // L: 9958
													var44 = MouseHandler.colorStartTag(16748608) + var44 + "</col>" + " " + 'x' + Tiles.formatItemStacks(var10.itemQuantity);
												}
											}

											if (var10 == Client.meslayerContinueWidget) { // L: 9960
												var44 = "Please wait..."; // L: 9961
												var20 = var10.color; // L: 9962
											}

											if (!var10.isIf3) { // L: 9964
												var44 = GrandExchangeEvent.method5449(var44, var10);
											}

											var39.drawLines(var44, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, var10.textXAlignment, var10.textYAlignment, var10.textLineHeight); // L: 9965
										}
									} else if (var10.type == 5) { // L: 9968
										SpritePixels var40;
										if (!var10.isIf3) { // L: 9969
											var40 = var10.getSprite(class128.runCs1(var10)); // L: 9970
											if (var40 != null) { // L: 9971
												var40.drawTransBgAt(var12, var13);
											} else if (Widget.field3049) { // L: 9972
												class184.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != -1) { // L: 9976
												var40 = class117.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var40 = var10.getSprite(false); // L: 9977
											}

											if (var40 == null) { // L: 9978
												if (Widget.field3049) { // L: 10002
													class184.invalidateWidget(var10);
												}
											} else {
												var20 = var40.width; // L: 9979
												var21 = var40.height; // L: 9980
												if (!var10.spriteTiling) { // L: 9981
													var22 = var10.width * 4096 / var20; // L: 9995
													if (var10.spriteAngle != 0) { // L: 9996
														var40.method7445(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
													} else if (var14 != 0) { // L: 9997
														var40.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
													} else if (var20 == var10.width && var21 == var10.height) { // L: 9998
														var40.drawTransBgAt(var12, var13); // L: 9999
													} else {
														var40.drawScaledAt(var12, var13, var10.width, var10.height);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height); // L: 9982
													var22 = (var20 - 1 + var10.width) / var20; // L: 9983
													var23 = (var21 - 1 + var10.height) / var21; // L: 9984

													for (var24 = 0; var24 < var22; ++var24) { // L: 9985
														for (var25 = 0; var25 < var23; ++var25) { // L: 9986
															if (var10.spriteAngle != 0) { // L: 9987
																var40.method7445(var20 / 2 + var12 + var24 * var20, var21 / 2 + var13 + var21 * var25, var10.spriteAngle, 4096);
															} else if (var14 != 0) { // L: 9988
																var40.drawTransAt(var12 + var24 * var20, var13 + var21 * var25, 256 - (var14 & 255));
															} else {
																var40.drawTransBgAt(var12 + var20 * var24, var13 + var21 * var25); // L: 9989
															}
														}
													}

													Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9992
												}
											}
										}
									} else {
										ItemComposition var33;
										if (var10.type == 6) { // L: 10006
											boolean var36 = class128.runCs1(var10); // L: 10007
											if (var36) { // L: 10009
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId; // L: 10010
											}

											Model var41 = null; // L: 10011
											var22 = 0; // L: 10012
											if (var10.itemId != -1) { // L: 10013
												var33 = TaskHandler.ItemDefinition_get(var10.itemId); // L: 10014
												if (var33 != null) { // L: 10015
													var33 = var33.getCountObj(var10.itemQuantity); // L: 10016
													var41 = var33.getModel(1); // L: 10017
													if (var41 != null) { // L: 10018
														var41.calculateBoundsCylinder(); // L: 10019
														var22 = var41.height / 2; // L: 10020
													} else {
														class184.invalidateWidget(var10); // L: 10022
													}
												}
											} else if (var10.modelType == 5) { // L: 10025
												if (var10.modelId == 0) { // L: 10026
													var41 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var41 = HealthBarDefinition.localPlayer.getModel(); // L: 10027
												}
											} else if (var20 == -1) { // L: 10029
												var41 = var10.getModel((SequenceDefinition)null, -1, var36, HealthBarDefinition.localPlayer.appearance); // L: 10030
												if (var41 == null && Widget.field3049) { // L: 10031
													class184.invalidateWidget(var10);
												}
											} else {
												SequenceDefinition var47 = MouseHandler.SequenceDefinition_get(var20); // L: 10034
												var41 = var10.getModel(var47, var10.modelFrame, var36, HealthBarDefinition.localPlayer.appearance); // L: 10035
												if (var41 == null && Widget.field3049) { // L: 10036
													class184.invalidateWidget(var10);
												}
											}

											Rasterizer3D.method4205(var10.width / 2 + var12, var10.height / 2 + var13); // L: 10038
											var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10039
											var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10040
											if (var41 != null) { // L: 10041
												if (!var10.isIf3) { // L: 10042
													var41.method4539(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
												} else {
													var41.calculateBoundsCylinder(); // L: 10044
													if (var10.modelOrthog) { // L: 10045
														var41.method4525(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
													} else {
														var41.method4539(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY); // L: 10046
													}
												}
											}

											Rasterizer3D.Rasterizer3D_method3(); // L: 10049
										} else {
											if (var10.type == 7) { // L: 10052
												var39 = var10.getFont(); // L: 10053
												if (var39 == null) { // L: 10054
													if (Widget.field3049) { // L: 10055
														class184.invalidateWidget(var10);
													}
													continue;
												}

												var20 = 0; // L: 10058

												for (var21 = 0; var21 < var10.rawHeight; ++var21) { // L: 10059
													for (var22 = 0; var22 < var10.rawWidth; ++var22) { // L: 10060
														if (var10.itemIds[var20] > 0) { // L: 10061
															var33 = TaskHandler.ItemDefinition_get(var10.itemIds[var20] - 1); // L: 10062
															String var34;
															if (var33.isStackable != 1 && var10.itemQuantities[var20] == 1) { // L: 10064
																var34 = MouseHandler.colorStartTag(16748608) + var33.name + "</col>"; // L: 10065
															} else {
																var34 = MouseHandler.colorStartTag(16748608) + var33.name + "</col>" + " " + 'x' + Tiles.formatItemStacks(var10.itemQuantities[var20]);
															}

															var25 = var12 + var22 * (var10.paddingX + 115); // L: 10066
															var26 = var13 + (var10.paddingY + 12) * var21; // L: 10067
															if (var10.textXAlignment == 0) { // L: 10068
																var39.draw(var34, var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else if (var10.textXAlignment == 1) { // L: 10069
																var39.drawCentered(var34, var10.width / 2 + var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else {
																var39.drawRightAligned(var34, var25 + var10.width - 1, var26, var10.color, var10.textShadowed ? 0 : -1); // L: 10070
															}
														}

														++var20; // L: 10072
													}
												}
											}

											if (var10.type == 8 && var10 == Skills.field3247 && Client.field621 == Client.field714) { // L: 10076 10077
												var19 = 0; // L: 10078
												var20 = 0; // L: 10079
												Font var31 = class6.fontPlain12; // L: 10080
												String var32 = var10.text; // L: 10081

												String var43;
												for (var32 = GrandExchangeEvent.method5449(var32, var10); var32.length() > 0; var20 = var20 + var31.ascent + 1) { // L: 10083 10084 10096
													var24 = var32.indexOf("<br>"); // L: 10085
													if (var24 != -1) { // L: 10086
														var43 = var32.substring(0, var24); // L: 10087
														var32 = var32.substring(var24 + 4); // L: 10088
													} else {
														var43 = var32; // L: 10091
														var32 = ""; // L: 10092
													}

													var25 = var31.stringWidth(var43); // L: 10094
													if (var25 > var19) { // L: 10095
														var19 = var25;
													}
												}

												var19 += 6; // L: 10098
												var20 += 7; // L: 10099
												var24 = var12 + var10.width - 5 - var19; // L: 10100
												var25 = var13 + var10.height + 5; // L: 10101
												if (var24 < var12 + 5) { // L: 10102
													var24 = var12 + 5;
												}

												if (var24 + var19 > var4) { // L: 10103
													var24 = var4 - var19;
												}

												if (var25 + var20 > var5) { // L: 10104
													var25 = var5 - var20;
												}

												Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120); // L: 10105
												Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0); // L: 10106
												var32 = var10.text; // L: 10107
												var26 = var25 + var31.ascent + 2; // L: 10108

												for (var32 = GrandExchangeEvent.method5449(var32, var10); var32.length() > 0; var26 = var26 + var31.ascent + 1) { // L: 10109 10110 10121
													int var27 = var32.indexOf("<br>"); // L: 10111
													if (var27 != -1) { // L: 10112
														var43 = var32.substring(0, var27); // L: 10113
														var32 = var32.substring(var27 + 4); // L: 10114
													} else {
														var43 = var32; // L: 10117
														var32 = ""; // L: 10118
													}

													var31.draw(var43, var24 + 3, var26, 0, -1); // L: 10120
												}
											}

											if (var10.type == 9) { // L: 10125
												if (var10.field3085) { // L: 10130
													var19 = var12; // L: 10131
													var20 = var13 + var10.height; // L: 10132
													var21 = var12 + var10.width; // L: 10133
													var22 = var13; // L: 10134
												} else {
													var19 = var12; // L: 10137
													var20 = var13; // L: 10138
													var21 = var12 + var10.width; // L: 10139
													var22 = var13 + var10.height; // L: 10140
												}

												if (var10.lineWid == 1) { // L: 10142
													Rasterizer2D.Rasterizer2D_drawLine(var19, var20, var21, var22, var10.color); // L: 10143
												} else {
													class392.method6872(var19, var20, var21, var22, var10.color, var10.lineWid); // L: 10146
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

	} // L: 10151
}
