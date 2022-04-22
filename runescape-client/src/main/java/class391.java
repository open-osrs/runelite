import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oa")
public class class391 implements class396 {
	@ObfuscatedName("fn")
	@ObfuscatedGetter(
		intValue = -1037477201
	)
	static int field4372;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lpd;"
	)
	public final class419 field4373;

	@ObfuscatedSignature(
		descriptor = "(Lpp;)V"
	)
	class391(class420 var1) {
		this.field4373 = var1; // L: 14
	} // L: 15

	@ObfuscatedSignature(
		descriptor = "(Lom;)V"
	)
	public class391(class392 var1) {
		this(new class420(var1)); // L: 10
	} // L: 11

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "50"
	)
	public int method7105(int var1) {
		return this.field4373.vmethod7471(var1); // L: 18
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZI)V",
		garbageValue = "977969655"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		WorldMapElement.method3403(var0, var1, "openjs", var2); // L: 27
	} // L: 28

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)[Lqi;",
		garbageValue = "1455527219"
	)
	static SpritePixels[] method7111() {
		SpritePixels[] var0 = new SpritePixels[class451.SpriteBuffer_spriteCount]; // L: 169

		for (int var1 = 0; var1 < class451.SpriteBuffer_spriteCount; ++var1) { // L: 170
			SpritePixels var2 = var0[var1] = new SpritePixels(); // L: 171
			var2.width = class451.SpriteBuffer_spriteWidth; // L: 172
			var2.height = class451.SpriteBuffer_spriteHeight; // L: 173
			var2.xOffset = class451.SpriteBuffer_xOffsets[var1]; // L: 174
			var2.yOffset = class271.SpriteBuffer_yOffsets[var1]; // L: 175
			var2.subWidth = class451.SpriteBuffer_spriteWidths[var1]; // L: 176
			var2.subHeight = class451.SpriteBuffer_spriteHeights[var1]; // L: 177
			int var3 = var2.subHeight * var2.subWidth; // L: 178
			byte[] var4 = FriendLoginUpdate.SpriteBuffer_pixels[var1]; // L: 179
			var2.pixels = new int[var3]; // L: 180

			for (int var5 = 0; var5 < var3; ++var5) { // L: 181
				var2.pixels[var5] = NetFileRequest.SpriteBuffer_spritePalette[var4[var5] & 255];
			}
		}

		ArchiveDiskActionHandler.method5813(); // L: 183
		return var0; // L: 184
	}
}
