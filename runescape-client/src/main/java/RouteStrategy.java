import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("qh")
	@ObfuscatedGetter(
		intValue = -859591296
	)
	static int field2124;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1899690821
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1293114999
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1335731435
	)
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -218891237
	)
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;

	protected RouteStrategy() {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIILfo;B)Z",
		garbageValue = "104"
	)
	@Export("hasArrived")
	public abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lhu;I)V",
		garbageValue = "747025369"
	)
	public static void method3643(Huffman var0) {
		class219.huffman = var0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Ljv;",
		garbageValue = "1923247344"
	)
	public static FloorOverlayDefinition method3648(int var0) {
		FloorOverlayDefinition var1 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var0);
			var1 = new FloorOverlayDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode();
			FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "16"
	)
	static boolean method3649() {
		return (Client.drawPlayerNames & 2) != 0;
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "-824309681"
	)
	@Export("menuAction")
	static final void menuAction(int var0, int var1, int var2, int var3, String var4, String var5, int var6, int var7) {
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		PacketBufferNode var8;
		if (var2 == 1) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2279, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method5578(WorldMapEvent.selectedItemId);
			var8.packetBuffer.method5578(class41.baseY * 64 + var1);
			var8.packetBuffer.method5578(ChatChannel.selectedItemSlot);
			var8.packetBuffer.writeShortLE(NetFileRequest.baseX * 64 + var0);
			var8.packetBuffer.writeInt(WorldMapLabelSize.selectedItemWidget);
			var8.packetBuffer.writeShort(var3);
			var8.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 2) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2237, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method5739(NetFileRequest.baseX * 64 + var0);
			var8.packetBuffer.writeShort(Client.selectedSpellChildIndex);
			var8.packetBuffer.writeShort(class41.baseY * 64 + var1);
			var8.packetBuffer.writeInt(MouseHandler.selectedSpellWidget);
			var8.packetBuffer.method5568(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.writeShort(var3);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 3) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2293, Client.packetWriter.isaacCipher);
			var8.packetBuffer.writeShortLE(NetFileRequest.baseX * 64 + var0);
			var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.writeShort(class41.baseY * 64 + var1);
			var8.packetBuffer.writeShortLE(var3);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 4) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2310, Client.packetWriter.isaacCipher);
			var8.packetBuffer.writeShort(var3);
			var8.packetBuffer.method5739(NetFileRequest.baseX * 64 + var0);
			var8.packetBuffer.method5569(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method5578(class41.baseY * 64 + var1);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 5) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2267, Client.packetWriter.isaacCipher);
			var8.packetBuffer.writeShortLE(class41.baseY * 64 + var1);
			var8.packetBuffer.method5569(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method5739(var3);
			var8.packetBuffer.method5578(NetFileRequest.baseX * 64 + var0);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 6) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2324, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method5578(class41.baseY * 64 + var1);
			var8.packetBuffer.method5578(var3);
			var8.packetBuffer.method5578(NetFileRequest.baseX * 64 + var0);
			var8.packetBuffer.method5569(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			Client.packetWriter.addNode(var8);
		} else {
			PacketBufferNode var9;
			NPC var13;
			if (var2 == 7) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2258, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method5588(WorldMapLabelSize.selectedItemWidget);
					var9.packetBuffer.writeShortLE(var3);
					var9.packetBuffer.method5739(ChatChannel.selectedItemSlot);
					var9.packetBuffer.method5569(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.writeShort(WorldMapEvent.selectedItemId);
					Client.packetWriter.addNode(var9);
				}
			} else if (var2 == 8) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2274, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method5739(var3);
					var9.packetBuffer.writeShortLE(Client.selectedSpellChildIndex);
					var9.packetBuffer.method5587(MouseHandler.selectedSpellWidget);
					var9.packetBuffer.method5568(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var9);
				}
			} else if (var2 == 9) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2262, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method5578(var3);
					var9.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var9);
				}
			} else if (var2 == 10) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2246, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeShortLE(var3);
					var9.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var9);
				}
			} else if (var2 == 11) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2236, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method5568(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.writeShort(var3);
					Client.packetWriter.addNode(var9);
				}
			} else if (var2 == 12) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2309, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.method5578(var3);
					Client.packetWriter.addNode(var9);
				}
			} else if (var2 == 13) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2276, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method5569(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.method5739(var3);
					Client.packetWriter.addNode(var9);
				}
			} else {
				Player var15;
				if (var2 == 14) {
					var15 = Client.players[var3];
					if (var15 != null) {
						Client.mouseCrossX = var6;
						Client.mouseCrossY = var7;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2283, Client.packetWriter.isaacCipher);
						var9.packetBuffer.method5569(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
						var9.packetBuffer.method5588(WorldMapLabelSize.selectedItemWidget);
						var9.packetBuffer.writeShortLE(ChatChannel.selectedItemSlot);
						var9.packetBuffer.method5739(var3);
						var9.packetBuffer.writeShort(WorldMapEvent.selectedItemId);
						Client.packetWriter.addNode(var9);
					}
				} else if (var2 == 15) {
					var15 = Client.players[var3];
					if (var15 != null) {
						Client.mouseCrossX = var6;
						Client.mouseCrossY = var7;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2256, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeShort(var3);
						var9.packetBuffer.method5568(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
						var9.packetBuffer.method5739(Client.selectedSpellChildIndex);
						var9.packetBuffer.writeInt(MouseHandler.selectedSpellWidget);
						Client.packetWriter.addNode(var9);
					}
				} else if (var2 == 16) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2263, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method5587(WorldMapLabelSize.selectedItemWidget);
					var8.packetBuffer.writeShortLE(NetFileRequest.baseX * 64 + var0);
					var8.packetBuffer.method5739(WorldMapEvent.selectedItemId);
					var8.packetBuffer.method5739(class41.baseY * 64 + var1);
					var8.packetBuffer.method5578(ChatChannel.selectedItemSlot);
					var8.packetBuffer.writeShortLE(var3);
					var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 17) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2281, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShortLE(class41.baseY * 64 + var1);
					var8.packetBuffer.writeShortLE(NetFileRequest.baseX * 64 + var0);
					var8.packetBuffer.writeShortLE(Client.selectedSpellChildIndex);
					var8.packetBuffer.method5578(var3);
					var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method5588(MouseHandler.selectedSpellWidget);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 18) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2311, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShort(NetFileRequest.baseX * 64 + var0);
					var8.packetBuffer.writeShort(var3);
					var8.packetBuffer.writeShort(class41.baseY * 64 + var1);
					var8.packetBuffer.method5569(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 19) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2317, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShort(class41.baseY * 64 + var1);
					var8.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method5739(var3);
					var8.packetBuffer.writeShort(NetFileRequest.baseX * 64 + var0);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 20) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2254, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method5578(class41.baseY * 64 + var1);
					var8.packetBuffer.method5568(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method5578(NetFileRequest.baseX * 64 + var0);
					var8.packetBuffer.method5739(var3);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 21) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2248, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShort(NetFileRequest.baseX * 64 + var0);
					var8.packetBuffer.method5578(var3);
					var8.packetBuffer.writeShortLE(class41.baseY * 64 + var1);
					var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 22) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2305, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShort(var3);
					var8.packetBuffer.method5568(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.writeShort(class41.baseY * 64 + var1);
					var8.packetBuffer.writeShortLE(NetFileRequest.baseX * 64 + var0);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 23) {
					if (Client.isMenuOpen) {
						ArchiveLoader.scene.setViewportWalking();
					} else {
						ArchiveLoader.scene.menuOpen(GameObject.Client_plane, var0, var1, true);
					}
				} else {
					PacketBufferNode var12;
					Widget var16;
					if (var2 == 24) {
						var16 = CollisionMap.getWidget(var1);
						boolean var11 = true;
						if (var16.contentType > 0) {
							var11 = HealthBarUpdate.method1825(var16);
						}

						if (var11) {
							var12 = ItemContainer.getPacketBufferNode(ClientPacket.field2287, Client.packetWriter.isaacCipher);
							var12.packetBuffer.writeInt(var1);
							Client.packetWriter.addNode(var12);
						}
					} else {
						if (var2 == 25) {
							var16 = class92.getWidgetChild(var1, var0);
							if (var16 != null) {
								WorldMapManager.Widget_runOnTargetLeave();
								class194.selectSpell(var1, var0, ServerPacket.Widget_unpackTargetMask(FaceNormal.getWidgetFlags(var16)), var16.itemId);
								Client.isItemSelected = 0;
								Client.selectedSpellActionName = StudioGame.Widget_getSpellActionName(var16);
								if (Client.selectedSpellActionName == null) {
									Client.selectedSpellActionName = "null";
								}

								if (var16.isIf3) {
									Client.selectedSpellName = var16.dataText + class23.colorStartTag(16777215);
								} else {
									Client.selectedSpellName = class23.colorStartTag(65280) + var16.spellName + class23.colorStartTag(16777215);
								}
							}

							return;
						}

						if (var2 == 26) {
							ServerPacket.method3664();
						} else {
							int var10;
							Widget var14;
							if (var2 == 28) {
								var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2287, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var8);
								var14 = CollisionMap.getWidget(var1);
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) {
									var10 = var14.cs1Instructions[0][1];
									Varps.Varps_main[var10] = 1 - Varps.Varps_main[var10];
									Script.changeGameOptions(var10);
								}
							} else if (var2 == 29) {
								var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2287, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var8);
								var14 = CollisionMap.getWidget(var1);
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) {
									var10 = var14.cs1Instructions[0][1];
									if (Varps.Varps_main[var10] != var14.cs1ComparisonValues[0]) {
										Varps.Varps_main[var10] = var14.cs1ComparisonValues[0];
										Script.changeGameOptions(var10);
									}
								}
							} else if (var2 == 30) {
								if (Client.meslayerContinueWidget == null) {
									DynamicObject.resumePauseWidget(var1, var0);
									Client.meslayerContinueWidget = class92.getWidgetChild(var1, var0);
									CollisionMap.invalidateWidget(Client.meslayerContinueWidget);
								}
							} else if (var2 == 31) {
								var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2295, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeShort(WorldMapEvent.selectedItemId);
								var8.packetBuffer.writeShort(var3);
								var8.packetBuffer.writeShort(ChatChannel.selectedItemSlot);
								var8.packetBuffer.method5588(WorldMapLabelSize.selectedItemWidget);
								var8.packetBuffer.writeShort(var0);
								var8.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var8);
								Client.field754 = 0;
								NPC.field1131 = CollisionMap.getWidget(var1);
								Client.field881 = var0;
							} else if (var2 == 32) {
								var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2327, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeShort(var3);
								var8.packetBuffer.writeShort(var0);
								var8.packetBuffer.method5578(Client.selectedSpellChildIndex);
								var8.packetBuffer.method5588(MouseHandler.selectedSpellWidget);
								var8.packetBuffer.method5587(var1);
								Client.packetWriter.addNode(var8);
								Client.field754 = 0;
								NPC.field1131 = CollisionMap.getWidget(var1);
								Client.field881 = var0;
							} else if (var2 == 33) {
								var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2284, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeShort(var0);
								var8.packetBuffer.method5587(var1);
								var8.packetBuffer.method5578(var3);
								Client.packetWriter.addNode(var8);
								Client.field754 = 0;
								NPC.field1131 = CollisionMap.getWidget(var1);
								Client.field881 = var0;
							} else if (var2 == 34) {
								var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2325, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeShort(var0);
								var8.packetBuffer.method5739(var3);
								var8.packetBuffer.method5587(var1);
								Client.packetWriter.addNode(var8);
								Client.field754 = 0;
								NPC.field1131 = CollisionMap.getWidget(var1);
								Client.field881 = var0;
							} else if (var2 == 35) {
								var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2259, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method5739(var0);
								var8.packetBuffer.method5578(var3);
								var8.packetBuffer.method5587(var1);
								Client.packetWriter.addNode(var8);
								Client.field754 = 0;
								NPC.field1131 = CollisionMap.getWidget(var1);
								Client.field881 = var0;
							} else if (var2 == 36) {
								var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2265, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeShortLE(var0);
								var8.packetBuffer.method5588(var1);
								var8.packetBuffer.writeShort(var3);
								Client.packetWriter.addNode(var8);
								Client.field754 = 0;
								NPC.field1131 = CollisionMap.getWidget(var1);
								Client.field881 = var0;
							} else if (var2 == 37) {
								var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2229, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method5718(var1);
								var8.packetBuffer.method5739(var0);
								var8.packetBuffer.writeShort(var3);
								Client.packetWriter.addNode(var8);
								Client.field754 = 0;
								NPC.field1131 = CollisionMap.getWidget(var1);
								Client.field881 = var0;
							} else {
								if (var2 == 38) {
									WorldMapManager.Widget_runOnTargetLeave();
									var16 = CollisionMap.getWidget(var1);
									Client.isItemSelected = 1;
									ChatChannel.selectedItemSlot = var0;
									WorldMapLabelSize.selectedItemWidget = var1;
									WorldMapEvent.selectedItemId = var3;
									CollisionMap.invalidateWidget(var16);
									Client.selectedItemName = class23.colorStartTag(16748608) + SecureRandomCallable.ItemDefinition_get(var3).name + class23.colorStartTag(16777215);
									if (Client.selectedItemName == null) {
										Client.selectedItemName = "null";
									}

									return;
								}

								if (var2 == 39) {
									var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2330, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method5578(var3);
									var8.packetBuffer.method5718(var1);
									var8.packetBuffer.method5578(var0);
									Client.packetWriter.addNode(var8);
									Client.field754 = 0;
									NPC.field1131 = CollisionMap.getWidget(var1);
									Client.field881 = var0;
								} else if (var2 == 40) {
									var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2264, Client.packetWriter.isaacCipher);
									var8.packetBuffer.writeShort(var3);
									var8.packetBuffer.method5739(var0);
									var8.packetBuffer.writeInt(var1);
									Client.packetWriter.addNode(var8);
									Client.field754 = 0;
									NPC.field1131 = CollisionMap.getWidget(var1);
									Client.field881 = var0;
								} else if (var2 == 41) {
									var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2294, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method5578(var3);
									var8.packetBuffer.writeInt(var1);
									var8.packetBuffer.method5739(var0);
									Client.packetWriter.addNode(var8);
									Client.field754 = 0;
									NPC.field1131 = CollisionMap.getWidget(var1);
									Client.field881 = var0;
								} else if (var2 == 42) {
									var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2315, Client.packetWriter.isaacCipher);
									var8.packetBuffer.writeShortLE(var0);
									var8.packetBuffer.writeShortLE(var3);
									var8.packetBuffer.method5587(var1);
									Client.packetWriter.addNode(var8);
									Client.field754 = 0;
									NPC.field1131 = CollisionMap.getWidget(var1);
									Client.field881 = var0;
								} else if (var2 == 43) {
									var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2257, Client.packetWriter.isaacCipher);
									var8.packetBuffer.writeShortLE(var3);
									var8.packetBuffer.writeShortLE(var0);
									var8.packetBuffer.method5588(var1);
									Client.packetWriter.addNode(var8);
									Client.field754 = 0;
									NPC.field1131 = CollisionMap.getWidget(var1);
									Client.field881 = var0;
								} else if (var2 == 44) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2260, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method5568(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.writeShortLE(var3);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 45) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2238, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeShortLE(var3);
										var9.packetBuffer.method5569(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 46) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2278, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeShort(var3);
										var9.packetBuffer.method5568(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 47) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2312, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeShortLE(var3);
										var9.packetBuffer.method5568(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 48) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2253, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method5569(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.method5578(var3);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 49) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2242, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method5568(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.method5578(var3);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 50) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2268, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method5578(var3);
										var9.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 51) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2282, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.writeShort(var3);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 != 57 && var2 != 1007) {
									if (var2 == 58) {
										var16 = class92.getWidgetChild(var1, var0);
										if (var16 != null) {
											var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2296, Client.packetWriter.isaacCipher);
											var9.packetBuffer.writeInt(MouseHandler.selectedSpellWidget);
											var9.packetBuffer.writeShort(var0);
											var9.packetBuffer.method5578(Client.field836);
											var9.packetBuffer.writeShortLE(Client.selectedSpellChildIndex);
											var9.packetBuffer.method5739(var16.itemId);
											var9.packetBuffer.method5718(var1);
											Client.packetWriter.addNode(var9);
										}
									} else if (var2 == 1001) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2271, Client.packetWriter.isaacCipher);
										var8.packetBuffer.method5569(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var8.packetBuffer.method5739(class41.baseY * 64 + var1);
										var8.packetBuffer.method5739(NetFileRequest.baseX * 64 + var0);
										var8.packetBuffer.writeShort(var3);
										Client.packetWriter.addNode(var8);
									} else if (var2 == 1002) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2321, Client.packetWriter.isaacCipher);
										var8.packetBuffer.method5739(var3);
										Client.packetWriter.addNode(var8);
									} else if (var2 == 1003) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										var13 = Client.npcs[var3];
										if (var13 != null) {
											NPCDefinition var17 = var13.definition;
											if (var17.transforms != null) {
												var17 = var17.transform();
											}

											if (var17 != null) {
												var12 = ItemContainer.getPacketBufferNode(ClientPacket.field2288, Client.packetWriter.isaacCipher);
												var12.packetBuffer.method5739(var17.id);
												Client.packetWriter.addNode(var12);
											}
										}
									} else if (var2 == 1004) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2313, Client.packetWriter.isaacCipher);
										var8.packetBuffer.method5578(var3);
										Client.packetWriter.addNode(var8);
									} else if (var2 == 1005) {
										var16 = CollisionMap.getWidget(var1);
										if (var16 != null && var16.itemQuantities[var0] >= 100000) {
											class234.addGameMessage(27, "", var16.itemQuantities[var0] + " x " + SecureRandomCallable.ItemDefinition_get(var3).name);
										} else {
											var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2313, Client.packetWriter.isaacCipher);
											var9.packetBuffer.method5578(var3);
											Client.packetWriter.addNode(var9);
										}

										Client.field754 = 0;
										NPC.field1131 = CollisionMap.getWidget(var1);
										Client.field881 = var0;
									} else if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1012) {
										WorldMapRectangle.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1));
									}
								} else {
									var16 = class92.getWidgetChild(var1, var0);
									if (var16 != null) {
										class3.widgetDefaultMenuAction(var3, var1, var0, var16.itemId, var5);
									}
								}
							}
						}
					}
				}
			}
		}

		if (Client.isItemSelected != 0) {
			Client.isItemSelected = 0;
			CollisionMap.invalidateWidget(CollisionMap.getWidget(WorldMapLabelSize.selectedItemWidget));
		}

		if (Client.isSpellSelected) {
			WorldMapManager.Widget_runOnTargetLeave();
		}

		if (NPC.field1131 != null && Client.field754 == 0) {
			CollisionMap.invalidateWidget(NPC.field1131);
		}

	}
}
