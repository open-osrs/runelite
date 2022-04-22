import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
@Implements("AttackOption")
public enum AttackOption implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lcn;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lcn;"
	)
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lcn;"
	)
	field1257(2),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lcn;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lcn;"
	)
	field1263(4);

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("ItemDefinition_modelArchive")
	static AbstractArchive ItemDefinition_modelArchive;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -2042861585
	)
	static int field1255;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -887019937
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3; // L: 12684
	} // L: 12685

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 12688
	}
}
