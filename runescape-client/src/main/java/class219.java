import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hh")
public class class219 {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	@Export("huffman")
	public static Huffman huffman;

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILcl;ZI)I",
		garbageValue = "-1015901506"
	)
	static int method4173(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) { // L: 2341
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2342
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type(); // L: 2343
			return 1; // L: 2344
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) { // L: 2346
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2347
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id; // L: 2348
			return 1; // L: 2349
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) { // L: 2351
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2352
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice; // L: 2353
			return 1; // L: 2354
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) { // L: 2356
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2357
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity; // L: 2358
			return 1; // L: 2359
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) { // L: 2361
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2362
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity; // L: 2363
			return 1; // L: 2364
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) { // L: 2366
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2367
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice; // L: 2368
			return 1; // L: 2369
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) { // L: 2371
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2372
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2373
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0; // L: 2374
				return 1; // L: 2375
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) { // L: 2377
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2378
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2379
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0; // L: 2380
				return 1; // L: 2381
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) { // L: 2383
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2384
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2385
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0; // L: 2386
				return 1; // L: 2387
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) { // L: 2389
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2390
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2391
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0; // L: 2392
				return 1; // L: 2393
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) { // L: 2395
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2396
					if (WorldMapSectionType.grandExchangeEvents != null) { // L: 2397
						WorldMapSectionType.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12); // L: 2398
					}

					return 1; // L: 2400
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) { // L: 2402
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2403
					if (WorldMapSectionType.grandExchangeEvents != null) { // L: 2404
						WorldMapSectionType.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12); // L: 2405
					}

					return 1; // L: 2407
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) { // L: 2409
					Interpreter.Interpreter_intStackSize -= 2; // L: 2410
					var12 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] == 1; // L: 2411
					boolean var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 2412
					if (WorldMapSectionType.grandExchangeEvents != null) { // L: 2413
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11; // L: 2414
						WorldMapSectionType.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12); // L: 2415
					}

					return 1; // L: 2417
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) { // L: 2419
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2420
					if (WorldMapSectionType.grandExchangeEvents != null) { // L: 2421
						WorldMapSectionType.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12); // L: 2422
					}

					return 1; // L: 2424
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) { // L: 2426
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2427
					if (WorldMapSectionType.grandExchangeEvents != null) { // L: 2428
						WorldMapSectionType.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12); // L: 2429
					}

					return 1; // L: 2431
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) { // L: 2433
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSectionType.grandExchangeEvents == null ? 0 : WorldMapSectionType.grandExchangeEvents.events.size(); // L: 2434
					return 1; // L: 2435
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) { // L: 2437
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2438
						var4 = (GrandExchangeEvent)WorldMapSectionType.grandExchangeEvents.events.get(var3); // L: 2439
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.world; // L: 2440
						return 1; // L: 2441
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) { // L: 2443
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2444
						var4 = (GrandExchangeEvent)WorldMapSectionType.grandExchangeEvents.events.get(var3); // L: 2445
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getOfferName(); // L: 2446
						return 1; // L: 2447
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) { // L: 2449
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2450
						var4 = (GrandExchangeEvent)WorldMapSectionType.grandExchangeEvents.events.get(var3); // L: 2451
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName(); // L: 2452
						return 1; // L: 2453
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) { // L: 2455
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2456
						var4 = (GrandExchangeEvent)WorldMapSectionType.grandExchangeEvents.events.get(var3); // L: 2457
						long var5 = Tiles.currentTimeMillis() - class9.field57 - var4.age; // L: 2458
						int var7 = (int)(var5 / 3600000L); // L: 2459
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L); // L: 2460
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L); // L: 2461
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10; // L: 2462
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var10; // L: 2463
						return 1; // L: 2464
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) { // L: 2466
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2467
						var4 = (GrandExchangeEvent)WorldMapSectionType.grandExchangeEvents.events.get(var3); // L: 2468
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity; // L: 2469
						return 1; // L: 2470
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) { // L: 2472
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2473
						var4 = (GrandExchangeEvent)WorldMapSectionType.grandExchangeEvents.events.get(var3); // L: 2474
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice; // L: 2475
						return 1; // L: 2476
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) { // L: 2478
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2479
						var4 = (GrandExchangeEvent)WorldMapSectionType.grandExchangeEvents.events.get(var3); // L: 2480
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id; // L: 2481
						return 1; // L: 2482
					} else {
						return 2; // L: 2484
					}
				}
			}
		}
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "74818443"
	)
	static void method4171() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) { // L: 11000
			int var1 = var0.group; // L: 11001
			if (WorldMapCacheName.loadInterface(var1)) { // L: 11002
				boolean var2 = true; // L: 11003
				Widget[] var3 = DefaultsGroup.Widget_interfaceComponents[var1]; // L: 11004

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) { // L: 11005
					if (var3[var4] != null) { // L: 11006
						var2 = var3[var4].isIf3; // L: 11007
						break;
					}
				}

				if (!var2) { // L: 11011
					var4 = (int)var0.key; // L: 11012
					Widget var5 = class237.getWidget(var4); // L: 11013
					if (var5 != null) { // L: 11014
						IsaacCipher.invalidateWidget(var5);
					}
				}
			}
		}

	} // L: 11018

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lbs;",
		garbageValue = "-1314120201"
	)
	static final InterfaceParent method4172(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent(); // L: 11230
		var3.group = var1; // L: 11231
		var3.type = var2; // L: 11232
		Client.interfaceParents.put(var3, (long)var0); // L: 11233
		GrandExchangeEvent.Widget_resetModelFrames(var1); // L: 11234
		Widget var4 = class237.getWidget(var0); // L: 11235
		IsaacCipher.invalidateWidget(var4); // L: 11236
		if (Client.meslayerContinueWidget != null) { // L: 11237
			IsaacCipher.invalidateWidget(Client.meslayerContinueWidget); // L: 11238
			Client.meslayerContinueWidget = null; // L: 11239
		}

		AbstractWorldMapData.method352(); // L: 11241
		class182.revalidateWidgetScroll(DefaultsGroup.Widget_interfaceComponents[var0 >> 16], var4, false); // L: 11242
		SoundSystem.runWidgetOnLoadListener(var1); // L: 11243
		if (Client.rootInterface != -1) { // L: 11244
			class228.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3; // L: 11245
	}
}
