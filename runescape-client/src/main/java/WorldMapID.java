import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("sb")
	@ObfuscatedSignature(
		descriptor = "Lla;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	static final WorldMapID field2111;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	static final WorldMapID field2108;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1292015261
	)
	@Export("value")
	final int value;

	static {
		field2111 = new WorldMapID(0); // L: 4
		field2108 = new WorldMapID(1); // L: 5
	}

	WorldMapID(int var1) {
		this.value = var1; // L: 9
	} // L: 10

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-115"
	)
	static int method3718(int var0, int var1) {
		if (var0 == -2) { // L: 15
			return 12345678;
		} else if (var0 == -1) { // L: 16
			if (var1 < 0) { // L: 17
				var1 = 0; // L: 18
			} else if (var1 > 127) { // L: 20
				var1 = 127; // L: 21
			}

			var1 = 127 - var1; // L: 23
			return var1; // L: 24
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 26
			if (var1 < 2) { // L: 27
				var1 = 2;
			} else if (var1 > 126) { // L: 28
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 29
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "2096657321"
	)
	static final int method3716(int var0, int var1) {
		if (var0 == -2) { // L: 852
			return 12345678;
		} else if (var0 == -1) { // L: 853
			if (var1 < 2) {
				var1 = 2; // L: 854
			} else if (var1 > 126) { // L: 855
				var1 = 126;
			}

			return var1; // L: 856
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 858
			if (var1 < 2) { // L: 859
				var1 = 2;
			} else if (var1 > 126) { // L: 860
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 861
		}
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2067762103"
	)
	static void method3717() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) { // L: 11019
			int var1 = var0.group; // L: 11020
			if (class20.loadInterface(var1)) { // L: 11021
				boolean var2 = true; // L: 11022
				Widget[] var3 = GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var1]; // L: 11023

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) { // L: 11024
					if (var3[var4] != null) { // L: 11025
						var2 = var3[var4].isIf3; // L: 11026
						break;
					}
				}

				if (!var2) { // L: 11030
					var4 = (int)var0.key; // L: 11031
					Widget var5 = WorldMapData_1.getWidget(var4); // L: 11032
					if (var5 != null) { // L: 11033
						Script.invalidateWidget(var5);
					}
				}
			}
		}

	} // L: 11037
}
