import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
public class class258 {
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(B)Lln;",
		garbageValue = "-51"
	)
	@Export("SpriteBuffer_createSprite")
	static Sprite SpriteBuffer_createSprite() {
		Sprite var0 = new Sprite();
		var0.width = SpriteBuffer.SpriteBuffer_spriteWidth;
		var0.height = SpriteBuffer.SpriteBuffer_spriteHeight;
		var0.yOffset = SpriteBuffer.SpriteBuffer_xOffsets[0];
		var0.xOffset = SpriteBuffer.SpriteBuffer_yOffsets[0];
		var0.subWidth = VarbitDefinition.SpriteBuffer_spriteWidths[0];
		var0.subHeight = SecureRandomCallable.SpriteBuffer_spriteHeights[0];
		int var1 = var0.subHeight * var0.subWidth;
		byte[] var2 = SpriteBuffer.SpriteBuffer_pixels[0];
		var0.pixels = new int[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			var0.pixels[var3] = SpriteBuffer.SpriteBuffer_spritePalette[var2[var3] & 255];
		}

		SpriteBuffer.SpriteBuffer_xOffsets = null;
		SpriteBuffer.SpriteBuffer_yOffsets = null;
		VarbitDefinition.SpriteBuffer_spriteWidths = null;
		SecureRandomCallable.SpriteBuffer_spriteHeights = null;
		SpriteBuffer.SpriteBuffer_spritePalette = null;
		SpriteBuffer.SpriteBuffer_pixels = ((byte[][])null);
		return var0;
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		signature = "(IIIIIIIIII)V",
		garbageValue = "772902595"
	)
	static final void method4898(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		PendingSpawn var9 = null;

		for (PendingSpawn var10 = (PendingSpawn)Client.pendingSpawns.last(); var10 != null; var10 = (PendingSpawn)Client.pendingSpawns.previous()) {
			if (var0 == var10.plane && var10.x == var1 && var2 == var10.y && var3 == var10.type) {
				var9 = var10;
				break;
			}
		}

		if (var9 == null) {
			var9 = new PendingSpawn();
			var9.plane = var0;
			var9.type = var3;
			var9.x = var1;
			var9.y = var2;
			class13.method165(var9);
			Client.pendingSpawns.addFirst(var9);
		}

		var9.id = var4;
		var9.field908 = var5;
		var9.orientation = var6;
		var9.delay = var7;
		var9.hitpoints = var8;
	}
}
