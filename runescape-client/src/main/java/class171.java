import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
public class class171 implements WorldMapSection {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1607887237
	)
	int field1997;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -940042015
	)
	int field2002;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1701419305
	)
	int field1999;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 118234657
	)
	int field2006;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1374154033
	)
	int field1998;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1778145223
	)
	int field2005;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 734033743
	)
	int field2003;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 856098009
	)
	int field2004;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -696788433
	)
	int field2000;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1580790943
	)
	int field2001;

	class171() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lfa;I)V",
		garbageValue = "206142404"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field1998) {
			var1.regionLowX = this.field1998;
		}

		if (var1.regionHighX < this.field1998) {
			var1.regionHighX = this.field1998;
		}

		if (var1.regionLowY > this.field2005) {
			var1.regionLowY = this.field2005;
		}

		if (var1.regionHighY < this.field2005) {
			var1.regionHighY = this.field2005;
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "1"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field1997 && var1 < this.field1997 + this.field2002) {
			return var2 >= (this.field1999 << 6) + (this.field2003 << 3) && var2 <= (this.field1999 << 6) + (this.field2003 << 3) + 7 && var3 >= (this.field2006 << 6) + (this.field2004 << 3) && var3 <= (this.field2006 << 6) + (this.field2004 << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "2136306285"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field1998 << 6) + (this.field2000 << 3) && var1 <= (this.field1998 << 6) + (this.field2000 << 3) + 7 && var2 >= (this.field2005 << 6) + (this.field2001 << 3) && var2 <= (this.field2005 << 6) + (this.field2001 << 3) + 7;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "634207470"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{var2 + (this.field1998 * 64 - this.field1999 * 64) + (this.field2000 * 8 - this.field2003 * 8), var3 + (this.field2005 * 64 - this.field2006 * 64) + (this.field2001 * 8 - this.field2004 * 8)};
			return var4;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lij;",
		garbageValue = "43"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.field1999 * 64 - this.field1998 * 64 + (this.field2003 * 8 - this.field2000 * 8) + var1;
			int var4 = var2 + (this.field2006 * 64 - this.field2005 * 64) + (this.field2004 * 8 - this.field2001 * 8);
			return new Coord(this.field1997, var3, var4);
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lnv;I)V",
		garbageValue = "342058266"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field1997 = var1.readUnsignedByte();
		this.field2002 = var1.readUnsignedByte();
		this.field1999 = var1.readUnsignedShort();
		this.field2003 = var1.readUnsignedByte();
		this.field2006 = var1.readUnsignedShort();
		this.field2004 = var1.readUnsignedByte();
		this.field1998 = var1.readUnsignedShort();
		this.field2000 = var1.readUnsignedByte();
		this.field2005 = var1.readUnsignedShort();
		this.field2001 = var1.readUnsignedByte();
		this.method3542();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "186697421"
	)
	void method3542() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "376137055"
	)
	static void method3555() {
		Iterator var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next();
			var1.clearIsFromIgnored();
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIIZIB)J",
		garbageValue = "-27"
	)
	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4) {
		long var5 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17;
		if (var3) {
			var5 |= 65536L;
		}

		return var5;
	}
}
