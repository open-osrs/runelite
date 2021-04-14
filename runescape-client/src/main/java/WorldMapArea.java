import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("eq")
@Implements("WorldMapArea")
public class WorldMapArea {
	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	@Export("scene")
	static Scene scene;
	@ObfuscatedName("hx")
	@ObfuscatedGetter(
		intValue = 1615990339
	)
	@Export("cameraPitch")
	static int cameraPitch;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1514003013
	)
	@Export("id")
	int id;
	@ObfuscatedName("o")
	@Export("internalName")
	String internalName;
	@ObfuscatedName("u")
	@Export("externalName")
	String externalName;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -720115575
	)
	@Export("backGroundColor")
	int backGroundColor;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -297812541
	)
	@Export("zoom")
	int zoom;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lhk;"
	)
	@Export("origin")
	Coord origin;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 904812453
	)
	@Export("regionLowX")
	int regionLowX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 766167871
	)
	@Export("regionHighX")
	int regionHighX;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 832142727
	)
	@Export("regionLowY")
	int regionLowY;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1806584787
	)
	@Export("regionHighY")
	int regionHighY;
	@ObfuscatedName("l")
	@Export("isMain")
	boolean isMain;
	@ObfuscatedName("m")
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
		descriptor = "(Lnu;II)V",
		garbageValue = "747590204"
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
			this.sections.add(this.readWorldMapSection(var1));
		}

		this.setBounds(); // L: 36
	} // L: 37

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)Lfv;",
		garbageValue = "715187393"
	)
	@Export("readWorldMapSection")
	WorldMapSection readWorldMapSection(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 40
		WorldMapSectionType[] var3 = new WorldMapSectionType[]{WorldMapSectionType.WORLDMAPSECTIONTYPE0, WorldMapSectionType.WORLDMAPSECTIONTYPE3, WorldMapSectionType.WORLDMAPSECTIONTYPE2, WorldMapSectionType.WORLDMAPSECTIONTYPE1}; // L: 43
		WorldMapSectionType var4 = (WorldMapSectionType)UserComparator8.findEnumerated(var3, var2); // L: 45
		Object var5 = null; // L: 46
		switch(var4.type) { // L: 47
		case 0:
			var5 = new class147(); // L: 54
			break; // L: 55
		case 1:
			var5 = new WorldMapSection1(); // L: 49
			break;
		case 2:
			var5 = new WorldMapSection2(); // L: 57
			break; // L: 58
		case 3:
			var5 = new WorldMapSection0(); // L: 60
			break;
		default:
			throw new IllegalStateException(""); // L: 52
		}

		((WorldMapSection)var5).read(var1); // L: 63
		return (WorldMapSection)var5; // L: 64
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "1809400826"
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

		return true;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1003463071"
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

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "416531869"
	)
	@Export("position")
	public int[] position(int var1, int var2, int var3) {
		Iterator var4 = this.sections.iterator(); // L: 96

		WorldMapSection var5;
		do {
			if (!var4.hasNext()) { // L: 103
				return null; // L: 104
			}

			var5 = (WorldMapSection)var4.next(); // L: 97
		} while(!var5.containsCoord(var1, var2, var3)); // L: 99

		return var5.getBorderTileLengths(var1, var2, var3); // L: 100
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(III)Lhk;",
		garbageValue = "2101787802"
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
		descriptor = "(I)V",
		garbageValue = "1832411393"
	)
	@Export("setBounds")
	void setBounds() {
		Iterator var1 = this.sections.iterator(); // L: 120

		while (var1.hasNext()) {
			WorldMapSection var2 = (WorldMapSection)var1.next(); // L: 121
			var2.expandBounds(this); // L: 123
		}

	} // L: 126

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2062295342"
	)
	@Export("getId")
	public int getId() {
		return this.id; // L: 129
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "461643784"
	)
	@Export("getIsMain")
	public boolean getIsMain() {
		return this.isMain; // L: 133
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1819862501"
	)
	@Export("getInternalName")
	public String getInternalName() {
		return this.internalName; // L: 137
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-82"
	)
	@Export("getExternalName")
	public String getExternalName() {
		return this.externalName; // L: 141
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "753799862"
	)
	@Export("getBackGroundColor")
	int getBackGroundColor() {
		return this.backGroundColor; // L: 145
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1445982184"
	)
	@Export("getZoom")
	public int getZoom() {
		return this.zoom; // L: 149
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "24"
	)
	@Export("getRegionLowX")
	public int getRegionLowX() {
		return this.regionLowX; // L: 153
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "116"
	)
	@Export("getRegionHighX")
	public int getRegionHighX() {
		return this.regionHighX; // L: 157
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2085770909"
	)
	@Export("getRegionLowY")
	public int getRegionLowY() {
		return this.regionLowY; // L: 161
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1254165829"
	)
	@Export("getRegionHighY")
	public int getRegionHighY() {
		return this.regionHighY; // L: 165
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1410964110"
	)
	@Export("getOriginX")
	public int getOriginX() {
		return this.origin.x; // L: 169
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "4919"
	)
	@Export("getOriginPlane")
	public int getOriginPlane() {
		return this.origin.plane; // L: 173
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "63"
	)
	@Export("getOriginY")
	public int getOriginY() {
		return this.origin.y; // L: 177
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Lhk;",
		garbageValue = "-714822914"
	)
	@Export("getOrigin")
	public Coord getOrigin() {
		return new Coord(this.origin); // L: 181
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Z",
		garbageValue = "-947353982"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		return class21.method316(var0, 10, true); // L: 34
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IB)[B",
		garbageValue = "18"
	)
	@Export("ByteArrayPool_getArray")
	public static synchronized byte[] ByteArrayPool_getArray(int var0) {
		return ByteArrayPool.ByteArrayPool_getArrayBool(var0, false); // L: 72
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(ILcc;ZI)I",
		garbageValue = "-993034647"
	)
	static int method2740(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? FriendSystem.scriptDotWidget : class4.scriptActiveWidget; // L: 1073
		if (var0 == ScriptOpcodes.CC_GETX) { // L: 1074
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.x; // L: 1075
			return 1; // L: 1076
		} else if (var0 == ScriptOpcodes.CC_GETY) { // L: 1078
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.y; // L: 1079
			return 1; // L: 1080
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) { // L: 1082
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.width; // L: 1083
			return 1; // L: 1084
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) { // L: 1086
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.height; // L: 1087
			return 1; // L: 1088
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) { // L: 1090
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1091
			return 1; // L: 1092
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) { // L: 1094
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.parentId; // L: 1095
			return 1; // L: 1096
		} else {
			return 2; // L: 1098
		}
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(Lhu;I)Z",
		garbageValue = "440915192"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden; // L: 11595
	}
}
