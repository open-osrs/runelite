import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jz")
@Implements("GrandExchangeEvent")
public class GrandExchangeEvent {
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("options_buttons_2Sprite")
	static IndexedSprite options_buttons_2Sprite;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1061538211
	)
	@Export("world")
	public final int world;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = -779308497234252569L
	)
	@Export("age")
	public final long age;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("grandExchangeOffer")
	public final GrandExchangeOffer grandExchangeOffer;
	@ObfuscatedName("g")
	@Export("offerName")
	String offerName;
	@ObfuscatedName("l")
	@Export("previousOfferName")
	String previousOfferName;

	@ObfuscatedSignature(
		descriptor = "(Lnk;BI)V"
	)
	GrandExchangeEvent(Buffer var1, byte var2, int var3) {
		this.offerName = var1.readStringCp1252NullTerminated(); // L: 111
		this.previousOfferName = var1.readStringCp1252NullTerminated(); // L: 112
		this.world = var1.readUnsignedShort(); // L: 113
		this.age = var1.readLong(); // L: 114
		int var4 = var1.readInt(); // L: 115
		int var5 = var1.readInt(); // L: 116
		this.grandExchangeOffer = new GrandExchangeOffer(); // L: 117
		this.grandExchangeOffer.method5018(2); // L: 118
		this.grandExchangeOffer.method5019(var2); // L: 119
		this.grandExchangeOffer.unitPrice = var4; // L: 120
		this.grandExchangeOffer.totalQuantity = var5; // L: 121
		this.grandExchangeOffer.currentQuantity = 0; // L: 122
		this.grandExchangeOffer.currentPrice = 0; // L: 123
		this.grandExchangeOffer.id = var3; // L: 124
	} // L: 125

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "255"
	)
	@Export("getOfferName")
	public String getOfferName() {
		return this.offerName; // L: 128
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1435135839"
	)
	@Export("getPreviousOfferName")
	public String getPreviousOfferName() {
		return this.previousOfferName; // L: 132
	}
}
