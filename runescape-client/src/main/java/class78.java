import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
public class class78 {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1805721740"
	)
	protected static final void method2098() {
		class4.clock.mark(); // L: 436

		int var0;
		for (var0 = 0; var0 < 32; ++var0) { // L: 437
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) { // L: 438
			GameEngine.clientTickTimes[var0] = 0L;
		}

		class134.gameCyclesToDo = 0; // L: 439
	} // L: 440

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "126"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		SceneTilePaint.method4499(); // L: 11392

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 11394
			if (var1.obj != null) { // L: 11395
				var1.set();
			}
		}

		int var3 = SoundCache.VarpDefinition_get(var0).type; // L: 11398
		if (var3 != 0) { // L: 11399
			int var2 = Varps.Varps_main[var0]; // L: 11400
			if (var3 == 1) { // L: 11401
				if (var2 == 1) { // L: 11402
					class175.method3439(0.9D);
				}

				if (var2 == 2) { // L: 11403
					class175.method3439(0.8D);
				}

				if (var2 == 3) { // L: 11404
					class175.method3439(0.7D);
				}

				if (var2 == 4) { // L: 11405
					class175.method3439(0.6D);
				}
			}

			if (var3 == 3) { // L: 11407
				if (var2 == 0) { // L: 11408
					Tiles.method2040(255);
				}

				if (var2 == 1) { // L: 11409
					Tiles.method2040(192);
				}

				if (var2 == 2) { // L: 11410
					Tiles.method2040(128);
				}

				if (var2 == 3) { // L: 11411
					Tiles.method2040(64);
				}

				if (var2 == 4) { // L: 11412
					Tiles.method2040(0);
				}
			}

			if (var3 == 4) { // L: 11414
				if (var2 == 0) { // L: 11415
					class28.method424(127);
				}

				if (var2 == 1) { // L: 11416
					class28.method424(96);
				}

				if (var2 == 2) { // L: 11417
					class28.method424(64);
				}

				if (var2 == 3) { // L: 11418
					class28.method424(32);
				}

				if (var2 == 4) { // L: 11419
					class28.method424(0);
				}
			}

			if (var3 == 5) { // L: 11421
				Client.leftClickOpensMenu = var2;
			}

			if (var3 == 6) { // L: 11422
				Client.chatEffects = var2;
			}

			if (var3 == 9) { // L: 11423
				Client.field655 = var2;
			}

			if (var3 == 10) { // L: 11424
				if (var2 == 0) { // L: 11425
					class21.method334(127);
				}

				if (var2 == 1) { // L: 11426
					class21.method334(96);
				}

				if (var2 == 2) { // L: 11427
					class21.method334(64);
				}

				if (var2 == 3) { // L: 11428
					class21.method334(32);
				}

				if (var2 == 4) { // L: 11429
					class21.method334(0);
				}
			}

			if (var3 == 17) { // L: 11431
				Client.followerIndex = var2 & 65535; // L: 11432
			}

			if (var3 == 18) { // L: 11434
				Client.playerAttackOption = (AttackOption)ChatChannel.findEnumerated(SoundSystem.method789(), var2); // L: 11435
				if (Client.playerAttackOption == null) { // L: 11436
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var3 == 19) { // L: 11438
				if (var2 == -1) { // L: 11439
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047; // L: 11440
				}
			}

			if (var3 == 22) { // L: 11442
				Client.npcAttackOption = (AttackOption)ChatChannel.findEnumerated(SoundSystem.method789(), var2); // L: 11443
				if (Client.npcAttackOption == null) { // L: 11444
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	} // L: 11446
}
