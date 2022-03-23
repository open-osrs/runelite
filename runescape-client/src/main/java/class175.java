import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fe")
public class class175 {
	@ObfuscatedName("ta")
	@ObfuscatedGetter(
		intValue = 327954161
	)
	static int field1883;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("ObjectDefinition_modelsArchive")
	static AbstractArchive ObjectDefinition_modelsArchive;

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lca;III)V",
		garbageValue = "-1185850498"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args; // L: 112
		Script var4;
		int var20;
		if (MusicPatchNode2.isWorldMapEvent(var0.type)) { // L: 114
			class293.worldMapEvent = (WorldMapEvent)var3[0]; // L: 115
			WorldMapElement var5 = class19.WorldMapElement_get(class293.worldMapEvent.mapElement); // L: 116
			var4 = FriendSystem.getWorldMapScript(var0.type, var5.objectId, var5.category); // L: 117
		} else {
			var20 = (Integer)var3[0]; // L: 120
			var4 = class101.getScript(var20); // L: 121
		}

		if (var4 != null) { // L: 123
			class295.Interpreter_intStackSize = 0; // L: 126
			ChatChannel.Interpreter_stringStackSize = 0; // L: 127
			var20 = -1; // L: 128
			int[] var6 = var4.opcodes; // L: 129
			int[] var7 = var4.intOperands; // L: 130
			byte var8 = -1; // L: 131
			Interpreter.Interpreter_frameDepth = 0; // L: 132
			Interpreter.field837 = false; // L: 133
			boolean var9 = false; // L: 134
			int var10 = 0; // L: 135
			boolean var30 = false;

			label951: {
				label952: {
					try {
						int var13;
						try {
							var30 = true; // L: 137
							class385.Interpreter_intLocals = new int[var4.localIntCount]; // L: 138
							int var11 = 0; // L: 139
							Interpreter.Interpreter_stringLocals = new String[var4.localStringCount]; // L: 140
							int var12 = 0;

							int var14;
							String var21;
							for (var13 = 1; var13 < var3.length; ++var13) { // L: 141
								if (var3[var13] instanceof Integer) { // L: 142
									var14 = (Integer)var3[var13]; // L: 143
									if (var14 == -2147483647) { // L: 144
										var14 = var0.mouseX;
									}

									if (var14 == -2147483646) { // L: 145
										var14 = var0.mouseY;
									}

									if (var14 == -2147483645) { // L: 146
										var14 = var0.widget != null ? var0.widget.id * 2073510769 * -769712751 : -1;
									}

									if (var14 == -2147483644) { // L: 147
										var14 = var0.opIndex;
									}

									if (var14 == -2147483643) { // L: 148
										var14 = var0.widget != null ? var0.widget.childIndex * -241424449 * 1035716671 : -1;
									}

									if (var14 == -2147483642) { // L: 149
										var14 = var0.dragTarget != null ? var0.dragTarget.id * 2073510769 * -769712751 : -1;
									}

									if (var14 == -2147483641) { // L: 150
										var14 = var0.dragTarget != null ? var0.dragTarget.childIndex * -241424449 * 1035716671 : -1;
									}

									if (var14 == -2147483640) { // L: 151
										var14 = var0.keyTyped;
									}

									if (var14 == -2147483639) { // L: 152
										var14 = var0.keyPressed;
									}

									class385.Interpreter_intLocals[var11++] = var14; // L: 153
								} else if (var3[var13] instanceof String) { // L: 155
									var21 = (String)var3[var13]; // L: 156
									if (var21.equals("event_opbase")) { // L: 157
										var21 = var0.targetName;
									}

									Interpreter.Interpreter_stringLocals[var12++] = var21; // L: 158
								}
							}

							Interpreter.field827 = var0.field1053; // L: 162

							label935:
							while (true) {
								++var10; // L: 164
								if (var10 > var1) { // L: 165
									throw new RuntimeException();
								}

								++var20; // L: 166
								int var33 = var6[var20];
								if (var33 >= 100) { // L: 167
									boolean var35;
									if (var4.intOperands[var20] == 1) { // L: 385
										var35 = true;
									} else {
										var35 = false; // L: 386
									}

									var14 = UserComparator2.method8042(var33, var4, var35); // L: 387
									switch(var14) { // L: 388
									case 0:
										var30 = false;
										break label935;
									case 1:
									default:
										break;
									case 2:
										throw new IllegalStateException(); // L: 391
									}
								} else if (var33 == 0) { // L: 168
									Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var7[var20]; // L: 169
								} else if (var33 == ScriptOpcodes.GET_VARP) { // L: 172
									var13 = var7[var20]; // L: 173
									Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = Varps.Varps_main[var13]; // L: 174
								} else if (var33 == ScriptOpcodes.SET_VARP) { // L: 177
									var13 = var7[var20]; // L: 178
									Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 179
									class78.changeGameOptions(var13); // L: 180
								} else if (var33 == ScriptOpcodes.SCONST) { // L: 183
									Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var4.stringOperands[var20]; // L: 184
								} else if (var33 == ScriptOpcodes.JUMP) { // L: 187
									var20 += var7[var20]; // L: 188
								} else if (var33 == ScriptOpcodes.IF_ICMPNE) { // L: 191
									class295.Interpreter_intStackSize -= 2; // L: 192
									if (Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]) { // L: 193
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPEQ) { // L: 196
									class295.Interpreter_intStackSize -= 2; // L: 197
									if (Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]) { // L: 198
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPLT) { // L: 201
									class295.Interpreter_intStackSize -= 2; // L: 202
									if (Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]) { // L: 203
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGT) { // L: 206
									class295.Interpreter_intStackSize -= 2; // L: 207
									if (Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]) { // L: 208
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.RETURN) { // L: 211
									if (Interpreter.Interpreter_frameDepth == 0) {
										var30 = false;
										break label952;
									}

									ScriptFrame var40 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth]; // L: 213
									var4 = var40.script; // L: 214
									var6 = var4.opcodes; // L: 215
									var7 = var4.intOperands; // L: 216
									var20 = var40.pc; // L: 217
									class385.Interpreter_intLocals = var40.intLocals; // L: 218
									Interpreter.Interpreter_stringLocals = var40.stringLocals; // L: 219
								} else if (var33 == ScriptOpcodes.GET_VARBIT) { // L: 222
									var13 = var7[var20]; // L: 223
									Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = WorldMapRegion.getVarbit(var13); // L: 224
								} else if (var33 == ScriptOpcodes.SET_VARBIT) { // L: 227
									var13 = var7[var20]; // L: 228
									WorldMapElement.method3384(var13, Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]); // L: 229
								} else if (var33 == ScriptOpcodes.IF_ICMPLE) { // L: 232
									class295.Interpreter_intStackSize -= 2; // L: 233
									if (Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]) { // L: 234
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGE) { // L: 237
									class295.Interpreter_intStackSize -= 2; // L: 238
									if (Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]) { // L: 239
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.ILOAD) { // L: 242
									Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = class385.Interpreter_intLocals[var7[var20]]; // L: 243
								} else if (var33 == ScriptOpcodes.ISTORE) { // L: 246
									class385.Interpreter_intLocals[var7[var20]] = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 247
								} else if (var33 == ScriptOpcodes.SLOAD) { // L: 250
									Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = Interpreter.Interpreter_stringLocals[var7[var20]]; // L: 251
								} else if (var33 == ScriptOpcodes.SSTORE) { // L: 254
									Interpreter.Interpreter_stringLocals[var7[var20]] = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize]; // L: 255
								} else if (var33 == ScriptOpcodes.JOIN_STRING) { // L: 258
									var13 = var7[var20]; // L: 259
									ChatChannel.Interpreter_stringStackSize -= var13; // L: 260
									var21 = class273.method5271(Interpreter.Interpreter_stringStack, ChatChannel.Interpreter_stringStackSize, var13); // L: 261
									Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var21; // L: 262
								} else if (var33 == ScriptOpcodes.POP_INT) { // L: 265
									--class295.Interpreter_intStackSize; // L: 266
								} else if (var33 == ScriptOpcodes.POP_STRING) { // L: 269
									--ChatChannel.Interpreter_stringStackSize; // L: 270
								} else {
									int var17;
									if (var33 != ScriptOpcodes.INVOKE) { // L: 273
										if (var33 == ScriptOpcodes.GET_VARC_INT) { // L: 296
											Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = JagexCache.varcs.getInt(var7[var20]); // L: 297
										} else if (var33 == ScriptOpcodes.SET_VARC_INT) { // L: 300
											JagexCache.varcs.setInt(var7[var20], Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]); // L: 301
										} else if (var33 == ScriptOpcodes.DEFINE_ARRAY) { // L: 304
											var13 = var7[var20] >> 16; // L: 305
											var14 = var7[var20] & 65535; // L: 306
											int var24 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 307
											if (var24 < 0 || var24 > 5000) { // L: 308
												throw new RuntimeException(); // L: 309
											}

											Interpreter.Interpreter_arrayLengths[var13] = var24; // L: 311
											byte var25 = -1; // L: 312
											if (var14 == 105) { // L: 313
												var25 = 0;
											}

											for (var17 = 0; var17 < var24; ++var17) { // L: 314
												Interpreter.Interpreter_arrays[var13][var17] = var25;
											}
										} else if (var33 == ScriptOpcodes.GET_ARRAY_INT) { // L: 317
											var13 = var7[var20]; // L: 318
											var14 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 319
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 320
												throw new RuntimeException(); // L: 321
											}

											Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14]; // L: 323
										} else if (var33 == ScriptOpcodes.SET_ARRAY_INT) { // L: 326
											var13 = var7[var20]; // L: 327
											class295.Interpreter_intStackSize -= 2; // L: 328
											var14 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 329
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 330
												throw new RuntimeException(); // L: 331
											}

											Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 333
										} else {
											String var22;
											if (var33 == ScriptOpcodes.GET_VARC_STRING_OLD) { // L: 336
												var22 = JagexCache.varcs.getStringOld(var7[var20]); // L: 337
												if (var22 == null) { // L: 338
													var22 = "null";
												}

												Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var22; // L: 339
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING_OLD) { // L: 342
												JagexCache.varcs.setStringOld(var7[var20], Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize]); // L: 343
											} else if (var33 == ScriptOpcodes.GET_VARC_STRING) { // L: 346
												var22 = JagexCache.varcs.getString(var7[var20]); // L: 347
												Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var22; // L: 348
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING) { // L: 351
												JagexCache.varcs.setString(var7[var20], Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize]); // L: 352
											} else if (var33 == ScriptOpcodes.SWITCH) { // L: 355
												IterableNodeHashTable var38 = var4.switches[var7[var20]]; // L: 356
												IntegerNode var37 = (IntegerNode)var38.get((long)Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]); // L: 357
												if (var37 != null) { // L: 358
													var20 += var37.integer;
												}
											} else {
												Integer var39;
												if (var33 == ScriptOpcodes.GET_VARCLANSETTING) { // L: 361
													var39 = class129.field1535.getTitleGroupValue(var7[var20]); // L: 362
													if (var39 == null) { // L: 363
														Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = -1; // L: 364
													} else {
														Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var39; // L: 367
													}
												} else {
													if (var33 != ScriptOpcodes.GET_VARCLAN) { // L: 371
														throw new IllegalStateException(); // L: 381
													}

													var39 = GameEngine.field205.method7164(var7[var20]); // L: 372
													if (var39 == null) { // L: 373
														Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = -1; // L: 374
													} else {
														Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var39; // L: 377
													}
												}
											}
										}
									} else {
										var13 = var7[var20]; // L: 274
										Script var36 = class101.getScript(var13); // L: 275
										int[] var15 = new int[var36.localIntCount]; // L: 276
										String[] var16 = new String[var36.localStringCount]; // L: 277

										for (var17 = 0; var17 < var36.intArgumentCount; ++var17) { // L: 278
											var15[var17] = Interpreter.Interpreter_intStack[var17 + (class295.Interpreter_intStackSize - var36.intArgumentCount)];
										}

										for (var17 = 0; var17 < var36.stringArgumentCount; ++var17) { // L: 279
											var16[var17] = Interpreter.Interpreter_stringStack[var17 + (ChatChannel.Interpreter_stringStackSize - var36.stringArgumentCount)];
										}

										class295.Interpreter_intStackSize -= var36.intArgumentCount; // L: 280
										ChatChannel.Interpreter_stringStackSize -= var36.stringArgumentCount; // L: 281
										ScriptFrame var23 = new ScriptFrame(); // L: 282
										var23.script = var4; // L: 283
										var23.pc = var20; // L: 284
										var23.intLocals = class385.Interpreter_intLocals; // L: 285
										var23.stringLocals = Interpreter.Interpreter_stringLocals; // L: 286
										Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var23; // L: 287
										var4 = var36; // L: 288
										var6 = var36.opcodes; // L: 289
										var7 = var36.intOperands; // L: 290
										var20 = -1; // L: 291
										class385.Interpreter_intLocals = var15; // L: 292
										Interpreter.Interpreter_stringLocals = var16; // L: 293
									}
								}
							}
						} catch (Exception var31) { // L: 401
							var9 = true; // L: 402
							StringBuilder var27 = new StringBuilder(30); // L: 404
							var27.append("").append(var4.key).append(" "); // L: 405

							for (var13 = Interpreter.Interpreter_frameDepth - 1; var13 >= 0; --var13) { // L: 406
								var27.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
							}

							var27.append("").append(var8); // L: 407
							class301.RunException_sendStackTrace(var27.toString(), var31); // L: 408
							var30 = false;
							break label951;
						}
					} finally {
						if (var30) {
							while (Interpreter.field839.size() > 0) {
								class93 var19 = (class93)Interpreter.field839.remove(0); // L: 413
								Message.widgetDefaultMenuAction(var19.method2381(), var19.method2376(), var19.method2377(), var19.method2378(), "");
							}

							if (Interpreter.field837) { // L: 416
								Interpreter.field837 = false; // L: 417
								class9.method85(); // L: 418
							}

							if (!var9 && var2 > 0 && var10 >= var2) {
								class301.RunException_sendStackTrace("Warning: Script " + var4.field959 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
							}

						}
					}

					while (Interpreter.field839.size() > 0) {
						class93 var34 = (class93)Interpreter.field839.remove(0);
						Message.widgetDefaultMenuAction(var34.method2381(), var34.method2376(), var34.method2377(), var34.method2378(), ""); // L: 414
					}

					if (Interpreter.field837) {
						Interpreter.field837 = false;
						class9.method85();
					}

					if (!var9 && var2 > 0 && var10 >= var2) { // L: 420
						class301.RunException_sendStackTrace("Warning: Script " + var4.field959 + " finished at op count " + var10 + " of max " + var1, (Throwable)null); // L: 421
					}

					return; // L: 394
				}

				while (Interpreter.field839.size() > 0) {
					class93 var41 = (class93)Interpreter.field839.remove(0);
					Message.widgetDefaultMenuAction(var41.method2381(), var41.method2376(), var41.method2377(), var41.method2378(), "");
				}

				if (Interpreter.field837) {
					Interpreter.field837 = false;
					class9.method85();
				}

				if (!var9 && var2 > 0 && var10 >= var2) {
					class301.RunException_sendStackTrace("Warning: Script " + var4.field959 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
				}

				return; // L: 212
			}

			while (Interpreter.field839.size() > 0) { // L: 412
				class93 var26 = (class93)Interpreter.field839.remove(0);
				Message.widgetDefaultMenuAction(var26.method2381(), var26.method2376(), var26.method2377(), var26.method2378(), "");
			}

			if (Interpreter.field837) {
				Interpreter.field837 = false;
				class9.method85();
			}

			if (!var9 && var2 > 0 && var10 >= var2) {
				class301.RunException_sendStackTrace("Warning: Script " + var4.field959 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
			}

		}
	} // L: 124 424

	@ObfuscatedName("kn")
	static final void method3439(double var0) {
		Rasterizer3D.Rasterizer3D_setBrightness(var0); // L: 11352
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(var0); // L: 11353
		class82.method2122(); // L: 11354
		Interpreter.clientPreferences.method2260(var0); // L: 11355
	} // L: 11356
}
