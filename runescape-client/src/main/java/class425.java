import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pn")
class class425 implements Iterator {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -991583815
	)
	int field4581;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	final class426 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lpj;)V"
	)
	class425(class426 var1) {
		this.this$0 = var1; // L: 50
	}

	public boolean hasNext() {
		return this.field4581 < this.this$0.method7113(); // L: 54
	}

	public Object next() {
		int var1 = ++this.field4581 - 1; // L: 58
		class393 var2 = (class393)this.this$0.field4583.get((long)var1); // L: 59
		return var2 != null ? var2 : this.this$0.method7543(var1); // L: 60 61
	}

	public void remove() {
		throw new UnsupportedOperationException(); // L: 65
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-131933810"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1; // L: 117
	}
}
