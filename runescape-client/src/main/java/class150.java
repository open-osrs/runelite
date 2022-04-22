import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
public class class150 extends class128 {
	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "[Lqi;"
	)
	@Export("headIconPkSprites")
	static SpritePixels[] headIconPkSprites;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = -4465707830753509645L
	)
	long field1675;
	@ObfuscatedName("c")
	String field1670;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Les;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Les;)V"
	)
	class150(class131 var1) {
		this.this$0 = var1;
		this.field1675 = -1L; // L: 194
		this.field1670 = null; // L: 195
	} // L: 197

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "-413979452"
	)
	void vmethod3168(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 200
			--var1.offset; // L: 201
			this.field1675 = var1.readLong(); // L: 202
		}

		this.field1670 = var1.readStringCp1252NullTerminatedOrNull(); // L: 204
	} // L: 205

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lex;S)V",
		garbageValue = "-10316"
	)
	void vmethod3162(ClanSettings var1) {
		var1.method2996(this.field1675, this.field1670); // L: 208
	} // L: 209

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-75"
	)
	public static int method3150(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765); // L: 28
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459); // L: 29
		var0 = var0 + (var0 >>> 4) & 252645135; // L: 30
		var0 += var0 >>> 8; // L: 31
		var0 += var0 >>> 16; // L: 32
		return var0 & 255; // L: 33
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "3"
	)
	public static boolean method3149(int var0) {
		return (var0 >> 30 & 1) != 0; // L: 37
	}
}
