import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lg")
public class class321 {
	@ObfuscatedName("ih")
	@ObfuscatedGetter(
		intValue = 1257274213
	)
	static int field4076;

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(Lki;Lgl;IIZB)V",
		garbageValue = "1"
	)
	@Export("addWidgetItemMenuItem")
	static final void addWidgetItemMenuItem(Widget var0, ItemComposition var1, int var2, int var3, boolean var4) {
		String[] var5 = var1.inventoryActions; // L: 10985
		byte var6 = -1; // L: 10986
		String var7 = null; // L: 10987
		if (var5 != null && var5[var3] != null) { // L: 10988
			if (var3 == 0) { // L: 10989
				var6 = 33;
			} else if (var3 == 1) { // L: 10990
				var6 = 34;
			} else if (var3 == 2) {
				var6 = 35; // L: 10991
			} else if (var3 == 3) { // L: 10992
				var6 = 36;
			} else {
				var6 = 37; // L: 10993
			}

			var7 = var5[var3]; // L: 10994
		} else if (var3 == 4) { // L: 10997
			var6 = 37; // L: 10998
			var7 = "Drop"; // L: 10999
		}

		if (var6 != -1 && var7 != null) { // L: 11002
			class175.insertMenuItem(var7, class166.colorStartTag(16748608) + var1.name, var6, var1.id, var2, var0.id, var4); // L: 11003
		}

	} // L: 11005

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1133585766"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		class119.method2737(); // L: 12083

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 12085
			if (var1.obj != null) { // L: 12086
				var1.set();
			}
		}

		int var3 = class21.VarpDefinition_get(var0).type; // L: 12089
		if (var3 != 0) { // L: 12090
			int var2 = Varps.Varps_main[var0]; // L: 12091
			if (var3 == 1) { // L: 12092
				if (var2 == 1) { // L: 12093
					Rasterizer3D.Rasterizer3D_setBrightness(0.9D); // L: 12094
					((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(0.9D); // L: 12095
					VerticalAlignment.method3446(); // L: 12096
					class12.clientPreferences.method2232(0.9D); // L: 12097
				}

				if (var2 == 2) { // L: 12099
					Rasterizer3D.Rasterizer3D_setBrightness(0.8D); // L: 12100
					((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(0.8D); // L: 12101
					VerticalAlignment.method3446(); // L: 12102
					class12.clientPreferences.method2232(0.8D); // L: 12103
				}

				if (var2 == 3) { // L: 12105
					Rasterizer3D.Rasterizer3D_setBrightness(0.7D); // L: 12106
					((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(0.7D); // L: 12107
					VerticalAlignment.method3446(); // L: 12108
					class12.clientPreferences.method2232(0.7D); // L: 12109
				}

				if (var2 == 4) { // L: 12111
					Rasterizer3D.Rasterizer3D_setBrightness(0.6D); // L: 12112
					((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(0.6D); // L: 12113
					VerticalAlignment.method3446(); // L: 12114
					class12.clientPreferences.method2232(0.6D); // L: 12115
				}
			}

			if (var3 == 3) { // L: 12118
				if (var2 == 0) { // L: 12119
					class291.method5390(255);
				}

				if (var2 == 1) { // L: 12120
					class291.method5390(192);
				}

				if (var2 == 2) { // L: 12121
					class291.method5390(128);
				}

				if (var2 == 3) {
					class291.method5390(64); // L: 12122
				}

				if (var2 == 4) { // L: 12123
					class291.method5390(0);
				}
			}

			if (var3 == 4) { // L: 12125
				if (var2 == 0) { // L: 12126
					class67.method1881(127);
				}

				if (var2 == 1) { // L: 12127
					class67.method1881(96);
				}

				if (var2 == 2) { // L: 12128
					class67.method1881(64);
				}

				if (var2 == 3) { // L: 12129
					class67.method1881(32);
				}

				if (var2 == 4) { // L: 12130
					class67.method1881(0);
				}
			}

			if (var3 == 5) { // L: 12132
				Client.leftClickOpensMenu = var2;
			}

			if (var3 == 6) { // L: 12133
				Client.chatEffects = var2;
			}

			if (var3 == 9) { // L: 12134
				Client.field480 = var2;
			}

			if (var3 == 10) { // L: 12135
				if (var2 == 0) { // L: 12136
					MouseHandler.method591(127);
				}

				if (var2 == 1) { // L: 12137
					MouseHandler.method591(96);
				}

				if (var2 == 2) { // L: 12138
					MouseHandler.method591(64);
				}

				if (var2 == 3) { // L: 12139
					MouseHandler.method591(32);
				}

				if (var2 == 4) { // L: 12140
					MouseHandler.method591(0);
				}
			}

			if (var3 == 17) { // L: 12142
				Client.followerIndex = var2 & 65535; // L: 12143
			}

			if (var3 == 18) { // L: 12145
				Client.playerAttackOption = (AttackOption)class291.findEnumerated(ApproximateRouteStrategy.method1108(), var2); // L: 12146
				if (Client.playerAttackOption == null) { // L: 12147
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var3 == 19) { // L: 12149
				if (var2 == -1) { // L: 12150
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047; // L: 12151
				}
			}

			if (var3 == 22) { // L: 12153
				Client.npcAttackOption = (AttackOption)class291.findEnumerated(ApproximateRouteStrategy.method1108(), var2); // L: 12154
				if (Client.npcAttackOption == null) { // L: 12155
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	} // L: 12157
}
