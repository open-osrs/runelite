import java.util.Comparator;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("q")
class class18 implements Comparator {
	@ObfuscatedName("jw")
	@ObfuscatedGetter(
		intValue = 433538639
	)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lx;"
	)
	final class10 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lx;)V"
	)
	class18(class10 var1) {
		this.this$0 = var1; // L: 40
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;B)I",
		garbageValue = "-59"
	)
	int method272(Entry var1, Entry var2) {
		return ((Float)var2.getValue()).compareTo((Float)var1.getValue()); // L: 42
	}

	public int compare(Object var1, Object var2) {
		return this.method272((Entry)var1, (Entry)var2); // L: 46
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 50
	}
}
