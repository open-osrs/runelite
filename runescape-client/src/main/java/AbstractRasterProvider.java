import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lw")
public abstract class AbstractRasterProvider {
	@ObfuscatedName("s")
	public int[] pixels;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1282553935
	)
	public int width;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1198737713
	)
	public int height;

	protected AbstractRasterProvider() {
	} // L: 8

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1964598850"
	)
	public abstract void drawFull(int var1, int var2);

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "147756616"
	)
	public abstract void draw(int var1, int var2, int var3, int var4);

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1832212731"
	)
	public final void apply() {
		Rasterizer2D.Rasterizer2D_replace(this.pixels, this.width, this.height); // L: 11
	} // L: 12
}
