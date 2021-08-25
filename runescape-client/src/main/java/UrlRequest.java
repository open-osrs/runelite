import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("WorldMapElement_fonts")
	static Fonts WorldMapElement_fonts;
	@ObfuscatedName("n")
	@Export("url")
	final URL url;
	@ObfuscatedName("c")
	@Export("isDone0")
	volatile boolean isDone0;
	@ObfuscatedName("m")
	@Export("response0")
	volatile byte[] response0;

	UrlRequest(URL var1) {
		this.url = var1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-359181104"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.isDone0;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-476051940"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0;
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(Ljd;IIZI)V",
		garbageValue = "-1338340677"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width;
		int var5 = var0.height;
		if (var0.widthAlignment == 0) {
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) {
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) {
			var0.width = var0.rawWidth * var1 >> 14;
		}

		if (var0.heightAlignment == 0) {
			var0.height = var0.rawHeight;
		} else if (var0.heightAlignment == 1) {
			var0.height = var2 - var0.rawHeight;
		} else if (var0.heightAlignment == 2) {
			var0.height = var2 * var0.rawHeight >> 14;
		}

		if (var0.widthAlignment == 4) {
			var0.width = var0.height * var0.field3062 / var0.field3116;
		}

		if (var0.heightAlignment == 4) {
			var0.height = var0.field3116 * var0.width / var0.field3062;
		}

		if (var0.contentType == 1337) {
			Client.viewportWidget = var0;
		}

		if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) {
			ScriptEvent var6 = new ScriptEvent();
			var6.widget = var0;
			var6.args = var0.onResize;
			Client.scriptEvents.addFirst(var6);
		}

	}
}
