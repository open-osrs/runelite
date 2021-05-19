import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("he")
@Implements("MusicPatchNode2")
public class MusicPatchNode2 {
	@ObfuscatedName("gb")
	@ObfuscatedGetter(
		intValue = 1435623037
	)
	static int field2827;
	@ObfuscatedName("h")
	byte[] field2819;
	@ObfuscatedName("c")
	byte[] field2818;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -363994675
	)
	int field2825;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 612743299
	)
	int field2820;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 84150397
	)
	int field2821;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -2015819751
	)
	int field2822;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 2040346983
	)
	int field2824;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -4510781
	)
	int field2826;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 2119976999
	)
	int field2817;

	MusicPatchNode2() {
	} // L: 14

	@ObfuscatedName("h")
	static boolean method4349(long var0) {
		return PacketWriter.method2409(var0) == 2; // L: 44
	}
}
