import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("iv")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("fy")
	@ObfuscatedGetter(
		intValue = 1438755039
	)
	static int field2826;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 439734561
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 477804517
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -818141463
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1925100489
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1030512889
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("n")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1121760459
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
