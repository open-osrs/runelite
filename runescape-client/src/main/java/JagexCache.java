import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("ParamDefinition_archive")
	public static AbstractArchive ParamDefinition_archive;
	@ObfuscatedName("o")
	@Export("cacheDir")
	public static File cacheDir;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 244088611
	)
	@Export("idxCount")
	public static int idxCount;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "[Lnm;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		longValue = 6281553513143992855L
	)
	static long field1558;
	@ObfuscatedName("hy")
	@ObfuscatedGetter(
		intValue = -127022771
	)
	static int field1559;

	static {
		JagexCache_randomDat = null;
		JagexCache_dat2File = null;
		JagexCache_idx255File = null;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-159486076"
	)
	static void method2744(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			var1.remove();
		}
	}
}
