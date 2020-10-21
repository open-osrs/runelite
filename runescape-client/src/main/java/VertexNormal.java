import java.awt.Component;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ep")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1734980481
	)
	@Export("x")
	int x;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1170582091
	)
	@Export("y")
	int y;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1919036787
	)
	@Export("z")
	int z;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 2072706825
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	} // L: 9

	@ObfuscatedSignature(
		descriptor = "(Lep;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x; // L: 12
		this.y = var1.y; // L: 13
		this.z = var1.z; // L: 14
		this.magnitude = var1.magnitude; // L: 15
	} // L: 16

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "84"
	)
	static void method3136(Component var0) {
		var0.setFocusTraversalKeysEnabled(false); // L: 150
		var0.addKeyListener(KeyHandler.KeyHandler_instance); // L: 151
		var0.addFocusListener(KeyHandler.KeyHandler_instance); // L: 152
	} // L: 153

	@ObfuscatedName("b")
	static final void method3135(long var0) {
		try {
			Thread.sleep(var0); // L: 20
		} catch (InterruptedException var3) { // L: 22
		}

	} // L: 23

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1764411765"
	)
	public static void method3133(int var0) {
		class206.musicPlayerStatus = 1; // L: 55
		class23.musicTrackArchive = null; // L: 56
		TileItem.musicTrackGroupId = -1; // L: 57
		class206.musicTrackFileId = -1; // L: 58
		class206.musicTrackVolume = 0; // L: 59
		class195.musicTrackBoolean = false; // L: 60
		MusicPatch.pcmSampleLength = var0; // L: 61
	} // L: 62

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILco;ZI)I",
		garbageValue = "-1937553317"
	)
	static int method3134(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) { // L: 1723
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.cycle; // L: 1724
			return 1; // L: 1725
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) { // L: 1727
				MilliClock.Interpreter_intStackSize -= 2; // L: 1728
				var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 1729
				var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 1730
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = GrandExchangeOfferTotalQuantityComparator.method183(var3, var4); // L: 1731
				return 1; // L: 1732
			} else if (var0 == ScriptOpcodes.INV_GETNUM) { // L: 1734
				MilliClock.Interpreter_intStackSize -= 2; // L: 1735
				var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 1736
				var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 1737
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = WorldMapSection1.ItemContainer_getCount(var3, var4); // L: 1738
				return 1; // L: 1739
			} else if (var0 == ScriptOpcodes.INV_TOTAL) { // L: 1741
				MilliClock.Interpreter_intStackSize -= 2; // L: 1742
				var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 1743
				var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 1744
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = BuddyRankComparator.method3557(var3, var4); // L: 1745
				return 1; // L: 1746
			} else if (var0 == ScriptOpcodes.INV_SIZE) { // L: 1748
				var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 1749
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = ScriptEvent.getInvDefinition(var3).size; // L: 1750
				return 1; // L: 1751
			} else if (var0 == ScriptOpcodes.STAT) { // L: 1753
				var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 1754
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.currentLevels[var3]; // L: 1755
				return 1; // L: 1756
			} else if (var0 == ScriptOpcodes.STAT_BASE) { // L: 1758
				var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 1759
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.levels[var3]; // L: 1760
				return 1; // L: 1761
			} else if (var0 == ScriptOpcodes.STAT_XP) { // L: 1763
				var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 1764
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.experience[var3]; // L: 1765
				return 1; // L: 1766
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) { // L: 1768
					var3 = GrandExchangeOfferUnitPriceComparator.Client_plane; // L: 1769
					var4 = (PlayerType.localPlayer.x >> 7) + FloorDecoration.baseX; // L: 1770
					var5 = (PlayerType.localPlayer.y >> 7) + WorldMapData_0.baseY; // L: 1771
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28); // L: 1772
					return 1; // L: 1773
				} else if (var0 == ScriptOpcodes.COORDX) { // L: 1775
					var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 1776
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3 >> 14 & 16383; // L: 1777
					return 1; // L: 1778
				} else if (var0 == ScriptOpcodes.COORDZ) { // L: 1780
					var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 1781
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3 >> 28; // L: 1782
					return 1; // L: 1783
				} else if (var0 == ScriptOpcodes.COORDY) { // L: 1785
					var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 1786
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3 & 16383; // L: 1787
					return 1; // L: 1788
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) { // L: 1790
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0; // L: 1791
					return 1; // L: 1792
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) { // L: 1794
					MilliClock.Interpreter_intStackSize -= 2; // L: 1795
					var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize] + 32768; // L: 1796
					var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 1797
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = GrandExchangeOfferTotalQuantityComparator.method183(var3, var4); // L: 1798
					return 1; // L: 1799
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) { // L: 1801
					MilliClock.Interpreter_intStackSize -= 2; // L: 1802
					var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize] + 32768; // L: 1803
					var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 1804
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = WorldMapSection1.ItemContainer_getCount(var3, var4); // L: 1805
					return 1; // L: 1806
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) { // L: 1808
					MilliClock.Interpreter_intStackSize -= 2; // L: 1809
					var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize] + 32768; // L: 1810
					var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 1811
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = BuddyRankComparator.method3557(var3, var4); // L: 1812
					return 1; // L: 1813
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) { // L: 1815
					if (Client.staffModLevel >= 2) { // L: 1816
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 1817
					}

					return 1; // L: 1818
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) { // L: 1820
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.rebootTimer; // L: 1821
					return 1; // L: 1822
				} else if (var0 == ScriptOpcodes.MAP_WORLD) { // L: 1824
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.worldId; // L: 1825
					return 1; // L: 1826
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) { // L: 1828
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.runEnergy; // L: 1829
					return 1; // L: 1830
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) { // L: 1832
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.weight; // L: 1833
					return 1; // L: 1834
				} else if (var0 == ScriptOpcodes.PLAYERMOD) { // L: 1836
					if (Client.playerMod) { // L: 1837
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 1838
					}

					return 1; // L: 1839
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) { // L: 1841
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.worldProperties; // L: 1842
					return 1; // L: 1843
				} else if (var0 == ScriptOpcodes.MOVECOORD) { // L: 1845
					MilliClock.Interpreter_intStackSize -= 4; // L: 1846
					var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 1847
					var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 1848
					var5 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 2]; // L: 1849
					int var6 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 3]; // L: 1850
					var3 += var4 << 14; // L: 1851
					var3 += var5 << 28; // L: 1852
					var3 += var6; // L: 1853
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3; // L: 1854
					return 1; // L: 1855
				} else {
					return 2; // L: 1857
				}
			}
		}
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(Lht;B)Z",
		garbageValue = "35"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden; // L: 11532
	}
}
