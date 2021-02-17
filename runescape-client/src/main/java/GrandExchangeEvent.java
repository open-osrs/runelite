import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("a")
@Implements("GrandExchangeEvent")
public class GrandExchangeEvent {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 34061047
	)
	@Export("musicTrackVolume")
	public static int musicTrackVolume;
	@ObfuscatedName("ag")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1823148411
	)
	@Export("world")
	public final int world;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = -1010127793754141401L
	)
	@Export("age")
	public final long age;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ly;"
	)
	@Export("grandExchangeOffer")
	public final GrandExchangeOffer grandExchangeOffer;
	@ObfuscatedName("w")
	@Export("offerName")
	String offerName;
	@ObfuscatedName("t")
	@Export("previousOfferName")
	String previousOfferName;

	@ObfuscatedSignature(
		descriptor = "(Lkj;BI)V"
	)
	GrandExchangeEvent(Buffer var1, byte var2, int var3) {
		this.offerName = var1.readStringCp1252NullTerminated(); // L: 111
		this.previousOfferName = var1.readStringCp1252NullTerminated(); // L: 112
		this.world = var1.readUnsignedShort(); // L: 113
		this.age = var1.readLong(); // L: 114
		int var4 = var1.readInt(); // L: 115
		int var5 = var1.readInt(); // L: 116
		this.grandExchangeOffer = new GrandExchangeOffer(); // L: 117
		this.grandExchangeOffer.method171(2); // L: 118
		this.grandExchangeOffer.method176(var2); // L: 119
		this.grandExchangeOffer.unitPrice = var4; // L: 120
		this.grandExchangeOffer.totalQuantity = var5; // L: 121
		this.grandExchangeOffer.currentQuantity = 0; // L: 122
		this.grandExchangeOffer.currentPrice = 0; // L: 123
		this.grandExchangeOffer.id = var3; // L: 124
	} // L: 125

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-819048279"
	)
	@Export("getOfferName")
	public String getOfferName() {
		return this.offerName; // L: 128
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "5"
	)
	@Export("getPreviousOfferName")
	public String getPreviousOfferName() {
		return this.previousOfferName; // L: 132
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2125539222"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (World.World_request == null) { // L: 31
				World.World_request = GrandExchangeOfferAgeComparator.urlRequester.request(new URL(GrandExchangeOfferTotalQuantityComparator.field75));
			} else if (World.World_request.isDone()) { // L: 33
				byte[] var0 = World.World_request.getResponse(); // L: 34
				Buffer var1 = new Buffer(var0); // L: 35
				var1.readInt(); // L: 36
				World.World_count = var1.readUnsignedShort(); // L: 37
				World.World_worlds = new World[World.World_count]; // L: 38

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) { // L: 39 47
					var3 = World.World_worlds[var2] = new World(); // L: 40
					var3.id = var1.readUnsignedShort(); // L: 41
					var3.properties = var1.readInt(); // L: 42
					var3.host = var1.readStringCp1252NullTerminated(); // L: 43
					var3.activity = var1.readStringCp1252NullTerminated(); // L: 44
					var3.location = var1.readUnsignedByte(); // L: 45
					var3.population = var1.readShort(); // L: 46
				}

				ChatChannel.sortWorlds(World.World_worlds, 0, World.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 49
				World.World_request = null; // L: 50
				return true; // L: 51
			}
		} catch (Exception var4) { // L: 55
			var4.printStackTrace(); // L: 56
			World.World_request = null; // L: 57
		}

		return false; // L: 59
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "31"
	)
	protected static final void method153() {
		class225.clock.mark(); // L: 421

		int var0;
		for (var0 = 0; var0 < 32; ++var0) { // L: 422
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) { // L: 423
			GameEngine.clientTickTimes[var0] = 0L;
		}

		class8.gameCyclesToDo = 0; // L: 424
	} // L: 425
}
