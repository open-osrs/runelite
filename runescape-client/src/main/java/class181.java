import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fd")
public class class181 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	static final class181 field2090;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	static final class181 field2089;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lab;"
	)
	@Export("pcmPlayerProvider")
	static PlayerProvider pcmPlayerProvider;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1062557713
	)
	@Export("value")
	final int value;

	static {
		field2090 = new class181(0);
		field2089 = new class181(1);
	}

	class181(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/CharSequence;III)Ljava/lang/String;",
		garbageValue = "-1548438368"
	)
	public static String method3651(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) {
			return "";
		} else if (var2 == 1) {
			CharSequence var10 = var0[var1];
			return var10 == null ? "null" : var10.toString();
		} else {
			int var3 = var2 + var1;
			int var4 = 0;

			for (int var5 = var1; var5 < var3; ++var5) {
				CharSequence var9 = var0[var5];
				if (var9 == null) {
					var4 += 4;
				} else {
					var4 += var9.length();
				}
			}

			StringBuilder var8 = new StringBuilder(var4);

			for (int var6 = var1; var6 < var3; ++var6) {
				CharSequence var7 = var0[var6];
				if (var7 == null) {
					var8.append("null");
				} else {
					var8.append(var7);
				}
			}

			return var8.toString();
		}
	}
}
