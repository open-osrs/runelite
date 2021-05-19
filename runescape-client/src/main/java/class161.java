import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
public class class161 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Les;",
		garbageValue = "-1661347291"
	)
	@Export("KitDefinition_get")
	public static KitDefinition KitDefinition_get(int var0) {
		KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0); // L: 27
		if (var1 != null) { // L: 28
			return var1;
		} else {
			byte[] var2 = KitDefinition.KitDefinition_archive.takeFile(3, var0);
			var1 = new KitDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			KitDefinition.KitDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SIII)V",
		garbageValue = "-2066180942"
	)
	@Export("sortItemsByName")
	public static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) { // L: 9
			int var4 = (var3 + var2) / 2; // L: 10
			int var5 = var2; // L: 11
			String var6 = var0[var4]; // L: 12
			var0[var4] = var0[var3]; // L: 13
			var0[var3] = var6; // L: 14
			short var7 = var1[var4]; // L: 15
			var1[var4] = var1[var3]; // L: 16
			var1[var3] = var7; // L: 17

			for (int var8 = var2; var8 < var3; ++var8) { // L: 18
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) { // L: 19
					String var9 = var0[var8]; // L: 20
					var0[var8] = var0[var5]; // L: 21
					var0[var5] = var9; // L: 22
					short var10 = var1[var8]; // L: 23
					var1[var8] = var1[var5]; // L: 24
					var1[var5++] = var10; // L: 25
				}
			}

			var0[var3] = var0[var5]; // L: 29
			var0[var5] = var6; // L: 30
			var1[var3] = var1[var5]; // L: 31
			var1[var5] = var7; // L: 32
			sortItemsByName(var0, var1, var2, var5 - 1); // L: 33
			sortItemsByName(var0, var1, var5 + 1, var3); // L: 34
		}

	} // L: 36

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(Liv;II)I",
		garbageValue = "-1689981377"
	)
	static final int method3150(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) { // L: 10180
			try {
				int[] var2 = var0.cs1Instructions[var1]; // L: 10182
				int var3 = 0; // L: 10183
				int var4 = 0; // L: 10184
				byte var5 = 0; // L: 10185

				while (true) {
					int var6 = var2[var4++]; // L: 10187
					int var7 = 0; // L: 10188
					byte var8 = 0; // L: 10189
					if (var6 == 0) { // L: 10190
						return var3;
					}

					if (var6 == 1) { // L: 10191
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) { // L: 10192
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) { // L: 10193
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) { // L: 10194
						var9 = var2[var4++] << 16; // L: 10195
						var9 += var2[var4++]; // L: 10196
						var10 = DevicePcmPlayerProvider.getWidget(var9); // L: 10197
						var11 = var2[var4++]; // L: 10198
						if (var11 != -1 && (!Strings.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 10199
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 10200
								if (var11 + 1 == var10.itemIds[var12]) { // L: 10201
									var7 += var10.itemQuantities[var12];
								}
							}
						}
					}

					if (var6 == 5) { // L: 10205
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) { // L: 10206
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) { // L: 10207
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) { // L: 10208
						var7 = class35.localPlayer.combatLevel;
					}

					if (var6 == 9) { // L: 10209
						for (var9 = 0; var9 < 25; ++var9) { // L: 10210
							if (Skills.Skills_enabled[var9]) { // L: 10211
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) { // L: 10214
						var9 = var2[var4++] << 16; // L: 10215
						var9 += var2[var4++]; // L: 10216
						var10 = DevicePcmPlayerProvider.getWidget(var9); // L: 10217
						var11 = var2[var4++]; // L: 10218
						if (var11 != -1 && (!Strings.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 10219
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 10220
								if (var11 + 1 == var10.itemIds[var12]) { // L: 10221
									var7 = 999999999; // L: 10222
									break; // L: 10223
								}
							}
						}
					}

					if (var6 == 11) { // L: 10228
						var7 = Client.runEnergy;
					}

					if (var6 == 12) { // L: 10229
						var7 = Client.weight;
					}

					if (var6 == 13) { // L: 10230
						var9 = Varps.Varps_main[var2[var4++]]; // L: 10231
						int var13 = var2[var4++]; // L: 10232
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0; // L: 10233
					}

					if (var6 == 14) { // L: 10235
						var9 = var2[var4++]; // L: 10236
						var7 = ObjectComposition.getVarbit(var9); // L: 10237
					}

					if (var6 == 15) { // L: 10239
						var8 = 1;
					}

					if (var6 == 16) { // L: 10240
						var8 = 2;
					}

					if (var6 == 17) { // L: 10241
						var8 = 3;
					}

					if (var6 == 18) { // L: 10242
						var7 = (class35.localPlayer.x >> 7) + JagexCache.baseX;
					}

					if (var6 == 19) { // L: 10243
						var7 = (class35.localPlayer.y >> 7) + Messages.baseY;
					}

					if (var6 == 20) { // L: 10244
						var7 = var2[var4++];
					}

					if (var8 == 0) { // L: 10245
						if (var5 == 0) { // L: 10246
							var3 += var7;
						}

						if (var5 == 1) { // L: 10247
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) { // L: 10248
							var3 /= var7;
						}

						if (var5 == 3) { // L: 10249
							var3 *= var7;
						}

						var5 = 0; // L: 10250
					} else {
						var5 = var8; // L: 10252
					}
				}
			} catch (Exception var14) { // L: 10255
				return -1; // L: 10256
			}
		} else {
			return -2;
		}
	}
}
