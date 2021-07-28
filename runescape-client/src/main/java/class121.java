import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
public class class121 extends class103 {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 725724105
	)
	int field1421;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1189710327
	)
	int field1420;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	final class106 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldn;)V"
	)
	class121(class106 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lnv;B)V",
		garbageValue = "0"
	)
	void vmethod2562(Buffer var1) {
		this.field1421 = var1.readInt();
		this.field1420 = var1.readInt();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ldj;I)V",
		garbageValue = "1598392944"
	)
	void vmethod2567(ClanSettings var1) {
		var1.method2371(this.field1421, this.field1420);
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-337711179"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) {
			Decimator.clientPreferences.roofsHidden = !Decimator.clientPreferences.roofsHidden;
			MilliClock.savePreferences();
			if (Decimator.clientPreferences.roofsHidden) {
				class120.addGameMessage(99, "", "Roofs are now all hidden");
			} else {
				class120.addGameMessage(99, "", "Roofs will only be removed selectively");
			}
		}

		if (var0.equalsIgnoreCase("displayfps")) {
			Client.displayFps = !Client.displayFps;
		}

		if (var0.equalsIgnoreCase("renderself")) {
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) {
			Client.showMouseOverText = !Client.showMouseOverText;
		}

		if (Client.staffModLevel >= 2) {
			if (var0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) {
				PcmPlayer.worldMap.showCoord = !PcmPlayer.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) {
				Client.displayFps = true;
			}

			if (var0.equalsIgnoreCase("fpsoff")) {
				Client.displayFps = false;
			}

			if (var0.equalsIgnoreCase("gc")) {
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) {
				WorldMapSection0.method3580();
			}
		}

		PacketBufferNode var1 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2665, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(var0.length() + 1);
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "1536626137"
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
			var8 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2617, Client.packetWriter.isaacCipher);
			var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method6693(KeyHandler.selectedItemSlot);
			var8.packetBuffer.method6703(Tiles.selectedItemWidget);
			var8.packetBuffer.writeShort(var3);
			var8.packetBuffer.writeShort(class103.selectedItemId);
			var8.packetBuffer.writeShort(var0 + GrandExchangeOfferNameComparator.baseX);
			var8.packetBuffer.method6786(NPC.baseY + var1);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 2) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2597, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method6776(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method6693(var3);
			var8.packetBuffer.method6786(NPC.baseY + var1);
			var8.packetBuffer.writeInt(PcmPlayer.selectedSpellWidget);
			var8.packetBuffer.method6786(var0 + GrandExchangeOfferNameComparator.baseX);
			var8.packetBuffer.method6786(Client.field564);
			var8.packetBuffer.method6786(Client.selectedSpellChildIndex);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 3) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2622, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method6776(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method6693(NPC.baseY + var1);
			var8.packetBuffer.method6693(var0 + GrandExchangeOfferNameComparator.baseX);
			var8.packetBuffer.method6693(var3);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 4) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2638, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method6683(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method6692(NPC.baseY + var1);
			var8.packetBuffer.method6692(var0 + GrandExchangeOfferNameComparator.baseX);
			var8.packetBuffer.writeShort(var3);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 5) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2591, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method6692(NPC.baseY + var1);
			var8.packetBuffer.method6693(var3);
			var8.packetBuffer.method6786(var0 + GrandExchangeOfferNameComparator.baseX);
			var8.packetBuffer.method6776(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 6) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2618, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method6693(NPC.baseY + var1);
			var8.packetBuffer.method6786(var0 + GrandExchangeOfferNameComparator.baseX);
			var8.packetBuffer.method6692(var3);
			var8.packetBuffer.method6683(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
					var9 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2615, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method6786(class103.selectedItemId);
					var9.packetBuffer.method6701(Tiles.selectedItemWidget);
					var9.packetBuffer.method6692(var3);
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.writeShort(KeyHandler.selectedItemSlot);
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
					var9 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2602, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeShort(Client.field564);
					var9.packetBuffer.method6683(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.writeShort(Client.selectedSpellChildIndex);
					var9.packetBuffer.method6703(PcmPlayer.selectedSpellWidget);
					var9.packetBuffer.method6693(var3);
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
					var9 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2606, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method6786(var3);
					var9.packetBuffer.method6683(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
					var9 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2574, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeShort(var3);
					var9.packetBuffer.method6776(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
					var9 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2609, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method6693(var3);
					var9.packetBuffer.method6683(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
					var9 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2626, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method6776(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.method6693(var3);
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
					var9 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2631, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.method6692(var3);
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
						var9 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2655, Client.packetWriter.isaacCipher);
						var9.packetBuffer.method6693(var3);
						var9.packetBuffer.writeShort(class103.selectedItemId);
						var9.packetBuffer.method6703(Tiles.selectedItemWidget);
						var9.packetBuffer.method6786(KeyHandler.selectedItemSlot);
						var9.packetBuffer.method6776(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
						var9 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2592, Client.packetWriter.isaacCipher);
						var9.packetBuffer.method6786(Client.field564);
						var9.packetBuffer.method6703(PcmPlayer.selectedSpellWidget);
						var9.packetBuffer.method6776(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
						var9.packetBuffer.method6786(Client.selectedSpellChildIndex);
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
					var8 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2593, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6786(NPC.baseY + var1);
					var8.packetBuffer.method6786(KeyHandler.selectedItemSlot);
					var8.packetBuffer.method6701(Tiles.selectedItemWidget);
					var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method6692(var3);
					var8.packetBuffer.method6786(class103.selectedItemId);
					var8.packetBuffer.method6693(var0 + GrandExchangeOfferNameComparator.baseX);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 17) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2565, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeIntME(PcmPlayer.selectedSpellWidget);
					var8.packetBuffer.method6692(var3);
					var8.packetBuffer.method6685(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method6692(Client.selectedSpellChildIndex);
					var8.packetBuffer.method6693(var0 + GrandExchangeOfferNameComparator.baseX);
					var8.packetBuffer.method6693(NPC.baseY + var1);
					var8.packetBuffer.method6693(Client.field564);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 18) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2594, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6692(var3);
					var8.packetBuffer.method6786(var0 + GrandExchangeOfferNameComparator.baseX);
					var8.packetBuffer.method6692(NPC.baseY + var1);
					var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 19) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2589, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6786(NPC.baseY + var1);
					var8.packetBuffer.method6786(var0 + GrandExchangeOfferNameComparator.baseX);
					var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method6786(var3);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 20) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2599, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6693(var0 + GrandExchangeOfferNameComparator.baseX);
					var8.packetBuffer.method6685(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method6693(NPC.baseY + var1);
					var8.packetBuffer.method6693(var3);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 21) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2584, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6693(var3);
					var8.packetBuffer.method6692(var0 + GrandExchangeOfferNameComparator.baseX);
					var8.packetBuffer.method6786(NPC.baseY + var1);
					var8.packetBuffer.method6683(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 22) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2596, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6786(var0 + GrandExchangeOfferNameComparator.baseX);
					var8.packetBuffer.method6786(NPC.baseY + var1);
					var8.packetBuffer.method6693(var3);
					var8.packetBuffer.method6685(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 23) {
					if (Client.isMenuOpen) {
						WorldMapIcon_1.scene.setViewportWalking();
					} else {
						WorldMapIcon_1.scene.menuOpen(GrandExchangeEvent.Client_plane, var0, var1, true);
					}
				} else {
					PacketBufferNode var10;
					Widget var16;
					if (var2 == 24) {
						var16 = UrlRequester.getWidget(var1);
						boolean var12 = true;
						if (var16.contentType > 0) {
							var12 = class376.method6560(var16);
						}

						if (var12) {
							var10 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2651, Client.packetWriter.isaacCipher);
							var10.packetBuffer.writeInt(var1);
							Client.packetWriter.addNode(var10);
						}
					} else {
						if (var2 == 25) {
							var16 = ObjectSound.getWidgetChild(var1, var0);
							if (var16 != null) {
								WorldMapIcon_1.Widget_runOnTargetLeave();
								ApproximateRouteStrategy.selectSpell(var1, var0, class103.Widget_unpackTargetMask(MusicPatchNode.getWidgetFlags(var16)), var16.itemId);
								Client.isItemSelected = 0;
								Client.selectedSpellActionName = PcmPlayer.Widget_getSpellActionName(var16);
								if (Client.selectedSpellActionName == null) {
									Client.selectedSpellActionName = "null";
								}

								if (var16.isIf3) {
									Client.selectedSpellName = var16.dataText + ScriptFrame.colorStartTag(16777215);
								} else {
									Client.selectedSpellName = ScriptFrame.colorStartTag(65280) + var16.spellName + ScriptFrame.colorStartTag(16777215);
								}
							}

							return;
						}

						if (var2 == 26) {
							PcmPlayer.method506();
						} else {
							int var11;
							Widget var14;
							if (var2 == 28) {
								var8 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2651, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var8);
								var14 = UrlRequester.getWidget(var1);
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) {
									var11 = var14.cs1Instructions[0][1];
									Varps.Varps_main[var11] = 1 - Varps.Varps_main[var11];
									ApproximateRouteStrategy.changeGameOptions(var11);
								}
							} else if (var2 == 29) {
								var8 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2651, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var8);
								var14 = UrlRequester.getWidget(var1);
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) {
									var11 = var14.cs1Instructions[0][1];
									if (Varps.Varps_main[var11] != var14.cs1ComparisonValues[0]) {
										Varps.Varps_main[var11] = var14.cs1ComparisonValues[0];
										ApproximateRouteStrategy.changeGameOptions(var11);
									}
								}
							} else if (var2 == 30) {
								if (Client.meslayerContinueWidget == null) {
									Tile.resumePauseWidget(var1, var0);
									Client.meslayerContinueWidget = ObjectSound.getWidgetChild(var1, var0);
									AttackOption.invalidateWidget(Client.meslayerContinueWidget);
								}
							} else if (var2 == 31) {
								var8 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2628, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method6703(Tiles.selectedItemWidget);
								var8.packetBuffer.writeShort(class103.selectedItemId);
								var8.packetBuffer.writeIntME(var1);
								var8.packetBuffer.method6692(var3);
								var8.packetBuffer.method6692(var0);
								var8.packetBuffer.method6692(KeyHandler.selectedItemSlot);
								Client.packetWriter.addNode(var8);
								Client.field512 = 0;
								Canvas.field77 = UrlRequester.getWidget(var1);
								Client.field513 = var0;
							} else if (var2 == 32) {
								var8 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2630, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method6786(var3);
								var8.packetBuffer.writeIntME(var1);
								var8.packetBuffer.method6692(var0);
								var8.packetBuffer.method6703(PcmPlayer.selectedSpellWidget);
								var8.packetBuffer.method6693(Client.selectedSpellChildIndex);
								Client.packetWriter.addNode(var8);
								Client.field512 = 0;
								Canvas.field77 = UrlRequester.getWidget(var1);
								Client.field513 = var0;
							} else if (var2 == 33) {
								var8 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2562, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeIntME(var1);
								var8.packetBuffer.method6693(var0);
								var8.packetBuffer.method6693(var3);
								Client.packetWriter.addNode(var8);
								Client.field512 = 0;
								Canvas.field77 = UrlRequester.getWidget(var1);
								Client.field513 = var0;
							} else if (var2 == 34) {
								var8 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2629, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeIntME(var1);
								var8.packetBuffer.method6786(var3);
								var8.packetBuffer.writeShort(var0);
								Client.packetWriter.addNode(var8);
								Client.field512 = 0;
								Canvas.field77 = UrlRequester.getWidget(var1);
								Client.field513 = var0;
							} else if (var2 == 35) {
								var8 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2581, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method6693(var3);
								var8.packetBuffer.method6701(var1);
								var8.packetBuffer.writeShort(var0);
								Client.packetWriter.addNode(var8);
								Client.field512 = 0;
								Canvas.field77 = UrlRequester.getWidget(var1);
								Client.field513 = var0;
							} else if (var2 == 36) {
								var8 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2619, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeShort(var0);
								var8.packetBuffer.method6786(var3);
								var8.packetBuffer.method6701(var1);
								Client.packetWriter.addNode(var8);
								Client.field512 = 0;
								Canvas.field77 = UrlRequester.getWidget(var1);
								Client.field513 = var0;
							} else if (var2 == 37) {
								var8 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2659, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method6701(var1);
								var8.packetBuffer.method6786(var3);
								var8.packetBuffer.method6692(var0);
								Client.packetWriter.addNode(var8);
								Client.field512 = 0;
								Canvas.field77 = UrlRequester.getWidget(var1);
								Client.field513 = var0;
							} else {
								if (var2 == 38) {
									WorldMapIcon_1.Widget_runOnTargetLeave();
									var16 = UrlRequester.getWidget(var1);
									Client.isItemSelected = 1;
									KeyHandler.selectedItemSlot = var0;
									Tiles.selectedItemWidget = var1;
									class103.selectedItemId = var3;
									AttackOption.invalidateWidget(var16);
									Client.selectedItemName = ScriptFrame.colorStartTag(16748608) + KeyHandler.ItemDefinition_get(var3).name + ScriptFrame.colorStartTag(16777215);
									if (Client.selectedItemName == null) {
										Client.selectedItemName = "null";
									}

									return;
								}

								if (var2 == 39) {
									var8 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2572, Client.packetWriter.isaacCipher);
									var8.packetBuffer.writeShort(var3);
									var8.packetBuffer.method6692(var0);
									var8.packetBuffer.writeInt(var1);
									Client.packetWriter.addNode(var8);
									Client.field512 = 0;
									Canvas.field77 = UrlRequester.getWidget(var1);
									Client.field513 = var0;
								} else if (var2 == 40) {
									var8 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2614, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method6701(var1);
									var8.packetBuffer.method6692(var0);
									var8.packetBuffer.method6693(var3);
									Client.packetWriter.addNode(var8);
									Client.field512 = 0;
									Canvas.field77 = UrlRequester.getWidget(var1);
									Client.field513 = var0;
								} else if (var2 == 41) {
									var8 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2635, Client.packetWriter.isaacCipher);
									var8.packetBuffer.writeIntME(var1);
									var8.packetBuffer.method6692(var3);
									var8.packetBuffer.writeShort(var0);
									Client.packetWriter.addNode(var8);
									Client.field512 = 0;
									Canvas.field77 = UrlRequester.getWidget(var1);
									Client.field513 = var0;
								} else if (var2 == 42) {
									var8 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2566, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method6693(var3);
									var8.packetBuffer.writeShort(var0);
									var8.packetBuffer.method6701(var1);
									Client.packetWriter.addNode(var8);
									Client.field512 = 0;
									Canvas.field77 = UrlRequester.getWidget(var1);
									Client.field513 = var0;
								} else if (var2 == 43) {
									var8 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2667, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method6701(var1);
									var8.packetBuffer.method6692(var3);
									var8.packetBuffer.method6786(var0);
									Client.packetWriter.addNode(var8);
									Client.field512 = 0;
									Canvas.field77 = UrlRequester.getWidget(var1);
									Client.field513 = var0;
								} else if (var2 == 44) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2624, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.method6786(var3);
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
										var9 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2604, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeShort(var3);
										var9.packetBuffer.method6776(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
										var9 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2660, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method6685(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.method6786(var3);
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
										var9 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2650, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method6693(var3);
										var9.packetBuffer.method6776(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
										var9 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2610, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method6786(var3);
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
										var9 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2569, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeShort(var3);
										var9.packetBuffer.method6685(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
										var9 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2627, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method6683(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.method6693(var3);
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
										var9 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2588, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeShort(var3);
										var9.packetBuffer.method6776(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var9);
									}
								} else {
									label634: {
										if (var2 != 57) {
											if (var2 == 58) {
												var16 = ObjectSound.getWidgetChild(var1, var0);
												if (var16 != null) {
													var9 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2605, Client.packetWriter.isaacCipher);
													var9.packetBuffer.method6692(var16.itemId);
													var9.packetBuffer.method6701(var1);
													var9.packetBuffer.writeShort(var0);
													var9.packetBuffer.method6693(Client.field564);
													var9.packetBuffer.method6701(PcmPlayer.selectedSpellWidget);
													var9.packetBuffer.writeShort(Client.selectedSpellChildIndex);
													Client.packetWriter.addNode(var9);
												}
												break label634;
											}

											if (var2 == 1001) {
												Client.mouseCrossX = var6;
												Client.mouseCrossY = var7;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												Client.destinationX = var0;
												Client.destinationY = var1;
												var8 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2611, Client.packetWriter.isaacCipher);
												var8.packetBuffer.writeShort(var3);
												var8.packetBuffer.method6693(NPC.baseY + var1);
												var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
												var8.packetBuffer.method6693(var0 + GrandExchangeOfferNameComparator.baseX);
												Client.packetWriter.addNode(var8);
												break label634;
											}

											if (var2 == 1002) {
												Client.mouseCrossX = var6;
												Client.mouseCrossY = var7;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var8 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2620, Client.packetWriter.isaacCipher);
												var8.packetBuffer.method6693(var3);
												Client.packetWriter.addNode(var8);
												break label634;
											}

											if (var2 == 1003) {
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
														var10 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2647, Client.packetWriter.isaacCipher);
														var10.packetBuffer.method6692(var17.id);
														Client.packetWriter.addNode(var10);
													}
												}
												break label634;
											}

											if (var2 == 1004) {
												Client.mouseCrossX = var6;
												Client.mouseCrossY = var7;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var8 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2586, Client.packetWriter.isaacCipher);
												var8.packetBuffer.method6693(var3);
												Client.packetWriter.addNode(var8);
												break label634;
											}

											if (var2 == 1005) {
												var16 = UrlRequester.getWidget(var1);
												if (var16 != null && var16.itemQuantities[var0] >= 100000) {
													class120.addGameMessage(27, "", var16.itemQuantities[var0] + " x " + KeyHandler.ItemDefinition_get(var3).name);
												} else {
													var9 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2586, Client.packetWriter.isaacCipher);
													var9.packetBuffer.method6693(var3);
													Client.packetWriter.addNode(var9);
												}

												Client.field512 = 0;
												Canvas.field77 = UrlRequester.getWidget(var1);
												Client.field513 = var0;
												break label634;
											}

											if (var2 != 1007) {
												if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1012) {
													PcmPlayer.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1));
												}
												break label634;
											}
										}

										var16 = ObjectSound.getWidgetChild(var1, var0);
										if (var16 != null) {
											class183.widgetDefaultMenuAction(var3, var1, var0, var16.itemId, var5);
										}
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
			AttackOption.invalidateWidget(UrlRequester.getWidget(Tiles.selectedItemWidget));
		}

		if (Client.isSpellSelected) {
			WorldMapIcon_1.Widget_runOnTargetLeave();
		}

		if (Canvas.field77 != null && Client.field512 == 0) {
			AttackOption.invalidateWidget(Canvas.field77);
		}

	}
}
