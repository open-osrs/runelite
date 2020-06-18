import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("q")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;
	@ObfuscatedName("j")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("p")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("g")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("n")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("a")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1436904999
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "[Lbp;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("k")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("r")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("v")
	static boolean field1125;
	@ObfuscatedName("d")
	static boolean field1118;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 544842363
	)
	static int field1132;
	@ObfuscatedName("b")
	static final double field1126;

	static {
		Interpreter_arrayLengths = new int[5];
		Interpreter_arrays = new int[5][5000];
		Interpreter_intStack = new int[1000];
		Interpreter_stringStack = new String[1000];
		Interpreter_frameDepth = 0;
		Interpreter_frames = new ScriptFrame[50];
		Interpreter_calendar = java.util.Calendar.getInstance();
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		field1125 = false;
		field1118 = false;
		field1132 = 0;
		field1126 = Math.log(2.0D);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(IILga;Lfz;S)Z",
		garbageValue = "-8766"
	)
	static final boolean method2112(int var0, int var1, RouteStrategy var2, CollisionMap var3) {
		int var4 = var0;
		int var5 = var1;
		byte var6 = 64;
		byte var7 = 64;
		int var8 = var0 - var6;
		int var9 = var1 - var7;
		class182.directions[var6][var7] = 99;
		class182.distances[var6][var7] = 0;
		byte var10 = 0;
		int var11 = 0;
		class182.bufferX[var10] = var0;
		byte var10001 = var10;
		int var18 = var10 + 1;
		class182.bufferY[var10001] = var1;
		int[][] var12 = var3.flags;

		while (var11 != var18) {
			var4 = class182.bufferX[var11];
			var5 = class182.bufferY[var11];
			var11 = var11 + 1 & 4095;
			int var16 = var4 - var8;
			int var17 = var5 - var9;
			int var13 = var4 - var3.xInset;
			int var14 = var5 - var3.yInset;
			if (var2.hasArrived(1, var4, var5, var3)) {
				class182.field2132 = var4;
				GrandExchangeOfferOwnWorldComparator.field666 = var5;
				return true;
			}

			int var15 = class182.distances[var16][var17] + 1;
			if (var16 > 0 && class182.directions[var16 - 1][var17] == 0 && (var12[var13 - 1][var14] & 19136776) == 0) {
				class182.bufferX[var18] = var4 - 1;
				class182.bufferY[var18] = var5;
				var18 = var18 + 1 & 4095;
				class182.directions[var16 - 1][var17] = 2;
				class182.distances[var16 - 1][var17] = var15;
			}

			if (var16 < 127 && class182.directions[var16 + 1][var17] == 0 && (var12[var13 + 1][var14] & 19136896) == 0) {
				class182.bufferX[var18] = var4 + 1;
				class182.bufferY[var18] = var5;
				var18 = var18 + 1 & 4095;
				class182.directions[var16 + 1][var17] = 8;
				class182.distances[var16 + 1][var17] = var15;
			}

			if (var17 > 0 && class182.directions[var16][var17 - 1] == 0 && (var12[var13][var14 - 1] & 19136770) == 0) {
				class182.bufferX[var18] = var4;
				class182.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class182.directions[var16][var17 - 1] = 1;
				class182.distances[var16][var17 - 1] = var15;
			}

			if (var17 < 127 && class182.directions[var16][var17 + 1] == 0 && (var12[var13][var14 + 1] & 19136800) == 0) {
				class182.bufferX[var18] = var4;
				class182.bufferY[var18] = var5 + 1;
				var18 = var18 + 1 & 4095;
				class182.directions[var16][var17 + 1] = 4;
				class182.distances[var16][var17 + 1] = var15;
			}

			if (var16 > 0 && var17 > 0 && class182.directions[var16 - 1][var17 - 1] == 0 && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13 - 1][var14] & 19136776) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) {
				class182.bufferX[var18] = var4 - 1;
				class182.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class182.directions[var16 - 1][var17 - 1] = 3;
				class182.distances[var16 - 1][var17 - 1] = var15;
			}

			if (var16 < 127 && var17 > 0 && class182.directions[var16 + 1][var17 - 1] == 0 && (var12[var13 + 1][var14 - 1] & 19136899) == 0 && (var12[var13 + 1][var14] & 19136896) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) {
				class182.bufferX[var18] = var4 + 1;
				class182.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class182.directions[var16 + 1][var17 - 1] = 9;
				class182.distances[var16 + 1][var17 - 1] = var15;
			}

			if (var16 > 0 && var17 < 127 && class182.directions[var16 - 1][var17 + 1] == 0 && (var12[var13 - 1][var14 + 1] & 19136824) == 0 && (var12[var13 - 1][var14] & 19136776) == 0 && (var12[var13][var14 + 1] & 19136800) == 0) {
				class182.bufferX[var18] = var4 - 1;
				class182.bufferY[var18] = var5 + 1;
				var18 = var18 + 1 & 4095;
				class182.directions[var16 - 1][var17 + 1] = 6;
				class182.distances[var16 - 1][var17 + 1] = var15;
			}

			if (var16 < 127 && var17 < 127 && class182.directions[var16 + 1][var17 + 1] == 0 && (var12[var13 + 1][var14 + 1] & 19136992) == 0 && (var12[var13 + 1][var14] & 19136896) == 0 && (var12[var13][var14 + 1] & 19136800) == 0) {
				class182.bufferX[var18] = var4 + 1;
				class182.bufferY[var18] = var5 + 1;
				var18 = var18 + 1 & 4095;
				class182.directions[var16 + 1][var17 + 1] = 12;
				class182.distances[var16 + 1][var17 + 1] = var15;
			}
		}

		class182.field2132 = var4;
		GrandExchangeOfferOwnWorldComparator.field666 = var5;
		return false;
	}
}
