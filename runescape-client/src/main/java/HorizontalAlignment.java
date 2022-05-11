import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	field1938(2, 0),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(0, 1),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	field1937(1, 2);

	@ObfuscatedName("jt")
	@ObfuscatedGetter(
		intValue = -88443571
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -150444483
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -47587237
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3; // L: 14
		this.id = var4; // L: 15
	} // L: 16

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "30"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 20
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(ZLpc;B)V",
		garbageValue = "-31"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field621 = 0; // L: 8002
		Client.field565 = 0; // L: 8003
		PacketBuffer var2 = Client.packetWriter.packetBuffer; // L: 8005
		var2.importIndex(); // L: 8006
		int var3 = var2.readBits(8); // L: 8007
		int var4;
		if (var3 < Client.npcCount) { // L: 8008
			for (var4 = var3; var4 < Client.npcCount; ++var4) { // L: 8009
				Client.field616[++Client.field621 - 1] = Client.npcIndices[var4];
			}
		}

		if (var3 > Client.npcCount) { // L: 8011
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0; // L: 8012

			for (var4 = 0; var4 < var3; ++var4) { // L: 8013
				int var5 = Client.npcIndices[var4]; // L: 8014
				NPC var6 = Client.npcs[var5]; // L: 8015
				int var7 = var2.readBits(1); // L: 8016
				if (var7 == 0) { // L: 8017
					Client.npcIndices[++Client.npcCount - 1] = var5; // L: 8018
					var6.npcCycle = Client.cycle; // L: 8019
				} else {
					int var8 = var2.readBits(2); // L: 8022
					if (var8 == 0) { // L: 8023
						Client.npcIndices[++Client.npcCount - 1] = var5; // L: 8024
						var6.npcCycle = Client.cycle; // L: 8025
						Client.field601[++Client.field565 - 1] = var5; // L: 8026
					} else {
						int var9;
						int var10;
						if (var8 == 1) { // L: 8029
							Client.npcIndices[++Client.npcCount - 1] = var5; // L: 8030
							var6.npcCycle = Client.cycle; // L: 8031
							var9 = var2.readBits(3); // L: 8032
							var6.method2340(var9, class193.field2251); // L: 8033
							var10 = var2.readBits(1); // L: 8034
							if (var10 == 1) { // L: 8035
								Client.field601[++Client.field565 - 1] = var5;
							}
						} else if (var8 == 2) { // L: 8038
							Client.npcIndices[++Client.npcCount - 1] = var5; // L: 8039
							var6.npcCycle = Client.cycle; // L: 8040
							if (var2.readBits(1) == 1) { // L: 8041
								var9 = var2.readBits(3); // L: 8042
								var6.method2340(var9, class193.field2248); // L: 8043
								var10 = var2.readBits(3); // L: 8044
								var6.method2340(var10, class193.field2248); // L: 8045
							} else {
								var9 = var2.readBits(3); // L: 8048
								var6.method2340(var9, class193.field2249); // L: 8049
							}

							var9 = var2.readBits(1); // L: 8051
							if (var9 == 1) {
								Client.field601[++Client.field565 - 1] = var5; // L: 8052
							}
						} else if (var8 == 3) { // L: 8055
							Client.field616[++Client.field621 - 1] = var5; // L: 8056
						}
					}
				}
			}

			class82.method2098(var0, var1); // L: 8061
			JagexCache.method3158(var1); // L: 8062

			int var11;
			for (var11 = 0; var11 < Client.field621; ++var11) { // L: 8063
				var3 = Client.field616[var11]; // L: 8064
				if (Client.npcs[var3].npcCycle != Client.cycle) { // L: 8065
					Client.npcs[var3].definition = null; // L: 8066
					Client.npcs[var3] = null; // L: 8067
				}
			}

			if (var1.offset != Client.packetWriter.serverPacketLength) { // L: 8070
				throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength);
			} else {
				for (var11 = 0; var11 < Client.npcCount; ++var11) { // L: 8071
					if (Client.npcs[Client.npcIndices[var11]] == null) { // L: 8072
						throw new RuntimeException(var11 + "," + Client.npcCount); // L: 8073
					}
				}

			}
		}
	} // L: 8076
}
