import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("nc")
@Implements("ByteArrayNode")
public class ByteArrayNode extends Node {
	@ObfuscatedName("n")
	@Export("byteArray")
	public byte[] byteArray;

	public ByteArrayNode(byte[] var1) {
		this.byteArray = var1;
	}
}
