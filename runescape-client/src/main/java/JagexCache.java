import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("p")
	@Export("JagexCache_locationFile")
	static File JagexCache_locationFile;
	@ObfuscatedName("b")
	@Export("cacheDir")
	static File cacheDir;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 502349843
	)
	@Export("idxCount")
	static int idxCount;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;

	static {
		JagexCache_randomDat = null; // L: 22
		JagexCache_dat2File = null; // L: 23
		JagexCache_idx255File = null; // L: 24
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1018942980"
	)
	static final int method2541() {
		return ViewportMouse.ViewportMouse_y; // L: 91
	}
}
