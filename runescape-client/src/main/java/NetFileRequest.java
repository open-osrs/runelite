import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kj")
@Implements("NetFileRequest")
public class NetFileRequest extends DualNode {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("archive")
	public Archive archive;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1566075383
	)
	@Export("crc")
	public int crc;
	@ObfuscatedName("s")
	@Export("padding")
	public byte padding;

	NetFileRequest() {
	} // L: 10

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)Log;",
		garbageValue = "-1401189412"
	)
	public static class392 method5300(int var0) {
		int var1 = class390.field4266[var0]; // L: 11
		if (var1 == 1) { // L: 12
			return class392.field4276; // L: 13
		} else if (var1 == 2) { // L: 15
			return class392.field4271; // L: 16
		} else {
			return var1 == 3 ? class392.field4270 : null; // L: 18 19 21
		}
	}
}
