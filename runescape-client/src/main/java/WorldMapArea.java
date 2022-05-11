import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hm")
@Implements("WorldMapArea")
public class WorldMapArea {
	@ObfuscatedName("f")
	@Export("formattedOperatingSystemName")
	public static String formattedOperatingSystemName;
	@ObfuscatedName("ao")
	@Export("hasFocus")
	protected static boolean hasFocus;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1777839071
	)
	@Export("id")
	int id;
	@ObfuscatedName("q")
	@Export("internalName")
	String internalName;
	@ObfuscatedName("l")
	@Export("externalName")
	String externalName;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -466670555
	)
	@Export("backGroundColor")
	int backGroundColor;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1573986951
	)
	@Export("zoom")
	int zoom;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("origin")
	Coord origin;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 976938007
	)
	@Export("regionLowX")
	int regionLowX;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -281612569
	)
	@Export("regionHighX")
	int regionHighX;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -711482523
	)
	@Export("regionLowY")
	int regionLowY;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1976100383
	)
	@Export("regionHighY")
	int regionHighY;
	@ObfuscatedName("y")
	@Export("isMain")
	boolean isMain;
	@ObfuscatedName("c")
	@Export("sections")
	LinkedList sections;

	public WorldMapArea() {
		this.id = -1; // L: 9
		this.backGroundColor = -1; // L: 12
		this.zoom = -1; // L: 13
		this.origin = null; // L: 14
		this.regionLowX = Integer.MAX_VALUE; // L: 15
		this.regionHighX = 0; // L: 16
		this.regionLowY = Integer.MAX_VALUE; // L: 17
		this.regionHighY = 0; // L: 18
		this.isMain = false; // L: 19
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpx;IB)V",
		garbageValue = "20"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		this.id = var2; // L: 23
		this.internalName = var1.readStringCp1252NullTerminated(); // L: 24
		this.externalName = var1.readStringCp1252NullTerminated(); // L: 25
		this.origin = new Coord(var1.readInt()); // L: 26
		this.backGroundColor = var1.readInt(); // L: 27
		var1.readUnsignedByte(); // L: 28
		this.isMain = var1.readUnsignedByte() == 1; // L: 29
		this.zoom = var1.readUnsignedByte(); // L: 30
		int var3 = var1.readUnsignedByte(); // L: 31
		this.sections = new LinkedList(); // L: 32

		for (int var4 = 0; var4 < var3; ++var4) { // L: 33
			this.sections.add(this.readWorldMapSection(var1)); // L: 34
		}

		this.setBounds(); // L: 36
	} // L: 37

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lpx;B)Lie;",
		garbageValue = "38"
	)
	@Export("readWorldMapSection")
	WorldMapSection readWorldMapSection(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 40
		WorldMapSectionType[] var3 = new WorldMapSectionType[]{WorldMapSectionType.WORLDMAPSECTIONTYPE0, WorldMapSectionType.WORLDMAPSECTIONTYPE3, WorldMapSectionType.WORLDMAPSECTIONTYPE2, WorldMapSectionType.WORLDMAPSECTIONTYPE1}; // L: 43
		WorldMapSectionType var4 = (WorldMapSectionType)class291.findEnumerated(var3, var2); // L: 45
		Object var5 = null; // L: 46
		switch(var4.type) { // L: 47
		case 0:
			var5 = new WorldMapSection0(); // L: 49
			break;
		case 1:
			var5 = new WorldMapSection2(); // L: 57
			break; // L: 58
		case 2:
			var5 = new class229(); // L: 60
			break;
		case 3:
			var5 = new WorldMapSection1(); // L: 54
			break; // L: 55
		default:
			throw new IllegalStateException(""); // L: 52
		}

		((WorldMapSection)var5).read(var1); // L: 63
		return (WorldMapSection)var5; // L: 64
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "48"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		Iterator var4 = this.sections.iterator(); // L: 68

		WorldMapSection var5;
		do {
			if (!var4.hasNext()) {
				return false; // L: 76
			}

			var5 = (WorldMapSection)var4.next(); // L: 69
		} while(!var5.containsCoord(var1, var2, var3)); // L: 71

		return true; // L: 72
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIS)Z",
		garbageValue = "16574"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		int var3 = var1 / 64; // L: 80
		int var4 = var2 / 64; // L: 81
		if (var3 >= this.regionLowX && var3 <= this.regionHighX) { // L: 82
			if (var4 >= this.regionLowY && var4 <= this.regionHighY) { // L: 83
				Iterator var5 = this.sections.iterator(); // L: 84

				WorldMapSection var6;
				do {
					if (!var5.hasNext()) {
						return false; // L: 92
					}

					var6 = (WorldMapSection)var5.next(); // L: 85
				} while(!var6.containsPosition(var1, var2)); // L: 87

				return true; // L: 88
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "1090356101"
	)
	@Export("position")
	public int[] position(int var1, int var2, int var3) {
		Iterator var4 = this.sections.iterator(); // L: 96

		WorldMapSection var5;
		do {
			if (!var4.hasNext()) {
				return null; // L: 104
			}

			var5 = (WorldMapSection)var4.next(); // L: 97
		} while(!var5.containsCoord(var1, var2, var3)); // L: 99

		return var5.getBorderTileLengths(var1, var2, var3); // L: 100
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(III)Lkd;",
		garbageValue = "634567261"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		Iterator var3 = this.sections.iterator(); // L: 108

		WorldMapSection var4;
		do {
			if (!var3.hasNext()) {
				return null; // L: 116
			}

			var4 = (WorldMapSection)var3.next(); // L: 109
		} while(!var4.containsPosition(var1, var2)); // L: 111

		return var4.coord(var1, var2); // L: 112
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1149525230"
	)
	@Export("setBounds")
	void setBounds() {
		Iterator var1 = this.sections.iterator(); // L: 120

		while (var1.hasNext()) {
			WorldMapSection var2 = (WorldMapSection)var1.next(); // L: 121
			var2.expandBounds(this); // L: 123
		}

	} // L: 126

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1853977483"
	)
	@Export("getId")
	public int getId() {
		return this.id; // L: 129
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "458064679"
	)
	@Export("getIsMain")
	public boolean getIsMain() {
		return this.isMain; // L: 133
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "16"
	)
	@Export("getInternalName")
	public String getInternalName() {
		return this.internalName; // L: 137
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2112752839"
	)
	@Export("getExternalName")
	public String getExternalName() {
		return this.externalName; // L: 141
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "80"
	)
	@Export("getBackGroundColor")
	int getBackGroundColor() {
		return this.backGroundColor; // L: 145
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "40622917"
	)
	@Export("getZoom")
	public int getZoom() {
		return this.zoom; // L: 149
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "160"
	)
	@Export("getRegionLowX")
	public int getRegionLowX() {
		return this.regionLowX; // L: 153
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1655978989"
	)
	@Export("getRegionHighX")
	public int getRegionHighX() {
		return this.regionHighX; // L: 157
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-112"
	)
	@Export("getRegionLowY")
	public int getRegionLowY() {
		return this.regionLowY; // L: 161
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2143670007"
	)
	@Export("getRegionHighY")
	public int getRegionHighY() {
		return this.regionHighY; // L: 165
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-108749497"
	)
	@Export("getOriginX")
	public int getOriginX() {
		return this.origin.x; // L: 169
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1959056800"
	)
	@Export("getOriginPlane")
	public int getOriginPlane() {
		return this.origin.plane; // L: 173
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1472370022"
	)
	@Export("getOriginY")
	public int getOriginY() {
		return this.origin.y; // L: 177
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Lkd;",
		garbageValue = "591229615"
	)
	@Export("getOrigin")
	public Coord getOrigin() {
		return new Coord(this.origin); // L: 181
	}

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "1"
	)
	static void method4514(int var0, int var1) {
		int[] var2 = new int[9]; // L: 1504

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 1505
			int var4 = var3 * 32 + 15 + 128; // L: 1506
			int var5 = class10.method94(var4); // L: 1507
			int var6 = Rasterizer3D.Rasterizer3D_sine[var4]; // L: 1508
			int var8 = var1 - 334; // L: 1511
			if (var8 < 0) { // L: 1512
				var8 = 0;
			} else if (var8 > 100) { // L: 1513
				var8 = 100;
			}

			int var9 = (Client.zoomWidth - Client.zoomHeight) * var8 / 100 + Client.zoomHeight; // L: 1514
			int var7 = var9 * var5 / 256; // L: 1515
			var2[var3] = var7 * var6 >> 16; // L: 1518
		}

		Scene.Scene_buildVisiblityMap(var2, 500, 800, var0 * 334 / var1, 334); // L: 1520
	} // L: 1521
}
