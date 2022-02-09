import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ke")
@Implements("GrandExchangeEvents")
public class GrandExchangeEvents {
	@ObfuscatedName("l")
	@Export("GrandExchangeEvents_ageComparator")
	public static Comparator GrandExchangeEvents_ageComparator;
	@ObfuscatedName("s")
	@Export("GrandExchangeEvents_priceComparator")
	public static Comparator GrandExchangeEvents_priceComparator;
	@ObfuscatedName("e")
	@Export("GrandExchangeEvents_nameComparator")
	public static Comparator GrandExchangeEvents_nameComparator;
	@ObfuscatedName("r")
	@Export("GrandExchangeEvents_quantityComparator")
	public static Comparator GrandExchangeEvents_quantityComparator;
	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "Lbh;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;
	@ObfuscatedName("c")
	@Export("events")
	public final List events;

	static {
		GrandExchangeEvents_ageComparator = new GrandExchangeOfferAgeComparator(); // L: 11
		new GrandExchangeOfferWorldComparator();
		GrandExchangeEvents_priceComparator = new GrandExchangeOfferUnitPriceComparator(); // L: 41
		GrandExchangeEvents_nameComparator = new GrandExchangeOfferNameComparator(); // L: 54
		GrandExchangeEvents_quantityComparator = new GrandExchangeOfferTotalQuantityComparator();
	} // L: 67

