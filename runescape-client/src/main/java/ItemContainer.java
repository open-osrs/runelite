import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bw")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1933505575
	)
	@Export("ItemDefinition_fileCount")
	public static int ItemDefinition_fileCount;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("archive20")
	static Archive archive20;
	@ObfuscatedName("q")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("l")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32); // L: 7
	}

	ItemContainer() {
		this.ids = new int[]{-1}; // L: 8
		this.quantities = new int[]{0}; // L: 9
	} // L: 11

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Llp;IIB)[Lqd;",
		garbageValue = "123"
	)
	public static IndexedSprite[] method2062(AbstractArchive var0, int var1, int var2) {
		if (!User.method6514(var0, var1, var2)) { // L: 23
			return null;
		} else {
			IndexedSprite[] var4 = new IndexedSprite[class453.SpriteBuffer_spriteCount]; // L: 26

			for (int var5 = 0; var5 < class453.SpriteBuffer_spriteCount; ++var5) { // L: 27
				IndexedSprite var6 = var4[var5] = new IndexedSprite(); // L: 28
				var6.width = class453.SpriteBuffer_spriteWidth; // L: 29
				var6.height = class453.SpriteBuffer_spriteHeight; // L: 30
				var6.xOffset = class453.SpriteBuffer_xOffsets[var5]; // L: 31
				var6.yOffset = class453.SpriteBuffer_yOffsets[var5]; // L: 32
				var6.subWidth = ScriptFrame.SpriteBuffer_spriteWidths[var5]; // L: 33
				var6.subHeight = class453.SpriteBuffer_spriteHeights[var5]; // L: 34
				var6.palette = Decimator.SpriteBuffer_spritePalette; // L: 35
				var6.pixels = class127.SpriteBuffer_pixels[var5]; // L: 36
			}

			VarcInt.method3325(); // L: 38
			return var4; // L: 41
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)[Lda;",
		garbageValue = "-726850383"
	)
	static class119[] method2060() {
		return new class119[]{class119.field1508, class119.field1512, class119.field1502, class119.field1516, class119.field1518, class119.field1521, class119.field1506, class119.field1507, class119.field1500, class119.field1509, class119.field1510, class119.field1511, class119.field1503, class119.field1513, class119.field1514, class119.field1515, class119.field1504}; // L: 74
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1192606922"
	)
	public static int method2059(int var0) {
		if (var0 > 0) { // L: 194
			return 1;
		} else {
			return var0 < 0 ? -1 : 0; // L: 195 196
		}
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "358850975"
	)
	static final void method2061(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) { // L: 8721
			if (Client.rootWidgetWidths[var4] + Client.rootWidgetXs[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetYs[var4] + Client.rootWidgetHeights[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) { // L: 8722
				Client.field704[var4] = true;
			}
		}

	} // L: 8724
}
