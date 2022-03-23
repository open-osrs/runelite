import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("id")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	static final WorldMapID field2829;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	static final WorldMapID field2826;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("ItemDefinition_archive")
	static AbstractArchive ItemDefinition_archive;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1857886715
	)
	@Export("value")
	final int value;

	static {
		field2829 = new WorldMapID(0); // L: 4
		field2826 = new WorldMapID(1); // L: 5
	}

	WorldMapID(int var1) {
		this.value = var1; // L: 9
	} // L: 10

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "91"
	)
	public static void method5000(int var0) {
		if (var0 != -1) { // L: 261
			if (Frames.Widget_loadedInterfaces[var0]) { // L: 262
				class122.Widget_archive.clearFilesGroup(var0); // L: 263
				if (EnumComposition.Widget_interfaceComponents[var0] != null) { // L: 264
					boolean var1 = true; // L: 265

					for (int var2 = 0; var2 < EnumComposition.Widget_interfaceComponents[var0].length; ++var2) { // L: 266
						if (EnumComposition.Widget_interfaceComponents[var0][var2] != null) { // L: 267
							if (EnumComposition.Widget_interfaceComponents[var0][var2].type != 2) { // L: 268
								EnumComposition.Widget_interfaceComponents[var0][var2] = null;
							} else {
								var1 = false; // L: 269
							}
						}
					}

					if (var1) {
						EnumComposition.Widget_interfaceComponents[var0] = null; // L: 272
					}

					Frames.Widget_loadedInterfaces[var0] = false; // L: 273
				}
			}
		}
	} // L: 274
}
