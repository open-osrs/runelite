import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("c")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 44459875
	)
	@Export("world")
	public int world;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	@Export("username")
	public Username username;

	ClanChannelMember() {
	} // L: 10

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llh;III)[Lqu;",
		garbageValue = "658098688"
	)
	public static IndexedSprite[] method2867(AbstractArchive var0, int var1, int var2) {
		if (!Ignored.method6774(var0, var1, var2)) { // L: 23
			return null;
		} else {
			IndexedSprite[] var4 = new IndexedSprite[class456.SpriteBuffer_spriteCount]; // L: 26

			for (int var5 = 0; var5 < class456.SpriteBuffer_spriteCount; ++var5) { // L: 27
				IndexedSprite var6 = var4[var5] = new IndexedSprite(); // L: 28
				var6.width = ModelData0.SpriteBuffer_spriteWidth; // L: 29
				var6.height = class456.SpriteBuffer_spriteHeight; // L: 30
				var6.xOffset = class426.SpriteBuffer_xOffsets[var5]; // L: 31
				var6.yOffset = class142.SpriteBuffer_yOffsets[var5]; // L: 32
				var6.subWidth = class359.SpriteBuffer_spriteWidths[var5]; // L: 33
				var6.subHeight = class456.SpriteBuffer_spriteHeights[var5]; // L: 34
				var6.palette = class13.SpriteBuffer_spritePalette; // L: 35
				var6.pixels = class421.SpriteBuffer_pixels[var5]; // L: 36
			}

			class426.SpriteBuffer_xOffsets = null; // L: 39
			class142.SpriteBuffer_yOffsets = null; // L: 40
			class359.SpriteBuffer_spriteWidths = null; // L: 41
			class456.SpriteBuffer_spriteHeights = null; // L: 42
			class13.SpriteBuffer_spritePalette = null; // L: 43
			class421.SpriteBuffer_pixels = null;
			return var4;
		}
	}

	@ObfuscatedName("v")
	static boolean method2865(long var0) {
		return class7.method51(var0) == 2; // L: 48
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "88442168"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 44
		return var1 == null ? 0 : var1.size(); // L: 45 46
	}
}
