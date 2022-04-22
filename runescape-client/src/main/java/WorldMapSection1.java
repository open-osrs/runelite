import java.awt.FontMetrics;
import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hd")
@Implements("WorldMapSection1")
public class WorldMapSection1 implements WorldMapSection {
	@ObfuscatedName("l")
	@Export("soundSystemExecutor")
	static ScheduledExecutorService soundSystemExecutor;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1670816889
	)
	@Export("cacheGamebuild")
	static int cacheGamebuild;
	@ObfuscatedName("ak")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -660682519
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1314045431
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 911829811
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1785911481
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 587301171
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1342465229
	)
	@Export("regionEndY")
	int regionEndY;

	WorldMapSection1() {
	} // L: 14

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lgu;I)V",
		garbageValue = "964088357"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.regionEndX) { // L: 17
			var1.regionLowX = this.regionEndX;
		}

		if (var1.regionHighX < this.regionEndX) {
			var1.regionHighX = this.regionEndX; // L: 18
		}

		if (var1.regionLowY > this.regionEndY) { // L: 19
			var1.regionLowY = this.regionEndY;
		}

		if (var1.regionHighY < this.regionEndY) { // L: 20
			var1.regionHighY = this.regionEndY;
		}

	} // L: 21

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1337137401"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.minPlane + this.planes) { // L: 24
			return var2 >> 6 == this.regionStartX && var3 >> 6 == this.regionStartY; // L: 27
		} else {
			return false; // L: 25
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1769831605"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 == this.regionEndX && var2 >> 6 == this.regionEndY; // L: 31
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "1941144122"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 35
			return null; // L: 36
		} else {
			int[] var4 = new int[]{var2 + (this.regionEndX * 64 - this.regionStartX * 64), var3 + (this.regionEndY * 64 - this.regionStartY * 64)}; // L: 38 39 40
			return var4; // L: 41
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)Lks;",
		garbageValue = "-670243838"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 45
			return null; // L: 46
		} else {
			int var3 = this.regionStartX * 64 - this.regionEndX * 64 + var1; // L: 48
			int var4 = var2 + (this.regionStartY * 64 - this.regionEndY * 64); // L: 49
			return new Coord(this.minPlane, var3, var4); // L: 50
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "-860121653"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte(); // L: 54
		this.planes = var1.readUnsignedByte(); // L: 55
		this.regionStartX = var1.readUnsignedShort(); // L: 56
		this.regionStartY = var1.readUnsignedShort(); // L: 57
		this.regionEndX = var1.readUnsignedShort(); // L: 58
		this.regionEndY = var1.readUnsignedShort(); // L: 59
		this.postRead(); // L: 60
	} // L: 61

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1338654039"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "40"
	)
	@Export("clearItemContainer")
	static void clearItemContainer(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 63
		if (var1 != null) { // L: 64
			for (int var2 = 0; var2 < var1.ids.length; ++var2) { // L: 65
				var1.ids[var2] = -1; // L: 66
				var1.quantities[var2] = 0; // L: 67
			}

		}
	} // L: 69

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(ZLpz;B)V",
		garbageValue = "71"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field626 = 0; // L: 8045
		Client.field547 = 0; // L: 8046
		PacketBuffer var2 = Client.packetWriter.packetBuffer; // L: 8048
		var2.importIndex(); // L: 8049
		int var3 = var2.readBits(8); // L: 8050
		int var4;
		if (var3 < Client.npcCount) { // L: 8051
			for (var4 = var3; var4 < Client.npcCount; ++var4) { // L: 8052
				Client.field627[++Client.field626 - 1] = Client.npcIndices[var4];
			}
		}

		if (var3 > Client.npcCount) { // L: 8054
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0; // L: 8055

			int var5;
			int var7;
			int var8;
			int var10;
			for (var4 = 0; var4 < var3; ++var4) { // L: 8056
				var5 = Client.npcIndices[var4]; // L: 8057
				NPC var13 = Client.npcs[var5]; // L: 8058
				var7 = var2.readBits(1); // L: 8059
				if (var7 == 0) { // L: 8060
					Client.npcIndices[++Client.npcCount - 1] = var5; // L: 8061
					var13.npcCycle = Client.cycle; // L: 8062
				} else {
					var8 = var2.readBits(2); // L: 8065
					if (var8 == 0) { // L: 8066
						Client.npcIndices[++Client.npcCount - 1] = var5; // L: 8067
						var13.npcCycle = Client.cycle; // L: 8068
						Client.field548[++Client.field547 - 1] = var5; // L: 8069
					} else {
						int var9;
						if (var8 == 1) { // L: 8072
							Client.npcIndices[++Client.npcCount - 1] = var5; // L: 8073
							var13.npcCycle = Client.cycle; // L: 8074
							var9 = var2.readBits(3); // L: 8075
							var13.method2347(var9, class193.field2185); // L: 8076
							var10 = var2.readBits(1); // L: 8077
							if (var10 == 1) { // L: 8078
								Client.field548[++Client.field547 - 1] = var5;
							}
						} else if (var8 == 2) { // L: 8081
							Client.npcIndices[++Client.npcCount - 1] = var5; // L: 8082
							var13.npcCycle = Client.cycle; // L: 8083
							if (var2.readBits(1) == 1) { // L: 8084
								var9 = var2.readBits(3); // L: 8085
								var13.method2347(var9, class193.field2187); // L: 8086
								var10 = var2.readBits(3); // L: 8087
								var13.method2347(var10, class193.field2187); // L: 8088
							} else {
								var9 = var2.readBits(3); // L: 8091
								var13.method2347(var9, class193.field2184); // L: 8092
							}

							var9 = var2.readBits(1); // L: 8094
							if (var9 == 1) { // L: 8095
								Client.field548[++Client.field547 - 1] = var5;
							}
						} else if (var8 == 3) { // L: 8098
							Client.field627[++Client.field626 - 1] = var5; // L: 8099
						}
					}
				}
			}

			int var11;
			while (var1.bitsRemaining(Client.packetWriter.serverPacketLength) >= 27) { // L: 8106
				var11 = var1.readBits(15); // L: 8107
				if (var11 == 32767) { // L: 8108
					break;
				}

				boolean var14 = false; // L: 8109
				if (Client.npcs[var11] == null) { // L: 8110
					Client.npcs[var11] = new NPC(); // L: 8111
					var14 = true; // L: 8112
				}

				NPC var12 = Client.npcs[var11]; // L: 8114
				Client.npcIndices[++Client.npcCount - 1] = var11; // L: 8115
				var12.npcCycle = Client.cycle; // L: 8116
				int var6;
				boolean var15;
				if (class431.field4602) { // L: 8120
					if (var0) { // L: 8121
						var6 = var1.readBits(8); // L: 8122
						if (var6 > 127) { // L: 8123
							var6 -= 256;
						}
					} else {
						var6 = var1.readBits(5); // L: 8126
						if (var6 > 15) { // L: 8127
							var6 -= 32;
						}
					}

					var5 = var1.readBits(1); // L: 8129
					var8 = Client.defaultRotations[var1.readBits(3)]; // L: 8130
					if (var14) { // L: 8131
						var12.orientation = var12.rotation = var8;
					}

					var12.definition = KeyHandler.getNpcDefinition(var1.readBits(14)); // L: 8132
					if (var0) { // L: 8133
						var7 = var1.readBits(8); // L: 8134
						if (var7 > 127) { // L: 8135
							var7 -= 256;
						}
					} else {
						var7 = var1.readBits(5); // L: 8138
						if (var7 > 15) { // L: 8139
							var7 -= 32;
						}
					}

					var15 = var1.readBits(1) == 1; // L: 8141
					if (var15) { // L: 8142
						var1.readBits(32); // L: 8143
					}

					var10 = var1.readBits(1); // L: 8145
					if (var10 == 1) { // L: 8146
						Client.field548[++Client.field547 - 1] = var11;
					}
				} else {
					var5 = var1.readBits(1); // L: 8149
					var8 = var1.readBits(1); // L: 8150
					if (var8 == 1) { // L: 8151
						Client.field548[++Client.field547 - 1] = var11;
					}

					if (var0) { // L: 8152
						var7 = var1.readBits(8); // L: 8153
						if (var7 > 127) { // L: 8154
							var7 -= 256;
						}
					} else {
						var7 = var1.readBits(5); // L: 8157
						if (var7 > 15) { // L: 8158
							var7 -= 32;
						}
					}

					var15 = var1.readBits(1) == 1; // L: 8160
					if (var15) { // L: 8161
						var1.readBits(32); // L: 8162
					}

					if (var0) { // L: 8164
						var6 = var1.readBits(8); // L: 8165
						if (var6 > 127) { // L: 8166
							var6 -= 256;
						}
					} else {
						var6 = var1.readBits(5); // L: 8169
						if (var6 > 15) { // L: 8170
							var6 -= 32;
						}
					}

					var12.definition = KeyHandler.getNpcDefinition(var1.readBits(14)); // L: 8172
					var10 = Client.defaultRotations[var1.readBits(3)]; // L: 8173
					if (var14) { // L: 8174
						var12.orientation = var12.rotation = var10;
					}
				}

				var12.field1150 = var12.definition.size; // L: 8176
				var12.field1175 = var12.definition.rotation; // L: 8177
				if (var12.field1175 == 0) { // L: 8178
					var12.rotation = 0;
				}

				var12.walkSequence = var12.definition.walkSequence; // L: 8179
				var12.walkBackSequence = var12.definition.walkBackSequence; // L: 8180
				var12.walkLeftSequence = var12.definition.walkLeftSequence; // L: 8181
				var12.walkRightSequence = var12.definition.walkRightSequence; // L: 8182
				var12.idleSequence = var12.definition.idleSequence; // L: 8183
				var12.turnLeftSequence = var12.definition.turnLeftSequence; // L: 8184
				var12.turnRightSequence = var12.definition.turnRightSequence; // L: 8185
				var12.method2348(GrandExchangeEvents.localPlayer.pathX[0] + var6, GrandExchangeEvents.localPlayer.pathY[0] + var7, var5 == 1); // L: 8186
			}

			var1.exportIndex(); // L: 8188
			MouseHandler.method593(var1); // L: 8190

			for (var11 = 0; var11 < Client.field626; ++var11) { // L: 8191
				var3 = Client.field627[var11]; // L: 8192
				if (Client.npcs[var3].npcCycle != Client.cycle) { // L: 8193
					Client.npcs[var3].definition = null; // L: 8194
					Client.npcs[var3] = null; // L: 8195
				}
			}

			if (var1.offset != Client.packetWriter.serverPacketLength) { // L: 8198
				throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength);
			} else {
				for (var11 = 0; var11 < Client.npcCount; ++var11) { // L: 8199
					if (Client.npcs[Client.npcIndices[var11]] == null) { // L: 8200
						throw new RuntimeException(var11 + "," + Client.npcCount); // L: 8201
					}
				}

			}
		}
	} // L: 8204
}
