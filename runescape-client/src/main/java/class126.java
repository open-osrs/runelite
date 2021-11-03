import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
public class class126 extends class116 {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1462518915
	)
	int field1433;
	@ObfuscatedName("w")
	String field1432;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldg;)V"
	)
	class126(class119 var1) {
		this.this$0 = var1; // L: 323
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-2002779676"
	)
	void vmethod2847(Buffer var1) {
		this.field1433 = var1.readInt(); // L: 326
		this.field1432 = var1.readStringCp1252NullTerminated(); // L: 327
	} // L: 328

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ldm;I)V",
		garbageValue = "-293908864"
	)
	void vmethod2848(ClanSettings var1) {
		var1.method2667(this.field1433, this.field1432); // L: 331
	} // L: 332

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-19"
	)
	static void method2646() {
		if (Client.oculusOrbState == 1) { // L: 12021
			Client.field511 = true; // L: 12022
		}

	} // L: 12024
}
