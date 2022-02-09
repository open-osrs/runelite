import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
public abstract class class126 extends Node {
	@ObfuscatedName("nb")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	static Widget field1516;

	class126() {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "703192976"
	)
	abstract void vmethod3019(Buffer var1);

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ley;I)V",
		garbageValue = "750335300"
	)
	abstract void vmethod3020(ClanSettings var1);

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Lfr;",
		garbageValue = "638570064"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[var0] != null ? WorldMapElement.WorldMapElement_cached[var0] : new WorldMapElement(var0); // L: 44
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lkq;III)Lpt;",
		garbageValue = "856920976"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		return !class125.method2744(var0, var1, var2) ? null : SpriteMask.method5322(); // L: 28 29
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)[B",
		garbageValue = "23"
	)
	public static byte[] method2754(CharSequence var0) {
		int var1 = var0.length(); // L: 45
		byte[] var2 = new byte[var1]; // L: 46

		for (int var3 = 0; var3 < var1; ++var3) { // L: 47
			char var4 = var0.charAt(var3); // L: 48
			if (var4 > 0 && var4 < 128 || var4 >= 160 && var4 <= 255) { // L: 49
				var2[var3] = (byte)var4;
			} else if (var4 == 8364) { // L: 50
				var2[var3] = -128;
			} else if (var4 == 8218) { // L: 51
				var2[var3] = -126;
			} else if (var4 == 402) { // L: 52
				var2[var3] = -125;
			} else if (var4 == 8222) { // L: 53
				var2[var3] = -124;
			} else if (var4 == 8230) { // L: 54
				var2[var3] = -123;
			} else if (var4 == 8224) { // L: 55
				var2[var3] = -122;
			} else if (var4 == 8225) { // L: 56
				var2[var3] = -121;
			} else if (var4 == 710) { // L: 57
				var2[var3] = -120;
			} else if (var4 == 8240) { // L: 58
				var2[var3] = -119;
			} else if (var4 == 352) {
				var2[var3] = -118; // L: 59
			} else if (var4 == 8249) { // L: 60
				var2[var3] = -117;
			} else if (var4 == 338) { // L: 61
				var2[var3] = -116;
			} else if (var4 == 381) { // L: 62
				var2[var3] = -114;
			} else if (var4 == 8216) { // L: 63
				var2[var3] = -111;
			} else if (var4 == 8217) { // L: 64
				var2[var3] = -110;
			} else if (var4 == 8220) { // L: 65
				var2[var3] = -109;
			} else if (var4 == 8221) { // L: 66
				var2[var3] = -108;
			} else if (var4 == 8226) { // L: 67
				var2[var3] = -107;
			} else if (var4 == 8211) { // L: 68
				var2[var3] = -106;
			} else if (var4 == 8212) { // L: 69
				var2[var3] = -105;
			} else if (var4 == 732) { // L: 70
				var2[var3] = -104;
			} else if (var4 == 8482) { // L: 71
				var2[var3] = -103;
			} else if (var4 == 353) { // L: 72
				var2[var3] = -102;
			} else if (var4 == 8250) {
				var2[var3] = -101; // L: 73
			} else if (var4 == 339) { // L: 74
				var2[var3] = -100;
			} else if (var4 == 382) { // L: 75
				var2[var3] = -98;
			} else if (var4 == 376) { // L: 76
				var2[var3] = -97;
			} else {
				var2[var3] = 63; // L: 77
			}
		}

		return var2; // L: 79
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IZIZI)V",
		garbageValue = "223998791"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (class33.World_worlds != null) { // L: 171
			BoundaryObject.doWorldSorting(0, class33.World_worlds.length - 1, var0, var1, var2, var3); // L: 172
		}

	} // L: 174

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "350265873"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop; // L: 10715
	}
}
