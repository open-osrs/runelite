import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mz")
class class360 implements Comparator {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	final class361 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lms;)V"
	)
	class360(class361 var1) {
		this.this$0 = var1; // L: 7
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lmv;Lmv;S)I",
		garbageValue = "-9501"
	)
	int method6627(class362 var1, class362 var2) {
		if (var1.field4236 > var2.field4236) {
			return 1; // L: 9
		} else {
			return var1.field4236 < var2.field4236 ? -1 : 0; // L: 10 11
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method6627((class362)var1, (class362)var2); // L: 15
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 19
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2758570"
	)
	static String method6636() {
		String var0;
		if (Interpreter.clientPreferences.method2257()) { // L: 279
			String var2 = Login.Login_username; // L: 281
			int var4 = var2.length(); // L: 284
			char[] var5 = new char[var4]; // L: 286

			for (int var6 = 0; var6 < var4; ++var6) { // L: 287
				var5[var6] = '*';
			}

			String var3 = new String(var5); // L: 288
			var0 = var3; // L: 292
		} else {
			var0 = Login.Login_username; // L: 294
		}

		return var0; // L: 295
	}
}
