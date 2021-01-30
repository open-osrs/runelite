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
	} // L: 11

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "390219432"
	)
	static final void method2932(String var0) {
		PacketBufferNode var1 = ItemContainer.getPacketBufferNode(ClientPacket.field2241, Client.packetWriter.isaacCipher); // L: 134
		var1.packetBuffer.writeByte(stringCp1252NullTerminatedByteSize(var0)); // L: 135
		var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 136
		Client.packetWriter.addNode(var1); // L: 137
	} // L: 138

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "-120"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1; // L: 119
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "-74"
	)
	static void method2931(int var0, String var1) {
		int var2 = Players.Players_count; // L: 8288
		int[] var3 = Players.Players_indices; // L: 8289
		boolean var4 = false; // L: 8290
		Username var5 = new Username(var1, GrandExchangeOfferUnitPriceComparator.loginType); // L: 8291

		for (int var6 = 0; var6 < var2; ++var6) { // L: 8292
			Player var7 = Client.players[var3[var6]]; // L: 8293
			if (var7 != null && var7 != PlayerAppearance.localPlayer && var7.username != null && var7.username.equals(var5)) { // L: 8294
				PacketBufferNode var8;
				if (var0 == 1) { // L: 8295
					var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2260, Client.packetWriter.isaacCipher); // L: 8297
					var8.packetBuffer.method5568(0); // L: 8298
					var8.packetBuffer.writeShortLE(var3[var6]); // L: 8299
					Client.packetWriter.addNode(var8); // L: 8300
				} else if (var0 == 4) { // L: 8302
					var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2312, Client.packetWriter.isaacCipher); // L: 8304
					var8.packetBuffer.writeShortLE(var3[var6]); // L: 8305
					var8.packetBuffer.method5568(0); // L: 8306
					Client.packetWriter.addNode(var8); // L: 8307
				} else if (var0 == 6) { // L: 8309
					var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2242, Client.packetWriter.isaacCipher); // L: 8311
					var8.packetBuffer.method5568(0); // L: 8312
					var8.packetBuffer.method5578(var3[var6]); // L: 8313
					Client.packetWriter.addNode(var8); // L: 8314
				} else if (var0 == 7) { // L: 8316
					var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2268, Client.packetWriter.isaacCipher); // L: 8318
					var8.packetBuffer.method5578(var3[var6]); // L: 8319
					var8.packetBuffer.writeIntME(0); // L: 8320
					Client.packetWriter.addNode(var8); // L: 8321
				}

				var4 = true; // L: 8323
				break;
			}
		}

		if (!var4) { // L: 8327
			class234.addGameMessage(4, "", "Unable to find " + var1);
		}

	} // L: 8328

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(Lbq;IIII)V",
		garbageValue = "-1914334357"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (PlayerAppearance.localPlayer != var0) { // L: 8826
			if (Client.menuOptionsCount < 400) { // L: 8827
				String var4;
				int var7;
				if (var0.skillLevel == 0) { // L: 8829
					String var5 = var0.actions[0] + var0.username + var0.actions[1]; // L: 8830
					var7 = var0.combatLevel; // L: 8832
					int var8 = PlayerAppearance.localPlayer.combatLevel; // L: 8833
					int var9 = var8 - var7; // L: 8835
					String var6;
					if (var9 < -9) { // L: 8836
						var6 = class23.colorStartTag(16711680); // L: 8837
					} else if (var9 < -6) { // L: 8840
						var6 = class23.colorStartTag(16723968); // L: 8841
					} else if (var9 < -3) { // L: 8844
						var6 = class23.colorStartTag(16740352); // L: 8845
					} else if (var9 < 0) { // L: 8848
						var6 = class23.colorStartTag(16756736); // L: 8849
					} else if (var9 > 9) { // L: 8852
						var6 = class23.colorStartTag(65280); // L: 8853
					} else if (var9 > 6) { // L: 8856
						var6 = class23.colorStartTag(4259584); // L: 8857
					} else if (var9 > 3) { // L: 8860
						var6 = class23.colorStartTag(8453888); // L: 8861
					} else if (var9 > 0) { // L: 8864
						var6 = class23.colorStartTag(12648192); // L: 8865
					} else {
						var6 = class23.colorStartTag(16776960); // L: 8868
					}

					var4 = var5 + var6 + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2]; // L: 8870
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2]; // L: 8872
				}

				int var10;
				if (Client.isItemSelected == 1) { // L: 8873
					WorldMapRegion.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class23.colorStartTag(16777215) + var4, 14, var1, var2, var3); // L: 8874
				} else if (Client.isSpellSelected) { // L: 8877
					if ((Player.selectedSpellFlags & 8) == 8) { // L: 8878
						WorldMapRegion.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class23.colorStartTag(16777215) + var4, 15, var1, var2, var3); // L: 8879
					}
				} else {
					for (var10 = 7; var10 >= 0; --var10) { // L: 8884
						if (Client.playerMenuActions[var10] != null) { // L: 8885
							short var11 = 0; // L: 8886
							if (Client.playerMenuActions[var10].equalsIgnoreCase("Attack")) { // L: 8887
								if (AttackOption.AttackOption_hidden == Client.playerAttackOption) { // L: 8888
									continue;
								}

								if (Client.playerAttackOption == AttackOption.AttackOption_alwaysRightClick || AttackOption.AttackOption_dependsOnCombatLevels == Client.playerAttackOption && var0.combatLevel > PlayerAppearance.localPlayer.combatLevel) { // L: 8889
									var11 = 2000; // L: 8890
								}

								if (PlayerAppearance.localPlayer.team != 0 && var0.team != 0) { // L: 8892
									if (var0.team == PlayerAppearance.localPlayer.team) { // L: 8893
										var11 = 2000;
									} else {
										var11 = 0; // L: 8894
									}
								}
							} else if (Client.playerOptionsPriorities[var10]) { // L: 8897
								var11 = 2000;
							}

							boolean var12 = false; // L: 8898
							var7 = Client.playerMenuOpcodes[var10] + var11; // L: 8899
							WorldMapRegion.insertMenuItemNoShift(Client.playerMenuActions[var10], class23.colorStartTag(16777215) + var4, var7, var1, var2, var3); // L: 8900
						}
					}
				}

				for (var10 = 0; var10 < Client.menuOptionsCount; ++var10) { // L: 8905
					if (Client.menuOpcodes[var10] == 23) { // L: 8906
						Client.menuTargets[var10] = class23.colorStartTag(16777215) + var4; // L: 8907
						break;
					}
				}

			}
		}
	} // L: 8911
}
