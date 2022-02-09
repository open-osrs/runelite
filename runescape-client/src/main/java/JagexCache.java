import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("e")
	@Export("JagexCache_locationFile")
	static File JagexCache_locationFile;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1506580765
	)
	@Export("idxCount")
	public static int idxCount;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -18657443
	)
	static int field1695;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;
	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	static AbstractSocket field1699;
	@ObfuscatedName("po")
	@ObfuscatedSignature(
		descriptor = "Lct;"
	)
	@Export("varcs")
	static Varcs varcs;

	static {
		JagexCache_randomDat = null; // L: 22
		JagexCache_dat2File = null; // L: 23
		JagexCache_idx255File = null; // L: 24
	}
}
