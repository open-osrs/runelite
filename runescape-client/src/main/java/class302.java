import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kd")
public class class302 {
	@ObfuscatedName("v")
	public static char[] field3743;
	@ObfuscatedName("n")
	static char[] field3742;
	@ObfuscatedName("f")
	static char[] field3744;
	@ObfuscatedName("y")
	static int[] field3746;
	@ObfuscatedName("r")
	@Export("SpriteBuffer_spriteHeights")
	public static int[] SpriteBuffer_spriteHeights;

	static {
		field3743 = new char[64]; // L: 7

		int var0;
		for (var0 = 0; var0 < 26; ++var0) { // L: 8
			field3743[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 9
			field3743[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 10
			field3743[var0] = (char)(var0 + 48 - 52);
		}

		field3743[62] = '+'; // L: 11
		field3743[63] = '/'; // L: 12
		field3742 = new char[64]; // L: 18

		for (var0 = 0; var0 < 26; ++var0) { // L: 19
			field3742[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 20
			field3742[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 21
			field3742[var0] = (char)(var0 + 48 - 52);
		}

		field3742[62] = '*'; // L: 22
		field3742[63] = '-'; // L: 23
		field3744 = new char[64]; // L: 29

		for (var0 = 0; var0 < 26; ++var0) { // L: 30
			field3744[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 31
			field3744[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 32
			field3744[var0] = (char)(var0 + 48 - 52);
		}

		field3744[62] = '-'; // L: 33
		field3744[63] = '_'; // L: 34
		field3746 = new int[128]; // L: 40

		for (var0 = 0; var0 < field3746.length; ++var0) { // L: 41
			field3746[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) { // L: 42
			field3746[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) { // L: 43
			field3746[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) { // L: 44
			field3746[var0] = var0 - 48 + 52;
		}

		int[] var2 = field3746; // L: 45
		field3746[43] = 62; // L: 46
		var2[42] = 62; // L: 47
		int[] var1 = field3746; // L: 48
		field3746[47] = 63; // L: 49
		var1[45] = 63; // L: 50
	} // L: 51

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1106369714"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) { // L: 3479
			ObjectComposition.clientPreferences.roofsHidden = !ObjectComposition.clientPreferences.roofsHidden; // L: 3480
			TileItem.savePreferences(); // L: 3481
			if (ObjectComposition.clientPreferences.roofsHidden) { // L: 3482
				World.addGameMessage(99, "", "Roofs are now all hidden");
			} else {
				World.addGameMessage(99, "", "Roofs will only be removed selectively"); // L: 3483
			}
		}

		if (var0.equalsIgnoreCase("displayfps")) { // L: 3485
			Client.displayFps = !Client.displayFps;
		}

		if (var0.equalsIgnoreCase("renderself")) { // L: 3486
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) { // L: 3487
			Client.showMouseOverText = !Client.showMouseOverText;
		}

		if (Client.staffModLevel >= 2) { // L: 3488
			if (var0.equalsIgnoreCase("errortest")) { // L: 3489
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) { // L: 3490
				class243.worldMap.showCoord = !class243.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) { // L: 3491
				Client.displayFps = true;
			}

			if (var0.equalsIgnoreCase("fpsoff")) { // L: 3492
				Client.displayFps = false;
			}

			if (var0.equalsIgnoreCase("gc")) { // L: 3493
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) { // L: 3494
				NetFileRequest.method4912();
			}
		}

		PacketBufferNode var1 = class21.getPacketBufferNode(ClientPacket.field2610, Client.packetWriter.isaacCipher); // L: 3497
		var1.packetBuffer.writeByte(var0.length() + 1); // L: 3498
		var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 3499
		Client.packetWriter.addNode(var1); // L: 3500
	} // L: 3501
}
