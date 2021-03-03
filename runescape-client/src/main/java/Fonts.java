import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ki")
@Implements("Fonts")
public class Fonts {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("spritesArchive")
	AbstractArchive spritesArchive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("fontsArchive")
	AbstractArchive fontsArchive;
	@ObfuscatedName("d")
	@Export("map")
	HashMap map;

	@ObfuscatedSignature(
		descriptor = "(Lig;Lig;)V"
	)
	public Fonts(AbstractArchive var1, AbstractArchive var2) {
		this.spritesArchive = var1; // L: 14
		this.fontsArchive = var2; // L: 15
		this.map = new HashMap(); // L: 16
	} // L: 17

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "([Lkq;I)Ljava/util/HashMap;",
		garbageValue = "-988913234"
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
				byte[] var14 = var7.takeFile(var10, var11); // L: 41
				boolean var13;
				if (var14 == null) { // L: 42
					var13 = false; // L: 43
				} else {
					GrandExchangeOfferNameComparator.SpriteBuffer_decode(var14); // L: 46
					var13 = true; // L: 47
				}

				Font var12;
				if (!var13) { // L: 49
					var12 = null; // L: 50
				} else {
					byte[] var15 = var8.takeFile(var10, var11); // L: 54
					Font var18;
					if (var15 == null) { // L: 56
						var18 = null; // L: 57
					} else {
						Font var16 = new Font(var15, class105.SpriteBuffer_xOffsets, class336.SpriteBuffer_yOffsets, class336.SpriteBuffer_spriteWidths, class225.SpriteBuffer_spriteHeights, HorizontalAlignment.SpriteBuffer_spritePalette, class2.SpriteBuffer_pixels); // L: 60
						class105.SpriteBuffer_xOffsets = null; // L: 62
						class336.SpriteBuffer_yOffsets = null; // L: 63
						class336.SpriteBuffer_spriteWidths = null; // L: 64
						class225.SpriteBuffer_spriteHeights = null; // L: 65
						HorizontalAlignment.SpriteBuffer_spritePalette = null; // L: 66
						class2.SpriteBuffer_pixels = null; // L: 67
						var18 = var16; // L: 69
					}

					var12 = var18; // L: 71
				}

				if (var12 != null) { // L: 76
					this.map.put(var5, var12); // L: 77
					var2.put(var5, var12); // L: 78
				}
			}
		}

		return var2; // L: 84
	}
}
