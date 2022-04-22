import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bg")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("rm")
	@Export("ClanChat_inClanChat")
	static boolean ClanChat_inClanChat;
	@ObfuscatedName("b")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("n")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("s")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("l")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -264358279
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("o")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -552565383
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Lbl;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("scriptActiveWidget")
	static Widget scriptActiveWidget;
	@ObfuscatedName("g")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("x")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("y")
	static boolean field841;
	@ObfuscatedName("j")
	static boolean field842;
	@ObfuscatedName("e")
	static ArrayList field843;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1021880361
	)
	static int field844;
	@ObfuscatedName("aw")
	static final double field845;
	@ObfuscatedName("nh")
	@ObfuscatedSignature(
		descriptor = "Lba;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;

	static {
		Interpreter_arrayLengths = new int[5]; // L: 75
		Interpreter_arrays = new int[5][5000]; // L: 76
		Interpreter_intStack = new int[1000]; // L: 77
		Interpreter_stringStack = new String[1000]; // L: 79
		Interpreter_frameDepth = 0; // L: 81
		Interpreter_frames = new ScriptFrame[50]; // L: 82
		Interpreter_calendar = java.util.Calendar.getInstance(); // L: 88
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; // L: 91
		field841 = false; // L: 94
		field842 = false; // L: 95
		field843 = new ArrayList(); // L: 96
		field844 = 0; // L: 97
		field845 = Math.log(2.0D); // L: 101
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([BB)Lqi;",
		garbageValue = "-84"
	)
	public static final SpritePixels method1889(byte[] var0) {
		BufferedImage var1 = null;

		try {
			var1 = ImageIO.read(new ByteArrayInputStream(var0)); // L: 22
			int var2 = var1.getWidth(); // L: 23
			int var3 = var1.getHeight(); // L: 24
			int[] var4 = new int[var2 * var3]; // L: 25
			PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var2, var3, var4, 0, var2); // L: 26
			var5.grabPixels(); // L: 27
			return new SpritePixels(var4, var2, var3); // L: 28
		} catch (IOException var7) { // L: 30
		} catch (InterruptedException var8) { // L: 31
		}

		return new SpritePixels(0, 0); // L: 32
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([BI)Lhn;",
		garbageValue = "-1771552883"
	)
	static WorldMapSprite method1798(byte[] var0) {
		return var0 == null ? new WorldMapSprite() : new WorldMapSprite(method1889(var0).pixels); // L: 19 20
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lch;III)V",
		garbageValue = "-1891697067"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args; // L: 112
		Script var4;
		int var20;
		if (class17.isWorldMapEvent(var0.type)) { // L: 114
			SpotAnimationDefinition.worldMapEvent = (WorldMapEvent)var3[0]; // L: 115
			WorldMapElement var5 = UserComparator7.WorldMapElement_get(SpotAnimationDefinition.worldMapEvent.mapElement); // L: 116
			var4 = GameObject.getWorldMapScript(var0.type, var5.objectId, var5.category); // L: 117
		} else {
			var20 = (Integer)var3[0]; // L: 120
			var4 = ClanChannel.getScript(var20); // L: 121
		}

		if (var4 != null) { // L: 123
			Interpreter_intStackSize = 0; // L: 126
			class122.Interpreter_stringStackSize = 0; // L: 127
			var20 = -1; // L: 128
			int[] var6 = var4.opcodes; // L: 129
			int[] var7 = var4.intOperands; // L: 130
			byte var8 = -1; // L: 131
			Interpreter_frameDepth = 0; // L: 132
			field841 = false; // L: 133
			boolean var9 = false; // L: 134
			int var10 = 0; // L: 135
			boolean var30 = false;

			label950: {
				label951: {
					try {
						int var13;
						try {
							var30 = true; // L: 137
							GrandExchangeOfferNameComparator.Interpreter_intLocals = new int[var4.localIntCount]; // L: 138
							int var11 = 0; // L: 139
							Interpreter_stringLocals = new String[var4.localStringCount]; // L: 140
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
										var14 = var0.widget != null ? var0.widget.id * 1389111653 * 785571949 : -1;
									}

									if (var14 == -2147483644) { // L: 147
										var14 = var0.opIndex;
									}

									if (var14 == -2147483643) { // L: 148
										var14 = var0.widget != null ? var0.widget.childIndex * -1989091849 * -1317080121 : -1;
									}

									if (var14 == -2147483642) { // L: 149
										var14 = var0.dragTarget != null ? var0.dragTarget.id * 1389111653 * 785571949 : -1;
									}

									if (var14 == -2147483641) { // L: 150
										var14 = var0.dragTarget != null ? var0.dragTarget.childIndex * -1989091849 * -1317080121 : -1;
									}

									if (var14 == -2147483640) { // L: 151
										var14 = var0.keyTyped;
									}

									if (var14 == -2147483639) { // L: 152
										var14 = var0.keyPressed;
									}

									GrandExchangeOfferNameComparator.Interpreter_intLocals[var11++] = var14; // L: 153
								} else if (var3[var13] instanceof String) { // L: 155
									var21 = (String)var3[var13]; // L: 156
									if (var21.equals("event_opbase")) { // L: 157
										var21 = var0.targetName;
									}

									Interpreter_stringLocals[var12++] = var21; // L: 158
								}
							}

							field844 = var0.field1031; // L: 162

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

									var14 = MouseHandler.method613(var33, var4, var35); // L: 387
									switch(var14) { // L: 388
									case 0:
										var30 = false;
										break label951;
									case 1:
									default:
										break;
									case 2:
										throw new IllegalStateException(); // L: 395
									}
								} else if (var33 == 0) { // L: 168
									Interpreter_intStack[++Interpreter_intStackSize - 1] = var7[var20]; // L: 169
								} else if (var33 == ScriptOpcodes.GET_VARP) { // L: 172
									var13 = var7[var20]; // L: 173
									Interpreter_intStack[++Interpreter_intStackSize - 1] = Varps.Varps_main[var13]; // L: 174
								} else if (var33 == ScriptOpcodes.SET_VARP) { // L: 177
									var13 = var7[var20]; // L: 178
									Varps.Varps_main[var13] = Interpreter_intStack[--Interpreter_intStackSize]; // L: 179
									WorldMapLabel.changeGameOptions(var13); // L: 180
								} else if (var33 == ScriptOpcodes.SCONST) { // L: 183
									Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var4.stringOperands[var20]; // L: 184
								} else if (var33 == ScriptOpcodes.JUMP) { // L: 187
									var20 += var7[var20]; // L: 188
								} else if (var33 == ScriptOpcodes.IF_ICMPNE) { // L: 191
									Interpreter_intStackSize -= 2; // L: 192
									if (Interpreter_intStack[Interpreter_intStackSize] != Interpreter_intStack[Interpreter_intStackSize + 1]) { // L: 193
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPEQ) { // L: 196
									Interpreter_intStackSize -= 2; // L: 197
									if (Interpreter_intStack[Interpreter_intStackSize] == Interpreter_intStack[Interpreter_intStackSize + 1]) { // L: 198
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPLT) { // L: 201
									Interpreter_intStackSize -= 2; // L: 202
									if (Interpreter_intStack[Interpreter_intStackSize] < Interpreter_intStack[Interpreter_intStackSize + 1]) { // L: 203
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGT) { // L: 206
									Interpreter_intStackSize -= 2; // L: 207
									if (Interpreter_intStack[Interpreter_intStackSize] > Interpreter_intStack[Interpreter_intStackSize + 1]) { // L: 208
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.RETURN) { // L: 211
									if (Interpreter_frameDepth == 0) { // L: 212
										var30 = false;
										break label950;
									}

									ScriptFrame var40 = Interpreter_frames[--Interpreter_frameDepth]; // L: 213
									var4 = var40.script; // L: 214
									var6 = var4.opcodes; // L: 215
									var7 = var4.intOperands; // L: 216
									var20 = var40.pc; // L: 217
									GrandExchangeOfferNameComparator.Interpreter_intLocals = var40.intLocals; // L: 218
									Interpreter_stringLocals = var40.stringLocals; // L: 219
								} else if (var33 == ScriptOpcodes.GET_VARBIT) { // L: 222
									var13 = var7[var20]; // L: 223
									Interpreter_intStack[++Interpreter_intStackSize - 1] = SecureRandomCallable.getVarbit(var13); // L: 224
								} else if (var33 == ScriptOpcodes.SET_VARBIT) { // L: 227
									var13 = var7[var20]; // L: 228
									Renderable.method4926(var13, Interpreter_intStack[--Interpreter_intStackSize]); // L: 229
								} else if (var33 == ScriptOpcodes.IF_ICMPLE) { // L: 232
									Interpreter_intStackSize -= 2; // L: 233
									if (Interpreter_intStack[Interpreter_intStackSize] <= Interpreter_intStack[Interpreter_intStackSize + 1]) { // L: 234
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGE) { // L: 237
									Interpreter_intStackSize -= 2; // L: 238
									if (Interpreter_intStack[Interpreter_intStackSize] >= Interpreter_intStack[Interpreter_intStackSize + 1]) { // L: 239
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.ILOAD) { // L: 242
									Interpreter_intStack[++Interpreter_intStackSize - 1] = GrandExchangeOfferNameComparator.Interpreter_intLocals[var7[var20]]; // L: 243
								} else if (var33 == ScriptOpcodes.ISTORE) { // L: 246
									GrandExchangeOfferNameComparator.Interpreter_intLocals[var7[var20]] = Interpreter_intStack[--Interpreter_intStackSize]; // L: 247
								} else if (var33 == ScriptOpcodes.SLOAD) { // L: 250
									Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = Interpreter_stringLocals[var7[var20]]; // L: 251
								} else if (var33 == ScriptOpcodes.SSTORE) { // L: 254
									Interpreter_stringLocals[var7[var20]] = Interpreter_stringStack[--class122.Interpreter_stringStackSize]; // L: 255
								} else if (var33 == ScriptOpcodes.JOIN_STRING) { // L: 258
									var13 = var7[var20]; // L: 259
									class122.Interpreter_stringStackSize -= var13; // L: 260
									var21 = StudioGame.method5780(Interpreter_stringStack, class122.Interpreter_stringStackSize, var13); // L: 261
									Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var21; // L: 262
								} else if (var33 == ScriptOpcodes.POP_INT) { // L: 265
									--Interpreter_intStackSize; // L: 266
								} else if (var33 == ScriptOpcodes.POP_STRING) { // L: 269
									--class122.Interpreter_stringStackSize; // L: 270
								} else {
									int var17;
									if (var33 != ScriptOpcodes.INVOKE) { // L: 273
										if (var33 == ScriptOpcodes.GET_VARC_INT) { // L: 296
											Interpreter_intStack[++Interpreter_intStackSize - 1] = class160.varcs.getInt(var7[var20]); // L: 297
										} else if (var33 == ScriptOpcodes.SET_VARC_INT) { // L: 300
											class160.varcs.setInt(var7[var20], Interpreter_intStack[--Interpreter_intStackSize]); // L: 301
										} else if (var33 == ScriptOpcodes.DEFINE_ARRAY) { // L: 304
											var13 = var7[var20] >> 16; // L: 305
											var14 = var7[var20] & 65535; // L: 306
											int var24 = Interpreter_intStack[--Interpreter_intStackSize]; // L: 307
											if (var24 < 0 || var24 > 5000) { // L: 308
												throw new RuntimeException(); // L: 309
											}

											Interpreter_arrayLengths[var13] = var24; // L: 311
											byte var25 = -1; // L: 312
											if (var14 == 105) { // L: 313
												var25 = 0;
											}

											for (var17 = 0; var17 < var24; ++var17) { // L: 314
												Interpreter_arrays[var13][var17] = var25;
											}
										} else if (var33 == ScriptOpcodes.GET_ARRAY_INT) { // L: 317
											var13 = var7[var20]; // L: 318
											var14 = Interpreter_intStack[--Interpreter_intStackSize]; // L: 319
											if (var14 < 0 || var14 >= Interpreter_arrayLengths[var13]) { // L: 320
												throw new RuntimeException(); // L: 321
											}

											Interpreter_intStack[++Interpreter_intStackSize - 1] = Interpreter_arrays[var13][var14]; // L: 323
										} else if (var33 == ScriptOpcodes.SET_ARRAY_INT) { // L: 326
											var13 = var7[var20]; // L: 327
											Interpreter_intStackSize -= 2; // L: 328
											var14 = Interpreter_intStack[Interpreter_intStackSize]; // L: 329
											if (var14 < 0 || var14 >= Interpreter_arrayLengths[var13]) { // L: 330
												throw new RuntimeException(); // L: 331
											}

											Interpreter_arrays[var13][var14] = Interpreter_intStack[Interpreter_intStackSize + 1]; // L: 333
										} else {
											String var22;
											if (var33 == ScriptOpcodes.GET_VARC_STRING_OLD) { // L: 336
												var22 = class160.varcs.getStringOld(var7[var20]); // L: 337
												if (var22 == null) { // L: 338
													var22 = "null";
												}

												Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var22; // L: 339
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING_OLD) { // L: 342
												class160.varcs.setStringOld(var7[var20], Interpreter_stringStack[--class122.Interpreter_stringStackSize]); // L: 343
											} else if (var33 == ScriptOpcodes.GET_VARC_STRING) { // L: 346
												var22 = class160.varcs.getString(var7[var20]); // L: 347
												Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var22; // L: 348
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING) { // L: 351
												class160.varcs.setString(var7[var20], Interpreter_stringStack[--class122.Interpreter_stringStackSize]); // L: 352
											} else if (var33 == ScriptOpcodes.SWITCH) { // L: 355
												IterableNodeHashTable var38 = var4.switches[var7[var20]]; // L: 356
												IntegerNode var37 = (IntegerNode)var38.get((long)Interpreter_intStack[--Interpreter_intStackSize]); // L: 357
												if (var37 != null) { // L: 358
													var20 += var37.integer;
												}
											} else {
												Integer var39;
												if (var33 == ScriptOpcodes.GET_VARCLANSETTING) { // L: 361
													var39 = Calendar.field3269.getTitleGroupValue(var7[var20]); // L: 362
													if (var39 == null) { // L: 363
														Interpreter_intStack[++Interpreter_intStackSize - 1] = -1; // L: 364
													} else {
														Interpreter_intStack[++Interpreter_intStackSize - 1] = var39; // L: 367
													}
												} else {
													if (var33 != ScriptOpcodes.GET_VARCLAN) { // L: 371
														throw new IllegalStateException(); // L: 381
													}

													var39 = HorizontalAlignment.field1885.method7105(var7[var20]); // L: 372
													if (var39 == null) { // L: 373
														Interpreter_intStack[++Interpreter_intStackSize - 1] = -1; // L: 374
													} else {
														Interpreter_intStack[++Interpreter_intStackSize - 1] = var39; // L: 377
													}
												}
											}
										}
									} else {
										var13 = var7[var20]; // L: 274
										Script var36 = ClanChannel.getScript(var13); // L: 275
										int[] var15 = new int[var36.localIntCount]; // L: 276
										String[] var16 = new String[var36.localStringCount]; // L: 277

										for (var17 = 0; var17 < var36.intArgumentCount; ++var17) { // L: 278
											var15[var17] = Interpreter_intStack[var17 + (Interpreter_intStackSize - var36.intArgumentCount)];
										}

										for (var17 = 0; var17 < var36.stringArgumentCount; ++var17) { // L: 279
											var16[var17] = Interpreter_stringStack[var17 + (class122.Interpreter_stringStackSize - var36.stringArgumentCount)];
										}

										Interpreter_intStackSize -= var36.intArgumentCount; // L: 280
										class122.Interpreter_stringStackSize -= var36.stringArgumentCount; // L: 281
										ScriptFrame var23 = new ScriptFrame(); // L: 282
										var23.script = var4; // L: 283
										var23.pc = var20; // L: 284
										var23.intLocals = GrandExchangeOfferNameComparator.Interpreter_intLocals; // L: 285
										var23.stringLocals = Interpreter_stringLocals; // L: 286
										Interpreter_frames[++Interpreter_frameDepth - 1] = var23; // L: 287
										var4 = var36; // L: 288
										var6 = var36.opcodes; // L: 289
										var7 = var36.intOperands; // L: 290
										var20 = -1; // L: 291
										GrandExchangeOfferNameComparator.Interpreter_intLocals = var15; // L: 292
										Interpreter_stringLocals = var16; // L: 293
									}
								}
							}
						} catch (Exception var31) { // L: 401
							var9 = true; // L: 402
							StringBuilder var27 = new StringBuilder(30); // L: 404
							var27.append("").append(var4.key).append(" "); // L: 405
							var13 = Interpreter_frameDepth - 1; // L: 406

							while (true) {
								if (var13 < 0) {
									var27.append("").append(var8); // L: 407
									Widget.RunException_sendStackTrace(var27.toString(), var31); // L: 408
									var30 = false;
									break;
								}

								var27.append("").append(Interpreter_frames[var13].script.key).append(" ");
								--var13;
							}
						}
					} finally {
						if (var30) {
							while (field843.size() > 0) {
								class93 var19 = (class93)field843.remove(0); // L: 413
								WorldMapLabelSize.widgetDefaultMenuAction(var19.method2370(), var19.method2380(), var19.method2372(), var19.method2373(), "");
							}

							if (field841) { // L: 416
								field841 = false; // L: 417
								class20.method294(); // L: 418
							}

							if (!var9 && var2 > 0 && var10 >= var2) {
								Widget.RunException_sendStackTrace("Warning: Script " + var4.field954 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
							}

						}
					}

					while (field843.size() > 0) { // L: 412
						class93 var26 = (class93)field843.remove(0);
						WorldMapLabelSize.widgetDefaultMenuAction(var26.method2370(), var26.method2380(), var26.method2372(), var26.method2373(), "");
					}

					if (field841) {
						field841 = false;
						class20.method294();
					}

					if (!var9 && var2 > 0 && var10 >= var2) {
						Widget.RunException_sendStackTrace("Warning: Script " + var4.field954 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
					}

					return; // L: 424
				}

				while (field843.size() > 0) {
					class93 var34 = (class93)field843.remove(0);
					WorldMapLabelSize.widgetDefaultMenuAction(var34.method2370(), var34.method2380(), var34.method2372(), var34.method2373(), ""); // L: 414
				}

				if (field841) {
					field841 = false;
					class20.method294();
				}

				if (!var9 && var2 > 0 && var10 >= var2) { // L: 420
					Widget.RunException_sendStackTrace("Warning: Script " + var4.field954 + " finished at op count " + var10 + " of max " + var1, (Throwable)null); // L: 421
				}

				return;
			}

			while (field843.size() > 0) {
				class93 var41 = (class93)field843.remove(0);
				WorldMapLabelSize.widgetDefaultMenuAction(var41.method2370(), var41.method2380(), var41.method2372(), var41.method2373(), "");
			}

			if (field841) {
				field841 = false;
				class20.method294();
			}

			if (!var9 && var2 > 0 && var10 >= var2) {
				Widget.RunException_sendStackTrace("Warning: Script " + var4.field954 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
			}

		}
	} // L: 124
}
