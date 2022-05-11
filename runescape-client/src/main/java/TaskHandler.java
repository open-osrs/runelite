import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
@Implements("TaskHandler")
public class TaskHandler implements Runnable {
	@ObfuscatedName("o")
	@Export("javaVendor")
	public static String javaVendor;
	@ObfuscatedName("q")
	@Export("javaVersion")
	public static String javaVersion;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	@Export("current")
	Task current;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	@Export("task")
	Task task;
	@ObfuscatedName("a")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("m")
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1440718962"
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/lang/Object;I)Lfl;",
		garbageValue = "1484642782"
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Lfl;",
		garbageValue = "1024019511"
	)
	@Export("newSocketTask")
	public final Task newSocketTask(String var1, int var2) {
		return this.newTask(1, var2, 0, var1); // L: 108
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;II)Lfl;",
		garbageValue = "1474796416"
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2007350025"
	)
	@Export("isKeyDown")
	public static final boolean isKeyDown() {
		synchronized(KeyHandler.KeyHandler_instance) { // L: 132
			if (KeyHandler.field144 == KeyHandler.field142) { // L: 133
				return false;
			} else {
				class12.field61 = KeyHandler.field122[KeyHandler.field142]; // L: 134
				InvDefinition.field1850 = KeyHandler.field136[KeyHandler.field142]; // L: 135
				KeyHandler.field142 = KeyHandler.field142 + 1 & 127; // L: 136
				return true; // L: 137
			}
		}
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;I)V",
		garbageValue = "87331600"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = ApproximateRouteStrategy.getWidgetChild(var1, var2); // L: 9808
		if (var5 != null) { // L: 9809
			if (var5.onOp != null) { // L: 9810
				ScriptEvent var6 = new ScriptEvent(); // L: 9811
				var6.widget = var5; // L: 9812
				var6.opIndex = var0; // L: 9813
				var6.targetName = var4; // L: 9814
				var6.args = var5.onOp; // L: 9815
				class144.runScriptEvent(var6); // L: 9816
			}

			boolean var8 = true; // L: 9818
			if (var5.contentType > 0) { // L: 9819
				var8 = ReflectionCheck.method599(var5);
			}

			if (var8) { // L: 9820
				if (MenuAction.method1880(UrlRequester.getWidgetFlags(var5), var0 - 1)) { // L: 9821
					PacketBufferNode var7;
					if (var0 == 1) { // L: 9824
						var7 = WallDecoration.getPacketBufferNode(ClientPacket.field3006, Client.packetWriter.isaacCipher); // L: 9826
						var7.packetBuffer.writeInt(var1); // L: 9827
						var7.packetBuffer.writeShort(var2); // L: 9828
						var7.packetBuffer.writeShort(var3); // L: 9829
						Client.packetWriter.addNode(var7); // L: 9830
					}

					if (var0 == 2) { // L: 9832
						var7 = WallDecoration.getPacketBufferNode(ClientPacket.field3032, Client.packetWriter.isaacCipher); // L: 9834
						var7.packetBuffer.writeInt(var1); // L: 9835
						var7.packetBuffer.writeShort(var2); // L: 9836
						var7.packetBuffer.writeShort(var3); // L: 9837
						Client.packetWriter.addNode(var7); // L: 9838
					}

					if (var0 == 3) { // L: 9840
						var7 = WallDecoration.getPacketBufferNode(ClientPacket.field3011, Client.packetWriter.isaacCipher); // L: 9842
						var7.packetBuffer.writeInt(var1); // L: 9843
						var7.packetBuffer.writeShort(var2); // L: 9844
						var7.packetBuffer.writeShort(var3); // L: 9845
						Client.packetWriter.addNode(var7); // L: 9846
					}

					if (var0 == 4) { // L: 9848
						var7 = WallDecoration.getPacketBufferNode(ClientPacket.field2956, Client.packetWriter.isaacCipher); // L: 9850
						var7.packetBuffer.writeInt(var1); // L: 9851
						var7.packetBuffer.writeShort(var2); // L: 9852
						var7.packetBuffer.writeShort(var3); // L: 9853
						Client.packetWriter.addNode(var7); // L: 9854
					}

					if (var0 == 5) { // L: 9856
						var7 = WallDecoration.getPacketBufferNode(ClientPacket.field2960, Client.packetWriter.isaacCipher); // L: 9858
						var7.packetBuffer.writeInt(var1); // L: 9859
						var7.packetBuffer.writeShort(var2); // L: 9860
						var7.packetBuffer.writeShort(var3); // L: 9861
						Client.packetWriter.addNode(var7); // L: 9862
					}

					if (var0 == 6) { // L: 9864
						var7 = WallDecoration.getPacketBufferNode(ClientPacket.field2968, Client.packetWriter.isaacCipher); // L: 9866
						var7.packetBuffer.writeInt(var1); // L: 9867
						var7.packetBuffer.writeShort(var2); // L: 9868
						var7.packetBuffer.writeShort(var3); // L: 9869
						Client.packetWriter.addNode(var7); // L: 9870
					}

					if (var0 == 7) { // L: 9872
						var7 = WallDecoration.getPacketBufferNode(ClientPacket.field3002, Client.packetWriter.isaacCipher); // L: 9874
						var7.packetBuffer.writeInt(var1); // L: 9875
						var7.packetBuffer.writeShort(var2); // L: 9876
						var7.packetBuffer.writeShort(var3); // L: 9877
						Client.packetWriter.addNode(var7); // L: 9878
					}

					if (var0 == 8) { // L: 9880
						var7 = WallDecoration.getPacketBufferNode(ClientPacket.field2989, Client.packetWriter.isaacCipher); // L: 9882
						var7.packetBuffer.writeInt(var1); // L: 9883
						var7.packetBuffer.writeShort(var2); // L: 9884
						var7.packetBuffer.writeShort(var3); // L: 9885
						Client.packetWriter.addNode(var7); // L: 9886
					}

					if (var0 == 9) { // L: 9888
						var7 = WallDecoration.getPacketBufferNode(ClientPacket.field3015, Client.packetWriter.isaacCipher); // L: 9890
						var7.packetBuffer.writeInt(var1); // L: 9891
						var7.packetBuffer.writeShort(var2); // L: 9892
						var7.packetBuffer.writeShort(var3); // L: 9893
						Client.packetWriter.addNode(var7); // L: 9894
					}

					if (var0 == 10) { // L: 9896
						var7 = WallDecoration.getPacketBufferNode(ClientPacket.field3043, Client.packetWriter.isaacCipher); // L: 9898
						var7.packetBuffer.writeInt(var1); // L: 9899
						var7.packetBuffer.writeShort(var2); // L: 9900
						var7.packetBuffer.writeShort(var3); // L: 9901
						Client.packetWriter.addNode(var7); // L: 9902
					}

				}
			}
		}
	} // L: 9822 9904
}
