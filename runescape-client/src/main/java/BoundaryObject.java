import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
@Implements("BoundaryObject")
public final class BoundaryObject {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -727989945
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 662711357
	)
	@Export("x")
	int x;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1127510877
	)
	@Export("y")
	int y;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 643320237
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1924609359
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lgl;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lgl;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		longValue = 1374506562499121997L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1331667357
	)
	@Export("flags")
	int flags;

	BoundaryObject() {
		this.tag = 0L; // L: 11
		this.flags = 0; // L: 12
	} // L: 14

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIZI)V",
		garbageValue = "-2076246411"
	)
	@Export("insertMenuItem")
	static final void insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, boolean var6) {
		if (!Client.isMenuOpen) { // L: 8805
			if (Client.menuOptionsCount < 500) { // L: 8806
				Client.menuActions[Client.menuOptionsCount] = var0; // L: 8807
				Client.menuTargets[Client.menuOptionsCount] = var1; // L: 8808
				Client.menuOpcodes[Client.menuOptionsCount] = var2; // L: 8809
				Client.menuIdentifiers[Client.menuOptionsCount] = var3; // L: 8810
				Client.menuArguments1[Client.menuOptionsCount] = var4; // L: 8811
				Client.menuArguments2[Client.menuOptionsCount] = var5; // L: 8812
				Client.menuShiftClick[Client.menuOptionsCount] = var6; // L: 8813
				++Client.menuOptionsCount; // L: 8814
			}

		}
	} // L: 8816

	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "(Lio;I)Ljava/lang/String;",
		garbageValue = "-502869844"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (AttackOption.Widget_unpackTargetMask(class21.getWidgetFlags(var0)) == 0) { // L: 11377
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null; // L: 11378 11379 11381
		}
	}
}
