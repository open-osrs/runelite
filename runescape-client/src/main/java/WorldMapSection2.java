import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ah")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("rv")
	@ObfuscatedGetter(
		intValue = 1167994355
	)
	static int field225;
	@ObfuscatedName("as")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -432633541
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1968130081
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -741529837
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1317553213
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1484434025
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 2055867539
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -38953615
	)
	int field222;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 458609745
	)
	int field223;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 562473149
	)
	int field224;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -2130603605
	)
	int field226;

	WorldMapSection2() {
	} // L: 18

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lak;I)V",
		garbageValue = "-1645245778"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field222) { // L: 21
			var1.regionLowX = this.field222;
		}

		if (var1.regionHighX < this.field224) {
			var1.regionHighX = this.field224; // L: 22
		}

		if (var1.regionLowY > this.field223) { // L: 23
			var1.regionLowY = this.field223;
		}

		if (var1.regionHighY < this.field226) { // L: 24
			var1.regionHighY = this.field226;
		}

	} // L: 25

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "51"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.minPlane + this.planes) { // L: 28
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY; // L: 31
		} else {
			return false; // L: 29
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "10"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field222 && var1 >> 6 <= this.field224 && var2 >> 6 >= this.field223 && var2 >> 6 <= this.field226; // L: 35
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "-25"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 39
			return null; // L: 40
		} else {
			int[] var4 = new int[]{var2 + (this.field222 * 64 - this.regionStartX * 64), var3 + (this.field223 * 64 - this.regionStartY * 64)}; // L: 42 43 44
			return var4; // L: 45
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lhw;",
		garbageValue = "1"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 49
			return null; // L: 50
		} else {
			int var3 = this.regionStartX * 64 - this.field222 * 64 + var1; // L: 52
			int var4 = var2 + (this.regionStartY * 64 - this.field223 * 64); // L: 53
			return new Coord(this.minPlane, var3, var4); // L: 54
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lkb;I)V",
		garbageValue = "-222098123"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte(); // L: 58
		this.planes = var1.readUnsignedByte(); // L: 59
		this.regionStartX = var1.readUnsignedShort(); // L: 60
		this.regionStartY = var1.readUnsignedShort(); // L: 61
		this.regionEndX = var1.readUnsignedShort(); // L: 62
		this.regionEndY = var1.readUnsignedShort();
		this.field222 = var1.readUnsignedShort();
		this.field223 = var1.readUnsignedShort(); // L: 65
		this.field224 = var1.readUnsignedShort(); // L: 66
		this.field226 = var1.readUnsignedShort(); // L: 67
		this.postRead(); // L: 68
	} // L: 69

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "335411255"
	)
	@Export("postRead")
	void postRead() {
	} // L: 71

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(CB)C",
		garbageValue = "0"
	)
	static char method426(char var0) {
		return var0 != 181 && var0 != 402 ? Character.toTitleCase(var0) : var0; // L: 63 64
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "166784628"
	)
	static final boolean method425() {
		return ViewportMouse.ViewportMouse_isInViewport; // L: 87
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-26"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		AbstractWorldMapData.method375(); // L: 7734
		Client.menuActions[0] = "Cancel"; // L: 7735
		Client.menuTargets[0] = ""; // L: 7736
		Client.menuOpcodes[0] = 1006; // L: 7737
		Client.menuShiftClick[0] = false; // L: 7738
		Client.menuOptionsCount = 1; // L: 7739
	} // L: 7740
}
