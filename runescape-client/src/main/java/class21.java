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
		this.field115 = 400;
		this.field114 = "";
	}

	class21(HttpURLConnection var1) throws IOException {
		this.field115 = var1.getResponseCode();
		var1.getResponseMessage();
		var1.getHeaderFields();
		StringBuilder var2 = new StringBuilder();
		InputStream var3 = this.field115 >= 300 ? var1.getErrorStream() : var1.getInputStream();
		if (var3 != null) {
			InputStreamReader var4 = new InputStreamReader(var3);
			BufferedReader var5 = new BufferedReader(var4);

			String var6;
			while ((var6 = var5.readLine()) != null) {
				var2.append(var6);
			}

			var3.close();
		}

		this.field114 = var2.toString();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1543760704"
	)
	public int method338() {
		return this.field115;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "128"
	)
	public String method339() {
		return this.field114;
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIZI)V",
		garbageValue = "1482446677"
	)
	@Export("insertMenuItem")
	static final void insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, boolean var6) {
		if (!Client.isMenuOpen) {
			if (Client.menuOptionsCount < 500) {
				Client.menuActions[Client.menuOptionsCount] = var0;
				Client.menuTargets[Client.menuOptionsCount] = var1;
				Client.menuOpcodes[Client.menuOptionsCount] = var2;
				Client.menuIdentifiers[Client.menuOptionsCount] = var3;
				Client.menuArguments1[Client.menuOptionsCount] = var4;
				Client.menuArguments2[Client.menuOptionsCount] = var5;
				Client.menuShiftClick[Client.menuOptionsCount] = var6;
				++Client.menuOptionsCount;
			}

		}
	}
}
