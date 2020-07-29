import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ao")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		signature = "Lkv;"
	)
	@Export("WorldMapElement_fonts")
	static Fonts WorldMapElement_fonts;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1853202427
	)
	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1923822575
	)
	@Export("newZ")
	int newZ;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -34233439
	)
	@Export("oldX")
	int oldX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -847595737
	)
	@Export("oldY")
	int oldY;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1218395603
	)
	@Export("newX")
	int newX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1280825293
	)
	@Export("newY")
	int newY;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -695848013
	)
	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 233992023
	)
	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1605249157
	)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 103883527
	)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1800743497
	)
	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1992325701
	)
	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 731618977
	)
	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1689147705
	)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Lad;I)V",
		garbageValue = "411670415"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.newX) {
			var1.regionLowX = this.newX;
		}

		if (var1.regionHighX < this.newX) {
			var1.regionHighX = this.newX;
		}

		if (var1.regionLowY > this.newY) {
			var1.regionLowY = this.newY;
		}

		if (var1.regionHighY < this.newY) {
			var1.regionHighY = this.newY;
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(IIIB)Z",
		garbageValue = "2"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.newZ + this.oldZ) {
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(IIB)Z",
		garbageValue = "48"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(IIII)[I",
		garbageValue = "459340529"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{var2 + (this.newX * 64 - this.oldX * 64) + (this.newChunkXLow * 8 - this.oldChunkXLow * 8), var3 + (this.newY * 64 - this.oldY * 64) + (this.newChunkYLow * 8 - this.oldChunkYLow * 8)};
			return var4;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(III)Lhg;",
		garbageValue = "1240901536"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.oldX * 64 - this.newX * 64 + (this.oldChunkXLow * 8 - this.newChunkXLow * 8) + var1;
			int var4 = var2 + (this.oldY * 64 - this.newY * 64) + (this.oldChunkYLow * 8 - this.newChunkYLow * 8);
			return new Coord(this.oldZ, var3, var4);
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(Lkn;B)V",
		garbageValue = "0"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.oldZ = var1.readUnsignedByte();
		this.newZ = var1.readUnsignedByte();
		this.oldX = var1.readUnsignedShort();
		this.oldChunkXLow = var1.readUnsignedByte();
		this.oldChunkXHigh = var1.readUnsignedByte();
		this.oldY = var1.readUnsignedShort();
		this.oldChunkYLow = var1.readUnsignedByte();
		this.oldChunkYHigh = var1.readUnsignedByte();
		this.newX = var1.readUnsignedShort();
		this.newChunkXLow = var1.readUnsignedByte();
		this.newChunkXHigh = var1.readUnsignedByte();
		this.newY = var1.readUnsignedShort();
		this.newChunkYLow = var1.readUnsignedByte();
		this.newChunkYHigh = var1.readUnsignedByte();
		this.postRead();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1040528661"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(II)Lcs;",
		garbageValue = "1805062826"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = Message.archive12.takeFile(var0, 0);
			if (var2 == null) {
				return null;
			} else {
				var1 = WorldMapAreaData.newScript(var2);
				Script.Script_cached.put(var1, (long)var0);
				return var1;
			}
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1742384999"
	)
	public static final void method299() {
		ViewportMouse.ViewportMouse_isInViewport = false;
		ViewportMouse.ViewportMouse_entityCount = 0;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		signature = "(IB)I",
		garbageValue = "50"
	)
	static int method295(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field1126 - 7.0D) * 256.0D);
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		signature = "(IIIILjava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "89"
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
			var8 = UserComparator4.getPacketBufferNode(ClientPacket.field2294, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method5752(var0 + class182.baseX);
			var8.packetBuffer.method5837(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.writeShortLE(AbstractUserComparator.selectedItemWidget);
			var8.packetBuffer.method5752(SecureRandomFuture.baseY + var1);
			var8.packetBuffer.writeShort(LoginScreenAnimation.selectedItemSlot);
			var8.packetBuffer.writeShort(WorldMapSectionType.selectedItemId);
			var8.packetBuffer.method5753(var3);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 2) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = UserComparator4.getPacketBufferNode(ClientPacket.field2259, Client.packetWriter.isaacCipher);
			var8.packetBuffer.writeShort(var0 + class182.baseX);
			var8.packetBuffer.method5764(ItemContainer.selectedSpellWidget);
			var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method5753(var3);
			var8.packetBuffer.writeShort(SecureRandomFuture.baseY + var1);
			var8.packetBuffer.method5753(Client.selectedSpellChildIndex);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 3) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = UserComparator4.getPacketBufferNode(ClientPacket.field2307, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method5753(SecureRandomFuture.baseY + var1);
			var8.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.writeShort(var0 + class182.baseX);
			var8.packetBuffer.method5898(var3);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 4) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = UserComparator4.getPacketBufferNode(ClientPacket.field2282, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method5837(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method5898(SecureRandomFuture.baseY + var1);
			var8.packetBuffer.method5753(var3);
			var8.packetBuffer.method5898(var0 + class182.baseX);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 5) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = UserComparator4.getPacketBufferNode(ClientPacket.field2313, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method5752(var0 + class182.baseX);
			var8.packetBuffer.method5752(SecureRandomFuture.baseY + var1);
			var8.packetBuffer.writeShort(var3);
			var8.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 6) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = UserComparator4.getPacketBufferNode(ClientPacket.field2262, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method5753(var0 + class182.baseX);
			var8.packetBuffer.method5837(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method5898(var3);
			var8.packetBuffer.method5752(SecureRandomFuture.baseY + var1);
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
					var9 = UserComparator4.getPacketBufferNode(ClientPacket.field2322, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method5837(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.method5764(AbstractUserComparator.selectedItemWidget);
					var9.packetBuffer.method5752(var3);
					var9.packetBuffer.method5753(LoginScreenAnimation.selectedItemSlot);
					var9.packetBuffer.method5753(WorldMapSectionType.selectedItemId);
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
					var9 = UserComparator4.getPacketBufferNode(ClientPacket.field2295, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.writeInt(ItemContainer.selectedSpellWidget);
					var9.packetBuffer.method5898(var3);
					var9.packetBuffer.method5752(Client.selectedSpellChildIndex);
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
					var9 = UserComparator4.getPacketBufferNode(ClientPacket.field2274, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method5837(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.method5752(var3);
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
					var9 = UserComparator4.getPacketBufferNode(ClientPacket.field2251, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method5744(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.writeShort(var3);
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
					var9 = UserComparator4.getPacketBufferNode(ClientPacket.field2260, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method5837(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.method5753(var3);
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
					var9 = UserComparator4.getPacketBufferNode(ClientPacket.field2317, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method5898(var3);
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
					var9 = UserComparator4.getPacketBufferNode(ClientPacket.field2278, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method5753(var3);
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
						var9 = UserComparator4.getPacketBufferNode(ClientPacket.field2257, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
						var9.packetBuffer.method5752(var3);
						var9.packetBuffer.method5753(WorldMapSectionType.selectedItemId);
						var9.packetBuffer.method5762(AbstractUserComparator.selectedItemWidget);
						var9.packetBuffer.method5753(LoginScreenAnimation.selectedItemSlot);
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
						var9 = UserComparator4.getPacketBufferNode(ClientPacket.field2327, Client.packetWriter.isaacCipher);
						var9.packetBuffer.method5753(Client.selectedSpellChildIndex);
						var9.packetBuffer.method5764(ItemContainer.selectedSpellWidget);
						var9.packetBuffer.method5898(var3);
						var9.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
						Client.packetWriter.addNode(var9);
					}
				} else if (var2 == 16) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = UserComparator4.getPacketBufferNode(ClientPacket.field2241, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method5898(WorldMapSectionType.selectedItemId);
					var8.packetBuffer.method5753(var3);
					var8.packetBuffer.method5753(var0 + class182.baseX);
					var8.packetBuffer.method5744(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.writeShort(SecureRandomFuture.baseY + var1);
					var8.packetBuffer.method5762(AbstractUserComparator.selectedItemWidget);
					var8.packetBuffer.writeShort(LoginScreenAnimation.selectedItemSlot);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 17) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = UserComparator4.getPacketBufferNode(ClientPacket.field2276, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method5753(var0 + class182.baseX);
					var8.packetBuffer.method5752(Client.selectedSpellChildIndex);
					var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method5898(var3);
					var8.packetBuffer.writeShortLE(ItemContainer.selectedSpellWidget);
					var8.packetBuffer.writeShort(SecureRandomFuture.baseY + var1);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 18) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = UserComparator4.getPacketBufferNode(ClientPacket.field2284, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method5753(var0 + class182.baseX);
					var8.packetBuffer.writeShort(SecureRandomFuture.baseY + var1);
					var8.packetBuffer.method5744(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.writeShort(var3);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 19) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = UserComparator4.getPacketBufferNode(ClientPacket.field2280, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method5898(var0 + class182.baseX);
					var8.packetBuffer.method5744(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method5752(SecureRandomFuture.baseY + var1);
					var8.packetBuffer.method5752(var3);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 20) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = UserComparator4.getPacketBufferNode(ClientPacket.field2300, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method5752(var3);
					var8.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.writeShort(SecureRandomFuture.baseY + var1);
					var8.packetBuffer.method5898(var0 + class182.baseX);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 21) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = UserComparator4.getPacketBufferNode(ClientPacket.field2296, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method5898(var0 + class182.baseX);
					var8.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method5898(SecureRandomFuture.baseY + var1);
					var8.packetBuffer.method5753(var3);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 22) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = UserComparator4.getPacketBufferNode(ClientPacket.field2242, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method5837(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method5752(var0 + class182.baseX);
					var8.packetBuffer.method5752(SecureRandomFuture.baseY + var1);
					var8.packetBuffer.method5898(var3);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 23) {
					if (Client.isMenuOpen) {
						UserComparator3.scene.setViewportWalking();
					} else {
						UserComparator3.scene.menuOpen(TileItemPile.Client_plane, var0, var1, true);
					}
				} else {
					PacketBufferNode var10;
					Widget var16;
					if (var2 == 24) {
						var16 = WorldMapSprite.getWidget(var1);
						boolean var11 = true;
						if (var16.contentType > 0) {
							var11 = MilliClock.method3586(var16);
						}

						if (var11) {
							var10 = UserComparator4.getPacketBufferNode(ClientPacket.field2263, Client.packetWriter.isaacCipher);
							var10.packetBuffer.writeInt(var1);
							Client.packetWriter.addNode(var10);
						}
					} else {
						if (var2 == 25) {
							var16 = WorldMapLabelSize.getWidgetChild(var1, var0);
							if (var16 != null) {
								GrandExchangeOffer.Widget_runOnTargetLeave();
								AttackOption.selectSpell(var1, var0, WorldMapID.Widget_unpackTargetMask(KeyHandler.getWidgetFlags(var16)), var16.itemId);
								Client.isItemSelected = 0;
								Client.selectedSpellActionName = WorldMapAreaData.Widget_getSpellActionName(var16);
								if (Client.selectedSpellActionName == null) {
									Client.selectedSpellActionName = "null";
								}

								if (var16.isIf3) {
									Client.selectedSpellName = var16.dataText + ItemContainer.colorStartTag(16777215);
								} else {
									Client.selectedSpellName = ItemContainer.colorStartTag(65280) + var16.spellName + ItemContainer.colorStartTag(16777215);
								}
							}

							return;
						}

						if (var2 == 26) {
							class217.method4092();
						} else {
							int var12;
							Widget var14;
							if (var2 == 28) {
								var8 = UserComparator4.getPacketBufferNode(ClientPacket.field2263, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var8);
								var14 = WorldMapSprite.getWidget(var1);
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) {
									var12 = var14.cs1Instructions[0][1];
									Varps.Varps_main[var12] = 1 - Varps.Varps_main[var12];
									changeGameOptions(var12);
								}
							} else if (var2 == 29) {
								var8 = UserComparator4.getPacketBufferNode(ClientPacket.field2263, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var8);
								var14 = WorldMapSprite.getWidget(var1);
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) {
									var12 = var14.cs1Instructions[0][1];
									if (Varps.Varps_main[var12] != var14.cs1ComparisonValues[0]) {
										Varps.Varps_main[var12] = var14.cs1ComparisonValues[0];
										changeGameOptions(var12);
									}
								}
							} else if (var2 == 30) {
								if (Client.meslayerContinueWidget == null) {
									WorldMapArea.resumePauseWidget(var1, var0);
									Client.meslayerContinueWidget = WorldMapLabelSize.getWidgetChild(var1, var0);
									class234.invalidateWidget(Client.meslayerContinueWidget);
								}
							} else if (var2 == 31) {
								var8 = UserComparator4.getPacketBufferNode(ClientPacket.field2335, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeInt(var1);
								var8.packetBuffer.method5753(var3);
								var8.packetBuffer.writeInt(AbstractUserComparator.selectedItemWidget);
								var8.packetBuffer.writeShort(var0);
								var8.packetBuffer.method5753(LoginScreenAnimation.selectedItemSlot);
								var8.packetBuffer.method5753(WorldMapSectionType.selectedItemId);
								Client.packetWriter.addNode(var8);
								Client.field808 = 0;
								class194.field2356 = WorldMapSprite.getWidget(var1);
								Client.field668 = var0;
							} else if (var2 == 32) {
								var8 = UserComparator4.getPacketBufferNode(ClientPacket.field2266, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeShort(var0);
								var8.packetBuffer.method5764(ItemContainer.selectedSpellWidget);
								var8.packetBuffer.writeShort(Client.selectedSpellChildIndex);
								var8.packetBuffer.method5752(var3);
								var8.packetBuffer.method5764(var1);
								Client.packetWriter.addNode(var8);
								Client.field808 = 0;
								class194.field2356 = WorldMapSprite.getWidget(var1);
								Client.field668 = var0;
							} else if (var2 == 33) {
								var8 = UserComparator4.getPacketBufferNode(ClientPacket.field2248, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method5753(var3);
								var8.packetBuffer.method5764(var1);
								var8.packetBuffer.writeShort(var0);
								Client.packetWriter.addNode(var8);
								Client.field808 = 0;
								class194.field2356 = WorldMapSprite.getWidget(var1);
								Client.field668 = var0;
							} else if (var2 == 34) {
								var8 = UserComparator4.getPacketBufferNode(ClientPacket.field2315, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeShortLE(var1);
								var8.packetBuffer.method5898(var0);
								var8.packetBuffer.method5752(var3);
								Client.packetWriter.addNode(var8);
								Client.field808 = 0;
								class194.field2356 = WorldMapSprite.getWidget(var1);
								Client.field668 = var0;
							} else if (var2 == 35) {
								var8 = UserComparator4.getPacketBufferNode(ClientPacket.field2319, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method5762(var1);
								var8.packetBuffer.writeShort(var0);
								var8.packetBuffer.method5898(var3);
								Client.packetWriter.addNode(var8);
								Client.field808 = 0;
								class194.field2356 = WorldMapSprite.getWidget(var1);
								Client.field668 = var0;
							} else if (var2 == 36) {
								var8 = UserComparator4.getPacketBufferNode(ClientPacket.field2334, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeShort(var3);
								var8.packetBuffer.writeShortLE(var1);
								var8.packetBuffer.method5752(var0);
								Client.packetWriter.addNode(var8);
								Client.field808 = 0;
								class194.field2356 = WorldMapSprite.getWidget(var1);
								Client.field668 = var0;
							} else if (var2 == 37) {
								var8 = UserComparator4.getPacketBufferNode(ClientPacket.field2328, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method5753(var3);
								var8.packetBuffer.writeShort(var0);
								var8.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var8);
								Client.field808 = 0;
								class194.field2356 = WorldMapSprite.getWidget(var1);
								Client.field668 = var0;
							} else {
								if (var2 == 38) {
									GrandExchangeOffer.Widget_runOnTargetLeave();
									var16 = WorldMapSprite.getWidget(var1);
									Client.isItemSelected = 1;
									LoginScreenAnimation.selectedItemSlot = var0;
									AbstractUserComparator.selectedItemWidget = var1;
									WorldMapSectionType.selectedItemId = var3;
									class234.invalidateWidget(var16);
									Client.selectedItemName = ItemContainer.colorStartTag(16748608) + KitDefinition.ItemDefinition_get(var3).name + ItemContainer.colorStartTag(16777215);
									if (Client.selectedItemName == null) {
										Client.selectedItemName = "null";
									}

									return;
								}

								if (var2 == 39) {
									var8 = UserComparator4.getPacketBufferNode(ClientPacket.field2305, Client.packetWriter.isaacCipher);
									var8.packetBuffer.writeShortLE(var1);
									var8.packetBuffer.method5753(var3);
									var8.packetBuffer.writeShort(var0);
									Client.packetWriter.addNode(var8);
									Client.field808 = 0;
									class194.field2356 = WorldMapSprite.getWidget(var1);
									Client.field668 = var0;
								} else if (var2 == 40) {
									var8 = UserComparator4.getPacketBufferNode(ClientPacket.field2344, Client.packetWriter.isaacCipher);
									var8.packetBuffer.writeShort(var3);
									var8.packetBuffer.writeInt(var1);
									var8.packetBuffer.method5898(var0);
									Client.packetWriter.addNode(var8);
									Client.field808 = 0;
									class194.field2356 = WorldMapSprite.getWidget(var1);
									Client.field668 = var0;
								} else if (var2 == 41) {
									var8 = UserComparator4.getPacketBufferNode(ClientPacket.field2293, Client.packetWriter.isaacCipher);
									var8.packetBuffer.writeInt(var1);
									var8.packetBuffer.method5898(var3);
									var8.packetBuffer.method5753(var0);
									Client.packetWriter.addNode(var8);
									Client.field808 = 0;
									class194.field2356 = WorldMapSprite.getWidget(var1);
									Client.field668 = var0;
								} else if (var2 == 42) {
									var8 = UserComparator4.getPacketBufferNode(ClientPacket.field2308, Client.packetWriter.isaacCipher);
									var8.packetBuffer.writeInt(var1);
									var8.packetBuffer.method5753(var3);
									var8.packetBuffer.writeShort(var0);
									Client.packetWriter.addNode(var8);
									Client.field808 = 0;
									class194.field2356 = WorldMapSprite.getWidget(var1);
									Client.field668 = var0;
								} else if (var2 == 43) {
									var8 = UserComparator4.getPacketBufferNode(ClientPacket.field2252, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method5752(var3);
									var8.packetBuffer.writeInt(var1);
									var8.packetBuffer.method5898(var0);
									Client.packetWriter.addNode(var8);
									Client.field808 = 0;
									class194.field2356 = WorldMapSprite.getWidget(var1);
									Client.field668 = var0;
								} else if (var2 == 44) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = UserComparator4.getPacketBufferNode(ClientPacket.field2271, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.writeShort(var3);
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
										var9 = UserComparator4.getPacketBufferNode(ClientPacket.field2338, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.method5752(var3);
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
										var9 = UserComparator4.getPacketBufferNode(ClientPacket.field2250, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.method5752(var3);
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
										var9 = UserComparator4.getPacketBufferNode(ClientPacket.field2261, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeShort(var3);
										var9.packetBuffer.method5744(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
										var9 = UserComparator4.getPacketBufferNode(ClientPacket.field2272, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.writeShort(var3);
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
										var9 = UserComparator4.getPacketBufferNode(ClientPacket.field2301, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method5752(var3);
										var9.packetBuffer.method5744(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
										var9 = UserComparator4.getPacketBufferNode(ClientPacket.field2337, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.method5753(var3);
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
										var9 = UserComparator4.getPacketBufferNode(ClientPacket.field2287, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method5744(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.writeShort(var3);
										Client.packetWriter.addNode(var9);
									}
								} else {
									label788: {
										if (var2 != 57) {
											if (var2 == 58) {
												var16 = WorldMapLabelSize.getWidgetChild(var1, var0);
												if (var16 != null) {
													var9 = UserComparator4.getPacketBufferNode(ClientPacket.field2281, Client.packetWriter.isaacCipher);
													var9.packetBuffer.writeShort(Client.selectedSpellChildIndex);
													var9.packetBuffer.method5752(var0);
													var9.packetBuffer.method5764(var1);
													var9.packetBuffer.writeShortLE(ItemContainer.selectedSpellWidget);
													var9.packetBuffer.method5753(var16.itemId);
													var9.packetBuffer.method5752(Client.field830);
													Client.packetWriter.addNode(var9);
												}
												break label788;
											}

											if (var2 == 1001) {
												Client.mouseCrossX = var6;
												Client.mouseCrossY = var7;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												Client.destinationX = var0;
												Client.destinationY = var1;
												var8 = UserComparator4.getPacketBufferNode(ClientPacket.field2340, Client.packetWriter.isaacCipher);
												var8.packetBuffer.method5752(var3);
												var8.packetBuffer.method5753(SecureRandomFuture.baseY + var1);
												var8.packetBuffer.writeShort(var0 + class182.baseX);
												var8.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
												Client.packetWriter.addNode(var8);
												break label788;
											}

											if (var2 == 1002) {
												Client.mouseCrossX = var6;
												Client.mouseCrossY = var7;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var8 = UserComparator4.getPacketBufferNode(ClientPacket.field2302, Client.packetWriter.isaacCipher);
												var8.packetBuffer.method5753(var3);
												Client.packetWriter.addNode(var8);
												break label788;
											}

											if (var2 == 1003) {
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
														var10 = UserComparator4.getPacketBufferNode(ClientPacket.field2267, Client.packetWriter.isaacCipher);
														var10.packetBuffer.method5753(var17.id);
														Client.packetWriter.addNode(var10);
													}
												}
												break label788;
											}

											if (var2 == 1004) {
												Client.mouseCrossX = var6;
												Client.mouseCrossY = var7;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var8 = UserComparator4.getPacketBufferNode(ClientPacket.field2249, Client.packetWriter.isaacCipher);
												var8.packetBuffer.method5753(var3);
												Client.packetWriter.addNode(var8);
												break label788;
											}

											if (var2 == 1005) {
												var16 = WorldMapSprite.getWidget(var1);
												if (var16 != null && var16.itemQuantities[var0] >= 100000) {
													ObjectSound.addGameMessage(27, "", var16.itemQuantities[var0] + " x " + KitDefinition.ItemDefinition_get(var3).name);
												} else {
													var9 = UserComparator4.getPacketBufferNode(ClientPacket.field2249, Client.packetWriter.isaacCipher);
													var9.packetBuffer.method5753(var3);
													Client.packetWriter.addNode(var9);
												}

												Client.field808 = 0;
												class194.field2356 = WorldMapSprite.getWidget(var1);
												Client.field668 = var0;
												break label788;
											}

											if (var2 != 1007) {
												if (var2 == 1008 || var2 == 1010 || var2 == 1009 || var2 == 1011 || var2 == 1012) {
													class228.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1));
												}
												break label788;
											}
										}

										var16 = WorldMapLabelSize.getWidgetChild(var1, var0);
										if (var16 != null) {
											class247.widgetDefaultMenuAction(var3, var1, var0, var16.itemId, var5);
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
			class234.invalidateWidget(WorldMapSprite.getWidget(AbstractUserComparator.selectedItemWidget));
		}

		if (Client.isSpellSelected) {
			GrandExchangeOffer.Widget_runOnTargetLeave();
		}

		if (class194.field2356 != null && Client.field808 == 0) {
			class234.invalidateWidget(class194.field2356);
		}

	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-2103133941"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		Buffer.method5950();
		Projectile.method2247();
		int var1 = class219.VarpDefinition_get(var0).type;
		if (var1 != 0) {
			int var2 = Varps.Varps_main[var0];
			if (var1 == 1) {
				if (var2 == 1) {
					Rasterizer3D.Rasterizer3D_setBrightness(0.9D);
					((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(0.9D);
				}

				if (var2 == 2) {
					Rasterizer3D.Rasterizer3D_setBrightness(0.8D);
					((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(0.8D);
				}

				if (var2 == 3) {
					Rasterizer3D.Rasterizer3D_setBrightness(0.7D);
					((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(0.7D);
				}

				if (var2 == 4) {
					Rasterizer3D.Rasterizer3D_setBrightness(0.6D);
					((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(0.6D);
				}

				MouseRecorder.method1251();
			}

			if (var1 == 3) {
				short var3 = 0;
				if (var2 == 0) {
					var3 = 255;
				}

				if (var2 == 1) {
					var3 = 192;
				}

				if (var2 == 2) {
					var3 = 128;
				}

				if (var2 == 3) {
					var3 = 64;
				}

				if (var2 == 4) {
					var3 = 0;
				}

				if (var3 != Client.musicVolume) {
					if (Client.musicVolume == 0 && Client.currentTrackGroupId != -1) {
						UserComparator9.method3513(UserComparator7.archive6, Client.currentTrackGroupId, 0, var3, false);
						Client.field743 = false;
					} else if (var3 == 0) {
						class89.method2161();
						Client.field743 = false;
					} else if (class206.field2439 != 0) {
						class206.musicTrackVolume = var3;
					} else {
						WorldMapSprite.midiPcmStream.setPcmStreamVolume(var3);
					}

					Client.musicVolume = var3;
				}
			}

			if (var1 == 4) {
				if (var2 == 0) {
					Client.soundEffectVolume = 127;
				}

				if (var2 == 1) {
					Client.soundEffectVolume = 96;
				}

				if (var2 == 2) {
					Client.soundEffectVolume = 64;
				}

				if (var2 == 3) {
					Client.soundEffectVolume = 32;
				}

				if (var2 == 4) {
					Client.soundEffectVolume = 0;
				}
			}

			if (var1 == 5) {
				Client.leftClickOpensMenu = var2;
			}

			if (var1 == 6) {
				Client.chatEffects = var2;
			}

			if (var1 == 9) {
				Client.field838 = var2;
			}

			if (var1 == 10) {
				if (var2 == 0) {
					Client.areaSoundEffectVolume = 127;
				}

				if (var2 == 1) {
					Client.areaSoundEffectVolume = 96;
				}

				if (var2 == 2) {
					Client.areaSoundEffectVolume = 64;
				}

				if (var2 == 3) {
					Client.areaSoundEffectVolume = 32;
				}

				if (var2 == 4) {
					Client.areaSoundEffectVolume = 0;
				}
			}

			if (var1 == 17) {
				Client.followerIndex = var2 & 65535;
			}

			AttackOption[] var4;
			if (var1 == 18) {
				var4 = new AttackOption[]{AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_hidden, AttackOption.AttackOption_leftClickWhereAvailable, AttackOption.AttackOption_dependsOnCombatLevels};
				Client.playerAttackOption = (AttackOption)FaceNormal.findEnumerated(var4, var2);
				if (Client.playerAttackOption == null) {
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var1 == 19) {
				if (var2 == -1) {
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047;
				}
			}

			if (var1 == 22) {
				var4 = new AttackOption[]{AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_hidden, AttackOption.AttackOption_leftClickWhereAvailable, AttackOption.AttackOption_dependsOnCombatLevels};
				Client.npcAttackOption = (AttackOption)FaceNormal.findEnumerated(var4, var2);
				if (Client.npcAttackOption == null) {
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	}
}
