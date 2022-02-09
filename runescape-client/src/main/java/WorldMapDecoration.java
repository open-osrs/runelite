import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("hj")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("ie")
	@ObfuscatedGetter(
		intValue = 1763303349
	)
	@Export("cameraY")
	static int cameraY;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1640877419
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 387612235
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1048320277
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1; // L: 9
		this.decoration = var2; // L: 10
		this.rotation = var3; // L: 11
	} // L: 12
}
