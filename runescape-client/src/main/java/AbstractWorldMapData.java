import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("archive9")
	static Archive archive9;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -20064217
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -2014332989
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1125941169
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -2054969583
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -682605071
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -518585079
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1136601731
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1951051003
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("d")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("c")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("j")
	byte[][][] field1690;
	@ObfuscatedName("r")
	byte[][][] field1700;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "[[[[Lej;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("t")
	boolean field1702;
	@ObfuscatedName("v")
	boolean field1703;

	AbstractWorldMapData() {
		this.groupId = -1; // L: 14
		this.fileId = -1; // L: 15
		new LinkedList();
		this.field1702 = false; // L: 26
		this.field1703 = false; // L: 27
	} // L: 29

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "-930076916"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "811477602"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field1702 && this.field1703; // L: 32
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lir;I)V",
		garbageValue = "-458727625"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) { // L: 36
			byte[] var2 = var1.takeFile(this.groupId, this.fileId); // L: 37
			if (var2 != null) { // L: 38
				this.readGeography(new Buffer(var2)); // L: 39
				this.field1702 = true; // L: 40
				this.field1703 = true; // L: 41
			}

		}
	} // L: 43

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-31474"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null;
		this.floorOverlayIds = null;
		this.field1690 = null; // L: 48
		this.field1700 = null;
		this.decorations = null;
		this.field1702 = false; // L: 51
		this.field1703 = false; // L: 52
	} // L: 53

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IILnu;B)V",
		garbageValue = "5"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte(); // L: 56
		if (var4 != 0) { // L: 57
			if ((var4 & 1) != 0) { // L: 60
				this.method3072(var1, var2, var3, var4); // L: 61
			} else {
				this.method3073(var1, var2, var3, var4); // L: 64
			}

		}
	} // L: 58 66

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IILnu;II)V",
		garbageValue = "-100897215"
	)
	void method3072(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0; // L: 69
		if (var5) { // L: 70
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedByte(); // L: 71
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte(); // L: 73
	} // L: 74

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IILnu;II)V",
		garbageValue = "-740435920"
	)
	void method3073(int var1, int var2, Buffer var3, int var4) {
		int var5 = ((var4 & 24) >> 3) + 1; // L: 77
		boolean var6 = (var4 & 2) != 0; // L: 78
		boolean var7 = (var4 & 4) != 0; // L: 79
		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte(); // L: 80
		int var8;
		int var9;
		int var11;
		if (var6) { // L: 81
			var8 = var3.readUnsignedByte(); // L: 82

			for (var9 = 0; var9 < var8; ++var9) { // L: 83
				int var14 = var3.readUnsignedByte(); // L: 84
				if (var14 != 0) { // L: 85
					this.floorOverlayIds[var9][var1][var2] = (short)var14; // L: 86
					var11 = var3.readUnsignedByte(); // L: 87
					this.field1690[var9][var1][var2] = (byte)(var11 >> 2); // L: 88
					this.field1700[var9][var1][var2] = (byte)(var11 & 3); // L: 89
				}
			}
		}

		if (var7) { // L: 93
			for (var8 = 0; var8 < var5; ++var8) { // L: 94
				var9 = var3.readUnsignedByte(); // L: 95
				if (var9 != 0) { // L: 96
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9]; // L: 99

					for (var11 = 0; var11 < var9; ++var11) { // L: 100
						int var12 = var3.method6597(); // L: 101
						int var13 = var3.readUnsignedByte(); // L: 102
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3); // L: 103
					}
				}
			}
		}

	} // L: 107

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-928216914"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX; // L: 112
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-56"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY; // L: 116
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)[Lgl;",
		garbageValue = "-43"
	)
	public static class203[] method3099() {
		return new class203[]{class203.field2335, class203.field2327, class203.field2333, class203.field2329, class203.field2330, class203.field2331, class203.field2332, class203.field2339, class203.field2334, class203.field2328};
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1081768663"
	)
	public static int method3079(int var0) {
		return var0 >> 17 & 7; // L: 17
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "-779732662"
	)
	public static int method3102(byte[] var0, int var1, int var2) {
		int var3 = -1; // L: 45

		for (int var4 = var1; var4 < var2; ++var4) { // L: 46
			var3 = var3 >>> 8 ^ Buffer.crc32Table[(var3 ^ var0[var4]) & 255]; // L: 47
		}

		var3 = ~var3; // L: 49
		return var3; // L: 50
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(Lcs;IIII)V",
		garbageValue = "1966691326"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (Varcs.localPlayer != var0) { // L: 9319
			if (Client.menuOptionsCount < 400) { // L: 9320
				String var4;
				int var7;
				if (var0.skillLevel == 0) { // L: 9322
					String var5 = var0.actions[0] + var0.username + var0.actions[1]; // L: 9323
					var7 = var0.combatLevel; // L: 9325
					int var8 = Varcs.localPlayer.combatLevel; // L: 9326
					int var9 = var8 - var7; // L: 9328
					String var6;
					if (var9 < -9) { // L: 9329
						var6 = DefaultsGroup.colorStartTag(16711680); // L: 9330
					} else if (var9 < -6) { // L: 9333
						var6 = DefaultsGroup.colorStartTag(16723968); // L: 9334
					} else if (var9 < -3) { // L: 9337
						var6 = DefaultsGroup.colorStartTag(16740352); // L: 9338
					} else if (var9 < 0) { // L: 9341
						var6 = DefaultsGroup.colorStartTag(16756736); // L: 9342
					} else if (var9 > 9) { // L: 9345
						var6 = DefaultsGroup.colorStartTag(65280); // L: 9346
					} else if (var9 > 6) { // L: 9349
						var6 = DefaultsGroup.colorStartTag(4259584); // L: 9350
					} else if (var9 > 3) { // L: 9353
						var6 = DefaultsGroup.colorStartTag(8453888); // L: 9354
					} else if (var9 > 0) { // L: 9357
						var6 = DefaultsGroup.colorStartTag(12648192); // L: 9358
					} else {
						var6 = DefaultsGroup.colorStartTag(16776960); // L: 9361
					}

					var4 = var5 + var6 + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2]; // L: 9363
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2]; // L: 9365
				}

				int var10;
				if (Client.isItemSelected == 1) { // L: 9366
					SpriteMask.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + DefaultsGroup.colorStartTag(16777215) + var4, 14, var1, var2, var3); // L: 9367
				} else if (Client.isSpellSelected) { // L: 9370
					if ((UserComparator10.selectedSpellFlags & 8) == 8) { // L: 9371
						SpriteMask.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + DefaultsGroup.colorStartTag(16777215) + var4, 15, var1, var2, var3); // L: 9372
					}
				} else {
					for (var10 = 7; var10 >= 0; --var10) { // L: 9377
						if (Client.playerMenuActions[var10] != null) { // L: 9378
							short var11 = 0; // L: 9379
							if (Client.playerMenuActions[var10].equalsIgnoreCase("Attack")) { // L: 9380
								if (AttackOption.AttackOption_hidden == Client.playerAttackOption) { // L: 9381
									continue;
								}

								if (AttackOption.AttackOption_alwaysRightClick == Client.playerAttackOption || AttackOption.AttackOption_dependsOnCombatLevels == Client.playerAttackOption && var0.combatLevel > Varcs.localPlayer.combatLevel) { // L: 9382
									var11 = 2000; // L: 9383
								}

								if (Varcs.localPlayer.team != 0 && var0.team != 0) { // L: 9385
									if (var0.team == Varcs.localPlayer.team) { // L: 9386
										var11 = 2000;
									} else {
										var11 = 0; // L: 9387
									}
								}
							} else if (Client.playerOptionsPriorities[var10]) { // L: 9390
								var11 = 2000;
							}

							boolean var12 = false; // L: 9391
							var7 = Client.playerMenuOpcodes[var10] + var11; // L: 9392
							SpriteMask.insertMenuItemNoShift(Client.playerMenuActions[var10], DefaultsGroup.colorStartTag(16777215) + var4, var7, var1, var2, var3); // L: 9393
						}
					}
				}

				for (var10 = 0; var10 < Client.menuOptionsCount; ++var10) { // L: 9398
					if (Client.menuOpcodes[var10] == 23) { // L: 9399
						Client.menuTargets[var10] = DefaultsGroup.colorStartTag(16777215) + var4; // L: 9400
						break;
					}
				}

			}
		}
	} // L: 9404
}
