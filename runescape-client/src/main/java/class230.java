import java.applet.Applet;
import java.net.URL;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("hv")
public class class230 {
	@ObfuscatedName("h")
	static int[] field2816;
	@ObfuscatedName("nm")
	@ObfuscatedGetter(
		intValue = -1187192027
	)
	static int field2812;

	static {
		new Object();
		field2816 = new int[33]; // L: 8
		field2816[0] = 0; // L: 11
		int var0 = 2; // L: 12

		for (int var1 = 1; var1 < 33; ++var1) { // L: 13
			field2816[var1] = var0 - 1; // L: 14
			var0 += var0; // L: 15
		}

	} // L: 17

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Z",
		garbageValue = "-1639678169"
	)
	static boolean method4348(String var0, int var1, String var2) {
		if (var1 == 0) { // L: 54
			try {
				if (!class44.field305.startsWith("win")) { // L: 56
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) { // L: 57
					throw new Exception();
				} else {
					String var14 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*"; // L: 58

					for (int var4 = 0; var4 < var0.length(); ++var4) { // L: 59
						if (var14.indexOf(var0.charAt(var4)) == -1) { // L: 60
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\""); // L: 62
					return true; // L: 63
				}
			} catch (Throwable var8) { // L: 65
				return false; // L: 66
			}
		} else if (var1 == 1) { // L: 69
			try {
				Applet var7 = class44.applet; // L: 72
				Object[] var5 = new Object[]{(new URL(class44.applet.getCodeBase(), var0)).toString()}; // L: 73
				Object var13 = JSObject.getWindow(var7).call(var2, var5); // L: 76
				return var13 != null; // L: 79
			} catch (Throwable var9) { // L: 81
				return false; // L: 82
			}
		} else if (var1 == 2) { // L: 85
			try {
				class44.applet.getAppletContext().showDocument(new URL(class44.applet.getCodeBase(), var0), "_blank"); // L: 87
				return true; // L: 88
			} catch (Exception var10) { // L: 90
				return false; // L: 91
			}
		} else if (var1 == 3) { // L: 94
			try {
				Applet var3 = class44.applet; // L: 96
				JSObject.getWindow(var3).call("loggedout", (Object[])null); // L: 99
			} catch (Throwable var12) { // L: 102
			}

			try {
				class44.applet.getAppletContext().showDocument(new URL(class44.applet.getCodeBase(), var0), "_top"); // L: 104
				return true; // L: 105
			} catch (Exception var11) { // L: 107
				return false; // L: 108
			}
		} else {
			throw new IllegalArgumentException(); // L: 111
		}
	}
}
