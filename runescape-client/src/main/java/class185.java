import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gh")
public class class185 {
	@ObfuscatedName("i")
	public static short[][] field2101;
	@ObfuscatedName("ak")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-58"
	)
	public static int method3784(int var0) {
		return class361.field4056[var0 & 16383];
	}
}
