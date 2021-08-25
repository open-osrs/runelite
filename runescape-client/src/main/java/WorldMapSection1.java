import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gr")
@Implements("WorldMapSection1")
public class WorldMapSection1 implements WorldMapSection {
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "[Loi;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 656001719
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -525945557
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 2035585677
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1305061549
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1689577501
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1713119819
	)
	@Export("regionEndY")
	int regionEndY;

	WorldMapSection1() {
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lfr;I)V",
		garbageValue = "1411488256"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.regionEndX) {
			var1.regionLowX = this.regionEndX;
		}

		if (var1.regionHighX < this.regionEndX) {
			var1.regionHighX = this.regionEndX;
		}

		if (var1.regionLowY > this.regionEndY) {
			var1.regionLowY = this.regionEndY;
		}

		if (var1.regionHighY < this.regionEndY) {
			var1.regionHighY = this.regionEndY;
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "899981978"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) {
			return var2 >> 6 == this.regionStartX && var3 >> 6 == this.regionStartY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1579388425"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 == this.regionEndX && var2 >> 6 == this.regionEndY;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-1605422008"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{var2 + (this.regionEndX * 64 - this.regionStartX * 64), var3 + (this.regionEndY * 64 - this.regionStartY * 64)};
			return var4;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)Liy;",
		garbageValue = "1389329989"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.regionStartX * 64 - this.regionEndX * 64 + var1;
			int var4 = var2 + (this.regionStartY * 64 - this.regionEndY * 64);
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-2069607106"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort();
		this.regionStartY = var1.readUnsignedShort();
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-100803461"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "33"
	)
	public static int method3843(int var0, int var1) {
		return (var0 << 8) + var1;
	}
}
