import java.applet.Applet;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("hw")
@Implements("Occluder")
public final class Occluder {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1749152531
	)
	@Export("minTileX")
	int minTileX;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 883383741
	)
	@Export("maxTileX")
	int maxTileX;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1136190305
	)
	@Export("minTileY")
	int minTileY;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 678309221
	)
	@Export("maxTileY")
	int maxTileY;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -319994583
	)
	@Export("type")
	int type;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1416943749
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1076426543
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -287892181
	)
	@Export("minZ")
	int minZ;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 2065946253
	)
	@Export("maxZ")
	int maxZ;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -300779215
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1201693205
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 816323749
	)
	int field2464;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1338658645
	)
	int field2469;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -761560275
	)
	int field2463;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1793637339
	)
	int field2471;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1091401787
	)
	int field2470;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1237604195
	)
	int field2473;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -559031051
	)
	int field2472;

	Occluder() {
	} // L: 23

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)[Lju;",
		garbageValue = "1814694549"
	)
	public static class283[] method4483() {
		return new class283[]{class283.field3639, class283.field3638, class283.field3640, class283.field3637}; // L: 15
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "466419387"
	)
	static boolean method4484(String var0) {
		if (var0 == null) { // L: 191
			return false;
		} else {
			try {
				new URL(var0);
				return true; // L: 198
			} catch (MalformedURLException var2) { // L: 195
				return false; // L: 196
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Z",
		garbageValue = "2027201546"
	)
	static boolean method4485(String var0, int var1, String var2) {
		if (var1 == 0) { // L: 59
			try {
				if (!class29.field158.startsWith("win")) { // L: 61
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) { // L: 62
					throw new Exception();
				} else {
					String var11 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*"; // L: 63

					for (int var4 = 0; var4 < var0.length(); ++var4) { // L: 64
						if (var11.indexOf(var0.charAt(var4)) == -1) { // L: 65
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\""); // L: 67
					return true; // L: 68
				}
			} catch (Throwable var5) { // L: 70
				return false; // L: 71
			}
		} else if (var1 == 1) { // L: 74
			try {
				Object var10 = class27.method394(class29.field157, var2, new Object[]{(new URL(class29.field157.getCodeBase(), var0)).toString()}); // L: 76
				return var10 != null; // L: 77
			} catch (Throwable var6) { // L: 79
				return false; // L: 80
			}
		} else if (var1 == 2) { // L: 83
			try {
				class29.field157.getAppletContext().showDocument(new URL(class29.field157.getCodeBase(), var0), "_blank"); // L: 85
				return true; // L: 86
			} catch (Exception var7) { // L: 88
				return false; // L: 89
			}
		} else if (var1 == 3) { // L: 92
			try {
				Applet var3 = class29.field157; // L: 94
				JSObject.getWindow(var3).call("loggedout", (Object[])null); // L: 97
			} catch (Throwable var9) { // L: 100
			}

			try {
				class29.field157.getAppletContext().showDocument(new URL(class29.field157.getCodeBase(), var0), "_top"); // L: 102
				return true; // L: 103
			} catch (Exception var8) { // L: 105
				return false; // L: 106
			}
		} else {
			throw new IllegalArgumentException(); // L: 109
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-20"
	)
	static void method4482() {
		Login.Login_username = Login.Login_username.trim(); // L: 908
		if (Login.Login_username.length() == 0) { // L: 909
			class1.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 910
		} else {
			long var1 = SoundCache.method807(); // L: 914
			int var0;
			if (0L == var1) { // L: 915
				var0 = 5;
			} else {
				var0 = class1.method15(var1, Login.Login_username); // L: 916
			}

			switch(var0) { // L: 917
			case 2:
				class1.setLoginResponseString(Strings.field3595, Strings.field3634, Strings.field3597); // L: 928
				class275.method5201(6); // L: 929
				break; // L: 930
			case 3:
				class1.setLoginResponseString("", "Error connecting to server.", ""); // L: 935
				break;
			case 4:
				class1.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later."); // L: 922
				break; // L: 923
			case 5:
				class1.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later."); // L: 925
				break; // L: 926
			case 6:
				class1.setLoginResponseString("", "Error connecting to server.", ""); // L: 919
				break;
			case 7:
				class1.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username."); // L: 932
			}

		}
	} // L: 911 938

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1873535602"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0; // L: 595
		if (ClientPreferences.garbageCollector == null || !ClientPreferences.garbageCollector.isValid()) { // L: 596
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator(); // L: 598

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next(); // L: 599
					if (var2.isValid()) { // L: 601
						ClientPreferences.garbageCollector = var2; // L: 602
						GameEngine.garbageCollectorLastCheckTimeMs = -1L; // L: 603
						GameEngine.garbageCollectorLastCollectionTime = -1L; // L: 604
					}
				}
			} catch (Throwable var11) { // L: 609
			}
		}

		if (ClientPreferences.garbageCollector != null) { // L: 611
			long var9 = class111.method2516(); // L: 612
			long var3 = ClientPreferences.garbageCollector.getCollectionTime(); // L: 613
			if (GameEngine.garbageCollectorLastCollectionTime != -1L) { // L: 614
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime; // L: 615
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs; // L: 616
				if (var7 != 0L) { // L: 617
					var0 = (int)(100L * var5 / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3; // L: 619
			GameEngine.garbageCollectorLastCheckTimeMs = var9; // L: 620
		}

		return var0; // L: 622
	}
}
