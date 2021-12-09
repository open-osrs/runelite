import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
@Implements("Clock")
public abstract class Clock {
	Clock() {
	} // L: 4

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
		int var4 = var0; // L: 19
		int var5 = var1; // L: 20
		byte var6 = 64; // L: 21
		byte var7 = 64; // L: 22
		int var8 = var0 - var6; // L: 23
		int var9 = var1 - var7; // L: 24
		class186.directions[var6][var7] = 99; // L: 25
		class186.distances[var6][var7] = 0; // L: 26
		byte var10 = 0; // L: 27
		int var11 = 0; // L: 28
		class186.bufferX[var10] = var0; // L: 29
		byte var10001 = var10;
		int var18 = var10 + 1;
		class186.bufferY[var10001] = var1; // L: 30
		int[][] var12 = var3.flags; // L: 31

		while (var18 != var11) { // L: 32
			var4 = class186.bufferX[var11]; // L: 33
			var5 = class186.bufferY[var11]; // L: 34
			var11 = var11 + 1 & 4095; // L: 35
			int var16 = var4 - var8; // L: 36
			int var17 = var5 - var9; // L: 37
			int var13 = var4 - var3.xInset; // L: 38
			int var14 = var5 - var3.yInset; // L: 39
			if (var2.hasArrived(2, var4, var5, var3)) { // L: 40
				class186.field2129 = var4; // L: 41
				class186.field2130 = var5; // L: 42
				return true; // L: 43
			}

			int var15 = class186.distances[var16][var17] + 1; // L: 45
			if (var16 > 0 && class186.directions[var16 - 1][var17] == 0 && (var12[var13 - 1][var14] & 19136782) == 0 && (var12[var13 - 1][var14 + 1] & 19136824) == 0) { // L: 46 47 48 49
				class186.bufferX[var18] = var4 - 1; // L: 50
				class186.bufferY[var18] = var5; // L: 51
				var18 = var18 + 1 & 4095; // L: 52
				class186.directions[var16 - 1][var17] = 2; // L: 53
				class186.distances[var16 - 1][var17] = var15; // L: 54
			}

			if (var16 < 126 && class186.directions[var16 + 1][var17] == 0 && (var12[var13 + 2][var14] & 19136899) == 0 && (var12[var13 + 2][var14 + 1] & 19136992) == 0) { // L: 56 57 58 59
				class186.bufferX[var18] = var4 + 1; // L: 60
				class186.bufferY[var18] = var5; // L: 61
				var18 = var18 + 1 & 4095; // L: 62
				class186.directions[var16 + 1][var17] = 8; // L: 63
				class186.distances[var16 + 1][var17] = var15; // L: 64
			}

			if (var17 > 0 && class186.directions[var16][var17 - 1] == 0 && (var12[var13][var14 - 1] & 19136782) == 0 && (var12[var13 + 1][var14 - 1] & 19136899) == 0) { // L: 66 67 68 69
				class186.bufferX[var18] = var4; // L: 70
				class186.bufferY[var18] = var5 - 1; // L: 71
				var18 = var18 + 1 & 4095; // L: 72
				class186.directions[var16][var17 - 1] = 1; // L: 73
				class186.distances[var16][var17 - 1] = var15; // L: 74
			}

			if (var17 < 126 && class186.directions[var16][var17 + 1] == 0 && (var12[var13][var14 + 2] & 19136824) == 0 && (var12[var13 + 1][var14 + 2] & 19136992) == 0) { // L: 76 77 78 79
				class186.bufferX[var18] = var4; // L: 80
				class186.bufferY[var18] = var5 + 1; // L: 81
				var18 = var18 + 1 & 4095; // L: 82
				class186.directions[var16][var17 + 1] = 4; // L: 83
				class186.distances[var16][var17 + 1] = var15; // L: 84
			}

			if (var16 > 0 && var17 > 0 && class186.directions[var16 - 1][var17 - 1] == 0 && (var12[var13 - 1][var14] & 19136830) == 0 && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13][var14 - 1] & 19136911) == 0) { // L: 86 87 88 89 90
				class186.bufferX[var18] = var4 - 1; // L: 91
				class186.bufferY[var18] = var5 - 1; // L: 92
				var18 = var18 + 1 & 4095; // L: 93
				class186.directions[var16 - 1][var17 - 1] = 3; // L: 94
				class186.distances[var16 - 1][var17 - 1] = var15; // L: 95
			}

			if (var16 < 126 && var17 > 0 && class186.directions[var16 + 1][var17 - 1] == 0 && (var12[var13 + 1][var14 - 1] & 19136911) == 0 && (var12[var13 + 2][var14 - 1] & 19136899) == 0 && (var12[var13 + 2][var14] & 19136995) == 0) { // L: 97 98 99 100 101
				class186.bufferX[var18] = var4 + 1; // L: 102
				class186.bufferY[var18] = var5 - 1; // L: 103
				var18 = var18 + 1 & 4095; // L: 104
				class186.directions[var16 + 1][var17 - 1] = 9; // L: 105
				class186.distances[var16 + 1][var17 - 1] = var15; // L: 106
			}

			if (var16 > 0 && var17 < 126 && class186.directions[var16 - 1][var17 + 1] == 0 && (var12[var13 - 1][var14 + 1] & 19136830) == 0 && (var12[var13 - 1][var14 + 2] & 19136824) == 0 && (var12[var13][var14 + 2] & 19137016) == 0) { // L: 108 109 110 111 112
				class186.bufferX[var18] = var4 - 1; // L: 113
				class186.bufferY[var18] = var5 + 1; // L: 114
				var18 = var18 + 1 & 4095; // L: 115
				class186.directions[var16 - 1][var17 + 1] = 6; // L: 116
				class186.distances[var16 - 1][var17 + 1] = var15; // L: 117
			}

			if (var16 < 126 && var17 < 126 && class186.directions[var16 + 1][var17 + 1] == 0 && (var12[var13 + 1][var14 + 2] & 19137016) == 0 && (var12[var13 + 2][var14 + 2] & 19136992) == 0 && (var12[var13 + 2][var14 + 1] & 19136995) == 0) { // L: 119 120 121 122 123
				class186.bufferX[var18] = var4 + 1; // L: 124
				class186.bufferY[var18] = var5 + 1; // L: 125
				var18 = var18 + 1 & 4095; // L: 126
				class186.directions[var16 + 1][var17 + 1] = 12; // L: 127
				class186.distances[var16 + 1][var17 + 1] = var15; // L: 128
			}
		}

		class186.field2129 = var4; // L: 131
		class186.field2130 = var5; // L: 132
		return false; // L: 133
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1758808964"
	)
	static void method3144() {
		MouseHandler.method646(GameObject.menuWidth / 2 + ModeWhere.menuX, BufferedSink.menuY); // L: 8970
	} // L: 8971
}
