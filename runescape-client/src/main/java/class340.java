import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mb")
public class class340 {
	@ObfuscatedName("c")
	@Export("cp1252AsciiExtension")
	public static final char[] cp1252AsciiExtension;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1921739385
	)
	static int field4138;

	static {
		cp1252AsciiExtension = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'}; // L: 4
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lkb;I[B[BB)V",
		garbageValue = "13"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3448 == null) { // L: 998
			if (var2 == null) { // L: 999
				return; // L: 1005
			}

			var0.field3448 = new byte[11][]; // L: 1000
			var0.field3406 = new byte[11][]; // L: 1001
			var0.field3450 = new int[11]; // L: 1002
			var0.field3451 = new int[11]; // L: 1003
		}

		var0.field3448[var1] = var2; // L: 1007
		if (var2 != null) {
			var0.field3498 = true; // L: 1008
		} else {
			var0.field3498 = false; // L: 1010

			for (int var4 = 0; var4 < var0.field3448.length; ++var4) { // L: 1011
				if (var0.field3448[var4] != null) { // L: 1012
					var0.field3498 = true; // L: 1013
					break;
				}
			}
		}

		var0.field3406[var1] = var3; // L: 1018
	} // L: 1019
}
