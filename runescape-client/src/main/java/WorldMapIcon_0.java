import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("he")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1237030909
	)
	@Export("element")
	final int element;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("label")
	final WorldMapLabel label;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1097869871
	)
	@Export("subWidth")
	final int subWidth;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -587135887
	)
	@Export("subHeight")
	final int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lko;Lko;ILiw;)V"
	)
	WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
		super(var1, var2); // L: 14
		this.element = var3; // L: 15
		this.label = var4; // L: 16
		WorldMapElement var5 = class19.WorldMapElement_get(this.getElement()); // L: 17
		SpritePixels var6 = var5.getSpriteBool(false);
		if (var6 != null) { // L: 19
			this.subWidth = var6.subWidth; // L: 20
			this.subHeight = var6.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2078584239"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Liw;",
		garbageValue = "-2105037058"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "388705804"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-54"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpd;Ljava/lang/String;B)I",
		garbageValue = "23"
	)
	public static int method4900(Buffer var0, String var1) {
		int var2 = var0.offset; // L: 18
		int var4 = var1.length(); // L: 21
		byte[] var5 = new byte[var4]; // L: 22

		for (int var6 = 0; var6 < var4; ++var6) { // L: 23
			char var7 = var1.charAt(var6); // L: 24
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) { // L: 25
				var5[var6] = (byte)var7;
			} else if (var7 == 8364) { // L: 26
				var5[var6] = -128;
			} else if (var7 == 8218) { // L: 27
				var5[var6] = -126;
			} else if (var7 == 402) { // L: 28
				var5[var6] = -125;
			} else if (var7 == 8222) { // L: 29
				var5[var6] = -124;
			} else if (var7 == 8230) { // L: 30
				var5[var6] = -123;
			} else if (var7 == 8224) { // L: 31
				var5[var6] = -122;
			} else if (var7 == 8225) { // L: 32
				var5[var6] = -121;
			} else if (var7 == 710) { // L: 33
				var5[var6] = -120;
			} else if (var7 == 8240) { // L: 34
				var5[var6] = -119;
			} else if (var7 == 352) { // L: 35
				var5[var6] = -118;
			} else if (var7 == 8249) { // L: 36
				var5[var6] = -117;
			} else if (var7 == 338) { // L: 37
				var5[var6] = -116;
			} else if (var7 == 381) { // L: 38
				var5[var6] = -114;
			} else if (var7 == 8216) { // L: 39
				var5[var6] = -111;
			} else if (var7 == 8217) { // L: 40
				var5[var6] = -110;
			} else if (var7 == 8220) { // L: 41
				var5[var6] = -109;
			} else if (var7 == 8221) { // L: 42
				var5[var6] = -108;
			} else if (var7 == 8226) { // L: 43
				var5[var6] = -107;
			} else if (var7 == 8211) {
				var5[var6] = -106; // L: 44
			} else if (var7 == 8212) { // L: 45
				var5[var6] = -105;
			} else if (var7 == 732) { // L: 46
				var5[var6] = -104;
			} else if (var7 == 8482) { // L: 47
				var5[var6] = -103;
			} else if (var7 == 353) { // L: 48
				var5[var6] = -102;
			} else if (var7 == 8250) { // L: 49
				var5[var6] = -101;
			} else if (var7 == 339) { // L: 50
				var5[var6] = -100;
			} else if (var7 == 382) { // L: 51
				var5[var6] = -98;
			} else if (var7 == 376) { // L: 52
				var5[var6] = -97;
			} else {
				var5[var6] = 63; // L: 53
			}
		}

		var0.writeSmartByteShort(var5.length); // L: 58
		var0.offset += class282.huffman.compress(var5, 0, var5.length, var0.array, var0.offset); // L: 59
		return var0.offset - var2; // L: 60
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-22"
	)
	static final int method4901(int var0, int var1) {
		if (var0 == -1) { // L: 1013
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 1014
			if (var1 < 2) { // L: 1015
				var1 = 2;
			} else if (var1 > 126) { // L: 1016
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 1017
		}
	}
}
