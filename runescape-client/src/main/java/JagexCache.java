import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("er")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("tm")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("o")
	@Export("cacheDir")
	static File cacheDir;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1050074169
	)
	@Export("cacheGamebuild")
	static int cacheGamebuild;
	@ObfuscatedName("m")
	@Export("operatingSystemName")
	static String operatingSystemName;
	@ObfuscatedName("fn")
	static String field1560;

	static {
		JagexCache_randomDat = null; // L: 22
		JagexCache_dat2File = null; // L: 23
		JagexCache_idx255File = null; // L: 24
	}
}
