import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pd")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lpd;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lpd;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lpd;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lpd;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lpd;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lpd;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("qt")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static class391 field4584;
	@ObfuscatedName("g")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full"); // L: 7
		FontName_plain12 = new FontName("p12_full"); // L: 8
		FontName_bold12 = new FontName("b12_full");
		FontName_verdana11 = new FontName("verdana_11pt_regular"); // L: 10
		FontName_verdana13 = new FontName("verdana_13pt_regular"); // L: 11
		FontName_verdana15 = new FontName("verdana_15pt_regular"); // L: 12
	}

	FontName(String var1) {
		this.name = var1; // L: 20
	} // L: 21

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)[Lpd;",
		garbageValue = "0"
	)
	public static FontName[] method7382() {
		return new FontName[]{FontName_verdana15, FontName_plain12, FontName_bold12, FontName_verdana11, FontName_plain11, FontName_verdana13}; // L: 16
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1771875487"
	)
	public static boolean method7385(int var0) {
		return (var0 & 1) != 0; // L: 9
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1224707658"
	)
	public static boolean method7386(int var0) {
		return (var0 >> 31 & 1) != 0; // L: 37
	}
}
