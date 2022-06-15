import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kh")
public enum class295 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	field3529(0),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	field3526(1),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	field3527(2),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	field3528(3),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	field3530(4);

	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1099242609
	)
	final int field3525;

	class295(int var3) {
		this.field3525 = var3;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-100"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3525;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(CI)B",
		garbageValue = "-328191535"
	)
	@Export("charToByteCp1252")
	public static byte charToByteCp1252(char var0) {
		byte var1;
		if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) { // L: 12
			var1 = (byte)var0;
		} else if (var0 == 8364) { // L: 13
			var1 = -128;
		} else if (var0 == 8218) { // L: 14
			var1 = -126;
		} else if (var0 == 402) { // L: 15
			var1 = -125;
		} else if (var0 == 8222) { // L: 16
			var1 = -124;
		} else if (var0 == 8230) { // L: 17
			var1 = -123;
		} else if (var0 == 8224) { // L: 18
			var1 = -122;
		} else if (var0 == 8225) { // L: 19
			var1 = -121;
		} else if (var0 == 710) { // L: 20
			var1 = -120;
		} else if (var0 == 8240) { // L: 21
			var1 = -119;
		} else if (var0 == 352) { // L: 22
			var1 = -118;
		} else if (var0 == 8249) { // L: 23
			var1 = -117;
		} else if (var0 == 338) { // L: 24
			var1 = -116;
		} else if (var0 == 381) { // L: 25
			var1 = -114;
		} else if (var0 == 8216) { // L: 26
			var1 = -111;
		} else if (var0 == 8217) {
			var1 = -110; // L: 27
		} else if (var0 == 8220) { // L: 28
			var1 = -109;
		} else if (var0 == 8221) { // L: 29
			var1 = -108;
		} else if (var0 == 8226) { // L: 30
			var1 = -107;
		} else if (var0 == 8211) { // L: 31
			var1 = -106;
		} else if (var0 == 8212) { // L: 32
			var1 = -105;
		} else if (var0 == 732) { // L: 33
			var1 = -104;
		} else if (var0 == 8482) { // L: 34
			var1 = -103;
		} else if (var0 == 353) { // L: 35
			var1 = -102;
		} else if (var0 == 8250) { // L: 36
			var1 = -101;
		} else if (var0 == 339) { // L: 37
			var1 = -100;
		} else if (var0 == 382) { // L: 38
			var1 = -98;
		} else if (var0 == 376) { // L: 39
			var1 = -97;
		} else {
			var1 = 63; // L: 40
		}

		return var1; // L: 41
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lbc;I)V",
		garbageValue = "1904209787"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) { // L: 1908
			Client.isMembersWorld = var0.isMembersOnly(); // L: 1909
			GrandExchangeOfferOwnWorldComparator.method1096(var0.isMembersOnly()); // L: 1910
		}

		if (var0.properties != Client.worldProperties) { // L: 1912
			SoundSystem.method739(class304.archive8, var0.properties); // L: 1913
		}

		StructComposition.worldHost = var0.host; // L: 1915
		Client.worldId = var0.id; // L: 1916
		Client.worldProperties = var0.properties; // L: 1917
		FloorDecoration.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000; // L: 1918
		class18.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000; // L: 1919
		Client.currentPort = FloorDecoration.worldPort; // L: 1920
	} // L: 1921
}
