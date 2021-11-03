import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bo")
@Implements("GraphicsObject")
public class GraphicsObject extends Renderable {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 193750031
	)
	@Export("id")
	int id;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -198143099
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 2072861117
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1279579483
	)
	@Export("x")
	int x;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -817954883
	)
	@Export("y")
	int y;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -2037596073
	)
	@Export("height")
	int height;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -2011716423
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 639704075
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("b")
	@Export("isFinished")
	boolean isFinished;

	public GraphicsObject()
	{
	}

	GraphicsObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.frame = 0; // L: 16
		this.frameCycle = 0; // L: 17
		this.isFinished = false; // L: 18
		this.id = var1; // L: 21
		this.plane = var2; // L: 22
		this.x = var3; // L: 23
		this.y = var4; // L: 24
		this.height = var5; // L: 25
		this.cycleStart = var7 + var6; // L: 26
		int var8 = BZip2State.SpotAnimationDefinition_get(this.id).sequence; // L: 27
		if (var8 != -1) { // L: 28
			this.isFinished = false; // L: 29
			this.sequenceDefinition = MouseHandler.SequenceDefinition_get(var8); // L: 30
		} else {
			this.isFinished = true; // L: 32
		}

	} // L: 33

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "98"
	)
	@Export("advance")
	final void advance(int var1) {
		if (!this.isFinished) { // L: 36
			this.frameCycle += var1; // L: 37

			while (this.frameCycle > this.sequenceDefinition.frameLengths[this.frame]) { // L: 38
				this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame]; // L: 39
				++this.frame; // L: 40
				if (this.frame >= this.sequenceDefinition.frameIds.length) { // L: 41
					this.isFinished = true; // L: 42
					break;
				}
			}

		}
	} // L: 46

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Lhl;",
		garbageValue = "461766541"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = BZip2State.SpotAnimationDefinition_get(this.id); // L: 49
		Model var2;
		if (!this.isFinished) { // L: 51
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1); // L: 52
		}

		return var2 == null ? null : var2; // L: 53
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "-2056514813"
	)
	static int method1896(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class120.scriptDotWidget : Frames.scriptActiveWidget; // L: 1203
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) { // L: 1204
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = SecureRandomCallable.Widget_unpackTargetMask(PendingSpawn.getWidgetFlags(var3)); // L: 1205
			return 1; // L: 1206
		} else if (var0 != ScriptOpcodes.CC_GETOP) { // L: 1208
			if (var0 == ScriptOpcodes.CC_GETOPBASE) { // L: 1215
				if (var3.dataText == null) { // L: 1216
					Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1217
				}

				return 1; // L: 1218
			} else {
				return 2; // L: 1220
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 1209
			--var4; // L: 1210
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1211
				Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1212
			} else {
				Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1213
		}
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(Lcx;IIII)V",
		garbageValue = "1361246201"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (HealthBarDefinition.localPlayer != var0) { // L: 9585
			if (Client.menuOptionsCount < 400) { // L: 9586
				String var4;
				int var7;
				if (var0.skillLevel == 0) { // L: 9588
					String var5 = var0.actions[0] + var0.username + var0.actions[1]; // L: 9589
					var7 = var0.combatLevel; // L: 9591
					int var8 = HealthBarDefinition.localPlayer.combatLevel; // L: 9592
					int var9 = var8 - var7; // L: 9594
					String var6;
					if (var9 < -9) { // L: 9595
						var6 = MouseHandler.colorStartTag(16711680); // L: 9596
					} else if (var9 < -6) { // L: 9599
						var6 = MouseHandler.colorStartTag(16723968); // L: 9600
					} else if (var9 < -3) { // L: 9603
						var6 = MouseHandler.colorStartTag(16740352); // L: 9604
					} else if (var9 < 0) { // L: 9607
						var6 = MouseHandler.colorStartTag(16756736); // L: 9608
					} else if (var9 > 9) { // L: 9611
						var6 = MouseHandler.colorStartTag(65280); // L: 9612
					} else if (var9 > 6) { // L: 9615
						var6 = MouseHandler.colorStartTag(4259584); // L: 9616
					} else if (var9 > 3) { // L: 9619
						var6 = MouseHandler.colorStartTag(8453888); // L: 9620
					} else if (var9 > 0) { // L: 9623
						var6 = MouseHandler.colorStartTag(12648192); // L: 9624
					} else {
						var6 = MouseHandler.colorStartTag(16776960); // L: 9627
					}

					var4 = var5 + var6 + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2]; // L: 9629
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2]; // L: 9631
				}

				int var10;
				if (Client.isItemSelected == 1) { // L: 9632
					EnumComposition.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + MouseHandler.colorStartTag(16777215) + var4, 14, var1, var2, var3); // L: 9633
				} else if (Client.isSpellSelected) { // L: 9636
					if ((class116.selectedSpellFlags & 8) == 8) { // L: 9637
						EnumComposition.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + MouseHandler.colorStartTag(16777215) + var4, 15, var1, var2, var3); // L: 9638
					}
				} else {
					for (var10 = 7; var10 >= 0; --var10) { // L: 9643
						if (Client.playerMenuActions[var10] != null) { // L: 9644
							short var11 = 0; // L: 9645
							if (Client.playerMenuActions[var10].equalsIgnoreCase("Attack")) { // L: 9646
								if (Client.playerAttackOption == AttackOption.AttackOption_hidden) { // L: 9647
									continue;
								}

								if (AttackOption.AttackOption_alwaysRightClick == Client.playerAttackOption || Client.playerAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var0.combatLevel > HealthBarDefinition.localPlayer.combatLevel) { // L: 9648
									var11 = 2000; // L: 9649
								}

								if (HealthBarDefinition.localPlayer.team != 0 && var0.team != 0) { // L: 9651
									if (var0.team == HealthBarDefinition.localPlayer.team) { // L: 9652
										var11 = 2000;
									} else {
										var11 = 0; // L: 9653
									}
								} else if (AttackOption.field1226 == Client.playerAttackOption && var0.isClanMember()) { // L: 9655
									var11 = 2000; // L: 9656
								}
							} else if (Client.playerOptionsPriorities[var10]) { // L: 9659
								var11 = 2000;
							}

							boolean var12 = false; // L: 9660
							var7 = Client.playerMenuOpcodes[var10] + var11; // L: 9661
							EnumComposition.insertMenuItemNoShift(Client.playerMenuActions[var10], MouseHandler.colorStartTag(16777215) + var4, var7, var1, var2, var3); // L: 9662
						}
					}
				}

				for (var10 = 0; var10 < Client.menuOptionsCount; ++var10) { // L: 9667
					if (Client.menuOpcodes[var10] == 23) { // L: 9668
						Client.menuTargets[var10] = MouseHandler.colorStartTag(16777215) + var4; // L: 9669
						break;
					}
				}

			}
		}
	} // L: 9673
}
