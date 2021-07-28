import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ap")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "[Lof;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("archive12")
	static Archive archive12;

	ApproximateRouteStrategy() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIILfy;I)Z",
		garbageValue = "-1237332144"
	)
	@Export("hasArrived")
	protected boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY;
	}

	@ObfuscatedName("j")
	public static int method880(long var0) {
		return (int)(var0 >>> 0 & 127L);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)[Lou;",
		garbageValue = "50"
	)
	@Export("FillMode_values")
	public static FillMode[] FillMode_values() {
		return new FillMode[]{FillMode.field4256, FillMode.SOLID, FillMode.field4255};
	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(Lbb;ZI)V",
		garbageValue = "-2147483639"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(Player var0, boolean var1) {
		if (var0 != null && var0.isVisible() && !var0.isHidden) {
			var0.isUnanimated = false;
			if ((Client.isLowDetail && Players.Players_count > 50 || Players.Players_count > 200) && var1 && var0.idleSequence == var0.movementSequence) {
				var0.isUnanimated = true;
			}

			int var2 = var0.x >> 7;
			int var3 = var0.y >> 7;
			if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
				long var4 = class171.calculateTag(0, 0, 0, false, var0.index);
				if (var0.model0 != null && Client.cycle >= var0.animationCycleStart && Client.cycle < var0.animationCycleEnd) {
					var0.isUnanimated = false;
					var0.tileHeight = class122.getTileHeight(var0.x, var0.y, GrandExchangeEvent.Client_plane);
					var0.playerCycle = Client.cycle;
					WorldMapIcon_1.scene.addNullableObject(GrandExchangeEvent.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.minX, var0.minY, var0.maxX, var0.maxY);
				} else {
					if ((var0.x & 127) == 64 && (var0.y & 127) == 64) {
						if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) {
							return;
						}

						Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount;
					}

					var0.tileHeight = class122.getTileHeight(var0.x, var0.y, GrandExchangeEvent.Client_plane);
					var0.playerCycle = Client.cycle;
					WorldMapIcon_1.scene.drawEntity(GrandExchangeEvent.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking);
				}
			}
		}

	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-514166571"
	)
	@Export("selectSpell")
	static void selectSpell(int var0, int var1, int var2, int var3) {
		Widget var4 = ObjectSound.getWidgetChild(var0, var1);
		if (var4 != null && var4.onTargetEnter != null) {
			ScriptEvent var5 = new ScriptEvent();
			var5.widget = var4;
			var5.args = var4.onTargetEnter;
			UserComparator10.runScriptEvent(var5);
		}

		Client.field564 = var3;
		Client.isSpellSelected = true;
		PcmPlayer.selectedSpellWidget = var0;
		Client.selectedSpellChildIndex = var1;
		ViewportMouse.selectedSpellFlags = var2;
		AttackOption.invalidateWidget(var4);
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-26736"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		class107.method2291();
		VarcInt.method2741();
		int var1 = FriendSystem.VarpDefinition_get(var0).type;
		if (var1 != 0) {
			int var2 = Varps.Varps_main[var0];
			if (var1 == 1) {
				if (var2 == 1) {
					BuddyRankComparator.method2200(0.9D);
				}

				if (var2 == 2) {
					BuddyRankComparator.method2200(0.8D);
				}

				if (var2 == 3) {
					BuddyRankComparator.method2200(0.7D);
				}

				if (var2 == 4) {
					BuddyRankComparator.method2200(0.6D);
				}
			}

			if (var1 == 3) {
				if (var2 == 0) {
					TaskHandler.method2582(255);
				}

				if (var2 == 1) {
					TaskHandler.method2582(192);
				}

				if (var2 == 2) {
					TaskHandler.method2582(128);
				}

				if (var2 == 3) {
					TaskHandler.method2582(64);
				}

				if (var2 == 4) {
					TaskHandler.method2582(0);
				}
			}

			if (var1 == 4) {
				if (var2 == 0) {
					class98.updateSoundEffectVolume(127);
				}

				if (var2 == 1) {
					class98.updateSoundEffectVolume(96);
				}

				if (var2 == 2) {
					class98.updateSoundEffectVolume(64);
				}

				if (var2 == 3) {
					class98.updateSoundEffectVolume(32);
				}

				if (var2 == 4) {
					class98.updateSoundEffectVolume(0);
				}
			}

			if (var1 == 5) {
				Client.leftClickOpensMenu = var2;
			}

			if (var1 == 6) {
				Client.chatEffects = var2;
			}

			if (var1 == 9) {
				Client.field654 = var2;
			}

			if (var1 == 10) {
				if (var2 == 0) {
					class16.method175(127);
				}

				if (var2 == 1) {
					class16.method175(96);
				}

				if (var2 == 2) {
					class16.method175(64);
				}

				if (var2 == 3) {
					class16.method175(32);
				}

				if (var2 == 4) {
					class16.method175(0);
				}
			}

			if (var1 == 17) {
				Client.followerIndex = var2 & 65535;
			}

			if (var1 == 18) {
				Client.playerAttackOption = (AttackOption)Huffman.findEnumerated(Language.method5233(), var2);
				if (Client.playerAttackOption == null) {
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var1 == 19) {
				if (var2 == -1) {
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047;
				}
			}

			if (var1 == 22) {
				Client.npcAttackOption = (AttackOption)Huffman.findEnumerated(Language.method5233(), var2);
				if (Client.npcAttackOption == null) {
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	}
}
