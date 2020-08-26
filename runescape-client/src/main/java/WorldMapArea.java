import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ar")
@Implements("WorldMapArea")
public class WorldMapArea {
	@ObfuscatedName("sk")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("platformInfo")
	static PlatformInfo platformInfo;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -2004467599
	)
	@Export("id")
	int id;
	@ObfuscatedName("k")
	@Export("internalName")
	String internalName;
	@ObfuscatedName("s")
	@Export("externalName")
	String externalName;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 173771503
	)
	@Export("backGroundColor")
	int backGroundColor;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1585723591
	)
	@Export("zoom")
	int zoom;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lhg;"
	)
	@Export("origin")
	Coord origin;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -2050801149
	)
	@Export("regionLowX")
	int regionLowX;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1803706305
	)
	@Export("regionHighX")
	int regionHighX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 2137946489
	)
	@Export("regionLowY")
	int regionLowY;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1133866307
	)
	@Export("regionHighY")
	int regionHighY;
	@ObfuscatedName("n")
	@Export("isMain")
	boolean isMain;
	@ObfuscatedName("d")
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

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lkf;IB)V",
		garbageValue = "24"
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lkf;B)Lay;",
		garbageValue = "-55"
	)
	@Export("readWorldMapSection")
	WorldMapSection readWorldMapSection(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 40
		WorldMapSectionType var3 = (WorldMapSectionType)TextureProvider.findEnumerated(WorldMapSectionType.method327(), var2); // L: 41
		Object var4 = null; // L: 42
		switch(var3.type) { // L: 43
		case 0:
			var4 = new WorldMapSection3(); // L: 45
			break;
		case 1:
			var4 = new WorldMapSection1(); // L: 51
			break; // L: 52
		case 2:
			var4 = new WorldMapSection2(); // L: 48
			break; // L: 49
		case 3:
			var4 = new WorldMapSection0();
			break;
		default:
			throw new IllegalStateException("");
		}

		((WorldMapSection)var4).read(var1); // L: 59
		return (WorldMapSection)var4;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "31"
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

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "118"
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

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-1676257391"
	)
	@Export("position")
	public int[] position(int var1, int var2, int var3) {
		Iterator var4 = this.sections.iterator(); // L: 92

		WorldMapSection var5;
		do {
			if (!var4.hasNext()) { // L: 99
				return null; // L: 100
			}

			var5 = (WorldMapSection)var4.next(); // L: 93
		} while(!var5.containsCoord(var1, var2, var3)); // L: 95

		return var5.getBorderTileLengths(var1, var2, var3); // L: 96
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)Lhg;",
		garbageValue = "788821782"
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1087000802"
	)
	@Export("setBounds")
	void setBounds() {
		Iterator var1 = this.sections.iterator(); // L: 116

		while (var1.hasNext()) { // L: 121
			WorldMapSection var2 = (WorldMapSection)var1.next(); // L: 117
			var2.expandBounds(this); // L: 119
		}

	} // L: 122

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "809929326"
	)
	@Export("getId")
	public int getId() {
		return this.id; // L: 125
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1492211356"
	)
	@Export("getIsMain")
	public boolean getIsMain() {
		return this.isMain; // L: 129
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-401502532"
	)
	@Export("getInternalName")
	public String getInternalName() {
		return this.internalName; // L: 133
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "-32528"
	)
	@Export("getExternalName")
	public String getExternalName() {
		return this.externalName; // L: 137
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "194013380"
	)
	@Export("getBackGroundColor")
	int getBackGroundColor() {
		return this.backGroundColor; // L: 141
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "24"
	)
	@Export("getZoom")
	public int getZoom() {
		return this.zoom; // L: 145
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "63"
	)
	@Export("getRegionLowX")
	public int getRegionLowX() {
		return this.regionLowX; // L: 149
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-691462213"
	)
	@Export("getRegionHighX")
	public int getRegionHighX() {
		return this.regionHighX; // L: 153
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-515564038"
	)
	@Export("getRegionLowY")
	public int getRegionLowY() {
		return this.regionLowY; // L: 157
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "330383709"
	)
	@Export("getRegionHighY")
	public int getRegionHighY() {
		return this.regionHighY; // L: 161
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1099952817"
	)
	@Export("getOriginX")
	public int getOriginX() {
		return this.origin.x; // L: 165
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "8"
	)
	@Export("getOriginPlane")
	public int getOriginPlane() {
		return this.origin.plane; // L: 169
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2050944019"
	)
	@Export("getOriginY")
	public int getOriginY() {
		return this.origin.y; // L: 173
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)Lhg;",
		garbageValue = "0"
	)
	@Export("getOrigin")
	public Coord getOrigin() {
		return new Coord(this.origin); // L: 177
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-3643334"
	)
	static void method415() {
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 53
			if (ArchiveDiskActionHandler.field3179 == 0) { // L: 54
				Huffman.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 55
				Huffman.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 56
				Huffman.ArchiveDiskActionHandler_thread.start(); // L: 57
				Huffman.ArchiveDiskActionHandler_thread.setPriority(5); // L: 58
			}

			ArchiveDiskActionHandler.field3179 = 600; // L: 60
		}
	} // L: 62

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILcy;ZI)I",
		garbageValue = "-2119318811"
	)
	static int method485(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) { // L: 1723
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.cycle; // L: 1724
			return 1; // L: 1725
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) { // L: 1727
				Interpreter.Interpreter_intStackSize -= 2; // L: 1728
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1729
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1730
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = VarbitDefinition.method4596(var3, var4); // L: 1731
				return 1; // L: 1732
			} else if (var0 == ScriptOpcodes.INV_GETNUM) { // L: 1734
				Interpreter.Interpreter_intStackSize -= 2; // L: 1735
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1736
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1737
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = UserComparator10.ItemContainer_getCount(var3, var4); // L: 1738
				return 1; // L: 1739
			} else if (var0 == ScriptOpcodes.INV_TOTAL) { // L: 1741
				Interpreter.Interpreter_intStackSize -= 2; // L: 1742
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1743
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1744
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = NetSocket.method3628(var3, var4); // L: 1745
				return 1; // L: 1746
			} else if (var0 == ScriptOpcodes.INV_SIZE) { // L: 1748
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1749
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = MusicPatchPcmStream.getInvDefinition(var3).size; // L: 1750
				return 1; // L: 1751
			} else if (var0 == ScriptOpcodes.STAT) { // L: 1753
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1754
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.currentLevels[var3]; // L: 1755
				return 1; // L: 1756
			} else if (var0 == ScriptOpcodes.STAT_BASE) { // L: 1758
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1759
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.levels[var3]; // L: 1760
				return 1; // L: 1761
			} else if (var0 == ScriptOpcodes.STAT_XP) { // L: 1763
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1764
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.experience[var3]; // L: 1765
				return 1; // L: 1766
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) { // L: 1768
					var3 = Huffman.Client_plane; // L: 1769
					var4 = (WorldMapLabelSize.localPlayer.x >> 7) + WorldMapManager.baseX; // L: 1770
					var5 = (WorldMapLabelSize.localPlayer.y >> 7) + WorldMapLabel.baseY; // L: 1771
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28); // L: 1772
					return 1; // L: 1773
				} else if (var0 == ScriptOpcodes.COORDX) { // L: 1775
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1776
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 >> 14 & 16383; // L: 1777
					return 1; // L: 1778
				} else if (var0 == ScriptOpcodes.COORDZ) { // L: 1780
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1781
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 >> 28; // L: 1782
					return 1; // L: 1783
				} else if (var0 == ScriptOpcodes.COORDY) { // L: 1785
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1786
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 & 16383; // L: 1787
					return 1; // L: 1788
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) { // L: 1790
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0; // L: 1791
					return 1; // L: 1792
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) { // L: 1794
					Interpreter.Interpreter_intStackSize -= 2; // L: 1795
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768; // L: 1796
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1797
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = VarbitDefinition.method4596(var3, var4); // L: 1798
					return 1; // L: 1799
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) { // L: 1801
					Interpreter.Interpreter_intStackSize -= 2; // L: 1802
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768; // L: 1803
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1804
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = UserComparator10.ItemContainer_getCount(var3, var4); // L: 1805
					return 1; // L: 1806
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) { // L: 1808
					Interpreter.Interpreter_intStackSize -= 2; // L: 1809
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768; // L: 1810
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1811
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = NetSocket.method3628(var3, var4); // L: 1812
					return 1; // L: 1813
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) { // L: 1815
					if (Client.staffModLevel >= 2) { // L: 1816
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1817
					}

					return 1; // L: 1818
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) { // L: 1820
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.rebootTimer; // L: 1821
					return 1; // L: 1822
				} else if (var0 == ScriptOpcodes.MAP_WORLD) { // L: 1824
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.worldId; // L: 1825
					return 1; // L: 1826
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) { // L: 1828
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.runEnergy; // L: 1829
					return 1; // L: 1830
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) { // L: 1832
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.weight; // L: 1833
					return 1; // L: 1834
				} else if (var0 == ScriptOpcodes.PLAYERMOD) { // L: 1836
					if (Client.playerMod) { // L: 1837
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1838
					}

					return 1; // L: 1839
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) { // L: 1841
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.worldProperties; // L: 1842
					return 1; // L: 1843
				} else if (var0 == ScriptOpcodes.MOVECOORD) { // L: 1845
					Interpreter.Interpreter_intStackSize -= 4; // L: 1846
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1847
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1848
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 1849
					int var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 1850
					var3 += var4 << 14; // L: 1851
					var3 += var5 << 28; // L: 1852
					var3 += var6; // L: 1853
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 1854
					return 1; // L: 1855
				} else {
					return 2; // L: 1857
				}
			}
		}
	}
}
