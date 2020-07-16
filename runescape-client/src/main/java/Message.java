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
	static final void method1283(Widget var0, int var1, int var2) {
		if (var0.buttonType == 1) {
			ScriptEvent.insertMenuItemNoShift(var0.buttonText, "", 24, 0, 0, var0.id);
		}

		String var3;
		if (var0.buttonType == 2 && !Client.isSpellSelected) {
			var3 = WorldMapAreaData.method762(var0);
			if (var3 != null) {
				ScriptEvent.insertMenuItemNoShift(var3, ItemContainer.colorStartTag(65280) + var0.spellName, 25, 0, -1, var0.id);
			}
		}

		if (var0.buttonType == 3) {
			ScriptEvent.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id);
		}

		if (var0.buttonType == 4) {
			ScriptEvent.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id);
		}

		if (var0.buttonType == 5) {
			ScriptEvent.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id);
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) {
			ScriptEvent.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id);
		}

		int var4;
		int var6;
		int var7;
		int var13;
		if (var0.type == 2) {
			var13 = 0;

			for (var4 = 0; var4 < var0.height; ++var4) {
				for (int var5 = 0; var5 < var0.width; ++var5) {
					var6 = (var0.paddingX + 32) * var5;
					var7 = (var0.paddingY + 32) * var4;
					if (var13 < 20) {
						var6 += var0.inventoryXOffsets[var13];
						var7 += var0.inventoryYOffsets[var13];
					}

					if (var1 >= var6 && var2 >= var7 && var1 < var6 + 32 && var2 < var7 + 32) {
						Client.dragItemSlotDestination = var13;
						TaskHandler.field2066 = var0;
						if (var0.itemIds[var13] > 0) {
							ItemDefinition var8 = KitDefinition.ItemDefinition_get(var0.itemIds[var13] - 1);
							if (Client.isItemSelected == 1 && FloorUnderlayDefinition.method4615(KeyHandler.getWidgetClickMask(var0))) {
								if (var0.id != AbstractUserComparator.selectedItemWidget || var13 != LoginScreenAnimation.selectedItemSlot) {
									ScriptEvent.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + ItemContainer.colorStartTag(16748608) + var8.name, 31, var8.id, var13, var0.id);
								}
							} else if (Client.isSpellSelected && FloorUnderlayDefinition.method4615(KeyHandler.getWidgetClickMask(var0))) {
								if ((WorldMapSprite.selectedSpellFlags & 16) == 16) {
									ScriptEvent.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + ItemContainer.colorStartTag(16748608) + var8.name, 32, var8.id, var13, var0.id);
								}
							} else {
								String[] var9 = var8.inventoryActions;
								int var10 = -1;
								if (Client.shiftClickDrop && ModelData0.method3375()) {
									var10 = var8.getShiftClickIndex();
								}

								int var11;
								if (FloorUnderlayDefinition.method4615(KeyHandler.getWidgetClickMask(var0))) {
									for (var11 = 4; var11 >= 3; --var11) {
										if (var11 != var10) {
											WallDecoration.addWidgetItemMenuItem(var0, var8, var13, var11, false);
										}
									}
								}

								if (class198.method3774(KeyHandler.getWidgetClickMask(var0))) {
									ScriptEvent.insertMenuItemNoShift("Use", ItemContainer.colorStartTag(16748608) + var8.name, 38, var8.id, var13, var0.id);
								}

								if (FloorUnderlayDefinition.method4615(KeyHandler.getWidgetClickMask(var0))) {
									for (var11 = 2; var11 >= 0; --var11) {
										if (var11 != var10) {
											WallDecoration.addWidgetItemMenuItem(var0, var8, var13, var11, false);
										}
									}

									if (var10 >= 0) {
										WallDecoration.addWidgetItemMenuItem(var0, var8, var13, var10, true);
									}
								}

								var9 = var0.itemActions;
								if (var9 != null) {
									for (var11 = 4; var11 >= 0; --var11) {
										if (var9[var11] != null) {
											byte var12 = 0;
											if (var11 == 0) {
												var12 = 39;
											}

											if (var11 == 1) {
												var12 = 40;
											}

											if (var11 == 2) {
												var12 = 41;
											}

											if (var11 == 3) {
												var12 = 42;
											}

											if (var11 == 4) {
												var12 = 43;
											}

											ScriptEvent.insertMenuItemNoShift(var9[var11], ItemContainer.colorStartTag(16748608) + var8.name, var12, var8.id, var13, var0.id);
										}
									}
								}

								ScriptEvent.insertMenuItemNoShift("Examine", ItemContainer.colorStartTag(16748608) + var8.name, 1005, var8.id, var13, var0.id);
							}
						}
					}

					++var13;
				}
			}
		}

		if (var0.isIf3) {
			if (Client.isSpellSelected) {
				var4 = KeyHandler.getWidgetClickMask(var0);
				boolean var19 = (var4 >> 21 & 1) != 0;
				if (var19 && (WorldMapSprite.selectedSpellFlags & 32) == 32) {
					ScriptEvent.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id);
				}
			} else {
				for (var13 = 9; var13 >= 5; --var13) {
					var6 = KeyHandler.getWidgetClickMask(var0);
					boolean var17 = (var6 >> var13 + 1 & 1) != 0;
					String var14;
					if (!var17 && var0.onOp == null) {
						var14 = null;
					} else if (var0.actions != null && var0.actions.length > var13 && var0.actions[var13] != null && var0.actions[var13].trim().length() != 0) {
						var14 = var0.actions[var13];
					} else {
						var14 = null;
					}

					if (var14 != null) {
						ScriptEvent.insertMenuItemNoShift(var14, var0.dataText, 1007, var13 + 1, var0.childIndex, var0.id);
					}
				}

				var3 = WorldMapAreaData.method762(var0);
				if (var3 != null) {
					ScriptEvent.insertMenuItemNoShift(var3, var0.dataText, 25, 0, var0.childIndex, var0.id);
				}

				for (var4 = 4; var4 >= 0; --var4) {
					var7 = KeyHandler.getWidgetClickMask(var0);
					boolean var18 = (var7 >> var4 + 1 & 1) != 0;
					String var15;
					if (!var18 && var0.onOp == null) {
						var15 = null;
					} else if (var0.actions != null && var0.actions.length > var4 && var0.actions[var4] != null && var0.actions[var4].trim().length() != 0) {
						var15 = var0.actions[var4];
					} else {
						var15 = null;
					}

					if (var15 != null) {
						ApproximateRouteStrategy.insertMenuItem(var15, var0.dataText, 57, var4 + 1, var0.childIndex, var0.id, var0.field2744);
					}
				}

				if (WorldMapLabel.method487(KeyHandler.getWidgetClickMask(var0))) {
					ScriptEvent.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id);
				}
			}
		}

	}
}
