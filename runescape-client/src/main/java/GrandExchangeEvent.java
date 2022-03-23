import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lm")
@Implements("GrandExchangeEvent")
public class GrandExchangeEvent {
	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("hoveredItemContainer")
	static Widget hoveredItemContainer;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1523225447
	)
	@Export("world")
	public final int world;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = 9015686361858837737L
	)
	@Export("age")
	public final long age;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lly;"
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
		descriptor = "(Lpd;BI)V"
	)
	GrandExchangeEvent(Buffer var1, byte var2, int var3) {
		this.offerName = var1.readStringCp1252NullTerminated(); // L: 111
		this.previousOfferName = var1.readStringCp1252NullTerminated(); // L: 112
		this.world = var1.readUnsignedShort(); // L: 113
		this.age = var1.readLong(); // L: 114
		int var4 = var1.readInt(); // L: 115
		int var5 = var1.readInt(); // L: 116
		this.grandExchangeOffer = new GrandExchangeOffer(); // L: 117
		this.grandExchangeOffer.method6050(2); // L: 118
		this.grandExchangeOffer.method6053(var2); // L: 119
		this.grandExchangeOffer.unitPrice = var4; // L: 120
		this.grandExchangeOffer.totalQuantity = var5; // L: 121
		this.grandExchangeOffer.currentQuantity = 0; // L: 122
		this.grandExchangeOffer.currentPrice = 0; // L: 123
		this.grandExchangeOffer.id = var3; // L: 124
	} // L: 125

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "38"
	)
	@Export("getOfferName")
	public String getOfferName() {
		return this.offerName; // L: 128
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "118"
	)
	@Export("getPreviousOfferName")
	public String getPreviousOfferName() {
		return this.previousOfferName; // L: 132
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Llq;IIB)Z",
		garbageValue = "8"
	)
	static boolean method6045(AbstractArchive var0, int var1, int var2) {
		byte[] var3 = var0.takeFile(var1, var2); // L: 154
		if (var3 == null) { // L: 155
			return false;
		} else {
			ClientPreferences.SpriteBuffer_decode(var3); // L: 156
			return true; // L: 157
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-1578334518"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0; // L: 1802
		Login.Login_response2 = var1; // L: 1803
		Login.Login_response3 = var2; // L: 1804
	} // L: 1805

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "(IZZZB)Llu;",
		garbageValue = "80"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3) {
		ArchiveDisk var4 = null; // L: 1764
		if (JagexCache.JagexCache_dat2File != null) { // L: 1765
			var4 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, class194.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var4, PcmPlayer.masterDisk, var0, var1, var2, var3); // L: 1766
	}
}
