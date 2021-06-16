import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("z")
public class class10 extends class14 {
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "[Lof;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("archive17")
	static Archive archive17;
	@ObfuscatedName("ot")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	static class340 field74;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1622036421
	)
	int field73;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lv;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lv;)V"
	)
	class10(class2 var1) {
		this.this$0 = var1;
		this.field73 = -1; // L: 213
	} // L: 215

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "73833784"
	)
	void vmethod363(Buffer var1) {
		this.field73 = var1.readUnsignedShort(); // L: 218
	} // L: 219

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lb;I)V",
		garbageValue = "1885623446"
	)
	void vmethod354(ClanSettings var1) {
		var1.method124(this.field73); // L: 222
	} // L: 223

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljp;I)V",
		garbageValue = "1676920158"
	)
	public static void method109(AbstractArchive var0) {
		EnumComposition.EnumDefinition_archive = var0; // L: 25
	} // L: 26

	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1908881441"
	)
	static void method113(int var0) {
		for (IntegerNode var1 = (IntegerNode)Client.widgetFlags.first(); var1 != null; var1 = (IntegerNode)Client.widgetFlags.next()) { // L: 11538
			if ((var1.key >> 48 & 65535L) == (long)var0) { // L: 11539
				var1.remove(); // L: 11540
			}
		}

	} // L: 11543
}
