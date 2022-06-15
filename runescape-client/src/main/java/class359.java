import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mf")
public class class359 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	public static final class359 field4260;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	static final class359 field4259;
	@ObfuscatedName("e")
	@Export("SpriteBuffer_spriteWidths")
	public static int[] SpriteBuffer_spriteWidths;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "[Lpa;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1555727855
	)
	final int field4258;

	static {
		field4260 = new class359(1); // L: 5
		field4259 = new class359(0); // L: 6
	}

	class359(int var1) {
		this.field4258 = var1; // L: 10
	} // L: 11
}
