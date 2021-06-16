import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("m")
public class class6 extends class14 {
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("archive18")
	static Archive archive18;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -753176319
	)
	int field47;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 239857617
	)
	int field45;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lv;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lv;)V"
	)
	class6(class2 var1) {
		this.this$0 = var1; // L: 271
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "73833784"
	)
	void vmethod363(Buffer var1) {
		this.field47 = var1.readInt(); // L: 274
		this.field45 = var1.readInt(); // L: 275
	} // L: 276

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lb;I)V",
		garbageValue = "1885623446"
	)
	void vmethod354(ClanSettings var1) {
		var1.method188(this.field47, this.field45); // L: 279
	} // L: 280

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-719237513"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.field862) { // L: 3785
			Decimator.method1169(); // L: 3786
		} else if (var0 != -1 && var0 != Client.currentTrackGroupId && class4.clientPreferences.musicVolume != 0 && !Client.field862) { // L: 3788
			WorldMapIcon_1.method3300(2, DynamicObject.archive6, var0, 0, class4.clientPreferences.musicVolume, false); // L: 3789
		}

		Client.currentTrackGroupId = var0; // L: 3791
	} // L: 3792

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-28"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		WorldMapID.method3717(); // L: 11144
		Canvas.method495(); // L: 11145
		int var1 = class1.VarpDefinition_get(var0).type; // L: 11146
		if (var1 != 0) { // L: 11147
			int var2 = Varps.Varps_main[var0]; // L: 11148
			if (var1 == 1) { // L: 11149
				if (var2 == 1) { // L: 11150
					UserComparator10.method2568(0.9D);
				}

				if (var2 == 2) { // L: 11151
					UserComparator10.method2568(0.8D);
				}

				if (var2 == 3) { // L: 11152
					UserComparator10.method2568(0.7D);
				}

				if (var2 == 4) { // L: 11153
					UserComparator10.method2568(0.6D);
				}
			}

			if (var1 == 3) { // L: 11155
				if (var2 == 0) { // L: 11156
					class0.method0(255);
				}

				if (var2 == 1) { // L: 11157
					class0.method0(192);
				}

				if (var2 == 2) { // L: 11158
					class0.method0(128);
				}

				if (var2 == 3) { // L: 11159
					class0.method0(64);
				}

				if (var2 == 4) { // L: 11160
					class0.method0(0);
				}
			}

			if (var1 == 4) { // L: 11162
				if (var2 == 0) { // L: 11163
					class226.updateSoundEffectVolume(127);
				}

				if (var2 == 1) { // L: 11164
					class226.updateSoundEffectVolume(96);
				}

				if (var2 == 2) { // L: 11165
					class226.updateSoundEffectVolume(64);
				}

				if (var2 == 3) { // L: 11166
					class226.updateSoundEffectVolume(32);
				}

				if (var2 == 4) { // L: 11167
					class226.updateSoundEffectVolume(0);
				}
			}

			if (var1 == 5) { // L: 11169
				Client.leftClickOpensMenu = var2;
			}

			if (var1 == 6) { // L: 11170
				Client.chatEffects = var2;
			}

			if (var1 == 9) { // L: 11171
				Client.field891 = var2;
			}

			if (var1 == 10) { // L: 11172
				if (var2 == 0) { // L: 11173
					NPCComposition.method2882(127);
				}

				if (var2 == 1) { // L: 11174
					NPCComposition.method2882(96);
				}

				if (var2 == 2) { // L: 11175
					NPCComposition.method2882(64);
				}

				if (var2 == 3) { // L: 11176
					NPCComposition.method2882(32);
				}

				if (var2 == 4) { // L: 11177
					NPCComposition.method2882(0);
				}
			}

			if (var1 == 17) { // L: 11179
				Client.followerIndex = var2 & 65535; // L: 11180
			}

			AttackOption[] var3;
			if (var1 == 18) { // L: 11182
				var3 = new AttackOption[]{AttackOption.AttackOption_leftClickWhereAvailable, AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_hidden}; // L: 11185
				Client.playerAttackOption = (AttackOption)Clock.findEnumerated(var3, var2); // L: 11187
				if (Client.playerAttackOption == null) { // L: 11188
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var1 == 19) { // L: 11190
				if (var2 == -1) { // L: 11191
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047; // L: 11192
				}
			}

			if (var1 == 22) { // L: 11194
				var3 = new AttackOption[]{AttackOption.AttackOption_leftClickWhereAvailable, AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_hidden}; // L: 11197
				Client.npcAttackOption = (AttackOption)Clock.findEnumerated(var3, var2); // L: 11199
				if (Client.npcAttackOption == null) { // L: 11200
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	} // L: 11202
}
