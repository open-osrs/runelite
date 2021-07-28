import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("o")
public class class8 {
	@ObfuscatedName("s")
	final int field28;
	@ObfuscatedName("t")
	final int field27;
	@ObfuscatedName("v")
	final String field29;

	@ObfuscatedSignature(
		descriptor = "(Lnv;)V"
	)
	class8(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated());
	}

	class8(int var1, int var2, String var3) {
		this.field28 = var1;
		this.field27 = var2;
		this.field29 = var3;
	}

	@ObfuscatedName("s")
	String method61() {
		return Integer.toHexString(this.field28) + Integer.toHexString(this.field27) + this.field29;
	}

	@ObfuscatedName("t")
	int method67() {
		return this.field27;
	}
}
