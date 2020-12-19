import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("gg")
@Implements("ByteArrayNode")
public class ByteArrayNode extends Node {
	@ObfuscatedName("h")
	@Export("byteArray")
	public byte[] byteArray;

	public ByteArrayNode(byte[] var1) {
		this.byteArray = var1; // L: 7
	} // L: 8
}
