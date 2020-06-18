import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("w")
public class class10 {
	@ObfuscatedName("m")
	final int field48;
	@ObfuscatedName("o")
	final int field47;
	@ObfuscatedName("q")
	final String field46;

	@ObfuscatedSignature(
		signature = "(Lkn;)V"
	)
	class10(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated());
	}

	class10(int var1, int var2, String var3) {
		this.field48 = var1;
		this.field47 = var2;
		this.field46 = var3;
	}

	@ObfuscatedName("m")
	String method126() {
		return Integer.toHexString(this.field48) + Integer.toHexString(this.field47) + this.field46;
	}

	@ObfuscatedName("o")
	int method123() {
		return this.field47;
	}
}
