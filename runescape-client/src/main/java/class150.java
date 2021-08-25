import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("es")
public class class150 {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1233262383
	)
	static int field1601;
	@ObfuscatedName("m")
	public short[] field1600;
	@ObfuscatedName("k")
	public short[] field1599;

	public class150(int var1) {
		ItemComposition var2 = class65.ItemDefinition_get(var1);
		if (var2.method3216()) {
			this.field1600 = new short[var2.recolorTo.length];
			System.arraycopy(var2.recolorTo, 0, this.field1600, 0, this.field1600.length);
		}

		if (var2.method3179()) {
			this.field1599 = new short[var2.retextureTo.length];
			System.arraycopy(var2.retextureTo, 0, this.field1599, 0, this.field1599.length);
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IILfw;Lfk;I)Z",
		garbageValue = "-1283265746"
	)
	static final boolean method2806(int var0, int var1, RouteStrategy var2, CollisionMap var3) {
		int var4 = var0;
		int var5 = var1;
		byte var6 = 64;
		byte var7 = 64;
		int var8 = var0 - var6;
		int var9 = var1 - var7;
		class174.directions[var6][var7] = 99;
		class174.distances[var6][var7] = 0;
		byte var10 = 0;
		int var11 = 0;
		class174.bufferX[var10] = var0;
		byte var10001 = var10;
		int var18 = var10 + 1;
		class174.bufferY[var10001] = var1;
		int[][] var12 = var3.flags;

		while (var18 != var11) {
			var4 = class174.bufferX[var11];
			var5 = class174.bufferY[var11];
			var11 = var11 + 1 & 4095;
			int var16 = var4 - var8;
			int var17 = var5 - var9;
			int var13 = var4 - var3.xInset;
			int var14 = var5 - var3.yInset;
			if (var2.hasArrived(2, var4, var5, var3)) {
				field1601 = var4;
				class174.field1991 = var5;
				return true;
			}

			int var15 = class174.distances[var16][var17] + 1;
			if (var16 > 0 && class174.directions[var16 - 1][var17] == 0 && (var12[var13 - 1][var14] & 19136782) == 0 && (var12[var13 - 1][var14 + 1] & 19136824) == 0) {
				class174.bufferX[var18] = var4 - 1;
				class174.bufferY[var18] = var5;
				var18 = var18 + 1 & 4095;
				class174.directions[var16 - 1][var17] = 2;
				class174.distances[var16 - 1][var17] = var15;
			}

			if (var16 < 126 && class174.directions[var16 + 1][var17] == 0 && (var12[var13 + 2][var14] & 19136899) == 0 && (var12[var13 + 2][var14 + 1] & 19136992) == 0) {
				class174.bufferX[var18] = var4 + 1;
				class174.bufferY[var18] = var5;
				var18 = var18 + 1 & 4095;
				class174.directions[var16 + 1][var17] = 8;
				class174.distances[var16 + 1][var17] = var15;
			}

			if (var17 > 0 && class174.directions[var16][var17 - 1] == 0 && (var12[var13][var14 - 1] & 19136782) == 0 && (var12[var13 + 1][var14 - 1] & 19136899) == 0) {
				class174.bufferX[var18] = var4;
				class174.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class174.directions[var16][var17 - 1] = 1;
				class174.distances[var16][var17 - 1] = var15;
			}

			if (var17 < 126 && class174.directions[var16][var17 + 1] == 0 && (var12[var13][var14 + 2] & 19136824) == 0 && (var12[var13 + 1][var14 + 2] & 19136992) == 0) {
				class174.bufferX[var18] = var4;
				class174.bufferY[var18] = var5 + 1;
				var18 = var18 + 1 & 4095;
				class174.directions[var16][var17 + 1] = 4;
				class174.distances[var16][var17 + 1] = var15;
			}

			if (var16 > 0 && var17 > 0 && class174.directions[var16 - 1][var17 - 1] == 0 && (var12[var13 - 1][var14] & 19136830) == 0 && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13][var14 - 1] & 19136911) == 0) {
				class174.bufferX[var18] = var4 - 1;
				class174.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class174.directions[var16 - 1][var17 - 1] = 3;
				class174.distances[var16 - 1][var17 - 1] = var15;
			}

			if (var16 < 126 && var17 > 0 && class174.directions[var16 + 1][var17 - 1] == 0 && (var12[var13 + 1][var14 - 1] & 19136911) == 0 && (var12[var13 + 2][var14 - 1] & 19136899) == 0 && (var12[var13 + 2][var14] & 19136995) == 0) {
				class174.bufferX[var18] = var4 + 1;
				class174.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class174.directions[var16 + 1][var17 - 1] = 9;
				class174.distances[var16 + 1][var17 - 1] = var15;
			}

			if (var16 > 0 && var17 < 126 && class174.directions[var16 - 1][var17 + 1] == 0 && (var12[var13 - 1][var14 + 1] & 19136830) == 0 && (var12[var13 - 1][var14 + 2] & 19136824) == 0 && (var12[var13][var14 + 2] & 19137016) == 0) {
				class174.bufferX[var18] = var4 - 1;
				class174.bufferY[var18] = var5 + 1;
				var18 = var18 + 1 & 4095;
				class174.directions[var16 - 1][var17 + 1] = 6;
				class174.distances[var16 - 1][var17 + 1] = var15;
			}

			if (var16 < 126 && var17 < 126 && class174.directions[var16 + 1][var17 + 1] == 0 && (var12[var13 + 1][var14 + 2] & 19137016) == 0 && (var12[var13 + 2][var14 + 2] & 19136992) == 0 && (var12[var13 + 2][var14 + 1] & 19136995) == 0) {
				class174.bufferX[var18] = var4 + 1;
				class174.bufferY[var18] = var5 + 1;
				var18 = var18 + 1 & 4095;
				class174.directions[var16 + 1][var17 + 1] = 12;
				class174.distances[var16 + 1][var17 + 1] = var15;
			}
		}

		field1601 = var4;
		class174.field1991 = var5;
		return false;
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(Ljd;IIIIIIB)V",
		garbageValue = "23"
	)
	static final void method2805(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field555) {
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0;
		}

		Client.field555 = false;
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !Script.mouseCam && MouseHandler.MouseHandler_currentButton == 4) {
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
				var0.scrollY -= 4;
				Actor.invalidateWidget(var0);
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
				var0.scrollY += 4;
				Actor.invalidateWidget(var0);
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
				var7 = var3 * (var3 - 32) / var4;
				if (var7 < 8) {
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2;
				int var9 = var3 - 32 - var7;
				var0.scrollY = var8 * (var4 - var3) / var9;
				Actor.invalidateWidget(var0);
				Client.field555 = true;
			}
		}

		if (Client.mouseWheelRotation != 0) {
			var7 = var0.width;
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
				var0.scrollY += Client.mouseWheelRotation * 45;
				Actor.invalidateWidget(var0);
			}
		}

	}
}
