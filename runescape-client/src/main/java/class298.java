import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kq")
public class class298 {
	@ObfuscatedName("h")
	@Export("cp1252AsciiExtension")
	public static final char[] cp1252AsciiExtension;

	static {
		cp1252AsciiExtension = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'}; // L: 4
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "255749540"
	)
	@Export("currentTimeMillis")
	public static final synchronized long currentTimeMillis() {
		long var0 = System.currentTimeMillis(); // L: 14
		if (var0 < class307.field3744) { // L: 15
			class307.field3743 += class307.field3744 - var0; // L: 16
		}

		class307.field3744 = var0; // L: 18
		return var0 + class307.field3743; // L: 19
	}
}
