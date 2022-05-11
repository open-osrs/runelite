import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mz")
class class361 implements Comparator {
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("KitDefinition_modelsArchive")
	static AbstractArchive KitDefinition_modelsArchive;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	final class362 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lmh;)V"
	)
	class361(class362 var1) {
		this.this$0 = var1; // L: 7
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lmw;Lmw;I)I",
		garbageValue = "-1192417518"
	)
	int method6395(class363 var1, class363 var2) {
		if (var1.field4290 > var2.field4290) { // L: 9
			return 1;
		} else {
			return var1.field4290 < var2.field4290 ? -1 : 0; // L: 10 11
		}
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 19
	}

	public int compare(Object var1, Object var2) {
		return this.method6395((class363)var1, (class363)var2); // L: 15
	}
}
