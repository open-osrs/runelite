import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ik")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	static final WorldMapID field2879;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	static final WorldMapID field2877;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 923674533
	)
	@Export("value")
	final int value;

	static {
		field2879 = new WorldMapID(0); // L: 4
		field2877 = new WorldMapID(1); // L: 5
	}

	WorldMapID(int var1) {
		this.value = var1;
	} // L: 10

	@ObfuscatedName("o")
	public static double method4811(double var0) {
		return Math.exp(-var0 * var0 / 2.0D) / Math.sqrt(6.283185307179586D); // L: 9
	}
}
