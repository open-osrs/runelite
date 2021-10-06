import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 739106677
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1981198519
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 126525707
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 2091786471
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1494547721
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1240041779
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -677400595
	)
	int field2031;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 156542557
	)
	int field2038;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1002795527
	)
	int field2039;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1479791309
	)
	int field2037;

	WorldMapSection2() {
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lfr;I)V",
		garbageValue = "2018229058"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2031) {
			var1.regionLowX = this.field2031;
		}

		if (var1.regionHighX < this.field2039) {
			var1.regionHighX = this.field2039;
		}

		if (var1.regionLowY > this.field2038) {
			var1.regionLowY = this.field2038;
		}

		if (var1.regionHighY < this.field2037) {
			var1.regionHighY = this.field2037;
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-964071790"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) {
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "381612084"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field2031 && var1 >> 6 <= this.field2039 && var2 >> 6 >= this.field2038 && var2 >> 6 <= this.field2037;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "88"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{var2 + (this.field2031 * 64 - this.regionStartX * 64), var3 + (this.field2038 * 64 - this.regionStartY * 64)};
			return var4;
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(III)Lic;",
		garbageValue = "2033247854"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.regionStartX * 64 - this.field2031 * 64 + var1;
			int var4 = var2 + (this.regionStartY * 64 - this.field2038 * 64);
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lot;B)V",
		garbageValue = "4"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort();
		this.regionStartY = var1.readUnsignedShort();
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort();
		this.field2031 = var1.readUnsignedShort();
		this.field2038 = var1.readUnsignedShort();
		this.field2039 = var1.readUnsignedShort();
		this.field2037 = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1532243849"
	)
	@Export("postRead")
	void postRead() {
	}
}
