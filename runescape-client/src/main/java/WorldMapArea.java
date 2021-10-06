import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
@Implements("WorldMapArea")
public class WorldMapArea {
	@ObfuscatedName("gc")
	@ObfuscatedGetter(
		intValue = 334389247
	)
	static int field2053;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1151523411
	)
	@Export("id")
	int id;
	@ObfuscatedName("q")
	@Export("internalName")
	String internalName;
	@ObfuscatedName("f")
	@Export("externalName")
	String externalName;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1870281145
	)
	@Export("backGroundColor")
	int backGroundColor;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1005337785
	)
	@Export("zoom")
	int zoom;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("origin")
	Coord origin;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -2031091247
	)
	@Export("regionLowX")
	int regionLowX;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 237078907
	)
	@Export("regionHighX")
	int regionHighX;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -992415669
	)
	@Export("regionLowY")
	int regionLowY;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -94527557
	)
	@Export("regionHighY")
	int regionHighY;
	@ObfuscatedName("y")
	@Export("isMain")
	boolean isMain;
	@ObfuscatedName("w")
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lot;IB)V",
		garbageValue = "-21"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		this.id = var2;
		this.internalName = var1.readStringCp1252NullTerminated();
		this.externalName = var1.readStringCp1252NullTerminated();
		this.origin = new Coord(var1.readInt());
		this.backGroundColor = var1.readInt();
		var1.readUnsignedByte();
		this.isMain = var1.readUnsignedByte() == 1;
		this.zoom = var1.readUnsignedByte();
		int var3 = var1.readUnsignedByte();
		this.sections = new LinkedList();

		for (int var4 = 0; var4 < var3; ++var4) {
			this.sections.add(this.readWorldMapSection(var1));
		}

		this.setBounds();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lot;B)Lgl;",
		garbageValue = "1"
	)
	@Export("readWorldMapSection")
	WorldMapSection readWorldMapSection(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		WorldMapSectionType[] var3 = new WorldMapSectionType[]{WorldMapSectionType.WORLDMAPSECTIONTYPE2, WorldMapSectionType.WORLDMAPSECTIONTYPE1, WorldMapSectionType.WORLDMAPSECTIONTYPE3, WorldMapSectionType.WORLDMAPSECTIONTYPE0};
		WorldMapSectionType var4 = (WorldMapSectionType)class128.findEnumerated(var3, var2);
		Object var5 = null;
		switch(var4.type) {
		case 0:
			var5 = new class184();
			break;
		case 1:
			var5 = new WorldMapSection1();
			break;
		case 2:
			var5 = new WorldMapSection0();
			break;
		case 3:
			var5 = new WorldMapSection2();
			break;
		default:
			throw new IllegalStateException("");
		}

		((WorldMapSection)var5).read(var1);
		return (WorldMapSection)var5;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "668263956"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		Iterator var4 = this.sections.iterator();

		WorldMapSection var5;
		do {
			if (!var4.hasNext()) {
				return false;
			}

			var5 = (WorldMapSection)var4.next();
		} while(!var5.containsCoord(var1, var2, var3));

		return true;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1626377450"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		int var3 = var1 / 64;
		int var4 = var2 / 64;
		if (var3 >= this.regionLowX && var3 <= this.regionHighX) {
			if (var4 >= this.regionLowY && var4 <= this.regionHighY) {
				Iterator var5 = this.sections.iterator();

				WorldMapSection var6;
				do {
					if (!var5.hasNext()) {
						return false;
					}

					var6 = (WorldMapSection)var5.next();
				} while(!var6.containsPosition(var1, var2));

				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-1387557690"
	)
	@Export("position")
	public int[] position(int var1, int var2, int var3) {
		Iterator var4 = this.sections.iterator();

		WorldMapSection var5;
		do {
			if (!var4.hasNext()) {
				return null;
			}

			var5 = (WorldMapSection)var4.next();
		} while(!var5.containsCoord(var1, var2, var3));

		return var5.getBorderTileLengths(var1, var2, var3);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(III)Lic;",
		garbageValue = "1153813181"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		Iterator var3 = this.sections.iterator();

		WorldMapSection var4;
		do {
			if (!var3.hasNext()) {
				return null;
			}

			var4 = (WorldMapSection)var3.next();
		} while(!var4.containsPosition(var1, var2));

		return var4.coord(var1, var2);
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "557053872"
	)
	@Export("setBounds")
	void setBounds() {
		Iterator var1 = this.sections.iterator();

		while (var1.hasNext()) {
			WorldMapSection var2 = (WorldMapSection)var1.next();
			var2.expandBounds(this);
		}

	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2094198480"
	)
	@Export("getId")
	public int getId() {
		return this.id;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "13"
	)
	@Export("getIsMain")
	public boolean getIsMain() {
		return this.isMain;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1549460192"
	)
	@Export("getInternalName")
	public String getInternalName() {
		return this.internalName;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "539428715"
	)
	@Export("getExternalName")
	public String getExternalName() {
		return this.externalName;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("getBackGroundColor")
	int getBackGroundColor() {
		return this.backGroundColor;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-468887944"
	)
	@Export("getZoom")
	public int getZoom() {
		return this.zoom;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1837285801"
	)
	@Export("getRegionLowX")
	public int getRegionLowX() {
		return this.regionLowX;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "895947812"
	)
	@Export("getRegionHighX")
	public int getRegionHighX() {
		return this.regionHighX;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1917929622"
	)
	@Export("getRegionLowY")
	public int getRegionLowY() {
		return this.regionLowY;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1966642948"
	)
	@Export("getRegionHighY")
	public int getRegionHighY() {
		return this.regionHighY;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2055677745"
	)
	@Export("getOriginX")
	public int getOriginX() {
		return this.origin.x;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-15"
	)
	@Export("getOriginPlane")
	public int getOriginPlane() {
		return this.origin.plane;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1154509313"
	)
	@Export("getOriginY")
	public int getOriginY() {
		return this.origin.y;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Lic;",
		garbageValue = "-12"
	)
	@Export("getOrigin")
	public Coord getOrigin() {
		return new Coord(this.origin);
	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(ZLoy;I)V",
		garbageValue = "-254909194"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		if (!Client.isInInstance) {
			int var2 = var1.method6933();
			var3 = var1.readUnsignedShort();
			var4 = var1.readUnsignedShort();
			ModeWhere.xteaKeys = new int[var4][4];

			for (var5 = 0; var5 < var4; ++var5) {
				for (var6 = 0; var6 < 4; ++var6) {
					ModeWhere.xteaKeys[var5][var6] = var1.readInt();
				}
			}

			class129.regions = new int[var4];
			Canvas.regionMapArchiveIds = new int[var4];
			GrandExchangeOfferTotalQuantityComparator.regionLandArchiveIds = new int[var4];
			class28.regionLandArchives = new byte[var4][];
			Client.regionMapArchives = new byte[var4][];
			boolean var16 = false;
			if (Client.field540) {
				if ((var2 / 8 == 48 || var2 / 8 == 49) && var3 / 8 == 48) {
					var16 = true;
				}

				if (var2 / 8 == 48 && var3 / 8 == 148) {
					var16 = true;
				}
			}

			var4 = 0;

			for (var6 = (var2 - 6) / 8; var6 <= (var2 + 6) / 8; ++var6) {
				for (var7 = (var3 - 6) / 8; var7 <= (var3 + 6) / 8; ++var7) {
					var8 = var7 + (var6 << 8);
					if (!var16 || var7 != 49 && var7 != 149 && var7 != 147 && var6 != 50 && (var6 != 49 || var7 != 47)) {
						class129.regions[var4] = var8;
						Canvas.regionMapArchiveIds[var4] = ApproximateRouteStrategy.archive5.getGroupId("m" + var6 + "_" + var7);
						GrandExchangeOfferTotalQuantityComparator.regionLandArchiveIds[var4] = ApproximateRouteStrategy.archive5.getGroupId("l" + var6 + "_" + var7);
						++var4;
					}
				}
			}

			DesktopPlatformInfoProvider.method6380(var2, var3, true);
		} else {
			boolean var15 = var1.method6926() == 1;
			var3 = var1.method6933();
			var4 = var1.readUnsignedShort();
			var5 = var1.readUnsignedShort();
			var1.importIndex();

			int var9;
			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = var1.readBits(1);
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26);
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1;
						}
					}
				}
			}

			var1.exportIndex();
			ModeWhere.xteaKeys = new int[var5][4];

			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					ModeWhere.xteaKeys[var6][var7] = var1.readInt();
				}
			}

			class129.regions = new int[var5];
			Canvas.regionMapArchiveIds = new int[var5];
			GrandExchangeOfferTotalQuantityComparator.regionLandArchiveIds = new int[var5];
			class28.regionLandArchives = new byte[var5][];
			Client.regionMapArchives = new byte[var5][];
			var5 = 0;

			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = Client.instanceChunkTemplates[var6][var7][var8];
						if (var9 != -1) {
							int var10 = var9 >> 14 & 1023;
							int var11 = var9 >> 3 & 2047;
							int var12 = (var10 / 8 << 8) + var11 / 8;

							int var13;
							for (var13 = 0; var13 < var5; ++var13) {
								if (class129.regions[var13] == var12) {
									var12 = -1;
									break;
								}
							}

							if (var12 != -1) {
								class129.regions[var5] = var12;
								var13 = var12 >> 8 & 255;
								int var14 = var12 & 255;
								Canvas.regionMapArchiveIds[var5] = ApproximateRouteStrategy.archive5.getGroupId("m" + var13 + "_" + var14);
								GrandExchangeOfferTotalQuantityComparator.regionLandArchiveIds[var5] = ApproximateRouteStrategy.archive5.getGroupId("l" + var13 + "_" + var14);
								++var5;
							}
						}
					}
				}
			}

			DesktopPlatformInfoProvider.method6380(var4, var3, !var15);
		}

	}
}
