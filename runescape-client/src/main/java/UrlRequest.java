import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("df")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("archive6")
	static Archive archive6;
	@ObfuscatedName("v")
	@Export("url")
	final URL url;
	@ObfuscatedName("n")
	@Export("isDone0")
	volatile boolean isDone0;
	@ObfuscatedName("f")
	@Export("response0")
	volatile byte[] response0;

	UrlRequest(URL var1) {
		this.url = var1; // L: 96
	} // L: 97

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-754673345"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.isDone0; // L: 100
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "83"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0; // L: 104
	}
}
