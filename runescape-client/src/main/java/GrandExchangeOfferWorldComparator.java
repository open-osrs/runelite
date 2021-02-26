import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("k")
@Implements("GrandExchangeOfferWorldComparator")
final class GrandExchangeOfferWorldComparator implements Comparator {
	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "[Llm;"
	)
	@Export("mapMarkerSprites")
	static SpritePixels[] mapMarkerSprites;

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lx;Lx;I)I",
		garbageValue = "1040047906"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.world < var2.world ? -1 : (var2.world == var1.world ? 0 : 1); // L: 28
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 36
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 32
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lby;IB)V",
		garbageValue = "-24"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1) {
		Object[] var2 = var0.args;
		Script var3;
		int var17;
		if (AbstractArchive.isWorldMapEvent(var0.type)) { // L: 105
			Interpreter.worldMapEvent = (WorldMapEvent)var2[0]; // L: 106
			WorldMapElement var4 = InvDefinition.WorldMapElement_get(Interpreter.worldMapEvent.mapElement); // L: 107
			var3 = GrandExchangeOfferTotalQuantityComparator.getWorldMapScript(var0.type, var4.objectId, var4.category); // L: 108
		} else {
			var17 = (Integer)var2[0]; // L: 111
			var3 = Varcs.getScript(var17); // L: 112
		}

		if (var3 != null) { // L: 114
			Interpreter.Interpreter_intStackSize = 0; // L: 117
			Interpreter.Interpreter_stringStackSize = 0; // L: 118
			var17 = -1; // L: 119
			int[] var5 = var3.opcodes; // L: 120
			int[] var6 = var3.intOperands; // L: 121
			byte var7 = -1; // L: 122
			Interpreter.Interpreter_frameDepth = 0; // L: 123
			Interpreter.field1120 = false; // L: 124

			try {
				int var10;
				try {
					Interpreter.Interpreter_intLocals = new int[var3.localIntCount]; // L: 126
					int var8 = 0; // L: 127
					class349.Interpreter_stringLocals = new String[var3.localStringCount]; // L: 128
					int var9 = 0; // L: 129

					int var11;
					String var18;
					for (var10 = 1; var10 < var2.length; ++var10) { // L: 130
						if (var2[var10] instanceof Integer) { // L: 131
							var11 = (Integer)var2[var10]; // L: 132
							if (var11 == -2147483647) { // L: 133
								var11 = var0.mouseX;
							}

							if (var11 == -2147483646) { // L: 134
								var11 = var0.mouseY;
							}

							if (var11 == -2147483645) { // L: 135
								var11 = var0.widget != null ? var0.widget.id * 584503877 * -1745850227 : -1;
							}

							if (var11 == -2147483644) { // L: 136
								var11 = var0.opIndex;
							}

							if (var11 == -2147483643) { // L: 137
								var11 = var0.widget != null ? var0.widget.childIndex * -1240613063 * -572555511 : -1;
							}

							if (var11 == -2147483642) { // L: 138
								var11 = var0.dragTarget != null ? var0.dragTarget.id * 584503877 * -1745850227 : -1;
							}

							if (var11 == -2147483641) { // L: 139
								var11 = var0.dragTarget != null ? var0.dragTarget.childIndex * -1240613063 * -572555511 : -1;
							}

							if (var11 == -2147483640) { // L: 140
								var11 = var0.keyTyped;
							}

							if (var11 == -2147483639) { // L: 141
								var11 = var0.keyPressed;
							}

							Interpreter.Interpreter_intLocals[var8++] = var11; // L: 142
						} else if (var2[var10] instanceof String) { // L: 144
							var18 = (String)var2[var10]; // L: 145
							if (var18.equals("event_opbase")) { // L: 146
								var18 = var0.targetName;
							}

							class349.Interpreter_stringLocals[var9++] = var18; // L: 147
						}
					}

					var10 = 0; // L: 151
					Interpreter.field1123 = var0.field593; // L: 152

					while (true) {
						++var10; // L: 154
						if (var10 > var1) { // L: 155
							throw new RuntimeException();
						}

						++var17; // L: 156
						int var29 = var5[var17];
						int var20;
						if (var29 >= 100) { // L: 157
							boolean var32;
							if (var3.intOperands[var17] == 1) { // L: 355
								var32 = true;
							} else {
								var32 = false; // L: 356
							}

							var20 = class304.method5507(var29, var3, var32); // L: 357
							switch(var20) { // L: 358
							case 0:
								return;
							case 1:
							default:
								break;
							case 2:
								throw new IllegalStateException(); // L: 361
							}
						} else if (var29 == 0) { // L: 158
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6[var17]; // L: 159
						} else if (var29 == ScriptOpcodes.GET_VARP) { // L: 162
							var11 = var6[var17]; // L: 163
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Varps.Varps_main[var11]; // L: 164
						} else if (var29 == ScriptOpcodes.SET_VARP) { // L: 167
							var11 = var6[var17]; // L: 168
							Varps.Varps_main[var11] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 169
							AbstractWorldMapIcon.changeGameOptions(var11); // L: 170
						} else if (var29 == ScriptOpcodes.SCONST) { // L: 173
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.stringOperands[var17]; // L: 174
						} else if (var29 == ScriptOpcodes.JUMP) { // L: 177
							var17 += var6[var17]; // L: 178
						} else if (var29 == ScriptOpcodes.IF_ICMPNE) { // L: 181
							Interpreter.Interpreter_intStackSize -= 2; // L: 182
							if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 183
								var17 += var6[var17];
							}
						} else if (var29 == ScriptOpcodes.IF_ICMPEQ) { // L: 186
							Interpreter.Interpreter_intStackSize -= 2; // L: 187
							if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 188
								var17 += var6[var17];
							}
						} else if (var29 == ScriptOpcodes.IF_ICMPLT) { // L: 191
							Interpreter.Interpreter_intStackSize -= 2; // L: 192
							if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 193
								var17 += var6[var17];
							}
						} else if (var29 == ScriptOpcodes.IF_ICMPGT) { // L: 196
							Interpreter.Interpreter_intStackSize -= 2; // L: 197
							if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 198
								var17 += var6[var17];
							}
						} else if (var29 == ScriptOpcodes.RETURN) { // L: 201
							if (Interpreter.Interpreter_frameDepth == 0) { // L: 202
								return;
							}

							ScriptFrame var34 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth]; // L: 203
							var3 = var34.script; // L: 204
							var5 = var3.opcodes; // L: 205
							var6 = var3.intOperands; // L: 206
							var17 = var34.pc; // L: 207
							Interpreter.Interpreter_intLocals = var34.intLocals; // L: 208
							class349.Interpreter_stringLocals = var34.stringLocals; // L: 209
						} else if (var29 == ScriptOpcodes.GET_VARBIT) { // L: 212
							var11 = var6[var17]; // L: 213
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = FontName.getVarbit(var11); // L: 214
						} else if (var29 == ScriptOpcodes.SET_VARBIT) { // L: 217
							var11 = var6[var17]; // L: 218
							WorldMapIcon_1.method377(var11, Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 219
						} else if (var29 == ScriptOpcodes.IF_ICMPLE) { // L: 222
							Interpreter.Interpreter_intStackSize -= 2; // L: 223
							if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 224
								var17 += var6[var17];
							}
						} else if (var29 == ScriptOpcodes.IF_ICMPGE) { // L: 227
							Interpreter.Interpreter_intStackSize -= 2; // L: 228
							if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) { // L: 229
								var17 += var6[var17];
							}
						} else if (var29 == ScriptOpcodes.ILOAD) { // L: 232
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.Interpreter_intLocals[var6[var17]]; // L: 233
						} else if (var29 == ScriptOpcodes.ISTORE) { // L: 236
							Interpreter.Interpreter_intLocals[var6[var17]] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 237
						} else if (var29 == ScriptOpcodes.SLOAD) { // L: 240
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class349.Interpreter_stringLocals[var6[var17]]; // L: 241
						} else if (var29 == ScriptOpcodes.SSTORE) { // L: 244
							class349.Interpreter_stringLocals[var6[var17]] = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 245
						} else if (var29 == ScriptOpcodes.JOIN_STRING) { // L: 248
							var11 = var6[var17]; // L: 249
							Interpreter.Interpreter_stringStackSize -= var11; // L: 250
							String var31 = WorldMapSection0.method311(Interpreter.Interpreter_stringStack, Interpreter.Interpreter_stringStackSize, var11); // L: 251
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var31; // L: 252
						} else if (var29 == ScriptOpcodes.POP_INT) { // L: 255
							--Interpreter.Interpreter_intStackSize; // L: 256
						} else if (var29 == ScriptOpcodes.POP_STRING) { // L: 259
							--Interpreter.Interpreter_stringStackSize; // L: 260
						} else {
							int var15;
							if (var29 != ScriptOpcodes.INVOKE) { // L: 263
								if (var29 == ScriptOpcodes.GET_VARC_INT) { // L: 286
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GrandExchangeOffer.varcs.getInt(var6[var17]); // L: 287
								} else if (var29 == ScriptOpcodes.SET_VARC_INT) { // L: 290
									GrandExchangeOffer.varcs.setInt(var6[var17], Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 291
								} else if (var29 == ScriptOpcodes.DEFINE_ARRAY) { // L: 294
									var11 = var6[var17] >> 16; // L: 295
									var20 = var6[var17] & 65535; // L: 296
									int var21 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 297
									if (var21 < 0 || var21 > 5000) { // L: 298
										throw new RuntimeException(); // L: 299
									}

									Interpreter.Interpreter_arrayLengths[var11] = var21; // L: 301
									byte var22 = -1; // L: 302
									if (var20 == 105) { // L: 303
										var22 = 0;
									}

									for (var15 = 0; var15 < var21; ++var15) { // L: 304
										Interpreter.Interpreter_arrays[var11][var15] = var22;
									}
								} else if (var29 == ScriptOpcodes.GET_ARRAY_INT) { // L: 307
									var11 = var6[var17]; // L: 308
									var20 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 309
									if (var20 < 0 || var20 >= Interpreter.Interpreter_arrayLengths[var11]) { // L: 310
										throw new RuntimeException(); // L: 311
									}

									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var11][var20]; // L: 313
								} else if (var29 == ScriptOpcodes.SET_ARRAY_INT) { // L: 316
									var11 = var6[var17]; // L: 317
									Interpreter.Interpreter_intStackSize -= 2; // L: 318
									var20 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 319
									if (var20 < 0 || var20 >= Interpreter.Interpreter_arrayLengths[var11]) { // L: 320
										throw new RuntimeException(); // L: 321
									}

									Interpreter.Interpreter_arrays[var11][var20] = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 323
								} else if (var29 == ScriptOpcodes.GET_VARC_STRING_OLD) { // L: 326
									var18 = GrandExchangeOffer.varcs.getStringOld(var6[var17]); // L: 327
									if (var18 == null) { // L: 328
										var18 = "null";
									}

									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var18; // L: 329
								} else if (var29 == ScriptOpcodes.SET_VARC_STRING_OLD) { // L: 332
									GrandExchangeOffer.varcs.setStringOld(var6[var17], Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]); // L: 333
								} else if (var29 == ScriptOpcodes.GET_VARC_STRING) { // L: 336
									var18 = GrandExchangeOffer.varcs.getString(var6[var17]); // L: 337
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var18; // L: 338
								} else if (var29 == ScriptOpcodes.SET_VARC_STRING) { // L: 341
									GrandExchangeOffer.varcs.setString(var6[var17], Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]); // L: 342
								} else {
									if (var29 != ScriptOpcodes.SWITCH) { // L: 345
										throw new IllegalStateException(); // L: 351
									}

									IterableNodeHashTable var33 = var3.switches[var6[var17]]; // L: 346
									IntegerNode var30 = (IntegerNode)var33.get((long)Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 347
									if (var30 != null) { // L: 348
										var17 += var30.integer;
									}
								}
							} else {
								var11 = var6[var17]; // L: 264
								Script var12 = Varcs.getScript(var11); // L: 265
								int[] var13 = new int[var12.localIntCount]; // L: 266
								String[] var14 = new String[var12.localStringCount]; // L: 267

								for (var15 = 0; var15 < var12.intArgumentCount; ++var15) { // L: 268
									var13[var15] = Interpreter.Interpreter_intStack[var15 + (Interpreter.Interpreter_intStackSize - var12.intArgumentCount)];
								}

								for (var15 = 0; var15 < var12.stringArgumentCount; ++var15) { // L: 269
									var14[var15] = Interpreter.Interpreter_stringStack[var15 + (Interpreter.Interpreter_stringStackSize - var12.stringArgumentCount)];
								}

								Interpreter.Interpreter_intStackSize -= var12.intArgumentCount; // L: 270
								Interpreter.Interpreter_stringStackSize -= var12.stringArgumentCount; // L: 271
								ScriptFrame var19 = new ScriptFrame(); // L: 272
								var19.script = var3; // L: 273
								var19.pc = var17; // L: 274
								var19.intLocals = Interpreter.Interpreter_intLocals; // L: 275
								var19.stringLocals = class349.Interpreter_stringLocals; // L: 276
								Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var19; // L: 277
								var3 = var12; // L: 278
								var5 = var12.opcodes; // L: 279
								var6 = var12.intOperands; // L: 280
								var17 = -1; // L: 281
								Interpreter.Interpreter_intLocals = var13; // L: 282
								class349.Interpreter_stringLocals = var14; // L: 283
							}
						}
					}
				} catch (Exception var27) { // L: 371
					StringBuilder var24 = new StringBuilder(30); // L: 373
					var24.append("").append(var3.key).append(" "); // L: 374

					for (var10 = Interpreter.Interpreter_frameDepth - 1; var10 >= 0; --var10) { // L: 375
						var24.append("").append(Interpreter.Interpreter_frames[var10].script.key).append(" ");
					}

					var24.append("").append(var7); // L: 376
					SequenceDefinition.RunException_sendStackTrace(var24.toString(), var27); // L: 377
				}
			} finally {
				if (Interpreter.field1120) { // L: 381
					Interpreter.field1122 = true; // L: 382
					ModeWhere.method3878(); // L: 383
					Interpreter.field1122 = false; // L: 384
					Interpreter.field1120 = false; // L: 385
				}

			}
		}
	} // L: 115 388

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1834161075"
	)
	@Export("ByteArrayPool_release")
	public static synchronized void ByteArrayPool_release(byte[] var0) {
		if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < 1000) { // L: 76
			ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0; // L: 77
		} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < 250) { // L: 80
			ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0; // L: 81
		} else if (var0.length == 30000 && ByteArrayPool.ByteArrayPool_largeCount < 50) { // L: 84
			ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0; // L: 85
		} else {
			if (ByteArrayPool.ByteArrayPool_arrays != null) { // L: 88
				for (int var1 = 0; var1 < TriBool.ByteArrayPool_alternativeSizes.length; ++var1) { // L: 89
					if (var0.length == TriBool.ByteArrayPool_alternativeSizes[var1] && class225.ByteArrayPool_altSizeArrayCounts[var1] < ByteArrayPool.ByteArrayPool_arrays[var1].length) { // L: 90
						ByteArrayPool.ByteArrayPool_arrays[var1][class225.ByteArrayPool_altSizeArrayCounts[var1]++] = var0; // L: 91
						return; // L: 92
					}
				}
			}

		}
	} // L: 78 82 86

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-508854974"
	)
	public static final void method137(int var0, int var1) {
		ViewportMouse.ViewportMouse_x = var0; // L: 94
		ViewportMouse.ViewportMouse_y = var1; // L: 95
		ViewportMouse.ViewportMouse_isInViewport = true; // L: 96
		ViewportMouse.ViewportMouse_entityCount = 0; // L: 97
		ViewportMouse.ViewportMouse_false0 = false; // L: 98
	} // L: 99

	@ObfuscatedName("w")
	static final void method129(long var0) {
		ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var0; // L: 102
	} // L: 103

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(Lhz;I)Z",
		garbageValue = "441552279"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) { // L: 10061
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) { // L: 10062
				int var2 = HealthBar.method2168(var0, var1); // L: 10063
				int var3 = var0.cs1ComparisonValues[var1]; // L: 10064
				if (var0.cs1Comparisons[var1] == 2) { // L: 10065
					if (var2 >= var3) { // L: 10066
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) { // L: 10068
					if (var2 <= var3) { // L: 10069
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) { // L: 10071
					if (var2 == var3) { // L: 10072
						return false;
					}
				} else if (var3 != var2) { // L: 10074
					return false;
				}
			}

			return true; // L: 10076
		}
	}
}
