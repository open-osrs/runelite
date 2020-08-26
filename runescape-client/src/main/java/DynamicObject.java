import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
@Implements("DynamicObject")
public class DynamicObject extends Entity {
	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -992554479
	)
	@Export("id")
	int id;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -224037215
	)
	@Export("type")
	int type;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1337748479
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 719138669
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1011089507
	)
	@Export("x")
	int x;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1704315949
	)
	@Export("y")
	int y;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -791329731
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1556832647
	)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		descriptor = "(IIIIIIIZLez;)V"
	)
	DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Entity var9) {
		this.id = var1; // L: 20
		this.type = var2; // L: 21
		this.orientation = var3; // L: 22
		this.plane = var4; // L: 23
		this.x = var5; // L: 24
		this.y = var6; // L: 25
		if (var7 != -1) { // L: 26
			this.sequenceDefinition = WorldMapRegion.SequenceDefinition_get(var7); // L: 27
			this.frame = 0; // L: 28
			this.cycleStart = Client.cycle - 1; // L: 29
			if (this.sequenceDefinition.field3535 == 0 && var9 != null && var9 instanceof DynamicObject) { // L: 30
				DynamicObject var10 = (DynamicObject)var9; // L: 31
				if (this.sequenceDefinition == var10.sequenceDefinition) { // L: 32
					this.frame = var10.frame; // L: 33
					this.cycleStart = var10.cycleStart; // L: 34
					return; // L: 35
				}
			}

			if (var8 && this.sequenceDefinition.frameCount != -1) { // L: 38
				this.frame = (int)(Math.random() * (double)this.sequenceDefinition.frameIds.length); // L: 39
				this.cycleStart -= (int)(Math.random() * (double)this.sequenceDefinition.frameLengths[this.frame]); // L: 40
			}
		}

	} // L: 43

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Ler;",
		garbageValue = "-2026237468"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.sequenceDefinition != null) { // L: 46
			int var1 = Client.cycle - this.cycleStart; // L: 47
			if (var1 > 100 && this.sequenceDefinition.frameCount > 0) { // L: 48
				var1 = 100;
			}

			label54: {
				do {
					do {
						if (var1 <= this.sequenceDefinition.frameLengths[this.frame]) { // L: 49
							break label54;
						}

						var1 -= this.sequenceDefinition.frameLengths[this.frame]; // L: 50
						++this.frame; // L: 51
					} while(this.frame < this.sequenceDefinition.frameIds.length); // L: 52

					this.frame -= this.sequenceDefinition.frameCount; // L: 53
				} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length); // L: 54

				this.sequenceDefinition = null; // L: 55
			}

			this.cycleStart = Client.cycle - var1; // L: 60
		}

		ObjectDefinition var12 = MidiPcmStream.getObjectDefinition(this.id); // L: 62
		if (var12.transforms != null) { // L: 63
			var12 = var12.transform();
		}

		if (var12 == null) { // L: 64
			return null;
		} else {
			int var2;
			int var3;
			if (this.orientation != 1 && this.orientation != 3) { // L: 67
				var2 = var12.sizeX; // L: 72
				var3 = var12.sizeY; // L: 73
			} else {
				var2 = var12.sizeY; // L: 68
				var3 = var12.sizeX; // L: 69
			}

			int var4 = (var2 >> 1) + this.x; // L: 75
			int var5 = (var2 + 1 >> 1) + this.x; // L: 76
			int var6 = (var3 >> 1) + this.y; // L: 77
			int var7 = (var3 + 1 >> 1) + this.y; // L: 78
			int[][] var8 = Tiles.Tiles_heights[this.plane]; // L: 79
			int var9 = var8[var4][var7] + var8[var4][var6] + var8[var5][var6] + var8[var5][var7] >> 2; // L: 80
			int var10 = (this.x << 7) + (var2 << 6); // L: 81
			int var11 = (this.y << 7) + (var3 << 6); // L: 82
			return var12.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame); // L: 83
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lkf;IIIIIIB)V",
		garbageValue = "24"
	)
	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) { // L: 108
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 109

			while (true) {
				var7 = var0.readUnsignedByte(); // L: 111
				if (var7 == 0) { // L: 112
					if (var1 == 0) { // L: 113
						int[] var14 = Tiles.Tiles_heights[0][var2]; // L: 114
						int var11 = var2 + var4 + 932731; // L: 117
						int var12 = var3 + var5 + 556238; // L: 118
						int var13 = class60.method947(45365 + var11, 91923 + var12, 4) - 128 + (class60.method947(var11 + 10294, 37821 + var12, 2) - 128 >> 1) + (class60.method947(var11, var12, 1) - 128 >> 2); // L: 120
						var13 = (int)((double)var13 * 0.3D) + 35; // L: 121
						if (var13 < 10) { // L: 122
							var13 = 10;
						} else if (var13 > 60) { // L: 123
							var13 = 60;
						}

						var14[var3] = -var13 * 8; // L: 126
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240; // L: 128
					}
					break;
				}

				if (var7 == 1) { // L: 131
					int var8 = var0.readUnsignedByte(); // L: 132
					if (var8 == 1) { // L: 133
						var8 = 0;
					}

					if (var1 == 0) { // L: 134
						Tiles.Tiles_heights[0][var2][var3] = -var8 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var8 * 8; // L: 135
					}
					break;
				}

				if (var7 <= 49) { // L: 138
					Tiles.field521[var1][var2][var3] = var0.readByte(); // L: 139
					class297.field3668[var1][var2][var3] = (byte)((var7 - 2) / 4); // L: 140
					class171.field2049[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3); // L: 141
				} else if (var7 <= 81) { // L: 144
					Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var7 - 49); // L: 145
				} else {
					Tiles.field528[var1][var2][var3] = (byte)(var7 - 81); // L: 148
				}
			}
		} else {
			while (true) {
				var7 = var0.readUnsignedByte(); // L: 153
				if (var7 == 0) { // L: 154
					break;
				}

				if (var7 == 1) { // L: 155
					var0.readUnsignedByte(); // L: 156
					break;
				}

				if (var7 <= 49) { // L: 159
					var0.readUnsignedByte();
				}
			}
		}

	} // L: 162

	@ObfuscatedName("m")
	@Export("addEntityUnderMouse")
	static final void addEntityUnderMouse(long var0) {
		ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var0; // L: 99
	} // L: 100
}
