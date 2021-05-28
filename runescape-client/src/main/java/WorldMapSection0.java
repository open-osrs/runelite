import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	@Export("loginType")
	static LoginType loginType;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1266673559
	)
	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 36841939
	)
	@Export("newZ")
	int newZ;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1295466191
	)
	@Export("oldX")
	int oldX;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -468293811
	)
	@Export("oldY")
	int oldY;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -336136429
	)
	@Export("newX")
	int newX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -792173003
	)
	@Export("newY")
	int newY;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 241806671
	)
	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1800377871
	)
	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 2078535785
	)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1891382951
	)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -833437573
	)
	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -2027622395
	)
	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1314551747
	)
	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -2008874357
	)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	} // L: 22

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lfo;I)V",
		garbageValue = "1120913212"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.newX) { // L: 25
			var1.regionLowX = this.newX;
		}

		if (var1.regionHighX < this.newX) {
			var1.regionHighX = this.newX;
		}

		if (var1.regionLowY > this.newY) {
			var1.regionLowY = this.newY;
		}

		if (var1.regionHighY < this.newY) {
			var1.regionHighY = this.newY;
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "264048682"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.oldZ + this.newZ) { // L: 32
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7; // L: 35
		} else {
			return false; // L: 33
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-11"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7; // L: 39
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "1943891890"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 43
			return null;
		} else {
			int[] var4 = new int[]{var2 + (this.newX * 64 - this.oldX * 64) + (this.newChunkXLow * 8 - this.oldChunkXLow * 8), var3 + (this.newY * 64 - this.oldY * 64) + (this.newChunkYLow * 8 - this.oldChunkYLow * 8)};
			return var4;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(III)Lii;",
		garbageValue = "691158162"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 53
			return null;
		} else {
			int var3 = this.oldX * 64 - this.newX * 64 + (this.oldChunkXLow * 8 - this.newChunkXLow * 8) + var1; // L: 56
			int var4 = var2 + (this.oldY * 64 - this.newY * 64) + (this.oldChunkYLow * 8 - this.newChunkYLow * 8);
			return new Coord(this.oldZ, var3, var4);
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-1138667895"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.oldZ = var1.readUnsignedByte(); // L: 62
		this.newZ = var1.readUnsignedByte(); // L: 63
		this.oldX = var1.readUnsignedShort(); // L: 64
		this.oldChunkXLow = var1.readUnsignedByte(); // L: 65
		this.oldChunkXHigh = var1.readUnsignedByte(); // L: 66
		this.oldY = var1.readUnsignedShort(); // L: 67
		this.oldChunkYLow = var1.readUnsignedByte(); // L: 68
		this.oldChunkYHigh = var1.readUnsignedByte(); // L: 69
		this.newX = var1.readUnsignedShort(); // L: 70
		this.newChunkXLow = var1.readUnsignedByte(); // L: 71
		this.newChunkXHigh = var1.readUnsignedByte(); // L: 72
		this.newY = var1.readUnsignedShort(); // L: 73
		this.newChunkYLow = var1.readUnsignedByte(); // L: 74
		this.newChunkYHigh = var1.readUnsignedByte(); // L: 75
		this.postRead(); // L: 76
	} // L: 77

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1517456697"
	)
	@Export("postRead")
	void postRead() {
	} // L: 79

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "12620"
	)
	static int method3590(int var0, int var1) {
		if (var0 == -2) { // L: 15
			return 12345678;
		} else if (var0 == -1) { // L: 16
			if (var1 < 0) { // L: 17
				var1 = 0; // L: 18
			} else if (var1 > 127) { // L: 20
				var1 = 127; // L: 21
			}

			var1 = 127 - var1; // L: 23
			return var1; // L: 24
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 26
			if (var1 < 2) { // L: 27
				var1 = 2;
			} else if (var1 > 126) { // L: 28
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 29
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "-2020954619"
	)
	public static String method3589(CharSequence var0) {
		long var3 = 0L; // L: 44
		int var5 = var0.length(); // L: 45

		for (int var6 = 0; var6 < var5; ++var6) { // L: 46
			var3 *= 37L; // L: 47
			char var7 = var0.charAt(var6); // L: 48
			if (var7 >= 'A' && var7 <= 'Z') { // L: 49
				var3 += (long)(var7 + 1 - 65);
			} else if (var7 >= 'a' && var7 <= 'z') { // L: 50
				var3 += (long)(var7 + 1 - 97);
			} else if (var7 >= '0' && var7 <= '9') {
				var3 += (long)(var7 + 27 - 48); // L: 51
			}

			if (var3 >= 177917621779460413L) { // L: 52
				break;
			}
		}

		while (var3 % 37L == 0L && var3 != 0L) { // L: 54
			var3 /= 37L;
		}

		String var8 = class258.base37DecodeLong(var3); // L: 57
		if (var8 == null) { // L: 58
			var8 = "";
		}

		return var8; // L: 59
	}
}
