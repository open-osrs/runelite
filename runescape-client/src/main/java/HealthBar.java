import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ca")
@Implements("HealthBar")
public class HealthBar extends Node {
	@ObfuscatedName("gd")
	@Export("regions")
	static int[] regions;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	@Export("definition")
	HealthBarDefinition definition;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("updates")
	IterableNodeDeque updates;

	@ObfuscatedSignature(
		descriptor = "(Lej;)V"
	)
	HealthBar(HealthBarDefinition var1) {
		this.updates = new IterableNodeDeque(); // L: 12
		this.definition = var1; // L: 15
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1388423843"
	)
	@Export("put")
	void put(int var1, int var2, int var3, int var4) {
		HealthBarUpdate var5 = null;
		int var6 = 0; // L: 20

		for (HealthBarUpdate var7 = (HealthBarUpdate)this.updates.last(); var7 != null; var7 = (HealthBarUpdate)this.updates.previous()) {
			++var6;
			if (var7.cycle == var1) {
				var7.set(var1, var2, var3, var4); // L: 24
				return;
			}

			if (var7.cycle <= var1) {
				var5 = var7;
			}
		}

		if (var5 == null) {
			if (var6 < 4) { // L: 30
				this.updates.addLast(new HealthBarUpdate(var1, var2, var3, var4));
			}

		} else {
			IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(var1, var2, var3, var4), var5); // L: 33
			if (var6 >= 4) {
				this.updates.last().remove(); // L: 34
			}

		}
	} // L: 31 35

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Lcy;",
		garbageValue = "-1813556269"
	)
	@Export("get")
	HealthBarUpdate get(int var1) {
		HealthBarUpdate var2 = (HealthBarUpdate)this.updates.last(); // L: 38
		if (var2 != null && var2.cycle <= var1) { // L: 39
			for (HealthBarUpdate var3 = (HealthBarUpdate)this.updates.previous(); var3 != null && var3.cycle <= var1; var3 = (HealthBarUpdate)this.updates.previous()) { // L: 40 41
				var2.remove(); // L: 42
				var2 = var3; // L: 43
			}

			if (this.definition.int5 + var2.cycle + var2.cycleOffset > var1) { // L: 47
				return var2;
			} else {
				var2.remove(); // L: 49
				return null; // L: 50
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1134289303"
	)
	@Export("isEmpty")
	boolean isEmpty() {
		return this.updates.method5149(); // L: 55
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;Lmo;I)Lmo;",
		garbageValue = "-159166525"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte(); // L: 16
		int var3;
		if (var1 == null) { // L: 17
			var3 = MouseRecorder.method2126(var2); // L: 18
			var1 = new IterableNodeHashTable(var3); // L: 19
		}

		for (var3 = 0; var3 < var2; ++var3) { // L: 21
			boolean var4 = var0.readUnsignedByte() == 1; // L: 22
			int var5 = var0.readMedium(); // L: 23
			Object var6;
			if (var4) {
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated()); // L: 25
			} else {
				var6 = new IntegerNode(var0.readInt()); // L: 26
			}

			var1.put((Node)var6, (long)var5); // L: 27
		}

		return var1; // L: 29
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnm;IB)V",
		garbageValue = "-15"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset; // L: 71
		Players.Players_pendingUpdateCount = 0; // L: 72
		Friend.method5550(var0); // L: 73

		for (int var3 = 0; var3 < Players.Players_pendingUpdateCount; ++var3) { // L: 75
			int var4 = Players.Players_pendingUpdateIndices[var3]; // L: 76
			Player var5 = Client.players[var4]; // L: 77
			int var6 = var0.readUnsignedByte(); // L: 78
			if ((var6 & 128) != 0) { // L: 79
				var6 += var0.readUnsignedByte() << 8;
			}

			ScriptEvent.method2116(var0, var4, var5, var6); // L: 80
		}

		if (var0.offset - var2 != var1) { // L: 83
			throw new RuntimeException(var0.offset - var2 + " " + var1); // L: 84
		}
	} // L: 86

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZI)I",
		garbageValue = "-938940288"
	)
	static int method2250(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) { // L: 1855
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.cycle; // L: 1856
			return 1; // L: 1857
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) { // L: 1859
				WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 1860
				var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 1861
				var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 1862
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = KeyHandler.method453(var3, var4); // L: 1863
				return 1; // L: 1864
			} else if (var0 == ScriptOpcodes.INV_GETNUM) { // L: 1866
				WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 1867
				var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 1868
				var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 1869
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = GrandExchangeOfferWorldComparator.ItemContainer_getCount(var3, var4); // L: 1870
				return 1; // L: 1871
			} else if (var0 == ScriptOpcodes.INV_TOTAL) { // L: 1873
				WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 1874
				var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 1875
				var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 1876
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = class0.method6(var3, var4); // L: 1877
				return 1; // L: 1878
			} else if (var0 == ScriptOpcodes.INV_SIZE) { // L: 1880
				var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 1881
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = KitDefinition.getInvDefinition(var3).size; // L: 1882
				return 1; // L: 1883
			} else if (var0 == ScriptOpcodes.STAT) { // L: 1885
				var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 1886
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.currentLevels[var3]; // L: 1887
				return 1; // L: 1888
			} else if (var0 == ScriptOpcodes.STAT_BASE) { // L: 1890
				var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 1891
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.levels[var3]; // L: 1892
				return 1; // L: 1893
			} else if (var0 == ScriptOpcodes.STAT_XP) { // L: 1895
				var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 1896
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.experience[var3]; // L: 1897
				return 1; // L: 1898
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) { // L: 1900
					var3 = ParamComposition.Client_plane; // L: 1901
					var4 = (class35.localPlayer.x >> 7) + JagexCache.baseX; // L: 1902
					var5 = (class35.localPlayer.y >> 7) + Messages.baseY; // L: 1903
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28); // L: 1904
					return 1; // L: 1905
				} else if (var0 == ScriptOpcodes.COORDX) { // L: 1907
					var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 1908
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3 >> 14 & 16383; // L: 1909
					return 1; // L: 1910
				} else if (var0 == ScriptOpcodes.COORDZ) { // L: 1912
					var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 1913
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3 >> 28; // L: 1914
					return 1; // L: 1915
				} else if (var0 == ScriptOpcodes.COORDY) { // L: 1917
					var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 1918
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3 & 16383; // L: 1919
					return 1; // L: 1920
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) { // L: 1922
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0; // L: 1923
					return 1; // L: 1924
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) { // L: 1926
					WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 1927
					var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize] + 32768; // L: 1928
					var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 1929
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = KeyHandler.method453(var3, var4); // L: 1930
					return 1; // L: 1931
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) { // L: 1933
					WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 1934
					var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize] + 32768; // L: 1935
					var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 1936
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = GrandExchangeOfferWorldComparator.ItemContainer_getCount(var3, var4); // L: 1937
					return 1; // L: 1938
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) { // L: 1940
					WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 1941
					var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize] + 32768; // L: 1942
					var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 1943
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = class0.method6(var3, var4); // L: 1944
					return 1; // L: 1945
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) { // L: 1947
					if (Client.staffModLevel >= 2) { // L: 1948
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 1949
					}

					return 1; // L: 1950
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) { // L: 1952
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.rebootTimer; // L: 1953
					return 1; // L: 1954
				} else if (var0 == ScriptOpcodes.MAP_WORLD) { // L: 1956
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.worldId; // L: 1957
					return 1; // L: 1958
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) { // L: 1960
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.runEnergy; // L: 1961
					return 1; // L: 1962
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) { // L: 1964
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.weight; // L: 1965
					return 1; // L: 1966
				} else if (var0 == ScriptOpcodes.PLAYERMOD) { // L: 1968
					if (Client.playerMod) { // L: 1969
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 1970
					}

					return 1; // L: 1971
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) { // L: 1973
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.worldProperties; // L: 1974
					return 1; // L: 1975
				} else if (var0 == ScriptOpcodes.MOVECOORD) { // L: 1977
					WorldMapCacheName.Interpreter_intStackSize -= 4; // L: 1978
					var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 1979
					var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 1980
					var5 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 2]; // L: 1981
					int var6 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 3]; // L: 1982
					var3 += var4 << 14; // L: 1983
					var3 += var5 << 28; // L: 1984
					var3 += var6; // L: 1985
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3; // L: 1986
					return 1; // L: 1987
				} else if (var0 == 3326) { // L: 1989
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.field627; // L: 1990
					return 1; // L: 1991
				} else if (var0 == 3327) { // L: 1993
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.field837; // L: 1994
					return 1; // L: 1995
				} else {
					return 2; // L: 1997
				}
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1471202584"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) { // L: 4321
			if (UserComparator8.loadInterface(var0)) { // L: 4322
				Widget[] var1 = Widget.Widget_interfaceComponents[var0]; // L: 4323

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 4324
					Widget var3 = var1[var2]; // L: 4325
					if (var3.onLoad != null) { // L: 4326
						ScriptEvent var4 = new ScriptEvent(); // L: 4327
						var4.widget = var3; // L: 4328
						var4.args = var3.onLoad; // L: 4329
						class243.runScript(var4, 5000000, 0); // L: 4330
					}
				}

			}
		}
	} // L: 4333
}
