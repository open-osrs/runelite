import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lge;"
	)
	static final WorldMapID field2095;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lge;"
	)
	static final WorldMapID field2094;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1894228719
	)
	@Export("value")
	final int value;

	static {
		field2095 = new WorldMapID(0);
		field2094 = new WorldMapID(1);
	}

	WorldMapID(int var1) {
		this.value = var1;
	}
}
