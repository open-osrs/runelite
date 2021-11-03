import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ar")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("sb")
	@ObfuscatedGetter(
		intValue = 1952022621
	)
	static int field288;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("ItemDefinition_fontPlain11")
	public static Font ItemDefinition_fontPlain11;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	static ClanSettings field287;
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = 580143713
	)
	@Export("selectedItemId")
	static int selectedItemId;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "[Lak;"
	)
	@Export("players")
	volatile PcmPlayer[] players;

	SoundSystem() {
		this.players = new PcmPlayer[2]; // L: 6
	} // L: 8

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) {
				PcmPlayer var2 = this.players[var1]; // L: 13
				if (var2 != null) {
					var2.run();
				}
			}
		} catch (Exception var4) {
			MilliClock.RunException_sendStackTrace((String)null, var4);
		}

	} // L: 20

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)I",
		garbageValue = "1003553351"
	)
	public static int method780(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) { // L: 9
			int var6 = var3; // L: 10
			var3 = var4; // L: 11
			var4 = var6; // L: 12
		}

		var2 &= 3; // L: 14
		if (var2 == 0) { // L: 15
			return var0;
		} else if (var2 == 1) { // L: 16
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1); // L: 17 18
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lck;IIB)V",
		garbageValue = "-35"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args; // L: 114
		Script var4;
		int var20;
		if (class6.isWorldMapEvent(var0.type)) { // L: 116
			class7.worldMapEvent = (WorldMapEvent)var3[0]; // L: 117
			WorldMapElement var5 = ItemComposition.WorldMapElement_get(class7.worldMapEvent.mapElement); // L: 118
			var4 = ObjectSound.getWorldMapScript(var0.type, var5.objectId, var5.category); // L: 119
		} else {
			var20 = (Integer)var3[0]; // L: 122
			var4 = InvDefinition.getScript(var20); // L: 123
		}

		if (var4 != null) { // L: 125
			class14.Interpreter_intStackSize = 0; // L: 128
			class295.Interpreter_stringStackSize = 0; // L: 129
			var20 = -1; // L: 130
			int[] var6 = var4.opcodes; // L: 131
			int[] var7 = var4.intOperands; // L: 132
			byte var8 = -1; // L: 133
			Interpreter.Interpreter_frameDepth = 0; // L: 134
			Interpreter.field795 = false; // L: 135
			boolean var9 = false; // L: 136
			int var10 = 0; // L: 137
			boolean var30 = false;

			label989: {
				label990: {
					try {
						int var13;
						try {
							var30 = true; // L: 139
							class28.Interpreter_intLocals = new int[var4.localIntCount]; // L: 140
							int var11 = 0; // L: 141
							UserComparator7.Interpreter_stringLocals = new String[var4.localStringCount]; // L: 142
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
										var14 = var0.widget != null ? var0.widget.id * 851670683 * -830177389 : -1;
									}

									if (var14 == -2147483644) { // L: 149
										var14 = var0.opIndex;
									}

									if (var14 == -2147483643) { // L: 150
										var14 = var0.widget != null ? var0.widget.childIndex * 855382617 * -349073943 : -1;
									}

									if (var14 == -2147483642) { // L: 151
										var14 = var0.dragTarget != null ? var0.dragTarget.id * 851670683 * -830177389 : -1;
									}

									if (var14 == -2147483641) { // L: 152
										var14 = var0.dragTarget != null ? var0.dragTarget.childIndex * 855382617 * -349073943 : -1;
									}

									if (var14 == -2147483640) { // L: 153
										var14 = var0.keyTyped;
									}

									if (var14 == -2147483639) { // L: 154
										var14 = var0.keyPressed;
									}

									class28.Interpreter_intLocals[var11++] = var14; // L: 155
								} else if (var3[var13] instanceof String) { // L: 157
									var21 = (String)var3[var13]; // L: 158
									if (var21.equals("event_opbase")) { // L: 159
										var21 = var0.targetName;
									}

									UserComparator7.Interpreter_stringLocals[var12++] = var21; // L: 160
								}
							}

							Interpreter.field798 = var0.field1024; // L: 164

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

									var14 = AbstractWorldMapIcon.method4026(var33, var4, var35); // L: 389
									switch(var14) { // L: 390
									case 0:
										var30 = false;
										break label990;
									case 1:
									default:
										break;
									case 2:
										throw new IllegalStateException(); // L: 393
									}
								} else if (var33 == 0) { // L: 170
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var7[var20]; // L: 171
								} else if (var33 == ScriptOpcodes.GET_VARP) { // L: 174
									var13 = var7[var20]; // L: 175
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Varps.Varps_main[var13]; // L: 176
								} else if (var33 == ScriptOpcodes.SET_VARP) { // L: 179
									var13 = var7[var20]; // L: 180
									Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 181
									WorldMapLabelSize.changeGameOptions(var13); // L: 182
								} else if (var33 == ScriptOpcodes.SCONST) { // L: 185
									Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var4.stringOperands[var20]; // L: 186
								} else if (var33 == ScriptOpcodes.JUMP) { // L: 189
									var20 += var7[var20]; // L: 190
								} else if (var33 == ScriptOpcodes.IF_ICMPNE) { // L: 193
									class14.Interpreter_intStackSize -= 2; // L: 194
									if (Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]) { // L: 195
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPEQ) { // L: 198
									class14.Interpreter_intStackSize -= 2; // L: 199
									if (Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]) { // L: 200
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPLT) { // L: 203
									class14.Interpreter_intStackSize -= 2; // L: 204
									if (Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]) { // L: 205
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGT) { // L: 208
									class14.Interpreter_intStackSize -= 2; // L: 209
									if (Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]) { // L: 210
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.RETURN) { // L: 213
									if (Interpreter.Interpreter_frameDepth == 0) { // L: 214
										var30 = false;
										break;
									}

									ScriptFrame var40 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth]; // L: 215
									var4 = var40.script; // L: 216
									var6 = var4.opcodes; // L: 217
									var7 = var4.intOperands; // L: 218
									var20 = var40.pc; // L: 219
									class28.Interpreter_intLocals = var40.intLocals; // L: 220
									UserComparator7.Interpreter_stringLocals = var40.stringLocals; // L: 221
								} else if (var33 == ScriptOpcodes.GET_VARBIT) { // L: 224
									var13 = var7[var20]; // L: 225
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class119.getVarbit(var13); // L: 226
								} else if (var33 == ScriptOpcodes.SET_VARBIT) { // L: 229
									var13 = var7[var20]; // L: 230
									class123.method2616(var13, Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]); // L: 231
								} else if (var33 == ScriptOpcodes.IF_ICMPLE) { // L: 234
									class14.Interpreter_intStackSize -= 2; // L: 235
									if (Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]) { // L: 236
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGE) { // L: 239
									class14.Interpreter_intStackSize -= 2; // L: 240
									if (Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]) { // L: 241
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.ILOAD) { // L: 244
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class28.Interpreter_intLocals[var7[var20]]; // L: 245
								} else if (var33 == ScriptOpcodes.ISTORE) { // L: 248
									class28.Interpreter_intLocals[var7[var20]] = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 249
								} else if (var33 == ScriptOpcodes.SLOAD) { // L: 252
									Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = UserComparator7.Interpreter_stringLocals[var7[var20]]; // L: 253
								} else if (var33 == ScriptOpcodes.SSTORE) { // L: 256
									UserComparator7.Interpreter_stringLocals[var7[var20]] = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]; // L: 257
								} else if (var33 == ScriptOpcodes.JOIN_STRING) { // L: 260
									var13 = var7[var20]; // L: 261
									class295.Interpreter_stringStackSize -= var13; // L: 262
									var21 = DynamicObject.method2003(Interpreter.Interpreter_stringStack, class295.Interpreter_stringStackSize, var13); // L: 263
									Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var21; // L: 264
								} else if (var33 == ScriptOpcodes.POP_INT) { // L: 267
									--class14.Interpreter_intStackSize; // L: 268
								} else if (var33 == ScriptOpcodes.POP_STRING) { // L: 271
									--class295.Interpreter_stringStackSize; // L: 272
								} else {
									int var17;
									if (var33 != ScriptOpcodes.INVOKE) { // L: 275
										if (var33 == ScriptOpcodes.GET_VARC_INT) { // L: 298
											Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Message.varcs.getInt(var7[var20]); // L: 299
										} else if (var33 == ScriptOpcodes.SET_VARC_INT) { // L: 302
											Message.varcs.setInt(var7[var20], Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]); // L: 303
										} else if (var33 == ScriptOpcodes.DEFINE_ARRAY) { // L: 306
											var13 = var7[var20] >> 16; // L: 307
											var14 = var7[var20] & 65535; // L: 308
											int var24 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 309
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
											var14 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 321
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 322
												throw new RuntimeException(); // L: 323
											}

											Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14]; // L: 325
										} else if (var33 == ScriptOpcodes.SET_ARRAY_INT) { // L: 328
											var13 = var7[var20]; // L: 329
											class14.Interpreter_intStackSize -= 2; // L: 330
											var14 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 331
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 332
												throw new RuntimeException(); // L: 333
											}

											Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]; // L: 335
										} else {
											String var22;
											if (var33 == ScriptOpcodes.GET_VARC_STRING_OLD) { // L: 338
												var22 = Message.varcs.getStringOld(var7[var20]); // L: 339
												if (var22 == null) { // L: 340
													var22 = "null";
												}

												Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var22; // L: 341
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING_OLD) { // L: 344
												Message.varcs.setStringOld(var7[var20], Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]); // L: 345
											} else if (var33 == ScriptOpcodes.GET_VARC_STRING) { // L: 348
												var22 = Message.varcs.getString(var7[var20]); // L: 349
												Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var22; // L: 350
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING) { // L: 353
												Message.varcs.setString(var7[var20], Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]); // L: 354
											} else if (var33 == ScriptOpcodes.SWITCH) { // L: 357
												IterableNodeHashTable var38 = var4.switches[var7[var20]]; // L: 358
												IntegerNode var37 = (IntegerNode)var38.get((long)Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]); // L: 359
												if (var37 != null) { // L: 360
													var20 += var37.integer;
												}
											} else {
												Integer var39;
												if (var33 == ScriptOpcodes.GET_VARCLANSETTING) { // L: 363
													var39 = field287.getTitleGroupValue(var7[var20]); // L: 364
													if (var39 == null) { // L: 365
														Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1; // L: 366
													} else {
														Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var39; // L: 369
													}
												} else {
													if (var33 != ScriptOpcodes.GET_VARCLAN) { // L: 373
														throw new IllegalStateException(); // L: 383
													}

													var39 = NPC.field1210.method6379(var7[var20]); // L: 374
													if (var39 == null) { // L: 375
														Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1; // L: 376
													} else {
														Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var39; // L: 379
													}
												}
											}
										}
									} else {
										var13 = var7[var20]; // L: 276
										Script var36 = InvDefinition.getScript(var13); // L: 277
										int[] var15 = new int[var36.localIntCount]; // L: 278
										String[] var16 = new String[var36.localStringCount]; // L: 279

										for (var17 = 0; var17 < var36.intArgumentCount; ++var17) { // L: 280
											var15[var17] = Interpreter.Interpreter_intStack[var17 + (class14.Interpreter_intStackSize - var36.intArgumentCount)];
										}

										for (var17 = 0; var17 < var36.stringArgumentCount; ++var17) { // L: 281
											var16[var17] = Interpreter.Interpreter_stringStack[var17 + (class295.Interpreter_stringStackSize - var36.stringArgumentCount)];
										}

										class14.Interpreter_intStackSize -= var36.intArgumentCount; // L: 282
										class295.Interpreter_stringStackSize -= var36.stringArgumentCount; // L: 283
										ScriptFrame var23 = new ScriptFrame(); // L: 284
										var23.script = var4; // L: 285
										var23.pc = var20; // L: 286
										var23.intLocals = class28.Interpreter_intLocals; // L: 287
										var23.stringLocals = UserComparator7.Interpreter_stringLocals; // L: 288
										Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var23; // L: 289
										var4 = var36; // L: 290
										var6 = var36.opcodes; // L: 291
										var7 = var36.intOperands; // L: 292
										var20 = -1; // L: 293
										class28.Interpreter_intLocals = var15; // L: 294
										UserComparator7.Interpreter_stringLocals = var16; // L: 295
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
							MilliClock.RunException_sendStackTrace(var27.toString(), var31); // L: 410
							var30 = false;
							break label989;
						}
					} finally {
						if (var30) {
							if (Interpreter.field795) { // L: 414
								Interpreter.field791 = true; // L: 415
							}

							while (Interpreter.field797.size() > 0) { // L: 417
								class92 var19 = (class92)Interpreter.field797.remove(0); // L: 418
								GrandExchangeEvents.widgetDefaultMenuAction(var19.method2277(), var19.method2279(), var19.method2278(), var19.method2281(), "");
							}

							if (Interpreter.field791) { // L: 421
								class14.method191(); // L: 422
								Interpreter.field791 = false; // L: 423
								Interpreter.field795 = false; // L: 424
							}

							if (!var9 && var2 > 0 && var10 >= var2) {
								MilliClock.RunException_sendStackTrace("Warning: Script " + var4.field928 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
							}

						}
					}

					if (Interpreter.field795) {
						Interpreter.field791 = true;
					}

					while (Interpreter.field797.size() > 0) {
						class92 var41 = (class92)Interpreter.field797.remove(0);
						GrandExchangeEvents.widgetDefaultMenuAction(var41.method2277(), var41.method2279(), var41.method2278(), var41.method2281(), "");
					}

					if (Interpreter.field791) {
						class14.method191();
						Interpreter.field791 = false;
						Interpreter.field795 = false;
					}

					if (!var9 && var2 > 0 && var10 >= var2) {
						MilliClock.RunException_sendStackTrace("Warning: Script " + var4.field928 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
					}

					return;
				}

				if (Interpreter.field795) {
					Interpreter.field791 = true;
				}

				while (Interpreter.field797.size() > 0) {
					class92 var34 = (class92)Interpreter.field797.remove(0);
					GrandExchangeEvents.widgetDefaultMenuAction(var34.method2277(), var34.method2279(), var34.method2278(), var34.method2281(), ""); // L: 419
				}

				if (Interpreter.field791) {
					class14.method191();
					Interpreter.field791 = false;
					Interpreter.field795 = false;
				}

				if (!var9 && var2 > 0 && var10 >= var2) { // L: 426
					MilliClock.RunException_sendStackTrace("Warning: Script " + var4.field928 + " finished at op count " + var10 + " of max " + var1, (Throwable)null); // L: 427
				}

				return;
			}

			if (Interpreter.field795) {
				Interpreter.field791 = true;
			}

			while (Interpreter.field797.size() > 0) {
				class92 var26 = (class92)Interpreter.field797.remove(0);
				GrandExchangeEvents.widgetDefaultMenuAction(var26.method2277(), var26.method2279(), var26.method2278(), var26.method2281(), "");
			}

			if (Interpreter.field791) {
				class14.method191();
				Interpreter.field791 = false;
				Interpreter.field795 = false;
			}

			if (!var9 && var2 > 0 && var10 >= var2) {
				MilliClock.RunException_sendStackTrace("Warning: Script " + var4.field928 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
			}

		}
	} // L: 126 430

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1676514787"
	)
	public static int method787(int var0) {
		return class21.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var0]); // L: 77
	}

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(Ljf;IB)Ljava/lang/String;",
		garbageValue = "-69"
	)
	static String method785(Widget var0, int var1) {
		int var3 = PendingSpawn.getWidgetFlags(var0); // L: 11905
		boolean var2 = (var3 >> var1 + 1 & 1) != 0; // L: 11907
		if (!var2 && var0.onOp == null) { // L: 11909
			return null;
		} else {
			return var0.actions != null && var0.actions.length > var1 && var0.actions[var1] != null && var0.actions[var1].trim().length() != 0 ? var0.actions[var1] : null; // L: 11910 11911 11913
		}
	}
}
