import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dp")
public class class113 extends class116 {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1422168885
	)
	int field1356;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1587001219
	)
	int field1353;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1005373589
	)
	int field1354;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 191673925
	)
	int field1355;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldg;)V"
	)
	class113(class119 var1) {
		this.this$0 = var1;
		this.field1356 = -1;
	} // L: 163

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-2002779676"
	)
	void vmethod2847(Buffer var1) {
		this.field1356 = var1.readUnsignedShort();
		this.field1353 = var1.readInt();
		this.field1354 = var1.readUnsignedByte();
		this.field1355 = var1.readUnsignedByte();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ldm;I)V",
		garbageValue = "-293908864"
	)
	void vmethod2848(ClanSettings var1) {
		var1.method2663(this.field1356, this.field1353, this.field1354, this.field1355); // L: 173
	} // L: 174

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1973528524"
	)
	static void method2533() {
		Tiles.Tiles_underlays = null; // L: 48
		Tiles.Tiles_overlays = null; // L: 49
		Tiles.Tiles_shapes = null; // L: 50
		Tiles.field969 = null; // L: 51
		Tiles.field962 = null; // L: 52
		class54.field419 = null; // L: 53
		DirectByteArrayCopier.field3212 = null; // L: 54
		TileItem.Tiles_hue = null; // L: 55
		class397.Tiles_saturation = null; // L: 56
		Tiles.Tiles_lightness = null; // L: 57
		class1.Tiles_hueMultiplier = null; // L: 58
		MouseRecorder.field1039 = null; // L: 59
	} // L: 60

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lko;Lko;ZII)V",
		garbageValue = "-1234515035"
	)
	static void method2529(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) { // L: 148
			if (var3 == 4) { // L: 149
				class275.method5201(4); // L: 150
			}

		} else {
			if (var3 == 0) { // L: 154
				EnumComposition.method3097(var2); // L: 155
			} else {
				class275.method5201(var3); // L: 158
			}

			Rasterizer2D.Rasterizer2D_clear(); // L: 160
			byte[] var4 = var0.takeFileByNames("title.jpg", ""); // L: 161
			BufferedImage var6 = null; // L: 164

			SpritePixels var5;
			int var8;
			label66: {
				try {
					var6 = ImageIO.read(new ByteArrayInputStream(var4)); // L: 166
					int var7 = var6.getWidth(); // L: 167
					var8 = var6.getHeight(); // L: 168
					int[] var9 = new int[var8 * var7]; // L: 169
					PixelGrabber var10 = new PixelGrabber(var6, 0, 0, var7, var8, var9, 0, var7); // L: 170
					var10.grabPixels(); // L: 171
					var5 = new SpritePixels(var9, var7, var8); // L: 172
					break label66;
				} catch (IOException var17) { // L: 175
				} catch (InterruptedException var18) { // L: 176
				}

				var5 = new SpritePixels(0, 0); // L: 177
			}

			RouteStrategy.leftTitleSprite = var5; // L: 179
			class139.rightTitleSprite = RouteStrategy.leftTitleSprite.mirrorHorizontally(); // L: 180
			int var12 = Client.worldProperties; // L: 181
			if ((var12 & 536870912) != 0) { // L: 183
				class16.logoSprite = Script.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", ""); // L: 184
			} else if ((var12 & 1073741824) != 0) { // L: 186
				class16.logoSprite = Script.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", ""); // L: 187
			} else {
				class16.logoSprite = Script.SpriteBuffer_getIndexedSpriteByName(var1, "logo", ""); // L: 190
			}

			Login.titleboxSprite = Script.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", ""); // L: 193
			Login.titlebuttonSprite = Script.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", ""); // L: 194
			Login.field854 = Script.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", ""); // L: 195
			class29.field159 = Script.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", ""); // L: 196
			Script.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", ""); // L: 197
			Login.runesSprite = class393.method6882(var1, "runes", ""); // L: 198
			VarpDefinition.title_muteSprite = class393.method6882(var1, "title_mute", ""); // L: 199
			NetSocket.options_buttons_0Sprite = Script.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", ""); // L: 200
			Login.field868 = Script.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", ""); // L: 201
			class9.options_buttons_2Sprite = Script.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", ""); // L: 202
			ClanMate.field3950 = Script.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", ""); // L: 203
			class327.field3908 = NetSocket.options_buttons_0Sprite.subWidth; // L: 204
			UserComparator9.field1326 = NetSocket.options_buttons_0Sprite.subHeight; // L: 205
			Login.loginScreenRunesAnimation = new LoginScreenAnimation(Login.runesSprite); // L: 206
			if (var2) { // L: 207
				Login.Login_username = ""; // L: 208
				Login.Login_password = ""; // L: 209
			}

			ReflectionCheck.field429 = 0; // L: 211
			Tiles.otp = ""; // L: 212
			Login.field875 = true; // L: 213
			Login.worldSelectOpen = false; // L: 214
			if (!class408.clientPreferences.titleMusicDisabled) { // L: 215
				Archive var11 = Messages.archive6; // L: 216
				var8 = var11.getGroupId("scape main"); // L: 218
				int var13 = var11.getFileId(var8, ""); // L: 219
				class247.musicPlayerStatus = 1; // L: 221
				class128.musicTrackArchive = var11; // L: 222
				FillMode.musicTrackGroupId = var8; // L: 223
				ArchiveDiskActionHandler.musicTrackFileId = var13; // L: 224
				class247.musicTrackVolume = 255; // L: 225
				SecureRandomCallable.musicTrackBoolean = false; // L: 226
				class247.pcmSampleLength = 2; // L: 227
			} else {
				class247.musicPlayerStatus = 1; // L: 232
				class128.musicTrackArchive = null; // L: 233
				FillMode.musicTrackGroupId = -1; // L: 234
				ArchiveDiskActionHandler.musicTrackFileId = -1; // L: 235
				class247.musicTrackVolume = 0; // L: 236
				SecureRandomCallable.musicTrackBoolean = false; // L: 237
				class247.pcmSampleLength = 2; // L: 238
			}

			if (NetCache.NetCache_socket != null) { // L: 241
				try {
					Buffer var19 = new Buffer(4); // L: 243
					var19.writeByte(3); // L: 244
					var19.writeMedium(0); // L: 245
					NetCache.NetCache_socket.write(var19.array, 0, 4); // L: 246
				} catch (IOException var16) {
					try {
						NetCache.NetCache_socket.close(); // L: 250
					} catch (Exception var15) { // L: 252
					}

					++NetCache.NetCache_ioExceptions; // L: 253
					NetCache.NetCache_socket = null; // L: 254
				}
			}

			Login.clearLoginScreen = true; // L: 257
			Login.xPadding = (GameEngine.canvasWidth - 765) / 2; // L: 258
			Login.loginBoxX = Login.xPadding + 202; // L: 259
			Login.loginBoxCenter = Login.loginBoxX + 180; // L: 260
			RouteStrategy.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 261
			class139.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 262
			class16.logoSprite.drawAt(Login.xPadding + 382 - class16.logoSprite.subWidth / 2, 18); // L: 263
		}
	} // L: 152 264

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(Ljf;II)I",
		garbageValue = "-1898154429"
	)
	static final int method2532(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) { // L: 10368
			try {
				int[] var2 = var0.cs1Instructions[var1]; // L: 10370
				int var3 = 0; // L: 10371
				int var4 = 0; // L: 10372
				byte var5 = 0; // L: 10373

				while (true) {
					int var6 = var2[var4++]; // L: 10375
					int var7 = 0; // L: 10376
					byte var8 = 0; // L: 10377
					if (var6 == 0) { // L: 10378
						return var3;
					}

					if (var6 == 1) { // L: 10379
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) { // L: 10380
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) { // L: 10381
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) { // L: 10382
						var9 = var2[var4++] << 16; // L: 10383
						var9 += var2[var4++]; // L: 10384
						var10 = UserComparator9.getWidget(var9); // L: 10385
						var11 = var2[var4++]; // L: 10386
						if (var11 != -1 && (!TaskHandler.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 10387
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 10388
								if (var11 + 1 == var10.itemIds[var12]) { // L: 10389
									var7 += var10.itemQuantities[var12];
								}
							}
						}
					}

					if (var6 == 5) { // L: 10393
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) { // L: 10394
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) { // L: 10395
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) { // L: 10396
						var7 = HealthBarDefinition.localPlayer.combatLevel;
					}

					if (var6 == 9) { // L: 10397
						for (var9 = 0; var9 < 25; ++var9) { // L: 10398
							if (Skills.Skills_enabled[var9]) { // L: 10399
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) { // L: 10402
						var9 = var2[var4++] << 16; // L: 10403
						var9 += var2[var4++]; // L: 10404
						var10 = UserComparator9.getWidget(var9); // L: 10405
						var11 = var2[var4++]; // L: 10406
						if (var11 != -1 && (!TaskHandler.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 10407
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 10408
								if (var11 + 1 == var10.itemIds[var12]) { // L: 10409
									var7 = 999999999; // L: 10410
									break; // L: 10411
								}
							}
						}
					}

					if (var6 == 11) { // L: 10416
						var7 = Client.runEnergy;
					}

					if (var6 == 12) { // L: 10417
						var7 = Client.weight;
					}

					if (var6 == 13) { // L: 10418
						var9 = Varps.Varps_main[var2[var4++]]; // L: 10419
						int var13 = var2[var4++]; // L: 10420
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0; // L: 10421
					}

					if (var6 == 14) { // L: 10423
						var9 = var2[var4++]; // L: 10424
						var7 = class119.getVarbit(var9); // L: 10425
					}

					if (var6 == 15) { // L: 10427
						var8 = 1;
					}

					if (var6 == 16) { // L: 10428
						var8 = 2;
					}

					if (var6 == 17) { // L: 10429
						var8 = 3;
					}

					if (var6 == 18) { // L: 10430
						var7 = (HealthBarDefinition.localPlayer.x >> 7) + class19.baseX;
					}

					if (var6 == 19) { // L: 10431
						var7 = (HealthBarDefinition.localPlayer.y >> 7) + DefaultsGroup.baseY;
					}

					if (var6 == 20) { // L: 10432
						var7 = var2[var4++];
					}

					if (var8 == 0) { // L: 10433
						if (var5 == 0) { // L: 10434
							var3 += var7;
						}

						if (var5 == 1) { // L: 10435
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) { // L: 10436
							var3 /= var7;
						}

						if (var5 == 3) { // L: 10437
							var3 *= var7;
						}

						var5 = 0; // L: 10438
					} else {
						var5 = var8; // L: 10440
					}
				}
			} catch (Exception var14) { // L: 10443
				return -1; // L: 10444
			}
		} else {
			return -2;
		}
	}
}
