import java.io.IOException;
import java.net.Socket;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("np")
@Implements("BufferedNetSocket")
public class BufferedNetSocket extends AbstractSocket {
	@ObfuscatedName("c")
	@Export("socket")
	Socket socket;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	@Export("source")
	BufferedSource source;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	@Export("sink")
	BufferedSink sink;

	BufferedNetSocket(Socket var1, int var2, int var3) throws IOException {
		this.socket = var1; // L: 12
		this.socket.setSoTimeout(30000); // L: 13
		this.socket.setTcpNoDelay(true); // L: 14
		this.socket.setReceiveBufferSize(65536); // L: 15
		this.socket.setSendBufferSize(65536); // L: 16
		this.source = new BufferedSource(this.socket.getInputStream(), var2); // L: 17
		this.sink = new BufferedSink(this.socket.getOutputStream(), var3); // L: 18
	} // L: 19

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "1"
	)
	@Export("isAvailable")
	public boolean isAvailable(int var1) throws IOException {
		return this.source.isAvailable(var1); // L: 23
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-439883726"
	)
	public int available() throws IOException {
		return this.source.available(); // L: 28
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1889844897"
	)
	public int readUnsignedByte() throws IOException {
		return this.source.readUnsignedByte(); // L: 33
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "695516749"
	)
	@Export("read")
	public int read(byte[] var1, int var2, int var3) throws IOException {
		return this.source.read(var1, var2, var3); // L: 38
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "1416716039"
	)
	@Export("write")
	public void write(byte[] var1, int var2, int var3) throws IOException {
		this.sink.write(var1, var2, var3); // L: 43
	} // L: 44

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-17278531"
	)
	@Export("close")
	public void close() {
		this.sink.close(); // L: 48

		try {
			this.socket.close(); // L: 50
		} catch (IOException var2) { // L: 52
		}

		this.source.close(); // L: 53
	} // L: 54

	protected void finalize() {
		this.close();
	} // L: 59

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/Date;",
		garbageValue = "-61"
	)
	static Date method6835() {
		java.util.Calendar var0 = java.util.Calendar.getInstance(); // L: 1119
		var0.set(2, 0); // L: 1120
		var0.set(5, 1); // L: 1121
		var0.set(1, 1900); // L: 1122
		return var0.getTime(); // L: 1123
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lfr;IIS)Lar;",
		garbageValue = "8848"
	)
	public static final PcmPlayer method6849(TaskHandler var0, int var1, int var2) {
		if (var1 >= 0 && var1 < 2) { // L: 57
			if (var2 < 256) { // L: 58
				var2 = 256;
			}

			try {
				PcmPlayer var3 = ModelData0.pcmPlayerProvider.player(); // L: 60
				var3.samples = new int[256 * (BuddyRankComparator.PcmPlayer_stereo ? 2 : 1)]; // L: 61
				var3.field282 = var2; // L: 62
				var3.init(); // L: 63
				var3.capacity = (var2 & -1024) + 1024; // L: 64
				if (var3.capacity > 16384) { // L: 65
					var3.capacity = 16384;
				}

				var3.open(var3.capacity); // L: 66
				if (HealthBarUpdate.field1212 > 0 && PcmPlayer.soundSystem == null) { // L: 67
					PcmPlayer.soundSystem = new SoundSystem(); // L: 68
					PcmPlayer.soundSystemExecutor = Executors.newScheduledThreadPool(1); // L: 69
					PcmPlayer.soundSystemExecutor.scheduleAtFixedRate(PcmPlayer.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS); // L: 70
				}

				if (PcmPlayer.soundSystem != null) { // L: 72
					if (PcmPlayer.soundSystem.players[var1] != null) { // L: 73
						throw new IllegalArgumentException();
					}

					PcmPlayer.soundSystem.players[var1] = var3; // L: 74
				}

				return var3; // L: 76
			} catch (Throwable var4) { // L: 78
				return new PcmPlayer(); // L: 79
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "([Lkb;Lkb;ZI)V",
		garbageValue = "1435342792"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth * 1710798627 * 1791635595 : var1.width * 1623184389 * 2092161229; // L: 10653
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight * -1042306339 * -1548911243 : var1.height * 514298127 * 236010991; // L: 10654
		class118.resizeInterface(var0, var1.id, var3, var4, var2); // L: 10655
		if (var1.children != null) { // L: 10656
			class118.resizeInterface(var1.children, var1.id, var3, var4, var2);
		}

		InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id); // L: 10657
		if (var5 != null) { // L: 10658
			int var6 = var5.group; // L: 10659
			if (WorldMapSection2.loadInterface(var6)) { // L: 10661
				class118.resizeInterface(SoundCache.Widget_interfaceComponents[var6], -1, var3, var4, var2); // L: 10662
			}
		}

		if (var1.contentType == 1337) { // L: 10665
		}

	} // L: 10666
}
