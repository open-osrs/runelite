import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("do")
public class class119 implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	static final class119 field1457;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	static final class119 field1454;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	static final class119 field1455;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	static final class119 field1456;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	static final class119 field1471;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	static final class119 field1458;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	static final class119 field1459;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	static final class119 field1453;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	static final class119 field1465;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	static final class119 field1468;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	static final class119 field1463;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	static final class119 field1464;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	static final class119 field1462;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	static final class119 field1466;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	static final class119 field1467;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	static final class119 field1460;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	static final class119 field1469;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1186456071
	)
	final int field1470;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 978299269
	)
	final int field1461;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1956996321
	)
	final int field1472;

	static {
		field1457 = new class119(0, 0, (String)null, -1, -1); // L: 42
		field1454 = new class119(1, 1, (String)null, 0, 2); // L: 43
		field1455 = new class119(2, 2, (String)null, 1, 2); // L: 44
		field1456 = new class119(3, 3, (String)null, 2, 2); // L: 45
		field1471 = new class119(4, 4, (String)null, 3, 1); // L: 46
		field1458 = new class119(5, 5, (String)null, 4, 1); // L: 47
		field1459 = new class119(6, 6, (String)null, 5, 1); // L: 48
		field1453 = new class119(7, 7, (String)null, 6, 3); // L: 49
		field1465 = new class119(8, 8, (String)null, 7, 3); // L: 50
		field1468 = new class119(9, 9, (String)null, 8, 3); // L: 51
		field1463 = new class119(10, 10, (String)null, 0, 7); // L: 52
		field1464 = new class119(11, 11, (String)null, 1, 7); // L: 53
		field1462 = new class119(12, 12, (String)null, 2, 7); // L: 54
		field1466 = new class119(13, 13, (String)null, 3, 7); // L: 55
		field1467 = new class119(14, 14, (String)null, 4, 7); // L: 56
		field1460 = new class119(15, 15, (String)null, 5, 7); // L: 57
		field1469 = new class119(16, 16, (String)null, 0, 5); // L: 58
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;II)V",
		garbageValue = "-1"
	)
	class119(int var1, int var2, String var3, int var4, int var5) {
		this.field1470 = var1; // L: 68
		this.field1461 = var2; // L: 69
		this.field1472 = var4; // L: 70
	} // L: 71

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "15"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1461; // L: 74
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "923796459"
	)
	int method2751() {
		return this.field1472; // L: 78
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ILbo;ZI)I",
		garbageValue = "-317596811"
	)
	static int method2741(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) { // L: 2124
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = Client.cycle; // L: 2125
			return 1; // L: 2126
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) { // L: 2128
				class295.Interpreter_intStackSize -= 2; // L: 2129
				var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 2130
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 2131
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = SceneTilePaint.method4500(var3, var4); // L: 2132
				return 1; // L: 2133
			} else if (var0 == ScriptOpcodes.INV_GETNUM) { // L: 2135
				class295.Interpreter_intStackSize -= 2; // L: 2136
				var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 2137
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 2138
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = HealthBarUpdate.ItemContainer_getCount(var3, var4); // L: 2139
				return 1; // L: 2140
			} else if (var0 == ScriptOpcodes.INV_TOTAL) { // L: 2142
				class295.Interpreter_intStackSize -= 2; // L: 2143
				var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 2144
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 2145
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = Login.method1883(var3, var4); // L: 2146
				return 1; // L: 2147
			} else if (var0 == ScriptOpcodes.INV_SIZE) { // L: 2149
				var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 2150
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = class12.getInvDefinition(var3).size; // L: 2151
				return 1; // L: 2152
			} else if (var0 == ScriptOpcodes.STAT) { // L: 2154
				var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 2155
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = Client.currentLevels[var3]; // L: 2156
				return 1; // L: 2157
			} else if (var0 == ScriptOpcodes.STAT_BASE) { // L: 2159
				var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 2160
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = Client.levels[var3]; // L: 2161
				return 1; // L: 2162
			} else if (var0 == ScriptOpcodes.STAT_XP) { // L: 2164
				var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 2165
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = Client.experience[var3]; // L: 2166
				return 1; // L: 2167
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) { // L: 2169
					var3 = class160.Client_plane; // L: 2170
					var4 = (class19.localPlayer.x >> 7) + ApproximateRouteStrategy.baseX; // L: 2171
					var5 = (class19.localPlayer.y >> 7) + class250.baseY; // L: 2172
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28); // L: 2173
					return 1; // L: 2174
				} else if (var0 == ScriptOpcodes.COORDX) { // L: 2176
					var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 2177
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3 >> 14 & 16383; // L: 2178
					return 1; // L: 2179
				} else if (var0 == ScriptOpcodes.COORDZ) { // L: 2181
					var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 2182
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3 >> 28; // L: 2183
					return 1; // L: 2184
				} else if (var0 == ScriptOpcodes.COORDY) { // L: 2186
					var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 2187
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3 & 16383; // L: 2188
					return 1; // L: 2189
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) { // L: 2191
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0; // L: 2192
					return 1; // L: 2193
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) { // L: 2195
					class295.Interpreter_intStackSize -= 2; // L: 2196
					var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize] + 32768; // L: 2197
					var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 2198
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = SceneTilePaint.method4500(var3, var4); // L: 2199
					return 1; // L: 2200
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) { // L: 2202
					class295.Interpreter_intStackSize -= 2; // L: 2203
					var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize] + 32768; // L: 2204
					var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 2205
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = HealthBarUpdate.ItemContainer_getCount(var3, var4); // L: 2206
					return 1; // L: 2207
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) { // L: 2209
					class295.Interpreter_intStackSize -= 2; // L: 2210
					var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize] + 32768; // L: 2211
					var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 2212
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = Login.method1883(var3, var4); // L: 2213
					return 1; // L: 2214
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) { // L: 2216
					if (Client.staffModLevel >= 2) { // L: 2217
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 2218
					}

					return 1; // L: 2219
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) { // L: 2221
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = Client.rebootTimer; // L: 2222
					return 1; // L: 2223
				} else if (var0 == ScriptOpcodes.MAP_WORLD) { // L: 2225
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = Client.worldId; // L: 2226
					return 1; // L: 2227
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) { // L: 2229
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = Client.runEnergy; // L: 2230
					return 1; // L: 2231
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) { // L: 2233
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = Client.weight; // L: 2234
					return 1; // L: 2235
				} else if (var0 == ScriptOpcodes.PLAYERMOD) { // L: 2237
					if (Client.playerMod) { // L: 2238
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 2239
					}

					return 1; // L: 2240
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) { // L: 2242
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = Client.worldProperties; // L: 2243
					return 1; // L: 2244
				} else if (var0 == ScriptOpcodes.MOVECOORD) { // L: 2246
					class295.Interpreter_intStackSize -= 4; // L: 2247
					var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 2248
					var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 2249
					var5 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 2]; // L: 2250
					int var6 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 3]; // L: 2251
					var3 += var4 << 14; // L: 2252
					var3 += var5 << 28; // L: 2253
					var3 += var6; // L: 2254
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3; // L: 2255
					return 1; // L: 2256
				} else if (var0 == 3326) { // L: 2258
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = Client.field493; // L: 2259
					return 1; // L: 2260
				} else if (var0 == 3327) { // L: 2262
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = Client.field494; // L: 2263
					return 1; // L: 2264
				} else {
					return 2; // L: 2266
				}
			}
		}
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "-53681616"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) { // L: 4047
			byte var2 = 4; // L: 4048
			int var3 = var2 + 6; // L: 4049
			int var4 = var2 + 6; // L: 4050
			int var5 = ViewportMouse.fontPlain12.lineWidth(var0, 250); // L: 4051
			int var6 = ViewportMouse.fontPlain12.lineCount(var0, 250) * 13; // L: 4052
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var2 + var6, 0); // L: 4053
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var2 + var6, 16777215); // L: 4054
			ViewportMouse.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0); // L: 4055
			int var7 = var3 - var2; // L: 4056
			int var8 = var4 - var2; // L: 4057
			int var9 = var2 + var5 + var2; // L: 4058
			int var10 = var6 + var2 + var2; // L: 4059

			for (int var11 = 0; var11 < Client.rootWidgetCount; ++var11) { // L: 4061
				if (Client.rootWidgetXs[var11] + Client.rootWidgetWidths[var11] > var7 && Client.rootWidgetXs[var11] < var7 + var9 && Client.rootWidgetYs[var11] + Client.rootWidgetHeights[var11] > var8 && Client.rootWidgetYs[var11] < var8 + var10) { // L: 4062
					Client.field564[var11] = true;
				}
			}

			if (var1) { // L: 4065
				SpotAnimationDefinition.rasterProvider.drawFull(0, 0); // L: 4066
			} else {
				LoginScreenAnimation.method2240(var3, var4, var5, var6); // L: 4069
			}

		}
	} // L: 4071
}
