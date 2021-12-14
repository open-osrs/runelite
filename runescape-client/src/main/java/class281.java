import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
public class class281 {
	@ObfuscatedName("rq")
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	@Export("pcmStreamMixer")
	static PcmStreamMixer pcmStreamMixer;
	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	static Widget field3375;

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1649545590"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		UserComparator6.method2551();
		ObjectComposition.method3540();
		int var1 = SecureRandomCallable.VarpDefinition_get(var0).type;
		if (var1 != 0) {
			int var2 = Varps.Varps_main[var0];
			if (var1 == 1) {
				if (var2 == 1) {
					InterfaceParent.method2142(0.9D);
				}

				if (var2 == 2) {
					InterfaceParent.method2142(0.8D);
				}

				if (var2 == 3) {
					InterfaceParent.method2142(0.7D);
				}

				if (var2 == 4) {
					InterfaceParent.method2142(0.6D);
				}
			}

			if (var1 == 3) {
				if (var2 == 0) {
					Varcs.method2426(255);
				}

				if (var2 == 1) {
					Varcs.method2426(192);
				}

				if (var2 == 2) {
					Varcs.method2426(128);
				}

				if (var2 == 3) {
					Varcs.method2426(64);
				}

				if (var2 == 4) {
					Varcs.method2426(0);
				}
			}

			if (var1 == 4) {
				if (var2 == 0) {
					class20.updateSoundEffectVolume(127);
				}

				if (var2 == 1) {
					class20.updateSoundEffectVolume(96);
				}

				if (var2 == 2) {
					class20.updateSoundEffectVolume(64);
				}

				if (var2 == 3) {
					class20.updateSoundEffectVolume(32);
				}

				if (var2 == 4) {
					class20.updateSoundEffectVolume(0);
				}
			}

			if (var1 == 5) {
				Client.leftClickOpensMenu = var2;
			}

			if (var1 == 6) {
				Client.chatEffects = var2;
			}

			if (var1 == 9) {
				Client.field641 = var2;
			}

			if (var1 == 10) {
				if (var2 == 0) {
					Players.method2383(127);
				}

				if (var2 == 1) {
					Players.method2383(96);
				}

				if (var2 == 2) {
					Players.method2383(64);
				}

				if (var2 == 3) {
					Players.method2383(32);
				}

				if (var2 == 4) {
					Players.method2383(0);
				}
			}

			if (var1 == 17) {
				Client.followerIndex = var2 & 65535;
			}

			if (var1 == 18) {
				Client.playerAttackOption = (AttackOption)class130.findEnumerated(FloorUnderlayDefinition.method3376(), var2);
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
				Client.npcAttackOption = (AttackOption)class130.findEnumerated(FloorUnderlayDefinition.method3376(), var2);
				if (Client.npcAttackOption == null) {
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	}
}
