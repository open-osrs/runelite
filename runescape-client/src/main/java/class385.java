import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("na")
public class class385 {
	@ObfuscatedName("v")
	float field4336;
	@ObfuscatedName("c")
	float field4334;
	@ObfuscatedName("i")
	float field4333;

	static {
		new class385(0.0F, 0.0F, 0.0F); // L: 5
		new class385(1.0F, 1.0F, 1.0F); // L: 9
		new class385(1.0F, 0.0F, 0.0F); // L: 13
		new class385(0.0F, 1.0F, 0.0F); // L: 17
		new class385(0.0F, 0.0F, 1.0F);
	} // L: 26

	class385(float var1, float var2, float var3) {
		this.field4336 = var1; // L: 33
		this.field4334 = var2; // L: 34
		this.field4333 = var3; // L: 35
	} // L: 36

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "-565998647"
	)
	final float method6973() {
		return (float)Math.sqrt((double)(this.field4333 * this.field4333 + this.field4336 * this.field4336 + this.field4334 * this.field4334)); // L: 39
	}

	public String toString() {
		return this.field4336 + ", " + this.field4334 + ", " + this.field4333; // L: 44
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1727518153"
	)
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 21
		if (var2 == null) { // L: 22
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0; // L: 23 24
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldw;",
		garbageValue = "-2020186976"
	)
	static class123[] method6974() {
		return new class123[]{class123.field1483, class123.field1492, class123.field1486, class123.field1482, class123.field1481, class123.field1484, class123.field1487, class123.field1488, class123.field1489}; // L: 106
	}
}
