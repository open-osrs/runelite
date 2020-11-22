import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
@Implements("UserComparator5")
public class UserComparator5 extends AbstractUserComparator {
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	@Export("socketTask")
	static Task socketTask;
	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("compass")
	static Sprite compass;
	@ObfuscatedName("f")
	@Export("reversed")
	final boolean reversed;

	public UserComparator5(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lkl;Lkl;I)I",
		garbageValue = "-1154663749"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0) { // L: 14
			if (var2.world == 0) { // L: 15
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world != 0) { // L: 18
			return this.reversed ? 1 : -1;
		}

		return this.compareUser(var1, var2); // L: 20
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 24
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Liw;IIB)[Lle;",
		garbageValue = "-1"
	)
	public static IndexedSprite[] method3540(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2); // L: 25
		boolean var3;
		if (var4 == null) { // L: 26
			var3 = false; // L: 27
		} else {
			class217.SpriteBuffer_decode(var4); // L: 30
			var3 = true; // L: 31
		}

		if (!var3) { // L: 33
			return null;
		} else {
			IndexedSprite[] var5 = new IndexedSprite[class336.SpriteBuffer_spriteCount]; // L: 36

			for (int var6 = 0; var6 < class336.SpriteBuffer_spriteCount; ++var6) { // L: 37
				IndexedSprite var7 = var5[var6] = new IndexedSprite(); // L: 38
				var7.width = class336.SpriteBuffer_spriteWidth; // L: 39
				var7.height = class336.SpriteBuffer_spriteHeight; // L: 40
				var7.xOffset = class336.SpriteBuffer_xOffsets[var6]; // L: 41
				var7.yOffset = class225.SpriteBuffer_yOffsets[var6]; // L: 42
				var7.subWidth = class336.SpriteBuffer_spriteWidths[var6]; // L: 43
				var7.subHeight = class336.SpriteBuffer_spriteHeights[var6]; // L: 44
				var7.palette = WorldMapID.SpriteBuffer_spritePalette; // L: 45
				var7.pixels = class13.SpriteBuffer_pixels[var6]; // L: 46
			}

			class336.SpriteBuffer_xOffsets = null; // L: 49
			class225.SpriteBuffer_yOffsets = null; // L: 50
			class336.SpriteBuffer_spriteWidths = null; // L: 51
			class336.SpriteBuffer_spriteHeights = null; // L: 52
			WorldMapID.SpriteBuffer_spritePalette = null; // L: 53
			class13.SpriteBuffer_pixels = null; // L: 54
			return var5; // L: 58
		}
	}
}
