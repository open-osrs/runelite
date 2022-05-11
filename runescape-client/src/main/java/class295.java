import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kv")
public class class295 {
	@ObfuscatedName("jm")
	@ObfuscatedGetter(
		intValue = 595148927
	)
	@Export("cameraY")
	static int cameraY;

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Ldt;",
		garbageValue = "1680740460"
	)
	static class123 method5560(int var0) {
		class123[] var1 = new class123[]{class123.field1550, class123.field1545, class123.field1540, class123.field1542, class123.field1543, class123.field1539, class123.field1541, class123.field1546, class123.field1547}; // L: 118
		class123 var2 = (class123)class291.findEnumerated(var1, var0); // L: 120
		if (var2 == null) { // L: 121
			var2 = class123.field1547;
		}

		return var2; // L: 122
	}
}
