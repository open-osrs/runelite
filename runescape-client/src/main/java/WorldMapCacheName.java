import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("an")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lan;"
	)
	public static final WorldMapCacheName field333;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lan;"
	)
	public static final WorldMapCacheName field323;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lan;"
	)
	public static final WorldMapCacheName field324;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lan;"
	)
	static final WorldMapCacheName field325;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lan;"
	)
	public static final WorldMapCacheName field326;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	@Export("archive4")
	static Archive archive4;
	@ObfuscatedName("h")
	@Export("name")
	public final String name;

	static {
		field333 = new WorldMapCacheName("details"); // L: 4
		field323 = new WorldMapCacheName("compositemap"); // L: 5
		field324 = new WorldMapCacheName("compositetexture"); // L: 6
		field325 = new WorldMapCacheName("area"); // L: 7
		field326 = new WorldMapCacheName("labels"); // L: 8
	}

	WorldMapCacheName(String var1) {
		this.name = var1; // L: 12
	} // L: 13

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1996576804"
	)
	@Export("loadInterface")
	public static boolean loadInterface(int var0) {
		if (Widget.Widget_loadedInterfaces[var0]) { // L: 212
			return true;
		} else if (!FontName.Widget_archive.tryLoadGroup(var0)) { // L: 213
			return false;
		} else {
			int var1 = FontName.Widget_archive.getGroupFileCount(var0); // L: 214
			if (var1 == 0) { // L: 215
				Widget.Widget_loadedInterfaces[var0] = true; // L: 216
				return true; // L: 217
			} else {
				if (DefaultsGroup.Widget_interfaceComponents[var0] == null) { // L: 219
					DefaultsGroup.Widget_interfaceComponents[var0] = new Widget[var1];
				}

				for (int var2 = 0; var2 < var1; ++var2) { // L: 220
					if (DefaultsGroup.Widget_interfaceComponents[var0][var2] == null) { // L: 221
						byte[] var3 = FontName.Widget_archive.takeFile(var0, var2); // L: 222
						if (var3 != null) { // L: 223
							DefaultsGroup.Widget_interfaceComponents[var0][var2] = new Widget(); // L: 224
							DefaultsGroup.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16); // L: 225
							if (var3[0] == -1) { // L: 226
								DefaultsGroup.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
							} else {
								DefaultsGroup.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3)); // L: 227
							}
						}
					}
				}

				Widget.Widget_loadedInterfaces[var0] = true; // L: 231
				return true; // L: 232
			}
		}
	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-11688"
	)
	static void method715() {
		if (Client.oculusOrbState == 1) { // L: 11624
			Client.field747 = true; // L: 11625
		}

	} // L: 11627
}
