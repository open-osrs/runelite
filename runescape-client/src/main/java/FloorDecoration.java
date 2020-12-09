import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
@Implements("FloorDecoration")
public final class FloorDecoration {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -689308621
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1437698275
	)
	@Export("x")
	int x;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 380443133
	)
	@Export("y")
	int y;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ler;"
	)
	@Export("entity")
	public Entity entity;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		longValue = 2801138791321477185L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1520433835
	)
	@Export("flags")
	int flags;

	FloorDecoration() {
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "390219432"
	)
	static final void method2932(String var0) {
		PacketBufferNode var1 = ItemContainer.getPacketBufferNode(ClientPacket.field2241, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(stringCp1252NullTerminatedByteSize(var0));
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "-120"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1;
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "-74"
	)
	static void method2931(int var0, String var1) {
		int var2 = Players.Players_count;
		int[] var3 = Players.Players_indices;
		boolean var4 = false;
		Username var5 = new Username(var1, GrandExchangeOfferUnitPriceComparator.loginType);

		for (int var6 = 0; var6 < var2; ++var6) {
			Player var7 = Client.players[var3[var6]];
			if (var7 != null && var7 != PlayerAppearance.localPlayer && var7.username != null && var7.username.equals(var5)) {
				PacketBufferNode var8;
				if (var0 == 1) {
					var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2260, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method5568(0);
					var8.packetBuffer.writeShortLE(var3[var6]);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 4) {
					var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2312, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShortLE(var3[var6]);
					var8.packetBuffer.method5568(0);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 6) {
					var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2242, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method5568(0);
					var8.packetBuffer.method5578(var3[var6]);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 7) {
					var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2268, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method5578(var3[var6]);
					var8.packetBuffer.writeIntME(0);
					Client.packetWriter.addNode(var8);
				}

				var4 = true;
				break;
			}
		}

		if (!var4) {
			class234.addGameMessage(4, "", "Unable to find " + var1);
		}

	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(Lbq;IIII)V",
		garbageValue = "-1914334357"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (PlayerAppearance.localPlayer != var0) {
			if (Client.menuOptionsCount < 400) {
				String var4;
				int var7;
				if (var0.skillLevel == 0) {
					String var5 = var0.actions[0] + var0.username + var0.actions[1];
					var7 = var0.combatLevel;
					int var8 = PlayerAppearance.localPlayer.combatLevel;
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

					var4 = var5 + var6 + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2];
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2];
				}

				int var10;
				if (Client.isItemSelected == 1) {
					WorldMapRegion.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class23.colorStartTag(16777215) + var4, 14, var1, var2, var3);
				} else if (Client.isSpellSelected) {
					if ((Player.selectedSpellFlags & 8) == 8) {
						WorldMapRegion.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class23.colorStartTag(16777215) + var4, 15, var1, var2, var3);
					}
				} else {
					for (var10 = 7; var10 >= 0; --var10) {
						if (Client.playerMenuActions[var10] != null) {
							short var11 = 0;
							if (Client.playerMenuActions[var10].equalsIgnoreCase("Attack")) {
								if (AttackOption.AttackOption_hidden == Client.playerAttackOption) {
									continue;
								}

								if (Client.playerAttackOption == AttackOption.AttackOption_alwaysRightClick || AttackOption.AttackOption_dependsOnCombatLevels == Client.playerAttackOption && var0.combatLevel > PlayerAppearance.localPlayer.combatLevel) {
									var11 = 2000;
								}

								if (PlayerAppearance.localPlayer.team != 0 && var0.team != 0) {
									if (var0.team == PlayerAppearance.localPlayer.team) {
										var11 = 2000;
									} else {
										var11 = 0;
									}
								}
							} else if (Client.playerOptionsPriorities[var10]) {
								var11 = 2000;
							}

							boolean var12 = false;
							var7 = Client.playerMenuOpcodes[var10] + var11;
							WorldMapRegion.insertMenuItemNoShift(Client.playerMenuActions[var10], class23.colorStartTag(16777215) + var4, var7, var1, var2, var3);
						}
					}
				}

				for (var10 = 0; var10 < Client.menuOptionsCount; ++var10) {
					if (Client.menuOpcodes[var10] == 23) {
						Client.menuTargets[var10] = class23.colorStartTag(16777215) + var4;
						break;
					}
				}

			}
		}
	}
}
