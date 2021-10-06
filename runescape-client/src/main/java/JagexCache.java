import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("j")
	@Export("JagexCache_locationFile")
	static File JagexCache_locationFile;
	@ObfuscatedName("m")
	@Export("cacheDir")
	static File cacheDir;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "[Lnq;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;

	static {
		JagexCache_randomDat = null;
		JagexCache_dat2File = null;
		JagexCache_idx255File = null;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1155193506"
	)
	public static int method2815() {
		return KeyHandler.KeyHandler_idleCycles;
	}
}
