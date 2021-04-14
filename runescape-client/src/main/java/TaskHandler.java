import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
@Implements("TaskHandler")
public class TaskHandler implements Runnable {
	@ObfuscatedName("f")
	@Export("javaVendor")
	public static String javaVendor;
	@ObfuscatedName("o")
	@Export("javaVersion")
	public static String javaVersion;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lep;"
	)
	@Export("current")
	Task current;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lep;"
	)
	@Export("task")
	Task task;
	@ObfuscatedName("b")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("e")
	@Export("isClosed")
	boolean isClosed;

	public TaskHandler() {
		this.current = null; // L: 11
		this.task = null; // L: 12
		this.isClosed = false; // L: 14
		javaVendor = "Unknown"; // L: 20
		javaVersion = "1.6"; // L: 21

		try {
			javaVendor = System.getProperty("java.vendor"); // L: 23
			javaVersion = System.getProperty("java.version"); // L: 24
		} catch (Exception var2) { // L: 26
		}

		this.isClosed = false; // L: 27
		this.thread = new Thread(this); // L: 28
		this.thread.setPriority(10); // L: 29
		this.thread.setDaemon(true); // L: 30
		this.thread.start(); // L: 31
	} // L: 32

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "732898192"
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/lang/Object;I)Lep;",
		garbageValue = "743067634"
	)
	@Export("newTask")
	final Task newTask(int var1, int var2, int var3, Object var4) {
		Task var5 = new Task(); // L: 90
		var5.type = var1; // L: 91
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)Lep;",
		garbageValue = "-31"
	)
	@Export("newSocketTask")
	public final Task newSocketTask(String var1, int var2) {
		return this.newTask(1, var2, 0, var1); // L: 108
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;IB)Lep;",
		garbageValue = "-100"
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
						this.wait(); // L: 58
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1532861557"
	)
	static void method2524() {
		Players.Players_count = 0; // L: 616

		for (int var0 = 0; var0 < 2048; ++var0) { // L: 617
			Players.field1352[var0] = null; // L: 618
			Players.field1351[var0] = 1; // L: 619
		}

	} // L: 621

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "800079546"
	)
	static void method2523() {
		if (class105.field1331 != null) { // L: 11737
			Client.field623 = Client.cycle; // L: 11738
			class105.field1331.method4657(); // L: 11739

			for (int var0 = 0; var0 < Client.players.length; ++var0) { // L: 11740
				if (Client.players[var0] != null) { // L: 11741
					class105.field1331.method4656((Client.players[var0].x >> 7) + ItemLayer.baseX, (Client.players[var0].y >> 7) + Tile.baseY); // L: 11742
				}
			}
		}

	} // L: 11746
}
