import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("gr")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 66075033
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 748897211
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1854602939
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1705653553
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1737140535
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("e")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 985231477
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
