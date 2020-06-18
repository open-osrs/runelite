import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
public class class171 implements class170 {
	@ObfuscatedName("u")
	static byte[][][] field2036;

	@ObfuscatedName("g")
	public static int method3571(long var0) {
		return (int)(var0 >>> 14 & 3L);
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(II)I",
		garbageValue = "-316130396"
	)
	@Export("Messages_getNextChatID")
	static int Messages_getNextChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
		if (var1 == null) {
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count;
		}
	}
}
