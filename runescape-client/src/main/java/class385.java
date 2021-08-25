import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ng")
class class385 implements Iterator {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1107915063
	)
	int field4228;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	final class386 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lni;)V"
	)
	class385(class386 var1) {
		this.this$0 = var1;
	}

	public Object next() {
		int var1 = ++this.field4228 - 1;
		class354 var2 = (class354)this.this$0.field4230.get((long)var1);
		return var2 != null ? var2 : this.this$0.method6673(var1);
	}

	public boolean hasNext() {
		return this.field4228 < this.this$0.method6235();
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
