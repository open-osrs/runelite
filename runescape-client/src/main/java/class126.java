import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dg")
public abstract class class126 extends Node {
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("archive17")
	static Archive archive17;
	@ObfuscatedName("fj")
	@ObfuscatedGetter(
		intValue = -858901471
	)
	static int field1497;
	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("WorldMapElement_fonts")
	static Fonts WorldMapElement_fonts;

	class126() {
	} // L: 68

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "1416770155"
	)
	abstract void vmethod3029(Buffer var1);

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lej;I)V",
		garbageValue = "-1531735008"
	)
	abstract void vmethod3028(ClanSettings var1);

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(III)Ljm;",
		garbageValue = "-1928288772"
	)
	@Export("getWidgetChild")
	public static Widget getWidgetChild(int var0, int var1) {
		Widget var2 = ChatChannel.getWidget(var0); // L: 209
		if (var1 == -1) { // L: 210
			return var2;
		} else {
			return var2 != null && var2.children != null && var1 < var2.children.length ? var2.children[var1] : null; // L: 211 212
		}
	}
}
