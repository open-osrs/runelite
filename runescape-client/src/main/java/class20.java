import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("a")
public class class20 implements Callable {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lr;"
	)
	final class10 field107;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ld;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ld;Lr;)V"
	)
	class20(class14 var1, class10 var2) {
		this.this$0 = var1; // L: 46
		this.field107 = var2; // L: 47
	} // L: 48

	public Object call() throws Exception {
		try {
			while (this.field107.method86()) { // L: 52
				class93.method2384(10L); // L: 53
			}
		} catch (IOException var2) { // L: 56
			return new class21("Error servicing REST query: " + var2.getMessage()); // L: 57
		}

		return this.field107.method81(); // L: 59
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lpi;IIIIIIB)V",
		garbageValue = "1"
	)
	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) { // L: 169
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 170

			while (true) {
				var7 = var0.readUnsignedByte(); // L: 172
				if (var7 == 0) { // L: 173
					if (var1 == 0) { // L: 174
						int[] var14 = Tiles.Tiles_heights[0][var2]; // L: 175
						int var11 = var2 + var4 + 932731; // L: 178
						int var12 = var3 + var5 + 556238; // L: 179
						int var13 = UserComparator9.method2615(45365 + var11, var12 + 91923, 4) - 128 + (UserComparator9.method2615(10294 + var11, 37821 + var12, 2) - 128 >> 1) + (UserComparator9.method2615(var11, var12, 1) - 128 >> 2); // L: 181
						var13 = (int)(0.3D * (double)var13) + 35; // L: 182
						if (var13 < 10) { // L: 183
							var13 = 10;
						} else if (var13 > 60) { // L: 184
							var13 = 60;
						}

						var14[var3] = -var13 * 8; // L: 187
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240; // L: 189
					}
					break;
				}

				if (var7 == 1) { // L: 192
					int var8 = var0.readUnsignedByte(); // L: 193
					if (var8 == 1) { // L: 194
						var8 = 0;
					}

					if (var1 == 0) { // L: 195
						Tiles.Tiles_heights[0][var2][var3] = -var8 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var8 * 8; // L: 196
					}
					break;
				}

				if (var7 <= 49) { // L: 199
					class14.Tiles_overlays[var1][var2][var3] = var0.readByte(); // L: 200
					class147.Tiles_shapes[var1][var2][var3] = (byte)((var7 - 2) / 4); // L: 201
					Tiles.field983[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3); // L: 202
				} else if (var7 <= 81) { // L: 205
					Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var7 - 49); // L: 206
				} else {
					Tiles.Tiles_underlays[var1][var2][var3] = (byte)(var7 - 81); // L: 209
				}
			}
		} else {
			while (true) {
				var7 = var0.readUnsignedByte(); // L: 214
				if (var7 == 0) { // L: 215
					break;
				}

				if (var7 == 1) { // L: 216
					var0.readUnsignedByte(); // L: 217
					break;
				}

				if (var7 <= 49) { // L: 220
					var0.readUnsignedByte();
				}
			}
		}

	} // L: 223

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Lcz;IIII)V",
		garbageValue = "1063086800"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (GrandExchangeEvents.localPlayer != var0) { // L: 10123
			if (Client.menuOptionsCount < 400) { // L: 10124
				String var4;
				int var7;
				if (var0.skillLevel == 0) { // L: 10126
					String var5 = var0.actions[0] + var0.username + var0.actions[1]; // L: 10127
					var7 = var0.combatLevel; // L: 10129
					int var8 = GrandExchangeEvents.localPlayer.combatLevel; // L: 10130
					int var9 = var8 - var7; // L: 10132
					String var6;
					if (var9 < -9) { // L: 10133
						var6 = UserComparator9.colorStartTag(16711680); // L: 10134
					} else if (var9 < -6) { // L: 10137
						var6 = UserComparator9.colorStartTag(16723968); // L: 10138
					} else if (var9 < -3) { // L: 10141
						var6 = UserComparator9.colorStartTag(16740352); // L: 10142
					} else if (var9 < 0) { // L: 10145
						var6 = UserComparator9.colorStartTag(16756736); // L: 10146
					} else if (var9 > 9) { // L: 10149
						var6 = UserComparator9.colorStartTag(65280); // L: 10150
					} else if (var9 > 6) { // L: 10153
						var6 = UserComparator9.colorStartTag(4259584); // L: 10154
					} else if (var9 > 3) { // L: 10157
						var6 = UserComparator9.colorStartTag(8453888); // L: 10158
					} else if (var9 > 0) { // L: 10161
						var6 = UserComparator9.colorStartTag(12648192); // L: 10162
					} else {
						var6 = UserComparator9.colorStartTag(16776960); // L: 10165
					}

					var4 = var5 + var6 + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2]; // L: 10167
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2]; // L: 10169
				}

				int var10;
				if (Client.isItemSelected == 1) { // L: 10170
					class21.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + UserComparator9.colorStartTag(16777215) + var4, 14, var1, var2, var3); // L: 10171
				} else if (Client.isSpellSelected) { // L: 10174
					if ((class17.selectedSpellFlags & 8) == 8) { // L: 10175
						class21.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + UserComparator9.colorStartTag(16777215) + var4, 15, var1, var2, var3); // L: 10176
					}
				} else {
					for (var10 = 7; var10 >= 0; --var10) { // L: 10181
						if (Client.playerMenuActions[var10] != null) { // L: 10182
							short var11 = 0; // L: 10183
							if (Client.playerMenuActions[var10].equalsIgnoreCase("Attack")) { // L: 10184
								if (Client.playerAttackOption == AttackOption.AttackOption_hidden) { // L: 10185
									continue;
								}

								if (AttackOption.AttackOption_alwaysRightClick == Client.playerAttackOption || Client.playerAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var0.combatLevel > GrandExchangeEvents.localPlayer.combatLevel) { // L: 10186
									var11 = 2000; // L: 10187
								}

								if (GrandExchangeEvents.localPlayer.team != 0 && var0.team != 0) { // L: 10189
									if (var0.team == GrandExchangeEvents.localPlayer.team) { // L: 10190
										var11 = 2000;
									} else {
										var11 = 0; // L: 10191
									}
								} else if (Client.playerAttackOption == AttackOption.field1263 && var0.isClanMember()) { // L: 10193
									var11 = 2000; // L: 10194
								}
							} else if (Client.playerOptionsPriorities[var10]) { // L: 10197
								var11 = 2000;
							}

							boolean var12 = false; // L: 10198
							var7 = Client.playerMenuOpcodes[var10] + var11; // L: 10199
							class21.insertMenuItemNoShift(Client.playerMenuActions[var10], UserComparator9.colorStartTag(16777215) + var4, var7, var1, var2, var3); // L: 10200
						}
					}
				}

				for (var10 = 0; var10 < Client.menuOptionsCount; ++var10) { // L: 10205
					if (Client.menuOpcodes[var10] == 23) { // L: 10206
						Client.menuTargets[var10] = UserComparator9.colorStartTag(16777215) + var4; // L: 10207
						break;
					}
				}

			}
		}
	} // L: 10211

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-124"
	)
	static final void method294() {
		PacketBufferNode var0 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2905, Client.packetWriter.isaacCipher); // L: 12135
		Client.packetWriter.addNode(var0); // L: 12136
		Interpreter.field842 = true; // L: 12137

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) { // L: 12138
			if (var1.type == 0 || var1.type == 3) { // L: 12139
				Script.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) { // L: 12141
			class346.invalidateWidget(Client.meslayerContinueWidget); // L: 12142
			Client.meslayerContinueWidget = null; // L: 12143
		}

		Interpreter.field842 = false; // L: 12145
	} // L: 12146
}
