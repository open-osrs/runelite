import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("am")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 2038842267
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -469390903
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1406202611
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1926246543
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -950715137
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1777420965
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1453055839
	)
	int field221;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 83876345
	)
	int field215;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -798390703
	)
	int field223;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -69028415
	)
	int field224;

	WorldMapSection2() {
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lad;I)V",
		garbageValue = "411670415"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field221) {
			var1.regionLowX = this.field221;
		}

		if (var1.regionHighX < this.field223) {
			var1.regionHighX = this.field223;
		}

		if (var1.regionLowY > this.field215) {
			var1.regionLowY = this.field215;
		}

		if (var1.regionHighY < this.field224) {
			var1.regionHighY = this.field224;
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "2"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) {
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "48"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field221 && var1 >> 6 <= this.field223 && var2 >> 6 >= this.field215 && var2 >> 6 <= this.field224;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "459340529"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{var2 + (this.field221 * 64 - this.regionStartX * 64), var3 + (this.field215 * 64 - this.regionStartY * 64)};
			return var4;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(III)Lhg;",
		garbageValue = "1240901536"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.regionStartX * 64 - this.field221 * 64 + var1;
			int var4 = var2 + (this.regionStartY * 64 - this.field215 * 64);
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lkn;B)V",
		garbageValue = "0"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort();
		this.regionStartY = var1.readUnsignedShort();
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort();
		this.field221 = var1.readUnsignedShort();
		this.field215 = var1.readUnsignedShort();
		this.field223 = var1.readUnsignedShort();
		this.field224 = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "4206"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2012901203"
	)
	@Export("getEntityCountUnderMouse")
	public static int getEntityCountUnderMouse() {
		return ViewportMouse.ViewportMouse_entityCount;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "926990190"
	)
	static void method398() {
		Login.worldSelectOpen = false;
		Login.leftTitleSprite.drawAt(Login.xPadding, 0);
		ItemContainer.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
		Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18);
	}
}
