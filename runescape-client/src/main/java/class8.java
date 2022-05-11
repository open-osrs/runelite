import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("r")
public class class8 {
	@ObfuscatedName("o")
	final int field29;
	@ObfuscatedName("q")
	final int field30;
	@ObfuscatedName("l")
	final String field31;

	@ObfuscatedSignature(
		descriptor = "(Lpx;)V"
	)
	class8(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated()); // L: 19
	} // L: 20

	class8(int var1, int var2, String var3) {
		this.field29 = var1; // L: 13
		this.field30 = var2; // L: 14
		this.field31 = var3; // L: 15
	} // L: 16

	@ObfuscatedName("o")
	String method60() {
		return Integer.toHexString(this.field29) + Integer.toHexString(this.field30) + this.field31; // L: 23
	}

	@ObfuscatedName("q")
	int method58() {
		return this.field30; // L: 27
	}
}
