import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("li")
@Implements("NetFileRequest")
public class NetFileRequest extends DualNode {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("archive")
	public Archive archive;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 211628067
	)
	@Export("crc")
	public int crc;
	@ObfuscatedName("l")
	@Export("padding")
	public byte padding;

	NetFileRequest() {
	} // L: 10

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)Z",
		garbageValue = "112"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		return class162.method3207(var0, 10, true); // L: 35
	}
}
