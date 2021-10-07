import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cg")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1289779463
	)
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("archive1")
	static Archive archive1;
	@ObfuscatedName("l")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("q")
	@Export("lock")
	Object lock;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 70944461
	)
	@Export("index")
	int index;
	@ObfuscatedName("j")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("m")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("k")
	@Export("millis")
	long[] millis;

	MouseRecorder() {
		this.isRunning = true;
		this.lock = new Object();
		this.index = 0;
		this.xs = new int[500];
		this.ys = new int[500];
		this.millis = new long[500];
	}

	public void run() {
		for (; this.isRunning; class121.method2542(50L)) {
			synchronized(this.lock) {
				if (this.index < 500) {
					this.xs[this.index] = MouseHandler.MouseHandler_x;
					this.ys[this.index] = MouseHandler.MouseHandler_y;
					this.millis[this.index] = MouseHandler.MouseHandler_millis;
					++this.index;
				}
			}
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-76927073"
	)
	public static void method2078(int var0, int var1) {
		VarbitComposition var2 = AttackOption.method2263(var0);
		int var3 = var2.baseVar;
		int var4 = var2.startBit;
		int var5 = var2.endBit;
		int var6 = Varps.Varps_masks[var5 - var4];
		if (var1 < 0 || var1 > var6) {
			var1 = 0;
		}

		var6 <<= var4;
		Varps.Varps_main[var3] = Varps.Varps_main[var3] & ~var6 | var1 << var4 & var6;
	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "0"
	)
	static final void method2075(boolean var0) {
		class356.playPcmPlayers();
		++Client.packetWriter.pendingWrites;
		if (Client.packetWriter.pendingWrites >= 50 || var0) {
			Client.packetWriter.pendingWrites = 0;
			if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) {
				PacketBufferNode var1 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2706, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var1);

				try {
					Client.packetWriter.flush();
				} catch (IOException var3) {
					Client.hadNetworkError = true;
				}
			}

		}
	}
}
