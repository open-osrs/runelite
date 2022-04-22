import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
public class class125 extends class128 {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1563450385
	)
	int field1505;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 166042901
	)
	int field1506;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 436886769
	)
	int field1504;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -647039723
	)
	int field1503;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Les;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Les;)V"
	)
	class125(class131 var1) {
		this.this$0 = var1;
		this.field1505 = -1; // L: 158
	} // L: 163

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "-413979452"
	)
	void vmethod3168(Buffer var1) {
		this.field1505 = var1.readUnsignedShort(); // L: 166
		this.field1506 = var1.readInt(); // L: 167
		this.field1504 = var1.readUnsignedByte(); // L: 168
		this.field1503 = var1.readUnsignedByte(); // L: 169
	} // L: 170

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lex;S)V",
		garbageValue = "-10316"
	)
	void vmethod3162(ClanSettings var1) {
		var1.method2967(this.field1505, this.field1506, this.field1504, this.field1503); // L: 173
	} // L: 174

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lln;Lln;Lln;I)V",
		garbageValue = "2079991679"
	)
	public static void method2811(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		class11.SequenceDefinition_archive = var0; // L: 46
		SequenceDefinition.SequenceDefinition_animationsArchive = var1; // L: 47
		SequenceDefinition.SequenceDefinition_skeletonsArchive = var2; // L: 48
	} // L: 49
}
