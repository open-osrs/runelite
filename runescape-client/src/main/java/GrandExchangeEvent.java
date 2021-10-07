import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kd")
@Implements("GrandExchangeEvent")
public class GrandExchangeEvent {
	@ObfuscatedName("t")
	static byte[][][] field3760;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 663278445
	)
	@Export("world")
	public final int world;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		longValue = -5766229753192434851L
	)
	@Export("age")
	public final long age;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	@Export("grandExchangeOffer")
	public final GrandExchangeOffer grandExchangeOffer;
	@ObfuscatedName("j")
	@Export("offerName")
	String offerName;
	@ObfuscatedName("m")
	@Export("previousOfferName")
	String previousOfferName;

	@ObfuscatedSignature(
		descriptor = "(Lot;BI)V"
	)
	GrandExchangeEvent(Buffer var1, byte var2, int var3) {
		this.offerName = var1.readStringCp1252NullTerminated();
		this.previousOfferName = var1.readStringCp1252NullTerminated();
		this.world = var1.readUnsignedShort();
		this.age = var1.readLong();
		int var4 = var1.readInt();
		int var5 = var1.readInt();
		this.grandExchangeOffer = new GrandExchangeOffer();
		this.grandExchangeOffer.method5407(2);
		this.grandExchangeOffer.method5405(var2);
		this.grandExchangeOffer.unitPrice = var4;
		this.grandExchangeOffer.totalQuantity = var5;
		this.grandExchangeOffer.currentQuantity = 0;
		this.grandExchangeOffer.currentPrice = 0;
		this.grandExchangeOffer.id = var3;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-117"
	)
	@Export("getOfferName")
	public String getOfferName() {
		return this.offerName;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "7"
	)
	@Export("getPreviousOfferName")
	public String getPreviousOfferName() {
		return this.previousOfferName;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Loy;I)I",
		garbageValue = "770443607"
	)
	static int method5402(PacketBuffer var0) {
		int var1 = var0.readBits(2);
		int var2;
		if (var1 == 0) {
			var2 = 0;
		} else if (var1 == 1) {
			var2 = var0.readBits(5);
		} else if (var1 == 2) {
			var2 = var0.readBits(8);
		} else {
			var2 = var0.readBits(11);
		}

		return var2;
	}

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "(I)Lna;",
		garbageValue = "192669944"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return TileItem.worldMap;
	}
}
