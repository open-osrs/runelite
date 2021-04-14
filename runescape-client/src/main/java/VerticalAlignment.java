import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	field3517(1, 0),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	@Export("VerticalAlignment_centered")
	VerticalAlignment_centered(0, 1),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	field3514(2, 2);

	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 5650729
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -974816521
	)
	@Export("id")
	final int id;

	VerticalAlignment(int var3, int var4) {
		this.value = var3; // L: 14
		this.id = var4; // L: 15
	} // L: 16

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1000839247"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 19
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1799855349"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		Client.menuOptionsCount = 0; // L: 7769
		Client.isMenuOpen = false; // L: 7770
		Client.menuActions[0] = "Cancel"; // L: 7772
		Client.menuTargets[0] = ""; // L: 7773
		Client.menuOpcodes[0] = 1006; // L: 7774
		Client.menuShiftClick[0] = false; // L: 7775
		Client.menuOptionsCount = 1; // L: 7776
	} // L: 7777
}
