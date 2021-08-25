import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bg")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("dr")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("c")
	String field941;
	@ObfuscatedName("m")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("k")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("o")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 970581103
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1044657775
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 930141117
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1398121329
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "[Lnz;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128);
	}

	Script() {
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IB)[Lnz;",
		garbageValue = "-37"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1];
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "88717898"
	)
	@Export("itemContainerSetItem")
	static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
		ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var4 == null) {
			var4 = new ItemContainer();
			ItemContainer.itemContainers.put(var4, (long)var0);
		}

		if (var4.ids.length <= var1) {
			int[] var5 = new int[var1 + 1];
			int[] var6 = new int[var1 + 1];

			int var7;
			for (var7 = 0; var7 < var4.ids.length; ++var7) {
				var5[var7] = var4.ids[var7];
				var6[var7] = var4.quantities[var7];
			}

			for (var7 = var4.ids.length; var7 < var1; ++var7) {
				var5[var7] = -1;
				var6[var7] = 0;
			}

			var4.ids = var5;
			var4.quantities = var6;
		}

		var4.ids[var1] = var2;
		var4.quantities[var1] = var3;
	}
}
