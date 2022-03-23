import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("y")
public class class21 {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1307123935
	)
	static int field108;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -300178005
	)
	final int field103;
	@ObfuscatedName("o")
	final String field104;

	class21(String var1) {
		this.field103 = 400; // L: 32
		this.field104 = ""; // L: 33
	} // L: 34

	class21(HttpURLConnection var1) throws IOException {
		this.field103 = var1.getResponseCode(); // L: 14
		var1.getResponseMessage(); // L: 15
		var1.getHeaderFields(); // L: 16
		StringBuilder var2 = new StringBuilder(); // L: 17
		InputStream var3 = this.field103 >= 300 ? var1.getErrorStream() : var1.getInputStream(); // L: 18
		if (var3 != null) { // L: 19
			InputStreamReader var4 = new InputStreamReader(var3); // L: 20
			BufferedReader var5 = new BufferedReader(var4); // L: 21

			String var6;
			while ((var6 = var5.readLine()) != null) { // L: 23
				var2.append(var6); // L: 24
			}

			var3.close(); // L: 26
		}

		this.field104 = var2.toString(); // L: 28
	} // L: 29

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "545491845"
	)
	public int method328() {
		return this.field103; // L: 37
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-31"
	)
	public String method330() {
		return this.field104; // L: 41
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1896526262"
	)
	@Export("incrementMenuEntries")
	static final void incrementMenuEntries() {
		boolean var0 = false; // L: 9181

		while (!var0) { // L: 9182
			var0 = true; // L: 9183

			for (int var1 = 0; var1 < Client.menuOptionsCount - 1; ++var1) { // L: 9184
				if (Client.menuOpcodes[var1] < 1000 && Client.menuOpcodes[var1 + 1] > 1000) { // L: 9185
					String var2 = Client.menuTargets[var1]; // L: 9186
					Client.menuTargets[var1] = Client.menuTargets[var1 + 1]; // L: 9187
					Client.menuTargets[var1 + 1] = var2; // L: 9188
					String var3 = Client.menuActions[var1]; // L: 9189
					Client.menuActions[var1] = Client.menuActions[var1 + 1]; // L: 9190
					Client.menuActions[var1 + 1] = var3; // L: 9191
					int var4 = Client.menuOpcodes[var1]; // L: 9192
					Client.menuOpcodes[var1] = Client.menuOpcodes[var1 + 1]; // L: 9193
					Client.menuOpcodes[var1 + 1] = var4; // L: 9194
					var4 = Client.menuArguments1[var1]; // L: 9195
					Client.menuArguments1[var1] = Client.menuArguments1[var1 + 1]; // L: 9196
					Client.menuArguments1[var1 + 1] = var4; // L: 9197
					var4 = Client.menuArguments2[var1]; // L: 9198
					Client.menuArguments2[var1] = Client.menuArguments2[var1 + 1]; // L: 9199
					Client.menuArguments2[var1 + 1] = var4; // L: 9200
					var4 = Client.menuIdentifiers[var1]; // L: 9201
					Client.menuIdentifiers[var1] = Client.menuIdentifiers[var1 + 1]; // L: 9202
					Client.menuIdentifiers[var1 + 1] = var4; // L: 9203
					boolean var5 = Client.menuShiftClick[var1]; // L: 9204
					Client.menuShiftClick[var1] = Client.menuShiftClick[var1 + 1]; // L: 9205
					Client.menuShiftClick[var1 + 1] = var5; // L: 9206
					var0 = false; // L: 9207
				}
			}
		}

	} // L: 9211

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	static final void method334(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 11387
		Interpreter.clientPreferences.method2270(var0); // L: 11388
	} // L: 11389
}
