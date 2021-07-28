import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("t")
public class class1 implements Callable {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -136395951
	)
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	final Buffer field1;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lj;"
	)
	final class3 field0;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lf;"
	)
	final class7 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lf;Lnv;Lj;)V"
	)
	class1(class7 var1, Buffer var2, class3 var3) {
		this.this$0 = var1;
		this.field1 = var2;
		this.field0 = var3;
	}

	public Object call() {
		return this.field0.vmethod15(this.field1);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(III)Lay;",
		garbageValue = "938063245"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var2.getMessage(var1);
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(Lbb;IIII)V",
		garbageValue = "2142643215"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (MouseHandler.localPlayer != var0) {
			if (Client.menuOptionsCount < 400) {
				String var4;
				int var7;
				if (var0.skillLevel == 0) {
					String var5 = var0.actions[0] + var0.username + var0.actions[1];
					var7 = var0.combatLevel;
					int var8 = MouseHandler.localPlayer.combatLevel;
					int var9 = var8 - var7;
					String var6;
					if (var9 < -9) {
						var6 = ScriptFrame.colorStartTag(16711680);
					} else if (var9 < -6) {
						var6 = ScriptFrame.colorStartTag(16723968);
					} else if (var9 < -3) {
						var6 = ScriptFrame.colorStartTag(16740352);
					} else if (var9 < 0) {
						var6 = ScriptFrame.colorStartTag(16756736);
					} else if (var9 > 9) {
						var6 = ScriptFrame.colorStartTag(65280);
					} else if (var9 > 6) {
						var6 = ScriptFrame.colorStartTag(4259584);
					} else if (var9 > 3) {
						var6 = ScriptFrame.colorStartTag(8453888);
					} else if (var9 > 0) {
						var6 = ScriptFrame.colorStartTag(12648192);
					} else {
						var6 = ScriptFrame.colorStartTag(16776960);
					}

					var4 = var5 + var6 + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2];
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2];
				}

				int var10;
				if (Client.isItemSelected == 1) {
					class7.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + ScriptFrame.colorStartTag(16777215) + var4, 14, var1, var2, var3);
				} else if (Client.isSpellSelected) {
					if ((ViewportMouse.selectedSpellFlags & 8) == 8) {
						class7.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + ScriptFrame.colorStartTag(16777215) + var4, 15, var1, var2, var3);
					}
				} else {
					for (var10 = 7; var10 >= 0; --var10) {
						if (Client.playerMenuActions[var10] != null) {
							short var11 = 0;
							if (Client.playerMenuActions[var10].equalsIgnoreCase("Attack")) {
								if (AttackOption.AttackOption_hidden == Client.playerAttackOption) {
									continue;
								}

								if (AttackOption.AttackOption_alwaysRightClick == Client.playerAttackOption || AttackOption.AttackOption_dependsOnCombatLevels == Client.playerAttackOption && var0.combatLevel > MouseHandler.localPlayer.combatLevel) {
									var11 = 2000;
								}

								if (MouseHandler.localPlayer.team != 0 && var0.team != 0) {
									if (var0.team == MouseHandler.localPlayer.team) {
										var11 = 2000;
									} else {
										var11 = 0;
									}
								} else if (AttackOption.field1157 == Client.playerAttackOption && var0.isClanMember()) {
									var11 = 2000;
								}
							} else if (Client.playerOptionsPriorities[var10]) {
								var11 = 2000;
							}

							boolean var12 = false;
							var7 = Client.playerMenuOpcodes[var10] + var11;
							class7.insertMenuItemNoShift(Client.playerMenuActions[var10], ScriptFrame.colorStartTag(16777215) + var4, var7, var1, var2, var3);
						}
					}
				}

				for (var10 = 0; var10 < Client.menuOptionsCount; ++var10) {
					if (Client.menuOpcodes[var10] == 23) {
						Client.menuTargets[var10] = ScriptFrame.colorStartTag(16777215) + var4;
						break;
					}
				}

			}
		}
	}
}
