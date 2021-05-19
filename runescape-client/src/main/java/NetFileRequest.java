import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jc")
@Implements("NetFileRequest")
public class NetFileRequest extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("archive")
	Archive archive;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -279924423
	)
	@Export("crc")
	int crc;
	@ObfuscatedName("o")
	@Export("padding")
	byte padding;

	NetFileRequest() {
	} // L: 10
}
