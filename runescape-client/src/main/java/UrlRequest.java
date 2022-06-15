import java.net.URL;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("us")
	static List field1373;
	@ObfuscatedName("c")
	@Export("url")
	final URL url;
	@ObfuscatedName("v")
	@Export("isDone0")
	volatile boolean isDone0;
	@ObfuscatedName("q")
	@Export("response0")
	volatile byte[] response0;

	UrlRequest(URL var1) {
		this.url = var1; // L: 118
	} // L: 119

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-60"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.isDone0; // L: 122
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-1112773966"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0; // L: 126
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2136536725"
	)
	public String method2553() {
		return this.url.toString(); // L: 130
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ZZI)I",
		garbageValue = "-1626715483"
	)
	public static int method2557(boolean var0, boolean var1) {
		byte var2 = 0; // L: 143
		int var3 = var2 + NetCache.NetCache_pendingPriorityWritesCount + NetCache.NetCache_pendingPriorityResponsesCount; // L: 144
		return var3; // L: 145
	}
}
