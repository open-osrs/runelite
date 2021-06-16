import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fo")
@Implements("WorldMapData_0")
public class WorldMapData_0 extends AbstractWorldMapData {
	WorldMapData_0() {
	} // L: 6

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;B)V",
		garbageValue = "68"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 9
		if (var2 != WorldMapID.field2111.value) { // L: 10
			throw new IllegalStateException(""); // L: 11
		} else {
			super.minPlane = var1.readUnsignedByte(); // L: 13
			super.planes = var1.readUnsignedByte(); // L: 14
			super.regionXLow = var1.readUnsignedShort(); // L: 15
			super.regionYLow = var1.readUnsignedShort(); // L: 16
			super.regionX = var1.readUnsignedShort(); // L: 17
			super.regionY = var1.readUnsignedShort(); // L: 18
			super.groupId = var1.method6630(); // L: 19
			super.fileId = var1.method6630(); // L: 20
		}
	} // L: 21

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "-1563875465"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4); // L: 24
		super.floorUnderlayIds = new short[1][64][64]; // L: 25
		super.floorOverlayIds = new short[super.planes][64][64]; // L: 26
		super.field2068 = new byte[super.planes][64][64]; // L: 27
		super.field2074 = new byte[super.planes][64][64]; // L: 28
		super.decorations = new WorldMapDecoration[super.planes][64][64][]; // L: 29
		int var2 = var1.readUnsignedByte(); // L: 30
		if (var2 != class180.field2102.value) { // L: 31
			throw new IllegalStateException(""); // L: 32
		} else {
			int var3 = var1.readUnsignedByte(); // L: 34
			int var4 = var1.readUnsignedByte(); // L: 35
			if (var3 == super.regionX && var4 == super.regionY) { // L: 36
				for (int var5 = 0; var5 < 64; ++var5) { // L: 39
					for (int var6 = 0; var6 < 64; ++var6) { // L: 40
						this.readTile(var5, var6, var1); // L: 41
					}
				}

			} else {
				throw new IllegalStateException(""); // L: 37
			}
		}
	} // L: 44

	public int hashCode() {
		return super.regionX | super.regionY << 8; // L: 55
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_0)) { // L: 47
			return false; // L: 48
		} else {
			WorldMapData_0 var2 = (WorldMapData_0)var1; // L: 50
			return var2.regionX == super.regionX && super.regionY == var2.regionY; // L: 51
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "-1824219320"
	)
	static int method3267(int var0, Script var1, boolean var2) {
		if (var0 != 3700 && var0 != 3701) { // L: 2442
			if (var0 == 3702) { // L: 2447
				++ChatChannel.Interpreter_intStackSize; // L: 2448
				return 1; // L: 2449
			} else {
				return 2; // L: 2451
			}
		} else {
			--ChatChannel.Interpreter_intStackSize; // L: 2443
			--UserComparator9.Interpreter_stringStackSize; // L: 2444
			return 1; // L: 2445
		}
	}
}
