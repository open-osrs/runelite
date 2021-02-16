import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jy")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	@Export("SequenceDefinition_archive")
	static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	@Export("SequenceDefinition_animationsArchive")
	static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	@Export("SequenceDefinition_cached")
	public static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	@Export("SequenceDefinition_cachedFrames")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("j")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("n")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("p")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("l")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -478695053
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("u")
	int[] field3545;
	@ObfuscatedName("e")
	public boolean field3556;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 496670999
	)
	public int field3557;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 844319139
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1836378725
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -647894777
	)
	public int field3554;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -2080076169
	)
	public int field3560;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 2098241255
	)
	public int field3555;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 384491885
	)
	public int field3548;

	static {
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64); // L: 15
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100); // L: 16
	}

	SequenceDefinition() {
		this.frameCount = -1; // L: 21
		this.field3556 = false; // L: 23
		this.field3557 = 5; // L: 24
		this.shield = -1; // L: 25
		this.weapon = -1; // L: 26
		this.field3554 = 99; // L: 27
		this.field3560 = -1; // L: 28
		this.field3555 = -1; // L: 29
		this.field3548 = 2; // L: 30
	} // L: 32

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lkj;B)V",
		garbageValue = "-72"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 53
			if (var2 == 0) { // L: 54
				return; // L: 57
			}

			this.decodeNext(var1, var2); // L: 55
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lkj;II)V",
		garbageValue = "360291550"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) { // L: 60
			var3 = var1.readUnsignedShort(); // L: 61
			this.frameLengths = new int[var3]; // L: 62

			for (var4 = 0; var4 < var3; ++var4) { // L: 63
				this.frameLengths[var4] = var1.readUnsignedShort();
			}

			this.frameIds = new int[var3]; // L: 64

			for (var4 = 0; var4 < var3; ++var4) { // L: 65
				this.frameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) { // L: 66
				this.frameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 2) { // L: 68
			this.frameCount = var1.readUnsignedShort();
		} else if (var2 == 3) { // L: 69
			var3 = var1.readUnsignedByte(); // L: 70
			this.field3545 = new int[var3 + 1]; // L: 71

			for (var4 = 0; var4 < var3; ++var4) { // L: 72
				this.field3545[var4] = var1.readUnsignedByte();
			}

			this.field3545[var3] = 9999999; // L: 73
		} else if (var2 == 4) { // L: 75
			this.field3556 = true;
		} else if (var2 == 5) { // L: 76
			this.field3557 = var1.readUnsignedByte();
		} else if (var2 == 6) { // L: 77
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 78
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) { // L: 79
			this.field3554 = var1.readUnsignedByte();
		} else if (var2 == 9) { // L: 80
			this.field3560 = var1.readUnsignedByte();
		} else if (var2 == 10) { // L: 81
			this.field3555 = var1.readUnsignedByte();
		} else if (var2 == 11) { // L: 82
			this.field3548 = var1.readUnsignedByte();
		} else if (var2 == 12) { // L: 83
			var3 = var1.readUnsignedByte(); // L: 84
			this.chatFrameIds = new int[var3]; // L: 85

			for (var4 = 0; var4 < var3; ++var4) { // L: 86
				this.chatFrameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) { // L: 87
				this.chatFrameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 13) { // L: 89
			var3 = var1.readUnsignedByte(); // L: 90
			this.soundEffects = new int[var3]; // L: 91

			for (var4 = 0; var4 < var3; ++var4) { // L: 92
				this.soundEffects[var4] = var1.readMedium();
			}
		}

	} // L: 95

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1714495810"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field3560 == -1) { // L: 98
			if (this.field3545 != null) { // L: 99
				this.field3560 = 2;
			} else {
				this.field3560 = 0; // L: 100
			}
		}

		if (this.field3555 == -1) { // L: 102
			if (this.field3545 != null) { // L: 103
				this.field3555 = 2;
			} else {
				this.field3555 = 0; // L: 104
			}
		}

	} // L: 106

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Leh;IB)Leh;",
		garbageValue = "17"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		var2 = this.frameIds[var2]; // L: 109
		Frames var3 = ArchiveDiskAction.getFrames(var2 >> 16); // L: 110
		var2 &= 65535; // L: 111
		if (var3 == null) {
			return var1.toSharedSequenceModel(true); // L: 112
		} else {
			Model var4 = var1.toSharedSequenceModel(!var3.hasAlphaTransform(var2)); // L: 113
			var4.animate(var3, var2); // L: 114
			return var4; // L: 115
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Leh;III)Leh;",
		garbageValue = "-2055004440"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		var2 = this.frameIds[var2]; // L: 119
		Frames var4 = ArchiveDiskAction.getFrames(var2 >> 16); // L: 120
		var2 &= 65535; // L: 121
		if (var4 == null) { // L: 122
			return var1.toSharedSequenceModel(true);
		} else {
			Model var5 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var2)); // L: 123
			var3 &= 3; // L: 124
			if (var3 == 1) { // L: 125
				var5.rotateY270Ccw();
			} else if (var3 == 2) { // L: 126
				var5.rotateY180();
			} else if (var3 == 3) { // L: 127
				var5.rotateY90Ccw();
			}

			var5.animate(var4, var2); // L: 128
			if (var3 == 1) { // L: 129
				var5.rotateY90Ccw();
			} else if (var3 == 2) { // L: 130
				var5.rotateY180();
			} else if (var3 == 3) { // L: 131
				var5.rotateY270Ccw();
			}

			return var5; // L: 132
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Leh;II)Leh;",
		garbageValue = "-109933088"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		var2 = this.frameIds[var2]; // L: 136
		Frames var3 = ArchiveDiskAction.getFrames(var2 >> 16); // L: 137
		var2 &= 65535; // L: 138
		if (var3 == null) {
			return var1.toSharedSpotAnimationModel(true); // L: 139
		} else {
			Model var4 = var1.toSharedSpotAnimationModel(!var3.hasAlphaTransform(var2)); // L: 140
			var4.animate(var3, var2); // L: 141
			return var4; // L: 142
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Leh;ILjy;IB)Leh;",
		garbageValue = "-74"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2]; // L: 146
		Frames var5 = ArchiveDiskAction.getFrames(var2 >> 16); // L: 147
		var2 &= 65535; // L: 148
		if (var5 == null) { // L: 149
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4]; // L: 150
			Frames var6 = ArchiveDiskAction.getFrames(var4 >> 16); // L: 151
			var4 &= 65535; // L: 152
			Model var7;
			if (var6 == null) { // L: 153
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2)); // L: 154
				var7.animate(var5, var2); // L: 155
				return var7; // L: 156
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4)); // L: 158
				var7.animate2(var5, var2, var6, var4, this.field3545); // L: 159
				return var7; // L: 160
			}
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Leh;IB)Leh;",
		garbageValue = "4"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		int var3 = this.frameIds[var2]; // L: 164
		Frames var4 = ArchiveDiskAction.getFrames(var3 >> 16); // L: 165
		var3 &= 65535; // L: 166
		if (var4 == null) { // L: 167
			return var1.toSharedSequenceModel(true);
		} else {
			Frames var5 = null; // L: 168
			int var6 = 0; // L: 169
			if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) { // L: 170
				var6 = this.chatFrameIds[var2]; // L: 171
				var5 = ArchiveDiskAction.getFrames(var6 >> 16); // L: 172
				var6 &= 65535; // L: 173
			}

			Model var7;
			if (var5 != null && var6 != 65535) { // L: 175
				var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3) & !var5.hasAlphaTransform(var6)); // L: 180
				var7.animate(var4, var3); // L: 181
				var7.animate(var5, var6); // L: 182
				return var7; // L: 183
			} else {
				var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3)); // L: 176
				var7.animate(var4, var3); // L: 177
				return var7; // L: 178
			}
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lbd;B)V",
		garbageValue = "1"
	)
	@Export("doCycleTitle")
	static void doCycleTitle(GameEngine var0) {
		int var2;
		int var3;
		int var4;
		if (Login.worldSelectOpen) { // L: 248
			while (true) {
				if (!GrandExchangeOfferNameComparator.isKeyDown()) { // L: 250
					if (MouseHandler.MouseHandler_lastButton != 1 && (UserComparator9.mouseCam || MouseHandler.MouseHandler_lastButton != 4)) { // L: 271
						break;
					}

					int var1 = Login.xPadding + 280; // L: 272
					if (MouseHandler.MouseHandler_lastPressedX >= var1 && MouseHandler.MouseHandler_lastPressedX <= var1 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 273
						HealthBarDefinition.changeWorldSelectSorting(0, 0); // L: 274
						break; // L: 275
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var1 + 15 && MouseHandler.MouseHandler_lastPressedX <= var1 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 277
						HealthBarDefinition.changeWorldSelectSorting(0, 1); // L: 278
						break; // L: 279
					}

					var2 = Login.xPadding + 390; // L: 281
					if (MouseHandler.MouseHandler_lastPressedX >= var2 && MouseHandler.MouseHandler_lastPressedX <= var2 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 282
						HealthBarDefinition.changeWorldSelectSorting(1, 0); // L: 283
						break; // L: 284
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var2 + 15 && MouseHandler.MouseHandler_lastPressedX <= var2 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 286
						HealthBarDefinition.changeWorldSelectSorting(1, 1); // L: 287
						break; // L: 288
					}

					var3 = Login.xPadding + 500; // L: 290
					if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 291
						HealthBarDefinition.changeWorldSelectSorting(2, 0); // L: 292
						break; // L: 293
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 295
						HealthBarDefinition.changeWorldSelectSorting(2, 1); // L: 296
						break; // L: 297
					}

					var4 = Login.xPadding + 610; // L: 299
					if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 300
						HealthBarDefinition.changeWorldSelectSorting(3, 0); // L: 301
						break; // L: 302
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 304
						HealthBarDefinition.changeWorldSelectSorting(3, 1); // L: 305
						break; // L: 306
					}

					if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) { // L: 308
						Login.worldSelectOpen = false; // L: 310
						class25.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 311
						class224.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 312
						class224.logoSprite.drawAt(Login.xPadding + 382 - class224.logoSprite.subWidth / 2, 18); // L: 313
						break; // L: 315
					}

					if (Login.hoveredWorldIndex != -1) { // L: 317
						World var5 = World.World_worlds[Login.hoveredWorldIndex]; // L: 318
						SecureRandomCallable.changeWorld(var5); // L: 319
						Login.worldSelectOpen = false; // L: 321
						class25.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 322
						class224.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 323
						class224.logoSprite.drawAt(Login.xPadding + 382 - class224.logoSprite.subWidth / 2, 18); // L: 324
					} else {
						if (Login.worldSelectPage > 0 && VerticalAlignment.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= VerticalAlignment.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= ModelData0.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= ModelData0.canvasHeight / 2 + 50) { // L: 328
							--Login.worldSelectPage; // L: 329
						}

						if (Login.worldSelectPage < Login.worldSelectPagesCount && class8.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= IgnoreList.canvasWidth - class8.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= IgnoreList.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= ModelData0.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= ModelData0.canvasHeight / 2 + 50) { // L: 331
							++Login.worldSelectPage; // L: 332
						}
					}
					break;
				}

				if (StudioGame.field3135 == 13) { // L: 251
					Login.worldSelectOpen = false; // L: 253
					class25.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 254
					class224.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 255
					class224.logoSprite.drawAt(Login.xPadding + 382 - class224.logoSprite.subWidth / 2, 18); // L: 256
					break; // L: 258
				}

				if (StudioGame.field3135 == 96) { // L: 260
					if (Login.worldSelectPage > 0 && VerticalAlignment.worldSelectLeftSprite != null) { // L: 261
						--Login.worldSelectPage; // L: 262
					}
				} else if (StudioGame.field3135 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && class8.worldSelectRightSprite != null) { // L: 265 266
					++Login.worldSelectPage; // L: 267
				}
			}

		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !UserComparator9.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) { // L: 338
				Timer.clientPreferences.titleMusicDisabled = !Timer.clientPreferences.titleMusicDisabled; // L: 339
				GrandExchangeOffer.savePreferences(); // L: 340
				if (!Timer.clientPreferences.titleMusicDisabled) { // L: 341
					Archive var21 = class217.archive6; // L: 342
					var2 = var21.getGroupId("scape main"); // L: 344
					var3 = var21.getFileId(var2, ""); // L: 345
					Interpreter.method2082(var21, var2, var3, 255, false); // L: 346
				} else {
					WorldMapRegion.method588(); // L: 349
				}
			}

			if (Client.gameState != 5) { // L: 351
				if (-1L == Login.field1208) { // L: 352
					Login.field1208 = class298.currentTimeMillis() + 1000L; // L: 353
				}

				long var22 = class298.currentTimeMillis(); // L: 355
				boolean var33;
				if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 358
					while (true) {
						if (Client.archiveLoadersDone >= Client.archiveLoaders.size()) { // L: 362
							var33 = true; // L: 370
							break;
						}

						ArchiveLoader var24 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone); // L: 363
						if (!var24.isLoaded()) { // L: 364
							var33 = false; // L: 365
							break; // L: 366
						}

						++Client.archiveLoadersDone; // L: 368
					}
				} else {
					var33 = true; // L: 359
				}

				if (var33 && Login.field1209 == -1L) { // L: 372 373
					Login.field1209 = var22; // L: 374
					if (Login.field1209 > Login.field1208) { // L: 375
						Login.field1208 = Login.field1209; // L: 376
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) { // L: 380
					if (Language.Language_EN == WorldMapScaleHandler.clientLanguage) { // L: 381
						if (MouseHandler.MouseHandler_lastButton == 1 || !UserComparator9.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 382
							var4 = Login.xPadding + 5; // L: 383
							short var25 = 463; // L: 384
							byte var6 = 100; // L: 385
							byte var7 = 35; // L: 386
							if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var6 + var4 && MouseHandler.MouseHandler_lastPressedY >= var25 && MouseHandler.MouseHandler_lastPressedY <= var25 + var7) { // L: 387
								if (GrandExchangeEvent.loadWorlds()) { // L: 389
									Login.worldSelectOpen = true; // L: 390
									Login.worldSelectPage = 0; // L: 391
									Login.worldSelectPagesCount = 0; // L: 392
								}

								return; // L: 395
							}
						}

						if (World.World_request != null && GrandExchangeEvent.loadWorlds()) { // L: 398 399
							Login.worldSelectOpen = true; // L: 400
							Login.worldSelectPage = 0; // L: 401
							Login.worldSelectPagesCount = 0; // L: 402
						}
					}

					var4 = MouseHandler.MouseHandler_lastButton; // L: 406
					int var44 = MouseHandler.MouseHandler_lastPressedX; // L: 407
					int var34 = MouseHandler.MouseHandler_lastPressedY; // L: 408
					if (var4 == 0) { // L: 409
						var44 = MouseHandler.MouseHandler_x; // L: 410
						var34 = MouseHandler.MouseHandler_y; // L: 411
					}

					if (!UserComparator9.mouseCam && var4 == 4) { // L: 413
						var4 = 1;
					}

					short var37;
					int var38;
					if (Login.loginIndex == 0) { // L: 414
						boolean var42 = false; // L: 415

						while (GrandExchangeOfferNameComparator.isKeyDown()) { // L: 416
							if (StudioGame.field3135 == 84) { // L: 417
								var42 = true; // L: 418
							}
						}

						var38 = Login.loginBoxCenter - 80; // L: 421
						var37 = 291; // L: 422
						if (var4 == 1 && var44 >= var38 - 75 && var44 <= var38 + 75 && var34 >= var37 - 20 && var34 <= var37 + 20) { // L: 423
							AttackOption.openURL(AbstractWorldMapIcon.method632("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false); // L: 424
						}

						var38 = Login.loginBoxCenter + 80; // L: 426
						if (var4 == 1 && var44 >= var38 - 75 && var44 <= var38 + 75 && var34 >= var37 - 20 && var34 <= var37 + 20 || var42) { // L: 427
							if ((Client.worldProperties & 33554432) != 0) { // L: 428
								Login.Login_response0 = ""; // L: 429
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world."; // L: 430
								Login.Login_response2 = "Your normal account will not be affected."; // L: 431
								Login.Login_response3 = ""; // L: 432
								Login.loginIndex = 1; // L: 433
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 435
									Login.currentLoginField = 1; // L: 436
								} else {
									Login.currentLoginField = 0; // L: 439
								}
							} else if ((Client.worldProperties & 4) != 0) { // L: 443
								if ((Client.worldProperties & 1024) != 0) { // L: 444
									Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world."; // L: 445
									Login.Login_response2 = "Players can attack each other almost everywhere"; // L: 446
									Login.Login_response3 = "and the Protect Item prayer won't work."; // L: 447
								} else {
									Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world."; // L: 450
									Login.Login_response2 = "Players can attack each other"; // L: 451
									Login.Login_response3 = "almost everywhere."; // L: 452
								}

								Login.Login_response0 = "Warning!"; // L: 454
								Login.loginIndex = 1; // L: 455
								Client.method1799(); // L: 456
							} else if ((Client.worldProperties & 1024) != 0) { // L: 458
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world."; // L: 459
								Login.Login_response2 = "The Protect Item prayer will"; // L: 460
								Login.Login_response3 = "not work on this world."; // L: 461
								Login.Login_response0 = "Warning!"; // L: 462
								Login.loginIndex = 1; // L: 463
								Client.method1799(); // L: 464
							} else {
								AbstractWorldMapIcon.Login_promptCredentials(false); // L: 467
							}
						}
					} else {
						short var8;
						int var35;
						if (Login.loginIndex == 1) { // L: 471
							while (true) {
								if (!GrandExchangeOfferNameComparator.isKeyDown()) { // L: 472
									var35 = Login.loginBoxCenter - 80; // L: 480
									var8 = 321; // L: 481
									if (var4 == 1 && var44 >= var35 - 75 && var44 <= var35 + 75 && var34 >= var8 - 20 && var34 <= var8 + 20) { // L: 482
										AbstractWorldMapIcon.Login_promptCredentials(false); // L: 483
									}

									var35 = Login.loginBoxCenter + 80; // L: 485
									if (var4 == 1 && var44 >= var35 - 75 && var44 <= var35 + 75 && var34 >= var8 - 20 && var34 <= var8 + 20) { // L: 486
										Login.loginIndex = 0; // L: 487
									}
									break;
								}

								if (StudioGame.field3135 == 84) { // L: 473
									AbstractWorldMapIcon.Login_promptCredentials(false); // L: 474
								} else if (StudioGame.field3135 == 13) { // L: 476
									Login.loginIndex = 0; // L: 477
								}
							}
						} else {
							int var11;
							short var36;
							boolean var39;
							if (Login.loginIndex == 2) { // L: 490
								var36 = 201; // L: 491
								var35 = var36 + 52; // L: 492
								if (var4 == 1 && var34 >= var35 - 12 && var34 < var35 + 2) { // L: 493
									Login.currentLoginField = 0;
								}

								var35 += 15; // L: 494
								if (var4 == 1 && var34 >= var35 - 12 && var34 < var35 + 2) { // L: 495
									Login.currentLoginField = 1;
								}

								var35 += 15; // L: 496
								var36 = 361; // L: 497
								if (GameEngine.field481 != null) { // L: 498
									var38 = GameEngine.field481.highX / 2; // L: 499
									if (var4 == 1 && var44 >= GameEngine.field481.lowX - var38 && var44 <= var38 + GameEngine.field481.lowX && var34 >= var36 - 15 && var34 < var36) { // L: 500
										switch(Login.field1190) { // L: 501
										case 1:
											GameEngine.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 504
											Login.loginIndex = 5; // L: 505
											return; // L: 506
										case 2:
											AttackOption.openURL("https://support.runescape.com/hc/en-gb", true, false); // L: 510
										}
									}
								}

								var38 = Login.loginBoxCenter - 80; // L: 516
								var37 = 321; // L: 517
								if (var4 == 1 && var44 >= var38 - 75 && var44 <= var38 + 75 && var34 >= var37 - 20 && var34 <= var37 + 20) { // L: 518
									Login.Login_username = Login.Login_username.trim(); // L: 519
									if (Login.Login_username.length() == 0) { // L: 520
										GameEngine.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 521
										return; // L: 522
									}

									if (Login.Login_password.length() == 0) { // L: 524
										GameEngine.setLoginResponseString("", "Please enter your password.", ""); // L: 525
										return; // L: 526
									}

									GameEngine.setLoginResponseString("", "Connecting to server...", ""); // L: 528
									WorldMapDecoration.method380(false); // L: 529
									WorldMapCacheName.updateGameState(20); // L: 530
									return; // L: 531
								}

								var38 = Login.loginBoxX + 180 + 80; // L: 533
								if (var4 == 1 && var44 >= var38 - 75 && var44 <= var38 + 75 && var34 >= var37 - 20 && var34 <= var37 + 20) { // L: 534
									Login.loginIndex = 0; // L: 535
									Login.Login_username = ""; // L: 536
									Login.Login_password = ""; // L: 537
									WorldMapSection1.field313 = 0; // L: 538
									SecureRandomCallable.otp = ""; // L: 539
									Login.field1200 = true; // L: 540
								}

								var38 = Login.loginBoxCenter + -117; // L: 542
								var37 = 277; // L: 543
								Login.field1192 = var44 >= var38 && var44 < var38 + FriendSystem.field1071 && var34 >= var37 && var34 < var37 + Players.field1260; // L: 544
								if (var4 == 1 && Login.field1192) { // L: 545
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered; // L: 546
									if (!Client.Login_isUsernameRemembered && Timer.clientPreferences.rememberedUsername != null) { // L: 547
										Timer.clientPreferences.rememberedUsername = null; // L: 548
										GrandExchangeOffer.savePreferences(); // L: 549
									}
								}

								var38 = Login.loginBoxCenter + 24; // L: 552
								var37 = 277; // L: 553
								Login.field1180 = var44 >= var38 && var44 < var38 + FriendSystem.field1071 && var34 >= var37 && var34 < var37 + Players.field1260; // L: 554
								if (var4 == 1 && Login.field1180) { // L: 555
									Timer.clientPreferences.hideUsername = !Timer.clientPreferences.hideUsername; // L: 556
									if (!Timer.clientPreferences.hideUsername) { // L: 557
										Login.Login_username = ""; // L: 558
										Timer.clientPreferences.rememberedUsername = null; // L: 559
										Client.method1799(); // L: 560
									}

									GrandExchangeOffer.savePreferences(); // L: 562
								}

								while (true) {
									int var12;
									Transferable var27;
									do {
										while (true) {
											label1161:
											do {
												while (true) {
													while (GrandExchangeOfferNameComparator.isKeyDown()) { // L: 564
														if (StudioGame.field3135 != 13) { // L: 565
															if (Login.currentLoginField != 0) { // L: 574
																continue label1161;
															}

															char var40 = WorldMapIcon_1.field200; // L: 575

															for (var11 = 0; var11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var40 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var11); ++var11) { // L: 577 578
															}

															if (StudioGame.field3135 == 85 && Login.Login_username.length() > 0) { // L: 581
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (StudioGame.field3135 == 84 || StudioGame.field3135 == 80) { // L: 582
																Login.currentLoginField = 1;
															}

															if (Interpreter.method1995(WorldMapIcon_1.field200) && Login.Login_username.length() < 320) { // L: 583
																Login.Login_username = Login.Login_username + WorldMapIcon_1.field200;
															}
														} else {
															Login.loginIndex = 0; // L: 566
															Login.Login_username = ""; // L: 567
															Login.Login_password = ""; // L: 568
															WorldMapSection1.field313 = 0; // L: 569
															SecureRandomCallable.otp = ""; // L: 570
															Login.field1200 = true; // L: 571
														}
													}

													return; // L: 872
												}
											} while(Login.currentLoginField != 1); // L: 585

											if (StudioGame.field3135 == 85 && Login.Login_password.length() > 0) { // L: 586
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1); // L: 587
											} else if (StudioGame.field3135 == 84 || StudioGame.field3135 == 80) { // L: 589
												Login.currentLoginField = 0; // L: 590
												if (StudioGame.field3135 == 84) { // L: 591
													Login.Login_username = Login.Login_username.trim(); // L: 592
													if (Login.Login_username.length() == 0) { // L: 593
														GameEngine.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 594
														return; // L: 595
													}

													if (Login.Login_password.length() == 0) { // L: 597
														GameEngine.setLoginResponseString("", "Please enter your password.", ""); // L: 598
														return; // L: 599
													}

													GameEngine.setLoginResponseString("", "Connecting to server...", ""); // L: 601
													WorldMapDecoration.method380(false); // L: 602
													WorldMapCacheName.updateGameState(20); // L: 603
													return; // L: 604
												}
											}

											if ((KeyHandler.KeyHandler_pressedKeys[82] || KeyHandler.KeyHandler_pressedKeys[87]) && StudioGame.field3135 == 67) { // L: 607
												Clipboard var26 = Toolkit.getDefaultToolkit().getSystemClipboard(); // L: 608
												var27 = var26.getContents(WorldMapIcon_0.client); // L: 609
												var12 = 20 - Login.Login_password.length(); // L: 610
												break;
											}

											char var41 = WorldMapIcon_1.field200; // L: 652
											if ((var41 < ' ' || var41 >= 127) && (var41 <= 127 || var41 >= 160) && (var41 <= 160 || var41 > 255)) { // L: 654
												label1364: {
													if (var41 != 0) { // L: 658
														char[] var28 = class298.cp1252AsciiExtension; // L: 660

														for (int var29 = 0; var29 < var28.length; ++var29) { // L: 661
															char var14 = var28[var29]; // L: 662
															if (var14 == var41) { // L: 664
																var39 = true; // L: 665
																break label1364; // L: 666
															}
														}
													}

													var39 = false; // L: 672
												}
											} else {
												var39 = true; // L: 655
											}

											if (var39 && Interpreter.method1995(WorldMapIcon_1.field200) && Login.Login_password.length() < 20) { // L: 674
												Login.Login_password = Login.Login_password + WorldMapIcon_1.field200; // L: 675
											}
										}
									} while(var12 <= 0); // L: 611

									try {
										String var13 = (String)var27.getTransferData(DataFlavor.stringFlavor); // L: 613
										int var43 = Math.min(var12, var13.length()); // L: 614

										for (int var15 = 0; var15 < var43; ++var15) { // L: 615
											char var17 = var13.charAt(var15); // L: 617
											boolean var16;
											if (var17 >= ' ' && var17 < 127 || var17 > 127 && var17 < 160 || var17 > 160 && var17 <= 255) { // L: 619
												var16 = true; // L: 620
											} else {
												label1378: {
													if (var17 != 0) { // L: 623
														char[] var18 = class298.cp1252AsciiExtension; // L: 625

														for (int var19 = 0; var19 < var18.length; ++var19) { // L: 626
															char var20 = var18[var19]; // L: 627
															if (var17 == var20) { // L: 629
																var16 = true; // L: 630
																break label1378; // L: 631
															}
														}
													}

													var16 = false; // L: 637
												}
											}

											if (!var16 || !Interpreter.method1995(var13.charAt(var15))) { // L: 639
												Login.loginIndex = 3; // L: 640
												return; // L: 641
											}
										}

										Login.Login_password = Login.Login_password + var13.substring(0, var43); // L: 644
									} catch (UnsupportedFlavorException var31) { // L: 646
									} catch (IOException var32) { // L: 647
									}
								}
							} else if (Login.loginIndex == 3) { // L: 682
								var35 = Login.loginBoxX + 180; // L: 683
								var8 = 276; // L: 684
								if (var4 == 1 && var44 >= var35 - 75 && var44 <= var35 + 75 && var34 >= var8 - 20 && var34 <= var8 + 20) { // L: 685
									AbstractWorldMapIcon.Login_promptCredentials(false); // L: 686
								}

								var35 = Login.loginBoxX + 180; // L: 688
								var8 = 326; // L: 689
								if (var4 == 1 && var44 >= var35 - 75 && var44 <= var35 + 75 && var34 >= var8 - 20 && var34 <= var8 + 20) { // L: 690
									GameEngine.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 691
									Login.loginIndex = 5; // L: 692
									return; // L: 693
								}
							} else {
								int var10;
								if (Login.loginIndex == 4) { // L: 696
									var35 = Login.loginBoxX + 180 - 80; // L: 697
									var8 = 321; // L: 698
									if (var4 == 1 && var44 >= var35 - 75 && var44 <= var35 + 75 && var34 >= var8 - 20 && var34 <= var8 + 20) { // L: 699
										SecureRandomCallable.otp.trim(); // L: 700
										if (SecureRandomCallable.otp.length() != 6) { // L: 701
											GameEngine.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 702
											return; // L: 703
										}

										WorldMapSection1.field313 = Integer.parseInt(SecureRandomCallable.otp); // L: 705
										SecureRandomCallable.otp = ""; // L: 706
										WorldMapDecoration.method380(true); // L: 707
										GameEngine.setLoginResponseString("", "Connecting to server...", ""); // L: 708
										WorldMapCacheName.updateGameState(20); // L: 709
										return; // L: 710
									}

									if (var4 == 1 && var44 >= Login.loginBoxX + 180 - 9 && var44 <= Login.loginBoxX + 180 + 130 && var34 >= 263 && var34 <= 296) { // L: 712
										Login.field1200 = !Login.field1200; // L: 713
									}

									if (var4 == 1 && var44 >= Login.loginBoxX + 180 - 34 && var44 <= Login.loginBoxX + 34 + 180 && var34 >= 351 && var34 <= 363) { // L: 715
										AttackOption.openURL(AbstractWorldMapIcon.method632("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false); // L: 716
									}

									var35 = Login.loginBoxX + 180 + 80; // L: 718
									if (var4 == 1 && var44 >= var35 - 75 && var44 <= var35 + 75 && var34 >= var8 - 20 && var34 <= var8 + 20) { // L: 719
										Login.loginIndex = 0; // L: 720
										Login.Login_username = ""; // L: 721
										Login.Login_password = ""; // L: 722
										WorldMapSection1.field313 = 0; // L: 723
										SecureRandomCallable.otp = ""; // L: 724
									}

									while (GrandExchangeOfferNameComparator.isKeyDown()) { // L: 726
										boolean var9 = false; // L: 727

										for (var10 = 0; var10 < "1234567890".length(); ++var10) { // L: 728
											if (WorldMapIcon_1.field200 == "1234567890".charAt(var10)) { // L: 729
												var9 = true; // L: 730
												break; // L: 731
											}
										}

										if (StudioGame.field3135 == 13) { // L: 734
											Login.loginIndex = 0; // L: 735
											Login.Login_username = ""; // L: 736
											Login.Login_password = ""; // L: 737
											WorldMapSection1.field313 = 0; // L: 738
											SecureRandomCallable.otp = ""; // L: 739
										} else {
											if (StudioGame.field3135 == 85 && SecureRandomCallable.otp.length() > 0) { // L: 742
												SecureRandomCallable.otp = SecureRandomCallable.otp.substring(0, SecureRandomCallable.otp.length() - 1);
											}

											if (StudioGame.field3135 == 84) { // L: 743
												SecureRandomCallable.otp.trim(); // L: 744
												if (SecureRandomCallable.otp.length() != 6) { // L: 745
													GameEngine.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 746
													return; // L: 747
												}

												WorldMapSection1.field313 = Integer.parseInt(SecureRandomCallable.otp); // L: 749
												SecureRandomCallable.otp = ""; // L: 750
												WorldMapDecoration.method380(true); // L: 751
												GameEngine.setLoginResponseString("", "Connecting to server...", ""); // L: 752
												WorldMapCacheName.updateGameState(20); // L: 753
												return; // L: 754
											}

											if (var9 && SecureRandomCallable.otp.length() < 6) { // L: 756
												SecureRandomCallable.otp = SecureRandomCallable.otp + WorldMapIcon_1.field200;
											}
										}
									}
								} else if (Login.loginIndex == 5) { // L: 760
									var35 = Login.loginBoxX + 180 - 80; // L: 761
									var8 = 321; // L: 762
									if (var4 == 1 && var44 >= var35 - 75 && var44 <= var35 + 75 && var34 >= var8 - 20 && var34 <= var8 + 20) { // L: 763
										class7.method83(); // L: 764
										return; // L: 765
									}

									var35 = Login.loginBoxX + 180 + 80; // L: 767
									if (var4 == 1 && var44 >= var35 - 75 && var44 <= var35 + 75 && var34 >= var8 - 20 && var34 <= var8 + 20) { // L: 768
										AbstractWorldMapIcon.Login_promptCredentials(true); // L: 769
									}

									var37 = 361; // L: 771
									if (GrandExchangeOfferOwnWorldComparator.field643 != null) { // L: 772
										var10 = GrandExchangeOfferOwnWorldComparator.field643.highX / 2; // L: 773
										if (var4 == 1 && var44 >= GrandExchangeOfferOwnWorldComparator.field643.lowX - var10 && var44 <= var10 + GrandExchangeOfferOwnWorldComparator.field643.lowX && var34 >= var37 - 15 && var34 < var37) { // L: 774
											AttackOption.openURL(AbstractWorldMapIcon.method632("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false); // L: 775
										}
									}

									while (GrandExchangeOfferNameComparator.isKeyDown()) { // L: 778
										var39 = false; // L: 779

										for (var11 = 0; var11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var11) { // L: 780
											if (WorldMapIcon_1.field200 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var11)) { // L: 781
												var39 = true; // L: 782
												break; // L: 783
											}
										}

										if (StudioGame.field3135 == 13) { // L: 786
											AbstractWorldMapIcon.Login_promptCredentials(true); // L: 787
										} else {
											if (StudioGame.field3135 == 85 && Login.Login_username.length() > 0) { // L: 790
												Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
											}

											if (StudioGame.field3135 == 84) { // L: 791
												class7.method83(); // L: 792
												return; // L: 793
											}

											if (var39 && Login.Login_username.length() < 320) { // L: 795
												Login.Login_username = Login.Login_username + WorldMapIcon_1.field200;
											}
										}
									}
								} else if (Login.loginIndex != 6) { // L: 799
									if (Login.loginIndex == 7) { // L: 810
										var35 = Login.loginBoxX + 180 - 80; // L: 811
										var8 = 321; // L: 812
										if (var4 == 1 && var44 >= var35 - 75 && var44 <= var35 + 75 && var34 >= var8 - 20 && var34 <= var8 + 20) { // L: 813
											AttackOption.openURL(AbstractWorldMapIcon.method632("secure", true) + "m=dob/set_dob.ws", true, false); // L: 814
											GameEngine.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 815
											Login.loginIndex = 6; // L: 816
											return; // L: 817
										}

										var35 = Login.loginBoxX + 180 + 80; // L: 819
										if (var4 == 1 && var44 >= var35 - 75 && var44 <= var35 + 75 && var34 >= var8 - 20 && var34 <= var8 + 20) { // L: 820
											AbstractWorldMapIcon.Login_promptCredentials(true); // L: 821
										}
									} else if (Login.loginIndex == 8) { // L: 824
										var35 = Login.loginBoxX + 180 - 80; // L: 825
										var8 = 321; // L: 826
										if (var4 == 1 && var44 >= var35 - 75 && var44 <= var35 + 75 && var34 >= var8 - 20 && var34 <= var8 + 20) { // L: 827
											AttackOption.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 828
											GameEngine.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 829
											Login.loginIndex = 6; // L: 830
											return; // L: 831
										}

										var35 = Login.loginBoxX + 180 + 80; // L: 833
										if (var4 == 1 && var44 >= var35 - 75 && var44 <= var35 + 75 && var34 >= var8 - 20 && var34 <= var8 + 20) { // L: 834
											AbstractWorldMapIcon.Login_promptCredentials(true); // L: 835
										}
									} else if (Login.loginIndex == 12) { // L: 838
										String var30 = ""; // L: 839
										switch(Login.field1199) { // L: 840
										case 0:
											var30 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans"; // L: 842
											break; // L: 843
										case 1:
											var30 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked"; // L: 848
											break;
										default:
											AbstractWorldMapIcon.Login_promptCredentials(false); // L: 845
										}

										var38 = Login.loginBoxX + 180; // L: 851
										var37 = 276; // L: 852
										if (var4 == 1 && var44 >= var38 - 75 && var44 <= var38 + 75 && var34 >= var37 - 20 && var34 <= var37 + 20) { // L: 853
											AttackOption.openURL(var30, true, false); // L: 854
											GameEngine.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)"); // L: 855
											Login.loginIndex = 6; // L: 856
											return; // L: 857
										}

										var38 = Login.loginBoxX + 180; // L: 859
										var37 = 326; // L: 860
										if (var4 == 1 && var44 >= var38 - 75 && var44 <= var38 + 75 && var34 >= var37 - 20 && var34 <= var37 + 20) { // L: 861
											AbstractWorldMapIcon.Login_promptCredentials(false); // L: 862
										}
									} else if (Login.loginIndex == 24) { // L: 865
										var35 = Login.loginBoxX + 180; // L: 866
										var8 = 301; // L: 867
										if (var4 == 1 && var44 >= var35 - 75 && var44 <= var35 + 75 && var34 >= var8 - 20 && var34 <= var8 + 20) { // L: 868
											AbstractWorldMapIcon.Login_promptCredentials(false); // L: 869
										}
									}
								} else {
									while (true) {
										do {
											if (!GrandExchangeOfferNameComparator.isKeyDown()) { // L: 800
												var36 = 321; // L: 805
												if (var4 == 1 && var34 >= var36 - 20 && var34 <= var36 + 20) { // L: 806
													AbstractWorldMapIcon.Login_promptCredentials(true); // L: 807
												}

												return;
											}
										} while(StudioGame.field3135 != 84 && StudioGame.field3135 != 13); // L: 801

										AbstractWorldMapIcon.Login_promptCredentials(true); // L: 802
									}
								}
							}
						}
					}

				}
			}
		}
	} // L: 336

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(Lhe;IIIIIII)V",
		garbageValue = "1825223582"
	)
	static final void method4797(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field692) { // L: 9532
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0; // L: 9533
		}

		Client.field692 = false; // L: 9534
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !UserComparator9.mouseCam && MouseHandler.MouseHandler_currentButton == 4) { // L: 9535
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) { // L: 9536
				var0.scrollY -= 4; // L: 9537
				CollisionMap.invalidateWidget(var0); // L: 9538
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) { // L: 9540
				var0.scrollY += 4; // L: 9541
				CollisionMap.invalidateWidget(var0); // L: 9542
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) { // L: 9544
				var7 = var3 * (var3 - 32) / var4; // L: 9545
				if (var7 < 8) { // L: 9546
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2; // L: 9547
				int var9 = var3 - 32 - var7; // L: 9548
				var0.scrollY = var8 * (var4 - var3) / var9; // L: 9549
				CollisionMap.invalidateWidget(var0); // L: 9550
				Client.field692 = true; // L: 9551
			}
		}

		if (Client.mouseWheelRotation != 0) { // L: 9554
			var7 = var0.width; // L: 9555
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) { // L: 9556
				var0.scrollY += Client.mouseWheelRotation * 45; // L: 9557
				CollisionMap.invalidateWidget(var0); // L: 9558
			}
		}

	} // L: 9561
}
