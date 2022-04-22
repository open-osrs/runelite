import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fp")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("b")
	@Export("cacheDir")
	static File cacheDir;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -701030665
	)
	@Export("idxCount")
	static int idxCount;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("archive10")
	static Archive archive10;

	static {
		JagexCache_randomDat = null; // L: 22
		JagexCache_dat2File = null; // L: 23
		JagexCache_idx255File = null; // L: 24
	}
}
