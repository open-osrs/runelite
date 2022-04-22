import java.applet.Applet;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("ct")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("ux")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1984278839
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -685471761
	)
	@Export("type")
	int type;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1470046835
	)
	@Export("x")
	int x;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 241546961
	)
	@Export("y")
	int y;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1849366507
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1969851359
	)
	int field1104;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -2130994383
	)
	int field1105;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -406866951
	)
	@Export("id")
	int id;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1916353905
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1901242165
	)
	int field1107;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1886053549
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -758552801
	)
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.delay = 0; // L: 16
		this.hitpoints = -1; // L: 17
	} // L: 19

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Z",
		garbageValue = "1938115950"
	)
	static boolean method2165(String var0, int var1, String var2) {
		if (var1 == 0) { // L: 63
			try {
				if (!class29.field175.startsWith("win")) { // L: 65
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) { // L: 66
					throw new Exception();
				} else {
					String var13 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*"; // L: 67

					for (int var4 = 0; var4 < var0.length(); ++var4) { // L: 68
						if (var13.indexOf(var0.charAt(var4)) == -1) { // L: 69
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\""); // L: 71
					return true; // L: 72
				}
			} catch (Throwable var8) { // L: 74
				return false; // L: 75
			}
		} else if (var1 == 1) { // L: 78
			try {
				Applet var7 = class29.field176; // L: 81
				Object[] var5 = new Object[]{(new URL(class29.field176.getCodeBase(), var0)).toString()}; // L: 82
				Object var3 = JSObject.getWindow(var7).call(var2, var5); // L: 85
				return var3 != null; // L: 88
			} catch (Throwable var9) { // L: 90
				return false; // L: 91
			}
		} else if (var1 == 2) { // L: 94
			try {
				class29.field176.getAppletContext().showDocument(new URL(class29.field176.getCodeBase(), var0), "_blank"); // L: 96
				return true; // L: 97
			} catch (Exception var10) { // L: 99
				return false; // L: 100
			}
		} else if (var1 == 3) { // L: 103
			try {
				class27.method383(class29.field176, "loggedout"); // L: 105
			} catch (Throwable var12) { // L: 107
			}

			try {
				class29.field176.getAppletContext().showDocument(new URL(class29.field176.getCodeBase(), var0), "_top"); // L: 109
				return true; // L: 110
			} catch (Exception var11) { // L: 112
				return false; // L: 113
			}
		} else {
			throw new IllegalArgumentException(); // L: 116
		}
	}

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-617620981"
	)
	static boolean method2166() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1458
			while (Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1459
				ArchiveLoader var0 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone); // L: 1460
				if (!var0.isLoaded()) {
					return false; // L: 1461
				}

				++Client.archiveLoadersDone; // L: 1462
			}

			return true; // L: 1464
		} else {
			return true; // L: 1463
		}
	}
}
