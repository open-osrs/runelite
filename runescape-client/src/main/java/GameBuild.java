import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iu")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	@Export("LIVE")
	static final GameBuild LIVE;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	@Export("BUILDLIVE")
	static final GameBuild BUILDLIVE;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	@Export("RC")
	static final GameBuild RC;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	@Export("WIP")
	static final GameBuild WIP;
	@ObfuscatedName("y")
	@Export("name")
	public final String name;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 627083657
	)
	@Export("buildId")
	public final int buildId;

	static {
		LIVE = new GameBuild("LIVE", 0); // L: 5
		BUILDLIVE = new GameBuild("BUILDLIVE", 3); // L: 6
		RC = new GameBuild("RC", 1); // L: 7
		WIP = new GameBuild("WIP", 2); // L: 8
	}

	GameBuild(String var1, int var2) {
		this.name = var1; // L: 17
		this.buildId = var2; // L: 18
	} // L: 19

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1767980909"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field938 = 0L; // L: 3811
		if (var0 >= 2) { // L: 3812
			Client.isResizable = true;
		} else {
			Client.isResizable = false; // L: 3813
		}

		if (BoundaryObject.getWindowedMode() == 1) { // L: 3814
			class1.client.setMaxCanvasSize(765, 503); // L: 3815
		} else {
			class1.client.setMaxCanvasSize(7680, 2160); // L: 3818
		}

		if (Client.gameState >= 25) { // L: 3820
			PacketBufferNode var1 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2290, Client.packetWriter.isaacCipher); // L: 3822
			var1.packetBuffer.writeByte(BoundaryObject.getWindowedMode()); // L: 3823
			var1.packetBuffer.writeShort(GrandExchangeOfferTotalQuantityComparator.canvasWidth); // L: 3824
			var1.packetBuffer.writeShort(class25.canvasHeight); // L: 3825
			Client.packetWriter.addNode(var1); // L: 3826
		}

	} // L: 3828

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "44"
	)
	static boolean method4350() {
		return (Client.drawPlayerNames & 4) != 0; // L: 4418
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(Ljy;IIII)V",
		garbageValue = "2014518085"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPCComposition var0, int var1, int var2, int var3) {
		if (Client.menuOptionsCount < 400) { // L: 9186
			if (var0.transforms != null) { // L: 9187
				var0 = var0.transform();
			}

			if (var0 != null) { // L: 9188
				if (var0.isInteractable) { // L: 9189
					if (!var0.isFollower || Client.followerIndex == var1) { // L: 9190
						String var4 = var0.name; // L: 9191
						int var7;
						int var8;
						if (var0.combatLevel != 0) { // L: 9192
							var7 = var0.combatLevel; // L: 9195
							var8 = UserComparator9.localPlayer.combatLevel; // L: 9196
							int var9 = var8 - var7; // L: 9198
							String var6;
							if (var9 < -9) { // L: 9199
								var6 = FileSystem.colorStartTag(16711680); // L: 9200
							} else if (var9 < -6) { // L: 9203
								var6 = FileSystem.colorStartTag(16723968); // L: 9204
							} else if (var9 < -3) { // L: 9207
								var6 = FileSystem.colorStartTag(16740352); // L: 9208
							} else if (var9 < 0) { // L: 9211
								var6 = FileSystem.colorStartTag(16756736); // L: 9212
							} else if (var9 > 9) { // L: 9215
								var6 = FileSystem.colorStartTag(65280); // L: 9216
							} else if (var9 > 6) { // L: 9219
								var6 = FileSystem.colorStartTag(4259584); // L: 9220
							} else if (var9 > 3) { // L: 9223
								var6 = FileSystem.colorStartTag(8453888); // L: 9224
							} else if (var9 > 0) { // L: 9227
								var6 = FileSystem.colorStartTag(12648192); // L: 9228
							} else {
								var6 = FileSystem.colorStartTag(16776960); // L: 9231
							}

							var4 = var4 + var6 + " " + " (" + "level-" + var0.combatLevel + ")"; // L: 9233
						}

						if (var0.isFollower && Client.followerOpsLowPriority) { // L: 9235
							WorldMapManager.insertMenuItemNoShift("Examine", FileSystem.colorStartTag(16776960) + var4, 1003, var1, var2, var3); // L: 9236
						}

						if (Client.isItemSelected == 1) { // L: 9239
							WorldMapManager.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + FileSystem.colorStartTag(16776960) + var4, 7, var1, var2, var3); // L: 9240
						} else if (Client.isSpellSelected) { // L: 9243
							if ((GrandExchangeOfferNameComparator.selectedSpellFlags & 2) == 2) { // L: 9244
								WorldMapManager.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + FileSystem.colorStartTag(16776960) + var4, 8, var1, var2, var3); // L: 9245
							}
						} else {
							int var10 = var0.isFollower && Client.followerOpsLowPriority ? 2000 : 0; // L: 9250
							String[] var11 = var0.actions; // L: 9251
							if (var11 != null) { // L: 9252
								for (var7 = 4; var7 >= 0; --var7) { // L: 9253
									if (var11[var7] != null && !var11[var7].equalsIgnoreCase("Attack")) { // L: 9254
										var8 = 0; // L: 9255
										if (var7 == 0) { // L: 9256
											var8 = var10 + 9;
										}

										if (var7 == 1) { // L: 9257
											var8 = var10 + 10;
										}

										if (var7 == 2) { // L: 9258
											var8 = var10 + 11;
										}

										if (var7 == 3) { // L: 9259
											var8 = var10 + 12;
										}

										if (var7 == 4) { // L: 9260
											var8 = var10 + 13;
										}

										WorldMapManager.insertMenuItemNoShift(var11[var7], FileSystem.colorStartTag(16776960) + var4, var8, var1, var2, var3); // L: 9261
									}
								}
							}

							if (var11 != null) { // L: 9266
								for (var7 = 4; var7 >= 0; --var7) { // L: 9267
									if (var11[var7] != null && var11[var7].equalsIgnoreCase("Attack")) { // L: 9268
										short var12 = 0; // L: 9269
										if (AttackOption.AttackOption_hidden != Client.npcAttackOption) { // L: 9270
											if (Client.npcAttackOption == AttackOption.AttackOption_alwaysRightClick || AttackOption.AttackOption_dependsOnCombatLevels == Client.npcAttackOption && var0.combatLevel > UserComparator9.localPlayer.combatLevel) { // L: 9271
												var12 = 2000; // L: 9272
											}

											var8 = 0; // L: 9274
											if (var7 == 0) { // L: 9275
												var8 = var12 + 9;
											}

											if (var7 == 1) { // L: 9276
												var8 = var12 + 10;
											}

											if (var7 == 2) { // L: 9277
												var8 = var12 + 11;
											}

											if (var7 == 3) { // L: 9278
												var8 = var12 + 12;
											}

											if (var7 == 4) { // L: 9279
												var8 = var12 + 13;
											}

											WorldMapManager.insertMenuItemNoShift(var11[var7], FileSystem.colorStartTag(16776960) + var4, var8, var1, var2, var3); // L: 9280
										}
									}
								}
							}

							if (!var0.isFollower || !Client.followerOpsLowPriority) { // L: 9285
								WorldMapManager.insertMenuItemNoShift("Examine", FileSystem.colorStartTag(16776960) + var4, 1003, var1, var2, var3); // L: 9286
							}
						}

					}
				}
			}
		}
	} // L: 9290
}
