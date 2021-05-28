import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
	@ObfuscatedName("v")
	@Export("executor")
	ExecutorService executor;
	@ObfuscatedName("n")
	@Export("future")
	Future future;

	SecureRandomFuture() {
		this.executor = Executors.newSingleThreadExecutor(); // L: 10
		this.future = this.executor.submit(new SecureRandomCallable()); // L: 14
	} // L: 15

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "32"
	)
	@Export("shutdown")
	void shutdown() {
		this.executor.shutdown();
		this.executor = null;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1067207786"
	)
	@Export("isDone")
	boolean isDone() {
		return this.future.isDone();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/security/SecureRandom;",
		garbageValue = "97"
	)
	@Export("get")
	SecureRandom get() {
		try {
			return (SecureRandom)this.future.get();
		} catch (Exception var2) { // L: 30
			return PlayerComposition.method4711();
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([I[II)V",
		garbageValue = "-2018126556"
	)
	public static void method1981(int[] var0, int[] var1) {
		if (var0 != null && var1 != null) { // L: 19
			ByteArrayPool.ByteArrayPool_alternativeSizes = var0; // L: 25
			ByteArrayPool.ByteArrayPool_altSizeArrayCounts = new int[var0.length]; // L: 26
			class20.ByteArrayPool_arrays = new byte[var0.length][][]; // L: 27

			for (int var2 = 0; var2 < ByteArrayPool.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 28
				class20.ByteArrayPool_arrays[var2] = new byte[var1[var2]][]; // L: 29
			}

		} else {
			ByteArrayPool.ByteArrayPool_alternativeSizes = null; // L: 20
			ByteArrayPool.ByteArrayPool_altSizeArrayCounts = null; // L: 21
			class20.ByteArrayPool_arrays = null; // L: 22
		}
	} // L: 23 31

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1561643653"
	)
	static String method1982(int var0) {
		return "<img=" + var0 + ">"; // L: 18
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lmr;III)I",
		garbageValue = "-1327945264"
	)
	static int method1977(IterableNodeHashTable var0, int var1, int var2) {
		if (var0 == null) { // L: 33
			return var2;
		} else {
			IntegerNode var3 = (IntegerNode)var0.get((long)var1); // L: 34
			return var3 == null ? var2 : var3.integer; // L: 35 36
		}
	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "353118952"
	)
	static int method1980(int var0) {
		return var0 * 3 + 600; // L: 1507
	}
}
