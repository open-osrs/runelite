import java.applet.Applet;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("al")
public class class29 {
	@ObfuscatedName("rp")
	static boolean field162;
	@ObfuscatedName("i")
	static Applet field157;
	@ObfuscatedName("w")
	static String field158;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	static IndexedSprite field159;

	static {
		field157 = null; // L: 10
		field158 = ""; // L: 11
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2136894012"
	)
	static final void method414() {
		boolean var0 = false; // L: 9261

		while (!var0) { // L: 9262
			var0 = true; // L: 9263

			for (int var1 = 0; var1 < Client.menuOptionsCount - 1; ++var1) { // L: 9264
				if (Client.menuOpcodes[var1] < 1000 && Client.menuOpcodes[var1 + 1] > 1000) { // L: 9265
					String var2 = Client.menuTargets[var1]; // L: 9266
					Client.menuTargets[var1] = Client.menuTargets[var1 + 1]; // L: 9267
					Client.menuTargets[var1 + 1] = var2; // L: 9268
					String var3 = Client.menuActions[var1]; // L: 9269
					Client.menuActions[var1] = Client.menuActions[var1 + 1]; // L: 9270
					Client.menuActions[var1 + 1] = var3; // L: 9271
					int var4 = Client.menuOpcodes[var1]; // L: 9272
					Client.menuOpcodes[var1] = Client.menuOpcodes[var1 + 1]; // L: 9273
					Client.menuOpcodes[var1 + 1] = var4; // L: 9274
					var4 = Client.menuArguments1[var1]; // L: 9275
					Client.menuArguments1[var1] = Client.menuArguments1[var1 + 1]; // L: 9276
					Client.menuArguments1[var1 + 1] = var4; // L: 9277
					var4 = Client.menuArguments2[var1]; // L: 9278
					Client.menuArguments2[var1] = Client.menuArguments2[var1 + 1]; // L: 9279
					Client.menuArguments2[var1 + 1] = var4; // L: 9280
					var4 = Client.menuIdentifiers[var1]; // L: 9281
					Client.menuIdentifiers[var1] = Client.menuIdentifiers[var1 + 1]; // L: 9282
					Client.menuIdentifiers[var1 + 1] = var4; // L: 9283
					boolean var5 = Client.menuShiftClick[var1]; // L: 9284
					Client.menuShiftClick[var1] = Client.menuShiftClick[var1 + 1]; // L: 9285
					Client.menuShiftClick[var1 + 1] = var5; // L: 9286
					var0 = false; // L: 9287
				}
			}
		}

	} // L: 9291

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1998570042"
	)
	static void method413() {
		Client.packetWriter.addNode(AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2742, Client.packetWriter.isaacCipher)); // L: 12016
		Client.oculusOrbState = 0; // L: 12017
	} // L: 12018
}
