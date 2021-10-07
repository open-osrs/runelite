import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("d")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("hx")
	@Export("regionMapArchiveIds")
	static int[] regionMapArchiveIds;
	@ObfuscatedName("io")
	@ObfuscatedGetter(
		intValue = -1379782225
	)
	@Export("cameraX")
	static int cameraX;
	@ObfuscatedName("l")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1;
	}

	public final void update(Graphics var1) {
		this.component.update(var1);
	}

	public final void paint(Graphics var1) {
		this.component.paint(var1);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IILfw;Lfy;I)Z",
		garbageValue = "-37817578"
	)
	public static final boolean method381(int var0, int var1, RouteStrategy var2, CollisionMap var3) {
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
				class318.field3870 = var4;
				class174.field1994 = var5;
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

		class318.field3870 = var4;
		class174.field1994 = var5;
		return false;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1980998200"
	)
	public static int method374(int var0, int var1, int var2) {
		var2 &= 3;
		if (var2 == 0) {
			return var1;
		} else if (var2 == 1) {
			return 7 - var0;
		} else {
			return var2 == 2 ? 7 - var1 : var0;
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Lbc;",
		garbageValue = "154215174"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0;
		return AttackOption.getNextWorldListWorld();
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "1354810212"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (GrandExchangeOfferTotalQuantityComparator.loadInterface(var0)) {
			ReflectionCheck.field452 = null;
			ArchiveLoader.drawInterface(Widget.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7);
			if (ReflectionCheck.field452 != null) {
				ArchiveLoader.drawInterface(ReflectionCheck.field452, -1412584499, var1, var2, var3, var4, Script.field954, UserComparator3.field1338, var7);
				ReflectionCheck.field452 = null;
			}

		} else {
			if (var7 != -1) {
				Client.field710[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) {
					Client.field710[var8] = true;
				}
			}

		}
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(IIIZB)V",
		garbageValue = "-34"
	)
	static final void method380(int var0, int var1, int var2, boolean var3) {
		if (GrandExchangeOfferTotalQuantityComparator.loadInterface(var0)) {
			WorldMapSection1.resizeInterface(Widget.Widget_interfaceComponents[var0], -1, var1, var2, var3);
		}
	}
}
