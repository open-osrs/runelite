import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("as")
public class class35 {
	@ObfuscatedName("ra")
	@ObfuscatedGetter(
		intValue = -1989236693
	)
	static int field264;
	@ObfuscatedName("w")
	@Export("operatingSystemName")
	public static String operatingSystemName;
	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "[Loh;"
	)
	@Export("headIconPkSprites")
	static SpritePixels[] headIconPkSprites;
	@ObfuscatedName("v")
	ExecutorService field262;
	@ObfuscatedName("n")
	Future field260;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	final Buffer field261;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	final class31 field268;

	@ObfuscatedSignature(
		descriptor = "(Lnd;Lai;)V"
	)
	public class35(Buffer var1, class31 var2) {
		this.field262 = Executors.newSingleThreadExecutor(); // L: 10
		this.field261 = var1; // L: 16
		this.field268 = var2; // L: 17
		this.method335(); // L: 18
	} // L: 19

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "70"
	)
	public boolean method342() {
		return this.field260.isDone(); // L: 22
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-47"
	)
	public void method332() {
		this.field262.shutdown(); // L: 26
		this.field262 = null; // L: 27
	} // L: 28

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Lnd;",
		garbageValue = "-1675442246"
	)
	public Buffer method331() {
		try {
			return (Buffer)this.field260.get(); // L: 32
		} catch (Exception var2) { // L: 34
			return null; // L: 35
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "4"
	)
	void method335() {
		this.field260 = this.field262.submit(new class29(this, this.field261, this.field268)); // L: 40
	} // L: 41

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(Lef;IIII)V",
		garbageValue = "-336055981"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPCComposition var0, int var1, int var2, int var3) {
		if (Client.menuOptionsCount < 400) { // L: 8995
			if (var0.transforms != null) { // L: 8996
				var0 = var0.transform();
			}

			if (var0 != null) { // L: 8997
				if (var0.isInteractable) { // L: 8998
					if (!var0.isFollower || Client.followerIndex == var1) { // L: 8999
						String var4 = var0.name; // L: 9000
						int var7;
						int var8;
						if (var0.combatLevel != 0) { // L: 9001
							var7 = var0.combatLevel; // L: 9004
							var8 = class93.localPlayer.combatLevel; // L: 9005
							int var9 = var8 - var7; // L: 9007
							String var6;
							if (var9 < -9) { // L: 9008
								var6 = class44.colorStartTag(16711680); // L: 9009
							} else if (var9 < -6) { // L: 9012
								var6 = class44.colorStartTag(16723968); // L: 9013
							} else if (var9 < -3) { // L: 9016
								var6 = class44.colorStartTag(16740352); // L: 9017
							} else if (var9 < 0) { // L: 9020
								var6 = class44.colorStartTag(16756736); // L: 9021
							} else if (var9 > 9) { // L: 9024
								var6 = class44.colorStartTag(65280); // L: 9025
							} else if (var9 > 6) { // L: 9028
								var6 = class44.colorStartTag(4259584); // L: 9029
							} else if (var9 > 3) { // L: 9032
								var6 = class44.colorStartTag(8453888); // L: 9033
							} else if (var9 > 0) { // L: 9036
								var6 = class44.colorStartTag(12648192); // L: 9037
							} else {
								var6 = class44.colorStartTag(16776960); // L: 9040
							}

							var4 = var4 + var6 + " " + " (" + "level-" + var0.combatLevel + ")"; // L: 9042
						}

						if (var0.isFollower && Client.followerOpsLowPriority) { // L: 9044
							Occluder.insertMenuItemNoShift("Examine", class44.colorStartTag(16776960) + var4, 1003, var1, var2, var3); // L: 9045
						}

						if (Client.isItemSelected == 1) { // L: 9048
							Occluder.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class44.colorStartTag(16776960) + var4, 7, var1, var2, var3); // L: 9049
						} else if (Client.isSpellSelected) { // L: 9052
							if ((class4.selectedSpellFlags & 2) == 2) { // L: 9053
								Occluder.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class44.colorStartTag(16776960) + var4, 8, var1, var2, var3); // L: 9054
							}
						} else {
							int var10 = var0.isFollower && Client.followerOpsLowPriority ? 2000 : 0; // L: 9059
							String[] var11 = var0.actions; // L: 9060
							if (var11 != null) { // L: 9061
								for (var7 = 4; var7 >= 0; --var7) { // L: 9062
									if (var11[var7] != null && !var11[var7].equalsIgnoreCase("Attack")) { // L: 9063
										var8 = 0; // L: 9064
										if (var7 == 0) { // L: 9065
											var8 = var10 + 9;
										}

										if (var7 == 1) { // L: 9066
											var8 = var10 + 10;
										}

										if (var7 == 2) { // L: 9067
											var8 = var10 + 11;
										}

										if (var7 == 3) { // L: 9068
											var8 = var10 + 12;
										}

										if (var7 == 4) { // L: 9069
											var8 = var10 + 13;
										}

										Occluder.insertMenuItemNoShift(var11[var7], class44.colorStartTag(16776960) + var4, var8, var1, var2, var3); // L: 9070
									}
								}
							}

							if (var11 != null) { // L: 9075
								for (var7 = 4; var7 >= 0; --var7) { // L: 9076
									if (var11[var7] != null && var11[var7].equalsIgnoreCase("Attack")) { // L: 9077
										short var12 = 0; // L: 9078
										if (Client.npcAttackOption != AttackOption.AttackOption_hidden) { // L: 9079
											if (Client.npcAttackOption == AttackOption.AttackOption_alwaysRightClick || Client.npcAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var0.combatLevel > class93.localPlayer.combatLevel) { // L: 9080
												var12 = 2000; // L: 9081
											}

											var8 = 0; // L: 9083
											if (var7 == 0) { // L: 9084
												var8 = var12 + 9;
											}

											if (var7 == 1) { // L: 9085
												var8 = var12 + 10;
											}

											if (var7 == 2) { // L: 9086
												var8 = var12 + 11;
											}

											if (var7 == 3) { // L: 9087
												var8 = var12 + 12;
											}

											if (var7 == 4) { // L: 9088
												var8 = var12 + 13;
											}

											Occluder.insertMenuItemNoShift(var11[var7], class44.colorStartTag(16776960) + var4, var8, var1, var2, var3); // L: 9089
										}
									}
								}
							}

							if (!var0.isFollower || !Client.followerOpsLowPriority) { // L: 9094
								Occluder.insertMenuItemNoShift("Examine", class44.colorStartTag(16776960) + var4, 1003, var1, var2, var3); // L: 9095
							}
						}

					}
				}
			}
		}
	} // L: 9099
}
