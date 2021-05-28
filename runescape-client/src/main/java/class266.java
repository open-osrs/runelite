import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jq")
public class class266 {
	static {
		int var0 = 0; // L: 9
		int var1 = 0; // L: 10
		class261[] var2 = WorldMapData_1.method3525(); // L: 12

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 13
			class261 var4 = var2[var3]; // L: 14
			if (var4.field3199 > var0) {
				var0 = var4.field3199; // L: 16
			}

			if (var4.field3202 > var1) { // L: 17
				var1 = var4.field3202;
			}
		}

	} // L: 21

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V",
		garbageValue = "2070444539"
	)
	@Export("RunException_sendStackTrace")
	public static void RunException_sendStackTrace(String var0, Throwable var1) {
		if (var1 != null) {
			var1.printStackTrace();
		} else {
			try {
				String var2 = ""; // L: 33
				if (var1 != null) { // L: 34
					Throwable var4 = var1; // L: 36
					String var5;
					if (var1 instanceof RunException) { // L: 39
						RunException var6 = (RunException)var1; // L: 40
						var5 = var6.message + " | "; // L: 41
						var4 = var6.throwable; // L: 42
					} else {
						var5 = ""; // L: 44
					}

					StringWriter var18 = new StringWriter(); // L: 45
					PrintWriter var7 = new PrintWriter(var18); // L: 46
					var4.printStackTrace(var7); // L: 47
					var7.close(); // L: 48
					String var8 = var18.toString(); // L: 49
					BufferedReader var9 = new BufferedReader(new StringReader(var8)); // L: 50
					String var10 = var9.readLine(); // L: 51

					label63:
					while (true) {
						while (true) {
							String var11 = var9.readLine(); // L: 53
							if (var11 == null) { // L: 54
								var5 = var5 + "| " + var10; // L: 72
								var2 = var5; // L: 75
								break label63;
							}

							int var12 = var11.indexOf(40); // L: 55
							int var13 = var11.indexOf(41, var12 + 1); // L: 56
							if (var12 >= 0 && var13 >= 0) { // L: 57
								String var14 = var11.substring(var12 + 1, var13); // L: 58
								int var15 = var14.indexOf(".java:"); // L: 59
								if (var15 >= 0) { // L: 60
									var14 = var14.substring(0, var15) + var14.substring(var15 + 5); // L: 61
									var5 = var5 + var14 + ' '; // L: 62
									continue; // L: 63
								}

								var11 = var11.substring(0, var12); // L: 65
							}

							var11 = var11.trim(); // L: 67
							var11 = var11.substring(var11.lastIndexOf(32) + 1); // L: 68
							var11 = var11.substring(var11.lastIndexOf(9) + 1); // L: 69
							var5 = var5 + var11 + ' '; // L: 70
						}
					}
				}

				if (var0 != null) { // L: 77
					if (var1 != null) { // L: 78
						var2 = var2 + " | ";
					}

					var2 = var2 + var0; // L: 79
				}

				System.out.println("Error: " + var2); // L: 81
				var2 = var2.replace(':', '.'); // L: 82
				var2 = var2.replace('@', '_'); // L: 83
				var2 = var2.replace('&', '_'); // L: 84
				var2 = var2.replace('#', '_'); // L: 85
				if (RunException.RunException_applet == null) { // L: 86
					return;
				}

				URL var3 = new URL(RunException.RunException_applet.getCodeBase(), "clienterror.ws?c=" + RunException.RunException_revision + "&u=" + RunException.localPlayerName + "&v1=" + TaskHandler.javaVendor + "&v2=" + TaskHandler.javaVersion + "&ct=" + RunException.clientType + "&e=" + var2); // L: 87
				DataInputStream var17 = new DataInputStream(var3.openStream()); // L: 88
				var17.read(); // L: 89
				var17.close(); // L: 90
			} catch (Exception var16) { // L: 92
			}

		}
	} // L: 93
}
