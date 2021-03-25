import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("aj")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	@Export("coord2")
	public final Coord coord2;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	@Export("coord1")
	public final Coord coord1;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -945361989
	)
	@Export("screenX")
	int screenX;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1326787305
	)
	@Export("screenY")
	int screenY;

	@ObfuscatedSignature(
		descriptor = "(Lhd;Lhd;)V"
	)
	AbstractWorldMapIcon(Coord var1, Coord var2) {
		this.coord1 = var1; // L: 13
		this.coord2 = var2; // L: 14
	} // L: 15

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "7"
	)
	@Export("getElement")
	public abstract int getElement();

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(S)Laa;",
		garbageValue = "31041"
	)
	@Export("getLabel")
	abstract WorldMapLabel getLabel();

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-413607837"
	)
	@Export("getSubWidth")
	abstract int getSubWidth();

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1875187157"
	)
	@Export("getSubHeight")
	abstract int getSubHeight();

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "8"
	)
	@Export("fitsScreen")
	boolean fitsScreen(int var1, int var2) {
		if (this.elementFitsScreen(var1, var2)) { // L: 18
			return true; // L: 19
		} else {
			return this.labelFitsScreen(var1, var2); // L: 21
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	@Export("hasValidElement")
	boolean hasValidElement() {
		return this.getElement() >= 0; // L: 33
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-24"
	)
	@Export("elementFitsScreen")
	boolean elementFitsScreen(int var1, int var2) {
		if (!this.hasValidElement()) { // L: 37
			return false;
		} else {
			WorldMapElement var3 = InvDefinition.WorldMapElement_get(this.getElement()); // L: 38
			int var4 = this.getSubWidth(); // L: 39
			int var5 = this.getSubHeight(); // L: 40
			switch(var3.horizontalAlignment.value) { // L: 41
			case 0:
				if (var1 <= this.screenX - var4 || var1 > this.screenX) { // L: 44
					return false;
				}
				break;
			case 1:
				if (var1 >= this.screenX && var1 < var4 + this.screenX) { // L: 49
					break;
				}

				return false;
			case 2:
				if (var1 < this.screenX - var4 / 2 || var1 > var4 / 2 + this.screenX) { // L: 54
					return false;
				}
			}

			switch(var3.verticalAlignment.value) { // L: 58
			case 0:
				if (var2 > this.screenY - var5 && var2 <= this.screenY) { // L: 66
					break;
				}

				return false;
			case 1:
				if (var2 >= this.screenY && var2 < var5 + this.screenY) { // L: 71
					break;
				}

				return false;
			case 2:
				if (var2 < this.screenY - var5 / 2 || var2 > var5 / 2 + this.screenY) { // L: 61
					return false;
				}
			}

			return true; // L: 75
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1453906321"
	)
	@Export("labelFitsScreen")
	boolean labelFitsScreen(int var1, int var2) {
		WorldMapLabel var3 = this.getLabel(); // L: 79
		if (var3 == null) {
			return false; // L: 81
		} else if (var1 >= this.screenX - var3.width / 2 && var1 <= var3.width / 2 + this.screenX) { // L: 83
			return var2 >= this.screenY && var2 <= var3.height + this.screenY; // L: 84
		} else {
			return false; // L: 85
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2147435814"
	)
	public static int method710(int var0) {
		return class25.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var0]); // L: 80
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ILcl;ZI)I",
		garbageValue = "1537886729"
	)
	static int method713(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class277.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 1013
		if (var0 == ScriptOpcodes.CC_GETX) { // L: 1014
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.x; // L: 1015
			return 1; // L: 1016
		} else if (var0 == ScriptOpcodes.CC_GETY) { // L: 1018
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.y; // L: 1019
			return 1; // L: 1020
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) { // L: 1022
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.width; // L: 1023
			return 1; // L: 1024
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) { // L: 1026
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.height; // L: 1027
			return 1; // L: 1028
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) { // L: 1030
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1031
			return 1; // L: 1032
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) { // L: 1034
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.parentId; // L: 1035
			return 1; // L: 1036
		} else {
			return 2; // L: 1038
		}
	}

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-83873281"
	)
	static final int method712() {
		if (WorldMapSectionType.clientPreferences.roofsHidden) { // L: 4348
			return class90.Client_plane;
		} else {
			int var0 = 3; // L: 4349
			if (KeyHandler.cameraPitch < 310) { // L: 4350
				label167: {
					int var1;
					int var2;
					if (Client.oculusOrbState == 1) { // L: 4353
						var1 = HealthBarUpdate.oculusOrbFocalPointX >> 7; // L: 4354
						var2 = ApproximateRouteStrategy.oculusOrbFocalPointY >> 7; // L: 4355
					} else {
						var1 = UserComparator9.localPlayer.x >> 7; // L: 4358
						var2 = UserComparator9.localPlayer.y >> 7; // L: 4359
					}

					int var3 = SecureRandomFuture.cameraX >> 7; // L: 4361
					int var4 = ObjectSound.cameraZ >> 7; // L: 4362
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 4363
						if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) { // L: 4364
							if ((Tiles.Tiles_renderFlags[class90.Client_plane][var3][var4] & 4) != 0) { // L: 4365
								var0 = class90.Client_plane;
							}

							int var5;
							if (var1 > var3) { // L: 4367
								var5 = var1 - var3;
							} else {
								var5 = var3 - var1; // L: 4368
							}

							int var6;
							if (var2 > var4) { // L: 4370
								var6 = var2 - var4;
							} else {
								var6 = var4 - var2; // L: 4371
							}

							int var7;
							int var8;
							if (var5 > var6) { // L: 4372
								var7 = var6 * 65536 / var5; // L: 4373
								var8 = 32768; // L: 4374

								while (true) {
									if (var1 == var3) { // L: 4375
										break label167;
									}

									if (var3 < var1) {
										++var3; // L: 4376
									} else if (var3 > var1) { // L: 4377
										--var3;
									}

									if ((Tiles.Tiles_renderFlags[class90.Client_plane][var3][var4] & 4) != 0) { // L: 4378
										var0 = class90.Client_plane;
									}

									var8 += var7; // L: 4379
									if (var8 >= 65536) { // L: 4380
										var8 -= 65536; // L: 4381
										if (var4 < var2) { // L: 4382
											++var4;
										} else if (var4 > var2) { // L: 4383
											--var4;
										}

										if ((Tiles.Tiles_renderFlags[class90.Client_plane][var3][var4] & 4) != 0) { // L: 4384
											var0 = class90.Client_plane;
										}
									}
								}
							} else {
								if (var6 > 0) { // L: 4388
									var7 = var5 * 65536 / var6; // L: 4389
									var8 = 32768; // L: 4390

									while (var4 != var2) { // L: 4391
										if (var4 < var2) { // L: 4392
											++var4;
										} else if (var4 > var2) { // L: 4393
											--var4;
										}

										if ((Tiles.Tiles_renderFlags[class90.Client_plane][var3][var4] & 4) != 0) { // L: 4394
											var0 = class90.Client_plane;
										}

										var8 += var7; // L: 4395
										if (var8 >= 65536) { // L: 4396
											var8 -= 65536; // L: 4397
											if (var3 < var1) { // L: 4398
												++var3;
											} else if (var3 > var1) { // L: 4399
												--var3;
											}

											if ((Tiles.Tiles_renderFlags[class90.Client_plane][var3][var4] & 4) != 0) { // L: 4400
												var0 = class90.Client_plane;
											}
										}
									}
								}
								break label167;
							}
						}

						return class90.Client_plane;
					}

					return class90.Client_plane;
				}
			}

			if (UserComparator9.localPlayer.x >= 0 && UserComparator9.localPlayer.y >= 0 && UserComparator9.localPlayer.x < 13312 && UserComparator9.localPlayer.y < 13312) { // L: 4405
				if ((Tiles.Tiles_renderFlags[class90.Client_plane][UserComparator9.localPlayer.x >> 7][UserComparator9.localPlayer.y >> 7] & 4) != 0) { // L: 4406
					var0 = class90.Client_plane;
				}

				return var0; // L: 4407
			} else {
				return class90.Client_plane;
			}
		}
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "58"
	)
	@Export("menuAction")
	static final void menuAction(int var0, int var1, int var2, int var3, String var4, String var5, int var6, int var7) {
		if (var2 >= 2000) { // L: 8016
			var2 -= 2000;
		}

		PacketBufferNode var8;
		if (var2 == 1) { // L: 8017
			Client.mouseCrossX = var6; // L: 8621
			Client.mouseCrossY = var7; // L: 8622
			Client.mouseCrossColor = 2; // L: 8623
			Client.mouseCrossState = 0; // L: 8624
			Client.destinationX = var0; // L: 8625
			Client.destinationY = var1; // L: 8626
			var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2247, Client.packetWriter.isaacCipher); // L: 8628
			var8.packetBuffer.writeShortLE(KeyHandler.selectedItemId); // L: 8629
			var8.packetBuffer.method5725(var3); // L: 8630
			var8.packetBuffer.method5725(class195.selectedItemSlot); // L: 8631
			var8.packetBuffer.writeShortLE(NetCache.baseY + var1); // L: 8632
			var8.packetBuffer.method5778(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8633
			var8.packetBuffer.writeIntME(var0 + GrandExchangeOfferNameComparator.baseX); // L: 8634
			var8.packetBuffer.method5876(ClientPacket.selectedItemWidget); // L: 8635
			Client.packetWriter.addNode(var8); // L: 8636
		} else if (var2 == 2) {
			Client.mouseCrossX = var6; // L: 8252
			Client.mouseCrossY = var7; // L: 8253
			Client.mouseCrossColor = 2; // L: 8254
			Client.mouseCrossState = 0; // L: 8255
			Client.destinationX = var0; // L: 8256
			Client.destinationY = var1; // L: 8257
			var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2309, Client.packetWriter.isaacCipher); // L: 8259
			var8.packetBuffer.method5883(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8260
			var8.packetBuffer.method5781(MidiPcmStream.selectedSpellWidget); // L: 8261
			var8.packetBuffer.writeIntME(var3); // L: 8262
			var8.packetBuffer.writeShort(NetCache.baseY + var1); // L: 8263
			var8.packetBuffer.writeIntME(Client.selectedSpellChildIndex); // L: 8264
			var8.packetBuffer.writeShortLE(var0 + GrandExchangeOfferNameComparator.baseX); // L: 8265
			Client.packetWriter.addNode(var8); // L: 8266
		} else if (var2 == 3) {
			Client.mouseCrossX = var6; // L: 8269
			Client.mouseCrossY = var7; // L: 8270
			Client.mouseCrossColor = 2; // L: 8271
			Client.mouseCrossState = 0; // L: 8272
			Client.destinationX = var0; // L: 8273
			Client.destinationY = var1; // L: 8274
			var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2323, Client.packetWriter.isaacCipher); // L: 8276
			var8.packetBuffer.method5725(NetCache.baseY + var1); // L: 8277
			var8.packetBuffer.method5725(var0 + GrandExchangeOfferNameComparator.baseX); // L: 8278
			var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8279
			var8.packetBuffer.writeShort(var3); // L: 8280
			Client.packetWriter.addNode(var8); // L: 8281
		} else if (var2 == 4) {
			Client.mouseCrossX = var6; // L: 8222
			Client.mouseCrossY = var7; // L: 8223
			Client.mouseCrossColor = 2; // L: 8224
			Client.mouseCrossState = 0; // L: 8225
			Client.destinationX = var0; // L: 8226
			Client.destinationY = var1; // L: 8227
			var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2307, Client.packetWriter.isaacCipher); // L: 8229
			var8.packetBuffer.method5725(NetCache.baseY + var1); // L: 8230
			var8.packetBuffer.method5778(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8231
			var8.packetBuffer.writeShortLE(var3); // L: 8232
			var8.packetBuffer.writeShort(var0 + GrandExchangeOfferNameComparator.baseX); // L: 8233
			Client.packetWriter.addNode(var8); // L: 8234
		} else if (var2 == 5) {
			Client.mouseCrossX = var6; // L: 8549
			Client.mouseCrossY = var7; // L: 8550
			Client.mouseCrossColor = 2; // L: 8551
			Client.mouseCrossState = 0; // L: 8552
			Client.destinationX = var0; // L: 8553
			Client.destinationY = var1; // L: 8554
			var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2324, Client.packetWriter.isaacCipher); // L: 8556
			var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8557
			var8.packetBuffer.writeShortLE(var3); // L: 8558
			var8.packetBuffer.writeShortLE(var0 + GrandExchangeOfferNameComparator.baseX); // L: 8559
			var8.packetBuffer.writeIntME(NetCache.baseY + var1); // L: 8560
			Client.packetWriter.addNode(var8); // L: 8561
		} else if (var2 == 6) {
			Client.mouseCrossX = var6; // L: 8358
			Client.mouseCrossY = var7; // L: 8359
			Client.mouseCrossColor = 2; // L: 8360
			Client.mouseCrossState = 0; // L: 8361
			Client.destinationX = var0; // L: 8362
			Client.destinationY = var1; // L: 8363
			var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2246, Client.packetWriter.isaacCipher); // L: 8365
			var8.packetBuffer.writeIntME(NetCache.baseY + var1); // L: 8366
			var8.packetBuffer.method5931(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8367
			var8.packetBuffer.writeIntME(var0 + GrandExchangeOfferNameComparator.baseX); // L: 8368
			var8.packetBuffer.writeIntME(var3); // L: 8369
			Client.packetWriter.addNode(var8); // L: 8370
		} else {
			PacketBufferNode var9;
			NPC var13;
			if (var2 == 7) {
				var13 = Client.npcs[var3]; // L: 8058
				if (var13 != null) { // L: 8059
					Client.mouseCrossX = var6; // L: 8060
					Client.mouseCrossY = var7; // L: 8061
					Client.mouseCrossColor = 2; // L: 8062
					Client.mouseCrossState = 0; // L: 8063
					Client.destinationX = var0; // L: 8064
					Client.destinationY = var1; // L: 8065
					var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2271, Client.packetWriter.isaacCipher); // L: 8067
					var9.packetBuffer.method5781(ClientPacket.selectedItemWidget); // L: 8068
					var9.packetBuffer.method5778(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8069
					var9.packetBuffer.writeShort(KeyHandler.selectedItemId); // L: 8070
					var9.packetBuffer.method5725(var3); // L: 8071
					var9.packetBuffer.writeShort(class195.selectedItemSlot); // L: 8072
					Client.packetWriter.addNode(var9); // L: 8073
				}
			} else if (var2 == 8) {
				var13 = Client.npcs[var3]; // L: 8077
				if (var13 != null) { // L: 8078
					Client.mouseCrossX = var6; // L: 8079
					Client.mouseCrossY = var7; // L: 8080
					Client.mouseCrossColor = 2; // L: 8081
					Client.mouseCrossState = 0; // L: 8082
					Client.destinationX = var0; // L: 8083
					Client.destinationY = var1; // L: 8084
					var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2267, Client.packetWriter.isaacCipher); // L: 8086
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8087
					var9.packetBuffer.writeIntME(var3); // L: 8088
					var9.packetBuffer.writeInt(MidiPcmStream.selectedSpellWidget); // L: 8089
					var9.packetBuffer.writeShort(Client.selectedSpellChildIndex); // L: 8090
					Client.packetWriter.addNode(var9); // L: 8091
				}
			} else if (var2 == 9) {
				var13 = Client.npcs[var3]; // L: 8309
				if (var13 != null) { // L: 8310
					Client.mouseCrossX = var6; // L: 8311
					Client.mouseCrossY = var7; // L: 8312
					Client.mouseCrossColor = 2; // L: 8313
					Client.mouseCrossState = 0; // L: 8314
					Client.destinationX = var0; // L: 8315
					Client.destinationY = var1; // L: 8316
					var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2236, Client.packetWriter.isaacCipher); // L: 8318
					var9.packetBuffer.method5883(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8319
					var9.packetBuffer.method5725(var3); // L: 8320
					Client.packetWriter.addNode(var9); // L: 8321
				}
			} else if (var2 == 10) {
				var13 = Client.npcs[var3]; // L: 8179
				if (var13 != null) { // L: 8180
					Client.mouseCrossX = var6; // L: 8181
					Client.mouseCrossY = var7; // L: 8182
					Client.mouseCrossColor = 2; // L: 8183
					Client.mouseCrossState = 0; // L: 8184
					Client.destinationX = var0; // L: 8185
					Client.destinationY = var1; // L: 8186
					var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2235, Client.packetWriter.isaacCipher); // L: 8188
					var9.packetBuffer.method5778(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8189
					var9.packetBuffer.writeShort(var3); // L: 8190
					Client.packetWriter.addNode(var9); // L: 8191
				}
			} else if (var2 == 11) {
				var13 = Client.npcs[var3]; // L: 8699
				if (var13 != null) { // L: 8700
					Client.mouseCrossX = var6; // L: 8701
					Client.mouseCrossY = var7; // L: 8702
					Client.mouseCrossColor = 2; // L: 8703
					Client.mouseCrossState = 0; // L: 8704
					Client.destinationX = var0; // L: 8705
					Client.destinationY = var1; // L: 8706
					var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2292, Client.packetWriter.isaacCipher); // L: 8708
					var9.packetBuffer.method5725(var3); // L: 8709
					var9.packetBuffer.method5883(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8710
					Client.packetWriter.addNode(var9); // L: 8711
				}
			} else if (var2 == 12) {
				var13 = Client.npcs[var3]; // L: 8342
				if (var13 != null) { // L: 8343
					Client.mouseCrossX = var6; // L: 8344
					Client.mouseCrossY = var7; // L: 8345
					Client.mouseCrossColor = 2; // L: 8346
					Client.mouseCrossState = 0; // L: 8347
					Client.destinationX = var0; // L: 8348
					Client.destinationY = var1; // L: 8349
					var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2231, Client.packetWriter.isaacCipher); // L: 8351
					var9.packetBuffer.method5778(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8352
					var9.packetBuffer.method5725(var3); // L: 8353
					Client.packetWriter.addNode(var9); // L: 8354
				}
			} else if (var2 == 13) {
				var13 = Client.npcs[var3]; // L: 8533
				if (var13 != null) { // L: 8534
					Client.mouseCrossX = var6; // L: 8535
					Client.mouseCrossY = var7; // L: 8536
					Client.mouseCrossColor = 2; // L: 8537
					Client.mouseCrossState = 0; // L: 8538
					Client.destinationX = var0; // L: 8539
					Client.destinationY = var1; // L: 8540
					var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2312, Client.packetWriter.isaacCipher); // L: 8542
					var9.packetBuffer.writeIntME(var3); // L: 8543
					var9.packetBuffer.method5931(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8544
					Client.packetWriter.addNode(var9); // L: 8545
				}
			} else {
				Player var15;
				if (var2 == 14) {
					var15 = Client.players[var3]; // L: 8469
					if (var15 != null) { // L: 8470
						Client.mouseCrossX = var6; // L: 8471
						Client.mouseCrossY = var7; // L: 8472
						Client.mouseCrossColor = 2; // L: 8473
						Client.mouseCrossState = 0; // L: 8474
						Client.destinationX = var0; // L: 8475
						Client.destinationY = var1; // L: 8476
						var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2265, Client.packetWriter.isaacCipher); // L: 8478
						var9.packetBuffer.method5931(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8479
						var9.packetBuffer.method5876(ClientPacket.selectedItemWidget); // L: 8480
						var9.packetBuffer.method5725(class195.selectedItemSlot); // L: 8481
						var9.packetBuffer.writeShortLE(var3); // L: 8482
						var9.packetBuffer.writeShortLE(KeyHandler.selectedItemId); // L: 8483
						Client.packetWriter.addNode(var9); // L: 8484
					}
				} else if (var2 == 15) {
					var15 = Client.players[var3]; // L: 8161
					if (var15 != null) { // L: 8162
						Client.mouseCrossX = var6; // L: 8163
						Client.mouseCrossY = var7; // L: 8164
						Client.mouseCrossColor = 2; // L: 8165
						Client.mouseCrossState = 0; // L: 8166
						Client.destinationX = var0; // L: 8167
						Client.destinationY = var1; // L: 8168
						var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2325, Client.packetWriter.isaacCipher); // L: 8170
						var9.packetBuffer.method5778(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8171
						var9.packetBuffer.writeIntME(var3); // L: 8172
						var9.packetBuffer.writeIntME(Client.selectedSpellChildIndex); // L: 8173
						var9.packetBuffer.method5876(MidiPcmStream.selectedSpellWidget); // L: 8174
						Client.packetWriter.addNode(var9); // L: 8175
					}
				} else if (var2 == 16) {
					Client.mouseCrossX = var6; // L: 8116
					Client.mouseCrossY = var7; // L: 8117
					Client.mouseCrossColor = 2; // L: 8118
					Client.mouseCrossState = 0; // L: 8119
					Client.destinationX = var0; // L: 8120
					Client.destinationY = var1; // L: 8121
					var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2238, Client.packetWriter.isaacCipher); // L: 8123
					var8.packetBuffer.writeShortLE(var3); // L: 8124
					var8.packetBuffer.writeShort(KeyHandler.selectedItemId); // L: 8125
					var8.packetBuffer.writeShort(NetCache.baseY + var1); // L: 8126
					var8.packetBuffer.writeIntME(var0 + GrandExchangeOfferNameComparator.baseX); // L: 8127
					var8.packetBuffer.method5883(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8128
					var8.packetBuffer.writeShort(class195.selectedItemSlot); // L: 8129
					var8.packetBuffer.method5876(ClientPacket.selectedItemWidget); // L: 8130
					Client.packetWriter.addNode(var8); // L: 8131
				} else if (var2 == 17) {
					Client.mouseCrossX = var6; // L: 8325
					Client.mouseCrossY = var7; // L: 8326
					Client.mouseCrossColor = 2; // L: 8327
					Client.mouseCrossState = 0; // L: 8328
					Client.destinationX = var0; // L: 8329
					Client.destinationY = var1; // L: 8330
					var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2266, Client.packetWriter.isaacCipher); // L: 8332
					var8.packetBuffer.method5725(Client.selectedSpellChildIndex); // L: 8333
					var8.packetBuffer.method5736(MidiPcmStream.selectedSpellWidget); // L: 8334
					var8.packetBuffer.writeShortLE(var3); // L: 8335
					var8.packetBuffer.method5931(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8336
					var8.packetBuffer.writeShort(NetCache.baseY + var1); // L: 8337
					var8.packetBuffer.writeShort(var0 + GrandExchangeOfferNameComparator.baseX); // L: 8338
					Client.packetWriter.addNode(var8); // L: 8339
				} else if (var2 == 18) {
					Client.mouseCrossX = var6; // L: 8684
					Client.mouseCrossY = var7; // L: 8685
					Client.mouseCrossColor = 2; // L: 8686
					Client.mouseCrossState = 0; // L: 8687
					Client.destinationX = var0; // L: 8688
					Client.destinationY = var1; // L: 8689
					var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2282, Client.packetWriter.isaacCipher); // L: 8691
					var8.packetBuffer.writeIntME(NetCache.baseY + var1); // L: 8692
					var8.packetBuffer.method5725(var3); // L: 8693
					var8.packetBuffer.writeShort(var0 + GrandExchangeOfferNameComparator.baseX); // L: 8694
					var8.packetBuffer.method5778(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8695
					Client.packetWriter.addNode(var8); // L: 8696
				} else if (var2 == 19) {
					Client.mouseCrossX = var6; // L: 8387
					Client.mouseCrossY = var7; // L: 8388
					Client.mouseCrossColor = 2; // L: 8389
					Client.mouseCrossState = 0; // L: 8390
					Client.destinationX = var0; // L: 8391
					Client.destinationY = var1; // L: 8392
					var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2256, Client.packetWriter.isaacCipher); // L: 8394
					var8.packetBuffer.writeShortLE(var0 + GrandExchangeOfferNameComparator.baseX); // L: 8395
					var8.packetBuffer.method5725(var3); // L: 8396
					var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8397
					var8.packetBuffer.writeShort(NetCache.baseY + var1); // L: 8398
					Client.packetWriter.addNode(var8); // L: 8399
				} else if (var2 == 20) {
					Client.mouseCrossX = var6; // L: 8237
					Client.mouseCrossY = var7; // L: 8238
					Client.mouseCrossColor = 2; // L: 8239
					Client.mouseCrossState = 0; // L: 8240
					Client.destinationX = var0; // L: 8241
					Client.destinationY = var1; // L: 8242
					var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2287, Client.packetWriter.isaacCipher); // L: 8244
					var8.packetBuffer.writeShort(var3); // L: 8245
					var8.packetBuffer.writeShortLE(NetCache.baseY + var1); // L: 8246
					var8.packetBuffer.method5931(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8247
					var8.packetBuffer.writeShortLE(var0 + GrandExchangeOfferNameComparator.baseX); // L: 8248
					Client.packetWriter.addNode(var8); // L: 8249
				} else if (var2 == 21) {
					Client.mouseCrossX = var6; // L: 8284
					Client.mouseCrossY = var7; // L: 8285
					Client.mouseCrossColor = 2; // L: 8286
					Client.mouseCrossState = 0; // L: 8287
					Client.destinationX = var0; // L: 8288
					Client.destinationY = var1; // L: 8289
					var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2249, Client.packetWriter.isaacCipher); // L: 8291
					var8.packetBuffer.writeShort(NetCache.baseY + var1); // L: 8292
					var8.packetBuffer.method5778(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8293
					var8.packetBuffer.writeIntME(var3); // L: 8294
					var8.packetBuffer.method5725(var0 + GrandExchangeOfferNameComparator.baseX); // L: 8295
					Client.packetWriter.addNode(var8); // L: 8296
				} else if (var2 == 22) {
					Client.mouseCrossX = var6; // L: 8488
					Client.mouseCrossY = var7; // L: 8489
					Client.mouseCrossColor = 2; // L: 8490
					Client.mouseCrossState = 0; // L: 8491
					Client.destinationX = var0; // L: 8492
					Client.destinationY = var1; // L: 8493
					var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2250, Client.packetWriter.isaacCipher); // L: 8495
					var8.packetBuffer.writeShort(NetCache.baseY + var1); // L: 8496
					var8.packetBuffer.writeIntME(var0 + GrandExchangeOfferNameComparator.baseX); // L: 8497
					var8.packetBuffer.writeShort(var3); // L: 8498
					var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8499
					Client.packetWriter.addNode(var8); // L: 8500
				} else if (var2 == 23) {
					if (Client.isMenuOpen) { // L: 8567
						MilliClock.scene.setViewportWalking(); // L: 8568
					} else {
						MilliClock.scene.menuOpen(class90.Client_plane, var0, var1, true); // L: 8571
					}
				} else {
					PacketBufferNode var11;
					Widget var16;
					if (var2 == 24) {
						var16 = class237.getWidget(var1); // L: 8758
						boolean var12 = true; // L: 8759
						if (var16.contentType > 0) { // L: 8760
							var12 = WorldMapLabelSize.method254(var16);
						}

						if (var12) { // L: 8761
							var11 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2262, Client.packetWriter.isaacCipher); // L: 8763
							var11.packetBuffer.writeInt(var1); // L: 8764
							Client.packetWriter.addNode(var11); // L: 8765
						}
					} else {
						if (var2 == 25) {
							var16 = ArchiveLoader.getWidgetChild(var1, var0); // L: 8148
							if (var16 != null) { // L: 8149
								WorldMapSection2.Widget_runOnTargetLeave(); // L: 8150
								ArchiveDisk.selectSpell(var1, var0, MusicPatch.Widget_unpackTargetMask(class60.getWidgetFlags(var16)), var16.itemId); // L: 8151
								Client.isItemSelected = 0; // L: 8152
								Client.selectedSpellActionName = Player.Widget_getSpellActionName(var16); // L: 8153
								if (Client.selectedSpellActionName == null) { // L: 8154
									Client.selectedSpellActionName = "null";
								}

								if (var16.isIf3) { // L: 8155
									Client.selectedSpellName = var16.dataText + FileSystem.colorStartTag(16777215);
								} else {
									Client.selectedSpellName = FileSystem.colorStartTag(65280) + var16.spellName + FileSystem.colorStartTag(16777215); // L: 8156
								}
							}

							return; // L: 8158
						}

						if (var2 == 26) {
							ModeWhere.method3878(); // L: 8564
						} else {
							int var10;
							Widget var14;
							if (var2 == 28) {
								var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2262, Client.packetWriter.isaacCipher); // L: 8587
								var8.packetBuffer.writeInt(var1); // L: 8588
								Client.packetWriter.addNode(var8); // L: 8589
								var14 = class237.getWidget(var1); // L: 8590
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) { // L: 8591
									var10 = var14.cs1Instructions[0][1]; // L: 8592
									Varps.Varps_main[var10] = 1 - Varps.Varps_main[var10]; // L: 8593
									changeGameOptions(var10); // L: 8594
								}
							} else if (var2 == 29) {
								var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2262, Client.packetWriter.isaacCipher); // L: 8797
								var8.packetBuffer.writeInt(var1); // L: 8798
								Client.packetWriter.addNode(var8); // L: 8799
								var14 = class237.getWidget(var1); // L: 8800
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) { // L: 8801
									var10 = var14.cs1Instructions[0][1]; // L: 8802
									if (Varps.Varps_main[var10] != var14.cs1ComparisonValues[0]) { // L: 8803
										Varps.Varps_main[var10] = var14.cs1ComparisonValues[0]; // L: 8804
										changeGameOptions(var10); // L: 8805
									}
								}
							} else if (var2 == 30) {
								if (Client.meslayerContinueWidget == null) { // L: 8666
									class25.resumePauseWidget(var1, var0); // L: 8667
									Client.meslayerContinueWidget = ArchiveLoader.getWidgetChild(var1, var0); // L: 8668
									IsaacCipher.invalidateWidget(Client.meslayerContinueWidget); // L: 8669
								}
							} else if (var2 == 31) {
								var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2330, Client.packetWriter.isaacCipher); // L: 8374
								var8.packetBuffer.method5781(ClientPacket.selectedItemWidget); // L: 8375
								var8.packetBuffer.writeShortLE(var0); // L: 8376
								var8.packetBuffer.writeShortLE(var3); // L: 8377
								var8.packetBuffer.writeIntME(KeyHandler.selectedItemId); // L: 8378
								var8.packetBuffer.writeShort(class195.selectedItemSlot); // L: 8379
								var8.packetBuffer.method5876(var1); // L: 8380
								Client.packetWriter.addNode(var8); // L: 8381
								Client.field770 = 0; // L: 8382
								WorldMapSprite.field260 = class237.getWidget(var1); // L: 8383
								Client.field931 = var0; // L: 8384
							} else if (var2 == 32) {
								var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2284, Client.packetWriter.isaacCipher); // L: 8441
								var8.packetBuffer.writeShortLE(var3); // L: 8442
								var8.packetBuffer.writeIntME(var0); // L: 8443
								var8.packetBuffer.method5876(MidiPcmStream.selectedSpellWidget); // L: 8444
								var8.packetBuffer.method5736(var1); // L: 8445
								var8.packetBuffer.writeShortLE(Client.selectedSpellChildIndex); // L: 8446
								Client.packetWriter.addNode(var8); // L: 8447
								Client.field770 = 0; // L: 8448
								WorldMapSprite.field260 = class237.getWidget(var1); // L: 8449
								Client.field931 = var0; // L: 8450
							} else if (var2 == 33) {
								var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2286, Client.packetWriter.isaacCipher); // L: 8656
								var8.packetBuffer.method5781(var1); // L: 8657
								var8.packetBuffer.writeShort(var3); // L: 8658
								var8.packetBuffer.writeShortLE(var0); // L: 8659
								Client.packetWriter.addNode(var8); // L: 8660
								Client.field770 = 0; // L: 8661
								WorldMapSprite.field260 = class237.getWidget(var1); // L: 8662
								Client.field931 = var0; // L: 8663
							} else if (var2 == 34) {
								var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2251, Client.packetWriter.isaacCipher); // L: 8403
								var8.packetBuffer.writeIntME(var3); // L: 8404
								var8.packetBuffer.writeIntME(var0); // L: 8405
								var8.packetBuffer.method5781(var1); // L: 8406
								Client.packetWriter.addNode(var8); // L: 8407
								Client.field770 = 0; // L: 8408
								WorldMapSprite.field260 = class237.getWidget(var1); // L: 8409
								Client.field931 = var0; // L: 8410
							} else if (var2 == 35) {
								var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2316, Client.packetWriter.isaacCipher); // L: 8019
								var8.packetBuffer.writeIntME(var0); // L: 8020
								var8.packetBuffer.writeInt(var1); // L: 8021
								var8.packetBuffer.writeShortLE(var3); // L: 8022
								Client.packetWriter.addNode(var8); // L: 8023
								Client.field770 = 0; // L: 8024
								WorldMapSprite.field260 = class237.getWidget(var1); // L: 8025
								Client.field931 = var0; // L: 8026
							} else if (var2 == 36) {
								var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2318, Client.packetWriter.isaacCipher); // L: 8770
								var8.packetBuffer.writeIntME(var0); // L: 8771
								var8.packetBuffer.method5725(var3); // L: 8772
								var8.packetBuffer.method5876(var1); // L: 8773
								Client.packetWriter.addNode(var8); // L: 8774
								Client.field770 = 0; // L: 8775
								WorldMapSprite.field260 = class237.getWidget(var1); // L: 8776
								Client.field931 = var0; // L: 8777
							} else if (var2 == 37) {
								var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2229, Client.packetWriter.isaacCipher); // L: 8430
								var8.packetBuffer.method5736(var1); // L: 8431
								var8.packetBuffer.writeShort(var3); // L: 8432
								var8.packetBuffer.writeIntME(var0); // L: 8433
								Client.packetWriter.addNode(var8); // L: 8434
								Client.field770 = 0; // L: 8435
								WorldMapSprite.field260 = class237.getWidget(var1); // L: 8436
								Client.field931 = var0; // L: 8437
							} else {
								if (var2 == 38) {
									WorldMapSection2.Widget_runOnTargetLeave(); // L: 8609
									var16 = class237.getWidget(var1); // L: 8610
									Client.isItemSelected = 1; // L: 8611
									class195.selectedItemSlot = var0; // L: 8612
									ClientPacket.selectedItemWidget = var1; // L: 8613
									KeyHandler.selectedItemId = var3; // L: 8614
									IsaacCipher.invalidateWidget(var16); // L: 8615
									Client.selectedItemName = FileSystem.colorStartTag(16748608) + class281.ItemDefinition_get(var3).name + FileSystem.colorStartTag(16777215); // L: 8616
									if (Client.selectedItemName == null) { // L: 8617
										Client.selectedItemName = "null";
									}

									return; // L: 8618
								}

								if (var2 == 39) {
									var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2255, Client.packetWriter.isaacCipher); // L: 8599
									var8.packetBuffer.writeShortLE(var3); // L: 8600
									var8.packetBuffer.writeShortLE(var0); // L: 8601
									var8.packetBuffer.method5876(var1); // L: 8602
									Client.packetWriter.addNode(var8); // L: 8603
									Client.field770 = 0; // L: 8604
									WorldMapSprite.field260 = class237.getWidget(var1); // L: 8605
									Client.field931 = var0; // L: 8606
								} else if (var2 == 40) {
									var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2294, Client.packetWriter.isaacCipher); // L: 8576
									var8.packetBuffer.writeInt(var1); // L: 8577
									var8.packetBuffer.method5725(var3); // L: 8578
									var8.packetBuffer.method5725(var0); // L: 8579
									Client.packetWriter.addNode(var8); // L: 8580
									Client.field770 = 0; // L: 8581
									WorldMapSprite.field260 = class237.getWidget(var1); // L: 8582
									Client.field931 = var0; // L: 8583
								} else if (var2 == 41) {
									var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2232, Client.packetWriter.isaacCipher); // L: 8674
									var8.packetBuffer.method5876(var1); // L: 8675
									var8.packetBuffer.writeIntME(var0); // L: 8676
									var8.packetBuffer.writeShort(var3); // L: 8677
									Client.packetWriter.addNode(var8); // L: 8678
									Client.field770 = 0; // L: 8679
									WorldMapSprite.field260 = class237.getWidget(var1); // L: 8680
									Client.field931 = var0; // L: 8681
								} else if (var2 == 42) {
									var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2281, Client.packetWriter.isaacCipher); // L: 8212
									var8.packetBuffer.method5725(var0); // L: 8213
									var8.packetBuffer.writeShort(var3); // L: 8214
									var8.packetBuffer.method5736(var1); // L: 8215
									Client.packetWriter.addNode(var8); // L: 8216
									Client.field770 = 0; // L: 8217
									WorldMapSprite.field260 = class237.getWidget(var1); // L: 8218
									Client.field931 = var0; // L: 8219
								} else if (var2 == 43) {
									var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2297, Client.packetWriter.isaacCipher); // L: 8138
									var8.packetBuffer.writeShortLE(var0); // L: 8139
									var8.packetBuffer.method5736(var1); // L: 8140
									var8.packetBuffer.writeShort(var3); // L: 8141
									Client.packetWriter.addNode(var8); // L: 8142
									Client.field770 = 0; // L: 8143
									WorldMapSprite.field260 = class237.getWidget(var1); // L: 8144
									Client.field931 = var0; // L: 8145
								} else if (var2 == 44) {
									var15 = Client.players[var3]; // L: 8042
									if (var15 != null) { // L: 8043
										Client.mouseCrossX = var6; // L: 8044
										Client.mouseCrossY = var7; // L: 8045
										Client.mouseCrossColor = 2; // L: 8046
										Client.mouseCrossState = 0; // L: 8047
										Client.destinationX = var0; // L: 8048
										Client.destinationY = var1; // L: 8049
										var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2313, Client.packetWriter.isaacCipher); // L: 8051
										var9.packetBuffer.writeShortLE(var3); // L: 8052
										var9.packetBuffer.method5931(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8053
										Client.packetWriter.addNode(var9); // L: 8054
									}
								} else if (var2 == 45) {
									var15 = Client.players[var3]; // L: 8503
									if (var15 != null) { // L: 8504
										Client.mouseCrossX = var6; // L: 8505
										Client.mouseCrossY = var7; // L: 8506
										Client.mouseCrossColor = 2; // L: 8507
										Client.mouseCrossState = 0; // L: 8508
										Client.destinationX = var0; // L: 8509
										Client.destinationY = var1; // L: 8510
										var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2242, Client.packetWriter.isaacCipher); // L: 8512
										var9.packetBuffer.method5778(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8513
										var9.packetBuffer.writeShortLE(var3); // L: 8514
										Client.packetWriter.addNode(var9); // L: 8515
									}
								} else if (var2 == 46) {
									var15 = Client.players[var3]; // L: 8453
									if (var15 != null) { // L: 8454
										Client.mouseCrossX = var6; // L: 8455
										Client.mouseCrossY = var7; // L: 8456
										Client.mouseCrossColor = 2; // L: 8457
										Client.mouseCrossState = 0; // L: 8458
										Client.destinationX = var0; // L: 8459
										Client.destinationY = var1; // L: 8460
										var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2278, Client.packetWriter.isaacCipher); // L: 8462
										var9.packetBuffer.method5931(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8463
										var9.packetBuffer.method5725(var3); // L: 8464
										Client.packetWriter.addNode(var9); // L: 8465
									}
								} else if (var2 == 47) {
									var15 = Client.players[var3]; // L: 8195
									if (var15 != null) { // L: 8196
										Client.mouseCrossX = var6; // L: 8197
										Client.mouseCrossY = var7; // L: 8198
										Client.mouseCrossColor = 2; // L: 8199
										Client.mouseCrossState = 0; // L: 8200
										Client.destinationX = var0; // L: 8201
										Client.destinationY = var1; // L: 8202
										var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2275, Client.packetWriter.isaacCipher); // L: 8204
										var9.packetBuffer.writeShortLE(var3); // L: 8205
										var9.packetBuffer.method5931(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8206
										Client.packetWriter.addNode(var9); // L: 8207
									}
								} else if (var2 == 48) {
									var15 = Client.players[var3]; // L: 8639
									if (var15 != null) { // L: 8640
										Client.mouseCrossX = var6; // L: 8641
										Client.mouseCrossY = var7; // L: 8642
										Client.mouseCrossColor = 2; // L: 8643
										Client.mouseCrossState = 0; // L: 8644
										Client.destinationX = var0; // L: 8645
										Client.destinationY = var1; // L: 8646
										var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2233, Client.packetWriter.isaacCipher); // L: 8648
										var9.packetBuffer.method5725(var3); // L: 8649
										var9.packetBuffer.method5931(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8650
										Client.packetWriter.addNode(var9); // L: 8651
									}
								} else if (var2 == 49) {
									var15 = Client.players[var3]; // L: 8780
									if (var15 != null) { // L: 8781
										Client.mouseCrossX = var6; // L: 8782
										Client.mouseCrossY = var7; // L: 8783
										Client.mouseCrossColor = 2; // L: 8784
										Client.mouseCrossState = 0; // L: 8785
										Client.destinationX = var0; // L: 8786
										Client.destinationY = var1; // L: 8787
										var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2239, Client.packetWriter.isaacCipher); // L: 8789
										var9.packetBuffer.writeShort(var3); // L: 8790
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8791
										Client.packetWriter.addNode(var9); // L: 8792
									}
								} else if (var2 == 50) {
									var15 = Client.players[var3]; // L: 8413
									if (var15 != null) { // L: 8414
										Client.mouseCrossX = var6; // L: 8415
										Client.mouseCrossY = var7; // L: 8416
										Client.mouseCrossColor = 2; // L: 8417
										Client.mouseCrossState = 0; // L: 8418
										Client.destinationX = var0; // L: 8419
										Client.destinationY = var1; // L: 8420
										var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2308, Client.packetWriter.isaacCipher); // L: 8422
										var9.packetBuffer.method5883(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8423
										var9.packetBuffer.writeIntME(var3); // L: 8424
										Client.packetWriter.addNode(var9); // L: 8425
									}
								} else if (var2 == 51) {
									var15 = Client.players[var3]; // L: 8715
									if (var15 != null) { // L: 8716
										Client.mouseCrossX = var6; // L: 8717
										Client.mouseCrossY = var7; // L: 8718
										Client.mouseCrossColor = 2; // L: 8719
										Client.mouseCrossState = 0; // L: 8720
										Client.destinationX = var0; // L: 8721
										Client.destinationY = var1; // L: 8722
										var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2327, Client.packetWriter.isaacCipher); // L: 8724
										var9.packetBuffer.method5931(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8725
										var9.packetBuffer.writeShortLE(var3); // L: 8726
										Client.packetWriter.addNode(var9); // L: 8727
									}
								} else {
									label637: {
										if (var2 != 57) {
											if (var2 == 58) {
												var16 = ArchiveLoader.getWidgetChild(var1, var0); // L: 8519
												if (var16 != null) { // L: 8520
													var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2244, Client.packetWriter.isaacCipher); // L: 8522
													var9.packetBuffer.writeInt(MidiPcmStream.selectedSpellWidget); // L: 8523
													var9.packetBuffer.writeIntME(var16.itemId); // L: 8524
													var9.packetBuffer.method5725(Client.field821); // L: 8525
													var9.packetBuffer.writeIntME(var0); // L: 8526
													var9.packetBuffer.method5876(var1); // L: 8527
													var9.packetBuffer.writeShortLE(Client.selectedSpellChildIndex); // L: 8528
													Client.packetWriter.addNode(var9); // L: 8529
												}
												break label637;
											}

											if (var2 == 1001) {
												Client.mouseCrossX = var6; // L: 8101
												Client.mouseCrossY = var7; // L: 8102
												Client.mouseCrossColor = 2; // L: 8103
												Client.mouseCrossState = 0; // L: 8104
												Client.destinationX = var0; // L: 8105
												Client.destinationY = var1; // L: 8106
												var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2288, Client.packetWriter.isaacCipher); // L: 8108
												var8.packetBuffer.writeShortLE(var0 + GrandExchangeOfferNameComparator.baseX); // L: 8109
												var8.packetBuffer.writeIntME(var3); // L: 8110
												var8.packetBuffer.method5778(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8111
												var8.packetBuffer.method5725(NetCache.baseY + var1); // L: 8112
												Client.packetWriter.addNode(var8); // L: 8113
												break label637;
											}

											if (var2 == 1002) {
												Client.mouseCrossX = var6; // L: 8299
												Client.mouseCrossY = var7; // L: 8300
												Client.mouseCrossColor = 2; // L: 8301
												Client.mouseCrossState = 0; // L: 8302
												var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2269, Client.packetWriter.isaacCipher); // L: 8304
												var8.packetBuffer.writeIntME(var3); // L: 8305
												Client.packetWriter.addNode(var8); // L: 8306
												break label637;
											}

											if (var2 == 1003) {
												Client.mouseCrossX = var6; // L: 8731
												Client.mouseCrossY = var7; // L: 8732
												Client.mouseCrossColor = 2; // L: 8733
												Client.mouseCrossState = 0; // L: 8734
												var13 = Client.npcs[var3]; // L: 8735
												if (var13 != null) { // L: 8736
													NPCComposition var17 = var13.definition; // L: 8737
													if (var17.transforms != null) { // L: 8738
														var17 = var17.transform();
													}

													if (var17 != null) { // L: 8739
														var11 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2279, Client.packetWriter.isaacCipher); // L: 8741
														var11.packetBuffer.writeShort(var17.id); // L: 8742
														Client.packetWriter.addNode(var11); // L: 8743
													}
												}
												break label637;
											}

											if (var2 == 1004) {
												Client.mouseCrossX = var6; // L: 8748
												Client.mouseCrossY = var7; // L: 8749
												Client.mouseCrossColor = 2; // L: 8750
												Client.mouseCrossState = 0; // L: 8751
												var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2333, Client.packetWriter.isaacCipher); // L: 8753
												var8.packetBuffer.method5725(var3); // L: 8754
												Client.packetWriter.addNode(var8); // L: 8755
												break label637;
											}

											if (var2 == 1005) {
												var16 = class237.getWidget(var1); // L: 8029
												if (var16 != null && var16.itemQuantities[var0] >= 100000) { // L: 8030
													AbstractWorldMapData.addGameMessage(27, "", var16.itemQuantities[var0] + " x " + class281.ItemDefinition_get(var3).name);
												} else {
													var9 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2333, Client.packetWriter.isaacCipher); // L: 8033
													var9.packetBuffer.method5725(var3); // L: 8034
													Client.packetWriter.addNode(var9); // L: 8035
												}

												Client.field770 = 0; // L: 8037
												WorldMapSprite.field260 = class237.getWidget(var1); // L: 8038
												Client.field931 = var0; // L: 8039
												break label637;
											}

											if (var2 != 1007) {
												if (var2 == 1009 || var2 == 1010 || var2 == 1012 || var2 == 1008 || var2 == 1011) {
													SoundSystem.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1)); // L: 8134
												}
												break label637;
											}
										}

										var16 = ArchiveLoader.getWidgetChild(var1, var0); // L: 8095
										if (var16 != null) { // L: 8096
											ApproximateRouteStrategy.widgetDefaultMenuAction(var3, var1, var0, var16.itemId, var5); // L: 8097
										}
									}
								}
							}
						}
					}
				}
			}
		}

		if (Client.isItemSelected != 0) { // L: 8809
			Client.isItemSelected = 0; // L: 8810
			IsaacCipher.invalidateWidget(class237.getWidget(ClientPacket.selectedItemWidget)); // L: 8811
		}

		if (Client.isSpellSelected) { // L: 8813
			WorldMapSection2.Widget_runOnTargetLeave();
		}

		if (WorldMapSprite.field260 != null && Client.field770 == 0) { // L: 8814
			IsaacCipher.invalidateWidget(WorldMapSprite.field260);
		}

	} // L: 8815

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "24"
	)
	static boolean method685(int var0) {
		return var0 == 57 || var0 == 58 || var0 == 1007 || var0 == 25 || var0 == 30; // L: 9036
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "90"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		class219.method4171(); // L: 11124

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 11126
			if (var1.obj != null) { // L: 11127
				var1.set();
			}
		}

		int var3 = class204.VarpDefinition_get(var0).type; // L: 11130
		if (var3 != 0) { // L: 11131
			int var2 = Varps.Varps_main[var0]; // L: 11132
			if (var3 == 1) { // L: 11133
				if (var2 == 1) { // L: 11134
					Decimator.method2707(0.9D);
				}

				if (var2 == 2) { // L: 11135
					Decimator.method2707(0.8D);
				}

				if (var2 == 3) { // L: 11136
					Decimator.method2707(0.7D);
				}

				if (var2 == 4) { // L: 11137
					Decimator.method2707(0.6D);
				}
			}

			if (var3 == 3) { // L: 11139
				if (var2 == 0) { // L: 11140
					class194.method3820(255);
				}

				if (var2 == 1) { // L: 11141
					class194.method3820(192);
				}

				if (var2 == 2) { // L: 11142
					class194.method3820(128);
				}

				if (var2 == 3) { // L: 11143
					class194.method3820(64);
				}

				if (var2 == 4) { // L: 11144
					class194.method3820(0);
				}
			}

			if (var3 == 4) { // L: 11146
				if (var2 == 0) { // L: 11147
					class171.updateSoundEffectVolume(127);
				}

				if (var2 == 1) { // L: 11148
					class171.updateSoundEffectVolume(96);
				}

				if (var2 == 2) { // L: 11149
					class171.updateSoundEffectVolume(64);
				}

				if (var2 == 3) { // L: 11150
					class171.updateSoundEffectVolume(32);
				}

				if (var2 == 4) { // L: 11151
					class171.updateSoundEffectVolume(0);
				}
			}

			if (var3 == 5) { // L: 11153
				Client.leftClickOpensMenu = var2;
			}

			if (var3 == 6) { // L: 11154
				Client.chatEffects = var2;
			}

			if (var3 == 9) { // L: 11155
				Client.field829 = var2;
			}

			if (var3 == 10) { // L: 11156
				if (var2 == 0) { // L: 11157
					WorldMapData_1.method810(127);
				}

				if (var2 == 1) { // L: 11158
					WorldMapData_1.method810(96);
				}

				if (var2 == 2) { // L: 11159
					WorldMapData_1.method810(64);
				}

				if (var2 == 3) { // L: 11160
					WorldMapData_1.method810(32);
				}

				if (var2 == 4) { // L: 11161
					WorldMapData_1.method810(0);
				}
			}

			if (var3 == 17) { // L: 11163
				Client.followerIndex = var2 & 65535; // L: 11164
			}

			if (var3 == 18) { // L: 11166
				Client.playerAttackOption = (AttackOption)InterfaceParent.findEnumerated(ApproximateRouteStrategy.method1310(), var2); // L: 11167
				if (Client.playerAttackOption == null) { // L: 11168
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var3 == 19) { // L: 11170
				if (var2 == -1) { // L: 11171
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047; // L: 11172
				}
			}

			if (var3 == 22) { // L: 11174
				Client.npcAttackOption = (AttackOption)InterfaceParent.findEnumerated(ApproximateRouteStrategy.method1310(), var2); // L: 11175
				if (Client.npcAttackOption == null) { // L: 11176
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	} // L: 11178
}