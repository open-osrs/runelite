import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ir")
public class class243 {
	@ObfuscatedName("g")
	@Export("SpriteBuffer_xOffsets")
	public static int[] SpriteBuffer_xOffsets;
	@ObfuscatedName("e")
	@Export("cacheParentPaths")
	static String[] cacheParentPaths;

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lcp;III)V",
		garbageValue = "1435442863"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args; // L: 110
		Script var4;
		int var19;
		if (class369.isWorldMapEvent(var0.type)) { // L: 112
			class257.worldMapEvent = (WorldMapEvent)var3[0]; // L: 113
			WorldMapElement var5 = WorldMapAreaData.WorldMapElement_get(class257.worldMapEvent.mapElement); // L: 114
			var4 = SceneTilePaint.getWorldMapScript(var0.type, var5.objectId, var5.category); // L: 115
		} else {
			var19 = (Integer)var3[0]; // L: 118
			var4 = ItemComposition.getScript(var19); // L: 119
		}

		if (var4 != null) { // L: 121
			WorldMapCacheName.Interpreter_intStackSize = 0; // L: 124
			class13.Interpreter_stringStackSize = 0; // L: 125
			var19 = -1; // L: 126
			int[] var6 = var4.opcodes; // L: 127
			int[] var7 = var4.intOperands; // L: 128
			byte var8 = -1; // L: 129
			Interpreter.Interpreter_frameDepth = 0; // L: 130
			Interpreter.field950 = false; // L: 131
			boolean var9 = false; // L: 132
			int var10 = 0; // L: 133

			try {
				int var13;
				try {
					ScriptFrame.Interpreter_intLocals = new int[var4.localIntCount]; // L: 135
					int var11 = 0; // L: 136
					Interpreter.Interpreter_stringLocals = new String[var4.localStringCount]; // L: 137
					int var12 = 0; // L: 138

					int var14;
					String var20;
					for (var13 = 1; var13 < var3.length; ++var13) { // L: 139
						if (var3[var13] instanceof Integer) { // L: 140
							var14 = (Integer)var3[var13]; // L: 141
							if (var14 == -2147483647) { // L: 142
								var14 = var0.mouseX;
							}

							if (var14 == -2147483646) { // L: 143
								var14 = var0.mouseY;
							}

							if (var14 == -2147483645) { // L: 144
								var14 = var0.widget != null ? var0.widget.id * 1657404511 * 976969631 : -1;
							}

							if (var14 == -2147483644) { // L: 145
								var14 = var0.opIndex;
							}

							if (var14 == -2147483643) { // L: 146
								var14 = var0.widget != null ? var0.widget.childIndex * -698732553 * 339820999 : -1;
							}

							if (var14 == -2147483642) { // L: 147
								var14 = var0.dragTarget != null ? var0.dragTarget.id * 1657404511 * 976969631 : -1;
							}

							if (var14 == -2147483641) { // L: 148
								var14 = var0.dragTarget != null ? var0.dragTarget.childIndex * -698732553 * 339820999 : -1;
							}

							if (var14 == -2147483640) { // L: 149
								var14 = var0.keyTyped;
							}

							if (var14 == -2147483639) { // L: 150
								var14 = var0.keyPressed;
							}

							ScriptFrame.Interpreter_intLocals[var11++] = var14; // L: 151
						} else if (var3[var13] instanceof String) { // L: 153
							var20 = (String)var3[var13]; // L: 154
							if (var20.equals("event_opbase")) { // L: 155
								var20 = var0.targetName;
							}

							Interpreter.Interpreter_stringLocals[var12++] = var20; // L: 156
						}
					}

					Interpreter.field956 = var0.field1140; // L: 160

					while (true) {
						++var10; // L: 162
						if (var10 > var1) { // L: 163
							throw new RuntimeException();
						}

						++var19; // L: 164
						int var31 = var6[var19];
						if (var31 >= 100) { // L: 165
							boolean var32;
							if (var4.intOperands[var19] == 1) { // L: 383
								var32 = true;
							} else {
								var32 = false; // L: 384
							}

							var14 = WorldMapLabelSize.method3158(var31, var4, var32); // L: 385
							switch(var14) { // L: 386
							case 0:
								return;
							case 1:
							default:
								break;
							case 2:
								throw new IllegalStateException(); // L: 391
							}
						} else if (var31 == 0) { // L: 166
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var7[var19]; // L: 167
						} else if (var31 == ScriptOpcodes.GET_VARP) { // L: 170
							var13 = var7[var19]; // L: 171
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Varps.Varps_main[var13]; // L: 172
						} else if (var31 == ScriptOpcodes.SET_VARP) { // L: 175
							var13 = var7[var19]; // L: 176
							Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 177
							WorldMapData_0.changeGameOptions(var13); // L: 178
						} else if (var31 == ScriptOpcodes.SCONST) { // L: 181
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4.stringOperands[var19]; // L: 182
						} else if (var31 == ScriptOpcodes.JUMP) { // L: 185
							var19 += var7[var19]; // L: 186
						} else if (var31 == ScriptOpcodes.IF_ICMPNE) { // L: 189
							WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 190
							if (Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]) { // L: 191
								var19 += var7[var19];
							}
						} else if (var31 == ScriptOpcodes.IF_ICMPEQ) { // L: 194
							WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 195
							if (Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]) { // L: 196
								var19 += var7[var19];
							}
						} else if (var31 == ScriptOpcodes.IF_ICMPLT) { // L: 199
							WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 200
							if (Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]) { // L: 201
								var19 += var7[var19];
							}
						} else if (var31 == ScriptOpcodes.IF_ICMPGT) { // L: 204
							WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 205
							if (Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]) { // L: 206
								var19 += var7[var19];
							}
						} else if (var31 == ScriptOpcodes.RETURN) { // L: 209
							if (Interpreter.Interpreter_frameDepth == 0) { // L: 210
								return; // L: 417
							}

							ScriptFrame var37 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth]; // L: 211
							var4 = var37.script; // L: 212
							var6 = var4.opcodes; // L: 213
							var7 = var4.intOperands; // L: 214
							var19 = var37.pc; // L: 215
							ScriptFrame.Interpreter_intLocals = var37.intLocals; // L: 216
							Interpreter.Interpreter_stringLocals = var37.stringLocals; // L: 217
						} else if (var31 == ScriptOpcodes.GET_VARBIT) { // L: 220
							var13 = var7[var19]; // L: 221
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ObjectComposition.getVarbit(var13); // L: 222
						} else if (var31 == ScriptOpcodes.SET_VARBIT) { // L: 225
							var13 = var7[var19]; // L: 226
							WorldMapRegion.method3397(var13, Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]); // L: 227
						} else if (var31 == ScriptOpcodes.IF_ICMPLE) { // L: 230
							WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 231
							if (Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]) { // L: 232
								var19 += var7[var19];
							}
						} else if (var31 == ScriptOpcodes.IF_ICMPGE) { // L: 235
							WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 236
							if (Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]) { // L: 237
								var19 += var7[var19];
							}
						} else if (var31 == ScriptOpcodes.ILOAD) { // L: 240
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ScriptFrame.Interpreter_intLocals[var7[var19]]; // L: 241
						} else if (var31 == ScriptOpcodes.ISTORE) { // L: 244
							ScriptFrame.Interpreter_intLocals[var7[var19]] = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 245
						} else if (var31 == ScriptOpcodes.SLOAD) { // L: 248
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = Interpreter.Interpreter_stringLocals[var7[var19]]; // L: 249
						} else if (var31 == ScriptOpcodes.SSTORE) { // L: 252
							Interpreter.Interpreter_stringLocals[var7[var19]] = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 253
						} else if (var31 == ScriptOpcodes.JOIN_STRING) { // L: 256
							var13 = var7[var19]; // L: 257
							class13.Interpreter_stringStackSize -= var13; // L: 258
							var20 = SecureRandomCallable.method2076(Interpreter.Interpreter_stringStack, class13.Interpreter_stringStackSize, var13); // L: 259
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var20; // L: 260
						} else if (var31 == ScriptOpcodes.POP_INT) { // L: 263
							--WorldMapCacheName.Interpreter_intStackSize; // L: 264
						} else if (var31 == ScriptOpcodes.POP_STRING) { // L: 267
							--class13.Interpreter_stringStackSize; // L: 268
						} else {
							int var17;
							if (var31 != ScriptOpcodes.INVOKE) { // L: 271
								if (var31 == ScriptOpcodes.GET_VARC_INT) { // L: 294
									Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.varcs.getInt(var7[var19]); // L: 295
								} else if (var31 == ScriptOpcodes.SET_VARC_INT) { // L: 298
									Client.varcs.setInt(var7[var19], Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]); // L: 299
								} else if (var31 == ScriptOpcodes.DEFINE_ARRAY) { // L: 302
									var13 = var7[var19] >> 16; // L: 303
									var14 = var7[var19] & 65535; // L: 304
									int var23 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 305
									if (var23 < 0 || var23 > 5000) { // L: 306
										throw new RuntimeException(); // L: 307
									}

									Interpreter.Interpreter_arrayLengths[var13] = var23; // L: 309
									byte var24 = -1; // L: 310
									if (var14 == 105) { // L: 311
										var24 = 0;
									}

									for (var17 = 0; var17 < var23; ++var17) { // L: 312
										Interpreter.Interpreter_arrays[var13][var17] = var24;
									}
								} else if (var31 == ScriptOpcodes.GET_ARRAY_INT) { // L: 315
									var13 = var7[var19]; // L: 316
									var14 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 317
									if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 318
										throw new RuntimeException(); // L: 319
									}

									Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14]; // L: 321
								} else if (var31 == ScriptOpcodes.SET_ARRAY_INT) { // L: 324
									var13 = var7[var19]; // L: 325
									WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 326
									var14 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 327
									if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 328
										throw new RuntimeException(); // L: 329
									}

									Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 331
								} else {
									String var21;
									if (var31 == ScriptOpcodes.GET_VARC_STRING_OLD) { // L: 334
										var21 = Client.varcs.getStringOld(var7[var19]); // L: 335
										if (var21 == null) { // L: 336
											var21 = "null";
										}

										Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var21; // L: 337
									} else if (var31 == ScriptOpcodes.SET_VARC_STRING_OLD) { // L: 340
										Client.varcs.setStringOld(var7[var19], Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]); // L: 341
									} else if (var31 == ScriptOpcodes.GET_VARC_STRING) { // L: 344
										var21 = Client.varcs.getString(var7[var19]); // L: 345
										Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var21; // L: 346
									} else if (var31 == ScriptOpcodes.SET_VARC_STRING) { // L: 349
										Client.varcs.setString(var7[var19], Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]); // L: 350
									} else if (var31 == ScriptOpcodes.SWITCH) { // L: 353
										IterableNodeHashTable var35 = var4.switches[var7[var19]]; // L: 354
										IntegerNode var34 = (IntegerNode)var35.get((long)Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]); // L: 355
										if (var34 != null) { // L: 356
											var19 += var34.integer;
										}
									} else {
										Integer var36;
										if (var31 == 74) { // L: 359
											var36 = ArchiveDiskActionHandler.field3575.method152(var7[var19]); // L: 360
											if (var36 == null) { // L: 361
												Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = -1; // L: 362
											} else {
												Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var36; // L: 365
											}
										} else {
											if (var31 != 76) { // L: 369
												throw new IllegalStateException(); // L: 379
											}

											var36 = ObjectSound.field935.method5861(var7[var19]); // L: 370
											if (var36 == null) { // L: 371
												Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = -1; // L: 372
											} else {
												Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var36; // L: 375
											}
										}
									}
								}
							} else {
								var13 = var7[var19]; // L: 272
								Script var33 = ItemComposition.getScript(var13); // L: 273
								int[] var15 = new int[var33.localIntCount]; // L: 274
								String[] var16 = new String[var33.localStringCount]; // L: 275

								for (var17 = 0; var17 < var33.intArgumentCount; ++var17) { // L: 276
									var15[var17] = Interpreter.Interpreter_intStack[var17 + (WorldMapCacheName.Interpreter_intStackSize - var33.intArgumentCount)];
								}

								for (var17 = 0; var17 < var33.stringArgumentCount; ++var17) { // L: 277
									var16[var17] = Interpreter.Interpreter_stringStack[var17 + (class13.Interpreter_stringStackSize - var33.stringArgumentCount)];
								}

								WorldMapCacheName.Interpreter_intStackSize -= var33.intArgumentCount; // L: 278
								class13.Interpreter_stringStackSize -= var33.stringArgumentCount; // L: 279
								ScriptFrame var22 = new ScriptFrame(); // L: 280
								var22.script = var4; // L: 281
								var22.pc = var19; // L: 282
								var22.intLocals = ScriptFrame.Interpreter_intLocals; // L: 283
								var22.stringLocals = Interpreter.Interpreter_stringLocals; // L: 284
								Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var22; // L: 285
								var4 = var33; // L: 286
								var6 = var33.opcodes; // L: 287
								var7 = var33.intOperands; // L: 288
								var19 = -1; // L: 289
								ScriptFrame.Interpreter_intLocals = var15; // L: 290
								Interpreter.Interpreter_stringLocals = var16; // L: 291
							}
						}
					}
				} catch (Exception var29) { // L: 399
					var9 = true; // L: 400
					StringBuilder var26 = new StringBuilder(30); // L: 402
					var26.append("").append(var4.key).append(" "); // L: 403

					for (var13 = Interpreter.Interpreter_frameDepth - 1; var13 >= 0; --var13) { // L: 404
						var26.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
					}

					var26.append("").append(var8); // L: 405
					class27.RunException_sendStackTrace(var26.toString(), var29); // L: 406
				}
			} finally {
				if (Interpreter.field950) { // L: 410
					Interpreter.field951 = true; // L: 411
					class80.method1943(); // L: 412
					Interpreter.field951 = false; // L: 413
					Interpreter.field950 = false; // L: 414
				}

				if (!var9 && var2 > 0 && var10 >= var2) { // L: 416
					class27.RunException_sendStackTrace("Warning: Script " + var4.field1054 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
				}

			}
		}
	} // L: 122 420

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZI)I",
		garbageValue = "448922553"
	)
	static int method4612(int var0, Script var1, boolean var2) {
		int var4 = -1; // L: 606
		Widget var3;
		if (var0 >= 2000) { // L: 607
			var0 -= 1000; // L: 608
			var4 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 609
			var3 = DevicePcmPlayerProvider.getWidget(var4); // L: 610
		} else {
			var3 = var2 ? class308.scriptDotWidget : class24.scriptActiveWidget; // L: 612
		}

		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) { // L: 613
			WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 614
			var3.scrollX = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 615
			if (var3.scrollX > var3.scrollWidth - var3.width) { // L: 616
				var3.scrollX = var3.scrollWidth - var3.width;
			}

			if (var3.scrollX < 0) { // L: 617
				var3.scrollX = 0;
			}

			var3.scrollY = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 618
			if (var3.scrollY > var3.scrollHeight - var3.height) { // L: 619
				var3.scrollY = var3.scrollHeight - var3.height;
			}

			if (var3.scrollY < 0) { // L: 620
				var3.scrollY = 0;
			}

			VerticalAlignment.invalidateWidget(var3); // L: 621
			return 1; // L: 622
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) { // L: 624
			var3.color = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 625
			VerticalAlignment.invalidateWidget(var3); // L: 626
			return 1; // L: 627
		} else if (var0 == ScriptOpcodes.CC_SETFILL) { // L: 629
			var3.fill = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 630
			VerticalAlignment.invalidateWidget(var3); // L: 631
			return 1; // L: 632
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) { // L: 634
			var3.transparencyTop = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 635
			VerticalAlignment.invalidateWidget(var3); // L: 636
			return 1; // L: 637
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) { // L: 639
			var3.lineWid = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 640
			VerticalAlignment.invalidateWidget(var3); // L: 641
			return 1; // L: 642
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) { // L: 644
			var3.spriteId2 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 645
			VerticalAlignment.invalidateWidget(var3); // L: 646
			return 1; // L: 647
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) { // L: 649
			var3.spriteAngle = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 650
			VerticalAlignment.invalidateWidget(var3); // L: 651
			return 1; // L: 652
		} else if (var0 == ScriptOpcodes.CC_SETTILING) { // L: 654
			var3.spriteTiling = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 655
			VerticalAlignment.invalidateWidget(var3); // L: 656
			return 1; // L: 657
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) { // L: 659
			var3.modelType = 1; // L: 660
			var3.modelId = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 661
			VerticalAlignment.invalidateWidget(var3); // L: 662
			return 1; // L: 663
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) { // L: 665
			WorldMapCacheName.Interpreter_intStackSize -= 6; // L: 666
			var3.modelOffsetX = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 667
			var3.modelOffsetY = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 668
			var3.modelAngleX = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 2]; // L: 669
			var3.modelAngleY = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 3]; // L: 670
			var3.modelAngleZ = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 4]; // L: 671
			var3.modelZoom = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 5]; // L: 672
			VerticalAlignment.invalidateWidget(var3); // L: 673
			return 1; // L: 674
		} else {
			int var8;
			if (var0 == ScriptOpcodes.CC_SETMODELANIM) { // L: 676
				var8 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 677
				if (var8 != var3.sequenceId) { // L: 678
					var3.sequenceId = var8; // L: 679
					var3.modelFrame = 0; // L: 680
					var3.modelFrameCycle = 0; // L: 681
					VerticalAlignment.invalidateWidget(var3); // L: 682
				}

				return 1; // L: 684
			} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) { // L: 686
				var3.modelOrthog = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 687
				VerticalAlignment.invalidateWidget(var3); // L: 688
				return 1; // L: 689
			} else if (var0 == ScriptOpcodes.CC_SETTEXT) { // L: 691
				String var7 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 692
				if (!var7.equals(var3.text)) { // L: 693
					var3.text = var7; // L: 694
					VerticalAlignment.invalidateWidget(var3); // L: 695
				}

				return 1; // L: 697
			} else if (var0 == ScriptOpcodes.CC_SETTEXTFONT) { // L: 699
				var3.fontId = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 700
				VerticalAlignment.invalidateWidget(var3); // L: 701
				return 1; // L: 702
			} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) { // L: 704
				WorldMapCacheName.Interpreter_intStackSize -= 3; // L: 705
				var3.textXAlignment = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 706
				var3.textYAlignment = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 707
				var3.textLineHeight = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 2]; // L: 708
				VerticalAlignment.invalidateWidget(var3); // L: 709
				return 1; // L: 710
			} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) { // L: 712
				var3.textShadowed = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 713
				VerticalAlignment.invalidateWidget(var3); // L: 714
				return 1; // L: 715
			} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) { // L: 717
				var3.outline = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 718
				VerticalAlignment.invalidateWidget(var3); // L: 719
				return 1; // L: 720
			} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) { // L: 722
				var3.spriteShadow = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 723
				VerticalAlignment.invalidateWidget(var3); // L: 724
				return 1; // L: 725
			} else if (var0 == ScriptOpcodes.CC_SETVFLIP) { // L: 727
				var3.spriteFlipV = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 728
				VerticalAlignment.invalidateWidget(var3); // L: 729
				return 1; // L: 730
			} else if (var0 == ScriptOpcodes.CC_SETHFLIP) { // L: 732
				var3.spriteFlipH = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 733
				VerticalAlignment.invalidateWidget(var3); // L: 734
				return 1; // L: 735
			} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) { // L: 737
				WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 738
				var3.scrollWidth = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 739
				var3.scrollHeight = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 740
				VerticalAlignment.invalidateWidget(var3); // L: 741
				if (var4 != -1 && var3.type == 0) { // L: 742
					ApproximateRouteStrategy.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var4 >> 16], var3, false);
				}

				return 1; // L: 743
			} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) { // L: 745
				HorizontalAlignment.resumePauseWidget(var3.id, var3.childIndex); // L: 746
				Client.meslayerContinueWidget = var3; // L: 747
				VerticalAlignment.invalidateWidget(var3); // L: 748
				return 1; // L: 749
			} else if (var0 == 1122) { // L: 751
				var3.spriteId = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 752
				VerticalAlignment.invalidateWidget(var3); // L: 753
				return 1; // L: 754
			} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) { // L: 756
				var3.color2 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 757
				VerticalAlignment.invalidateWidget(var3); // L: 758
				return 1; // L: 759
			} else if (var0 == 1124) { // L: 761
				var3.transparencyBot = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 762
				VerticalAlignment.invalidateWidget(var3); // L: 763
				return 1; // L: 764
			} else if (var0 == ScriptOpcodes.CC_SETFILLMODE) { // L: 766
				var8 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 767
				FillMode var6 = (FillMode)UserComparator4.findEnumerated(class69.FillMode_values(), var8); // L: 768
				if (var6 != null) { // L: 769
					var3.fillMode = var6; // L: 770
					VerticalAlignment.invalidateWidget(var3); // L: 771
				}

				return 1; // L: 773
			} else {
				boolean var5;
				if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) { // L: 775
					var5 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 776
					var3.field2998 = var5; // L: 777
					return 1; // L: 778
				} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) { // L: 780
					var5 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 781
					var3.modelTransparency = var5; // L: 782
					return 1; // L: 783
				} else if (var0 == 1128) { // L: 785
					WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 786
					return 1; // L: 787
				} else {
					return 2; // L: 789
				}
			}
		}
	}
}
