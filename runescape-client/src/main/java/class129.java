import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
public class class129 extends class128 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1753824971
	)
	int field1575;
	@ObfuscatedName("v")
	boolean field1574;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lej;)V"
	)
	class129(class131 var1) {
		this.this$0 = var1;
		this.field1575 = -1; // L: 178
	} // L: 181

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqt;B)V",
		garbageValue = "5"
	)
	void vmethod3150(Buffer var1) {
		this.field1575 = var1.readUnsignedShort(); // L: 184
		this.field1574 = var1.readUnsignedByte() == 1; // L: 185
	} // L: 186

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Len;I)V",
		garbageValue = "-1718344311"
	)
	void vmethod3149(ClanSettings var1) {
		var1.method2963(this.field1575, this.field1574); // L: 189
	} // L: 190

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "26009"
	)
	static final int method2864(int var0, int var1) {
		if (var0 == -1) { // L: 919
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 920
			if (var1 < 2) { // L: 921
				var1 = 2;
			} else if (var1 > 126) { // L: 922
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 923
		}
	}
}
