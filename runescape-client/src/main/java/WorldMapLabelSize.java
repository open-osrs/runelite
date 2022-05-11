import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 553621229
	)
	final int field2708;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -2002311863
	)
	final int field2712;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 216104665
	)
	final int field2714;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(0, 0, 4); // L: 7
		WorldMapLabelSize_medium = new WorldMapLabelSize(2, 1, 2); // L: 8
		WorldMapLabelSize_large = new WorldMapLabelSize(1, 2, 0); // L: 9
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field2708 = var1; // L: 15
		this.field2712 = var2; // L: 16
		this.field2714 = var3; // L: 17
	} // L: 18

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(FI)Z",
		garbageValue = "-459015930"
	)
	boolean method4409(float var1) {
		return var1 >= (float)this.field2714; // L: 21
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Llp;B)V",
		garbageValue = "70"
	)
	public static void method4417(AbstractArchive var0) {
		FloorOverlayDefinition.FloorOverlayDefinition_archive = var0; // L: 24
	} // L: 25

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1257472711"
	)
	public static void method4414() {
		synchronized(MouseHandler.MouseHandler_instance) { // L: 50
			MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile; // L: 51
			MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile; // L: 52
			MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile; // L: 53
			MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile; // L: 54
			MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile; // L: 55
			MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile; // L: 56
			MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile; // L: 57
			MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile; // L: 58
			MouseHandler.MouseHandler_lastButtonVolatile = 0; // L: 59
		}
	} // L: 61

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-55"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (class12.clientPreferences.method2244() != 0 && var1 != 0 && Client.soundEffectCount < 50) { // L: 3789
			Client.soundEffectIds[Client.soundEffectCount] = var0; // L: 3790
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1; // L: 3791
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2; // L: 3792
			Client.soundEffects[Client.soundEffectCount] = null; // L: 3793
			Client.soundLocations[Client.soundEffectCount] = 0; // L: 3794
			++Client.soundEffectCount; // L: 3795
		}

	} // L: 3797

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(Lcd;IIIB)V",
		garbageValue = "46"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPC var0, int var1, int var2, int var3) {
		NPCComposition var4 = var0.definition; // L: 10069
		if (Client.menuOptionsCount < 400) { // L: 10070
			if (var4.transforms != null) { // L: 10071
				var4 = var4.transform();
			}

			if (var4 != null) { // L: 10072
				if (var4.isInteractable) { // L: 10073
					if (!var4.isFollower || Client.followerIndex == var1) { // L: 10074
						String var5 = var0.method2342(); // L: 10075
						int var6;
						if (var4.combatLevel != 0 && var0.field1210 != 0) { // L: 10076
							var6 = var0.field1210 != -1 ? var0.field1210 * 731891927 * -1765430553 : var4.combatLevel * 580256741 * -200769043; // L: 10077
							var5 = var5 + IgnoreList.method6430(var6, ModelData0.localPlayer.combatLevel) + " " + " (" + "level-" + var6 + ")"; // L: 10078
						}

						if (var4.isFollower && Client.followerOpsLowPriority) { // L: 10080
							Projectile.insertMenuItemNoShift("Examine", class166.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 10081
						}

						if (Client.isItemSelected == 1) { // L: 10084
							Projectile.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class166.colorStartTag(16776960) + var5, 7, var1, var2, var3); // L: 10085
						} else if (Client.isSpellSelected) { // L: 10088
							if ((class113.selectedSpellFlags & 2) == 2) { // L: 10089
								Projectile.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class166.colorStartTag(16776960) + var5, 8, var1, var2, var3); // L: 10090
							}
						} else {
							var6 = var4.isFollower && Client.followerOpsLowPriority ? 2000 : 0; // L: 10095
							String[] var7 = var4.actions; // L: 10096
							int var8;
							int var9;
							if (var7 != null) { // L: 10097
								for (var8 = 4; var8 >= 0; --var8) { // L: 10098
									if (var7[var8] != null && !var7[var8].equalsIgnoreCase("Attack")) { // L: 10099
										var9 = 0; // L: 10100
										if (var8 == 0) { // L: 10101
											var9 = var6 + 9;
										}

										if (var8 == 1) { // L: 10102
											var9 = var6 + 10;
										}

										if (var8 == 2) { // L: 10103
											var9 = var6 + 11;
										}

										if (var8 == 3) { // L: 10104
											var9 = var6 + 12;
										}

										if (var8 == 4) { // L: 10105
											var9 = var6 + 13;
										}

										Projectile.insertMenuItemNoShift(var7[var8], class166.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 10106
									}
								}
							}

							if (var7 != null) { // L: 10111
								for (var8 = 4; var8 >= 0; --var8) { // L: 10112
									if (var7[var8] != null && var7[var8].equalsIgnoreCase("Attack")) { // L: 10113
										short var10 = 0; // L: 10114
										if (Client.npcAttackOption != AttackOption.AttackOption_hidden) { // L: 10115
											if (Client.npcAttackOption == AttackOption.AttackOption_alwaysRightClick || AttackOption.AttackOption_dependsOnCombatLevels == Client.npcAttackOption && var4.combatLevel > ModelData0.localPlayer.combatLevel) { // L: 10116
												var10 = 2000; // L: 10117
											}

											var9 = 0; // L: 10119
											if (var8 == 0) { // L: 10120
												var9 = var10 + 9;
											}

											if (var8 == 1) {
												var9 = var10 + 10; // L: 10121
											}

											if (var8 == 2) { // L: 10122
												var9 = var10 + 11;
											}

											if (var8 == 3) { // L: 10123
												var9 = var10 + 12;
											}

											if (var8 == 4) { // L: 10124
												var9 = var10 + 13;
											}

											Projectile.insertMenuItemNoShift(var7[var8], class166.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 10125
										}
									}
								}
							}

							if (!var4.isFollower || !Client.followerOpsLowPriority) { // L: 10130
								Projectile.insertMenuItemNoShift("Examine", class166.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 10131
							}
						}

					}
				}
			}
		}
	} // L: 10135

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "397937565"
	)
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (WorldMapDecoration.loadInterface(var0)) { // L: 11741
			MusicPatchPcmStream.runComponentCloseListeners(NetSocket.Widget_interfaceComponents[var0], var1); // L: 11742
		}
	} // L: 11743
}
