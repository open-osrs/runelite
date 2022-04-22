import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
public class class147 extends class128 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("KitDefinition_modelsArchive")
	public static AbstractArchive KitDefinition_modelsArchive;
	@ObfuscatedName("n")
	@Export("Tiles_shapes")
	static byte[][][] Tiles_shapes;
	@ObfuscatedName("ih")
	@ObfuscatedGetter(
		intValue = -882300729
	)
	@Export("cameraPitch")
	static int cameraPitch;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1886878919
	)
	int field1651;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Les;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Les;)V"
	)
	class147(class131 var1) {
		this.this$0 = var1;
		this.field1651 = -1; // L: 144
	} // L: 146

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "-413979452"
	)
	void vmethod3168(Buffer var1) {
		this.field1651 = var1.readUnsignedShort(); // L: 149
	} // L: 150

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lex;S)V",
		garbageValue = "-10316"
	)
	void vmethod3162(ClanSettings var1) {
		var1.method2965(this.field1651); // L: 153
	} // L: 154

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ldt;FI)F",
		garbageValue = "-952832501"
	)
	static float method3106(class117 var0, float var1) {
		if (var0 == null) { // L: 191
			return 0.0F; // L: 192
		} else {
			float var2 = var1 - var0.field1422; // L: 194
			return var0.field1415[3] + (var0.field1415[2] + (var0.field1415[1] + var2 * var0.field1415[0]) * var2) * var2; // L: 195
		}
	}
}
