import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("an")
@Implements("WorldMapSection1")
public class WorldMapSection1 implements WorldMapSection {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1213941935
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1306866299
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1337019749
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 741739179
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1313402053
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1227163429
	)
	@Export("regionEndY")
	int regionEndY;

	WorldMapSection1() {
	} // L: 14

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lak;I)V",
		garbageValue = "-1645245778"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.regionEndX) { // L: 17
			var1.regionLowX = this.regionEndX;
		}

		if (var1.regionHighX < this.regionEndX) {
			var1.regionHighX = this.regionEndX; // L: 18
		}

		if (var1.regionLowY > this.regionEndY) { // L: 19
			var1.regionLowY = this.regionEndY;
		}

		if (var1.regionHighY < this.regionEndY) { // L: 20
			var1.regionHighY = this.regionEndY;
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "51"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) {
			return var2 >> 6 == this.regionStartX && var3 >> 6 == this.regionStartY; // L: 27
		} else {
			return false; // L: 25
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "10"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 == this.regionEndX && var2 >> 6 == this.regionEndY; // L: 31
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "-25"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 35
			return null; // L: 36
		} else {
			int[] var4 = new int[]{var2 + (this.regionEndX * 64 - this.regionStartX * 64), var3 + (this.regionEndY * 64 - this.regionStartY * 64)}; // L: 38 39 40
			return var4; // L: 41
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lhw;",
		garbageValue = "1"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 45
			return null; // L: 46
		} else {
			int var3 = this.regionStartX * 64 - this.regionEndX * 64 + var1; // L: 48
			int var4 = var2 + (this.regionStartY * 64 - this.regionEndY * 64); // L: 49
			return new Coord(this.minPlane, var3, var4); // L: 50
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lkb;I)V",
		garbageValue = "-222098123"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte(); // L: 54
		this.planes = var1.readUnsignedByte(); // L: 55
		this.regionStartX = var1.readUnsignedShort(); // L: 56
		this.regionStartY = var1.readUnsignedShort(); // L: 57
		this.regionEndX = var1.readUnsignedShort(); // L: 58
		this.regionEndY = var1.readUnsignedShort(); // L: 59
		this.postRead(); // L: 60
	} // L: 61

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-72"
	)
	@Export("postRead")
	void postRead() {
	} // L: 63

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "2108026740"
	)
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 21
		if (var2 == null) { // L: 22
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0; // L: 23 24
		}
	}

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-692815675"
	)
	static boolean method681() {
		return (Client.drawPlayerNames & 4) != 0; // L: 4914
	}
}
