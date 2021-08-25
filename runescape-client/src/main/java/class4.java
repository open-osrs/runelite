import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("o")
public final class class4 {
	@ObfuscatedName("ag")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V",
		garbageValue = "1757256596"
	)
	@Export("RunException_sendStackTrace")
	public static void RunException_sendStackTrace(String var0, Throwable var1) {
		if (var1 != null) {
			var1.printStackTrace();
		} else {
			try {
				String var2 = "";
				if (var1 != null) {
					var2 = GraphicsDefaults.method6184(var1);
				}

				if (var0 != null) {
					if (var1 != null) {
						var2 = var2 + " | ";
					}

					var2 = var2 + var0;
				}

				System.out.println("Error: " + var2);
				var2 = var2.replace(':', '.');
				var2 = var2.replace('@', '_');
				var2 = var2.replace('&', '_');
				var2 = var2.replace('#', '_');
				if (RunException.RunException_applet == null) {
					return;
				}

				URL var3 = new URL(RunException.RunException_applet.getCodeBase(), "clienterror.ws?c=" + RunException.RunException_revision + "&u=" + RunException.localPlayerName + "&v1=" + TaskHandler.javaVendor + "&v2=" + TaskHandler.javaVersion + "&ct=" + RunException.clientType + "&e=" + var2);
				DataInputStream var4 = new DataInputStream(var3.openStream());
				var4.read();
				var4.close();
			} catch (Exception var5) {
			}

		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;ZB)Lnn;",
		garbageValue = "48"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(JagexCache.cacheDir, "preferences" + var0 + ".dat");
		if (var3.exists()) {
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L);
				return var10;
			} catch (IOException var9) {
			}
		}

		String var4 = "";
		if (class397.cacheGamebuild == 33) {
			var4 = "_rc";
		} else if (class397.cacheGamebuild == 34) {
			var4 = "_wip";
		}

		File var5 = new File(ItemContainer.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
		AccessFile var6;
		if (!var2 && var5.exists()) {
			try {
				var6 = new AccessFile(var5, "rw", 10000L);
				return var6;
			} catch (IOException var8) {
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L);
			return var6;
		} catch (IOException var7) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "(IZZZB)Lkx;",
		garbageValue = "97"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3) {
		ArchiveDisk var4 = null;
		if (JagexCache.JagexCache_dat2File != null) {
			var4 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var4, ApproximateRouteStrategy.masterDisk, var0, var1, var2, var3);
	}

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "(Lcf;I)V",
		garbageValue = "1264135251"
	)
	static final void method21(Actor var0) {
		if (var0.field1140 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0 || var0.sequenceFrameCycle + 1 > class17.SequenceDefinition_get(var0.sequence).frameLengths[var0.sequenceFrame]) {
			int var1 = var0.field1140 - var0.field1139;
			int var2 = Client.cycle - var0.field1139;
			int var3 = var0.field1137 * 64 + var0.field1135 * 128;
			int var4 = var0.field1137 * 64 + var0.field1141 * 128;
			int var5 = var0.field1137 * 64 + var0.field1121 * 128;
			int var6 = var0.field1137 * 64 + var0.field1110 * 128;
			var0.x = (var5 * var2 + var3 * (var1 - var2)) / var1;
			var0.y = (var2 * var6 + var4 * (var1 - var2)) / var1;
		}

		var0.field1151 = 0;
		var0.orientation = var0.field1101;
		var0.rotation = var0.orientation;
	}
}
