import java.awt.Component;
import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ar")
@Implements("WorldMapArea")
public class WorldMapArea {
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -63029259
	)
	@Export("id")
	int id;
	@ObfuscatedName("v")
	@Export("internalName")
	String internalName;
	@ObfuscatedName("d")
	@Export("externalName")
	String externalName;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1891033177
	)
	@Export("backGroundColor")
	int backGroundColor;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1386343271
	)
	@Export("zoom")
	int zoom;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	@Export("origin")
	Coord origin;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -861412381
	)
	@Export("regionLowX")
	int regionLowX;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1942318889
	)
	@Export("regionHighX")
	int regionHighX;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1790073795
	)
	@Export("regionLowY")
	int regionLowY;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -407810153
	)
	@Export("regionHighY")
	int regionHighY;
	@ObfuscatedName("s")
	@Export("isMain")
	boolean isMain;
	@ObfuscatedName("b")
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lkx;II)V",
		garbageValue = "-285424184"
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
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lkx;I)Lab;",
		garbageValue = "369407724"
	)
	@Export("readWorldMapSection")
	WorldMapSection readWorldMapSection(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		WorldMapSectionType[] var3 = new WorldMapSectionType[]{WorldMapSectionType.WORLDMAPSECTIONTYPE2, WorldMapSectionType.WORLDMAPSECTIONTYPE3, WorldMapSectionType.WORLDMAPSECTIONTYPE0, WorldMapSectionType.WORLDMAPSECTIONTYPE1}; // L: 43
		WorldMapSectionType var4 = (WorldMapSectionType)InterfaceParent.findEnumerated(var3, var2); // L: 45
		Object var5 = null; // L: 46
		switch(var4.type) { // L: 47
		case 0:
			var5 = new WorldMapSection1(); // L: 58
			break; // L: 59
		case 1:
			var5 = new class51(); // L: 55
			break; // L: 56
		case 2:
			var5 = new WorldMapSection0(); // L: 49
			break;
		case 3:
			var5 = new WorldMapSection2(); // L: 52
			break; // L: 53
		default:
			throw new IllegalStateException(""); // L: 61
		}

		((WorldMapSection)var5).read(var1); // L: 63
		return (WorldMapSection)var5; // L: 64
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "1455116535"
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1715040975"
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
					if (!var5.hasNext()) { // L: 91
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

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "332088974"
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(III)Lhd;",
		garbageValue = "1033497447"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		Iterator var3 = this.sections.iterator(); // L: 108

		WorldMapSection var4;
		do {
			if (!var3.hasNext()) { // L: 115
				return null; // L: 116
			}

			var4 = (WorldMapSection)var3.next(); // L: 109
		} while(!var4.containsPosition(var1, var2)); // L: 111

		return var4.coord(var1, var2); // L: 112
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2087726603"
	)
	@Export("setBounds")
	void setBounds() {
		Iterator var1 = this.sections.iterator(); // L: 120

		while (var1.hasNext()) {
			WorldMapSection var2 = (WorldMapSection)var1.next(); // L: 121
			var2.expandBounds(this); // L: 123
		}

	} // L: 126

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "872580750"
	)
	@Export("getId")
	public int getId() {
		return this.id; // L: 129
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-7"
	)
	@Export("getIsMain")
	public boolean getIsMain() {
		return this.isMain; // L: 133
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1550692471"
	)
	@Export("getInternalName")
	public String getInternalName() {
		return this.internalName; // L: 137
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2036253540"
	)
	@Export("getExternalName")
	public String getExternalName() {
		return this.externalName; // L: 141
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("getBackGroundColor")
	int getBackGroundColor() {
		return this.backGroundColor; // L: 145
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2014656389"
	)
	@Export("getZoom")
	public int getZoom() {
		return this.zoom; // L: 149
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "128"
	)
	@Export("getRegionLowX")
	public int getRegionLowX() {
		return this.regionLowX; // L: 153
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "20"
	)
	@Export("getRegionHighX")
	public int getRegionHighX() {
		return this.regionHighX; // L: 157
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2024807463"
	)
	@Export("getRegionLowY")
	public int getRegionLowY() {
		return this.regionLowY; // L: 161
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1949221943"
	)
	@Export("getRegionHighY")
	public int getRegionHighY() {
		return this.regionHighY; // L: 165
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "759917118"
	)
	@Export("getOriginX")
	public int getOriginX() {
		return this.origin.x; // L: 169
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-13"
	)
	@Export("getOriginPlane")
	public int getOriginPlane() {
		return this.origin.plane; // L: 173
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-51"
	)
	@Export("getOriginY")
	public int getOriginY() {
		return this.origin.y; // L: 177
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Lhd;",
		garbageValue = "-1797620911"
	)
	@Export("getOrigin")
	public Coord getOrigin() {
		return new Coord(this.origin); // L: 181
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "141354959"
	)
	static void method489(Component var0) {
		var0.addMouseListener(MouseHandler.MouseHandler_instance); // L: 37
		var0.addMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 38
		var0.addFocusListener(MouseHandler.MouseHandler_instance); // L: 39
	} // L: 40

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1792034229"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop; // L: 10365
	}
}
