import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
public class class297 {
	@ObfuscatedName("z")
	public static final char[] cp1252AsciiExtension;
	@ObfuscatedName("o")
	static byte[][][] field3668;

	static {
		cp1252AsciiExtension = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'}; // L: 4
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-486597081"
	)
	public static int method5378(int var0) {
		--var0; // L: 44
		var0 |= var0 >>> 1; // L: 45
		var0 |= var0 >>> 2; // L: 46
		var0 |= var0 >>> 4; // L: 47
		var0 |= var0 >>> 8; // L: 48
		var0 |= var0 >>> 16; // L: 49
		return var0 + 1; // L: 50
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "115"
	)
	static final String formatItemStacks(int var0) {
		String var1 = Integer.toString(var0); // L: 9175

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) { // L: 9176
			var1 = var1.substring(0, var2) + "," + var1.substring(var2); // L: 9177
		}

		if (var1.length() > 9) { // L: 9179
			return " " + WorldMapAreaData.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
		} else {
			return var1.length() > 6 ? " " + WorldMapAreaData.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + WorldMapAreaData.colorStartTag(16776960) + var1 + "</col>"; // L: 9180 9181
		}
	}
}
