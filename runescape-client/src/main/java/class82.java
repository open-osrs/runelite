import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
public enum class82 implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lcs;"
	)
	field1073(0, -1),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lcs;"
	)
	field1079(1, 1),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lcs;"
	)
	field1078(2, 7),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lcs;"
	)
	field1075(3, 8),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lcs;"
	)
	field1076(4, 9);

	@ObfuscatedName("s")
	@Export("ItemDefinition_inMembersWorld")
	public static boolean ItemDefinition_inMembersWorld;
	@ObfuscatedName("r")
	static int[] field1072;
	@ObfuscatedName("ax")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	static Client client;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 2093138331
	)
	final int field1077;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 612324331
	)
	final int field1081;

	class82(int var3, int var4) {
		this.field1077 = var3; // L: 20
		this.field1081 = var4; // L: 21
	} // L: 22

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "30"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1081; // L: 26
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgy;",
		garbageValue = "1"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0); // L: 79
		if (var1 != null) { // L: 80
			return var1;
		} else {
			byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0); // L: 81
			var1 = new ObjectComposition(); // L: 82
			var1.id = var0; // L: 83
			if (var2 != null) { // L: 84
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 85
			if (var1.isSolid) { // L: 86
				var1.interactType = 0; // L: 87
				var1.boolean1 = false; // L: 88
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0); // L: 90
			return var1; // L: 91
		}
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(ZLpc;B)V",
		garbageValue = "-25"
	)
	static final void method2098(boolean var0, PacketBuffer var1) {
		while (true) {
			if (var1.bitsRemaining(Client.packetWriter.serverPacketLength) >= 27) { // L: 8080
				int var2 = var1.readBits(15); // L: 8081
				if (var2 != 32767) { // L: 8082
					boolean var3 = false; // L: 8083
					if (Client.npcs[var2] == null) { // L: 8084
						Client.npcs[var2] = new NPC(); // L: 8085
						var3 = true; // L: 8086
					}

					NPC var4 = Client.npcs[var2]; // L: 8088
					Client.npcIndices[++Client.npcCount - 1] = var2; // L: 8089
					var4.npcCycle = Client.cycle; // L: 8090
					int var5;
					int var6;
					int var7;
					int var10;
					if (class393.field4428) { // L: 8094
						int var8 = Client.defaultRotations[var1.readBits(3)]; // L: 8095
						if (var3) { // L: 8096
							var4.orientation = var4.rotation = var8;
						}

						if (var0) { // L: 8097
							var7 = var1.readBits(8); // L: 8098
							if (var7 > 127) { // L: 8099
								var7 -= 256;
							}
						} else {
							var7 = var1.readBits(5); // L: 8102
							if (var7 > 15) { // L: 8103
								var7 -= 32;
							}
						}

						var4.definition = WorldMapSectionType.getNpcDefinition(var1.readBits(14)); // L: 8105
						boolean var9 = var1.readBits(1) == 1; // L: 8106
						if (var9) { // L: 8107
							var1.readBits(32); // L: 8108
						}

						var5 = var1.readBits(1); // L: 8110
						var10 = var1.readBits(1); // L: 8111
						if (var10 == 1) { // L: 8112
							Client.field601[++Client.field565 - 1] = var2;
						}

						if (var0) { // L: 8113
							var6 = var1.readBits(8); // L: 8114
							if (var6 > 127) { // L: 8115
								var6 -= 256;
							}
						} else {
							var6 = var1.readBits(5); // L: 8118
							if (var6 > 15) { // L: 8119
								var6 -= 32;
							}
						}
					} else {
						boolean var11 = var1.readBits(1) == 1; // L: 8123
						if (var11) { // L: 8124
							var1.readBits(32); // L: 8125
						}

						if (var0) { // L: 8127
							var7 = var1.readBits(8); // L: 8128
							if (var7 > 127) { // L: 8129
								var7 -= 256;
							}
						} else {
							var7 = var1.readBits(5); // L: 8132
							if (var7 > 15) { // L: 8133
								var7 -= 32;
							}
						}

						var5 = var1.readBits(1); // L: 8135
						if (var0) { // L: 8136
							var6 = var1.readBits(8); // L: 8137
							if (var6 > 127) { // L: 8138
								var6 -= 256;
							}
						} else {
							var6 = var1.readBits(5); // L: 8141
							if (var6 > 15) { // L: 8142
								var6 -= 32;
							}
						}

						var4.definition = WorldMapSectionType.getNpcDefinition(var1.readBits(14)); // L: 8144
						int var12 = Client.defaultRotations[var1.readBits(3)]; // L: 8145
						if (var3) { // L: 8146
							var4.orientation = var4.rotation = var12;
						}

						var10 = var1.readBits(1); // L: 8147
						if (var10 == 1) { // L: 8148
							Client.field601[++Client.field565 - 1] = var2;
						}
					}

					var4.field1167 = var4.definition.size; // L: 8150
					var4.field1204 = var4.definition.rotation; // L: 8151
					if (var4.field1204 == 0) { // L: 8152
						var4.rotation = 0;
					}

					var4.walkSequence = var4.definition.walkSequence; // L: 8153
					var4.walkBackSequence = var4.definition.walkBackSequence; // L: 8154
					var4.walkLeftSequence = var4.definition.walkLeftSequence; // L: 8155
					var4.walkRightSequence = var4.definition.walkRightSequence; // L: 8156
					var4.idleSequence = var4.definition.idleSequence; // L: 8157
					var4.turnLeftSequence = var4.definition.turnLeftSequence; // L: 8158
					var4.turnRightSequence = var4.definition.turnRightSequence; // L: 8159
					var4.runSequence = var4.definition.field1959; // L: 8160
					var4.field1150 = var4.definition.field1960; // L: 8161
					var4.field1183 = var4.definition.field1961; // L: 8162
					var4.field1152 = var4.definition.field1946; // L: 8163
					var4.field1160 = var4.definition.field1985; // L: 8164
					var4.field1154 = var4.definition.field1964; // L: 8165
					var4.field1155 = var4.definition.field1956; // L: 8166
					var4.field1156 = var4.definition.field1966; // L: 8167
					var4.method2341(ModelData0.localPlayer.pathX[0] + var6, ModelData0.localPlayer.pathY[0] + var7, var5 == 1); // L: 8168
					continue; // L: 8169
				}
			}

			var1.exportIndex(); // L: 8170
			return; // L: 8171
		}
	}
}
