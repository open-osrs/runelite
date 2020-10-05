import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("au")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1201238509
	)
	int minPlane;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1333374059
	)
	int planes;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1475797575
	)
	int regionStartX;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 905621997
	)
	int regionStartY;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1367224805
	)
	int regionEndX;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -359238835
	)
	int regionEndY;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 994649457
	)
	int field224;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -287102607
	)
	int field223;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -64559715
	)
	int field228;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1728764959
	)
	int field225;

	WorldMapSection2() {
	} // L: 18

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lar;B)V",
		garbageValue = "100"
	)
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field224) { // L: 21
			var1.regionLowX = this.field224;
		}

		if (var1.regionHighX < this.field228) {
			var1.regionHighX = this.field228; // L: 22
		}

		if (var1.regionLowY > this.field223) { // L: 23
			var1.regionLowY = this.field223;
		}

		if (var1.regionHighY < this.field225) { // L: 24
			var1.regionHighY = this.field225;
		}

	} // L: 25

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-339896458"
	)
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) { // L: 28
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY; // L: 31
		} else {
			return false; // L: 29
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-2135820245"
	)
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field224 && var1 >> 6 <= this.field228 && var2 >> 6 >= this.field223 && var2 >> 6 <= this.field225; // L: 35
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-1761492451"
	)
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 39
			return null;
		} else {
			int[] var4 = new int[]{var2 + (this.field224 * 64 - this.regionStartX * 64), var3 + (this.field223 * 64 - this.regionStartY * 64)}; // L: 42 43 44
			return var4; // L: 45
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(III)Lhg;",
		garbageValue = "-1553504587"
	)
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 49
			return null; // L: 50
		} else {
			int var3 = this.regionStartX * 64 - this.field224 * 64 + var1; // L: 52
			int var4 = var2 + (this.regionStartY * 64 - this.field223 * 64); // L: 53
			return new Coord(this.minPlane, var3, var4); // L: 54
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lkf;I)V",
		garbageValue = "2144381737"
	)
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte(); // L: 58
		this.planes = var1.readUnsignedByte(); // L: 59
		this.regionStartX = var1.readUnsignedShort(); // L: 60
		this.regionStartY = var1.readUnsignedShort(); // L: 61
		this.regionEndX = var1.readUnsignedShort(); // L: 62
		this.regionEndY = var1.readUnsignedShort(); // L: 63
		this.field224 = var1.readUnsignedShort(); // L: 64
		this.field223 = var1.readUnsignedShort(); // L: 65
		this.field228 = var1.readUnsignedShort(); // L: 66
		this.field225 = var1.readUnsignedShort(); // L: 67
		this.postRead(); // L: 68
	} // L: 69

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "240000675"
	)
	void postRead() {
	} // L: 71

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IB)Lbk;",
		garbageValue = "1"
	)
	static Message Messages_getMessage(int var0) {
		return (Message)Messages.Messages_hashTable.get((long)var0); // L: 40
	}

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "835345001"
	)
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) { // L: 3424
			Tile.clientPreferences.roofsHidden = !Tile.clientPreferences.roofsHidden; // L: 3425
			WorldMapData_1.savePreferences(); // L: 3426
			if (Tile.clientPreferences.roofsHidden) { // L: 3427
				WorldMapRectangle.addGameMessage(99, "", "Roofs are now all hidden");
			} else {
				WorldMapRectangle.addGameMessage(99, "", "Roofs will only be removed selectively"); // L: 3428
			}
		}

		if (var0.equalsIgnoreCase("displayfps")) { // L: 3430
			Client.displayFps = !Client.displayFps;
		}

		if (var0.equalsIgnoreCase("renderself")) { // L: 3431
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) { // L: 3432
			Client.showMouseOverText = !Client.showMouseOverText;
		}

		if (Client.staffModLevel >= 2) { // L: 3433
			if (var0.equalsIgnoreCase("errortest")) { // L: 3434
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) { // L: 3435
				Message.worldMap.showCoord = !Message.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) { // L: 3436
				Client.displayFps = true;
			}

			if (var0.equalsIgnoreCase("fpsoff")) { // L: 3437
				Client.displayFps = false;
			}

			if (var0.equalsIgnoreCase("gc")) { // L: 3438
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) { // L: 3439
				ArchiveLoader.method1208();
			}
		}

		PacketBufferNode var1 = Client.getPacketBufferNode(ClientPacket.field2296, Client.packetWriter.isaacCipher); // L: 3442
		var1.packetBuffer.writeByte(var0.length() + 1); // L: 3443
		var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 3444
		Client.packetWriter.addNode(var1); // L: 3445
	} // L: 3446
}
