import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mr")
public final class class342 {
	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "208"
	)
	static boolean method6312() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1634
			while (Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1635
				ArchiveLoader var0 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone); // L: 1636
				if (!var0.isLoaded()) { // L: 1637
					return false;
				}

				++Client.archiveLoadersDone; // L: 1638
			}

			return true; // L: 1640
		} else {
			return true; // L: 1639
		}
	}
}
