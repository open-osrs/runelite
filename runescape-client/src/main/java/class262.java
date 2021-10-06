import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jf")
public class class262 {
	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILbe;ZB)I",
		garbageValue = "49"
	)
	static int method5063(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) {
			var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type();
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) {
			var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) {
			var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) {
			var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) {
			var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) {
			var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice;
			return 1;
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) {
				var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) {
				var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) {
				var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) {
				var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0;
				return 1;
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) {
					var12 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1;
					if (class6.grandExchangeEvents != null) {
						class6.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) {
					var12 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1;
					if (class6.grandExchangeEvents != null) {
						class6.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) {
					AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
					var12 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize] == 1;
					boolean var11 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1] == 1;
					if (class6.grandExchangeEvents != null) {
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11;
						class6.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) {
					var12 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1;
					if (class6.grandExchangeEvents != null) {
						class6.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) {
					var12 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1;
					if (class6.grandExchangeEvents != null) {
						class6.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) {
					Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = class6.grandExchangeEvents == null ? 0 : class6.grandExchangeEvents.events.size();
					return 1;
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class6.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var4.world;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) {
						var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class6.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = var4.getOfferName();
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) {
						var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class6.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName();
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) {
						var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class6.grandExchangeEvents.events.get(var3);
						long var5 = UserComparator4.method2406() - class119.field1395 - var4.age;
						int var7 = (int)(var5 / 3600000L);
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L);
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L);
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
						Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = var10;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) {
						var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class6.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) {
						var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class6.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) {
						var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class6.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILbe;ZB)I",
		garbageValue = "-79"
	)
	static int method5062(int var0, Script var1, boolean var2) {
		if (var0 == 7100) {
			++AbstractByteArrayCopier.Interpreter_intStackSize;
			return 1;
		} else if (var0 == 7101) {
			class54.Interpreter_stringStackSize += 2;
			return 1;
		} else if (var0 != 7102 && var0 != 7103 && var0 != 7104 && var0 != 7105 && var0 != 7109) {
			if (var0 == 7106) {
				++AbstractByteArrayCopier.Interpreter_intStackSize;
				return 1;
			} else if (var0 == 7107) {
				++AbstractByteArrayCopier.Interpreter_intStackSize;
				return 1;
			} else if (var0 == 7108) {
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = class268.method5103() ? 1 : 0;
				return 1;
			} else if (var0 == 7110) {
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
				return 1;
			} else if (var0 == 7120) {
				--AbstractByteArrayCopier.Interpreter_intStackSize;
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
				return 1;
			} else if (var0 == 7121) {
				AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = -1;
				return 1;
			} else if (var0 == 7122) {
				AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
				return 1;
			} else {
				return 2;
			}
		} else {
			++AbstractByteArrayCopier.Interpreter_intStackSize;
			return 1;
		}
	}
}
