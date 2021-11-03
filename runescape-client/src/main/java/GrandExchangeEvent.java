import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
@Implements("GrandExchangeEvent")
public class GrandExchangeEvent {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1932555191
	)
	@Export("world")
	public final int world;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		longValue = -3074264375035497163L
	)
	@Export("age")
	public final long age;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("grandExchangeOffer")
	public final GrandExchangeOffer grandExchangeOffer;
	@ObfuscatedName("a")
	@Export("offerName")
	String offerName;
	@ObfuscatedName("o")
	@Export("previousOfferName")
	String previousOfferName;

	@ObfuscatedSignature(
		descriptor = "(Lop;BI)V"
	)
	GrandExchangeEvent(Buffer var1, byte var2, int var3) {
		this.offerName = var1.readStringCp1252NullTerminated(); // L: 111
		this.previousOfferName = var1.readStringCp1252NullTerminated(); // L: 112
		this.world = var1.readUnsignedShort(); // L: 113
		this.age = var1.readLong(); // L: 114
		int var4 = var1.readInt(); // L: 115
		int var5 = var1.readInt(); // L: 116
		this.grandExchangeOffer = new GrandExchangeOffer(); // L: 117
		this.grandExchangeOffer.method5454(2); // L: 118
		this.grandExchangeOffer.method5455(var2);
		this.grandExchangeOffer.unitPrice = var4;
		this.grandExchangeOffer.totalQuantity = var5;
		this.grandExchangeOffer.currentQuantity = 0;
		this.grandExchangeOffer.currentPrice = 0;
		this.grandExchangeOffer.id = var3;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1492995549"
	)
	@Export("getOfferName")
	public String getOfferName() {
		return this.offerName;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-681990835"
	)
	@Export("getPreviousOfferName")
	public String getPreviousOfferName() {
		return this.previousOfferName;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIZI)Ljava/lang/String;",
		garbageValue = "1279033906"
	)
	static String method5448(int var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 119
			if (var2 && var0 >= 0) { // L: 120
				int var3 = 2; // L: 121

				for (int var4 = var0 / var1; var4 != 0; ++var3) { // L: 122 123 125
					var4 /= var1; // L: 124
				}

				char[] var5 = new char[var3]; // L: 127
				var5[0] = '+'; // L: 128

				for (int var6 = var3 - 1; var6 > 0; --var6) { // L: 129
					int var7 = var0; // L: 130
					var0 /= var1; // L: 131
					int var8 = var7 - var0 * var1; // L: 132
					if (var8 >= 10) { // L: 133
						var5[var6] = (char)(var8 + 87);
					} else {
						var5[var6] = (char)(var8 + 48); // L: 134
					}
				}

				return new String(var5); // L: 136
			} else {
				return Integer.toString(var0, var1);
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljf;I)Ljava/lang/String;",
		garbageValue = "-1477810111"
	)
	static String method5449(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) { // L: 10186
			for (int var2 = 1; var2 <= 5; ++var2) { // L: 10187
				while (true) {
					int var3 = var0.indexOf("%" + var2); // L: 10189
					if (var3 == -1) { // L: 10190
						break;
					}

					var0 = var0.substring(0, var3) + WorldMapLabelSize.method3534(class113.method2532(var1, var2 - 1)) + var0.substring(var3 + 2); // L: 10191
				}
			}
		}

		return var0; // L: 10195
	}
}
