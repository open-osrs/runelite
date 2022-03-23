import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hb")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -609118689
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -922097575
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -962629091
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 487814859
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -820840621
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1924618585
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1193578549
	)
	int field2670;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1466637361
	)
	int field2674;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -7961391
	)
	int field2678;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 311755747
	)
	int field2679;

	WorldMapSection2() {
	} // L: 18

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lhw;I)V",
		garbageValue = "-1521793701"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2670) { // L: 22
			var1.regionLowX = this.field2670;
		}

		if (var1.regionHighX < this.field2678) {
			var1.regionHighX = this.field2678; // L: 23
		}

		if (var1.regionLowY > this.field2674) { // L: 24
			var1.regionLowY = this.field2674;
		}

		if (var1.regionHighY < this.field2679) { // L: 25
			var1.regionHighY = this.field2679;
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-2091891709"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.minPlane + this.planes) {
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-59"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field2670 && var1 >> 6 <= this.field2678 && var2 >> 6 >= this.field2674 && var2 >> 6 <= this.field2679; // L: 38
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-604533765"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 43
			return null; // L: 44
		} else {
			int[] var4 = new int[]{var2 + (this.field2670 * 64 - this.regionStartX * 64), var3 + (this.field2674 * 64 - this.regionStartY * 64)}; // L: 46 47 48
			return var4; // L: 49
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(III)Lko;",
		garbageValue = "-41254697"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 54
			return null; // L: 55
		} else {
			int var3 = this.regionStartX * 64 - this.field2670 * 64 + var1; // L: 57
			int var4 = var2 + (this.regionStartY * 64 - this.field2674 * 64); // L: 58
			return new Coord(this.minPlane, var3, var4); // L: 59
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lpd;B)V",
		garbageValue = "119"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte(); // L: 64
		this.planes = var1.readUnsignedByte(); // L: 65
		this.regionStartX = var1.readUnsignedShort(); // L: 66
		this.regionStartY = var1.readUnsignedShort(); // L: 67
		this.regionEndX = var1.readUnsignedShort(); // L: 68
		this.regionEndY = var1.readUnsignedShort(); // L: 69
		this.field2670 = var1.readUnsignedShort(); // L: 70
		this.field2674 = var1.readUnsignedShort(); // L: 71
		this.field2678 = var1.readUnsignedShort(); // L: 72
		this.field2679 = var1.readUnsignedShort(); // L: 73
		this.postRead(); // L: 74
	} // L: 75

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1066929614"
	)
	@Export("postRead")
	void postRead() {
	} // L: 77

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Llq;IIIZI)V",
		garbageValue = "1018081729"
	)
	public static void method4561(AbstractArchive var0, int var1, int var2, int var3, boolean var4) {
		class273.musicPlayerStatus = 1; // L: 26
		class147.musicTrackArchive = var0; // L: 27
		ArchiveLoader.musicTrackGroupId = var1; // L: 28
		class273.musicTrackFileId = var2; // L: 29
		DevicePcmPlayerProvider.musicTrackVolume = var3; // L: 30
		class260.musicTrackBoolean = var4; // L: 31
		class273.pcmSampleLength = 10000; // L: 32
	} // L: 33

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2085345947"
	)
	@Export("Widget_unpackTargetMask")
	public static int Widget_unpackTargetMask(int var0) {
		return var0 >> 11 & 63; // L: 17
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(Lkn;I)I",
		garbageValue = "-1150366457"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get(((long)var0.id << 32) + (long)var0.childIndex); // L: 11787
		return var1 != null ? var1.integer : var0.flags; // L: 11788 11789
	}
}
