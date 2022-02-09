import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hv")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 818987269
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1887576147
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 114191505
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 797573361
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -112404559
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 637576273
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -461981327
	)
	int field2623;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -565925945
	)
	int field2618;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -39846799
	)
	int field2625;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -238586583
	)
	int field2626;

	WorldMapSection2() {
	} // L: 18

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lhm;I)V",
		garbageValue = "806489369"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2623) { // L: 22
			var1.regionLowX = this.field2623;
		}

		if (var1.regionHighX < this.field2625) {
			var1.regionHighX = this.field2625; // L: 23
		}

		if (var1.regionLowY > this.field2618) { // L: 24
			var1.regionLowY = this.field2618;
		}

		if (var1.regionHighY < this.field2626) { // L: 25
			var1.regionHighY = this.field2626;
		}

	} // L: 26

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "1721879281"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) { // L: 30
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY; // L: 33
		} else {
			return false; // L: 31
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "898039462"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field2623 && var1 >> 6 <= this.field2625 && var2 >> 6 >= this.field2618 && var2 >> 6 <= this.field2626; // L: 38
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "499785766"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 43
			return null; // L: 44
		} else {
			int[] var4 = new int[]{var2 + (this.field2623 * 64 - this.regionStartX * 64), var3 + (this.field2618 * 64 - this.regionStartY * 64)}; // L: 46 47 48
			return var4; // L: 49
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IIB)Ljd;",
		garbageValue = "90"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 54
			return null; // L: 55
		} else {
			int var3 = this.regionStartX * 64 - this.field2623 * 64 + var1; // L: 57
			int var4 = var2 + (this.regionStartY * 64 - this.field2618 * 64); // L: 58
			return new Coord(this.minPlane, var3, var4); // L: 59
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "-121"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte(); // L: 64
		this.planes = var1.readUnsignedByte(); // L: 65
		this.regionStartX = var1.readUnsignedShort(); // L: 66
		this.regionStartY = var1.readUnsignedShort(); // L: 67
		this.regionEndX = var1.readUnsignedShort(); // L: 68
		this.regionEndY = var1.readUnsignedShort(); // L: 69
		this.field2623 = var1.readUnsignedShort(); // L: 70
		this.field2618 = var1.readUnsignedShort(); // L: 71
		this.field2625 = var1.readUnsignedShort(); // L: 72
		this.field2626 = var1.readUnsignedShort(); // L: 73
		this.postRead(); // L: 74
	} // L: 75

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-9905"
	)
	@Export("postRead")
	void postRead() {
	} // L: 77

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.field744) { // L: 3441
			class265.midiPcmStream.clear(); // L: 3443
			class265.musicPlayerStatus = 1; // L: 3444
			class265.musicTrackArchive = null; // L: 3445
		} else if (var0 != -1 && var0 != Client.currentTrackGroupId && class424.clientPreferences.musicVolume != 0 && !Client.field744) { // L: 3448
			Archive var1 = WorldMapLabelSize.archive6; // L: 3449
			int var2 = class424.clientPreferences.musicVolume; // L: 3450
			class265.musicPlayerStatus = 1; // L: 3452
			class265.musicTrackArchive = var1; // L: 3453
			class265.musicTrackGroupId = var0; // L: 3454
			class140.musicTrackFileId = 0; // L: 3455
			class167.musicTrackVolume = var2; // L: 3456
			MusicPatch.musicTrackBoolean = false; // L: 3457
			GrandExchangeOfferNameComparator.pcmSampleLength = 2; // L: 3458
		}

		Client.currentTrackGroupId = var0; // L: 3461
	} // L: 3462

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-658608851"
	)
	static final void method4360() {
		Client.field701 = Client.cycleCntr; // L: 11914
		ClanChannelMember.field1528 = true; // L: 11915
	} // L: 11916
}
