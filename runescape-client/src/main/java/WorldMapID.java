import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	static final WorldMapID field2186;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	static final WorldMapID field2184;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "[Lnw;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 418528697
	)
	@Export("value")
	final int value;

	static {
		field2186 = new WorldMapID(0); // L: 4
		field2184 = new WorldMapID(1); // L: 5
	}

	WorldMapID(int var1) {
		this.value = var1; // L: 9
	} // L: 10
}
