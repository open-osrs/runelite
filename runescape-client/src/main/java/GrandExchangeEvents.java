import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("f")
@Implements("GrandExchangeEvents")
public class GrandExchangeEvents {
	@ObfuscatedName("v")
	@Export("GrandExchangeEvents_ageComparator")
	public static Comparator GrandExchangeEvents_ageComparator;
	@ObfuscatedName("x")
	@Export("GrandExchangeEvents_priceComparator")
	public static Comparator GrandExchangeEvents_priceComparator;
	@ObfuscatedName("w")
	@Export("GrandExchangeEvents_nameComparator")
	public static Comparator GrandExchangeEvents_nameComparator;
	@ObfuscatedName("t")
	@Export("GrandExchangeEvents_quantityComparator")
	public static Comparator GrandExchangeEvents_quantityComparator;
	@ObfuscatedName("l")
	@Export("SpriteBuffer_pixels")
	public static byte[][] SpriteBuffer_pixels;
	@ObfuscatedName("h")
	@Export("events")
	public final List events;

	static {
		GrandExchangeEvents_ageComparator = new GrandExchangeOfferAgeComparator(); // L: 11
		new GrandExchangeOfferWorldComparator();
		GrandExchangeEvents_priceComparator = new GrandExchangeOfferUnitPriceComparator(); // L: 41
		GrandExchangeEvents_nameComparator = new GrandExchangeOfferNameComparator(); // L: 54
		GrandExchangeEvents_quantityComparator = new GrandExchangeOfferTotalQuantityComparator();
	} // L: 67

