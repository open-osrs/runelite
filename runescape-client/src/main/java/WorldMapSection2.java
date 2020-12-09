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
	}

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
			var1.regionHighX = this.field216;
		}

		if (var1.regionLowY > this.field213) {
			var1.regionLowY = this.field213;
		}

		if (var1.regionHighY < this.field218) {
			var1.regionHighY = this.field218;
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "241939554"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) {
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "639074408"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field209 && var1 >> 6 <= this.field216 && var2 >> 6 >= this.field213 && var2 >> 6 <= this.field218;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "1868308301"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.field209 * 64 - this.regionStartX * 64 + var2, var3 + (this.field213 * 64 - this.regionStartY * 64)};
			return var4;
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lhs;",
		garbageValue = "0"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.regionStartX * 64 - this.field209 * 64 + var1;
			int var4 = this.regionStartY * 64 - this.field213 * 64 + var2;
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lkj;B)V",
		garbageValue = "125"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort();
		this.regionStartY = var1.readUnsignedShort();
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort();
		this.field209 = var1.readUnsignedShort();
		this.field213 = var1.readUnsignedShort();
		this.field216 = var1.readUnsignedShort();
		this.field218 = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-44"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-695771514"
	)
	public static boolean method378(int var0) {
		return (var0 >> 28 & 1) != 0;
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "240691072"
	)
	static final void method377(boolean var0) {
		FontName.playPcmPlayers();
		++Client.packetWriter.pendingWrites;
		if (Client.packetWriter.pendingWrites >= 50 || var0) {
			Client.packetWriter.pendingWrites = 0;
			if (!Client.field696 && Client.packetWriter.getSocket() != null) {
				PacketBufferNode var1 = ItemContainer.getPacketBufferNode(ClientPacket.field2322, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var1);

				try {
					Client.packetWriter.flush();
				} catch (IOException var3) {
					Client.field696 = true;
				}
			}

		}
	}
}
