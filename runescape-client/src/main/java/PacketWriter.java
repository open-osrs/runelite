import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1444259663
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1918231479
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("q")
	boolean field1327;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 2141926027
	)
	int field1330;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1260062843
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	ServerPacket field1331;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	ServerPacket field1333;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	ServerPacket field1334;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque(); // L: 15
		this.bufferSize = 0; // L: 16
		this.buffer = new Buffer(5000); // L: 17
		this.packetBuffer = new PacketBuffer(40000); // L: 19
		this.serverPacket = null; // L: 20
		this.serverPacketLength = 0; // L: 21
		this.field1327 = true; // L: 22
		this.field1330 = 0; // L: 23
		this.pendingWrites = 0; // L: 24
	} // L: 29

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-126347974"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear(); // L: 32
		this.bufferSize = 0; // L: 33
	} // L: 34

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "523459495"
	)
	@Export("flush")
	final void flush() throws IOException {
		if (this.socket != null && this.bufferSize > 0) { // L: 37
			this.buffer.offset = 0; // L: 38

			while (true) {
				PacketBufferNode var1 = (PacketBufferNode)this.packetBufferNodes.last(); // L: 40
				if (var1 == null || var1.index > this.buffer.array.length - this.buffer.offset) { // L: 41 42
					this.socket.write(this.buffer.array, 0, this.buffer.offset); // L: 49
					this.pendingWrites = 0; // L: 50
					break;
				}

				this.buffer.writeBytes(var1.packetBuffer.array, 0, var1.index); // L: 43
				this.bufferSize -= var1.index; // L: 44
				var1.remove(); // L: 45
				var1.packetBuffer.releaseArray(); // L: 46
				var1.release(); // L: 47
			}
		}

	} // L: 52

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lgk;I)V",
		garbageValue = "-315377283"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1); // L: 55
		var1.index = var1.packetBuffer.offset; // L: 56
		var1.packetBuffer.offset = 0; // L: 57
		this.bufferSize += var1.index; // L: 58
	} // L: 59

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lls;I)V",
		garbageValue = "-1829169841"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1; // L: 62
	} // L: 63

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1622261099"
	)
	@Export("close")
	void close() {
		if (this.socket != null) { // L: 66
			this.socket.close(); // L: 67
			this.socket = null; // L: 68
		}

	} // L: 70

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1730600275"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null; // L: 73
	} // L: 74

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Lls;",
		garbageValue = "-1714919219"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket; // L: 77
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lby;I)V",
		garbageValue = "1366873098"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		GrandExchangeOfferWorldComparator.runScript(var0, 500000); // L: 99
	} // L: 100

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(Lgs;I)V",
		garbageValue = "-718074338"
	)
	static final void method2429(class194 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer; // L: 6977
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		if (class194.field2354 == var0) { // L: 6978
			var2 = var1.method5720(); // L: 6979
			var3 = var2 >> 2; // L: 6980
			var4 = var2 & 3; // L: 6981
			var5 = Client.field724[var3]; // L: 6982
			var6 = var1.readUnsignedByte(); // L: 6983
			var7 = (var6 >> 4 & 7) + GrandExchangeEvent.field82; // L: 6984
			var8 = (var6 & 7) + GrandExchangeOfferUnitPriceComparator.field103; // L: 6985
			var9 = var1.method5727(); // L: 6986
			if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) { // L: 6987
				Canvas.updatePendingSpawn(class90.Client_plane, var7, var8, var5, var9, var3, var4, 0, -1); // L: 6988
			}

		} else if (class194.field2347 == var0) { // L: 6992
			var2 = var1.method5729(); // L: 6993
			var3 = var1.readUnsignedByte(); // L: 6994
			var4 = var1.readUnsignedShort(); // L: 6995
			var5 = var1.method5776(); // L: 6996
			var6 = (var5 >> 4 & 7) + GrandExchangeEvent.field82; // L: 6997
			var7 = (var5 & 7) + GrandExchangeOfferUnitPriceComparator.field103; // L: 6998
			if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) { // L: 6999
				var6 = var6 * 128 + 64; // L: 7000
				var7 = var7 * 128 + 64; // L: 7001
				GraphicsObject var44 = new GraphicsObject(var2, class90.Client_plane, var6, var7, WorldMapRegion.getTileHeight(var6, var7, class90.Client_plane) - var3, var4, Client.cycle); // L: 7002
				Client.graphicsObjects.addFirst(var44); // L: 7003
			}

		} else {
			TileItem var35;
			if (class194.field2348 == var0) { // L: 7007
				var2 = var1.method5717(); // L: 7008
				var3 = (var2 >> 4 & 7) + GrandExchangeEvent.field82; // L: 7009
				var4 = (var2 & 7) + GrandExchangeOfferUnitPriceComparator.field103; // L: 7010
				var5 = var1.readUnsignedShort(); // L: 7011
				if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 7012
					NodeDeque var36 = Client.groundItems[class90.Client_plane][var3][var4]; // L: 7013
					if (var36 != null) { // L: 7014
						for (var35 = (TileItem)var36.last(); var35 != null; var35 = (TileItem)var36.previous()) { // L: 7015 7016 7021
							if ((var5 & 32767) == var35.id) { // L: 7017
								var35.remove(); // L: 7018
								break;
							}
						}

						if (var36.last() == null) { // L: 7023
							Client.groundItems[class90.Client_plane][var3][var4] = null;
						}

						HitSplatDefinition.updateItemPile(var3, var4); // L: 7024
					}
				}

			} else {
				int var10;
				if (class194.field2346 == var0) { // L: 7029
					var2 = var1.method5728(); // L: 7030
					var3 = var1.method5720(); // L: 7031
					var4 = (var3 >> 4 & 7) + GrandExchangeEvent.field82; // L: 7032
					var5 = (var3 & 7) + GrandExchangeOfferUnitPriceComparator.field103; // L: 7033
					var6 = var1.readUnsignedByte(); // L: 7034
					var7 = var6 >> 4 & 15; // L: 7035
					var8 = var6 & 7; // L: 7036
					var9 = var1.method5717(); // L: 7037
					if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 7038
						var10 = var7 + 1; // L: 7039
						if (UserComparator9.localPlayer.pathX[0] >= var4 - var10 && UserComparator9.localPlayer.pathX[0] <= var4 + var10 && UserComparator9.localPlayer.pathY[0] >= var5 - var10 && UserComparator9.localPlayer.pathY[0] <= var5 + var10 && WorldMapSectionType.clientPreferences.areaSoundEffectsVolume != 0 && var8 > 0 && Client.soundEffectCount < 50) { // L: 7040 7041
							Client.soundEffectIds[Client.soundEffectCount] = var2; // L: 7042
							Client.queuedSoundEffectLoops[Client.soundEffectCount] = var8; // L: 7043
							Client.queuedSoundEffectDelays[Client.soundEffectCount] = var9; // L: 7044
							Client.soundEffects[Client.soundEffectCount] = null; // L: 7045
							Client.soundLocations[Client.soundEffectCount] = var7 + (var5 << 8) + (var4 << 16); // L: 7046
							++Client.soundEffectCount; // L: 7047
						}
					}
				}

				if (class194.field2356 == var0) { // L: 7052
					var2 = var1.method5729(); // L: 7053
					var3 = var1.method5728(); // L: 7054
					var4 = var1.readUnsignedByte(); // L: 7055
					var5 = (var4 >> 4 & 7) + GrandExchangeEvent.field82; // L: 7056
					var6 = (var4 & 7) + GrandExchangeOfferUnitPriceComparator.field103; // L: 7057
					if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) { // L: 7058
						var35 = new TileItem(); // L: 7059
						var35.id = var2; // L: 7060
						var35.quantity = var3; // L: 7061
						if (Client.groundItems[class90.Client_plane][var5][var6] == null) { // L: 7062
							Client.groundItems[class90.Client_plane][var5][var6] = new NodeDeque();
						}

						Client.groundItems[class90.Client_plane][var5][var6].addFirst(var35); // L: 7063
						HitSplatDefinition.updateItemPile(var5, var6); // L: 7064
					}

				} else {
					int var11;
					int var12;
					int var14;
					if (class194.field2352 == var0) { // L: 7068
						var2 = var1.method5776(); // L: 7069
						var3 = var1.method5717() * 4; // L: 7070
						var4 = var1.method5731(); // L: 7071
						var5 = var1.method5729(); // L: 7072
						byte var38 = var1.method5747(); // L: 7073
						var7 = var1.readUnsignedShort(); // L: 7074
						var8 = var1.method5776() * 4; // L: 7075
						byte var39 = var1.method5722(); // L: 7076
						var10 = var1.method5776(); // L: 7077
						var11 = var1.method5729(); // L: 7078
						var12 = var1.method5717(); // L: 7079
						int var40 = (var12 >> 4 & 7) + GrandExchangeEvent.field82; // L: 7080
						var14 = (var12 & 7) + GrandExchangeOfferUnitPriceComparator.field103; // L: 7081
						var6 = var38 + var40; // L: 7082
						var9 = var39 + var14; // L: 7083
						if (var40 >= 0 && var14 >= 0 && var40 < 104 && var14 < 104 && var6 >= 0 && var9 >= 0 && var6 < 104 && var9 < 104 && var5 != 65535) { // L: 7084
							var40 = var40 * 128 + 64; // L: 7085
							var14 = var14 * 128 + 64; // L: 7086
							var6 = var6 * 128 + 64; // L: 7087
							var9 = var9 * 128 + 64; // L: 7088
							Projectile var34 = new Projectile(var5, class90.Client_plane, var40, var14, WorldMapRegion.getTileHeight(var40, var14, class90.Client_plane) - var3, var7 + Client.cycle, var11 + Client.cycle, var10, var2, var4, var8); // L: 7089
							var34.setDestination(var6, var9, WorldMapRegion.getTileHeight(var6, var9, class90.Client_plane) - var8, var7 + Client.cycle); // L: 7090
							Client.projectiles.addFirst(var34); // L: 7091
						}

					} else if (class194.field2351 == var0) { // L: 7095
						var2 = var1.readUnsignedByte(); // L: 7096
						var3 = (var2 >> 4 & 7) + GrandExchangeEvent.field82; // L: 7097
						var4 = (var2 & 7) + GrandExchangeOfferUnitPriceComparator.field103; // L: 7098
						var5 = var1.method5727(); // L: 7099
						var6 = var1.method5727(); // L: 7100
						var7 = var1.method5727(); // L: 7101
						if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 7102
							NodeDeque var32 = Client.groundItems[class90.Client_plane][var3][var4]; // L: 7103
							if (var32 != null) { // L: 7104
								for (TileItem var33 = (TileItem)var32.last(); var33 != null; var33 = (TileItem)var32.previous()) { // L: 7105 7106 7111
									if ((var7 & 32767) == var33.id && var5 == var33.quantity) { // L: 7107
										var33.quantity = var6; // L: 7108
										break;
									}
								}

								HitSplatDefinition.updateItemPile(var3, var4); // L: 7113
							}
						}

					} else if (class194.field2353 == var0) { // L: 7118
						var2 = var1.method5717(); // L: 7119
						var3 = var2 >> 2; // L: 7120
						var4 = var2 & 3; // L: 7121
						var5 = Client.field724[var3]; // L: 7122
						var6 = var1.method5729(); // L: 7123
						var7 = var1.readUnsignedByte(); // L: 7124
						var8 = (var7 >> 4 & 7) + GrandExchangeEvent.field82; // L: 7125
						var9 = (var7 & 7) + GrandExchangeOfferUnitPriceComparator.field103; // L: 7126
						if (var8 >= 0 && var9 >= 0 && var8 < 103 && var9 < 103) { // L: 7127
							if (var5 == 0) { // L: 7128
								BoundaryObject var31 = MilliClock.scene.method3351(class90.Client_plane, var8, var9); // L: 7129
								if (var31 != null) { // L: 7130
									var11 = class25.Entity_unpackID(var31.tag); // L: 7131
									if (var3 == 2) { // L: 7132
										var31.renderable1 = new DynamicObject(var11, 2, var4 + 4, class90.Client_plane, var8, var9, var6, false, var31.renderable1); // L: 7133
										var31.renderable2 = new DynamicObject(var11, 2, var4 + 1 & 3, class90.Client_plane, var8, var9, var6, false, var31.renderable2); // L: 7134
									} else {
										var31.renderable1 = new DynamicObject(var11, var3, var4, class90.Client_plane, var8, var9, var6, false, var31.renderable1); // L: 7136
									}
								}
							}

							if (var5 == 1) { // L: 7139
								WallDecoration var41 = MilliClock.scene.method3264(class90.Client_plane, var8, var9); // L: 7140
								if (var41 != null) { // L: 7141
									var11 = class25.Entity_unpackID(var41.tag); // L: 7142
									if (var3 != 4 && var3 != 5) { // L: 7143
										if (var3 == 6) { // L: 7144
											var41.renderable1 = new DynamicObject(var11, 4, var4 + 4, class90.Client_plane, var8, var9, var6, false, var41.renderable1);
										} else if (var3 == 7) { // L: 7145
											var41.renderable1 = new DynamicObject(var11, 4, (var4 + 2 & 3) + 4, class90.Client_plane, var8, var9, var6, false, var41.renderable1);
										} else if (var3 == 8) { // L: 7146
											var41.renderable1 = new DynamicObject(var11, 4, var4 + 4, class90.Client_plane, var8, var9, var6, false, var41.renderable1); // L: 7147
											var41.renderable2 = new DynamicObject(var11, 4, (var4 + 2 & 3) + 4, class90.Client_plane, var8, var9, var6, false, var41.renderable2); // L: 7148
										}
									} else {
										var41.renderable1 = new DynamicObject(var11, 4, var4, class90.Client_plane, var8, var9, var6, false, var41.renderable1);
									}
								}
							}

							if (var5 == 2) { // L: 7152
								GameObject var42 = MilliClock.scene.method3385(class90.Client_plane, var8, var9); // L: 7153
								if (var3 == 11) { // L: 7154
									var3 = 10;
								}

								if (var42 != null) { // L: 7155
									var42.renderable = new DynamicObject(class25.Entity_unpackID(var42.tag), var3, var4, class90.Client_plane, var8, var9, var6, false, var42.renderable);
								}
							}

							if (var5 == 3) { // L: 7157
								FloorDecoration var43 = MilliClock.scene.getFloorDecoration(class90.Client_plane, var8, var9); // L: 7158
								if (var43 != null) { // L: 7159
									var43.renderable = new DynamicObject(class25.Entity_unpackID(var43.tag), 22, var4, class90.Client_plane, var8, var9, var6, false, var43.renderable);
								}
							}
						}

					} else if (class194.field2355 == var0) { // L: 7164
						var2 = var1.method5717(); // L: 7165
						var3 = var2 >> 2; // L: 7166
						var4 = var2 & 3; // L: 7167
						var5 = Client.field724[var3]; // L: 7168
						var6 = var1.method5720(); // L: 7169
						var7 = (var6 >> 4 & 7) + GrandExchangeEvent.field82; // L: 7170
						var8 = (var6 & 7) + GrandExchangeOfferUnitPriceComparator.field103; // L: 7171
						if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) { // L: 7172
							Canvas.updatePendingSpawn(class90.Client_plane, var7, var8, var5, -1, var3, var4, 0, -1); // L: 7173
						}

					} else {
						if (class194.field2350 == var0) { // L: 7177
							var2 = var1.method5729(); // L: 7178
							var3 = var1.method5720(); // L: 7179
							var4 = var3 >> 2; // L: 7180
							var5 = var3 & 3; // L: 7181
							var6 = Client.field724[var4]; // L: 7182
							byte var37 = var1.method5722(); // L: 7183
							var8 = var1.method5727(); // L: 7184
							var9 = var1.method5720(); // L: 7185
							var10 = (var9 >> 4 & 7) + GrandExchangeEvent.field82; // L: 7186
							var11 = (var9 & 7) + GrandExchangeOfferUnitPriceComparator.field103; // L: 7187
							var12 = var1.readUnsignedShort(); // L: 7188
							byte var13 = var1.method5722(); // L: 7189
							var14 = var1.method5727(); // L: 7190
							byte var15 = var1.method5721(); // L: 7191
							byte var16 = var1.readByte(); // L: 7192
							Player var17;
							if (var14 == Client.localPlayerIndex) { // L: 7194
								var17 = UserComparator9.localPlayer;
							} else {
								var17 = Client.players[var14]; // L: 7195
							}

							if (var17 != null) { // L: 7196
								ObjectComposition var18 = WorldMapAreaData.getObjectDefinition(var12); // L: 7197
								int var19;
								int var20;
								if (var5 != 1 && var5 != 3) { // L: 7200
									var19 = var18.sizeX; // L: 7205
									var20 = var18.sizeY; // L: 7206
								} else {
									var19 = var18.sizeY; // L: 7201
									var20 = var18.sizeX; // L: 7202
								}

								int var21 = var10 + (var19 >> 1); // L: 7208
								int var22 = var10 + (var19 + 1 >> 1); // L: 7209
								int var23 = var11 + (var20 >> 1); // L: 7210
								int var24 = var11 + (var20 + 1 >> 1); // L: 7211
								int[][] var25 = Tiles.Tiles_heights[class90.Client_plane]; // L: 7212
								int var26 = var25[var22][var24] + var25[var21][var24] + var25[var21][var23] + var25[var22][var23] >> 2; // L: 7213
								int var27 = (var10 << 7) + (var19 << 6); // L: 7214
								int var28 = (var11 << 7) + (var20 << 6); // L: 7215
								Model var29 = var18.getModel(var4, var5, var25, var27, var26, var28); // L: 7216
								if (var29 != null) { // L: 7217
									Canvas.updatePendingSpawn(class90.Client_plane, var10, var11, var6, -1, 0, 0, var8 + 1, var2 + 1); // L: 7218
									var17.animationCycleStart = var8 + Client.cycle; // L: 7219
									var17.animationCycleEnd = var2 + Client.cycle; // L: 7220
									var17.model0 = var29; // L: 7221
									var17.field637 = var19 * 64 + var10 * 128; // L: 7222
									var17.field639 = var20 * 64 + var11 * 128; // L: 7223
									var17.tileHeight2 = var26; // L: 7224
									byte var30;
									if (var15 > var13) { // L: 7225
										var30 = var15; // L: 7226
										var15 = var13; // L: 7227
										var13 = var30; // L: 7228
									}

									if (var16 > var37) { // L: 7230
										var30 = var16; // L: 7231
										var16 = var37; // L: 7232
										var37 = var30; // L: 7233
									}

									var17.minX = var10 + var15; // L: 7235
									var17.maxX = var10 + var13; // L: 7236
									var17.minY = var11 + var16; // L: 7237
									var17.maxY = var11 + var37; // L: 7238
								}
							}
						}

					}
				}
			}
		}
	} // L: 6990 7005 7027 7066 7093 7116 7162 7175 7242

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "216002934"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (WorldMapID.clanChat != null) { // L: 11450
			PacketBufferNode var1 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2268, Client.packetWriter.isaacCipher); // L: 11451
			var1.packetBuffer.writeByte(WorldMapLabelSize.stringCp1252NullTerminatedByteSize(var0)); // L: 11452
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 11453
			Client.packetWriter.addNode(var1); // L: 11454
		}
	} // L: 11455
}
