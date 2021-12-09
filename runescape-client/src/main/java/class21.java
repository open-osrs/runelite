import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("q")
public class class21 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	@Export("musicTrack")
	public static MusicTrack musicTrack;
	@ObfuscatedName("d")
	static boolean field116;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	static IndexedSprite field118;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1676321481
	)
	final int field115;
	@ObfuscatedName("b")
	final String field114;

	class21(String var1) {
		this.field115 = 400; // L: 32
		this.field114 = ""; // L: 33
	} // L: 34

	class21(HttpURLConnection var1) throws IOException {
		this.field115 = var1.getResponseCode(); // L: 14
		var1.getResponseMessage(); // L: 15
		var1.getHeaderFields(); // L: 16
		StringBuilder var2 = new StringBuilder(); // L: 17
		InputStream var3 = this.field115 >= 300 ? var1.getErrorStream() : var1.getInputStream(); // L: 18
		if (var3 != null) { // L: 19
			InputStreamReader var4 = new InputStreamReader(var3); // L: 20
			BufferedReader var5 = new BufferedReader(var4); // L: 21

			String var6;
			while ((var6 = var5.readLine()) != null) { // L: 23
				var2.append(var6); // L: 24
			}

			var3.close(); // L: 26
		}

		this.field114 = var2.toString(); // L: 28
	} // L: 29

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1543760704"
	)
	public int method338() {
		return this.field115; // L: 37
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "128"
	)
	public String method339() {
		return this.field114; // L: 41
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIZI)V",
		garbageValue = "1482446677"
	)
	@Export("insertMenuItem")
	static final void insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, boolean var6) {
		if (!Client.isMenuOpen) { // L: 10045
			if (Client.menuOptionsCount < 500) { // L: 10046
				Client.menuActions[Client.menuOptionsCount] = var0; // L: 10047
				Client.menuTargets[Client.menuOptionsCount] = var1; // L: 10048
				Client.menuOpcodes[Client.menuOptionsCount] = var2; // L: 10049
				Client.menuIdentifiers[Client.menuOptionsCount] = var3; // L: 10050
				Client.menuArguments1[Client.menuOptionsCount] = var4; // L: 10051
				Client.menuArguments2[Client.menuOptionsCount] = var5; // L: 10052
				Client.menuShiftClick[Client.menuOptionsCount] = var6; // L: 10053
				++Client.menuOptionsCount; // L: 10054
			}

		}
	} // L: 10056
}
