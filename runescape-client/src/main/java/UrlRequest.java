import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("st")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("h")
	@Export("url")
	final URL url;
	@ObfuscatedName("v")
	@Export("isDone0")
	volatile boolean isDone0;
	@ObfuscatedName("x")
	@Export("response0")
	volatile byte[] response0;

	UrlRequest(URL var1) {
		this.url = var1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "109"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.isDone0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-884175242"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0;
	}
}
