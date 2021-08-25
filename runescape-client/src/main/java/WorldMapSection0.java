import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("archive15")
	static Archive archive15;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1799367031
	)
	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -432598283
	)
	@Export("newZ")
	int newZ;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 410888893
	)
	@Export("oldX")
	int oldX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1719467777
	)
	@Export("oldY")
	int oldY;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1368077497
	)
	@Export("newX")
	int newX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -959034875
	)
	@Export("newY")
	int newY;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1444756223
	)
	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1782399699
	)
	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1201601721
	)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -673400873
	)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1855912777
	)
	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -610519609
	)
	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 113779895
	)
	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1187194763
	)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lfr;I)V",
		garbageValue = "1411488256"
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "899981978"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.newZ + this.oldZ) {
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7;
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
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7;
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
			int[] var4 = new int[]{var2 + (this.newX * 64 - this.oldX * 64) + (this.newChunkXLow * 8 - this.oldChunkXLow * 8), var3 + (this.newY * 64 - this.oldY * 64) + (this.newChunkYLow * 8 - this.oldChunkYLow * 8)};
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
			int var3 = this.oldX * 64 - this.newX * 64 + (this.oldChunkXLow * 8 - this.newChunkXLow * 8) + var1;
			int var4 = var2 + (this.oldY * 64 - this.newY * 64) + (this.oldChunkYLow * 8 - this.newChunkYLow * 8);
			return new Coord(this.oldZ, var3, var4);
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-2069607106"
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

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1519540004"
	)
	@Export("postRead")
	void postRead() {
	}
}
