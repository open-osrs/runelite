import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ay")
public class class27 extends class14 {
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	static StudioGame field208;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -455433791
	)
	int field209;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lu;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lu;)V"
	)
	class27(class2 var1) {
		this.this$0 = var1;
		this.field209 = -1; // L: 144
	} // L: 146

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "-1383981708"
	)
	void vmethod371(Buffer var1) {
		this.field209 = var1.readUnsignedShort(); // L: 149
	} // L: 150

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lm;I)V",
		garbageValue = "-1475503816"
	)
	void vmethod376(class11 var1) {
		var1.method190(this.field209); // L: 153
	} // L: 154

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "190996497"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop; // L: 10396
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "862148066"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		class105.method2255(); // L: 11187

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 11189
			if (var1.obj != null) { // L: 11190
				var1.set();
			}
		}

		int var4 = class303.VarpDefinition_get(var0).type; // L: 11193
		if (var4 != 0) { // L: 11194
			int var2 = Varps.Varps_main[var0]; // L: 11195
			if (var4 == 1) { // L: 11196
				if (var2 == 1) { // L: 11197
					MouseRecorder.method2109(0.9D);
				}

				if (var2 == 2) { // L: 11198
					MouseRecorder.method2109(0.8D);
				}

				if (var2 == 3) { // L: 11199
					MouseRecorder.method2109(0.7D);
				}

				if (var2 == 4) { // L: 11200
					MouseRecorder.method2109(0.6D);
				}
			}

			if (var4 == 3) { // L: 11202
				if (var2 == 0) { // L: 11203
					Messages.method2367(255);
				}

				if (var2 == 1) { // L: 11204
					Messages.method2367(192);
				}

				if (var2 == 2) { // L: 11205
					Messages.method2367(128);
				}

				if (var2 == 3) { // L: 11206
					Messages.method2367(64);
				}

				if (var2 == 4) { // L: 11207
					Messages.method2367(0);
				}
			}

			if (var4 == 4) { // L: 11209
				if (var2 == 0) { // L: 11210
					Canvas.updateSoundEffectVolume(127);
				}

				if (var2 == 1) { // L: 11211
					Canvas.updateSoundEffectVolume(96);
				}

				if (var2 == 2) { // L: 11212
					Canvas.updateSoundEffectVolume(64);
				}

				if (var2 == 3) { // L: 11213
					Canvas.updateSoundEffectVolume(32);
				}

				if (var2 == 4) { // L: 11214
					Canvas.updateSoundEffectVolume(0);
				}
			}

			if (var4 == 5) { // L: 11216
				Client.leftClickOpensMenu = var2;
			}

			if (var4 == 6) {
				Client.chatEffects = var2; // L: 11217
			}

			if (var4 == 9) { // L: 11218
				Client.field767 = var2;
			}

			if (var4 == 10) { // L: 11219
				if (var2 == 0) { // L: 11220
					MusicPatchPcmStream.method4126(127);
				}

				if (var2 == 1) { // L: 11221
					MusicPatchPcmStream.method4126(96);
				}

				if (var2 == 2) { // L: 11222
					MusicPatchPcmStream.method4126(64);
				}

				if (var2 == 3) { // L: 11223
					MusicPatchPcmStream.method4126(32);
				}

				if (var2 == 4) { // L: 11224
					MusicPatchPcmStream.method4126(0);
				}
			}

			if (var4 == 17) { // L: 11226
				Client.followerIndex = var2 & 65535; // L: 11227
			}

			AttackOption[] var3;
			if (var4 == 18) { // L: 11229
				var3 = new AttackOption[]{AttackOption.AttackOption_hidden, AttackOption.AttackOption_leftClickWhereAvailable, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_alwaysRightClick}; // L: 11232
				Client.playerAttackOption = (AttackOption)UserComparator8.findEnumerated(var3, var2); // L: 11234
				if (Client.playerAttackOption == null) { // L: 11235
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var4 == 19) { // L: 11237
				if (var2 == -1) { // L: 11238
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047; // L: 11239
				}
			}

			if (var4 == 22) { // L: 11241
				var3 = new AttackOption[]{AttackOption.AttackOption_hidden, AttackOption.AttackOption_leftClickWhereAvailable, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_alwaysRightClick}; // L: 11244
				Client.npcAttackOption = (AttackOption)UserComparator8.findEnumerated(var3, var2); // L: 11246
				if (Client.npcAttackOption == null) { // L: 11247
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	} // L: 11249
}
