import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("g")
public class class23 {
	@ObfuscatedName("qi")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("musicTrackArchive")
	public static AbstractArchive musicTrackArchive;
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	@Export("archive17")
	static Archive archive17;

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "2075504300"
	)
	static boolean method251(char var0) {
		for (int var1 = 0; var1 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var1) { // L: 807
			if (var0 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var1)) { // L: 808
				return true;
			}
		}

		return false; // L: 810
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "38"
	)
	public static final void method252() {
		ViewportMouse.ViewportMouse_isInViewport = false; // L: 78
		ViewportMouse.ViewportMouse_entityCount = 0; // L: 79
	} // L: 80

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(ILco;ZI)I",
		garbageValue = "-504519930"
	)
	static int method249(int var0, Script var1, boolean var2) {
		Widget var5;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) { // L: 1259
			var5 = UserComparator4.getWidget(Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]); // L: 1260
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var5.itemId; // L: 1261
			return 1; // L: 1262
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) { // L: 1264
			var5 = UserComparator4.getWidget(Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]); // L: 1265
			if (var5.itemId != -1) { // L: 1266
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var5.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 1267
			}

			return 1; // L: 1268
		} else if (var0 == ScriptOpcodes.IF_HASSUB) { // L: 1270
			int var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 1271
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3); // L: 1272
			if (var4 != null) { // L: 1273
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 1274
			}

			return 1; // L: 1275
		} else if (var0 == ScriptOpcodes.IF_GETTOP) { // L: 1277
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.rootInterface; // L: 1278
			return 1; // L: 1279
		} else {
			return 2; // L: 1281
		}
	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1423787338"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		ItemDefinition.method4874(); // L: 11119

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 11121
			if (var1.obj != null) { // L: 11122
				var1.set();
			}
		}

		int var4 = PendingSpawn.VarpDefinition_get(var0).type; // L: 11125
		if (var4 != 0) { // L: 11126
			int var2 = Varps.Varps_main[var0]; // L: 11127
			if (var4 == 1) { // L: 11128
				if (var2 == 1) { // L: 11129
					Rasterizer3D.Rasterizer3D_setBrightness(0.9D); // L: 11130
					((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(0.9D); // L: 11131
				}

				if (var2 == 2) { // L: 11133
					Rasterizer3D.Rasterizer3D_setBrightness(0.8D); // L: 11134
					((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(0.8D); // L: 11135
				}

				if (var2 == 3) { // L: 11137
					Rasterizer3D.Rasterizer3D_setBrightness(0.7D); // L: 11138
					((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(0.7D); // L: 11139
				}

				if (var2 == 4) { // L: 11141
					Rasterizer3D.Rasterizer3D_setBrightness(0.6D); // L: 11142
					((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(0.6D); // L: 11143
				}

				ItemDefinition.ItemDefinition_cachedSprites.clear(); // L: 11146
			}

			if (var4 == 3) { // L: 11149
				short var3 = 0; // L: 11150
				if (var2 == 0) { // L: 11151
					var3 = 255;
				}

				if (var2 == 1) { // L: 11152
					var3 = 192;
				}

				if (var2 == 2) { // L: 11153
					var3 = 128;
				}

				if (var2 == 3) { // L: 11154
					var3 = 64;
				}

				if (var2 == 4) { // L: 11155
					var3 = 0;
				}

				if (var3 != Client.musicVolume) { // L: 11156
					if (Client.musicVolume == 0 && Client.currentTrackGroupId != -1) { // L: 11157
						Canvas.method952(ApproximateRouteStrategy.archive6, Client.currentTrackGroupId, 0, var3, false); // L: 11158
						Client.field916 = false; // L: 11159
					} else if (var3 == 0) { // L: 11161
						class13.midiPcmStream.clear(); // L: 11163
						class206.musicPlayerStatus = 1; // L: 11164
						musicTrackArchive = null; // L: 11165
						Client.field916 = false; // L: 11167
					} else {
						FontName.method5459(var3); // L: 11169
					}

					Client.musicVolume = var3; // L: 11170
				}
			}

			if (var4 == 4) { // L: 11173
				if (var2 == 0) { // L: 11174
					Client.soundEffectVolume = 127;
				}

				if (var2 == 1) { // L: 11175
					Client.soundEffectVolume = 96;
				}

				if (var2 == 2) { // L: 11176
					Client.soundEffectVolume = 64;
				}

				if (var2 == 3) { // L: 11177
					Client.soundEffectVolume = 32;
				}

				if (var2 == 4) { // L: 11178
					Client.soundEffectVolume = 0;
				}
			}

			if (var4 == 5) { // L: 11180
				Client.leftClickOpensMenu = var2;
			}

			if (var4 == 6) { // L: 11181
				Client.chatEffects = var2;
			}

			if (var4 == 9) { // L: 11182
				Client.field846 = var2;
			}

			if (var4 == 10) { // L: 11183
				if (var2 == 0) { // L: 11184
					Client.areaSoundEffectVolume = 127;
				}

				if (var2 == 1) { // L: 11185
					Client.areaSoundEffectVolume = 96;
				}

				if (var2 == 2) { // L: 11186
					Client.areaSoundEffectVolume = 64;
				}

				if (var2 == 3) { // L: 11187
					Client.areaSoundEffectVolume = 32;
				}

				if (var2 == 4) { // L: 11188
					Client.areaSoundEffectVolume = 0;
				}
			}

			if (var4 == 17) { // L: 11190
				Client.followerIndex = var2 & 65535; // L: 11191
			}

			if (var4 == 18) { // L: 11193
				Client.playerAttackOption = (AttackOption)class195.findEnumerated(SoundSystem.method2631(), var2); // L: 11194
				if (Client.playerAttackOption == null) { // L: 11195
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var4 == 19) { // L: 11197
				if (var2 == -1) { // L: 11198
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047; // L: 11199
				}
			}

			if (var4 == 22) { // L: 11201
				AttackOption[] var5 = new AttackOption[]{AttackOption.AttackOption_leftClickWhereAvailable, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_hidden, AttackOption.AttackOption_alwaysRightClick}; // L: 11204
				Client.npcAttackOption = (AttackOption)class195.findEnumerated(var5, var2); // L: 11206
				if (Client.npcAttackOption == null) { // L: 11207
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	} // L: 11209
}
