import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lx")
@Implements("BufferedNetSocket")
public class BufferedNetSocket extends AbstractSocket {
	@ObfuscatedName("f")
	@Export("socket")
	Socket socket;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	@Export("source")
	BufferedSource source;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("sink")
	BufferedSink sink;

	public BufferedNetSocket(Socket var1, int var2, int var3) throws IOException {
		this.socket = var1; // L: 12
		this.socket.setSoTimeout(30000); // L: 13
		this.socket.setTcpNoDelay(true); // L: 14
		this.socket.setReceiveBufferSize(65536); // L: 15
		this.socket.setSendBufferSize(65536); // L: 16
		this.source = new BufferedSource(this.socket.getInputStream(), var2); // L: 17
		this.sink = new BufferedSink(this.socket.getOutputStream(), var3); // L: 18
	} // L: 19

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1983450651"
	)
	@Export("close")
	public void close() {
		this.sink.close(); // L: 42

		try {
			this.socket.close(); // L: 44
		} catch (IOException var2) { // L: 46
		}

		this.source.close(); // L: 47
	} // L: 48

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() throws IOException {
		return this.source.readUnsignedByte(); // L: 30
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "933186835"
	)
	@Export("available")
	public int available() throws IOException {
		return this.source.available(); // L: 26
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-916126565"
	)
	@Export("isAvailable")
	public boolean isAvailable(int var1) throws IOException {
		return this.source.isAvailable(var1); // L: 22
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "1049423117"
	)
	@Export("read")
	public int read(byte[] var1, int var2, int var3) throws IOException {
		return this.source.read(var1, var2, var3); // L: 34
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "1456512196"
	)
	@Export("write")
	public void write(byte[] var1, int var2, int var3) throws IOException {
		this.sink.write(var1, var2, var3); // L: 38
	} // L: 39

	protected void finalize() {
		this.close(); // L: 51
	} // L: 52

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(Lht;B)Z",
		garbageValue = "15"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) { // L: 9995
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) { // L: 9996
				int var2 = WorldMapID.method663(var0, var1); // L: 9997
				int var3 = var0.cs1ComparisonValues[var1]; // L: 9998
				if (var0.cs1Comparisons[var1] == 2) { // L: 9999
					if (var2 >= var3) { // L: 10000
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) { // L: 10002
					if (var2 <= var3) { // L: 10003
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) { // L: 10005
					if (var2 == var3) { // L: 10006
						return false;
					}
				} else if (var2 != var3) { // L: 10008
					return false;
				}
			}

			return true; // L: 10010
		}
	}
}
