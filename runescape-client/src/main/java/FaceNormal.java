import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -311250571
	)
	static int field2363;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	static GameBuild field2365;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 771770075
	)
	@Export("x")
	int x;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1803245333
	)
	@Export("y")
	int y;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1870263719
	)
	@Export("z")
	int z;

	FaceNormal() {
	} // L: 8

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;ZI)Z",
		garbageValue = "-920183026"
	)
	@Export("isWriteable")
	public static boolean isWriteable(File var0, boolean var1) {
		try {
			RandomAccessFile var2 = new RandomAccessFile(var0, "rw"); // L: 151
			int var3 = var2.read(); // L: 152
			var2.seek(0L); // L: 153
			var2.write(var3); // L: 154
			var2.seek(0L); // L: 155
			var2.close(); // L: 156
			if (var1) { // L: 157
				var0.delete();
			}

			return true; // L: 158
		} catch (Exception var4) { // L: 160
			return false; // L: 161
		}
	}
}
