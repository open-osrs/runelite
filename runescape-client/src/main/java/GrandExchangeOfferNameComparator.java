import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
@Implements("GrandExchangeOfferNameComparator")
final class GrandExchangeOfferNameComparator implements Comparator {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljt;Ljt;I)I",
		garbageValue = "1398133242"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.getOfferName().compareTo(var2.getOfferName()); // L: 56
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 60
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 64
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;",
		garbageValue = "-1807946914"
	)
	static String method5193(Throwable var0) throws IOException {
		String var1;
		if (var0 instanceof RunException) { // L: 67
			RunException var2 = (RunException)var0; // L: 68
			var1 = var2.message + " | "; // L: 69
			var0 = var2.throwable; // L: 70
		} else {
			var1 = ""; // L: 72
		}

		StringWriter var12 = new StringWriter(); // L: 73
		PrintWriter var3 = new PrintWriter(var12); // L: 74
		var0.printStackTrace(var3); // L: 75
		var3.close(); // L: 76
		String var4 = var12.toString(); // L: 77
		BufferedReader var5 = new BufferedReader(new StringReader(var4)); // L: 78
		String var6 = var5.readLine(); // L: 79

		while (true) {
			while (true) {
				String var7 = var5.readLine(); // L: 81
				if (var7 == null) { // L: 82
					var1 = var1 + "| " + var6; // L: 100
					return var1; // L: 101
				}

				int var8 = var7.indexOf(40); // L: 83
				int var9 = var7.indexOf(41, var8 + 1); // L: 84
				if (var8 >= 0 && var9 >= 0) { // L: 85
					String var10 = var7.substring(var8 + 1, var9); // L: 86
					int var11 = var10.indexOf(".java:"); // L: 87
					if (var11 >= 0) { // L: 88
						var10 = var10.substring(0, var11) + var10.substring(var11 + 5); // L: 89
						var1 = var1 + var10 + ' '; // L: 90
						continue; // L: 91
					}

					var7 = var7.substring(0, var8); // L: 93
				}

				var7 = var7.trim(); // L: 95
				var7 = var7.substring(var7.lastIndexOf(32) + 1); // L: 96
				var7 = var7.substring(var7.lastIndexOf(9) + 1); // L: 97
				var1 = var1 + var7 + ' '; // L: 98
			}
		}
	}
}
