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
		this.field4212 = var1; // L: 10
		this.field4211 = var2; // L: 11
	} // L: 12

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-719426176"
	)
	public static void method6744() {
		try {
			File var0 = new File(class409.userHomeDirectory, "random.dat"); // L: 102
			int var2;
			if (var0.exists()) { // L: 103
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0); // L: 104
			} else {
				label36:
				for (int var1 = 0; var1 < BufferedSource.cacheSubPaths.length; ++var1) { // L: 107
					for (var2 = 0; var2 < UserComparator3.cacheParentPaths.length; ++var2) { // L: 108
						File var3 = new File(UserComparator3.cacheParentPaths[var2] + BufferedSource.cacheSubPaths[var1] + File.separatorChar + "random.dat"); // L: 109
						if (var3.exists()) { // L: 110
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var3, "rw", 25L), 24, 0); // L: 111
							break label36; // L: 112
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) { // L: 117
				RandomAccessFile var4 = new RandomAccessFile(var0, "rw"); // L: 118
				var2 = var4.read(); // L: 119
				var4.seek(0L); // L: 120
				var4.write(var2); // L: 121
				var4.seek(0L); // L: 122
				var4.close(); // L: 123
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0); // L: 124
			}
		} catch (IOException var5) { // L: 127
		}

	} // L: 128
}
