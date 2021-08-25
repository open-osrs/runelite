import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bu")
@Implements("GraphicsObject")
public final class GraphicsObject extends Renderable {
	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "[Loc;"
	)
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSprites;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 787410799
	)
	@Export("id")
	int id;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1229158723
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -607075051
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -554255129
	)
	@Export("x")
	int x;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1557602107
	)
	@Export("y")
	int y;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 556318843
	)
	@Export("height")
	int height;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -492546341
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 296318011
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("e")
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
		int var8 = TaskHandler.SpotAnimationDefinition_get(this.id).sequence;
		if (var8 != -1) {
			this.isFinished = false;
			this.sequenceDefinition = class17.SequenceDefinition_get(var8);
		} else {
			this.isFinished = true;
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1654884246"
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Lhg;",
		garbageValue = "18"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = TaskHandler.SpotAnimationDefinition_get(this.id);
		Model var2;
		if (!this.isFinished) {
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1);
		}

		return var2 == null ? null : var2;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IILfw;Lfk;I)Z",
		garbageValue = "1454497759"
	)
	static final boolean method1869(int var0, int var1, RouteStrategy var2, CollisionMap var3) {
		int var4 = var0;
		int var5 = var1;
		byte var6 = 64;
		byte var7 = 64;
		int var8 = var0 - var6;
		int var9 = var1 - var7;
		class174.directions[var6][var7] = 99;
		class174.distances[var6][var7] = 0;
		byte var10 = 0;
		int var11 = 0;
		class174.bufferX[var10] = var0;
		byte var10001 = var10;
		int var18 = var10 + 1;
		class174.bufferY[var10001] = var1;
		int[][] var12 = var3.flags;

		while (var11 != var18) {
			var4 = class174.bufferX[var11];
			var5 = class174.bufferY[var11];
			var11 = var11 + 1 & 4095;
			int var16 = var4 - var8;
			int var17 = var5 - var9;
			int var13 = var4 - var3.xInset;
			int var14 = var5 - var3.yInset;
			if (var2.hasArrived(1, var4, var5, var3)) {
				class150.field1601 = var4;
				class174.field1991 = var5;
				return true;
			}

			int var15 = class174.distances[var16][var17] + 1;
			if (var16 > 0 && class174.directions[var16 - 1][var17] == 0 && (var12[var13 - 1][var14] & 19136776) == 0) {
				class174.bufferX[var18] = var4 - 1;
				class174.bufferY[var18] = var5;
				var18 = var18 + 1 & 4095;
				class174.directions[var16 - 1][var17] = 2;
				class174.distances[var16 - 1][var17] = var15;
			}

			if (var16 < 127 && class174.directions[var16 + 1][var17] == 0 && (var12[var13 + 1][var14] & 19136896) == 0) {
				class174.bufferX[var18] = var4 + 1;
				class174.bufferY[var18] = var5;
				var18 = var18 + 1 & 4095;
				class174.directions[var16 + 1][var17] = 8;
				class174.distances[var16 + 1][var17] = var15;
			}

			if (var17 > 0 && class174.directions[var16][var17 - 1] == 0 && (var12[var13][var14 - 1] & 19136770) == 0) {
				class174.bufferX[var18] = var4;
				class174.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class174.directions[var16][var17 - 1] = 1;
				class174.distances[var16][var17 - 1] = var15;
			}

			if (var17 < 127 && class174.directions[var16][var17 + 1] == 0 && (var12[var13][var14 + 1] & 19136800) == 0) {
				class174.bufferX[var18] = var4;
				class174.bufferY[var18] = var5 + 1;
				var18 = var18 + 1 & 4095;
				class174.directions[var16][var17 + 1] = 4;
				class174.distances[var16][var17 + 1] = var15;
			}

			if (var16 > 0 && var17 > 0 && class174.directions[var16 - 1][var17 - 1] == 0 && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13 - 1][var14] & 19136776) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) {
				class174.bufferX[var18] = var4 - 1;
				class174.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class174.directions[var16 - 1][var17 - 1] = 3;
				class174.distances[var16 - 1][var17 - 1] = var15;
			}

			if (var16 < 127 && var17 > 0 && class174.directions[var16 + 1][var17 - 1] == 0 && (var12[var13 + 1][var14 - 1] & 19136899) == 0 && (var12[var13 + 1][var14] & 19136896) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) {
				class174.bufferX[var18] = var4 + 1;
				class174.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class174.directions[var16 + 1][var17 - 1] = 9;
				class174.distances[var16 + 1][var17 - 1] = var15;
			}

			if (var16 > 0 && var17 < 127 && class174.directions[var16 - 1][var17 + 1] == 0 && (var12[var13 - 1][var14 + 1] & 19136824) == 0 && (var12[var13 - 1][var14] & 19136776) == 0 && (var12[var13][var14 + 1] & 19136800) == 0) {
				class174.bufferX[var18] = var4 - 1;
				class174.bufferY[var18] = var5 + 1;
				var18 = var18 + 1 & 4095;
				class174.directions[var16 - 1][var17 + 1] = 6;
				class174.distances[var16 - 1][var17 + 1] = var15;
			}

			if (var16 < 127 && var17 < 127 && class174.directions[var16 + 1][var17 + 1] == 0 && (var12[var13 + 1][var14 + 1] & 19136992) == 0 && (var12[var13 + 1][var14] & 19136896) == 0 && (var12[var13][var14 + 1] & 19136800) == 0) {
				class174.bufferX[var18] = var4 + 1;
				class174.bufferY[var18] = var5 + 1;
				var18 = var18 + 1 & 4095;
				class174.directions[var16 + 1][var17 + 1] = 12;
				class174.distances[var16 + 1][var17 + 1] = var15;
			}
		}

		class150.field1601 = var4;
		class174.field1991 = var5;
		return false;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1937587259"
	)
	public static boolean method1871(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.field125[var0] : false;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "-380670823"
	)
	public static String method1866(CharSequence var0) {
		int var2 = var0.length();
		char[] var3 = new char[var2];

		for (int var4 = 0; var4 < var2; ++var4) {
			var3[var4] = '*';
		}

		String var1 = new String(var3);
		return var1;
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "35"
	)
	@Export("getTileHeight")
	static final int getTileHeight(int var0, int var1, int var2) {
		int var3 = var0 >> 7;
		int var4 = var1 >> 7;
		if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) {
			int var5 = var2;
			if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) {
				var5 = var2 + 1;
			}

			int var6 = var0 & 127;
			int var7 = var1 & 127;
			int var8 = (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] + Tiles.Tiles_heights[var5][var3 + 1][var4] * var6 >> 7;
			int var9 = var6 * Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] + Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) >> 7;
			return var7 * var9 + var8 * (128 - var7) >> 7;
		} else {
			return 0;
		}
	}
}
