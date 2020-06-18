import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lec;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("o")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("q")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("j")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 701670427
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 12358867
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 2127952993
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -983920549
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "[Llf;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128);
	}

	Script() {
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(II)[Llf;",
		garbageValue = "-978861309"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1];
	}
}
