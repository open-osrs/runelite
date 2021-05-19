import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
public class class105 {
	@ObfuscatedName("qy")
	@ObfuscatedSignature(
		descriptor = "Lx;"
	)
	static class11 field1328;

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1917955728"
	)
	static int method2274(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 66
		if (var1 == null) { // L: 67
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count; // L: 68 69
		}
	}
}
