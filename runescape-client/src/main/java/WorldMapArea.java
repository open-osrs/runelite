import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ak")
@Implements("WorldMapArea")
public class WorldMapArea {
	@ObfuscatedName("lx")
	@ObfuscatedGetter(
		intValue = -654673941
	)
	@Export("menuY")
	static int menuY;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1009159255
	)
	@Export("id")
	int id;
	@ObfuscatedName("b")
	@Export("internalName")
	String internalName;
	@ObfuscatedName("l")
	@Export("externalName")
	String externalName;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 519204621
	)
	@Export("backGroundColor")
	int backGroundColor;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1290828579
	)
	@Export("zoom")
	int zoom;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("origin")
	Coord origin;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1500260549
	)
	@Export("regionLowX")
	int regionLowX;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1947269635
	)
	@Export("regionHighX")
	int regionHighX;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1494847727
	)
	@Export("regionLowY")
	int regionLowY;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -255736363
	)
	@Export("regionHighY")
	int regionHighY;
	@ObfuscatedName("e")
	@Export("isMain")
	boolean isMain;
	@ObfuscatedName("o")
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lkb;II)V",
		garbageValue = "1783204022"
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

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lkb;I)Las;",
		garbageValue = "1469324380"
	)
	@Export("readWorldMapSection")
	WorldMapSection readWorldMapSection(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 40
		WorldMapSectionType[] var3 = new WorldMapSectionType[]{WorldMapSectionType.WORLDMAPSECTIONTYPE3, WorldMapSectionType.WORLDMAPSECTIONTYPE0, WorldMapSectionType.WORLDMAPSECTIONTYPE2, WorldMapSectionType.WORLDMAPSECTIONTYPE1}; // L: 43
		WorldMapSectionType var4 = (WorldMapSectionType)class195.findEnumerated(var3, var2); // L: 45
		Object var5 = null; // L: 46
		switch(var4.type) { // L: 47
		case 0:
			var5 = new WorldMapSection3(); // L: 52
			break; // L: 53
		case 1:
			var5 = new WorldMapSection0(); // L: 55
			break; // L: 56
		case 2:
			var5 = new WorldMapSection2(); // L: 58
			break; // L: 59
		case 3:
			var5 = new WorldMapSection1(); // L: 49
			break;
		default:
			throw new IllegalStateException(""); // L: 61
		}

		((WorldMapSection)var5).read(var1); // L: 63
		return (WorldMapSection)var5; // L: 64
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "1894749665"
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "125"
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

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "1010192538"
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)Lhw;",
		garbageValue = "1409626540"
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "106"
	)
	@Export("setBounds")
	void setBounds() {
		Iterator var1 = this.sections.iterator(); // L: 120

		while (var1.hasNext()) {
			WorldMapSection var2 = (WorldMapSection)var1.next(); // L: 121
			var2.expandBounds(this); // L: 123
		}

	} // L: 126

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-101"
	)
	@Export("getId")
	public int getId() {
		return this.id; // L: 129
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "279642546"
	)
	@Export("getIsMain")
	public boolean getIsMain() {
		return this.isMain; // L: 133
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-4"
	)
	@Export("getInternalName")
	public String getInternalName() {
		return this.internalName; // L: 137
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1313308687"
	)
	@Export("getExternalName")
	public String getExternalName() {
		return this.externalName; // L: 141
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "443425895"
	)
	@Export("getBackGroundColor")
	int getBackGroundColor() {
		return this.backGroundColor; // L: 145
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-61"
	)
	@Export("getZoom")
	public int getZoom() {
		return this.zoom; // L: 149
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1743240328"
	)
	@Export("getRegionLowX")
	public int getRegionLowX() {
		return this.regionLowX; // L: 153
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1186709723"
	)
	@Export("getRegionHighX")
	public int getRegionHighX() {
		return this.regionHighX; // L: 157
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-192109314"
	)
	@Export("getRegionLowY")
	public int getRegionLowY() {
		return this.regionLowY; // L: 161
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-288224716"
	)
	@Export("getRegionHighY")
	public int getRegionHighY() {
		return this.regionHighY; // L: 165
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-122"
	)
	@Export("getOriginX")
	public int getOriginX() {
		return this.origin.x; // L: 169
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2063856409"
	)
	@Export("getOriginPlane")
	public int getOriginPlane() {
		return this.origin.plane; // L: 173
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "575879323"
	)
	@Export("getOriginY")
	public int getOriginY() {
		return this.origin.y; // L: 177
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Lhw;",
		garbageValue = "1845506335"
	)
	@Export("getOrigin")
	public Coord getOrigin() {
		return new Coord(this.origin); // L: 181
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1232455466"
	)
	static final void method506(String var0) {
		StringBuilder var10000 = new StringBuilder();
		Object var10001 = null; // L: 195
		var10000 = var10000.append("Please remove ").append(var0);
		var10001 = null;
		String var1 = var10000.append(" from your friend list first").toString();
		DevicePcmPlayerProvider.addGameMessage(30, "", var1); // L: 197
	} // L: 199

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILco;ZI)I",
		garbageValue = "852690937"
	)
	static int method511(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) { // L: 3185
			Client.logoutTimer = 250; // L: 3186
			return 1; // L: 3187
		} else {
			return 2; // L: 3189
		}
	}

	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "896332793"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		class89.logOut(); // L: 3007
		switch(var0) { // L: 3008
		case 1:
			Login.loginIndex = 24; // L: 3017
			GrandExchangeOfferNameComparator.setLoginResponseString("", "You were disconnected from the server.", ""); // L: 3018
			break;
		case 2:
			MenuAction.method2171(); // L: 3011
		}

	} // L: 3023
}
