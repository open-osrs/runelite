import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("s")
public enum class6 implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ls;"
	)
	field14(0, 0);

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lah;"
	)
	@Export("soundSystem")
	static SoundSystem soundSystem;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -758443575
	)
	public final int field12;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 834021789
	)
	final int field13;

	class6(int var3, int var4) {
		this.field12 = var3; // L: 12
		this.field13 = var4; // L: 13
	} // L: 14

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field13; // L: 17
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lln;III)Lqi;",
		garbageValue = "-1027602960"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2); // L: 40
		boolean var3;
		if (var4 == null) { // L: 41
			var3 = false; // L: 42
		} else {
			WorldMapArea.SpriteBuffer_decode(var4); // L: 45
			var3 = true; // L: 46
		}

		if (!var3) { // L: 48
			return null;
		} else {
			SpritePixels var5 = new SpritePixels(); // L: 51
			var5.width = class451.SpriteBuffer_spriteWidth; // L: 52
			var5.height = class451.SpriteBuffer_spriteHeight; // L: 53
			var5.xOffset = class451.SpriteBuffer_xOffsets[0]; // L: 54
			var5.yOffset = class271.SpriteBuffer_yOffsets[0]; // L: 55
			var5.subWidth = class451.SpriteBuffer_spriteWidths[0]; // L: 56
			var5.subHeight = class451.SpriteBuffer_spriteHeights[0]; // L: 57
			int var6 = var5.subWidth * var5.subHeight; // L: 58
			byte[] var7 = FriendLoginUpdate.SpriteBuffer_pixels[0]; // L: 59
			var5.pixels = new int[var6]; // L: 60

			for (int var8 = 0; var8 < var6; ++var8) { // L: 61
				var5.pixels[var8] = NetFileRequest.SpriteBuffer_spritePalette[var7[var8] & 255];
			}

			ArchiveDiskActionHandler.method5813(); // L: 62
			return var5; // L: 65
		}
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "144596898"
	)
	static boolean method36() {
		return (Client.drawPlayerNames & 8) != 0; // L: 4857
	}
}
