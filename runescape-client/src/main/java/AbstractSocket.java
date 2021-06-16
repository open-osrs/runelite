import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lk")
@Implements("AbstractSocket")
public abstract class AbstractSocket {
	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;

	protected AbstractSocket() {
	} // L: 7

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1854440694"
	)
	@Export("close")
	public abstract void close();

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "574875272"
	)
	@Export("readUnsignedByte")
	public abstract int readUnsignedByte() throws IOException;

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2063198043"
	)
	@Export("available")
	public abstract int available() throws IOException;

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2019948581"
	)
	@Export("isAvailable")
	public abstract boolean isAvailable(int var1) throws IOException;

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "-334344092"
	)
	@Export("read")
	public abstract int read(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-1206684972"
	)
	@Export("write")
	public abstract void write(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Loa;",
		garbageValue = "-2039946675"
	)
	static SpritePixels method5940() {
		SpritePixels var0 = new SpritePixels(); // L: 124
		var0.width = class397.SpriteBuffer_spriteWidth; // L: 125
		var0.height = class244.SpriteBuffer_spriteHeight; // L: 126
		var0.xOffset = class397.SpriteBuffer_xOffsets[0]; // L: 127
		var0.yOffset = class26.SpriteBuffer_yOffsets[0]; // L: 128
		var0.subWidth = Canvas.SpriteBuffer_spriteWidths[0]; // L: 129
		var0.subHeight = Clock.SpriteBuffer_spriteHeights[0]; // L: 130
		int var1 = var0.subHeight * var0.subWidth; // L: 131
		byte[] var2 = class126.SpriteBuffer_pixels[0]; // L: 132
		var0.pixels = new int[var1]; // L: 133

		for (int var3 = 0; var3 < var1; ++var3) { // L: 134
			var0.pixels[var3] = class397.SpriteBuffer_spritePalette[var2[var3] & 255];
		}

		ArchiveDisk.method5993(); // L: 135
		return var0; // L: 136
	}
}
