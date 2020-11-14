import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kj")
public class class308 {
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-119"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) { // L: 3686
			GrandExchangeOfferAgeComparator.clientPreferences.roofsHidden = !GrandExchangeOfferAgeComparator.clientPreferences.roofsHidden; // L: 3687
			Tile.savePreferences(); // L: 3688
			if (GrandExchangeOfferAgeComparator.clientPreferences.roofsHidden) { // L: 3689
				DevicePcmPlayerProvider.addGameMessage(99, "", "Roofs are now all hidden");
			} else {
				DevicePcmPlayerProvider.addGameMessage(99, "", "Roofs will only be removed selectively"); // L: 3690
			}
		}

		if (var0.equalsIgnoreCase("displayfps")) { // L: 3692
			Client.displayFps = !Client.displayFps;
		}

		if (var0.equalsIgnoreCase("renderself")) { // L: 3693
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) { // L: 3694
			Client.showMouseOverText = !Client.showMouseOverText;
		}

		if (Client.staffModLevel >= 2) { // L: 3695
			if (var0.equalsIgnoreCase("errortest")) { // L: 3696
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) { // L: 3697
				KeyHandler.worldMap.showCoord = !KeyHandler.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) { // L: 3698
				Client.displayFps = true;
			}

			if (var0.equalsIgnoreCase("fpsoff")) { // L: 3699
				Client.displayFps = false;
			}

			if (var0.equalsIgnoreCase("gc")) { // L: 3700
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) { // L: 3701
				FloorDecoration.method2986();
			}
		}

		PacketBufferNode var1 = class4.getPacketBufferNode(ClientPacket.field2331, Client.packetWriter.isaacCipher); // L: 3704
		var1.packetBuffer.writeByte(var0.length() + 1); // L: 3705
		var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 3706
		Client.packetWriter.addNode(var1); // L: 3707
	} // L: 3708
}
