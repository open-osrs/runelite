import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
public class class150 extends class126 {
	@ObfuscatedName("dc")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 43726911
	)
	int field1666;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		longValue = -6413239553486837791L
	)
	long field1669;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	final class129 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lda;)V"
	)
	class150(class129 var1) {
		this.this$0 = var1; // L: 307
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "1416770155"
	)
	void vmethod3029(Buffer var1) {
		this.field1666 = var1.readInt(); // L: 310
		this.field1669 = var1.readLong(); // L: 311
	} // L: 312

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lej;I)V",
		garbageValue = "-1531735008"
	)
	void vmethod3028(ClanSettings var1) {
		var1.method2856(this.field1666, this.field1669); // L: 315
	} // L: 316
}
