import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -2145116039
	)
	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1492900833
	)
	@Export("newZ")
	int newZ;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1446835647
	)
	@Export("oldX")
	int oldX;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -900342197
	)
	@Export("oldY")
	int oldY;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1517609517
	)
	@Export("newX")
	int newX;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -643341675
	)
	@Export("newY")
	int newY;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 838630171
	)
	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -2088226529
	)
	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1613017713
	)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 917626923
	)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -492614719
	)
	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 935129113
	)
	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -2057232245
	)
	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1809947597
	)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	} // L: 22

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lgu;I)V",
		garbageValue = "964088357"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.newX) { // L: 25
			var1.regionLowX = this.newX;
		}

		if (var1.regionHighX < this.newX) {
			var1.regionHighX = this.newX; // L: 26
		}

		if (var1.regionLowY > this.newY) { // L: 27
			var1.regionLowY = this.newY;
		}

		if (var1.regionHighY < this.newY) { // L: 28
			var1.regionHighY = this.newY;
		}

	} // L: 29

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1337137401"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.newZ + this.oldZ) { // L: 32
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7; // L: 35
		} else {
			return false; // L: 33
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1769831605"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7; // L: 39
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "1941144122"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 43
			return null; // L: 44
		} else {
			int[] var4 = new int[]{var2 + (this.newX * 64 - this.oldX * 64) + (this.newChunkXLow * 8 - this.oldChunkXLow * 8), var3 + (this.newY * 64 - this.oldY * 64) + (this.newChunkYLow * 8 - this.oldChunkYLow * 8)}; // L: 46 47 48
			return var4; // L: 49
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)Lks;",
		garbageValue = "-670243838"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 53
			return null; // L: 54
		} else {
			int var3 = this.oldX * 64 - this.newX * 64 + (this.oldChunkXLow * 8 - this.newChunkXLow * 8) + var1; // L: 56
			int var4 = var2 + (this.oldY * 64 - this.newY * 64) + (this.oldChunkYLow * 8 - this.newChunkYLow * 8); // L: 57
			return new Coord(this.oldZ, var3, var4); // L: 58
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "-860121653"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.oldZ = var1.readUnsignedByte();
		this.newZ = var1.readUnsignedByte(); // L: 63
		this.oldX = var1.readUnsignedShort();
		this.oldChunkXLow = var1.readUnsignedByte();
		this.oldChunkXHigh = var1.readUnsignedByte();
		this.oldY = var1.readUnsignedShort(); // L: 67
		this.oldChunkYLow = var1.readUnsignedByte();
		this.oldChunkYHigh = var1.readUnsignedByte();
		this.newX = var1.readUnsignedShort(); // L: 70
		this.newChunkXLow = var1.readUnsignedByte(); // L: 71
		this.newChunkXHigh = var1.readUnsignedByte(); // L: 72
		this.newY = var1.readUnsignedShort(); // L: 73
		this.newChunkYLow = var1.readUnsignedByte(); // L: 74
		this.newChunkYHigh = var1.readUnsignedByte();
		this.postRead(); // L: 76
	} // L: 77

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1290063965"
	)
	@Export("postRead")
	void postRead() {
	} // L: 79

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1330681104"
	)
	public static boolean method4303(char var0) {
		if (var0 >= ' ' && var0 < 127 || var0 > 127 && var0 < 160 || var0 > 160 && var0 <= 255) { // L: 61
			return true;
		} else {
			if (var0 != 0) { // L: 62
				char[] var1 = class345.cp1252AsciiExtension; // L: 64

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 65
					char var3 = var1[var2]; // L: 66
					if (var0 == var3) { // L: 68
						return true; // L: 69
					}
				}
			}

			return false; // L: 75
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "91"
	)
	static final void method4283() {
		if (!ViewportMouse.ViewportMouse_false0) { // L: 88
			int var0 = Scene.Scene_cameraPitchSine; // L: 89
			int var1 = Scene.Scene_cameraPitchCosine; // L: 90
			int var2 = Scene.Scene_cameraYawSine; // L: 91
			int var3 = Scene.Scene_cameraYawCosine; // L: 92
			byte var4 = 50; // L: 93
			short var5 = 3500; // L: 94
			int var6 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var4 / Rasterizer3D.Rasterizer3D_zoom; // L: 95
			int var7 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var4 / Rasterizer3D.Rasterizer3D_zoom; // L: 96
			int var8 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var5 / Rasterizer3D.Rasterizer3D_zoom; // L: 97
			int var9 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var5 / Rasterizer3D.Rasterizer3D_zoom; // L: 98
			int var10 = Rasterizer3D.method4656(var7, var4, var1, var0); // L: 100
			int var11 = Rasterizer3D.method4630(var7, var4, var1, var0); // L: 101
			var7 = var10; // L: 102
			var10 = Rasterizer3D.method4656(var9, var5, var1, var0); // L: 103
			int var12 = Rasterizer3D.method4630(var9, var5, var1, var0); // L: 104
			var9 = var10; // L: 105
			var10 = Rasterizer3D.method4627(var6, var11, var3, var2); // L: 106
			var11 = Rasterizer3D.method4628(var6, var11, var3, var2); // L: 107
			var6 = var10; // L: 108
			var10 = Rasterizer3D.method4627(var8, var12, var3, var2); // L: 109
			var12 = Rasterizer3D.method4628(var8, var12, var3, var2); // L: 110
			FaceNormal.field2664 = (var10 + var6) / 2; // L: 112
			ItemComposition.field2076 = (var7 + var9) / 2; // L: 113
			ViewportMouse.field2802 = (var11 + var12) / 2; // L: 114
			ViewportMouse.field2805 = (var10 - var6) / 2; // L: 115
			ViewportMouse.field2804 = (var9 - var7) / 2; // L: 116
			class18.field95 = (var12 - var11) / 2; // L: 117
			class9.field35 = Math.abs(ViewportMouse.field2805); // L: 118
			ViewportMouse.field2808 = Math.abs(ViewportMouse.field2804); // L: 119
			class196.field2204 = Math.abs(class18.field95); // L: 120
		}
	} // L: 121
}
