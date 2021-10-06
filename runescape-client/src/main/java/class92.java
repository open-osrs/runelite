import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cz")
public class class92 {
	@ObfuscatedName("x")
	@Export("cacheSubPaths")
	static String[] cacheSubPaths;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1651318617
	)
	int field1228;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 721059991
	)
	int field1227;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1547697199
	)
	int field1229;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -930814481
	)
	int field1230;

	class92(int var1, int var2, int var3, int var4) {
		this.field1228 = var1;
		this.field1227 = var2;
		this.field1229 = var3;
		this.field1230 = var4;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1995128914"
	)
	int method2243() {
		return this.field1228;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1437563036"
	)
	int method2254() {
		return this.field1227;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-1"
	)
	int method2242() {
		return this.field1229;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "201682335"
	)
	int method2245() {
		return this.field1230;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Loy;II)V",
		garbageValue = "767039903"
	)
	@Export("readPlayerUpdate")
	static void readPlayerUpdate(PacketBuffer var0, int var1) {
		boolean var2 = var0.readBits(1) == 1;
		if (var2) {
			Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
		}

		int var3 = var0.readBits(2);
		Player var4 = Client.players[var1];
		if (var3 == 0) {
			if (var2) {
				var4.field1060 = false;
			} else if (Client.localPlayerIndex == var1) {
				throw new RuntimeException();
			} else {
				Players.Players_regions[var1] = (var4.plane << 28) + (WorldMapSectionType.baseX + var4.pathX[0] >> 13 << 14) + (PlayerComposition.baseY + var4.pathY[0] >> 13);
				if (var4.field1134 != -1) {
					Players.Players_orientations[var1] = var4.field1134;
				} else {
					Players.Players_orientations[var1] = var4.orientation;
				}

				Players.Players_targetIndices[var1] = var4.targetIndex;
				Client.players[var1] = null;
				if (var0.readBits(1) != 0) {
					ChatChannel.updateExternalPlayer(var0, var1);
				}

			}
		} else {
			int var5;
			int var6;
			int var7;
			if (var3 == 1) {
				var5 = var0.readBits(3);
				var6 = var4.pathX[0];
				var7 = var4.pathY[0];
				if (var5 == 0) {
					--var6;
					--var7;
				} else if (var5 == 1) {
					--var7;
				} else if (var5 == 2) {
					++var6;
					--var7;
				} else if (var5 == 3) {
					--var6;
				} else if (var5 == 4) {
					++var6;
				} else if (var5 == 5) {
					--var6;
					++var7;
				} else if (var5 == 6) {
					++var7;
				} else if (var5 == 7) {
					++var6;
					++var7;
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
					var4.resetPath(var6, var7);
					var4.field1060 = false;
				} else if (var2) {
					var4.field1060 = true;
					var4.tileX = var6;
					var4.tileY = var7;
				} else {
					var4.field1060 = false;
					var4.method2092(var6, var7, Players.field1245[var1]);
				}

			} else if (var3 == 2) {
				var5 = var0.readBits(4);
				var6 = var4.pathX[0];
				var7 = var4.pathY[0];
				if (var5 == 0) {
					var6 -= 2;
					var7 -= 2;
				} else if (var5 == 1) {
					--var6;
					var7 -= 2;
				} else if (var5 == 2) {
					var7 -= 2;
				} else if (var5 == 3) {
					++var6;
					var7 -= 2;
				} else if (var5 == 4) {
					var6 += 2;
					var7 -= 2;
				} else if (var5 == 5) {
					var6 -= 2;
					--var7;
				} else if (var5 == 6) {
					var6 += 2;
					--var7;
				} else if (var5 == 7) {
					var6 -= 2;
				} else if (var5 == 8) {
					var6 += 2;
				} else if (var5 == 9) {
					var6 -= 2;
					++var7;
				} else if (var5 == 10) {
					var6 += 2;
					++var7;
				} else if (var5 == 11) {
					var6 -= 2;
					var7 += 2;
				} else if (var5 == 12) {
					--var6;
					var7 += 2;
				} else if (var5 == 13) {
					var7 += 2;
				} else if (var5 == 14) {
					++var6;
					var7 += 2;
				} else if (var5 == 15) {
					var6 += 2;
					var7 += 2;
				}

				if (Client.localPlayerIndex != var1 || var4.x >= 1536 && var4.y >= 1536 && var4.x < 11776 && var4.y < 11776) {
					if (var2) {
						var4.field1060 = true;
						var4.tileX = var6;
						var4.tileY = var7;
					} else {
						var4.field1060 = false;
						var4.method2092(var6, var7, Players.field1245[var1]);
					}
				} else {
					var4.resetPath(var6, var7);
					var4.field1060 = false;
				}

			} else {
				var5 = var0.readBits(1);
				int var8;
				int var9;
				int var10;
				int var11;
				if (var5 == 0) {
					var6 = var0.readBits(12);
					var7 = var6 >> 10;
					var8 = var6 >> 5 & 31;
					if (var8 > 15) {
						var8 -= 32;
					}

					var9 = var6 & 31;
					if (var9 > 15) {
						var9 -= 32;
					}

					var10 = var8 + var4.pathX[0];
					var11 = var9 + var4.pathY[0];
					if (Client.localPlayerIndex != var1 || var4.x >= 1536 && var4.y >= 1536 && var4.x < 11776 && var4.y < 11776) {
						if (var2) {
							var4.field1060 = true;
							var4.tileX = var10;
							var4.tileY = var11;
						} else {
							var4.field1060 = false;
							var4.method2092(var10, var11, Players.field1245[var1]);
						}
					} else {
						var4.resetPath(var10, var11);
						var4.field1060 = false;
					}

					var4.plane = (byte)(var7 + var4.plane & 3);
					if (Client.localPlayerIndex == var1) {
						VertexNormal.Client_plane = var4.plane;
					}

				} else {
					var6 = var0.readBits(30);
					var7 = var6 >> 28;
					var8 = var6 >> 14 & 16383;
					var9 = var6 & 16383;
					var10 = (var8 + WorldMapSectionType.baseX + var4.pathX[0] & 16383) - WorldMapSectionType.baseX;
					var11 = (var9 + PlayerComposition.baseY + var4.pathY[0] & 16383) - PlayerComposition.baseY;
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
						var4.resetPath(var10, var11);
						var4.field1060 = false;
					} else if (var2) {
						var4.field1060 = true;
						var4.tileX = var10;
						var4.tileY = var11;
					} else {
						var4.field1060 = false;
						var4.method2092(var10, var11, Players.field1245[var1]);
					}

					var4.plane = (byte)(var7 + var4.plane & 3);
					if (Client.localPlayerIndex == var1) {
						VertexNormal.Client_plane = var4.plane;
					}

				}
			}
		}
	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(Ljt;III)V",
		garbageValue = "1622114709"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) {
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !VarbitComposition.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) {
				SpriteMask var3 = var0.getSpriteMask(true);
				if (var3 == null) {
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1;
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2;
				if (var3.contains(var4, var5)) {
					var4 -= var3.width / 2;
					var5 -= var3.height / 2;
					int var6 = Client.camAngleY & 2047;
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6];
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6];
					int var9 = var5 * var7 + var4 * var8 >> 11;
					int var10 = var5 * var8 - var7 * var4 >> 11;
					int var11 = var9 + class67.localPlayer.x >> 7;
					int var12 = class67.localPlayer.y - var10 >> 7;
					PacketBufferNode var13 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2745, Client.packetWriter.isaacCipher);
					var13.packetBuffer.writeByte(18);
					var13.packetBuffer.method7029(var11 + WorldMapSectionType.baseX);
					var13.packetBuffer.method6931(var12 + PlayerComposition.baseY);
					var13.packetBuffer.method7117(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0);
					var13.packetBuffer.writeByte(var4);
					var13.packetBuffer.writeByte(var5);
					var13.packetBuffer.writeShort(Client.camAngleY);
					var13.packetBuffer.writeByte(57);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(89);
					var13.packetBuffer.writeShort(class67.localPlayer.x);
					var13.packetBuffer.writeShort(class67.localPlayer.y);
					var13.packetBuffer.writeByte(63);
					Client.packetWriter.addNode(var13);
					Client.destinationX = var11;
					Client.destinationY = var12;
				}
			}

		}
	}
}
