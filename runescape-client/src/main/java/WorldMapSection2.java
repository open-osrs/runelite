import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("qa")
	@Export("ClanChat_inClanChat")
	static boolean ClanChat_inClanChat;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -169381135
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 487968763
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -317879561
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1129962761
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1913181737
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -198835895
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1054522171
	)
	int field1587;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 2073575157
	)
	int field1588;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1399481235
	)
	int field1583;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -186882901
	)
	int field1584;

	WorldMapSection2() {
	} // L: 18

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Leq;I)V",
		garbageValue = "-609192354"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field1587) { // L: 21
			var1.regionLowX = this.field1587;
		}

		if (var1.regionHighX < this.field1583) {
			var1.regionHighX = this.field1583; // L: 22
		}

		if (var1.regionLowY > this.field1588) { // L: 23
			var1.regionLowY = this.field1588;
		}

		if (var1.regionHighY < this.field1584) { // L: 24
			var1.regionHighY = this.field1584;
		}

	} // L: 25

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-2146205978"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) { // L: 28
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY; // L: 31
		} else {
			return false; // L: 29
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-916390789"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field1587 && var1 >> 6 <= this.field1583 && var2 >> 6 >= this.field1588 && var2 >> 6 <= this.field1584; // L: 35
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "1101045563"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 39
			return null; // L: 40
		} else {
			int[] var4 = new int[]{var2 + (this.field1587 * 64 - this.regionStartX * 64), var3 + (this.field1588 * 64 - this.regionStartY * 64)}; // L: 42 43 44
			return var4; // L: 45
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)Lhk;",
		garbageValue = "1643926479"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 49
			return null; // L: 50
		} else {
			int var3 = this.regionStartX * 64 - this.field1587 * 64 + var1; // L: 52
			int var4 = var2 + (this.regionStartY * 64 - this.field1588 * 64); // L: 53
			return new Coord(this.minPlane, var3, var4); // L: 54
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "-576756767"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte(); // L: 58
		this.planes = var1.readUnsignedByte(); // L: 59
		this.regionStartX = var1.readUnsignedShort(); // L: 60
		this.regionStartY = var1.readUnsignedShort(); // L: 61
		this.regionEndX = var1.readUnsignedShort(); // L: 62
		this.regionEndY = var1.readUnsignedShort(); // L: 63
		this.field1587 = var1.readUnsignedShort(); // L: 64
		this.field1588 = var1.readUnsignedShort(); // L: 65
		this.field1583 = var1.readUnsignedShort(); // L: 66
		this.field1584 = var1.readUnsignedShort(); // L: 67
		this.postRead(); // L: 68
	} // L: 69

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-50622469"
	)
	@Export("postRead")
	void postRead() {
	} // L: 71

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(Lkc;IIII)V",
		garbageValue = "1629548080"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPCComposition var0, int var1, int var2, int var3) {
		if (Client.menuOptionsCount < 400) { // L: 9212
			if (var0.transforms != null) { // L: 9213
				var0 = var0.transform();
			}

			if (var0 != null) { // L: 9214
				if (var0.isInteractable) { // L: 9215
					if (!var0.isFollower || Client.followerIndex == var1) { // L: 9216
						String var4 = var0.name; // L: 9217
						int var7;
						int var8;
						if (var0.combatLevel != 0) { // L: 9218
							var7 = var0.combatLevel; // L: 9221
							var8 = Varcs.localPlayer.combatLevel; // L: 9222
							int var9 = var8 - var7; // L: 9224
							String var6;
							if (var9 < -9) { // L: 9225
								var6 = DefaultsGroup.colorStartTag(16711680); // L: 9226
							} else if (var9 < -6) { // L: 9229
								var6 = DefaultsGroup.colorStartTag(16723968); // L: 9230
							} else if (var9 < -3) { // L: 9233
								var6 = DefaultsGroup.colorStartTag(16740352); // L: 9234
							} else if (var9 < 0) { // L: 9237
								var6 = DefaultsGroup.colorStartTag(16756736); // L: 9238
							} else if (var9 > 9) { // L: 9241
								var6 = DefaultsGroup.colorStartTag(65280); // L: 9242
							} else if (var9 > 6) { // L: 9245
								var6 = DefaultsGroup.colorStartTag(4259584); // L: 9246
							} else if (var9 > 3) { // L: 9249
								var6 = DefaultsGroup.colorStartTag(8453888); // L: 9250
							} else if (var9 > 0) { // L: 9253
								var6 = DefaultsGroup.colorStartTag(12648192); // L: 9254
							} else {
								var6 = DefaultsGroup.colorStartTag(16776960); // L: 9257
							}

							var4 = var4 + var6 + " " + " (" + "level-" + var0.combatLevel + ")"; // L: 9259
						}

						if (var0.isFollower && Client.followerOpsLowPriority) { // L: 9261
							SpriteMask.insertMenuItemNoShift("Examine", DefaultsGroup.colorStartTag(16776960) + var4, 1003, var1, var2, var3); // L: 9262
						}

						if (Client.isItemSelected == 1) { // L: 9265
							SpriteMask.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + DefaultsGroup.colorStartTag(16776960) + var4, 7, var1, var2, var3); // L: 9266
						} else if (Client.isSpellSelected) { // L: 9269
							if ((UserComparator10.selectedSpellFlags & 2) == 2) { // L: 9270
								SpriteMask.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + DefaultsGroup.colorStartTag(16776960) + var4, 8, var1, var2, var3); // L: 9271
							}
						} else {
							int var10 = var0.isFollower && Client.followerOpsLowPriority ? 2000 : 0; // L: 9276
							String[] var11 = var0.actions; // L: 9277
							if (var11 != null) { // L: 9278
								for (var7 = 4; var7 >= 0; --var7) { // L: 9279
									if (var11[var7] != null && !var11[var7].equalsIgnoreCase("Attack")) { // L: 9280
										var8 = 0; // L: 9281
										if (var7 == 0) { // L: 9282
											var8 = var10 + 9;
										}

										if (var7 == 1) { // L: 9283
											var8 = var10 + 10;
										}

										if (var7 == 2) { // L: 9284
											var8 = var10 + 11;
										}

										if (var7 == 3) { // L: 9285
											var8 = var10 + 12;
										}

										if (var7 == 4) { // L: 9286
											var8 = var10 + 13;
										}

										SpriteMask.insertMenuItemNoShift(var11[var7], DefaultsGroup.colorStartTag(16776960) + var4, var8, var1, var2, var3); // L: 9287
									}
								}
							}

							if (var11 != null) { // L: 9292
								for (var7 = 4; var7 >= 0; --var7) { // L: 9293
									if (var11[var7] != null && var11[var7].equalsIgnoreCase("Attack")) { // L: 9294
										short var12 = 0; // L: 9295
										if (AttackOption.AttackOption_hidden != Client.npcAttackOption) { // L: 9296
											if (Client.npcAttackOption == AttackOption.AttackOption_alwaysRightClick || AttackOption.AttackOption_dependsOnCombatLevels == Client.npcAttackOption && var0.combatLevel > Varcs.localPlayer.combatLevel) { // L: 9297
												var12 = 2000; // L: 9298
											}

											var8 = 0; // L: 9300
											if (var7 == 0) { // L: 9301
												var8 = var12 + 9;
											}

											if (var7 == 1) { // L: 9302
												var8 = var12 + 10;
											}

											if (var7 == 2) { // L: 9303
												var8 = var12 + 11;
											}

											if (var7 == 3) { // L: 9304
												var8 = var12 + 12;
											}

											if (var7 == 4) { // L: 9305
												var8 = var12 + 13;
											}

											SpriteMask.insertMenuItemNoShift(var11[var7], DefaultsGroup.colorStartTag(16776960) + var4, var8, var1, var2, var3); // L: 9306
										}
									}
								}
							}

							if (!var0.isFollower || !Client.followerOpsLowPriority) { // L: 9311
								SpriteMask.insertMenuItemNoShift("Examine", DefaultsGroup.colorStartTag(16776960) + var4, 1003, var1, var2, var3); // L: 9312
							}
						}

					}
				}
			}
		}
	} // L: 9316

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "0"
	)
	static final String method2726(int var0) {
		return var0 < 999999999 ? Integer.toString(var0) : "*"; // L: 10081 10082
	}
}
