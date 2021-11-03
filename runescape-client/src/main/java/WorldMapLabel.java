import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("i")
	@Export("text")
	String text;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1596677031
	)
	@Export("width")
	int width;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 136381791
	)
	@Export("height")
	int height;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILfo;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1; // L: 10
		this.width = var2; // L: 11
		this.height = var3; // L: 12
		this.size = var4; // L: 13
	} // L: 14

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1622810143"
	)
	static final void method3970() {
		PacketBuffer var0 = Client.packetWriter.packetBuffer; // L: 8002
		var0.importIndex(); // L: 8003
		int var1 = var0.readBits(8); // L: 8004
		int var2;
		if (var1 < Client.npcCount) { // L: 8005
			for (var2 = var1; var2 < Client.npcCount; ++var2) { // L: 8006
				Client.field592[++Client.field591 - 1] = Client.npcIndices[var2];
			}
		}

		if (var1 > Client.npcCount) { // L: 8008
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0; // L: 8009

			for (var2 = 0; var2 < var1; ++var2) { // L: 8010
				int var3 = Client.npcIndices[var2]; // L: 8011
				NPC var4 = Client.npcs[var3]; // L: 8012
				int var5 = var0.readBits(1); // L: 8013
				if (var5 == 0) { // L: 8014
					Client.npcIndices[++Client.npcCount - 1] = var3; // L: 8015
					var4.npcCycle = Client.cycle; // L: 8016
				} else {
					int var6 = var0.readBits(2); // L: 8019
					if (var6 == 0) { // L: 8020
						Client.npcIndices[++Client.npcCount - 1] = var3; // L: 8021
						var4.npcCycle = Client.cycle; // L: 8022
						Client.field513[++Client.field512 - 1] = var3; // L: 8023
					} else {
						int var7;
						int var8;
						if (var6 == 1) { // L: 8026
							Client.npcIndices[++Client.npcCount - 1] = var3; // L: 8027
							var4.npcCycle = Client.cycle; // L: 8028
							var7 = var0.readBits(3); // L: 8029
							var4.method2258(var7, (byte)1); // L: 8030
							var8 = var0.readBits(1); // L: 8031
							if (var8 == 1) { // L: 8032
								Client.field513[++Client.field512 - 1] = var3;
							}
						} else if (var6 == 2) { // L: 8035
							Client.npcIndices[++Client.npcCount - 1] = var3; // L: 8036
							var4.npcCycle = Client.cycle; // L: 8037
							var7 = var0.readBits(3); // L: 8038
							var4.method2258(var7, (byte)2); // L: 8039
							var8 = var0.readBits(3); // L: 8040
							var4.method2258(var8, (byte)2); // L: 8041
							int var9 = var0.readBits(1); // L: 8042
							if (var9 == 1) {
								Client.field513[++Client.field512 - 1] = var3; // L: 8043
							}
						} else if (var6 == 3) { // L: 8046
							Client.field592[++Client.field591 - 1] = var3; // L: 8047
						}
					}
				}
			}

		}
	} // L: 8051
}
