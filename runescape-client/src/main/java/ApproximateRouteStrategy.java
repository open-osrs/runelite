import java.awt.FontMetrics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bv")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	@ObfuscatedName("qm")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("sceneMinimapSprite")
	static Sprite sceneMinimapSprite;
	@ObfuscatedName("an")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("archive12")
	static Archive archive12;

	ApproximateRouteStrategy() {
	} // L: 10971

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIILft;I)Z",
		garbageValue = "-1274441547"
	)
	@Export("hasArrived")
	protected boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY; // L: 10974
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)[Lix;",
		garbageValue = "64"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.PlayerType_jagexModerator, PlayerType.PlayerType_playerModerator, PlayerType.PlayerType_ultimateIronman, PlayerType.PlayerType_hardcoreIronman, PlayerType.PlayerType_ironman, PlayerType.PlayerType_normal, PlayerType.field3131}; // L: 20
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ILcy;ZI)I",
		garbageValue = "-1823919909"
	)
	static int method1274(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) { // L: 430
			Interpreter.Interpreter_intStackSize -= 3; // L: 431
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 432
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 433
			int var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 434
			if (var4 == 0) { // L: 435
				throw new RuntimeException(); // L: 436
			} else {
				Widget var6 = TileItem.getWidget(var9); // L: 438
				if (var6.children == null) { // L: 439
					var6.children = new Widget[var11 + 1];
				}

				if (var6.children.length <= var11) { // L: 440
					Widget[] var7 = new Widget[var11 + 1]; // L: 441

					for (int var8 = 0; var8 < var6.children.length; ++var8) { // L: 442
						var7[var8] = var6.children[var8];
					}

					var6.children = var7; // L: 443
				}

				if (var11 > 0 && var6.children[var11 - 1] == null) { // L: 445
					throw new RuntimeException("" + (var11 - 1));
				} else {
					Widget var12 = new Widget(); // L: 446
					var12.type = var4; // L: 447
					var12.parentId = var12.id = var6.id; // L: 448
					var12.childIndex = var11; // L: 449
					var12.isIf3 = true; // L: 450
					var6.children[var11] = var12; // L: 451
					if (var2) { // L: 452
						Canvas.field438 = var12;
					} else {
						class3.field12 = var12; // L: 453
					}

					class52.invalidateWidget(var6); // L: 454
					return 1; // L: 455
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) { // L: 457
				var3 = var2 ? Canvas.field438 : class3.field12; // L: 458
				Widget var10 = TileItem.getWidget(var3.id); // L: 459
				var10.children[var3.childIndex] = null; // L: 460
				class52.invalidateWidget(var10); // L: 461
				return 1; // L: 462
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) { // L: 464
				var3 = TileItem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 465
				var3.children = null; // L: 466
				class52.invalidateWidget(var3); // L: 467
				return 1; // L: 468
			} else if (var0 != ScriptOpcodes.CC_FIND) { // L: 470
				if (var0 == ScriptOpcodes.IF_FIND) { // L: 483
					var3 = TileItem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 484
					if (var3 != null) { // L: 485
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 486
						if (var2) { // L: 487
							Canvas.field438 = var3;
						} else {
							class3.field12 = var3; // L: 488
						}
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 490
					}

					return 1; // L: 491
				} else {
					return 2; // L: 493
				}
			} else {
				Interpreter.Interpreter_intStackSize -= 2; // L: 471
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 472
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 473
				Widget var5 = SecureRandomCallable.getWidgetChild(var9, var4); // L: 474
				if (var5 != null && var4 != -1) { // L: 475
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 476
					if (var2) { // L: 477
						Canvas.field438 = var5;
					} else {
						class3.field12 = var5; // L: 478
					}
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 480
				}

				return 1; // L: 481
			}
		}
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1053633300"
	)
	static String method1273(int var0) {
		if (var0 < 0) { // L: 8283
			return "";
		} else {
			return Client.menuTargets[var0].length() > 0 ? Client.menuActions[var0] + " " + Client.menuTargets[var0] : Client.menuActions[var0]; // L: 8284 8285
		}
	}
}
