import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bp")
@Implements("Decimator")
public class Decimator {
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -188292449
	)
	@Export("inputRate")
	int inputRate;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -559769321
	)
	@Export("outputRate")
	int outputRate;
	@ObfuscatedName("s")
	@Export("table")
	int[][] table;

	public Decimator(int var1, int var2) {
		if (var2 != var1) {
			int var3 = WorldMapCacheName.method4865(var1, var2);
			var1 /= var3;
			var2 /= var3;
			this.inputRate = var1;
			this.outputRate = var2;
			this.table = new int[var1][14];

			for (int var4 = 0; var4 < var1; ++var4) {
				int[] var5 = this.table[var4];
				double var6 = (double)var4 / (double)var1 + 6.0D;
				int var8 = (int)Math.floor(1.0D + (var6 - 7.0D));
				if (var8 < 0) {
					var8 = 0;
				}

				int var9 = (int)Math.ceil(7.0D + var6);
				if (var9 > 14) {
					var9 = 14;
				}

				for (double var10 = (double)var2 / (double)var1; var8 < var9; ++var8) {
					double var12 = ((double)var8 - var6) * 3.141592653589793D;
					double var14 = var10;
					if (var12 < -1.0E-4D || var12 > 1.0E-4D) {
						var14 = var10 * (Math.sin(var12) / var12);
					}

					var14 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double)var8 - var6));
					var5[var8] = (int)Math.floor(65536.0D * var14 + 0.5D);
				}
			}

		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([BB)[B",
		garbageValue = "71"
	)
	@Export("resample")
	byte[] resample(byte[] var1) {
		if (this.table != null) {
			int var2 = (int)((long)var1.length * (long)this.outputRate / (long)this.inputRate) + 14;
			int[] var3 = new int[var2];
			int var4 = 0;
			int var5 = 0;

			int var6;
			for (var6 = 0; var6 < var1.length; ++var6) {
				byte var7 = var1[var6];
				int[] var8 = this.table[var5];

				int var9;
				for (var9 = 0; var9 < 14; ++var9) {
					var3[var4 + var9] += var7 * var8[var9];
				}

				var5 += this.outputRate;
				var9 = var5 / this.inputRate;
				var4 += var9;
				var5 -= var9 * this.inputRate;
			}

			var1 = new byte[var2];

			for (var6 = 0; var6 < var2; ++var6) {
				int var10 = var3[var6] + 32768 >> 16;
				if (var10 < -128) {
					var1[var6] = -128;
				} else if (var10 > 127) {
					var1[var6] = 127;
				} else {
					var1[var6] = (byte)var10;
				}
			}
		}

		return var1;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "679122393"
	)
	@Export("scaleRate")
	int scaleRate(int var1) {
		if (this.table != null) {
			var1 = (int)((long)this.outputRate * (long)var1 / (long)this.inputRate);
		}

		return var1;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-100"
	)
	@Export("scalePosition")
	int scalePosition(int var1) {
		if (this.table != null) {
			var1 = (int)((long)this.outputRate * (long)var1 / (long)this.inputRate) + 6;
		}

		return var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1433736231"
	)
	static void method1073(int var0) {
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lpj;IB)Z",
		garbageValue = "1"
	)
	@Export("updateExternalPlayer")
	static boolean updateExternalPlayer(PacketBuffer var0, int var1) {
		int var2 = var0.readBits(2);
		int var3;
		int var4;
		int var7;
		int var8;
		int var9;
		int var10;
		if (var2 == 0) {
			if (var0.readBits(1) != 0) {
				updateExternalPlayer(var0, var1);
			}

			var3 = var0.readBits(13);
			var4 = var0.readBits(13);
			boolean var12 = var0.readBits(1) == 1;
			if (var12) {
				Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
			}

			if (Client.players[var1] != null) {
				throw new RuntimeException();
			} else {
				Player var11 = Client.players[var1] = new Player();
				var11.index = var1;
				if (Players.field1248[var1] != null) {
					var11.read(Players.field1248[var1]);
				}

				var11.orientation = Players.Players_orientations[var1];
				var11.targetIndex = Players.Players_targetIndices[var1];
				var7 = Players.Players_regions[var1];
				var8 = var7 >> 28;
				var9 = var7 >> 14 & 255;
				var10 = var7 & 255;
				var11.pathTraversed[0] = Players.field1246[var1];
				var11.plane = (byte)var8;
				var11.resetPath((var9 << 13) + var3 - class131.baseX, (var10 << 13) + var4 - TileItem.baseY);
				var11.field1055 = false;
				return true;
			}
		} else if (var2 == 1) {
			var3 = var0.readBits(2);
			var4 = Players.Players_regions[var1];
			Players.Players_regions[var1] = (var4 & 268435455) + (((var4 >> 28) + var3 & 3) << 28);
			return false;
		} else {
			int var5;
			int var6;
			if (var2 == 2) {
				var3 = var0.readBits(5);
				var4 = var3 >> 3;
				var5 = var3 & 7;
				var6 = Players.Players_regions[var1];
				var7 = (var6 >> 28) + var4 & 3;
				var8 = var6 >> 14 & 255;
				var9 = var6 & 255;
				if (var5 == 0) {
					--var8;
					--var9;
				}

				if (var5 == 1) {
					--var9;
				}

				if (var5 == 2) {
					++var8;
					--var9;
				}

				if (var5 == 3) {
					--var8;
				}

				if (var5 == 4) {
					++var8;
				}

				if (var5 == 5) {
					--var8;
					++var9;
				}

				if (var5 == 6) {
					++var9;
				}

				if (var5 == 7) {
					++var8;
					++var9;
				}

				Players.Players_regions[var1] = (var8 << 14) + var9 + (var7 << 28);
				return false;
			} else {
				var3 = var0.readBits(18);
				var4 = var3 >> 16;
				var5 = var3 >> 8 & 255;
				var6 = var3 & 255;
				var7 = Players.Players_regions[var1];
				var8 = (var7 >> 28) + var4 & 3;
				var9 = var5 + (var7 >> 14) & 255;
				var10 = var6 + var7 & 255;
				Players.Players_regions[var1] = (var9 << 14) + var10 + (var8 << 28);
				return false;
			}
		}
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "-646384904"
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
			var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2831, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method7390(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.writeShort(var3);
			var8.packetBuffer.writeShort(class139.selectedItemId);
			var8.packetBuffer.method7398(TileItem.baseY + var1);
			var8.packetBuffer.method7407(MidiPcmStream.selectedItemWidget);
			var8.packetBuffer.method7349(Calendar.selectedItemSlot);
			var8.packetBuffer.method7349(var0 + class131.baseX);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 2) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2850, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method7493(Client.selectedSpellChildIndex);
			var8.packetBuffer.method7390(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method7527(class20.selectedSpellWidget);
			var8.packetBuffer.method7398(Client.field633);
			var8.packetBuffer.method7493(var0 + class131.baseX);
			var8.packetBuffer.method7493(var3);
			var8.packetBuffer.method7493(TileItem.baseY + var1);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 3) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2883, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method7398(var0 + class131.baseX);
			var8.packetBuffer.writeShort(var3);
			var8.packetBuffer.method7493(TileItem.baseY + var1);
			var8.packetBuffer.method7390(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 4) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2896, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method7398(TileItem.baseY + var1);
			var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method7349(var0 + class131.baseX);
			var8.packetBuffer.method7398(var3);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 5) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2856, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method7493(var3);
			var8.packetBuffer.method7493(TileItem.baseY + var1);
			var8.packetBuffer.writeShort(var0 + class131.baseX);
			var8.packetBuffer.method7343(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 6) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2870, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method7493(var3);
			var8.packetBuffer.method7390(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method7493(TileItem.baseY + var1);
			var8.packetBuffer.method7493(var0 + class131.baseX);
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
					var9 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2840, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method7398(class139.selectedItemId);
					var9.packetBuffer.method7362(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.method7398(var3);
					var9.packetBuffer.method7527(MidiPcmStream.selectedItemWidget);
					var9.packetBuffer.method7398(Calendar.selectedItemSlot);
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
					var9 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2901, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method7407(class20.selectedSpellWidget);
					var9.packetBuffer.method7398(Client.field633);
					var9.packetBuffer.writeShort(Client.selectedSpellChildIndex);
					var9.packetBuffer.method7390(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.writeShort(var3);
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
					var9 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2839, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method7349(var3);
					var9.packetBuffer.method7343(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
					var9 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2865, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method7362(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.method7398(var3);
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
					var9 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2812, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method7493(var3);
					var9.packetBuffer.method7343(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
					var9 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2872, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeShort(var3);
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
					var9 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2876, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method7398(var3);
					var9.packetBuffer.method7362(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
						var9 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2864, Client.packetWriter.isaacCipher);
						var9.packetBuffer.method7398(class139.selectedItemId);
						var9.packetBuffer.method7527(MidiPcmStream.selectedItemWidget);
						var9.packetBuffer.method7343(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
						var9.packetBuffer.method7493(Calendar.selectedItemSlot);
						var9.packetBuffer.method7398(var3);
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
						var9 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2820, Client.packetWriter.isaacCipher);
						var9.packetBuffer.method7407(class20.selectedSpellWidget);
						var9.packetBuffer.writeShort(Client.field633);
						var9.packetBuffer.method7343(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
						var9.packetBuffer.method7349(var3);
						var9.packetBuffer.method7398(Client.selectedSpellChildIndex);
						Client.packetWriter.addNode(var9);
					}
				} else if (var2 == 16) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2882, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShort(class139.selectedItemId);
					var8.packetBuffer.writeShort(Calendar.selectedItemSlot);
					var8.packetBuffer.writeShort(TileItem.baseY + var1);
					var8.packetBuffer.method7493(var3);
					var8.packetBuffer.method7527(MidiPcmStream.selectedItemWidget);
					var8.packetBuffer.method7343(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method7493(var0 + class131.baseX);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 17) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2835, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method7398(TileItem.baseY + var1);
					var8.packetBuffer.writeShort(Client.selectedSpellChildIndex);
					var8.packetBuffer.method7343(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.writeInt(class20.selectedSpellWidget);
					var8.packetBuffer.writeShort(var0 + class131.baseX);
					var8.packetBuffer.method7493(var3);
					var8.packetBuffer.writeShort(Client.field633);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 18) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2836, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method7398(var0 + class131.baseX);
					var8.packetBuffer.method7349(var3);
					var8.packetBuffer.method7349(TileItem.baseY + var1);
					var8.packetBuffer.method7343(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 19) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2838, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method7362(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method7493(TileItem.baseY + var1);
					var8.packetBuffer.method7493(var3);
					var8.packetBuffer.method7349(var0 + class131.baseX);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 20) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2818, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method7493(var0 + class131.baseX);
					var8.packetBuffer.writeShort(var3);
					var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method7349(TileItem.baseY + var1);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 21) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2823, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method7349(TileItem.baseY + var1);
					var8.packetBuffer.method7343(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.writeShort(var3);
					var8.packetBuffer.method7398(var0 + class131.baseX);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 22) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2868, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method7398(var0 + class131.baseX);
					var8.packetBuffer.method7349(TileItem.baseY + var1);
					var8.packetBuffer.method7398(var3);
					var8.packetBuffer.method7362(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 23) {
					if (Client.isMenuOpen) {
						class7.scene.setViewportWalking();
					} else {
						class7.scene.menuOpen(class20.Client_plane, var0, var1, true);
					}
				} else {
					PacketBufferNode var12;
					Widget var16;
					if (var2 == 24) {
						var16 = ChatChannel.getWidget(var1);
						boolean var11 = true;
						if (var16.contentType > 0) {
							var11 = class19.method329(var16);
						}

						if (var11) {
							var12 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2842, Client.packetWriter.isaacCipher);
							var12.packetBuffer.writeInt(var1);
							Client.packetWriter.addNode(var12);
						}
					} else {
						if (var2 == 25) {
							var16 = class126.getWidgetChild(var1, var0);
							if (var16 != null) {
								HealthBar.Widget_runOnTargetLeave();
								UrlRequest.selectSpell(var1, var0, class404.Widget_unpackTargetMask(class363.getWidgetFlags(var16)), var16.itemId);
								Client.isItemSelected = 0;
								Client.selectedSpellActionName = SecureRandomFuture.Widget_getSpellActionName(var16);
								if (Client.selectedSpellActionName == null) {
									Client.selectedSpellActionName = "null";
								}

								if (var16.isIf3) {
									Client.selectedSpellName = var16.dataText + UserComparator5.colorStartTag(16777215);
								} else {
									Client.selectedSpellName = UserComparator5.colorStartTag(65280) + var16.spellName + UserComparator5.colorStartTag(16777215);
								}
							}

							return;
						}

						if (var2 == 26) {
							class4.method28();
						} else {
							int var10;
							Widget var14;
							if (var2 == 28) {
								var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2842, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var8);
								var14 = ChatChannel.getWidget(var1);
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) {
									var10 = var14.cs1Instructions[0][1];
									Varps.Varps_main[var10] = 1 - Varps.Varps_main[var10];
									class281.changeGameOptions(var10);
								}
							} else if (var2 == 29) {
								var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2842, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var8);
								var14 = ChatChannel.getWidget(var1);
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) {
									var10 = var14.cs1Instructions[0][1];
									if (Varps.Varps_main[var10] != var14.cs1ComparisonValues[0]) {
										Varps.Varps_main[var10] = var14.cs1ComparisonValues[0];
										class281.changeGameOptions(var10);
									}
								}
							} else if (var2 == 30) {
								if (Client.meslayerContinueWidget == null) {
									class288.resumePauseWidget(var1, var0);
									Client.meslayerContinueWidget = class126.getWidgetChild(var1, var0);
									SecureRandomCallable.invalidateWidget(Client.meslayerContinueWidget);
								}
							} else if (var2 == 31) {
								var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2804, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method7349(var0);
								var8.packetBuffer.writeShort(class139.selectedItemId);
								var8.packetBuffer.method7349(var3);
								var8.packetBuffer.writeInt(MidiPcmStream.selectedItemWidget);
								var8.packetBuffer.writeIntME(var1);
								var8.packetBuffer.method7398(Calendar.selectedItemSlot);
								Client.packetWriter.addNode(var8);
								Client.field582 = 0;
								WorldMapDecoration.field2722 = ChatChannel.getWidget(var1);
								Client.field599 = var0;
							} else if (var2 == 32) {
								var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2886, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeShort(var0);
								var8.packetBuffer.writeIntME(var1);
								var8.packetBuffer.method7493(Client.selectedSpellChildIndex);
								var8.packetBuffer.writeShort(var3);
								var8.packetBuffer.writeInt(class20.selectedSpellWidget);
								Client.packetWriter.addNode(var8);
								Client.field582 = 0;
								WorldMapDecoration.field2722 = ChatChannel.getWidget(var1);
								Client.field599 = var0;
							} else if (var2 == 33) {
								var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2874, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeInt(var1);
								var8.packetBuffer.method7349(var0);
								var8.packetBuffer.method7349(var3);
								Client.packetWriter.addNode(var8);
								Client.field582 = 0;
								WorldMapDecoration.field2722 = ChatChannel.getWidget(var1);
								Client.field599 = var0;
							} else if (var2 == 34) {
								var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2833, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method7398(var3);
								var8.packetBuffer.method7398(var0);
								var8.packetBuffer.method7407(var1);
								Client.packetWriter.addNode(var8);
								Client.field582 = 0;
								WorldMapDecoration.field2722 = ChatChannel.getWidget(var1);
								Client.field599 = var0;
							} else if (var2 == 35) {
								var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2817, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method7349(var0);
								var8.packetBuffer.method7349(var3);
								var8.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var8);
								Client.field582 = 0;
								WorldMapDecoration.field2722 = ChatChannel.getWidget(var1);
								Client.field599 = var0;
							} else if (var2 == 36) {
								var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2847, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method7527(var1);
								var8.packetBuffer.method7349(var0);
								var8.packetBuffer.method7398(var3);
								Client.packetWriter.addNode(var8);
								Client.field582 = 0;
								WorldMapDecoration.field2722 = ChatChannel.getWidget(var1);
								Client.field599 = var0;
							} else if (var2 == 37) {
								var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2802, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeIntME(var1);
								var8.packetBuffer.method7493(var0);
								var8.packetBuffer.writeShort(var3);
								Client.packetWriter.addNode(var8);
								Client.field582 = 0;
								WorldMapDecoration.field2722 = ChatChannel.getWidget(var1);
								Client.field599 = var0;
							} else {
								if (var2 == 38) {
									HealthBar.Widget_runOnTargetLeave();
									var16 = ChatChannel.getWidget(var1);
									Client.isItemSelected = 1;
									Calendar.selectedItemSlot = var0;
									MidiPcmStream.selectedItemWidget = var1;
									class139.selectedItemId = var3;
									SecureRandomCallable.invalidateWidget(var16);
									Client.selectedItemName = UserComparator5.colorStartTag(16748608) + UserComparator6.ItemDefinition_get(var3).name + UserComparator5.colorStartTag(16777215);
									if (Client.selectedItemName == null) {
										Client.selectedItemName = "null";
									}

									return;
								}

								if (var2 == 39) {
									var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2844, Client.packetWriter.isaacCipher);
									var8.packetBuffer.writeIntME(var1);
									var8.packetBuffer.method7493(var0);
									var8.packetBuffer.writeShort(var3);
									Client.packetWriter.addNode(var8);
									Client.field582 = 0;
									WorldMapDecoration.field2722 = ChatChannel.getWidget(var1);
									Client.field599 = var0;
								} else if (var2 == 40) {
									var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2871, Client.packetWriter.isaacCipher);
									var8.packetBuffer.writeInt(var1);
									var8.packetBuffer.method7493(var3);
									var8.packetBuffer.method7493(var0);
									Client.packetWriter.addNode(var8);
									Client.field582 = 0;
									WorldMapDecoration.field2722 = ChatChannel.getWidget(var1);
									Client.field599 = var0;
								} else if (var2 == 41) {
									var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2810, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method7398(var3);
									var8.packetBuffer.writeInt(var1);
									var8.packetBuffer.method7398(var0);
									Client.packetWriter.addNode(var8);
									Client.field582 = 0;
									WorldMapDecoration.field2722 = ChatChannel.getWidget(var1);
									Client.field599 = var0;
								} else if (var2 == 42) {
									var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2803, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method7493(var0);
									var8.packetBuffer.writeIntME(var1);
									var8.packetBuffer.method7398(var3);
									Client.packetWriter.addNode(var8);
									Client.field582 = 0;
									WorldMapDecoration.field2722 = ChatChannel.getWidget(var1);
									Client.field599 = var0;
								} else if (var2 == 43) {
									var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2843, Client.packetWriter.isaacCipher);
									var8.packetBuffer.writeInt(var1);
									var8.packetBuffer.writeShort(var0);
									var8.packetBuffer.writeShort(var3);
									Client.packetWriter.addNode(var8);
									Client.field582 = 0;
									WorldMapDecoration.field2722 = ChatChannel.getWidget(var1);
									Client.field599 = var0;
								} else if (var2 == 44) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2887, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method7343(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.method7398(var3);
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
										var9 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2813, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method7343(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.method7493(var3);
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
										var9 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2827, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method7398(var3);
										var9.packetBuffer.method7343(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
										var9 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2807, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method7349(var3);
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
										var9 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2892, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeShort(var3);
										var9.packetBuffer.method7362(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
										var9 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2863, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method7390(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.method7398(var3);
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
										var9 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2906, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method7362(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.method7493(var3);
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
										var9 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2885, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.method7398(var3);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 != 1007 && var2 != 57) {
									if (var2 == 58) {
										var16 = class126.getWidgetChild(var1, var0);
										if (var16 != null) {
											var9 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2809, Client.packetWriter.isaacCipher);
											var9.packetBuffer.writeShort(var16.itemId);
											var9.packetBuffer.method7527(var1);
											var9.packetBuffer.method7493(Client.selectedSpellChildIndex);
											var9.packetBuffer.method7398(var0);
											var9.packetBuffer.writeIntME(class20.selectedSpellWidget);
											var9.packetBuffer.writeShort(Client.field633);
											Client.packetWriter.addNode(var9);
										}
									} else if (var2 == 1001) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2826, Client.packetWriter.isaacCipher);
										var8.packetBuffer.method7398(TileItem.baseY + var1);
										var8.packetBuffer.method7390(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var8.packetBuffer.method7493(var0 + class131.baseX);
										var8.packetBuffer.method7349(var3);
										Client.packetWriter.addNode(var8);
									} else if (var2 == 1002) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2815, Client.packetWriter.isaacCipher);
										var8.packetBuffer.method7349(var3);
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
												var12 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2829, Client.packetWriter.isaacCipher);
												var12.packetBuffer.method7398(var17.id);
												Client.packetWriter.addNode(var12);
											}
										}
									} else if (var2 == 1004) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2902, Client.packetWriter.isaacCipher);
										var8.packetBuffer.method7398(var3);
										Client.packetWriter.addNode(var8);
									} else if (var2 == 1005) {
										var16 = ChatChannel.getWidget(var1);
										if (var16 != null && var16.itemQuantities[var0] >= 100000) {
											class194.addGameMessage(27, "", var16.itemQuantities[var0] + " x " + UserComparator6.ItemDefinition_get(var3).name);
										} else {
											var9 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2902, Client.packetWriter.isaacCipher);
											var9.packetBuffer.method7398(var3);
											Client.packetWriter.addNode(var9);
										}

										Client.field582 = 0;
										WorldMapDecoration.field2722 = ChatChannel.getWidget(var1);
										Client.field599 = var0;
									} else if (var2 == 1009 || var2 == 1008 || var2 == 1011 || var2 == 1010 || var2 == 1012) {
										Varcs.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1));
									}
								} else {
									var16 = class126.getWidgetChild(var1, var0);
									if (var16 != null) {
										SoundCache.widgetDefaultMenuAction(var3, var1, var0, var16.itemId, var5);
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
			SecureRandomCallable.invalidateWidget(ChatChannel.getWidget(MidiPcmStream.selectedItemWidget));
		}

		if (Client.isSpellSelected) {
			HealthBar.Widget_runOnTargetLeave();
		}

		if (WorldMapDecoration.field2722 != null && Client.field582 == 0) {
			SecureRandomCallable.invalidateWidget(WorldMapDecoration.field2722);
		}

	}

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "-66"
	)
	static void method1082(Buffer var0) {
		if (Client.randomDatData != null) {
			var0.writeBytes(Client.randomDatData, 0, Client.randomDatData.length);
		} else {
			byte[] var1 = class118.method2684();
			var0.writeBytes(var1, 0, var1.length);
		}
	}
}
