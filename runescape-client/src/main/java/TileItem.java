import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -315361579
	)
	@Export("id")
	int id;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -555496093
	)
	@Export("quantity")
	int quantity;

	TileItem() {
	} // L: 11

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Lef;",
		garbageValue = "127"
	)
	@Export("getModel")
	protected final Model getModel() {
		return class281.ItemDefinition_get(this.id).getModel(this.quantity); // L: 14
	}

	@ObfuscatedName("v")
	public static boolean method2265(long var0) {
		return 0L != var0 && !class225.method4239(var0); // L: 48
	}
}
