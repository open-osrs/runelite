import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
public class class214 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lir;"
	)
	@Export("musicSamplesArchive")
	public static AbstractArchive musicSamplesArchive;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lir;"
	)
	@Export("soundEffectsArchive")
	public static AbstractArchive soundEffectsArchive;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "Lhm;"
	)
	@Export("midiPcmStream")
	public static MidiPcmStream midiPcmStream;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -848833001
	)
	public static int field1129;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lir;"
	)
	@Export("musicTrackArchive")
	public static AbstractArchive musicTrackArchive;
	@ObfuscatedName("k")
	static int[] field1131;
	@ObfuscatedName("ko")
	@ObfuscatedGetter(
		intValue = 2079315667
	)
	@Export("menuWidth")
	static int menuWidth;

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/CharSequence;IZI)Z",
		garbageValue = "-125135280"
	)
	static boolean method4144(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			boolean var3 = false;
			boolean var4 = false;
			int var5 = 0;
			int var6 = var0.length();

			for (int var7 = 0; var7 < var6; ++var7) {
				char var8 = var0.charAt(var7);
				if (var7 == 0) {
					if (var8 == '-') {
						var3 = true;
						continue;
					}

					if (var8 == '+') {
						continue;
					}
				}

				int var9;
				if (var8 >= '0' && var8 <= '9') {
					var9 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') {
					var9 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') {
						return false;
					}

					var9 = var8 - 'W';
				}

				if (var9 >= var1) {
					return false;
				}

				if (var3) {
					var9 = -var9;
				}

				int var10 = var5 * var1 + var9;
				if (var10 / var1 != var5) {
					return false;
				}

				var5 = var10;
				var4 = true;
			}

			return var4;
		}
		throw new IllegalArgumentException("");
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/CharSequence;II)I",
		garbageValue = "2125526115"
	)
	@Export("parseIntCustomRadix")
	public static int parseIntCustomRadix(CharSequence var0, int radix) {
		return IgnoreList.parseIntCustomRadix(var0, radix, true);
	}

	static {
		field1129 = 0;
	}
}
