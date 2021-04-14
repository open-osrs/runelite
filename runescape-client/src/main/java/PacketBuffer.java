import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("nk")
@Implements("PacketBuffer")
public class PacketBuffer extends Buffer {
	@ObfuscatedName("o")
	static final int[] field4149;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("isaacCipher")
	IsaacCipher isaacCipher;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1837417315
	)
	@Export("bitIndex")
	int bitIndex;

	static {
		field4149 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1}; // L: 7
	}

	public PacketBuffer(int var1) {
		super(var1);
	} // L: 12

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([IB)V",
		garbageValue = "87"
	)
	@Export("newIsaacCipher")
	public void newIsaacCipher(int[] var1) {
		this.isaacCipher = new IsaacCipher(var1); // L: 15
	} // L: 16

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Loy;B)V",
		garbageValue = "1"
	)
	@Export("setIsaacCipher")
	public void setIsaacCipher(IsaacCipher var1) {
		this.isaacCipher = var1; // L: 19
	} // L: 20

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "2"
	)
	@Export("writeByteIsaac")
	public void writeByteIsaac(int var1) {
		super.array[++super.offset - 1] = (byte)(var1 + this.isaacCipher.nextInt()); // L: 23
	} // L: 24

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "94"
	)
	@Export("readByteIsaac")
	public int readByteIsaac() {
		return super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255; // L: 27
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-689040710"
	)
	public boolean method6529() {
		int var1 = super.array[super.offset] - this.isaacCipher.method7100() & 255; // L: 31
		return var1 >= 128; // L: 32
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-114"
	)
	@Export("readSmartByteShortIsaac")
	public int readSmartByteShortIsaac() {
		int var1 = super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255; // L: 37
		return var1 < 128 ? var1 : (var1 - 128 << 8) + (super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255); // L: 38 39
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "990689178"
	)
	public void method6530(byte[] var1, int var2, int var3) {
		for (int var4 = 0; var4 < var3; ++var4) { // L: 43
			var1[var4 + var2] = (byte)(super.array[++super.offset - 1] - this.isaacCipher.nextInt());
		}

	} // L: 44

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1082258734"
	)
	@Export("importIndex")
	public void importIndex() {
		this.bitIndex = super.offset * 8; // L: 47
	} // L: 48

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1718914740"
	)
	@Export("readBits")
	public int readBits(int var1) {
		int var2 = this.bitIndex >> 3; // L: 51
		int var3 = 8 - (this.bitIndex & 7); // L: 52
		int var4 = 0; // L: 53

		for (this.bitIndex += var1; var1 > var3; var3 = 8) { // L: 54 55 58
			var4 += (super.array[var2++] & field4149[var3]) << var1 - var3; // L: 56
			var1 -= var3; // L: 57
		}

		if (var3 == var1) { // L: 60
			var4 += super.array[var2] & field4149[var3];
		} else {
			var4 += super.array[var2] >> var3 - var1 & field4149[var1]; // L: 61
		}

		return var4; // L: 62
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1142217359"
	)
	@Export("exportIndex")
	public void exportIndex() {
		super.offset = (this.bitIndex + 7) / 8; // L: 66
	} // L: 67

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1244745268"
	)
	@Export("bitsRemaining")
	public int bitsRemaining(int var1) {
		return var1 * 8 - this.bitIndex; // L: 70
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Let;",
		garbageValue = "-1779924577"
	)
	public static Clock method6523() {
		try {
			return new NanoClock(); // L: 8
		} catch (Throwable var1) { // L: 10
			return new MilliClock(); // L: 11
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILcc;ZI)I",
		garbageValue = "1312881118"
	)
	static int method6559(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) { // L: 2603
			var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2604
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type(); // L: 2605
			return 1; // L: 2606
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) { // L: 2608
			var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2609
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id; // L: 2610
			return 1; // L: 2611
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) { // L: 2613
			var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2614
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice; // L: 2615
			return 1; // L: 2616
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) { // L: 2618
			var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2619
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity; // L: 2620
			return 1; // L: 2621
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) { // L: 2623
			var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2624
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity; // L: 2625
			return 1; // L: 2626
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) { // L: 2628
			var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2629
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice; // L: 2630
			return 1; // L: 2631
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) { // L: 2633
				var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2634
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2635
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0; // L: 2636
				return 1; // L: 2637
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) { // L: 2639
				var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2640
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2641
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0; // L: 2642
				return 1; // L: 2643
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) { // L: 2645
				var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2646
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2647
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0; // L: 2648
				return 1; // L: 2649
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) { // L: 2651
				var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2652
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2653
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0; // L: 2654
				return 1; // L: 2655
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) { // L: 2657
					var12 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 2658
					if (Calendar.grandExchangeEvents != null) { // L: 2659
						Calendar.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12); // L: 2660
					}

					return 1; // L: 2662
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) { // L: 2664
					var12 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 2665
					if (Calendar.grandExchangeEvents != null) { // L: 2666
						Calendar.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12); // L: 2667
					}

					return 1; // L: 2669
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) { // L: 2671
					class16.Interpreter_intStackSize -= 2; // L: 2672
					var12 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize] == 1; // L: 2673
					boolean var11 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1] == 1; // L: 2674
					if (Calendar.grandExchangeEvents != null) { // L: 2675
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11; // L: 2676
						Calendar.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12); // L: 2677
					}

					return 1; // L: 2679
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) { // L: 2681
					var12 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 2682
					if (Calendar.grandExchangeEvents != null) { // L: 2683
						Calendar.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12); // L: 2684
					}

					return 1; // L: 2686
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) { // L: 2688
					var12 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 2689
					if (Calendar.grandExchangeEvents != null) { // L: 2690
						Calendar.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12); // L: 2691
					}

					return 1; // L: 2693
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) { // L: 2695
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Calendar.grandExchangeEvents == null ? 0 : Calendar.grandExchangeEvents.events.size(); // L: 2696
					return 1; // L: 2697
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) { // L: 2699
						var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2700
						var4 = (GrandExchangeEvent)Calendar.grandExchangeEvents.events.get(var3); // L: 2701
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var4.world; // L: 2702
						return 1; // L: 2703
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) { // L: 2705
						var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2706
						var4 = (GrandExchangeEvent)Calendar.grandExchangeEvents.events.get(var3); // L: 2707
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getOfferName(); // L: 2708
						return 1; // L: 2709
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) { // L: 2711
						var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2712
						var4 = (GrandExchangeEvent)Calendar.grandExchangeEvents.events.get(var3); // L: 2713
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName(); // L: 2714
						return 1; // L: 2715
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) { // L: 2717
						var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2718
						var4 = (GrandExchangeEvent)Calendar.grandExchangeEvents.events.get(var3); // L: 2719
						long var5 = ObjectSound.currentTimeMillis() - HealthBarUpdate.field1272 - var4.age; // L: 2720
						int var7 = (int)(var5 / 3600000L); // L: 2721
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L); // L: 2722
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L); // L: 2723
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10; // L: 2724
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var10; // L: 2725
						return 1; // L: 2726
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) { // L: 2728
						var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2729
						var4 = (GrandExchangeEvent)Calendar.grandExchangeEvents.events.get(var3); // L: 2730
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity; // L: 2731
						return 1; // L: 2732
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) { // L: 2734
						var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2735
						var4 = (GrandExchangeEvent)Calendar.grandExchangeEvents.events.get(var3); // L: 2736
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice; // L: 2737
						return 1; // L: 2738
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) { // L: 2740
						var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2741
						var4 = (GrandExchangeEvent)Calendar.grandExchangeEvents.events.get(var3); // L: 2742
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id; // L: 2743
						return 1; // L: 2744
					} else {
						return 2; // L: 2746
					}
				}
			}
		}
	}
}
