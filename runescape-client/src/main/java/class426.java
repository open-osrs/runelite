import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ph")
class class426 implements Iterator {
	@ObfuscatedName("f")
	@Export("SpriteBuffer_xOffsets")
	public static int[] SpriteBuffer_xOffsets;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 443476841
	)
	int field4644;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	final class427 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lpr;)V"
	)
	class426(class427 var1) {
		this.this$0 = var1; // L: 51
	}

	public boolean hasNext() {
		return this.field4644 < this.this$0.method7058(); // L: 56
	}

	public void remove() {
		throw new UnsupportedOperationException(); // L: 69
	}

	public Object next() {
		int var1 = ++this.field4644 - 1; // L: 61
		class393 var2 = (class393)this.this$0.field4648.get((long)var1); // L: 62
		return var2 != null ? var2 : this.this$0.method7522(var1); // L: 63 64
	}
}
