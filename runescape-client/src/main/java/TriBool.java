import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nq")
@Implements("TriBool")
public class TriBool {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("TriBool_unknown")
	public static final TriBool TriBool_unknown;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("TriBool_true")
	public static final TriBool TriBool_true;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("TriBool_false")
	public static final TriBool TriBool_false;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1003527319
	)
	static int field4339;

	static {
		TriBool_unknown = new TriBool(); // L: 4
		TriBool_true = new TriBool(); // L: 5
		TriBool_false = new TriBool(); // L: 6
	}

	TriBool() {
	} // L: 8

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(Lki;B)Ljava/lang/String;",
		garbageValue = "-92"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (WorldMapSection1.Widget_unpackTargetMask(UrlRequester.getWidgetFlags(var0)) == 0) { // L: 12521
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null; // L: 12522 12523 12525
		}
	}
}
