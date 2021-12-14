import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oe")
class class403 implements Iterator {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1460216939
	)
	int field4432;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	final class404 this$0;

	@ObfuscatedSignature(
		descriptor = "(Loo;)V"
	)
	class403(class404 var1) {
		this.this$0 = var1;
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public Object next() {
		int var1 = ++this.field4432 - 1;
		class372 var2 = (class372)this.this$0.field4436.get((long)var1);
		return var2 != null ? var2 : this.this$0.method7215(var1);
	}

	public boolean hasNext() {
		return this.field4432 < this.this$0.method6759();
	}
}
