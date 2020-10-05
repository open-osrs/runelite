import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
public class MenuAction {
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	static Buffer NetCache_reference;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1817310685
	)
	int opcode;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -670222051
	)
	int param0;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1502625343
	)
	int param1;
	@ObfuscatedName("t")
	String action;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 691220539
	)
	int identifier;

	MenuAction() {
	} // L: 10944

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIIB)J",
		garbageValue = "0"
	)
	static long method2139(int var0, int var1, int var2) {
		return (long)(var2 << 16 | var0 << 8 | var1); // L: 38
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "([BZB)Ljava/lang/Object;",
		garbageValue = "117"
	)
	public static Object method2140(byte[] var0, boolean var1) {
		if (var0 == null) { // L: 7
			return null;
		} else if (var0.length > 136) { // L: 8
			DirectByteArrayCopier var2 = new DirectByteArrayCopier(); // L: 10
			var2.set(var0); // L: 11
			return var2; // L: 12
		} else {
			return var0; // L: 25
		}
	}
}
