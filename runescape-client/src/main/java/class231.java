import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hb")
public class class231 {
	@ObfuscatedName("u")
	@Export("musicTrackBoolean")
	static boolean musicTrackBoolean;

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IILgz;Lfo;S)Z",
		garbageValue = "-4762"
	)
	public static final boolean method4152(int var0, int var1, RouteStrategy var2, CollisionMap var3) {
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
			if (var2.hasArrived(2, var4, var5, var3)) {
				class182.field2115 = var4;
				class182.field2121 = var5;
				return true;
			}

			int var15 = class182.distances[var16][var17] + 1;
			if (var16 > 0 && class182.directions[var16 - 1][var17] == 0 && (var12[var13 - 1][var14] & 19136782) == 0 && (var12[var13 - 1][var14 + 1] & 19136824) == 0) {
				class182.bufferX[var18] = var4 - 1;
				class182.bufferY[var18] = var5;
				var18 = var18 + 1 & 4095;
				class182.directions[var16 - 1][var17] = 2;
				class182.distances[var16 - 1][var17] = var15;
			}

			if (var16 < 126 && class182.directions[var16 + 1][var17] == 0 && (var12[var13 + 2][var14] & 19136899) == 0 && (var12[var13 + 2][var14 + 1] & 19136992) == 0) {
				class182.bufferX[var18] = var4 + 1;
				class182.bufferY[var18] = var5;
				var18 = var18 + 1 & 4095;
				class182.directions[var16 + 1][var17] = 8;
				class182.distances[var16 + 1][var17] = var15;
			}

			if (var17 > 0 && class182.directions[var16][var17 - 1] == 0 && (var12[var13][var14 - 1] & 19136782) == 0 && (var12[var13 + 1][var14 - 1] & 19136899) == 0) {
				class182.bufferX[var18] = var4;
				class182.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class182.directions[var16][var17 - 1] = 1;
				class182.distances[var16][var17 - 1] = var15;
			}

			if (var17 < 126 && class182.directions[var16][var17 + 1] == 0 && (var12[var13][var14 + 2] & 19136824) == 0 && (var12[var13 + 1][var14 + 2] & 19136992) == 0) {
				class182.bufferX[var18] = var4;
				class182.bufferY[var18] = var5 + 1;
				var18 = var18 + 1 & 4095;
				class182.directions[var16][var17 + 1] = 4;
				class182.distances[var16][var17 + 1] = var15;
			}

			if (var16 > 0 && var17 > 0 && class182.directions[var16 - 1][var17 - 1] == 0 && (var12[var13 - 1][var14] & 19136830) == 0 && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13][var14 - 1] & 19136911) == 0) {
				class182.bufferX[var18] = var4 - 1;
				class182.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class182.directions[var16 - 1][var17 - 1] = 3;
				class182.distances[var16 - 1][var17 - 1] = var15;
			}

			if (var16 < 126 && var17 > 0 && class182.directions[var16 + 1][var17 - 1] == 0 && (var12[var13 + 1][var14 - 1] & 19136911) == 0 && (var12[var13 + 2][var14 - 1] & 19136899) == 0 && (var12[var13 + 2][var14] & 19136995) == 0) {
				class182.bufferX[var18] = var4 + 1;
				class182.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class182.directions[var16 + 1][var17 - 1] = 9;
				class182.distances[var16 + 1][var17 - 1] = var15;
			}

			if (var16 > 0 && var17 < 126 && class182.directions[var16 - 1][var17 + 1] == 0 && (var12[var13 - 1][var14 + 1] & 19136830) == 0 && (var12[var13 - 1][var14 + 2] & 19136824) == 0 && (var12[var13][var14 + 2] & 19137016) == 0) {
				class182.bufferX[var18] = var4 - 1;
				class182.bufferY[var18] = var5 + 1;
				var18 = var18 + 1 & 4095;
				class182.directions[var16 - 1][var17 + 1] = 6;
				class182.distances[var16 - 1][var17 + 1] = var15;
			}

			if (var16 < 126 && var17 < 126 && class182.directions[var16 + 1][var17 + 1] == 0 && (var12[var13 + 1][var14 + 2] & 19137016) == 0 && (var12[var13 + 2][var14 + 2] & 19136992) == 0 && (var12[var13 + 2][var14 + 1] & 19136995) == 0) {
				class182.bufferX[var18] = var4 + 1;
				class182.bufferY[var18] = var5 + 1;
				var18 = var18 + 1 & 4095;
				class182.directions[var16 + 1][var17 + 1] = 12;
				class182.distances[var16 + 1][var17 + 1] = var15;
			}
		}

		class182.field2115 = var4;
		class182.field2121 = var5;
		return false;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZI)I",
		garbageValue = "1687618726"
	)
	static int method4154(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) {
			VarcInt.Interpreter_intStackSize -= 3;
			var9 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
			int var11 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 2];
			if (var4 == 0) {
				throw new RuntimeException();
			} else {
				Widget var6 = CollisionMap.getWidget(var9);
				if (var6.children == null) {
					var6.children = new Widget[var11 + 1];
				}

				if (var6.children.length <= var11) {
					Widget[] var7 = new Widget[var11 + 1];

					for (int var8 = 0; var8 < var6.children.length; ++var8) {
						var7[var8] = var6.children[var8];
					}

					var6.children = var7;
				}

				if (var11 > 0 && var6.children[var11 - 1] == null) {
					throw new RuntimeException("" + (var11 - 1));
				} else {
					Widget var12 = new Widget();
					var12.type = var4;
					var12.parentId = var12.id = var6.id;
					var12.childIndex = var11;
					var12.isIf3 = true;
					var6.children[var11] = var12;
					if (var2) {
						PlayerAppearance.field2561 = var12;
					} else {
						VarcInt.field3264 = var12;
					}

					CollisionMap.invalidateWidget(var6);
					return 1;
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) {
				var3 = var2 ? PlayerAppearance.field2561 : VarcInt.field3264;
				Widget var10 = CollisionMap.getWidget(var3.id);
				var10.children[var3.childIndex] = null;
				CollisionMap.invalidateWidget(var10);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) {
				var3 = CollisionMap.getWidget(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]);
				var3.children = null;
				CollisionMap.invalidateWidget(var3);
				return 1;
			} else if (var0 != ScriptOpcodes.CC_FIND) {
				if (var0 == ScriptOpcodes.IF_FIND) {
					var3 = CollisionMap.getWidget(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]);
					if (var3 != null) {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 1;
						if (var2) {
							PlayerAppearance.field2561 = var3;
						} else {
							VarcInt.field3264 = var3;
						}
					} else {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else {
					return 2;
				}
			} else {
				VarcInt.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
				Widget var5 = class92.getWidgetChild(var9, var4);
				if (var5 != null && var4 != -1) {
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 1;
					if (var2) {
						PlayerAppearance.field2561 = var5;
					} else {
						VarcInt.field3264 = var5;
					}
				} else {
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1604724512"
	)
	static final void method4153() {
		Client.field762 = 0;
		int var0 = NetFileRequest.baseX * 64 + (PlayerAppearance.localPlayer.x >> 7);
		int var1 = class41.baseY * 64 + (PlayerAppearance.localPlayer.y >> 7);
		if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
			Client.field762 = 1;
		}

		if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
			Client.field762 = 1;
		}

		if (Client.field762 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
			Client.field762 = 0;
		}

	}
}
