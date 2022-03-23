import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qh")
@Implements("AbstractRasterProvider")
public abstract class AbstractRasterProvider {
	@ObfuscatedName("h")
	@Export("pixels")
	public int[] pixels;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -56601375
	)
	@Export("width")
	public int width;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 749684829
	)
	@Export("height")
	public int height;

	protected AbstractRasterProvider() {
	} // L: 8

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1725746556"
	)
	@Export("drawFull")
	public abstract void drawFull(int var1, int var2);

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1732987846"
	)
	@Export("draw")
	public abstract void draw(int var1, int var2, int var3, int var4);

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1395809863"
	)
	@Export("apply")
	public final void apply() {
		Rasterizer2D.Rasterizer2D_replace(this.pixels, this.width, this.height); // L: 11
	} // L: 12
}
