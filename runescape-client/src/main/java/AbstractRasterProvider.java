import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oa")
@Implements("AbstractRasterProvider")
public abstract class AbstractRasterProvider {
	@ObfuscatedName("o")
	@Export("pixels")
	public int[] pixels;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -28982631
	)
	@Export("width")
	public int width;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1578915527
	)
	@Export("height")
	public int height;

	protected AbstractRasterProvider() {
	} // L: 8

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "946927197"
	)
	@Export("drawFull")
	public abstract void drawFull(int var1, int var2);

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1873522448"
	)
	@Export("draw")
	public abstract void draw(int var1, int var2, int var3, int var4);

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "697339272"
	)
	@Export("apply")
	public final void apply() {
		Rasterizer2D.Rasterizer2D_replace(this.pixels, this.width, this.height); // L: 11
	} // L: 12
}
