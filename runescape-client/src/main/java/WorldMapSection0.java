import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("archive14")
	static Archive archive14;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1768091049
	)
	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 988628889
	)
	@Export("newZ")
	int newZ;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1156132855
	)
	@Export("oldX")
	int oldX;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1708018095
	)
	@Export("oldY")
	int oldY;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -432173517
	)
	@Export("newX")
	int newX;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -2114581385
	)
	@Export("newY")
	int newY;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 130464103
	)
	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -2110641739
	)
	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1280805387
	)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1407216149
	)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1337745057
	)
	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1810470631
	)
	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 215661089
	)
	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1604965757
	)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	} // L: 22

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Leq;I)V",
		garbageValue = "-609192354"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.newX) { // L: 25
			var1.regionLowX = this.newX;
		}

		if (var1.regionHighX < this.newX) {
			var1.regionHighX = this.newX; // L: 26
		}

		if (var1.regionLowY > this.newY) { // L: 27
			var1.regionLowY = this.newY;
		}

		if (var1.regionHighY < this.newY) { // L: 28
			var1.regionHighY = this.newY;
		}

	} // L: 29

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-2146205978"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.newZ + this.oldZ) { // L: 32
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7; // L: 35
		} else {
			return false; // L: 33
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-916390789"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7; // L: 39
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "1101045563"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 43
			return null; // L: 44
		} else {
			int[] var4 = new int[]{var2 + (this.newX * 64 - this.oldX * 64) + (this.newChunkXLow * 8 - this.oldChunkXLow * 8), var3 + (this.newY * 64 - this.oldY * 64) + (this.newChunkYLow * 8 - this.oldChunkYLow * 8)};
			return var4;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)Lhk;",
		garbageValue = "1643926479"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.oldX * 64 - this.newX * 64 + (this.oldChunkXLow * 8 - this.newChunkXLow * 8) + var1; // L: 56
			int var4 = var2 + (this.oldY * 64 - this.newY * 64) + (this.oldChunkYLow * 8 - this.newChunkYLow * 8); // L: 57
			return new Coord(this.oldZ, var3, var4); // L: 58
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "-576756767"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.oldZ = var1.readUnsignedByte(); // L: 62
		this.newZ = var1.readUnsignedByte(); // L: 63
		this.oldX = var1.readUnsignedShort(); // L: 64
		this.oldChunkXLow = var1.readUnsignedByte(); // L: 65
		this.oldChunkXHigh = var1.readUnsignedByte(); // L: 66
		this.oldY = var1.readUnsignedShort(); // L: 67
		this.oldChunkYLow = var1.readUnsignedByte(); // L: 68
		this.oldChunkYHigh = var1.readUnsignedByte(); // L: 69
		this.newX = var1.readUnsignedShort(); // L: 70
		this.newChunkXLow = var1.readUnsignedByte(); // L: 71
		this.newChunkXHigh = var1.readUnsignedByte(); // L: 72
		this.newY = var1.readUnsignedShort(); // L: 73
		this.newChunkYLow = var1.readUnsignedByte(); // L: 74
		this.newChunkYHigh = var1.readUnsignedByte(); // L: 75
		this.postRead(); // L: 76
	} // L: 77

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "61"
	)
	@Export("postRead")
	void postRead() {
	} // L: 79

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lir;Lir;Lir;I)V",
		garbageValue = "1056313138"
	)
	public static void method3034(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		HitSplatDefinition.HitSplatDefinition_archive = var0; // L: 46
		HitSplatDefinition.field3562 = var1; // L: 47
		HitSplatDefinition.HitSplatDefinition_fontsArchive = var2;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "80303015"
	)
	public static int method3058(int var0, int var1, int var2) {
		var2 &= 3; // L: 9
		if (var2 == 0) { // L: 10
			return var1;
		} else if (var2 == 1) { // L: 11
			return 7 - var0;
		} else {
			return var2 == 2 ? 7 - var1 : var0; // L: 12
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ILir;IIIZI)V",
		garbageValue = "2053595468"
	)
	public static void method3059(int var0, AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		class210.musicPlayerStatus = 1; // L: 48
		class210.musicTrackArchive = var1; // L: 49
		FaceNormal.musicTrackGroupId = var2; // L: 50
		WorldMapID.musicTrackFileId = var3; // L: 51
		class375.musicTrackVolume = var4; // L: 52
		class210.musicTrackBoolean = var5; // L: 53
		class1.pcmSampleLength = var0; // L: 54
	} // L: 55

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(Lhu;II)I",
		garbageValue = "-1824113560"
	)
	static final int method3036(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) { // L: 10105
			try {
				int[] var2 = var0.cs1Instructions[var1]; // L: 10107
				int var3 = 0; // L: 10108
				int var4 = 0; // L: 10109
				byte var5 = 0; // L: 10110

				while (true) {
					int var6 = var2[var4++]; // L: 10112
					int var7 = 0; // L: 10113
					byte var8 = 0; // L: 10114
					if (var6 == 0) { // L: 10115
						return var3;
					}

					if (var6 == 1) { // L: 10116
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) { // L: 10117
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) { // L: 10118
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) { // L: 10119
						var9 = var2[var4++] << 16; // L: 10120
						var9 += var2[var4++]; // L: 10121
						var10 = class139.getWidget(var9); // L: 10122
						var11 = var2[var4++]; // L: 10123
						if (var11 != -1 && (!class23.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 10124
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 10125
								if (var11 + 1 == var10.itemIds[var12]) { // L: 10126
									var7 += var10.itemQuantities[var12];
								}
							}
						}
					}

					if (var6 == 5) { // L: 10130
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) { // L: 10131
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) { // L: 10132
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) { // L: 10133
						var7 = Varcs.localPlayer.combatLevel;
					}

					if (var6 == 9) { // L: 10134
						for (var9 = 0; var9 < 25; ++var9) { // L: 10135
							if (Skills.Skills_enabled[var9]) { // L: 10136
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) { // L: 10139
						var9 = var2[var4++] << 16; // L: 10140
						var9 += var2[var4++]; // L: 10141
						var10 = class139.getWidget(var9); // L: 10142
						var11 = var2[var4++]; // L: 10143
						if (var11 != -1 && (!class23.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 10144
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 10145
								if (var11 + 1 == var10.itemIds[var12]) { // L: 10146
									var7 = 999999999; // L: 10147
									break; // L: 10148
								}
							}
						}
					}

					if (var6 == 11) { // L: 10153
						var7 = Client.runEnergy;
					}

					if (var6 == 12) { // L: 10154
						var7 = Client.weight;
					}

					if (var6 == 13) { // L: 10155
						var9 = Varps.Varps_main[var2[var4++]]; // L: 10156
						int var13 = var2[var4++]; // L: 10157
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0; // L: 10158
					}

					if (var6 == 14) { // L: 10160
						var9 = var2[var4++]; // L: 10161
						var7 = class2.getVarbit(var9); // L: 10162
					}

					if (var6 == 15) { // L: 10164
						var8 = 1;
					}

					if (var6 == 16) { // L: 10165
						var8 = 2;
					}

					if (var6 == 17) { // L: 10166
						var8 = 3;
					}

					if (var6 == 18) { // L: 10167
						var7 = (Varcs.localPlayer.x >> 7) + ItemLayer.baseX;
					}

					if (var6 == 19) { // L: 10168
						var7 = (Varcs.localPlayer.y >> 7) + Tile.baseY;
					}

					if (var6 == 20) { // L: 10169
						var7 = var2[var4++];
					}

					if (var8 == 0) { // L: 10170
						if (var5 == 0) { // L: 10171
							var3 += var7;
						}

						if (var5 == 1) { // L: 10172
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) { // L: 10173
							var3 /= var7;
						}

						if (var5 == 3) { // L: 10174
							var3 *= var7;
						}

						var5 = 0; // L: 10175
					} else {
						var5 = var8; // L: 10177
					}
				}
			} catch (Exception var14) { // L: 10180
				return -1; // L: 10181
			}
		} else {
			return -2;
		}
	}
}
