import java.awt.Image;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
@Implements("Clock")
public abstract class Clock {
	@ObfuscatedName("aq")
	static Image field1740;
	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("archive17")
	static Archive archive17;

	Clock() {
	} // L: 4

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2049179835"
	)
	@Export("mark")
	public abstract void mark();

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-113"
	)
	@Export("wait")
	public abstract int wait(int var1, int var2);

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "([BI)Llv;",
		garbageValue = "-136888407"
	)
	public static Font method3125(byte[] var0) {
		if (var0 == null) { // L: 138
			return null;
		} else {
			Font var1 = new Font(var0, class434.SpriteBuffer_xOffsets, class434.SpriteBuffer_yOffsets, class434.SpriteBuffer_spriteWidths, Fonts.SpriteBuffer_spriteHeights, HealthBarUpdate.SpriteBuffer_spritePalette, WorldMapLabelSize.SpriteBuffer_pixels); // L: 139
			Canvas.method365(); // L: 140
			return var1; // L: 141
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "91"
	)
	public static void method3121() {
		SequenceDefinition.SequenceDefinition_cached.clear(); // L: 403
		SequenceDefinition.SequenceDefinition_cachedFrames.clear(); // L: 404
		SequenceDefinition.SequenceDefinition_cachedModel.clear(); // L: 405
	} // L: 406
}
