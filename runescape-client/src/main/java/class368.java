import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ni")
class class368 implements Iterator {
	@ObfuscatedName("j")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 425017273
	)
	int field4115;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	final class369 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lnu;)V"
	)
	class368(class369 var1) {
		this.this$0 = var1; // L: 50
	}

	public void remove() {
		throw new UnsupportedOperationException(); // L: 65
	}

	public Object next() {
		int var1 = ++this.field4115 - 1; // L: 58
		class341 var2 = (class341)this.this$0.field4118.get((long)var1); // L: 59
		return var2 != null ? var2 : this.this$0.method6432(var1); // L: 60 61
	}

	public boolean hasNext() {
		return this.field4115 < this.this$0.method6018(); // L: 54
	}
}
