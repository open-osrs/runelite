import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
@Implements("Clock")
public abstract class Clock {
	Clock() {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "18"
	)
	@Export("mark")
	public abstract void mark();

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "293215312"
	)
	@Export("wait")
	public abstract int wait(int var1, int var2);

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IILgv;Lgf;I)Z",
		garbageValue = "-1365814358"
	)
	public static final boolean method3132(int var0, int var1, RouteStrategy var2, CollisionMap var3) {
		int var4 = var0;
		int var5 = var1;
		byte var6 = 64;
		byte var7 = 64;
		int var8 = var0 - var6;
		int var9 = var1 - var7;
		class186.directions[var6][var7] = 99;
		class186.distances[var6][var7] = 0;
		byte var10 = 0;
		int var11 = 0;
		class186.bufferX[var10] = var0;
		byte var10001 = var10;
		int var18 = var10 + 1;
		class186.bufferY[var10001] = var1;
		int[][] var12 = var3.flags;

		while (var18 != var11) {
			var4 = class186.bufferX[var11];
			var5 = class186.bufferY[var11];
			var11 = var11 + 1 & 4095;
			int var16 = var4 - var8;
			int var17 = var5 - var9;
			int var13 = var4 - var3.xInset;
			int var14 = var5 - var3.yInset;
			if (var2.hasArrived(2, var4, var5, var3)) {
				class186.field2129 = var4;
				class186.field2130 = var5;
				return true;
			}

			int var15 = class186.distances[var16][var17] + 1;
			if (var16 > 0 && class186.directions[var16 - 1][var17] == 0 && (var12[var13 - 1][var14] & 19136782) == 0 && (var12[var13 - 1][var14 + 1] & 19136824) == 0) {
				class186.bufferX[var18] = var4 - 1;
				class186.bufferY[var18] = var5;
				var18 = var18 + 1 & 4095;
				class186.directions[var16 - 1][var17] = 2;
				class186.distances[var16 - 1][var17] = var15;
			}

			if (var16 < 126 && class186.directions[var16 + 1][var17] == 0 && (var12[var13 + 2][var14] & 19136899) == 0 && (var12[var13 + 2][var14 + 1] & 19136992) == 0) {
				class186.bufferX[var18] = var4 + 1;
				class186.bufferY[var18] = var5;
				var18 = var18 + 1 & 4095;
				class186.directions[var16 + 1][var17] = 8;
				class186.distances[var16 + 1][var17] = var15;
			}

			if (var17 > 0 && class186.directions[var16][var17 - 1] == 0 && (var12[var13][var14 - 1] & 19136782) == 0 && (var12[var13 + 1][var14 - 1] & 19136899) == 0) {
				class186.bufferX[var18] = var4;
				class186.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class186.directions[var16][var17 - 1] = 1;
				class186.distances[var16][var17 - 1] = var15;
			}

			if (var17 < 126 && class186.directions[var16][var17 + 1] == 0 && (var12[var13][var14 + 2] & 19136824) == 0 && (var12[var13 + 1][var14 + 2] & 19136992) == 0) {
				class186.bufferX[var18] = var4;
				class186.bufferY[var18] = var5 + 1;
				var18 = var18 + 1 & 4095;
				class186.directions[var16][var17 + 1] = 4;
				class186.distances[var16][var17 + 1] = var15;
			}

			if (var16 > 0 && var17 > 0 && class186.directions[var16 - 1][var17 - 1] == 0 && (var12[var13 - 1][var14] & 19136830) == 0 && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13][var14 - 1] & 19136911) == 0) {
				class186.bufferX[var18] = var4 - 1;
				class186.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class186.directions[var16 - 1][var17 - 1] = 3;
				class186.distances[var16 - 1][var17 - 1] = var15;
			}

			if (var16 < 126 && var17 > 0 && class186.directions[var16 + 1][var17 - 1] == 0 && (var12[var13 + 1][var14 - 1] & 19136911) == 0 && (var12[var13 + 2][var14 - 1] & 19136899) == 0 && (var12[var13 + 2][var14] & 19136995) == 0) {
				class186.bufferX[var18] = var4 + 1;
				class186.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class186.directions[var16 + 1][var17 - 1] = 9;
				class186.distances[var16 + 1][var17 - 1] = var15;
			}

			if (var16 > 0 && var17 < 126 && class186.directions[var16 - 1][var17 + 1] == 0 && (var12[var13 - 1][var14 + 1] & 19136830) == 0 && (var12[var13 - 1][var14 + 2] & 19136824) == 0 && (var12[var13][var14 + 2] & 19137016) == 0) {
				class186.bufferX[var18] = var4 - 1;
				class186.bufferY[var18] = var5 + 1;
				var18 = var18 + 1 & 4095;
				class186.directions[var16 - 1][var17 + 1] = 6;
				class186.distances[var16 - 1][var17 + 1] = var15;
			}

			if (var16 < 126 && var17 < 126 && class186.directions[var16 + 1][var17 + 1] == 0 && (var12[var13 + 1][var14 + 2] & 19137016) == 0 && (var12[var13 + 2][var14 + 2] & 19136992) == 0 && (var12[var13 + 2][var14 + 1] & 19136995) == 0) {
				class186.bufferX[var18] = var4 + 1;
				class186.bufferY[var18] = var5 + 1;
				var18 = var18 + 1 & 4095;
				class186.directions[var16 + 1][var17 + 1] = 12;
				class186.distances[var16 + 1][var17 + 1] = var15;
			}
		}

		class186.field2129 = var4;
		class186.field2130 = var5;
		return false;
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1758808964"
	)
	static void method3144() {
		MouseHandler.method646(GameObject.menuWidth / 2 + ModeWhere.menuX, BufferedSink.menuY);
	}
}
