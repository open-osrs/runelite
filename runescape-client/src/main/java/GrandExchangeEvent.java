import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("x")
@Implements("GrandExchangeEvent")
public class GrandExchangeEvent {
	@ObfuscatedName("gw")
	@ObfuscatedGetter(
		intValue = 646144783
	)
	static int field82;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -327146803
	)
	@Export("world")
	public final int world;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = 986642853943479863L
	)
	@Export("age")
	public final long age;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lg;"
	)
	@Export("grandExchangeOffer")
	public final GrandExchangeOffer grandExchangeOffer;
	@ObfuscatedName("c")
	@Export("offerName")
	String offerName;
	@ObfuscatedName("y")
	@Export("previousOfferName")
	String previousOfferName;

	@ObfuscatedSignature(
		descriptor = "(Lkx;BI)V"
	)
	GrandExchangeEvent(Buffer var1, byte var2, int var3) {
		this.offerName = var1.readStringCp1252NullTerminated(); // L: 111
		this.previousOfferName = var1.readStringCp1252NullTerminated(); // L: 112
		this.world = var1.readUnsignedShort(); // L: 113
		this.age = var1.readLong(); // L: 114
		int var4 = var1.readInt(); // L: 115
		int var5 = var1.readInt(); // L: 116
		this.grandExchangeOffer = new GrandExchangeOffer(); // L: 117
		this.grandExchangeOffer.method166(2); // L: 118
		this.grandExchangeOffer.method168(var2); // L: 119
		this.grandExchangeOffer.unitPrice = var4; // L: 120
		this.grandExchangeOffer.totalQuantity = var5; // L: 121
		this.grandExchangeOffer.currentQuantity = 0; // L: 122
		this.grandExchangeOffer.currentPrice = 0; // L: 123
		this.grandExchangeOffer.id = var3; // L: 124
	} // L: 125

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "73"
	)
	@Export("getOfferName")
	public String getOfferName() {
		return this.offerName; // L: 128
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "59"
	)
	@Export("getPreviousOfferName")
	public String getPreviousOfferName() {
		return this.previousOfferName; // L: 132
	}

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "(Lcv;I)V",
		garbageValue = "878562406"
	)
	static final void method147(Actor var0) {
		int var1 = Math.max(1, var0.field999 - Client.cycle); // L: 3639
		int var2 = var0.field1007 * 64 + var0.field992 * 128; // L: 3640
		int var3 = var0.field1007 * 64 + var0.field952 * 128; // L: 3641
		var0.x += (var2 - var0.x) / var1; // L: 3642
		var0.y += (var3 - var0.y) / var1; // L: 3643
		var0.field989 = 0; // L: 3644
		var0.orientation = var0.field1001; // L: 3645
	} // L: 3646

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1637672427"
	)
	@Export("Widget_resetModelFrames")
	static final void Widget_resetModelFrames(int var0) {
		if (WorldMapCacheName.loadInterface(var0)) { // L: 11021
			Widget[] var1 = DefaultsGroup.Widget_interfaceComponents[var0]; // L: 11022

			for (int var2 = 0; var2 < var1.length; ++var2) { // L: 11023
				Widget var3 = var1[var2]; // L: 11024
				if (var3 != null) { // L: 11025
					var3.modelFrame = 0; // L: 11026
					var3.modelFrameCycle = 0; // L: 11027
				}
			}

		}
	} // L: 11029
}
