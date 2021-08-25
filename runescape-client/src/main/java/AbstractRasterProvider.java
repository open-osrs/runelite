import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("or")
@Implements("AbstractRasterProvider")
public abstract class AbstractRasterProvider {
	@ObfuscatedName("m")
	@Export("pixels")
	public int[] pixels;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1966708419
	)
	@Export("width")
	public int width;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1693777643
	)
	@Export("height")
	public int height;

	protected AbstractRasterProvider() {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "286261249"
	)
	@Export("drawFull")
	public abstract void drawFull(int var1, int var2);

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1489672411"
	)
	@Export("draw")
	public abstract void draw(int var1, int var2, int var3, int var4);

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-31"
	)
	@Export("apply")
	public final void apply() {
		Rasterizer2D.Rasterizer2D_replace(this.pixels, this.width, this.height);
	}
}
