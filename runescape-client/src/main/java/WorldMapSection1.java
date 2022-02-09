import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ik")
@Implements("WorldMapSection1")
public class WorldMapSection1 implements WorldMapSection {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1753874875
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -828363939
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1815956983
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1394044099
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 249945147
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 99224141
	)
	@Export("regionEndY")
	int regionEndY;

	WorldMapSection1() {
	} // L: 14

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lhm;I)V",
		garbageValue = "806489369"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.regionEndX) { // L: 18
			var1.regionLowX = this.regionEndX;
		}

		if (var1.regionHighX < this.regionEndX) {
			var1.regionHighX = this.regionEndX; // L: 19
		}

		if (var1.regionLowY > this.regionEndY) { // L: 20
			var1.regionLowY = this.regionEndY;
		}

		if (var1.regionHighY < this.regionEndY) { // L: 21
			var1.regionHighY = this.regionEndY;
		}

	} // L: 22

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "1721879281"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.minPlane + this.planes) { // L: 26
			return var2 >> 6 == this.regionStartX && var3 >> 6 == this.regionStartY; // L: 29
		} else {
			return false; // L: 27
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "898039462"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 == this.regionEndX && var2 >> 6 == this.regionEndY; // L: 34
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "499785766"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 39
			return null; // L: 40
		} else {
			int[] var4 = new int[]{var2 + (this.regionEndX * 64 - this.regionStartX * 64), var3 + (this.regionEndY * 64 - this.regionStartY * 64)}; // L: 42 43 44
			return var4; // L: 45
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IIB)Ljd;",
		garbageValue = "90"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 50
			return null; // L: 51
		} else {
			int var3 = this.regionStartX * 64 - this.regionEndX * 64 + var1; // L: 53
			int var4 = var2 + (this.regionStartY * 64 - this.regionEndY * 64); // L: 54
			return new Coord(this.minPlane, var3, var4); // L: 55
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "-121"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort();
		this.regionStartY = var1.readUnsignedShort();
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "475724077"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lkz;IIIBZB)V",
		garbageValue = "0"
	)
	@Export("requestNetFile")
	static void requestNetFile(Archive var0, int var1, int var2, int var3, byte var4, boolean var5) {
		long var6 = (long)((var1 << 16) + var2); // L: 60
		NetFileRequest var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.get(var6); // L: 61
		if (var8 == null) { // L: 62
			var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var6); // L: 63
			if (var8 == null) { // L: 64
				var8 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var6); // L: 65
				if (var8 != null) { // L: 66
					if (var5) { // L: 67
						var8.removeDual(); // L: 68
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6); // L: 69
						--NetCache.NetCache_pendingWritesCount; // L: 70
						++NetCache.NetCache_pendingPriorityWritesCount; // L: 71
					}

				} else {
					if (!var5) { // L: 75
						var8 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var6); // L: 76
						if (var8 != null) { // L: 77
							return;
						}
					}

					var8 = new NetFileRequest(); // L: 79
					var8.archive = var0; // L: 80
					var8.crc = var3; // L: 81
					var8.padding = var4; // L: 82
					if (var5) { // L: 83
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6); // L: 84
						++NetCache.NetCache_pendingPriorityWritesCount; // L: 85
					} else {
						NetCache.NetCache_pendingWritesQueue.addFirst(var8); // L: 88
						NetCache.NetCache_pendingWrites.put(var8, var6); // L: 89
						++NetCache.NetCache_pendingWritesCount; // L: 90
					}

				}
			}
		}
	} // L: 73 92
}
