import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("no")
class class386 implements Iterator {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "[Lbc;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1877062523
	)
	int field4251;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	final class387 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lnc;)V"
	)
	class386(class387 var1) {
		this.this$0 = var1;
	}

	public boolean hasNext() {
		return this.field4251 < this.this$0.method6296();
	}

	public Object next() {
		int var1 = ++this.field4251 - 1;
		class355 var2 = (class355)this.this$0.field4253.get((long)var1);
		return var2 != null ? var2 : this.this$0.method6757(var1);
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
