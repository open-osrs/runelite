import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("lp")
@Implements("Language")
public class Language implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "[Llp;"
	)
	@Export("Language_valuesOrdered")
	public static final Language[] Language_valuesOrdered;
	@ObfuscatedName("ib")
	@ObfuscatedGetter(
		intValue = 1235623999
	)
	@Export("cameraPitch")
	static int cameraPitch;
	@ObfuscatedName("f")
	final String field4062;
	@ObfuscatedName("u")
	@Export("language")
	final String language;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1267463723
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field4073, 0, "GB"); // L: 12
		Language_DE = new Language("DE", "de", "German", ModeWhere.field4073, 1, "DE"); // L: 13
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field4073, 2, "FR"); // L: 14
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field4073, 3, "BR"); // L: 15
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field4075, 4, "NL"); // L: 16
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field4075, 5, "ES");
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field4073, 6, "MX"); // L: 18
		Language[] var0 = method6118(); // L: 25
		Language_valuesOrdered = new Language[var0.length];
		Language[] var1 = var0; // L: 28

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 29
			Language var3 = var1[var2]; // L: 30
			if (Language_valuesOrdered[var3.id] != null) { // L: 32
				throw new IllegalStateException(); // L: 33
			}

			Language_valuesOrdered[var3.id] = var3; // L: 35
		}

	} // L: 39

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llj;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field4062 = var1; // L: 46
		this.language = var2; // L: 47
		this.id = var5; // L: 48
		if (var6 != null) { // L: 49
			new Locale(var2.substring(0, 2), var6); // L: 50
		} else {
			new Locale(var2.substring(0, 2)); // L: 53
		}

	} // L: 55

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "15"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 63
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "940593481"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language; // L: 58
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH); // L: 68
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "2038855833"
	)
	static boolean method6135(int var0, int var1) {
		return var0 != 4 || var1 < 8; // L: 26
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)[Llp;",
		garbageValue = "3"
	)
	static Language[] method6118() {
		return new Language[]{Language_DE, Language_ES_MX, Language_EN, Language_FR, Language_ES, Language_PT, Language_NL}; // L: 42
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)[Lji;",
		garbageValue = "42"
	)
	public static class263[] method6134() {
		return new class263[]{class263.field3010, class263.field3004, class263.field3005, class263.field3006, class263.field3007, class263.field3008, class263.field3009, class263.field3013, class263.field3011, class263.field3012}; // L: 17
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-118"
	)
	static void method6136(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 72
		if (var1 != null) {
			var1.remove(); // L: 74
		}
	} // L: 75

	@ObfuscatedName("d")
	static boolean method6131(long var0) {
		return (int)(var0 >>> 16 & 1L) == 1; // L: 73
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "125"
	)
	static final int method6137(int var0, int var1) {
		int var2 = AbstractSocket.method6884(var0 - 1, var1 - 1) + AbstractSocket.method6884(var0 + 1, var1 - 1) + AbstractSocket.method6884(var0 - 1, var1 + 1) + AbstractSocket.method6884(var0 + 1, var1 + 1); // L: 999
		int var3 = AbstractSocket.method6884(var0 - 1, var1) + AbstractSocket.method6884(1 + var0, var1) + AbstractSocket.method6884(var0, var1 - 1) + AbstractSocket.method6884(var0, 1 + var1); // L: 1000
		int var4 = AbstractSocket.method6884(var0, var1); // L: 1001
		return var2 / 16 + var3 / 8 + var4 / 4; // L: 1002
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILbo;ZI)I",
		garbageValue = "-1522906497"
	)
	static int method6125(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) { // L: 2892
			var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 2893
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type(); // L: 2894
			return 1; // L: 2895
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) { // L: 2897
			var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 2898
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id; // L: 2899
			return 1; // L: 2900
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) { // L: 2902
			var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 2903
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice; // L: 2904
			return 1; // L: 2905
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) { // L: 2907
			var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 2908
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity; // L: 2909
			return 1; // L: 2910
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) { // L: 2912
			var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 2913
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity; // L: 2914
			return 1; // L: 2915
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) { // L: 2917
			var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 2918
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice; // L: 2919
			return 1; // L: 2920
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) { // L: 2922
				var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 2923
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2924
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0; // L: 2925
				return 1; // L: 2926
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) { // L: 2928
				var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 2929
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2930
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0; // L: 2931
				return 1; // L: 2932
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) { // L: 2934
				var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 2935
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2936
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0; // L: 2937
				return 1; // L: 2938
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) { // L: 2940
				var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 2941
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2942
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0; // L: 2943
				return 1; // L: 2944
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) { // L: 2946
					var12 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1; // L: 2947
					if (ReflectionCheck.grandExchangeEvents != null) { // L: 2948
						ReflectionCheck.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12); // L: 2949
					}

					return 1; // L: 2951
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) { // L: 2953
					var12 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1; // L: 2954
					if (ReflectionCheck.grandExchangeEvents != null) { // L: 2955
						ReflectionCheck.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12); // L: 2956
					}

					return 1; // L: 2958
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) { // L: 2960
					class295.Interpreter_intStackSize -= 2; // L: 2961
					var12 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize] == 1; // L: 2962
					boolean var11 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1] == 1; // L: 2963
					if (ReflectionCheck.grandExchangeEvents != null) { // L: 2964
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11; // L: 2965
						ReflectionCheck.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12); // L: 2966
					}

					return 1; // L: 2968
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) { // L: 2970
					var12 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1; // L: 2971
					if (ReflectionCheck.grandExchangeEvents != null) { // L: 2972
						ReflectionCheck.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12); // L: 2973
					}

					return 1; // L: 2975
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) { // L: 2977
					var12 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1; // L: 2978
					if (ReflectionCheck.grandExchangeEvents != null) { // L: 2979
						ReflectionCheck.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12); // L: 2980
					}

					return 1; // L: 2982
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) { // L: 2984
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = ReflectionCheck.grandExchangeEvents == null ? 0 : ReflectionCheck.grandExchangeEvents.events.size(); // L: 2985
					return 1; // L: 2986
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) { // L: 2988
						var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 2989
						var4 = (GrandExchangeEvent)ReflectionCheck.grandExchangeEvents.events.get(var3); // L: 2990
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var4.world; // L: 2991
						return 1; // L: 2992
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) { // L: 2994
						var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 2995
						var4 = (GrandExchangeEvent)ReflectionCheck.grandExchangeEvents.events.get(var3); // L: 2996
						Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var4.getOfferName(); // L: 2997
						return 1; // L: 2998
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) { // L: 3000
						var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 3001
						var4 = (GrandExchangeEvent)ReflectionCheck.grandExchangeEvents.events.get(var3); // L: 3002
						Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName(); // L: 3003
						return 1; // L: 3004
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) { // L: 3006
						var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 3007
						var4 = (GrandExchangeEvent)ReflectionCheck.grandExchangeEvents.events.get(var3); // L: 3008
						long var5 = WorldMapSprite.method4989() - Varps.field3287 - var4.age; // L: 3009
						int var7 = (int)(var5 / 3600000L); // L: 3010
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L); // L: 3011
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L); // L: 3012
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10; // L: 3013
						Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var10; // L: 3014
						return 1; // L: 3015
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) { // L: 3017
						var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 3018
						var4 = (GrandExchangeEvent)ReflectionCheck.grandExchangeEvents.events.get(var3); // L: 3019
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity; // L: 3020
						return 1; // L: 3021
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) { // L: 3023
						var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 3024
						var4 = (GrandExchangeEvent)ReflectionCheck.grandExchangeEvents.events.get(var3); // L: 3025
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice; // L: 3026
						return 1; // L: 3027
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) { // L: 3029
						var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 3030
						var4 = (GrandExchangeEvent)ReflectionCheck.grandExchangeEvents.events.get(var3); // L: 3031
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id; // L: 3032
						return 1; // L: 3033
					} else {
						return 2; // L: 3035
					}
				}
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILbo;ZI)I",
		garbageValue = "303370492"
	)
	static int method6121(int var0, Script var1, boolean var2) {
		if (var0 != 6700 && var0 != 6702 && var0 != 6704 && var0 != 6706 && var0 != 6708) { // L: 4484
			if (var0 != 6701 && var0 != 6703 && var0 != 6705 && var0 != 6707 && var0 != 6709) { // L: 4489
				if (var0 == 6750) { // L: 4493
					Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = ""; // L: 4494
					return 1; // L: 4495
				} else if (var0 != 6751 && var0 != 6752 && var0 != 6753) { // L: 4497
					if (var0 == 6754) { // L: 4501
						int var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 4502
						NPCComposition var4 = class9.getNpcDefinition(var3); // L: 4503
						Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : ""; // L: 4504
						return 1; // L: 4505
					} else {
						return 2; // L: 4507
					}
				} else {
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = -1; // L: 4498
					return 1; // L: 4499
				}
			} else {
				--class295.Interpreter_intStackSize; // L: 4490
				return 1; // L: 4491
			}
		} else {
			class295.Interpreter_intStackSize -= 2; // L: 4485
			--ChatChannel.Interpreter_stringStackSize; // L: 4486
			return 1; // L: 4487
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILbo;ZI)I",
		garbageValue = "-525559357"
	)
	static int method6132(int var0, Script var1, boolean var2) {
		if (var0 == 6900) { // L: 4535
			Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = ""; // L: 4536
			return 1; // L: 4537
		} else if (var0 == 6950) { // L: 4539
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = -1; // L: 4540
			return 1; // L: 4541
		} else {
			return 2; // L: 4543
		}
	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "-1490020023"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) { // L: 4213
			var2 = 1;
		}

		if (var3 < 1) { // L: 4214
			var3 = 1;
		}

		int var5 = var3 - 334; // L: 4215
		int var6;
		if (var5 < 0) { // L: 4217
			var6 = Client.field745;
		} else if (var5 >= 100) { // L: 4218
			var6 = Client.field706;
		} else {
			var6 = (Client.field706 - Client.field745) * var5 / 100 + Client.field745; // L: 4219
		}

		int var7 = var3 * var6 * 512 / (var2 * 334); // L: 4220
		int var8;
		int var9;
		short var17;
		if (var7 < Client.field751) { // L: 4221
			var17 = Client.field751; // L: 4222
			var6 = var17 * var2 * 334 / (var3 * 512); // L: 4223
			if (var6 > Client.field750) { // L: 4224
				var6 = Client.field750; // L: 4225
				var8 = var3 * var6 * 512 / (var17 * 334); // L: 4226
				var9 = (var2 - var8) / 2; // L: 4227
				if (var4) { // L: 4228
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4229
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216); // L: 4230
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216); // L: 4231
				}

				var0 += var9; // L: 4233
				var2 -= var9 * 2; // L: 4234
			}
		} else if (var7 > Client.field752) { // L: 4237
			var17 = Client.field752; // L: 4238
			var6 = var17 * var2 * 334 / (var3 * 512); // L: 4239
			if (var6 < Client.field562) { // L: 4240
				var6 = Client.field562; // L: 4241
				var8 = var17 * var2 * 334 / (var6 * 512); // L: 4242
				var9 = (var3 - var8) / 2; // L: 4243
				if (var4) { // L: 4244
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4245
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216); // L: 4246
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216); // L: 4247
				}

				var1 += var9; // L: 4249
				var3 -= var9 * 2; // L: 4250
			}
		}

		Client.viewportZoom = var3 * var6 / 334; // L: 4253
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) { // L: 4254
			int[] var16 = new int[9]; // L: 4256

			for (var9 = 0; var9 < var16.length; ++var9) { // L: 4257
				int var10 = var9 * 32 + 15 + 128; // L: 4258
				int var11 = DevicePcmPlayerProvider.method385(var10); // L: 4259
				int var12 = Rasterizer3D.Rasterizer3D_sine[var10]; // L: 4260
				int var14 = var3 - 334; // L: 4263
				if (var14 < 0) { // L: 4264
					var14 = 0;
				} else if (var14 > 100) { // L: 4265
					var14 = 100;
				}

				int var15 = (Client.zoomWidth - Client.zoomHeight) * var14 / 100 + Client.zoomHeight; // L: 4266
				int var13 = var15 * var11 / 256; // L: 4267
				var16[var9] = var13 * var12 >> 16; // L: 4270
			}

			Scene.Scene_buildVisiblityMap(var16, 500, 800, var2 * 334 / var3, 334); // L: 4272
		}

		Client.viewportOffsetX = var0; // L: 4275
		Client.viewportOffsetY = var1; // L: 4276
		Client.viewportWidth = var2; // L: 4277
		Client.viewportHeight = var3; // L: 4278
	} // L: 4279
}
