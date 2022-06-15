import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
public class class152 extends class128 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 557898497
	)
	int field1715;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = -6189068569361167089L
	)
	long field1716;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lej;)V"
	)
	class152(class131 var1) {
		this.this$0 = var1; // L: 307
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqt;B)V",
		garbageValue = "5"
	)
	void vmethod3150(Buffer var1) {
		this.field1715 = var1.readInt(); // L: 310
		this.field1716 = var1.readLong(); // L: 311
	} // L: 312

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Len;I)V",
		garbageValue = "-1718344311"
	)
	void vmethod3149(ClanSettings var1) {
		var1.method2967(this.field1715, this.field1716); // L: 315
	} // L: 316

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "2011587938"
	)
	static int method3147(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 14
		if (var2 == null) { // L: 15
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1; // L: 16 17
		}
	}
}
