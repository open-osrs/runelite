import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("da")
@Implements("TaskHandler")
public class TaskHandler implements Runnable {
	@ObfuscatedName("f")
	@Export("javaVendor")
	public static String javaVendor;
	@ObfuscatedName("e")
	@Export("javaVersion")
	public static String javaVersion;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	@Export("current")
	Task current;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	@Export("task")
	Task task;
	@ObfuscatedName("j")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("o")
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
		garbageValue = "-1744867211"
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/lang/Object;B)Lel;",
		garbageValue = "127"
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Lel;",
		garbageValue = "1638941584"
	)
	@Export("newSocketTask")
	public final Task newSocketTask(String var1, int var2) {
		return this.newTask(1, var2, 0, var1); // L: 108
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;II)Lel;",
		garbageValue = "2125831447"
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

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZB)I",
		garbageValue = "89"
	)
	static int method2626(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? UserComparator5.scriptDotWidget : User.scriptActiveWidget; // L: 1086
		if (var0 == ScriptOpcodes.CC_GETX) { // L: 1087
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.x; // L: 1088
			return 1; // L: 1089
		} else if (var0 == ScriptOpcodes.CC_GETY) { // L: 1091
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.y; // L: 1092
			return 1; // L: 1093
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) { // L: 1095
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.width; // L: 1096
			return 1; // L: 1097
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) { // L: 1099
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.height; // L: 1100
			return 1; // L: 1101
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) { // L: 1103
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1104
			return 1; // L: 1105
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) { // L: 1107
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.parentId; // L: 1108
			return 1; // L: 1109
		} else {
			return 2; // L: 1111
		}
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(Lcz;IIB)V",
		garbageValue = "-68"
	)
	static final void method2625(MenuAction var0, int var1, int var2) {
		GameObject.menuAction(var0.param0, var0.param1, var0.opcode, var0.identifier, var0.action, var0.action, var1, var2); // L: 7930
	} // L: 7931

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-846504237"
	)
	static void method2615(String var0) {
		Messages.field1397 = var0; // L: 11587

		try {
			String var1 = class1.client.getParameter(Integer.toString(18)); // L: 11589
			String var2 = class1.client.getParameter(Integer.toString(13)); // L: 11590
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2; // L: 11591
			if (var0.length() == 0) { // L: 11592
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				String var4 = var3 + "; Expires="; // L: 11594
				long var6 = ClientPacket.currentTimeMillis() + 94608000000L; // L: 11596
				Calendar.Calendar_calendar.setTime(new Date(var6)); // L: 11598
				int var8 = Calendar.Calendar_calendar.get(7); // L: 11599
				int var9 = Calendar.Calendar_calendar.get(5); // L: 11600
				int var10 = Calendar.Calendar_calendar.get(2); // L: 11601
				int var11 = Calendar.Calendar_calendar.get(1); // L: 11602
				int var12 = Calendar.Calendar_calendar.get(11); // L: 11603
				int var13 = Calendar.Calendar_calendar.get(12); // L: 11604
				int var14 = Calendar.Calendar_calendar.get(13); // L: 11605
				String var5 = Calendar.DAYS_OF_THE_WEEK[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT"; // L: 11606
				var3 = var4 + var5 + "; Max-Age=" + 94608000L; // L: 11608
			}

			class42.method525(class1.client, "document.cookie=\"" + var3 + "\""); // L: 11610
		} catch (Throwable var15) { // L: 11612
		}

	} // L: 11613
}
