import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mx")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "[Lof;"
	)
	@Export("title_muteSprite")
	static IndexedSprite[] title_muteSprite;
	@ObfuscatedName("t")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full"); // L: 7
		FontName_plain12 = new FontName("p12_full"); // L: 8
		FontName_bold12 = new FontName("b12_full"); // L: 9
		FontName_verdana11 = new FontName("verdana_11pt_regular"); // L: 10
		FontName_verdana13 = new FontName("verdana_13pt_regular"); // L: 11
		FontName_verdana15 = new FontName("verdana_15pt_regular"); // L: 12
	}

	FontName(String var1) {
		this.name = var1; // L: 16
	} // L: 17

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "-605392872"
	)
	public static int method6162(CharSequence var0) {
		return class18.method255(var0, 10, true); // L: 76
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "2091708586"
	)
	static final int method6160(int var0, int var1, int var2) {
		int var3 = var0 / var2; // L: 449
		int var4 = var0 & var2 - 1; // L: 450
		int var5 = var1 / var2; // L: 451
		int var6 = var1 & var2 - 1; // L: 452
		int var7 = ScriptFrame.method1160(var3, var5); // L: 453
		int var8 = ScriptFrame.method1160(var3 + 1, var5); // L: 454
		int var9 = ScriptFrame.method1160(var3, var5 + 1); // L: 455
		int var10 = ScriptFrame.method1160(var3 + 1, var5 + 1); // L: 456
		int var12 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1; // L: 459
		int var11 = ((65536 - var12) * var7 >> 16) + (var8 * var12 >> 16); // L: 460
		int var14 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1; // L: 465
		int var13 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16); // L: 466
		int var16 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var6 * 1024 / var2] >> 1; // L: 471
		int var15 = ((65536 - var16) * var11 >> 16) + (var16 * var13 >> 16); // L: 472
		return var15; // L: 474
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "321225908"
	)
	static void method6159() {
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 57

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next(); // L: 58
			var1.clearIsFromFriend(); // L: 60
		}

	} // L: 63

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	static void method6157() {
		Login.loginIndex = 24; // L: 1566
		class44.setLoginResponseString("", "You were disconnected from the server.", ""); // L: 1567
	} // L: 1568

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.field866) { // L: 3781
			class232.midiPcmStream.clear(); // L: 3783
			class232.musicPlayerStatus = 1; // L: 3784
			JagexCache.musicTrackArchive = null; // L: 3785
		} else if (var0 != -1 && var0 != Client.currentTrackGroupId && class12.clientPreferences.musicVolume != 0 && !Client.field866) { // L: 3788
			class229.method4321(2, class29.archive6, var0, 0, class12.clientPreferences.musicVolume, false); // L: 3789
		}

		Client.currentTrackGroupId = var0; // L: 3791
	} // L: 3792

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "91"
	)
	@Export("sceneRenderLevelCameraLocked")
	static final int sceneRenderLevelCameraLocked() {
		if (class12.clientPreferences.roofsHidden) { // L: 4817
			return ParamComposition.Client_plane;
		} else {
			int var0 = SceneTilePaint.getTileHeight(class20.cameraX, WorldMapDecoration.cameraZ, ParamComposition.Client_plane); // L: 4818
			return var0 - Skeleton.cameraY < 800 && (Tiles.Tiles_renderFlags[ParamComposition.Client_plane][class20.cameraX >> 7][WorldMapDecoration.cameraZ >> 7] & 4) != 0 ? ParamComposition.Client_plane : 3; // L: 4819 4820
		}
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(Lcg;IIII)V",
		garbageValue = "-587367035"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (class35.localPlayer != var0) { // L: 9397
			if (Client.menuOptionsCount < 400) { // L: 9398
				String var4;
				int var7;
				if (var0.skillLevel == 0) { // L: 9400
					String var5 = var0.actions[0] + var0.username + var0.actions[1]; // L: 9401
					var7 = var0.combatLevel; // L: 9403
					int var8 = class35.localPlayer.combatLevel; // L: 9404
					int var9 = var8 - var7; // L: 9406
					String var6;
					if (var9 < -9) { // L: 9407
						var6 = HorizontalAlignment.colorStartTag(16711680); // L: 9408
					} else if (var9 < -6) { // L: 9411
						var6 = HorizontalAlignment.colorStartTag(16723968); // L: 9412
					} else if (var9 < -3) { // L: 9415
						var6 = HorizontalAlignment.colorStartTag(16740352); // L: 9416
					} else if (var9 < 0) { // L: 9419
						var6 = HorizontalAlignment.colorStartTag(16756736); // L: 9420
					} else if (var9 > 9) { // L: 9423
						var6 = HorizontalAlignment.colorStartTag(65280); // L: 9424
					} else if (var9 > 6) { // L: 9427
						var6 = HorizontalAlignment.colorStartTag(4259584); // L: 9428
					} else if (var9 > 3) { // L: 9431
						var6 = HorizontalAlignment.colorStartTag(8453888); // L: 9432
					} else if (var9 > 0) { // L: 9435
						var6 = HorizontalAlignment.colorStartTag(12648192); // L: 9436
					} else {
						var6 = HorizontalAlignment.colorStartTag(16776960); // L: 9439
					}

					var4 = var5 + var6 + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2]; // L: 9441
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2]; // L: 9443
				}

				int var10;
				if (Client.isItemSelected == 1) { // L: 9444
					InterfaceParent.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + HorizontalAlignment.colorStartTag(16777215) + var4, 14, var1, var2, var3); // L: 9445
				} else if (Client.isSpellSelected) { // L: 9448
					if ((GrandExchangeOfferUnitPriceComparator.selectedSpellFlags & 8) == 8) { // L: 9449
						InterfaceParent.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + HorizontalAlignment.colorStartTag(16777215) + var4, 15, var1, var2, var3); // L: 9450
					}
				} else {
					for (var10 = 7; var10 >= 0; --var10) { // L: 9455
						if (Client.playerMenuActions[var10] != null) { // L: 9456
							short var11 = 0; // L: 9457
							if (Client.playerMenuActions[var10].equalsIgnoreCase("Attack")) { // L: 9458
								if (Client.playerAttackOption == AttackOption.AttackOption_hidden) { // L: 9459
									continue;
								}

								if (AttackOption.AttackOption_alwaysRightClick == Client.playerAttackOption || Client.playerAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var0.combatLevel > class35.localPlayer.combatLevel) { // L: 9460
									var11 = 2000; // L: 9461
								}

								if (class35.localPlayer.team != 0 && var0.team != 0) { // L: 9463
									if (var0.team == class35.localPlayer.team) { // L: 9464
										var11 = 2000;
									} else {
										var11 = 0; // L: 9465
									}
								} else if (var0.method2137()) { // L: 9467
									var11 = 2000; // L: 9468
								}
							} else if (Client.playerOptionsPriorities[var10]) { // L: 9471
								var11 = 2000;
							}

							boolean var12 = false; // L: 9472
							var7 = Client.playerMenuOpcodes[var10] + var11; // L: 9473
							InterfaceParent.insertMenuItemNoShift(Client.playerMenuActions[var10], HorizontalAlignment.colorStartTag(16777215) + var4, var7, var1, var2, var3); // L: 9474
						}
					}
				}

				for (var10 = 0; var10 < Client.menuOptionsCount; ++var10) { // L: 9479
					if (Client.menuOpcodes[var10] == 23) { // L: 9480
						Client.menuTargets[var10] = HorizontalAlignment.colorStartTag(16777215) + var4; // L: 9481
						break;
					}
				}

			}
		}
	} // L: 9485
}
