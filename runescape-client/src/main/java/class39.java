import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ag")
public class class39 {
	@ObfuscatedName("pv")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	static final class39 field287;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	static final class39 field285;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -235911215
	)
	@Export("value")
	final int value;

	static {
		field287 = new class39(0); // L: 4
		field285 = new class39(1); // L: 5
	}

	class39(int var1) {
		this.value = var1; // L: 9
	} // L: 10

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([BB)Llc;",
		garbageValue = "0"
	)
	@Export("convertJpgToSprite")
	public static final Sprite convertJpgToSprite(byte[] var0) {
		BufferedImage var1 = null; // L: 20

		try {
			var1 = ImageIO.read(new ByteArrayInputStream(var0)); // L: 22
			int var2 = var1.getWidth(); // L: 23
			int var3 = var1.getHeight(); // L: 24
			int[] var4 = new int[var3 * var2]; // L: 25
			PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var2, var3, var4, 0, var2); // L: 26
			var5.grabPixels(); // L: 27
			return new Sprite(var4, var2, var3); // L: 28
		} catch (IOException var7) { // L: 30
		} catch (InterruptedException var8) { // L: 31
		}

		return new Sprite(0, 0); // L: 32
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lks;IS)V",
		garbageValue = "-7425"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset; // L: 71
		Players.Players_pendingUpdateCount = 0; // L: 72
		GrandExchangeEvent.method172(var0); // L: 73

		for (int var3 = 0; var3 < Players.Players_pendingUpdateCount; ++var3) { // L: 75
			int var4 = Players.Players_pendingUpdateIndices[var3]; // L: 76
			Player var5 = Client.players[var4]; // L: 77
			int var6 = var0.readUnsignedByte(); // L: 78
			if ((var6 & 16) != 0) { // L: 79
				var6 += var0.readUnsignedByte() << 8;
			}

			byte var7 = -1; // L: 81
			int var8;
			if ((var6 & 2048) != 0) { // L: 82
				for (var8 = 0; var8 < 3; ++var8) { // L: 83
					var5.actions[var8] = var0.readStringCp1252NullTerminated();
				}
			}

			int var9;
			if ((var6 & 2) != 0) { // L: 85
				var8 = var0.readUnsignedShort(); // L: 86
				if (var8 == 65535) { // L: 87
					var8 = -1;
				}

				var9 = var0.method5668(); // L: 88
				Varps.performPlayerAnimation(var5, var8, var9); // L: 89
			}

			if ((var6 & 256) != 0) { // L: 91
				var7 = var0.method5669(); // L: 92
			}

			int var11;
			int var12;
			int var15;
			if ((var6 & 8) != 0) { // L: 94
				var8 = var0.method5659(); // L: 95
				PlayerType var16 = (PlayerType)class195.findEnumerated(WorldMapLabelSize.PlayerType_values(), var0.method5619()); // L: 96
				boolean var10 = var0.readUnsignedByte() == 1; // L: 97
				var11 = var0.method5668(); // L: 98
				var12 = var0.offset; // L: 99
				if (var5.username != null && var5.appearance != null) { // L: 100
					boolean var13 = false; // L: 101
					if (var16.isUser && WorldMapLabelSize.friendSystem.isIgnored(var5.username)) { // L: 102 103
						var13 = true;
					}

					if (!var13 && Client.field795 == 0 && !var5.isHidden) { // L: 105
						Players.field1280.offset = 0; // L: 106
						var0.method5833(Players.field1280.array, 0, var11); // L: 107
						Players.field1280.offset = 0; // L: 108
						String var14 = AbstractFont.escapeBrackets(WorldMapSection0.method328(Tile.method3004(Players.field1280))); // L: 109
						var5.overheadText = var14.trim(); // L: 110
						var5.overheadTextColor = var8 >> 8; // L: 111
						var5.overheadTextEffect = var8 & 255; // L: 112
						var5.overheadTextCyclesRemaining = 150; // L: 113
						var5.isAutoChatting = var10; // L: 114
						var5.field974 = var5 != PlayerType.localPlayer && var16.isUser && "" != Client.field710 && var14.toLowerCase().indexOf(Client.field710) == -1; // L: 115
						if (var16.isPrivileged) { // L: 117
							var15 = var10 ? 91 : 1;
						} else {
							var15 = var10 ? 90 : 2; // L: 118
						}

						if (var16.modIcon != -1) { // L: 119
							DevicePcmPlayerProvider.addGameMessage(var15, PrivateChatMode.method6034(var16.modIcon) + var5.username.getName(), var14);
						} else {
							DevicePcmPlayerProvider.addGameMessage(var15, var5.username.getName(), var14); // L: 120
						}
					}
				}

				var0.offset = var12 + var11; // L: 123
			}

			if ((var6 & 32) != 0) { // L: 125
				var5.field1003 = var0.method5675(); // L: 126
				if (var5.pathLength == 0) { // L: 127
					var5.orientation = var5.field1003; // L: 128
					var5.field1003 = -1; // L: 129
				}
			}

			if ((var6 & 128) != 0) { // L: 132
				var5.overheadText = var0.readStringCp1252NullTerminated(); // L: 133
				if (var5.overheadText.charAt(0) == '~') { // L: 134
					var5.overheadText = var5.overheadText.substring(1); // L: 135
					DevicePcmPlayerProvider.addGameMessage(2, var5.username.getName(), var5.overheadText); // L: 136
				} else if (var5 == PlayerType.localPlayer) { // L: 138
					DevicePcmPlayerProvider.addGameMessage(2, var5.username.getName(), var5.overheadText); // L: 139
				}

				var5.isAutoChatting = false; // L: 141
				var5.overheadTextColor = 0; // L: 142
				var5.overheadTextEffect = 0; // L: 143
				var5.overheadTextCyclesRemaining = 150; // L: 144
			}

			if ((var6 & 4096) != 0) { // L: 146
				var5.spotAnimation = var0.readUnsignedShort(); // L: 147
				var8 = var0.method5685(); // L: 148
				var5.field1016 = var8 >> 16; // L: 149
				var5.field1015 = (var8 & 65535) + Client.cycle; // L: 150
				var5.spotAnimationFrame = 0; // L: 151
				var5.spotAnimationFrameCycle = 0; // L: 152
				if (var5.field1015 > Client.cycle) { // L: 153
					var5.spotAnimationFrame = -1;
				}

				if (var5.spotAnimation == 65535) { // L: 154
					var5.spotAnimation = -1;
				}
			}

			if ((var6 & 64) != 0) { // L: 156
				var5.targetIndex = var0.method5675(); // L: 157
				if (var5.targetIndex == 65535) { // L: 158
					var5.targetIndex = -1;
				}
			}

			if ((var6 & 4) != 0) { // L: 160
				var8 = var0.method5650(); // L: 161
				byte[] var22 = new byte[var8]; // L: 162
				Buffer var17 = new Buffer(var22); // L: 163
				var0.method5689(var22, 0, var8); // L: 164
				Players.field1284[var4] = var17; // L: 165
				var5.read(var17); // L: 166
			}

			if ((var6 & 1) != 0) { // L: 168
				var8 = var0.readUnsignedByte(); // L: 169
				int var18;
				int var19;
				int var21;
				if (var8 > 0) { // L: 170
					for (var9 = 0; var9 < var8; ++var9) { // L: 171
						var11 = -1; // L: 173
						var12 = -1; // L: 174
						var21 = -1; // L: 175
						var19 = var0.readUShortSmart(); // L: 176
						if (var19 == 32767) { // L: 177
							var19 = var0.readUShortSmart(); // L: 178
							var12 = var0.readUShortSmart(); // L: 179
							var11 = var0.readUShortSmart(); // L: 180
							var21 = var0.readUShortSmart(); // L: 181
						} else if (var19 != 32766) { // L: 183
							var12 = var0.readUShortSmart(); // L: 184
						} else {
							var19 = -1; // L: 186
						}

						var18 = var0.readUShortSmart(); // L: 187
						var5.addHitSplat(var19, var12, var11, var21, Client.cycle, var18); // L: 188
					}
				}

				var9 = var0.method5668(); // L: 191
				if (var9 > 0) { // L: 192
					for (var19 = 0; var19 < var9; ++var19) { // L: 193
						var11 = var0.readUShortSmart(); // L: 194
						var12 = var0.readUShortSmart(); // L: 195
						if (var12 != 32767) { // L: 196
							var21 = var0.readUShortSmart(); // L: 197
							var18 = var0.method5668(); // L: 198
							var15 = var12 > 0 ? var0.readUnsignedByte() : var18; // L: 199
							var5.addHealthBar(var11, Client.cycle, var12, var21, var18, var15); // L: 200
						} else {
							var5.removeHealthBar(var11); // L: 202
						}
					}
				}
			}

			if ((var6 & 1024) != 0) { // L: 206
				var5.field1017 = var0.method5837(); // L: 207
				var5.field1019 = var0.readByte(); // L: 208
				var5.field1018 = var0.method5837(); // L: 209
				var5.field1020 = var0.method5837(); // L: 210
				var5.field1009 = var0.method5659() + Client.cycle; // L: 211
				var5.field1024 = var0.method5797() + Client.cycle; // L: 212
				var5.field1023 = var0.method5659(); // L: 213
				if (var5.field664) { // L: 214
					var5.field1017 += var5.tileX; // L: 215
					var5.field1019 += var5.tileY; // L: 216
					var5.field1018 += var5.tileX; // L: 217
					var5.field1020 += var5.tileY; // L: 218
					var5.pathLength = 0; // L: 219
				} else {
					var5.field1017 += var5.pathX[0]; // L: 222
					var5.field1019 += var5.pathY[0]; // L: 223
					var5.field1018 += var5.pathX[0]; // L: 224
					var5.field1020 += var5.pathY[0]; // L: 225
					var5.pathLength = 1; // L: 226
				}

				var5.field1034 = 0; // L: 228
			}

			if ((var6 & 512) != 0) { // L: 230
				Players.field1295[var4] = var0.method5669(); // L: 231
			}

			if (var5.field664) { // L: 233
				if (var7 == 127) { // L: 234
					var5.resetPath(var5.tileX, var5.tileY);
				} else {
					byte var20;
					if (var7 != -1) { // L: 237
						var20 = var7;
					} else {
						var20 = Players.field1295[var4]; // L: 238
					}

					var5.method1335(var5.tileX, var5.tileY, var20); // L: 239
				}
			}
		}

		if (var0.offset - var2 != var1) { // L: 246
			throw new RuntimeException(var0.offset - var2 + " " + var1); // L: 247
		}
	} // L: 249
}
