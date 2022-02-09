import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ip")
@Implements("WorldMapAreaData")
public class WorldMapAreaData extends WorldMapArea {
	@ObfuscatedName("np")
	@ObfuscatedGetter(
		intValue = 1959926399
	)
	@Export("selectedItemSlot")
	static int selectedItemSlot;
	@ObfuscatedName("h")
	@Export("worldMapData0Set")
	HashSet worldMapData0Set;
	@ObfuscatedName("q")
	@Export("worldMapData1Set")
	HashSet worldMapData1Set;
	@ObfuscatedName("x")
	@Export("iconList")
	List iconList;

	WorldMapAreaData() {
	} // L: 14

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lpi;Lpi;IZI)V",
		garbageValue = "131197308"
	)
	@Export("init")
	void init(Buffer var1, Buffer var2, int var3, boolean var4) {
		this.read(var1, var3);
		int var5 = var2.readUnsignedShort(); // L: 18
		this.worldMapData0Set = new HashSet(var5); // L: 19

		int var6;
		for (var6 = 0; var6 < var5; ++var6) { // L: 20
			WorldMapData_0 var7 = new WorldMapData_0(); // L: 21

			try {
				var7.init(var2); // L: 23
			} catch (IllegalStateException var12) { // L: 25
				continue; // L: 26
			}

			this.worldMapData0Set.add(var7); // L: 28
		}

		var6 = var2.readUnsignedShort(); // L: 30
		this.worldMapData1Set = new HashSet(var6); // L: 31

		for (int var10 = 0; var10 < var6; ++var10) { // L: 32
			WorldMapData_1 var8 = new WorldMapData_1(); // L: 33

			try {
				var8.init(var2); // L: 35
			} catch (IllegalStateException var11) { // L: 37
				continue; // L: 38
			}

			this.worldMapData1Set.add(var8); // L: 40
		}

		this.initIconsList(var2, var4); // L: 42
	} // L: 43

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Lpi;ZI)V",
		garbageValue = "1007802842"
	)
	@Export("initIconsList")
	void initIconsList(Buffer var1, boolean var2) {
		this.iconList = new LinkedList(); // L: 46
		int var3 = var1.readUnsignedShort(); // L: 47

		for (int var4 = 0; var4 < var3; ++var4) { // L: 48
			int var5 = var1.method7352(); // L: 49
			Coord var6 = new Coord(var1.readInt()); // L: 50
			boolean var7 = var1.readUnsignedByte() == 1; // L: 51
			if (var2 || !var7) { // L: 52
				this.iconList.add(new WorldMapIcon_0((Coord)null, var6, var5, (WorldMapLabel)null)); // L: 53
			}
		}

	} // L: 56

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public static void method4853() {
		while (true) {
			ArchiveDiskAction var0;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 60
				var0 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast(); // L: 61
			} // L: 62

			if (var0 == null) {
				return; // L: 63
			}

			var0.archive.load(var0.archiveDisk, (int)var0.key, var0.data, false); // L: 64
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)[Lkr;",
		garbageValue = "-67"
	)
	public static StudioGame[] method4851() {
		return new StudioGame[]{StudioGame.stellardawn, StudioGame.runescape, StudioGame.game5, StudioGame.oldscape, StudioGame.game4, StudioGame.game3}; // L: 17
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(Lcy;IIIB)V",
		garbageValue = "122"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPC var0, int var1, int var2, int var3) {
		NPCComposition var4 = var0.definition; // L: 9542
		if (Client.menuOptionsCount < 400) { // L: 9543
			if (var4.transforms != null) { // L: 9544
				var4 = var4.transform();
			}

			if (var4 != null) { // L: 9545
				if (var4.isInteractable) { // L: 9546
					if (!var4.isFollower || Client.followerIndex == var1) { // L: 9547
						String var5 = var4.name; // L: 9548
						int var6;
						int var9;
						if (var4.combatLevel != 0 && var0.field1135 != 0) { // L: 9549
							var6 = var0.field1135 != -1 ? var0.field1135 * -1122712175 * 1607900017 : var4.combatLevel * 1860615845 * 475724077; // L: 9550
							var9 = WorldMapSprite.localPlayer.combatLevel; // L: 9553
							int var10 = var9 - var6; // L: 9555
							String var8;
							if (var10 < -9) { // L: 9556
								var8 = LoginScreenAnimation.colorStartTag(16711680); // L: 9557
							} else if (var10 < -6) { // L: 9560
								var8 = LoginScreenAnimation.colorStartTag(16723968); // L: 9561
							} else if (var10 < -3) { // L: 9564
								var8 = LoginScreenAnimation.colorStartTag(16740352); // L: 9565
							} else if (var10 < 0) { // L: 9568
								var8 = LoginScreenAnimation.colorStartTag(16756736); // L: 9569
							} else if (var10 > 9) { // L: 9572
								var8 = LoginScreenAnimation.colorStartTag(65280); // L: 9573
							} else if (var10 > 6) { // L: 9576
								var8 = LoginScreenAnimation.colorStartTag(4259584); // L: 9577
							} else if (var10 > 3) { // L: 9580
								var8 = LoginScreenAnimation.colorStartTag(8453888); // L: 9581
							} else if (var10 > 0) { // L: 9584
								var8 = LoginScreenAnimation.colorStartTag(12648192); // L: 9585
							} else {
								var8 = LoginScreenAnimation.colorStartTag(16776960); // L: 9588
							}

							var5 = var5 + var8 + " " + " (" + "level-" + var6 + ")"; // L: 9590
						}

						if (var4.isFollower && Client.followerOpsLowPriority) { // L: 9592
							class11.insertMenuItemNoShift("Examine", LoginScreenAnimation.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 9593
						}

						if (Client.isItemSelected == 1) { // L: 9596
							class11.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + LoginScreenAnimation.colorStartTag(16776960) + var5, 7, var1, var2, var3); // L: 9597
						} else if (Client.isSpellSelected) { // L: 9600
							if ((RouteStrategy.selectedSpellFlags & 2) == 2) { // L: 9601
								class11.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + LoginScreenAnimation.colorStartTag(16776960) + var5, 8, var1, var2, var3); // L: 9602
							}
						} else {
							var6 = var4.isFollower && Client.followerOpsLowPriority ? 2000 : 0; // L: 9607
							String[] var7 = var4.actions; // L: 9608
							int var11;
							if (var7 != null) { // L: 9609
								for (var11 = 4; var11 >= 0; --var11) { // L: 9610
									if (var7[var11] != null && !var7[var11].equalsIgnoreCase("Attack")) { // L: 9611
										var9 = 0; // L: 9612
										if (var11 == 0) { // L: 9613
											var9 = var6 + 9;
										}

										if (var11 == 1) { // L: 9614
											var9 = var6 + 10;
										}

										if (var11 == 2) { // L: 9615
											var9 = var6 + 11;
										}

										if (var11 == 3) { // L: 9616
											var9 = var6 + 12;
										}

										if (var11 == 4) { // L: 9617
											var9 = var6 + 13;
										}

										class11.insertMenuItemNoShift(var7[var11], LoginScreenAnimation.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 9618
									}
								}
							}

							if (var7 != null) { // L: 9623
								for (var11 = 4; var11 >= 0; --var11) { // L: 9624
									if (var7[var11] != null && var7[var11].equalsIgnoreCase("Attack")) { // L: 9625
										short var12 = 0; // L: 9626
										if (Client.npcAttackOption != AttackOption.AttackOption_hidden) { // L: 9627
											if (AttackOption.AttackOption_alwaysRightClick == Client.npcAttackOption || AttackOption.AttackOption_dependsOnCombatLevels == Client.npcAttackOption && var4.combatLevel > WorldMapSprite.localPlayer.combatLevel) { // L: 9628
												var12 = 2000; // L: 9629
											}

											var9 = 0; // L: 9631
											if (var11 == 0) { // L: 9632
												var9 = var12 + 9;
											}

											if (var11 == 1) { // L: 9633
												var9 = var12 + 10;
											}

											if (var11 == 2) { // L: 9634
												var9 = var12 + 11;
											}

											if (var11 == 3) { // L: 9635
												var9 = var12 + 12;
											}

											if (var11 == 4) { // L: 9636
												var9 = var12 + 13;
											}

											class11.insertMenuItemNoShift(var7[var11], LoginScreenAnimation.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 9637
										}
									}
								}
							}

							if (!var4.isFollower || !Client.followerOpsLowPriority) { // L: 9642
								class11.insertMenuItemNoShift("Examine", LoginScreenAnimation.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 9643
							}
						}

					}
				}
			}
		}
	} // L: 9647

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "20114754"
	)
	static void method4855() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) { // L: 11444
			int var1 = var0.group; // L: 11445
			if (class13.loadInterface(var1)) { // L: 11446
				boolean var2 = true; // L: 11447
				Widget[] var3 = Widget.Widget_interfaceComponents[var1]; // L: 11448

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) { // L: 11449
					if (var3[var4] != null) { // L: 11450
						var2 = var3[var4].isIf3; // L: 11451
						break;
					}
				}

				if (!var2) { // L: 11455
					var4 = (int)var0.key; // L: 11456
					Widget var5 = class130.getWidget(var4); // L: 11457
					if (var5 != null) { // L: 11458
						class112.invalidateWidget(var5);
					}
				}
			}
		}

	} // L: 11462
}
