import java.io.DataInputStream;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lf")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	public static NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	public static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 996764791
	)
	static int field3998;
	@ObfuscatedName("k")
	@Export("ArchiveDiskActionHandler_lock")
	static Object ArchiveDiskActionHandler_lock;
	@ObfuscatedName("nc")
	@ObfuscatedGetter(
		intValue = 1167654825
	)
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque(); // L: 9
		ArchiveDiskActionHandler_responseQueue = new NodeDeque(); // L: 10
		field3998 = 0; // L: 11
		ArchiveDiskActionHandler_lock = new Object();
	} // L: 12

	ArchiveDiskActionHandler() {
	} // L: 15

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 63
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last(); // L: 64
				}

				if (var1 != null) { // L: 66
					if (var1.type == 0) {
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length); // L: 68
						synchronized(ArchiveDiskActionHandler_requestQueue) {
							var1.remove(); // L: 70
						} // L: 71
					} else if (var1.type == 1) {
						var1.data = var1.archiveDisk.read((int)var1.key);
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 75
							ArchiveDiskActionHandler_responseQueue.addFirst(var1); // L: 76
						}
					}

					synchronized(ArchiveDiskActionHandler_lock) {
						if (field3998 <= 1) { // L: 80
							field3998 = 0; // L: 81
							ArchiveDiskActionHandler_lock.notifyAll();
							return; // L: 83
						}

						field3998 = 600; // L: 85
					}
				} else {
					class241.method4815(100L); // L: 89
					synchronized(ArchiveDiskActionHandler_lock) {
						if (field3998 <= 1) {
							field3998 = 0;
							ArchiveDiskActionHandler_lock.notifyAll();
							return;
						}

						--field3998;
					}
				}
			}
		} catch (Exception var13) { // L: 101
			RunException_sendStackTrace((String)null, var13); // L: 102
		}
	} // L: 104

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V",
		garbageValue = "9"
	)
	@Export("RunException_sendStackTrace")
	public static void RunException_sendStackTrace(String var0, Throwable var1) {
		if (var1 != null) {
			var1.printStackTrace();
		} else {
			try {
				String var2 = ""; // L: 33
				if (var1 != null) { // L: 34
					var2 = class427.method7379(var1);
				}

				if (var0 != null) { // L: 35
					if (var1 != null) {
						var2 = var2 + " | ";
					}

					var2 = var2 + var0;
				}

				System.out.println("Error: " + var2); // L: 39
				var2 = var2.replace(':', '.'); // L: 40
				var2 = var2.replace('@', '_');
				var2 = var2.replace('&', '_'); // L: 42
				var2 = var2.replace('#', '_');
				if (RunException.RunException_applet == null) { // L: 44
					return;
				}

				URL var3 = new URL(RunException.RunException_applet.getCodeBase(), "clienterror.ws?c=" + class385.RunException_revision + "&u=" + RunException.localPlayerName + "&v1=" + TaskHandler.javaVendor + "&v2=" + TaskHandler.javaVersion + "&ct=" + class430.clientType + "&e=" + var2);
				DataInputStream var4 = new DataInputStream(var3.openStream()); // L: 46
				var4.read();
				var4.close(); // L: 48
			} catch (Exception var5) { // L: 50
			}

		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Lpj;B)Ljava/lang/String;",
		garbageValue = "-25"
	)
	public static String method5612(CharSequence var0, LoginType var1) {
		if (var0 == null) { // L: 36
			return null;
		} else {
			int var2 = 0; // L: 37

			int var3;
			boolean var4;
			char var5;
			for (var3 = var0.length(); var2 < var3; ++var2) { // L: 38 41 51
				var5 = var0.charAt(var2); // L: 43
				var4 = var5 == 160 || var5 == ' ' || var5 == '_' || var5 == '-'; // L: 45
				if (!var4) { // L: 47
					break;
				}
			}

			while (var3 > var2) { // L: 55
				var5 = var0.charAt(var3 - 1); // L: 57
				var4 = var5 == 160 || var5 == ' ' || var5 == '_' || var5 == '-'; // L: 59
				if (!var4) { // L: 61
					break;
				}

				--var3; // L: 65
			}

			int var10 = var3 - var2; // L: 67
			if (var10 >= 1) { // L: 69
				byte var6;
				if (var1 == null) { // L: 73
					var6 = 12; // L: 74
				} else {
					switch(var1.field4617) { // L: 77
					case 0:
						var6 = 20; // L: 82
						break;
					default:
						var6 = 12; // L: 79
					}
				}

				if (var10 <= var6) { // L: 86
					StringBuilder var9 = new StringBuilder(var10); // L: 90

					for (int var11 = var2; var11 < var3; ++var11) { // L: 91
						char var7 = var0.charAt(var11); // L: 92
						if (BufferedSource.method6702(var7)) { // L: 93
							char var8 = Language.method5877(var7); // L: 94
							if (var8 != 0) { // L: 95
								var9.append(var8); // L: 96
							}
						}
					}

					if (var9.length() == 0) { // L: 98
						return null;
					}

					return var9.toString(); // L: 99
				}
			}

			return null; // L: 88
		}
	}
}
