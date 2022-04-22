import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bv")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("u")
	@Export("cacheParentPaths")
	static String[] cacheParentPaths;
	@ObfuscatedName("ig")
	@ObfuscatedGetter(
		intValue = -372452529
	)
	@Export("cameraY")
	static int cameraY;
	@ObfuscatedName("oo")
	@ObfuscatedGetter(
		intValue = -922467493
	)
	static int field1013;
	@ObfuscatedName("c")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("i")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32); // L: 7
	}

	ItemContainer() {
		this.ids = new int[]{-1}; // L: 8
		this.quantities = new int[]{0}; // L: 9
	} // L: 11
}
