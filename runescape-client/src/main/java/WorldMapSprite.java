import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ea")
@Implements("WorldMapSprite")
public final class WorldMapSprite {
	@ObfuscatedName("o")
	@Export("tileColors")
	final int[] tileColors;

	WorldMapSprite() {
		this.tileColors = new int[4096]; // L: 11
	} // L: 12

	WorldMapSprite(int[] var1) {
		this.tileColors = var1; // L: 15
	} // L: 16

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-92"
	)
	@Export("getTileColor")
	final int getTileColor(int var1, int var2) {
		return this.tileColors[var2 * 64 + var1]; // L: 19
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2142917261"
	)
	static final void method3108() {
		if (!ViewportMouse.ViewportMouse_false0) { // L: 95
			int var0 = Scene.Scene_cameraPitchSine; // L: 96
			int var1 = Scene.Scene_cameraPitchCosine; // L: 97
			int var2 = Scene.Scene_cameraYawSine; // L: 98
			int var3 = Scene.Scene_cameraYawCosine; // L: 99
			byte var4 = 50; // L: 100
			short var5 = 3500; // L: 101
			int var6 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var4 / Rasterizer3D.Rasterizer3D_zoom; // L: 102
			int var7 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var4 / Rasterizer3D.Rasterizer3D_zoom; // L: 103
			int var8 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var5 / Rasterizer3D.Rasterizer3D_zoom; // L: 104
			int var9 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var5 / Rasterizer3D.Rasterizer3D_zoom; // L: 105
			int var10 = Rasterizer3D.method3400(var7, var4, var1, var0); // L: 107
			int var11 = Rasterizer3D.method3367(var7, var4, var1, var0); // L: 108
			var7 = var10; // L: 109
			var10 = Rasterizer3D.method3400(var9, var5, var1, var0); // L: 110
			int var12 = Rasterizer3D.method3367(var9, var5, var1, var0); // L: 111
			var9 = var10; // L: 112
			var10 = Rasterizer3D.method3379(var6, var11, var3, var2); // L: 113
			var11 = Rasterizer3D.method3380(var6, var11, var3, var2); // L: 114
			var6 = var10; // L: 115
			var10 = Rasterizer3D.method3379(var8, var12, var3, var2); // L: 116
			var12 = Rasterizer3D.method3380(var8, var12, var3, var2); // L: 117
			UserComparator10.field1439 = (var10 + var6) / 2; // L: 119
			MusicPatchPcmStream.field2544 = (var7 + var9) / 2; // L: 120
			WorldMapLabelSize.field1568 = (var11 + var12) / 2; // L: 121
			ViewportMouse.field2135 = (var10 - var6) / 2; // L: 122
			ViewportMouse.field2136 = (var9 - var7) / 2; // L: 123
			Varps.field2580 = (var12 - var11) / 2; // L: 124
			Login.field1018 = Math.abs(ViewportMouse.field2135); // L: 125
			ViewportMouse.field2137 = Math.abs(ViewportMouse.field2136); // L: 126
			class24.field189 = Math.abs(Varps.field2580); // L: 127
		}
	} // L: 128
}
