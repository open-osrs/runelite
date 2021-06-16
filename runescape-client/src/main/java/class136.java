import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
public class class136 {
	@ObfuscatedName("v")
	public short[] field1542;
	@ObfuscatedName("y")
	public short[] field1541;

	class136(int var1) {
		ItemComposition var2 = class250.ItemDefinition_get(var1); // L: 12
		if (var2.method3086()) { // L: 13
			this.field1542 = new short[var2.recolorTo.length]; // L: 14
			System.arraycopy(var2.recolorTo, 0, this.field1542, 0, this.field1542.length); // L: 15
		}

		if (var2.method3139()) { // L: 17
			this.field1541 = new short[var2.retextureTo.length]; // L: 18
			System.arraycopy(var2.retextureTo, 0, this.field1541, 0, this.field1541.length); // L: 19
		}

	} // L: 21

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1546323198"
	)
	public static boolean method2696(int var0, int var1) {
		return (var0 >> var1 + 1 & 1) != 0; // L: 9
	}
}
