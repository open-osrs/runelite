import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
public class class124 implements class123 {
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	@Export("midiPcmStream")
	public static MidiPcmStream midiPcmStream;
	@ObfuscatedName("af")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Llm;",
		garbageValue = "-333681005"
	)
	public static PrivateChatMode method2498(int var0) {
		PrivateChatMode[] var1 = new PrivateChatMode[]{PrivateChatMode.field3888, PrivateChatMode.field3887, PrivateChatMode.field3889}; // L: 18
		PrivateChatMode[] var2 = var1; // L: 20

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 21
			PrivateChatMode var4 = var2[var3]; // L: 22
			if (var0 == var4.field3890) { // L: 24
				return var4;
			}
		}

		return null; // L: 28
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)Lbi;",
		garbageValue = "1712316428"
	)
	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return (Message)Messages.Messages_hashTable.get((long)var0); // L: 40
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "90"
	)
	static final void method2496() {
		Client.field654 = Client.cycleCntr; // L: 11285
		class21.field190 = true; // L: 11286
	} // L: 11287
}
