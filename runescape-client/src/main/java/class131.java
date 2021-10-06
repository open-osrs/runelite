import java.awt.Component;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ev")
public class class131 extends class116 {
	@ObfuscatedName("m")
	@Export("SpriteBuffer_yOffsets")
	public static int[] SpriteBuffer_yOffsets;
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("spriteIds")
	static GraphicsDefaults spriteIds;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		longValue = -3900186400137069511L
	)
	long field1486;
	@ObfuscatedName("q")
	String field1484;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 655775571
	)
	int field1487;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldg;)V"
	)
	class131(class119 var1) {
		this.this$0 = var1;
		this.field1486 = -1L;
		this.field1484 = null;
		this.field1487 = 0;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-912681401"
	)
	void vmethod2767(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1486 = var1.readLong();
		}

		this.field1484 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1487 = var1.readUnsignedShort();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ldk;I)V",
		garbageValue = "-1225074726"
	)
	void vmethod2766(ClanSettings var1) {
		var1.method2646(this.field1486, this.field1484, this.field1487);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "387235799"
	)
	static void method2690(Component var0) {
		var0.addMouseListener(MouseHandler.MouseHandler_instance);
		var0.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var0.addFocusListener(MouseHandler.MouseHandler_instance);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lkl;Ljava/lang/String;Ljava/lang/String;B)Loz;",
		garbageValue = "-74"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1);
		int var4 = var0.getFileId(var3, var2);
		IndexedSprite var5;
		if (!VarbitComposition.method3102(var0, var3, var4)) {
			var5 = null;
		} else {
			IndexedSprite var7 = new IndexedSprite();
			var7.width = class414.SpriteBuffer_spriteWidth;
			var7.height = class408.SpriteBuffer_spriteHeight;
			var7.xOffset = class135.SpriteBuffer_xOffsets[0];
			var7.yOffset = SpriteBuffer_yOffsets[0];
			var7.subWidth = class414.SpriteBuffer_spriteWidths[0];
			var7.subHeight = class16.SpriteBuffer_spriteHeights[0];
			var7.palette = class351.SpriteBuffer_spritePalette;
			var7.pixels = class414.SpriteBuffer_pixels[0];
			StudioGame.method5130();
			var5 = var7;
		}

		return var5;
	}
}
