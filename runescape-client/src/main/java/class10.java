import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("n")
public class class10 {
	@ObfuscatedName("z")
	final int field55;
	@ObfuscatedName("k")
	final int field56;
	@ObfuscatedName("s")
	final String field54;

	@ObfuscatedSignature(
		descriptor = "(Lkf;)V"
	)
	class10(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated()); // L: 19
	} // L: 20

	class10(int var1, int var2, String var3) {
		this.field55 = var1; // L: 13
		this.field56 = var2; // L: 14
		this.field54 = var3; // L: 15
	} // L: 16

	@ObfuscatedName("z")
	String method126() {
		return Integer.toHexString(this.field55) + Integer.toHexString(this.field56) + this.field54; // L: 23
	}

	@ObfuscatedName("k")
	int method125() {
		return this.field56; // L: 27
	}
}
