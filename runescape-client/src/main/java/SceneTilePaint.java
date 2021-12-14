import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("gk")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1849890093
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 325904735
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -79551477
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -378888485
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1880581479
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("s")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1789996375
	)
	@Export("rgb")
	int rgb;

	SceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.isFlat = true;
		this.swColor = var1;
		this.seColor = var2;
		this.neColor = var3;
		this.nwColor = var4;
		this.texture = var5;
		this.rgb = var6;
		this.isFlat = var7;
	}
}
