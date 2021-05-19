import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1665063349
	)
	@Export("RunException_revision")
	public static int RunException_revision;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1758215561
	)
	@Export("id")
	int id;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -690991683
	)
	@Export("quantity")
	int quantity;

	TileItem() {
	} // L: 11

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Lgj;",
		garbageValue = "-220627570"
	)
	@Export("getModel")
	protected final Model getModel() {
		return Strings.ItemDefinition_get(this.id).getModel(this.quantity); // L: 14
	}
}
