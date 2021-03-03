import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("s")
public class class10 {
	@ObfuscatedName("n")
	final int field60;
	@ObfuscatedName("v")
	final int field61;
	@ObfuscatedName("d")
	final String field62;

	@ObfuscatedSignature(
		descriptor = "(Lkx;)V"
	)
	class10(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated()); // L: 19
	} // L: 20

	class10(int var1, int var2, String var3) {
		this.field60 = var1; // L: 13
		this.field61 = var2; // L: 14
		this.field62 = var3; // L: 15
	} // L: 16

	@ObfuscatedName("n")
	String method115() {
		return Integer.toHexString(this.field60) + Integer.toHexString(this.field61) + this.field62; // L: 23
	}

	@ObfuscatedName("v")
	int method111() {
		return this.field61; // L: 27
	}
}
