import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ji")
public class class262 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	static final class262 field3194;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	static final class262 field3193;
	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("localPlayer")
	static Player localPlayer;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1602122901
	)
	final int field3192;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -2082142029
	)
	final int field3195;

	static {
		field3194 = new class262(51, 27, 800, 0, 16, 16); // L: 33
		field3193 = new class262(25, 28, 800, 656, 40, 40); // L: 34
	}

	class262(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field3192 = var5; // L: 39
		this.field3195 = var6; // L: 40
	} // L: 41

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;ZI)Lnp;",
		garbageValue = "724440260"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(WorldMapDecoration.cacheDir, "preferences" + var0 + ".dat"); // L: 183
		if (var3.exists()) { // L: 184
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L); // L: 186
				return var10; // L: 187
			} catch (IOException var9) { // L: 189
			}
		}

		String var4 = ""; // L: 191
		if (ClanChannel.cacheGamebuild == 33) { // L: 192
			var4 = "_rc";
		} else if (ClanChannel.cacheGamebuild == 34) { // L: 193
			var4 = "_wip";
		}

		File var5 = new File(JagexCache.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat"); // L: 194
		AccessFile var6;
		if (!var2 && var5.exists()) { // L: 195
			try {
				var6 = new AccessFile(var5, "rw", 10000L); // L: 197
				return var6; // L: 198
			} catch (IOException var8) { // L: 200
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L); // L: 203
			return var6; // L: 204
		} catch (IOException var7) { // L: 206
			throw new RuntimeException(); // L: 207
		}
	}
}
