import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("t")
public class class14 {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 93944069
	)
	final int field76;
	@ObfuscatedName("q")
	final String field74;
	@ObfuscatedName("l")
	final ThreadFactory field73;
	@ObfuscatedName("k")
	final ThreadPoolExecutor field77;

	public class14(String var1, int var2, int var3) {
		this.field74 = var1; // L: 15
		this.field76 = var2; // L: 16
		this.field73 = new class16(this); // L: 17
		this.field77 = this.method164(var3); // L: 18
	} // L: 19

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/util/concurrent/ThreadPoolExecutor;",
		garbageValue = "-398664409"
	)
	final ThreadPoolExecutor method164(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field76), this.field73); // L: 22
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ly;I)Lh;",
		garbageValue = "-344605411"
	)
	public class19 method160(class10 var1) {
		if (this.field77.getQueue().remainingCapacity() <= 0) { // L: 26
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field77.getCorePoolSize() + " Queue capacity " + this.field76); // L: 27
			return new class19("Queue full"); // L: 28
		} else {
			class19 var2 = new class19(this.field77.submit(new class20(this, var1))); // L: 30
			return var2; // L: 31
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1785406977"
	)
	public final void method161() {
		try {
			this.field77.shutdown(); // L: 36
		} catch (Exception var2) { // L: 38
			System.err.println("Error shutting down RestRequestService\r\n" + var2); // L: 39
		}

	} // L: 41

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1828837420"
	)
	static final String method165(int var0) {
		return var0 < 999999999 ? Integer.toString(var0) : "*"; // L: 10881 10882
	}
}
