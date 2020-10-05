import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("io")
@Implements("NetFileRequest")
public class NetFileRequest extends DualNode {
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	static Archive archive2;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	Archive archive;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1779411329
	)
	int crc;
	@ObfuscatedName("s")
	byte padding;

	NetFileRequest() {
	} // L: 10
}
