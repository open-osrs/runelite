import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hv")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(1, (byte)0),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(3, (byte)1),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(2, (byte)2),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(0, (byte)3);

	@ObfuscatedName("s")
	public static short[] field2793;
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("archive9")
	static Archive archive9;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -2074450081
	)
	@Export("type")
	final int type;
	@ObfuscatedName("e")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3; // L: 21
		this.id = var4; // L: 22
	} // L: 23

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-100"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 27
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)[Lhv;",
		garbageValue = "0"
	)
	static WorldMapSectionType[] method4950() {
		return new WorldMapSectionType[]{WORLDMAPSECTIONTYPE1, WORLDMAPSECTIONTYPE2, WORLDMAPSECTIONTYPE3, WORLDMAPSECTIONTYPE0}; // L: 17
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILbi;ZI)I",
		garbageValue = "-803910111"
	)
	static int method4953(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) { // L: 2902
			var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2903
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type(); // L: 2904
			return 1; // L: 2905
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) { // L: 2907
			var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2908
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id; // L: 2909
			return 1; // L: 2910
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) { // L: 2912
			var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2913
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice; // L: 2914
			return 1; // L: 2915
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) { // L: 2917
			var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2918
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity; // L: 2919
			return 1; // L: 2920
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) { // L: 2922
			var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2923
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity; // L: 2924
			return 1; // L: 2925
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) { // L: 2927
			var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2928
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice; // L: 2929
			return 1; // L: 2930
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) { // L: 2932
				var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2933
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2934
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0; // L: 2935
				return 1; // L: 2936
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) { // L: 2938
				var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2939
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2940
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0; // L: 2941
				return 1; // L: 2942
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) { // L: 2944
				var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2945
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2946
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0; // L: 2947
				return 1; // L: 2948
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) { // L: 2950
				var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2951
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2952
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0; // L: 2953
				return 1; // L: 2954
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) { // L: 2956
					var12 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 2957
					if (class143.grandExchangeEvents != null) { // L: 2958
						class143.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12); // L: 2959
					}

					return 1; // L: 2961
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) { // L: 2963
					var12 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 2964
					if (class143.grandExchangeEvents != null) { // L: 2965
						class143.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12); // L: 2966
					}

					return 1; // L: 2968
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) { // L: 2970
					class446.Interpreter_intStackSize -= 2; // L: 2971
					var12 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize] == 1; // L: 2972
					boolean var11 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1] == 1; // L: 2973
					if (class143.grandExchangeEvents != null) { // L: 2974
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11; // L: 2975
						class143.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12); // L: 2976
					}

					return 1; // L: 2978
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) { // L: 2980
					var12 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 2981
					if (class143.grandExchangeEvents != null) { // L: 2982
						class143.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12); // L: 2983
					}

					return 1; // L: 2985
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) { // L: 2987
					var12 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 2988
					if (class143.grandExchangeEvents != null) { // L: 2989
						class143.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12); // L: 2990
					}

					return 1; // L: 2992
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) { // L: 2994
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = class143.grandExchangeEvents == null ? 0 : class143.grandExchangeEvents.events.size(); // L: 2995
					return 1; // L: 2996
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) { // L: 2998
						var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2999
						var4 = (GrandExchangeEvent)class143.grandExchangeEvents.events.get(var3); // L: 3000
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var4.world; // L: 3001
						return 1; // L: 3002
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) { // L: 3004
						var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 3005
						var4 = (GrandExchangeEvent)class143.grandExchangeEvents.events.get(var3); // L: 3006
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getOfferName(); // L: 3007
						return 1; // L: 3008
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) { // L: 3010
						var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 3011
						var4 = (GrandExchangeEvent)class143.grandExchangeEvents.events.get(var3); // L: 3012
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName(); // L: 3013
						return 1; // L: 3014
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) { // L: 3016
						var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 3017
						var4 = (GrandExchangeEvent)class143.grandExchangeEvents.events.get(var3); // L: 3018
						long var5 = class115.method2692() - class270.field3177 - var4.age; // L: 3019
						int var7 = (int)(var5 / 3600000L); // L: 3020
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L); // L: 3021
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L); // L: 3022
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10; // L: 3023
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var10; // L: 3024
						return 1; // L: 3025
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) { // L: 3027
						var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 3028
						var4 = (GrandExchangeEvent)class143.grandExchangeEvents.events.get(var3); // L: 3029
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity; // L: 3030
						return 1; // L: 3031
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) { // L: 3033
						var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 3034
						var4 = (GrandExchangeEvent)class143.grandExchangeEvents.events.get(var3); // L: 3035
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice; // L: 3036
						return 1; // L: 3037
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) { // L: 3039
						var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 3040
						var4 = (GrandExchangeEvent)class143.grandExchangeEvents.events.get(var3); // L: 3041
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id; // L: 3042
						return 1; // L: 3043
					} else {
						return 2; // L: 3045
					}
				}
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILbi;ZI)I",
		garbageValue = "1351074150"
	)
	static int method4948(int var0, Script var1, boolean var2) {
		if (var0 >= 7200 && var0 < 7204) { // L: 4649
			class446.Interpreter_intStackSize -= 5; // L: 4650
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1; // L: 4651
			return 1; // L: 4652
		} else if (var0 == 7204) { // L: 4654
			class446.Interpreter_intStackSize -= 6; // L: 4655
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1; // L: 4656
			return 1; // L: 4657
		} else if (var0 >= 7205 && var0 < 7209) { // L: 4659
			Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize - 1] = -1; // L: 4660
			return 1; // L: 4661
		} else if (var0 == 7209) { // L: 4663
			class446.Interpreter_intStackSize -= 2; // L: 4664
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1; // L: 4665
			return 1; // L: 4666
		} else if (var0 >= 7210 && var0 < 7214) { // L: 4668
			--class446.Interpreter_intStackSize; // L: 4669
			return 1; // L: 4670
		} else if (var0 == 7214) { // L: 4672
			class446.Interpreter_intStackSize -= 2; // L: 4673
			return 1; // L: 4674
		} else {
			return 2; // L: 4676
		}
	}
}
