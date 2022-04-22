import java.io.File;
import java.io.IOException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("u")
public class class16 implements ThreadFactory {
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("archive6")
	static Archive archive6;
	@ObfuscatedName("v")
	final ThreadGroup field77;
	@ObfuscatedName("c")
	final AtomicInteger field78;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ld;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ld;)V"
	)
	class16(class14 var1) {
		this.this$0 = var1; // L: 67
		this.field78 = new AtomicInteger(1); // L: 65
		SecurityManager var2 = System.getSecurityManager(); // L: 68
		this.field77 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup(); // L: 69
	} // L: 70

	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field77, var1, this.this$0.field69 + "-rest-request-" + this.field78.getAndIncrement(), 0L); // L: 73
		var2.setDaemon(true); // L: 74
		var2.setPriority(5); // L: 75
		return var2; // L: 76
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;Ljava/io/File;I)V",
		garbageValue = "2082256408"
	)
	static void method194(File var0, File var1) {
		try {
			AccessFile var2 = new AccessFile(class28.JagexCache_locationFile, "rw", 10000L); // L: 216
			Buffer var3 = new Buffer(500); // L: 217
			var3.writeByte(3); // L: 218
			var3.writeByte(var1 != null ? 1 : 0); // L: 219
			var3.writeCESU8(var0.getPath()); // L: 220
			if (var1 != null) {
				var3.writeCESU8(""); // L: 221
			}

			var2.write(var3.array, 0, var3.offset); // L: 222
			var2.close(); // L: 223
		} catch (IOException var4) { // L: 225
			var4.printStackTrace(); // L: 226
		}

	} // L: 228

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1157813230"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		ItemLayer.logOut(); // L: 2941
		switch(var0) { // L: 2942
		case 1:
			Ignored.method6828(24); // L: 2954
			class4.setLoginResponseString("", "You were disconnected from the server.", ""); // L: 2955
			break;
		case 2:
			Ignored.method6828(24); // L: 2946
			class4.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", ""); // L: 2947
		}

	} // L: 2960
}
