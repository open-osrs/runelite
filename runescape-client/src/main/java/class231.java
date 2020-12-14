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
		int var4 = var0; // L: 19
		int var5 = var1; // L: 20
		byte var6 = 64; // L: 21
		byte var7 = 64; // L: 22
		int var8 = var0 - var6; // L: 23
		int var9 = var1 - var7; // L: 24
		class182.directions[var6][var7] = 99; // L: 25
		class182.distances[var6][var7] = 0; // L: 26
		byte var10 = 0; // L: 27
		int var11 = 0; // L: 28
		class182.bufferX[var10] = var0; // L: 29
		byte var10001 = var10;
		int var18 = var10 + 1;
		class182.bufferY[var10001] = var1; // L: 30
		int[][] var12 = var3.flags; // L: 31

		while (var11 != var18) { // L: 32
			var4 = class182.bufferX[var11]; // L: 33
			var5 = class182.bufferY[var11]; // L: 34
			var11 = var11 + 1 & 4095; // L: 35
			int var16 = var4 - var8; // L: 36
			int var17 = var5 - var9; // L: 37
			int var13 = var4 - var3.xInset; // L: 38
			int var14 = var5 - var3.yInset; // L: 39
			if (var2.hasArrived(2, var4, var5, var3)) { // L: 40
				class182.field2115 = var4; // L: 41
				class182.field2121 = var5; // L: 42
				return true; // L: 43
			}

			int var15 = class182.distances[var16][var17] + 1; // L: 45
			if (var16 > 0 && class182.directions[var16 - 1][var17] == 0 && (var12[var13 - 1][var14] & 19136782) == 0 && (var12[var13 - 1][var14 + 1] & 19136824) == 0) { // L: 46 47 48 49
				class182.bufferX[var18] = var4 - 1; // L: 50
				class182.bufferY[var18] = var5; // L: 51
				var18 = var18 + 1 & 4095; // L: 52
				class182.directions[var16 - 1][var17] = 2; // L: 53
				class182.distances[var16 - 1][var17] = var15; // L: 54
			}

			if (var16 < 126 && class182.directions[var16 + 1][var17] == 0 && (var12[var13 + 2][var14] & 19136899) == 0 && (var12[var13 + 2][var14 + 1] & 19136992) == 0) { // L: 56 57 58 59
				class182.bufferX[var18] = var4 + 1; // L: 60
				class182.bufferY[var18] = var5; // L: 61
				var18 = var18 + 1 & 4095; // L: 62
				class182.directions[var16 + 1][var17] = 8; // L: 63
				class182.distances[var16 + 1][var17] = var15; // L: 64
			}

			if (var17 > 0 && class182.directions[var16][var17 - 1] == 0 && (var12[var13][var14 - 1] & 19136782) == 0 && (var12[var13 + 1][var14 - 1] & 19136899) == 0) { // L: 66 67 68 69
				class182.bufferX[var18] = var4; // L: 70
				class182.bufferY[var18] = var5 - 1; // L: 71
				var18 = var18 + 1 & 4095; // L: 72
				class182.directions[var16][var17 - 1] = 1; // L: 73
				class182.distances[var16][var17 - 1] = var15; // L: 74
			}

			if (var17 < 126 && class182.directions[var16][var17 + 1] == 0 && (var12[var13][var14 + 2] & 19136824) == 0 && (var12[var13 + 1][var14 + 2] & 19136992) == 0) { // L: 76 77 78 79
				class182.bufferX[var18] = var4; // L: 80
				class182.bufferY[var18] = var5 + 1; // L: 81
				var18 = var18 + 1 & 4095; // L: 82
				class182.directions[var16][var17 + 1] = 4; // L: 83
				class182.distances[var16][var17 + 1] = var15; // L: 84
			}

			if (var16 > 0 && var17 > 0 && class182.directions[var16 - 1][var17 - 1] == 0 && (var12[var13 - 1][var14] & 19136830) == 0 && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13][var14 - 1] & 19136911) == 0) { // L: 86 87 88 89 90
				class182.bufferX[var18] = var4 - 1; // L: 91
				class182.bufferY[var18] = var5 - 1; // L: 92
				var18 = var18 + 1 & 4095; // L: 93
				class182.directions[var16 - 1][var17 - 1] = 3; // L: 94
				class182.distances[var16 - 1][var17 - 1] = var15; // L: 95
			}

			if (var16 < 126 && var17 > 0 && class182.directions[var16 + 1][var17 - 1] == 0 && (var12[var13 + 1][var14 - 1] & 19136911) == 0 && (var12[var13 + 2][var14 - 1] & 19136899) == 0 && (var12[var13 + 2][var14] & 19136995) == 0) { // L: 97 98 99 100 101
				class182.bufferX[var18] = var4 + 1; // L: 102
				class182.bufferY[var18] = var5 - 1; // L: 103
				var18 = var18 + 1 & 4095; // L: 104
				class182.directions[var16 + 1][var17 - 1] = 9; // L: 105
				class182.distances[var16 + 1][var17 - 1] = var15; // L: 106
			}

			if (var16 > 0 && var17 < 126 && class182.directions[var16 - 1][var17 + 1] == 0 && (var12[var13 - 1][var14 + 1] & 19136830) == 0 && (var12[var13 - 1][var14 + 2] & 19136824) == 0 && (var12[var13][var14 + 2] & 19137016) == 0) { // L: 108 109 110 111 112
				class182.bufferX[var18] = var4 - 1; // L: 113
				class182.bufferY[var18] = var5 + 1; // L: 114
				var18 = var18 + 1 & 4095; // L: 115
				class182.directions[var16 - 1][var17 + 1] = 6; // L: 116
				class182.distances[var16 - 1][var17 + 1] = var15; // L: 117
			}

			if (var16 < 126 && var17 < 126 && class182.directions[var16 + 1][var17 + 1] == 0 && (var12[var13 + 1][var14 + 2] & 19137016) == 0 && (var12[var13 + 2][var14 + 2] & 19136992) == 0 && (var12[var13 + 2][var14 + 1] & 19136995) == 0) { // L: 119 120 121 122 123
				class182.bufferX[var18] = var4 + 1; // L: 124
				class182.bufferY[var18] = var5 + 1; // L: 125
				var18 = var18 + 1 & 4095; // L: 126
				class182.directions[var16 + 1][var17 + 1] = 12; // L: 127
				class182.distances[var16 + 1][var17 + 1] = var15; // L: 128
			}
		}

		class182.field2115 = var4; // L: 131
		class182.field2121 = var5; // L: 132
		return false; // L: 133
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZI)I",
		garbageValue = "1687618726"
	)
	static int method4154(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) { // L: 432
			VarcInt.Interpreter_intStackSize -= 3; // L: 433
			var9 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 434
			var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 435
			int var11 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 2]; // L: 436
			if (var4 == 0) { // L: 437
				throw new RuntimeException(); // L: 438
			} else {
				Widget var6 = CollisionMap.getWidget(var9); // L: 440
				if (var6.children == null) { // L: 441
					var6.children = new Widget[var11 + 1];
				}

				if (var6.children.length <= var11) { // L: 442
					Widget[] var7 = new Widget[var11 + 1]; // L: 443

					for (int var8 = 0; var8 < var6.children.length; ++var8) { // L: 444
						var7[var8] = var6.children[var8];
					}

					var6.children = var7; // L: 445
				}

				if (var11 > 0 && var6.children[var11 - 1] == null) {
					throw new RuntimeException("" + (var11 - 1)); // L: 447
				} else {
					Widget var12 = new Widget(); // L: 448
					var12.type = var4; // L: 449
					var12.parentId = var12.id = var6.id; // L: 450
					var12.childIndex = var11; // L: 451
					var12.isIf3 = true; // L: 452
					var6.children[var11] = var12; // L: 453
					if (var2) { // L: 454
						PlayerComposition.field2561 = var12;
					} else {
						VarcInt.field3264 = var12; // L: 455
					}

					CollisionMap.invalidateWidget(var6); // L: 456
					return 1; // L: 457
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) { // L: 459
				var3 = var2 ? PlayerComposition.field2561 : VarcInt.field3264; // L: 460
				Widget var10 = CollisionMap.getWidget(var3.id); // L: 461
				var10.children[var3.childIndex] = null; // L: 462
				CollisionMap.invalidateWidget(var10); // L: 463
				return 1; // L: 464
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) { // L: 466
				var3 = CollisionMap.getWidget(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]); // L: 467
				var3.children = null; // L: 468
				CollisionMap.invalidateWidget(var3); // L: 469
				return 1; // L: 470
			} else if (var0 != ScriptOpcodes.CC_FIND) { // L: 472
				if (var0 == ScriptOpcodes.IF_FIND) { // L: 485
					var3 = CollisionMap.getWidget(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]); // L: 486
					if (var3 != null) { // L: 487
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 1; // L: 488
						if (var2) { // L: 489
							PlayerComposition.field2561 = var3;
						} else {
							VarcInt.field3264 = var3; // L: 490
						}
					} else {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 492
					}

					return 1; // L: 493
				} else {
					return 2; // L: 495
				}
			} else {
				VarcInt.Interpreter_intStackSize -= 2; // L: 473
				var9 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 474
				var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 475
				Widget var5 = class92.getWidgetChild(var9, var4); // L: 476
				if (var5 != null && var4 != -1) { // L: 477
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 1; // L: 478
					if (var2) { // L: 479
						PlayerComposition.field2561 = var5;
					} else {
						VarcInt.field3264 = var5; // L: 480
					}
				} else {
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 482
				}

				return 1; // L: 483
			}
		}
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1604724512"
	)
	static final void method4153() {
		Client.field762 = 0; // L: 5231
		int var0 = (PlayerComposition.localPlayer.x >> 7) + NetFileRequest.baseX; // L: 5232
		int var1 = (PlayerComposition.localPlayer.y >> 7) + class41.baseY; // L: 5233
		if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) { // L: 5234
			Client.field762 = 1;
		}

		if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) { // L: 5235
			Client.field762 = 1;
		}

		if (Client.field762 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) { // L: 5236
			Client.field762 = 0;
		}

	} // L: 5237
}
