import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
@Implements("WorldMapArea")
public class WorldMapArea {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1768774525
	)
	@Export("id")
	int id;
	@ObfuscatedName("o")
	@Export("internalName")
	String internalName;
	@ObfuscatedName("h")
	@Export("externalName")
	String externalName;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 204385687
	)
	@Export("backGroundColor")
	int backGroundColor;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 187513979
	)
	@Export("zoom")
	int zoom;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("origin")
	Coord origin;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 892660861
	)
	@Export("regionLowX")
	int regionLowX;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 819856267
	)
	@Export("regionHighX")
	int regionHighX;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1961417227
	)
	@Export("regionLowY")
	int regionLowY;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -439163167
	)
	@Export("regionHighY")
	int regionHighY;
	@ObfuscatedName("k")
	@Export("isMain")
	boolean isMain;
	@ObfuscatedName("x")
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpd;II)V",
		garbageValue = "-1643256237"
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
		int var3 = var1.readUnsignedByte();
		this.sections = new LinkedList();

		for (int var4 = 0; var4 < var3; ++var4) {
			this.sections.add(this.readWorldMapSection(var1));
		}

		this.setBounds();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpd;B)Lik;",
		garbageValue = "-51"
	)
	@Export("readWorldMapSection")
	WorldMapSection readWorldMapSection(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		WorldMapSectionType var3 = (WorldMapSectionType)ChatChannel.findEnumerated(WorldMapSectionType.method4949(), var2);
		Object var4 = null;
		switch(var3.type) {
		case 0:
			var4 = new class229();
			break;
		case 1:
			var4 = new WorldMapSection0(); // L: 50
			break;
		case 2:
			var4 = new WorldMapSection2(); // L: 56
			break;
		case 3:
			var4 = new WorldMapSection1(); // L: 53
			break; // L: 54
		default:
			throw new IllegalStateException(""); // L: 48
		}

		((WorldMapSection)var4).read(var1); // L: 59
		return (WorldMapSection)var4; // L: 60
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "-79"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		Iterator var4 = this.sections.iterator(); // L: 64

		WorldMapSection var5;
		do {
			if (!var4.hasNext()) {
				return false; // L: 72
			}

			var5 = (WorldMapSection)var4.next(); // L: 65
		} while(!var5.containsCoord(var1, var2, var3)); // L: 67

		return true; // L: 68
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-77"
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "-25"
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(III)Lko;",
		garbageValue = "-2002328673"
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

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-963481641"
	)
	@Export("setBounds")
	void setBounds() {
		Iterator var1 = this.sections.iterator(); // L: 116

		while (var1.hasNext()) {
			WorldMapSection var2 = (WorldMapSection)var1.next(); // L: 117
			var2.expandBounds(this); // L: 119
		}

	} // L: 122

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "128"
	)
	@Export("getId")
	public int getId() {
		return this.id; // L: 125
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "856188829"
	)
	@Export("getIsMain")
	public boolean getIsMain() {
		return this.isMain; // L: 129
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1814116650"
	)
	@Export("getInternalName")
	public String getInternalName() {
		return this.internalName; // L: 133
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "107"
	)
	@Export("getExternalName")
	public String getExternalName() {
		return this.externalName; // L: 137
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2041021120"
	)
	@Export("getBackGroundColor")
	int getBackGroundColor() {
		return this.backGroundColor; // L: 141
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-35714966"
	)
	@Export("getZoom")
	public int getZoom() {
		return this.zoom; // L: 145
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1069945240"
	)
	@Export("getRegionLowX")
	public int getRegionLowX() {
		return this.regionLowX; // L: 149
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1823486423"
	)
	@Export("getRegionHighX")
	public int getRegionHighX() {
		return this.regionHighX; // L: 153
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1605388793"
	)
	@Export("getRegionLowY")
	public int getRegionLowY() {
		return this.regionLowY; // L: 157
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1164673789"
	)
	@Export("getRegionHighY")
	public int getRegionHighY() {
		return this.regionHighY; // L: 161
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "480137512"
	)
	@Export("getOriginX")
	public int getOriginX() {
		return this.origin.x; // L: 165
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1377230464"
	)
	@Export("getOriginPlane")
	public int getOriginPlane() {
		return this.origin.plane; // L: 169
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-27"
	)
	@Export("getOriginY")
	public int getOriginY() {
		return this.origin.y; // L: 173
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Lko;",
		garbageValue = "-1856274219"
	)
	@Export("getOrigin")
	public Coord getOrigin() {
		return new Coord(this.origin); // L: 177
	}

	@ObfuscatedName("o")
	public static String method4648(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) { // L: 31
			if (0L == var0 % 37L) { // L: 32
				return null;
			} else {
				int var2 = 0; // L: 33

				for (long var3 = var0; 0L != var3; var3 /= 37L) { // L: 34 35 37
					++var2; // L: 36
				}

				StringBuilder var5 = new StringBuilder(var2); // L: 39

				while (var0 != 0L) { // L: 40
					long var6 = var0; // L: 41
					var0 /= 37L; // L: 42
					var5.append(class349.base37Table[(int)(var6 - 37L * var0)]); // L: 43
				}

				return var5.reverse().toString(); // L: 45
			}
		} else {
			return null;
		}
	}
}
