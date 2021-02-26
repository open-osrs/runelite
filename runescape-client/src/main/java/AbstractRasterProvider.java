import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lc")
@Implements("AbstractRasterProvider")
public abstract class AbstractRasterProvider {
	@ObfuscatedName("d")
	@Export("pixels")
	public int[] pixels;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1159583033
	)
	@Export("width")
	public int width;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1839293839
	)
	@Export("height")
	public int height;

	protected AbstractRasterProvider() {
	} // L: 8

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2060006654"
	)
	@Export("drawFull")
	public abstract void drawFull(int var1, int var2);

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1656973228"
	)
	@Export("draw")
	public abstract void draw(int var1, int var2, int var3, int var4);

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1592611264"
	)
	@Export("apply")
	public final void apply() {
		Rasterizer2D.Rasterizer2D_replace(this.pixels, this.width, this.height); // L: 11
	} // L: 12
}
