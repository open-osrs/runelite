import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "[Lio;"
	)
	static Widget[] field1224;
	@ObfuscatedName("s")
	@Export("url")
	final URL url;
	@ObfuscatedName("t")
	@Export("isDone0")
	volatile boolean isDone0;
	@ObfuscatedName("v")
	@Export("response0")
	volatile byte[] response0;

	UrlRequest(URL var1) {
		this.url = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1069253032"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.isDone0;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "1904791034"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljy;Ljy;I)V",
		garbageValue = "-909646221"
	)
	public static void method2141(AbstractArchive var0, AbstractArchive var1) {
		SpotAnimationDefinition.SpotAnimationDefinition_archive = var0;
		class406.SpotAnimationDefinition_modelArchive = var1;
	}

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "0"
	)
	static void method2136(int var0, int var1) {
		if (Decimator.clientPreferences.musicVolume != 0 && var0 != -1) {
			Players.method2022(class339.archive11, var0, 0, Decimator.clientPreferences.musicVolume, false);
			Client.field647 = true;
		}

	}
}
