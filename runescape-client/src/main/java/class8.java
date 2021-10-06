import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("e")
public class class8 {
	@ObfuscatedName("l")
	final int field33;
	@ObfuscatedName("q")
	final int field32;
	@ObfuscatedName("f")
	final String field34;

	@ObfuscatedSignature(
		descriptor = "(Lot;)V"
	)
	class8(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated());
	}

	class8(int var1, int var2, String var3) {
		this.field33 = var1;
		this.field32 = var2;
		this.field34 = var3;
	}

	@ObfuscatedName("l")
	String method67() {
		return Integer.toHexString(this.field33) + Integer.toHexString(this.field32) + this.field34;
	}

	@ObfuscatedName("q")
	int method68() {
		return this.field32;
	}
}
