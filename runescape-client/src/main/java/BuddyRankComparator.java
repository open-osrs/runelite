import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("NetCache_reference")
	static Buffer NetCache_reference;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("f")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Llg;Llg;B)I",
		garbageValue = "-25"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.rank != var1.rank) { // L: 14
			return this.reversed ? var1.rank - var2.rank : var2.rank - var1.rank; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;Ljava/io/File;I)V",
		garbageValue = "1328812178"
	)
	static void method2475(File var0, File var1) {
		try {
			AccessFile var2 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L); // L: 216
			Buffer var3 = new Buffer(500); // L: 217
			var3.writeByte(3); // L: 218
			var3.writeByte(var1 != null ? 1 : 0); // L: 219
			var3.writeCESU8(var0.getPath()); // L: 220
			if (var1 != null) {
				var3.writeCESU8(""); // L: 221
			}

			var2.write(var3.array, 0, var3.offset); // L: 222
			var2.close(); // L: 223
		} catch (IOException var4) { // L: 225
			var4.printStackTrace(); // L: 226
		}

	} // L: 228

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-783594374"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) { // L: 9055
			SpriteMask.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3); // L: 9056
		}

		long var4 = -1L; // L: 9059
		long var6 = -1L; // L: 9060

		int var8;
		for (var8 = 0; var8 < class124.method2490(); ++var8) { // L: 9061
			long var25 = ViewportMouse.ViewportMouse_entityTags[var8]; // L: 9064
			if (var6 != var25) { // L: 9067
				var6 = var25; // L: 9068
				int var13 = Login.method1967(ViewportMouse.ViewportMouse_entityTags[var8]); // L: 9071
				int var14 = var13; // L: 9073
				long var17 = ViewportMouse.ViewportMouse_entityTags[var8]; // L: 9077
				int var16 = (int)(var17 >>> 7 & 127L); // L: 9079
				var16 = var16; // L: 9083
				int var29 = class44.method519(var8); // L: 9084
				int var18 = class19.method295(var8); // L: 9085
				if (var29 == 2 && WorldMapArea.scene.getObjectFlags(class26.Client_plane, var13, var16, var25) >= 0) { // L: 9086 9087
					ObjectComposition var19 = class19.getObjectDefinition(var18); // L: 9088
					if (var19.transforms != null) { // L: 9089
						var19 = var19.transform();
					}

					if (var19 == null) { // L: 9090
						continue;
					}

					if (Client.isItemSelected == 1) { // L: 9091
						SpriteMask.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + DefaultsGroup.colorStartTag(65535) + var19.name, 1, var18, var13, var16); // L: 9092
					} else if (Client.isSpellSelected) { // L: 9095
						if ((UserComparator10.selectedSpellFlags & 4) == 4) { // L: 9096
							SpriteMask.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + DefaultsGroup.colorStartTag(65535) + var19.name, 2, var18, var13, var16); // L: 9097
						}
					} else {
						String[] var20 = var19.actions; // L: 9102
						if (var20 != null) { // L: 9103
							for (int var21 = 4; var21 >= 0; --var21) { // L: 9104
								if (var20[var21] != null) { // L: 9105
									short var22 = 0; // L: 9106
									if (var21 == 0) { // L: 9107
										var22 = 3;
									}

									if (var21 == 1) { // L: 9108
										var22 = 4;
									}

									if (var21 == 2) { // L: 9109
										var22 = 5;
									}

									if (var21 == 3) { // L: 9110
										var22 = 6;
									}

									if (var21 == 4) { // L: 9111
										var22 = 1001;
									}

									SpriteMask.insertMenuItemNoShift(var20[var21], DefaultsGroup.colorStartTag(65535) + var19.name, var22, var18, var14, var16); // L: 9112
								}
							}
						}

						SpriteMask.insertMenuItemNoShift("Examine", DefaultsGroup.colorStartTag(65535) + var19.name, 1002, var19.id, var14, var16); // L: 9117
					}
				}

				Player var23;
				int var30;
				NPC var31;
				int var38;
				int[] var39;
				if (var29 == 1) { // L: 9122
					NPC var34 = Client.npcs[var18]; // L: 9123
					if (var34 == null) { // L: 9124
						continue;
					}

					if (var34.definition.size == 1 && (var34.x & 127) == 64 && (var34.y & 127) == 64) { // L: 9125
						for (var30 = 0; var30 < Client.npcCount; ++var30) { // L: 9126
							var31 = Client.npcs[Client.npcIndices[var30]]; // L: 9127
							if (var31 != null && var34 != var31 && var31.definition.size == 1 && var34.x == var31.x && var31.y == var34.y) { // L: 9128
								WorldMapSection2.addNpcToMenu(var31.definition, Client.npcIndices[var30], var14, var16);
							}
						}

						var30 = Players.Players_count; // L: 9130
						var39 = Players.Players_indices; // L: 9131

						for (var38 = 0; var38 < var30; ++var38) { // L: 9132
							var23 = Client.players[var39[var38]]; // L: 9133
							if (var23 != null && var34.x == var23.x && var34.y == var23.y) { // L: 9134
								AbstractWorldMapData.addPlayerToMenu(var23, var39[var38], var14, var16);
							}
						}
					}

					WorldMapSection2.addNpcToMenu(var34.definition, var18, var14, var16); // L: 9137
				}

				if (var29 == 0) { // L: 9139
					Player var35 = Client.players[var18]; // L: 9140
					if (var35 == null) { // L: 9141
						continue;
					}

					if ((var35.x & 127) == 64 && (var35.y & 127) == 64) { // L: 9142
						for (var30 = 0; var30 < Client.npcCount; ++var30) { // L: 9143
							var31 = Client.npcs[Client.npcIndices[var30]]; // L: 9144
							if (var31 != null && var31.definition.size == 1 && var31.x == var35.x && var35.y == var31.y) { // L: 9145
								WorldMapSection2.addNpcToMenu(var31.definition, Client.npcIndices[var30], var14, var16);
							}
						}

						var30 = Players.Players_count; // L: 9147
						var39 = Players.Players_indices; // L: 9148

						for (var38 = 0; var38 < var30; ++var38) { // L: 9149
							var23 = Client.players[var39[var38]]; // L: 9150
							if (var23 != null && var23 != var35 && var35.x == var23.x && var35.y == var23.y) { // L: 9151
								AbstractWorldMapData.addPlayerToMenu(var23, var39[var38], var14, var16);
							}
						}
					}

					if (var18 != Client.combatTargetPlayerIndex) { // L: 9154
						AbstractWorldMapData.addPlayerToMenu(var35, var18, var14, var16);
					} else {
						var4 = var25; // L: 9155
					}
				}

				if (var29 == 3) { // L: 9157
					NodeDeque var37 = Client.groundItems[class26.Client_plane][var14][var16]; // L: 9158
					if (var37 != null) { // L: 9159
						for (TileItem var36 = (TileItem)var37.first(); var36 != null; var36 = (TileItem)var37.next()) { // L: 9160 9161 9194
							ItemComposition var40 = class23.ItemDefinition_get(var36.id); // L: 9162
							if (Client.isItemSelected == 1) { // L: 9163
								SpriteMask.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + DefaultsGroup.colorStartTag(16748608) + var40.name, 16, var36.id, var14, var16); // L: 9164
							} else if (Client.isSpellSelected) { // L: 9167
								if ((UserComparator10.selectedSpellFlags & 1) == 1) { // L: 9168
									SpriteMask.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + DefaultsGroup.colorStartTag(16748608) + var40.name, 17, var36.id, var14, var16); // L: 9169
								}
							} else {
								String[] var32 = var40.groundActions; // L: 9174

								for (int var33 = 4; var33 >= 0; --var33) { // L: 9175
									if (var32 != null && var32[var33] != null) { // L: 9176
										byte var24 = 0; // L: 9177
										if (var33 == 0) { // L: 9178
											var24 = 18;
										}

										if (var33 == 1) { // L: 9179
											var24 = 19;
										}

										if (var33 == 2) { // L: 9180
											var24 = 20;
										}

										if (var33 == 3) { // L: 9181
											var24 = 21;
										}

										if (var33 == 4) { // L: 9182
											var24 = 22;
										}

										SpriteMask.insertMenuItemNoShift(var32[var33], DefaultsGroup.colorStartTag(16748608) + var40.name, var24, var36.id, var14, var16); // L: 9183
									} else if (var33 == 2) { // L: 9186
										SpriteMask.insertMenuItemNoShift("Take", DefaultsGroup.colorStartTag(16748608) + var40.name, 20, var36.id, var14, var16); // L: 9187
									}
								}

								SpriteMask.insertMenuItemNoShift("Examine", DefaultsGroup.colorStartTag(16748608) + var40.name, 1004, var36.id, var14, var16); // L: 9191
							}
						}
					}
				}
			}
		}

		if (-1L != var4) { // L: 9199
			var8 = Login.method1967(var4); // L: 9200
			int var9 = (int)(var4 >>> 7 & 127L); // L: 9203
			Player var11 = Client.players[Client.combatTargetPlayerIndex]; // L: 9206
			AbstractWorldMapData.addPlayerToMenu(var11, Client.combatTargetPlayerIndex, var8, var9); // L: 9207
		}

	} // L: 9209
}
