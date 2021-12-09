import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
public class class124 extends class126 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("musicTrackArchive")
	public static AbstractArchive musicTrackArchive;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = 3062767969711137225L
	)
	long field1485;
	@ObfuscatedName("b")
	String field1484;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	final class129 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lda;)V"
	)
	class124(class129 var1) {
		this.this$0 = var1;
		this.field1485 = -1L;
		this.field1484 = null;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "1416770155"
	)
	void vmethod3029(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1485 = var1.readLong();
		}

		this.field1484 = var1.readStringCp1252NullTerminatedOrNull();
	} // L: 85

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lej;I)V",
		garbageValue = "-1531735008"
	)
	void vmethod3028(ClanSettings var1) {
		var1.method2850(this.field1485, this.field1484, 0); // L: 88
	} // L: 89

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lpj;B)I",
		garbageValue = "3"
	)
	static int method2747(PacketBuffer var0) {
		int var1 = var0.readBits(2); // L: 187
		int var2;
		if (var1 == 0) { // L: 189
			var2 = 0;
		} else if (var1 == 1) { // L: 190
			var2 = var0.readBits(5);
		} else if (var1 == 2) { // L: 191
			var2 = var0.readBits(8);
		} else {
			var2 = var0.readBits(11); // L: 192
		}

		return var2; // L: 193
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Lpl;",
		garbageValue = "970200706"
	)
	static SpritePixels method2754() {
		SpritePixels var0 = new SpritePixels(); // L: 72
		var0.width = class432.SpriteBuffer_spriteWidth; // L: 73
		var0.height = class432.SpriteBuffer_spriteHeight; // L: 74
		var0.xOffset = class141.SpriteBuffer_xOffsets[0]; // L: 75
		var0.yOffset = RouteStrategy.SpriteBuffer_yOffsets[0]; // L: 76
		var0.subWidth = class432.SpriteBuffer_spriteWidths[0]; // L: 77
		var0.subHeight = class330.SpriteBuffer_spriteHeights[0]; // L: 78
		int var1 = var0.subWidth * var0.subHeight; // L: 79
		byte[] var2 = class369.SpriteBuffer_pixels[0]; // L: 80
		var0.pixels = new int[var1]; // L: 81

		for (int var3 = 0; var3 < var1; ++var3) { // L: 82
			var0.pixels[var3] = class432.SpriteBuffer_spritePalette[var2[var3] & 255];
		}

		UserComparator3.method2529(); // L: 83
		return var0; // L: 84
	}
}
