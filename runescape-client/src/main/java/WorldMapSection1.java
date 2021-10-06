import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
@Implements("WorldMapSection1")
public class WorldMapSection1 implements WorldMapSection {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1921792767
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1540557989
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 50051199
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -625671383
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 345047229
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -598803681
	)
	@Export("regionEndY")
	int regionEndY;

	WorldMapSection1() {
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lfr;I)V",
		garbageValue = "2018229058"
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-964071790"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.minPlane + this.planes) {
			return var2 >> 6 == this.regionStartX && var3 >> 6 == this.regionStartY;
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
		return var1 >> 6 == this.regionEndX && var2 >> 6 == this.regionEndY;
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
			int[] var4 = new int[]{var2 + (this.regionEndX * 64 - this.regionStartX * 64), var3 + (this.regionEndY * 64 - this.regionStartY * 64)};
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
			int var3 = this.regionStartX * 64 - this.regionEndX * 64 + var1;
			int var4 = var2 + (this.regionStartY * 64 - this.regionEndY * 64);
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
		this.postRead();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "51"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)J",
		garbageValue = "1118875109"
	)
	public static long method3912(int var0) {
		return ViewportMouse.ViewportMouse_entityTags[var0];
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "([Ljt;IIIZB)V",
		garbageValue = "3"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) {
			Widget var6 = var0[var5];
			if (var6 != null && var6.parentId == var1) {
				WorldMapEvent.alignWidgetSize(var6, var2, var3, var4);
				HorizontalAlignment.alignWidgetPosition(var6, var2, var3);
				if (var6.scrollX > var6.scrollWidth - var6.width) {
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) {
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height) {
					var6.scrollY = var6.scrollHeight - var6.height;
				}

				if (var6.scrollY < 0) {
					var6.scrollY = 0;
				}

				if (var6.type == 0) {
					TaskHandler.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	}
}
