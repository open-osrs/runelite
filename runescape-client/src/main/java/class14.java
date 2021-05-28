import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("e")
public abstract class class14 extends Node {
	@ObfuscatedName("lc")
	@ObfuscatedGetter(
		intValue = 1812999285
	)
	@Export("menuX")
	static int menuX;

	class14() {
	} // L: 68

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-1281352827"
	)
	abstract void vmethod276(Buffer var1);

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ll;B)V",
		garbageValue = "29"
	)
	abstract void vmethod281(ClanSettings var1);

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-24"
	)
	public static final boolean method188(char var0) {
		if (Character.isISOControl(var0)) { // L: 16
			return false;
		} else if (Login.isAlphaNumeric(var0)) { // L: 17
			return true;
		} else {
			char[] var1 = class365.field4096; // L: 19

			int var2;
			char var3;
			for (var2 = 0; var2 < var1.length; ++var2) { // L: 20
				var3 = var1[var2]; // L: 21
				if (var0 == var3) { // L: 22
					return true;
				}
			}

			var1 = class365.field4097; // L: 26

			for (var2 = 0; var2 < var1.length; ++var2) { // L: 27
				var3 = var1[var2]; // L: 28
				if (var0 == var3) {
					return true; // L: 29
				}
			}

			return false; // L: 32
		}
	}
}
