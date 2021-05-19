import java.io.DataInputStream;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ae")
public class class27 extends class14 {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -569986119
	)
	int field225;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lo;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lo;)V"
	)
	class27(class2 var1) {
		this.this$0 = var1;
		this.field225 = -1; // L: 144
	} // L: 146

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "110401227"
	)
	void vmethod339(Buffer var1) {
		this.field225 = var1.readUnsignedShort(); // L: 149
	} // L: 150

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lx;I)V",
		garbageValue = "-1535989118"
	)
	void vmethod338(class11 var1) {
		var1.method123(this.field225); // L: 153
	} // L: 154

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V",
		garbageValue = "-1858770079"
	)
	@Export("RunException_sendStackTrace")
	public static void RunException_sendStackTrace(String var0, Throwable var1) {
		if (var1 != null) {
			var1.printStackTrace();
		} else {
			try {
				String var2 = ""; // L: 33
				if (var1 != null) { // L: 34
					var2 = WorldMapCacheName.method3646(var1);
				}

				if (var0 != null) { // L: 35
					if (var1 != null) { // L: 36
						var2 = var2 + " | ";
					}

					var2 = var2 + var0; // L: 37
				}

				System.out.println("Error: " + var2); // L: 39
				var2 = var2.replace(':', '.'); // L: 40
				var2 = var2.replace('@', '_'); // L: 41
				var2 = var2.replace('&', '_'); // L: 42
				var2 = var2.replace('#', '_'); // L: 43
				if (RunException.RunException_applet == null) { // L: 44
					return;
				}

				URL var3 = new URL(RunException.RunException_applet.getCodeBase(), "clienterror.ws?c=" + TileItem.RunException_revision + "&u=" + RunException.localPlayerName + "&v1=" + TaskHandler.javaVendor + "&v2=" + TaskHandler.javaVersion + "&ct=" + RunException.clientType + "&e=" + var2); // L: 45
				DataInputStream var4 = new DataInputStream(var3.openStream()); // L: 46
				var4.read(); // L: 47
				var4.close(); // L: 48
			} catch (Exception var5) { // L: 50
			}

		}
	} // L: 51
}
