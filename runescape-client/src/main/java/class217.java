import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hq")
public class class217 {
	@ObfuscatedName("b")
	@Export("localPlayerName")
	public static String localPlayerName;
	@ObfuscatedName("h")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;
	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("hoveredItemContainer")
	static Widget hoveredItemContainer;

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1671015223"
	)
	@Export("SpriteBuffer_decode")
	public static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 260
		var1.offset = var0.length - 2; // L: 261
		class336.SpriteBuffer_spriteCount = var1.readUnsignedShort(); // L: 262
		class336.SpriteBuffer_xOffsets = new int[class336.SpriteBuffer_spriteCount]; // L: 263
		class225.SpriteBuffer_yOffsets = new int[class336.SpriteBuffer_spriteCount]; // L: 264
		class336.SpriteBuffer_spriteWidths = new int[class336.SpriteBuffer_spriteCount]; // L: 265
		class336.SpriteBuffer_spriteHeights = new int[class336.SpriteBuffer_spriteCount]; // L: 266
		class13.SpriteBuffer_pixels = new byte[class336.SpriteBuffer_spriteCount][]; // L: 267
		var1.offset = var0.length - 7 - class336.SpriteBuffer_spriteCount * 8; // L: 268
		class336.SpriteBuffer_spriteWidth = var1.readUnsignedShort(); // L: 269
		class336.SpriteBuffer_spriteHeight = var1.readUnsignedShort(); // L: 270
		int var2 = (var1.readUnsignedByte() & 255) + 1; // L: 271

		int var3;
		for (var3 = 0; var3 < class336.SpriteBuffer_spriteCount; ++var3) { // L: 272
			class336.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class336.SpriteBuffer_spriteCount; ++var3) { // L: 273
			class225.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class336.SpriteBuffer_spriteCount; ++var3) { // L: 274
			class336.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class336.SpriteBuffer_spriteCount; ++var3) { // L: 275
			class336.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class336.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3; // L: 276
		WorldMapID.SpriteBuffer_spritePalette = new int[var2]; // L: 277

		for (var3 = 1; var3 < var2; ++var3) { // L: 278
			WorldMapID.SpriteBuffer_spritePalette[var3] = var1.readMedium(); // L: 279
			if (WorldMapID.SpriteBuffer_spritePalette[var3] == 0) { // L: 280
				WorldMapID.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0; // L: 282

		for (var3 = 0; var3 < class336.SpriteBuffer_spriteCount; ++var3) { // L: 283
			int var4 = class336.SpriteBuffer_spriteWidths[var3]; // L: 284
			int var5 = class336.SpriteBuffer_spriteHeights[var3]; // L: 285
			int var6 = var5 * var4; // L: 286
			byte[] var7 = new byte[var6]; // L: 287
			class13.SpriteBuffer_pixels[var3] = var7; // L: 288
			int var8 = var1.readUnsignedByte(); // L: 289
			int var9;
			if (var8 == 0) { // L: 290
				for (var9 = 0; var9 < var6; ++var9) { // L: 291
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) { // L: 293
				for (var9 = 0; var9 < var4; ++var9) { // L: 294
					for (int var10 = 0; var10 < var5; ++var10) { // L: 295
						var7[var9 + var10 * var4] = var1.readByte(); // L: 296
					}
				}
			}
		}

	} // L: 301

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1102921575"
	)
	static final void method4098(String var0) {
		StringBuilder var10000 = (new StringBuilder()).append(var0);
		Object var10001 = null;
		String var1 = var10000.append(" is already on your ignore list").toString(); // L: 188
		DevicePcmPlayerProvider.addGameMessage(30, "", var1); // L: 190
	} // L: 192

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILco;ZI)I",
		garbageValue = "1928769933"
	)
	static int method4099(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) { // L: 2269
			var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2270
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type(); // L: 2271
			return 1; // L: 2272
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) { // L: 2274
			var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2275
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id; // L: 2276
			return 1; // L: 2277
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) { // L: 2279
			var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2280
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice; // L: 2281
			return 1; // L: 2282
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) { // L: 2284
			var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2285
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity; // L: 2286
			return 1; // L: 2287
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) { // L: 2289
			var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2290
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity; // L: 2291
			return 1; // L: 2292
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) { // L: 2294
			var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2295
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice; // L: 2296
			return 1; // L: 2297
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) { // L: 2299
				var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2300
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2301
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0; // L: 2302
				return 1; // L: 2303
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) { // L: 2305
				var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2306
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2307
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0; // L: 2308
				return 1; // L: 2309
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) { // L: 2311
				var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2312
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2313
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0; // L: 2314
				return 1; // L: 2315
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) { // L: 2317
				var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2318
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2319
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0; // L: 2320
				return 1; // L: 2321
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) { // L: 2323
					var12 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 2324
					if (WorldMapDecoration.grandExchangeEvents != null) { // L: 2325
						WorldMapDecoration.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12); // L: 2326
					}

					return 1; // L: 2328
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) { // L: 2330
					var12 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 2331
					if (WorldMapDecoration.grandExchangeEvents != null) { // L: 2332
						WorldMapDecoration.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12); // L: 2333
					}

					return 1; // L: 2335
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) { // L: 2337
					MilliClock.Interpreter_intStackSize -= 2; // L: 2338
					var12 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize] == 1; // L: 2339
					boolean var11 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1] == 1; // L: 2340
					if (WorldMapDecoration.grandExchangeEvents != null) { // L: 2341
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11; // L: 2342
						WorldMapDecoration.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12); // L: 2343
					}

					return 1; // L: 2345
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) { // L: 2347
					var12 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 2348
					if (WorldMapDecoration.grandExchangeEvents != null) { // L: 2349
						WorldMapDecoration.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12); // L: 2350
					}

					return 1; // L: 2352
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) { // L: 2354
					var12 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 2355
					if (WorldMapDecoration.grandExchangeEvents != null) { // L: 2356
						WorldMapDecoration.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12); // L: 2357
					}

					return 1; // L: 2359
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) { // L: 2361
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = WorldMapDecoration.grandExchangeEvents == null ? 0 : WorldMapDecoration.grandExchangeEvents.events.size(); // L: 2362
					return 1; // L: 2363
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) { // L: 2365
						var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2366
						var4 = (GrandExchangeEvent)WorldMapDecoration.grandExchangeEvents.events.get(var3); // L: 2367
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var4.world; // L: 2368
						return 1; // L: 2369
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) { // L: 2371
						var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2372
						var4 = (GrandExchangeEvent)WorldMapDecoration.grandExchangeEvents.events.get(var3); // L: 2373
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var4.getOfferName(); // L: 2374
						return 1; // L: 2375
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) { // L: 2377
						var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2378
						var4 = (GrandExchangeEvent)WorldMapDecoration.grandExchangeEvents.events.get(var3); // L: 2379
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName(); // L: 2380
						return 1; // L: 2381
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) { // L: 2383
						var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2384
						var4 = (GrandExchangeEvent)WorldMapDecoration.grandExchangeEvents.events.get(var3); // L: 2385
						long var5 = User.currentTimeMillis() - class58.field444 - var4.age; // L: 2386
						int var7 = (int)(var5 / 3600000L); // L: 2387
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L); // L: 2388
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L); // L: 2389
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10; // L: 2390
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var10; // L: 2391
						return 1; // L: 2392
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) { // L: 2394
						var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2395
						var4 = (GrandExchangeEvent)WorldMapDecoration.grandExchangeEvents.events.get(var3); // L: 2396
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity; // L: 2397
						return 1; // L: 2398
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) { // L: 2400
						var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2401
						var4 = (GrandExchangeEvent)WorldMapDecoration.grandExchangeEvents.events.get(var3); // L: 2402
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice; // L: 2403
						return 1; // L: 2404
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) { // L: 2406
						var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2407
						var4 = (GrandExchangeEvent)WorldMapDecoration.grandExchangeEvents.events.get(var3); // L: 2408
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id; // L: 2409
						return 1; // L: 2410
					} else {
						return 2; // L: 2412
					}
				}
			}
		}
	}
}
