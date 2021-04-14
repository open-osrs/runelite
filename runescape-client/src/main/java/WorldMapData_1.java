import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
@Implements("WorldMapData_1")
public class WorldMapData_1 extends AbstractWorldMapData {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1430426623
	)
	@Export("chunkXLow")
	int chunkXLow;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1788634945
	)
	@Export("chunkYLow")
	int chunkYLow;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 109249363
	)
	@Export("chunkX")
	int chunkX;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1024482067
	)
	@Export("chunkY")
	int chunkY;

	WorldMapData_1() {
	} // L: 11

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "370119865"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 14
		if (var2 != WorldMapID.field1744.value) { // L: 15
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
			super.groupId = var1.method6597(); // L: 28
			super.fileId = var1.method6597(); // L: 29
		}
	} // L: 30

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "-930076916"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4); // L: 33
		super.floorUnderlayIds = new short[1][64][64]; // L: 34
		super.floorOverlayIds = new short[super.planes][64][64]; // L: 35
		super.field1690 = new byte[super.planes][64][64]; // L: 36
		super.field1700 = new byte[super.planes][64][64]; // L: 37
		super.decorations = new WorldMapDecoration[super.planes][64][64][]; // L: 38
		int var2 = var1.readUnsignedByte(); // L: 39
		if (var2 != class157.field1733.value) { // L: 40
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "28"
	)
	@Export("getChunkXLow")
	int getChunkXLow() {
		return this.chunkXLow; // L: 73
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1048633905"
	)
	@Export("getChunkYLow")
	int getChunkYLow() {
		return this.chunkYLow; // L: 77
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "3"
	)
	@Export("getChunkX")
	int getChunkX() {
		return this.chunkX; // L: 81
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	@Export("getChunkY")
	int getChunkY() {
		return this.chunkY; // L: 85
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8 | this.chunkX << 16 | this.chunkY << 24; // L: 69
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_1)) { // L: 58
			return false; // L: 59
		} else {
			WorldMapData_1 var2 = (WorldMapData_1)var1; // L: 61
			if (super.regionX == var2.regionX && super.regionY == var2.regionY) { // L: 62
				return var2.chunkX == this.chunkX && var2.chunkY == this.chunkY; // L: 65
			} else {
				return false; // L: 63
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lnu;IIIIIIB)V",
		garbageValue = "117"
	)
	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) { // L: 138
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 139

			while (true) {
				var7 = var0.readUnsignedByte(); // L: 141
				if (var7 == 0) { // L: 142
					if (var1 == 0) {
						Tiles.Tiles_heights[0][var2][var3] = -class148.method3015(var4 + var2 + 932731, var5 + var3 + 556238) * 8; // L: 143
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240; // L: 144
					}
					break;
				}

				if (var7 == 1) { // L: 147
					int var8 = var0.readUnsignedByte(); // L: 148
					if (var8 == 1) { // L: 149
						var8 = 0;
					}

					if (var1 == 0) { // L: 150
						Tiles.Tiles_heights[0][var2][var3] = -var8 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var8 * 8; // L: 151
					}
					break;
				}

				if (var7 <= 49) { // L: 154
					Tiles.field1092[var1][var2][var3] = var0.readByte(); // L: 155
					Tiles.field1091[var1][var2][var3] = (byte)((var7 - 2) / 4); // L: 156
					class362.field4079[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3); // L: 157
				} else if (var7 <= 81) { // L: 160
					Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var7 - 49); // L: 161
				} else {
					class9.field69[var1][var2][var3] = (byte)(var7 - 81); // L: 164
				}
			}
		} else {
			while (true) {
				var7 = var0.readUnsignedByte(); // L: 169
				if (var7 == 0) { // L: 170
					break;
				}

				if (var7 == 1) { // L: 171
					var0.readUnsignedByte(); // L: 172
					break;
				}

				if (var7 <= 49) { // L: 175
					var0.readUnsignedByte();
				}
			}
		}

	} // L: 178

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "(Lcd;I)V",
		garbageValue = "-716218662"
	)
	static final void method2990(Actor var0) {
		if (var0.field1268 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0 || var0.sequenceFrameCycle + 1 > class225.SequenceDefinition_get(var0.sequence).frameLengths[var0.sequenceFrame]) { // L: 3461
			int var1 = var0.field1268 - var0.field1255; // L: 3462
			int var2 = Client.cycle - var0.field1255; // L: 3463
			int var3 = var0.field1258 * 64 + var0.field1240 * 128; // L: 3464
			int var4 = var0.field1258 * 64 + var0.field1253 * 128; // L: 3465
			int var5 = var0.field1258 * 64 + var0.field1252 * 128; // L: 3466
			int var6 = var0.field1258 * 64 + var0.field1239 * 128; // L: 3467
			var0.x = (var2 * var5 + var3 * (var1 - var2)) / var1; // L: 3468
			var0.y = (var2 * var6 + var4 * (var1 - var2)) / var1; // L: 3469
		}

		var0.field1267 = 0; // L: 3471
		var0.orientation = var0.field1213; // L: 3472
		var0.rotation = var0.orientation; // L: 3473
	} // L: 3474

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(Lcv;ZI)V",
		garbageValue = "827368922"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group; // L: 11320
		int var3 = (int)var0.key; // L: 11321
		var0.remove(); // L: 11322
		if (var1) { // L: 11323
			WorldMapRegion.method2929(var2);
		}

		class9.method118(var2); // L: 11324
		Widget var4 = class139.getWidget(var3); // L: 11325
		if (var4 != null) { // L: 11326
			class29.invalidateWidget(var4);
		}

		AbstractWorldMapIcon.method3186(); // L: 11327
		if (Client.rootInterface != -1) { // L: 11328
			class379.runIntfCloseListeners(Client.rootInterface, 1);
		}

	} // L: 11329
}
