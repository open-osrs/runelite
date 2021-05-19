import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
@Implements("WorldMapData_1")
public class WorldMapData_1 extends AbstractWorldMapData {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1775718547
	)
	@Export("chunkXLow")
	int chunkXLow;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -718044551
	)
	@Export("chunkYLow")
	int chunkYLow;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1865335047
	)
	@Export("chunkX")
	int chunkX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -315592319
	)
	@Export("chunkY")
	int chunkY;

	WorldMapData_1() {
	} // L: 11

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "-2112962647"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 14
		if (var2 != WorldMapID.field2100.value) { // L: 15
			throw new IllegalStateException(""); // L: 16
		} else {
			super.minPlane = var1.readUnsignedByte(); // L: 18
			super.planes = var1.readUnsignedByte(); // L: 19
			super.regionXLow = var1.readUnsignedShort(); // L: 20
			super.regionYLow = var1.readUnsignedShort(); // L: 21
			this.chunkXLow = var1.readUnsignedByte(); // L: 22
			this.chunkYLow = var1.readUnsignedByte(); // L: 23
			super.regionX = var1.readUnsignedShort(); // L: 24
			super.regionY = var1.readUnsignedShort(); // L: 25
			this.chunkX = var1.readUnsignedByte(); // L: 26
			this.chunkY = var1.readUnsignedByte(); // L: 27
			super.groupId = var1.method6464(); // L: 28
			super.fileId = var1.method6464(); // L: 29
		}
	} // L: 30

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "1915938242"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4); // L: 33
		super.floorUnderlayIds = new short[1][64][64]; // L: 34
		super.floorOverlayIds = new short[super.planes][64][64]; // L: 35
		super.field2063 = new byte[super.planes][64][64]; // L: 36
		super.field2064 = new byte[super.planes][64][64]; // L: 37
		super.decorations = new WorldMapDecoration[super.planes][64][64][]; // L: 38
		int var2 = var1.readUnsignedByte(); // L: 39
		if (var2 != class179.field2094.value) { // L: 40
			throw new IllegalStateException(""); // L: 41
		} else {
			int var3 = var1.readUnsignedByte(); // L: 43
			int var4 = var1.readUnsignedByte(); // L: 44
			int var5 = var1.readUnsignedByte(); // L: 45
			int var6 = var1.readUnsignedByte(); // L: 46
			if (var3 == super.regionX && var4 == super.regionY && var5 == this.chunkX && var6 == this.chunkY) { // L: 47
				for (int var7 = 0; var7 < 8; ++var7) { // L: 50
					for (int var8 = 0; var8 < 8; ++var8) { // L: 51
						this.readTile(var7 + this.chunkX * 8, var8 + this.chunkY * 8, var1); // L: 52
					}
				}

			} else {
				throw new IllegalStateException(""); // L: 48
			}
		}
	} // L: 55

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("getChunkXLow")
	int getChunkXLow() {
		return this.chunkXLow; // L: 73
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1280673749"
	)
	@Export("getChunkYLow")
	int getChunkYLow() {
		return this.chunkYLow; // L: 77
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2133417372"
	)
	@Export("getChunkX")
	int getChunkX() {
		return this.chunkX; // L: 81
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-236575937"
	)
	@Export("getChunkY")
	int getChunkY() {
		return this.chunkY; // L: 85
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_1)) { // L: 58
			return false; // L: 59
		} else {
			WorldMapData_1 var2 = (WorldMapData_1)var1; // L: 61
			if (var2.regionX == super.regionX && var2.regionY == super.regionY) { // L: 62
				return var2.chunkX == this.chunkX && var2.chunkY == this.chunkY; // L: 65
			} else {
				return false; // L: 63
			}
		}
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8 | this.chunkX << 16 | this.chunkY << 24; // L: 69
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(Liv;IIIB)V",
		garbageValue = "68"
	)
	@Export("drawCompass")
	static final void drawCompass(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.getSpriteMask(false); // L: 11465
		if (var4 != null) { // L: 11466
			if (Client.minimapState < 3) { // L: 11467
				WorldMapRegion.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 11468
			}

		}
	} // L: 11469
}
