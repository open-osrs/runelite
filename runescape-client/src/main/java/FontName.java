import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kq")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("Widget_archive")
	public static AbstractArchive Widget_archive;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	static StudioGame field3699;
	@ObfuscatedName("z")
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1321910935"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var1 = Tiles.method1219(var0); // L: 24
		int var2 = var1.baseVar; // L: 25
		int var3 = var1.startBit; // L: 26
		int var4 = var1.endBit; // L: 27
		int var5 = Varps.Varps_masks[var4 - var3]; // L: 28
		return Varps.Varps_main[var2] >> var3 & var5; // L: 29
	}

	@ObfuscatedName("e")
	public static int method5502(long var0) {
		return (int)(var0 >>> 14 & 3L); // L: 72
	}
}
