import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bg")
@Implements("World")
public class World {
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1267509105
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1119546685
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("b")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("d")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("WorldMapElement_fonts")
	static Fonts WorldMapElement_fonts;
	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "Lgh;"
	)
	@Export("textureProvider")
	static TextureProvider textureProvider;
	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("mousedOverWidgetIf1")
	static Widget mousedOverWidgetIf1;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1428153959
	)
	@Export("id")
	int id;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 264436593
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -508707417
	)
	@Export("population")
	int population;
	@ObfuscatedName("c")
	@Export("host")
	String host;
	@ObfuscatedName("e")
	@Export("activity")
	String activity;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1484367493
	)
	@Export("location")
	int location;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 2005307775
	)
	@Export("index")
	int index;

	static {
		World_count = 0; // L: 14
		World_listCount = 0; // L: 15
		World_sortOption2 = new int[]{1, 1, 1, 1}; // L: 16
		World_sortOption1 = new int[]{0, 1, 2, 3}; // L: 17
	}

	World() {
	} // L: 27

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2086816927"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (1 & this.properties) != 0;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1823181912"
	)
	boolean method1638() {
		return (2 & this.properties) != 0; // L: 261
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1133674448"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (4 & this.properties) != 0; // L: 265
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1123465891"
	)
	boolean method1640() {
		return (8 & this.properties) != 0; // L: 269
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "504803099"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (536870912 & this.properties) != 0;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "255"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (33554432 & this.properties) != 0;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "12"
	)
	boolean method1643() {
		return (1073741824 & this.properties) != 0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-577854303"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		class5.addChatMessage(var0, var1, var2, (String)null); // L: 19
	} // L: 20

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lcz;III)V",
		garbageValue = "704254621"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args; // L: 110
		Script var4;
		int var19;
		if (NPC.isWorldMapEvent(var0.type)) { // L: 112
			class69.worldMapEvent = (WorldMapEvent)var3[0]; // L: 113
			WorldMapElement var5 = class6.WorldMapElement_get(class69.worldMapEvent.mapElement); // L: 114
			var4 = class43.getWorldMapScript(var0.type, var5.objectId, var5.category); // L: 115
		} else {
			var19 = (Integer)var3[0]; // L: 118
			var4 = ApproximateRouteStrategy.getScript(var19); // L: 119
		}

		if (var4 != null) { // L: 121
			class44.Interpreter_intStackSize = 0; // L: 124
			Interpreter.Interpreter_stringStackSize = 0; // L: 125
			var19 = -1; // L: 126
			int[] var6 = var4.opcodes; // L: 127
			int[] var7 = var4.intOperands; // L: 128
			byte var8 = -1; // L: 129
			Interpreter.Interpreter_frameDepth = 0; // L: 130
			Interpreter.field973 = false; // L: 131
			boolean var9 = false; // L: 132
			int var10 = 0; // L: 133

			try {
				int var13;
				try {
					class368.Interpreter_intLocals = new int[var4.localIntCount]; // L: 135
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
								var14 = var0.widget != null ? var0.widget.id * 1969535585 * -1722455647 : -1;
							}

							if (var14 == -2147483644) { // L: 145
								var14 = var0.opIndex;
							}

							if (var14 == -2147483643) { // L: 146
								var14 = var0.widget != null ? var0.widget.childIndex * 41180389 * 1926103277 : -1;
							}

							if (var14 == -2147483642) { // L: 147
								var14 = var0.dragTarget != null ? var0.dragTarget.id * 1969535585 * -1722455647 : -1;
							}

							if (var14 == -2147483641) { // L: 148
								var14 = var0.dragTarget != null ? var0.dragTarget.childIndex * 41180389 * 1926103277 : -1;
							}

							if (var14 == -2147483640) { // L: 149
								var14 = var0.keyTyped;
							}

							if (var14 == -2147483639) { // L: 150
								var14 = var0.keyPressed;
							}

							class368.Interpreter_intLocals[var11++] = var14; // L: 151
						} else if (var3[var13] instanceof String) { // L: 153
							var20 = (String)var3[var13]; // L: 154
							if (var20.equals("event_opbase")) { // L: 155
								var20 = var0.targetName;
							}

							Interpreter.Interpreter_stringLocals[var12++] = var20; // L: 156
						}
					}

					Interpreter.field987 = var0.field1180; // L: 160

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

							var14 = IgnoreList.method5628(var31, var4, var32); // L: 385
							switch(var14) { // L: 386
							case 0:
								return;
							case 1:
							default:
								break;
							case 2:
								throw new IllegalStateException(); // L: 393
							}
						} else if (var31 == 0) { // L: 166
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var7[var19]; // L: 167
						} else if (var31 == ScriptOpcodes.GET_VARP) { // L: 170
							var13 = var7[var19]; // L: 171
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Varps.Varps_main[var13]; // L: 172
						} else if (var31 == ScriptOpcodes.SET_VARP) { // L: 175
							var13 = var7[var19]; // L: 176
							Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 177
							ApproximateRouteStrategy.changeGameOptions(var13); // L: 178
						} else if (var31 == ScriptOpcodes.SCONST) { // L: 181
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.stringOperands[var19]; // L: 182
						} else if (var31 == ScriptOpcodes.JUMP) { // L: 185
							var19 += var7[var19]; // L: 186
						} else if (var31 == ScriptOpcodes.IF_ICMPNE) { // L: 189
							class44.Interpreter_intStackSize -= 2; // L: 190
							if (Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]) { // L: 191
								var19 += var7[var19];
							}
						} else if (var31 == ScriptOpcodes.IF_ICMPEQ) { // L: 194
							class44.Interpreter_intStackSize -= 2; // L: 195
							if (Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]) { // L: 196
								var19 += var7[var19];
							}
						} else if (var31 == ScriptOpcodes.IF_ICMPLT) { // L: 199
							class44.Interpreter_intStackSize -= 2; // L: 200
							if (Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]) { // L: 201
								var19 += var7[var19];
							}
						} else if (var31 == ScriptOpcodes.IF_ICMPGT) { // L: 204
							class44.Interpreter_intStackSize -= 2; // L: 205
							if (Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]) { // L: 206
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
							class368.Interpreter_intLocals = var37.intLocals; // L: 216
							Interpreter.Interpreter_stringLocals = var37.stringLocals; // L: 217
						} else if (var31 == ScriptOpcodes.GET_VARBIT) { // L: 220
							var13 = var7[var19]; // L: 221
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Skeleton.getVarbit(var13); // L: 222
						} else if (var31 == ScriptOpcodes.SET_VARBIT) { // L: 225
							var13 = var7[var19]; // L: 226
							Login.method1951(var13, Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]); // L: 227
						} else if (var31 == ScriptOpcodes.IF_ICMPLE) { // L: 230
							class44.Interpreter_intStackSize -= 2; // L: 231
							if (Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]) { // L: 232
								var19 += var7[var19];
							}
						} else if (var31 == ScriptOpcodes.IF_ICMPGE) { // L: 235
							class44.Interpreter_intStackSize -= 2; // L: 236
							if (Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]) { // L: 237
								var19 += var7[var19];
							}
						} else if (var31 == ScriptOpcodes.ILOAD) { // L: 240
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class368.Interpreter_intLocals[var7[var19]]; // L: 241
						} else if (var31 == ScriptOpcodes.ISTORE) { // L: 244
							class368.Interpreter_intLocals[var7[var19]] = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 245
						} else if (var31 == ScriptOpcodes.SLOAD) { // L: 248
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Interpreter.Interpreter_stringLocals[var7[var19]]; // L: 249
						} else if (var31 == ScriptOpcodes.SSTORE) { // L: 252
							Interpreter.Interpreter_stringLocals[var7[var19]] = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 253
						} else if (var31 == ScriptOpcodes.JOIN_STRING) { // L: 256
							var13 = var7[var19]; // L: 257
							Interpreter.Interpreter_stringStackSize -= var13; // L: 258
							var20 = BuddyRankComparator.method2484(Interpreter.Interpreter_stringStack, Interpreter.Interpreter_stringStackSize, var13); // L: 259
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var20; // L: 260
						} else if (var31 == ScriptOpcodes.POP_INT) { // L: 263
							--class44.Interpreter_intStackSize; // L: 264
						} else if (var31 == ScriptOpcodes.POP_STRING) { // L: 267
							--Interpreter.Interpreter_stringStackSize; // L: 268
						} else {
							int var17;
							if (var31 != ScriptOpcodes.INVOKE) { // L: 271
								if (var31 == ScriptOpcodes.GET_VARC_INT) { // L: 294
									Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = GrandExchangeOfferOwnWorldComparator.varcs.getInt(var7[var19]); // L: 295
								} else if (var31 == ScriptOpcodes.SET_VARC_INT) { // L: 298
									GrandExchangeOfferOwnWorldComparator.varcs.setInt(var7[var19], Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]); // L: 299
								} else if (var31 == ScriptOpcodes.DEFINE_ARRAY) { // L: 302
									var13 = var7[var19] >> 16; // L: 303
									var14 = var7[var19] & 65535; // L: 304
									int var23 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 305
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
									var14 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 317
									if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 318
										throw new RuntimeException(); // L: 319
									}

									Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14]; // L: 321
								} else if (var31 == ScriptOpcodes.SET_ARRAY_INT) { // L: 324
									var13 = var7[var19]; // L: 325
									class44.Interpreter_intStackSize -= 2; // L: 326
									var14 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 327
									if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 328
										throw new RuntimeException(); // L: 329
									}

									Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 331
								} else {
									String var21;
									if (var31 == ScriptOpcodes.GET_VARC_STRING_OLD) { // L: 334
										var21 = GrandExchangeOfferOwnWorldComparator.varcs.getStringOld(var7[var19]); // L: 335
										if (var21 == null) { // L: 336
											var21 = "null";
										}

										Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var21; // L: 337
									} else if (var31 == ScriptOpcodes.SET_VARC_STRING_OLD) { // L: 340
										GrandExchangeOfferOwnWorldComparator.varcs.setStringOld(var7[var19], Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]); // L: 341
									} else if (var31 == ScriptOpcodes.GET_VARC_STRING) { // L: 344
										var21 = GrandExchangeOfferOwnWorldComparator.varcs.getString(var7[var19]); // L: 345
										Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var21; // L: 346
									} else if (var31 == ScriptOpcodes.SET_VARC_STRING) { // L: 349
										GrandExchangeOfferOwnWorldComparator.varcs.setString(var7[var19], Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]); // L: 350
									} else if (var31 == ScriptOpcodes.SWITCH) { // L: 353
										IterableNodeHashTable var35 = var4.switches[var7[var19]]; // L: 354
										IntegerNode var34 = (IntegerNode)var35.get((long)Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]); // L: 355
										if (var34 != null) { // L: 356
											var19 += var34.integer;
										}
									} else {
										Integer var36;
										if (var31 == 74) { // L: 359
											var36 = class26.field220.getTitleGroupValue(var7[var19]); // L: 360
											if (var36 == null) { // L: 361
												Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1; // L: 362
											} else {
												Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var36; // L: 365
											}
										} else {
											if (var31 != 76) { // L: 369
												throw new IllegalStateException(); // L: 379
											}

											var36 = class34.field254.method6014(var7[var19]); // L: 370
											if (var36 == null) { // L: 371
												Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1; // L: 372
											} else {
												Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var36; // L: 375
											}
										}
									}
								}
							} else {
								var13 = var7[var19]; // L: 272
								Script var33 = ApproximateRouteStrategy.getScript(var13); // L: 273
								int[] var15 = new int[var33.localIntCount]; // L: 274
								String[] var16 = new String[var33.localStringCount]; // L: 275

								for (var17 = 0; var17 < var33.intArgumentCount; ++var17) { // L: 276
									var15[var17] = Interpreter.Interpreter_intStack[var17 + (class44.Interpreter_intStackSize - var33.intArgumentCount)];
								}

								for (var17 = 0; var17 < var33.stringArgumentCount; ++var17) { // L: 277
									var16[var17] = Interpreter.Interpreter_stringStack[var17 + (Interpreter.Interpreter_stringStackSize - var33.stringArgumentCount)];
								}

								class44.Interpreter_intStackSize -= var33.intArgumentCount; // L: 278
								Interpreter.Interpreter_stringStackSize -= var33.stringArgumentCount; // L: 279
								ScriptFrame var22 = new ScriptFrame(); // L: 280
								var22.script = var4; // L: 281
								var22.pc = var19; // L: 282
								var22.intLocals = class368.Interpreter_intLocals; // L: 283
								var22.stringLocals = Interpreter.Interpreter_stringLocals; // L: 284
								Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var22; // L: 285
								var4 = var33; // L: 286
								var6 = var33.opcodes; // L: 287
								var7 = var33.intOperands; // L: 288
								var19 = -1; // L: 289
								class368.Interpreter_intLocals = var15; // L: 290
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
					class266.RunException_sendStackTrace(var26.toString(), var29); // L: 406
				}
			} finally {
				if (Interpreter.field973) { // L: 410
					Interpreter.field986 = true; // L: 411
					class4.method47(); // L: 412
					Interpreter.field986 = false; // L: 413
					Interpreter.field973 = false; // L: 414
				}

				if (!var9 && var2 > 0 && var10 >= var2) { // L: 416
					class266.RunException_sendStackTrace("Warning: Script " + var4.field1084 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
				}

			}
		}
	} // L: 122 420

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIIS)I",
		garbageValue = "24074"
	)
	public static int method1685(int var0, int var1, int var2) {
		int var3 = CollisionMap.method3185(var2 - var1 + 1); // L: 51
		var3 <<= var1; // L: 52
		return var0 & ~var3; // L: 53
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1461307480"
	)
	public static boolean method1663(int var0) {
		return (var0 >> 30 & 1) != 0; // L: 29
	}
}
