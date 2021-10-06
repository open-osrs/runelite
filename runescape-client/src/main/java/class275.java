import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jv")
public class class275 {
	static {
		Math.sqrt(8192.0D);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-1"
	)
	static int method5120(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var3;
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(Lfg;IIII)V",
		garbageValue = "67788539"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPCComposition var0, int var1, int var2, int var3) {
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
							var8 = class67.localPlayer.combatLevel;
							int var9 = var8 - var7;
							String var6;
							if (var9 < -9) {
								var6 = FloorUnderlayDefinition.colorStartTag(16711680);
							} else if (var9 < -6) {
								var6 = FloorUnderlayDefinition.colorStartTag(16723968);
							} else if (var9 < -3) {
								var6 = FloorUnderlayDefinition.colorStartTag(16740352);
							} else if (var9 < 0) {
								var6 = FloorUnderlayDefinition.colorStartTag(16756736);
							} else if (var9 > 9) {
								var6 = FloorUnderlayDefinition.colorStartTag(65280);
							} else if (var9 > 6) {
								var6 = FloorUnderlayDefinition.colorStartTag(4259584);
							} else if (var9 > 3) {
								var6 = FloorUnderlayDefinition.colorStartTag(8453888);
							} else if (var9 > 0) {
								var6 = FloorUnderlayDefinition.colorStartTag(12648192);
							} else {
								var6 = FloorUnderlayDefinition.colorStartTag(16776960);
							}

							var4 = var4 + var6 + " " + " (" + "level-" + var0.combatLevel + ")";
						}

						if (var0.isFollower && Client.followerOpsLowPriority) {
							GameBuild.insertMenuItemNoShift("Examine", FloorUnderlayDefinition.colorStartTag(16776960) + var4, 1003, var1, var2, var3);
						}

						if (Client.isItemSelected == 1) {
							GameBuild.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + FloorUnderlayDefinition.colorStartTag(16776960) + var4, 7, var1, var2, var3);
						} else if (Client.isSpellSelected) {
							if ((ObjectComposition.selectedSpellFlags & 2) == 2) {
								GameBuild.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + FloorUnderlayDefinition.colorStartTag(16776960) + var4, 8, var1, var2, var3);
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

										GameBuild.insertMenuItemNoShift(var11[var7], FloorUnderlayDefinition.colorStartTag(16776960) + var4, var8, var1, var2, var3);
									}
								}
							}

							if (var11 != null) {
								for (var7 = 4; var7 >= 0; --var7) {
									if (var11[var7] != null && var11[var7].equalsIgnoreCase("Attack")) {
										short var12 = 0;
										if (Client.npcAttackOption != AttackOption.AttackOption_hidden) {
											if (Client.npcAttackOption == AttackOption.AttackOption_alwaysRightClick || AttackOption.AttackOption_dependsOnCombatLevels == Client.npcAttackOption && var0.combatLevel > class67.localPlayer.combatLevel) {
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

											GameBuild.insertMenuItemNoShift(var11[var7], FloorUnderlayDefinition.colorStartTag(16776960) + var4, var8, var1, var2, var3);
										}
									}
								}
							}

							if (!var0.isFollower || !Client.followerOpsLowPriority) {
								GameBuild.insertMenuItemNoShift("Examine", FloorUnderlayDefinition.colorStartTag(16776960) + var4, 1003, var1, var2, var3);
							}
						}

					}
				}
			}
		}
	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1085415659"
	)
	static final void method5121(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : GrandExchangeOfferNameComparator.guestClanChannel;
		if (var2 != null && var1 >= 0 && var1 < var2.method2729()) {
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1);
			if (var3.rank == -1) {
				String var4 = var3.username.getName();
				PacketWriter var5 = Client.packetWriter;
				PacketBufferNode var6 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2694, var5.isaacCipher);
				var6.packetBuffer.writeByte(3 + class113.stringCp1252NullTerminatedByteSize(var4));
				var6.packetBuffer.writeByte(var0);
				var6.packetBuffer.writeShort(var1);
				var6.packetBuffer.writeStringCp1252NullTerminated(var4);
				var5.addNode(var6);
			}
		}
	}
}
