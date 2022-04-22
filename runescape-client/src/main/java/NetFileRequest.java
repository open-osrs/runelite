import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ly")
@Implements("NetFileRequest")
public class NetFileRequest extends DualNode {
	@ObfuscatedName("sd")
	@ObfuscatedGetter(
		intValue = -1408840155
	)
	static int field3960;
	@ObfuscatedName("l")
	@Export("SpriteBuffer_spritePalette")
	public static int[] SpriteBuffer_spritePalette;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("archive")
	public Archive archive;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 2115176963
	)
	@Export("crc")
	public int crc;
	@ObfuscatedName("i")
	@Export("padding")
	public byte padding;

	NetFileRequest() {
	} // L: 10
}
