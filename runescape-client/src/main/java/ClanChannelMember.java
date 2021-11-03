import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("i")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 717344231
	)
	@Export("world")
	public int world;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	@Export("username")
	public Username username;

	ClanChannelMember() {
	} // L: 10

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1349383488"
	)
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 77
		if (var1 == null) { // L: 78
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count; // L: 79 80
		}
	}
}
