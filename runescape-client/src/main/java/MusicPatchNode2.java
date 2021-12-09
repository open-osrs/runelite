import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("il")
@Implements("MusicPatchNode2")
public class MusicPatchNode2 {
	@ObfuscatedName("c")
	byte[] field3056;
	@ObfuscatedName("b")
	byte[] field3054;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1373142443
	)
	int field3052;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 354734067
	)
	int field3055;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -488769373
	)
	int field3053;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1877607089
	)
	int field3057;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 843760969
	)
	int field3058;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1302289953
	)
	int field3059;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -579671659
	)
	int field3060;

	MusicPatchNode2() {
	} // L: 14

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;B)V",
		garbageValue = "-1"
	)
	public static void method5048(File var0) {
		class125.FileSystem_cacheDir = var0; // L: 16
		if (!class125.FileSystem_cacheDir.exists()) { // L: 17
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true; // L: 18
		}
	} // L: 19

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIIS)I",
		garbageValue = "3121"
	)
	@Export("hslToRgb")
	static final int hslToRgb(int var0, int var1, int var2) {
		if (var2 > 179) { // L: 516
			var1 /= 2;
		}

		if (var2 > 192) { // L: 517
			var1 /= 2;
		}

		if (var2 > 217) { // L: 518
			var1 /= 2;
		}

		if (var2 > 243) { // L: 519
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2; // L: 520
		return var3; // L: 521
	}
}
