import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iz")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("c")
	@Export("text")
	String text;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1772526111
	)
	@Export("width")
	int width;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1037270607
	)
	@Export("height")
	int height;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILhq;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1; // L: 10
		this.width = var2; // L: 11
		this.height = var3; // L: 12
		this.size = var4; // L: 13
	} // L: 14

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llh;B)V",
		garbageValue = "-115"
	)
	public static void method5000(AbstractArchive var0) {
		VarcInt.VarcInt_archive = var0; // L: 15
	} // L: 16

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1560877857"
	)
	public static void method4999() {
		try {
			JagexCache.JagexCache_dat2File.close(); // L: 295

			for (int var0 = 0; var0 < class142.idxCount; ++var0) { // L: 296
				class359.JagexCache_idxFiles[var0].close();
			}

			JagexCache.JagexCache_idx255File.close(); // L: 297
			JagexCache.JagexCache_randomDat.close(); // L: 298
		} catch (Exception var2) { // L: 300
		}

	} // L: 301
}
