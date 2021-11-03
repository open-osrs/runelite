import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nk")
class class386 implements Iterator {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1225612599
	)
	int field4256;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	final class387 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lno;)V"
	)
	class386(class387 var1) {
		this.this$0 = var1; // L: 50
	}

	public boolean hasNext() {
		return this.field4256 < this.this$0.method6384(); // L: 54
	}

	public void remove() {
		throw new UnsupportedOperationException(); // L: 65
	}

	public Object next() {
		int var1 = ++this.field4256 - 1; // L: 58
		class355 var2 = (class355)this.this$0.field4260.get((long)var1); // L: 59
		return var2 != null ? var2 : this.this$0.method6820(var1); // L: 60 61
	}
}
