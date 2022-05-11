import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ln")
@Implements("GrandExchangeEvent")
public class GrandExchangeEvent {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1128323951
	)
	@Export("pcmSampleLength")
	public static int pcmSampleLength;
	@ObfuscatedName("ff")
	@ObfuscatedGetter(
		intValue = 1608944815
	)
	@Export("js5Port")
	static int js5Port;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1027306067
	)
	@Export("world")
	public final int world;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		longValue = -6905147980507584697L
	)
	@Export("age")
	public final long age;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("grandExchangeOffer")
	public final GrandExchangeOffer grandExchangeOffer;
	@ObfuscatedName("k")
	@Export("offerName")
	String offerName;
	@ObfuscatedName("a")
	@Export("previousOfferName")
	String previousOfferName;

	@ObfuscatedSignature(
		descriptor = "(Lpx;BI)V"
	)
	GrandExchangeEvent(Buffer var1, byte var2, int var3) {
		this.offerName = var1.readStringCp1252NullTerminated(); // L: 111
		this.previousOfferName = var1.readStringCp1252NullTerminated(); // L: 112
		this.world = var1.readUnsignedShort(); // L: 113
		this.age = var1.readLong(); // L: 114
		int var4 = var1.readInt(); // L: 115
		int var5 = var1.readInt(); // L: 116
		this.grandExchangeOffer = new GrandExchangeOffer(); // L: 117
		this.grandExchangeOffer.method5823(2); // L: 118
		this.grandExchangeOffer.method5826(var2); // L: 119
		this.grandExchangeOffer.unitPrice = var4; // L: 120
		this.grandExchangeOffer.totalQuantity = var5; // L: 121
		this.grandExchangeOffer.currentQuantity = 0; // L: 122
		this.grandExchangeOffer.currentPrice = 0; // L: 123
		this.grandExchangeOffer.id = var3; // L: 124
	} // L: 125

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "123"
	)
	@Export("getOfferName")
	public String getOfferName() {
		return this.offerName; // L: 128
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-744625642"
	)
	@Export("getPreviousOfferName")
	public String getPreviousOfferName() {
		return this.previousOfferName; // L: 132
	}
}
