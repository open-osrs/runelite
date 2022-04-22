import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qu")
@Implements("AbstractRasterProvider")
public abstract class AbstractRasterProvider {
	@ObfuscatedName("i")
	@Export("pixels")
	public int[] pixels;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1418570525
	)
	@Export("width")
	public int width;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -845833355
	)
	@Export("height")
	public int height;

	protected AbstractRasterProvider() {
	} // L: 8

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "131"
	)
	@Export("drawFull")
	public abstract void drawFull(int var1, int var2);

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1598391098"
	)
	@Export("draw")
	public abstract void draw(int var1, int var2, int var3, int var4);

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1263903710"
	)
	@Export("apply")
	public final void apply() {
		Rasterizer2D.Rasterizer2D_replace(this.pixels, this.width, this.height); // L: 11
	} // L: 12
}
