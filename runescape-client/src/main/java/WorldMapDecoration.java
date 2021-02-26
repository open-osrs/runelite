import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ax")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	static IndexedSprite field237;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 948104613
	)
	static int field235;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -406250939
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1381482747
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -102940373
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1; // L: 9
		this.decoration = var2; // L: 10
		this.rotation = var3; // L: 11
	} // L: 12

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Z",
		garbageValue = "792255319"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		boolean var2 = false; // L: 37
		boolean var3 = false; // L: 38
		int var4 = 0; // L: 39
		int var5 = var0.length(); // L: 40
		int var6 = 0;

		boolean var1;
		while (true) {
			if (var6 >= var5) {
				var1 = var3; // L: 70
				break;
			}

			label83: {
				char var7 = var0.charAt(var6); // L: 42
				if (var6 == 0) { // L: 43
					if (var7 == '-') { // L: 44
						var2 = true; // L: 45
						break label83;
					}

					if (var7 == '+') { // L: 48
						break label83;
					}
				}

				int var9;
				if (var7 >= '0' && var7 <= '9') { // L: 50
					var9 = var7 - '0';
				} else if (var7 >= 'A' && var7 <= 'Z') { // L: 51
					var9 = var7 - '7';
				} else {
					if (var7 < 'a' || var7 > 'z') { // L: 52
						var1 = false; // L: 54
						break;
					}

					var9 = var7 - 'W';
				}

				if (var9 >= 10) { // L: 57
					var1 = false; // L: 58
					break; // L: 59
				}

				if (var2) { // L: 61
					var9 = -var9;
				}

				int var8 = var9 + var4 * 10; // L: 62
				if (var4 != var8 / 10) { // L: 63
					var1 = false; // L: 64
					break; // L: 65
				}

				var4 = var8; // L: 67
				var3 = true; // L: 68
			}

			++var6; // L: 41
		}

		return var1; // L: 72
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lkd;B)V",
		garbageValue = "13"
	)
	static final void method404(PacketBuffer var0) {
		int var1 = 0; // L: 81
		var0.importIndex(); // L: 82

		byte[] var10000;
		int var2;
		int var4;
		int var5;
		for (var2 = 0; var2 < Players.Players_count; ++var2) { // L: 83
			var5 = Players.Players_indices[var2]; // L: 84
			if ((Players.field1275[var5] & 1) == 0) { // L: 85
				if (var1 > 0) { // L: 86
					--var1; // L: 87
					var10000 = Players.field1275; // L: 88
					var10000[var5] = (byte)(var10000[var5] | 2);
				} else {
					var4 = var0.readBits(1); // L: 91
					if (var4 == 0) { // L: 92
						var1 = class198.method3851(var0); // L: 93
						var10000 = Players.field1275; // L: 94
						var10000[var5] = (byte)(var10000[var5] | 2);
					} else {
						PendingSpawn.readPlayerUpdate(var0, var5); // L: 97
					}
				}
			}
		}

		var0.exportIndex(); // L: 100
		if (var1 != 0) { // L: 101
			throw new RuntimeException(); // L: 102
		} else {
			var0.importIndex(); // L: 104

			for (var2 = 0; var2 < Players.Players_count; ++var2) { // L: 105
				var5 = Players.Players_indices[var2]; // L: 106
				if ((Players.field1275[var5] & 1) != 0) { // L: 107
					if (var1 > 0) { // L: 108
						--var1; // L: 109
						var10000 = Players.field1275; // L: 110
						var10000[var5] = (byte)(var10000[var5] | 2);
					} else {
						var4 = var0.readBits(1); // L: 113
						if (var4 == 0) { // L: 114
							var1 = class198.method3851(var0); // L: 115
							var10000 = Players.field1275; // L: 116
							var10000[var5] = (byte)(var10000[var5] | 2);
						} else {
							PendingSpawn.readPlayerUpdate(var0, var5); // L: 119
						}
					}
				}
			}

			var0.exportIndex(); // L: 122
			if (var1 != 0) { // L: 123
				throw new RuntimeException(); // L: 124
			} else {
				var0.importIndex(); // L: 126

				for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) { // L: 127
					var5 = Players.Players_emptyIndices[var2]; // L: 128
					if ((Players.field1275[var5] & 1) != 0) { // L: 129
						if (var1 > 0) { // L: 130
							--var1; // L: 131
							var10000 = Players.field1275; // L: 132
							var10000[var5] = (byte)(var10000[var5] | 2);
						} else {
							var4 = var0.readBits(1); // L: 135
							if (var4 == 0) { // L: 136
								var1 = class198.method3851(var0); // L: 137
								var10000 = Players.field1275; // L: 138
								var10000[var5] = (byte)(var10000[var5] | 2);
							} else if (World.updateExternalPlayer(var0, var5)) { // L: 141
								var10000 = Players.field1275;
								var10000[var5] = (byte)(var10000[var5] | 2);
							}
						}
					}
				}

				var0.exportIndex(); // L: 144
				if (var1 != 0) { // L: 145
					throw new RuntimeException(); // L: 146
				} else {
					var0.importIndex(); // L: 148

					for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) { // L: 149
						var5 = Players.Players_emptyIndices[var2]; // L: 150
						if ((Players.field1275[var5] & 1) == 0) { // L: 151
							if (var1 > 0) { // L: 152
								--var1; // L: 153
								var10000 = Players.field1275; // L: 154
								var10000[var5] = (byte)(var10000[var5] | 2);
							} else {
								var4 = var0.readBits(1); // L: 157
								if (var4 == 0) { // L: 158
									var1 = class198.method3851(var0); // L: 159
									var10000 = Players.field1275; // L: 160
									var10000[var5] = (byte)(var10000[var5] | 2);
								} else if (World.updateExternalPlayer(var0, var5)) { // L: 163
									var10000 = Players.field1275;
									var10000[var5] = (byte)(var10000[var5] | 2);
								}
							}
						}
					}

					var0.exportIndex(); // L: 166
					if (var1 != 0) { // L: 167
						throw new RuntimeException(); // L: 168
					} else {
						Players.Players_count = 0; // L: 170
						Players.Players_emptyIdxCount = 0; // L: 171

						for (var2 = 1; var2 < 2048; ++var2) { // L: 172
							var10000 = Players.field1275; // L: 173
							var10000[var2] = (byte)(var10000[var2] >> 1);
							Player var3 = Client.players[var2]; // L: 174
							if (var3 != null) { // L: 175
								Players.Players_indices[++Players.Players_count - 1] = var2;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var2; // L: 176
							}
						}

					}
				}
			}
		}
	} // L: 178

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1927290139"
	)
	static void method406(int var0) {
		Login.loginIndex = 12; // L: 1564
		Login.field1206 = var0; // L: 1565
	} // L: 1566

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(IIIILlm;Lht;I)V",
		garbageValue = "-1757506186"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2; // L: 11396
		if (var6 > 4225 && var6 < 90000) { // L: 11397
			int var7 = Client.camAngleY & 2047; // L: 11398
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 11399
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 11400
			int var10 = var9 * var2 + var3 * var8 >> 16; // L: 11401
			int var11 = var3 * var9 - var8 * var2 >> 16; // L: 11402
			double var12 = Math.atan2((double)var10, (double)var11); // L: 11403
			int var14 = var5.width / 2 - 25; // L: 11404
			int var15 = (int)(Math.sin(var12) * (double)var14); // L: 11405
			int var16 = (int)(Math.cos(var12) * (double)var14); // L: 11406
			byte var17 = 20; // L: 11407
			class236.redHintArrowSprite.method6393(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256); // L: 11408
		} else {
			AbstractArchive.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5); // L: 11410
		}

	} // L: 11411
}
