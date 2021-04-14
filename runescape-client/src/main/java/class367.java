import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("na")
class class367 implements Iterator {
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("archive1")
	static Archive archive1;
	@ObfuscatedName("ex")
	@ObfuscatedGetter(
		intValue = -76066485
	)
	static int field4117;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 315072013
	)
	int field4115;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	final class368 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lnh;)V"
	)
	class367(class368 var1) {
		this.this$0 = var1; // L: 40
	}

	public boolean hasNext() {
		return this.field4115 < this.this$0.method5994(); // L: 44
	}

	public Object next() {
		int var1 = ++this.field4115 - 1; // L: 48
		class340 var2 = (class340)this.this$0.field4119.get((long)var1); // L: 49
		return var2 != null ? var2 : this.this$0.method6432(var1); // L: 50 51
	}

	public void remove() {
		throw new UnsupportedOperationException(); // L: 55
	}
}
