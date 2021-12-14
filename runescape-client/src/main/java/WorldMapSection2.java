import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ht")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("fg")
	@ObfuscatedGetter(
		intValue = 1621572449
	)
	static int field2601;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1294492431
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1928617505
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 959776667
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1522453015
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1997000163
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1818792557
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -961115099
	)
	int field2595;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1227046003
	)
	int field2597;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1985561305
	)
	int field2600;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1750450639
	)
	int field2599;

	WorldMapSection2() {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lhr;I)V",
		garbageValue = "2069930856"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2595) {
			var1.regionLowX = this.field2595;
		}

		if (var1.regionHighX < this.field2600) {
			var1.regionHighX = this.field2600;
		}

		if (var1.regionLowY > this.field2597) {
			var1.regionLowY = this.field2597;
		}

		if (var1.regionHighY < this.field2599) {
			var1.regionHighY = this.field2599;
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "81"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.minPlane + this.planes) {
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "42159517"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field2595 && var1 >> 6 <= this.field2600 && var2 >> 6 >= this.field2597 && var2 >> 6 <= this.field2599;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "22240711"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{var2 + (this.field2595 * 64 - this.regionStartX * 64), var3 + (this.field2597 * 64 - this.regionStartY * 64)};
			return var4;
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIS)Lju;",
		garbageValue = "5000"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.regionStartX * 64 - this.field2595 * 64 + var1;
			int var4 = var2 + (this.regionStartY * 64 - this.field2597 * 64);
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lpi;S)V",
		garbageValue = "-15299"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort();
		this.regionStartY = var1.readUnsignedShort();
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort();
		this.field2595 = var1.readUnsignedShort();
		this.field2597 = var1.readUnsignedShort();
		this.field2600 = var1.readUnsignedShort();
		this.field2599 = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "426265039"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-494413761"
	)
	public static int method4414(int var0, int var1) {
		return (var0 << 8) + var1;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "12387"
	)
	public static void method4417() {
		Widget.Widget_cachedSprites.clear();
		Widget.Widget_cachedModels.clear();
		Widget.Widget_cachedFonts.clear();
		Widget.Widget_cachedSpriteMasks.clear();
	}
}
