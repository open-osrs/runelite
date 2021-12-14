import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("be")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "Lgr;"
	)
	@Export("textureProvider")
	static TextureProvider textureProvider;
	@ObfuscatedName("b")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("p")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32);
	}

	ItemContainer() {
		this.ids = new int[]{-1};
		this.quantities = new int[]{0};
	}
}
