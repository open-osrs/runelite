import java.io.File;
import java.io.IOException;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
@Implements("FileSystem")
public class FileSystem {
	@ObfuscatedName("h")
	@Export("FileSystem_hasPermissions")
	public static boolean FileSystem_hasPermissions;
	@ObfuscatedName("v")
	@Export("FileSystem_cacheDir")
	public static File FileSystem_cacheDir;
	@ObfuscatedName("x")
	@Export("FileSystem_cacheFiles")
	static Hashtable FileSystem_cacheFiles;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lhg;"
	)
	@Export("musicTrack")
	static MusicTrack musicTrack;
	@ObfuscatedName("gt")
	@Export("regions")
	static int[] regions;

	static {
		FileSystem_hasPermissions = false; // L: 7
		FileSystem_cacheFiles = new Hashtable(16);
	} // L: 9

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(Lkj;I)V",
		garbageValue = "-1885661901"
	)
	static void method3573(Buffer var0) {
		if (Client.randomDatData != null) { // L: 11152
			var0.writeBytes(Client.randomDatData, 0, Client.randomDatData.length); // L: 11153
		} else {
			byte[] var2 = new byte[24]; // L: 11158

			try {
				JagexCache.JagexCache_randomDat.seek(0L); // L: 11160
				JagexCache.JagexCache_randomDat.readFully(var2); // L: 11161

				int var3;
				for (var3 = 0; var3 < 24 && var2[var3] == 0; ++var3) { // L: 11162 11163 11164
				}

				if (var3 >= 24) { // L: 11166
					throw new IOException();
				}
			} catch (Exception var6) {
				for (int var4 = 0; var4 < 24; ++var4) { // L: 11169
					var2[var4] = -1;
				}
			}

			var0.writeBytes(var2, 0, var2.length); // L: 11174
		}
	} // L: 11154 11175
}
