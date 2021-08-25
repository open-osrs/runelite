import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kl")
@Implements("NetFileRequest")
public class NetFileRequest extends DualNode {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("archive")
	Archive archive;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 2088693695
	)
	@Export("crc")
	int crc;
	@ObfuscatedName("m")
	@Export("padding")
	byte padding;

	NetFileRequest() {
	}
}
