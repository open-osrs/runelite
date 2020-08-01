import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("br")
@Implements("Message")
public class Message extends DualNode {
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("archive1")
	static Archive archive1;
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 397960109
	)
	@Export("count")
	int count;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -2015162379
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 195455957
	)
	@Export("type")
	int type;
	@ObfuscatedName("j")
	@Export("sender")
	String sender;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("senderUsername")
	Username senderUsername;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	@Export("isFromFriend0")
	TriBool isFromFriend0;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	@Export("isFromIgnored0")
	TriBool isFromIgnored0;
	@ObfuscatedName("u")
	@Export("prefix")
	String prefix;
	@ObfuscatedName("a")
	@Export("text")
	String text;

	Message(int var1, String var2, String var3, String var4) {
		this.isFromFriend0 = TriBool.TriBool_unknown;
		this.isFromIgnored0 = TriBool.TriBool_unknown;
		this.set(var1, var2, var3, var4);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-427651151"
	)
	@Export("set")
	void set(int var1, String var2, String var3, String var4) {
		int var5 = ++Messages.Messages_count - 1;
		this.count = var5;
		this.cycle = Client.cycle;
		this.type = var1;
		this.sender = var2;
		this.fillSenderUsername();
		this.prefix = var3;
		this.text = var4;
		this.clearIsFromFriend();
		this.clearIsFromIgnored();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2093900647"
	)
	@Export("clearIsFromFriend")
	void clearIsFromFriend() {
		this.isFromFriend0 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1408976904"
	)
	@Export("isFromFriend")
	final boolean isFromFriend() {
		if (this.isFromFriend0 == TriBool.TriBool_unknown) {
			this.fillIsFromFriend();
		}

		return this.isFromFriend0 == TriBool.TriBool_true;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "511529108"
	)
	@Export("fillIsFromFriend")
	void fillIsFromFriend() {
		this.isFromFriend0 = ModeWhere.friendSystem.friendsList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "108"
	)
	@Export("clearIsFromIgnored")
	void clearIsFromIgnored() {
		this.isFromIgnored0 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-124"
	)
	@Export("isFromIgnored")
	final boolean isFromIgnored() {
		if (this.isFromIgnored0 == TriBool.TriBool_unknown) {
			this.fillIsFromIgnored();
		}

		return this.isFromIgnored0 == TriBool.TriBool_true;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-558597226"
	)
	@Export("fillIsFromIgnored")
	void fillIsFromIgnored() {
		this.isFromIgnored0 = ModeWhere.friendSystem.ignoreList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1793288574"
	)
	@Export("fillSenderUsername")
	final void fillSenderUsername() {
		if (this.sender != null) {
			this.senderUsername = new Username(BuddyRankComparator.method3556(this.sender), class195.loginType);
		} else {
			this.senderUsername = null;
		}

	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(Lhd;III)V",
		garbageValue = "-1019531565"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget widget, int var1, int var2) {
		if (widget.buttonType == 1) {
			ScriptEvent.insertMenuItemNoShift(widget.buttonText, "", 24, 0, 0, widget.id);
		}

		String var3;
		if (widget.buttonType == 2 && !Client.isSpellSelected) {
			var3 = WorldMapAreaData.Widget_getSpellActionName(widget);
			if (var3 != null) {
				ScriptEvent.insertMenuItemNoShift(var3, ItemContainer.colorStartTag(65280) + widget.spellName, 25, 0, -1, widget.id);
			}
		}

		if (widget.buttonType == 3) {
			ScriptEvent.insertMenuItemNoShift("Close", "", 26, 0, 0, widget.id);
		}

		if (widget.buttonType == 4) {
			ScriptEvent.insertMenuItemNoShift(widget.buttonText, "", 28, 0, 0, widget.id);
		}

		if (widget.buttonType == 5) {
			ScriptEvent.insertMenuItemNoShift(widget.buttonText, "", 29, 0, 0, widget.id);
		}

		if (widget.buttonType == 6 && Client.meslayerContinueWidget == null) {
			ScriptEvent.insertMenuItemNoShift(widget.buttonText, "", 30, 0, -1, widget.id);
		}

		int var4;
		int var6;
		int var7;
		int var13;
		if (widget.type == 2) {
			var13 = 0;

			for (var4 = 0; var4 < widget.height; ++var4) {
				for (int var5 = 0; var5 < widget.width; ++var5) {
					var6 = (widget.paddingX + 32) * var5;
					var7 = (widget.paddingY + 32) * var4;
					if (var13 < 20) {
						var6 += widget.inventoryXOffsets[var13];
						var7 += widget.inventoryYOffsets[var13];
					}

					if (var1 >= var6 && var2 >= var7 && var1 < var6 + 32 && var2 < var7 + 32) {
						Client.dragItemSlotDestination = var13;
						TaskHandler.hoveredItemContainer = widget;
						if (widget.itemIds[var13] > 0) {
							ItemDefinition itemDef = KitDefinition.ItemDefinition_get(widget.itemIds[var13] - 1);
							if (Client.isItemSelected == 1 && FloorUnderlayDefinition.Widget_isItemContainer(KeyHandler.getWidgetFlags(widget))) {
								if (widget.id != AbstractUserComparator.selectedItemWidget || var13 != LoginScreenAnimation.selectedItemSlot) {
									ScriptEvent.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + ItemContainer.colorStartTag(16748608) + itemDef.name, 31, itemDef.id, var13, widget.id);
								}
							} else if (Client.isSpellSelected && FloorUnderlayDefinition.Widget_isItemContainer(KeyHandler.getWidgetFlags(widget))) {
								if ((WorldMapSprite.selectedSpellFlags & 16) == 16) {
									ScriptEvent.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + ItemContainer.colorStartTag(16748608) + itemDef.name, 32, itemDef.id, var13, widget.id);
								}
							} else {
								String[] actionsAry = itemDef.inventoryActions;
								int shiftClickIdx = -1;
								if (Client.shiftClickDrop && ModelData0.shouldPrioritizeDrop()) {
									shiftClickIdx = itemDef.getShiftClickIndex();
								}

								int loopIdx;
								if (FloorUnderlayDefinition.Widget_isItemContainer(KeyHandler.getWidgetFlags(widget))) {
									for (loopIdx = 4; loopIdx >= 3; --loopIdx) {
										if (loopIdx != shiftClickIdx) {
											WallDecoration.addWidgetItemMenuItem(widget, itemDef, var13, loopIdx, false);
										}
									}
								}

								if (class198.Widget_containerHasUseOption(KeyHandler.getWidgetFlags(widget))) {
									ScriptEvent.insertMenuItemNoShift("Use", ItemContainer.colorStartTag(16748608) + itemDef.name, 38, itemDef.id, var13, widget.id);
								}

								if (FloorUnderlayDefinition.Widget_isItemContainer(KeyHandler.getWidgetFlags(widget))) {
									for (loopIdx = 2; loopIdx >= 0; --loopIdx) {
										if (loopIdx != shiftClickIdx) {
											WallDecoration.addWidgetItemMenuItem(widget, itemDef, var13, loopIdx, false);
										}
									}

									if (shiftClickIdx >= 0) {
										WallDecoration.addWidgetItemMenuItem(widget, itemDef, var13, shiftClickIdx, true);
									}
								}

								actionsAry = widget.itemActions;
								if (actionsAry != null) {
									for (loopIdx = 4; loopIdx >= 0; --loopIdx) {
										if (actionsAry[loopIdx] != null) {
											byte opcode = 0;
											if (loopIdx == 0) {
												opcode = 39;
											}

											if (loopIdx == 1) {
												opcode = 40;
											}

											if (loopIdx == 2) {
												opcode = 41;
											}

											if (loopIdx == 3) {
												opcode = 42;
											}

											if (loopIdx == 4) {
												opcode = 43;
											}

											ScriptEvent.insertMenuItemNoShift(actionsAry[loopIdx], ItemContainer.colorStartTag(16748608) + itemDef.name, opcode, itemDef.id, var13, widget.id);
										}
									}
								}

								ScriptEvent.insertMenuItemNoShift("Examine", ItemContainer.colorStartTag(16748608) + itemDef.name, 1005, itemDef.id, var13, widget.id);
							}
						}
					}

					++var13;
				}
			}
		}

		if (widget.isIf3) {
			if (Client.isSpellSelected) {
				var4 = KeyHandler.getWidgetFlags(widget);
				boolean var19 = (var4 >> 21 & 1) != 0;
				if (var19 && (WorldMapSprite.selectedSpellFlags & 32) == 32) {
					ScriptEvent.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + widget.dataText, 58, 0, widget.childIndex, widget.id);
				}
			} else {
				for (var13 = 9; var13 >= 5; --var13) {
					var6 = KeyHandler.getWidgetFlags(widget);
					boolean var17 = (var6 >> var13 + 1 & 1) != 0;
					String var14;
					if (!var17 && widget.onOp == null) {
						var14 = null;
					} else if (widget.actions != null && widget.actions.length > var13 && widget.actions[var13] != null && widget.actions[var13].trim().length() != 0) {
						var14 = widget.actions[var13];
					} else {
						var14 = null;
					}

					if (var14 != null) {
						ScriptEvent.insertMenuItemNoShift(var14, widget.dataText, 1007, var13 + 1, widget.childIndex, widget.id);
					}
				}

				var3 = WorldMapAreaData.Widget_getSpellActionName(widget);
				if (var3 != null) {
					ScriptEvent.insertMenuItemNoShift(var3, widget.dataText, 25, 0, widget.childIndex, widget.id);
				}

				for (var4 = 4; var4 >= 0; --var4) {
					var7 = KeyHandler.getWidgetFlags(widget);
					boolean var18 = (var7 >> var4 + 1 & 1) != 0;
					String var15;
					if (!var18 && widget.onOp == null) {
						var15 = null;
					} else if (widget.actions != null && widget.actions.length > var4 && widget.actions[var4] != null && widget.actions[var4].trim().length() != 0) {
						var15 = widget.actions[var4];
					} else {
						var15 = null;
					}

					if (var15 != null) {
						ApproximateRouteStrategy.insertMenuItem(var15, widget.dataText, 57, var4 + 1, widget.childIndex, widget.id, widget.prioritizeMenuEntry);
					}
				}

				if (WorldMapLabel.Widget_hasContinueOption(KeyHandler.getWidgetFlags(widget))) {
					ScriptEvent.insertMenuItemNoShift("Continue", "", 30, 0, widget.childIndex, widget.id);
				}
			}
		}

	}
}
