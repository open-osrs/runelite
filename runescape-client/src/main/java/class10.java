import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("y")
public class class10 {
	@ObfuscatedName("o")
	HttpsURLConnection field48;
	@ObfuscatedName("q")
	final Map field47;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	class399 field54;
	@ObfuscatedName("k")
	Map field50;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lv;"
	)
	final class9 field51;
	@ObfuscatedName("m")
	boolean field52;
	@ObfuscatedName("p")
	boolean field53;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -387471539
	)
	int field49;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Lv;)V"
	)
	public class10(URL var1, class9 var2) throws IOException {
		this.field52 = false; // L: 20
		this.field53 = false; // L: 21
		this.field49 = 300000;
		if (!var2.method76()) {
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method67());
		} else {
			this.field48 = (HttpsURLConnection)var1.openConnection(); // L: 26
			this.field48.setSSLSocketFactory(new class15()); // L: 27
			this.field51 = var2; // L: 28
			this.field47 = new HashMap(); // L: 29
			this.field50 = new HashMap(); // L: 30
		}
	} // L: 31

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "94"
	)
	public void method78(String var1, String var2) {
		if (!this.field52) { // L: 34
			this.field47.put(var1, var2); // L: 35
		}
	} // L: 36

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "1"
	)
	String method96() {
		ArrayList var1 = new ArrayList(this.field50.entrySet()); // L: 39
		Collections.sort(var1, new class18(this)); // L: 40
		StringBuilder var2 = new StringBuilder(); // L: 53
		Iterator var3 = var1.iterator(); // L: 54

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next(); // L: 55
			if (var2.length() > 0) { // L: 57
				var2.append(",");
			}

			var2.append(((class398)var4.getKey()).method6940()); // L: 58
			float var5 = (Float)var4.getValue(); // L: 59
			if (var5 < 1.0F) { // L: 60
				String var6 = Float.toString(var5).substring(0, 4); // L: 61
				var2.append(";q=" + var6); // L: 62
			}
		}

		return var2.toString(); // L: 66
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-82433388"
	)
	void method80() throws ProtocolException {
		if (!this.field52) { // L: 70
			this.field48.setRequestMethod(this.field51.method67()); // L: 71
			if (!this.field50.isEmpty()) { // L: 72
				this.field47.put("Accept", this.method96());
			}

			Iterator var1 = this.field47.entrySet().iterator(); // L: 73

			while (var1.hasNext()) {
				Entry var2 = (Entry)var1.next(); // L: 74
				this.field48.setRequestProperty((String)var2.getKey(), (String)var2.getValue()); // L: 76
			}

			if (this.field51.method68() && this.field54 != null) { // L: 79
				this.field48.setDoOutput(true); // L: 80
				ByteArrayOutputStream var13 = new ByteArrayOutputStream(); // L: 81

				try {
					var13.write(this.field54.vmethod6962()); // L: 83
					var13.writeTo(this.field48.getOutputStream()); // L: 84
				} catch (IOException var11) { // L: 86
					var11.printStackTrace(); // L: 87
				} finally {
					if (var13 != null) { // L: 90
						try {
							var13.close(); // L: 92
						} catch (IOException var10) { // L: 94
							var10.printStackTrace(); // L: 95
						}
					}

				}
			}

			this.field48.setConnectTimeout(this.field49); // L: 100
			this.field48.setInstanceFollowRedirects(this.field53); // L: 101
			this.field52 = true; // L: 102
		}
	} // L: 103

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1448695521"
	)
	boolean method79() throws IOException, SocketTimeoutException {
		if (!this.field52) { // L: 106
			this.method80();
		}

		this.field48.connect(); // L: 107
		return this.field48.getResponseCode() == -1; // L: 108
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)Ld;",
		garbageValue = "-1"
	)
	class21 method82() {
		try {
			if (!this.field52 || this.field48.getResponseCode() == -1) {
				return new class21("No REST response has been received yet.");
			}
		} catch (IOException var10) {
			this.field48.disconnect();
			return new class21("Error decoding REST response code: " + var10.getMessage()); // L: 118
		}

		class21 var1 = null;

		class21 var3;
		try {
			var1 = new class21(this.field48); // L: 122
			return var1;
		} catch (IOException var8) {
			var3 = new class21("Error decoding REST response: " + var8.getMessage()); // L: 125
		} finally {
			this.field48.disconnect();
		}

		return var3;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1726838595"
	)
	static void method87(int var0) {
		GrandExchangeOfferAgeComparator.field4072 = var0; // L: 22
		class387.field4395 = new class387[var0]; // L: 23
		Frames.field2492 = 0; // L: 24
	} // L: 25

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lcr;IIB)V",
		garbageValue = "-15"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args; // L: 112
		Script var4;
		int var20;
		if (class137.isWorldMapEvent(var0.type)) { // L: 114
			class9.worldMapEvent = (WorldMapEvent)var3[0]; // L: 115
			WorldMapElement var5 = class120.WorldMapElement_get(class9.worldMapEvent.mapElement); // L: 116
			var4 = GameObject.getWorldMapScript(var0.type, var5.objectId, var5.category); // L: 117
		} else {
			var20 = (Integer)var3[0]; // L: 120
			var4 = class301.getScript(var20); // L: 121
		}

		if (var4 != null) { // L: 123
			class12.Interpreter_intStackSize = 0; // L: 126
			class9.Interpreter_stringStackSize = 0; // L: 127
			var20 = -1; // L: 128
			int[] var6 = var4.opcodes; // L: 129
			int[] var7 = var4.intOperands; // L: 130
			byte var8 = -1; // L: 131
			Interpreter.Interpreter_frameDepth = 0; // L: 132
			Interpreter.field835 = false; // L: 133
			boolean var9 = false; // L: 134
			int var10 = 0; // L: 135
			boolean var30 = false;

			label955: {
				label956: {
					try {
						int var13;
						try {
							var30 = true; // L: 137
							class21.Interpreter_intLocals = new int[var4.localIntCount]; // L: 138
							int var11 = 0; // L: 139
							class268.Interpreter_stringLocals = new String[var4.localStringCount]; // L: 140
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
										var14 = var0.widget != null ? var0.widget.id * 1115174973 * -203153643 : -1;
									}

									if (var14 == -2147483644) { // L: 147
										var14 = var0.opIndex;
									}

									if (var14 == -2147483643) { // L: 148
										var14 = var0.widget != null ? var0.widget.childIndex * -776270713 * -224921289 : -1;
									}

									if (var14 == -2147483642) { // L: 149
										var14 = var0.dragTarget != null ? var0.dragTarget.id * 1115174973 * -203153643 : -1;
									}

									if (var14 == -2147483641) { // L: 150
										var14 = var0.dragTarget != null ? var0.dragTarget.childIndex * -776270713 * -224921289 : -1;
									}

									if (var14 == -2147483640) { // L: 151
										var14 = var0.keyTyped;
									}

									if (var14 == -2147483639) { // L: 152
										var14 = var0.keyPressed;
									}

									class21.Interpreter_intLocals[var11++] = var14; // L: 153
								} else if (var3[var13] instanceof String) { // L: 155
									var21 = (String)var3[var13]; // L: 156
									if (var21.equals("event_opbase")) { // L: 157
										var21 = var0.targetName;
									}

									class268.Interpreter_stringLocals[var12++] = var21; // L: 158
								}
							}

							Interpreter.field823 = var0.field1054; // L: 162

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

									var14 = KeyHandler.method329(var33, var4, var35); // L: 387
									switch(var14) { // L: 388
									case 0:
										var30 = false;
										break label955;
									case 1:
									default:
										break;
									case 2:
										throw new IllegalStateException(); // L: 395
									}
								} else if (var33 == ScriptOpcodes.ICONST) { // L: 168
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var7[var20]; // L: 169
								} else if (var33 == ScriptOpcodes.GET_VARP) { // L: 172
									var13 = var7[var20]; // L: 173
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Varps.Varps_main[var13]; // L: 174
								} else if (var33 == ScriptOpcodes.SET_VARP) { // L: 177
									var13 = var7[var20]; // L: 178
									Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 179
									class321.changeGameOptions(var13); // L: 180
								} else if (var33 == ScriptOpcodes.SCONST) { // L: 183
									Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var4.stringOperands[var20]; // L: 184
								} else if (var33 == ScriptOpcodes.JUMP) { // L: 187
									var20 += var7[var20]; // L: 188
								} else if (var33 == ScriptOpcodes.IF_ICMPNE) { // L: 191
									class12.Interpreter_intStackSize -= 2; // L: 192
									if (Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]) { // L: 193
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPEQ) { // L: 196
									class12.Interpreter_intStackSize -= 2; // L: 197
									if (Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]) { // L: 198
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPLT) { // L: 201
									class12.Interpreter_intStackSize -= 2; // L: 202
									if (Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]) { // L: 203
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGT) { // L: 206
									class12.Interpreter_intStackSize -= 2; // L: 207
									if (Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]) { // L: 208
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.RETURN) { // L: 211
									if (Interpreter.Interpreter_frameDepth == 0) {
										var30 = false;
										break label956;
									}

									ScriptFrame var40 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth]; // L: 213
									var4 = var40.script; // L: 214
									var6 = var4.opcodes; // L: 215
									var7 = var4.intOperands; // L: 216
									var20 = var40.pc; // L: 217
									class21.Interpreter_intLocals = var40.intLocals; // L: 218
									class268.Interpreter_stringLocals = var40.stringLocals; // L: 219
								} else if (var33 == ScriptOpcodes.GET_VARBIT) { // L: 222
									var13 = var7[var20]; // L: 223
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class18.getVarbit(var13); // L: 224
								} else if (var33 == ScriptOpcodes.SET_VARBIT) { // L: 227
									var13 = var7[var20]; // L: 228
									class92.method2372(var13, Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]); // L: 229
								} else if (var33 == ScriptOpcodes.IF_ICMPLE) { // L: 232
									class12.Interpreter_intStackSize -= 2; // L: 233
									if (Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]) { // L: 234
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGE) { // L: 237
									class12.Interpreter_intStackSize -= 2; // L: 238
									if (Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]) { // L: 239
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.ILOAD) { // L: 242
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class21.Interpreter_intLocals[var7[var20]]; // L: 243
								} else if (var33 == ScriptOpcodes.ISTORE) { // L: 246
									class21.Interpreter_intLocals[var7[var20]] = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 247
								} else if (var33 == ScriptOpcodes.SLOAD) { // L: 250
									Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = class268.Interpreter_stringLocals[var7[var20]]; // L: 251
								} else if (var33 == ScriptOpcodes.SSTORE) { // L: 254
									class268.Interpreter_stringLocals[var7[var20]] = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize]; // L: 255
								} else if (var33 == ScriptOpcodes.JOIN_STRING) { // L: 258
									var13 = var7[var20]; // L: 259
									class9.Interpreter_stringStackSize -= var13; // L: 260
									var21 = StructComposition.method3524(Interpreter.Interpreter_stringStack, class9.Interpreter_stringStackSize, var13); // L: 261
									Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var21; // L: 262
								} else if (var33 == ScriptOpcodes.POP_INT) { // L: 265
									--class12.Interpreter_intStackSize; // L: 266
								} else if (var33 == ScriptOpcodes.POP_STRING) { // L: 269
									--class9.Interpreter_stringStackSize; // L: 270
								} else {
									int var17;
									if (var33 != ScriptOpcodes.INVOKE) { // L: 273
										if (var33 == ScriptOpcodes.GET_VARC_INT) { // L: 296
											Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class125.varcs.getInt(var7[var20]); // L: 297
										} else if (var33 == ScriptOpcodes.SET_VARC_INT) { // L: 300
											class125.varcs.setInt(var7[var20], Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]); // L: 301
										} else if (var33 == ScriptOpcodes.DEFINE_ARRAY) { // L: 304
											var13 = var7[var20] >> 16; // L: 305
											var14 = var7[var20] & 65535; // L: 306
											int var24 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 307
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
											var14 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 319
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 320
												throw new RuntimeException(); // L: 321
											}

											Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14]; // L: 323
										} else if (var33 == ScriptOpcodes.SET_ARRAY_INT) { // L: 326
											var13 = var7[var20]; // L: 327
											class12.Interpreter_intStackSize -= 2; // L: 328
											var14 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 329
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 330
												throw new RuntimeException(); // L: 331
											}

											Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]; // L: 333
										} else {
											String var22;
											if (var33 == ScriptOpcodes.GET_VARC_STRING_OLD) { // L: 336
												var22 = class125.varcs.getStringOld(var7[var20]); // L: 337
												if (var22 == null) { // L: 338
													var22 = "null";
												}

												Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var22; // L: 339
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING_OLD) { // L: 342
												class125.varcs.setStringOld(var7[var20], Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize]); // L: 343
											} else if (var33 == ScriptOpcodes.GET_VARC_STRING) { // L: 346
												var22 = class125.varcs.getString(var7[var20]); // L: 347
												Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var22; // L: 348
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING) { // L: 351
												class125.varcs.setString(var7[var20], Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize]); // L: 352
											} else if (var33 == ScriptOpcodes.SWITCH) { // L: 355
												IterableNodeHashTable var38 = var4.switches[var7[var20]]; // L: 356
												IntegerNode var37 = (IntegerNode)var38.get((long)Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]); // L: 357
												if (var37 != null) { // L: 358
													var20 += var37.integer;
												}
											} else {
												Integer var39;
												if (var33 == ScriptOpcodes.GET_VARCLANSETTING) { // L: 361
													var39 = FontName.field4583.getTitleGroupValue(var7[var20]); // L: 362
													if (var39 == null) { // L: 363
														Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1; // L: 364
													} else {
														Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var39; // L: 367
													}
												} else {
													if (var33 != ScriptOpcodes.GET_VARCLAN) { // L: 371
														throw new IllegalStateException(); // L: 381
													}

													var39 = UserComparator8.field1378.method6905(var7[var20]); // L: 372
													if (var39 == null) { // L: 373
														Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1; // L: 374
													} else {
														Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var39; // L: 377
													}
												}
											}
										}
									} else {
										var13 = var7[var20]; // L: 274
										Script var36 = class301.getScript(var13); // L: 275
										int[] var15 = new int[var36.localIntCount]; // L: 276
										String[] var16 = new String[var36.localStringCount]; // L: 277

										for (var17 = 0; var17 < var36.intArgumentCount; ++var17) { // L: 278
											var15[var17] = Interpreter.Interpreter_intStack[var17 + (class12.Interpreter_intStackSize - var36.intArgumentCount)];
										}

										for (var17 = 0; var17 < var36.stringArgumentCount; ++var17) { // L: 279
											var16[var17] = Interpreter.Interpreter_stringStack[var17 + (class9.Interpreter_stringStackSize - var36.stringArgumentCount)];
										}

										class12.Interpreter_intStackSize -= var36.intArgumentCount; // L: 280
										class9.Interpreter_stringStackSize -= var36.stringArgumentCount; // L: 281
										ScriptFrame var23 = new ScriptFrame(); // L: 282
										var23.script = var4; // L: 283
										var23.pc = var20; // L: 284
										var23.intLocals = class21.Interpreter_intLocals; // L: 285
										var23.stringLocals = class268.Interpreter_stringLocals; // L: 286
										Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var23; // L: 287
										var4 = var36; // L: 288
										var6 = var36.opcodes; // L: 289
										var7 = var36.intOperands; // L: 290
										var20 = -1; // L: 291
										class21.Interpreter_intLocals = var15; // L: 292
										class268.Interpreter_stringLocals = var16; // L: 293
									}
								}
							}
						} catch (Exception var31) { // L: 401
							var9 = true; // L: 402
							StringBuilder var27 = new StringBuilder(30); // L: 404
							var27.append("").append(var4.key).append(" "); // L: 405
							var13 = Interpreter.Interpreter_frameDepth - 1; // L: 406

							while (true) {
								if (var13 < 0) {
									var27.append("").append(var8); // L: 407
									ArchiveDiskActionHandler.RunException_sendStackTrace(var27.toString(), var31); // L: 408
									var30 = false;
									break;
								}

								var27.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
								--var13;
							}
						}
					} finally {
						if (var30) {
							while (Interpreter.field821.size() > 0) {
								class93 var19 = (class93)Interpreter.field821.remove(0); // L: 413
								TaskHandler.widgetDefaultMenuAction(var19.method2379(), var19.method2380(), var19.method2389(), var19.method2382(), "");
							}

							if (Interpreter.field835) { // L: 416
								Interpreter.field835 = false; // L: 417
								Varps.method5366(); // L: 418
							}

							if (!var9 && var2 > 0 && var10 >= var2) {
								ArchiveDiskActionHandler.RunException_sendStackTrace("Warning: Script " + var4.field949 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
							}

						}
					}

					while (Interpreter.field821.size() > 0) { // L: 412
						class93 var26 = (class93)Interpreter.field821.remove(0);
						TaskHandler.widgetDefaultMenuAction(var26.method2379(), var26.method2380(), var26.method2389(), var26.method2382(), "");
					}

					if (Interpreter.field835) {
						Interpreter.field835 = false;
						Varps.method5366();
					}

					if (!var9 && var2 > 0 && var10 >= var2) {
						ArchiveDiskActionHandler.RunException_sendStackTrace("Warning: Script " + var4.field949 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
					}

					return; // L: 424
				}

				while (Interpreter.field821.size() > 0) {
					class93 var41 = (class93)Interpreter.field821.remove(0);
					TaskHandler.widgetDefaultMenuAction(var41.method2379(), var41.method2380(), var41.method2389(), var41.method2382(), "");
				}

				if (Interpreter.field835) {
					Interpreter.field835 = false;
					Varps.method5366();
				}

				if (!var9 && var2 > 0 && var10 >= var2) {
					ArchiveDiskActionHandler.RunException_sendStackTrace("Warning: Script " + var4.field949 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
				}

				return; // L: 212
			}

			while (Interpreter.field821.size() > 0) {
				class93 var34 = (class93)Interpreter.field821.remove(0);
				TaskHandler.widgetDefaultMenuAction(var34.method2379(), var34.method2380(), var34.method2389(), var34.method2382(), ""); // L: 414
			}

			if (Interpreter.field835) {
				Interpreter.field835 = false;
				Varps.method5366();
			}

			if (!var9 && var2 > 0 && var10 >= var2) { // L: 420
				ArchiveDiskActionHandler.RunException_sendStackTrace("Warning: Script " + var4.field949 + " finished at op count " + var10 + " of max " + var1, (Throwable)null); // L: 421
			}

		}
	} // L: 124 390

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1044379624"
	)
	static int method94(int var0) {
		return var0 * 3 + 600; // L: 1500
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(Lki;IIS)V",
		garbageValue = "138"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) { // L: 11776
			if (var0 != null && class146.method2992(var0) != null) { // L: 11777
				Client.clickedWidget = var0; // L: 11778
				Client.clickedWidgetParent = class146.method2992(var0); // L: 11779
				Client.widgetClickX = var1; // L: 11780
				Client.widgetClickY = var2; // L: 11781
				SoundSystem.widgetDragDuration = 0; // L: 11782
				Client.isDraggingWidget = false; // L: 11783
				int var3 = Client.menuOptionsCount - 1; // L: 11786
				if (var3 != -1) { // L: 11789
					Players.method2426(var3);
				}

			}
		}
	} // L: 11790
}
