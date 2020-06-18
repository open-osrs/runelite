import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lo")
@Implements("AbstractRasterProvider")
public abstract class AbstractRasterProvider {
	@ObfuscatedName("q")
	@Export("pixels")
	public int[] pixels;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1291852267
	)
	@Export("width")
	public int width;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1133589313
	)
	@Export("height")
	public int height;

	protected AbstractRasterProvider() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(IIB)V",
		garbageValue = "-5"
	)
	@Export("drawFull")
	public abstract void drawFull(int var1, int var2);

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(IIIII)V",
		garbageValue = "-1334771637"
	)
	@Export("draw")
	public abstract void draw(int var1, int var2, int var3, int var4);

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "25855118"
	)
	@Export("apply")
	public final void apply() {
		Rasterizer2D.Rasterizer2D_replace(this.pixels, this.width, this.height);
	}
}
