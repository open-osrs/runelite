import java.awt.FontMetrics;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
public enum class114 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	field1390(0, 0),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	field1383(1, 1),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	field1384(2, 2),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	field1391(3, 3),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	field1386(4, 4);

	@ObfuscatedName("r")
	public static short[][] field1382;
	@ObfuscatedName("ax")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;
	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -401638189
	)
	final int field1387;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 733610371
	)
	final int field1388;

	class114(int var3, int var4) {
		this.field1387 = var3; // L: 129
		this.field1388 = var4; // L: 130
	} // L: 131

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "48"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1388; // L: 134
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1912506868"
	)
	public static int method2629(int var0) {
		long var2 = ViewportMouse.ViewportMouse_entityTags[var0]; // L: 73
		int var1 = (int)(var2 >>> 14 & 3L); // L: 75
		return var1; // L: 77
	}
}
