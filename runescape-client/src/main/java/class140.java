import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
public class class140 extends class116 {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 745806175
	)
	int field1542;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		longValue = 5393161811926100225L
	)
	long field1539;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldg;)V"
	)
	class140(class119 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-912681401"
	)
	void vmethod2767(Buffer var1) {
		this.field1542 = var1.readInt();
		this.field1539 = var1.readLong();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ldk;I)V",
		garbageValue = "-1225074726"
	)
	void vmethod2766(ClanSettings var1) {
		var1.method2599(this.field1542, this.field1539);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "28594"
	)
	public static int method2770(int var0, int var1) {
		return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383;
	}
}
