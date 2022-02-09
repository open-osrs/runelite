import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jc")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	@ObfuscatedName("u")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;

	AbstractByteArrayCopier() {
	} // L: 4

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "1552068154"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "46"
	)
	@Export("set")
	public abstract void set(byte[] var1);

	@ObfuscatedName("l")
	public static String method5309(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) { // L: 31
			if (var0 % 37L == 0L) { // L: 32
				return null;
			} else {
				int var2 = 0; // L: 33

				for (long var3 = var0; var3 != 0L; var3 /= 37L) { // L: 34 35 37
					++var2; // L: 36
				}

				StringBuilder var5 = new StringBuilder(var2); // L: 39

				while (var0 != 0L) { // L: 40
					long var6 = var0; // L: 41
					var0 /= 37L; // L: 42
					var5.append(class337.base37Table[(int)(var6 - 37L * var0)]); // L: 43
				}

				return var5.reverse().toString(); // L: 45
			}
		} else {
			return null;
		}
	}
}
