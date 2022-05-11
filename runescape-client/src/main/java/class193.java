import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gd")
public enum class193 implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lgd;"
	)
	field2250((byte)-1),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lgd;"
	)
	field2249((byte)0),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lgd;"
	)
	field2251((byte)1),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lgd;"
	)
	field2248((byte)2);

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lcc;"
	)
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;
	@ObfuscatedName("a")
	public byte field2252;

	class193(byte var3) {
		this.field2252 = var3; // L: 14
	} // L: 15

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "30"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field2252; // L: 19
	}

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(Lki;II)Ljava/lang/String;",
		garbageValue = "-1588715753"
	)
	static String method3801(Widget var0, int var1) {
		if (!MenuAction.method1880(UrlRequester.getWidgetFlags(var0), var1) && var0.onOp == null) { // L: 12513
			return null;
		} else {
			return var0.actions != null && var0.actions.length > var1 && var0.actions[var1] != null && var0.actions[var1].trim().length() != 0 ? var0.actions[var1] : null; // L: 12514 12515 12517
		}
	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-540726719"
	)
	static void method3800(int var0) {
		Client.oculusOrbState = var0; // L: 12665
	} // L: 12666
}
