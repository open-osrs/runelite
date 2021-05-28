import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("z")
public class class20 extends class16 {
	@ObfuscatedName("j")
	static byte[][][] field182;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("d")
	@Export("ByteArrayPool_arrays")
	static byte[][][] ByteArrayPool_arrays;
	@ObfuscatedName("es")
	@ObfuscatedGetter(
		intValue = -318023015
	)
	static int field184;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1112467139
	)
	int field178;
	@ObfuscatedName("n")
	byte field172;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 500629175
	)
	int field173;
	@ObfuscatedName("y")
	String field174;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lx;"
	)
	final class19 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lx;)V"
	)
	class20(class19 var1) {
		this.this$0 = var1;
		this.field178 = -1; // L: 100
	} // L: 105

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "68071115"
	)
	void vmethod266(Buffer var1) {
		this.field178 = var1.readUnsignedShort(); // L: 108
		this.field172 = var1.readByte(); // L: 109
		this.field173 = var1.readUnsignedShort(); // L: 110
		var1.readLong(); // L: 111
		this.field174 = var1.readStringCp1252NullTerminated(); // L: 112
	} // L: 113

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ly;I)V",
		garbageValue = "-1846892157"
	)
	void vmethod264(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field178); // L: 116
		var2.rank = this.field172; // L: 117
		var2.world = this.field173; // L: 118
		var2.name = this.field174; // L: 119
	} // L: 120

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-912438388"
	)
	public static boolean method231() {
		ReflectionCheck var0 = (ReflectionCheck)class69.reflectionChecks.last(); // L: 28
		return var0 != null; // L: 29
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Z",
		garbageValue = "-253899282"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		return MusicPatchNode.method4638(var0, 10, true); // L: 34
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-192400471"
	)
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 21
		if (var2 == null) { // L: 22
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0; // L: 23 24
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Laf;B)V",
		garbageValue = "-93"
	)
	static void method230(GameEngine var0) {
		while (ClanChannelMember.isKeyDown()) { // L: 1531
			if (ItemComposition.field1859 == 13) { // L: 1532
				Login.worldSelectOpen = false; // L: 1534
				Login.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1535
				rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1536
				Fonts.logoSprite.drawAt(Login.xPadding + 382 - Fonts.logoSprite.subWidth / 2, 18); // L: 1537
				return; // L: 1539
			}

			if (ItemComposition.field1859 == 96) { // L: 1541
				if (Login.worldSelectPage > 0 && class19.worldSelectLeftSprite != null) { // L: 1542
					--Login.worldSelectPage; // L: 1543
				}
			} else if (ItemComposition.field1859 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && WorldMapID.worldSelectRightSprite != null) { // L: 1546 1547
				++Login.worldSelectPage; // L: 1548
			}
		}

		if (MouseHandler.MouseHandler_lastButton == 1 || !Client.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 1552
			int var1 = Login.xPadding + 280; // L: 1553
			if (MouseHandler.MouseHandler_lastPressedX >= var1 && MouseHandler.MouseHandler_lastPressedX <= var1 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1554
				class44.changeWorldSelectSorting(0, 0); // L: 1555
				return; // L: 1556
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var1 + 15 && MouseHandler.MouseHandler_lastPressedX <= var1 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1558
				class44.changeWorldSelectSorting(0, 1); // L: 1559
				return; // L: 1560
			}

			int var2 = Login.xPadding + 390; // L: 1562
			if (MouseHandler.MouseHandler_lastPressedX >= var2 && MouseHandler.MouseHandler_lastPressedX <= var2 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1563
				class44.changeWorldSelectSorting(1, 0); // L: 1564
				return; // L: 1565
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var2 + 15 && MouseHandler.MouseHandler_lastPressedX <= var2 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1567
				class44.changeWorldSelectSorting(1, 1); // L: 1568
				return; // L: 1569
			}

			int var3 = Login.xPadding + 500; // L: 1571
			if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1572
				class44.changeWorldSelectSorting(2, 0); // L: 1573
				return; // L: 1574
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1576
				class44.changeWorldSelectSorting(2, 1); // L: 1577
				return; // L: 1578
			}

			int var4 = Login.xPadding + 610; // L: 1580
			if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1581
				class44.changeWorldSelectSorting(3, 0); // L: 1582
				return; // L: 1583
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1585
				class44.changeWorldSelectSorting(3, 1); // L: 1586
				return; // L: 1587
			}

			if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) { // L: 1589
				Login.worldSelectOpen = false; // L: 1591
				Login.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1592
				rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1593
				Fonts.logoSprite.drawAt(Login.xPadding + 382 - Fonts.logoSprite.subWidth / 2, 18); // L: 1594
				return; // L: 1596
			}

			if (Login.hoveredWorldIndex != -1) { // L: 1598
				World var5 = Tiles.World_worlds[Login.hoveredWorldIndex]; // L: 1599
				class0.changeWorld(var5); // L: 1600
				Login.worldSelectOpen = false; // L: 1602
				Login.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1603
				rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1604
				Fonts.logoSprite.drawAt(Login.xPadding + 382 - Fonts.logoSprite.subWidth / 2, 18); // L: 1605
				return; // L: 1607
			}

			if (Login.worldSelectPage > 0 && class19.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class19.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= ReflectionCheck.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= ReflectionCheck.canvasHeight / 2 + 50) { // L: 1609
				--Login.worldSelectPage; // L: 1610
			}

			if (Login.worldSelectPage < Login.worldSelectPagesCount && WorldMapID.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= class32.canvasWidth - WorldMapID.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= class32.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= ReflectionCheck.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= ReflectionCheck.canvasHeight / 2 + 50) { // L: 1612
				++Login.worldSelectPage; // L: 1613
			}
		}

	} // L: 1616
}
