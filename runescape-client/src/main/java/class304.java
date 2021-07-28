import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kx")
public class class304 {
	@ObfuscatedName("s")
	public static char[] field3755;
	@ObfuscatedName("t")
	static char[] field3756;
	@ObfuscatedName("v")
	static char[] field3757;
	@ObfuscatedName("j")
	static int[] field3760;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;

	static {
		field3755 = new char[64];

		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field3755[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field3755[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field3755[var0] = (char)(var0 + 48 - 52);
		}

		field3755[62] = '+';
		field3755[63] = '/';
		field3756 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field3756[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field3756[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field3756[var0] = (char)(var0 + 48 - 52);
		}

		field3756[62] = '*';
		field3756[63] = '-';
		field3757 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field3757[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field3757[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field3757[var0] = (char)(var0 + 48 - 52);
		}

		field3757[62] = '-';
		field3757[63] = '_';
		field3760 = new int[128];

		for (var0 = 0; var0 < field3760.length; ++var0) {
			field3760[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) {
			field3760[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) {
			field3760[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) {
			field3760[var0] = var0 - 48 + 52;
		}

		int[] var2 = field3760;
		field3760[43] = 62;
		var2[42] = 62;
		int[] var1 = field3760;
		field3760[47] = 63;
		var1[45] = 63;
	}
}
