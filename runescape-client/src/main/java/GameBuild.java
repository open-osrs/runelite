import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ij")
public class GameBuild {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	static final GameBuild LIVE;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	static final GameBuild BUILDLIVE;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	static final GameBuild RC;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	static final GameBuild WIP;
	@ObfuscatedName("i")
	public final String name;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1493317811
	)
	final int buildId;

	static {
		LIVE = new GameBuild("LIVE", 0); // L: 5
		BUILDLIVE = new GameBuild("BUILDLIVE", 3); // L: 6
		RC = new GameBuild("RC", 1); // L: 7
		WIP = new GameBuild("WIP", 2); // L: 8
	}

	GameBuild(String var1, int var2) {
		this.name = var1; // L: 17
		this.buildId = var2; // L: 18
	} // L: 19

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lic;III)[Llp;",
		garbageValue = "-1533970303"
	)
	public static Sprite[] method4214(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2); // L: 55
		boolean var3;
		if (var4 == null) { // L: 56
			var3 = false; // L: 57
		} else {
			Occluder.SpriteBuffer_decode(var4); // L: 60
			var3 = true; // L: 61
		}

		if (!var3) { // L: 63
			return null;
		} else {
			Sprite[] var5 = new Sprite[class335.SpriteBuffer_spriteCount]; // L: 66

			for (int var6 = 0; var6 < class335.SpriteBuffer_spriteCount; ++var6) { // L: 67
				Sprite var7 = var5[var6] = new Sprite(); // L: 68
				var7.width = class335.SpriteBuffer_spriteWidth; // L: 69
				var7.height = class335.SpriteBuffer_spriteHeight; // L: 70
				var7.xOffset = Username.SpriteBuffer_xOffsets[var6]; // L: 71
				var7.yOffset = class335.SpriteBuffer_yOffsets[var6]; // L: 72
				var7.subWidth = class335.SpriteBuffer_spriteWidths[var6]; // L: 73
				var7.subHeight = class335.SpriteBuffer_spriteHeights[var6]; // L: 74
				int var8 = var7.subWidth * var7.subHeight; // L: 75
				byte[] var9 = class92.SpriteBuffer_pixels[var6]; // L: 76
				var7.pixels = new int[var8]; // L: 77

				for (int var10 = 0; var10 < var8; ++var10) { // L: 78
					var7.pixels[var10] = TaskHandler.SpriteBuffer_spritePalette[var9[var10] & 255];
				}
			}

			Username.SpriteBuffer_xOffsets = null; // L: 81
			class335.SpriteBuffer_yOffsets = null; // L: 82
			class335.SpriteBuffer_spriteWidths = null; // L: 83
			class335.SpriteBuffer_spriteHeights = null; // L: 84
			TaskHandler.SpriteBuffer_spritePalette = null; // L: 85
			class92.SpriteBuffer_pixels = null; // L: 86
			return var5; // L: 90
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ILcy;ZI)I",
		garbageValue = "-1136402672"
	)
	static int method4218(int var0, Script var1, boolean var2) {
		int var3 = -1; // L: 497
		Widget var4;
		if (var0 >= 2000) { // L: 499
			var0 -= 1000; // L: 500
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 501
			var4 = TileItem.getWidget(var3); // L: 502
		} else {
			var4 = var2 ? Canvas.field438 : class3.field12; // L: 504
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) { // L: 505
			Interpreter.Interpreter_intStackSize -= 4; // L: 506
			var4.rawX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 507
			var4.rawY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 508
			var4.xAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 509
			var4.yAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 510
			class52.invalidateWidget(var4); // L: 511
			class2.client.alignWidget(var4); // L: 512
			if (var3 != -1 && var4.type == 0) { // L: 513
				class4.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1; // L: 514
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) { // L: 516
			Interpreter.Interpreter_intStackSize -= 4; // L: 517
			var4.rawWidth = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 518
			var4.rawHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 519
			var4.widthAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 520
			var4.heightAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 521
			class52.invalidateWidget(var4); // L: 522
			class2.client.alignWidget(var4); // L: 523
			if (var3 != -1 && var4.type == 0) { // L: 524
				class4.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1; // L: 525
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) { // L: 527
			boolean var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 528
			if (var5 != var4.isHidden) { // L: 529
				var4.isHidden = var5; // L: 530
				class52.invalidateWidget(var4); // L: 531
			}

			return 1; // L: 533
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) { // L: 535
			var4.noClickThrough = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 536
			return 1; // L: 537
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) { // L: 539
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 540
			return 1; // L: 541
		} else {
			return 2; // L: 543
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lbw;B)V",
		garbageValue = "30"
	)
	static void method4217(GameShell var0) {
		while (class60.isKeyDown()) { // L: 1647
			if (PlayerAppearance.field2581 == 13) { // L: 1648
				PacketBufferNode.method3726(); // L: 1649
				return; // L: 1650
			}

			if (PlayerAppearance.field2581 == 96) { // L: 1652
				if (Login.worldSelectPage > 0 && WorldMapIcon_0.worldSelectLeftSprite != null) { // L: 1653
					--Login.worldSelectPage; // L: 1654
				}
			} else if (PlayerAppearance.field2581 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && ArchiveDiskActionHandler.worldSelectRightSprite != null) { // L: 1657 1658
				++Login.worldSelectPage; // L: 1659
			}
		}

		if (MouseHandler.MouseHandler_lastButton == 1 || !ScriptEvent.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 1663
			int var1 = Login.xPadding + 280; // L: 1664
			if (MouseHandler.MouseHandler_lastPressedX >= var1 && MouseHandler.MouseHandler_lastPressedX <= var1 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1665
				AbstractWorldMapData.changeWorldSelectSorting(0, 0); // L: 1666
				return; // L: 1667
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var1 + 15 && MouseHandler.MouseHandler_lastPressedX <= var1 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1669
				AbstractWorldMapData.changeWorldSelectSorting(0, 1); // L: 1670
				return; // L: 1671
			}

			int var2 = Login.xPadding + 390; // L: 1673
			if (MouseHandler.MouseHandler_lastPressedX >= var2 && MouseHandler.MouseHandler_lastPressedX <= var2 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1674
				AbstractWorldMapData.changeWorldSelectSorting(1, 0); // L: 1675
				return; // L: 1676
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var2 + 15 && MouseHandler.MouseHandler_lastPressedX <= var2 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1678
				AbstractWorldMapData.changeWorldSelectSorting(1, 1); // L: 1679
				return; // L: 1680
			}

			int var3 = Login.xPadding + 500; // L: 1682
			if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1683
				AbstractWorldMapData.changeWorldSelectSorting(2, 0); // L: 1684
				return; // L: 1685
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1687
				AbstractWorldMapData.changeWorldSelectSorting(2, 1); // L: 1688
				return; // L: 1689
			}

			int var4 = Login.xPadding + 610; // L: 1691
			if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1692
				AbstractWorldMapData.changeWorldSelectSorting(3, 0); // L: 1693
				return; // L: 1694
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1696
				AbstractWorldMapData.changeWorldSelectSorting(3, 1); // L: 1697
				return; // L: 1698
			}

			if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) { // L: 1700
				PacketBufferNode.method3726(); // L: 1701
				return; // L: 1702
			}

			if (Login.hoveredWorldIndex != -1) { // L: 1704
				World var5 = AbstractByteArrayCopier.World_worlds[Login.hoveredWorldIndex]; // L: 1705
				Canvas.changeWorld(var5); // L: 1706
				PacketBufferNode.method3726(); // L: 1707
				return; // L: 1708
			}

			if (Login.worldSelectPage > 0 && WorldMapIcon_0.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= WorldMapIcon_0.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= GameShell.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= GameShell.canvasHeight / 2 + 50) { // L: 1710
				--Login.worldSelectPage; // L: 1711
			}

			if (Login.worldSelectPage < Login.worldSelectPagesCount && ArchiveDiskActionHandler.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= FloorDecoration.canvasWidth - ArchiveDiskActionHandler.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= FloorDecoration.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= GameShell.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= GameShell.canvasHeight / 2 + 50) { // L: 1713
				++Login.worldSelectPage; // L: 1714
			}
		}

	} // L: 1717
}
