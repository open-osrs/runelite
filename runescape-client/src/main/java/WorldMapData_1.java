import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
@Implements("WorldMapData_1")
public class WorldMapData_1 extends AbstractWorldMapData {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 944761331
	)
	@Export("chunkXLow")
	int chunkXLow;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -2108946565
	)
	@Export("chunkYLow")
	int chunkYLow;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1996140337
	)
	@Export("chunkX")
	int chunkX;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -427207979
	)
	@Export("chunkY")
	int chunkY;

	WorldMapData_1() {
	} // L: 11

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqt;B)V",
		garbageValue = "122"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 14
		if (var2 != WorldMapID.field2840.value) { // L: 15
			throw new IllegalStateException("");
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
			super.groupId = var1.method7752(); // L: 28
			super.fileId = var1.method7752(); // L: 29
		}
	} // L: 30

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqt;I)V",
		garbageValue = "-2593161"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4); // L: 34
		super.floorUnderlayIds = new short[1][64][64]; // L: 35
		super.floorOverlayIds = new short[super.planes][64][64]; // L: 36
		super.field2796 = new byte[super.planes][64][64]; // L: 37
		super.field2795 = new byte[super.planes][64][64]; // L: 38
		super.decorations = new WorldMapDecoration[super.planes][64][64][]; // L: 39
		int var2 = var1.readUnsignedByte(); // L: 40
		if (var2 != class238.field2836.value) { // L: 41
			throw new IllegalStateException(""); // L: 42
		} else {
			int var3 = var1.readUnsignedByte(); // L: 44
			int var4 = var1.readUnsignedByte(); // L: 45
			int var5 = var1.readUnsignedByte(); // L: 46
			int var6 = var1.readUnsignedByte(); // L: 47
			if (var3 == super.regionX && var4 == super.regionY && var5 == this.chunkX && var6 == this.chunkY) { // L: 48
				for (int var7 = 0; var7 < 8; ++var7) { // L: 51
					for (int var8 = 0; var8 < 8; ++var8) { // L: 52
						this.readTile(var7 + this.chunkX * 8, var8 + this.chunkY * 8, var1); // L: 53
					}
				}

			} else {
				throw new IllegalStateException(""); // L: 49
			}
		}
	} // L: 56

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "906993418"
	)
	@Export("getChunkXLow")
	int getChunkXLow() {
		return this.chunkXLow; // L: 76
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1946876923"
	)
	@Export("getChunkYLow")
	int getChunkYLow() {
		return this.chunkYLow; // L: 80
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-14250"
	)
	@Export("getChunkX")
	int getChunkX() {
		return this.chunkX; // L: 84
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-74"
	)
	@Export("getChunkY")
	int getChunkY() {
		return this.chunkY; // L: 88
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_1)) { // L: 60
			return false; // L: 61
		} else {
			WorldMapData_1 var2 = (WorldMapData_1)var1; // L: 63
			if (var2.regionX == super.regionX && super.regionY == var2.regionY) { // L: 64
				return this.chunkX == var2.chunkX && var2.chunkY == this.chunkY; // L: 67
			} else {
				return false; // L: 65
			}
		}
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8 | this.chunkX << 16 | this.chunkY << 24; // L: 72
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[Lcc;",
		garbageValue = "-217216556"
	)
	static class82[] method4867() {
		return new class82[]{class82.field1073, class82.field1067, class82.field1069, class82.field1066, class82.field1068}; // L: 16
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2054852963"
	)
	static void method4872(int var0) {
		if (var0 != Login.loginIndex) { // L: 1939
			Login.loginIndex = var0; // L: 1940
		}
	} // L: 1941

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(Lkb;I)V",
		garbageValue = "-1987300687"
	)
	static final void method4874(Widget var0) {
		int var1 = var0.contentType; // L: 11943
		if (var1 == 324) { // L: 11944
			if (Client.field535 == -1) { // L: 11945
				Client.field535 = var0.spriteId2; // L: 11946
				Client.field763 = var0.spriteId; // L: 11947
			}

			if (Client.playerAppearance.isFemale) { // L: 11949
				var0.spriteId2 = Client.field535;
			} else {
				var0.spriteId2 = Client.field763; // L: 11950
			}

		} else if (var1 == 325) { // L: 11953
			if (Client.field535 == -1) { // L: 11954
				Client.field535 = var0.spriteId2; // L: 11955
				Client.field763 = var0.spriteId; // L: 11956
			}

			if (Client.playerAppearance.isFemale) { // L: 11958
				var0.spriteId2 = Client.field763;
			} else {
				var0.spriteId2 = Client.field535; // L: 11959
			}

		} else if (var1 == 327) { // L: 11962
			var0.modelAngleX = 150; // L: 11963
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 11964
			var0.modelType = 5; // L: 11965
			var0.modelId = 0; // L: 11966
		} else if (var1 == 328) { // L: 11969
			var0.modelAngleX = 150; // L: 11970
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 11971
			var0.modelType = 5; // L: 11972
			var0.modelId = 1; // L: 11973
		}
	} // L: 11951 11960 11967 11974 11976
}
