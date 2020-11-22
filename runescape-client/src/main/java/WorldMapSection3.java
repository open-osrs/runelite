import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ad")
@Implements("WorldMapSection3")
public class WorldMapSection3 implements WorldMapSection {
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	@Export("archive2")
	static Archive archive2;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 375073711
	)
	int field381;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -670342777
	)
	int field387;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -831871381
	)
	int field382;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1970843519
	)
	int field383;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1989869311
	)
	int field384;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1016940673
	)
	int field385;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -597741031
	)
	int field386;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -664935547
	)
	int field389;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 266959941
	)
	int field388;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -486540041
	)
	int field391;

	WorldMapSection3() {
	} // L: 18

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lak;I)V",
		garbageValue = "-1645245778"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field384) { // L: 21
			var1.regionLowX = this.field384;
		}

		if (var1.regionHighX < this.field384) {
			var1.regionHighX = this.field384; // L: 22
		}

		if (var1.regionLowY > this.field385) { // L: 23
			var1.regionLowY = this.field385;
		}

		if (var1.regionHighY < this.field385) { // L: 24
			var1.regionHighY = this.field385;
		}

	} // L: 25

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "51"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field381 && var1 < this.field381 + this.field387) { // L: 28
			return var2 >= (this.field382 << 6) + (this.field386 << 3) && var2 <= (this.field382 << 6) + (this.field386 << 3) + 7 && var3 >= (this.field383 << 6) + (this.field389 << 3) && var3 <= (this.field383 << 6) + (this.field389 << 3) + 7; // L: 31
		} else {
			return false; // L: 29
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "10"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field384 << 6) + (this.field388 << 3) && var1 <= (this.field384 << 6) + (this.field388 << 3) + 7 && var2 >= (this.field385 << 6) + (this.field391 << 3) && var2 <= (this.field385 << 6) + (this.field391 << 3) + 7; // L: 35
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "-25"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 39
			return null; // L: 40
		} else {
			int[] var4 = new int[]{var2 + (this.field384 * 64 - this.field382 * 64) + (this.field388 * 8 - this.field386 * 8), var3 + (this.field385 * 64 - this.field383 * 64) + (this.field391 * 8 - this.field389 * 8)}; // L: 42 43 44
			return var4; // L: 45
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lhw;",
		garbageValue = "1"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 49
			return null; // L: 50
		} else {
			int var3 = this.field382 * 64 - this.field384 * 64 + (this.field386 * 8 - this.field388 * 8) + var1; // L: 52
			int var4 = var2 + (this.field383 * 64 - this.field385 * 64) + (this.field389 * 8 - this.field391 * 8); // L: 53
			return new Coord(this.field381, var3, var4); // L: 54
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lkb;I)V",
		garbageValue = "-222098123"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field381 = var1.readUnsignedByte(); // L: 58
		this.field387 = var1.readUnsignedByte(); // L: 59
		this.field382 = var1.readUnsignedShort(); // L: 60
		this.field386 = var1.readUnsignedByte(); // L: 61
		this.field383 = var1.readUnsignedShort(); // L: 62
		this.field389 = var1.readUnsignedByte(); // L: 63
		this.field384 = var1.readUnsignedShort(); // L: 64
		this.field388 = var1.readUnsignedByte(); // L: 65
		this.field385 = var1.readUnsignedShort(); // L: 66
		this.field391 = var1.readUnsignedByte(); // L: 67
		this.method874(); // L: 68
	} // L: 69

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-115"
	)
	void method874() {
	} // L: 71

	@ObfuscatedName("f")
	@Export("sleepExact")
	public static final void sleepExact(long var0) {
		if (var0 > 0L) { // L: 9
			if (0L == var0 % 10L) { // L: 10
				VertexNormal.method3135(var0 - 1L); // L: 11
				VertexNormal.method3135(1L); // L: 12
			} else {
				VertexNormal.method3135(var0); // L: 14
			}

		}
	} // L: 15

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "606509160"
	)
	static void method870(int var0, int var1) {
		long var2 = (long)((var0 << 16) + var1); // L: 258
		NetFileRequest var4 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var2); // L: 259
		if (var4 != null) { // L: 260
			NetCache.NetCache_pendingWritesQueue.addLast(var4); // L: 261
		}
	} // L: 262
}
