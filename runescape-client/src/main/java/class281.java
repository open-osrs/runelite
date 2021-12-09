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
		UserComparator6.method2551(); // L: 12161
		ObjectComposition.method3540(); // L: 12162
		int var1 = SecureRandomCallable.VarpDefinition_get(var0).type; // L: 12163
		if (var1 != 0) { // L: 12164
			int var2 = Varps.Varps_main[var0]; // L: 12165
			if (var1 == 1) { // L: 12166
				if (var2 == 1) { // L: 12167
					InterfaceParent.method2142(0.9D);
				}

				if (var2 == 2) { // L: 12168
					InterfaceParent.method2142(0.8D);
				}

				if (var2 == 3) { // L: 12169
					InterfaceParent.method2142(0.7D);
				}

				if (var2 == 4) { // L: 12170
					InterfaceParent.method2142(0.6D);
				}
			}

			if (var1 == 3) { // L: 12172
				if (var2 == 0) { // L: 12173
					Varcs.method2426(255);
				}

				if (var2 == 1) { // L: 12174
					Varcs.method2426(192);
				}

				if (var2 == 2) { // L: 12175
					Varcs.method2426(128);
				}

				if (var2 == 3) { // L: 12176
					Varcs.method2426(64);
				}

				if (var2 == 4) { // L: 12177
					Varcs.method2426(0);
				}
			}

			if (var1 == 4) { // L: 12179
				if (var2 == 0) { // L: 12180
					class20.updateSoundEffectVolume(127);
				}

				if (var2 == 1) { // L: 12181
					class20.updateSoundEffectVolume(96);
				}

				if (var2 == 2) { // L: 12182
					class20.updateSoundEffectVolume(64);
				}

				if (var2 == 3) { // L: 12183
					class20.updateSoundEffectVolume(32);
				}

				if (var2 == 4) { // L: 12184
					class20.updateSoundEffectVolume(0);
				}
			}

			if (var1 == 5) { // L: 12186
				Client.leftClickOpensMenu = var2;
			}

			if (var1 == 6) { // L: 12187
				Client.chatEffects = var2;
			}

			if (var1 == 9) { // L: 12188
				Client.field641 = var2;
			}

			if (var1 == 10) { // L: 12189
				if (var2 == 0) { // L: 12190
					Players.method2383(127);
				}

				if (var2 == 1) { // L: 12191
					Players.method2383(96);
				}

				if (var2 == 2) { // L: 12192
					Players.method2383(64);
				}

				if (var2 == 3) { // L: 12193
					Players.method2383(32);
				}

				if (var2 == 4) { // L: 12194
					Players.method2383(0);
				}
			}

			if (var1 == 17) { // L: 12196
				Client.followerIndex = var2 & 65535; // L: 12197
			}

			if (var1 == 18) { // L: 12199
				Client.playerAttackOption = (AttackOption)class130.findEnumerated(FloorUnderlayDefinition.method3376(), var2); // L: 12200
				if (Client.playerAttackOption == null) { // L: 12201
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var1 == 19) { // L: 12203
				if (var2 == -1) { // L: 12204
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047; // L: 12205
				}
			}

			if (var1 == 22) { // L: 12207
				Client.npcAttackOption = (AttackOption)class130.findEnumerated(FloorUnderlayDefinition.method3376(), var2); // L: 12208
				if (Client.npcAttackOption == null) { // L: 12209
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	} // L: 12211
}
