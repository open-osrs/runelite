import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
public class class120 extends class116 {
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -81138609
	)
	static int field1403;
	@ObfuscatedName("k")
	public static boolean field1401;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1094018377
	)
	int field1400;
	@ObfuscatedName("w")
	byte field1405;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldg;)V"
	)
	class120(class119 var1) {
		this.this$0 = var1;
		this.field1400 = -1; // L: 128
	} // L: 131

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-2002779676"
	)
	void vmethod2847(Buffer var1) {
		this.field1400 = var1.readUnsignedShort(); // L: 134
		this.field1405 = var1.readByte(); // L: 135
	} // L: 136

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ldm;I)V",
		garbageValue = "-293908864"
	)
	void vmethod2848(ClanSettings var1) {
		var1.method2673(this.field1400, this.field1405); // L: 139
	} // L: 140
}
