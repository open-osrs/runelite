import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("df")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "[Loa;"
	)
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("v")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("y")
	@Export("map")
	Map map;
	@ObfuscatedName("j")
	@Export("strings")
	String[] strings;
	@ObfuscatedName("o")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		longValue = -4374446863144258723L
	)
	long field1382;

	Varcs() {
		this.unwrittenChanges = false; // L: 22
		int var1 = SecureRandomFuture.archive2.getGroupFileCount(19); // L: 26
		this.map = new HashMap(); // L: 27
		this.intsPersistence = new boolean[var1]; // L: 28

		int var2;
		for (var2 = 0; var2 < var1; ++var2) { // L: 29
			VarcInt var3 = Interpreter.method2009(var2); // L: 30
			this.intsPersistence[var2] = var3.persist; // L: 31
		}

		var2 = 0; // L: 33
		if (SecureRandomFuture.archive2.method5031(15)) { // L: 34
			var2 = SecureRandomFuture.archive2.getGroupFileCount(15); // L: 35
		}

		this.strings = new String[var2]; // L: 37
		this.read(); // L: 38
	} // L: 39

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "88"
	)
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2); // L: 42
		if (this.intsPersistence[var1]) {
			this.unwrittenChanges = true; // L: 43
		}

	} // L: 44

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-43"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1); // L: 47
		return var2 instanceof Integer ? (Integer)var2 : -1; // L: 48 49 51
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "-105"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2); // L: 55
	} // L: 56

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "30"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1); // L: 59
		return var2 instanceof String ? (String)var2 : ""; // L: 60 61 63
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "1842220205"
	)
	@Export("setStringOld")
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2; // L: 67
	} // L: 68

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "921484764"
	)
	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1]; // L: 71
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1804190455"
	)
	@Export("clearTransient")
	void clearTransient() {
		int var1;
		for (var1 = 0; var1 < this.intsPersistence.length; ++var1) { // L: 75
			if (!this.intsPersistence[var1]) { // L: 76
				this.map.remove(var1); // L: 77
			}
		}

		for (var1 = 0; var1 < this.strings.length; ++var1) { // L: 80
			this.strings[var1] = null; // L: 81
		}

	} // L: 83

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lnp;",
		garbageValue = "609461646"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return class262.getPreferencesFile("2", class182.field2114.name, var1); // L: 86
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1876168838"
	)
	@Export("write")
	void write() {
		AccessFile var1 = this.getPreferencesFile(true); // L: 90

		try {
			int var2 = 3; // L: 92
			int var3 = 0; // L: 93
			Iterator var4 = this.map.entrySet().iterator(); // L: 94

			while (var4.hasNext()) {
				Entry var5 = (Entry)var4.next(); // L: 95
				int var6 = (Integer)var5.getKey(); // L: 97
				if (this.intsPersistence[var6]) { // L: 98
					Object var7 = var5.getValue(); // L: 99
					var2 += 3; // L: 100
					if (var7 instanceof Integer) { // L: 101
						var2 += 4;
					} else if (var7 instanceof String) { // L: 102
						var2 += class44.stringCp1252NullTerminatedByteSize((String)var7);
					}

					++var3; // L: 103
				}
			}

			Buffer var23 = new Buffer(var2); // L: 107
			var23.writeByte(2); // L: 108
			var23.writeShort(var3); // L: 109
			Iterator var24 = this.map.entrySet().iterator(); // L: 110

			while (var24.hasNext()) {
				Entry var12 = (Entry)var24.next(); // L: 111
				int var13 = (Integer)var12.getKey();
				if (this.intsPersistence[var13]) { // L: 114
					var23.writeShort(var13);
					Object var8 = var12.getValue();
					class375 var9 = class375.method6511(var8.getClass());
					var23.writeByte(var9.field4137);
					class375.method6512(var8, var23); // L: 119
				}
			}

			var1.write(var23.array, 0, var23.offset); // L: 123
		} catch (Exception var21) {
		} finally {
			try {
				var1.close();
			} catch (Exception var20) {
			}

		}

		this.unwrittenChanges = false;
		this.field1382 = ClientPacket.currentTimeMillis();
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "124"
	)
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false); // L: 137

		label228: {
			try {
				byte[] var2 = new byte[(int)var1.length()];

				int var4;
				for (int var3 = 0; var3 < var2.length; var3 += var4) {
					var4 = var1.read(var2, var3, var2.length - var3);
					if (var4 == -1) {
						throw new EOFException();
					}
				}

				Buffer var15 = new Buffer(var2);
				if (var15.array.length - var15.offset >= 1) {
					int var16 = var15.readUnsignedByte();
					if (var16 >= 0 && var16 <= 2) {
						int var7;
						int var8;
						int var9;
						int var17;
						if (var16 >= 2) {
							var17 = var15.readUnsignedShort();
							var7 = 0;

							while (true) {
								if (var7 >= var17) {
									break label228;
								}

								var8 = var15.readUnsignedShort();
								var9 = var15.readUnsignedByte();
								class375[] var10 = new class375[]{class375.field4128, class375.field4134, class375.field4127};
								class375 var11 = (class375)Clock.findEnumerated(var10, var9);
								Object var12 = var11.method6510(var15); // L: 160
								if (this.intsPersistence[var8]) { // L: 161
									this.map.put(var8, var12); // L: 162
								}

								++var7;
							}
						} else {
							var17 = var15.readUnsignedShort();

							for (var7 = 0; var7 < var17; ++var7) {
								var8 = var15.readUnsignedShort();
								var9 = var15.readInt();
								if (this.intsPersistence[var8]) { // L: 171
									this.map.put(var8, var9); // L: 172
								}
							}

							var7 = var15.readUnsignedShort();
							var8 = 0;

							while (true) {
								if (var8 >= var7) {
									break label228;
								}

								var15.readUnsignedShort(); // L: 177
								var15.readStringCp1252NullTerminated();
								++var8; // L: 176
							}
						}
					}

					return; // L: 187
				}
			} catch (Exception var26) { // L: 182
				break label228;
			} finally {
				try {
					var1.close();
				} catch (Exception var25) {
				}

			}

			return;
		}

		this.unwrittenChanges = false;
	} // L: 190

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1424878016"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1382 < ClientPacket.currentTimeMillis() - 60000L) {
			this.write();
		}

	} // L: 196

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "262947682"
	)
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lcs;IIB)V",
		garbageValue = "-123"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args; // L: 113
		Script var4;
		int var20;
		if (Message.isWorldMapEvent(var0.type)) { // L: 115
			Occluder.worldMapEvent = (WorldMapEvent)var3[0]; // L: 116
			WorldMapElement var5 = Archive.WorldMapElement_get(Occluder.worldMapEvent.mapElement); // L: 117
			var4 = StructComposition.getWorldMapScript(var0.type, var5.objectId, var5.category); // L: 118
		} else {
			var20 = (Integer)var3[0]; // L: 121
			var4 = class375.getScript(var20); // L: 122
		}

		if (var4 != null) { // L: 124
			ChatChannel.Interpreter_intStackSize = 0; // L: 127
			UserComparator9.Interpreter_stringStackSize = 0; // L: 128
			var20 = -1; // L: 129
			int[] var6 = var4.opcodes; // L: 130
			int[] var7 = var4.intOperands; // L: 131
			byte var8 = -1; // L: 132
			Interpreter.Interpreter_frameDepth = 0; // L: 133
			Interpreter.field963 = false; // L: 134
			boolean var9 = false; // L: 135
			int var10 = 0; // L: 136
			boolean var30 = false;

			label985: {
				label986: {
					try {
						int var13;
						try {
							var30 = true; // L: 138
							class231.Interpreter_intLocals = new int[var4.localIntCount]; // L: 139
							int var11 = 0; // L: 140
							UrlRequester.Interpreter_stringLocals = new String[var4.localStringCount]; // L: 141
							int var12 = 0;

							int var14;
							String var21;
							for (var13 = 1; var13 < var3.length; ++var13) { // L: 142
								if (var3[var13] instanceof Integer) { // L: 143
									var14 = (Integer)var3[var13]; // L: 144
									if (var14 == -2147483647) { // L: 145
										var14 = var0.mouseX;
									}

									if (var14 == -2147483646) { // L: 146
										var14 = var0.mouseY;
									}

									if (var14 == -2147483645) { // L: 147
										var14 = var0.widget != null ? var0.widget.id * -464746545 * 363798319 : -1;
									}

									if (var14 == -2147483644) { // L: 148
										var14 = var0.opIndex;
									}

									if (var14 == -2147483643) { // L: 149
										var14 = var0.widget != null ? var0.widget.childIndex * 1482836169 * 576999801 : -1;
									}

									if (var14 == -2147483642) { // L: 150
										var14 = var0.dragTarget != null ? var0.dragTarget.id * -464746545 * 363798319 : -1;
									}

									if (var14 == -2147483641) { // L: 151
										var14 = var0.dragTarget != null ? var0.dragTarget.childIndex * 1482836169 * 576999801 : -1;
									}

									if (var14 == -2147483640) { // L: 152
										var14 = var0.keyTyped;
									}

									if (var14 == -2147483639) { // L: 153
										var14 = var0.keyPressed;
									}

									class231.Interpreter_intLocals[var11++] = var14; // L: 154
								} else if (var3[var13] instanceof String) { // L: 156
									var21 = (String)var3[var13]; // L: 157
									if (var21.equals("event_opbase")) { // L: 158
										var21 = var0.targetName;
									}

									UrlRequester.Interpreter_stringLocals[var12++] = var21; // L: 159
								}
							}

							Interpreter.field966 = var0.field1154; // L: 163

							while (true) {
								++var10; // L: 165
								if (var10 > var1) { // L: 166
									throw new RuntimeException();
								}

								++var20; // L: 167
								int var33 = var6[var20];
								if (var33 >= 100) { // L: 168
									boolean var35;
									if (var4.intOperands[var20] == 1) { // L: 386
										var35 = true;
									} else {
										var35 = false; // L: 387
									}

									var14 = class7.method88(var33, var4, var35); // L: 388
									switch(var14) { // L: 389
									case 0:
										var30 = false;
										break label985;
									case 1:
									default:
										break;
									case 2:
										throw new IllegalStateException(); // L: 392
									}
								} else if (var33 == 0) { // L: 169
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var7[var20]; // L: 170
								} else if (var33 == ScriptOpcodes.GET_VARP) { // L: 173
									var13 = var7[var20]; // L: 174
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Varps.Varps_main[var13]; // L: 175
								} else if (var33 == ScriptOpcodes.SET_VARP) { // L: 178
									var13 = var7[var20]; // L: 179
									Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 180
									class6.changeGameOptions(var13); // L: 181
								} else if (var33 == ScriptOpcodes.SCONST) { // L: 184
									Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var4.stringOperands[var20]; // L: 185
								} else if (var33 == ScriptOpcodes.JUMP) { // L: 188
									var20 += var7[var20]; // L: 189
								} else if (var33 == ScriptOpcodes.IF_ICMPNE) { // L: 192
									ChatChannel.Interpreter_intStackSize -= 2; // L: 193
									if (Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]) { // L: 194
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPEQ) { // L: 197
									ChatChannel.Interpreter_intStackSize -= 2; // L: 198
									if (Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]) { // L: 199
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPLT) { // L: 202
									ChatChannel.Interpreter_intStackSize -= 2; // L: 203
									if (Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]) { // L: 204
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGT) { // L: 207
									ChatChannel.Interpreter_intStackSize -= 2; // L: 208
									if (Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]) { // L: 209
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.RETURN) { // L: 212
									if (Interpreter.Interpreter_frameDepth == 0) { // L: 213
										var30 = false;
										break;
									}

									ScriptFrame var40 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth]; // L: 214
									var4 = var40.script; // L: 215
									var6 = var4.opcodes; // L: 216
									var7 = var4.intOperands; // L: 217
									var20 = var40.pc; // L: 218
									class231.Interpreter_intLocals = var40.intLocals; // L: 219
									UrlRequester.Interpreter_stringLocals = var40.stringLocals; // L: 220
								} else if (var33 == ScriptOpcodes.GET_VARBIT) { // L: 223
									var13 = var7[var20]; // L: 224
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = ScriptFrame.getVarbit(var13); // L: 225
								} else if (var33 == ScriptOpcodes.SET_VARBIT) { // L: 228
									var13 = var7[var20]; // L: 229
									Archive.method5060(var13, Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]); // L: 230
								} else if (var33 == ScriptOpcodes.IF_ICMPLE) { // L: 233
									ChatChannel.Interpreter_intStackSize -= 2; // L: 234
									if (Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]) { // L: 235
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGE) { // L: 238
									ChatChannel.Interpreter_intStackSize -= 2; // L: 239
									if (Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]) { // L: 240
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.ILOAD) { // L: 243
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class231.Interpreter_intLocals[var7[var20]]; // L: 244
								} else if (var33 == ScriptOpcodes.ISTORE) { // L: 247
									class231.Interpreter_intLocals[var7[var20]] = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 248
								} else if (var33 == ScriptOpcodes.SLOAD) { // L: 251
									Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = UrlRequester.Interpreter_stringLocals[var7[var20]]; // L: 252
								} else if (var33 == ScriptOpcodes.SSTORE) { // L: 255
									UrlRequester.Interpreter_stringLocals[var7[var20]] = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]; // L: 256
								} else if (var33 == ScriptOpcodes.JOIN_STRING) { // L: 259
									var13 = var7[var20]; // L: 260
									UserComparator9.Interpreter_stringStackSize -= var13; // L: 261
									var21 = MouseRecorder.method2203(Interpreter.Interpreter_stringStack, UserComparator9.Interpreter_stringStackSize, var13); // L: 262
									Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var21; // L: 263
								} else if (var33 == ScriptOpcodes.POP_INT) { // L: 266
									--ChatChannel.Interpreter_intStackSize; // L: 267
								} else if (var33 == ScriptOpcodes.POP_STRING) { // L: 270
									--UserComparator9.Interpreter_stringStackSize; // L: 271
								} else {
									int var17;
									if (var33 != ScriptOpcodes.INVOKE) { // L: 274
										if (var33 == ScriptOpcodes.GET_VARC_INT) { // L: 297
											Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class20.varcs.getInt(var7[var20]); // L: 298
										} else if (var33 == ScriptOpcodes.SET_VARC_INT) { // L: 301
											class20.varcs.setInt(var7[var20], Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]); // L: 302
										} else if (var33 == ScriptOpcodes.DEFINE_ARRAY) { // L: 305
											var13 = var7[var20] >> 16; // L: 306
											var14 = var7[var20] & 65535; // L: 307
											int var24 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 308
											if (var24 < 0 || var24 > 5000) { // L: 309
												throw new RuntimeException(); // L: 310
											}

											Interpreter.Interpreter_arrayLengths[var13] = var24; // L: 312
											byte var25 = -1; // L: 313
											if (var14 == 105) { // L: 314
												var25 = 0;
											}

											for (var17 = 0; var17 < var24; ++var17) { // L: 315
												Interpreter.Interpreter_arrays[var13][var17] = var25;
											}
										} else if (var33 == ScriptOpcodes.GET_ARRAY_INT) { // L: 318
											var13 = var7[var20]; // L: 319
											var14 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 320
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 321
												throw new RuntimeException(); // L: 322
											}

											Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14]; // L: 324
										} else if (var33 == ScriptOpcodes.SET_ARRAY_INT) { // L: 327
											var13 = var7[var20]; // L: 328
											ChatChannel.Interpreter_intStackSize -= 2; // L: 329
											var14 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 330
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 331
												throw new RuntimeException(); // L: 332
											}

											Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 334
										} else {
											String var22;
											if (var33 == ScriptOpcodes.GET_VARC_STRING_OLD) { // L: 337
												var22 = class20.varcs.getStringOld(var7[var20]); // L: 338
												if (var22 == null) { // L: 339
													var22 = "null";
												}

												Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var22; // L: 340
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING_OLD) { // L: 343
												class20.varcs.setStringOld(var7[var20], Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]); // L: 344
											} else if (var33 == ScriptOpcodes.GET_VARC_STRING) { // L: 347
												var22 = class20.varcs.getString(var7[var20]); // L: 348
												Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var22; // L: 349
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING) { // L: 352
												class20.varcs.setString(var7[var20], Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]); // L: 353
											} else if (var33 == ScriptOpcodes.SWITCH) { // L: 356
												IterableNodeHashTable var38 = var4.switches[var7[var20]]; // L: 357
												IntegerNode var37 = (IntegerNode)var38.get((long)Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]); // L: 358
												if (var37 != null) { // L: 359
													var20 += var37.integer;
												}
											} else {
												Integer var39;
												if (var33 == ScriptOpcodes.GET_VARCLANSETTING) { // L: 362
													var39 = DirectByteArrayCopier.field3128.getTitleGroupValue(var7[var20]); // L: 363
													if (var39 == null) { // L: 364
														Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1; // L: 365
													} else {
														Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var39; // L: 368
													}
												} else {
													if (var33 != ScriptOpcodes.GET_VARCLAN) { // L: 372
														throw new IllegalStateException(); // L: 382
													}

													var39 = class10.field74.method6047(var7[var20]); // L: 373
													if (var39 == null) { // L: 374
														Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1; // L: 375
													} else {
														Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var39; // L: 378
													}
												}
											}
										}
									} else {
										var13 = var7[var20]; // L: 275
										Script var36 = class375.getScript(var13); // L: 276
										int[] var15 = new int[var36.localIntCount]; // L: 277
										String[] var16 = new String[var36.localStringCount]; // L: 278

										for (var17 = 0; var17 < var36.intArgumentCount; ++var17) { // L: 279
											var15[var17] = Interpreter.Interpreter_intStack[var17 + (ChatChannel.Interpreter_intStackSize - var36.intArgumentCount)];
										}

										for (var17 = 0; var17 < var36.stringArgumentCount; ++var17) { // L: 280
											var16[var17] = Interpreter.Interpreter_stringStack[var17 + (UserComparator9.Interpreter_stringStackSize - var36.stringArgumentCount)];
										}

										ChatChannel.Interpreter_intStackSize -= var36.intArgumentCount; // L: 281
										UserComparator9.Interpreter_stringStackSize -= var36.stringArgumentCount; // L: 282
										ScriptFrame var23 = new ScriptFrame(); // L: 283
										var23.script = var4; // L: 284
										var23.pc = var20; // L: 285
										var23.intLocals = class231.Interpreter_intLocals; // L: 286
										var23.stringLocals = UrlRequester.Interpreter_stringLocals; // L: 287
										Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var23; // L: 288
										var4 = var36; // L: 289
										var6 = var36.opcodes; // L: 290
										var7 = var36.intOperands; // L: 291
										var20 = -1; // L: 292
										class231.Interpreter_intLocals = var15; // L: 293
										UrlRequester.Interpreter_stringLocals = var16; // L: 294
									}
								}
							}
						} catch (Exception var31) { // L: 402
							var9 = true; // L: 403
							StringBuilder var27 = new StringBuilder(30); // L: 405
							var27.append("").append(var4.key).append(" "); // L: 406

							for (var13 = Interpreter.Interpreter_frameDepth - 1; var13 >= 0; --var13) { // L: 407
								var27.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
							}

							var27.append("").append(var8); // L: 408
							FriendsChat.RunException_sendStackTrace(var27.toString(), var31); // L: 409
							var30 = false;
							break label986;
						}
					} finally {
						if (var30) {
							if (Interpreter.field963) { // L: 413
								Interpreter.field951 = true; // L: 414
							}

							while (Interpreter.field965.size() > 0) { // L: 416
								class106 var19 = (class106)Interpreter.field965.remove(0); // L: 417
								MouseHandler.widgetDefaultMenuAction(var19.method2375(), var19.method2360(), var19.method2367(), var19.method2363(), "");
							}

							if (Interpreter.field951) { // L: 420
								class20.method288(); // L: 421
								Interpreter.field951 = false; // L: 422
								Interpreter.field963 = false; // L: 423
							}

							if (!var9 && var2 > 0 && var10 >= var2) {
								FriendsChat.RunException_sendStackTrace("Warning: Script " + var4.field1069 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
							}

						}
					}

					if (Interpreter.field963) {
						Interpreter.field951 = true;
					}

					while (Interpreter.field965.size() > 0) {
						class106 var41 = (class106)Interpreter.field965.remove(0);
						MouseHandler.widgetDefaultMenuAction(var41.method2375(), var41.method2360(), var41.method2367(), var41.method2363(), "");
					}

					if (Interpreter.field951) {
						class20.method288();
						Interpreter.field951 = false;
						Interpreter.field963 = false;
					}

					if (!var9 && var2 > 0 && var10 >= var2) {
						FriendsChat.RunException_sendStackTrace("Warning: Script " + var4.field1069 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
					}

					return;
				}

				if (Interpreter.field963) {
					Interpreter.field951 = true;
				}

				while (Interpreter.field965.size() > 0) {
					class106 var26 = (class106)Interpreter.field965.remove(0);
					MouseHandler.widgetDefaultMenuAction(var26.method2375(), var26.method2360(), var26.method2367(), var26.method2363(), "");
				}

				if (Interpreter.field951) {
					class20.method288();
					Interpreter.field951 = false;
					Interpreter.field963 = false;
				}

				if (!var9 && var2 > 0 && var10 >= var2) {
					FriendsChat.RunException_sendStackTrace("Warning: Script " + var4.field1069 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
				}

				return; // L: 429
			}

			if (Interpreter.field963) {
				Interpreter.field951 = true;
			}

			while (Interpreter.field965.size() > 0) {
				class106 var34 = (class106)Interpreter.field965.remove(0);
				MouseHandler.widgetDefaultMenuAction(var34.method2375(), var34.method2360(), var34.method2367(), var34.method2363(), ""); // L: 418
			}

			if (Interpreter.field951) {
				class20.method288();
				Interpreter.field951 = false;
				Interpreter.field963 = false;
			}

			if (!var9 && var2 > 0 && var10 >= var2) { // L: 425
				FriendsChat.RunException_sendStackTrace("Warning: Script " + var4.field1069 + " finished at op count " + var10 + " of max " + var1, (Throwable)null); // L: 426
			}

		}
	} // L: 125
}
