import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
public class class82 {
	@ObfuscatedName("v")
	static final BigInteger field1018;
	@ObfuscatedName("n")
	static final BigInteger field1017;
	@ObfuscatedName("ge")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;
	@ObfuscatedName("nb")
	@ObfuscatedGetter(
		intValue = -1942533771
	)
	static int field1020;

	static {
		field1018 = new BigInteger("10001", 16); // L: 6
		field1017 = new BigInteger("88d2b28e43dc7be8f2376826a6d810274f07f489daf46f3fc0a40ad847e6c852b10e6939d9252721d4fb8501cf1348cdabec4165b62bd8aa0dbe6ed0394524dfe2cdce9287df5cbedb0d33bc1d9df71cb2e5c67a5d05fa058b182a192ad83fa80b8ff245b45500dce1f746b9a14db36d711c889f35183243d5805cd875580975", 16); // L: 7
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([BI)Lfd;",
		garbageValue = "775453768"
	)
	static WorldMapSprite method1909(byte[] var0) {
		return var0 == null ? new WorldMapSprite() : new WorldMapSprite(ParamComposition.convertJpgToSprite(var0).pixels); // L: 19 20
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;ZI)Lnm;",
		garbageValue = "2134853227"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(class12.cacheDir, "preferences" + var0 + ".dat"); // L: 166
		if (var3.exists()) { // L: 167
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L); // L: 169
				return var10; // L: 170
			} catch (IOException var9) { // L: 172
			}
		}

		String var4 = ""; // L: 174
		if (UserComparator10.cacheGamebuild == 33) { // L: 175
			var4 = "_rc";
		} else if (UserComparator10.cacheGamebuild == 34) { // L: 176
			var4 = "_wip";
		}

		File var5 = new File(class22.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat"); // L: 177
		AccessFile var6;
		if (!var2 && var5.exists()) { // L: 178
			try {
				var6 = new AccessFile(var5, "rw", 10000L); // L: 180
				return var6; // L: 181
			} catch (IOException var8) { // L: 183
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L); // L: 186
			return var6; // L: 187
		} catch (IOException var7) { // L: 189
			throw new RuntimeException(); // L: 190
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "-409366221"
	)
	public static int method1908(CharSequence var0) {
		return class24.method260(var0, 10, true); // L: 67
	}
}
