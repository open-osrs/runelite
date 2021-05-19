import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1996552339
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -2059198725
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 2081682071
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1016035147
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 639511485
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 441540085
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1726818165
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1111164981
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("k")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("r")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("p")
	byte[][][] field2063;
	@ObfuscatedName("a")
	byte[][][] field2064;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "[[[[Lfg;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("d")
	boolean field2066;
	@ObfuscatedName("u")
	boolean field2067;

	AbstractWorldMapData() {
		this.groupId = -1; // L: 14
		this.fileId = -1; // L: 15
		new LinkedList();
		this.field2066 = false; // L: 26
		this.field2067 = false; // L: 27
	} // L: 29

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "1915938242"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2052268063"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field2066 && this.field2067; // L: 32
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljp;B)V",
		garbageValue = "56"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) { // L: 36
			byte[] var2 = var1.takeFile(this.groupId, this.fileId); // L: 37
			if (var2 != null) { // L: 38
				this.readGeography(new Buffer(var2)); // L: 39
				this.field2066 = true; // L: 40
				this.field2067 = true; // L: 41
			}

		}
	} // L: 43

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-39"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null; // L: 46
		this.floorOverlayIds = null; // L: 47
		this.field2063 = null; // L: 48
		this.field2064 = null; // L: 49
		this.decorations = null; // L: 50
		this.field2066 = false; // L: 51
		this.field2067 = false; // L: 52
	} // L: 53

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IILnk;I)V",
		garbageValue = "-1976219247"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte(); // L: 56
		if (var4 != 0) { // L: 57
			if ((var4 & 1) != 0) { // L: 60
				this.method3546(var1, var2, var3, var4); // L: 61
			} else {
				this.method3547(var1, var2, var3, var4); // L: 64
			}

		}
	} // L: 58 66

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IILnk;IB)V",
		garbageValue = "13"
	)
	void method3546(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0; // L: 69
		if (var5) { // L: 70
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedByte(); // L: 71
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte(); // L: 73
	} // L: 74

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IILnk;II)V",
		garbageValue = "158678327"
	)
	void method3547(int var1, int var2, Buffer var3, int var4) {
		int var5 = ((var4 & 24) >> 3) + 1; // L: 77
		boolean var6 = (var4 & 2) != 0; // L: 78
		boolean var7 = (var4 & 4) != 0; // L: 79
		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte(); // L: 80
		int var8;
		int var9;
		int var11;
		if (var6) { // L: 81
			var8 = var3.readUnsignedByte(); // L: 82

			for (var9 = 0; var9 < var8; ++var9) { // L: 83
				int var14 = var3.readUnsignedByte(); // L: 84
				if (var14 != 0) { // L: 85
					this.floorOverlayIds[var9][var1][var2] = (short)var14; // L: 86
					var11 = var3.readUnsignedByte(); // L: 87
					this.field2063[var9][var1][var2] = (byte)(var11 >> 2); // L: 88
					this.field2064[var9][var1][var2] = (byte)(var11 & 3); // L: 89
				}
			}
		}

		if (var7) { // L: 93
			for (var8 = 0; var8 < var5; ++var8) { // L: 94
				var9 = var3.readUnsignedByte(); // L: 95
				if (var9 != 0) { // L: 96
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9]; // L: 99

					for (var11 = 0; var11 < var9; ++var11) { // L: 100
						int var12 = var3.method6464(); // L: 101
						int var13 = var3.readUnsignedByte(); // L: 102
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3); // L: 103
					}
				}
			}
		}

	} // L: 107

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1248548419"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX; // L: 112
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1357886281"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY; // L: 116
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lnk;IIIIIII)V",
		garbageValue = "-186517338"
	)
	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) { // L: 119
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 120

			while (true) {
				var7 = var0.readUnsignedByte(); // L: 122
				if (var7 == 0) { // L: 123
					if (var1 == 0) { // L: 124
						int[] var14 = Tiles.Tiles_heights[0][var2]; // L: 125
						int var11 = var2 + var4 + 932731; // L: 128
						int var12 = var3 + var5 + 556238; // L: 129
						int var13 = FontName.method6160(var11 + 45365, 91923 + var12, 4) - 128 + (FontName.method6160(var11 + 10294, 37821 + var12, 2) - 128 >> 1) + (FontName.method6160(var11, var12, 1) - 128 >> 2); // L: 131
						var13 = (int)((double)var13 * 0.3D) + 35; // L: 132
						if (var13 < 10) { // L: 133
							var13 = 10;
						} else if (var13 > 60) { // L: 134
							var13 = 60;
						}

						var14[var3] = -var13 * 8; // L: 137
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240; // L: 139
					}
					break;
				}

				if (var7 == 1) { // L: 142
					int var8 = var0.readUnsignedByte(); // L: 143
					if (var8 == 1) { // L: 144
						var8 = 0;
					}

					if (var1 == 0) { // L: 145
						Tiles.Tiles_heights[0][var2][var3] = -var8 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var8 * 8; // L: 146
					}
					break;
				}

				if (var7 <= 49) { // L: 149
					class9.field71[var1][var2][var3] = var0.readByte(); // L: 150
					Tiles.field1088[var1][var2][var3] = (byte)((var7 - 2) / 4); // L: 151
					Tiles.field1086[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3); // L: 152
				} else if (var7 <= 81) { // L: 155
					Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var7 - 49); // L: 156
				} else {
					Tiles.field1097[var1][var2][var3] = (byte)(var7 - 81); // L: 159
				}
			}
		} else {
			while (true) {
				var7 = var0.readUnsignedByte(); // L: 164
				if (var7 == 0) { // L: 165
					break;
				}

				if (var7 == 1) { // L: 166
					var0.readUnsignedByte(); // L: 167
					break;
				}

				if (var7 <= 49) { // L: 170
					var0.readUnsignedByte();
				}
			}
		}

	} // L: 173
}
