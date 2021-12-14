import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("a")
public class class16 implements ThreadFactory {
	@ObfuscatedName("c")
	final ThreadGroup field87;
	@ObfuscatedName("b")
	final AtomicInteger field86;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lg;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lg;)V"
	)
	class16(class14 var1) {
		this.this$0 = var1;
		this.field86 = new AtomicInteger(1);
		SecurityManager var2 = System.getSecurityManager();
		this.field87 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
	}

	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field87, var1, this.this$0.field79 + "-rest-request-" + this.field86.getAndIncrement(), 0L);
		var2.setDaemon(true);
		var2.setPriority(5);
		return var2;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljm;II)V",
		garbageValue = "-158278735"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field3300 == null) {
			throw new RuntimeException();
		} else {
			if (var0.field3368 == null) {
				var0.field3368 = new int[var0.field3300.length];
			}

			var0.field3368[var1] = Integer.MAX_VALUE;
		}
	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "74"
	)
	static void method239(int var0) {
		class87.tempMenuAction = new MenuAction();
		class87.tempMenuAction.param0 = Client.menuArguments1[var0];
		class87.tempMenuAction.param1 = Client.menuArguments2[var0];
		class87.tempMenuAction.opcode = Client.menuOpcodes[var0];
		class87.tempMenuAction.identifier = Client.menuIdentifiers[var0];
		class87.tempMenuAction.action = Client.menuActions[var0];
	}
}
