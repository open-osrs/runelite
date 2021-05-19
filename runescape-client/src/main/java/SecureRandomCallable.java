import java.security.SecureRandom;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = -5954389703688375111L
	)
	static long field1108;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	@Export("NetCache_reference")
	static Buffer NetCache_reference;

	SecureRandomCallable() {
	} // L: 42

	public Object call() {
		SecureRandom var2 = new SecureRandom(); // L: 47
		var2.nextInt(); // L: 48
		return var2; // L: 51
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	static void method2080() {
		if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) { // L: 119
			KeyHandler.KeyHandler_keyCodes[186] = 57; // L: 120
			KeyHandler.KeyHandler_keyCodes[187] = 27; // L: 121
			KeyHandler.KeyHandler_keyCodes[188] = 71; // L: 122
			KeyHandler.KeyHandler_keyCodes[189] = 26; // L: 123
			KeyHandler.KeyHandler_keyCodes[190] = 72; // L: 124
			KeyHandler.KeyHandler_keyCodes[191] = 73; // L: 125
			KeyHandler.KeyHandler_keyCodes[192] = 58; // L: 126
			KeyHandler.KeyHandler_keyCodes[219] = 42; // L: 127
			KeyHandler.KeyHandler_keyCodes[220] = 74; // L: 128
			KeyHandler.KeyHandler_keyCodes[221] = 43; // L: 129
			KeyHandler.KeyHandler_keyCodes[222] = 59; // L: 130
			KeyHandler.KeyHandler_keyCodes[223] = 28; // L: 131
		} else {
			KeyHandler.KeyHandler_keyCodes[44] = 71; // L: 134
			KeyHandler.KeyHandler_keyCodes[45] = 26; // L: 135
			KeyHandler.KeyHandler_keyCodes[46] = 72; // L: 136
			KeyHandler.KeyHandler_keyCodes[47] = 73; // L: 137
			KeyHandler.KeyHandler_keyCodes[59] = 57; // L: 138
			KeyHandler.KeyHandler_keyCodes[61] = 27; // L: 139
			KeyHandler.KeyHandler_keyCodes[91] = 42; // L: 140
			KeyHandler.KeyHandler_keyCodes[92] = 74; // L: 141
			KeyHandler.KeyHandler_keyCodes[93] = 43; // L: 142
			KeyHandler.KeyHandler_keyCodes[192] = 28; // L: 143
			KeyHandler.KeyHandler_keyCodes[222] = 58; // L: 144
			KeyHandler.KeyHandler_keyCodes[520] = 59; // L: 145
		}

	} // L: 147

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/CharSequence;III)Ljava/lang/String;",
		garbageValue = "1114748874"
	)
	public static String method2076(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) { // L: 11
			return "";
		} else if (var2 == 1) { // L: 12
			CharSequence var10 = var0[var1]; // L: 13
			return var10 == null ? "null" : var10.toString(); // L: 14 15
		} else {
			int var3 = var2 + var1; // L: 17
			int var4 = 0; // L: 18

			for (int var5 = var1; var5 < var3; ++var5) { // L: 19
				CharSequence var9 = var0[var5]; // L: 20
				if (var9 == null) { // L: 21
					var4 += 4;
				} else {
					var4 += var9.length(); // L: 22
				}
			}

			StringBuilder var8 = new StringBuilder(var4); // L: 24

			for (int var6 = var1; var6 < var3; ++var6) { // L: 25
				CharSequence var7 = var0[var6]; // L: 26
				if (var7 == null) { // L: 27
					var8.append("null");
				} else {
					var8.append(var7); // L: 28
				}
			}

			return var8.toString(); // L: 30
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)Ljava/lang/String;",
		garbageValue = "12"
	)
	public static String method2081(CharSequence var0) {
		int var2 = var0.length(); // L: 193
		char[] var3 = new char[var2]; // L: 195

		for (int var4 = 0; var4 < var2; ++var4) { // L: 196
			var3[var4] = '*';
		}

		String var1 = new String(var3); // L: 197
		return var1; // L: 199
	}
}
