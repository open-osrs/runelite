import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dy")
@Implements("UserComparator10")
public class UserComparator10 extends AbstractUserComparator {
	@ObfuscatedName("c")
	@Export("reversed")
	final boolean reversed;

	public UserComparator10(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnm;Lnm;I)I",
		garbageValue = "1111240808"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) { // L: 15
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 16
		} else {
			return this.compareUser(var1, var2); // L: 18
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 22
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILqt;I)Lfy;",
		garbageValue = "956626594"
	)
	public static class167 method2609(int var0, Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 24
		boolean var3 = (var2 & 1) != 0; // L: 25
		boolean var4 = (var2 & 2) != 0; // L: 26
		class167 var5 = new class167(var0); // L: 27
		int var6;
		int[] var7;
		boolean var8;
		int var9;
		short var10;
		if (var3) { // L: 28
			var6 = var1.readUnsignedByte(); // L: 29
			var7 = new int[]{var6 & 15, var6 >> 4 & 15}; // L: 30 31 32
			var8 = var5.field1814 != null && var7.length == var5.field1814.length; // L: 33

			for (var9 = 0; var9 < 2; ++var9) { // L: 34
				if (var7[var9] != 15) { // L: 35
					var10 = (short)var1.readUnsignedShort(); // L: 36
					if (var8) { // L: 37
						var5.field1814[var7[var9]] = var10; // L: 38
					}
				}
			}
		}

		if (var4) { // L: 43
			var6 = var1.readUnsignedByte(); // L: 44
			var7 = new int[]{var6 & 15, var6 >> 4 & 15}; // L: 45 46 47
			var8 = var5.field1815 != null && var7.length == var5.field1815.length; // L: 48

			for (var9 = 0; var9 < 2; ++var9) { // L: 49
				if (var7[var9] != 15) { // L: 50
					var10 = (short)var1.readUnsignedShort(); // L: 51
					if (var8) { // L: 52
						var5.field1815[var7[var9]] = var10; // L: 53
					}
				}
			}
		}

		return var5; // L: 58
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Z",
		garbageValue = "75"
	)
	static final boolean method2611(byte[] var0, int var1, int var2) {
		boolean var3 = true; // L: 188
		Buffer var4 = new Buffer(var0); // L: 189
		int var5 = -1; // L: 190

		label68:
		while (true) {
			int var6 = var4.method7770(); // L: 192
			if (var6 == 0) { // L: 193
				return var3; // L: 224
			}

			var5 += var6; // L: 194
			int var7 = 0; // L: 195
			boolean var8 = false; // L: 196

			while (true) {
				int var9;
				while (!var8) { // L: 198
					var9 = var4.readUShortSmart(); // L: 204
					if (var9 == 0) { // L: 205
						continue label68;
					}

					var7 += var9 - 1; // L: 206
					int var10 = var7 & 63; // L: 207
					int var11 = var7 >> 6 & 63; // L: 208
					int var12 = var4.readUnsignedByte() >> 2; // L: 209
					int var13 = var11 + var1; // L: 210
					int var14 = var10 + var2; // L: 211
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) { // L: 212
						ObjectComposition var15 = class162.getObjectDefinition(var5); // L: 213
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) { // L: 214
							if (!var15.needsModelFiles()) { // L: 215
								++Client.field547; // L: 216
								var3 = false; // L: 217
							}

							var8 = true; // L: 219
						}
					}
				}

				var9 = var4.readUShortSmart(); // L: 199
				if (var9 == 0) { // L: 200
					break;
				}

				var4.readUnsignedByte(); // L: 201
			}
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(ILbi;ZB)I",
		garbageValue = "80"
	)
	static int method2605(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) { // L: 2134
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.cycle; // L: 2135
			return 1; // L: 2136
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) { // L: 2138
				class446.Interpreter_intStackSize -= 2; // L: 2139
				var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 2140
				var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 2141
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = class152.method3147(var3, var4); // L: 2142
				return 1; // L: 2143
			} else if (var0 == ScriptOpcodes.INV_GETNUM) { // L: 2145
				class446.Interpreter_intStackSize -= 2; // L: 2146
				var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 2147
				var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 2148
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Archive.ItemContainer_getCount(var3, var4); // L: 2149
				return 1; // L: 2150
			} else if (var0 == ScriptOpcodes.INV_TOTAL) { // L: 2152
				class446.Interpreter_intStackSize -= 2; // L: 2153
				var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 2154
				var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 2155
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Bounds.method6922(var3, var4); // L: 2156
				return 1; // L: 2157
			} else if (var0 == ScriptOpcodes.INV_SIZE) { // L: 2159
				var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2160
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Calendar.getInvDefinition(var3).size; // L: 2161
				return 1; // L: 2162
			} else if (var0 == ScriptOpcodes.STAT) { // L: 2164
				var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2165
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.currentLevels[var3]; // L: 2166
				return 1; // L: 2167
			} else if (var0 == ScriptOpcodes.STAT_BASE) { // L: 2169
				var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2170
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.levels[var3]; // L: 2171
				return 1; // L: 2172
			} else if (var0 == ScriptOpcodes.STAT_XP) { // L: 2174
				var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2175
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.experience[var3]; // L: 2176
				return 1; // L: 2177
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) { // L: 2179
					var3 = PacketWriter.Client_plane; // L: 2180
					var4 = (class101.localPlayer.x >> 7) + class28.baseX; // L: 2181
					var5 = (class101.localPlayer.y >> 7) + WorldMapLabelSize.baseY; // L: 2182
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28); // L: 2183
					return 1; // L: 2184
				} else if (var0 == ScriptOpcodes.COORDX) { // L: 2186
					var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2187
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3 >> 14 & 16383; // L: 2188
					return 1; // L: 2189
				} else if (var0 == ScriptOpcodes.COORDZ) { // L: 2191
					var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2192
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3 >> 28; // L: 2193
					return 1; // L: 2194
				} else if (var0 == ScriptOpcodes.COORDY) { // L: 2196
					var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2197
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3 & 16383; // L: 2198
					return 1; // L: 2199
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) { // L: 2201
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0; // L: 2202
					return 1; // L: 2203
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) { // L: 2205
					class446.Interpreter_intStackSize -= 2; // L: 2206
					var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize] + 32768; // L: 2207
					var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 2208
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = class152.method3147(var3, var4); // L: 2209
					return 1; // L: 2210
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) { // L: 2212
					class446.Interpreter_intStackSize -= 2; // L: 2213
					var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize] + 32768; // L: 2214
					var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 2215
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Archive.ItemContainer_getCount(var3, var4); // L: 2216
					return 1; // L: 2217
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) { // L: 2219
					class446.Interpreter_intStackSize -= 2; // L: 2220
					var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize] + 32768; // L: 2221
					var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 2222
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Bounds.method6922(var3, var4); // L: 2223
					return 1; // L: 2224
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) { // L: 2226
					if (Client.staffModLevel >= 2) { // L: 2227
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 2228
					}

					return 1; // L: 2229
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) { // L: 2231
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.rebootTimer; // L: 2232
					return 1; // L: 2233
				} else if (var0 == ScriptOpcodes.MAP_WORLD) { // L: 2235
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.worldId; // L: 2236
					return 1; // L: 2237
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) { // L: 2239
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.runEnergy; // L: 2240
					return 1; // L: 2241
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) { // L: 2243
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.weight; // L: 2244
					return 1; // L: 2245
				} else if (var0 == ScriptOpcodes.PLAYERMOD) { // L: 2247
					if (Client.playerMod) { // L: 2248
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 2249
					}

					return 1; // L: 2250
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) { // L: 2252
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.worldProperties; // L: 2253
					return 1; // L: 2254
				} else if (var0 == ScriptOpcodes.MOVECOORD) { // L: 2256
					class446.Interpreter_intStackSize -= 4; // L: 2257
					var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 2258
					var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 2259
					var5 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 2]; // L: 2260
					int var6 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 3]; // L: 2261
					var3 += var4 << 14; // L: 2262
					var3 += var5 << 28; // L: 2263
					var3 += var6; // L: 2264
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3; // L: 2265
					return 1; // L: 2266
				} else if (var0 == 3326) { // L: 2268
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.field605; // L: 2269
					return 1; // L: 2270
				} else if (var0 == 3327) { // L: 2272
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.field647; // L: 2273
					return 1; // L: 2274
				} else {
					return 2; // L: 2276
				}
			}
		}
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(IIIILqe;Lkp;I)V",
		garbageValue = "-860665579"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2; // L: 12163
		if (var6 > 4225 && var6 < 90000) { // L: 12164
			int var7 = Client.camAngleY & 2047; // L: 12165
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 12166
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 12167
			int var10 = var9 * var2 + var3 * var8 >> 16; // L: 12168
			int var11 = var3 * var9 - var8 * var2 >> 16; // L: 12169
			double var12 = Math.atan2((double)var10, (double)var11); // L: 12170
			int var14 = var5.width / 2 - 25; // L: 12171
			int var15 = (int)(Math.sin(var12) * (double)var14); // L: 12172
			int var16 = (int)(Math.cos(var12) * (double)var14); // L: 12173
			byte var17 = 20; // L: 12174
			class344.redHintArrowSprite.method8179(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256); // L: 12175
		} else {
			ParamComposition.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5); // L: 12177
		}

	} // L: 12178

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(Lkb;B)Lkb;",
		garbageValue = "111"
	)
	static Widget method2610(Widget var0) {
		int var1 = class134.method2906(class124.getWidgetFlags(var0)); // L: 12295
		if (var1 == 0) { // L: 12296
			return null;
		} else {
			for (int var2 = 0; var2 < var1; ++var2) { // L: 12297
				var0 = class140.getWidget(var0.parentId); // L: 12298
				if (var0 == null) { // L: 12299
					return null;
				}
			}

			return var0; // L: 12301
		}
	}
}
