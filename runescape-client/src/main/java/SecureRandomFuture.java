import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
public class SecureRandomFuture {
	@ObfuscatedName("z")
	ExecutorService executor;
	@ObfuscatedName("k")
	Future future;

	SecureRandomFuture() {
		this.executor = Executors.newSingleThreadExecutor(); // L: 10
		this.future = this.executor.submit(new SecureRandomCallable()); // L: 14
	} // L: 15

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1936171902"
	)
	void shutdown() {
		this.executor.shutdown(); // L: 18
		this.executor = null; // L: 19
	} // L: 20

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "11"
	)
	boolean isDone() {
		return this.future.isDone(); // L: 23
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/security/SecureRandom;",
		garbageValue = "2000"
	)
	SecureRandom get() {
		try {
			return (SecureRandom)this.future.get(); // L: 28
		} catch (Exception var2) { // L: 30
			return BoundaryObject.method3387(); // L: 31
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-531384694"
	)
	public static void method2225(int var0) {
		if (var0 != -1) { // L: 227
			if (Bounds.Widget_loadedInterfaces[var0]) { // L: 228
				Widget.Widget_archive.clearFilesGroup(var0); // L: 229
				if (Widget.Widget_interfaceComponents[var0] != null) { // L: 230
					boolean var1 = true; // L: 231

					for (int var2 = 0; var2 < Widget.Widget_interfaceComponents[var0].length; ++var2) { // L: 232
						if (Widget.Widget_interfaceComponents[var0][var2] != null) { // L: 233
							if (Widget.Widget_interfaceComponents[var0][var2].type != 2) { // L: 234
								Widget.Widget_interfaceComponents[var0][var2] = null;
							} else {
								var1 = false; // L: 235
							}
						}
					}

					if (var1) {
						Widget.Widget_interfaceComponents[var0] = null; // L: 238
					}

					Bounds.Widget_loadedInterfaces[var0] = false; // L: 239
				}
			}
		}
	} // L: 240

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "116037374"
	)
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 44
		return var1 == null ? 0 : var1.size(); // L: 45 46
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1418698978"
	)
	static void method2211(int var0, int var1) {
		class2.method39(TaskHandler.tempMenuAction, var0, var1); // L: 10254
		TaskHandler.tempMenuAction = null; // L: 10255
	} // L: 10256
}
