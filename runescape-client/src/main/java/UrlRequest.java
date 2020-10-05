import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
public class UrlRequest {
	@ObfuscatedName("h")
	static boolean field1986;
	@ObfuscatedName("z")
	final URL url;
	@ObfuscatedName("k")
	volatile boolean isDone0;
	@ObfuscatedName("s")
	volatile byte[] response0;

	UrlRequest(URL var1) {
		this.url = var1; // L: 96
	} // L: 97

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1064227353"
	)
	public boolean isDone() {
		return this.isDone0; // L: 100
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "524450632"
	)
	public byte[] getResponse() {
		return this.response0; // L: 104
	}
}
