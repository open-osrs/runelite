import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("u")
public class class8 {
	@ObfuscatedName("n")
	final int field29;
	@ObfuscatedName("c")
	final int field28;
	@ObfuscatedName("m")
	final String field30;

	@ObfuscatedSignature(
		descriptor = "(Lot;)V"
	)
	class8(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated());
	}

	class8(int var1, int var2, String var3) {
		this.field29 = var1;
		this.field28 = var2;
		this.field30 = var3;
	}

	@ObfuscatedName("n")
	String method65() {
		return Integer.toHexString(this.field29) + Integer.toHexString(this.field28) + this.field30;
	}

	@ObfuscatedName("c")
	int method67() {
		return this.field28;
	}
}
