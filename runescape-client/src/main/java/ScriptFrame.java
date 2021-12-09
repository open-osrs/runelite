import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bg")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -238445721
	)
	static int field446;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -2036578637
	)
	static int field448;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lbn;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1958186209
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("p")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("m")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1; // L: 5
	} // L: 9

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lcp;IIB)V",
		garbageValue = "61"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args; // L: 114
		Script var4;
		int var20;
		if (ClanMate.isWorldMapEvent(var0.type)) { // L: 116
			FileSystem.worldMapEvent = (WorldMapEvent)var3[0]; // L: 117
			WorldMapElement var5 = class78.WorldMapElement_get(FileSystem.worldMapEvent.mapElement); // L: 118
			var4 = Skeleton.getWorldMapScript(var0.type, var5.objectId, var5.category); // L: 119
		} else {
			var20 = (Integer)var3[0]; // L: 122
			var4 = class410.getScript(var20); // L: 123
		}

		if (var4 != null) { // L: 125
			IsaacCipher.Interpreter_intStackSize = 0; // L: 128
			class13.Interpreter_stringStackSize = 0;
			var20 = -1;
			int[] var6 = var4.opcodes;
			int[] var7 = var4.intOperands;
			byte var8 = -1; // L: 133
			Interpreter.Interpreter_frameDepth = 0; // L: 134
			Interpreter.field818 = false;
			boolean var9 = false;
			int var10 = 0;
			boolean var30 = false;

			label955: {
				label956: {
					try {
						int var13;
						try {
							var30 = true;
							SoundCache.Interpreter_intLocals = new int[var4.localIntCount];
							int var11 = 0;
							AbstractUserComparator.Interpreter_stringLocals = new String[var4.localStringCount]; // L: 142
							int var12 = 0;

							int var14;
							String var21;
							for (var13 = 1; var13 < var3.length; ++var13) { // L: 143
								if (var3[var13] instanceof Integer) {
									var14 = (Integer)var3[var13]; // L: 145
									if (var14 == -2147483647) {
										var14 = var0.mouseX;
									}

									if (var14 == -2147483646) { // L: 147
										var14 = var0.mouseY;
									}

									if (var14 == -2147483645) { // L: 148
										var14 = var0.widget != null ? var0.widget.id * 1695982371 * 2075239563 : -1;
									}

									if (var14 == -2147483644) {
										var14 = var0.opIndex;
									}

									if (var14 == -2147483643) {
										var14 = var0.widget != null ? var0.widget.childIndex * -1765912961 * -1567657601 : -1;
									}

									if (var14 == -2147483642) {
										var14 = var0.dragTarget != null ? var0.dragTarget.id * 1695982371 * 2075239563 : -1;
									}

									if (var14 == -2147483641) {
										var14 = var0.dragTarget != null ? var0.dragTarget.childIndex * -1765912961 * -1567657601 : -1;
									}

									if (var14 == -2147483640) {
										var14 = var0.keyTyped;
									}

									if (var14 == -2147483639) { // L: 154
										var14 = var0.keyPressed;
									}

									SoundCache.Interpreter_intLocals[var11++] = var14; // L: 155
								} else if (var3[var13] instanceof String) {
									var21 = (String)var3[var13];
									if (var21.equals("event_opbase")) {
										var21 = var0.targetName;
									}

									AbstractUserComparator.Interpreter_stringLocals[var12++] = var21; // L: 160
								}
							}

							Interpreter.field815 = var0.field1018; // L: 164

							while (true) {
								++var10;
								if (var10 > var1) { // L: 167
									throw new RuntimeException();
								}

								++var20; // L: 168
								int var33 = var6[var20];
								if (var33 >= 100) { // L: 169
									boolean var35;
									if (var4.intOperands[var20] == 1) { // L: 387
										var35 = true;
									} else {
										var35 = false; // L: 388
									}

									var14 = class112.method2560(var33, var4, var35); // L: 389
									switch(var14) { // L: 390
									case 0:
										var30 = false;
										break label955;
									case 1:
									default:
										break;
									case 2:
										throw new IllegalStateException(); // L: 393
									}
								} else if (var33 == ScriptOpcodes.ICONST) { // L: 170
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var7[var20];
								} else if (var33 == ScriptOpcodes.GET_VARP) {
									var13 = var7[var20]; // L: 175
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Varps.Varps_main[var13]; // L: 176
								} else if (var33 == ScriptOpcodes.SET_VARP) { // L: 179
									var13 = var7[var20];
									Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 181
									class281.changeGameOptions(var13); // L: 182
								} else if (var33 == ScriptOpcodes.SCONST) { // L: 185
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4.stringOperands[var20]; // L: 186
								} else if (var33 == ScriptOpcodes.JUMP) { // L: 189
									var20 += var7[var20]; // L: 190
								} else if (var33 == ScriptOpcodes.IF_ICMPNE) { // L: 193
									IsaacCipher.Interpreter_intStackSize -= 2; // L: 194
									if (Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]) { // L: 195
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPEQ) { // L: 198
									IsaacCipher.Interpreter_intStackSize -= 2; // L: 199
									if (Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]) { // L: 200
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPLT) { // L: 203
									IsaacCipher.Interpreter_intStackSize -= 2; // L: 204
									if (Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]) { // L: 205
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGT) { // L: 208
									IsaacCipher.Interpreter_intStackSize -= 2; // L: 209
									if (Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]) { // L: 210
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.RETURN) { // L: 213
									if (Interpreter.Interpreter_frameDepth == 0) {
										var30 = false;
										break;
									}

									ScriptFrame var40 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth]; // L: 215
									var4 = var40.script; // L: 216
									var6 = var4.opcodes; // L: 217
									var7 = var4.intOperands; // L: 218
									var20 = var40.pc; // L: 219
									SoundCache.Interpreter_intLocals = var40.intLocals; // L: 220
									AbstractUserComparator.Interpreter_stringLocals = var40.stringLocals; // L: 221
								} else if (var33 == ScriptOpcodes.GET_VARBIT) { // L: 224
									var13 = var7[var20]; // L: 225
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = class273.getVarbit(var13); // L: 226
								} else if (var33 == ScriptOpcodes.SET_VARBIT) { // L: 229
									var13 = var7[var20]; // L: 230
									Tile.method3843(var13, Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]); // L: 231
								} else if (var33 == ScriptOpcodes.IF_ICMPLE) { // L: 234
									IsaacCipher.Interpreter_intStackSize -= 2; // L: 235
									if (Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]) { // L: 236
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGE) { // L: 239
									IsaacCipher.Interpreter_intStackSize -= 2; // L: 240
									if (Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]) { // L: 241
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.ILOAD) { // L: 244
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = SoundCache.Interpreter_intLocals[var7[var20]]; // L: 245
								} else if (var33 == ScriptOpcodes.ISTORE) { // L: 248
									SoundCache.Interpreter_intLocals[var7[var20]] = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 249
								} else if (var33 == ScriptOpcodes.SLOAD) { // L: 252
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = AbstractUserComparator.Interpreter_stringLocals[var7[var20]]; // L: 253
								} else if (var33 == ScriptOpcodes.SSTORE) { // L: 256
									AbstractUserComparator.Interpreter_stringLocals[var7[var20]] = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 257
								} else if (var33 == ScriptOpcodes.JOIN_STRING) { // L: 260
									var13 = var7[var20]; // L: 261
									class13.Interpreter_stringStackSize -= var13; // L: 262
									var21 = class112.method2565(Interpreter.Interpreter_stringStack, class13.Interpreter_stringStackSize, var13); // L: 263
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var21; // L: 264
								} else if (var33 == ScriptOpcodes.POP_INT) { // L: 267
									--IsaacCipher.Interpreter_intStackSize; // L: 268
								} else if (var33 == ScriptOpcodes.POP_STRING) { // L: 271
									--class13.Interpreter_stringStackSize; // L: 272
								} else {
									int var17;
									if (var33 != ScriptOpcodes.INVOKE) { // L: 275
										if (var33 == ScriptOpcodes.GET_VARC_INT) { // L: 298
											Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = class339.varcs.getInt(var7[var20]); // L: 299
										} else if (var33 == ScriptOpcodes.SET_VARC_INT) { // L: 302
											class339.varcs.setInt(var7[var20], Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]); // L: 303
										} else if (var33 == ScriptOpcodes.DEFINE_ARRAY) { // L: 306
											var13 = var7[var20] >> 16; // L: 307
											var14 = var7[var20] & 65535; // L: 308
											int var24 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 309
											if (var24 < 0 || var24 > 5000) { // L: 310
												throw new RuntimeException(); // L: 311
											}

											Interpreter.Interpreter_arrayLengths[var13] = var24; // L: 313
											byte var25 = -1; // L: 314
											if (var14 == 105) { // L: 315
												var25 = 0;
											}

											for (var17 = 0; var17 < var24; ++var17) { // L: 316
												Interpreter.Interpreter_arrays[var13][var17] = var25;
											}
										} else if (var33 == ScriptOpcodes.GET_ARRAY_INT) { // L: 319
											var13 = var7[var20]; // L: 320
											var14 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 321
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 322
												throw new RuntimeException(); // L: 323
											}

											Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14]; // L: 325
										} else if (var33 == ScriptOpcodes.SET_ARRAY_INT) { // L: 328
											var13 = var7[var20]; // L: 329
											IsaacCipher.Interpreter_intStackSize -= 2; // L: 330
											var14 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 331
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 332
												throw new RuntimeException(); // L: 333
											}

											Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 335
										} else {
											String var22;
											if (var33 == ScriptOpcodes.GET_VARC_STRING_OLD) { // L: 338
												var22 = class339.varcs.getStringOld(var7[var20]); // L: 339
												if (var22 == null) { // L: 340
													var22 = "null";
												}

												Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var22; // L: 341
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING_OLD) { // L: 344
												class339.varcs.setStringOld(var7[var20], Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]); // L: 345
											} else if (var33 == ScriptOpcodes.GET_VARC_STRING) { // L: 348
												var22 = class339.varcs.getString(var7[var20]); // L: 349
												Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var22; // L: 350
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING) { // L: 353
												class339.varcs.setString(var7[var20], Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]); // L: 354
											} else if (var33 == ScriptOpcodes.SWITCH) { // L: 357
												IterableNodeHashTable var38 = var4.switches[var7[var20]]; // L: 358
												IntegerNode var37 = (IntegerNode)var38.get((long)Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]); // L: 359
												if (var37 != null) { // L: 360
													var20 += var37.integer;
												}
											} else {
												Integer var39;
												if (var33 == ScriptOpcodes.GET_VARCLANSETTING) { // L: 363
													var39 = Friend.field4084.getTitleGroupValue(var7[var20]); // L: 364
													if (var39 == null) { // L: 365
														Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1; // L: 366
													} else {
														Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var39; // L: 369
													}
												} else {
													if (var33 != ScriptOpcodes.GET_VARCLAN) { // L: 373
														throw new IllegalStateException(); // L: 383
													}

													var39 = BuddyRankComparator.field1342.method6757(var7[var20]); // L: 374
													if (var39 == null) { // L: 375
														Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1; // L: 376
													} else {
														Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var39; // L: 379
													}
												}
											}
										}
									} else {
										var13 = var7[var20]; // L: 276
										Script var36 = class410.getScript(var13); // L: 277
										int[] var15 = new int[var36.localIntCount]; // L: 278
										String[] var16 = new String[var36.localStringCount]; // L: 279

										for (var17 = 0; var17 < var36.intArgumentCount; ++var17) { // L: 280
											var15[var17] = Interpreter.Interpreter_intStack[var17 + (IsaacCipher.Interpreter_intStackSize - var36.intArgumentCount)];
										}

										for (var17 = 0; var17 < var36.stringArgumentCount; ++var17) { // L: 281
											var16[var17] = Interpreter.Interpreter_stringStack[var17 + (class13.Interpreter_stringStackSize - var36.stringArgumentCount)];
										}

										IsaacCipher.Interpreter_intStackSize -= var36.intArgumentCount; // L: 282
										class13.Interpreter_stringStackSize -= var36.stringArgumentCount; // L: 283
										ScriptFrame var23 = new ScriptFrame(); // L: 284
										var23.script = var4; // L: 285
										var23.pc = var20; // L: 286
										var23.intLocals = SoundCache.Interpreter_intLocals; // L: 287
										var23.stringLocals = AbstractUserComparator.Interpreter_stringLocals; // L: 288
										Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var23; // L: 289
										var4 = var36; // L: 290
										var6 = var36.opcodes; // L: 291
										var7 = var36.intOperands; // L: 292
										var20 = -1; // L: 293
										SoundCache.Interpreter_intLocals = var15; // L: 294
										AbstractUserComparator.Interpreter_stringLocals = var16; // L: 295
									}
								}
							}
						} catch (Exception var31) { // L: 403
							var9 = true; // L: 404
							StringBuilder var27 = new StringBuilder(30); // L: 406
							var27.append("").append(var4.key).append(" "); // L: 407

							for (var13 = Interpreter.Interpreter_frameDepth - 1; var13 >= 0; --var13) { // L: 408
								var27.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
							}

							var27.append("").append(var8); // L: 409
							AccessFile.RunException_sendStackTrace(var27.toString(), var31); // L: 410
							var30 = false;
							break label956;
						}
					} finally {
						if (var30) {
							while (Interpreter.field817.size() > 0) {
								class92 var19 = (class92)Interpreter.field817.remove(0); // L: 415
								SoundCache.widgetDefaultMenuAction(var19.method2340(), var19.method2339(), var19.method2341(), var19.method2348(), "");
							}

							if (Interpreter.field818) { // L: 418
								Interpreter.field818 = false; // L: 419
								class4.method28(); // L: 420
							}

							if (!var9 && var2 > 0 && var10 >= var2) {
								AccessFile.RunException_sendStackTrace("Warning: Script " + var4.field937 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
							}

						}
					}

					while (Interpreter.field817.size() > 0) {
						class92 var41 = (class92)Interpreter.field817.remove(0);
						SoundCache.widgetDefaultMenuAction(var41.method2340(), var41.method2339(), var41.method2341(), var41.method2348(), "");
					}

					if (Interpreter.field818) {
						Interpreter.field818 = false;
						class4.method28();
					}

					if (!var9 && var2 > 0 && var10 >= var2) {
						AccessFile.RunException_sendStackTrace("Warning: Script " + var4.field937 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
					}

					return; // L: 214
				}

				while (Interpreter.field817.size() > 0) { // L: 414
					class92 var26 = (class92)Interpreter.field817.remove(0);
					SoundCache.widgetDefaultMenuAction(var26.method2340(), var26.method2339(), var26.method2341(), var26.method2348(), "");
				}

				if (Interpreter.field818) {
					Interpreter.field818 = false;
					class4.method28();
				}

				if (!var9 && var2 > 0 && var10 >= var2) {
					AccessFile.RunException_sendStackTrace("Warning: Script " + var4.field937 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
				}

				return; // L: 426
			}

			while (Interpreter.field817.size() > 0) {
				class92 var34 = (class92)Interpreter.field817.remove(0);
				SoundCache.widgetDefaultMenuAction(var34.method2340(), var34.method2339(), var34.method2341(), var34.method2348(), ""); // L: 416
			}

			if (Interpreter.field818) {
				Interpreter.field818 = false;
				class4.method28();
			}

			if (!var9 && var2 > 0 && var10 >= var2) { // L: 422
				AccessFile.RunException_sendStackTrace("Warning: Script " + var4.field937 + " finished at op count " + var10 + " of max " + var1, (Throwable)null); // L: 423
			}

		}
	} // L: 396

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lpi;IIIIIII)V",
		garbageValue = "280009494"
	)
	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) { // L: 126
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 127

			while (true) {
				var7 = var0.readUnsignedByte(); // L: 129
				if (var7 == 0) { // L: 130
					if (var1 == 0) { // L: 131
						int[] var14 = Tiles.Tiles_heights[0][var2]; // L: 132
						int var11 = var2 + var4 + 932731; // L: 135
						int var12 = var3 + var5 + 556238;
						int var13 = class260.method5069(var11 + 45365, var12 + 91923, 4) - 128 + (class260.method5069(10294 + var11, 37821 + var12, 2) - 128 >> 1) + (class260.method5069(var11, var12, 1) - 128 >> 2); // L: 138
						var13 = (int)((double)var13 * 0.3D) + 35; // L: 139
						if (var13 < 10) { // L: 140
							var13 = 10;
						} else if (var13 > 60) { // L: 141
							var13 = 60;
						}

						var14[var3] = -var13 * 8; // L: 144
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240; // L: 146
					}
					break;
				}

				if (var7 == 1) { // L: 149
					int var8 = var0.readUnsignedByte(); // L: 150
					if (var8 == 1) { // L: 151
						var8 = 0;
					}

					if (var1 == 0) { // L: 152
						Tiles.Tiles_heights[0][var2][var3] = -var8 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var8 * 8; // L: 153
					}
					break;
				}

				if (var7 <= 49) { // L: 156
					Tiles.Tiles_overlays[var1][var2][var3] = var0.readByte(); // L: 157
					Tiles.Tiles_shapes[var1][var2][var3] = (byte)((var7 - 2) / 4); // L: 158
					WorldMapLabelSize.field2580[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3); // L: 159
				} else if (var7 <= 81) { // L: 162
					Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var7 - 49); // L: 163
				} else {
					Tiles.Tiles_underlays[var1][var2][var3] = (byte)(var7 - 81); // L: 166
				}
			}
		} else {
			while (true) {
				var7 = var0.readUnsignedByte(); // L: 171
				if (var7 == 0) { // L: 172
					break;
				}

				if (var7 == 1) { // L: 173
					var0.readUnsignedByte(); // L: 174
					break;
				}

				if (var7 <= 49) { // L: 177
					var0.readUnsignedByte();
				}
			}
		}

	} // L: 180

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1370934798"
	)
	public static void method1110() {
		KitDefinition.KitDefinition_cached.clear(); // L: 136
	} // L: 137
}
