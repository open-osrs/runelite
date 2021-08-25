import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("a")
	@Export("ByteArrayPool_altSizeArrayCounts")
	public static int[] ByteArrayPool_altSizeArrayCounts;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 632536851
	)
	@Export("id")
	int id;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -417320715
	)
	@Export("quantity")
	int quantity;

	TileItem() {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Lhg;",
		garbageValue = "18"
	)
	@Export("getModel")
	protected final Model getModel() {
		return class65.ItemDefinition_get(this.id).getModel(this.quantity);
	}
}
