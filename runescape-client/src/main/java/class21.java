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
	@ObfuscatedName("rp")
	@ObfuscatedSignature(
		descriptor = "Lea;"
	)
	@Export("guestClanChannel")
	static ClanChannel guestClanChannel;
	@ObfuscatedName("ta")
	@ObfuscatedGetter(
		intValue = 1164104803
	)
	static int field116;
	@ObfuscatedName("hi")
	@Export("regions")
	static int[] regions;
	@ObfuscatedName("jc")
	@ObfuscatedGetter(
		intValue = 98002171
	)
	@Export("cameraYaw")
	static int cameraYaw;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -824857787
	)
	final int field111;
	@ObfuscatedName("c")
	final String field109;

	class21(String var1) {
		this.field111 = 400; // L: 32
		this.field109 = ""; // L: 33
	} // L: 34

	class21(HttpURLConnection var1) throws IOException {
		this.field111 = var1.getResponseCode(); // L: 14
		var1.getResponseMessage(); // L: 15
		var1.getHeaderFields(); // L: 16
		StringBuilder var2 = new StringBuilder(); // L: 17
		InputStream var3 = this.field111 >= 300 ? var1.getErrorStream() : var1.getInputStream(); // L: 18
		if (var3 != null) { // L: 19
			InputStreamReader var4 = new InputStreamReader(var3); // L: 20
			BufferedReader var5 = new BufferedReader(var4); // L: 21

			String var6;
			while ((var6 = var5.readLine()) != null) { // L: 23
				var2.append(var6); // L: 24
			}

			var3.close(); // L: 26
		}

		this.field109 = var2.toString(); // L: 28
	} // L: 29

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "716414120"
	)
	public int method299() {
		return this.field111; // L: 37
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "11"
	)
	public String method297() {
		return this.field109; // L: 41
	}

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "(I)Lov;",
		garbageValue = "2110304027"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return ScriptFrame.worldMap; // L: 664
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1923971854"
	)
	static final boolean method303() {
		return Client.isMenuOpen; // L: 8651
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIII)V",
		garbageValue = "1636192715"
	)
	@Export("insertMenuItemNoShift")
	public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		class28.insertMenuItem(var0, var1, var2, var3, var4, var5, false); // L: 9826
	} // L: 9827
}
