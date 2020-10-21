import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bl")
public class class58 {
	@ObfuscatedName("sz")
	@ObfuscatedGetter(
		longValue = -2922274226149570533L
	)
	static long field444;
	@ObfuscatedName("ey")
	@ObfuscatedGetter(
		intValue = -1623536047
	)
	static int field445;

	static {
		ImageIO.setUseCache(false); // L: 12
	} // L: 13

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lbd;II)V",
		garbageValue = "-485493685"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1) {
		Object[] var2 = var0.args; // L: 101
		Script var3;
		int var17;
		if (WorldMapIcon_0.isWorldMapEvent(var0.type)) { // L: 103
			WorldMapSection0.worldMapEvent = (WorldMapEvent)var2[0]; // L: 104
			WorldMapElement var4 = class194.WorldMapElement_get(WorldMapSection0.worldMapEvent.mapElement); // L: 105
			var3 = WorldMapManager.getWorldMapScript(var0.type, var4.objectId, var4.category); // L: 106
		} else {
			var17 = (Integer)var2[0]; // L: 109
			var3 = WorldMapSection0.getScript(var17); // L: 110
		}

		if (var3 != null) { // L: 112
			MilliClock.Interpreter_intStackSize = 0; // L: 115
			UrlRequester.Interpreter_stringStackSize = 0; // L: 116
			var17 = -1; // L: 117
			int[] var5 = var3.opcodes; // L: 118
			int[] var6 = var3.intOperands; // L: 119
			byte var7 = -1; // L: 120
			Interpreter.Interpreter_frameDepth = 0; // L: 121
			Interpreter.field1130 = false; // L: 122

			try {
				int var10;
				try {
					Interpreter.Interpreter_intLocals = new int[var3.localIntCount]; // L: 124
					int var8 = 0; // L: 125
					Interpreter.Interpreter_stringLocals = new String[var3.localStringCount]; // L: 126
					int var9 = 0; // L: 127

					int var11;
					String var18;
					for (var10 = 1; var10 < var2.length; ++var10) { // L: 128
						if (var2[var10] instanceof Integer) { // L: 129
							var11 = (Integer)var2[var10]; // L: 130
							if (var11 == -2147483647) { // L: 131
								var11 = var0.mouseX;
							}

							if (var11 == -2147483646) { // L: 132
								var11 = var0.mouseY;
							}

							if (var11 == -2147483645) { // L: 133
								var11 = var0.widget != null ? var0.widget.id * -583486671 * -509491759 : -1;
							}

							if (var11 == -2147483644) { // L: 134
								var11 = var0.opIndex;
							}

							if (var11 == -2147483643) { // L: 135
								var11 = var0.widget != null ? var0.widget.childIndex * -1360175439 * 2048666193 : -1;
							}

							if (var11 == -2147483642) { // L: 136
								var11 = var0.dragTarget != null ? var0.dragTarget.id * -583486671 * -509491759 : -1;
							}

							if (var11 == -2147483641) { // L: 137
								var11 = var0.dragTarget != null ? var0.dragTarget.childIndex * -1360175439 * 2048666193 : -1;
							}

							if (var11 == -2147483640) { // L: 138
								var11 = var0.keyTyped;
							}

							if (var11 == -2147483639) { // L: 139
								var11 = var0.keyPressed;
							}

							Interpreter.Interpreter_intLocals[var8++] = var11; // L: 140
						} else if (var2[var10] instanceof String) { // L: 142
							var18 = (String)var2[var10]; // L: 143
							if (var18.equals("event_opbase")) { // L: 144
								var18 = var0.targetName;
							}

							Interpreter.Interpreter_stringLocals[var9++] = var18; // L: 145
						}
					}

					var10 = 0; // L: 149
					Interpreter.field1119 = var0.field600; // L: 150

					while (true) {
						++var10; // L: 152
						if (var10 > var1) { // L: 153
							throw new RuntimeException();
						}

						++var17; // L: 154
						int var29 = var5[var17];
						int var20;
						if (var29 >= 100) { // L: 155
							boolean var32;
							if (var3.intOperands[var17] == 1) { // L: 353
								var32 = true;
							} else {
								var32 = false; // L: 354
							}

							var20 = VarcInt.method4562(var29, var3, var32); // L: 355
							switch(var20) { // L: 356
							case 0:
								return;
							case 1:
							default:
								break;
							case 2:
								throw new IllegalStateException(); // L: 363
							}
						} else if (var29 == ScriptOpcodes.ICONST) { // L: 156
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var6[var17]; // L: 157
						} else if (var29 == ScriptOpcodes.GET_VARP) { // L: 160
							var11 = var6[var17]; // L: 161
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Varps.Varps_main[var11]; // L: 162
						} else if (var29 == ScriptOpcodes.SET_VARP) { // L: 165
							var11 = var6[var17]; // L: 166
							Varps.Varps_main[var11] = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 167
							class23.changeGameOptions(var11); // L: 168
						} else if (var29 == ScriptOpcodes.SCONST) { // L: 171
							Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var3.stringOperands[var17]; // L: 172
						} else if (var29 == ScriptOpcodes.JUMP) { // L: 175
							var17 += var6[var17]; // L: 176
						} else if (var29 == ScriptOpcodes.IF_ICMPNE) { // L: 179
							MilliClock.Interpreter_intStackSize -= 2; // L: 180
							if (Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]) { // L: 181
								var17 += var6[var17];
							}
						} else if (var29 == ScriptOpcodes.IF_ICMPEQ) { // L: 184
							MilliClock.Interpreter_intStackSize -= 2; // L: 185
							if (Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]) { // L: 186
								var17 += var6[var17];
							}
						} else if (var29 == ScriptOpcodes.IF_ICMPLT) { // L: 189
							MilliClock.Interpreter_intStackSize -= 2; // L: 190
							if (Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]) { // L: 191
								var17 += var6[var17];
							}
						} else if (var29 == ScriptOpcodes.IF_ICMPGT) { // L: 194
							MilliClock.Interpreter_intStackSize -= 2; // L: 195
							if (Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]) { // L: 196
								var17 += var6[var17];
							}
						} else if (var29 == ScriptOpcodes.RETURN) { // L: 199
							if (Interpreter.Interpreter_frameDepth == 0) { // L: 200
								return;
							}

							ScriptFrame var34 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth]; // L: 201
							var3 = var34.script; // L: 202
							var5 = var3.opcodes; // L: 203
							var6 = var3.intOperands; // L: 204
							var17 = var34.pc; // L: 205
							Interpreter.Interpreter_intLocals = var34.intLocals; // L: 206
							Interpreter.Interpreter_stringLocals = var34.stringLocals; // L: 207
						} else if (var29 == ScriptOpcodes.GET_VARBIT) { // L: 210
							var11 = var6[var17]; // L: 211
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = ApproximateRouteStrategy.getVarbit(var11); // L: 212
						} else if (var29 == ScriptOpcodes.SET_VARBIT) { // L: 215
							var11 = var6[var17]; // L: 216
							class169.method3571(var11, Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]); // L: 217
						} else if (var29 == ScriptOpcodes.IF_ICMPLE) { // L: 220
							MilliClock.Interpreter_intStackSize -= 2; // L: 221
							if (Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]) { // L: 222
								var17 += var6[var17];
							}
						} else if (var29 == ScriptOpcodes.IF_ICMPGE) { // L: 225
							MilliClock.Interpreter_intStackSize -= 2; // L: 226
							if (Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]) { // L: 227
								var17 += var6[var17];
							}
						} else if (var29 == ScriptOpcodes.ILOAD) { // L: 230
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Interpreter.Interpreter_intLocals[var6[var17]]; // L: 231
						} else if (var29 == ScriptOpcodes.ISTORE) { // L: 234
							Interpreter.Interpreter_intLocals[var6[var17]] = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 235
						} else if (var29 == ScriptOpcodes.SLOAD) { // L: 238
							Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = Interpreter.Interpreter_stringLocals[var6[var17]]; // L: 239
						} else if (var29 == ScriptOpcodes.SSTORE) { // L: 242
							Interpreter.Interpreter_stringLocals[var6[var17]] = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize]; // L: 243
						} else if (var29 == ScriptOpcodes.JOIN_STRING) { // L: 246
							var11 = var6[var17]; // L: 247
							UrlRequester.Interpreter_stringStackSize -= var11; // L: 248
							String var31 = ApproximateRouteStrategy.method1324(Interpreter.Interpreter_stringStack, UrlRequester.Interpreter_stringStackSize, var11); // L: 249
							Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var31; // L: 250
						} else if (var29 == ScriptOpcodes.POP_INT) { // L: 253
							--MilliClock.Interpreter_intStackSize; // L: 254
						} else if (var29 == ScriptOpcodes.POP_STRING) { // L: 257
							--UrlRequester.Interpreter_stringStackSize; // L: 258
						} else {
							int var15;
							if (var29 != ScriptOpcodes.INVOKE) { // L: 261
								if (var29 == ScriptOpcodes.GET_VARC_INT) { // L: 284
									Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = FriendSystem.varcs.getInt(var6[var17]); // L: 285
								} else if (var29 == ScriptOpcodes.SET_VARC_INT) { // L: 288
									FriendSystem.varcs.setInt(var6[var17], Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]); // L: 289
								} else if (var29 == ScriptOpcodes.DEFINE_ARRAY) { // L: 292
									var11 = var6[var17] >> 16; // L: 293
									var20 = var6[var17] & 65535; // L: 294
									int var21 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 295
									if (var21 < 0 || var21 > 5000) { // L: 296
										throw new RuntimeException(); // L: 297
									}

									Interpreter.Interpreter_arrayLengths[var11] = var21; // L: 299
									byte var22 = -1; // L: 300
									if (var20 == 105) { // L: 301
										var22 = 0;
									}

									for (var15 = 0; var15 < var21; ++var15) { // L: 302
										Interpreter.Interpreter_arrays[var11][var15] = var22;
									}
								} else if (var29 == ScriptOpcodes.GET_ARRAY_INT) { // L: 305
									var11 = var6[var17]; // L: 306
									var20 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 307
									if (var20 < 0 || var20 >= Interpreter.Interpreter_arrayLengths[var11]) { // L: 308
										throw new RuntimeException(); // L: 309
									}

									Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var11][var20]; // L: 311
								} else if (var29 == ScriptOpcodes.SET_ARRAY_INT) { // L: 314
									var11 = var6[var17]; // L: 315
									MilliClock.Interpreter_intStackSize -= 2; // L: 316
									var20 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 317
									if (var20 < 0 || var20 >= Interpreter.Interpreter_arrayLengths[var11]) { // L: 318
										throw new RuntimeException(); // L: 319
									}

									Interpreter.Interpreter_arrays[var11][var20] = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 321
								} else if (var29 == ScriptOpcodes.GET_VARC_STRING_OLD) { // L: 324
									var18 = FriendSystem.varcs.getStringOld(var6[var17]); // L: 325
									if (var18 == null) { // L: 326
										var18 = "null";
									}

									Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var18; // L: 327
								} else if (var29 == ScriptOpcodes.SET_VARC_STRING_OLD) { // L: 330
									FriendSystem.varcs.setStringOld(var6[var17], Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize]); // L: 331
								} else if (var29 == ScriptOpcodes.GET_VARC_STRING) { // L: 334
									var18 = FriendSystem.varcs.getString(var6[var17]); // L: 335
									Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var18; // L: 336
								} else if (var29 == ScriptOpcodes.SET_VARC_STRING) { // L: 339
									FriendSystem.varcs.setString(var6[var17], Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize]); // L: 340
								} else {
									if (var29 != ScriptOpcodes.SWITCH) { // L: 343
										throw new IllegalStateException(); // L: 349
									}

									IterableNodeHashTable var33 = var3.switches[var6[var17]]; // L: 344
									IntegerNode var30 = (IntegerNode)var33.get((long)Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]); // L: 345
									if (var30 != null) { // L: 346
										var17 += var30.integer;
									}
								}
							} else {
								var11 = var6[var17]; // L: 262
								Script var12 = WorldMapSection0.getScript(var11); // L: 263
								int[] var13 = new int[var12.localIntCount]; // L: 264
								String[] var14 = new String[var12.localStringCount]; // L: 265

								for (var15 = 0; var15 < var12.intArgumentCount; ++var15) { // L: 266
									var13[var15] = Interpreter.Interpreter_intStack[var15 + (MilliClock.Interpreter_intStackSize - var12.intArgumentCount)];
								}

								for (var15 = 0; var15 < var12.stringArgumentCount; ++var15) { // L: 267
									var14[var15] = Interpreter.Interpreter_stringStack[var15 + (UrlRequester.Interpreter_stringStackSize - var12.stringArgumentCount)];
								}

								MilliClock.Interpreter_intStackSize -= var12.intArgumentCount; // L: 268
								UrlRequester.Interpreter_stringStackSize -= var12.stringArgumentCount; // L: 269
								ScriptFrame var19 = new ScriptFrame(); // L: 270
								var19.script = var3; // L: 271
								var19.pc = var17; // L: 272
								var19.intLocals = Interpreter.Interpreter_intLocals; // L: 273
								var19.stringLocals = Interpreter.Interpreter_stringLocals; // L: 274
								Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var19; // L: 275
								var3 = var12; // L: 276
								var5 = var12.opcodes; // L: 277
								var6 = var12.intOperands; // L: 278
								var17 = -1; // L: 279
								Interpreter.Interpreter_intLocals = var13; // L: 280
								Interpreter.Interpreter_stringLocals = var14; // L: 281
							}
						}
					}
				} catch (Exception var27) { // L: 369
					StringBuilder var24 = new StringBuilder(30); // L: 371
					var24.append("").append(var3.key).append(" "); // L: 372

					for (var10 = Interpreter.Interpreter_frameDepth - 1; var10 >= 0; --var10) { // L: 373
						var24.append("").append(Interpreter.Interpreter_frames[var10].script.key).append(" ");
					}

					var24.append("").append(var7); // L: 374
					PacketWriter.RunException_sendStackTrace(var24.toString(), var27); // L: 375
				}
			} finally {
				if (Interpreter.field1130) { // L: 379
					Interpreter.field1128 = true; // L: 380
					ModeWhere.method3815(); // L: 381
					Interpreter.field1128 = false; // L: 382
					Interpreter.field1130 = false; // L: 383
				}

			}
		}
	} // L: 113 386

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1826105698"
	)
	public static boolean method957() {
		return class206.musicPlayerStatus != 0 ? true : class13.midiPcmStream.isReady(); // L: 65 66
	}
}
