import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dc")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("g")
	@Export("JagexCache_locationFile")
	static File JagexCache_locationFile;
	@ObfuscatedName("l")
	@Export("cacheDir")
	static File cacheDir;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("musicTrackArchive")
	public static AbstractArchive musicTrackArchive;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;
	@ObfuscatedName("go")
	@ObfuscatedGetter(
		intValue = 1374549723
	)
	@Export("baseX")
	static int baseX;

	static {
		JagexCache_randomDat = null; // L: 22
		JagexCache_dat2File = null; // L: 23
		JagexCache_idx255File = null; // L: 24
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "104"
	)
	public static void method2538() {
		NPCComposition.NpcDefinition_cached.clear(); // L: 255
		NPCComposition.NpcDefinition_cachedModels.clear(); // L: 256
	} // L: 257
}
