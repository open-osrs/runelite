import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("x")
public class class14 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -845209745
	)
	final int field85;
	@ObfuscatedName("l")
	final String field83;
	@ObfuscatedName("s")
	final ThreadFactory field84;
	@ObfuscatedName("e")
	final ThreadPoolExecutor field82;

	public class14(String var1, int var2, int var3) {
		this.field83 = var1;
		this.field85 = var2;
		this.field84 = new class16(this); // L: 17
		this.field82 = this.method167(var3);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/util/concurrent/ThreadPoolExecutor;",
		garbageValue = "1"
	)
	final ThreadPoolExecutor method167(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field85), this.field84); // L: 22
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ly;I)Lj;",
		garbageValue = "2078751615"
	)
	public class19 method174(class10 var1) {
		if (this.field82.getQueue().remainingCapacity() <= 0) { // L: 26
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field82.getCorePoolSize() + " Queue capacity " + this.field85); // L: 27
			return new class19("Queue full"); // L: 28
		} else {
			class19 var2 = new class19(this.field82.submit(new class20(this, var1))); // L: 30
			return var2; // L: 31
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1535010747"
	)
	public final void method169() {
		try {
			this.field82.shutdown(); // L: 36
		} catch (Exception var2) { // L: 38
			System.err.println("Error shutting down RestRequestService\r\n" + var2); // L: 39
		}

	} // L: 41

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Loi;",
		garbageValue = "-108388034"
	)
	public static class414 method178(int var0) {
		int var1 = class412.field4484[var0]; // L: 11
		if (var1 == 1) { // L: 12
			return class414.field4487; // L: 13
		} else if (var1 == 2) { // L: 15
			return class414.field4495; // L: 16
		} else {
			return var1 == 3 ? class414.field4489 : null; // L: 18 19 21
		}
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(Lcw;IIIB)V",
		garbageValue = "-98"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (WorldMapSprite.localPlayer != var0) { // L: 9650
			if (Client.menuOptionsCount < 400) { // L: 9651
				String var4;
				int var7;
				if (var0.skillLevel == 0) { // L: 9653
					String var5 = var0.actions[0] + var0.username + var0.actions[1]; // L: 9654
					var7 = var0.combatLevel; // L: 9656
					int var8 = WorldMapSprite.localPlayer.combatLevel; // L: 9657
					int var9 = var8 - var7; // L: 9659
					String var6;
					if (var9 < -9) { // L: 9660
						var6 = LoginScreenAnimation.colorStartTag(16711680); // L: 9661
					} else if (var9 < -6) { // L: 9664
						var6 = LoginScreenAnimation.colorStartTag(16723968); // L: 9665
					} else if (var9 < -3) { // L: 9668
						var6 = LoginScreenAnimation.colorStartTag(16740352); // L: 9669
					} else if (var9 < 0) { // L: 9672
						var6 = LoginScreenAnimation.colorStartTag(16756736); // L: 9673
					} else if (var9 > 9) { // L: 9676
						var6 = LoginScreenAnimation.colorStartTag(65280); // L: 9677
					} else if (var9 > 6) { // L: 9680
						var6 = LoginScreenAnimation.colorStartTag(4259584); // L: 9681
					} else if (var9 > 3) { // L: 9684
						var6 = LoginScreenAnimation.colorStartTag(8453888); // L: 9685
					} else if (var9 > 0) { // L: 9688
						var6 = LoginScreenAnimation.colorStartTag(12648192); // L: 9689
					} else {
						var6 = LoginScreenAnimation.colorStartTag(16776960); // L: 9692
					}

					var4 = var5 + var6 + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2]; // L: 9694
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2]; // L: 9696
				}

				int var10;
				if (Client.isItemSelected == 1) { // L: 9697
					class11.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + LoginScreenAnimation.colorStartTag(16777215) + var4, 14, var1, var2, var3); // L: 9698
				} else if (Client.isSpellSelected) { // L: 9701
					if ((RouteStrategy.selectedSpellFlags & 8) == 8) { // L: 9702
						class11.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + LoginScreenAnimation.colorStartTag(16777215) + var4, 15, var1, var2, var3); // L: 9703
					}
				} else {
					for (var10 = 7; var10 >= 0; --var10) { // L: 9708
						if (Client.playerMenuActions[var10] != null) { // L: 9709
							short var11 = 0; // L: 9710
							if (Client.playerMenuActions[var10].equalsIgnoreCase("Attack")) { // L: 9711
								if (Client.playerAttackOption == AttackOption.AttackOption_hidden) { // L: 9712
									continue;
								}

								if (AttackOption.AttackOption_alwaysRightClick == Client.playerAttackOption || Client.playerAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var0.combatLevel > WorldMapSprite.localPlayer.combatLevel) { // L: 9713
									var11 = 2000; // L: 9714
								}

								if (WorldMapSprite.localPlayer.team != 0 && var0.team != 0) { // L: 9716
									if (var0.team == WorldMapSprite.localPlayer.team) { // L: 9717
										var11 = 2000;
									} else {
										var11 = 0; // L: 9718
									}
								} else if (Client.playerAttackOption == AttackOption.field1263 && var0.isClanMember()) { // L: 9720
									var11 = 2000; // L: 9721
								}
							} else if (Client.playerOptionsPriorities[var10]) { // L: 9724
								var11 = 2000;
							}

							boolean var12 = false; // L: 9725
							var7 = Client.playerMenuOpcodes[var10] + var11; // L: 9726
							class11.insertMenuItemNoShift(Client.playerMenuActions[var10], LoginScreenAnimation.colorStartTag(16777215) + var4, var7, var1, var2, var3); // L: 9727
						}
					}
				}

				for (var10 = 0; var10 < Client.menuOptionsCount; ++var10) { // L: 9732
					if (Client.menuOpcodes[var10] == 23) { // L: 9733
						Client.menuTargets[var10] = LoginScreenAnimation.colorStartTag(16777215) + var4; // L: 9734
						break;
					}
				}

			}
		}
	} // L: 9738
}
