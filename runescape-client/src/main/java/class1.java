import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("k")
final class class1 implements class0 {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	public static AbstractArchive FloorOverlayDefinition_archive;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	static SoundSystem soundSystem;

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lkf;B)V",
		garbageValue = "21"
	)
	public void vmethod70(Object var1, Buffer var2) {
		this.method10((Integer)var1, var2); // L: 20
	} // L: 21

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lkf;I)Ljava/lang/Object;",
		garbageValue = "-453860591"
	)
	public Object vmethod61(Buffer var1) {
		return var1.readInt(); // L: 16
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Lkf;I)V",
		garbageValue = "-1705916618"
	)
	void method10(Integer var1, Buffer var2) {
		var2.writeInt(var1); // L: 12
	} // L: 13

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(ILcy;ZI)I",
		garbageValue = "-1453115535"
	)
	static int method22(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 732
			var0 -= 1000; // L: 733
			var3 = TileItem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 734
		} else {
			var3 = var2 ? Canvas.field438 : class3.field12; // L: 736
		}

		class52.invalidateWidget(var3); // L: 737
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) { // L: 738
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) { // L: 758
				var3.modelType = 2; // L: 759
				var3.modelId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 760
				return 1; // L: 761
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) { // L: 763
				var3.modelType = 3; // L: 764
				var3.modelId = WorldMapLabelSize.localPlayer.appearance.getChatHeadId(); // L: 765
				return 1; // L: 766
			} else {
				return 2; // L: 768
			}
		} else {
			Interpreter.Interpreter_intStackSize -= 2; // L: 739
			int var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 740
			int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 741
			var3.itemId = var4; // L: 742
			var3.itemQuantity = var5; // L: 743
			ItemDefinition var6 = GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var4); // L: 744
			var3.modelAngleX = var6.xan2d; // L: 745
			var3.modelAngleY = var6.yan2d; // L: 746
			var3.modelAngleZ = var6.zan2d; // L: 747
			var3.modelOffsetX = var6.offsetX2d; // L: 748
			var3.modelOffsetY = var6.offsetY2d; // L: 749
			var3.modelZoom = var6.zoom2d; // L: 750
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) {
				var3.itemQuantityMode = 0; // L: 751
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | var6.isStackable == 1) { // L: 752
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2; // L: 753
			}

			if (var3.field2728 > 0) { // L: 754
				var3.modelZoom = var3.modelZoom * 32 / var3.field2728;
			} else if (var3.rawWidth > 0) { // L: 755
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1; // L: 756
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "2143002774"
	)
	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9'; // L: 146
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(Lhq;III)V",
		garbageValue = "362928511"
	)
	static final void Widget_addToMenu(Widget var0, int var1, int var2) {
		if (var0.buttonType == 1) { // L: 9454
			StructDefinition.insertMenuItemNoShift(var0.buttonText, "", 24, 0, 0, var0.id); // L: 9455
		}

		String var3;
		if (var0.buttonType == 2 && !Client.isSpellSelected) { // L: 9458
			var3 = SpriteMask.Widget_getSpellActionName(var0); // L: 9459
			if (var3 != null) { // L: 9460
				StructDefinition.insertMenuItemNoShift(var3, WorldMapAreaData.colorStartTag(65280) + var0.spellName, 25, 0, -1, var0.id); // L: 9461
			}
		}

		if (var0.buttonType == 3) { // L: 9465
			StructDefinition.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id); // L: 9466
		}

		if (var0.buttonType == 4) { // L: 9469
			StructDefinition.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id); // L: 9470
		}

		if (var0.buttonType == 5) { // L: 9473
			StructDefinition.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id); // L: 9474
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) { // L: 9477
			StructDefinition.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id); // L: 9478
		}

		int var4;
		int var19;
		if (var0.type == 2) { // L: 9481
			var19 = 0; // L: 9482

			for (var4 = 0; var4 < var0.height; ++var4) { // L: 9483
				for (int var21 = 0; var21 < var0.width; ++var21) { // L: 9484
					int var6 = (var0.paddingX + 32) * var21; // L: 9485
					int var7 = (var0.paddingY + 32) * var4; // L: 9486
					if (var19 < 20) { // L: 9487
						var6 += var0.inventoryXOffsets[var19]; // L: 9488
						var7 += var0.inventoryYOffsets[var19]; // L: 9489
					}

					if (var1 >= var6 && var2 >= var7 && var1 < var6 + 32 && var2 < var7 + 32) { // L: 9491
						Client.dragItemSlotDestination = var19; // L: 9492
						VerticalAlignment.hoveredItemContainer = var0; // L: 9493
						if (var0.itemIds[var19] > 0) { // L: 9494
							label313: {
								ItemDefinition var8 = GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var0.itemIds[var19] - 1); // L: 9495
								boolean var9;
								int var10;
								if (Client.isItemSelected == 1) { // L: 9497
									var10 = WorldMapIcon_0.getWidgetFlags(var0); // L: 9499
									var9 = (var10 >> 30 & 1) != 0; // L: 9501
									if (var9) { // L: 9503
										if (var0.id != class105.selectedItemWidget || var19 != GrandExchangeOfferUnitPriceComparator.selectedItemSlot) { // L: 9504
											StructDefinition.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + WorldMapAreaData.colorStartTag(16748608) + var8.name, 31, var8.id, var19, var0.id); // L: 9505
										}
										break label313;
									}
								}

								if (Client.isSpellSelected) { // L: 9512
									var10 = WorldMapIcon_0.getWidgetFlags(var0); // L: 9514
									var9 = (var10 >> 30 & 1) != 0; // L: 9516
									if (var9) { // L: 9518
										if ((UserComparator8.selectedSpellFlags & 16) == 16) { // L: 9519
											StructDefinition.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + WorldMapAreaData.colorStartTag(16748608) + var8.name, 32, var8.id, var19, var0.id); // L: 9520
										}
										break label313;
									}
								}

								String[] var22 = var8.inventoryActions; // L: 9526
								var10 = -1; // L: 9527
								if (Client.shiftClickDrop && SoundSystem.shouldPrioritizeDrop()) { // L: 9528
									var10 = var8.getShiftClickIndex(); // L: 9529
								}

								int var12 = WorldMapIcon_0.getWidgetFlags(var0); // L: 9532
								boolean var11 = (var12 >> 30 & 1) != 0; // L: 9534
								if (var11) { // L: 9536
									for (int var13 = 4; var13 >= 3; --var13) { // L: 9537
										if (var13 != var10) { // L: 9538
											class247.addWidgetItemMenuItem(var0, var8, var19, var13, false); // L: 9539
										}
									}
								}

								int var14 = WorldMapIcon_0.getWidgetFlags(var0); // L: 9543
								boolean var23 = (var14 >> 31 & 1) != 0; // L: 9545
								if (var23) { // L: 9547
									StructDefinition.insertMenuItemNoShift("Use", WorldMapAreaData.colorStartTag(16748608) + var8.name, 38, var8.id, var19, var0.id); // L: 9548
								}

								int var16 = WorldMapIcon_0.getWidgetFlags(var0); // L: 9552
								boolean var15 = (var16 >> 30 & 1) != 0; // L: 9554
								int var17;
								if (var15) { // L: 9556
									for (var17 = 2; var17 >= 0; --var17) { // L: 9557
										if (var17 != var10) { // L: 9558
											class247.addWidgetItemMenuItem(var0, var8, var19, var17, false); // L: 9559
										}
									}

									if (var10 >= 0) { // L: 9561
										class247.addWidgetItemMenuItem(var0, var8, var19, var10, true); // L: 9562
									}
								}

								var22 = var0.itemActions; // L: 9565
								if (var22 != null) { // L: 9566
									for (var17 = 4; var17 >= 0; --var17) { // L: 9567
										if (var22[var17] != null) { // L: 9568
											byte var18 = 0; // L: 9569
											if (var17 == 0) { // L: 9570
												var18 = 39;
											}

											if (var17 == 1) { // L: 9571
												var18 = 40;
											}

											if (var17 == 2) { // L: 9572
												var18 = 41;
											}

											if (var17 == 3) { // L: 9573
												var18 = 42;
											}

											if (var17 == 4) { // L: 9574
												var18 = 43;
											}

											StructDefinition.insertMenuItemNoShift(var22[var17], WorldMapAreaData.colorStartTag(16748608) + var8.name, var18, var8.id, var19, var0.id); // L: 9575
										}
									}
								}

								StructDefinition.insertMenuItemNoShift("Examine", WorldMapAreaData.colorStartTag(16748608) + var8.name, 1005, var8.id, var19, var0.id); // L: 9580
							}
						}
					}

					++var19; // L: 9586
				}
			}
		}

		if (var0.isIf3) { // L: 9590
			if (Client.isSpellSelected) { // L: 9591
				var4 = WorldMapIcon_0.getWidgetFlags(var0); // L: 9593
				boolean var24 = (var4 >> 21 & 1) != 0; // L: 9595
				if (var24 && (UserComparator8.selectedSpellFlags & 32) == 32) { // L: 9597
					StructDefinition.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id); // L: 9598
				}
			} else {
				for (var19 = 9; var19 >= 5; --var19) { // L: 9603
					String var20 = WorldMapAreaData.method756(var0, var19); // L: 9604
					if (var20 != null) { // L: 9605
						StructDefinition.insertMenuItemNoShift(var20, var0.dataText, 1007, var19 + 1, var0.childIndex, var0.id); // L: 9606
					}
				}

				var3 = SpriteMask.Widget_getSpellActionName(var0); // L: 9610
				if (var3 != null) { // L: 9611
					StructDefinition.insertMenuItemNoShift(var3, var0.dataText, 25, 0, var0.childIndex, var0.id); // L: 9612
				}

				for (var4 = 4; var4 >= 0; --var4) { // L: 9615
					String var5 = WorldMapAreaData.method756(var0, var4); // L: 9616
					if (var5 != null) { // L: 9617
						Tiles.insertMenuItem(var5, var0.dataText, 57, var4 + 1, var0.childIndex, var0.id, var0.prioritizeMenuEntry); // L: 9618
					}
				}

				if (class39.Widget_hasContinueOption(WorldMapIcon_0.getWidgetFlags(var0))) { // L: 9622
					StructDefinition.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id); // L: 9623
				}
			}
		}

	} // L: 9628
}
