import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
public class class142 extends class128 {
	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("dragInventoryWidget")
	static Widget dragInventoryWidget;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1140726439
	)
	int field1623;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Les;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Les;)V"
	)
	class142(class131 var1) {
		this.this$0 = var1;
		this.field1623 = -1; // L: 213
	} // L: 215

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "-413979452"
	)
	void vmethod3168(Buffer var1) {
		this.field1623 = var1.readUnsignedShort(); // L: 218
	} // L: 219

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lex;S)V",
		garbageValue = "-10316"
	)
	void vmethod3162(ClanSettings var1) {
		var1.method2963(this.field1623); // L: 222
	} // L: 223
}