	@ObfuscatedSignature(
		descriptor = "(Lpi;Z)V",
		garbageValue = "1"
	)
	public GrandExchangeEvents(Buffer var1, boolean var2) {
		int var3 = var1.readUnsignedShort(); // L: 82
		boolean var4 = var1.readUnsignedByte() == 1; // L: 83
		byte var5;
		if (var4) { // L: 85
			var5 = 1;
		} else {
			var5 = 0; // L: 86
		}

		int var6 = var1.readUnsignedShort(); // L: 87
		this.events = new ArrayList(var6); // L: 88

		for (int var7 = 0; var7 < var6; ++var7) { // L: 89
			this.events.add(new GrandExchangeEvent(var1, var5, var3)); // L: 90
		}

	} // L: 92

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;ZB)V",
		garbageValue = "1"
	)
	@Export("sort")
	public void sort(Comparator var1, boolean var2) {
		if (var2) { // L: 95
			Collections.sort(this.events, var1); // L: 96
		} else {
			Collections.sort(this.events, Collections.reverseOrder(var1)); // L: 99
		}

	} // L: 101

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)I",
		garbageValue = "28376"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1; // L: 117
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2146066795"
	)
	@Export("incrementMenuEntries")
	static final void incrementMenuEntries() {
		boolean var0 = false; // L: 9304

		while (!var0) { // L: 9305
			var0 = true; // L: 9306

			for (int var1 = 0; var1 < Client.menuOptionsCount - 1; ++var1) { // L: 9307
				if (Client.menuOpcodes[var1] < 1000 && Client.menuOpcodes[var1 + 1] > 1000) { // L: 9308
					String var2 = Client.menuTargets[var1]; // L: 9309
					Client.menuTargets[var1] = Client.menuTargets[var1 + 1]; // L: 9310
					Client.menuTargets[var1 + 1] = var2; // L: 9311
					String var3 = Client.menuActions[var1]; // L: 9312
					Client.menuActions[var1] = Client.menuActions[var1 + 1]; // L: 9313
					Client.menuActions[var1 + 1] = var3; // L: 9314
					int var4 = Client.menuOpcodes[var1]; // L: 9315
					Client.menuOpcodes[var1] = Client.menuOpcodes[var1 + 1]; // L: 9316
					Client.menuOpcodes[var1 + 1] = var4; // L: 9317
					var4 = Client.menuArguments1[var1]; // L: 9318
					Client.menuArguments1[var1] = Client.menuArguments1[var1 + 1]; // L: 9319
					Client.menuArguments1[var1 + 1] = var4; // L: 9320
					var4 = Client.menuArguments2[var1]; // L: 9321
					Client.menuArguments2[var1] = Client.menuArguments2[var1 + 1]; // L: 9322
					Client.menuArguments2[var1 + 1] = var4; // L: 9323
					var4 = Client.menuIdentifiers[var1]; // L: 9324
					Client.menuIdentifiers[var1] = Client.menuIdentifiers[var1 + 1]; // L: 9325
					Client.menuIdentifiers[var1 + 1] = var4; // L: 9326
					boolean var5 = Client.menuShiftClick[var1]; // L: 9327
					Client.menuShiftClick[var1] = Client.menuShiftClick[var1 + 1]; // L: 9328
					Client.menuShiftClick[var1 + 1] = var5; // L: 9329
					var0 = false; // L: 9330
				}
			}
		}

	} // L: 9334

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(Ljz;III)V",
		garbageValue = "1063145695"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0, int var1, int var2) {
		if (var0.buttonType == 1) { // L: 10543
			class11.insertMenuItemNoShift(var0.buttonText, "", 24, 0, 0, var0.id); // L: 10544
		}

		String var3;
		if (var0.buttonType == 2 && !Client.isSpellSelected) { // L: 10547
			var3 = WorldMapEvent.Widget_getSpellActionName(var0); // L: 10548
			if (var3 != null) { // L: 10549
				class11.insertMenuItemNoShift(var3, LoginScreenAnimation.colorStartTag(65280) + var0.spellName, 25, 0, -1, var0.id); // L: 10550
			}
		}

		if (var0.buttonType == 3) { // L: 10554
			class11.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id); // L: 10555
		}

		if (var0.buttonType == 4) { // L: 10558
			class11.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id); // L: 10559
		}

		if (var0.buttonType == 5) { // L: 10562
			class11.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id); // L: 10563
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) { // L: 10566
			class11.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id); // L: 10567
		}

		int var4;
		int var15;
		if (var0.type == 2) { // L: 10570
			var15 = 0; // L: 10571

			for (var4 = 0; var4 < var0.height; ++var4) { // L: 10572
				for (int var17 = 0; var17 < var0.width; ++var17) { // L: 10573
					int var18 = (var0.paddingX + 32) * var17; // L: 10574
					int var7 = (var0.paddingY + 32) * var4; // L: 10575
					if (var15 < 20) { // L: 10576
						var18 += var0.inventoryXOffsets[var15]; // L: 10577
						var7 += var0.inventoryYOffsets[var15]; // L: 10578
					}

					if (var1 >= var18 && var2 >= var7 && var1 < var18 + 32 && var2 < var7 + 32) { // L: 10580
						Client.dragItemSlotDestination = var15; // L: 10581
						NPC.hoveredItemContainer = var0; // L: 10582
						if (var0.itemIds[var15] > 0) { // L: 10583
							ItemComposition var8 = Client.ItemDefinition_get(var0.itemIds[var15] - 1); // L: 10584
							if (Client.isItemSelected == 1 && Skills.method5475(Language.getWidgetFlags(var0))) { // L: 10585
								if (var0.id != class133.selectedItemWidget || var15 != WorldMapAreaData.selectedItemSlot) { // L: 10586
									class11.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + LoginScreenAnimation.colorStartTag(16748608) + var8.name, 31, var8.id, var15, var0.id); // L: 10587
								}
							} else if (Client.isSpellSelected && Skills.method5475(Language.getWidgetFlags(var0))) { // L: 10591
								if ((RouteStrategy.selectedSpellFlags & 16) == 16) { // L: 10592
									class11.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + LoginScreenAnimation.colorStartTag(16748608) + var8.name, 32, var8.id, var15, var0.id); // L: 10593
								}
							} else {
								String[] var9 = var8.inventoryActions; // L: 10598
								int var10 = -1; // L: 10599
								if (Client.shiftClickDrop && KeyHandler.method324()) { // L: 10600
									var10 = var8.getShiftClickIndex(); // L: 10601
								}

								if (Skills.method5475(Language.getWidgetFlags(var0))) { // L: 10603
									for (int var11 = 4; var11 >= 3; --var11) { // L: 10604
										if (var10 != var11) { // L: 10605
											class318.addWidgetItemMenuItem(var0, var8, var15, var11, false); // L: 10606
										}
									}
								}

								int var12 = Language.getWidgetFlags(var0); // L: 10610
								boolean var19 = (var12 >> 31 & 1) != 0; // L: 10612
								if (var19) { // L: 10614
									class11.insertMenuItemNoShift("Use", LoginScreenAnimation.colorStartTag(16748608) + var8.name, 38, var8.id, var15, var0.id); // L: 10615
								}

								Object var10000 = null; // L: 10618
								int var13;
								if (Skills.method5475(Language.getWidgetFlags(var0))) {
									for (var13 = 2; var13 >= 0; --var13) { // L: 10619
										if (var13 != var10) { // L: 10620
											class318.addWidgetItemMenuItem(var0, var8, var15, var13, false); // L: 10621
										}
									}

									if (var10 >= 0) { // L: 10623
										class318.addWidgetItemMenuItem(var0, var8, var15, var10, true); // L: 10624
									}
								}

								var9 = var0.itemActions; // L: 10627
								if (var9 != null) { // L: 10628
									for (var13 = 4; var13 >= 0; --var13) { // L: 10629
										if (var9[var13] != null) { // L: 10630
											byte var14 = 0; // L: 10631
											if (var13 == 0) { // L: 10632
												var14 = 39;
											}

											if (var13 == 1) { // L: 10633
												var14 = 40;
											}

											if (var13 == 2) { // L: 10634
												var14 = 41;
											}

											if (var13 == 3) { // L: 10635
												var14 = 42;
											}

											if (var13 == 4) { // L: 10636
												var14 = 43;
											}

											class11.insertMenuItemNoShift(var9[var13], LoginScreenAnimation.colorStartTag(16748608) + var8.name, var14, var8.id, var15, var0.id); // L: 10637
										}
									}
								}

								class11.insertMenuItemNoShift("Examine", LoginScreenAnimation.colorStartTag(16748608) + var8.name, 1005, var8.id, var15, var0.id); // L: 10642
							}
						}
					}

					++var15; // L: 10647
				}
			}
		}

		if (var0.isIf3) { // L: 10651
			if (Client.isSpellSelected) { // L: 10652
				if (MilliClock.method3115(Language.getWidgetFlags(var0)) && (RouteStrategy.selectedSpellFlags & 32) == 32) { // L: 10653
					class11.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id); // L: 10654
				}
			} else {
				for (var15 = 9; var15 >= 5; --var15) { // L: 10659
					String var16;
					if (!ClientPacket.method4979(Language.getWidgetFlags(var0), var15) && var0.onOp == null) { // L: 10662
						var16 = null; // L: 10663
					} else if (var0.actions != null && var0.actions.length > var15 && var0.actions[var15] != null && var0.actions[var15].trim().length() != 0) { // L: 10666
						var16 = var0.actions[var15]; // L: 10670
					} else {
						var16 = null; // L: 10667
					}

					if (var16 != null) { // L: 10673
						class11.insertMenuItemNoShift(var16, var0.dataText, 1007, var15 + 1, var0.childIndex, var0.id); // L: 10674
					}
				}

				var3 = WorldMapEvent.Widget_getSpellActionName(var0); // L: 10678
				if (var3 != null) { // L: 10679
					class11.insertMenuItemNoShift(var3, var0.dataText, 25, 0, var0.childIndex, var0.id); // L: 10680
				}

				for (var4 = 4; var4 >= 0; --var4) { // L: 10683
					String var5;
					if (!ClientPacket.method4979(Language.getWidgetFlags(var0), var4) && var0.onOp == null) { // L: 10686
						var5 = null; // L: 10687
					} else if (var0.actions != null && var0.actions.length > var4 && var0.actions[var4] != null && var0.actions[var4].trim().length() != 0) { // L: 10690
						var5 = var0.actions[var4]; // L: 10694
					} else {
						var5 = null; // L: 10691
					}

					if (var5 != null) { // L: 10697
						ArchiveLoader.insertMenuItem(var5, var0.dataText, 57, var4 + 1, var0.childIndex, var0.id, var0.prioritizeMenuEntry); // L: 10698
					}
				}

				if (class133.method2813(Language.getWidgetFlags(var0))) { // L: 10702
					class11.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id); // L: 10703
				}
			}
		}

	} // L: 10708
}
