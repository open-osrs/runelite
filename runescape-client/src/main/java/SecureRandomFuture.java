import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("f")
	@Export("executor")
	ExecutorService executor;
	@ObfuscatedName("b")
	@Export("future")
	Future future;

	SecureRandomFuture() {
		this.executor = Executors.newSingleThreadExecutor(); // L: 10
		this.future = this.executor.submit(new SecureRandomCallable()); // L: 14
	} // L: 15

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "22"
	)
	@Export("shutdown")
	void shutdown() {
		this.executor.shutdown(); // L: 18
		this.executor = null; // L: 19
	} // L: 20

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "19"
	)
	@Export("isDone")
	boolean isDone() {
		return this.future.isDone(); // L: 23
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/security/SecureRandom;",
		garbageValue = "-2492664"
	)
	@Export("get")
	SecureRandom get() {
		try {
			return (SecureRandom)this.future.get(); // L: 28
		} catch (Exception var2) { // L: 30
			return ServerPacket.method3740(); // L: 31
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-623024875"
	)
	static final int method2252(int var0, int var1) {
		int var2 = var1 * 57 + var0; // L: 462
		var2 ^= var2 << 13; // L: 463
		int var3 = var2 * (var2 * var2 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE; // L: 464
		return var3 >> 19 & 255; // L: 465
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "([Lht;IIIZI)V",
		garbageValue = "1783989616"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) { // L: 9890
			Widget var6 = var0[var5]; // L: 9891
			if (var6 != null && var6.parentId == var1) { // L: 9892 9893
				WorldMapIcon_0.alignWidgetSize(var6, var2, var3, var4); // L: 9894
				FileSystem.alignWidgetPosition(var6, var2, var3); // L: 9895
				if (var6.scrollX > var6.scrollWidth - var6.width) { // L: 9896
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) { // L: 9897
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height) {
					var6.scrollY = var6.scrollHeight - var6.height; // L: 9898
				}

				if (var6.scrollY < 0) { // L: 9899
					var6.scrollY = 0;
				}

				if (var6.type == 0) { // L: 9900
					UserComparator9.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	} // L: 9902
}
