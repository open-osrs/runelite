import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ip")
@Implements("NetFileRequest")
public class NetFileRequest extends DualNode {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	@Export("archive")
	public Archive archive;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -319627239
	)
	@Export("crc")
	public int crc;
	@ObfuscatedName("d")
	@Export("padding")
	public byte padding;

	NetFileRequest() {
	} // L: 10
}
