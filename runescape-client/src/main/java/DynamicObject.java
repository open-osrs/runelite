import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bo")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	static IndexedSprite field979;
	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "[Lqe;"
	)
	@Export("mapMarkerSprites")
	static SpritePixels[] mapMarkerSprites;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1798375219
	)
	@Export("id")
	int id;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1429314391
	)
	@Export("type")
	int type;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1262653635
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1960172765
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1525281289
	)
	@Export("x")
	int x;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1977706273
	)
	@Export("y")
	int y;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 896150091
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1038078247
	)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		descriptor = "(IIIIIIIZLgj;)V"
	)
	DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Renderable var9) {
		this.id = var1; // L: 20
		this.type = var2;
		this.orientation = var3; // L: 22
		this.plane = var4;
		this.x = var5; // L: 24
		this.y = var6;
		if (var7 != -1) { // L: 26
			this.sequenceDefinition = ScriptFrame.SequenceDefinition_get(var7); // L: 27
			this.frame = 0; // L: 28
			this.cycleStart = Client.cycle - 1; // L: 29
			if (this.sequenceDefinition.field2174 == 0 && var9 != null && var9 instanceof DynamicObject) { // L: 30
				DynamicObject var10 = (DynamicObject)var9; // L: 31
				if (this.sequenceDefinition == var10.sequenceDefinition) { // L: 32
					this.frame = var10.frame; // L: 33
					this.cycleStart = var10.cycleStart; // L: 34
					return; // L: 35
				}
			}

			if (var8 && this.sequenceDefinition.frameCount != -1) { // L: 38
				if (!this.sequenceDefinition.isCachedModelIdSet()) { // L: 39
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.frameIds.length); // L: 40
					this.cycleStart -= (int)(Math.random() * (double)this.sequenceDefinition.frameLengths[this.frame]); // L: 41
				} else {
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.method3835()); // L: 44
				}
			}
		}

	} // L: 48

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Lhy;",
		garbageValue = "1081110576"
	)
	@Export("getModel")
	protected final Model getModel() {
		int var2;
		if (this.sequenceDefinition != null) { // L: 51
			int var1 = Client.cycle - this.cycleStart; // L: 52
			if (var1 > 100 && this.sequenceDefinition.frameCount > 0) { // L: 53
				var1 = 100;
			}

			if (this.sequenceDefinition.isCachedModelIdSet()) { // L: 54
				var2 = this.sequenceDefinition.method3835(); // L: 68
				this.frame += var1; // L: 69
				var1 = 0; // L: 70
				if (this.frame >= var2) { // L: 71
					this.frame = var2 - this.sequenceDefinition.frameCount; // L: 72
					if (this.frame < 0 || this.frame > var2) { // L: 73
						this.sequenceDefinition = null; // L: 74
					}
				}
			} else {
				label79: {
					do {
						do {
							if (var1 <= this.sequenceDefinition.frameLengths[this.frame]) { // L: 55
								break label79;
							}

							var1 -= this.sequenceDefinition.frameLengths[this.frame]; // L: 56
							++this.frame; // L: 57
						} while(this.frame < this.sequenceDefinition.frameIds.length); // L: 58

						this.frame -= this.sequenceDefinition.frameCount; // L: 59
					} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length); // L: 60

					this.sequenceDefinition = null; // L: 61
				}
			}

			this.cycleStart = Client.cycle - var1; // L: 78
		}

		ObjectComposition var12 = class162.getObjectDefinition(this.id); // L: 80
		if (var12.transforms != null) { // L: 81
			var12 = var12.transform();
		}

		if (var12 == null) { // L: 82
			return null;
		} else {
			int var3;
			if (this.orientation != 1 && this.orientation != 3) { // L: 85
				var2 = var12.sizeX; // L: 90
				var3 = var12.sizeY; // L: 91
			} else {
				var2 = var12.sizeY; // L: 86
				var3 = var12.sizeX; // L: 87
			}

			int var4 = (var2 >> 1) + this.x; // L: 93
			int var5 = (var2 + 1 >> 1) + this.x; // L: 94
			int var6 = (var3 >> 1) + this.y; // L: 95
			int var7 = (var3 + 1 >> 1) + this.y; // L: 96
			int[][] var8 = Tiles.Tiles_heights[this.plane]; // L: 97
			int var9 = var8[var5][var6] + var8[var4][var6] + var8[var4][var7] + var8[var5][var7] >> 2; // L: 98
			int var10 = (this.x << 7) + (var2 << 6); // L: 99
			int var11 = (this.y << 7) + (var3 << 6); // L: 100
			return var12.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame); // L: 101
		}
	}

	@ObfuscatedName("c")
	public static final void method1991(long var0) {
		if (var0 > 0L) { // L: 9
			if (0L == var0 % 10L) { // L: 10
				GrandExchangeOfferAgeComparator.method5989(var0 - 1L); // L: 11

				try {
					Thread.sleep(1L); // L: 14
				} catch (InterruptedException var4) { // L: 16
				}
			} else {
				try {
					Thread.sleep(var0); // L: 21
				} catch (InterruptedException var3) { // L: 23
				}
			}

		}
	} // L: 25

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ILbi;ZI)I",
		garbageValue = "-313188539"
	)
	static int method1987(int var0, Script var1, boolean var2) {
		Widget var3 = class140.getWidget(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]); // L: 1351
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) { // L: 1352
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1353
			return 1; // L: 1354
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) { // L: 1356
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1357
			return 1; // L: 1358
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) { // L: 1360
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.text; // L: 1361
			return 1; // L: 1362
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) { // L: 1364
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1365
			return 1; // L: 1366
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) { // L: 1368
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1369
			return 1; // L: 1370
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) { // L: 1372
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1373
			return 1; // L: 1374
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) { // L: 1376
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1377
			return 1; // L: 1378
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) { // L: 1380
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1381
			return 1; // L: 1382
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) { // L: 1384
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1385
			return 1; // L: 1386
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) { // L: 1388
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1389
			return 1; // L: 1390
		} else if (var0 == 2610) { // L: 1392
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1393
			return 1; // L: 1394
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) { // L: 1396
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.color; // L: 1397
			return 1; // L: 1398
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) { // L: 1400
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.color2; // L: 1401
			return 1; // L: 1402
		} else if (var0 == 2613) { // L: 1404
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1405
			return 1; // L: 1406
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) { // L: 1408
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1409
			return 1; // L: 1410
		} else if (var0 != 2615 && var0 != 2616) { // L: 1412
			return 2; // L: 1416
		} else {
			++class446.Interpreter_intStackSize; // L: 1413
			return 1; // L: 1414
		}
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(Lci;IIII)V",
		garbageValue = "-902983167"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (class101.localPlayer != var0) { // L: 9987
			if (Client.menuOptionsCount < 400) { // L: 9988
				String var4;
				int var7;
				if (var0.skillLevel == 0) { // L: 9990
					String var5 = var0.actions[0] + var0.username + var0.actions[1]; // L: 9991
					var7 = var0.combatLevel; // L: 9993
					int var8 = class101.localPlayer.combatLevel; // L: 9994
					int var9 = var8 - var7; // L: 9996
					String var6;
					if (var9 < -9) { // L: 9997
						var6 = class122.colorStartTag(16711680); // L: 9998
					} else if (var9 < -6) { // L: 10001
						var6 = class122.colorStartTag(16723968); // L: 10002
					} else if (var9 < -3) { // L: 10005
						var6 = class122.colorStartTag(16740352); // L: 10006
					} else if (var9 < 0) { // L: 10009
						var6 = class122.colorStartTag(16756736); // L: 10010
					} else if (var9 > 9) { // L: 10013
						var6 = class122.colorStartTag(65280); // L: 10014
					} else if (var9 > 6) { // L: 10017
						var6 = class122.colorStartTag(4259584); // L: 10018
					} else if (var9 > 3) { // L: 10021
						var6 = class122.colorStartTag(8453888); // L: 10022
					} else if (var9 > 0) { // L: 10025
						var6 = class122.colorStartTag(12648192); // L: 10026
					} else {
						var6 = class122.colorStartTag(16776960); // L: 10029
					}

					var4 = var5 + var6 + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2]; // L: 10031
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2]; // L: 10033
				}

				int var10;
				if (Client.isItemSelected == 1) { // L: 10034
					class4.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class122.colorStartTag(16777215) + var4, 14, var1, var2, var3); // L: 10035
				} else if (Client.isSpellSelected) { // L: 10038
					if ((HealthBar.selectedSpellFlags & 8) == 8) { // L: 10039
						class4.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class122.colorStartTag(16777215) + var4, 15, var1, var2, var3); // L: 10040
					}
				} else {
					for (var10 = 7; var10 >= 0; --var10) { // L: 10045
						if (Client.playerMenuActions[var10] != null) { // L: 10046
							short var11 = 0; // L: 10047
							if (Client.playerMenuActions[var10].equalsIgnoreCase("Attack")) { // L: 10048
								if (Client.playerAttackOption == AttackOption.AttackOption_hidden) { // L: 10049
									continue;
								}

								if (AttackOption.AttackOption_alwaysRightClick == Client.playerAttackOption || AttackOption.AttackOption_dependsOnCombatLevels == Client.playerAttackOption && var0.combatLevel > class101.localPlayer.combatLevel) { // L: 10050
									var11 = 2000; // L: 10051
								}

								if (class101.localPlayer.team != 0 && var0.team != 0) { // L: 10053
									if (var0.team == class101.localPlayer.team) { // L: 10054
										var11 = 2000;
									} else {
										var11 = 0; // L: 10055
									}
								} else if (Client.playerAttackOption == AttackOption.field1294 && var0.isClanMember()) { // L: 10057
									var11 = 2000; // L: 10058
								}
							} else if (Client.playerOptionsPriorities[var10]) { // L: 10061
								var11 = 2000;
							}

							boolean var12 = false; // L: 10062
							var7 = Client.playerMenuOpcodes[var10] + var11; // L: 10063
							class4.insertMenuItemNoShift(Client.playerMenuActions[var10], class122.colorStartTag(16777215) + var4, var7, var1, var2, var3); // L: 10064
						}
					}
				}

				for (var10 = 0; var10 < Client.menuOptionsCount; ++var10) { // L: 10069
					if (Client.menuOpcodes[var10] == 23) { // L: 10070
						Client.menuTargets[var10] = class122.colorStartTag(16777215) + var4; // L: 10071
						break;
					}
				}

			}
		}
	} // L: 10075
}
