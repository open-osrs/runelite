import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
@Implements("TaskHandler")
public class TaskHandler implements Runnable {
	@ObfuscatedName("v")
	@Export("javaVersion")
	public static String javaVersion;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	@Export("current")
	Task current;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	@Export("task")
	Task task;
	@ObfuscatedName("j")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("e")
	@Export("isClosed")
	boolean isClosed;

	public TaskHandler() {
		this.current = null; // L: 11
		this.task = null; // L: 12
		this.isClosed = false; // L: 14
		class360.javaVendor = "Unknown"; // L: 20
		javaVersion = "1.6"; // L: 21

		try {
			class360.javaVendor = System.getProperty("java.vendor"); // L: 23
			javaVersion = System.getProperty("java.version"); // L: 24
		} catch (Exception var2) { // L: 26
		}

		this.isClosed = false; // L: 27
		this.thread = new Thread(this); // L: 28
		this.thread.setPriority(10); // L: 29
		this.thread.setDaemon(true); // L: 30
		this.thread.start(); // L: 31
	} // L: 32

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "64"
	)
	@Export("close")
	public final void close() {
		synchronized(this) { // L: 35
			this.isClosed = true; // L: 36
			this.notifyAll(); // L: 37
		} // L: 38

		try {
			this.thread.join(); // L: 40
		} catch (InterruptedException var3) { // L: 42
		}

	} // L: 43

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/lang/Object;B)Lfm;",
		garbageValue = "0"
	)
	@Export("newTask")
	final Task newTask(int var1, int var2, int var3, Object var4) {
		Task var5 = new Task();
		var5.type = var1;
		var5.intArgument = var2; // L: 92
		var5.objectArgument = var4; // L: 93
		synchronized(this) { // L: 94
			if (this.task != null) { // L: 95
				this.task.next = var5; // L: 96
				this.task = var5; // L: 97
			} else {
				this.task = this.current = var5; // L: 100
			}

			this.notify(); // L: 102
			return var5; // L: 104
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)Lfm;",
		garbageValue = "-14"
	)
	@Export("newSocketTask")
	public final Task newSocketTask(String var1, int var2) {
		return this.newTask(1, var2, 0, var1); // L: 108
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;II)Lfm;",
		garbageValue = "966743438"
	)
	@Export("newThreadTask")
	public final Task newThreadTask(Runnable var1, int var2) {
		return this.newTask(2, var2, 0, var1); // L: 112
	}

	public final void run() {
		while (true) {
			Task var1;
			synchronized(this) { // L: 48
				while (true) {
					if (this.isClosed) { // L: 50
						return;
					}

					if (this.current != null) { // L: 51
						var1 = this.current; // L: 52
						this.current = this.current.next; // L: 53
						if (this.current == null) { // L: 54
							this.task = null;
						}
						break;
					}

					try {
						this.wait();
					} catch (InterruptedException var8) { // L: 60
					}
				}
			}

			try {
				int var5 = var1.type; // L: 64
				if (var5 == 1) { // L: 65
					var1.result = new Socket(InetAddress.getByName((String)var1.objectArgument), var1.intArgument); // L: 66
				} else if (var5 == 2) { // L: 68
					Thread var3 = new Thread((Runnable)var1.objectArgument); // L: 69
					var3.setDaemon(true); // L: 70
					var3.start(); // L: 71
					var3.setPriority(var1.intArgument); // L: 72
					var1.result = var3; // L: 73
				} else if (var5 == 4) { // L: 75
					var1.result = new DataInputStream(((URL)var1.objectArgument).openStream()); // L: 76
				}

				var1.status = 1; // L: 78
			} catch (ThreadDeath var6) { // L: 80
				throw var6; // L: 81
			} catch (Throwable var7) { // L: 83
				var1.status = 2; // L: 84
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "-443449853"
	)
	public static String method3240(CharSequence var0) {
		String var1 = class229.base37DecodeLong(class339.method6244(var0)); // L: 57
		if (var1 == null) { // L: 58
			var1 = "";
		}

		return var1; // L: 59
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIIZII)J",
		garbageValue = "608136618"
	)
	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4) {
		long var5 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17; // L: 89
		if (var3) { // L: 90
			var5 |= 65536L;
		}

		return var5; // L: 91
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "([Lkb;IB)V",
		garbageValue = "79"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 11586
			Widget var3 = var0[var2]; // L: 11587
			if (var3 != null) { // L: 11588
				if (var3.type == 0) { // L: 11589
					if (var3.children != null) { // L: 11590
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 11591
					if (var4 != null) { // L: 11592
						class7.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) { // L: 11594
					var5 = new ScriptEvent(); // L: 11595
					var5.widget = var3; // L: 11596
					var5.args = var3.onDialogAbort; // L: 11597
					BoundaryObject.runScriptEvent(var5); // L: 11598
				}

				if (var1 == 1 && var3.onSubChange != null) { // L: 11600
					if (var3.childIndex >= 0) { // L: 11601
						Widget var6 = class140.getWidget(var3.id); // L: 11602
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) { // L: 11603
							continue;
						}
					}

					var5 = new ScriptEvent(); // L: 11607
					var5.widget = var3; // L: 11608
					var5.args = var3.onSubChange; // L: 11609
					BoundaryObject.runScriptEvent(var5); // L: 11610
				}
			}
		}

	} // L: 11613
}
