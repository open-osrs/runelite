import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kg")
public class class301 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	static final class301 field3575;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	static final class301 field3576;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1219700947
	)
	final int field3580;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1464012369
	)
	final int field3578;

	static {
		field3575 = new class301(51, 27, 800, 0, 16, 16); // L: 33
		field3576 = new class301(25, 28, 800, 656, 40, 40); // L: 34
	}

	class301(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field3580 = var5; // L: 39
		this.field3578 = var6; // L: 40
	} // L: 41

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;",
		garbageValue = "2142234614"
	)
	static String method5755(Throwable var0) throws IOException {
		String var1;
		if (var0 instanceof RunException) { // L: 68
			RunException var2 = (RunException)var0; // L: 69
			var1 = var2.message + " | "; // L: 70
			var0 = var2.throwable; // L: 71
		} else {
			var1 = ""; // L: 73
		}

		StringWriter var12 = new StringWriter(); // L: 74
		PrintWriter var3 = new PrintWriter(var12); // L: 75
		var0.printStackTrace(var3); // L: 76
		var3.close(); // L: 77
		String var4 = var12.toString(); // L: 78
		BufferedReader var5 = new BufferedReader(new StringReader(var4)); // L: 79
		String var6 = var5.readLine(); // L: 80

		while (true) {
			while (true) {
				String var7 = var5.readLine(); // L: 82
				if (var7 == null) { // L: 83
					var1 = var1 + "| " + var6; // L: 101
					return var1; // L: 102
				}

				int var8 = var7.indexOf(40); // L: 84
				int var9 = var7.indexOf(41, var8 + 1); // L: 85
				if (var8 >= 0 && var9 >= 0) { // L: 86
					String var10 = var7.substring(var8 + 1, var9); // L: 87
					int var11 = var10.indexOf(".java:"); // L: 88
					if (var11 >= 0) { // L: 89
						var10 = var10.substring(0, var11) + var10.substring(var11 + 5); // L: 90
						var1 = var1 + var10 + ' '; // L: 91
						continue; // L: 92
					}

					var7 = var7.substring(0, var8); // L: 94
				}

				var7 = var7.trim(); // L: 96
				var7 = var7.substring(var7.lastIndexOf(32) + 1); // L: 97
				var7 = var7.substring(var7.lastIndexOf(9) + 1); // L: 98
				var1 = var1 + var7 + ' '; // L: 99
			}
		}
	}
}
