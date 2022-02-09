import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ki")
@Implements("NetFileRequest")
public class NetFileRequest extends DualNode {
	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	@Export("socketTask")
	static Task socketTask;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("archive")
	public Archive archive;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -2046840871
	)
	@Export("crc")
	public int crc;
	@ObfuscatedName("s")
	@Export("padding")
	public byte padding;

	NetFileRequest() {
	} // L: 10

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lpi;J)V"
	)
	static void method5573(Buffer var0, long var1) {
		var1 /= 10L; // L: 63
		if (var1 < 0L) { // L: 64
			var1 = 0L;
		} else if (var1 > 65535L) { // L: 65
			var1 = 65535L;
		}

		var0.writeShort((int)var1); // L: 66
	} // L: 67

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "62"
	)
	static void method5572() {
		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) { // L: 4652
			AbstractWorldMapData.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false); // L: 4653
		}

	} // L: 4655

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1305407373"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		WorldMapAreaData.method4855(); // L: 11569

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 11571
			if (var1.obj != null) { // L: 11572
				var1.set();
			}
		}

		int var4 = PcmPlayer.VarpDefinition_get(var0).type; // L: 11575
		if (var4 != 0) { // L: 11576
			int var2 = Varps.Varps_main[var0]; // L: 11577
			if (var4 == 1) { // L: 11578
				if (var2 == 1) { // L: 11579
					LoginType.method7149(0.9D);
				}

				if (var2 == 2) { // L: 11580
					LoginType.method7149(0.8D);
				}

				if (var2 == 3) { // L: 11581
					LoginType.method7149(0.7D);
				}

				if (var2 == 4) { // L: 11582
					LoginType.method7149(0.6D);
				}
			}

			if (var4 == 3) { // L: 11584
				if (var2 == 0) { // L: 11585
					class21.method299(255);
				}

				if (var2 == 1) { // L: 11586
					class21.method299(192);
				}

				if (var2 == 2) { // L: 11587
					class21.method299(128);
				}

				if (var2 == 3) { // L: 11588
					class21.method299(64);
				}

				if (var2 == 4) { // L: 11589
					class21.method299(0);
				}
			}

			if (var4 == 4) { // L: 11591
				if (var2 == 0) { // L: 11592
					MouseHandler.updateSoundEffectVolume(127);
				}

				if (var2 == 1) { // L: 11593
					MouseHandler.updateSoundEffectVolume(96);
				}

				if (var2 == 2) { // L: 11594
					MouseHandler.updateSoundEffectVolume(64);
				}

				if (var2 == 3) { // L: 11595
					MouseHandler.updateSoundEffectVolume(32);
				}

				if (var2 == 4) { // L: 11596
					MouseHandler.updateSoundEffectVolume(0);
				}
			}

			if (var4 == 5) {
				Client.leftClickOpensMenu = var2; // L: 11598
			}

			if (var4 == 6) { // L: 11599
				Client.chatEffects = var2;
			}

			if (var4 == 9) { // L: 11600
				Client.field669 = var2;
			}

			if (var4 == 10) { // L: 11601
				if (var2 == 0) { // L: 11602
					UrlRequest.method2424(127);
				}

				if (var2 == 1) { // L: 11603
					UrlRequest.method2424(96);
				}

				if (var2 == 2) { // L: 11604
					UrlRequest.method2424(64);
				}

				if (var2 == 3) { // L: 11605
					UrlRequest.method2424(32);
				}

				if (var2 == 4) { // L: 11606
					UrlRequest.method2424(0);
				}
			}

			if (var4 == 17) { // L: 11608
				Client.followerIndex = var2 & 65535; // L: 11609
			}

			AttackOption[] var3;
			if (var4 == 18) { // L: 11611
				var3 = new AttackOption[]{AttackOption.field1267, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_hidden, AttackOption.AttackOption_alwaysRightClick, AttackOption.field1263}; // L: 11614
				Client.playerAttackOption = (AttackOption)class140.findEnumerated(var3, var2); // L: 11616
				if (Client.playerAttackOption == null) { // L: 11617
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var4 == 19) { // L: 11619
				if (var2 == -1) { // L: 11620
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047; // L: 11621
				}
			}

			if (var4 == 22) { // L: 11623
				var3 = new AttackOption[]{AttackOption.field1267, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_hidden, AttackOption.AttackOption_alwaysRightClick, AttackOption.field1263}; // L: 11626
				Client.npcAttackOption = (AttackOption)class140.findEnumerated(var3, var2); // L: 11628
				if (Client.npcAttackOption == null) { // L: 11629
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	} // L: 11631
}
