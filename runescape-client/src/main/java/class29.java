import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("am")
public class class29 {
	@ObfuscatedName("v")
	static Applet field176;
	@ObfuscatedName("c")
	static String field175;
	@ObfuscatedName("ha")
	@ObfuscatedGetter(
		intValue = 1188608561
	)
	static int field181;
	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "[Lqq;"
	)
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;

	static {
		field176 = null; // L: 10
		field175 = ""; // L: 11
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IILgt;Lgv;B)Z",
		garbageValue = "0"
	)
	public static final boolean method404(int var0, int var1, RouteStrategy var2, CollisionMap var3) {
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
				HealthBarUpdate.field1189 = var4; // L: 43
				StructComposition.field1988 = var5; // L: 44
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

		HealthBarUpdate.field1189 = var4; // L: 105
		StructComposition.field1988 = var5; // L: 106
		return false; // L: 107
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "28"
	)
	@Export("Widget_resetModelFrames")
	static final void Widget_resetModelFrames(int var0) {
		if (class155.loadInterface(var0)) { // L: 11925
			Widget[] var1 = Widget.Widget_interfaceComponents[var0]; // L: 11926

			for (int var2 = 0; var2 < var1.length; ++var2) { // L: 11927
				Widget var3 = var1[var2]; // L: 11928
				if (var3 != null) { // L: 11929
					var3.modelFrame = 0; // L: 11930
					var3.modelFrameCycle = 0; // L: 11931
				}
			}

		}
	} // L: 11933

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1249255220"
	)
	static void method403(int var0) {
		for (IntegerNode var1 = (IntegerNode)Client.widgetFlags.first(); var1 != null; var1 = (IntegerNode)Client.widgetFlags.next()) { // L: 12449
			if ((long)var0 == (var1.key >> 48 & 65535L)) { // L: 12450
				var1.remove(); // L: 12451
			}
		}

	} // L: 12454
}
