import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gd")
public class class184 implements WorldMapSection {
	@ObfuscatedName("hl")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1246442681
	)
	int field2093;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1207528751
	)
	int field2099;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1509662935
	)
	int field2102;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1558504127
	)
	int field2094;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1609707315
	)
	int field2095;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1074300817
	)
	int field2096;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1892822935
	)
	int field2092;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1654705375
	)
	int field2098;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -123705663
	)
	int field2091;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 902477063
	)
	int field2100;

	class184() {
	} // L: 18

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lfb;I)V",
		garbageValue = "-1844012640"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2095) { // L: 21
			var1.regionLowX = this.field2095;
		}

		if (var1.regionHighX < this.field2095) {
			var1.regionHighX = this.field2095; // L: 22
		}

		if (var1.regionLowY > this.field2096) { // L: 23
			var1.regionLowY = this.field2096;
		}

		if (var1.regionHighY < this.field2096) { // L: 24
			var1.regionHighY = this.field2096;
		}

	} // L: 25

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1501827396"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field2093 && var1 < this.field2099 + this.field2093) { // L: 28
			return var2 >= (this.field2102 << 6) + (this.field2092 << 3) && var2 <= (this.field2102 << 6) + (this.field2092 << 3) + 7 && var3 >= (this.field2094 << 6) + (this.field2098 << 3) && var3 <= (this.field2094 << 6) + (this.field2098 << 3) + 7; // L: 31
		} else {
			return false; // L: 29
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-356013678"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field2095 << 6) + (this.field2091 << 3) && var1 <= (this.field2095 << 6) + (this.field2091 << 3) + 7 && var2 >= (this.field2096 << 6) + (this.field2100 << 3) && var2 <= (this.field2096 << 6) + (this.field2100 << 3) + 7; // L: 35
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "-79"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 39
			return null; // L: 40
		} else {
			int[] var4 = new int[]{var2 + (this.field2095 * 64 - this.field2102 * 64) + (this.field2091 * 8 - this.field2092 * 8), var3 + (this.field2096 * 64 - this.field2094 * 64) + (this.field2100 * 8 - this.field2098 * 8)}; // L: 42 43 44
			return var4; // L: 45
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)Lie;",
		garbageValue = "494177498"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 49
			return null; // L: 50
		} else {
			int var3 = this.field2102 * 64 - this.field2095 * 64 + (this.field2092 * 8 - this.field2091 * 8) + var1; // L: 52
			int var4 = var2 + (this.field2094 * 64 - this.field2096 * 64) + (this.field2098 * 8 - this.field2100 * 8); // L: 53
			return new Coord(this.field2093, var3, var4); // L: 54
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-682362313"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field2093 = var1.readUnsignedByte(); // L: 58
		this.field2099 = var1.readUnsignedByte(); // L: 59
		this.field2102 = var1.readUnsignedShort(); // L: 60
		this.field2092 = var1.readUnsignedByte(); // L: 61
		this.field2094 = var1.readUnsignedShort(); // L: 62
		this.field2098 = var1.readUnsignedByte(); // L: 63
		this.field2095 = var1.readUnsignedShort(); // L: 64
		this.field2091 = var1.readUnsignedByte(); // L: 65
		this.field2096 = var1.readUnsignedShort(); // L: 66
		this.field2100 = var1.readUnsignedByte(); // L: 67
		this.method3852(); // L: 68
	} // L: 69

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "517860362"
	)
	void method3852() {
	} // L: 71

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "-265491210"
	)
	static int method3871(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) { // L: 3614
			Client.logoutTimer = 250; // L: 3615
			return 1; // L: 3616
		} else if (var0 != 5631 && var0 != 5633) { // L: 3618
			if (var0 == 5632) { // L: 3622
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 26; // L: 3623
				return 1; // L: 3624
			} else {
				return 2; // L: 3626
			}
		} else {
			class295.Interpreter_stringStackSize -= 2; // L: 3619
			return 1; // L: 3620
		}
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(Ljf;I)V",
		garbageValue = "648897355"
	)
	@Export("invalidateWidget")
	static void invalidateWidget(Widget var0) {
		if (var0.cycle == Client.field678) { // L: 11277
			Client.field594[var0.rootIndex] = true; // L: 11278
		}

	} // L: 11280
}
