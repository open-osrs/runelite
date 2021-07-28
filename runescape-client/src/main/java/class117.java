import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
public class class117 extends class103 {
	@ObfuscatedName("hv")
	@ObfuscatedGetter(
		intValue = -372121489
	)
	@Export("cameraYaw")
	static int cameraYaw;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -249649709
	)
	int field1401;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	final class106 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldn;)V"
	)
	class117(class106 var1) {
		this.this$0 = var1;
		this.field1401 = -1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lnv;B)V",
		garbageValue = "0"
	)
	void vmethod2562(Buffer var1) {
		this.field1401 = var1.readUnsignedShort();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ldj;I)V",
		garbageValue = "1598392944"
	)
	void vmethod2567(ClanSettings var1) {
		var1.method2366(this.field1401);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljy;Ljava/lang/String;Ljava/lang/String;I)Lof;",
		garbageValue = "1355330323"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1);
		int var4 = var0.getFileId(var3, var2);
		IndexedSprite var5;
		if (!class290.method5208(var0, var3, var4)) {
			var5 = null;
		} else {
			IndexedSprite var7 = new IndexedSprite();
			var7.width = class398.SpriteBuffer_spriteWidth;
			var7.height = class398.SpriteBuffer_spriteHeight;
			var7.xOffset = class398.SpriteBuffer_xOffsets[0];
			var7.yOffset = class398.SpriteBuffer_yOffsets[0];
			var7.subWidth = ClanChannelMember.SpriteBuffer_spriteWidths[0];
			var7.subHeight = class374.SpriteBuffer_spriteHeights[0];
			var7.palette = class118.SpriteBuffer_spritePalette;
			var7.pixels = class398.SpriteBuffer_pixels[0];
			class398.SpriteBuffer_xOffsets = null;
			class398.SpriteBuffer_yOffsets = null;
			ClanChannelMember.SpriteBuffer_spriteWidths = null;
			class374.SpriteBuffer_spriteHeights = null;
			class118.SpriteBuffer_spritePalette = null;
			class398.SpriteBuffer_pixels = null;
			var5 = var7;
		}

		return var5;
	}
}
