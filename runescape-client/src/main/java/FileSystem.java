import java.io.File;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
@Implements("FileSystem")
public class FileSystem {
	@ObfuscatedName("f")
	@Export("FileSystem_hasPermissions")
	static boolean FileSystem_hasPermissions;
	@ObfuscatedName("b")
	@Export("FileSystem_cacheDir")
	static File FileSystem_cacheDir;
	@ObfuscatedName("l")
	@Export("FileSystem_cacheFiles")
	static Hashtable FileSystem_cacheFiles;

	static {
		FileSystem_hasPermissions = false; // L: 7
		FileSystem_cacheFiles = new Hashtable(16);
	} // L: 9

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Liw;Liw;I)V",
		garbageValue = "1765921646"
	)
	public static void method3630(AbstractArchive var0, AbstractArchive var1) {
		KitDefinition.KitDefinition_archive = var0; // L: 27
		KitDefinition.KitDefinition_modelsArchive = var1; // L: 28
		KitDefinition.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3); // L: 29
	} // L: 30

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Lcf;",
		garbageValue = "1501989228"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? DefaultsGroup.World_worlds[++World.World_listCount - 1] : null; // L: 242 243
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "77"
	)
	static final int method3638() {
		return Client.menuOptionsCount - 1; // L: 8952
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(Lht;IIS)V",
		garbageValue = "10290"
	)
	@Export("alignWidgetPosition")
	static void alignWidgetPosition(Widget var0, int var1, int var2) {
		if (var0.xAlignment == 0) { // L: 9925
			var0.x = var0.rawX;
		} else if (var0.xAlignment == 1) { // L: 9926
			var0.x = var0.rawX + (var1 - var0.width) / 2;
		} else if (var0.xAlignment == 2) { // L: 9927
			var0.x = var1 - var0.width - var0.rawX;
		} else if (var0.xAlignment == 3) { // L: 9928
			var0.x = var0.rawX * var1 >> 14;
		} else if (var0.xAlignment == 4) { // L: 9929
			var0.x = (var0.rawX * var1 >> 14) + (var1 - var0.width) / 2;
		} else {
			var0.x = var1 - var0.width - (var0.rawX * var1 >> 14); // L: 9930
		}

		if (var0.yAlignment == 0) { // L: 9931
			var0.y = var0.rawY;
		} else if (var0.yAlignment == 1) { // L: 9932
			var0.y = (var2 - var0.height) / 2 + var0.rawY;
		} else if (var0.yAlignment == 2) { // L: 9933
			var0.y = var2 - var0.height - var0.rawY;
		} else if (var0.yAlignment == 3) {
			var0.y = var2 * var0.rawY >> 14; // L: 9934
		} else if (var0.yAlignment == 4) { // L: 9935
			var0.y = (var2 - var0.height) / 2 + (var2 * var0.rawY >> 14);
		} else {
			var0.y = var2 - var0.height - (var2 * var0.rawY >> 14); // L: 9936
		}

	} // L: 9937
}
