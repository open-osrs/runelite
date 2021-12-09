import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pn")
@Implements("AbstractRasterProvider")
public abstract class AbstractRasterProvider {
	@ObfuscatedName("p")
	@Export("pixels")
	public int[] pixels;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1468450979
	)
	@Export("width")
	public int width;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 191788269
	)
	@Export("height")
	public int height;

	protected AbstractRasterProvider() {
	} // L: 8

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "0"
	)
	@Export("drawFull")
	public abstract void drawFull(int var1, int var2);

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1782361529"
	)
	@Export("draw")
	public abstract void draw(int var1, int var2, int var3, int var4);

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1651135554"
	)
	@Export("apply")
	public final void apply() {
		Rasterizer2D.Rasterizer2D_replace(this.pixels, this.width, this.height); // L: 11
	} // L: 12

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-685860336"
	)
	static int method7714() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 2159
			int var0 = 0; // L: 2160

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) { // L: 2161
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount; // L: 2162
			}

			return var0 * 10000 / Client.field753; // L: 2164
		} else {
			return 10000;
		}
	}
}
