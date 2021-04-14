import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
@Implements("GrandExchangeEvent")
public class GrandExchangeEvent {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 115126989
	)
	@Export("world")
	public final int world;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = -3992330306822610567L
	)
	@Export("age")
	public final long age;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	@Export("grandExchangeOffer")
	public final GrandExchangeOffer grandExchangeOffer;
	@ObfuscatedName("p")
	@Export("offerName")
	String offerName;
	@ObfuscatedName("b")
	@Export("previousOfferName")
	String previousOfferName;

	@ObfuscatedSignature(
		descriptor = "(Lnu;BI)V"
	)
	GrandExchangeEvent(Buffer var1, byte var2, int var3) {
		this.offerName = var1.readStringCp1252NullTerminated(); // L: 111
		this.previousOfferName = var1.readStringCp1252NullTerminated(); // L: 112
		this.world = var1.readUnsignedShort(); // L: 113
		this.age = var1.readLong(); // L: 114
		int var4 = var1.readInt(); // L: 115
		int var5 = var1.readInt(); // L: 116
		this.grandExchangeOffer = new GrandExchangeOffer(); // L: 117
		this.grandExchangeOffer.method4631(2); // L: 118
		this.grandExchangeOffer.method4632(var2); // L: 119
		this.grandExchangeOffer.unitPrice = var4; // L: 120
		this.grandExchangeOffer.totalQuantity = var5; // L: 121
		this.grandExchangeOffer.currentQuantity = 0; // L: 122
		this.grandExchangeOffer.currentPrice = 0; // L: 123
		this.grandExchangeOffer.id = var3; // L: 124
	} // L: 125

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "5"
	)
	@Export("getOfferName")
	public String getOfferName() {
		return this.offerName; // L: 128
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "6"
	)
	@Export("getPreviousOfferName")
	public String getPreviousOfferName() {
		return this.previousOfferName; // L: 132
	}

	@ObfuscatedName("f")
	@Export("sleepExact")
	public static final void sleepExact(long var0) {
		if (var0 > 0L) { // L: 9
			if (var0 % 10L == 0L) { // L: 10
				long var2 = var0 - 1L; // L: 11

				try {
					Thread.sleep(var2); // L: 14
				} catch (InterruptedException var8) { // L: 16
				}

				try {
					Thread.sleep(1L); // L: 20
				} catch (InterruptedException var7) { // L: 22
				}
			} else {
				try {
					Thread.sleep(var0); // L: 27
				} catch (InterruptedException var6) { // L: 29
				}
			}

		}
	} // L: 31

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1321413959"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0; // L: 49
		if (var0 < 0 || var0 >= 65536) { // L: 50
			var0 >>>= 16; // L: 51
			var1 += 16; // L: 52
		}

		if (var0 >= 256) { // L: 54
			var0 >>>= 8; // L: 55
			var1 += 8; // L: 56
		}

		if (var0 >= 16) { // L: 58
			var0 >>>= 4; // L: 59
			var1 += 4; // L: 60
		}

		if (var0 >= 4) { // L: 62
			var0 >>>= 2; // L: 63
			var1 += 2; // L: 64
		}

		if (var0 >= 1) { // L: 66
			var0 >>>= 1; // L: 67
			++var1; // L: 68
		}

		return var0 + var1; // L: 70
	}
}
