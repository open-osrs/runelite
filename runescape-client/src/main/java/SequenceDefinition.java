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
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
	}

	SequenceDefinition() {
		this.frameCount = -1;
		this.field3556 = false;
		this.field3557 = 5;
		this.shield = -1;
		this.weapon = -1;
		this.field3554 = 99;
		this.field3560 = -1;
		this.field3555 = -1;
		this.field3548 = 2;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lkj;B)V",
		garbageValue = "-72"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
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
		if (var2 == 1) {
			var3 = var1.readUnsignedShort();
			this.frameLengths = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.frameLengths[var4] = var1.readUnsignedShort();
			}

			this.frameIds = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.frameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) {
				this.frameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 2) {
			this.frameCount = var1.readUnsignedShort();
		} else if (var2 == 3) {
			var3 = var1.readUnsignedByte();
			this.field3545 = new int[var3 + 1];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field3545[var4] = var1.readUnsignedByte();
			}

			this.field3545[var3] = 9999999;
		} else if (var2 == 4) {
			this.field3556 = true;
		} else if (var2 == 5) {
			this.field3557 = var1.readUnsignedByte();
		} else if (var2 == 6) {
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) {
			this.field3554 = var1.readUnsignedByte();
		} else if (var2 == 9) {
			this.field3560 = var1.readUnsignedByte();
		} else if (var2 == 10) {
			this.field3555 = var1.readUnsignedByte();
		} else if (var2 == 11) {
			this.field3548 = var1.readUnsignedByte();
		} else if (var2 == 12) {
			var3 = var1.readUnsignedByte();
			this.chatFrameIds = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.chatFrameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) {
				this.chatFrameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 13) {
			var3 = var1.readUnsignedByte();
			this.soundEffects = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.soundEffects[var4] = var1.readMedium();
			}
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1714495810"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field3560 == -1) {
			if (this.field3545 != null) {
				this.field3560 = 2;
			} else {
				this.field3560 = 0;
			}
		}

		if (this.field3555 == -1) {
			if (this.field3545 != null) {
				this.field3555 = 2;
			} else {
				this.field3555 = 0;
			}
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Leh;IB)Leh;",
		garbageValue = "17"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		var2 = this.frameIds[var2];
		Frames var3 = ArchiveDiskAction.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var3 == null) {
			return var1.toSharedSequenceModel(true);
		} else {
			Model var4 = var1.toSharedSequenceModel(!var3.hasAlphaTransform(var2));
			var4.animate(var3, var2);
			return var4;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Leh;III)Leh;",
		garbageValue = "-2055004440"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		var2 = this.frameIds[var2];
		Frames var4 = ArchiveDiskAction.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var4 == null) {
			return var1.toSharedSequenceModel(true);
		} else {
			Model var5 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var2));
			var3 &= 3;
			if (var3 == 1) {
				var5.rotateY270Ccw();
			} else if (var3 == 2) {
				var5.rotateY180();
			} else if (var3 == 3) {
				var5.rotateY90Ccw();
			}

			var5.animate(var4, var2);
			if (var3 == 1) {
				var5.rotateY90Ccw();
			} else if (var3 == 2) {
				var5.rotateY180();
			} else if (var3 == 3) {
				var5.rotateY270Ccw();
			}

			return var5;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Leh;II)Leh;",
		garbageValue = "-109933088"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		var2 = this.frameIds[var2];
		Frames var3 = ArchiveDiskAction.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var3 == null) {
			return var1.toSharedSpotAnimationModel(true);
		} else {
			Model var4 = var1.toSharedSpotAnimationModel(!var3.hasAlphaTransform(var2));
			var4.animate(var3, var2);
			return var4;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Leh;ILjy;IB)Leh;",
		garbageValue = "-74"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2];
		Frames var5 = ArchiveDiskAction.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var5 == null) {
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4];
			Frames var6 = ArchiveDiskAction.getFrames(var4 >> 16);
			var4 &= 65535;
			Model var7;
			if (var6 == null) {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var7.animate(var5, var2);
				return var7;
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4));
				var7.animate2(var5, var2, var6, var4, this.field3545);
				return var7;
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
		int var3 = this.frameIds[var2];
		Frames var4 = ArchiveDiskAction.getFrames(var3 >> 16);
		var3 &= 65535;
		if (var4 == null) {
			return var1.toSharedSequenceModel(true);
		} else {
			Frames var5 = null;
			int var6 = 0;
			if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) {
				var6 = this.chatFrameIds[var2];
				var5 = ArchiveDiskAction.getFrames(var6 >> 16);
				var6 &= 65535;
			}

			Model var7;
			if (var5 != null && var6 != 65535) {
				var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3) & !var5.hasAlphaTransform(var6));
				var7.animate(var4, var3);
				var7.animate(var5, var6);
				return var7;
			} else {
				var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3));
				var7.animate(var4, var3);
				return var7;
			}
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lbd;B)V",
		garbageValue = "1"
	)
	@Export("doCycleTitle")
	static void doCycleTitle(GameShell var0) {
		int var2;
		int var3;
		int var4;
		if (Login.worldSelectOpen) {
			while (true) {
				if (!GrandExchangeOfferNameComparator.isKeyDown()) {
					if (MouseHandler.MouseHandler_lastButton != 1 && (UserComparator9.mouseCam || MouseHandler.MouseHandler_lastButton != 4)) {
						break;
					}

					int var1 = Login.xPadding + 280;
					if (MouseHandler.MouseHandler_lastPressedX >= var1 && MouseHandler.MouseHandler_lastPressedX <= var1 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						HealthBarDefinition.changeWorldSelectSorting(0, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var1 + 15 && MouseHandler.MouseHandler_lastPressedX <= var1 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						HealthBarDefinition.changeWorldSelectSorting(0, 1);
						break;
					}

					var2 = Login.xPadding + 390;
					if (MouseHandler.MouseHandler_lastPressedX >= var2 && MouseHandler.MouseHandler_lastPressedX <= var2 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						HealthBarDefinition.changeWorldSelectSorting(1, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var2 + 15 && MouseHandler.MouseHandler_lastPressedX <= var2 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						HealthBarDefinition.changeWorldSelectSorting(1, 1);
						break;
					}

					var3 = Login.xPadding + 500;
					if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						HealthBarDefinition.changeWorldSelectSorting(2, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						HealthBarDefinition.changeWorldSelectSorting(2, 1);
						break;
					}

					var4 = Login.xPadding + 610;
					if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						HealthBarDefinition.changeWorldSelectSorting(3, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						HealthBarDefinition.changeWorldSelectSorting(3, 1);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) {
						Login.worldSelectOpen = false;
						class25.leftTitleSprite.drawAt(Login.xPadding, 0);
						class224.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
						class224.logoSprite.drawAt(Login.xPadding + 382 - class224.logoSprite.subWidth / 2, 18);
						break;
					}

					if (Login.hoveredWorldIndex != -1) {
						World var5 = World.World_worlds[Login.hoveredWorldIndex];
						SecureRandomCallable.changeWorld(var5);
						Login.worldSelectOpen = false;
						class25.leftTitleSprite.drawAt(Login.xPadding, 0);
						class224.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
						class224.logoSprite.drawAt(Login.xPadding + 382 - class224.logoSprite.subWidth / 2, 18);
					} else {
						if (Login.worldSelectPage > 0 && VerticalAlignment.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= VerticalAlignment.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= ModelData0.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= ModelData0.canvasHeight / 2 + 50) {
							--Login.worldSelectPage;
						}

						if (Login.worldSelectPage < Login.worldSelectPagesCount && class8.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= IgnoreList.canvasWidth - class8.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= IgnoreList.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= ModelData0.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= ModelData0.canvasHeight / 2 + 50) {
							++Login.worldSelectPage;
						}
					}
					break;
				}

				if (StudioGame.field3135 == 13) {
					Login.worldSelectOpen = false;
					class25.leftTitleSprite.drawAt(Login.xPadding, 0);
					class224.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
					class224.logoSprite.drawAt(Login.xPadding + 382 - class224.logoSprite.subWidth / 2, 18);
					break;
				}

				if (StudioGame.field3135 == 96) {
					if (Login.worldSelectPage > 0 && VerticalAlignment.worldSelectLeftSprite != null) {
						--Login.worldSelectPage;
					}
				} else if (StudioGame.field3135 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && class8.worldSelectRightSprite != null) {
					++Login.worldSelectPage;
				}
			}

		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !UserComparator9.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) {
				Timer.clientPreferences.titleMusicDisabled = !Timer.clientPreferences.titleMusicDisabled;
				GrandExchangeOffer.savePreferences();
				if (!Timer.clientPreferences.titleMusicDisabled) {
					Archive var21 = class217.archive6;
					var2 = var21.getGroupId("scape main");
					var3 = var21.getFileId(var2, "");
					Interpreter.method2082(var21, var2, var3, 255, false);
				} else {
					WorldMapRegion.method588();
				}
			}

			if (Client.gameState != 5) {
				if (-1L == Login.field1208) {
					Login.field1208 = class298.currentTimeMillis() + 1000L;
				}

				long var22 = class298.currentTimeMillis();
				boolean var33;
				if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
					while (true) {
						if (Client.archiveLoadersDone >= Client.archiveLoaders.size()) {
							var33 = true;
							break;
						}

						ArchiveLoader var24 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone);
						if (!var24.isLoaded()) {
							var33 = false;
							break;
						}

						++Client.archiveLoadersDone;
					}
				} else {
					var33 = true;
				}

				if (var33 && Login.field1209 == -1L) {
					Login.field1209 = var22;
					if (Login.field1209 > Login.field1208) {
						Login.field1208 = Login.field1209;
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) {
					if (Language.Language_EN == WorldMapScaleHandler.clientLanguage) {
						if (MouseHandler.MouseHandler_lastButton == 1 || !UserComparator9.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
							var4 = Login.xPadding + 5;
							short var25 = 463;
							byte var6 = 100;
							byte var7 = 35;
							if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var6 + var4 && MouseHandler.MouseHandler_lastPressedY >= var25 && MouseHandler.MouseHandler_lastPressedY <= var25 + var7) {
								if (GrandExchangeEvent.loadWorlds()) {
									Login.worldSelectOpen = true;
									Login.worldSelectPage = 0;
									Login.worldSelectPagesCount = 0;
								}

								return;
							}
						}

						if (World.World_request != null && GrandExchangeEvent.loadWorlds()) {
							Login.worldSelectOpen = true;
							Login.worldSelectPage = 0;
							Login.worldSelectPagesCount = 0;
						}
					}

					var4 = MouseHandler.MouseHandler_lastButton;
					int var44 = MouseHandler.MouseHandler_lastPressedX;
					int var34 = MouseHandler.MouseHandler_lastPressedY;
					if (var4 == 0) {
						var44 = MouseHandler.MouseHandler_x;
						var34 = MouseHandler.MouseHandler_y;
					}

					if (!UserComparator9.mouseCam && var4 == 4) {
						var4 = 1;
					}

					short var37;
					int var38;
					if (Login.loginIndex == 0) {
						boolean var42 = false;

						while (GrandExchangeOfferNameComparator.isKeyDown()) {
							if (StudioGame.field3135 == 84) {
								var42 = true;
							}
						}

						var38 = Login.loginBoxCenter - 80;
						var37 = 291;
						if (var4 == 1 && var44 >= var38 - 75 && var44 <= var38 + 75 && var34 >= var37 - 20 && var34 <= var37 + 20) {
							AttackOption.openURL(AbstractWorldMapIcon.method632("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}

						var38 = Login.loginBoxCenter + 80;
						if (var4 == 1 && var44 >= var38 - 75 && var44 <= var38 + 75 && var34 >= var37 - 20 && var34 <= var37 + 20 || var42) {
							if ((Client.worldProperties & 33554432) != 0) {
								Login.Login_response0 = "";
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
								Login.Login_response2 = "Your normal account will not be affected.";
								Login.Login_response3 = "";
								Login.loginIndex = 1;
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
									Login.currentLoginField = 1;
								} else {
									Login.currentLoginField = 0;
								}
							} else if ((Client.worldProperties & 4) != 0) {
								if ((Client.worldProperties & 1024) != 0) {
									Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
									Login.Login_response2 = "Players can attack each other almost everywhere";
									Login.Login_response3 = "and the Protect Item prayer won't work.";
								} else {
									Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world.";
									Login.Login_response2 = "Players can attack each other";
									Login.Login_response3 = "almost everywhere.";
								}

								Login.Login_response0 = "Warning!";
								Login.loginIndex = 1;
								Client.method1799();
							} else if ((Client.worldProperties & 1024) != 0) {
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
								Login.Login_response2 = "The Protect Item prayer will";
								Login.Login_response3 = "not work on this world.";
								Login.Login_response0 = "Warning!";
								Login.loginIndex = 1;
								Client.method1799();
							} else {
								AbstractWorldMapIcon.Login_promptCredentials(false);
							}
						}
					} else {
						short var8;
						int var35;
						if (Login.loginIndex == 1) {
							while (true) {
								if (!GrandExchangeOfferNameComparator.isKeyDown()) {
									var35 = Login.loginBoxCenter - 80;
									var8 = 321;
									if (var4 == 1 && var44 >= var35 - 75 && var44 <= var35 + 75 && var34 >= var8 - 20 && var34 <= var8 + 20) {
										AbstractWorldMapIcon.Login_promptCredentials(false);
									}

									var35 = Login.loginBoxCenter + 80;
									if (var4 == 1 && var44 >= var35 - 75 && var44 <= var35 + 75 && var34 >= var8 - 20 && var34 <= var8 + 20) {
										Login.loginIndex = 0;
									}
									break;
								}

								if (StudioGame.field3135 == 84) {
									AbstractWorldMapIcon.Login_promptCredentials(false);
								} else if (StudioGame.field3135 == 13) {
									Login.loginIndex = 0;
								}
							}
						} else {
							int var11;
							short var36;
							boolean var39;
							if (Login.loginIndex == 2) {
								var36 = 201;
								var35 = var36 + 52;
								if (var4 == 1 && var34 >= var35 - 12 && var34 < var35 + 2) {
									Login.currentLoginField = 0;
								}

								var35 += 15;
								if (var4 == 1 && var34 >= var35 - 12 && var34 < var35 + 2) {
									Login.currentLoginField = 1;
								}

								var35 += 15;
								var36 = 361;
								if (GameShell.field481 != null) {
									var38 = GameShell.field481.highX / 2;
									if (var4 == 1 && var44 >= GameShell.field481.lowX - var38 && var44 <= var38 + GameShell.field481.lowX && var34 >= var36 - 15 && var34 < var36) {
										switch(Login.field1190) {
										case 1:
											GameShell.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
											Login.loginIndex = 5;
											return;
										case 2:
											AttackOption.openURL("https://support.runescape.com/hc/en-gb", true, false);
										}
									}
								}

								var38 = Login.loginBoxCenter - 80;
								var37 = 321;
								if (var4 == 1 && var44 >= var38 - 75 && var44 <= var38 + 75 && var34 >= var37 - 20 && var34 <= var37 + 20) {
									Login.Login_username = Login.Login_username.trim();
									if (Login.Login_username.length() == 0) {
										GameShell.setLoginResponseString("", "Please enter your username/email address.", "");
										return;
									}

									if (Login.Login_password.length() == 0) {
										GameShell.setLoginResponseString("", "Please enter your password.", "");
										return;
									}

									GameShell.setLoginResponseString("", "Connecting to server...", "");
									WorldMapDecoration.method380(false);
									WorldMapCacheName.updateGameState(20);
									return;
								}

								var38 = Login.loginBoxX + 180 + 80;
								if (var4 == 1 && var44 >= var38 - 75 && var44 <= var38 + 75 && var34 >= var37 - 20 && var34 <= var37 + 20) {
									Login.loginIndex = 0;
									Login.Login_username = "";
									Login.Login_password = "";
									WorldMapSection1.field313 = 0;
									SecureRandomCallable.otp = "";
									Login.field1200 = true;
								}

								var38 = Login.loginBoxCenter + -117;
								var37 = 277;
								Login.field1192 = var44 >= var38 && var44 < var38 + FriendSystem.field1071 && var34 >= var37 && var34 < var37 + Players.field1260;
								if (var4 == 1 && Login.field1192) {
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
									if (!Client.Login_isUsernameRemembered && Timer.clientPreferences.rememberedUsername != null) {
										Timer.clientPreferences.rememberedUsername = null;
										GrandExchangeOffer.savePreferences();
									}
								}

								var38 = Login.loginBoxCenter + 24;
								var37 = 277;
								Login.field1180 = var44 >= var38 && var44 < var38 + FriendSystem.field1071 && var34 >= var37 && var34 < var37 + Players.field1260;
								if (var4 == 1 && Login.field1180) {
									Timer.clientPreferences.hideUsername = !Timer.clientPreferences.hideUsername;
									if (!Timer.clientPreferences.hideUsername) {
										Login.Login_username = "";
										Timer.clientPreferences.rememberedUsername = null;
										Client.method1799();
									}

									GrandExchangeOffer.savePreferences();
								}

								while (true) {
									int var12;
									Transferable var27;
									do {
										while (true) {
											label1161:
											do {
												while (true) {
													while (GrandExchangeOfferNameComparator.isKeyDown()) {
														if (StudioGame.field3135 != 13) {
															if (Login.currentLoginField != 0) {
																continue label1161;
															}

															char var40 = WorldMapIcon_1.field200;

															for (var11 = 0; var11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var40 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var11); ++var11) {
															}

															if (StudioGame.field3135 == 85 && Login.Login_username.length() > 0) {
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (StudioGame.field3135 == 84 || StudioGame.field3135 == 80) {
																Login.currentLoginField = 1;
															}

															if (Interpreter.method1995(WorldMapIcon_1.field200) && Login.Login_username.length() < 320) {
																Login.Login_username = Login.Login_username + WorldMapIcon_1.field200;
															}
														} else {
															Login.loginIndex = 0;
															Login.Login_username = "";
															Login.Login_password = "";
															WorldMapSection1.field313 = 0;
															SecureRandomCallable.otp = "";
															Login.field1200 = true;
														}
													}

													return;
												}
											} while(Login.currentLoginField != 1);

											if (StudioGame.field3135 == 85 && Login.Login_password.length() > 0) {
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
											} else if (StudioGame.field3135 == 84 || StudioGame.field3135 == 80) {
												Login.currentLoginField = 0;
												if (StudioGame.field3135 == 84) {
													Login.Login_username = Login.Login_username.trim();
													if (Login.Login_username.length() == 0) {
														GameShell.setLoginResponseString("", "Please enter your username/email address.", "");
														return;
													}

													if (Login.Login_password.length() == 0) {
														GameShell.setLoginResponseString("", "Please enter your password.", "");
														return;
													}

													GameShell.setLoginResponseString("", "Connecting to server...", "");
													WorldMapDecoration.method380(false);
													WorldMapCacheName.updateGameState(20);
													return;
												}
											}

											if ((KeyHandler.KeyHandler_pressedKeys[82] || KeyHandler.KeyHandler_pressedKeys[87]) && StudioGame.field3135 == 67) {
												Clipboard var26 = Toolkit.getDefaultToolkit().getSystemClipboard();
												var27 = var26.getContents(WorldMapIcon_0.client);
												var12 = 20 - Login.Login_password.length();
												break;
											}

											char var41 = WorldMapIcon_1.field200;
											if ((var41 < ' ' || var41 >= 127) && (var41 <= 127 || var41 >= 160) && (var41 <= 160 || var41 > 255)) {
												label1364: {
													if (var41 != 0) {
														char[] var28 = class298.cp1252AsciiExtension;

														for (int var29 = 0; var29 < var28.length; ++var29) {
															char var14 = var28[var29];
															if (var14 == var41) {
																var39 = true;
																break label1364;
															}
														}
													}

													var39 = false;
												}
											} else {
												var39 = true;
											}

											if (var39 && Interpreter.method1995(WorldMapIcon_1.field200) && Login.Login_password.length() < 20) {
												Login.Login_password = Login.Login_password + WorldMapIcon_1.field200;
											}
										}
									} while(var12 <= 0);

									try {
										String var13 = (String)var27.getTransferData(DataFlavor.stringFlavor);
										int var43 = Math.min(var12, var13.length());

										for (int var15 = 0; var15 < var43; ++var15) {
											char var17 = var13.charAt(var15);
											boolean var16;
											if (var17 >= ' ' && var17 < 127 || var17 > 127 && var17 < 160 || var17 > 160 && var17 <= 255) {
												var16 = true;
											} else {
												label1378: {
													if (var17 != 0) {
														char[] var18 = class298.cp1252AsciiExtension;

														for (int var19 = 0; var19 < var18.length; ++var19) {
															char var20 = var18[var19];
															if (var17 == var20) {
																var16 = true;
																break label1378;
															}
														}
													}

													var16 = false;
												}
											}

											if (!var16 || !Interpreter.method1995(var13.charAt(var15))) {
												Login.loginIndex = 3;
												return;
											}
										}

										Login.Login_password = Login.Login_password + var13.substring(0, var43);
									} catch (UnsupportedFlavorException var31) {
									} catch (IOException var32) {
									}
								}
							} else if (Login.loginIndex == 3) {
								var35 = Login.loginBoxX + 180;
								var8 = 276;
								if (var4 == 1 && var44 >= var35 - 75 && var44 <= var35 + 75 && var34 >= var8 - 20 && var34 <= var8 + 20) {
									AbstractWorldMapIcon.Login_promptCredentials(false);
								}

								var35 = Login.loginBoxX + 180;
								var8 = 326;
								if (var4 == 1 && var44 >= var35 - 75 && var44 <= var35 + 75 && var34 >= var8 - 20 && var34 <= var8 + 20) {
									GameShell.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
									Login.loginIndex = 5;
									return;
								}
							} else {
								int var10;
								if (Login.loginIndex == 4) {
									var35 = Login.loginBoxX + 180 - 80;
									var8 = 321;
									if (var4 == 1 && var44 >= var35 - 75 && var44 <= var35 + 75 && var34 >= var8 - 20 && var34 <= var8 + 20) {
										SecureRandomCallable.otp.trim();
										if (SecureRandomCallable.otp.length() != 6) {
											GameShell.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
											return;
										}

										WorldMapSection1.field313 = Integer.parseInt(SecureRandomCallable.otp);
										SecureRandomCallable.otp = "";
										WorldMapDecoration.method380(true);
										GameShell.setLoginResponseString("", "Connecting to server...", "");
										WorldMapCacheName.updateGameState(20);
										return;
									}

									if (var4 == 1 && var44 >= Login.loginBoxX + 180 - 9 && var44 <= Login.loginBoxX + 180 + 130 && var34 >= 263 && var34 <= 296) {
										Login.field1200 = !Login.field1200;
									}

									if (var4 == 1 && var44 >= Login.loginBoxX + 180 - 34 && var44 <= Login.loginBoxX + 34 + 180 && var34 >= 351 && var34 <= 363) {
										AttackOption.openURL(AbstractWorldMapIcon.method632("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
									}

									var35 = Login.loginBoxX + 180 + 80;
									if (var4 == 1 && var44 >= var35 - 75 && var44 <= var35 + 75 && var34 >= var8 - 20 && var34 <= var8 + 20) {
										Login.loginIndex = 0;
										Login.Login_username = "";
										Login.Login_password = "";
										WorldMapSection1.field313 = 0;
										SecureRandomCallable.otp = "";
									}

									while (GrandExchangeOfferNameComparator.isKeyDown()) {
										boolean var9 = false;

										for (var10 = 0; var10 < "1234567890".length(); ++var10) {
											if (WorldMapIcon_1.field200 == "1234567890".charAt(var10)) {
												var9 = true;
												break;
											}
										}

										if (StudioGame.field3135 == 13) {
											Login.loginIndex = 0;
											Login.Login_username = "";
											Login.Login_password = "";
											WorldMapSection1.field313 = 0;
											SecureRandomCallable.otp = "";
										} else {
											if (StudioGame.field3135 == 85 && SecureRandomCallable.otp.length() > 0) {
												SecureRandomCallable.otp = SecureRandomCallable.otp.substring(0, SecureRandomCallable.otp.length() - 1);
											}

											if (StudioGame.field3135 == 84) {
												SecureRandomCallable.otp.trim();
												if (SecureRandomCallable.otp.length() != 6) {
													GameShell.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
													return;
												}

												WorldMapSection1.field313 = Integer.parseInt(SecureRandomCallable.otp);
												SecureRandomCallable.otp = "";
												WorldMapDecoration.method380(true);
												GameShell.setLoginResponseString("", "Connecting to server...", "");
												WorldMapCacheName.updateGameState(20);
												return;
											}

											if (var9 && SecureRandomCallable.otp.length() < 6) {
												SecureRandomCallable.otp = SecureRandomCallable.otp + WorldMapIcon_1.field200;
											}
										}
									}
								} else if (Login.loginIndex == 5) {
									var35 = Login.loginBoxX + 180 - 80;
									var8 = 321;
									if (var4 == 1 && var44 >= var35 - 75 && var44 <= var35 + 75 && var34 >= var8 - 20 && var34 <= var8 + 20) {
										class7.method83();
										return;
									}

									var35 = Login.loginBoxX + 180 + 80;
									if (var4 == 1 && var44 >= var35 - 75 && var44 <= var35 + 75 && var34 >= var8 - 20 && var34 <= var8 + 20) {
										AbstractWorldMapIcon.Login_promptCredentials(true);
									}

									var37 = 361;
									if (GrandExchangeOfferOwnWorldComparator.field643 != null) {
										var10 = GrandExchangeOfferOwnWorldComparator.field643.highX / 2;
										if (var4 == 1 && var44 >= GrandExchangeOfferOwnWorldComparator.field643.lowX - var10 && var44 <= var10 + GrandExchangeOfferOwnWorldComparator.field643.lowX && var34 >= var37 - 15 && var34 < var37) {
											AttackOption.openURL(AbstractWorldMapIcon.method632("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
										}
									}

									while (GrandExchangeOfferNameComparator.isKeyDown()) {
										var39 = false;

										for (var11 = 0; var11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var11) {
											if (WorldMapIcon_1.field200 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var11)) {
												var39 = true;
												break;
											}
										}

										if (StudioGame.field3135 == 13) {
											AbstractWorldMapIcon.Login_promptCredentials(true);
										} else {
											if (StudioGame.field3135 == 85 && Login.Login_username.length() > 0) {
												Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
											}

											if (StudioGame.field3135 == 84) {
												class7.method83();
												return;
											}

											if (var39 && Login.Login_username.length() < 320) {
												Login.Login_username = Login.Login_username + WorldMapIcon_1.field200;
											}
										}
									}
								} else if (Login.loginIndex != 6) {
									if (Login.loginIndex == 7) {
										var35 = Login.loginBoxX + 180 - 80;
										var8 = 321;
										if (var4 == 1 && var44 >= var35 - 75 && var44 <= var35 + 75 && var34 >= var8 - 20 && var34 <= var8 + 20) {
											AttackOption.openURL(AbstractWorldMapIcon.method632("secure", true) + "m=dob/set_dob.ws", true, false);
											GameShell.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											Login.loginIndex = 6;
											return;
										}

										var35 = Login.loginBoxX + 180 + 80;
										if (var4 == 1 && var44 >= var35 - 75 && var44 <= var35 + 75 && var34 >= var8 - 20 && var34 <= var8 + 20) {
											AbstractWorldMapIcon.Login_promptCredentials(true);
										}
									} else if (Login.loginIndex == 8) {
										var35 = Login.loginBoxX + 180 - 80;
										var8 = 321;
										if (var4 == 1 && var44 >= var35 - 75 && var44 <= var35 + 75 && var34 >= var8 - 20 && var34 <= var8 + 20) {
											AttackOption.openURL("https://www.jagex.com/terms/privacy", true, false);
											GameShell.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											Login.loginIndex = 6;
											return;
										}

										var35 = Login.loginBoxX + 180 + 80;
										if (var4 == 1 && var44 >= var35 - 75 && var44 <= var35 + 75 && var34 >= var8 - 20 && var34 <= var8 + 20) {
											AbstractWorldMapIcon.Login_promptCredentials(true);
										}
									} else if (Login.loginIndex == 12) {
										String var30 = "";
										switch(Login.field1199) {
										case 0:
											var30 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
											break;
										case 1:
											var30 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
											break;
										default:
											AbstractWorldMapIcon.Login_promptCredentials(false);
										}

										var38 = Login.loginBoxX + 180;
										var37 = 276;
										if (var4 == 1 && var44 >= var38 - 75 && var44 <= var38 + 75 && var34 >= var37 - 20 && var34 <= var37 + 20) {
											AttackOption.openURL(var30, true, false);
											GameShell.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											Login.loginIndex = 6;
											return;
										}

										var38 = Login.loginBoxX + 180;
										var37 = 326;
										if (var4 == 1 && var44 >= var38 - 75 && var44 <= var38 + 75 && var34 >= var37 - 20 && var34 <= var37 + 20) {
											AbstractWorldMapIcon.Login_promptCredentials(false);
										}
									} else if (Login.loginIndex == 24) {
										var35 = Login.loginBoxX + 180;
										var8 = 301;
										if (var4 == 1 && var44 >= var35 - 75 && var44 <= var35 + 75 && var34 >= var8 - 20 && var34 <= var8 + 20) {
											AbstractWorldMapIcon.Login_promptCredentials(false);
										}
									}
								} else {
									while (true) {
										do {
											if (!GrandExchangeOfferNameComparator.isKeyDown()) {
												var36 = 321;
												if (var4 == 1 && var34 >= var36 - 20 && var34 <= var36 + 20) {
													AbstractWorldMapIcon.Login_promptCredentials(true);
												}

												return;
											}
										} while(StudioGame.field3135 != 84 && StudioGame.field3135 != 13);

										AbstractWorldMapIcon.Login_promptCredentials(true);
									}
								}
							}
						}
					}

				}
			}
		}
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(Lhe;IIIIIII)V",
		garbageValue = "1825223582"
	)
	static final void method4797(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field692) {
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0;
		}

		Client.field692 = false;
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !UserComparator9.mouseCam && MouseHandler.MouseHandler_currentButton == 4) {
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
				var0.scrollY -= 4;
				CollisionMap.invalidateWidget(var0);
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
				var0.scrollY += 4;
				CollisionMap.invalidateWidget(var0);
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
				var7 = var3 * (var3 - 32) / var4;
				if (var7 < 8) {
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2;
				int var9 = var3 - 32 - var7;
				var0.scrollY = var8 * (var4 - var3) / var9;
				CollisionMap.invalidateWidget(var0);
				Client.field692 = true;
			}
		}

		if (Client.mouseWheelRotation != 0) {
			var7 = var0.width;
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
				var0.scrollY += Client.mouseWheelRotation * 45;
				CollisionMap.invalidateWidget(var0);
			}
		}

	}
}
