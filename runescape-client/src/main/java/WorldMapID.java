import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("az")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("pv")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("clanChat")
	static ClanChat clanChat;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	static final WorldMapID field301;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	static final WorldMapID field290;
	@ObfuscatedName("w")
	static int[] field292;
	@ObfuscatedName("ab")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "[Llm;"
	)
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;
	@ObfuscatedName("ca")
	public static char field299;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -842814977
	)
	@Export("value")
	final int value;

	static {
		field301 = new WorldMapID(0); // L: 4
		field290 = new WorldMapID(1); // L: 5
	}

	WorldMapID(int var1) {
		this.value = var1; // L: 9
	} // L: 10

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "893410164"
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-283946785"
	)
	static String method645() {
		return WorldMapSectionType.clientPreferences.hideUsername ? HitSplatDefinition.method4768(Login.Login_username) : Login.Login_username; // L: 202
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1525294724"
	)
	@Export("clearItemContainer")
	static void clearItemContainer(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 63
		if (var1 != null) { // L: 64
			for (int var2 = 0; var2 < var1.ids.length; ++var2) { // L: 65
				var1.ids[var2] = -1; // L: 66
				var1.quantities[var2] = 0; // L: 67
			}

		}
	} // L: 69

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lig;Ljava/lang/String;Ljava/lang/String;S)[Llm;",
		garbageValue = "26517"
	)
	public static SpritePixels[] method648(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1); // L: 145
		int var4 = var0.getFileId(var3, var2); // L: 146
		return WorldMapLabelSize.method268(var0, var3, var4); // L: 147
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lbt;I)V",
		garbageValue = "1647051153"
	)
	static void method646(GameEngine var0) {
		while (Varcs.isKeyDown()) { // L: 1453
			if (ModeWhere.field2417 == 13) { // L: 1454
				UserComparator10.method3573(); // L: 1455
				return; // L: 1456
			}

			if (ModeWhere.field2417 == 96) { // L: 1458
				if (Login.worldSelectPage > 0 && class7.worldSelectLeftSprite != null) { // L: 1459
					--Login.worldSelectPage; // L: 1460
				}
			} else if (ModeWhere.field2417 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && class2.worldSelectRightSprite != null) { // L: 1463 1464
				++Login.worldSelectPage; // L: 1465
			}
		}

		if (MouseHandler.MouseHandler_lastButton == 1 || !class8.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 1469
			int var1 = Login.xPadding + 280; // L: 1470
			if (MouseHandler.MouseHandler_lastPressedX >= var1 && MouseHandler.MouseHandler_lastPressedX <= var1 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1471
				class1.changeWorldSelectSorting(0, 0); // L: 1472
				return; // L: 1473
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var1 + 15 && MouseHandler.MouseHandler_lastPressedX <= var1 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1475
				class1.changeWorldSelectSorting(0, 1); // L: 1476
				return; // L: 1477
			}

			int var2 = Login.xPadding + 390; // L: 1479
			if (MouseHandler.MouseHandler_lastPressedX >= var2 && MouseHandler.MouseHandler_lastPressedX <= var2 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1480
				class1.changeWorldSelectSorting(1, 0); // L: 1481
				return; // L: 1482
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var2 + 15 && MouseHandler.MouseHandler_lastPressedX <= var2 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1484
				class1.changeWorldSelectSorting(1, 1); // L: 1485
				return; // L: 1486
			}

			int var3 = Login.xPadding + 500; // L: 1488
			if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1489
				class1.changeWorldSelectSorting(2, 0); // L: 1490
				return; // L: 1491
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1493
				class1.changeWorldSelectSorting(2, 1); // L: 1494
				return; // L: 1495
			}

			int var4 = Login.xPadding + 610; // L: 1497
			if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1498
				class1.changeWorldSelectSorting(3, 0); // L: 1499
				return; // L: 1500
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1502
				class1.changeWorldSelectSorting(3, 1); // L: 1503
				return; // L: 1504
			}

			if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) { // L: 1506
				UserComparator10.method3573(); // L: 1507
				return; // L: 1508
			}

			if (Login.hoveredWorldIndex != -1) { // L: 1510
				World var5 = World.World_worlds[Login.hoveredWorldIndex]; // L: 1511
				ChatChannel.changeWorld(var5); // L: 1512
				UserComparator10.method3573(); // L: 1513
				return; // L: 1514
			}

			if (Login.worldSelectPage > 0 && class7.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class7.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= class25.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class25.canvasHeight / 2 + 50) { // L: 1516
				--Login.worldSelectPage; // L: 1517
			}

			if (Login.worldSelectPage < Login.worldSelectPagesCount && class2.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= GrandExchangeOfferTotalQuantityComparator.canvasWidth - class2.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= GrandExchangeOfferTotalQuantityComparator.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= class25.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class25.canvasHeight / 2 + 50) { // L: 1519
				++Login.worldSelectPage; // L: 1520
			}
		}

	} // L: 1523
}
