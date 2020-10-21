import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("y")
@Implements("GrandExchangeEvent")
public class GrandExchangeEvent {
	@ObfuscatedName("nu")
	@ObfuscatedGetter(
		intValue = 1749191729
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;
	@ObfuscatedName("ev")
	static int[] field77;
	@ObfuscatedName("gp")
	@ObfuscatedGetter(
		intValue = -1761495631
	)
	static int field78;
	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("mousedOverWidgetIf1")
	static Widget mousedOverWidgetIf1;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1698153219
	)
	@Export("world")
	public final int world;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		longValue = -4139247955454884713L
	)
	@Export("age")
	public final long age;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lj;"
	)
	@Export("grandExchangeOffer")
	public final GrandExchangeOffer grandExchangeOffer;
	@ObfuscatedName("m")
	@Export("offerName")
	String offerName;
	@ObfuscatedName("z")
	@Export("previousOfferName")
	String previousOfferName;

	@ObfuscatedSignature(
		descriptor = "(Lkb;BI)V"
	)
	GrandExchangeEvent(Buffer var1, byte var2, int var3) {
		this.offerName = var1.readStringCp1252NullTerminated(); // L: 111
		this.previousOfferName = var1.readStringCp1252NullTerminated(); // L: 112
		this.world = var1.readUnsignedShort(); // L: 113
		this.age = var1.readLong(); // L: 114
		int var4 = var1.readInt(); // L: 115
		int var5 = var1.readInt(); // L: 116
		this.grandExchangeOffer = new GrandExchangeOffer(); // L: 117
		this.grandExchangeOffer.method189(2); // L: 118
		this.grandExchangeOffer.method206(var2); // L: 119
		this.grandExchangeOffer.unitPrice = var4; // L: 120
		this.grandExchangeOffer.totalQuantity = var5; // L: 121
		this.grandExchangeOffer.currentQuantity = 0; // L: 122
		this.grandExchangeOffer.currentPrice = 0; // L: 123
		this.grandExchangeOffer.id = var3; // L: 124
	} // L: 125

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "98"
	)
	@Export("getOfferName")
	public String getOfferName() {
		return this.offerName; // L: 128
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "209960511"
	)
	@Export("getPreviousOfferName")
	public String getPreviousOfferName() {
		return this.previousOfferName; // L: 132
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lks;I)V",
		garbageValue = "-2056491743"
	)
	static final void method172(PacketBuffer var0) {
		int var1 = 0; // L: 252
		var0.importIndex(); // L: 253

		byte[] var10000;
		int var2;
		int var4;
		int var5;
		for (var2 = 0; var2 < Players.Players_count; ++var2) { // L: 254
			var5 = Players.Players_indices[var2]; // L: 255
			if ((Players.field1282[var5] & 1) == 0) { // L: 256
				if (var1 > 0) { // L: 257
					--var1; // L: 258
					var10000 = Players.field1282; // L: 259
					var10000[var5] = (byte)(var10000[var5] | 2);
				} else {
					var4 = var0.readBits(1); // L: 262
					if (var4 == 0) { // L: 263
						var1 = Tiles.method1220(var0); // L: 264
						var10000 = Players.field1282; // L: 265
						var10000[var5] = (byte)(var10000[var5] | 2);
					} else {
						WorldMapData_1.readPlayerUpdate(var0, var5); // L: 268
					}
				}
			}
		}

		var0.exportIndex(); // L: 271
		if (var1 != 0) { // L: 272
			throw new RuntimeException(); // L: 273
		} else {
			var0.importIndex(); // L: 275

			for (var2 = 0; var2 < Players.Players_count; ++var2) { // L: 276
				var5 = Players.Players_indices[var2]; // L: 277
				if ((Players.field1282[var5] & 1) != 0) { // L: 278
					if (var1 > 0) { // L: 279
						--var1; // L: 280
						var10000 = Players.field1282; // L: 281
						var10000[var5] = (byte)(var10000[var5] | 2);
					} else {
						var4 = var0.readBits(1); // L: 284
						if (var4 == 0) { // L: 285
							var1 = Tiles.method1220(var0); // L: 286
							var10000 = Players.field1282; // L: 287
							var10000[var5] = (byte)(var10000[var5] | 2);
						} else {
							WorldMapData_1.readPlayerUpdate(var0, var5); // L: 290
						}
					}
				}
			}

			var0.exportIndex(); // L: 293
			if (var1 != 0) { // L: 294
				throw new RuntimeException(); // L: 295
			} else {
				var0.importIndex(); // L: 297

				for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) { // L: 298
					var5 = Players.Players_emptyIndices[var2]; // L: 299
					if ((Players.field1282[var5] & 1) != 0) { // L: 300
						if (var1 > 0) { // L: 301
							--var1; // L: 302
							var10000 = Players.field1282; // L: 303
							var10000[var5] = (byte)(var10000[var5] | 2);
						} else {
							var4 = var0.readBits(1); // L: 306
							if (var4 == 0) { // L: 307
								var1 = Tiles.method1220(var0); // L: 308
								var10000 = Players.field1282; // L: 309
								var10000[var5] = (byte)(var10000[var5] | 2);
							} else if (class9.updateExternalPlayer(var0, var5)) { // L: 312
								var10000 = Players.field1282;
								var10000[var5] = (byte)(var10000[var5] | 2);
							}
						}
					}
				}

				var0.exportIndex(); // L: 315
				if (var1 != 0) { // L: 316
					throw new RuntimeException(); // L: 317
				} else {
					var0.importIndex(); // L: 319

					for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) { // L: 320
						var5 = Players.Players_emptyIndices[var2]; // L: 321
						if ((Players.field1282[var5] & 1) == 0) { // L: 322
							if (var1 > 0) { // L: 323
								--var1; // L: 324
								var10000 = Players.field1282; // L: 325
								var10000[var5] = (byte)(var10000[var5] | 2);
							} else {
								var4 = var0.readBits(1); // L: 328
								if (var4 == 0) { // L: 329
									var1 = Tiles.method1220(var0); // L: 330
									var10000 = Players.field1282; // L: 331
									var10000[var5] = (byte)(var10000[var5] | 2);
								} else if (class9.updateExternalPlayer(var0, var5)) { // L: 334
									var10000 = Players.field1282;
									var10000[var5] = (byte)(var10000[var5] | 2);
								}
							}
						}
					}

					var0.exportIndex(); // L: 337
					if (var1 != 0) { // L: 338
						throw new RuntimeException(); // L: 339
					} else {
						Players.Players_count = 0; // L: 341
						Players.Players_emptyIdxCount = 0; // L: 342

						for (var2 = 1; var2 < 2048; ++var2) { // L: 343
							var10000 = Players.field1282; // L: 344
							var10000[var2] = (byte)(var10000[var2] >> 1);
							Player var3 = Client.players[var2]; // L: 345
							if (var3 != null) { // L: 346
								Players.Players_indices[++Players.Players_count - 1] = var2;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var2; // L: 347
							}
						}

					}
				}
			}
		}
	} // L: 349

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ILco;ZB)I",
		garbageValue = "-11"
	)
	static int method165(int var0, Script var1, boolean var2) {
		Widget var3 = UserComparator4.getWidget(Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]); // L: 1194
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) { // L: 1195
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1196
			return 1; // L: 1197
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) { // L: 1199
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1200
			return 1; // L: 1201
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) { // L: 1203
			Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var3.text; // L: 1204
			return 1; // L: 1205
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) { // L: 1207
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1208
			return 1; // L: 1209
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) { // L: 1211
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1212
			return 1; // L: 1213
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) { // L: 1215
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1216
			return 1; // L: 1217
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) { // L: 1219
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1220
			return 1; // L: 1221
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) { // L: 1223
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1224
			return 1; // L: 1225
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) { // L: 1227
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1228
			return 1; // L: 1229
		} else if (var0 == ScriptOpcodes.IF_GETTRANSTOP) { // L: 1231
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1232
			return 1; // L: 1233
		} else if (var0 == ScriptOpcodes.IF_GETTRANSBOT) { // L: 1235
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1236
			return 1; // L: 1237
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) { // L: 1239
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.color; // L: 1240
			return 1; // L: 1241
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) { // L: 1243
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.color2; // L: 1244
			return 1; // L: 1245
		} else if (var0 == ScriptOpcodes.IF_GETFILLMODE) { // L: 1247
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1248
			return 1; // L: 1249
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) { // L: 1251
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1252
			return 1; // L: 1253
		} else {
			return 2; // L: 1255
		}
	}
}
