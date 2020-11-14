import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cw")
public class class90 {
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	@Export("NetCache_reference")
	static Buffer NetCache_reference;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-246202754"
	)
	static int method2168() {
		return 12; // L: 123
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-214239745"
	)
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 70
		if (var1 == null) { // L: 71
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count; // L: 72 73
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1147462173"
	)
	public static int method2169(String var0) {
		return var0.length() + 2; // L: 126
	}
}
