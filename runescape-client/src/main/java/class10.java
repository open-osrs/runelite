import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("u")
public class class10 {
	@ObfuscatedName("h")
	final int field47;
	@ObfuscatedName("v")
	final int field48;
	@ObfuscatedName("x")
	final String field49;

	@ObfuscatedSignature(
		descriptor = "(Lkj;)V"
	)
	class10(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated()); // L: 19
	} // L: 20

	class10(int var1, int var2, String var3) {
		this.field47 = var1; // L: 13
		this.field48 = var2; // L: 14
		this.field49 = var3; // L: 15
	} // L: 16

	@ObfuscatedName("h")
	String method121() {
		return Integer.toHexString(this.field47) + Integer.toHexString(this.field48) + this.field49; // L: 23
	}

	@ObfuscatedName("v")
	int method114() {
		return this.field48; // L: 27
	}
}
