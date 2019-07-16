import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ag")
@Implements("WorldMapArea")
public class WorldMapArea {
	@ObfuscatedName("rc")
	@ObfuscatedSignature(
		signature = "Lbh;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("eq")
	@ObfuscatedGetter(
		intValue = -256520591
	)
	@Export("port2")
	static int port2;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1232579503
	)
	@Export("id")
	int id;
	@ObfuscatedName("f")
	@Export("internalName")
	String internalName;
	@ObfuscatedName("q")
	@Export("externalName")
	String externalName;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 986239133
	)
	@Export("backGroundColor")
	int backGroundColor;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 196514055
	)
	@Export("zoom")
	int zoom;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lhu;"
	)
	@Export("origin")
	Coord origin;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1238532539
	)
	@Export("regionLowX")
	int regionLowX;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 225384859
	)
	@Export("regionHighX")
	int regionHighX;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 963380367
	)
	@Export("regionLowY")
	int regionLowY;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1025105175
	)
	@Export("regionHighY")
	int regionHighY;
	@ObfuscatedName("d")
	@Export("isMain")
	boolean isMain;
	@ObfuscatedName("k")
	@Export("sections")
	LinkedList sections;

	public WorldMapArea() {
		this.id = -1;
		this.backGroundColor = -1;
		this.zoom = -1;
		this.origin = null;
		this.regionLowX = Integer.MAX_VALUE;
		this.regionHighX = 0;
		this.regionLowY = Integer.MAX_VALUE;
		this.regionHighY = 0;
		this.isMain = false;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Lgr;II)V",
		garbageValue = "1854512327"
	)
	@Export("read")
	public void read(Buffer detailsBuffer, int fileId) {
		this.id = fileId;
		this.internalName = detailsBuffer.readStringCp1252NullTerminated();
		this.externalName = detailsBuffer.readStringCp1252NullTerminated();
		this.origin = new Coord(detailsBuffer.readInt());
		this.backGroundColor = detailsBuffer.readInt();
		detailsBuffer.readUnsignedByte();
		this.isMain = detailsBuffer.readUnsignedByte() == 1;
		this.zoom = detailsBuffer.readUnsignedByte();
		int var3 = detailsBuffer.readUnsignedByte();
		this.sections = new LinkedList();

		for (int var4 = 0; var4 < var3; ++var4) {
			this.sections.add(this.readWorldMapSection(detailsBuffer));
		}

		this.setBounds();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lgr;S)Lab;",
		garbageValue = "-13154"
	)
	@Export("readWorldMapSection")
	WorldMapSection readWorldMapSection(Buffer detailsBuffer) {
		int var2 = detailsBuffer.readUnsignedByte();
		WorldMapSectionType[] var3 = new WorldMapSectionType[]{WorldMapSectionType.WORLDMAPSECTIONTYPE1, WorldMapSectionType.WORLDMAPSECTIONTYPE3, WorldMapSectionType.WORLDMAPSECTIONTYPE0, WorldMapSectionType.WORLDMAPSECTIONTYPE2};
		WorldMapSectionType var4 = (WorldMapSectionType)ScriptFrame.findEnumerated(var3, var2);
		Object var5 = null;
		switch(var4.type) {
		case 0:
			var5 = new WorldMapSection1();
			break;
		case 1:
			var5 = new WorldMapSection2();
			break;
		case 2:
			var5 = new WorldMapSection3();
			break;
		case 3:
			var5 = new WorldMapSection0();
			break;
		default:
			throw new IllegalStateException("");
		}

		((WorldMapSection)var5).read(detailsBuffer);
		return (WorldMapSection)var5;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(IIII)Z",
		garbageValue = "1843012457"
	)
	@Export("containsCoord")
	public boolean containsCoord(int plane, int x, int y) {
		Iterator var4 = this.sections.iterator();

		while (var4.hasNext()) {
			WorldMapSection var5 = (WorldMapSection)var4.next();
			if (var5.containsCoord(plane, x, y)) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(III)Z",
		garbageValue = "-693447297"
	)
	@Export("containsPosition")
	public boolean containsPosition(int x, int y) {
		int var3 = x / 64;
		int var4 = y / 64;
		if (var3 >= this.regionLowX && var3 <= this.regionHighX) {
			if (var4 >= this.regionLowY && var4 <= this.regionHighY) {
				Iterator var5 = this.sections.iterator();

				while (var5.hasNext()) {
					WorldMapSection var6 = (WorldMapSection)var5.next();
					if (var6.containsPosition(x, y)) {
						return true;
					}
				}

				return false;
			}
			return false;
		}
		return false;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(IIII)[I",
		garbageValue = "745399916"
	)
	@Export("position")
	public int[] position(int plane, int x, int y) {
		Iterator var4 = this.sections.iterator();

		while (var4.hasNext()) {
			WorldMapSection var5 = (WorldMapSection)var4.next();
			if (var5.containsCoord(plane, x, y)) {
				return var5.getBorderTileLengths(plane, x, y);
			}
		}

		return null;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(III)Lhu;",
		garbageValue = "1509069978"
	)
	@Export("coord")
	public Coord coord(int x, int y) {
		Iterator var3 = this.sections.iterator();

		while (var3.hasNext()) {
			WorldMapSection var4 = (WorldMapSection)var3.next();
			if (var4.containsPosition(x, y)) {
				return var4.coord(x, y);
			}
		}

		return null;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-17"
	)
	@Export("setBounds")
	void setBounds() {
		Iterator var1 = this.sections.iterator();

		while (var1.hasNext()) {
			WorldMapSection var2 = (WorldMapSection)var1.next();
			var2.expandBounds(this);
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-628294476"
	)
	@Export("getId")
	public int getId() {
		return this.id;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "-39"
	)
	@Export("getIsMain")
	public boolean getIsMain() {
		return this.isMain;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(B)Ljava/lang/String;",
		garbageValue = "-65"
	)
	@Export("getInternalName")
	public String getInternalName() {
		return this.internalName;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(B)Ljava/lang/String;",
		garbageValue = "-66"
	)
	@Export("getExternalName")
	public String getExternalName() {
		return this.externalName;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1657905623"
	)
	@Export("getBackGroundColor")
	int getBackGroundColor() {
		return this.backGroundColor;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-641284417"
	)
	@Export("getZoom")
	public int getZoom() {
		return this.zoom;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "-18"
	)
	@Export("getRegionLowX")
	public int getRegionLowX() {
		return this.regionLowX;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "0"
	)
	@Export("getRegionHighX")
	public int getRegionHighX() {
		return this.regionHighX;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "272992390"
	)
	@Export("getRegionLowY")
	public int getRegionLowY() {
		return this.regionLowY;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1621710159"
	)
	@Export("getRegionHighY")
	public int getRegionHighY() {
		return this.regionHighY;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "5"
	)
	@Export("getOriginX")
	public int getOriginX() {
		return this.origin.x;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1875921633"
	)
	@Export("getOriginPlane")
	public int getOriginPlane() {
		return this.origin.plane;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-135283879"
	)
	@Export("getOriginY")
	public int getOriginY() {
		return this.origin.y;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(I)Lhu;",
		garbageValue = "-1411761003"
	)
	@Export("getOrigin")
	public Coord getOrigin() {
		return new Coord(this.origin);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(III)I",
		garbageValue = "-1490951132"
	)
	static int method427(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		}
		if (var0 == -1) {
			if (var1 < 0) {
				var1 = 0;
			} else if (var1 > 127) {
				var1 = 127;
			}

			var1 = 127 - var1;
			return var1;
		}
		var1 = (var0 & 127) * var1 / 128;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-26"
	)
	static void method428() {
		if (Client.oculusOrbState == 1) {
			Client.field199 = true;
		}

	}
}
