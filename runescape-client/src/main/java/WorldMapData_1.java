import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hn")
@Implements("WorldMapData_1")
public class WorldMapData_1 extends AbstractWorldMapData {
	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "[Lpt;"
	)
	@Export("crossSprites")
	static SpritePixels[] crossSprites;
	@ObfuscatedName("oa")
	@ObfuscatedGetter(
		intValue = -650765581
	)
	static int field2676;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1735738691
	)
	@Export("chunkXLow")
	int chunkXLow;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -656457815
	)
	@Export("chunkYLow")
	int chunkYLow;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -526258877
	)
	@Export("chunkX")
	int chunkX;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1139134759
	)
	@Export("chunkY")
	int chunkY;

	WorldMapData_1() {
	} // L: 11

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "-70"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 14
		if (var2 != WorldMapID.field2771.value) {
			throw new IllegalStateException(""); // L: 16
		} else {
			super.minPlane = var1.readUnsignedByte(); // L: 18
			super.planes = var1.readUnsignedByte(); // L: 19
			super.regionXLow = var1.readUnsignedShort(); // L: 20
			super.regionYLow = var1.readUnsignedShort(); // L: 21
			this.chunkXLow = var1.readUnsignedByte(); // L: 22
			this.chunkYLow = var1.readUnsignedByte(); // L: 23
			super.regionX = var1.readUnsignedShort(); // L: 24
			super.regionY = var1.readUnsignedShort();
			this.chunkX = var1.readUnsignedByte();
			this.chunkY = var1.readUnsignedByte();
			super.groupId = var1.method7352();
			super.fileId = var1.method7352();
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "-12"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4);
		super.floorUnderlayIds = new short[1][64][64];
		super.floorOverlayIds = new short[super.planes][64][64];
		super.field2736 = new byte[super.planes][64][64];
		super.field2731 = new byte[super.planes][64][64];
		super.decorations = new WorldMapDecoration[super.planes][64][64][];
		int var2 = var1.readUnsignedByte(); // L: 40
		if (var2 != class231.field2765.value) {
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1062280427"
	)
	@Export("getChunkXLow")
	int getChunkXLow() {
		return this.chunkXLow; // L: 76
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "25"
	)
	@Export("getChunkYLow")
	int getChunkYLow() {
		return this.chunkYLow; // L: 80
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1415027516"
	)
	@Export("getChunkX")
	int getChunkX() {
		return this.chunkX; // L: 84
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1277192506"
	)
	@Export("getChunkY")
	int getChunkY() {
		return this.chunkY; // L: 88
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8 | this.chunkX << 16 | this.chunkY << 24; // L: 72
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_1)) { // L: 60
			return false; // L: 61
		} else {
			WorldMapData_1 var2 = (WorldMapData_1)var1; // L: 63
			if (var2.regionX == super.regionX && super.regionY == var2.regionY) { // L: 64
				return var2.chunkX == this.chunkX && this.chunkY == var2.chunkY; // L: 67
			} else {
				return false; // L: 65
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1671218580"
	)
	static void method4642() {
		VerticalAlignment.field1884 = new int[2000]; // L: 25
		int var0 = 0; // L: 26
		int var1 = 240; // L: 27

		int var3;
		for (byte var2 = 12; var0 < 16; var1 -= var2) { // L: 28
			var3 = class10.method101((double)((float)var1 / 360.0F), 0.9998999834060669D, (double)(0.075F + (float)var0 * 0.425F / 16.0F)); // L: 30
			VerticalAlignment.field1884[var0] = var3; // L: 31
			++var0; // L: 29
		}

		var1 = 48; // L: 33

		for (int var5 = var1 / 6; var0 < VerticalAlignment.field1884.length; var1 -= var5) { // L: 34 35 41
			var3 = var0 * 2; // L: 36

			for (int var4 = class10.method101((double)((float)var1 / 360.0F), 0.9998999834060669D, 0.5D); var0 < var3 && var0 < VerticalAlignment.field1884.length; ++var0) { // L: 37 38
				VerticalAlignment.field1884[var0] = var4; // L: 39
			}
		}

	} // L: 43

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)[Lko;",
		garbageValue = "1"
	)
	public static class300[] method4638() {
		return new class300[]{class300.field3845, class300.field3844, class300.field3848, class300.field3846}; // L: 15
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILbl;ZI)I",
		garbageValue = "545300640"
	)
	static int method4635(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) { // L: 3618
			Client.logoutTimer = 250; // L: 3619
			return 1; // L: 3620
		} else if (var0 != 5631 && var0 != 5633) { // L: 3622
			if (var0 == 5632) { // L: 3626
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 26; // L: 3627
				return 1; // L: 3628
			} else {
				return 2; // L: 3630
			}
		} else {
			BufferedNetSocket.Interpreter_stringStackSize -= 2; // L: 3623
			return 1; // L: 3624
		}
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2016201278"
	)
	static boolean method4643() {
		return (Client.drawPlayerNames & 4) != 0; // L: 4725
	}
}
