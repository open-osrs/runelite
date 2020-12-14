import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
@Implements("TileItem")
public final class TileItem extends Renderable
{
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
	} // L: 11

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Leh;",
		garbageValue = "-1814248977"
	)
	@Export("getModel")
	protected final Model getModel() {
		return SecureRandomCallable.ItemDefinition_get(this.id).getModel(this.quantity); // L: 14
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)Lik;",
		garbageValue = "93"
	)
	@Export("SpotAnimationDefinition_get")
	public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
		SpotAnimationDefinition var1 = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.get((long)var0); // L: 37
		if (var1 != null) { // L: 38
			return var1;
		} else {
			byte[] var2 = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, var0);
			var1 = new SpotAnimationDefinition(); // L: 40
			var1.id = var0; // L: 41
			if (var2 != null) { // L: 42
				var1.decode(new Buffer(var2));
			}

			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, (long)var0); // L: 43
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
		int var3 = (var1 << 8) + var0; // L: 39
		Script var6 = (Script)Script.Script_cached.get((long)(var3 << 16)); // L: 44
		Script var5;
		if (var6 != null) { // L: 45
			var5 = var6; // L: 46
		} else {
			String var7 = String.valueOf(var3); // L: 49
			int var8 = PacketBufferNode.archive12.getGroupId(var7); // L: 50
			if (var8 == -1) { // L: 51
				var5 = null; // L: 52
			} else {
				label58: {
					byte[] var9 = PacketBufferNode.archive12.takeFileFlat(var8); // L: 55
					if (var9 != null) { // L: 56
						if (var9.length <= 1) { // L: 57
							var5 = null; // L: 58
							break label58; // L: 59
						}

						var6 = Actor.newScript(var9);
						if (var6 != null) {
							Script.Script_cached.put(var6, (long)(var3 << 16)); // L: 63
							var5 = var6;
							break label58; // L: 65
						}
					}

					var5 = null; // L: 68
				}
			}
		}

		if (var5 != null) { // L: 71
			return var5; // L: 72
		} else {
			int var4 = MusicPatchPcmStream.method3954(var2, var0); // L: 74
			Script var12 = (Script)Script.Script_cached.get((long)(var4 << 16)); // L: 77
			Script var13;
			if (var12 != null) { // L: 78
				var13 = var12; // L: 79
			} else {
				String var14 = String.valueOf(var4); // L: 82
				int var10 = PacketBufferNode.archive12.getGroupId(var14); // L: 83
				if (var10 == -1) { // L: 84
					var13 = null; // L: 85
				} else {
					byte[] var11 = PacketBufferNode.archive12.takeFileFlat(var10); // L: 88
					if (var11 != null) { // L: 89
						if (var11.length <= 1) { // L: 90
							var13 = null; // L: 91
							return var13 != null ? var13 : null; // L: 104 107
						}

						var12 = Actor.newScript(var11); // L: 94
						if (var12 != null) { // L: 95
							Script.Script_cached.put(var12, (long)(var4 << 16)); // L: 96
							var13 = var12; // L: 97
							return var13 != null ? var13 : null;
						}
					}

					var13 = null; // L: 101
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
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 61

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next(); // L: 62
			var1.clearIsFromFriend(); // L: 64
		}

	} // L: 67

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1747466644"
	)
	public static void method2187() {
		ItemComposition.ItemDefinition_cached.clear(); // L: 565
		ItemComposition.ItemDefinition_cachedModels.clear(); // L: 566
		ItemComposition.ItemDefinition_cachedSprites.clear(); // L: 567
	} // L: 568

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(Ljd;IIIS)V",
		garbageValue = "9349"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPCComposition var0, int var1, int var2, int var3) {
		if (Client.menuOptionsCount < 400) { // L: 8719
			if (var0.transforms != null) { // L: 8720
				var0 = var0.transform();
			}

			if (var0 != null) { // L: 8721
				if (var0.isInteractable) { // L: 8722
					if (!var0.isFollower || Client.followerIndex == var1) { // L: 8723
						String var4 = var0.name; // L: 8724
						int var7;
						int var8;
						if (var0.combatLevel != 0) { // L: 8725
							var7 = var0.combatLevel; // L: 8728
							var8 = PlayerAppearance.localPlayer.combatLevel; // L: 8729
							int var9 = var8 - var7; // L: 8731
							String var6;
							if (var9 < -9) { // L: 8732
								var6 = class23.colorStartTag(16711680); // L: 8733
							} else if (var9 < -6) { // L: 8736
								var6 = class23.colorStartTag(16723968); // L: 8737
							} else if (var9 < -3) { // L: 8740
								var6 = class23.colorStartTag(16740352); // L: 8741
							} else if (var9 < 0) { // L: 8744
								var6 = class23.colorStartTag(16756736); // L: 8745
							} else if (var9 > 9) { // L: 8748
								var6 = class23.colorStartTag(65280); // L: 8749
							} else if (var9 > 6) { // L: 8752
								var6 = class23.colorStartTag(4259584); // L: 8753
							} else if (var9 > 3) { // L: 8756
								var6 = class23.colorStartTag(8453888); // L: 8757
							} else if (var9 > 0) { // L: 8760
								var6 = class23.colorStartTag(12648192); // L: 8761
							} else {
								var6 = class23.colorStartTag(16776960); // L: 8764
							}

							var4 = var4 + var6 + " " + " (" + "level-" + var0.combatLevel + ")"; // L: 8766
						}

						if (var0.isFollower && Client.followerOpsLowPriority) { // L: 8768
							WorldMapRegion.insertMenuItemNoShift("Examine", class23.colorStartTag(16776960) + var4, 1003, var1, var2, var3); // L: 8769
						}

						if (Client.isItemSelected == 1) { // L: 8772
							WorldMapRegion.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class23.colorStartTag(16776960) + var4, 7, var1, var2, var3); // L: 8773
						} else if (Client.isSpellSelected) { // L: 8776
							if ((Player.selectedSpellFlags & 2) == 2) { // L: 8777
								WorldMapRegion.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class23.colorStartTag(16776960) + var4, 8, var1, var2, var3); // L: 8778
							}
						} else {
							int var10 = var0.isFollower && Client.followerOpsLowPriority ? 2000 : 0; // L: 8783
							String[] var11 = var0.actions; // L: 8784
							if (var11 != null) { // L: 8785
								for (var7 = 4; var7 >= 0; --var7) { // L: 8786
									if (var11[var7] != null && !var11[var7].equalsIgnoreCase("Attack")) { // L: 8787
										var8 = 0; // L: 8788
										if (var7 == 0) { // L: 8789
											var8 = var10 + 9;
										}

										if (var7 == 1) { // L: 8790
											var8 = var10 + 10;
										}

										if (var7 == 2) { // L: 8791
											var8 = var10 + 11;
										}

										if (var7 == 3) { // L: 8792
											var8 = var10 + 12;
										}

										if (var7 == 4) { // L: 8793
											var8 = var10 + 13;
										}

										WorldMapRegion.insertMenuItemNoShift(var11[var7], class23.colorStartTag(16776960) + var4, var8, var1, var2, var3); // L: 8794
									}
								}
							}

							if (var11 != null) { // L: 8799
								for (var7 = 4; var7 >= 0; --var7) { // L: 8800
									if (var11[var7] != null && var11[var7].equalsIgnoreCase("Attack")) { // L: 8801
										short var12 = 0; // L: 8802
										if (AttackOption.AttackOption_hidden != Client.npcAttackOption) { // L: 8803
											if (Client.npcAttackOption == AttackOption.AttackOption_alwaysRightClick || AttackOption.AttackOption_dependsOnCombatLevels == Client.npcAttackOption && var0.combatLevel > PlayerAppearance.localPlayer.combatLevel) { // L: 8804
												var12 = 2000; // L: 8805
											}

											var8 = 0; // L: 8807
											if (var7 == 0) { // L: 8808
												var8 = var12 + 9;
											}

											if (var7 == 1) { // L: 8809
												var8 = var12 + 10;
											}

											if (var7 == 2) { // L: 8810
												var8 = var12 + 11;
											}

											if (var7 == 3) { // L: 8811
												var8 = var12 + 12;
											}

											if (var7 == 4) { // L: 8812
												var8 = var12 + 13;
											}

											WorldMapRegion.insertMenuItemNoShift(var11[var7], class23.colorStartTag(16776960) + var4, var8, var1, var2, var3); // L: 8813
										}
									}
								}
							}

							if (!var0.isFollower || !Client.followerOpsLowPriority) { // L: 8818
								WorldMapRegion.insertMenuItemNoShift("Examine", class23.colorStartTag(16776960) + var4, 1003, var1, var2, var3); // L: 8819
							}
						}

					}
				}
			}
		}
	} // L: 8823

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(Lhe;IIZB)V",
		garbageValue = "-18"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width; // L: 9497
		int var5 = var0.height; // L: 9498
		if (var0.widthAlignment == 0) { // L: 9499
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) { // L: 9500
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) { // L: 9501
			var0.width = var0.rawWidth * var1 >> 14;
		}

		if (var0.heightAlignment == 0) { // L: 9502
			var0.height = var0.rawHeight;
		} else if (var0.heightAlignment == 1) { // L: 9503
			var0.height = var2 - var0.rawHeight;
		} else if (var0.heightAlignment == 2) { // L: 9504
			var0.height = var2 * var0.rawHeight >> 14;
		}

		if (var0.widthAlignment == 4) { // L: 9505
			var0.width = var0.height * var0.field2660 / var0.field2604;
		}

		if (var0.heightAlignment == 4) { // L: 9506
			var0.height = var0.field2604 * var0.width / var0.field2660;
		}

		if (var0.contentType == 1337) { // L: 9507
			Client.viewportWidget = var0;
		}

		if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) { // L: 9508
			ScriptEvent var6 = new ScriptEvent(); // L: 9509
			var6.widget = var0; // L: 9510
			var6.args = var0.onResize; // L: 9511
			Client.scriptEvents.addFirst(var6); // L: 9512
		}

	} // L: 9514
}
