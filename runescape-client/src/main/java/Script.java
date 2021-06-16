import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("e")
	String field1069;
	@ObfuscatedName("v")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("y")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("j")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1160704097
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 622564641
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -2125275351
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1075522957
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "[Lmo;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128); // L: 12
	}

	Script() {
	} // L: 23

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)[Lmo;",
		garbageValue = "-592819583"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1]; // L: 150
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2884568"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		class34.method407(); // L: 7735
		Client.menuActions[0] = "Cancel"; // L: 7736
		Client.menuTargets[0] = ""; // L: 7737
		Client.menuOpcodes[0] = 1006; // L: 7738
		Client.menuShiftClick[0] = false; // L: 7739
		Client.menuOptionsCount = 1; // L: 7740
	} // L: 7741

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(Liv;I)V",
		garbageValue = "-1229350050"
	)
	@Export("invalidateWidget")
	static void invalidateWidget(Widget var0) {
		if (var0.cycle == Client.field830) { // L: 11013
			Client.field831[var0.rootIndex] = true; // L: 11014
		}

	} // L: 11016
}
