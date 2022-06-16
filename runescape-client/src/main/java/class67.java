import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
public class class67 {
	@ObfuscatedName("c")
	static final BigInteger field886;
	@ObfuscatedName("v")
	static final BigInteger field885;
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("archive15")
	static Archive archive15;

	static {
		field886 = new BigInteger("10001", 16); // L: 6
		field885 = new BigInteger("ab3795934893fe2209c5ef0b149e4a64c8eac69bdf1d8ded99aba2d9e37e69a949a553c06d069e59cc7519e70b2463213d3de4d98e1120469788b9df4033740b2730933e1cd68c86cadc8b15c877947c5db2e85e2fb1feb775dabaf99a4c5d07260a728e859086e32bd3a07ac5ebdaf72e4cc11beb54168a6441e878e4e49471", 16); // L: 7
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;ZI)Lpn;",
		garbageValue = "-1474288872"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(JagexCache.cacheDir, "preferences" + var0 + ".dat"); // L: 249
		if (var3.exists()) { // L: 250
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L); // L: 252
				return var10; // L: 253
			} catch (IOException var9) { // L: 255
			}
		}

		String var4 = ""; // L: 257
		if (class93.cacheGamebuild == 33) { // L: 258
			var4 = "_rc";
		} else if (class93.cacheGamebuild == 34) { // L: 259
			var4 = "_wip";
		}

		File var5 = new File(class123.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat"); // L: 260
		AccessFile var6;
		if (!var2 && var5.exists()) { // L: 261
			try {
				var6 = new AccessFile(var5, "rw", 10000L); // L: 263
				return var6; // L: 264
			} catch (IOException var8) { // L: 266
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L); // L: 269
			return var6; // L: 270
		} catch (IOException var7) { // L: 272
			throw new RuntimeException(); // L: 273
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1525199469"
	)
	public static boolean method1885(int var0) {
		return (var0 >> 21 & 1) != 0; // L: 25
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1608144091"
	)
	public static void method1886() {
		ParamComposition.ParamDefinition_cached.clear(); // L: 56
	} // L: 57

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1419146368"
	)
	public static void method1887() {
		class437.DBRowType_cache.clear(); // L: 90
	} // L: 91
}
