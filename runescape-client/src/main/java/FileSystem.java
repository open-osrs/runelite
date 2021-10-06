import java.io.File;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
@Implements("FileSystem")
public class FileSystem {
	@ObfuscatedName("l")
	@Export("FileSystem_hasPermissions")
	static boolean FileSystem_hasPermissions;
	@ObfuscatedName("q")
	@Export("FileSystem_cacheDir")
	static File FileSystem_cacheDir;
	@ObfuscatedName("f")
	@Export("FileSystem_cacheFiles")
	static Hashtable FileSystem_cacheFiles;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("options_buttons_2Sprite")
	static IndexedSprite options_buttons_2Sprite;

	static {
		FileSystem_hasPermissions = false;
		FileSystem_cacheFiles = new Hashtable(16);
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "469084024"
	)
	static boolean method2820(char var0) {
		for (int var1 = 0; var1 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var1) {
			if (var0 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var1)) {
				return true;
			}
		}

		return false;
	}
}
