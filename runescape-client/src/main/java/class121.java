import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
public class class121 {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1242696181
	)
	static int field1529;

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2071231531"
	)
	static boolean method2748() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1481
			while (Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1482
				ArchiveLoader var0 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone); // L: 1483
				if (!var0.isLoaded()) {
					return false; // L: 1484
				}

				++Client.archiveLoadersDone; // L: 1485
			}

			return true; // L: 1487
		} else {
			return true; // L: 1486
		}
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "55"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 12412

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next(); // L: 12413
			var1.clearIsFromIgnored(); // L: 12415
		}

		if (PcmPlayer.friendsChat != null) { // L: 12419
			PcmPlayer.friendsChat.invalidateIgnoreds(); // L: 12420
		}

	} // L: 12422
}
