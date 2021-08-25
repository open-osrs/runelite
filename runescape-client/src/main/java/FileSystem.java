import java.io.File;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
@Implements("FileSystem")
public class FileSystem {
	@ObfuscatedName("n")
	@Export("FileSystem_hasPermissions")
	public static boolean FileSystem_hasPermissions;
	@ObfuscatedName("c")
	@Export("FileSystem_cacheDir")
	public static File FileSystem_cacheDir;
	@ObfuscatedName("m")
	@Export("FileSystem_cacheFiles")
	static Hashtable FileSystem_cacheFiles;

	static {
		FileSystem_hasPermissions = false;
		FileSystem_cacheFiles = new Hashtable(16);
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(Ljd;I)Ljava/lang/String;",
		garbageValue = "-1778934467"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (class138.Widget_unpackTargetMask(Decimator.getWidgetFlags(var0)) == 0) {
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null;
		}
	}
}
