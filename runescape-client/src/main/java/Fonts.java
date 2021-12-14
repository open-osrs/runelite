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
		this.spritesArchive = var1;
		this.fontsArchive = var2;
		this.map = new HashMap();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([Lot;I)Ljava/util/HashMap;",
		garbageValue = "700588236"
	)
	@Export("createMap")
	public HashMap createMap(FontName[] var1) {
		HashMap var2 = new HashMap();
		FontName[] var3 = var1;

		for (int var4 = 0; var4 < var3.length; ++var4) {
			FontName var5 = var3[var4];
			if (this.map.containsKey(var5)) {
				var2.put(var5, this.map.get(var5));
			} else {
				AbstractArchive var7 = this.spritesArchive;
				AbstractArchive var8 = this.fontsArchive;
				String var9 = var5.name;
				int var10 = var7.getGroupId(var9);
				int var11 = var7.getFileId(var10, "");
				Font var12;
				if (!class147.method3009(var7, var10, var11)) {
					var12 = null;
				} else {
					byte[] var14 = var8.takeFile(var10, var11);
					Font var13;
					if (var14 == null) {
						var13 = null;
					} else {
						Font var15 = new Font(var14, class141.SpriteBuffer_xOffsets, RouteStrategy.SpriteBuffer_yOffsets, class432.SpriteBuffer_spriteWidths, class330.SpriteBuffer_spriteHeights, class432.SpriteBuffer_spritePalette, class369.SpriteBuffer_pixels);
						UserComparator3.method2529();
						var13 = var15;
					}

					var12 = var13;
				}

				if (var12 != null) {
					this.map.put(var5, var12);
					var2.put(var5, var12);
				}
			}
		}

		return var2;
	}
}
