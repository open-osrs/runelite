import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lk")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("h")
	boolean field3838;
	@ObfuscatedName("c")
	boolean field3839;

	Friend() {
	} // L: 9

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Llk;I)I",
		garbageValue = "1098181185"
	)
	@Export("compareToFriend")
	int compareToFriend(Friend var1) {
		if (super.world == Client.worldId && Client.worldId != var1.world) { // L: 12
			return -1;
		} else if (Client.worldId == var1.world && super.world != Client.worldId) { // L: 13
			return 1;
		} else if (super.world != 0 && var1.world == 0) { // L: 14
			return -1;
		} else if (var1.world != 0 && super.world == 0) { // L: 15
			return 1;
		} else if (this.field3838 && !var1.field3838) { // L: 16
			return -1;
		} else if (!this.field3838 && var1.field3838) { // L: 17
			return 1;
		} else if (this.field3839 && !var1.field3839) { // L: 18
			return -1;
		} else if (!this.field3839 && var1.field3839) { // L: 19
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2; // L: 20 21 24
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llm;B)I",
		garbageValue = "88"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareToFriend((Friend)var1); // L: 29
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1); // L: 33
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)Lef;",
		garbageValue = "-6"
	)
	@Export("SpotAnimationDefinition_get")
	public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
		SpotAnimationDefinition var1 = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.get((long)var0); // L: 37
		if (var1 != null) { // L: 38
			return var1;
		} else {
			byte[] var2 = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, var0); // L: 39
			var1 = new SpotAnimationDefinition(); // L: 40
			var1.id = var0; // L: 41
			if (var2 != null) { // L: 42
				var1.decode(new Buffer(var2));
			}

			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, (long)var0); // L: 43
			return var1; // L: 44
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnm;I)V",
		garbageValue = "-1000223970"
	)
	static final void method5550(PacketBuffer var0) {
		int var1 = 0; // L: 89
		var0.importIndex(); // L: 90

		byte[] var10000;
		int var2;
		int var4;
		int var6;
		int var7;
		int var8;
		for (var2 = 0; var2 < Players.Players_count; ++var2) {
			var8 = Players.Players_indices[var2];
			if ((Players.field1344[var8] & 1) == 0) {
				if (var1 > 0) {
					--var1;
					var10000 = Players.field1344;
					var10000[var8] = (byte)(var10000[var8] | 2);
				} else {
					var4 = var0.readBits(1);
					if (var4 == 0) {
						var6 = var0.readBits(2);
						if (var6 == 0) {
							var7 = 0;
						} else if (var6 == 1) {
							var7 = var0.readBits(5);
						} else if (var6 == 2) {
							var7 = var0.readBits(8);
						} else {
							var7 = var0.readBits(11);
						}

						var1 = var7; // L: 111
						var10000 = Players.field1344;
						var10000[var8] = (byte)(var10000[var8] | 2);
					} else {
						class35.readPlayerUpdate(var0, var8); // L: 115
					}
				}
			}
		}

		var0.exportIndex(); // L: 118
		if (var1 != 0) { // L: 119
			throw new RuntimeException(); // L: 120
		} else {
			var0.importIndex(); // L: 122

			for (var2 = 0; var2 < Players.Players_count; ++var2) { // L: 123
				var8 = Players.Players_indices[var2]; // L: 124
				if ((Players.field1344[var8] & 1) != 0) { // L: 125
					if (var1 > 0) { // L: 126
						--var1; // L: 127
						var10000 = Players.field1344; // L: 128
						var10000[var8] = (byte)(var10000[var8] | 2);
					} else {
						var4 = var0.readBits(1); // L: 131
						if (var4 == 0) { // L: 132
							var6 = var0.readBits(2); // L: 135
							if (var6 == 0) { // L: 137
								var7 = 0;
							} else if (var6 == 1) { // L: 138
								var7 = var0.readBits(5);
							} else if (var6 == 2) { // L: 139
								var7 = var0.readBits(8);
							} else {
								var7 = var0.readBits(11); // L: 140
							}

							var1 = var7; // L: 143
							var10000 = Players.field1344; // L: 144
							var10000[var8] = (byte)(var10000[var8] | 2);
						} else {
							class35.readPlayerUpdate(var0, var8); // L: 147
						}
					}
				}
			}

			var0.exportIndex(); // L: 150
			if (var1 != 0) { // L: 151
				throw new RuntimeException(); // L: 152
			} else {
				var0.importIndex(); // L: 154

				for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) { // L: 155
					var8 = Players.Players_emptyIndices[var2]; // L: 156
					if ((Players.field1344[var8] & 1) != 0) { // L: 157
						if (var1 > 0) { // L: 158
							--var1; // L: 159
							var10000 = Players.field1344; // L: 160
							var10000[var8] = (byte)(var10000[var8] | 2);
						} else {
							var4 = var0.readBits(1); // L: 163
							if (var4 == 0) { // L: 164
								var6 = var0.readBits(2); // L: 167
								if (var6 == 0) { // L: 169
									var7 = 0;
								} else if (var6 == 1) { // L: 170
									var7 = var0.readBits(5);
								} else if (var6 == 2) { // L: 171
									var7 = var0.readBits(8);
								} else {
									var7 = var0.readBits(11); // L: 172
								}

								var1 = var7; // L: 175
								var10000 = Players.field1344; // L: 176
								var10000[var8] = (byte)(var10000[var8] | 2);
							} else if (Tiles.updateExternalPlayer(var0, var8)) { // L: 179
								var10000 = Players.field1344;
								var10000[var8] = (byte)(var10000[var8] | 2);
							}
						}
					}
				}

				var0.exportIndex(); // L: 182
				if (var1 != 0) { // L: 183
					throw new RuntimeException(); // L: 184
				} else {
					var0.importIndex(); // L: 186

					for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) { // L: 187
						var8 = Players.Players_emptyIndices[var2]; // L: 188
						if ((Players.field1344[var8] & 1) == 0) { // L: 189
							if (var1 > 0) { // L: 190
								--var1; // L: 191
								var10000 = Players.field1344; // L: 192
								var10000[var8] = (byte)(var10000[var8] | 2);
							} else {
								var4 = var0.readBits(1); // L: 195
								if (var4 == 0) { // L: 196
									var6 = var0.readBits(2); // L: 199
									if (var6 == 0) { // L: 201
										var7 = 0;
									} else if (var6 == 1) { // L: 202
										var7 = var0.readBits(5);
									} else if (var6 == 2) { // L: 203
										var7 = var0.readBits(8);
									} else {
										var7 = var0.readBits(11); // L: 204
									}

									var1 = var7; // L: 207
									var10000 = Players.field1344; // L: 208
									var10000[var8] = (byte)(var10000[var8] | 2);
								} else if (Tiles.updateExternalPlayer(var0, var8)) { // L: 211
									var10000 = Players.field1344;
									var10000[var8] = (byte)(var10000[var8] | 2);
								}
							}
						}
					}

					var0.exportIndex(); // L: 214
					if (var1 != 0) { // L: 215
						throw new RuntimeException(); // L: 216
					} else {
						Players.Players_count = 0; // L: 218
						Players.Players_emptyIdxCount = 0; // L: 219

						for (var2 = 1; var2 < 2048; ++var2) { // L: 220
							var10000 = Players.field1344; // L: 221
							var10000[var2] = (byte)(var10000[var2] >> 1);
							Player var3 = Client.players[var2]; // L: 222
							if (var3 != null) { // L: 223
								Players.Players_indices[++Players.Players_count - 1] = var2;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var2; // L: 224
							}
						}

					}
				}
			}
		}
	} // L: 226

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Ljp;III)Low;",
		garbageValue = "609200231"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		if (!Username.method5711(var0, var1, var2)) { // L: 88
			return null;
		} else {
			SpritePixels var4 = new SpritePixels(); // L: 91
			var4.width = class396.SpriteBuffer_spriteWidth; // L: 92
			var4.height = class396.SpriteBuffer_spriteHeight; // L: 93
			var4.xOffset = class243.SpriteBuffer_xOffsets[0]; // L: 94
			var4.yOffset = class396.SpriteBuffer_yOffsets[0]; // L: 95
			var4.subWidth = ArchiveDiskActionHandler.SpriteBuffer_spriteWidths[0]; // L: 96
			var4.subHeight = class372.SpriteBuffer_spriteHeights[0]; // L: 97
			int var5 = var4.subWidth * var4.subHeight; // L: 98
			byte[] var6 = class396.SpriteBuffer_pixels[0]; // L: 99
			var4.pixels = new int[var5]; // L: 100

			for (int var7 = 0; var7 < var5; ++var7) { // L: 101
				var4.pixels[var7] = AccessFile.SpriteBuffer_spritePalette[var6[var7] & 255];
			}

			class243.SpriteBuffer_xOffsets = null; // L: 103
			class396.SpriteBuffer_yOffsets = null; // L: 104
			ArchiveDiskActionHandler.SpriteBuffer_spriteWidths = null; // L: 105
			class372.SpriteBuffer_spriteHeights = null; // L: 106
			AccessFile.SpriteBuffer_spritePalette = null; // L: 107
			class396.SpriteBuffer_pixels = null; // L: 108
			return var4; // L: 112
		}
	}
}
