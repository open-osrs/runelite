import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eo")
public class class142 extends class128 {
	@ObfuscatedName("fr")
	@ObfuscatedGetter(
		intValue = -1385057085
	)
	static int field1634;
	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "[Lql;"
	)
	@Export("mapDotSprites")
	static SpritePixels[] mapDotSprites;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 397410515
	)
	int field1630;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lee;)V"
	)
	class142(class131 var1) {
		this.this$0 = var1;
		this.field1630 = -1; // L: 213
	} // L: 215

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpd;B)V",
		garbageValue = "-73"
	)
	void vmethod3107(Buffer var1) {
		this.field1630 = var1.readUnsignedShort(); // L: 218
	} // L: 219

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Leh;I)V",
		garbageValue = "-1228032820"
	)
	void vmethod3104(ClanSettings var1) {
		var1.method2922(this.field1630); // L: 222
	} // L: 223

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "1"
	)
	public static boolean method3004(int var0, int var1) {
		return (var0 >> var1 + 1 & 1) != 0; // L: 13
	}
}
