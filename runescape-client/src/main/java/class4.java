import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("l")
public class class4 extends class14 {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -205584469
	)
	int field41;
	@ObfuscatedName("c")
	String field40;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lo;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lo;)V"
	)
	class4(class2 var1) {
		this.this$0 = var1; // L: 323
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "110401227"
	)
	void vmethod339(Buffer var1) {
		this.field41 = var1.readInt(); // L: 326
		this.field40 = var1.readStringCp1252NullTerminated(); // L: 327
	} // L: 328

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lx;I)V",
		garbageValue = "-1535989118"
	)
	void vmethod338(class11 var1) {
		var1.method131(this.field41, this.field40); // L: 331
	} // L: 332

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1187192027"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1; // L: 115
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-2119138852"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) { // L: 3873
			class12.clientPreferences.roofsHidden = !class12.clientPreferences.roofsHidden; // L: 3874
			KeyHandler.savePreferences(); // L: 3875
			if (class12.clientPreferences.roofsHidden) { // L: 3876
				WorldMapScaleHandler.addGameMessage(99, "", "Roofs are now all hidden");
			} else {
				WorldMapScaleHandler.addGameMessage(99, "", "Roofs will only be removed selectively"); // L: 3877
			}
		}

		if (var0.equalsIgnoreCase("displayfps")) { // L: 3879
			Client.displayFps = !Client.displayFps;
		}

		if (var0.equalsIgnoreCase("renderself")) { // L: 3880
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) { // L: 3881
			Client.showMouseOverText = !Client.showMouseOverText;
		}

		if (Client.staffModLevel >= 2) { // L: 3882
			if (var0.equalsIgnoreCase("errortest")) { // L: 3883
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) { // L: 3884
				NetSocket.worldMap.showCoord = !NetSocket.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) { // L: 3885
				Client.displayFps = true;
			}

			if (var0.equalsIgnoreCase("fpsoff")) { // L: 3886
				Client.displayFps = false;
			}

			if (var0.equalsIgnoreCase("gc")) {
				System.gc(); // L: 3887
			}

			if (var0.equalsIgnoreCase("clientdrop")) { // L: 3888
				BuddyRankComparator.method2492();
			}
		}

		PacketBufferNode var1 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2603, Client.packetWriter.isaacCipher); // L: 3891
		var1.packetBuffer.writeByte(var0.length() + 1); // L: 3892
		var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 3893
		Client.packetWriter.addNode(var1); // L: 3894
	} // L: 3895

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)Ljava/lang/String;",
		garbageValue = "9"
	)
	static String method57(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://"; // L: 11635
		if (Client.gameBuild == 1) { // L: 11636
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) { // L: 11637
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) { // L: 11638
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) { // L: 11639
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) { // L: 11640
			var0 = "local";
		}

		String var3 = ""; // L: 11641
		if (class253.field3136 != null) { // L: 11642
			var3 = "/p=" + class253.field3136;
		}

		String var4 = "runescape.com"; // L: 11643
		return var2 + var0 + "." + var4 + "/l=" + class7.clientLanguage + "/a=" + class44.field310 + var3 + "/"; // L: 11644
	}
}
