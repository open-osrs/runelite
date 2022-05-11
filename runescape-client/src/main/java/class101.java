import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
public class class101 extends UrlRequester {
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lqd;"
	)
	@Export("options_buttons_2Sprite")
	static IndexedSprite options_buttons_2Sprite;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("archive14")
	static Archive archive14;

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lcb;I)V",
		garbageValue = "717056983"
	)
	void vmethod2544(UrlRequest var1) throws IOException {
		URLConnection var2 = null; // L: 12

		try {
			try {
				String var3 = var1.url.getProtocol(); // L: 14
				if (var3.equals("http")) { // L: 15
					var2 = this.method2542(var1); // L: 16
				} else {
					if (!var3.equals("https")) { // L: 18
						var1.isDone0 = true; // L: 22
						return; // L: 23
					}

					var2 = this.method2545(var1); // L: 19
				}

				this.method2518(var2, var1); // L: 25
			} catch (IOException var7) {
			}

		} finally {
			var1.isDone0 = true; // L: 29
			if (var2 != null) { // L: 30
				if (var2 instanceof HttpURLConnection) { // L: 31
					((HttpURLConnection)var2).disconnect(); // L: 32
				} else if (var2 instanceof HttpsURLConnection) { // L: 34
					((HttpsURLConnection)var2).disconnect(); // L: 35
				}
			}

		}
	} // L: 39

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lcb;B)Ljava/net/URLConnection;",
		garbageValue = "18"
	)
	URLConnection method2542(UrlRequest var1) throws IOException {
		URLConnection var2 = var1.url.openConnection(); // L: 42
		this.method2517(var2); // L: 43
		return var2; // L: 44
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lcb;I)Ljava/net/URLConnection;",
		garbageValue = "2078171719"
	)
	URLConnection method2545(UrlRequest var1) throws IOException {
		HttpsURLConnection var2 = (HttpsURLConnection)var1.url.openConnection(); // L: 48
		var2.setSSLSocketFactory(new class15()); // L: 49
		this.method2517(var2); // L: 50
		return var2; // L: 51
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "64"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length(); // L: 132
		int var2 = 0; // L: 133

		for (int var3 = 0; var3 < var1; ++var3) { // L: 134
			var2 = (var2 << 5) - var2 + UserComparator5.charToByteCp1252(var0.charAt(var3));
		}

		return var2; // L: 135
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "13"
	)
	static final int method2551() {
		if (class12.clientPreferences.method2222()) { // L: 5001
			return class128.Client_plane;
		} else {
			int var0 = class202.getTileHeight(class343.cameraX, FaceNormal.cameraZ, class128.Client_plane); // L: 5002
			return var0 - class295.cameraY < 800 && (Tiles.Tiles_renderFlags[class128.Client_plane][class343.cameraX >> 7][FaceNormal.cameraZ >> 7] & 4) != 0 ? class128.Client_plane : 3; // L: 5003 5004
		}
	}

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "85689367"
	)
	static void method2552() {
		if (class127.field1570 != null) { // L: 12698
			Client.field767 = Client.cycle; // L: 12699
			class127.field1570.method5851(); // L: 12700

			for (int var0 = 0; var0 < Client.players.length; ++var0) { // L: 12701
				if (Client.players[var0] != null) { // L: 12702
					class127.field1570.method5848((Client.players[var0].x >> 7) + SecureRandomCallable.baseX, (Client.players[var0].y >> 7) + GrandExchangeOfferOwnWorldComparator.baseY); // L: 12703
				}
			}
		}

	} // L: 12707
}
