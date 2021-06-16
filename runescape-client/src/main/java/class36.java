import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ae")
public class class36 {
	@ObfuscatedName("f")
	final int field250;
	@ObfuscatedName("e")
	final int field249;
	@ObfuscatedName("v")
	final String field248;

	@ObfuscatedSignature(
		descriptor = "(Lnt;)V"
	)
	class36(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated()); // L: 19
	} // L: 20

	class36(int var1, int var2, String var3) {
		this.field250 = var1; // L: 13
		this.field249 = var2; // L: 14
		this.field248 = var3; // L: 15
	} // L: 16

	@ObfuscatedName("f")
	String method425() {
		return Integer.toHexString(this.field250) + Integer.toHexString(this.field249) + this.field248; // L: 23
	}

	@ObfuscatedName("e")
	int method430() {
		return this.field249; // L: 27
	}
}
