import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("h")
public class class8 extends class14 {
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("archive6")
	static Archive archive6;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = -996189269817114369L
	)
	long field58;
	@ObfuscatedName("o")
	String field60;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lu;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lu;)V"
	)
	class8(class2 var1) {
		this.this$0 = var1;
		this.field58 = -1L; // L: 74
		this.field60 = null; // L: 75
	} // L: 77

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "-1383981708"
	)
	void vmethod371(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 80
			--var1.offset; // L: 81
			this.field58 = var1.readLong(); // L: 82
		}

		this.field60 = var1.readStringCp1252NullTerminatedOrNull(); // L: 84
	} // L: 85

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lm;I)V",
		garbageValue = "-1475503816"
	)
	void vmethod376(class11 var1) {
		var1.method146(this.field58, this.field60, 0); // L: 88
	} // L: 89
}
