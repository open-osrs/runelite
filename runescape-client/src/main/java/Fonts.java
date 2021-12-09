import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oh")
@Implements("Fonts")
public class Fonts {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("spritesArchive")
	AbstractArchive spritesArchive;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("fontsArchive")
	AbstractArchive fontsArchive;
	@ObfuscatedName("p")
	@Export("map")
	HashMap map;

	@ObfuscatedSignature(
		descriptor = "(Lku;Lku;)V"
	)
	public Fonts(AbstractArchive var1, AbstractArchive var2) {
		this.spritesArchive = var1; // L: 14
		this.fontsArchive = var2; // L: 15
		this.map = new HashMap(); // L: 16
	} // L: 17

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([Lot;I)Ljava/util/HashMap;",
		garbageValue = "700588236"
	)
	@Export("createMap")
	public HashMap createMap(FontName[] var1) {
		HashMap var2 = new HashMap(); // L: 20
		FontName[] var3 = var1; // L: 22

		for (int var4 = 0; var4 < var3.length; ++var4) { // L: 23
			FontName var5 = var3[var4]; // L: 24
			if (this.map.containsKey(var5)) { // L: 26
				var2.put(var5, this.map.get(var5)); // L: 27
			} else {
				AbstractArchive var7 = this.spritesArchive; // L: 31
				AbstractArchive var8 = this.fontsArchive; // L: 32
				String var9 = var5.name; // L: 33
				int var10 = var7.getGroupId(var9); // L: 35
				int var11 = var7.getFileId(var10, ""); // L: 36
				Font var12;
				if (!class147.method3009(var7, var10, var11)) { // L: 39
					var12 = null; // L: 40
				} else {
					byte[] var14 = var8.takeFile(var10, var11); // L: 44
					Font var13;
					if (var14 == null) { // L: 46
						var13 = null; // L: 47
					} else {
						Font var15 = new Font(var14, class141.SpriteBuffer_xOffsets, RouteStrategy.SpriteBuffer_yOffsets, class432.SpriteBuffer_spriteWidths, class330.SpriteBuffer_spriteHeights, class432.SpriteBuffer_spritePalette, class369.SpriteBuffer_pixels); // L: 50
						UserComparator3.method2529(); // L: 51
						var13 = var15; // L: 52
					}

					var12 = var13; // L: 54
				}

				if (var12 != null) { // L: 59
					this.map.put(var5, var12); // L: 60
					var2.put(var5, var12); // L: 61
				}
			}
		}

		return var2; // L: 67
	}
}
