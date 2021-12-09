import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ot")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("j")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full"); // L: 7
		FontName_plain12 = new FontName("p12_full"); // L: 8
		FontName_bold12 = new FontName("b12_full"); // L: 9
		FontName_verdana11 = new FontName("verdana_11pt_regular"); // L: 10
		FontName_verdana13 = new FontName("verdana_13pt_regular"); // L: 11
		FontName_verdana15 = new FontName("verdana_15pt_regular");
	}

	FontName(String var1) {
		this.name = var1; // L: 16
	} // L: 17

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[Lj;",
		garbageValue = "-2104552307"
	)
	public static class6[] method7075() {
		return new class6[]{class6.field15}; // L: 12
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-4"
	)
	public static int method7074(int var0, int var1) {
		int var2;
		for (var2 = 0; var1 > 0; --var1) { // L: 99 100 103
			var2 = var2 << 1 | var0 & 1; // L: 101
			var0 >>>= 1; // L: 102
		}

		return var2; // L: 105
	}
}
