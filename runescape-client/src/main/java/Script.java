import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bd")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("h")
	public static boolean field877;
	@ObfuscatedName("ac")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	static Client client;
	@ObfuscatedName("t")
	String field862;
	@ObfuscatedName("v")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("j")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("l")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1660927915
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -2081440793
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -502913765
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1150919323
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "[Lmc;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128);
	}

	Script() {
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)[Lmc;",
		garbageValue = "-631335991"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1];
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-17"
	)
	public static int method1724(int var0, int var1) {
		int var2;
		for (var2 = 0; var1 > 0; --var1) {
			var2 = var2 << 1 | var0 & 1;
			var0 >>>= 1;
		}

		return var2;
	}
}
