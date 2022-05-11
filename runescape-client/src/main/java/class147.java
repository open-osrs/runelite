import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
public class class147 extends class128 {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1715614877
	)
	@Export("KitDefinition_fileCount")
	public static int KitDefinition_fileCount;
	@ObfuscatedName("ej")
	@ObfuscatedGetter(
		longValue = 7229837819444879765L
	)
	static long field1704;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 876557161
	)
	int field1699;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leh;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leh;)V"
	)
	class147(class131 var1) {
		this.this$0 = var1;
		this.field1699 = -1; // L: 144
	} // L: 146

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "-611912046"
	)
	void vmethod3040(Buffer var1) {
		this.field1699 = var1.readUnsignedShort(); // L: 149
	} // L: 150

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lek;B)V",
		garbageValue = "-73"
	)
	void vmethod3041(ClanSettings var1) {
		var1.method2894(this.field1699); // L: 153
	} // L: 154

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "107"
	)
	public static int method3000(int var0) {
		return class271.field3220[var0]; // L: 49
	}
}
