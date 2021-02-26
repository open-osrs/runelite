import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ec")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -488531261
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1556440429
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -310123299
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -614734957
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -510931047
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("h")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 174848381
	)
	@Export("rgb")
	int rgb;

	SceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.isFlat = true; // L: 9
		this.swColor = var1; // L: 13
		this.seColor = var2; // L: 14
		this.neColor = var3; // L: 15
		this.nwColor = var4; // L: 16
		this.texture = var5; // L: 17
		this.rgb = var6; // L: 18
		this.isFlat = var7; // L: 19
	} // L: 20
}
