import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
@Implements("TileItem")
public final class TileItem extends Entity {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1316978929
	)
	@Export("id")
	int id;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 277715035
	)
	@Export("quantity")
	int quantity;

	TileItem() {
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Leh;",
		garbageValue = "-1814248977"
	)
	@Export("getModel")
	protected final Model getModel() {
		return SecureRandomCallable.ItemDefinition_get(this.id).getModel(this.quantity);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)Lik;",
		garbageValue = "93"
	)
	@Export("SpotAnimationDefinition_get")
	public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
		SpotAnimationDefinition var1 = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, var0);
			var1 = new SpotAnimationDefinition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIIS)Lcs;",
		garbageValue = "-4905"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = (var1 << 8) + var0;
		Script var6 = (Script)Script.Script_cached.get((long)(var3 << 16));
		Script var5;
		if (var6 != null) {
			var5 = var6;
		} else {
			String var7 = String.valueOf(var3);
			int var8 = PacketBufferNode.archive12.getGroupId(var7);
			if (var8 == -1) {
				var5 = null;
			} else {
				label58: {
					byte[] var9 = PacketBufferNode.archive12.takeFileFlat(var8);
					if (var9 != null) {
						if (var9.length <= 1) {
							var5 = null;
							break label58;
						}

						var6 = Actor.newScript(var9);
						if (var6 != null) {
							Script.Script_cached.put(var6, (long)(var3 << 16));
							var5 = var6;
							break label58;
						}
					}

					var5 = null;
				}
			}
		}

		if (var5 != null) {
			return var5;
		} else {
			int var4 = MusicPatchPcmStream.method3954(var2, var0);
			Script var12 = (Script)Script.Script_cached.get((long)(var4 << 16));
			Script var13;
			if (var12 != null) {
				var13 = var12;
			} else {
				String var14 = String.valueOf(var4);
				int var10 = PacketBufferNode.archive12.getGroupId(var14);
				if (var10 == -1) {
					var13 = null;
				} else {
					byte[] var11 = PacketBufferNode.archive12.takeFileFlat(var10);
					if (var11 != null) {
						if (var11.length <= 1) {
							var13 = null;
							return var13 != null ? var13 : null;
						}

						var12 = Actor.newScript(var11);
						if (var12 != null) {
							Script.Script_cached.put(var12, (long)(var4 << 16));
							var13 = var12;
							return var13 != null ? var13 : null;
						}
					}

					var13 = null;
				}
			}

			return var13 != null ? var13 : null;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-263304274"
	)
	static void method2189() {
		Iterator var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next();
			var1.clearIsFromFriend();
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1747466644"
	)
	public static void method2187() {
		ItemDefinition.ItemDefinition_cached.clear();
		ItemDefinition.ItemDefinition_cachedModels.clear();
		ItemDefinition.ItemDefinition_cachedSprites.clear();
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(Ljd;IIIS)V",
		garbageValue = "9349"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPCDefinition var0, int var1, int var2, int var3) {
		if (Client.menuOptionsCount < 400) {
			if (var0.transforms != null) {
				var0 = var0.transform();
			}

			if (var0 != null) {
				if (var0.isInteractable) {
					if (!var0.isFollower || Client.followerIndex == var1) {
						String var4 = var0.name;
						int var7;
						int var8;
						if (var0.combatLevel != 0) {
							var7 = var0.combatLevel;
							var8 = PlayerAppearance.localPlayer.combatLevel;
							int var9 = var8 - var7;
							String var6;
							if (var9 < -9) {
								var6 = class23.colorStartTag(16711680);
							} else if (var9 < -6) {
								var6 = class23.colorStartTag(16723968);
							} else if (var9 < -3) {
								var6 = class23.colorStartTag(16740352);
							} else if (var9 < 0) {
								var6 = class23.colorStartTag(16756736);
							} else if (var9 > 9) {
								var6 = class23.colorStartTag(65280);
							} else if (var9 > 6) {
								var6 = class23.colorStartTag(4259584);
							} else if (var9 > 3) {
								var6 = class23.colorStartTag(8453888);
							} else if (var9 > 0) {
								var6 = class23.colorStartTag(12648192);
							} else {
								var6 = class23.colorStartTag(16776960);
							}

							var4 = var4 + var6 + " " + " (" + "level-" + var0.combatLevel + ")";
						}

						if (var0.isFollower && Client.followerOpsLowPriority) {
							WorldMapRegion.insertMenuItemNoShift("Examine", class23.colorStartTag(16776960) + var4, 1003, var1, var2, var3);
						}

						if (Client.isItemSelected == 1) {
							WorldMapRegion.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class23.colorStartTag(16776960) + var4, 7, var1, var2, var3);
						} else if (Client.isSpellSelected) {
							if ((Player.selectedSpellFlags & 2) == 2) {
								WorldMapRegion.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class23.colorStartTag(16776960) + var4, 8, var1, var2, var3);
							}
						} else {
							int var10 = var0.isFollower && Client.followerOpsLowPriority ? 2000 : 0;
							String[] var11 = var0.actions;
							if (var11 != null) {
								for (var7 = 4; var7 >= 0; --var7) {
									if (var11[var7] != null && !var11[var7].equalsIgnoreCase("Attack")) {
										var8 = 0;
										if (var7 == 0) {
											var8 = var10 + 9;
										}

										if (var7 == 1) {
											var8 = var10 + 10;
										}

										if (var7 == 2) {
											var8 = var10 + 11;
										}

										if (var7 == 3) {
											var8 = var10 + 12;
										}

										if (var7 == 4) {
											var8 = var10 + 13;
										}

										WorldMapRegion.insertMenuItemNoShift(var11[var7], class23.colorStartTag(16776960) + var4, var8, var1, var2, var3);
									}
								}
							}

							if (var11 != null) {
								for (var7 = 4; var7 >= 0; --var7) {
									if (var11[var7] != null && var11[var7].equalsIgnoreCase("Attack")) {
										short var12 = 0;
										if (AttackOption.AttackOption_hidden != Client.npcAttackOption) {
											if (Client.npcAttackOption == AttackOption.AttackOption_alwaysRightClick || AttackOption.AttackOption_dependsOnCombatLevels == Client.npcAttackOption && var0.combatLevel > PlayerAppearance.localPlayer.combatLevel) {
												var12 = 2000;
											}

											var8 = 0;
											if (var7 == 0) {
												var8 = var12 + 9;
											}

											if (var7 == 1) {
												var8 = var12 + 10;
											}

											if (var7 == 2) {
												var8 = var12 + 11;
											}

											if (var7 == 3) {
												var8 = var12 + 12;
											}

											if (var7 == 4) {
												var8 = var12 + 13;
											}

											WorldMapRegion.insertMenuItemNoShift(var11[var7], class23.colorStartTag(16776960) + var4, var8, var1, var2, var3);
										}
									}
								}
							}

							if (!var0.isFollower || !Client.followerOpsLowPriority) {
								WorldMapRegion.insertMenuItemNoShift("Examine", class23.colorStartTag(16776960) + var4, 1003, var1, var2, var3);
							}
						}

					}
				}
			}
		}
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(Lhe;IIZB)V",
		garbageValue = "-18"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width;
		int var5 = var0.height;
		if (var0.widthAlignment == 0) {
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) {
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) {
			var0.width = var0.rawWidth * var1 >> 14;
		}

		if (var0.heightAlignment == 0) {
			var0.height = var0.rawHeight;
		} else if (var0.heightAlignment == 1) {
			var0.height = var2 - var0.rawHeight;
		} else if (var0.heightAlignment == 2) {
			var0.height = var2 * var0.rawHeight >> 14;
		}

		if (var0.widthAlignment == 4) {
			var0.width = var0.height * var0.field2660 / var0.field2604;
		}

		if (var0.heightAlignment == 4) {
			var0.height = var0.field2604 * var0.width / var0.field2660;
		}

		if (var0.contentType == 1337) {
			Client.viewportWidget = var0;
		}

		if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) {
			ScriptEvent var6 = new ScriptEvent();
			var6.widget = var0;
			var6.args = var0.onResize;
			Client.scriptEvents.addFirst(var6);
		}

	}
}
