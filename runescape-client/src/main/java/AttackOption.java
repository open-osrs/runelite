import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
@Implements("AttackOption")
public enum AttackOption implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	field1232(2),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	field1234(4);

	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -268107797
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3; // L: 12752
	} // L: 12753

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "48"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 12757
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-379261507"
	)
	static boolean method2356() {
		return SecureRandomFuture.clientPreferences.field1197 >= Client.field473; // L: 12724
	}
}
