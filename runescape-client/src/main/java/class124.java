import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dg")
public class class124 implements class123 {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1093598325
	)
	@Export("idxCount")
	public static int idxCount;
	@ObfuscatedName("az")
	@Export("hasFocus")
	protected static boolean hasFocus;

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)[Lhh;",
		garbageValue = "-98"
	)
	public static class225[] method2501() {
		return new class225[]{class225.field2679, class225.field2674, class225.field2673, class225.field2678, class225.field2675, class225.field2687, class225.field2677, class225.field2680, class225.field2681, class225.field2682}; // L: 17
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[IIIB)V",
		garbageValue = "64"
	)
	public static void method2500(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) { // L: 39
			int var4 = (var3 + var2) / 2; // L: 40
			int var5 = var2; // L: 41
			String var6 = var0[var4]; // L: 42
			var0[var4] = var0[var3]; // L: 43
			var0[var3] = var6; // L: 44
			int var7 = var1[var4]; // L: 45
			var1[var4] = var1[var3]; // L: 46
			var1[var3] = var7; // L: 47

			for (int var8 = var2; var8 < var3; ++var8) { // L: 48
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) { // L: 49
					String var9 = var0[var8]; // L: 50
					var0[var8] = var0[var5]; // L: 51
					var0[var5] = var9; // L: 52
					int var10 = var1[var8]; // L: 53
					var1[var8] = var1[var5]; // L: 54
					var1[var5++] = var10; // L: 55
				}
			}

			var0[var3] = var0[var5]; // L: 59
			var0[var5] = var6; // L: 60
			var1[var3] = var1[var5]; // L: 61
			var1[var5] = var7; // L: 62
			method2500(var0, var1, var2, var5 - 1); // L: 63
			method2500(var0, var1, var5 + 1, var3); // L: 64
		}

	} // L: 66

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lbv;",
		garbageValue = "111"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 35
		return var2.getMessage(var1); // L: 36
	}
}
