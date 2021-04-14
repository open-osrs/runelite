import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("r")
public class class15 extends class14 {
	@ObfuscatedName("gu")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;
	@ObfuscatedName("f")
	String field128;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lu;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lu;)V"
	)
	class15(class2 var1) {
		this.this$0 = var1; // L: 229
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "-1383981708"
	)
	void vmethod371(Buffer var1) {
		this.field128 = var1.readStringCp1252NullTerminated(); // L: 232
		var1.readInt(); // L: 233
	} // L: 234

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lm;I)V",
		garbageValue = "-1475503816"
	)
	void vmethod376(class11 var1) {
		var1.field81 = this.field128; // L: 237
	} // L: 238

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1672620512"
	)
	@Export("loadInterface")
	public static boolean loadInterface(int var0) {
		if (class69.Widget_loadedInterfaces[var0]) { // L: 205
			return true;
		} else if (!FloorDecoration.Widget_archive.tryLoadGroup(var0)) { // L: 206
			return false;
		} else {
			int var1 = FloorDecoration.Widget_archive.getGroupFileCount(var0); // L: 207
			if (var1 == 0) { // L: 208
				class69.Widget_loadedInterfaces[var0] = true; // L: 209
				return true; // L: 210
			} else {
				if (Widget.Widget_interfaceComponents[var0] == null) { // L: 212
					Widget.Widget_interfaceComponents[var0] = new Widget[var1];
				}

				for (int var2 = 0; var2 < var1; ++var2) { // L: 213
					if (Widget.Widget_interfaceComponents[var0][var2] == null) { // L: 214
						byte[] var3 = FloorDecoration.Widget_archive.takeFile(var0, var2); // L: 215
						if (var3 != null) { // L: 216
							Widget.Widget_interfaceComponents[var0][var2] = new Widget(); // L: 217
							Widget.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16); // L: 218
							if (var3[0] == -1) { // L: 219
								Widget.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
							} else {
								Widget.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3)); // L: 220
							}
						}
					}
				}

				class69.Widget_loadedInterfaces[var0] = true; // L: 224
				return true; // L: 225
			}
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;ZI)Lni;",
		garbageValue = "1945002537"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(JagexCache.cacheDir, "preferences" + var0 + ".dat"); // L: 247
		if (var3.exists()) { // L: 248
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L); // L: 250
				return var10; // L: 251
			} catch (IOException var9) { // L: 253
			}
		}

		String var4 = ""; // L: 255
		if (class20.cacheGamebuild == 33) { // L: 256
			var4 = "_rc";
		} else if (class20.cacheGamebuild == 34) { // L: 257
			var4 = "_wip";
		}

		File var5 = new File(Canvas.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat"); // L: 258
		AccessFile var6;
		if (!var2 && var5.exists()) { // L: 259
			try {
				var6 = new AccessFile(var5, "rw", 10000L); // L: 261
				return var6; // L: 262
			} catch (IOException var8) { // L: 264
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L); // L: 267
			return var6; // L: 268
		} catch (IOException var7) { // L: 270
			throw new RuntimeException(); // L: 271
		}
	}
}
