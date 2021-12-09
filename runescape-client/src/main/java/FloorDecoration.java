import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gx")
@Implements("FloorDecoration")
public final class FloorDecoration {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1861325243
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1924923823
	)
	@Export("x")
	int x;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -2119498473
	)
	@Export("y")
	int y;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		longValue = -7418429141280982005L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1944235645
	)
	@Export("flags")
	int flags;

	FloorDecoration() {
	} // L: 11

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "28"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) { // L: 10088
			class11.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3); // L: 10089
		}

		long var4 = -1L; // L: 10092
		long var6 = -1L; // L: 10093

		int var8;
		for (var8 = 0; var8 < class113.method2616(); ++var8) { // L: 10094
			long var23 = MenuAction.method1960(var8); // L: 10095
			if (var23 != var6) { // L: 10096
				var6 = var23; // L: 10097
				int var25 = FloorOverlayDefinition.method3618(var8); // L: 10098
				long var14 = ViewportMouse.ViewportMouse_entityTags[var8]; // L: 10102
				int var13 = (int)(var14 >>> 7 & 127L); // L: 10104
				var13 = var13; // L: 10108
				int var26 = class114.method2629(var8); // L: 10109
				int var15 = PacketWriter.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var8]); // L: 10112
				int var16 = var15; // L: 10114
				if (var26 == 2 && class7.scene.getObjectFlags(class20.Client_plane, var25, var13, var23) >= 0) { // L: 10115 10116
					ObjectComposition var17 = class148.getObjectDefinition(var15); // L: 10117
					if (var17.transforms != null) { // L: 10118
						var17 = var17.transform();
					}

					if (var17 == null) { // L: 10119
						continue;
					}

					if (Client.isItemSelected == 1) { // L: 10120
						class11.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + UserComparator5.colorStartTag(65535) + var17.name, 1, var15, var25, var13); // L: 10121
					} else if (Client.isSpellSelected) { // L: 10124
						if ((class91.selectedSpellFlags & 4) == 4) { // L: 10125
							class11.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + UserComparator5.colorStartTag(65535) + var17.name, 2, var15, var25, var13); // L: 10126
						}
					} else {
						String[] var18 = var17.actions; // L: 10131
						if (var18 != null) { // L: 10132
							for (int var19 = 4; var19 >= 0; --var19) { // L: 10133
								if (var18[var19] != null) { // L: 10134
									short var20 = 0; // L: 10135
									if (var19 == 0) { // L: 10136
										var20 = 3;
									}

									if (var19 == 1) { // L: 10137
										var20 = 4;
									}

									if (var19 == 2) { // L: 10138
										var20 = 5;
									}

									if (var19 == 3) { // L: 10139
										var20 = 6;
									}

									if (var19 == 4) { // L: 10140
										var20 = 1001;
									}

									class11.insertMenuItemNoShift(var18[var19], UserComparator5.colorStartTag(65535) + var17.name, var20, var16, var25, var13); // L: 10141
								}
							}
						}

						class11.insertMenuItemNoShift("Examine", UserComparator5.colorStartTag(65535) + var17.name, 1002, var17.id, var25, var13); // L: 10146
					}
				}

				Player var21;
				int var27;
				NPC var28;
				int var35;
				int[] var36;
				if (var26 == 1) { // L: 10151
					NPC var31 = Client.npcs[var16]; // L: 10152
					if (var31 == null) { // L: 10153
						continue;
					}

					if (var31.definition.size == 1 && (var31.x & 127) == 64 && (var31.y & 127) == 64) { // L: 10154
						for (var27 = 0; var27 < Client.npcCount; ++var27) { // L: 10155
							var28 = Client.npcs[Client.npcIndices[var27]]; // L: 10156
							if (var28 != null && var28 != var31 && var28.definition.size == 1 && var31.x == var28.x && var28.y == var31.y) { // L: 10157
								GrandExchangeOfferAgeComparator.addNpcToMenu(var28, Client.npcIndices[var27], var25, var13);
							}
						}

						var27 = Players.Players_count; // L: 10159
						var36 = Players.Players_indices; // L: 10160

						for (var35 = 0; var35 < var27; ++var35) { // L: 10161
							var21 = Client.players[var36[var35]]; // L: 10162
							if (var21 != null && var31.x == var21.x && var21.y == var31.y) { // L: 10163
								class233.addPlayerToMenu(var21, var36[var35], var25, var13);
							}
						}
					}

					GrandExchangeOfferAgeComparator.addNpcToMenu(var31, var16, var25, var13); // L: 10166
				}

				if (var26 == 0) { // L: 10168
					Player var32 = Client.players[var16]; // L: 10169
					if (var32 == null) { // L: 10170
						continue;
					}

					if ((var32.x & 127) == 64 && (var32.y & 127) == 64) { // L: 10171
						for (var27 = 0; var27 < Client.npcCount; ++var27) { // L: 10172
							var28 = Client.npcs[Client.npcIndices[var27]]; // L: 10173
							if (var28 != null && var28.definition.size == 1 && var32.x == var28.x && var32.y == var28.y) { // L: 10174
								GrandExchangeOfferAgeComparator.addNpcToMenu(var28, Client.npcIndices[var27], var25, var13);
							}
						}

						var27 = Players.Players_count; // L: 10176
						var36 = Players.Players_indices; // L: 10177

						for (var35 = 0; var35 < var27; ++var35) { // L: 10178
							var21 = Client.players[var36[var35]]; // L: 10179
							if (var21 != null && var32 != var21 && var21.x == var32.x && var21.y == var32.y) { // L: 10180
								class233.addPlayerToMenu(var21, var36[var35], var25, var13);
							}
						}
					}

					if (var16 != Client.combatTargetPlayerIndex) { // L: 10183
						class233.addPlayerToMenu(var32, var16, var25, var13);
					} else {
						var4 = var23; // L: 10184
					}
				}

				if (var26 == 3) { // L: 10186
					NodeDeque var34 = Client.groundItems[class20.Client_plane][var25][var13]; // L: 10187
					if (var34 != null) { // L: 10188
						for (TileItem var33 = (TileItem)var34.first(); var33 != null; var33 = (TileItem)var34.next()) { // L: 10189 10190 10223
							ItemComposition var37 = UserComparator6.ItemDefinition_get(var33.id); // L: 10191
							if (Client.isItemSelected == 1) { // L: 10192
								class11.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + UserComparator5.colorStartTag(16748608) + var37.name, 16, var33.id, var25, var13); // L: 10193
							} else if (Client.isSpellSelected) { // L: 10196
								if ((class91.selectedSpellFlags & 1) == 1) { // L: 10197
									class11.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + UserComparator5.colorStartTag(16748608) + var37.name, 17, var33.id, var25, var13); // L: 10198
								}
							} else {
								String[] var29 = var37.groundActions; // L: 10203

								for (int var30 = 4; var30 >= 0; --var30) { // L: 10204
									if (var29 != null && var29[var30] != null) { // L: 10205
										byte var22 = 0; // L: 10206
										if (var30 == 0) { // L: 10207
											var22 = 18;
										}

										if (var30 == 1) { // L: 10208
											var22 = 19;
										}

										if (var30 == 2) { // L: 10209
											var22 = 20;
										}

										if (var30 == 3) { // L: 10210
											var22 = 21;
										}

										if (var30 == 4) { // L: 10211
											var22 = 22;
										}

										class11.insertMenuItemNoShift(var29[var30], UserComparator5.colorStartTag(16748608) + var37.name, var22, var33.id, var25, var13); // L: 10212
									} else if (var30 == 2) { // L: 10215
										class11.insertMenuItemNoShift("Take", UserComparator5.colorStartTag(16748608) + var37.name, 20, var33.id, var25, var13); // L: 10216
									}
								}

								class11.insertMenuItemNoShift("Examine", UserComparator5.colorStartTag(16748608) + var37.name, 1004, var33.id, var25, var13); // L: 10220
							}
						}
					}
				}
			}
		}

		if (-1L != var4) { // L: 10228
			var8 = MouseRecorder.method2159(var4); // L: 10229
			int var9 = (int)(var4 >>> 7 & 127L); // L: 10232
			Player var11 = Client.players[Client.combatTargetPlayerIndex]; // L: 10235
			class233.addPlayerToMenu(var11, Client.combatTargetPlayerIndex, var8, var9); // L: 10236
		}

	} // L: 10238
}
