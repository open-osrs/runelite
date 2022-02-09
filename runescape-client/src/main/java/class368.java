import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("np")
public class class368 {
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(S)[Lpd;",
		garbageValue = "12112"
	)
	@Export("FillMode_values")
	public static FillMode[] FillMode_values() {
		return new FillMode[]{FillMode.field4588, FillMode.SOLID, FillMode.field4591}; // L: 15
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(ZLpc;I)V",
		garbageValue = "89997932"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field625 = 0; // L: 7561
		Client.field548 = 0; // L: 7562
		SecureRandomCallable.method2059(); // L: 7563
		class20.method290(var0, var1); // L: 7564
		class142.method2952(var1); // L: 7565

		int var2;
		for (var2 = 0; var2 < Client.field625; ++var2) { // L: 7566
			int var3 = Client.field683[var2]; // L: 7567
			if (Client.npcs[var3].npcCycle != Client.cycle) { // L: 7568
				Client.npcs[var3].definition = null; // L: 7569
				Client.npcs[var3] = null; // L: 7570
			}
		}

		if (var1.offset != Client.packetWriter.serverPacketLength) { // L: 7573
			throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength);
		} else {
			for (var2 = 0; var2 < Client.npcCount; ++var2) { // L: 7574
				if (Client.npcs[Client.npcIndices[var2]] == null) { // L: 7575
					throw new RuntimeException(var2 + "," + Client.npcCount); // L: 7576
				}
			}

		}
	} // L: 7579
}
