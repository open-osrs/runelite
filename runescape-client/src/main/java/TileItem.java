import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cq")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("u")
	public static short[] field1281;
	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("archive0")
	static Archive archive0;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 914537933
	)
	@Export("id")
	int id;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1079489497
	)
	@Export("quantity")
	int quantity;

	TileItem() {
	} // L: 11

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)Lhx;",
		garbageValue = "63"
	)
	@Export("getModel")
	protected final Model getModel() {
		return class67.ItemDefinition_get(this.id).getModel(this.quantity); // L: 14
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-902066173"
	)
	@Export("clearItemContainer")
	static void clearItemContainer(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 63
		if (var1 != null) { // L: 64
			for (int var2 = 0; var2 < var1.ids.length; ++var2) { // L: 65
				var1.ids[var2] = -1; // L: 66
				var1.quantities[var2] = 0; // L: 67
			}

		}
	} // L: 69
}
