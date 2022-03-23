import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
@Implements("FloorDecoration")
public final class FloorDecoration {
	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("dragInventoryWidget")
	static Widget dragInventoryWidget;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1272026655
	)
	@Export("z")
	int z;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -511933001
	)
	@Export("x")
	int x;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 444068925
	)
	@Export("y")
	int y;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lgh;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		longValue = 8223121448283750647L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 2133308705
	)
	@Export("flags")
	int flags;

	FloorDecoration() {
	} // L: 11

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Lbr;",
		garbageValue = "39"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0; // L: 237
		return WallDecoration.getNextWorldListWorld(); // L: 238
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lhx;IIII)Z",
		garbageValue = "1779752066"
	)
	static final boolean method3980(Model var0, int var1, int var2, int var3) {
		if (!Client.method1198()) { // L: 99
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
			if (!ViewportMouse.ViewportMouse_false0) { // L: 101
				var4 = Scene.Scene_cameraPitchSine; // L: 102
				var5 = Scene.Scene_cameraPitchCosine; // L: 103
				var6 = Scene.Scene_cameraYawSine; // L: 104
				var7 = Scene.Scene_cameraYawCosine; // L: 105
				byte var8 = 50; // L: 106
				short var9 = 3500; // L: 107
				var10 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var8 / Rasterizer3D.Rasterizer3D_zoom; // L: 108
				var11 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var8 / Rasterizer3D.Rasterizer3D_zoom; // L: 109
				var12 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var9 / Rasterizer3D.Rasterizer3D_zoom; // L: 110
				int var13 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var9 / Rasterizer3D.Rasterizer3D_zoom; // L: 111
				int var14 = Rasterizer3D.method4019(var11, var8, var5, var4); // L: 113
				var15 = Rasterizer3D.method4020(var11, var8, var5, var4); // L: 114
				var11 = var14; // L: 115
				var14 = Rasterizer3D.method4019(var13, var9, var5, var4); // L: 116
				var16 = Rasterizer3D.method4020(var13, var9, var5, var4); // L: 117
				var13 = var14; // L: 118
				var14 = Rasterizer3D.method4017(var10, var15, var7, var6); // L: 119
				var15 = Rasterizer3D.method4018(var10, var15, var7, var6); // L: 120
				var10 = var14; // L: 121
				var14 = Rasterizer3D.method4017(var12, var16, var7, var6); // L: 122
				var16 = Rasterizer3D.method4018(var12, var16, var7, var6); // L: 123
				UserComparator7.field1354 = (var14 + var10) / 2; // L: 125
				class21.field108 = (var11 + var13) / 2; // L: 126
				ViewportMouse.field2577 = (var15 + var16) / 2; // L: 127
				ViewportMouse.field2581 = (var14 - var10) / 2; // L: 128
				ViewportMouse.field2579 = (var13 - var11) / 2; // L: 129
				class124.field1520 = (var16 - var15) / 2; // L: 130
				HealthBar.field1251 = Math.abs(ViewportMouse.field2581); // L: 131
				AbstractUserComparator.field4268 = Math.abs(ViewportMouse.field2579); // L: 132
				TaskHandler.field1722 = Math.abs(class124.field1520); // L: 133
			}

			var4 = var0.xMid + var1; // L: 135
			var5 = var2 + var0.yMid; // L: 136
			var6 = var3 + var0.zMid; // L: 137
			var7 = var0.xMidOffset; // L: 138
			var15 = var0.yMidOffset; // L: 139
			var16 = var0.zMidOffset; // L: 140
			var10 = UserComparator7.field1354 - var4; // L: 141
			var11 = class21.field108 - var5; // L: 142
			var12 = ViewportMouse.field2577 - var6; // L: 143
			if (Math.abs(var10) > var7 + HealthBar.field1251) { // L: 144
				return false; // L: 145
			} else if (Math.abs(var11) > var15 + AbstractUserComparator.field4268) { // L: 147
				return false; // L: 148
			} else if (Math.abs(var12) > var16 + TaskHandler.field1722) { // L: 150
				return false; // L: 151
			} else if (Math.abs(var12 * ViewportMouse.field2579 - var11 * class124.field1520) > var16 * AbstractUserComparator.field4268 + var15 * TaskHandler.field1722) { // L: 153
				return false; // L: 154
			} else if (Math.abs(var10 * class124.field1520 - var12 * ViewportMouse.field2581) > var16 * HealthBar.field1251 + var7 * TaskHandler.field1722) { // L: 156
				return false; // L: 157
			} else {
				return Math.abs(var11 * ViewportMouse.field2581 - var10 * ViewportMouse.field2579) <= var15 * HealthBar.field1251 + var7 * AbstractUserComparator.field4268; // L: 159
			}
		}
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1385887599"
	)
	static boolean method3981() {
		return (Client.drawPlayerNames & 1) != 0; // L: 4434
	}
}
