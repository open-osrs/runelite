import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ln")
public class class321 {
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("archive1")
	static Archive archive1;

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Llq;Llq;ZIB)V",
		garbageValue = "17"
	)
	static void method6031(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) { // L: 186
			if (var3 == 4) { // L: 187
				class150.method3089(4); // L: 188
			}

		} else {
			if (var3 == 0) { // L: 192
				class230.method4894(var2); // L: 193
			} else {
				class150.method3089(var3); // L: 196
			}

			Rasterizer2D.Rasterizer2D_clear(); // L: 198
			byte[] var4 = var0.takeFileByNames("title.jpg", ""); // L: 199
			Login.leftTitleSprite = class29.method433(var4); // L: 200
			class162.rightTitleSprite = Login.leftTitleSprite.mirrorHorizontally(); // L: 201
			int var5 = Client.worldProperties; // L: 202
			if ((var5 & 536870912) != 0) { // L: 204
				HorizontalAlignment.logoSprite = NPCComposition.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", ""); // L: 205
			} else if ((var5 & 1073741824) != 0) { // L: 207
				HorizontalAlignment.logoSprite = NPCComposition.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", ""); // L: 208
			} else {
				HorizontalAlignment.logoSprite = NPCComposition.SpriteBuffer_getIndexedSpriteByName(var1, "logo", ""); // L: 211
			}

			AbstractByteArrayCopier.titleboxSprite = NPCComposition.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", ""); // L: 214
			class137.titlebuttonSprite = NPCComposition.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", ""); // L: 215
			Login.field882 = NPCComposition.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", ""); // L: 216
			Login.field913 = NPCComposition.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", ""); // L: 217
			NPCComposition.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", ""); // L: 218
			class355.runesSprite = class271.method5255(var1, "runes", ""); // L: 219
			class114.title_muteSprite = class271.method5255(var1, "title_mute", ""); // L: 220
			class160.options_buttons_0Sprite = NPCComposition.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", ""); // L: 221
			InvDefinition.field1814 = NPCComposition.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", ""); // L: 222
			Skeleton.options_buttons_2Sprite = NPCComposition.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", ""); // L: 223
			class143.field1639 = NPCComposition.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", ""); // L: 224
			Message.field458 = class160.options_buttons_0Sprite.subWidth; // L: 225
			KeyHandler.field140 = class160.options_buttons_0Sprite.subHeight; // L: 226
			Login.loginScreenRunesAnimation = new LoginScreenAnimation(class355.runesSprite); // L: 227
			if (var2) { // L: 228
				Login.Login_username = ""; // L: 229
				Login.Login_password = ""; // L: 230
				Login.field900 = new String[8]; // L: 231
				Login.field899 = 0; // L: 232
			}

			UrlRequest.field1346 = 0; // L: 234
			class452.otp = ""; // L: 235
			Login.field903 = true; // L: 236
			Login.worldSelectOpen = false; // L: 237
			if (!Interpreter.clientPreferences.method2259()) { // L: 238
				Archive var6 = ArchiveLoader.archive6; // L: 239
				int var7 = var6.getGroupId("scape main"); // L: 241
				int var8 = var6.getFileId(var7, ""); // L: 242
				class273.musicPlayerStatus = 1; // L: 244
				class147.musicTrackArchive = var6; // L: 245
				ArchiveLoader.musicTrackGroupId = var7; // L: 246
				class273.musicTrackFileId = var8; // L: 247
				DevicePcmPlayerProvider.musicTrackVolume = 255; // L: 248
				class260.musicTrackBoolean = false; // L: 249
				class273.pcmSampleLength = 2; // L: 250
			} else {
				class273.musicPlayerStatus = 1; // L: 255
				class147.musicTrackArchive = null; // L: 256
				ArchiveLoader.musicTrackGroupId = -1; // L: 257
				class273.musicTrackFileId = -1; // L: 258
				DevicePcmPlayerProvider.musicTrackVolume = 0; // L: 259
				class260.musicTrackBoolean = false; // L: 260
				class273.pcmSampleLength = 2; // L: 261
			}

			NPC.method2366(false); // L: 263
			Login.clearLoginScreen = true; // L: 264
			Login.xPadding = (class4.canvasWidth - 765) / 2; // L: 265
			Login.loginBoxX = Login.xPadding + 202; // L: 266
			class134.loginBoxCenter = Login.loginBoxX + 180; // L: 267
			Login.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 268
			class162.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 269
			HorizontalAlignment.logoSprite.drawAt(Login.xPadding + 382 - HorizontalAlignment.logoSprite.subWidth / 2, 18); // L: 270
		}
	} // L: 190 271

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "1974154557"
	)
	static final void method6030(int var0, int var1, boolean var2) {
		if (!var2 || var0 != class193.field2197 || class221.field2647 != var1) { // L: 5167
			class193.field2197 = var0; // L: 5170
			class221.field2647 = var1; // L: 5171
			InterfaceParent.updateGameState(25); // L: 5172
			class119.drawLoadingMessage("Loading - please wait.", true); // L: 5173
			int var3 = ApproximateRouteStrategy.baseX; // L: 5174
			int var4 = class250.baseY; // L: 5175
			ApproximateRouteStrategy.baseX = (var0 - 6) * 8; // L: 5176
			class250.baseY = (var1 - 6) * 8; // L: 5177
			int var5 = ApproximateRouteStrategy.baseX - var3; // L: 5178
			int var6 = class250.baseY - var4; // L: 5179
			var3 = ApproximateRouteStrategy.baseX; // L: 5180
			var4 = class250.baseY; // L: 5181

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 32768; ++var7) { // L: 5182
				NPC var19 = Client.npcs[var7]; // L: 5183
				if (var19 != null) { // L: 5184
					for (var9 = 0; var9 < 10; ++var9) { // L: 5185
						var10000 = var19.pathX; // L: 5186
						var10000[var9] -= var5;
						var10000 = var19.pathY; // L: 5187
						var10000[var9] -= var6;
					}

					var19.x -= var5 * 128; // L: 5189
					var19.y -= var6 * 128; // L: 5190
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) { // L: 5193
				Player var22 = Client.players[var7]; // L: 5194
				if (var22 != null) { // L: 5195
					for (var9 = 0; var9 < 10; ++var9) { // L: 5196
						var10000 = var22.pathX; // L: 5197
						var10000[var9] -= var5;
						var10000 = var22.pathY; // L: 5198
						var10000[var9] -= var6;
					}

					var22.x -= var5 * 128; // L: 5200
					var22.y -= var6 * 128; // L: 5201
				}
			}

			byte var20 = 0; // L: 5204
			byte var8 = 104; // L: 5205
			byte var21 = 1; // L: 5206
			if (var5 < 0) { // L: 5207
				var20 = 103; // L: 5208
				var8 = -1; // L: 5209
				var21 = -1; // L: 5210
			}

			byte var10 = 0; // L: 5212
			byte var11 = 104; // L: 5213
			byte var12 = 1; // L: 5214
			if (var6 < 0) { // L: 5215
				var10 = 103; // L: 5216
				var11 = -1; // L: 5217
				var12 = -1; // L: 5218
			}

			int var14;
			for (int var13 = var20; var8 != var13; var13 += var21) { // L: 5220
				for (var14 = var10; var11 != var14; var14 += var12) { // L: 5221
					int var15 = var5 + var13; // L: 5222
					int var16 = var6 + var14; // L: 5223

					for (int var17 = 0; var17 < 4; ++var17) { // L: 5224
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) { // L: 5225
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16];
						} else {
							Client.groundItems[var17][var13][var14] = null; // L: 5226
						}
					}
				}
			}

			for (PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 5230 5231 5235
				var18.x -= var5; // L: 5232
				var18.y -= var6; // L: 5233
				if (var18.x < 0 || var18.y < 0 || var18.x >= 104 || var18.y >= 104) { // L: 5234
					var18.remove();
				}
			}

			if (Client.destinationX != 0) { // L: 5237
				Client.destinationX -= var5; // L: 5238
				Client.destinationY -= var6; // L: 5239
			}

			Client.soundEffectCount = 0; // L: 5241
			Client.isCameraLocked = false; // L: 5242
			EnumComposition.cameraX -= var5 << 7; // L: 5243
			CollisionMap.cameraZ -= var6 << 7; // L: 5244
			Messages.oculusOrbFocalPointX -= var5 << 7; // L: 5245
			class115.oculusOrbFocalPointY -= var6 << 7; // L: 5246
			Client.field721 = -1; // L: 5247
			Client.graphicsObjects.clear(); // L: 5248
			Client.projectiles.clear(); // L: 5249

			for (var14 = 0; var14 < 4; ++var14) { // L: 5250
				Client.collisionMaps[var14].clear();
			}

		}
	} // L: 5168 5251
}
