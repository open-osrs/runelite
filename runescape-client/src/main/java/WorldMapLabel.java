import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("n")
	@Export("text")
	String text;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -844696425
	)
	@Export("width")
	int width;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 202703995
	)
	@Export("height")
	int height;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILfb;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1;
		this.width = var2;
		this.height = var3;
		this.size = var4;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lnf;B)I",
		garbageValue = "-71"
	)
	public static final int method3810(LoginType var0) {
		if (var0 == null) {
			return 12;
		} else {
			switch(var0.field4206) {
			case 4:
				return 20;
			default:
				return 12;
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lkx;II)V",
		garbageValue = "-1823606886"
	)
	static void method3808(Archive var0, int var1) {
		if (NetCache.NetCache_reference != null) {
			NetCache.NetCache_reference.offset = var1 * 8 + 5;
			int var2 = NetCache.NetCache_reference.readInt();
			int var3 = NetCache.NetCache_reference.readInt();
			var0.loadIndex(var2, var3);
		} else {
			UserList.requestNetFile((Archive)null, 255, 255, 0, (byte)0, true);
			NetCache.NetCache_archives[var1] = var0;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lhg;IIII)Z",
		garbageValue = "1277221877"
	)
	static final boolean method3809(Model var0, int var1, int var2, int var3) {
		if (!class319.method5768()) {
			return false;
		} else {
			int var4;
			int var5;
			int var6;
			int var7;
			int var10;
			int var11;
			int var12;
			int var15;
			int var16;
			if (!ViewportMouse.ViewportMouse_false0) {
				var4 = Scene.Scene_cameraPitchSine;
				var5 = Scene.Scene_cameraPitchCosine;
				var6 = Scene.Scene_cameraYawSine;
				var7 = Scene.Scene_cameraYawCosine;
				byte var8 = 50;
				short var9 = 3500;
				var10 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var8 / Rasterizer3D.Rasterizer3D_zoom;
				var11 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var8 / Rasterizer3D.Rasterizer3D_zoom;
				var12 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var9 / Rasterizer3D.Rasterizer3D_zoom;
				int var13 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var9 / Rasterizer3D.Rasterizer3D_zoom;
				int var14 = Rasterizer3D.method4067(var11, var8, var5, var4);
				var15 = Rasterizer3D.method4112(var11, var8, var5, var4);
				var11 = var14;
				var14 = Rasterizer3D.method4067(var13, var9, var5, var4);
				var16 = Rasterizer3D.method4112(var13, var9, var5, var4);
				var13 = var14;
				var14 = Rasterizer3D.method4123(var10, var15, var7, var6);
				var15 = Rasterizer3D.method4066(var10, var15, var7, var6);
				var10 = var14;
				var14 = Rasterizer3D.method4123(var12, var16, var7, var6);
				var16 = Rasterizer3D.method4066(var12, var16, var7, var6);
				WorldMapIcon_0.field2105 = (var14 + var10) / 2;
				ViewportMouse.field2568 = (var13 + var11) / 2;
				ViewportMouse.field2570 = (var15 + var16) / 2;
				ViewportMouse.field2571 = (var14 - var10) / 2;
				ViewportMouse.field2563 = (var13 - var11) / 2;
				class115.field1380 = (var16 - var15) / 2;
				GrandExchangeOfferOwnWorldComparator.field475 = Math.abs(ViewportMouse.field2571);
				VarcInt.field1647 = Math.abs(ViewportMouse.field2563);
				ViewportMouse.field2567 = Math.abs(class115.field1380);
			}

			var4 = var0.xMid + var1;
			var5 = var2 + var0.yMid;
			var6 = var3 + var0.zMid;
			var7 = var0.xMidOffset;
			var15 = var0.yMidOffset;
			var16 = var0.zMidOffset;
			var10 = WorldMapIcon_0.field2105 - var4;
			var11 = ViewportMouse.field2568 - var5;
			var12 = ViewportMouse.field2570 - var6;
			if (Math.abs(var10) > var7 + GrandExchangeOfferOwnWorldComparator.field475) {
				return false;
			} else if (Math.abs(var11) > var15 + VarcInt.field1647) {
				return false;
			} else if (Math.abs(var12) > var16 + ViewportMouse.field2567) {
				return false;
			} else if (Math.abs(var12 * ViewportMouse.field2563 - var11 * class115.field1380) > var15 * ViewportMouse.field2567 + var16 * VarcInt.field1647) {
				return false;
			} else if (Math.abs(var10 * class115.field1380 - var12 * ViewportMouse.field2571) > var7 * ViewportMouse.field2567 + var16 * GrandExchangeOfferOwnWorldComparator.field475) {
				return false;
			} else {
				return Math.abs(var11 * ViewportMouse.field2571 - var10 * ViewportMouse.field2563) <= var15 * GrandExchangeOfferOwnWorldComparator.field475 + var7 * VarcInt.field1647;
			}
		}
	}
}
