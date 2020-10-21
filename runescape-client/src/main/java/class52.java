import java.awt.FontMetrics;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
public final class class52 {
	@ObfuscatedName("a")
	@Export("userHomeDirectory")
	static String userHomeDirectory;
	@ObfuscatedName("av")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;
	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "Les;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;
	@ObfuscatedName("gw")
	@Export("regions")
	static int[] regions;

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "-1899471565"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2]; // L: 143
		int var4 = 0; // L: 144

		for (int var5 = 0; var5 < var2; ++var5) { // L: 145
			int var6 = var0[var5 + var1] & 255; // L: 146
			if (var6 != 0) { // L: 147
				if (var6 >= 128 && var6 < 160) { // L: 148
					char var7 = class298.cp1252AsciiExtension[var6 - 128]; // L: 149
					if (var7 == 0) { // L: 150
						var7 = '?';
					}

					var6 = var7; // L: 151
				}

				var3[var4++] = (char)var6; // L: 153
			}
		}

		return new String(var3, 0, var4); // L: 155
	}

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "793107384"
	)
	static boolean method897() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1899
			while (Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1900
				ArchiveLoader var0 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone); // L: 1901
				if (!var0.isLoaded()) {
					return false; // L: 1902
				}

				++Client.archiveLoadersDone; // L: 1903
			}

			return true; // L: 1905
		} else {
			return true; // L: 1904
		}
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1432177323"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		class9.method132(); // L: 11482
		if (DevicePcmPlayerProvider.clanChat != null) { // L: 11483
			DevicePcmPlayerProvider.clanChat.invalidateIgnoreds(); // L: 11484
		}

	} // L: 11486
}
