import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lb")
public class class317 {
	@ObfuscatedName("n")
	static char[] field3857;
	@ObfuscatedName("c")
	static char[] field3854;
	@ObfuscatedName("m")
	static char[] field3856;
	@ObfuscatedName("k")
	static int[] field3855;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static ClanSettings field3858;

	static {
		field3857 = new char[64];

		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field3857[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field3857[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field3857[var0] = (char)(var0 + 48 - 52);
		}

		field3857[62] = '+';
		field3857[63] = '/';
		field3854 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field3854[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field3854[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field3854[var0] = (char)(var0 + 48 - 52);
		}

		field3854[62] = '*';
		field3854[63] = '-';
		field3856 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field3856[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field3856[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field3856[var0] = (char)(var0 + 48 - 52);
		}

		field3856[62] = '-';
		field3856[63] = '_';
		field3855 = new int[128];

		for (var0 = 0; var0 < field3855.length; ++var0) {
			field3855[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) {
			field3855[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) {
			field3855[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) {
			field3855[var0] = var0 - 48 + 52;
		}

		int[] var2 = field3855;
		field3855[43] = 62;
		var2[42] = 62;
		int[] var1 = field3855;
		field3855[47] = 63;
		var1[45] = 63;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-541825196"
	)
	@Export("loadInterface")
	public static boolean loadInterface(int var0) {
		if (Widget.Widget_loadedInterfaces[var0]) {
			return true;
		} else if (!Widget.Widget_archive.tryLoadGroup(var0)) {
			return false;
		} else {
			int var1 = Widget.Widget_archive.getGroupFileCount(var0);
			if (var1 == 0) {
				Widget.Widget_loadedInterfaces[var0] = true;
				return true;
			} else {
				if (class139.Widget_interfaceComponents[var0] == null) {
					class139.Widget_interfaceComponents[var0] = new Widget[var1];
				}

				for (int var2 = 0; var2 < var1; ++var2) {
					if (class139.Widget_interfaceComponents[var0][var2] == null) {
						byte[] var3 = Widget.Widget_archive.takeFile(var0, var2);
						if (var3 != null) {
							class139.Widget_interfaceComponents[var0][var2] = new Widget();
							class139.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16);
							if (var3[0] == -1) {
								class139.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
							} else {
								class139.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3));
							}
						}
					}
				}

				Widget.Widget_loadedInterfaces[var0] = true;
				return true;
			}
		}
	}
}
