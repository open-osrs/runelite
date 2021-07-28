import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aw")
@Implements("GraphicsObject")
public final class GraphicsObject extends Renderable {
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	@Export("loginType")
	static LoginType loginType;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "[Lof;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;
	@ObfuscatedName("ld")
	@ObfuscatedGetter(
		intValue = 632390903
	)
	@Export("menuHeight")
	static int menuHeight;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -962046693
	)
	@Export("id")
	int id;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 764906277
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -2015841491
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -239549733
	)
	@Export("x")
	int x;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -800969311
	)
	@Export("y")
	int y;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1195317417
	)
	@Export("height")
	int height;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1468887815
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -692732741
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("x")
	@Export("isFinished")
	boolean isFinished;

	GraphicsObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.frame = 0;
		this.frameCycle = 0;
		this.isFinished = false;
		this.id = var1;
		this.plane = var2;
		this.x = var3;
		this.y = var4;
		this.height = var5;
		this.cycleStart = var7 + var6;
		int var8 = PcmPlayer.SpotAnimationDefinition_get(this.id).sequence;
		if (var8 != -1) {
			this.isFinished = false;
			this.sequenceDefinition = World.SequenceDefinition_get(var8);
		} else {
			this.isFinished = true;
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1996698154"
	)
	@Export("advance")
	final void advance(int var1) {
		if (!this.isFinished) {
			this.frameCycle += var1;

			while (this.frameCycle > this.sequenceDefinition.frameLengths[this.frame]) {
				this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame];
				++this.frame;
				if (this.frame >= this.sequenceDefinition.frameIds.length) {
					this.isFinished = true;
					break;
				}
			}

		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Lgl;",
		garbageValue = "1291603774"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = PcmPlayer.SpotAnimationDefinition_get(this.id);
		Model var2;
		if (!this.isFinished) {
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1);
		}

		return var2 == null ? null : var2;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)Leb;",
		garbageValue = "315871348"
	)
	public static HealthBarDefinition method1647(int var0) {
		HealthBarDefinition var1 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = DevicePcmPlayerProvider.HealthBarDefinition_archive.takeFile(33, var0);
			var1 = new HealthBarDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;ZB)Z",
		garbageValue = "-45"
	)
	static boolean method1645(File var0, boolean var1) {
		try {
			RandomAccessFile var2 = new RandomAccessFile(var0, "rw");
			int var3 = var2.read();
			var2.seek(0L);
			var2.write(var3);
			var2.seek(0L);
			var2.close();
			return true;
		} catch (Exception var4) {
			return false;
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lkt;Lkt;I)V",
		garbageValue = "2107200471"
	)
	static void method1646(Font var0, Font var1) {
		if (WorldMapAreaData.worldSelectBackSprites == null) {
			WorldMapAreaData.worldSelectBackSprites = ChatChannel.method1735(class270.archive8, "sl_back", "");
		}

		IndexedSprite[] var2;
		Archive var3;
		int var4;
		int var5;
		if (worldSelectFlagSprites == null) {
			var3 = class270.archive8;
			var4 = var3.getGroupId("sl_flags");
			var5 = var3.getFileId(var4, "");
			var2 = FileSystem.method2628(var3, var4, var5);
			worldSelectFlagSprites = var2;
		}

		if (ApproximateRouteStrategy.worldSelectArrows == null) {
			var3 = class270.archive8;
			var4 = var3.getGroupId("sl_arrows");
			var5 = var3.getFileId(var4, "");
			var2 = FileSystem.method2628(var3, var4, var5);
			ApproximateRouteStrategy.worldSelectArrows = var2;
		}

		if (ChatChannel.worldSelectStars == null) {
			var3 = class270.archive8;
			var4 = var3.getGroupId("sl_stars");
			var5 = var3.getFileId(var4, "");
			var2 = FileSystem.method2628(var3, var4, var5);
			ChatChannel.worldSelectStars = var2;
		}

		if (class137.worldSelectLeftSprite == null) {
			class137.worldSelectLeftSprite = class117.SpriteBuffer_getIndexedSpriteByName(class270.archive8, "leftarrow", "");
		}

		if (BuddyRankComparator.worldSelectRightSprite == null) {
			BuddyRankComparator.worldSelectRightSprite = class117.SpriteBuffer_getIndexedSpriteByName(class270.archive8, "rightarrow", "");
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513);
		var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
		if (ChatChannel.worldSelectStars != null) {
			ChatChannel.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
			var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1);
			ChatChannel.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
			var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1);
		}

		if (ApproximateRouteStrategy.worldSelectArrows != null) {
			int var22 = Login.xPadding + 280;
			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
				ApproximateRouteStrategy.worldSelectArrows[2].drawAt(var22, 4);
			} else {
				ApproximateRouteStrategy.worldSelectArrows[0].drawAt(var22, 4);
			}

			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) {
				ApproximateRouteStrategy.worldSelectArrows[3].drawAt(var22 + 15, 4);
			} else {
				ApproximateRouteStrategy.worldSelectArrows[1].drawAt(var22 + 15, 4);
			}

			var0.draw("World", var22 + 32, 17, 16777215, -1);
			int var23 = Login.xPadding + 390;
			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) {
				ApproximateRouteStrategy.worldSelectArrows[2].drawAt(var23, 4);
			} else {
				ApproximateRouteStrategy.worldSelectArrows[0].drawAt(var23, 4);
			}

			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) {
				ApproximateRouteStrategy.worldSelectArrows[3].drawAt(var23 + 15, 4);
			} else {
				ApproximateRouteStrategy.worldSelectArrows[1].drawAt(var23 + 15, 4);
			}

			var0.draw("Players", var23 + 32, 17, 16777215, -1);
			var4 = Login.xPadding + 500;
			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) {
				ApproximateRouteStrategy.worldSelectArrows[2].drawAt(var4, 4);
			} else {
				ApproximateRouteStrategy.worldSelectArrows[0].drawAt(var4, 4);
			}

			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
				ApproximateRouteStrategy.worldSelectArrows[3].drawAt(var4 + 15, 4);
			} else {
				ApproximateRouteStrategy.worldSelectArrows[1].drawAt(var4 + 15, 4);
			}

			var0.draw("Location", var4 + 32, 17, 16777215, -1);
			var5 = Login.xPadding + 610;
			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
				ApproximateRouteStrategy.worldSelectArrows[2].drawAt(var5, 4);
			} else {
				ApproximateRouteStrategy.worldSelectArrows[0].drawAt(var5, 4);
			}

			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) {
				ApproximateRouteStrategy.worldSelectArrows[3].drawAt(var5 + 15, 4);
			} else {
				ApproximateRouteStrategy.worldSelectArrows[1].drawAt(var5 + 15, 4);
			}

			var0.draw("Type", var5 + 32, 17, 16777215, -1);
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
		var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1);
		Login.hoveredWorldIndex = -1;
		if (WorldMapAreaData.worldSelectBackSprites != null) {
			byte var26 = 88;
			byte var27 = 19;
			var4 = 765 / (var26 + 1) - 1;
			var5 = 480 / (var27 + 1);

			int var6;
			int var7;
			do {
				var6 = var5;
				var7 = var4;
				if (var5 * (var4 - 1) >= World.World_count) {
					--var4;
				}

				if (var4 * (var5 - 1) >= World.World_count) {
					--var5;
				}

				if (var4 * (var5 - 1) >= World.World_count) {
					--var5;
				}
			} while(var5 != var6 || var4 != var7);

			var6 = (765 - var26 * var4) / (var4 + 1);
			if (var6 > 5) {
				var6 = 5;
			}

			var7 = (480 - var27 * var5) / (var5 + 1);
			if (var7 > 5) {
				var7 = 5;
			}

			int var8 = (765 - var26 * var4 - var6 * (var4 - 1)) / 2;
			int var9 = (480 - var5 * var27 - var7 * (var5 - 1)) / 2;
			int var10 = (var5 + World.World_count - 1) / var5;
			Login.worldSelectPagesCount = var10 - var4;
			if (class137.worldSelectLeftSprite != null && Login.worldSelectPage > 0) {
				class137.worldSelectLeftSprite.drawAt(8, Client.canvasHeight / 2 - class137.worldSelectLeftSprite.subHeight / 2);
			}

			if (BuddyRankComparator.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) {
				BuddyRankComparator.worldSelectRightSprite.drawAt(MouseRecorder.canvasWidth - BuddyRankComparator.worldSelectRightSprite.subWidth - 8, Client.canvasHeight / 2 - BuddyRankComparator.worldSelectRightSprite.subHeight / 2);
			}

			int var11 = var9 + 23;
			int var12 = var8 + Login.xPadding;
			int var13 = 0;
			boolean var14 = false;
			int var15 = Login.worldSelectPage;

			int var16;
			for (var16 = var5 * var15; var16 < World.World_count && var15 - Login.worldSelectPage < var4; ++var16) {
				World var17 = class15.World_worlds[var16];
				boolean var18 = true;
				String var19 = Integer.toString(var17.population);
				if (var17.population == -1) {
					var19 = "OFF";
					var18 = false;
				} else if (var17.population > 1980) {
					var19 = "FULL";
					var18 = false;
				}

				int var21 = 0;
				byte var20;
				if (var17.isBeta()) {
					if (var17.isMembersOnly()) {
						var20 = 7;
					} else {
						var20 = 6;
					}
				} else if (var17.isDeadman()) {
					var21 = 16711680;
					if (var17.isMembersOnly()) {
						var20 = 5;
					} else {
						var20 = 4;
					}
				} else if (var17.method1408()) {
					if (var17.isMembersOnly()) {
						var20 = 9;
					} else {
						var20 = 8;
					}
				} else if (var17.isPvp()) {
					if (var17.isMembersOnly()) {
						var20 = 3;
					} else {
						var20 = 2;
					}
				} else if (var17.isMembersOnly()) {
					var20 = 1;
				} else {
					var20 = 0;
				}

				if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var11 && MouseHandler.MouseHandler_x < var12 + var26 && MouseHandler.MouseHandler_y < var27 + var11 && var18) {
					Login.hoveredWorldIndex = var16;
					WorldMapAreaData.worldSelectBackSprites[var20].drawTransOverlayAt(var12, var11, 128, 16777215);
					var14 = true;
				} else {
					WorldMapAreaData.worldSelectBackSprites[var20].drawAt(var12, var11);
				}

				if (worldSelectFlagSprites != null) {
					worldSelectFlagSprites[(var17.isMembersOnly() ? 8 : 0) + var17.location].drawAt(var12 + 29, var11);
				}

				var0.drawCentered(Integer.toString(var17.id), var12 + 15, var27 / 2 + var11 + 5, var21, -1);
				var1.drawCentered(var19, var12 + 60, var27 / 2 + var11 + 5, 268435455, -1);
				var11 = var11 + var27 + var7;
				++var13;
				if (var13 >= var5) {
					var11 = var9 + 23;
					var12 = var12 + var6 + var26;
					var13 = 0;
					++var15;
				}
			}

			if (var14) {
				var16 = var1.stringWidth(class15.World_worlds[Login.hoveredWorldIndex].activity) + 6;
				int var24 = var1.ascent + 8;
				int var25 = MouseHandler.MouseHandler_y + 25;
				if (var24 + var25 > 480) {
					var25 = MouseHandler.MouseHandler_y - 25 - var24;
				}

				Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var24, 16777120);
				Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var24, 0);
				var1.drawCentered(class15.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var25 + var1.ascent + 4, 0, -1);
			}
		}

		class263.rasterProvider.drawFull(0, 0);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1426148283"
	)
	static final int method1638(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}
}
