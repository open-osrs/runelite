import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("archive11")
	static Archive archive11;
	@ObfuscatedName("o")
	@Export("url")
	final URL url;
	@ObfuscatedName("q")
	@Export("isDone0")
	volatile boolean isDone0;
	@ObfuscatedName("l")
	@Export("response0")
	volatile byte[] response0;

	UrlRequest(URL var1) {
		this.url = var1; // L: 115
	} // L: 116

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1235200526"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.isDone0; // L: 119
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-1622605923"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0; // L: 123
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "28"
	)
	public String method2556() {
		return this.url.toString(); // L: 127
	}
}
