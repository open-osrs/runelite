import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cw")
@Implements("AttackOption")
public enum AttackOption implements Enumerated {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	@Export("AttackOption_leftClickWhereAvailable")
	AttackOption_leftClickWhereAvailable(2),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3);

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	static StudioGame field1174;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1169656951
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3; // L: 11231
	} // L: 11232

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-275768542"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 11235
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZI)V",
		garbageValue = "262935584"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		if (var1) { // L: 23
			if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) { // L: 24
				try {
					Desktop.getDesktop().browse(new URI(var0)); // L: 26
					return; // L: 47
				} catch (Exception var4) {
				}
			}

			if (class60.field439.startsWith("win")) {
				ScriptEvent.method1260(var0, 0);
			} else if (class60.field439.startsWith("mac")) {
				class13.method131(var0, 1, "openjs"); // L: 38
			} else {
				ScriptEvent.method1260(var0, 2); // L: 41
			}
		} else {
			ScriptEvent.method1260(var0, 3); // L: 44
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lbb;II)V",
		garbageValue = "1453741363"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1) {
		Object[] var2 = var0.args; // L: 103
		Script var3;
		int var17;
		if (Archive.isWorldMapEvent(var0.type)) { // L: 105
			Script.worldMapEvent = (WorldMapEvent)var2[0]; // L: 106
			WorldMapElement var4 = UserComparator10.WorldMapElement_get(Script.worldMapEvent.mapElement); // L: 107
			var3 = TileItem.getWorldMapScript(var0.type, var4.objectId, var4.category); // L: 108
		} else {
			var17 = (Integer)var2[0]; // L: 111
			var3 = ChatChannel.getScript(var17); // L: 112
		}

		if (var3 != null) { // L: 114
			VarcInt.Interpreter_intStackSize = 0; // L: 117
			Interpreter.Interpreter_stringStackSize = 0; // L: 118
			var17 = -1; // L: 119
			int[] var5 = var3.opcodes; // L: 120
			int[] var6 = var3.intOperands; // L: 121
			byte var7 = -1; // L: 122
			Interpreter.Interpreter_frameDepth = 0; // L: 123
			Interpreter.field1104 = false; // L: 124

			try {
				int var10;
				try {
					InterfaceParent.Interpreter_intLocals = new int[var3.localIntCount]; // L: 126
					int var8 = 0; // L: 127
					Username.Interpreter_stringLocals = new String[var3.localStringCount]; // L: 128
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
								var11 = var0.widget != null ? var0.widget.id * -437932207 * 653064625 : -1;
							}

							if (var11 == -2147483644) { // L: 136
								var11 = var0.opIndex;
							}

							if (var11 == -2147483643) { // L: 137
								var11 = var0.widget != null ? var0.widget.childIndex * 951345111 * 2098332647 : -1;
							}

							if (var11 == -2147483642) { // L: 138
								var11 = var0.dragTarget != null ? var0.dragTarget.id * -437932207 * 653064625 : -1;
							}

							if (var11 == -2147483641) { // L: 139
								var11 = var0.dragTarget != null ? var0.dragTarget.childIndex * 951345111 * 2098332647 : -1;
							}

							if (var11 == -2147483640) { // L: 140
								var11 = var0.keyTyped;
							}

							if (var11 == -2147483639) { // L: 141
								var11 = var0.keyPressed;
							}

							InterfaceParent.Interpreter_intLocals[var8++] = var11; // L: 142
						} else if (var2[var10] instanceof String) { // L: 144
							var18 = (String)var2[var10]; // L: 145
							if (var18.equals("event_opbase")) { // L: 146
								var18 = var0.targetName;
							}

							Username.Interpreter_stringLocals[var9++] = var18; // L: 147
						}
					}

					var10 = 0; // L: 151
					Interpreter.field1097 = var0.field569; // L: 152

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

							var20 = FaceNormal.method3345(var29, var3, var32); // L: 357
							switch(var20) { // L: 358
							case 0:
								return;
							case 1:
							default:
								break;
							case 2:
								throw new IllegalStateException(); // L: 363
							}
						} else if (var29 == 0) { // L: 158
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var6[var17]; // L: 159
						} else if (var29 == ScriptOpcodes.GET_VARP) { // L: 162
							var11 = var6[var17]; // L: 163
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Varps.Varps_main[var11]; // L: 164
						} else if (var29 == ScriptOpcodes.SET_VARP) { // L: 167
							var11 = var6[var17]; // L: 168
							Varps.Varps_main[var11] = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 169
							Script.changeGameOptions(var11); // L: 170
						} else if (var29 == ScriptOpcodes.SCONST) { // L: 173
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.stringOperands[var17]; // L: 174
						} else if (var29 == ScriptOpcodes.JUMP) { // L: 177
							var17 += var6[var17]; // L: 178
						} else if (var29 == ScriptOpcodes.IF_ICMPNE) { // L: 181
							VarcInt.Interpreter_intStackSize -= 2; // L: 182
							if (Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]) { // L: 183
								var17 += var6[var17];
							}
						} else if (var29 == ScriptOpcodes.IF_ICMPEQ) { // L: 186
							VarcInt.Interpreter_intStackSize -= 2; // L: 187
							if (Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]) { // L: 188
								var17 += var6[var17];
							}
						} else if (var29 == ScriptOpcodes.IF_ICMPLT) { // L: 191
							VarcInt.Interpreter_intStackSize -= 2; // L: 192
							if (Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]) { // L: 193
								var17 += var6[var17];
							}
						} else if (var29 == ScriptOpcodes.IF_ICMPGT) { // L: 196
							VarcInt.Interpreter_intStackSize -= 2; // L: 197
							if (Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]) { // L: 198
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
							InterfaceParent.Interpreter_intLocals = var34.intLocals; // L: 208
							Username.Interpreter_stringLocals = var34.stringLocals; // L: 209
						} else if (var29 == ScriptOpcodes.GET_VARBIT) { // L: 212
							var11 = var6[var17]; // L: 213
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Coord.getVarbit(var11); // L: 214
						} else if (var29 == ScriptOpcodes.SET_VARBIT) { // L: 217
							var11 = var6[var17]; // L: 218
							KitDefinition.method4491(var11, Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]); // L: 219
						} else if (var29 == ScriptOpcodes.IF_ICMPLE) { // L: 222
							VarcInt.Interpreter_intStackSize -= 2; // L: 223
							if (Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]) { // L: 224
								var17 += var6[var17];
							}
						} else if (var29 == ScriptOpcodes.IF_ICMPGE) { // L: 227
							VarcInt.Interpreter_intStackSize -= 2; // L: 228
							if (Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]) { // L: 229
								var17 += var6[var17];
							}
						} else if (var29 == ScriptOpcodes.ILOAD) { // L: 232
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = InterfaceParent.Interpreter_intLocals[var6[var17]]; // L: 233
						} else if (var29 == ScriptOpcodes.ISTORE) { // L: 236
							InterfaceParent.Interpreter_intLocals[var6[var17]] = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 237
						} else if (var29 == ScriptOpcodes.SLOAD) { // L: 240
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Username.Interpreter_stringLocals[var6[var17]]; // L: 241
						} else if (var29 == ScriptOpcodes.SSTORE) { // L: 244
							Username.Interpreter_stringLocals[var6[var17]] = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 245
						} else if (var29 == ScriptOpcodes.JOIN_STRING) { // L: 248
							var11 = var6[var17]; // L: 249
							Interpreter.Interpreter_stringStackSize -= var11; // L: 250
							String var31 = class90.method2125(Interpreter.Interpreter_stringStack, Interpreter.Interpreter_stringStackSize, var11); // L: 251
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var31; // L: 252
						} else if (var29 == ScriptOpcodes.POP_INT) { // L: 255
							--VarcInt.Interpreter_intStackSize; // L: 256
						} else if (var29 == ScriptOpcodes.POP_STRING) { // L: 259
							--Interpreter.Interpreter_stringStackSize; // L: 260
						} else {
							int var15;
							if (var29 != ScriptOpcodes.INVOKE) { // L: 263
								if (var29 == ScriptOpcodes.GET_VARC_INT) { // L: 286
									Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Varcs.varcs.getInt(var6[var17]); // L: 287
								} else if (var29 == ScriptOpcodes.SET_VARC_INT) { // L: 290
									Varcs.varcs.setInt(var6[var17], Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]); // L: 291
								} else if (var29 == ScriptOpcodes.DEFINE_ARRAY) { // L: 294
									var11 = var6[var17] >> 16; // L: 295
									var20 = var6[var17] & 65535; // L: 296
									int var21 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 297
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
									var20 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 309
									if (var20 < 0 || var20 >= Interpreter.Interpreter_arrayLengths[var11]) { // L: 310
										throw new RuntimeException(); // L: 311
									}

									Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var11][var20]; // L: 313
								} else if (var29 == ScriptOpcodes.SET_ARRAY_INT) { // L: 316
									var11 = var6[var17]; // L: 317
									VarcInt.Interpreter_intStackSize -= 2; // L: 318
									var20 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 319
									if (var20 < 0 || var20 >= Interpreter.Interpreter_arrayLengths[var11]) { // L: 320
										throw new RuntimeException(); // L: 321
									}

									Interpreter.Interpreter_arrays[var11][var20] = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 323
								} else if (var29 == ScriptOpcodes.GET_VARC_STRING_OLD) { // L: 326
									var18 = Varcs.varcs.getStringOld(var6[var17]); // L: 327
									if (var18 == null) { // L: 328
										var18 = "null";
									}

									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var18; // L: 329
								} else if (var29 == ScriptOpcodes.SET_VARC_STRING_OLD) { // L: 332
									Varcs.varcs.setStringOld(var6[var17], Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]); // L: 333
								} else if (var29 == ScriptOpcodes.GET_VARC_STRING) { // L: 336
									var18 = Varcs.varcs.getString(var6[var17]); // L: 337
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var18; // L: 338
								} else if (var29 == ScriptOpcodes.SET_VARC_STRING) { // L: 341
									Varcs.varcs.setString(var6[var17], Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]); // L: 342
								} else {
									if (var29 != ScriptOpcodes.SWITCH) { // L: 345
										throw new IllegalStateException(); // L: 351
									}

									IterableNodeHashTable var33 = var3.switches[var6[var17]]; // L: 346
									IntegerNode var30 = (IntegerNode)var33.get((long)Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]); // L: 347
									if (var30 != null) { // L: 348
										var17 += var30.integer;
									}
								}
							} else {
								var11 = var6[var17]; // L: 264
								Script var12 = ChatChannel.getScript(var11); // L: 265
								int[] var13 = new int[var12.localIntCount]; // L: 266
								String[] var14 = new String[var12.localStringCount]; // L: 267

								for (var15 = 0; var15 < var12.intArgumentCount; ++var15) { // L: 268
									var13[var15] = Interpreter.Interpreter_intStack[var15 + (VarcInt.Interpreter_intStackSize - var12.intArgumentCount)];
								}

								for (var15 = 0; var15 < var12.stringArgumentCount; ++var15) { // L: 269
									var14[var15] = Interpreter.Interpreter_stringStack[var15 + (Interpreter.Interpreter_stringStackSize - var12.stringArgumentCount)];
								}

								VarcInt.Interpreter_intStackSize -= var12.intArgumentCount; // L: 270
								Interpreter.Interpreter_stringStackSize -= var12.stringArgumentCount; // L: 271
								ScriptFrame var19 = new ScriptFrame(); // L: 272
								var19.script = var3; // L: 273
								var19.pc = var17; // L: 274
								var19.intLocals = InterfaceParent.Interpreter_intLocals; // L: 275
								var19.stringLocals = Username.Interpreter_stringLocals; // L: 276
								Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var19; // L: 277
								var3 = var12; // L: 278
								var5 = var12.opcodes; // L: 279
								var6 = var12.intOperands; // L: 280
								var17 = -1; // L: 281
								InterfaceParent.Interpreter_intLocals = var13; // L: 282
								Username.Interpreter_stringLocals = var14; // L: 283
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
					PlayerComposition.RunException_sendStackTrace(var24.toString(), var27); // L: 377
				}
			} finally {
				if (Interpreter.field1104) { // L: 381
					Interpreter.field1103 = true; // L: 382
					ServerPacket.method3664(); // L: 383
					Interpreter.field1103 = false; // L: 384
					Interpreter.field1104 = false; // L: 385
				}

			}
		}
	} // L: 115 388

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lkj;B)Ljava/lang/String;",
		garbageValue = "23"
	)
	public static String method2135(Buffer var0) {
		String var1;
		try {
			int var2 = var0.readUShortSmart(); // L: 29
			if (var2 > 32767) { // L: 30
				var2 = 32767;
			}

			byte[] var3 = new byte[var2]; // L: 31
			var0.offset += class219.huffman.decompress(var0.array, var0.offset, var3, 0, var2); // L: 32
			String var4 = Clock.decodeStringCp1252(var3, 0, var2); // L: 33
			var1 = var4; // L: 34
		} catch (Exception var6) { // L: 36
			var1 = "Cabbage"; // L: 37
		}

		return var1; // L: 40
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1150447373"
	)
	static void method2138() {
		if (PlayerComposition.localPlayer.x >> 7 == Client.destinationX && PlayerComposition.localPlayer.y >> 7 == Client.destinationY) { // L: 4702
			Client.destinationX = 0; // L: 4703
		}

	} // L: 4705
}
