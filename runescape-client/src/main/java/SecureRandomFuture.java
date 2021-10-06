import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	@Export("Widget_fontsArchive")
	public static AbstractArchive Widget_fontsArchive;
	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "[Lon;"
	)
	@Export("crossSprites")
	static SpritePixels[] crossSprites;
	@ObfuscatedName("l")
	@Export("executor")
	ExecutorService executor;
	@ObfuscatedName("q")
	@Export("future")
	Future future;

	SecureRandomFuture() {
		this.executor = Executors.newSingleThreadExecutor();
		this.future = this.executor.submit(new SecureRandomCallable());
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "104"
	)
	@Export("shutdown")
	void shutdown() {
		this.executor.shutdown();
		this.executor = null;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "73"
	)
	@Export("isDone")
	boolean isDone() {
		return this.future.isDone();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/security/SecureRandom;",
		garbageValue = "-1230835583"
	)
	@Export("get")
	SecureRandom get() {
		try {
			return (SecureRandom)this.future.get();
		} catch (Exception var2) {
			return Buddy.method6152();
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)Ljava/lang/String;",
		garbageValue = "707406336"
	)
	public static String method1951(Buffer var0) {
		String var1;
		try {
			int var2 = var0.readUShortSmart();
			if (var2 > 32767) {
				var2 = 32767;
			}

			byte[] var3 = new byte[var2];
			var0.offset += class264.huffman.decompress(var0.array, var0.offset, var3, 0, var2);
			String var4 = Fonts.decodeStringCp1252(var3, 0, var2);
			var1 = var4;
		} catch (Exception var6) {
			var1 = "Cabbage";
		}

		return var1;
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljt;I)Ljava/lang/String;",
		garbageValue = "-1891184957"
	)
	static String method1952(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) {
			for (int var2 = 1; var2 <= 5; ++var2) {
				while (true) {
					int var3 = var0.indexOf("%" + var2);
					if (var3 == -1) {
						break;
					}

					var0 = var0.substring(0, var3) + class54.method1057(FriendsChat.method5992(var1, var2 - 1)) + var0.substring(var3 + 2);
				}
			}
		}

		return var0;
	}
}
