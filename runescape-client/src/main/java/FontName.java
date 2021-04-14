import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mv")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("lb")
	@ObfuscatedGetter(
		intValue = 1196232611
	)
	@Export("menuY")
	static int menuY;
	@ObfuscatedName("k")
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

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)Ljava/lang/String;",
		garbageValue = "72"
	)
	static String method6285(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://"; // L: 11607
		if (Client.gameBuild == 1) { // L: 11608
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) { // L: 11609
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) { // L: 11610
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) { // L: 11611
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) { // L: 11612
			var0 = "local";
		}

		String var3 = ""; // L: 11613
		if (class0.field4 != null) { // L: 11614
			var3 = "/p=" + class0.field4;
		}

		String var4 = "runescape.com"; // L: 11615
		return var2 + var0 + "." + var4 + "/l=" + class35.clientLanguage + "/a=" + FaceNormal.field2002 + var3 + "/"; // L: 11616
	}
}
