import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("co")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;
	@ObfuscatedName("c")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("o")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32); // L: 7
	}

	ItemContainer() {
		this.ids = new int[]{-1}; // L: 8
		this.quantities = new int[]{0}; // L: 9
	} // L: 11

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "1"
	)
	public static int method2104(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765); // L: 28
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459); // L: 29
		var0 = var0 + (var0 >>> 4) & 252645135; // L: 30
		var0 += var0 >>> 8; // L: 31
		var0 += var0 >>> 16; // L: 32
		return var0 & 255; // L: 33
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-246752714"
	)
	static final void method2108() {
		Client.field698 = Client.cycleCntr; // L: 11517
		FloorOverlayDefinition.ClanChat_inClanChat = true; // L: 11518
	} // L: 11519
}
