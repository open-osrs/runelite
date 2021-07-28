import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bc")
public class class74 {
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("archive7")
	static Archive archive7;

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1839707812"
	)
	static final boolean method1931(int var0) {
		if (var0 < 0) {
			return false;
		} else {
			int var1 = Client.menuOpcodes[var0];
			if (var1 >= 2000) {
				var1 -= 2000;
			}

			return var1 == 1007;
		}
	}
}
