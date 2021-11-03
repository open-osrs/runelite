import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("j")
public class class8 {
	@ObfuscatedName("i")
	final int field23;
	@ObfuscatedName("w")
	final int field24;
	@ObfuscatedName("s")
	final String field25;

	@ObfuscatedSignature(
		descriptor = "(Lop;)V"
	)
	class8(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated()); // L: 19
	} // L: 20

	class8(int var1, int var2, String var3) {
		this.field23 = var1; // L: 13
		this.field24 = var2; // L: 14
		this.field25 = var3; // L: 15
	} // L: 16

	@ObfuscatedName("i")
	String method60() {
		return Integer.toHexString(this.field23) + Integer.toHexString(this.field24) + this.field25; // L: 23
	}

	@ObfuscatedName("w")
	int method64() {
		return this.field24; // L: 27
	}
}
