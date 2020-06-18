import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("id")
public final class class236 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(III)I",
		garbageValue = "-1064559233"
	)
	static final int method4282(int var0, int var1) {
		if (var0 == -1) {
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(Lef;IIII)Z",
		garbageValue = "1976024119"
	)
	static final boolean method4283(Model var0, int var1, int var2, int var3) {
		boolean var4 = ViewportMouse.ViewportMouse_isInViewport;
		if (!var4) {
			return false;
		} else {
			int var5;
			int var6;
			int var7;
			int var8;
			int var11;
			int var12;
			int var13;
			int var16;
			int var17;
			if (!ViewportMouse.ViewportMouse_false0) {
				var5 = Scene.Scene_cameraPitchSine;
				var6 = Scene.Scene_cameraPitchCosine;
				var7 = Scene.Scene_cameraYawSine;
				var8 = Scene.Scene_cameraYawCosine;
				byte var9 = 50;
				short var10 = 3500;
				var11 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var9 / Rasterizer3D.Rasterizer3D_zoom;
				var12 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var9 / Rasterizer3D.Rasterizer3D_zoom;
				var13 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var10 / Rasterizer3D.Rasterizer3D_zoom;
				int var14 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var10 / Rasterizer3D.Rasterizer3D_zoom;
				int var15 = Rasterizer3D.method3135(var12, var9, var6, var5);
				var16 = Rasterizer3D.method3136(var12, var9, var6, var5);
				var12 = var15;
				var15 = Rasterizer3D.method3135(var14, var10, var6, var5);
				var17 = Rasterizer3D.method3136(var14, var10, var6, var5);
				var14 = var15;
				var15 = Rasterizer3D.method3158(var11, var16, var8, var7);
				var16 = Rasterizer3D.method3134(var11, var16, var8, var7);
				var11 = var15;
				var15 = Rasterizer3D.method3158(var13, var17, var8, var7);
				var17 = Rasterizer3D.method3134(var13, var17, var8, var7);
				ViewportMouse.field1770 = (var11 + var15) / 2;
				class348.field4062 = (var14 + var12) / 2;
				SoundSystem.field1466 = (var16 + var17) / 2;
				ViewportMouse.field1771 = (var15 - var11) / 2;
				ViewportMouse.field1775 = (var14 - var12) / 2;
				ViewportMouse.field1773 = (var17 - var16) / 2;
				ApproximateRouteStrategy.field630 = Math.abs(ViewportMouse.field1771);
				class204.field2422 = Math.abs(ViewportMouse.field1775);
				UserComparator7.field2003 = Math.abs(ViewportMouse.field1773);
			}

			var5 = var0.xMid + var1;
			var6 = var2 + var0.yMid;
			var7 = var3 + var0.zMid;
			var8 = var0.xMidOffset;
			var16 = var0.yMidOffset;
			var17 = var0.zMidOffset;
			var11 = ViewportMouse.field1770 - var5;
			var12 = class348.field4062 - var6;
			var13 = SoundSystem.field1466 - var7;
			if (Math.abs(var11) > var8 + ApproximateRouteStrategy.field630) {
				return false;
			} else if (Math.abs(var12) > var16 + class204.field2422) {
				return false;
			} else if (Math.abs(var13) > var17 + UserComparator7.field2003) {
				return false;
			} else if (Math.abs(var13 * ViewportMouse.field1775 - var12 * ViewportMouse.field1773) > var16 * UserComparator7.field2003 + var17 * class204.field2422) {
				return false;
			} else if (Math.abs(var11 * ViewportMouse.field1773 - var13 * ViewportMouse.field1771) > var8 * UserComparator7.field2003 + var17 * ApproximateRouteStrategy.field630) {
				return false;
			} else {
				return Math.abs(var12 * ViewportMouse.field1771 - var11 * ViewportMouse.field1775) <= var8 * class204.field2422 + var16 * ApproximateRouteStrategy.field630;
			}
		}
	}
}
