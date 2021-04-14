import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fh")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1100336631
	)
	@Export("musicTrackGroupId")
	public static int musicTrackGroupId;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -1521392293
	)
	static int field2002;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 2025670569
	)
	@Export("x")
	int x;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 645441179
	)
	@Export("y")
	int y;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1727804359
	)
	@Export("z")
	int z;

	FaceNormal() {
	} // L: 8

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lcj;IIB)V",
		garbageValue = "18"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args; // L: 109
		Script var4;
		int var19;
		if (WorldMap.isWorldMapEvent(var0.type)) { // L: 111
			UrlRequest.worldMapEvent = (WorldMapEvent)var3[0]; // L: 112
			WorldMapElement var5 = ByteArrayPool.WorldMapElement_get(UrlRequest.worldMapEvent.mapElement); // L: 113
			var4 = Tiles.getWorldMapScript(var0.type, var5.objectId, var5.category); // L: 114
		} else {
			var19 = (Integer)var3[0]; // L: 117
			var4 = class24.getScript(var19); // L: 118
		}

		if (var4 != null) { // L: 120
			class16.Interpreter_intStackSize = 0; // L: 123
			Interpreter.Interpreter_stringStackSize = 0; // L: 124
			var19 = -1; // L: 125
			int[] var6 = var4.opcodes; // L: 126
			int[] var7 = var4.intOperands; // L: 127
			byte var8 = -1; // L: 128
			Interpreter.Interpreter_frameDepth = 0; // L: 129
			Interpreter.field944 = false; // L: 130
			boolean var9 = false; // L: 131
			int var10 = 0; // L: 132

			try {
				int var13;
				try {
					ScriptFrame.Interpreter_intLocals = new int[var4.localIntCount]; // L: 134
					int var11 = 0; // L: 135
					Interpreter.Interpreter_stringLocals = new String[var4.localStringCount]; // L: 136
					int var12 = 0; // L: 137

					int var14;
					String var20;
					for (var13 = 1; var13 < var3.length; ++var13) { // L: 138
						if (var3[var13] instanceof Integer) { // L: 139
							var14 = (Integer)var3[var13]; // L: 140
							if (var14 == -2147483647) { // L: 141
								var14 = var0.mouseX;
							}

							if (var14 == -2147483646) { // L: 142
								var14 = var0.mouseY;
							}

							if (var14 == -2147483645) { // L: 143
								var14 = var0.widget != null ? var0.widget.id * 516202957 * 1486959365 : -1;
							}

							if (var14 == -2147483644) { // L: 144
								var14 = var0.opIndex;
							}

							if (var14 == -2147483643) { // L: 145
								var14 = var0.widget != null ? var0.widget.childIndex * 1704710587 * 20794227 : -1;
							}

							if (var14 == -2147483642) { // L: 146
								var14 = var0.dragTarget != null ? var0.dragTarget.id * 516202957 * 1486959365 : -1;
							}

							if (var14 == -2147483641) { // L: 147
								var14 = var0.dragTarget != null ? var0.dragTarget.childIndex * 1704710587 * 20794227 : -1;
							}

							if (var14 == -2147483640) { // L: 148
								var14 = var0.keyTyped;
							}

							if (var14 == -2147483639) { // L: 149
								var14 = var0.keyPressed;
							}

							ScriptFrame.Interpreter_intLocals[var11++] = var14; // L: 150
						} else if (var3[var13] instanceof String) { // L: 152
							var20 = (String)var3[var13]; // L: 153
							if (var20.equals("event_opbase")) { // L: 154
								var20 = var0.targetName;
							}

							Interpreter.Interpreter_stringLocals[var12++] = var20; // L: 155
						}
					}

					Interpreter.field950 = var0.field1154; // L: 159

					while (true) {
						++var10; // L: 161
						if (var10 > var1) { // L: 162
							throw new RuntimeException();
						}

						++var19; // L: 163
						int var31 = var6[var19];
						if (var31 >= 100) { // L: 164
							boolean var32;
							if (var4.intOperands[var19] == 1) { // L: 382
								var32 = true;
							} else {
								var32 = false; // L: 383
							}

							var14 = class223.method4236(var31, var4, var32); // L: 384
							switch(var14) { // L: 385
							case 0:
								return;
							case 1:
							default:
								break;
							case 2:
								throw new IllegalStateException(); // L: 388
							}
						} else if (var31 == 0) { // L: 165
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var7[var19]; // L: 166
						} else if (var31 == ScriptOpcodes.GET_VARP) { // L: 169
							var13 = var7[var19]; // L: 170
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Varps.Varps_main[var13]; // L: 171
						} else if (var31 == ScriptOpcodes.SET_VARP) { // L: 174
							var13 = var7[var19]; // L: 175
							Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 176
							class27.changeGameOptions(var13); // L: 177
						} else if (var31 == ScriptOpcodes.SCONST) { // L: 180
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.stringOperands[var19]; // L: 181
						} else if (var31 == ScriptOpcodes.JUMP) { // L: 184
							var19 += var7[var19]; // L: 185
						} else if (var31 == ScriptOpcodes.IF_ICMPNE) { // L: 188
							class16.Interpreter_intStackSize -= 2; // L: 189
							if (Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]) { // L: 190
								var19 += var7[var19];
							}
						} else if (var31 == ScriptOpcodes.IF_ICMPEQ) { // L: 193
							class16.Interpreter_intStackSize -= 2; // L: 194
							if (Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]) { // L: 195
								var19 += var7[var19];
							}
						} else if (var31 == ScriptOpcodes.IF_ICMPLT) { // L: 198
							class16.Interpreter_intStackSize -= 2; // L: 199
							if (Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]) { // L: 200
								var19 += var7[var19];
							}
						} else if (var31 == ScriptOpcodes.IF_ICMPGT) { // L: 203
							class16.Interpreter_intStackSize -= 2; // L: 204
							if (Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]) { // L: 205
								var19 += var7[var19];
							}
						} else if (var31 == ScriptOpcodes.RETURN) { // L: 208
							if (Interpreter.Interpreter_frameDepth == 0) { // L: 209
								return; // L: 416
							}

							ScriptFrame var37 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth]; // L: 210
							var4 = var37.script; // L: 211
							var6 = var4.opcodes; // L: 212
							var7 = var4.intOperands; // L: 213
							var19 = var37.pc; // L: 214
							ScriptFrame.Interpreter_intLocals = var37.intLocals; // L: 215
							Interpreter.Interpreter_stringLocals = var37.stringLocals; // L: 216
						} else if (var31 == ScriptOpcodes.GET_VARBIT) { // L: 219
							var13 = var7[var19]; // L: 220
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class2.getVarbit(var13); // L: 221
						} else if (var31 == ScriptOpcodes.SET_VARBIT) { // L: 224
							var13 = var7[var19]; // L: 225
							class337.method5984(var13, Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]); // L: 226
						} else if (var31 == ScriptOpcodes.IF_ICMPLE) { // L: 229
							class16.Interpreter_intStackSize -= 2; // L: 230
							if (Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]) { // L: 231
								var19 += var7[var19];
							}
						} else if (var31 == ScriptOpcodes.IF_ICMPGE) { // L: 234
							class16.Interpreter_intStackSize -= 2; // L: 235
							if (Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]) { // L: 236
								var19 += var7[var19];
							}
						} else if (var31 == ScriptOpcodes.ILOAD) { // L: 239
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = ScriptFrame.Interpreter_intLocals[var7[var19]]; // L: 240
						} else if (var31 == ScriptOpcodes.ISTORE) { // L: 243
							ScriptFrame.Interpreter_intLocals[var7[var19]] = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 244
						} else if (var31 == ScriptOpcodes.SLOAD) { // L: 247
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Interpreter.Interpreter_stringLocals[var7[var19]]; // L: 248
						} else if (var31 == ScriptOpcodes.SSTORE) { // L: 251
							Interpreter.Interpreter_stringLocals[var7[var19]] = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 252
						} else if (var31 == ScriptOpcodes.JOIN_STRING) { // L: 255
							var13 = var7[var19]; // L: 256
							Interpreter.Interpreter_stringStackSize -= var13; // L: 257
							var20 = class23.method346(Interpreter.Interpreter_stringStack, Interpreter.Interpreter_stringStackSize, var13); // L: 258
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var20; // L: 259
						} else if (var31 == ScriptOpcodes.POP_INT) { // L: 262
							--class16.Interpreter_intStackSize; // L: 263
						} else if (var31 == ScriptOpcodes.POP_STRING) { // L: 266
							--Interpreter.Interpreter_stringStackSize; // L: 267
						} else {
							int var17;
							if (var31 != ScriptOpcodes.INVOKE) { // L: 270
								if (var31 == ScriptOpcodes.GET_VARC_INT) { // L: 293
									Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = TextureProvider.varcs.getInt(var7[var19]); // L: 294
								} else if (var31 == ScriptOpcodes.SET_VARC_INT) { // L: 297
									TextureProvider.varcs.setInt(var7[var19], Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]); // L: 298
								} else if (var31 == ScriptOpcodes.DEFINE_ARRAY) { // L: 301
									var13 = var7[var19] >> 16; // L: 302
									var14 = var7[var19] & 65535; // L: 303
									int var23 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 304
									if (var23 < 0 || var23 > 5000) { // L: 305
										throw new RuntimeException(); // L: 306
									}

									Interpreter.Interpreter_arrayLengths[var13] = var23; // L: 308
									byte var24 = -1; // L: 309
									if (var14 == 105) { // L: 310
										var24 = 0;
									}

									for (var17 = 0; var17 < var23; ++var17) { // L: 311
										Interpreter.Interpreter_arrays[var13][var17] = var24;
									}
								} else if (var31 == ScriptOpcodes.GET_ARRAY_INT) { // L: 314
									var13 = var7[var19]; // L: 315
									var14 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 316
									if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 317
										throw new RuntimeException(); // L: 318
									}

									Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14]; // L: 320
								} else if (var31 == ScriptOpcodes.SET_ARRAY_INT) { // L: 323
									var13 = var7[var19]; // L: 324
									class16.Interpreter_intStackSize -= 2; // L: 325
									var14 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 326
									if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 327
										throw new RuntimeException(); // L: 328
									}

									Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 330
								} else {
									String var21;
									if (var31 == ScriptOpcodes.GET_VARC_STRING_OLD) { // L: 333
										var21 = TextureProvider.varcs.getStringOld(var7[var19]); // L: 334
										if (var21 == null) { // L: 335
											var21 = "null";
										}

										Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var21; // L: 336
									} else if (var31 == ScriptOpcodes.SET_VARC_STRING_OLD) { // L: 339
										TextureProvider.varcs.setStringOld(var7[var19], Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]); // L: 340
									} else if (var31 == ScriptOpcodes.GET_VARC_STRING) { // L: 343
										var21 = TextureProvider.varcs.getString(var7[var19]); // L: 344
										Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var21; // L: 345
									} else if (var31 == ScriptOpcodes.SET_VARC_STRING) { // L: 348
										TextureProvider.varcs.setString(var7[var19], Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]); // L: 349
									} else if (var31 == ScriptOpcodes.SWITCH) { // L: 352
										IterableNodeHashTable var35 = var4.switches[var7[var19]]; // L: 353
										IntegerNode var34 = (IntegerNode)var35.get((long)Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]); // L: 354
										if (var34 != null) { // L: 355
											var19 += var34.integer;
										}
									} else {
										Integer var36;
										if (var31 == 74) { // L: 358
											var36 = class19.field154.method144(var7[var19]); // L: 359
											if (var36 == null) { // L: 360
												Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1; // L: 361
											} else {
												Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var36; // L: 364
											}
										} else {
											if (var31 != 76) { // L: 368
												throw new IllegalStateException(); // L: 378
											}

											var36 = Coord.field2591.method5988(var7[var19]); // L: 369
											if (var36 == null) { // L: 370
												Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1; // L: 371
											} else {
												Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var36; // L: 374
											}
										}
									}
								}
							} else {
								var13 = var7[var19]; // L: 271
								Script var33 = class24.getScript(var13); // L: 272
								int[] var15 = new int[var33.localIntCount]; // L: 273
								String[] var16 = new String[var33.localStringCount]; // L: 274

								for (var17 = 0; var17 < var33.intArgumentCount; ++var17) { // L: 275
									var15[var17] = Interpreter.Interpreter_intStack[var17 + (class16.Interpreter_intStackSize - var33.intArgumentCount)];
								}

								for (var17 = 0; var17 < var33.stringArgumentCount; ++var17) { // L: 276
									var16[var17] = Interpreter.Interpreter_stringStack[var17 + (Interpreter.Interpreter_stringStackSize - var33.stringArgumentCount)];
								}

								class16.Interpreter_intStackSize -= var33.intArgumentCount; // L: 277
								Interpreter.Interpreter_stringStackSize -= var33.stringArgumentCount; // L: 278
								ScriptFrame var22 = new ScriptFrame(); // L: 279
								var22.script = var4; // L: 280
								var22.pc = var19; // L: 281
								var22.intLocals = ScriptFrame.Interpreter_intLocals; // L: 282
								var22.stringLocals = Interpreter.Interpreter_stringLocals; // L: 283
								Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var22; // L: 284
								var4 = var33; // L: 285
								var6 = var33.opcodes; // L: 286
								var7 = var33.intOperands; // L: 287
								var19 = -1; // L: 288
								ScriptFrame.Interpreter_intLocals = var15; // L: 289
								Interpreter.Interpreter_stringLocals = var16; // L: 290
							}
						}
					}
				} catch (Exception var29) { // L: 398
					var9 = true; // L: 399
					StringBuilder var26 = new StringBuilder(30); // L: 401
					var26.append("").append(var4.key).append(" "); // L: 402

					for (var13 = Interpreter.Interpreter_frameDepth - 1; var13 >= 0; --var13) { // L: 403
						var26.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
					}

					var26.append("").append(var8); // L: 404
					class223.RunException_sendStackTrace(var26.toString(), var29); // L: 405
				}
			} finally {
				if (Interpreter.field944) { // L: 409
					Interpreter.field946 = true; // L: 410
					Archive.method4470(); // L: 411
					Interpreter.field946 = false; // L: 412
					Interpreter.field944 = false; // L: 413
				}

				if (!var9 && var2 > 0 && var10 >= var2) { // L: 415
					class223.RunException_sendStackTrace("Warning: Script " + var4.field1058 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
				}

			}
		}
	} // L: 121 419

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-537848067"
	)
	static final boolean method3632() {
		return ViewportMouse.ViewportMouse_isInViewport; // L: 87
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ILcc;ZI)I",
		garbageValue = "1567751606"
	)
	static int method3630(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) { // L: 1396
			var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1397
			class69.addGameMessage(0, "", var7); // L: 1398
			return 1; // L: 1399
		} else if (var0 == ScriptOpcodes.ANIM) {
			class16.Interpreter_intStackSize -= 2; // L: 1402
			class32.performPlayerAnimation(Varcs.localPlayer, Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]); // L: 1403
			return 1; // L: 1404
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field946) { // L: 1407
				Interpreter.field944 = true; // L: 1408
			}

			return 1; // L: 1410
		} else {
			int var16;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1413
				var16 = 0; // L: 1414
				if (WorldMapArea.isNumber(var7)) { // L: 1415
					var16 = class69.method1168(var7);
				}

				PacketBufferNode var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field2213, Client.packetWriter.isaacCipher); // L: 1417
				var14.packetBuffer.writeInt(var16); // L: 1418
				Client.packetWriter.addNode(var14); // L: 1419
				return 1; // L: 1420
			} else {
				PacketBufferNode var12;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1423
					var12 = ObjectComposition.getPacketBufferNode(ClientPacket.field2243, Client.packetWriter.isaacCipher); // L: 1425
					var12.packetBuffer.writeByte(var7.length() + 1); // L: 1426
					var12.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1427
					Client.packetWriter.addNode(var12); // L: 1428
					return 1; // L: 1429
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1432
					var12 = ObjectComposition.getPacketBufferNode(ClientPacket.field2273, Client.packetWriter.isaacCipher); // L: 1434
					var12.packetBuffer.writeByte(var7.length() + 1); // L: 1435
					var12.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1436
					Client.packetWriter.addNode(var12); // L: 1437
					return 1; // L: 1438
				} else {
					String var4;
					int var10;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var10 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 1441
						var4 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1442
						SoundCache.method889(var10, var4); // L: 1443
						return 1; // L: 1444
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						class16.Interpreter_intStackSize -= 3; // L: 1447
						var10 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 1448
						var16 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 1449
						int var9 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 2]; // L: 1450
						Widget var15 = class139.getWidget(var9); // L: 1451
						PcmPlayer.clickWidget(var15, var10, var16); // L: 1452
						return 1; // L: 1453
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						class16.Interpreter_intStackSize -= 2; // L: 1456
						var10 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 1457
						var16 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 1458
						Widget var13 = var2 ? FriendSystem.scriptDotWidget : class4.scriptActiveWidget; // L: 1459
						PcmPlayer.clickWidget(var13, var10, var16); // L: 1460
						return 1; // L: 1461
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						MouseHandler.mouseCam = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 1464
						return 1; // L: 1465
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Login.clientPreferences.roofsHidden ? 1 : 0; // L: 1468
						return 1; // L: 1469
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						Login.clientPreferences.roofsHidden = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 1472
						Message.savePreferences(); // L: 1473
						return 1; // L: 1474
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1477
						boolean var8 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 1478
						class302.openURL(var7, var8, false); // L: 1479
						return 1; // L: 1480
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var10 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 1483
						var12 = ObjectComposition.getPacketBufferNode(ClientPacket.field2304, Client.packetWriter.isaacCipher); // L: 1485
						var12.packetBuffer.writeShort(var10); // L: 1486
						Client.packetWriter.addNode(var12); // L: 1487
						return 1; // L: 1488
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var10 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 1491
						Interpreter.Interpreter_stringStackSize -= 2; // L: 1492
						var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize]; // L: 1493
						String var5 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1]; // L: 1494
						if (var4.length() > 500) { // L: 1495
							return 1;
						} else if (var5.length() > 500) { // L: 1496
							return 1;
						} else {
							PacketBufferNode var6 = ObjectComposition.getPacketBufferNode(ClientPacket.field2306, Client.packetWriter.isaacCipher); // L: 1497
							var6.packetBuffer.writeShort(1 + Friend.stringCp1252NullTerminatedByteSize(var4) + Friend.stringCp1252NullTerminatedByteSize(var5)); // L: 1498
							var6.packetBuffer.method6639(var10); // L: 1499
							var6.packetBuffer.writeStringCp1252NullTerminated(var5); // L: 1500
							var6.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 1501
							Client.packetWriter.addNode(var6); // L: 1502
							return 1; // L: 1503
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						Client.shiftClickDrop = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 1506
						return 1; // L: 1507
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 1510
						return 1; // L: 1511
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 1514
						return 1; // L: 1515
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1) { // L: 1518
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2; // L: 1519
						}

						return 1; // L: 1520
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1) { // L: 1523
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3; // L: 1524
						}

						return 1; // L: 1525
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1) { // L: 1528
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5; // L: 1529
						}

						return 1; // L: 1530
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1) { // L: 1533
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9; // L: 1534
						}

						return 1; // L: 1535
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0; // L: 1538
						return 1; // L: 1539
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 1542
						return 1; // L: 1543
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 1546
						return 1; // L: 1547
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						class207.setTapToDrop(Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1); // L: 1550
						return 1; // L: 1551
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class27.getTapToDrop() ? 1 : 0; // L: 1554
						return 1; // L: 1555
					} else if (var0 == ScriptOpcodes.SETOCULUSORBSPEED) {
						class16.Interpreter_intStackSize -= 2; // L: 1558
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 1559
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 1560
						return 1; // L: 1561
					} else if (var0 == 3130) {
						class16.Interpreter_intStackSize -= 2; // L: 1564
						return 1; // L: 1565
					} else if (var0 == 3131) {
						--class16.Interpreter_intStackSize; // L: 1568
						return 1; // L: 1569
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = InterfaceParent.canvasWidth; // L: 1572
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = GameEngine.canvasHeight; // L: 1573
						return 1; // L: 1574
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--class16.Interpreter_intStackSize; // L: 1577
						return 1; // L: 1578
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1; // L: 1581
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						class16.Interpreter_intStackSize -= 2; // L: 1584
						return 1; // L: 1585
					} else if (var0 == 3136) {
						Client.field764 = 3; // L: 1588
						Client.field765 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 1589
						return 1; // L: 1590
					} else if (var0 == 3137) {
						Client.field764 = 2; // L: 1593
						Client.field765 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 1594
						return 1; // L: 1595
					} else if (var0 == 3138) {
						Client.field764 = 0; // L: 1598
						return 1; // L: 1599
					} else if (var0 == 3139) {
						Client.field764 = 1; // L: 1602
						return 1; // L: 1603
					} else if (var0 == 3140) {
						Client.field764 = 3; // L: 1606
						Client.field765 = var2 ? FriendSystem.scriptDotWidget.id * 516202957 * 1486959365 : class4.scriptActiveWidget.id * 516202957 * 1486959365; // L: 1607
						return 1; // L: 1608
					} else {
						boolean var11;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var11 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 1611
							Login.clientPreferences.hideUsername = var11; // L: 1612
							Message.savePreferences(); // L: 1613
							return 1; // L: 1614
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Login.clientPreferences.hideUsername ? 1 : 0; // L: 1617
							return 1; // L: 1618
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var11 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 1621
							Client.Login_isUsernameRemembered = var11; // L: 1622
							if (!var11) { // L: 1623
								Login.clientPreferences.rememberedUsername = ""; // L: 1624
								Message.savePreferences(); // L: 1625
							}

							return 1; // L: 1627
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0; // L: 1630
							return 1; // L: 1631
						} else if (var0 == 3145) {
							return 1; // L: 1634
						} else if (var0 == ScriptOpcodes.SETTITLEMUSICENABLED) {
							var11 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 1637
							if (var11 == Login.clientPreferences.titleMusicDisabled) { // L: 1638
								Login.clientPreferences.titleMusicDisabled = !var11; // L: 1639
								Message.savePreferences(); // L: 1640
							}

							return 1; // L: 1642
						} else if (var0 == ScriptOpcodes.GETTITLEMUSICENABLED) {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Login.clientPreferences.titleMusicDisabled ? 0 : 1; // L: 1645
							return 1; // L: 1646
						} else if (var0 == 3148) {
							return 1; // L: 1649
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 1652
							return 1; // L: 1653
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 1656
							return 1; // L: 1657
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 1660
							return 1; // L: 1661
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 1664
							return 1; // L: 1665
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Login.Login_loadingPercent; // L: 1668
							return 1; // L: 1669
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class23.method345(); // L: 1672
							return 1; // L: 1673
						} else if (var0 == 3155) {
							--Interpreter.Interpreter_stringStackSize; // L: 1676
							return 1; // L: 1677
						} else if (var0 == 3156) {
							return 1; // L: 1680
						} else if (var0 == 3157) {
							class16.Interpreter_intStackSize -= 2; // L: 1683
							return 1; // L: 1684
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 1687
							return 1; // L: 1688
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 1691
							return 1; // L: 1692
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 1695
							return 1; // L: 1696
						} else if (var0 == 3161) {
							--class16.Interpreter_intStackSize; // L: 1699
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 1700
							return 1; // L: 1701
						} else if (var0 == 3162) {
							--class16.Interpreter_intStackSize; // L: 1704
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 1705
							return 1; // L: 1706
						} else if (var0 == 3163) {
							--Interpreter.Interpreter_stringStackSize; // L: 1709
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 1710
							return 1; // L: 1711
						} else if (var0 == 3164) {
							--class16.Interpreter_intStackSize; // L: 1714
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1715
							return 1; // L: 1716
						} else if (var0 == 3165) {
							--class16.Interpreter_intStackSize; // L: 1719
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 1720
							return 1; // L: 1721
						} else if (var0 == 3166) {
							class16.Interpreter_intStackSize -= 2; // L: 1724
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 1725
							return 1; // L: 1726
						} else if (var0 == 3167) {
							class16.Interpreter_intStackSize -= 2; // L: 1729
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 1730
							return 1; // L: 1731
						} else if (var0 == 3168) {
							class16.Interpreter_intStackSize -= 2; // L: 1734
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1735
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1736
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1737
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1738
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1739
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1740
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1741
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1742
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1743
							return 1; // L: 1744
						} else if (var0 == 3169) {
							return 1; // L: 1747
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 1750
							return 1; // L: 1751
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 1754
							return 1; // L: 1755
						} else if (var0 == 3172) {
							--class16.Interpreter_intStackSize; // L: 1758
							return 1; // L: 1759
						} else if (var0 == 3173) {
							--class16.Interpreter_intStackSize; // L: 1762
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 1763
							return 1; // L: 1764
						} else if (var0 == 3174) {
							--class16.Interpreter_intStackSize; // L: 1767
							return 1; // L: 1768
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 1771
							return 1; // L: 1772
						} else if (var0 == 3176) {
							return 1; // L: 1775
						} else if (var0 == 3177) {
							return 1; // L: 1778
						} else if (var0 == 3178) {
							--Interpreter.Interpreter_stringStackSize; // L: 1781
							return 1; // L: 1782
						} else if (var0 == 3179) {
							return 1; // L: 1785
						} else if (var0 == 3180) {
							--Interpreter.Interpreter_stringStackSize; // L: 1788
							return 1; // L: 1789
						} else if (var0 == 3181) {
							var10 = 100 - Math.min(Math.max(Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize], 0), 100); // L: 1792
							MouseRecorder.method2109((double)((float)var10 / 200.0F + 0.5F)); // L: 1793
							return 1; // L: 1794
						} else if (var0 == 3182) {
							float var3 = 200.0F * ((float)Login.clientPreferences.field1304 - 0.5F); // L: 1797
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 100 - Math.round(var3); // L: 1798
							return 1; // L: 1799
						} else if (var0 != 3183 && var0 != 3184) {
							return 2; // L: 1805
						} else {
							--class16.Interpreter_intStackSize; // L: 1802
							return 1; // L: 1803
						}
					}
				}
			}
		}
	}
}
