import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("in")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("st")
	@ObfuscatedSignature(
		descriptor = "Lay;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;
	@ObfuscatedName("v")
	@Export("ViewportMouse_isInViewport")
	public static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1903287325
	)
	@Export("ViewportMouse_x")
	public static int ViewportMouse_x;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 322199893
	)
	@Export("ViewportMouse_y")
	public static int ViewportMouse_y;
	@ObfuscatedName("f")
	@Export("ViewportMouse_false0")
	public static boolean ViewportMouse_false0;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -431054751
	)
	static int field2802;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1402550959
	)
	static int field2805;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -276012747
	)
	static int field2804;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1834346387
	)
	static int field2808;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 291985385
	)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("d")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;

	static {
		ViewportMouse_isInViewport = false; // L: 4
		ViewportMouse_x = 0; // L: 5
		ViewportMouse_y = 0; // L: 6
		ViewportMouse_false0 = false; // L: 7
		ViewportMouse_entityCount = 0; // L: 17
		ViewportMouse_entityTags = new long[1000]; // L: 18
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "([BI)Lmd;",
		garbageValue = "-2081497331"
	)
	static Font method5090(byte[] var0) {
		if (var0 == null) { // L: 188
			return null;
		} else {
			Font var1 = new Font(var0, class451.SpriteBuffer_xOffsets, class271.SpriteBuffer_yOffsets, class451.SpriteBuffer_spriteWidths, class451.SpriteBuffer_spriteHeights, NetFileRequest.SpriteBuffer_spritePalette, FriendLoginUpdate.SpriteBuffer_pixels); // L: 189
			ArchiveDiskActionHandler.method5813(); // L: 190
			return var1; // L: 191
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZB)I",
		garbageValue = "-41"
	)
	static int method5089(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) { // L: 2124
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.cycle; // L: 2125
			return 1; // L: 2126
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) { // L: 2128
				Interpreter.Interpreter_intStackSize -= 2; // L: 2129
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2130
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2131
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = MouseRecorder.method2093(var3, var4); // L: 2132
				return 1; // L: 2133
			} else if (var0 == ScriptOpcodes.INV_GETNUM) { // L: 2135
				Interpreter.Interpreter_intStackSize -= 2; // L: 2136
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2137
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2138
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class385.ItemContainer_getCount(var3, var4); // L: 2139
				return 1; // L: 2140
			} else if (var0 == ScriptOpcodes.INV_TOTAL) { // L: 2142
				Interpreter.Interpreter_intStackSize -= 2; // L: 2143
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2144
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2145
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class67.method1910(var3, var4); // L: 2146
				return 1; // L: 2147
			} else if (var0 == ScriptOpcodes.INV_SIZE) { // L: 2149
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2150
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Script.getInvDefinition(var3).size; // L: 2151
				return 1; // L: 2152
			} else if (var0 == ScriptOpcodes.STAT) { // L: 2154
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2155
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.currentLevels[var3]; // L: 2156
				return 1; // L: 2157
			} else if (var0 == ScriptOpcodes.STAT_BASE) { // L: 2159
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2160
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.levels[var3]; // L: 2161
				return 1; // L: 2162
			} else if (var0 == ScriptOpcodes.STAT_XP) { // L: 2164
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2165
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.experience[var3]; // L: 2166
				return 1; // L: 2167
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) { // L: 2169
					var3 = class18.Client_plane; // L: 2170
					var4 = (GrandExchangeEvents.localPlayer.x >> 7) + GrandExchangeOfferOwnWorldComparator.baseX; // L: 2171
					var5 = (GrandExchangeEvents.localPlayer.y >> 7) + VarcInt.baseY; // L: 2172
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28); // L: 2173
					return 1; // L: 2174
				} else if (var0 == ScriptOpcodes.COORDX) { // L: 2176
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2177
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 >> 14 & 16383; // L: 2178
					return 1; // L: 2179
				} else if (var0 == ScriptOpcodes.COORDZ) { // L: 2181
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2182
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 >> 28; // L: 2183
					return 1; // L: 2184
				} else if (var0 == ScriptOpcodes.COORDY) { // L: 2186
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2187
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 & 16383; // L: 2188
					return 1; // L: 2189
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) { // L: 2191
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0; // L: 2192
					return 1; // L: 2193
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) { // L: 2195
					Interpreter.Interpreter_intStackSize -= 2; // L: 2196
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768; // L: 2197
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2198
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = MouseRecorder.method2093(var3, var4); // L: 2199
					return 1; // L: 2200
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) { // L: 2202
					Interpreter.Interpreter_intStackSize -= 2; // L: 2203
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768; // L: 2204
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2205
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class385.ItemContainer_getCount(var3, var4); // L: 2206
					return 1; // L: 2207
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) { // L: 2209
					Interpreter.Interpreter_intStackSize -= 2; // L: 2210
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768; // L: 2211
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2212
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class67.method1910(var3, var4); // L: 2213
					return 1; // L: 2214
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) { // L: 2216
					if (Client.staffModLevel >= 2) { // L: 2217
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2218
					}

					return 1; // L: 2219
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) { // L: 2221
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.rebootTimer; // L: 2222
					return 1; // L: 2223
				} else if (var0 == ScriptOpcodes.MAP_WORLD) { // L: 2225
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.worldId; // L: 2226
					return 1; // L: 2227
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) { // L: 2229
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.runEnergy; // L: 2230
					return 1; // L: 2231
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) { // L: 2233
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.weight; // L: 2234
					return 1; // L: 2235
				} else if (var0 == ScriptOpcodes.PLAYERMOD) { // L: 2237
					if (Client.playerMod) { // L: 2238
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2239
					}

					return 1; // L: 2240
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) { // L: 2242
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.worldProperties; // L: 2243
					return 1; // L: 2244
				} else if (var0 == ScriptOpcodes.MOVECOORD) { // L: 2246
					Interpreter.Interpreter_intStackSize -= 4; // L: 2247
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2248
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2249
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 2250
					int var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 2251
					var3 += var4 << 14; // L: 2252
					var3 += var5 << 28; // L: 2253
					var3 += var6; // L: 2254
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 2255
					return 1; // L: 2256
				} else if (var0 == 3326) { // L: 2258
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field508; // L: 2259
					return 1; // L: 2260
				} else if (var0 == 3327) { // L: 2262
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field509; // L: 2263
					return 1; // L: 2264
				} else {
					return 2; // L: 2266
				}
			}
		}
	}
}
