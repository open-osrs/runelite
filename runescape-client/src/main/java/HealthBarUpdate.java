import java.applet.Applet;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("cw")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1899211573
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1533499455
	)
	@Export("health")
	int health;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1222578815
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 266860217
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 12
		this.health = var2; // L: 13
		this.health2 = var3; // L: 14
		this.cycleOffset = var4; // L: 15
	} // L: 16

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-672501131"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 19
		this.health = var2; // L: 20
		this.health2 = var3; // L: 21
		this.cycleOffset = var4; // L: 22
	} // L: 23

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Z",
		garbageValue = "-2088910415"
	)
	static boolean method2284(String var0, int var1, String var2) {
		if (var1 == 0) { // L: 59
			try {
				if (!class44.field309.startsWith("win")) { // L: 61
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) { // L: 62
					throw new Exception();
				} else {
					String var13 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*"; // L: 63

					for (int var4 = 0; var4 < var0.length(); ++var4) { // L: 64
						if (var13.indexOf(var0.charAt(var4)) == -1) { // L: 65
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\""); // L: 67
					return true; // L: 68
				}
			} catch (Throwable var8) { // L: 70
				return false; // L: 71
			}
		} else if (var1 == 1) { // L: 74
			try {
				Applet var7 = class44.applet; // L: 77
				Object[] var5 = new Object[]{(new URL(class44.applet.getCodeBase(), var0)).toString()}; // L: 78
				Object var3 = JSObject.getWindow(var7).call(var2, var5); // L: 81
				return var3 != null; // L: 84
			} catch (Throwable var9) { // L: 86
				return false; // L: 87
			}
		} else if (var1 == 2) { // L: 90
			try {
				class44.applet.getAppletContext().showDocument(new URL(class44.applet.getCodeBase(), var0), "_blank"); // L: 92
				return true; // L: 93
			} catch (Exception var10) { // L: 95
				return false; // L: 96
			}
		} else if (var1 == 3) { // L: 99
			try {
				class42.method521(class44.applet, "loggedout"); // L: 101
			} catch (Throwable var12) { // L: 103
			}

			try {
				class44.applet.getAppletContext().showDocument(new URL(class44.applet.getCodeBase(), var0), "_top"); // L: 105
				return true; // L: 106
			} catch (Exception var11) { // L: 108
				return false; // L: 109
			}
		} else {
			throw new IllegalArgumentException(); // L: 112
		}
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2083004569"
	)
	static final int method2283() {
		return Client.menuOptionsCount - 1; // L: 8968
	}
}
