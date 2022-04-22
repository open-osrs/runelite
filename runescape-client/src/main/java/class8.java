import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("q")
public class class8 {
	@ObfuscatedName("v")
	final int field23;
	@ObfuscatedName("c")
	final int field24;
	@ObfuscatedName("i")
	final String field25;

	@ObfuscatedSignature(
		descriptor = "(Lpi;)V"
	)
	class8(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated()); // L: 19
	} // L: 20

	class8(int var1, int var2, String var3) {
		this.field23 = var1; // L: 13
		this.field24 = var2; // L: 14
		this.field25 = var3; // L: 15
	} // L: 16

	@ObfuscatedName("v")
	String method61() {
		return Integer.toHexString(this.field23) + Integer.toHexString(this.field24) + this.field25; // L: 23
	}

	@ObfuscatedName("c")
	int method56() {
		return this.field24; // L: 27
	}
}
