import java.io.DataInputStream;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
public abstract class class249 implements class251 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1471785879
	)
	protected int field2884;

	@ObfuscatedSignature(
		descriptor = "(Lkx;Llb;I)V"
	)
	protected class249(StudioGame var1, Language var2, int var3) {
		this.field2884 = var3; // L: 10
	} // L: 11

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V",
		garbageValue = "41"
	)
	@Export("RunException_sendStackTrace")
	public static void RunException_sendStackTrace(String var0, Throwable var1) {
		if (var1 != null) {
			var1.printStackTrace();
		} else {
			try {
				String var2 = ""; // L: 34
				if (var1 != null) { // L: 35
					var2 = class301.method5755(var1);
				}

				if (var0 != null) { // L: 36
					if (var1 != null) { // L: 37
						var2 = var2 + " | ";
					}

					var2 = var2 + var0; // L: 38
				}

				System.out.println("Error: " + var2); // L: 40
				var2 = var2.replace(':', '.'); // L: 41
				var2 = var2.replace('@', '_'); // L: 42
				var2 = var2.replace('&', '_'); // L: 43
				var2 = var2.replace('#', '_'); // L: 44
				if (RunException.RunException_applet == null) { // L: 45
					return;
				}

				URL var3 = new URL(RunException.RunException_applet.getCodeBase(), "clienterror.ws?cv=" + RunException.RunException_revision + "&cs=" + RunException.field4839 + "&u=" + RunException.localPlayerName + "&v1=" + class360.javaVendor + "&v2=" + TaskHandler.javaVersion + "&ct=" + class20.clientType + "&e=" + var2); // L: 46
				DataInputStream var4 = new DataInputStream(var3.openStream()); // L: 47
				var4.read(); // L: 48
				var4.close(); // L: 49
			} catch (Exception var5) { // L: 51
			}

		}
	} // L: 52

	@ObfuscatedName("i")
	static final void method5123(long var0) {
		ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var0; // L: 95
	} // L: 96
}
