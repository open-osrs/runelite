import java.applet.Applet;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("kj")
@Implements("Skills")
public class Skills {
	@ObfuscatedName("q")
	@Export("Skills_enabled")
	public static final boolean[] Skills_enabled;
	@ObfuscatedName("l")
	@Export("Skills_experienceTable")
	public static int[] Skills_experienceTable;

	static {
		Skills_enabled = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false}; // L: 5
		Skills_experienceTable = new int[99]; // L: 6
		int var0 = 0; // L: 9

		for (int var1 = 0; var1 < 99; ++var1) { // L: 10
			int var2 = var1 + 1; // L: 11
			int var3 = (int)((double)var2 + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D)); // L: 12
			var0 += var3; // L: 13
			Skills_experienceTable[var1] = var0 / 4; // L: 14
		}

	} // L: 16

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Z",
		garbageValue = "-363880091"
	)
	static boolean method5578(String var0, int var1, String var2) {
		if (var1 == 0) { // L: 63
			try {
				if (!class29.field168.startsWith("win")) { // L: 65
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
				Applet var7 = class29.field170; // L: 81
				Object[] var5 = new Object[]{(new URL(class29.field170.getCodeBase(), var0)).toString()}; // L: 82
				Object var3 = JSObject.getWindow(var7).call(var2, var5); // L: 85
				return var3 != null; // L: 88
			} catch (Throwable var9) { // L: 90
				return false; // L: 91
			}
		} else if (var1 == 2) { // L: 94
			try {
				class29.field170.getAppletContext().showDocument(new URL(class29.field170.getCodeBase(), var0), "_blank"); // L: 96
				return true; // L: 97
			} catch (Exception var10) { // L: 99
				return false; // L: 100
			}
		} else if (var1 == 3) { // L: 103
			try {
				class27.method370(class29.field170, "loggedout"); // L: 105
			} catch (Throwable var12) { // L: 107
			}

			try {
				class29.field170.getAppletContext().showDocument(new URL(class29.field170.getCodeBase(), var0), "_top"); // L: 109
				return true; // L: 110
			} catch (Exception var11) { // L: 112
				return false; // L: 113
			}
		} else {
			throw new IllegalArgumentException(); // L: 116
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "([BB)[B",
		garbageValue = "-45"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 370
		int var2 = var1.readUnsignedByte(); // L: 371
		int var3 = var1.readInt(); // L: 372
		if (var3 < 0 || AbstractArchive.field4026 != 0 && var3 > AbstractArchive.field4026) { // L: 373
			throw new RuntimeException(); // L: 374
		} else if (var2 == 0) { // L: 376
			byte[] var6 = new byte[var3]; // L: 377
			var1.readBytes(var6, 0, var3); // L: 378
			return var6; // L: 379
		} else {
			int var4 = var1.readInt(); // L: 382
			if (var4 >= 0 && (AbstractArchive.field4026 == 0 || var4 <= AbstractArchive.field4026)) { // L: 383
				byte[] var5 = new byte[var4]; // L: 386
				if (var2 == 1) { // L: 387
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5); // L: 388
				}

				return var5; // L: 389
			} else {
				throw new RuntimeException(); // L: 384
			}
		}
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1857636420"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = WallDecoration.getPacketBufferNode(ClientPacket.field2967, Client.packetWriter.isaacCipher); // L: 9801
		var2.packetBuffer.writeIntME(var0); // L: 9802
		var2.packetBuffer.method7551(var1); // L: 9803
		Client.packetWriter.addNode(var2); // L: 9804
	} // L: 9805

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-224237635"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) { // L: 12447
			PacketBufferNode var1 = WallDecoration.getPacketBufferNode(ClientPacket.field2970, Client.packetWriter.isaacCipher); // L: 12449
			var1.packetBuffer.writeByte(class392.stringCp1252NullTerminatedByteSize(var0)); // L: 12450
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 12451
			Client.packetWriter.addNode(var1); // L: 12452
		}
	} // L: 12453
}
