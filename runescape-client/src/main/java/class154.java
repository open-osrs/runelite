import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
public class class154 extends class166 {
	@ObfuscatedName("v")
	@Export("Tiles_hue")
	static int[] Tiles_hue;
	@ObfuscatedName("o")
	String field1738;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	final class155 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leq;Ljava/lang/String;Ljava/lang/String;)V"
	)
	class154(class155 var1, String var2, String var3) {
		super(var1, var2); // L: 372
		this.this$0 = var1; // L: 371
		this.field1738 = var3; // L: 373
	} // L: 374

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1005057629"
	)
	public int vmethod3227() {
		return 1; // L: 377
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "59"
	)
	public String vmethod3238() {
		return this.field1738; // L: 382
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Llp;Llp;I)Z",
		garbageValue = "169526997"
	)
	public static boolean method3059(AbstractArchive var0, AbstractArchive var1) {
		GrandExchangeOfferWorldComparator.WorldMapElement_archive = var1; // L: 44
		if (!var0.isFullyLoaded()) { // L: 45
			return false; // L: 46
		} else {
			WorldMapElement.WorldMapElement_count = var0.getGroupFileCount(35); // L: 48
			class344.WorldMapElement_cached = new WorldMapElement[WorldMapElement.WorldMapElement_count]; // L: 49

			for (int var2 = 0; var2 < WorldMapElement.WorldMapElement_count; ++var2) { // L: 50
				byte[] var3 = var0.takeFile(35, var2); // L: 51
				class344.WorldMapElement_cached[var2] = new WorldMapElement(var2); // L: 52
				if (var3 != null) { // L: 53
					class344.WorldMapElement_cached[var2].decode(new Buffer(var3)); // L: 54
					class344.WorldMapElement_cached[var2].method3291(); // L: 55
				}
			}

			return true; // L: 58
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lpt;IIB)I",
		garbageValue = "52"
	)
	static int method3061(IterableNodeHashTable var0, int var1, int var2) {
		if (var0 == null) { // L: 33
			return var2;
		} else {
			IntegerNode var3 = (IntegerNode)var0.get((long)var1); // L: 34
			return var3 == null ? var2 : var3.integer; // L: 35 36
		}
	}
}
