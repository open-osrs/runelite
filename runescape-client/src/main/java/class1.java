import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("l")
public class class1 implements Callable {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1680003247
	)
	@Export("RunException_revision")
	public static int RunException_revision;
	@ObfuscatedName("a")
	public static short[][] field8;
	@ObfuscatedName("h")
	@Export("Tiles_hueMultiplier")
	static int[] Tiles_hueMultiplier;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	@Export("options_buttons_2Sprite")
	static IndexedSprite options_buttons_2Sprite;
	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	final Buffer field3;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Le;"
	)
	final class3 field11;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lw;"
	)
	final class7 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lw;Lpi;Le;)V"
	)
	class1(class7 var1, Buffer var2, class3 var3) {
		this.this$0 = var1; // L: 47
		this.field3 = var2; // L: 48
		this.field11 = var3; // L: 49
	} // L: 50

	public Object call() {
		return this.field11.vmethod10(this.field3); // L: 54
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lcg;III)V",
		garbageValue = "1010934095"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args; // L: 114
		Script var4;
		int var20;
		if (class408.isWorldMapEvent(var0.type)) { // L: 116
			class17.worldMapEvent = (WorldMapEvent)var3[0]; // L: 117
			WorldMapElement var5 = class126.WorldMapElement_get(class17.worldMapEvent.mapElement); // L: 118
			var4 = GraphicsObject.getWorldMapScript(var0.type, var5.objectId, var5.category); // L: 119
		} else {
			var20 = (Integer)var3[0]; // L: 122
			var4 = Players.getScript(var20); // L: 123
		}

		if (var4 != null) { // L: 125
			Interpreter.Interpreter_intStackSize = 0; // L: 128
			BufferedNetSocket.Interpreter_stringStackSize = 0; // L: 129
			var20 = -1; // L: 130
			int[] var6 = var4.opcodes; // L: 131
			int[] var7 = var4.intOperands; // L: 132
			byte var8 = -1; // L: 133
			Interpreter.Interpreter_frameDepth = 0; // L: 134
			Interpreter.field846 = false; // L: 135
			boolean var9 = false; // L: 136
			int var10 = 0; // L: 137
			boolean var30 = false;

			label953: {
				label954: {
					try {
						int var13;
						try {
							var30 = true; // L: 139
							Interpreter.Interpreter_intLocals = new int[var4.localIntCount]; // L: 140
							int var11 = 0; // L: 141
							Interpreter.Interpreter_stringLocals = new String[var4.localStringCount]; // L: 142
							int var12 = 0;

							int var14;
							String var21;
							for (var13 = 1; var13 < var3.length; ++var13) { // L: 143
								if (var3[var13] instanceof Integer) { // L: 144
									var14 = (Integer)var3[var13]; // L: 145
									if (var14 == -2147483647) { // L: 146
										var14 = var0.mouseX;
									}

									if (var14 == -2147483646) { // L: 147
										var14 = var0.mouseY;
									}

									if (var14 == -2147483645) { // L: 148
										var14 = var0.widget != null ? var0.widget.id * 98457465 * -180788535 : -1;
									}

									if (var14 == -2147483644) { // L: 149
										var14 = var0.opIndex;
									}

									if (var14 == -2147483643) { // L: 150
										var14 = var0.widget != null ? var0.widget.childIndex * -747196891 * 685751725 : -1;
									}

									if (var14 == -2147483642) { // L: 151
										var14 = var0.dragTarget != null ? var0.dragTarget.id * 98457465 * -180788535 : -1;
									}

									if (var14 == -2147483641) { // L: 152
										var14 = var0.dragTarget != null ? var0.dragTarget.childIndex * -747196891 * 685751725 : -1;
									}

									if (var14 == -2147483640) { // L: 153
										var14 = var0.keyTyped;
									}

									if (var14 == -2147483639) { // L: 154
										var14 = var0.keyPressed;
									}

									Interpreter.Interpreter_intLocals[var11++] = var14; // L: 155
								} else if (var3[var13] instanceof String) { // L: 157
									var21 = (String)var3[var13]; // L: 158
									if (var21.equals("event_opbase")) { // L: 159
										var21 = var0.targetName;
									}

									Interpreter.Interpreter_stringLocals[var12++] = var21; // L: 160
								}
							}

							Interpreter.field849 = var0.field1041; // L: 164

							while (true) {
								++var10; // L: 166
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

									var14 = class11.method110(var33, var4, var35); // L: 389
									switch(var14) { // L: 390
									case 0:
										var30 = false;
										break label954;
									case 1:
									default:
										break;
									case 2:
										throw new IllegalStateException(); // L: 393
									}
								} else if (var33 == ScriptOpcodes.ICONST) { // L: 170
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7[var20]; // L: 171
								} else if (var33 == ScriptOpcodes.GET_VARP) { // L: 174
									var13 = var7[var20]; // L: 175
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Varps.Varps_main[var13]; // L: 176
								} else if (var33 == ScriptOpcodes.SET_VARP) { // L: 179
									var13 = var7[var20]; // L: 180
									Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 181
									NetFileRequest.changeGameOptions(var13); // L: 182
								} else if (var33 == ScriptOpcodes.SCONST) { // L: 185
									Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var4.stringOperands[var20]; // L: 186
								} else if (var33 == ScriptOpcodes.JUMP) { // L: 189
									var20 += var7[var20]; // L: 190
								} else if (var33 == ScriptOpcodes.IF_ICMPNE) { // L: 193
									Interpreter.Interpreter_intStackSize -= 2; // L: 194
									if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 195
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPEQ) { // L: 198
									Interpreter.Interpreter_intStackSize -= 2; // L: 199
									if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 200
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPLT) { // L: 203
									Interpreter.Interpreter_intStackSize -= 2; // L: 204
									if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 205
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGT) { // L: 208
									Interpreter.Interpreter_intStackSize -= 2; // L: 209
									if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 210
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.RETURN) { // L: 213
									if (Interpreter.Interpreter_frameDepth == 0) {
										var30 = false;
										break label953;
									}

									ScriptFrame var40 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth]; // L: 215
									var4 = var40.script; // L: 216
									var6 = var4.opcodes; // L: 217
									var7 = var4.intOperands; // L: 218
									var20 = var40.pc; // L: 219
									Interpreter.Interpreter_intLocals = var40.intLocals; // L: 220
									Interpreter.Interpreter_stringLocals = var40.stringLocals; // L: 221
								} else if (var33 == ScriptOpcodes.GET_VARBIT) { // L: 224
									var13 = var7[var20]; // L: 225
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class375.getVarbit(var13); // L: 226
								} else if (var33 == ScriptOpcodes.SET_VARBIT) { // L: 229
									var13 = var7[var20]; // L: 230
									PcmPlayer.method764(var13, Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 231
								} else if (var33 == ScriptOpcodes.IF_ICMPLE) { // L: 234
									Interpreter.Interpreter_intStackSize -= 2; // L: 235
									if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 236
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGE) { // L: 239
									Interpreter.Interpreter_intStackSize -= 2; // L: 240
									if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 241
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.ILOAD) { // L: 244
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.Interpreter_intLocals[var7[var20]]; // L: 245
								} else if (var33 == ScriptOpcodes.ISTORE) { // L: 248
									Interpreter.Interpreter_intLocals[var7[var20]] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 249
								} else if (var33 == ScriptOpcodes.SLOAD) { // L: 252
									Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = Interpreter.Interpreter_stringLocals[var7[var20]]; // L: 253
								} else if (var33 == ScriptOpcodes.SSTORE) { // L: 256
									Interpreter.Interpreter_stringLocals[var7[var20]] = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]; // L: 257
								} else if (var33 == ScriptOpcodes.JOIN_STRING) { // L: 260
									var13 = var7[var20]; // L: 261
									BufferedNetSocket.Interpreter_stringStackSize -= var13; // L: 262
									var21 = PendingSpawn.method2161(Interpreter.Interpreter_stringStack, BufferedNetSocket.Interpreter_stringStackSize, var13); // L: 263
									Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var21; // L: 264
								} else if (var33 == ScriptOpcodes.POP_INT) { // L: 267
									--Interpreter.Interpreter_intStackSize; // L: 268
								} else if (var33 == ScriptOpcodes.POP_STRING) { // L: 271
									--BufferedNetSocket.Interpreter_stringStackSize; // L: 272
								} else {
									int var17;
									if (var33 != ScriptOpcodes.INVOKE) { // L: 275
										if (var33 == ScriptOpcodes.GET_VARC_INT) { // L: 298
											Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = JagexCache.varcs.getInt(var7[var20]); // L: 299
										} else if (var33 == ScriptOpcodes.SET_VARC_INT) { // L: 302
											JagexCache.varcs.setInt(var7[var20], Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 303
										} else if (var33 == ScriptOpcodes.DEFINE_ARRAY) { // L: 306
											var13 = var7[var20] >> 16; // L: 307
											var14 = var7[var20] & 65535; // L: 308
											int var24 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 309
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
											var14 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 321
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 322
												throw new RuntimeException(); // L: 323
											}

											Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14]; // L: 325
										} else if (var33 == ScriptOpcodes.SET_ARRAY_INT) { // L: 328
											var13 = var7[var20]; // L: 329
											Interpreter.Interpreter_intStackSize -= 2; // L: 330
											var14 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 331
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 332
												throw new RuntimeException(); // L: 333
											}

											Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 335
										} else {
											String var22;
											if (var33 == ScriptOpcodes.GET_VARC_STRING_OLD) { // L: 338
												var22 = JagexCache.varcs.getStringOld(var7[var20]); // L: 339
												if (var22 == null) { // L: 340
													var22 = "null";
												}

												Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var22; // L: 341
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING_OLD) { // L: 344
												JagexCache.varcs.setStringOld(var7[var20], Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]); // L: 345
											} else if (var33 == ScriptOpcodes.GET_VARC_STRING) { // L: 348
												var22 = JagexCache.varcs.getString(var7[var20]); // L: 349
												Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var22; // L: 350
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING) { // L: 353
												JagexCache.varcs.setString(var7[var20], Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]); // L: 354
											} else if (var33 == ScriptOpcodes.SWITCH) { // L: 357
												IterableNodeHashTable var38 = var4.switches[var7[var20]]; // L: 358
												IntegerNode var37 = (IntegerNode)var38.get((long)Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 359
												if (var37 != null) { // L: 360
													var20 += var37.integer;
												}
											} else {
												Integer var39;
												if (var33 == ScriptOpcodes.GET_VARCLANSETTING) { // L: 363
													var39 = WorldMapSection0.field2713.getTitleGroupValue(var7[var20]); // L: 364
													if (var39 == null) { // L: 365
														Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 366
													} else {
														Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var39; // L: 369
													}
												} else {
													if (var33 != ScriptOpcodes.GET_VARCLAN) { // L: 373
														throw new IllegalStateException(); // L: 383
													}

													var39 = class221.field2680.method6778(var7[var20]); // L: 374
													if (var39 == null) { // L: 375
														Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 376
													} else {
														Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var39; // L: 379
													}
												}
											}
										}
									} else {
										var13 = var7[var20]; // L: 276
										Script var36 = Players.getScript(var13); // L: 277
										int[] var15 = new int[var36.localIntCount]; // L: 278
										String[] var16 = new String[var36.localStringCount]; // L: 279

										for (var17 = 0; var17 < var36.intArgumentCount; ++var17) { // L: 280
											var15[var17] = Interpreter.Interpreter_intStack[var17 + (Interpreter.Interpreter_intStackSize - var36.intArgumentCount)];
										}

										for (var17 = 0; var17 < var36.stringArgumentCount; ++var17) { // L: 281
											var16[var17] = Interpreter.Interpreter_stringStack[var17 + (BufferedNetSocket.Interpreter_stringStackSize - var36.stringArgumentCount)];
										}

										Interpreter.Interpreter_intStackSize -= var36.intArgumentCount; // L: 282
										BufferedNetSocket.Interpreter_stringStackSize -= var36.stringArgumentCount; // L: 283
										ScriptFrame var23 = new ScriptFrame(); // L: 284
										var23.script = var4; // L: 285
										var23.pc = var20; // L: 286
										var23.intLocals = Interpreter.Interpreter_intLocals; // L: 287
										var23.stringLocals = Interpreter.Interpreter_stringLocals; // L: 288
										Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var23; // L: 289
										var4 = var36; // L: 290
										var6 = var36.opcodes; // L: 291
										var7 = var36.intOperands; // L: 292
										var20 = -1; // L: 293
										Interpreter.Interpreter_intLocals = var15; // L: 294
										Interpreter.Interpreter_stringLocals = var16; // L: 295
									}
								}
							}
						} catch (Exception var31) { // L: 403
							var9 = true; // L: 404
							StringBuilder var27 = new StringBuilder(30); // L: 406
							var27.append("").append(var4.key).append(" "); // L: 407
							var13 = Interpreter.Interpreter_frameDepth - 1; // L: 408

							while (true) {
								if (var13 < 0) {
									var27.append("").append(var8); // L: 409
									FloorDecoration.RunException_sendStackTrace(var27.toString(), var31); // L: 410
									var30 = false;
									break;
								}

								var27.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
								--var13;
							}
						}
					} finally {
						if (var30) {
							while (Interpreter.field832.size() > 0) {
								class92 var19 = (class92)Interpreter.field832.remove(0); // L: 415
								GameEngine.widgetDefaultMenuAction(var19.method2276(), var19.method2274(), var19.method2275(), var19.method2282(), "");
							}

							if (Interpreter.field846) { // L: 418
								Interpreter.field846 = false; // L: 419
								VertexNormal.method4267(); // L: 420
							}

							if (!var9 && var2 > 0 && var10 >= var2) {
								FloorDecoration.RunException_sendStackTrace("Warning: Script " + var4.field960 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
							}

						}
					}

					while (Interpreter.field832.size() > 0) { // L: 414
						class92 var26 = (class92)Interpreter.field832.remove(0);
						GameEngine.widgetDefaultMenuAction(var26.method2276(), var26.method2274(), var26.method2275(), var26.method2282(), "");
					}

					if (Interpreter.field846) {
						Interpreter.field846 = false;
						VertexNormal.method4267();
					}

					if (!var9 && var2 > 0 && var10 >= var2) {
						FloorDecoration.RunException_sendStackTrace("Warning: Script " + var4.field960 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
					}

					return; // L: 426
				}

				while (Interpreter.field832.size() > 0) {
					class92 var34 = (class92)Interpreter.field832.remove(0);
					GameEngine.widgetDefaultMenuAction(var34.method2276(), var34.method2274(), var34.method2275(), var34.method2282(), ""); // L: 416
				}

				if (Interpreter.field846) {
					Interpreter.field846 = false;
					VertexNormal.method4267();
				}

				if (!var9 && var2 > 0 && var10 >= var2) { // L: 422
					FloorDecoration.RunException_sendStackTrace("Warning: Script " + var4.field960 + " finished at op count " + var10 + " of max " + var1, (Throwable)null); // L: 423
				}

				return; // L: 396
			}

			while (Interpreter.field832.size() > 0) {
				class92 var41 = (class92)Interpreter.field832.remove(0);
				GameEngine.widgetDefaultMenuAction(var41.method2276(), var41.method2274(), var41.method2275(), var41.method2282(), "");
			}

			if (Interpreter.field846) {
				Interpreter.field846 = false;
				VertexNormal.method4267();
			}

			if (!var9 && var2 > 0 && var10 >= var2) {
				FloorDecoration.RunException_sendStackTrace("Warning: Script " + var4.field960 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
			}

		}
	} // L: 126 214

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ILbl;ZI)I",
		garbageValue = "1671672543"
	)
	static int method4(int var0, Script var1, boolean var2) {
		int var4 = -1; // L: 614
		Widget var3;
		if (var0 >= 2000) { // L: 615
			var0 -= 1000; // L: 616
			var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 617
			var3 = class130.getWidget(var4); // L: 618
		} else {
			var3 = var2 ? class16.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 620
		}

		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) { // L: 621
			Interpreter.Interpreter_intStackSize -= 2; // L: 622
			var3.scrollX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 623
			if (var3.scrollX > var3.scrollWidth - var3.width) { // L: 624
				var3.scrollX = var3.scrollWidth - var3.width;
			}

			if (var3.scrollX < 0) { // L: 625
				var3.scrollX = 0;
			}

			var3.scrollY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 626
			if (var3.scrollY > var3.scrollHeight - var3.height) { // L: 627
				var3.scrollY = var3.scrollHeight - var3.height;
			}

			if (var3.scrollY < 0) { // L: 628
				var3.scrollY = 0;
			}

			class112.invalidateWidget(var3); // L: 629
			return 1; // L: 630
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) { // L: 632
			var3.color = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 633
			class112.invalidateWidget(var3); // L: 634
			return 1; // L: 635
		} else if (var0 == ScriptOpcodes.CC_SETFILL) { // L: 637
			var3.fill = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 638
			class112.invalidateWidget(var3); // L: 639
			return 1; // L: 640
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) { // L: 642
			var3.transparencyTop = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 643
			class112.invalidateWidget(var3); // L: 644
			return 1; // L: 645
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) { // L: 647
			var3.lineWid = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 648
			class112.invalidateWidget(var3); // L: 649
			return 1; // L: 650
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) { // L: 652
			var3.spriteId2 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 653
			class112.invalidateWidget(var3); // L: 654
			return 1; // L: 655
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) { // L: 657
			var3.spriteAngle = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 658
			class112.invalidateWidget(var3); // L: 659
			return 1; // L: 660
		} else if (var0 == ScriptOpcodes.CC_SETTILING) { // L: 662
			var3.spriteTiling = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 663
			class112.invalidateWidget(var3); // L: 664
			return 1; // L: 665
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) { // L: 667
			var3.modelType = 1; // L: 668
			var3.modelId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 669
			class112.invalidateWidget(var3); // L: 670
			return 1; // L: 671
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) { // L: 673
			Interpreter.Interpreter_intStackSize -= 6; // L: 674
			var3.modelOffsetX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 675
			var3.modelOffsetY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 676
			var3.modelAngleX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 677
			var3.modelAngleY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 678
			var3.modelAngleZ = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4]; // L: 679
			var3.modelZoom = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 5]; // L: 680
			class112.invalidateWidget(var3); // L: 681
			return 1; // L: 682
		} else {
			int var8;
			if (var0 == ScriptOpcodes.CC_SETMODELANIM) { // L: 684
				var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 685
				if (var8 != var3.sequenceId) { // L: 686
					var3.sequenceId = var8; // L: 687
					var3.modelFrame = 0; // L: 688
					var3.modelFrameCycle = 0; // L: 689
					class112.invalidateWidget(var3); // L: 690
				}

				return 1; // L: 692
			} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) { // L: 694
				var3.modelOrthog = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 695
				class112.invalidateWidget(var3); // L: 696
				return 1; // L: 697
			} else if (var0 == ScriptOpcodes.CC_SETTEXT) { // L: 699
				String var7 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]; // L: 700
				if (!var7.equals(var3.text)) { // L: 701
					var3.text = var7; // L: 702
					class112.invalidateWidget(var3); // L: 703
				}

				return 1; // L: 705
			} else if (var0 == ScriptOpcodes.CC_SETTEXTFONT) { // L: 707
				var3.fontId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 708
				class112.invalidateWidget(var3); // L: 709
				return 1; // L: 710
			} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) { // L: 712
				Interpreter.Interpreter_intStackSize -= 3; // L: 713
				var3.textXAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 714
				var3.textYAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 715
				var3.textLineHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 716
				class112.invalidateWidget(var3); // L: 717
				return 1; // L: 718
			} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) { // L: 720
				var3.textShadowed = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 721
				class112.invalidateWidget(var3); // L: 722
				return 1; // L: 723
			} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) { // L: 725
				var3.outline = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 726
				class112.invalidateWidget(var3); // L: 727
				return 1; // L: 728
			} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) { // L: 730
				var3.spriteShadow = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 731
				class112.invalidateWidget(var3); // L: 732
				return 1; // L: 733
			} else if (var0 == ScriptOpcodes.CC_SETVFLIP) { // L: 735
				var3.spriteFlipV = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 736
				class112.invalidateWidget(var3); // L: 737
				return 1; // L: 738
			} else if (var0 == ScriptOpcodes.CC_SETHFLIP) { // L: 740
				var3.spriteFlipH = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 741
				class112.invalidateWidget(var3); // L: 742
				return 1; // L: 743
			} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) { // L: 745
				Interpreter.Interpreter_intStackSize -= 2; // L: 746
				var3.scrollWidth = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 747
				var3.scrollHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 748
				class112.invalidateWidget(var3); // L: 749
				if (var4 != -1 && var3.type == 0) { // L: 750
					PcmPlayer.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var4 >> 16], var3, false);
				}

				return 1; // L: 751
			} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) { // L: 753
				class312.resumePauseWidget(var3.id, var3.childIndex); // L: 754
				Client.meslayerContinueWidget = var3; // L: 755
				class112.invalidateWidget(var3); // L: 756
				return 1; // L: 757
			} else if (var0 == 1122) { // L: 759
				var3.spriteId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 760
				class112.invalidateWidget(var3); // L: 761
				return 1; // L: 762
			} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) { // L: 764
				var3.color2 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 765
				class112.invalidateWidget(var3); // L: 766
				return 1; // L: 767
			} else if (var0 == 1124) { // L: 769
				var3.transparencyBot = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 770
				class112.invalidateWidget(var3); // L: 771
				return 1; // L: 772
			} else if (var0 == 1125) { // L: 774
				var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 775
				FillMode var6 = (FillMode)class140.findEnumerated(class368.FillMode_values(), var8); // L: 776
				if (var6 != null) { // L: 777
					var3.fillMode = var6; // L: 778
					class112.invalidateWidget(var3); // L: 779
				}

				return 1; // L: 781
			} else {
				boolean var5;
				if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) { // L: 783
					var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 784
					var3.field3298 = var5; // L: 785
					return 1; // L: 786
				} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) { // L: 788
					var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 789
					var3.modelTransparency = var5; // L: 790
					return 1; // L: 791
				} else if (var0 == 1128) { // L: 793
					Interpreter.Interpreter_intStackSize -= 2; // L: 794
					return 1; // L: 795
				} else {
					return 2; // L: 797
				}
			}
		}
	}
}
