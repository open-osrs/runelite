import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
@Implements("UserComparator8")
public class UserComparator8 extends AbstractUserComparator {
	@ObfuscatedName("sm")
	@ObfuscatedGetter(
		intValue = -1318815651
	)
	static int field1305;
	@ObfuscatedName("i")
	@Export("reversed")
	final boolean reversed;

	public UserComparator8(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lmt;Lmt;I)I",
		garbageValue = "-1806283560"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world) { // L: 15
			if (var2.world != Client.worldId) {
				return this.reversed ? -1 : 1; // L: 16
			}
		} else if (var2.world == Client.worldId) {
			return this.reversed ? 1 : -1; // L: 19
		}

		return this.compareUser(var1, var2); // L: 21
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 25
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-906484483"
	)
	static final int method2456(int var0, int var1) {
		if (var0 == -1) { // L: 571
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 572
			if (var1 < 2) { // L: 573
				var1 = 2;
			} else if (var1 > 126) { // L: 574
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 575
		}
	}

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(Lkd;Ljava/lang/String;B)V",
		garbageValue = "0"
	)
	static void method2460(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1); // L: 1977
		Client.archiveLoaders.add(var2); // L: 1978
		Client.field745 += var2.groupCount; // L: 1979
	} // L: 1980

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "14"
	)
	static final void method2462() {
		for (int var0 = 0; var0 < Players.Players_count; ++var0) { // L: 11751
			Player var1 = Client.players[Players.Players_indices[var0]]; // L: 11752
			var1.clearIsFriend(); // L: 11753
		}

		Iterator var2 = Messages.Messages_hashTable.iterator(); // L: 11756

		while (var2.hasNext()) {
			Message var3 = (Message)var2.next(); // L: 11757
			var3.clearIsFromFriend(); // L: 11759
		}

		if (AbstractArchive.friendsChat != null) { // L: 11763
			AbstractArchive.friendsChat.clearFriends(); // L: 11764
		}

	} // L: 11766
}
