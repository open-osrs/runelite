import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ac")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1820791637
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -565326093
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 2013680833
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1086976489
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -793324497
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 948306725
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -903229511
	)
	int field209;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 92163463
	)
	int field213;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1623221685
	)
	int field216;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 2079890503
	)
	int field218;

	WorldMapSection2() {
	} // L: 18

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lav;S)V",
		garbageValue = "19050"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field209) {
			var1.regionLowX = this.field209;
		}

		if (var1.regionHighX < this.field216) {
			var1.regionHighX = this.field216; // L: 22
		}

		if (var1.regionLowY > this.field213) { // L: 23
			var1.regionLowY = this.field213;
		}

		if (var1.regionHighY < this.field218) { // L: 24
			var1.regionHighY = this.field218;
		}

	} // L: 25

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "241939554"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) { // L: 28
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY; // L: 31
		} else {
			return false; // L: 29
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "639074408"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field209 && var1 >> 6 <= this.field216 && var2 >> 6 >= this.field213 && var2 >> 6 <= this.field218; // L: 35
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "1868308301"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 39
			return null; // L: 40
		} else {
			int[] var4 = new int[]{var2 + (this.field209 * 64 - this.regionStartX * 64), var3 + (this.field213 * 64 - this.regionStartY * 64)}; // L: 42 43 44
			return var4; // L: 45
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lhs;",
		garbageValue = "0"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 49
			return null; // L: 50
		} else {
			int var3 = this.regionStartX * 64 - this.field209 * 64 + var1; // L: 52
			int var4 = var2 + (this.regionStartY * 64 - this.field213 * 64); // L: 53
			return new Coord(this.minPlane, var3, var4); // L: 54
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lkj;B)V",
		garbageValue = "125"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte(); // L: 58
		this.planes = var1.readUnsignedByte(); // L: 59
		this.regionStartX = var1.readUnsignedShort(); // L: 60
		this.regionStartY = var1.readUnsignedShort(); // L: 61
		this.regionEndX = var1.readUnsignedShort(); // L: 62
		this.regionEndY = var1.readUnsignedShort(); // L: 63
		this.field209 = var1.readUnsignedShort(); // L: 64
		this.field213 = var1.readUnsignedShort(); // L: 65
		this.field216 = var1.readUnsignedShort(); // L: 66
		this.field218 = var1.readUnsignedShort(); // L: 67
		this.postRead(); // L: 68
	} // L: 69

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-44"
	)
	@Export("postRead")
	void postRead() {
	} // L: 71

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-695771514"
	)
	public static boolean method378(int var0) {
		return (var0 >> 28 & 1) != 0; // L: 21
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "240691072"
	)
	static final void method377(boolean var0) {
		FontName.playPcmPlayers(); // L: 5471
		++Client.packetWriter.pendingWrites; // L: 5472
		if (Client.packetWriter.pendingWrites >= 50 || var0) { // L: 5473
			Client.packetWriter.pendingWrites = 0; // L: 5474
			if (!Client.field696 && Client.packetWriter.getSocket() != null) { // L: 5475
				PacketBufferNode var1 = ItemContainer.getPacketBufferNode(ClientPacket.field2322, Client.packetWriter.isaacCipher); // L: 5477
				Client.packetWriter.addNode(var1); // L: 5478

				try {
					Client.packetWriter.flush(); // L: 5480
				} catch (IOException var3) { // L: 5482
					Client.field696 = true; // L: 5483
				}
			}

		}
	} // L: 5486
}
