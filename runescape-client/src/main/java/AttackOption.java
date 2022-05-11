import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cq")
@Implements("AttackOption")
public enum AttackOption implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lcq;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lcq;"
	)
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lcq;"
	)
	field1285(2),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lcq;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lcq;"
	)
	field1283(4);

	@ObfuscatedName("fn")
	@ObfuscatedGetter(
		intValue = 1045451155
	)
	static int field1290;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1694685345
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3; // L: 12733
	} // L: 12734

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "30"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 12738
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-59"
	)
	public static int method2401(int var0, int var1) {
		int var2;
		for (var2 = 1; var1 > 1; var1 >>= 1) { // L: 24 25 28
			if ((var1 & 1) != 0) { // L: 26
				var2 = var0 * var2;
			}

			var0 *= var0; // L: 27
		}

		if (var1 == 1) { // L: 30
			return var0 * var2;
		} else {
			return var2; // L: 31
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lpt;ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1761568873"
	)
	static String method2393(IterableNodeHashTable var0, int var1, String var2) {
		if (var0 == null) { // L: 41
			return var2;
		} else {
			ObjectNode var3 = (ObjectNode)var0.get((long)var1); // L: 42
			return var3 == null ? var2 : (String)var3.obj; // L: 43 44
		}
	}
}
