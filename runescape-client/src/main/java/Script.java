import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bl")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	@Export("options_buttons_0Sprite")
	static IndexedSprite options_buttons_0Sprite;
	@ObfuscatedName("l")
	String field960;
	@ObfuscatedName("s")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("e")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("r")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1266754377
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 915485379
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1163597385
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1119154997
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "[Lon;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128); // L: 12
	}

	Script() {
	} // L: 23

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IB)[Lon;",
		garbageValue = "-83"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1]; // L: 119
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2117274807"
	)
	public static void method1993(int var0) {
		MouseHandler.MouseHandler_idleCycles = var0; // L: 61
	} // L: 62
}
