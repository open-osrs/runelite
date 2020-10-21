import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("aq")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Laq;"
	)
	static final WorldMapID field295;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Laq;"
	)
	static final WorldMapID field292;
	@ObfuscatedName("c")
	@Export("SpriteBuffer_spritePalette")
	static int[] SpriteBuffer_spritePalette;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1395703893
	)
	@Export("value")
	final int value;

	static {
		field295 = new WorldMapID(0); // L: 4
		field292 = new WorldMapID(1); // L: 5
	}

	WorldMapID(int var1) {
		this.value = var1; // L: 9
	} // L: 10

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;ZB)Lmr;",
		garbageValue = "-97"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(JagexCache.cacheDir, "preferences" + var0 + ".dat"); // L: 252
		if (var3.exists()) { // L: 253
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L); // L: 255
				return var10; // L: 256
			} catch (IOException var9) { // L: 258
			}
		}

		String var4 = ""; // L: 260
		if (AbstractUserComparator.cacheGamebuild == 33) { // L: 261
			var4 = "_rc";
		} else if (AbstractUserComparator.cacheGamebuild == 34) { // L: 262
			var4 = "_wip";
		}

		File var5 = new File(class52.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat"); // L: 263
		AccessFile var6;
		if (!var2 && var5.exists()) { // L: 264
			try {
				var6 = new AccessFile(var5, "rw", 10000L); // L: 266
				return var6; // L: 267
			} catch (IOException var8) { // L: 269
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L); // L: 272
			return var6; // L: 273
		} catch (IOException var7) { // L: 275
			throw new RuntimeException(); // L: 276
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "0"
	)
	static final int method665(int var0, int var1) {
		int var2 = SecureRandomFuture.method2252(var0 - 1, var1 - 1) + SecureRandomFuture.method2252(1 + var0, var1 - 1) + SecureRandomFuture.method2252(var0 - 1, 1 + var1) + SecureRandomFuture.method2252(var0 + 1, 1 + var1); // L: 455
		int var3 = SecureRandomFuture.method2252(var0 - 1, var1) + SecureRandomFuture.method2252(1 + var0, var1) + SecureRandomFuture.method2252(var0, var1 - 1) + SecureRandomFuture.method2252(var0, 1 + var1); // L: 456
		int var4 = SecureRandomFuture.method2252(var0, var1); // L: 457
		return var2 / 16 + var3 / 8 + var4 / 4; // L: 458
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ILco;ZI)I",
		garbageValue = "-610468122"
	)
	static int method667(int var0, Script var1, boolean var2) {
		Widget var3 = UserComparator4.getWidget(Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]); // L: 1285
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) { // L: 1286
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = JagexCache.Widget_unpackTargetMask(WorldMapData_0.getWidgetFlags(var3)); // L: 1287
			return 1; // L: 1288
		} else if (var0 != ScriptOpcodes.IF_GETOP) { // L: 1290
			if (var0 == ScriptOpcodes.IF_GETOPBASE) { // L: 1297
				if (var3.dataText == null) { // L: 1298
					Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1299
				}

				return 1; // L: 1300
			} else {
				return 2; // L: 1302
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 1291
			--var4; // L: 1292
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1293
				Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1294
			} else {
				Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1295
		}
	}

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "(Lcs;I)V",
		garbageValue = "1072079291"
	)
	static final void method666(Actor var0) {
		if (var0.field1024 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0 || var0.sequenceFrameCycle + 1 > class105.SequenceDefinition_get(var0.sequence).frameLengths[var0.sequenceFrame]) { // L: 4104
			int var1 = var0.field1024 - var0.field1009; // L: 4105
			int var2 = Client.cycle - var0.field1009; // L: 4106
			int var3 = var0.field1011 * 64 + var0.field1017 * 128; // L: 4107
			int var4 = var0.field1011 * 64 + var0.field1019 * 128; // L: 4108
			int var5 = var0.field1011 * 64 + var0.field1018 * 128; // L: 4109
			int var6 = var0.field1011 * 64 + var0.field1020 * 128; // L: 4110
			var0.x = (var2 * var5 + var3 * (var1 - var2)) / var1; // L: 4111
			var0.y = (var6 * var2 + var4 * (var1 - var2)) / var1; // L: 4112
		}

		var0.field978 = 0; // L: 4114
		var0.orientation = var0.field1023; // L: 4115
		var0.rotation = var0.orientation; // L: 4116
	} // L: 4117

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(Lht;II)I",
		garbageValue = "1789445641"
	)
	static final int method663(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) { // L: 10014
			try {
				int[] var2 = var0.cs1Instructions[var1]; // L: 10016
				int var3 = 0; // L: 10017
				int var4 = 0; // L: 10018
				byte var5 = 0; // L: 10019

				while (true) {
					int var6 = var2[var4++]; // L: 10021
					int var7 = 0; // L: 10022
					byte var8 = 0; // L: 10023
					if (var6 == 0) { // L: 10024
						return var3;
					}

					if (var6 == 1) { // L: 10025
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) { // L: 10026
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) { // L: 10027
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) { // L: 10028
						var9 = var2[var4++] << 16; // L: 10029
						var9 += var2[var4++]; // L: 10030
						var10 = UserComparator4.getWidget(var9); // L: 10031
						var11 = var2[var4++]; // L: 10032
						if (var11 != -1 && (!AbstractWorldMapData.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 10033
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 10034
								if (var11 + 1 == var10.itemIds[var12]) { // L: 10035
									var7 += var10.itemQuantities[var12];
								}
							}
						}
					}

					if (var6 == 5) { // L: 10039
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) { // L: 10040
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) { // L: 10041
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) { // L: 10042
						var7 = PlayerType.localPlayer.combatLevel;
					}

					if (var6 == 9) { // L: 10043
						for (var9 = 0; var9 < 25; ++var9) { // L: 10044
							if (Skills.Skills_enabled[var9]) { // L: 10045
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) { // L: 10048
						var9 = var2[var4++] << 16; // L: 10049
						var9 += var2[var4++]; // L: 10050
						var10 = UserComparator4.getWidget(var9); // L: 10051
						var11 = var2[var4++]; // L: 10052
						if (var11 != -1 && (!AbstractWorldMapData.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 10053
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 10054
								if (var11 + 1 == var10.itemIds[var12]) { // L: 10055
									var7 = 999999999; // L: 10056
									break; // L: 10057
								}
							}
						}
					}

					if (var6 == 11) { // L: 10062
						var7 = Client.runEnergy;
					}

					if (var6 == 12) { // L: 10063
						var7 = Client.weight;
					}

					if (var6 == 13) { // L: 10064
						var9 = Varps.Varps_main[var2[var4++]]; // L: 10065
						int var13 = var2[var4++]; // L: 10066
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0; // L: 10067
					}

					if (var6 == 14) { // L: 10069
						var9 = var2[var4++]; // L: 10070
						var7 = ApproximateRouteStrategy.getVarbit(var9); // L: 10071
					}

					if (var6 == 15) { // L: 10073
						var8 = 1;
					}

					if (var6 == 16) { // L: 10074
						var8 = 2;
					}

					if (var6 == 17) { // L: 10075
						var8 = 3;
					}

					if (var6 == 18) { // L: 10076
						var7 = (PlayerType.localPlayer.x >> 7) + FloorDecoration.baseX;
					}

					if (var6 == 19) { // L: 10077
						var7 = (PlayerType.localPlayer.y >> 7) + WorldMapData_0.baseY;
					}

					if (var6 == 20) { // L: 10078
						var7 = var2[var4++];
					}

					if (var8 == 0) { // L: 10079
						if (var5 == 0) { // L: 10080
							var3 += var7;
						}

						if (var5 == 1) { // L: 10081
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) { // L: 10082
							var3 /= var7;
						}

						if (var5 == 3) { // L: 10083
							var3 *= var7;
						}

						var5 = 0; // L: 10084
					} else {
						var5 = var8; // L: 10086
					}
				}
			} catch (Exception var14) { // L: 10089
				return -1; // L: 10090
			}
		} else {
			return -2;
		}
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(Lht;I)V",
		garbageValue = "898207937"
	)
	static final void method664(Widget var0) {
		int var1 = var0.contentType; // L: 11212
		if (var1 == 324) { // L: 11213
			if (Client.field945 == -1) { // L: 11214
				Client.field945 = var0.spriteId2; // L: 11215
				Client.field895 = var0.spriteId; // L: 11216
			}

			if (Client.playerAppearance.isFemale) { // L: 11218
				var0.spriteId2 = Client.field945;
			} else {
				var0.spriteId2 = Client.field895; // L: 11219
			}

		} else if (var1 == 325) { // L: 11222
			if (Client.field945 == -1) { // L: 11223
				Client.field945 = var0.spriteId2; // L: 11224
				Client.field895 = var0.spriteId; // L: 11225
			}

			if (Client.playerAppearance.isFemale) { // L: 11227
				var0.spriteId2 = Client.field895;
			} else {
				var0.spriteId2 = Client.field945; // L: 11228
			}

		} else if (var1 == 327) { // L: 11231
			var0.modelAngleX = 150; // L: 11232
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 11233
			var0.modelType = 5; // L: 11234
			var0.modelId = 0; // L: 11235
		} else if (var1 == 328) { // L: 11238
			var0.modelAngleX = 150; // L: 11239
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 11240
			var0.modelType = 5; // L: 11241
			var0.modelId = 1; // L: 11242
		}
	} // L: 11220 11229 11236 11243 11245
}
