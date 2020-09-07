import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("s")
final class class2 implements class0 {
	@ObfuscatedName("ak")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	static Client client;

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lkf;B)V",
		garbageValue = "21"
	)
	public void vmethod70(Object var1, Buffer var2) {
		this.method25((Long)var1, var2); // L: 33
	} // L: 34

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lkf;I)Ljava/lang/Object;",
		garbageValue = "-453860591"
	)
	public Object vmethod61(Buffer var1) {
		return var1.readLong(); // L: 29
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Lkf;B)V",
		garbageValue = "-94"
	)
	void method25(Long var1, Buffer var2) {
		var2.writeLong(var1); // L: 25
	} // L: 26

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "([BB)Ljava/lang/String;",
		garbageValue = "36"
	)
	public static String method40(byte[] var0) {
		return PlayerAppearance.method4116(var0, 0, var0.length); // L: 58
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;ZI)Lmy;",
		garbageValue = "-65308195"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(JagexCache.cacheDir, "preferences" + var0 + ".dat"); // L: 254
		if (var3.exists()) { // L: 255
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L); // L: 257
				return var10; // L: 258
			} catch (IOException var9) { // L: 260
			}
		}

		String var4 = ""; // L: 262
		if (SoundSystem.cacheGamebuild == 33) { // L: 263
			var4 = "_rc";
		} else if (SoundSystem.cacheGamebuild == 34) { // L: 264
			var4 = "_wip";
		}

		File var5 = new File(UserComparator2.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat"); // L: 265
		AccessFile var6;
		if (!var2 && var5.exists()) { // L: 266
			try {
				var6 = new AccessFile(var5, "rw", 10000L); // L: 268
				return var6; // L: 269
			} catch (IOException var8) { // L: 271
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L); // L: 274
			return var6; // L: 275
		} catch (IOException var7) { // L: 277
			throw new RuntimeException(); // L: 278
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lky;IB)V",
		garbageValue = "0"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset; // L: 71
		Players.Players_pendingUpdateCount = 0; // L: 72
		int var3 = 0; // L: 74
		var0.importIndex(); // L: 75

		byte[] var10000;
		int var4;
		int var6;
		int var7;
		for (var4 = 0; var4 < Players.Players_count; ++var4) { // L: 76
			var7 = Players.Players_indices[var4]; // L: 77
			if ((Players.field1285[var7] & 1) == 0) { // L: 78
				if (var3 > 0) { // L: 79
					--var3; // L: 80
					var10000 = Players.field1285; // L: 81
					var10000[var7] = (byte)(var10000[var7] | 2);
				} else {
					var6 = var0.readBits(1); // L: 84
					if (var6 == 0) { // L: 85
						var3 = Tiles.method1186(var0); // L: 86
						var10000 = Players.field1285; // L: 87
						var10000[var7] = (byte)(var10000[var7] | 2);
					} else {
						class225.readPlayerUpdate(var0, var7); // L: 90
					}
				}
			}
		}

		var0.exportIndex(); // L: 93
		if (var3 != 0) {
			throw new RuntimeException();
		} else {
			var0.importIndex(); // L: 97

			for (var4 = 0; var4 < Players.Players_count; ++var4) { // L: 98
				var7 = Players.Players_indices[var4]; // L: 99
				if ((Players.field1285[var7] & 1) != 0) { // L: 100
					if (var3 > 0) { // L: 101
						--var3; // L: 102
						var10000 = Players.field1285; // L: 103
						var10000[var7] = (byte)(var10000[var7] | 2);
					} else {
						var6 = var0.readBits(1); // L: 106
						if (var6 == 0) { // L: 107
							var3 = Tiles.method1186(var0); // L: 108
							var10000 = Players.field1285; // L: 109
							var10000[var7] = (byte)(var10000[var7] | 2);
						} else {
							class225.readPlayerUpdate(var0, var7); // L: 112
						}
					}
				}
			}

			var0.exportIndex(); // L: 115
			if (var3 != 0) { // L: 116
				throw new RuntimeException(); // L: 117
			} else {
				var0.importIndex(); // L: 119

				for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) { // L: 120
					var7 = Players.Players_emptyIndices[var4]; // L: 121
					if ((Players.field1285[var7] & 1) != 0) { // L: 122
						if (var3 > 0) { // L: 123
							--var3; // L: 124
							var10000 = Players.field1285; // L: 125
							var10000[var7] = (byte)(var10000[var7] | 2);
						} else {
							var6 = var0.readBits(1); // L: 128
							if (var6 == 0) { // L: 129
								var3 = Tiles.method1186(var0); // L: 130
								var10000 = Players.field1285; // L: 131
								var10000[var7] = (byte)(var10000[var7] | 2);
							} else if (FileSystem.updateExternalPlayer(var0, var7)) { // L: 134
								var10000 = Players.field1285;
								var10000[var7] = (byte)(var10000[var7] | 2);
							}
						}
					}
				}

				var0.exportIndex(); // L: 137
				if (var3 != 0) { // L: 138
					throw new RuntimeException(); // L: 139
				} else {
					var0.importIndex(); // L: 141

					for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) { // L: 142
						var7 = Players.Players_emptyIndices[var4]; // L: 143
						if ((Players.field1285[var7] & 1) == 0) { // L: 144
							if (var3 > 0) { // L: 145
								--var3; // L: 146
								var10000 = Players.field1285; // L: 147
								var10000[var7] = (byte)(var10000[var7] | 2);
							} else {
								var6 = var0.readBits(1); // L: 150
								if (var6 == 0) { // L: 151
									var3 = Tiles.method1186(var0); // L: 152
									var10000 = Players.field1285; // L: 153
									var10000[var7] = (byte)(var10000[var7] | 2);
								} else if (FileSystem.updateExternalPlayer(var0, var7)) { // L: 156
									var10000 = Players.field1285;
									var10000[var7] = (byte)(var10000[var7] | 2);
								}
							}
						}
					}

					var0.exportIndex(); // L: 159
					if (var3 != 0) { // L: 160
						throw new RuntimeException(); // L: 161
					} else {
						Players.Players_count = 0; // L: 163
						Players.Players_emptyIdxCount = 0; // L: 164

						for (var4 = 1; var4 < 2048; ++var4) { // L: 165
							var10000 = Players.field1285; // L: 166
							var10000[var4] = (byte)(var10000[var4] >> 1);
							Player var5 = Client.players[var4]; // L: 167
							if (var5 != null) { // L: 168
								Players.Players_indices[++Players.Players_count - 1] = var4;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var4; // L: 169
							}
						}

						GrandExchangeOfferAgeComparator.method234(var0); // L: 172
						if (var0.offset - var2 != var1) { // L: 173
							throw new RuntimeException(var0.offset - var2 + " " + var1); // L: 174
						}
					}
				}
			}
		}
	} // L: 176

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1849126177"
	)
	public static void method41() {
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear(); // L: 94
	} // L: 95

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lct;Lct;IZI)I",
		garbageValue = "-1471350049"
	)
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) { // L: 211
			int var4 = var0.population; // L: 212
			int var5 = var1.population; // L: 213
			if (!var3) { // L: 214
				if (var4 == -1) { // L: 215
					var4 = 2001;
				}

				if (var5 == -1) { // L: 216
					var5 = 2001;
				}
			}

			return var4 - var5; // L: 218
		} else if (var2 == 2) { // L: 220
			return var0.location - var1.location;
		} else if (var2 == 3) { // L: 221
			if (var0.activity.equals("-")) { // L: 222
				if (var1.activity.equals("-")) { // L: 223
					return 0;
				} else {
					return var3 ? -1 : 1; // L: 224
				}
			} else if (var1.activity.equals("-")) { // L: 226
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity); // L: 227
			}
		} else if (var2 == 4) { // L: 229
			return var0.method1823() ? (var1.method1823() ? 0 : 1) : (var1.method1823() ? -1 : 0);
		} else if (var2 == 5) { // L: 230
			return var0.method1821() ? (var1.method1821() ? 0 : 1) : (var1.method1821() ? -1 : 0);
		} else if (var2 == 6) { // L: 231
			return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
		} else if (var2 == 7) { // L: 232
			return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
		} else {
			return var0.id - var1.id; // L: 233
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IZII)V",
		garbageValue = "94812799"
	)
	public static final void method37(int var0, boolean var1, int var2) {
		if (var0 >= 8000 && var0 <= 48000) { // L: 45
			PcmPlayer.field1447 = var0; // L: 46
			PcmPlayer.PcmPlayer_stereo = var1; // L: 47
			Decimator.field1491 = var2; // L: 48
		} else {
			throw new IllegalArgumentException();
		}
	} // L: 49

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(Lcf;III)V",
		garbageValue = "-1026866669"
	)
	static final void method39(MenuAction var0, int var1, int var2) {
		SecureRandomCallable.menuAction(var0.param0, var0.param1, var0.opcode, var0.identifier, var0.action, var0.action, var1, var2); // L: 7250
	} // L: 7251

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-22039586"
	)
	static void method24() {
		for (int var0 = 0; var0 < Client.menuOptionsCount; ++var0) { // L: 8258
			if (LoginScreenAnimation.method1905(Client.menuOpcodes[var0])) { // L: 8259
				if (var0 < Client.menuOptionsCount - 1) { // L: 8260
					for (int var1 = var0; var1 < Client.menuOptionsCount - 1; ++var1) { // L: 8261
						Client.menuActions[var1] = Client.menuActions[var1 + 1]; // L: 8262
						Client.menuTargets[var1] = Client.menuTargets[var1 + 1]; // L: 8263
						Client.menuOpcodes[var1] = Client.menuOpcodes[var1 + 1]; // L: 8264
						Client.menuIdentifiers[var1] = Client.menuIdentifiers[var1 + 1]; // L: 8265
						Client.menuArguments1[var1] = Client.menuArguments1[var1 + 1]; // L: 8266
						Client.menuArguments2[var1] = Client.menuArguments2[var1 + 1]; // L: 8267
						Client.menuShiftClick[var1] = Client.menuShiftClick[var1 + 1]; // L: 8268
					}
				}

				--var0; // L: 8271
				--Client.menuOptionsCount; // L: 8272
			}
		}

		GrandExchangeOfferTotalQuantityComparator.method164(); // L: 8275
	} // L: 8276
}
