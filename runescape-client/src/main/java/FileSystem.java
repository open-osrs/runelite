import java.io.File;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
@Implements("FileSystem")
public class FileSystem {
	@ObfuscatedName("po")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	static class387 field1564;
	@ObfuscatedName("i")
	@Export("FileSystem_hasPermissions")
	static boolean FileSystem_hasPermissions;
	@ObfuscatedName("w")
	@Export("FileSystem_cacheDir")
	static File FileSystem_cacheDir;
	@ObfuscatedName("s")
	@Export("FileSystem_cacheFiles")
	static Hashtable FileSystem_cacheFiles;

	static {
		FileSystem_hasPermissions = false; // L: 7
		FileSystem_cacheFiles = new Hashtable(16);
	} // L: 9

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIII)Low;",
		garbageValue = "-2058198182"
	)
	static SpritePixels method2909(int var0, int var1, int var2) {
		return (SpritePixels)WorldMapRegion.WorldMapRegion_cachedSprites.get(NetSocket.method2923(var0, var1, var2)); // L: 42
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-322420667"
	)
	public static void method2908() {
		HealthBarDefinition.HealthBarDefinition_cached.clear(); // L: 89
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear(); // L: 90
	} // L: 91
}
