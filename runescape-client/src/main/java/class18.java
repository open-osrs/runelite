import java.util.Comparator;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("a")
class class18 implements Comparator {
	@ObfuscatedName("py")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	@Export("mouseWheel")
	static class158 mouseWheel;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lk;"
	)
	final class10 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lk;)V"
	)
	class18(class10 var1) {
		this.this$0 = var1; // L: 40
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;I)I",
		garbageValue = "-1566011867"
	)
	int method283(Entry var1, Entry var2) {
		return ((Float)var2.getValue()).compareTo((Float)var1.getValue()); // L: 42
	}

	public int compare(Object var1, Object var2) {
		return this.method283((Entry)var1, (Entry)var2); // L: 46
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 50
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "14"
	)
	public static int method282(int var0) {
		return class400.field4390[var0 & 16383]; // L: 33
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-716641004"
	)
	public static int method294() {
		return KeyHandler.KeyHandler_idleCycles; // L: 140
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1321255361"
	)
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 82
		if (var1 == null) { // L: 83
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count; // L: 84 85
		}
	}
}
