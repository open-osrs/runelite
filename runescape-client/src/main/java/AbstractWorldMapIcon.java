import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("coord2")
	public final Coord coord2;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("coord1")
	public final Coord coord1;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1792317661
	)
	@Export("screenX")
	int screenX;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1102368635
	)
	@Export("screenY")
	int screenY;

	@ObfuscatedSignature(
		descriptor = "(Lkd;Lkd;)V"
	)
	AbstractWorldMapIcon(Coord var1, Coord var2) {
		this.coord1 = var1; // L: 13
		this.coord2 = var2; // L: 14
	} // L: 15

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	@Export("getElement")
	public abstract int getElement();

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Lip;",
		garbageValue = "1420245554"
	)
	@Export("getLabel")
	abstract WorldMapLabel getLabel();

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "102"
	)
	@Export("getSubWidth")
	abstract int getSubWidth();

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1663406998"
	)
	@Export("getSubHeight")
	abstract int getSubHeight();

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "2104661633"
	)
	@Export("fitsScreen")
	boolean fitsScreen(int var1, int var2) {
		if (this.elementFitsScreen(var1, var2)) { // L: 18
			return true;
		} else {
			return this.labelFitsScreen(var1, var2);
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1482741220"
	)
	@Export("hasValidElement")
	boolean hasValidElement() {
		return this.getElement() >= 0; // L: 33
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "19"
	)
	@Export("elementFitsScreen")
	boolean elementFitsScreen(int var1, int var2) {
		if (!this.hasValidElement()) {
			return false;
		} else {
			WorldMapElement var3 = class120.WorldMapElement_get(this.getElement());
			int var4 = this.getSubWidth();
			int var5 = this.getSubHeight();
			switch(var3.horizontalAlignment.value) {
			case 0:
				if (var1 >= this.screenX - var4 / 2 && var1 <= var4 / 2 + this.screenX) { // L: 54
					break;
				}

				return false;
			case 1:
				if (var1 >= this.screenX && var1 < var4 + this.screenX) {
					break;
				}

				return false;
			case 2:
				if (var1 <= this.screenX - var4 || var1 > this.screenX) {
					return false;
				}
			}

			switch(var3.verticalAlignment.value) {
			case 0:
				if (var2 > this.screenY - var5 && var2 <= this.screenY) {
					break;
				}

				return false;
			case 1:
				if (var2 >= this.screenY - var5 / 2 && var2 <= var5 / 2 + this.screenY) {
					break;
				}

				return false;
			case 2:
				if (var2 < this.screenY || var2 >= var5 + this.screenY) { // L: 61
					return false;
				}
			}

			return true; // L: 75
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "49"
	)
	@Export("labelFitsScreen")
	boolean labelFitsScreen(int var1, int var2) {
		WorldMapLabel var3 = this.getLabel();
		if (var3 == null) {
			return false;
		} else if (var1 >= this.screenX - var3.width / 2 && var1 <= var3.width / 2 + this.screenX) {
			return var2 >= this.screenY && var2 <= this.screenY + var3.height;
		} else {
			return false;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IILgw;Lgh;S)Z",
		garbageValue = "128"
	)
	public static final boolean method4863(int var0, int var1, RouteStrategy var2, CollisionMap var3) {
		int var4 = var0; // L: 19
		int var5 = var1; // L: 20
		byte var6 = 64; // L: 21
		byte var7 = 64; // L: 22
		int var8 = var0 - var6; // L: 23
		int var9 = var1 - var7; // L: 24
		class194.directions[var6][var7] = 99; // L: 25
		class194.distances[var6][var7] = 0; // L: 26
		byte var10 = 0; // L: 27
		int var11 = 0; // L: 28
		class194.bufferX[var10] = var0; // L: 29
		byte var10001 = var10;
		int var18 = var10 + 1;
		class194.bufferY[var10001] = var1; // L: 30
		int[][] var12 = var3.flags; // L: 31

		while (var18 != var11) { // L: 34
			var4 = class194.bufferX[var11]; // L: 35
			var5 = class194.bufferY[var11]; // L: 36
			var11 = var11 + 1 & 4095; // L: 37
			int var16 = var4 - var8; // L: 38
			int var17 = var5 - var9; // L: 39
			int var13 = var4 - var3.xInset; // L: 40
			int var14 = var5 - var3.yInset; // L: 41
			if (var2.hasArrived(1, var4, var5, var3)) { // L: 42
				Varps.field3348 = var4; // L: 43
				class194.field2255 = var5; // L: 44
				return true; // L: 45
			}

			int var15 = class194.distances[var16][var17] + 1; // L: 47
			if (var16 > 0 && class194.directions[var16 - 1][var17] == 0 && (var12[var13 - 1][var14] & 19136776) == 0) { // L: 48
				class194.bufferX[var18] = var4 - 1; // L: 49
				class194.bufferY[var18] = var5; // L: 50
				var18 = var18 + 1 & 4095; // L: 51
				class194.directions[var16 - 1][var17] = 2; // L: 52
				class194.distances[var16 - 1][var17] = var15; // L: 53
			}

			if (var16 < 127 && class194.directions[var16 + 1][var17] == 0 && (var12[var13 + 1][var14] & 19136896) == 0) { // L: 55
				class194.bufferX[var18] = var4 + 1; // L: 56
				class194.bufferY[var18] = var5; // L: 57
				var18 = var18 + 1 & 4095; // L: 58
				class194.directions[var16 + 1][var17] = 8; // L: 59
				class194.distances[var16 + 1][var17] = var15; // L: 60
			}

			if (var17 > 0 && class194.directions[var16][var17 - 1] == 0 && (var12[var13][var14 - 1] & 19136770) == 0) { // L: 62
				class194.bufferX[var18] = var4; // L: 63
				class194.bufferY[var18] = var5 - 1; // L: 64
				var18 = var18 + 1 & 4095; // L: 65
				class194.directions[var16][var17 - 1] = 1; // L: 66
				class194.distances[var16][var17 - 1] = var15; // L: 67
			}

			if (var17 < 127 && class194.directions[var16][var17 + 1] == 0 && (var12[var13][var14 + 1] & 19136800) == 0) { // L: 69
				class194.bufferX[var18] = var4; // L: 70
				class194.bufferY[var18] = var5 + 1; // L: 71
				var18 = var18 + 1 & 4095; // L: 72
				class194.directions[var16][var17 + 1] = 4; // L: 73
				class194.distances[var16][var17 + 1] = var15; // L: 74
			}

			if (var16 > 0 && var17 > 0 && class194.directions[var16 - 1][var17 - 1] == 0 && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13 - 1][var14] & 19136776) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) { // L: 76
				class194.bufferX[var18] = var4 - 1; // L: 77
				class194.bufferY[var18] = var5 - 1; // L: 78
				var18 = var18 + 1 & 4095; // L: 79
				class194.directions[var16 - 1][var17 - 1] = 3; // L: 80
				class194.distances[var16 - 1][var17 - 1] = var15; // L: 81
			}

			if (var16 < 127 && var17 > 0 && class194.directions[var16 + 1][var17 - 1] == 0 && (var12[var13 + 1][var14 - 1] & 19136899) == 0 && (var12[var13 + 1][var14] & 19136896) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) { // L: 83
				class194.bufferX[var18] = var4 + 1; // L: 84
				class194.bufferY[var18] = var5 - 1; // L: 85
				var18 = var18 + 1 & 4095; // L: 86
				class194.directions[var16 + 1][var17 - 1] = 9; // L: 87
				class194.distances[var16 + 1][var17 - 1] = var15; // L: 88
			}

			if (var16 > 0 && var17 < 127 && class194.directions[var16 - 1][var17 + 1] == 0 && (var12[var13 - 1][var14 + 1] & 19136824) == 0 && (var12[var13 - 1][var14] & 19136776) == 0 && (var12[var13][var14 + 1] & 19136800) == 0) { // L: 90
				class194.bufferX[var18] = var4 - 1; // L: 91
				class194.bufferY[var18] = var5 + 1; // L: 92
				var18 = var18 + 1 & 4095; // L: 93
				class194.directions[var16 - 1][var17 + 1] = 6; // L: 94
				class194.distances[var16 - 1][var17 + 1] = var15; // L: 95
			}

			if (var16 < 127 && var17 < 127 && class194.directions[var16 + 1][var17 + 1] == 0 && (var12[var13 + 1][var14 + 1] & 19136992) == 0 && (var12[var13 + 1][var14] & 19136896) == 0 && (var12[var13][var14 + 1] & 19136800) == 0) { // L: 97
				class194.bufferX[var18] = var4 + 1; // L: 98
				class194.bufferY[var18] = var5 + 1; // L: 99
				var18 = var18 + 1 & 4095; // L: 100
				class194.directions[var16 + 1][var17 + 1] = 12; // L: 101
				class194.distances[var16 + 1][var17 + 1] = var15; // L: 102
			}
		}

		Varps.field3348 = var4; // L: 105
		class194.field2255 = var5; // L: 106
		return false; // L: 107
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-94279171"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) { // L: 5460
			int var3 = class202.getTileHeight(var0, var1, class128.Client_plane) - var2; // L: 5465
			var0 -= class343.cameraX; // L: 5466
			var3 -= class295.cameraY; // L: 5467
			var1 -= FaceNormal.cameraZ; // L: 5468
			int var4 = Rasterizer3D.Rasterizer3D_sine[GameEngine.cameraPitch]; // L: 5469
			int var5 = Rasterizer3D.Rasterizer3D_cosine[GameEngine.cameraPitch]; // L: 5470
			int var6 = Rasterizer3D.Rasterizer3D_sine[StudioGame.cameraYaw]; // L: 5471
			int var7 = Rasterizer3D.Rasterizer3D_cosine[StudioGame.cameraYaw]; // L: 5472
			int var8 = var6 * var1 + var0 * var7 >> 16; // L: 5473
			var1 = var7 * var1 - var0 * var6 >> 16; // L: 5474
			var0 = var8; // L: 5475
			var8 = var5 * var3 - var4 * var1 >> 16; // L: 5476
			var1 = var5 * var1 + var3 * var4 >> 16; // L: 5477
			if (var1 >= 50) { // L: 5479
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2; // L: 5480
				Client.viewportTempY = var8 * Client.viewportZoom / var1 + Client.viewportHeight / 2; // L: 5481
			} else {
				Client.viewportTempX = -1; // L: 5484
				Client.viewportTempY = -1; // L: 5485
			}

		} else {
			Client.viewportTempX = -1; // L: 5461
			Client.viewportTempY = -1; // L: 5462
		}
	} // L: 5463 5487
}
