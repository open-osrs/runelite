import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fq")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("FloorOverlayDefinition_cached")
	static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -296019843
	)
	@Export("primaryRgb")
	public int primaryRgb;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1822468251
	)
	@Export("texture")
	public int texture;
	@ObfuscatedName("j")
	@Export("hideUnderlay")
	public boolean hideUnderlay;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1818252281
	)
	@Export("secondaryRgb")
	public int secondaryRgb;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 237098067
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1367639577
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1127074157
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1492871957
	)
	@Export("secondaryHue")
	public int secondaryHue;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 422172471
	)
	@Export("secondarySaturation")
	public int secondarySaturation;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 724805775
	)
	@Export("secondaryLightness")
	public int secondaryLightness;

	static {
		FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	FloorOverlayDefinition() {
		this.primaryRgb = 0; // L: 12
		this.texture = -1; // L: 13
		this.hideUnderlay = true; // L: 14
		this.secondaryRgb = -1; // L: 15
	} // L: 23

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1526666702"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.secondaryRgb != -1) { // L: 41
			this.setHsl(this.secondaryRgb); // L: 42
			this.secondaryHue = this.hue; // L: 43
			this.secondarySaturation = this.saturation; // L: 44
			this.secondaryLightness = this.lightness; // L: 45
		}

		this.setHsl(this.primaryRgb); // L: 47
	} // L: 48

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lnt;IB)V",
		garbageValue = "6"
	)
	@Export("decode")
	void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte(); // L: 52
			if (var3 == 0) { // L: 53
				return; // L: 56
			}

			this.decodeNext(var1, var3, var2); // L: 54
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lnt;III)V",
		garbageValue = "-608043176"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) { // L: 59
			this.primaryRgb = var1.readMedium();
		} else if (var2 == 2) { // L: 60
			this.texture = var1.readUnsignedByte();
		} else if (var2 == 5) { // L: 61
			this.hideUnderlay = false;
		} else if (var2 == 7) { // L: 62
			this.secondaryRgb = var1.readMedium();
		} else if (var2 == 8) { // L: 63
		}

	} // L: 65

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2117241812"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D; // L: 68
		double var4 = (double)(var1 >> 8 & 255) / 256.0D; // L: 69
		double var6 = (double)(var1 & 255) / 256.0D; // L: 70
		double var8 = var2; // L: 71
		if (var4 < var2) { // L: 72
			var8 = var4;
		}

		if (var6 < var8) { // L: 73
			var8 = var6;
		}

		double var10 = var2; // L: 74
		if (var4 > var2) { // L: 75
			var10 = var4;
		}

		if (var6 > var10) { // L: 76
			var10 = var6;
		}

		double var12 = 0.0D; // L: 77
		double var14 = 0.0D; // L: 78
		double var16 = (var10 + var8) / 2.0D; // L: 79
		if (var10 != var8) { // L: 80
			if (var16 < 0.5D) { // L: 81
				var14 = (var10 - var8) / (var10 + var8);
			}

			if (var16 >= 0.5D) { // L: 82
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var10 == var2) { // L: 83
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) { // L: 84
				var12 = 2.0D + (var6 - var2) / (var10 - var8);
			} else if (var10 == var6) {
				var12 = (var2 - var4) / (var10 - var8) + 4.0D; // L: 85
			}
		}

		var12 /= 6.0D; // L: 87
		this.hue = (int)(var12 * 256.0D); // L: 88
		this.saturation = (int)(var14 * 256.0D); // L: 89
		this.lightness = (int)(256.0D * var16); // L: 90
		if (this.saturation < 0) { // L: 91
			this.saturation = 0;
		} else if (this.saturation > 255) { // L: 92
			this.saturation = 255;
		}

		if (this.lightness < 0) { // L: 93
			this.lightness = 0;
		} else if (this.lightness > 255) { // L: 94
			this.lightness = 255;
		}

	} // L: 95

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1165486698"
	)
	static final void method3168() {
		Object var10000 = null; // L: 128
		String var0 = "You can't add yourself to your own friend list";
		UserComparator10.addGameMessage(30, "", var0); // L: 130
	} // L: 132

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(Liv;IIIB)V",
		garbageValue = "-1"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		class233.playPcmPlayers(); // L: 11313
		SpriteMask var4 = var0.getSpriteMask(false); // L: 11314
		if (var4 != null) { // L: 11315
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height); // L: 11316
			if (Client.minimapState != 2 && Client.minimapState != 5) { // L: 11317
				int var5 = Client.camAngleY & 2047; // L: 11318
				int var6 = class262.localPlayer.x / 32 + 48; // L: 11319
				int var7 = 464 - class262.localPlayer.y / 32; // L: 11320
				class69.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths); // L: 11321

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) { // L: 11322
					var16 = Client.mapIconXs[var8] * 4 + 2 - class262.localPlayer.x / 32; // L: 11323
					var10 = Client.mapIconYs[var8] * 4 + 2 - class262.localPlayer.y / 32; // L: 11324
					class32.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4); // L: 11325
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) { // L: 11327
					for (var16 = 0; var16 < 104; ++var16) { // L: 11328
						NodeDeque var14 = Client.groundItems[SoundSystem.Client_plane][var8][var16]; // L: 11329
						if (var14 != null) { // L: 11330
							var11 = var8 * 4 + 2 - class262.localPlayer.x / 32; // L: 11331
							var12 = var16 * 4 + 2 - class262.localPlayer.y / 32; // L: 11332
							class32.drawSpriteOnMinimap(var1, var2, var11, var12, class171.mapDotSprites[0], var4); // L: 11333
						}
					}
				}

				for (var8 = 0; var8 < Client.npcCount; ++var8) { // L: 11337
					NPC var9 = Client.npcs[Client.npcIndices[var8]]; // L: 11338
					if (var9 != null && var9.isVisible()) { // L: 11339
						NPCComposition var18 = var9.definition; // L: 11340
						if (var18 != null && var18.transforms != null) { // L: 11341
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) { // L: 11342
							var11 = var9.x / 32 - class262.localPlayer.x / 32; // L: 11343
							var12 = var9.y / 32 - class262.localPlayer.y / 32; // L: 11344
							class32.drawSpriteOnMinimap(var1, var2, var11, var12, class171.mapDotSprites[1], var4); // L: 11345
						}
					}
				}

				var8 = Players.Players_count; // L: 11349
				int[] var17 = Players.Players_indices; // L: 11350

				for (var10 = 0; var10 < var8; ++var10) { // L: 11351
					Player var15 = Client.players[var17[var10]]; // L: 11352
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != class262.localPlayer) { // L: 11353
						var12 = var15.x / 32 - class262.localPlayer.x / 32; // L: 11354
						int var13 = var15.y / 32 - class262.localPlayer.y / 32; // L: 11355
						if (var15.isFriend()) { // L: 11356
							class32.drawSpriteOnMinimap(var1, var2, var12, var13, class171.mapDotSprites[3], var4);
						} else if (class262.localPlayer.team != 0 && var15.team != 0 && var15.team == class262.localPlayer.team) { // L: 11357
							class32.drawSpriteOnMinimap(var1, var2, var12, var13, class171.mapDotSprites[4], var4);
						} else if (var15.isFriendsChatMember()) { // L: 11358
							class32.drawSpriteOnMinimap(var1, var2, var12, var13, class171.mapDotSprites[5], var4);
						} else if (var15.isClanMember()) { // L: 11359
							class32.drawSpriteOnMinimap(var1, var2, var12, var13, class171.mapDotSprites[6], var4);
						} else {
							class32.drawSpriteOnMinimap(var1, var2, var12, var13, class171.mapDotSprites[2], var4); // L: 11360
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) { // L: 11363
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) { // L: 11364
						NPC var19 = Client.npcs[Client.hintArrowNpcIndex]; // L: 11365
						if (var19 != null) { // L: 11366
							var11 = var19.x / 32 - class262.localPlayer.x / 32; // L: 11367
							var12 = var19.y / 32 - class262.localPlayer.y / 32; // L: 11368
							SoundSystem.worldToMinimap(var1, var2, var11, var12, BuddyRankComparator.mapMarkerSprites[1], var4); // L: 11369
						}
					}

					if (Client.hintArrowType == 2) { // L: 11372
						var10 = Client.hintArrowX * 4 - class15.baseX * 4 + 2 - class262.localPlayer.x / 32; // L: 11373
						var11 = Client.hintArrowY * 4 - WorldMapSprite.baseY * 4 + 2 - class262.localPlayer.y / 32; // L: 11374
						SoundSystem.worldToMinimap(var1, var2, var10, var11, BuddyRankComparator.mapMarkerSprites[1], var4); // L: 11375
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) { // L: 11377
						Player var20 = Client.players[Client.hintArrowPlayerIndex]; // L: 11378
						if (var20 != null) { // L: 11379
							var11 = var20.x / 32 - class262.localPlayer.x / 32; // L: 11380
							var12 = var20.y / 32 - class262.localPlayer.y / 32; // L: 11381
							SoundSystem.worldToMinimap(var1, var2, var11, var12, BuddyRankComparator.mapMarkerSprites[1], var4); // L: 11382
						}
					}
				}

				if (Client.destinationX != 0) { // L: 11386
					var10 = Client.destinationX * 4 + 2 - class262.localPlayer.x / 32; // L: 11387
					var11 = Client.destinationY * 4 + 2 - class262.localPlayer.y / 32; // L: 11388
					class32.drawSpriteOnMinimap(var1, var2, var10, var11, BuddyRankComparator.mapMarkerSprites[0], var4); // L: 11389
				}

				if (!class262.localPlayer.isHidden) { // L: 11391
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 11393
			}

			Client.field712[var3] = true; // L: 11394
		}
	} // L: 11395
}
