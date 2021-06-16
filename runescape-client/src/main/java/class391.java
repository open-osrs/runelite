import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oo")
public class class391 {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1496725553
	)
	public final int field4226;
	@ObfuscatedName("e")
	public Object field4227;

	public class391(int var1) {
		this.field4226 = var1; // L: 8
	} // L: 9

	public class391(int var1, Object var2) {
		this.field4226 = var1; // L: 12
		this.field4227 = var2; // L: 13
	} // L: 14

	public int hashCode() {
		return super.hashCode(); // L: 17
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class391)) { // L: 21
			return false;
		} else {
			class391 var2 = (class391)var1; // L: 22
			if (var2.field4227 == null && this.field4227 != null) { // L: 23
				return false;
			} else if (this.field4227 == null && var2.field4227 != null) { // L: 24
				return false;
			} else {
				return this.field4226 == var2.field4226 && var2.field4227.equals(this.field4227); // L: 25
			}
		}
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-857761179"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) { // L: 9003
			class22.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3); // L: 9004
		}

		long var4 = -1L; // L: 9007
		long var6 = -1L; // L: 9008
		int var8 = 0;

		while (true) {
			int var10 = ViewportMouse.ViewportMouse_entityCount; // L: 9013
			if (var8 >= var10) { // L: 9015
				if (-1L != var4) { // L: 9162
					var8 = (int)(var4 >>> 0 & 127L); // L: 9165
					var10 = TextureProvider.method4272(var4); // L: 9168
					Player var11 = Client.players[Client.combatTargetPlayerIndex]; // L: 9169
					Actor.addPlayerToMenu(var11, Client.combatTargetPlayerIndex, var8, var10); // L: 9170
				}

				return; // L: 9172
			}

			long var27 = UrlRequest.method2516(var8); // L: 9016
			if (var27 != var6) { // L: 9017
				label328: {
					var6 = var27; // L: 9018
					long var15 = ViewportMouse.ViewportMouse_entityTags[var8]; // L: 9022
					int var14 = (int)(var15 >>> 0 & 127L); // L: 9024
					var14 = var14; // L: 9028
					int var29 = TextureProvider.method4272(ViewportMouse.ViewportMouse_entityTags[var8]); // L: 9031
					int var16 = var29; // L: 9033
					long var19 = ViewportMouse.ViewportMouse_entityTags[var8]; // L: 9037
					int var18 = (int)(var19 >>> 14 & 3L); // L: 9039
					int var30 = Message.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var8]); // L: 9046
					int var20 = var30; // L: 9048
					if (var18 == 2 && DevicePcmPlayerProvider.scene.getObjectFlags(SoundSystem.Client_plane, var14, var29, var27) >= 0) { // L: 9049 9050
						ObjectComposition var21 = Tiles.getObjectDefinition(var30); // L: 9051
						if (var21.transforms != null) { // L: 9052
							var21 = var21.transform();
						}

						if (var21 == null) { // L: 9053
							break label328;
						}

						if (Client.isItemSelected == 1) { // L: 9054
							class22.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + SecureRandomFuture.colorStartTag(65535) + var21.name, 1, var30, var14, var29); // L: 9055
						} else if (Client.isSpellSelected) { // L: 9058
							if ((LoginPacket.selectedSpellFlags & 4) == 4) { // L: 9059
								class22.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + SecureRandomFuture.colorStartTag(65535) + var21.name, 2, var30, var14, var29); // L: 9060
							}
						} else {
							String[] var22 = var21.actions; // L: 9065
							if (var22 != null) { // L: 9066
								for (int var23 = 4; var23 >= 0; --var23) { // L: 9067
									if (var22[var23] != null) { // L: 9068
										short var24 = 0; // L: 9069
										if (var23 == 0) { // L: 9070
											var24 = 3;
										}

										if (var23 == 1) { // L: 9071
											var24 = 4;
										}

										if (var23 == 2) { // L: 9072
											var24 = 5;
										}

										if (var23 == 3) { // L: 9073
											var24 = 6;
										}

										if (var23 == 4) { // L: 9074
											var24 = 1001;
										}

										class22.insertMenuItemNoShift(var22[var23], SecureRandomFuture.colorStartTag(65535) + var21.name, var24, var20, var14, var16); // L: 9075
									}
								}
							}

							class22.insertMenuItemNoShift("Examine", SecureRandomFuture.colorStartTag(65535) + var21.name, 1002, var21.id, var14, var16); // L: 9080
						}
					}

					Player var25;
					int var31;
					NPC var32;
					int var39;
					int[] var40;
					if (var18 == 1) { // L: 9085
						NPC var35 = Client.npcs[var20]; // L: 9086
						if (var35 == null) { // L: 9087
							break label328;
						}

						if (var35.definition.size == 1 && (var35.x & 127) == 64 && (var35.y & 127) == 64) { // L: 9088
							for (var31 = 0; var31 < Client.npcCount; ++var31) { // L: 9089
								var32 = Client.npcs[Client.npcIndices[var31]]; // L: 9090
								if (var32 != null && var32 != var35 && var32.definition.size == 1 && var32.x == var35.x && var35.y == var32.y) { // L: 9091
									FontName.addNpcToMenu(var32.definition, Client.npcIndices[var31], var14, var16);
								}
							}

							var31 = Players.Players_count; // L: 9093
							var40 = Players.Players_indices; // L: 9094

							for (var39 = 0; var39 < var31; ++var39) { // L: 9095
								var25 = Client.players[var40[var39]]; // L: 9096
								if (var25 != null && var35.x == var25.x && var25.y == var35.y) { // L: 9097
									Actor.addPlayerToMenu(var25, var40[var39], var14, var16);
								}
							}
						}

						FontName.addNpcToMenu(var35.definition, var20, var14, var16); // L: 9100
					}

					if (var18 == 0) { // L: 9102
						Player var36 = Client.players[var20]; // L: 9103
						if (var36 == null) { // L: 9104
							break label328;
						}

						if ((var36.x & 127) == 64 && (var36.y & 127) == 64) { // L: 9105
							for (var31 = 0; var31 < Client.npcCount; ++var31) { // L: 9106
								var32 = Client.npcs[Client.npcIndices[var31]]; // L: 9107
								if (var32 != null && var32.definition.size == 1 && var36.x == var32.x && var32.y == var36.y) { // L: 9108
									FontName.addNpcToMenu(var32.definition, Client.npcIndices[var31], var14, var16);
								}
							}

							var31 = Players.Players_count; // L: 9110
							var40 = Players.Players_indices; // L: 9111

							for (var39 = 0; var39 < var31; ++var39) { // L: 9112
								var25 = Client.players[var40[var39]]; // L: 9113
								if (var25 != null && var36 != var25 && var36.x == var25.x && var25.y == var36.y) { // L: 9114
									Actor.addPlayerToMenu(var25, var40[var39], var14, var16);
								}
							}
						}

						if (var20 != Client.combatTargetPlayerIndex) {
							Actor.addPlayerToMenu(var36, var20, var14, var16); // L: 9117
						} else {
							var4 = var27; // L: 9118
						}
					}

					if (var18 == 3) { // L: 9120
						NodeDeque var38 = Client.groundItems[SoundSystem.Client_plane][var14][var16]; // L: 9121
						if (var38 != null) { // L: 9122
							for (TileItem var37 = (TileItem)var38.first(); var37 != null; var37 = (TileItem)var38.next()) { // L: 9123 9124 9157
								ItemComposition var41 = class250.ItemDefinition_get(var37.id); // L: 9125
								if (Client.isItemSelected == 1) { // L: 9126
									class22.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + SecureRandomFuture.colorStartTag(16748608) + var41.name, 16, var37.id, var14, var16); // L: 9127
								} else if (Client.isSpellSelected) { // L: 9130
									if ((LoginPacket.selectedSpellFlags & 1) == 1) { // L: 9131
										class22.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + SecureRandomFuture.colorStartTag(16748608) + var41.name, 17, var37.id, var14, var16); // L: 9132
									}
								} else {
									String[] var33 = var41.groundActions; // L: 9137

									for (int var34 = 4; var34 >= 0; --var34) { // L: 9138
										if (var33 != null && var33[var34] != null) { // L: 9139
											byte var26 = 0; // L: 9140
											if (var34 == 0) { // L: 9141
												var26 = 18;
											}

											if (var34 == 1) { // L: 9142
												var26 = 19;
											}

											if (var34 == 2) { // L: 9143
												var26 = 20;
											}

											if (var34 == 3) { // L: 9144
												var26 = 21;
											}

											if (var34 == 4) { // L: 9145
												var26 = 22;
											}

											class22.insertMenuItemNoShift(var33[var34], SecureRandomFuture.colorStartTag(16748608) + var41.name, var26, var37.id, var14, var16); // L: 9146
										} else if (var34 == 2) { // L: 9149
											class22.insertMenuItemNoShift("Take", SecureRandomFuture.colorStartTag(16748608) + var41.name, 20, var37.id, var14, var16); // L: 9150
										}
									}

									class22.insertMenuItemNoShift("Examine", SecureRandomFuture.colorStartTag(16748608) + var41.name, 1004, var37.id, var14, var16); // L: 9154
								}
							}
						}
					}
				}
			}

			++var8; // L: 9009
		}
	}
}
