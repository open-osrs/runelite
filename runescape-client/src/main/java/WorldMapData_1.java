import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
@Implements("WorldMapData_1")
public class WorldMapData_1 extends AbstractWorldMapData {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -624362671
	)
	@Export("chunkXLow")
	int chunkXLow;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -2082539499
	)
	@Export("chunkYLow")
	int chunkYLow;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -2054670475
	)
	@Export("chunkX")
	int chunkX;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1388655107
	)
	@Export("chunkY")
	int chunkY;

	WorldMapData_1() {
	} // L: 11

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "1149185778"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 14
		if (var2 != WorldMapID.field2108.value) { // L: 15
			throw new IllegalStateException(""); // L: 16
		} else {
			super.minPlane = var1.readUnsignedByte(); // L: 18
			super.planes = var1.readUnsignedByte(); // L: 19
			super.regionXLow = var1.readUnsignedShort(); // L: 20
			super.regionYLow = var1.readUnsignedShort(); // L: 21
			this.chunkXLow = var1.readUnsignedByte();
			this.chunkYLow = var1.readUnsignedByte();
			super.regionX = var1.readUnsignedShort(); // L: 24
			super.regionY = var1.readUnsignedShort(); // L: 25
			this.chunkX = var1.readUnsignedByte(); // L: 26
			this.chunkY = var1.readUnsignedByte(); // L: 27
			super.groupId = var1.method6630(); // L: 28
			super.fileId = var1.method6630(); // L: 29
		}
	} // L: 30

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "-1563875465"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4); // L: 33
		super.floorUnderlayIds = new short[1][64][64]; // L: 34
		super.floorOverlayIds = new short[super.planes][64][64]; // L: 35
		super.field2068 = new byte[super.planes][64][64]; // L: 36
		super.field2074 = new byte[super.planes][64][64]; // L: 37
		super.decorations = new WorldMapDecoration[super.planes][64][64][]; // L: 38
		int var2 = var1.readUnsignedByte(); // L: 39
		if (var2 != class180.field2103.value) { // L: 40
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "24313"
	)
	@Export("getChunkXLow")
	int getChunkXLow() {
		return this.chunkXLow; // L: 73
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1571205738"
	)
	@Export("getChunkYLow")
	int getChunkYLow() {
		return this.chunkYLow; // L: 77
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-115"
	)
	@Export("getChunkX")
	int getChunkX() {
		return this.chunkX; // L: 81
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-29"
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
			if (var2.regionX == super.regionX && super.regionY == var2.regionY) { // L: 62
				return this.chunkX == var2.chunkX && this.chunkY == var2.chunkY; // L: 65
			} else {
				return false; // L: 63
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Lhg;",
		garbageValue = "1853252899"
	)
	public static PacketBufferNode method3583() {
		return PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0 ? new PacketBufferNode() : PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount]; // L: 22 23
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)[Lhj;",
		garbageValue = "1"
	)
	public static class226[] method3582() {
		return new class226[]{class226.field2688, class226.field2683, class226.field2684, class226.field2692, class226.field2693, class226.field2687, class226.field2686, class226.field2689, class226.field2690, class226.field2691}; // L: 17
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)Liv;",
		garbageValue = "1896933792"
	)
	@Export("getWidget")
	public static Widget getWidget(int var0) {
		int var1 = var0 >> 16; // L: 199
		int var2 = var0 & 65535; // L: 200
		if (GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var1] == null || GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var1][var2] == null) { // L: 201
			boolean var3 = class20.loadInterface(var1); // L: 202
			if (!var3) { // L: 203
				return null;
			}
		}

		return GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var1][var2]; // L: 205
	}
}
