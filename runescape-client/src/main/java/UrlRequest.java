import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("m")
	@Export("url")
	final URL url;
	@ObfuscatedName("o")
	@Export("isDone0")
	volatile boolean isDone0;
	@ObfuscatedName("q")
	@Export("response0")
	volatile byte[] response0;

	UrlRequest(URL var1) {
		this.url = var1;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1247069155"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.isDone0;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "1076365281"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZLjava/lang/String;ZI)V",
		garbageValue = "-2122321724"
	)
	static void method3426(String var0, boolean var1, String var2, boolean var3) {
		if (var1) {
			if (!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI(var0));
					return;
				} catch (Exception var5) {
				}
			}

			if (class60.field450.startsWith("win") && !var3) {
				FloorUnderlayDefinition.method4608(var0, 0);
				return;
			}

			if (class60.field450.startsWith("mac")) {
				GrandExchangeOfferTotalQuantityComparator.method165(var0, 1, var2);
				return;
			}

			FloorUnderlayDefinition.method4608(var0, 2);
		} else {
			FloorUnderlayDefinition.method4608(var0, 3);
		}

	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "60"
	)
	static final void method3432(int var0, int var1, int var2, int var3) {
		TileItemPile.method2901();
	}
}
