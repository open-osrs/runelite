import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lw")
@Implements("IgnoreList")
public class IgnoreList extends UserList {
	@ObfuscatedName("sg")
	@ObfuscatedGetter(
		intValue = 1060478283
	)
	static int field3918;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	@Export("loginType")
	final LoginType loginType;

	@ObfuscatedSignature(
		descriptor = "(Lnf;)V"
	)
	public IgnoreList(LoginType var1) {
		super(400);
		this.loginType = var1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)Lle;",
		garbageValue = "27"
	)
	@Export("newInstance")
	User newInstance() {
		return new Ignored();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)[Lle;",
		garbageValue = "-1704587572"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new Ignored[var1];
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lot;IB)V",
		garbageValue = "6"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		while (true) {
			if (var1.offset < var2) {
				int var3 = var1.readUnsignedByte();
				boolean var4 = (var3 & 1) == 1;
				Username var5 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
				Username var6 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
				var1.readStringCp1252NullTerminated();
				if (var5 != null && var5.hasCleanName()) {
					Ignored var7 = (Ignored)this.getByCurrentUsername(var5);
					if (var4) {
						Ignored var8 = (Ignored)this.getByCurrentUsername(var6);
						if (var8 != null && var8 != var7) {
							if (var7 != null) {
								this.remove(var8);
							} else {
								var7 = var8;
							}
						}
					}

					if (var7 != null) {
						this.changeName(var7, var5, var6);
						continue;
					}

					if (this.getSize() < 400) {
						int var9 = this.getSize();
						var7 = (Ignored)this.addLast(var5, var6);
						var7.id = var9;
					}
					continue;
				}

				throw new IllegalStateException();
			}

			return;
		}
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "-29"
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
			var8 = FriendSystem.getPacketBufferNode(ClientPacket.field2683, Client.packetWriter.isaacCipher);
			var8.packetBuffer.writeInt(Tiles.selectedItemWidget);
			var8.packetBuffer.writeShort(DesktopPlatformInfoProvider.selectedItemSlot);
			var8.packetBuffer.method6852(var0 + FloorOverlayDefinition.baseX);
			var8.packetBuffer.writeShort(class320.baseY + var1);
			var8.packetBuffer.writeShort(var3);
			var8.packetBuffer.method6843(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.writeShort(class92.selectedItemId);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 2) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = FriendSystem.getPacketBufferNode(ClientPacket.field2672, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method6852(var3);
			var8.packetBuffer.writeShort(class320.baseY + var1);
			var8.packetBuffer.method6951(var0 + FloorOverlayDefinition.baseX);
			var8.packetBuffer.method6951(Client.selectedSpellChildIndex);
			var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method6951(Client.field645);
			var8.packetBuffer.writeInt(WorldMapEvent.selectedSpellWidget);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 3) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = FriendSystem.getPacketBufferNode(ClientPacket.field2709, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method6819(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method6851(var0 + FloorOverlayDefinition.baseX);
			var8.packetBuffer.method6951(class320.baseY + var1);
			var8.packetBuffer.writeShort(var3);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 4) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = FriendSystem.getPacketBufferNode(ClientPacket.field2653, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method6951(var3);
			var8.packetBuffer.method6851(class320.baseY + var1);
			var8.packetBuffer.method6951(var0 + FloorOverlayDefinition.baseX);
			var8.packetBuffer.method6841(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 5) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = FriendSystem.getPacketBufferNode(ClientPacket.field2732, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method6841(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method6852(var3);
			var8.packetBuffer.method6852(class320.baseY + var1);
			var8.packetBuffer.method6951(var0 + FloorOverlayDefinition.baseX);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 6) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = FriendSystem.getPacketBufferNode(ClientPacket.field2710, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method6852(var0 + FloorOverlayDefinition.baseX);
			var8.packetBuffer.method6841(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method6951(var3);
			var8.packetBuffer.method6851(class320.baseY + var1);
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
					var9 = FriendSystem.getPacketBufferNode(ClientPacket.field2680, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeShort(var3);
					var9.packetBuffer.method6841(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.method6852(class92.selectedItemId);
					var9.packetBuffer.method6861(Tiles.selectedItemWidget);
					var9.packetBuffer.method6852(DesktopPlatformInfoProvider.selectedItemSlot);
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
					var9 = FriendSystem.getPacketBufferNode(ClientPacket.field2743, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeIntME(WorldMapEvent.selectedSpellWidget);
					var9.packetBuffer.method6851(var3);
					var9.packetBuffer.method6851(Client.field645);
					var9.packetBuffer.writeShort(Client.selectedSpellChildIndex);
					var9.packetBuffer.method6843(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
					var9 = FriendSystem.getPacketBufferNode(ClientPacket.field2706, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.method6951(var3);
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
					var9 = FriendSystem.getPacketBufferNode(ClientPacket.field2728, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeShort(var3);
					var9.packetBuffer.method6843(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
					var9 = FriendSystem.getPacketBufferNode(ClientPacket.field2660, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method6951(var3);
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
					var9 = FriendSystem.getPacketBufferNode(ClientPacket.field2646, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method6819(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.writeShort(var3);
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
					var9 = FriendSystem.getPacketBufferNode(ClientPacket.field2658, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.method6851(var3);
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
						var9 = FriendSystem.getPacketBufferNode(ClientPacket.field2693, Client.packetWriter.isaacCipher);
						var9.packetBuffer.method6951(var3);
						var9.packetBuffer.writeShort(DesktopPlatformInfoProvider.selectedItemSlot);
						var9.packetBuffer.method6851(class92.selectedItemId);
						var9.packetBuffer.writeIntME(Tiles.selectedItemWidget);
						var9.packetBuffer.method6819(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
						var9 = FriendSystem.getPacketBufferNode(ClientPacket.field2685, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeShort(Client.field645);
						var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
						var9.packetBuffer.writeInt(WorldMapEvent.selectedSpellWidget);
						var9.packetBuffer.method6852(Client.selectedSpellChildIndex);
						var9.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var9);
					}
				} else if (var2 == 16) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = FriendSystem.getPacketBufferNode(ClientPacket.field2640, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6951(class320.baseY + var1);
					var8.packetBuffer.method6861(Tiles.selectedItemWidget);
					var8.packetBuffer.method6852(var0 + FloorOverlayDefinition.baseX);
					var8.packetBuffer.method6852(DesktopPlatformInfoProvider.selectedItemSlot);
					var8.packetBuffer.method6951(var3);
					var8.packetBuffer.writeShort(class92.selectedItemId);
					var8.packetBuffer.method6819(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 17) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = FriendSystem.getPacketBufferNode(ClientPacket.field2643, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6852(Client.selectedSpellChildIndex);
					var8.packetBuffer.writeInt(WorldMapEvent.selectedSpellWidget);
					var8.packetBuffer.method6951(var3);
					var8.packetBuffer.writeShort(class320.baseY + var1);
					var8.packetBuffer.method6951(var0 + FloorOverlayDefinition.baseX);
					var8.packetBuffer.method6843(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method6951(Client.field645);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 18) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = FriendSystem.getPacketBufferNode(ClientPacket.field2724, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6843(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method6851(class320.baseY + var1);
					var8.packetBuffer.method6852(var0 + FloorOverlayDefinition.baseX);
					var8.packetBuffer.method6851(var3);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 19) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = FriendSystem.getPacketBufferNode(ClientPacket.field2729, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6851(var0 + FloorOverlayDefinition.baseX);
					var8.packetBuffer.method6951(var3);
					var8.packetBuffer.method6852(class320.baseY + var1);
					var8.packetBuffer.method6819(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 20) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = FriendSystem.getPacketBufferNode(ClientPacket.field2659, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6841(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method6851(class320.baseY + var1);
					var8.packetBuffer.method6851(var3);
					var8.packetBuffer.writeShort(var0 + FloorOverlayDefinition.baseX);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 21) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = FriendSystem.getPacketBufferNode(ClientPacket.field2702, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6843(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method6951(var0 + FloorOverlayDefinition.baseX);
					var8.packetBuffer.method6851(var3);
					var8.packetBuffer.method6851(class320.baseY + var1);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 22) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = FriendSystem.getPacketBufferNode(ClientPacket.field2740, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6951(var3);
					var8.packetBuffer.method6851(var0 + FloorOverlayDefinition.baseX);
					var8.packetBuffer.method6843(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method6951(class320.baseY + var1);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 23) {
					if (Client.isMenuOpen) {
						CollisionMap.scene.setViewportWalking();
					} else {
						CollisionMap.scene.menuOpen(class391.Client_plane, var0, var1, true);
					}
				} else {
					PacketBufferNode var10;
					Widget var16;
					if (var2 == 24) {
						var16 = class87.getWidget(var1);
						boolean var11 = true;
						if (var16.contentType > 0) {
							var11 = class119.method2508(var16);
						}

						if (var11) {
							var10 = FriendSystem.getPacketBufferNode(ClientPacket.field2662, Client.packetWriter.isaacCipher);
							var10.packetBuffer.writeInt(var1);
							Client.packetWriter.addNode(var10);
						}
					} else {
						if (var2 == 25) {
							var16 = ParamComposition.getWidgetChild(var1, var0);
							if (var16 != null) {
								ReflectionCheck.Widget_runOnTargetLeave();
								DirectByteArrayCopier.selectSpell(var1, var0, class138.Widget_unpackTargetMask(Decimator.getWidgetFlags(var16)), var16.itemId);
								Client.isItemSelected = 0;
								Client.selectedSpellActionName = FileSystem.Widget_getSpellActionName(var16);
								if (Client.selectedSpellActionName == null) {
									Client.selectedSpellActionName = "null";
								}

								if (var16.isIf3) {
									Client.selectedSpellName = var16.dataText + class54.colorStartTag(16777215);
								} else {
									Client.selectedSpellName = class54.colorStartTag(65280) + var16.spellName + class54.colorStartTag(16777215);
								}
							}

							return;
						}

						if (var2 == 26) {
							FriendsChat.method5904();
						} else {
							int var12;
							Widget var14;
							if (var2 == 28) {
								var8 = FriendSystem.getPacketBufferNode(ClientPacket.field2662, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var8);
								var14 = class87.getWidget(var1);
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) {
									var12 = var14.cs1Instructions[0][1];
									Varps.Varps_main[var12] = 1 - Varps.Varps_main[var12];
									InvDefinition.changeGameOptions(var12);
								}
							} else if (var2 == 29) {
								var8 = FriendSystem.getPacketBufferNode(ClientPacket.field2662, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var8);
								var14 = class87.getWidget(var1);
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) {
									var12 = var14.cs1Instructions[0][1];
									if (Varps.Varps_main[var12] != var14.cs1ComparisonValues[0]) {
										Varps.Varps_main[var12] = var14.cs1ComparisonValues[0];
										InvDefinition.changeGameOptions(var12);
									}
								}
							} else if (var2 == 30) {
								if (Client.meslayerContinueWidget == null) {
									DevicePcmPlayerProvider.resumePauseWidget(var1, var0);
									Client.meslayerContinueWidget = ParamComposition.getWidgetChild(var1, var0);
									Actor.invalidateWidget(Client.meslayerContinueWidget);
								}
							} else if (var2 == 31) {
								var8 = FriendSystem.getPacketBufferNode(ClientPacket.field2652, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method6951(var0);
								var8.packetBuffer.method6860(var1);
								var8.packetBuffer.method6951(class92.selectedItemId);
								var8.packetBuffer.writeInt(Tiles.selectedItemWidget);
								var8.packetBuffer.method6851(DesktopPlatformInfoProvider.selectedItemSlot);
								var8.packetBuffer.method6852(var3);
								Client.packetWriter.addNode(var8);
								Client.field727 = 0;
								FriendsChat.field3934 = class87.getWidget(var1);
								Client.field593 = var0;
							} else if (var2 == 32) {
								var8 = FriendSystem.getPacketBufferNode(ClientPacket.field2745, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeIntME(WorldMapEvent.selectedSpellWidget);
								var8.packetBuffer.writeShort(Client.selectedSpellChildIndex);
								var8.packetBuffer.writeInt(var1);
								var8.packetBuffer.method6852(var3);
								var8.packetBuffer.method6951(var0);
								Client.packetWriter.addNode(var8);
								Client.field727 = 0;
								FriendsChat.field3934 = class87.getWidget(var1);
								Client.field593 = var0;
							} else if (var2 == 33) {
								var8 = FriendSystem.getPacketBufferNode(ClientPacket.field2708, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeIntME(var1);
								var8.packetBuffer.writeShort(var3);
								var8.packetBuffer.method6852(var0);
								Client.packetWriter.addNode(var8);
								Client.field727 = 0;
								FriendsChat.field3934 = class87.getWidget(var1);
								Client.field593 = var0;
							} else if (var2 == 34) {
								var8 = FriendSystem.getPacketBufferNode(ClientPacket.field2694, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method6851(var0);
								var8.packetBuffer.writeShort(var3);
								var8.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var8);
								Client.field727 = 0;
								FriendsChat.field3934 = class87.getWidget(var1);
								Client.field593 = var0;
							} else if (var2 == 35) {
								var8 = FriendSystem.getPacketBufferNode(ClientPacket.field2718, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method6852(var0);
								var8.packetBuffer.writeIntME(var1);
								var8.packetBuffer.writeShort(var3);
								Client.packetWriter.addNode(var8);
								Client.field727 = 0;
								FriendsChat.field3934 = class87.getWidget(var1);
								Client.field593 = var0;
							} else if (var2 == 36) {
								var8 = FriendSystem.getPacketBufferNode(ClientPacket.field2681, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeShort(var0);
								var8.packetBuffer.method6852(var3);
								var8.packetBuffer.method6861(var1);
								Client.packetWriter.addNode(var8);
								Client.field727 = 0;
								FriendsChat.field3934 = class87.getWidget(var1);
								Client.field593 = var0;
							} else if (var2 == 37) {
								var8 = FriendSystem.getPacketBufferNode(ClientPacket.field2642, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeShort(var3);
								var8.packetBuffer.method6861(var1);
								var8.packetBuffer.method6852(var0);
								Client.packetWriter.addNode(var8);
								Client.field727 = 0;
								FriendsChat.field3934 = class87.getWidget(var1);
								Client.field593 = var0;
							} else {
								if (var2 == 38) {
									ReflectionCheck.Widget_runOnTargetLeave();
									var16 = class87.getWidget(var1);
									Client.isItemSelected = 1;
									DesktopPlatformInfoProvider.selectedItemSlot = var0;
									Tiles.selectedItemWidget = var1;
									class92.selectedItemId = var3;
									Actor.invalidateWidget(var16);
									Client.selectedItemName = class54.colorStartTag(16748608) + class65.ItemDefinition_get(var3).name + class54.colorStartTag(16777215);
									if (Client.selectedItemName == null) {
										Client.selectedItemName = "null";
									}

									return;
								}

								if (var2 == 39) {
									var8 = FriendSystem.getPacketBufferNode(ClientPacket.field2682, Client.packetWriter.isaacCipher);
									var8.packetBuffer.writeInt(var1);
									var8.packetBuffer.method6852(var0);
									var8.packetBuffer.writeShort(var3);
									Client.packetWriter.addNode(var8);
									Client.field727 = 0;
									FriendsChat.field3934 = class87.getWidget(var1);
									Client.field593 = var0;
								} else if (var2 == 40) {
									var8 = FriendSystem.getPacketBufferNode(ClientPacket.field2663, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method6951(var3);
									var8.packetBuffer.writeInt(var1);
									var8.packetBuffer.method6852(var0);
									Client.packetWriter.addNode(var8);
									Client.field727 = 0;
									FriendsChat.field3934 = class87.getWidget(var1);
									Client.field593 = var0;
								} else if (var2 == 41) {
									var8 = FriendSystem.getPacketBufferNode(ClientPacket.field2734, Client.packetWriter.isaacCipher);
									var8.packetBuffer.writeShort(var3);
									var8.packetBuffer.writeShort(var0);
									var8.packetBuffer.method6861(var1);
									Client.packetWriter.addNode(var8);
									Client.field727 = 0;
									FriendsChat.field3934 = class87.getWidget(var1);
									Client.field593 = var0;
								} else if (var2 == 42) {
									var8 = FriendSystem.getPacketBufferNode(ClientPacket.field2705, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method6851(var0);
									var8.packetBuffer.writeShort(var3);
									var8.packetBuffer.writeIntME(var1);
									Client.packetWriter.addNode(var8);
									Client.field727 = 0;
									FriendsChat.field3934 = class87.getWidget(var1);
									Client.field593 = var0;
								} else if (var2 == 43) {
									var8 = FriendSystem.getPacketBufferNode(ClientPacket.field2674, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method6851(var3);
									var8.packetBuffer.method6860(var1);
									var8.packetBuffer.method6851(var0);
									Client.packetWriter.addNode(var8);
									Client.field727 = 0;
									FriendsChat.field3934 = class87.getWidget(var1);
									Client.field593 = var0;
								} else if (var2 == 44) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = FriendSystem.getPacketBufferNode(ClientPacket.field2670, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method6841(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.method6851(var3);
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
										var9 = FriendSystem.getPacketBufferNode(ClientPacket.field2741, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.method6951(var3);
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
										var9 = FriendSystem.getPacketBufferNode(ClientPacket.field2651, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method6841(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.method6851(var3);
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
										var9 = FriendSystem.getPacketBufferNode(ClientPacket.field2715, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method6851(var3);
										var9.packetBuffer.method6819(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
										var9 = FriendSystem.getPacketBufferNode(ClientPacket.field2648, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeShort(var3);
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
										var9 = FriendSystem.getPacketBufferNode(ClientPacket.field2657, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeShort(var3);
										var9.packetBuffer.method6841(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
										var9 = FriendSystem.getPacketBufferNode(ClientPacket.field2676, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method6951(var3);
										var9.packetBuffer.method6819(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
										var9 = FriendSystem.getPacketBufferNode(ClientPacket.field2713, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method6843(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.method6951(var3);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 != 57 && var2 != 1007) {
									if (var2 == 58) {
										var16 = ParamComposition.getWidgetChild(var1, var0);
										if (var16 != null) {
											var9 = FriendSystem.getPacketBufferNode(ClientPacket.field2655, Client.packetWriter.isaacCipher);
											var9.packetBuffer.method6951(var16.itemId);
											var9.packetBuffer.writeInt(WorldMapEvent.selectedSpellWidget);
											var9.packetBuffer.method6951(Client.selectedSpellChildIndex);
											var9.packetBuffer.method6860(var1);
											var9.packetBuffer.writeShort(var0);
											var9.packetBuffer.method6951(Client.field645);
											Client.packetWriter.addNode(var9);
										}
									} else if (var2 == 1001) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var8 = FriendSystem.getPacketBufferNode(ClientPacket.field2649, Client.packetWriter.isaacCipher);
										var8.packetBuffer.method6951(var0 + FloorOverlayDefinition.baseX);
										var8.packetBuffer.method6851(class320.baseY + var1);
										var8.packetBuffer.writeShort(var3);
										var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var8);
									} else if (var2 == 1002) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										var8 = FriendSystem.getPacketBufferNode(ClientPacket.field2746, Client.packetWriter.isaacCipher);
										var8.packetBuffer.method6851(var3);
										Client.packetWriter.addNode(var8);
									} else if (var2 == 1003) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										var13 = Client.npcs[var3];
										if (var13 != null) {
											NPCComposition var17 = var13.definition;
											if (var17.transforms != null) {
												var17 = var17.transform();
											}

											if (var17 != null) {
												var10 = FriendSystem.getPacketBufferNode(ClientPacket.field2721, Client.packetWriter.isaacCipher);
												var10.packetBuffer.method6852(var17.id);
												Client.packetWriter.addNode(var10);
											}
										}
									} else if (var2 == 1004) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										var8 = FriendSystem.getPacketBufferNode(ClientPacket.field2712, Client.packetWriter.isaacCipher);
										var8.packetBuffer.method6851(var3);
										Client.packetWriter.addNode(var8);
									} else if (var2 == 1005) {
										var16 = class87.getWidget(var1);
										if (var16 != null && var16.itemQuantities[var0] >= 100000) {
											SecureRandomCallable.addGameMessage(27, "", var16.itemQuantities[var0] + " x " + class65.ItemDefinition_get(var3).name);
										} else {
											var9 = FriendSystem.getPacketBufferNode(ClientPacket.field2712, Client.packetWriter.isaacCipher);
											var9.packetBuffer.method6851(var3);
											Client.packetWriter.addNode(var9);
										}

										Client.field727 = 0;
										FriendsChat.field3934 = class87.getWidget(var1);
										Client.field593 = var0;
									} else if (var2 == 1010 || var2 == 1011 || var2 == 1008 || var2 == 1009 || var2 == 1012) {
										class65.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1));
									}
								} else {
									var16 = ParamComposition.getWidgetChild(var1, var0);
									if (var16 != null) {
										MouseHandler.widgetDefaultMenuAction(var3, var1, var0, var16.itemId, var5);
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
			Actor.invalidateWidget(class87.getWidget(Tiles.selectedItemWidget));
		}

		if (Client.isSpellSelected) {
			ReflectionCheck.Widget_runOnTargetLeave();
		}

		if (FriendsChat.field3934 != null && Client.field727 == 0) {
			Actor.invalidateWidget(FriendsChat.field3934);
		}

	}
}
