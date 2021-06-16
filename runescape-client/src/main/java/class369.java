import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nm")
class class369 implements Iterator {
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "[Lna;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1278704295
	)
	int field4114;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	final class370 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lnz;)V"
	)
	class369(class370 var1) {
		this.this$0 = var1; // L: 50
	}

	public boolean hasNext() {
		return this.field4114 < this.this$0.method6050(); // L: 54
	}

	public Object next() {
		int var1 = ++this.field4114 - 1; // L: 58
		class342 var2 = (class342)this.this$0.field4120.get((long)var1); // L: 59
		return var2 != null ? var2 : this.this$0.method6475(var1); // L: 60 61
	}

	public void remove() {
		throw new UnsupportedOperationException(); // L: 65
	}
}
