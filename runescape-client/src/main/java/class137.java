import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
public class class137 extends class128 {
	@ObfuscatedName("ax")
	static String field1573;
	@ObfuscatedName("v")
	String field1574;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Les;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Les;)V"
	)
	class137(class131 var1) {
		this.this$0 = var1; // L: 229
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "-413979452"
	)
	void vmethod3168(Buffer var1) {
		this.field1574 = var1.readStringCp1252NullTerminated(); // L: 232
		var1.readInt(); // L: 233
	} // L: 234

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lex;S)V",
		garbageValue = "-10316"
	)
	void vmethod3162(ClanSettings var1) {
		var1.name = this.field1574; // L: 237
	} // L: 238

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-66675521"
	)
	public static boolean method2938(int var0) {
		return var0 >= WorldMapDecorationType.field3498.id && var0 <= WorldMapDecorationType.field3518.id; // L: 42
	}
}
