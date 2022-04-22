import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ow")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;
	@ObfuscatedName("s")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full"); // L: 7
		FontName_plain12 = new FontName("p12_full"); // L: 8
		FontName_bold12 = new FontName("b12_full"); // L: 9
		FontName_verdana11 = new FontName("verdana_11pt_regular"); // L: 10
		FontName_verdana13 = new FontName("verdana_13pt_regular"); // L: 11
		FontName_verdana15 = new FontName("verdana_15pt_regular"); // L: 12
	}

	FontName(String var1) {
		this.name = var1; // L: 16
	} // L: 17

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-2021946113"
	)
	static int method7415(int var0, int var1, int var2) {
		if (var2 > 179) { // L: 84
			var1 /= 2;
		}

		if (var2 > 192) { // L: 85
			var1 /= 2;
		}

		if (var2 > 217) { // L: 86
			var1 /= 2;
		}

		if (var2 > 243) { // L: 87
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2; // L: 88
		return var3; // L: 89
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1556490427"
	)
	public static int[] method7414() {
		int[] var0 = new int[KeyHandler.field118]; // L: 251

		for (int var1 = 0; var1 < KeyHandler.field118; ++var1) { // L: 252
			var0[var1] = KeyHandler.field143[var1]; // L: 253
		}

		return var0; // L: 255
	}
}
