import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("t")
	@Export("SpriteBuffer_yOffsets")
	public static int[] SpriteBuffer_yOffsets;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1093494781
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 601492967
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1459181163
	)
	public int field2117;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1902503467
	)
	public int field2114;

	protected RouteStrategy() {
	} // L: 9

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIILgf;I)Z",
		garbageValue = "-563456214"
	)
	@Export("hasArrived")
	public abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1664950073"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) { // L: 4503
			SecureRandomFuture.clientPreferences.roofsHidden = !SecureRandomFuture.clientPreferences.roofsHidden; // L: 4504
			class127.savePreferences(); // L: 4505
			if (SecureRandomFuture.clientPreferences.roofsHidden) { // L: 4506
				class194.addGameMessage(99, "", "Roofs are now all hidden");
			} else {
				class194.addGameMessage(99, "", "Roofs will only be removed selectively"); // L: 4507
			}
		}

		if (var0.equalsIgnoreCase("displayfps")) { // L: 4509
			Client.displayFps = !Client.displayFps;
		}

		if (var0.equalsIgnoreCase("renderself")) { // L: 4510
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) {
			Client.showMouseOverText = !Client.showMouseOverText; // L: 4511
		}

		if (Client.staffModLevel >= 2) { // L: 4512
			if (var0.equalsIgnoreCase("errortest")) { // L: 4513
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) { // L: 4514
				Varcs.worldMap.showCoord = !Varcs.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) { // L: 4515
				Client.displayFps = true;
			}

			if (var0.equalsIgnoreCase("fpsoff")) { // L: 4516
				Client.displayFps = false;
			}

			if (var0.equalsIgnoreCase("gc")) { // L: 4517
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) { // L: 4518
				Varcs.method2411();
			}
		}

		PacketBufferNode var1 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2846, Client.packetWriter.isaacCipher); // L: 4521
		var1.packetBuffer.writeByte(var0.length() + 1); // L: 4522
		var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 4523
		Client.packetWriter.addNode(var1); // L: 4524
	} // L: 4525
}
