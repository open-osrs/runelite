import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lq")
@Implements("Buddy")
public class Buddy extends User {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1876506073
	)
	@Export("world")
	public int world;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1660852993
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 278975133
	)
	@Export("rank")
	public int rank;

	Buddy() {
		this.world = -1; // L: 4
	} // L: 8

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "45"
	)
	@Export("set")
	void set(int var1, int var2) {
		this.world = var1; // L: 11
		this.int2 = var2; // L: 12
	} // L: 13

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1247009443"
	)
	@Export("getWorld")
	public int getWorld() {
		return this.world; // L: 16
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "731832682"
	)
	@Export("hasWorld")
	public boolean hasWorld() {
		return this.world > 0; // L: 20
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;ZI)Lng;",
		garbageValue = "2145866234"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(JagexCache.cacheDir, "preferences" + var0 + ".dat"); // L: 254
		if (var3.exists()) { // L: 255
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L); // L: 257
				return var10; // L: 258
			} catch (IOException var9) { // L: 260
			}
		}

		String var4 = ""; // L: 262
		if (class310.cacheGamebuild == 33) { // L: 263
			var4 = "_rc";
		} else if (class310.cacheGamebuild == 34) { // L: 264
			var4 = "_wip";
		}

		File var5 = new File(AccessFile.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat"); // L: 265
		AccessFile var6;
		if (!var2 && var5.exists()) { // L: 266
			try {
				var6 = new AccessFile(var5, "rw", 10000L); // L: 268
				return var6; // L: 269
			} catch (IOException var8) { // L: 271
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L); // L: 274
			return var6; // L: 275
		} catch (IOException var7) { // L: 277
			throw new RuntimeException(); // L: 278
		}
	}
}
