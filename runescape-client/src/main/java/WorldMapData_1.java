import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
@Implements("WorldMapData_1")
public class WorldMapData_1 extends AbstractWorldMapData {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1425976559
	)
	@Export("chunkXLow")
	int chunkXLow;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -2120583625
	)
	@Export("chunkYLow")
	int chunkYLow;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 2142213525
	)
	@Export("chunkX")
	int chunkX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1279659529
	)
	@Export("chunkY")
	int chunkY;

	WorldMapData_1() {
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-384501977"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 != WorldMapID.field2174.value) {
			throw new IllegalStateException("");
		} else {
			super.minPlane = var1.readUnsignedByte();
			super.planes = var1.readUnsignedByte();
			super.regionXLow = var1.readUnsignedShort();
			super.regionYLow = var1.readUnsignedShort();
			this.chunkXLow = var1.readUnsignedByte();
			this.chunkYLow = var1.readUnsignedByte();
			super.regionX = var1.readUnsignedShort();
			super.regionY = var1.readUnsignedShort();
			this.chunkX = var1.readUnsignedByte();
			this.chunkY = var1.readUnsignedByte();
			super.groupId = var1.method6985();
			super.fileId = var1.method6985();
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lot;B)V",
		garbageValue = "2"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4);
		super.floorUnderlayIds = new short[1][64][64];
		super.floorOverlayIds = new short[super.planes][64][64];
		super.field2143 = new byte[super.planes][64][64];
		super.field2144 = new byte[super.planes][64][64];
		super.decorations = new WorldMapDecoration[super.planes][64][64][];
		int var2 = var1.readUnsignedByte();
		if (var2 != class194.field2169.value) {
			throw new IllegalStateException("");
		} else {
			int var3 = var1.readUnsignedByte();
			int var4 = var1.readUnsignedByte();
			int var5 = var1.readUnsignedByte();
			int var6 = var1.readUnsignedByte();
			if (var3 == super.regionX && var4 == super.regionY && var5 == this.chunkX && var6 == this.chunkY) {
				for (int var7 = 0; var7 < 8; ++var7) {
					for (int var8 = 0; var8 < 8; ++var8) {
						this.readTile(var7 + this.chunkX * 8, var8 + this.chunkY * 8, var1);
					}
				}

			} else {
				throw new IllegalStateException("");
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1045105786"
	)
	@Export("getChunkXLow")
	int getChunkXLow() {
		return this.chunkXLow;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1806403043"
	)
	@Export("getChunkYLow")
	int getChunkYLow() {
		return this.chunkYLow;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-36"
	)
	@Export("getChunkX")
	int getChunkX() {
		return this.chunkX;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1677490500"
	)
	@Export("getChunkY")
	int getChunkY() {
		return this.chunkY;
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8 | this.chunkX << 16 | this.chunkY << 24;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_1)) {
			return false;
		} else {
			WorldMapData_1 var2 = (WorldMapData_1)var1;
			if (super.regionX == var2.regionX && super.regionY == var2.regionY) {
				return this.chunkX == var2.chunkX && var2.chunkY == this.chunkY;
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "838418623"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) {
			byte var2 = 4;
			int var3 = var2 + 6;
			int var4 = var2 + 6;
			int var5 = class129.fontPlain12.lineWidth(var0, 250);
			int var6 = class129.fontPlain12.lineCount(var0, 250) * 13;
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var2 + var2 + var5, var6 + var2 + var2, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var2 + var2 + var5, var6 + var2 + var2, 16777215);
			class129.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
			int var7 = var3 - var2;
			int var8 = var4 - var2;
			int var9 = var2 + var2 + var5;
			int var10 = var6 + var2 + var2;

			int var11;
			for (var11 = 0; var11 < Client.rootWidgetCount; ++var11) {
				if (Client.rootWidgetXs[var11] + Client.rootWidgetWidths[var11] > var7 && Client.rootWidgetXs[var11] < var9 + var7 && Client.rootWidgetYs[var11] + Client.rootWidgetHeights[var11] > var8 && Client.rootWidgetYs[var11] < var10 + var8) {
					Client.field697[var11] = true;
				}
			}

			if (var1) {
				class11.rasterProvider.drawFull(0, 0);
			} else {
				var11 = var3;
				int var12 = var4;
				int var13 = var5;
				int var14 = var6;

				for (int var15 = 0; var15 < Client.rootWidgetCount; ++var15) {
					if (Client.rootWidgetWidths[var15] + Client.rootWidgetXs[var15] > var11 && Client.rootWidgetXs[var15] < var11 + var13 && Client.rootWidgetYs[var15] + Client.rootWidgetHeights[var15] > var12 && Client.rootWidgetYs[var15] < var14 + var12) {
						Client.field766[var15] = true;
					}
				}
			}

		}
	}
}
