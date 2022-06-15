import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
public class class143 extends class128 {
	@ObfuscatedName("ur")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = -4142648210474393183L
	)
	long field1668;
	@ObfuscatedName("v")
	String field1667;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 81354487
	)
	int field1669;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lej;)V"
	)
	class143(class131 var1) {
		this.this$0 = var1;
		this.field1668 = -1L; // L: 93
		this.field1667 = null; // L: 94
		this.field1669 = 0; // L: 95
	} // L: 97

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqt;B)V",
		garbageValue = "5"
	)
	void vmethod3150(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 100
			--var1.offset; // L: 101
			this.field1668 = var1.readLong(); // L: 102
		}

		this.field1667 = var1.readStringCp1252NullTerminatedOrNull(); // L: 104
		this.field1669 = var1.readUnsignedShort(); // L: 105
	} // L: 106

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Len;I)V",
		garbageValue = "-1718344311"
	)
	void vmethod3149(ClanSettings var1) {
		var1.method2956(this.field1668, this.field1667, this.field1669); // L: 109
	} // L: 110
}
