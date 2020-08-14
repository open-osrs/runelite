import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("av")
@Implements("WorldMapSection1")
public class WorldMapSection1 implements WorldMapSection {
	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	@Export("mousedOverWidgetIf1")
	static Widget mousedOverWidgetIf1;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 421699515
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -758111591
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -796724619
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 843613977
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 670440885
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 374420035
	)
	@Export("regionEndY")
	int regionEndY;

	WorldMapSection1() {
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lad;I)V",
		garbageValue = "411670415"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.regionEndX) {
			var1.regionLowX = this.regionEndX;
		}

		if (var1.regionHighX < this.regionEndX) {
			var1.regionHighX = this.regionEndX;
		}

		if (var1.regionLowY > this.regionEndY) {
			var1.regionLowY = this.regionEndY;
		}

		if (var1.regionHighY < this.regionEndY) {
			var1.regionHighY = this.regionEndY;
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "2"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.minPlane + this.planes) {
			return var2 >> 6 == this.regionStartX && var3 >> 6 == this.regionStartY;
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
		return var1 >> 6 == this.regionEndX && var2 >> 6 == this.regionEndY;
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
			int[] var4 = new int[]{var2 + (this.regionEndX * 64 - this.regionStartX * 64), var3 + (this.regionEndY * 64 - this.regionStartY * 64)};
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
			int var3 = this.regionStartX * 64 - this.regionEndX * 64 + var1;
			int var4 = var2 + (this.regionStartY * 64 - this.regionEndY * 64);
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
		this.postRead();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-123"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lic;Ljava/lang/String;Ljava/lang/String;IZI)V",
		garbageValue = "-1968156146"
	)
	public static void method656(AbstractArchive var0, String var1, String var2, int var3, boolean var4) {
		int var5 = var0.getGroupId(var1);
		int var6 = var0.getFileId(var5, var2);
		UserComparator9.method3513(var0, var5, var6, var3, var4);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IZIZI)V",
		garbageValue = "1727413002"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (class13.World_worlds != null) {
			Tiles.doWorldSorting(0, class13.World_worlds.length - 1, var0, var1, var2, var3);
		}

	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1443767280"
	)
	static final void method655(String var0) {
		StringBuilder var10000 = (new StringBuilder()).append(var0);
		Object var10001 = null;
		String var1 = var10000.append(" is already on your ignore list").toString();
		ObjectSound.addGameMessage(30, "", var1);
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "23"
	)
	static void method648(int var0) {
		class169.tempMenuAction = new MenuAction();
		class169.tempMenuAction.param0 = Client.menuArguments1[var0];
		class169.tempMenuAction.param1 = Client.menuArguments2[var0];
		class169.tempMenuAction.opcode = Client.menuOpcodes[var0];
		class169.tempMenuAction.identifier = Client.menuIdentifiers[var0];
		class169.tempMenuAction.action = Client.menuActions[var0];
	}
}
