import java.io.File;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
@Implements("FileSystem")
public class FileSystem {
	@ObfuscatedName("v")
	@Export("FileSystem_hasPermissions")
	public static boolean FileSystem_hasPermissions;
	@ObfuscatedName("n")
	@Export("FileSystem_cacheDir")
	public static File FileSystem_cacheDir;
	@ObfuscatedName("f")
	@Export("FileSystem_cacheFiles")
	static Hashtable FileSystem_cacheFiles;

	static {
		FileSystem_hasPermissions = false; // L: 7
		FileSystem_cacheFiles = new Hashtable(16);
	} // L: 9

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "383441651"
	)
	public static void method2548() {
		ParamComposition.ParamDefinition_cached.clear(); // L: 68
	} // L: 69

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-26460885"
	)
	static final void method2545() {
		if (!ViewportMouse.ViewportMouse_false0) { // L: 120
			int var0 = Scene.Scene_cameraPitchSine; // L: 121
			int var1 = Scene.Scene_cameraPitchCosine; // L: 122
			int var2 = Scene.Scene_cameraYawSine; // L: 123
			int var3 = Scene.Scene_cameraYawCosine; // L: 124
			byte var4 = 50; // L: 125
			short var5 = 3500; // L: 126
			int var6 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var4 / Rasterizer3D.Rasterizer3D_zoom; // L: 127
			int var7 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var4 / Rasterizer3D.Rasterizer3D_zoom; // L: 128
			int var8 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var5 / Rasterizer3D.Rasterizer3D_zoom; // L: 129
			int var9 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var5 / Rasterizer3D.Rasterizer3D_zoom; // L: 130
			int var10 = Rasterizer3D.method3867(var7, var4, var1, var0); // L: 132
			int var11 = Rasterizer3D.method3897(var7, var4, var1, var0); // L: 133
			var7 = var10; // L: 134
			var10 = Rasterizer3D.method3867(var9, var5, var1, var0); // L: 135
			int var12 = Rasterizer3D.method3897(var9, var5, var1, var0); // L: 136
			var9 = var10; // L: 137
			var10 = Rasterizer3D.method3865(var6, var11, var3, var2); // L: 138
			var11 = Rasterizer3D.method3866(var6, var11, var3, var2); // L: 139
			var6 = var10; // L: 140
			var10 = Rasterizer3D.method3865(var8, var12, var3, var2); // L: 141
			var12 = Rasterizer3D.method3866(var8, var12, var3, var2); // L: 142
			ViewportMouse.field2492 = (var10 + var6) / 2; // L: 144
			class249.field3118 = (var9 + var7) / 2; // L: 145
			ViewportMouse.field2497 = (var12 + var11) / 2; // L: 146
			ViewportMouse.field2496 = (var10 - var6) / 2; // L: 147
			WorldMapDecoration.field2082 = (var9 - var7) / 2; // L: 148
			DirectByteArrayCopier.field3126 = (var12 - var11) / 2; // L: 149
			class161.field1920 = Math.abs(ViewportMouse.field2496); // L: 150
			class15.field140 = Math.abs(WorldMapDecoration.field2082); // L: 151
			ApproximateRouteStrategy.field629 = Math.abs(DirectByteArrayCopier.field3126); // L: 152
		}
	} // L: 153

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-828545505"
	)
	static final void method2547(int var0, int var1) {
		if (Client.menuOptionsCount >= 2 || Client.isItemSelected != 0 || Client.isSpellSelected) { // L: 7602
			if (Client.showMouseOverText) { // L: 7603
				int var2 = MilliClock.method2588(); // L: 7604
				String var3;
				if (Client.isItemSelected == 1 && Client.menuOptionsCount < 2) { // L: 7606
					var3 = "Use" + " " + Client.selectedItemName + " " + "->";
				} else if (Client.isSpellSelected && Client.menuOptionsCount < 2) { // L: 7607
					var3 = Client.selectedSpellActionName + " " + Client.selectedSpellName + " " + "->";
				} else {
					var3 = MouseRecorder.method2098(var2); // L: 7608
				}

				if (Client.menuOptionsCount > 2) { // L: 7609
					var3 = var3 + class44.colorStartTag(16777215) + " " + '/' + " " + (Client.menuOptionsCount - 2) + " more options";
				}

				Widget.fontBold12.drawRandomAlphaAndSpacing(var3, var0 + 4, var1 + 15, 16777215, 0, Client.cycle / 1000); // L: 7610
			}
		}
	} // L: 7611
}
