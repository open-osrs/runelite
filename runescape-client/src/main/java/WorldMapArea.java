import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
@Implements("WorldMapArea")
public class WorldMapArea {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1597712321
	)
	@Export("id")
	int id;
	@ObfuscatedName("v")
	@Export("internalName")
	String internalName;
	@ObfuscatedName("q")
	@Export("externalName")
	String externalName;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1737833383
	)
	@Export("backGroundColor")
	int backGroundColor;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1942406311
	)
	@Export("zoom")
	int zoom;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("origin")
	Coord origin;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -2103250031
	)
	@Export("regionLowX")
	int regionLowX;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1341200167
	)
	@Export("regionHighX")
	int regionHighX;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 986248981
	)
	@Export("regionLowY")
	int regionLowY;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -360253211
	)
	@Export("regionHighY")
	int regionHighY;
	@ObfuscatedName("s")
	@Export("isMain")
	boolean isMain;
	@ObfuscatedName("t")
	@Export("sections")
	LinkedList sections;

	public WorldMapArea() {
		this.id = -1; // L: 9
		this.backGroundColor = -1;
		this.zoom = -1; // L: 13
		this.origin = null; // L: 14
		this.regionLowX = Integer.MAX_VALUE; // L: 15
		this.regionHighX = 0;
		this.regionLowY = Integer.MAX_VALUE; // L: 17
		this.regionHighY = 0; // L: 18
		this.isMain = false; // L: 19
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqt;II)V",
		garbageValue = "1424101591"
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqt;I)Lih;",
		garbageValue = "2053446291"
	)
	@Export("readWorldMapSection")
	WorldMapSection readWorldMapSection(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 40
		WorldMapSectionType var3 = (WorldMapSectionType)Actor.findEnumerated(WorldMapSectionType.method4950(), var2); // L: 41
		Object var4 = null; // L: 42
		switch(var3.type) { // L: 43
		case 0:
			var4 = new class228(); // L: 48
			break; // L: 49
		case 1:
			var4 = new WorldMapSection2(); // L: 53
			break; // L: 54
		case 2:
			var4 = new WorldMapSection0(); // L: 56
			break;
		case 3:
			var4 = new WorldMapSection1(); // L: 45
			break;
		default:
			throw new IllegalStateException(""); // L: 51
		}

		((WorldMapSection)var4).read(var1); // L: 59
		return (WorldMapSection)var4; // L: 60
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-876642942"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		Iterator var4 = this.sections.iterator(); // L: 64

		WorldMapSection var5;
		do {
			if (!var4.hasNext()) { // L: 71
				return false; // L: 72
			}

			var5 = (WorldMapSection)var4.next(); // L: 65
		} while(!var5.containsCoord(var1, var2, var3)); // L: 67

		return true; // L: 68
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1025417"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		int var3 = var1 / 64; // L: 76
		int var4 = var2 / 64; // L: 77
		if (var3 >= this.regionLowX && var3 <= this.regionHighX) { // L: 78
			if (var4 >= this.regionLowY && var4 <= this.regionHighY) { // L: 79
				Iterator var5 = this.sections.iterator(); // L: 80

				WorldMapSection var6;
				do {
					if (!var5.hasNext()) {
						return false; // L: 88
					}

					var6 = (WorldMapSection)var5.next(); // L: 81
				} while(!var6.containsPosition(var1, var2)); // L: 83

				return true; // L: 84
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-885448620"
	)
	@Export("position")
	public int[] position(int var1, int var2, int var3) {
		Iterator var4 = this.sections.iterator(); // L: 92

		WorldMapSection var5;
		do {
			if (!var4.hasNext()) {
				return null; // L: 100
			}

			var5 = (WorldMapSection)var4.next(); // L: 93
		} while(!var5.containsCoord(var1, var2, var3)); // L: 95

		return var5.getBorderTileLengths(var1, var2, var3); // L: 96
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(III)Lkd;",
		garbageValue = "-1315713782"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		Iterator var3 = this.sections.iterator(); // L: 104

		WorldMapSection var4;
		do {
			if (!var3.hasNext()) {
				return null; // L: 112
			}

			var4 = (WorldMapSection)var3.next(); // L: 105
		} while(!var4.containsPosition(var1, var2)); // L: 107

		return var4.coord(var1, var2); // L: 108
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1353069052"
	)
	@Export("setBounds")
	void setBounds() {
		Iterator var1 = this.sections.iterator(); // L: 116

		while (var1.hasNext()) {
			WorldMapSection var2 = (WorldMapSection)var1.next(); // L: 117
			var2.expandBounds(this); // L: 119
		}

	} // L: 122

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1950741707"
	)
	@Export("getId")
	public int getId() {
		return this.id; // L: 125
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "15"
	)
	@Export("getIsMain")
	public boolean getIsMain() {
		return this.isMain; // L: 129
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1728819039"
	)
	@Export("getInternalName")
	public String getInternalName() {
		return this.internalName; // L: 133
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "123"
	)
	@Export("getExternalName")
	public String getExternalName() {
		return this.externalName; // L: 137
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-410449947"
	)
	@Export("getBackGroundColor")
	int getBackGroundColor() {
		return this.backGroundColor; // L: 141
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1613337186"
	)
	@Export("getZoom")
	public int getZoom() {
		return this.zoom; // L: 145
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-28"
	)
	@Export("getRegionLowX")
	public int getRegionLowX() {
		return this.regionLowX; // L: 149
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1776623593"
	)
	@Export("getRegionHighX")
	public int getRegionHighX() {
		return this.regionHighX; // L: 153
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "50"
	)
	@Export("getRegionLowY")
	public int getRegionLowY() {
		return this.regionLowY; // L: 157
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "47612520"
	)
	@Export("getRegionHighY")
	public int getRegionHighY() {
		return this.regionHighY; // L: 161
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1452541812"
	)
	@Export("getOriginX")
	public int getOriginX() {
		return this.origin.x; // L: 165
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "709733027"
	)
	@Export("getOriginPlane")
	public int getOriginPlane() {
		return this.origin.plane; // L: 169
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "43"
	)
	@Export("getOriginY")
	public int getOriginY() {
		return this.origin.y; // L: 173
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Lkd;",
		garbageValue = "-2060886066"
	)
	@Export("getOrigin")
	public Coord getOrigin() {
		return new Coord(this.origin); // L: 177
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([BZB)Ljava/lang/Object;",
		garbageValue = "-9"
	)
	public static Object method4621(byte[] var0, boolean var1) {
		if (var0 == null) { // L: 7
			return null;
		} else if (var0.length > 136) { // L: 8
			DirectByteArrayCopier var2 = new DirectByteArrayCopier(); // L: 10
			var2.set(var0); // L: 11
			return var2; // L: 12
		} else {
			return var0; // L: 16
		}
	}
}
