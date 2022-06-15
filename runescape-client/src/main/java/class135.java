import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ea")
public class class135 extends class128 {
	@ObfuscatedName("c")
	boolean field1607;
	@ObfuscatedName("v")
	byte field1605;
	@ObfuscatedName("q")
	byte field1609;
	@ObfuscatedName("f")
	byte field1608;
	@ObfuscatedName("j")
	byte field1606;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lej;)V"
	)
	class135(class131 var1) {
		this.this$0 = var1; // L: 248
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqt;B)V",
		garbageValue = "5"
	)
	void vmethod3150(Buffer var1) {
		this.field1607 = var1.readUnsignedByte() == 1;
		this.field1605 = var1.readByte(); // L: 252
		this.field1609 = var1.readByte(); // L: 253
		this.field1608 = var1.readByte();
		this.field1606 = var1.readByte();
	} // L: 256

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Len;I)V",
		garbageValue = "-1718344311"
	)
	void vmethod3149(ClanSettings var1) {
		var1.allowGuests = this.field1607;
		var1.field1637 = this.field1605; // L: 260
		var1.field1633 = this.field1609; // L: 261
		var1.field1634 = this.field1608;
		var1.field1645 = this.field1606;
	} // L: 264

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lcw;III)V",
		garbageValue = "891167101"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args; // L: 120
		Script var4;
		int var20;
		if (MilliClock.isWorldMapEvent(var0.type)) { // L: 122
			class21.worldMapEvent = (WorldMapEvent)var3[0]; // L: 123
			WorldMapElement var5 = class432.WorldMapElement_get(class21.worldMapEvent.mapElement); // L: 124
			var4 = class149.getWorldMapScript(var0.type, var5.objectId, var5.category); // L: 125
		} else {
			var20 = (Integer)var3[0]; // L: 128
			var4 = Language.getScript(var20); // L: 129
		}

		if (var4 != null) { // L: 131
			class446.Interpreter_intStackSize = 0; // L: 134
			Interpreter.Interpreter_stringStackSize = 0; // L: 135
			var20 = -1; // L: 136
			int[] var6 = var4.opcodes; // L: 137
			int[] var7 = var4.intOperands; // L: 138
			byte var8 = -1; // L: 139
			Interpreter.Interpreter_frameDepth = 0; // L: 140
			Interpreter.field829 = false; // L: 141
			boolean var9 = false; // L: 142
			int var10 = 0; // L: 143
			boolean var30 = false;

			label952: {
				label953: {
					try {
						int var13;
						try {
							var30 = true; // L: 145
							Interpreter.Interpreter_intLocals = new int[var4.localIntCount]; // L: 146
							int var11 = 0; // L: 147
							class326.Interpreter_stringLocals = new String[var4.localStringCount]; // L: 148
							int var12 = 0;

							int var14;
							String var21;
							for (var13 = 1; var13 < var3.length; ++var13) { // L: 149
								if (var3[var13] instanceof Integer) { // L: 150
									var14 = (Integer)var3[var13]; // L: 151
									if (var14 == -2147483647) { // L: 152
										var14 = var0.mouseX;
									}

									if (var14 == -2147483646) { // L: 153
										var14 = var0.mouseY;
									}

									if (var14 == -2147483645) { // L: 154
										var14 = var0.widget != null ? var0.widget.id * -1598663557 * -1038587213 : -1;
									}

									if (var14 == -2147483644) { // L: 155
										var14 = var0.opIndex;
									}

									if (var14 == -2147483643) { // L: 156
										var14 = var0.widget != null ? var0.widget.childIndex * 9919479 * -385493561 : -1;
									}

									if (var14 == -2147483642) { // L: 157
										var14 = var0.dragTarget != null ? var0.dragTarget.id * -1598663557 * -1038587213 : -1;
									}

									if (var14 == -2147483641) { // L: 158
										var14 = var0.dragTarget != null ? var0.dragTarget.childIndex * 9919479 * -385493561 : -1;
									}

									if (var14 == -2147483640) { // L: 159
										var14 = var0.keyTyped;
									}

									if (var14 == -2147483639) { // L: 160
										var14 = var0.keyPressed;
									}

									Interpreter.Interpreter_intLocals[var11++] = var14; // L: 161
								} else if (var3[var13] instanceof String) { // L: 163
									var21 = (String)var3[var13]; // L: 164
									if (var21.equals("event_opbase")) { // L: 165
										var21 = var0.targetName;
									}

									class326.Interpreter_stringLocals[var12++] = var21; // L: 166
								}
							}

							Interpreter.field850 = var0.field1056; // L: 170

							while (true) {
								++var10; // L: 172
								if (var10 > var1) { // L: 173
									throw new RuntimeException();
								}

								++var20; // L: 174
								int var33 = var6[var20];
								if (var33 >= 100) { // L: 175
									boolean var35;
									if (var4.intOperands[var20] == 1) { // L: 393
										var35 = true;
									} else {
										var35 = false; // L: 394
									}

									var14 = Friend.method6619(var33, var4, var35); // L: 395
									switch(var14) { // L: 396
									case 0:
										var30 = false;
										break label952;
									case 1:
									default:
										break;
									case 2:
										throw new IllegalStateException(); // L: 399
									}
								} else if (var33 == ScriptOpcodes.ICONST) { // L: 176
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var7[var20]; // L: 177
								} else if (var33 == ScriptOpcodes.GET_VARP) { // L: 180
									var13 = var7[var20]; // L: 181
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Varps.Varps_main[var13]; // L: 182
								} else if (var33 == ScriptOpcodes.SET_VARP) { // L: 185
									var13 = var7[var20]; // L: 186
									Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 187
									class306.changeGameOptions(var13); // L: 188
								} else if (var33 == ScriptOpcodes.SCONST) { // L: 191
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.stringOperands[var20]; // L: 192
								} else if (var33 == ScriptOpcodes.JUMP) { // L: 195
									var20 += var7[var20]; // L: 196
								} else if (var33 == ScriptOpcodes.IF_ICMPNE) { // L: 199
									class446.Interpreter_intStackSize -= 2; // L: 200
									if (Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]) { // L: 201
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPEQ) { // L: 204
									class446.Interpreter_intStackSize -= 2; // L: 205
									if (Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]) { // L: 206
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPLT) { // L: 209
									class446.Interpreter_intStackSize -= 2; // L: 210
									if (Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]) { // L: 211
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGT) { // L: 214
									class446.Interpreter_intStackSize -= 2; // L: 215
									if (Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]) { // L: 216
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.RETURN) { // L: 219
									if (Interpreter.Interpreter_frameDepth == 0) {
										var30 = false;
										break;
									}

									ScriptFrame var40 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth]; // L: 221
									var4 = var40.script; // L: 222
									var6 = var4.opcodes; // L: 223
									var7 = var4.intOperands; // L: 224
									var20 = var40.pc; // L: 225
									Interpreter.Interpreter_intLocals = var40.intLocals; // L: 226
									class326.Interpreter_stringLocals = var40.stringLocals; // L: 227
								} else if (var33 == ScriptOpcodes.GET_VARBIT) { // L: 230
									var13 = var7[var20]; // L: 231
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = class388.getVarbit(var13); // L: 232
								} else if (var33 == ScriptOpcodes.SET_VARBIT) { // L: 235
									var13 = var7[var20]; // L: 236
									PacketBufferNode.method5200(var13, Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]); // L: 237
								} else if (var33 == ScriptOpcodes.IF_ICMPLE) { // L: 240
									class446.Interpreter_intStackSize -= 2; // L: 241
									if (Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]) { // L: 242
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGE) { // L: 245
									class446.Interpreter_intStackSize -= 2; // L: 246
									if (Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]) { // L: 247
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.ILOAD) { // L: 250
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Interpreter.Interpreter_intLocals[var7[var20]]; // L: 251
								} else if (var33 == ScriptOpcodes.ISTORE) { // L: 254
									Interpreter.Interpreter_intLocals[var7[var20]] = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 255
								} else if (var33 == ScriptOpcodes.SLOAD) { // L: 258
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class326.Interpreter_stringLocals[var7[var20]]; // L: 259
								} else if (var33 == ScriptOpcodes.SSTORE) { // L: 262
									class326.Interpreter_stringLocals[var7[var20]] = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 263
								} else if (var33 == ScriptOpcodes.JOIN_STRING) { // L: 266
									var13 = var7[var20]; // L: 267
									Interpreter.Interpreter_stringStackSize -= var13; // L: 268
									var21 = User.method6679(Interpreter.Interpreter_stringStack, Interpreter.Interpreter_stringStackSize, var13); // L: 269
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var21; // L: 270
								} else if (var33 == ScriptOpcodes.POP_INT) { // L: 273
									--class446.Interpreter_intStackSize; // L: 274
								} else if (var33 == ScriptOpcodes.POP_STRING) { // L: 277
									--Interpreter.Interpreter_stringStackSize; // L: 278
								} else {
									int var17;
									if (var33 != ScriptOpcodes.INVOKE) { // L: 281
										if (var33 == ScriptOpcodes.GET_VARC_INT) { // L: 304
											Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = class308.varcs.getInt(var7[var20]); // L: 305
										} else if (var33 == ScriptOpcodes.SET_VARC_INT) { // L: 308
											class308.varcs.setInt(var7[var20], Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]); // L: 309
										} else if (var33 == ScriptOpcodes.DEFINE_ARRAY) { // L: 312
											var13 = var7[var20] >> 16; // L: 313
											var14 = var7[var20] & 65535; // L: 314
											int var24 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 315
											if (var24 < 0 || var24 > 5000) { // L: 316
												throw new RuntimeException(); // L: 317
											}

											Interpreter.Interpreter_arrayLengths[var13] = var24; // L: 319
											byte var25 = -1; // L: 320
											if (var14 == 105) { // L: 321
												var25 = 0;
											}

											for (var17 = 0; var17 < var24; ++var17) { // L: 322
												Interpreter.Interpreter_arrays[var13][var17] = var25;
											}
										} else if (var33 == ScriptOpcodes.GET_ARRAY_INT) { // L: 325
											var13 = var7[var20]; // L: 326
											var14 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 327
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 328
												throw new RuntimeException(); // L: 329
											}

											Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14]; // L: 331
										} else if (var33 == ScriptOpcodes.SET_ARRAY_INT) { // L: 334
											var13 = var7[var20]; // L: 335
											class446.Interpreter_intStackSize -= 2; // L: 336
											var14 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 337
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 338
												throw new RuntimeException(); // L: 339
											}

											Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 341
										} else {
											String var22;
											if (var33 == ScriptOpcodes.GET_VARC_STRING_OLD) { // L: 344
												var22 = class308.varcs.getStringOld(var7[var20]); // L: 345
												if (var22 == null) { // L: 346
													var22 = "null";
												}

												Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var22; // L: 347
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING_OLD) { // L: 350
												class308.varcs.setStringOld(var7[var20], Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]); // L: 351
											} else if (var33 == ScriptOpcodes.GET_VARC_STRING) { // L: 354
												var22 = class308.varcs.getString(var7[var20]); // L: 355
												Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var22; // L: 356
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING) { // L: 359
												class308.varcs.setString(var7[var20], Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]); // L: 360
											} else if (var33 == ScriptOpcodes.SWITCH) { // L: 363
												IterableNodeHashTable var38 = var4.switches[var7[var20]]; // L: 364
												IntegerNode var37 = (IntegerNode)var38.get((long)Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]); // L: 365
												if (var37 != null) { // L: 366
													var20 += var37.integer;
												}
											} else {
												Integer var39;
												if (var33 == ScriptOpcodes.GET_VARCLANSETTING) { // L: 369
													var39 = WorldMapID.field2842.getTitleGroupValue(var7[var20]); // L: 370
													if (var39 == null) { // L: 371
														Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1; // L: 372
													} else {
														Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var39; // L: 375
													}
												} else {
													if (var33 != ScriptOpcodes.GET_VARCLAN) { // L: 379
														throw new IllegalStateException(); // L: 389
													}

													var39 = FontName.field4584.method7055(var7[var20]); // L: 380
													if (var39 == null) { // L: 381
														Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1; // L: 382
													} else {
														Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var39; // L: 385
													}
												}
											}
										}
									} else {
										var13 = var7[var20]; // L: 282
										Script var36 = Language.getScript(var13); // L: 283
										int[] var15 = new int[var36.localIntCount]; // L: 284
										String[] var16 = new String[var36.localStringCount]; // L: 285

										for (var17 = 0; var17 < var36.intArgumentCount; ++var17) { // L: 286
											var15[var17] = Interpreter.Interpreter_intStack[var17 + (class446.Interpreter_intStackSize - var36.intArgumentCount)];
										}

										for (var17 = 0; var17 < var36.stringArgumentCount; ++var17) { // L: 287
											var16[var17] = Interpreter.Interpreter_stringStack[var17 + (Interpreter.Interpreter_stringStackSize - var36.stringArgumentCount)];
										}

										class446.Interpreter_intStackSize -= var36.intArgumentCount; // L: 288
										Interpreter.Interpreter_stringStackSize -= var36.stringArgumentCount; // L: 289
										ScriptFrame var23 = new ScriptFrame(); // L: 290
										var23.script = var4; // L: 291
										var23.pc = var20; // L: 292
										var23.intLocals = Interpreter.Interpreter_intLocals; // L: 293
										var23.stringLocals = class326.Interpreter_stringLocals; // L: 294
										Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var23; // L: 295
										var4 = var36; // L: 296
										var6 = var36.opcodes; // L: 297
										var7 = var36.intOperands; // L: 298
										var20 = -1; // L: 299
										Interpreter.Interpreter_intLocals = var15; // L: 300
										class326.Interpreter_stringLocals = var16; // L: 301
									}
								}
							}
						} catch (Exception var31) { // L: 409
							var9 = true; // L: 410
							StringBuilder var27 = new StringBuilder(30); // L: 412
							var27.append("").append(var4.key).append(" "); // L: 413

							for (var13 = Interpreter.Interpreter_frameDepth - 1; var13 >= 0; --var13) { // L: 414
								var27.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
							}

							var27.append("").append(var8); // L: 415
							class249.RunException_sendStackTrace(var27.toString(), var31); // L: 416
							var30 = false;
							break label953;
						}
					} finally {
						if (var30) {
							while (Interpreter.field843.size() > 0) {
								class93 var19 = (class93)Interpreter.field843.remove(0); // L: 421
								TextureProvider.widgetDefaultMenuAction(var19.method2391(), var19.method2392(), var19.method2400(), var19.method2393(), "");
							}

							if (Interpreter.field829) { // L: 424
								Interpreter.field829 = false; // L: 425
								Occluder.method4354(); // L: 426
							}

							if (!var9 && var2 > 0 && var10 >= var2) {
								class249.RunException_sendStackTrace("Warning: Script " + var4.field967 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
							}

						}
					}

					while (Interpreter.field843.size() > 0) {
						class93 var41 = (class93)Interpreter.field843.remove(0);
						TextureProvider.widgetDefaultMenuAction(var41.method2391(), var41.method2392(), var41.method2400(), var41.method2393(), "");
					}

					if (Interpreter.field829) {
						Interpreter.field829 = false;
						Occluder.method4354();
					}

					if (!var9 && var2 > 0 && var10 >= var2) {
						class249.RunException_sendStackTrace("Warning: Script " + var4.field967 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
					}

					return; // L: 220
				}

				while (Interpreter.field843.size() > 0) { // L: 420
					class93 var26 = (class93)Interpreter.field843.remove(0);
					TextureProvider.widgetDefaultMenuAction(var26.method2391(), var26.method2392(), var26.method2400(), var26.method2393(), "");
				}

				if (Interpreter.field829) {
					Interpreter.field829 = false;
					Occluder.method4354();
				}

				if (!var9 && var2 > 0 && var10 >= var2) {
					class249.RunException_sendStackTrace("Warning: Script " + var4.field967 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
				}

				return; // L: 432
			}

			while (Interpreter.field843.size() > 0) {
				class93 var34 = (class93)Interpreter.field843.remove(0);
				TextureProvider.widgetDefaultMenuAction(var34.method2391(), var34.method2392(), var34.method2400(), var34.method2393(), ""); // L: 422
			}

			if (Interpreter.field829) {
				Interpreter.field829 = false;
				Occluder.method4354();
			}

			if (!var9 && var2 > 0 && var10 >= var2) { // L: 428
				class249.RunException_sendStackTrace("Warning: Script " + var4.field967 + " finished at op count " + var10 + " of max " + var1, (Throwable)null); // L: 429
			}

		}
	} // L: 132 404

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-3"
	)
	public static int method2910(int var0) {
		--var0; // L: 50
		var0 |= var0 >>> 1; // L: 51
		var0 |= var0 >>> 2; // L: 52
		var0 |= var0 >>> 4; // L: 53
		var0 |= var0 >>> 8; // L: 54
		var0 |= var0 >>> 16; // L: 55
		return var0 + 1; // L: 56
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1627158309"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		if (!class353.client.method1102() && !class353.client.method1103()) { // L: 1164
			Login.Login_response1 = ""; // L: 1168
			Login.Login_response2 = "Enter your username/email & password."; // L: 1169
			Login.Login_response3 = ""; // L: 1170
			WorldMapData_1.method4872(2); // L: 1171
			if (var0) { // L: 1172
				Login.Login_password = "";
			}

			KeyHandler.method286(); // L: 1173
			class29.method357(); // L: 1174
		} else {
			WorldMapData_1.method4872(10); // L: 1165
		}
	} // L: 1166 1175

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-802967854"
	)
	static void method2917() {
		int var0 = Players.Players_count; // L: 4793
		int[] var1 = Players.Players_indices; // L: 4794

		for (int var2 = 0; var2 < var0; ++var2) { // L: 4795
			if (var1[var2] != Client.combatTargetPlayerIndex && var1[var2] != Client.localPlayerIndex) { // L: 4796
				ByteArrayPool.addPlayerToScene(Client.players[var1[var2]], true); // L: 4797
			}
		}

	} // L: 4799
}
