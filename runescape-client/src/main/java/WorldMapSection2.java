import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	static GameBuild field2031;
	@ObfuscatedName("is")
	@ObfuscatedGetter(
		intValue = 1727517231
	)
	@Export("cameraX")
	static int cameraX;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1697423319
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1601696191
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -725219837
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1152095957
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 209240493
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1497862547
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 764579299
	)
	int field2027;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -288081381
	)
	int field2021;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1222340217
	)
	int field2028;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1110327175
	)
	int field2023;

	WorldMapSection2() {
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lfr;I)V",
		garbageValue = "1411488256"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2027) {
			var1.regionLowX = this.field2027;
		}

		if (var1.regionHighX < this.field2028) {
			var1.regionHighX = this.field2028;
		}

		if (var1.regionLowY > this.field2021) {
			var1.regionLowY = this.field2021;
		}

		if (var1.regionHighY < this.field2023) {
			var1.regionHighY = this.field2023;
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "899981978"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) {
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1579388425"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field2027 && var1 >> 6 <= this.field2028 && var2 >> 6 >= this.field2021 && var2 >> 6 <= this.field2023;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-1605422008"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{var2 + (this.field2027 * 64 - this.regionStartX * 64), var3 + (this.field2021 * 64 - this.regionStartY * 64)};
			return var4;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)Liy;",
		garbageValue = "1389329989"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.regionStartX * 64 - this.field2027 * 64 + var1;
			int var4 = var2 + (this.regionStartY * 64 - this.field2021 * 64);
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-2069607106"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort();
		this.regionStartY = var1.readUnsignedShort();
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort();
		this.field2027 = var1.readUnsignedShort();
		this.field2021 = var1.readUnsignedShort();
		this.field2028 = var1.readUnsignedShort();
		this.field2023 = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1366714923"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(CB)B",
		garbageValue = "-98"
	)
	@Export("charToByteCp1252")
	public static byte charToByteCp1252(char var0) {
		byte var1;
		if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) {
			var1 = (byte)var0;
		} else if (var0 == 8364) {
			var1 = -128;
		} else if (var0 == 8218) {
			var1 = -126;
		} else if (var0 == 402) {
			var1 = -125;
		} else if (var0 == 8222) {
			var1 = -124;
		} else if (var0 == 8230) {
			var1 = -123;
		} else if (var0 == 8224) {
			var1 = -122;
		} else if (var0 == 8225) {
			var1 = -121;
		} else if (var0 == 710) {
			var1 = -120;
		} else if (var0 == 8240) {
			var1 = -119;
		} else if (var0 == 352) {
			var1 = -118;
		} else if (var0 == 8249) {
			var1 = -117;
		} else if (var0 == 338) {
			var1 = -116;
		} else if (var0 == 381) {
			var1 = -114;
		} else if (var0 == 8216) {
			var1 = -111;
		} else if (var0 == 8217) {
			var1 = -110;
		} else if (var0 == 8220) {
			var1 = -109;
		} else if (var0 == 8221) {
			var1 = -108;
		} else if (var0 == 8226) {
			var1 = -107;
		} else if (var0 == 8211) {
			var1 = -106;
		} else if (var0 == 8212) {
			var1 = -105;
		} else if (var0 == 732) {
			var1 = -104;
		} else if (var0 == 8482) {
			var1 = -103;
		} else if (var0 == 353) {
			var1 = -102;
		} else if (var0 == 8250) {
			var1 = -101;
		} else if (var0 == 339) {
			var1 = -100;
		} else if (var0 == 382) {
			var1 = -98;
		} else if (var0 == 376) {
			var1 = -97;
		} else {
			var1 = 63;
		}

		return var1;
	}
}
