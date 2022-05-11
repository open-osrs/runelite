import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
public class class126 extends class128 {
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Lqd;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = 5516505450809482133L
	)
	long field1567;
	@ObfuscatedName("q")
	String field1566;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leh;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leh;)V"
	)
	class126(class131 var1) {
		this.this$0 = var1;
		this.field1567 = -1L; // L: 74
		this.field1566 = null; // L: 75
	} // L: 77

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "-611912046"
	)
	void vmethod3040(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 80
			--var1.offset; // L: 81
			this.field1567 = var1.readLong(); // L: 82
		}

		this.field1566 = var1.readStringCp1252NullTerminatedOrNull(); // L: 84
	} // L: 85

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lek;B)V",
		garbageValue = "-73"
	)
	void vmethod3041(ClanSettings var1) {
		var1.method2888(this.field1567, this.field1566, 0); // L: 88
	} // L: 89

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-904049199"
	)
	static void method2799(int var0) {
		if (var0 != Login.loginIndex) { // L: 1964
			Login.loginIndex = var0; // L: 1965
		}
	} // L: 1966
}