	@ObfuscatedSignature(
		descriptor = "(Lkj;Z)V",
		garbageValue = "1"
	)
	public GrandExchangeEvents(Buffer var1, boolean var2) {
		int var3 = var1.readUnsignedShort(); // L: 82
		boolean var4 = var1.readUnsignedByte() == 1; // L: 83
		byte var5;
		if (var4) { // L: 85
			var5 = 1;
		} else {
			var5 = 0; // L: 86
		}

		int var6 = var1.readUnsignedShort(); // L: 87
		this.events = new ArrayList(var6); // L: 88

		for (int var7 = 0; var7 < var6; ++var7) { // L: 89
			this.events.add(new GrandExchangeEvent(var1, var5, var3)); // L: 90
		}

	} // L: 92

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;ZI)V",
		garbageValue = "1883251258"
	)
	@Export("sort")
	public void sort(Comparator var1, boolean var2) {
		if (var2) { // L: 95
			Collections.sort(this.events, var1); // L: 96
		} else {
			Collections.sort(this.events, Collections.reverseOrder(var1)); // L: 99
		}

	} // L: 101

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Lcj;",
		garbageValue = "-114002754"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? World.World_worlds[++World.World_listCount - 1] : null; // L: 252 253
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZB)I",
		garbageValue = "8"
	)
	static int method146(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) { // L: 2327
			var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2328
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type(); // L: 2329
			return 1; // L: 2330
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) { // L: 2332
			var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2333
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id; // L: 2334
			return 1; // L: 2335
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) { // L: 2337
			var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2338
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice; // L: 2339
			return 1; // L: 2340
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) { // L: 2342
			var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2343
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity; // L: 2344
			return 1; // L: 2345
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) { // L: 2347
			var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2348
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity; // L: 2349
			return 1; // L: 2350
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) { // L: 2352
			var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2353
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice; // L: 2354
			return 1; // L: 2355
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) { // L: 2357
				var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2358
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2359
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0; // L: 2360
				return 1; // L: 2361
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) { // L: 2363
				var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2364
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2365
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0; // L: 2366
				return 1; // L: 2367
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) { // L: 2369
				var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2370
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2371
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0; // L: 2372
				return 1; // L: 2373
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) { // L: 2375
				var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2376
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2377
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0; // L: 2378
				return 1; // L: 2379
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) { // L: 2381
					var12 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 2382
					if (AbstractUserComparator.grandExchangeEvents != null) { // L: 2383
						AbstractUserComparator.grandExchangeEvents.sort(GrandExchangeEvents_nameComparator, var12); // L: 2384
					}

					return 1; // L: 2386
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) { // L: 2388
					var12 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 2389
					if (AbstractUserComparator.grandExchangeEvents != null) { // L: 2390
						AbstractUserComparator.grandExchangeEvents.sort(GrandExchangeEvents_priceComparator, var12); // L: 2391
					}

					return 1; // L: 2393
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) { // L: 2395
					VarcInt.Interpreter_intStackSize -= 2; // L: 2396
					var12 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize] == 1; // L: 2397
					boolean var11 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1] == 1; // L: 2398
					if (AbstractUserComparator.grandExchangeEvents != null) { // L: 2399
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11; // L: 2400
						AbstractUserComparator.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12); // L: 2401
					}

					return 1; // L: 2403
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) { // L: 2405
					var12 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 2406
					if (AbstractUserComparator.grandExchangeEvents != null) { // L: 2407
						AbstractUserComparator.grandExchangeEvents.sort(GrandExchangeEvents_ageComparator, var12); // L: 2408
					}

					return 1; // L: 2410
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) { // L: 2412
					var12 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 2413
					if (AbstractUserComparator.grandExchangeEvents != null) { // L: 2414
						AbstractUserComparator.grandExchangeEvents.sort(GrandExchangeEvents_quantityComparator, var12); // L: 2415
					}

					return 1; // L: 2417
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) { // L: 2419
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = AbstractUserComparator.grandExchangeEvents == null ? 0 : AbstractUserComparator.grandExchangeEvents.events.size(); // L: 2420
					return 1; // L: 2421
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) { // L: 2423
						var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2424
						var4 = (GrandExchangeEvent)AbstractUserComparator.grandExchangeEvents.events.get(var3); // L: 2425
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var4.world; // L: 2426
						return 1; // L: 2427
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) { // L: 2429
						var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2430
						var4 = (GrandExchangeEvent)AbstractUserComparator.grandExchangeEvents.events.get(var3); // L: 2431
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getOfferName(); // L: 2432
						return 1; // L: 2433
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) { // L: 2435
						var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2436
						var4 = (GrandExchangeEvent)AbstractUserComparator.grandExchangeEvents.events.get(var3); // L: 2437
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName(); // L: 2438
						return 1; // L: 2439
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) { // L: 2441
						var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2442
						var4 = (GrandExchangeEvent)AbstractUserComparator.grandExchangeEvents.events.get(var3); // L: 2443
						long var5 = class298.currentTimeMillis() - class4.field17 - var4.age; // L: 2444
						int var7 = (int)(var5 / 3600000L); // L: 2445
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L); // L: 2446
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L); // L: 2447
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10; // L: 2448
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var10; // L: 2449
						return 1; // L: 2450
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) { // L: 2452
						var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2453
						var4 = (GrandExchangeEvent)AbstractUserComparator.grandExchangeEvents.events.get(var3); // L: 2454
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity; // L: 2455
						return 1; // L: 2456
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) { // L: 2458
						var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2459
						var4 = (GrandExchangeEvent)AbstractUserComparator.grandExchangeEvents.events.get(var3); // L: 2460
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice; // L: 2461
						return 1; // L: 2462
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) { // L: 2464
						var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2465
						var4 = (GrandExchangeEvent)AbstractUserComparator.grandExchangeEvents.events.get(var3); // L: 2466
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id; // L: 2467
						return 1; // L: 2468
					} else {
						return 2; // L: 2470
					}
				}
			}
		}
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(Lcx;II)V",
		garbageValue = "-563338359"
	)
	static final void method144(Actor var0, int var1) {
		GrandExchangeOffer.worldToScreen(var0.x, var0.y, var1); // L: 5240
	} // L: 5241
}
