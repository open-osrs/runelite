import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("hp")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1060365903
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1024115467
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1904939773
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 2128770803
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1045696483
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("o")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 437021985
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
