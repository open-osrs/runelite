import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ly")
@Implements("AbstractRasterProvider")
public abstract class AbstractRasterProvider {
	@ObfuscatedName("rq")
	@ObfuscatedGetter(
		intValue = 18535251
	)
	static int field3890;
	@ObfuscatedName("l")
	@Export("pixels")
	public int[] pixels;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1124244957
	)
	@Export("width")
	public int width;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1951124213
	)
	@Export("height")
	public int height;

	protected AbstractRasterProvider() {
	} // L: 8

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1818523436"
	)
	@Export("drawFull")
	public abstract void drawFull(int var1, int var2);

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "868198553"
	)
	@Export("draw")
	public abstract void draw(int var1, int var2, int var3, int var4);

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1020738827"
	)
	@Export("apply")
	public final void apply() {
		Rasterizer2D.Rasterizer2D_replace(this.pixels, this.width, this.height); // L: 11
	} // L: 12
}
