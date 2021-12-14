import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nr")
public class class368 {
	@ObfuscatedName("c")
	float[] field4212;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -219137761
	)
	int field4211;

	class368(float[] var1, int var2) {
		this.field4212 = var1;
		this.field4211 = var2;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-719426176"
	)
	public static void method6744() {
		try {
			File var0 = new File(class409.userHomeDirectory, "random.dat");
			int var2;
			if (var0.exists()) {
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0);
			} else {
				label36:
				for (int var1 = 0; var1 < BufferedSource.cacheSubPaths.length; ++var1) {
					for (var2 = 0; var2 < UserComparator3.cacheParentPaths.length; ++var2) {
						File var3 = new File(UserComparator3.cacheParentPaths[var2] + BufferedSource.cacheSubPaths[var1] + File.separatorChar + "random.dat");
						if (var3.exists()) {
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var3, "rw", 25L), 24, 0);
							break label36;
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) {
				RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
				var2 = var4.read();
				var4.seek(0L);
				var4.write(var2);
				var4.seek(0L);
				var4.close();
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0);
			}
		} catch (IOException var5) {
		}

	}
}
