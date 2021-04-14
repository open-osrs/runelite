import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ab")
public class class44 {
	@ObfuscatedName("f")
	@Export("applet")
	public static Applet applet;
	@ObfuscatedName("o")
	public static String field294;

	static {
		applet = null; // L: 10
		field294 = ""; // L: 11
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1811738574"
	)
	public static int method519(int var0) {
		long var2 = ViewportMouse.ViewportMouse_entityTags[var0]; // L: 61
		int var1 = (int)(var2 >>> 14 & 3L); // L: 63
		return var1; // L: 65
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIZI)Ljava/lang/String;",
		garbageValue = "-1536836078"
	)
	static String method521(int var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 140
			if (var2 && var0 >= 0) { // L: 141
				int var3 = 2; // L: 142

				for (int var4 = var0 / var1; var4 != 0; ++var3) { // L: 143 144 146
					var4 /= var1; // L: 145
				}

				char[] var5 = new char[var3]; // L: 148
				var5[0] = '+'; // L: 149

				for (int var6 = var3 - 1; var6 > 0; --var6) { // L: 150
					int var7 = var0; // L: 151
					var0 /= var1; // L: 152
					int var8 = var7 - var0 * var1; // L: 153
					if (var8 >= 10) { // L: 154
						var5[var6] = (char)(var8 + 87);
					} else {
						var5[var6] = (char)(var8 + 48); // L: 155
					}
				}

				return new String(var5); // L: 157
			} else {
				return Integer.toString(var0, var1);
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1967957574"
	)
	static int method520(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 66
		if (var1 == null) { // L: 67
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count; // L: 68 69
		}
	}
}
