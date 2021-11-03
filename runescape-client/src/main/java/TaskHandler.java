import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
@Implements("TaskHandler")
public class TaskHandler implements Runnable {
	@ObfuscatedName("i")
	@Export("javaVendor")
	public static String javaVendor;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("current")
	Task current;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("task")
	Task task;
	@ObfuscatedName("o")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("g")
	@Export("isClosed")
	boolean isClosed;

	public TaskHandler() {
		this.current = null; // L: 11
		this.task = null; // L: 12
		this.isClosed = false; // L: 14
		javaVendor = "Unknown"; // L: 20
		GrandExchangeOfferAgeComparator.javaVersion = "1.6"; // L: 21

		try {
			javaVendor = System.getProperty("java.vendor"); // L: 23
			GrandExchangeOfferAgeComparator.javaVersion = System.getProperty("java.version"); // L: 24
		} catch (Exception var2) { // L: 26
		}

		this.isClosed = false; // L: 27
		this.thread = new Thread(this); // L: 28
		this.thread.setPriority(10); // L: 29
		this.thread.setDaemon(true); // L: 30
		this.thread.start(); // L: 31
	} // L: 32

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1038367564"
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/lang/Object;I)Lev;",
		garbageValue = "-1716880810"
	)
	@Export("newTask")
	final Task newTask(int var1, int var2, int var3, Object var4) {
		Task var5 = new Task();
		var5.type = var1;
		var5.intArgument = var2;
		var5.objectArgument = var4;
		synchronized(this) {
			if (this.task != null) {
				this.task.next = var5;
				this.task = var5;
			} else {
				this.task = this.current = var5;
			}

			this.notify();
			return var5; // L: 104
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Lev;",
		garbageValue = "-137947903"
	)
	@Export("newSocketTask")
	public final Task newSocketTask(String var1, int var2) {
		return this.newTask(1, var2, 0, var1);
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;II)Lev;",
		garbageValue = "-1680555194"
	)
	@Export("newThreadTask")
	public final Task newThreadTask(Runnable var1, int var2) {
		return this.newTask(2, var2, 0, var1);
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
					var1.result = new DataInputStream(((URL)var1.objectArgument).openStream());
				}

				var1.status = 1; // L: 78
			} catch (ThreadDeath var6) { // L: 80
				throw var6; // L: 81
			} catch (Throwable var7) { // L: 83
				var1.status = 2;
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)Lff;",
		garbageValue = "-1590739193"
	)
	@Export("ItemDefinition_get")
	public static ItemComposition ItemDefinition_get(int var0) {
		ItemComposition var1 = (ItemComposition)ItemComposition.ItemDefinition_cached.get((long)var0); // L: 84
		if (var1 != null) { // L: 85
			return var1;
		} else {
			byte[] var2 = DirectByteArrayCopier.ItemDefinition_archive.takeFile(10, var0); // L: 86
			var1 = new ItemComposition(); // L: 87
			var1.id = var0; // L: 88
			if (var2 != null) { // L: 89
				var1.decode(new Buffer(var2));
			}

			var1.post(); // L: 90
			if (var1.noteTemplate != -1) { // L: 91
				var1.genCert(ItemDefinition_get(var1.noteTemplate), ItemDefinition_get(var1.note));
			}

			if (var1.notedId != -1) { // L: 92
				var1.genBought(ItemDefinition_get(var1.notedId), ItemDefinition_get(var1.unnotedId));
			}

			if (var1.placeholderTemplate != -1) { // L: 93
				var1.genPlaceholder(ItemDefinition_get(var1.placeholderTemplate), ItemDefinition_get(var1.placeholder));
			}

			if (!BuddyRankComparator.ItemDefinition_inMembersWorld && var1.isMembersOnly) { // L: 94
				var1.name = "Members object"; // L: 95
				var1.isTradable = false; // L: 96

				int var3;
				for (var3 = 0; var3 < var1.groundActions.length; ++var3) { // L: 97
					var1.groundActions[var3] = null; // L: 98
				}

				for (var3 = 0; var3 < var1.inventoryActions.length; ++var3) { // L: 100
					if (var3 != 4) { // L: 101
						var1.inventoryActions[var3] = null; // L: 102
					}
				}

				var1.shiftClickIndex = -2; // L: 105
				var1.team = 0; // L: 106
				if (var1.params != null) { // L: 107
					boolean var6 = false; // L: 108

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) { // L: 109
						ParamComposition var5 = Buffer.getParamDefinition((int)var4.key); // L: 110
						if (var5.autoDisable) { // L: 111
							var4.remove();
						} else {
							var6 = true; // L: 112
						}
					}

					if (!var6) {
						var1.params = null; // L: 114
					}
				}
			}

			ItemComposition.ItemDefinition_cached.put(var1, (long)var0); // L: 117
			return var1; // L: 118
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "1243234471"
	)
	public static int method2881(CharSequence var0) {
		return AttackOption.method2304(var0, 10, true); // L: 76
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lko;II)Loe;",
		garbageValue = "1045837880"
	)
	public static IndexedSprite method2882(AbstractArchive var0, int var1) {
		byte[] var3 = var0.takeFileFlat(var1); // L: 129
		boolean var2;
		if (var3 == null) { // L: 130
			var2 = false; // L: 131
		} else {
			Script.SpriteBuffer_decode(var3); // L: 134
			var2 = true; // L: 135
		}

		return !var2 ? null : WorldMapArea.method3654(); // L: 137 138
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-753625264"
	)
	public static int[] method2879() {
		int[] var0 = new int[KeyHandler.field135]; // L: 242

		for (int var1 = 0; var1 < KeyHandler.field135; ++var1) { // L: 243
			var0[var1] = KeyHandler.field127[var1]; // L: 244
		}

		return var0; // L: 246
	}
}
