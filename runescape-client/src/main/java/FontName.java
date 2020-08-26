import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kz")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 334630663
	)
	@Export("clientTickTimeIdx")
	static int clientTickTimeIdx;
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("archive20")
	static Archive archive20;
	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("redHintArrowSprite")
	static Sprite redHintArrowSprite;
	@ObfuscatedName("x")
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
		this.name = var1; // L: 20
	} // L: 21

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)[Lkz;",
		garbageValue = "1417653903"
	)
	public static FontName[] method5439() {
		return new FontName[]{FontName_verdana13, FontName_verdana15, FontName_verdana11, FontName_plain12, FontName_plain11, FontName_bold12}; // L: 16
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Z",
		garbageValue = "-1097380872"
	)
	static boolean method5444(String var0, int var1) {
		return WorldMapIcon_1.method380(var0, var1, "openjs"); // L: 57
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "1161805725"
	)
	public static String method5445(CharSequence var0) {
		return ScriptEvent.method1236('*', var0.length()); // L: 179
	}

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1773491987"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field890 = 0L; // L: 3866
		if (var0 >= 2) { // L: 3867
			Client.isResizable = true;
		} else {
			Client.isResizable = false; // L: 3868
		}

		if (class39.getWindowedMode() == 1) { // L: 3869
			class2.client.setMaxCanvasSize(765, 503); // L: 3870
		} else {
			class2.client.setMaxCanvasSize(7680, 2160); // L: 3873
		}

		if (Client.gameState >= 25) { // L: 3875
			GrandExchangeEvent.method160();
		}

	} // L: 3876
}
