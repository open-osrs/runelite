import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ed")
public class class138 extends class128 {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1629578279
	)
	int field1590;
	@ObfuscatedName("o")
	String field1587;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lee;)V"
	)
	class138(class131 var1) {
		this.this$0 = var1; // L: 323
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpd;B)V",
		garbageValue = "-73"
	)
	void vmethod3107(Buffer var1) {
		this.field1590 = var1.readInt(); // L: 326
		this.field1587 = var1.readStringCp1252NullTerminated(); // L: 327
	} // L: 328

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Leh;I)V",
		garbageValue = "-1228032820"
	)
	void vmethod3104(ClanSettings var1) {
		var1.method2956(this.field1590, this.field1587); // L: 331
	} // L: 332
}
