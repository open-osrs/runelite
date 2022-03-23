import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ns")
@Implements("BufferedNetSocket")
public class BufferedNetSocket extends AbstractSocket {
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1563809265
	)
	static int field4286;
	@ObfuscatedName("v")
	@Export("socket")
	Socket socket;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("source")
	BufferedSource source;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "105"
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1669312252"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() throws IOException {
		return this.source.readUnsignedByte(); // L: 33
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1264669351"
	)
	@Export("available")
	public int available() throws IOException {
		return this.source.available(); // L: 28
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "396806768"
	)
	@Export("isAvailable")
	public boolean isAvailable(int var1) throws IOException {
		return this.source.isAvailable(var1); // L: 23
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "52142940"
	)
	@Export("read")
	public int read(byte[] var1, int var2, int var3) throws IOException {
		return this.source.read(var1, var2, var3); // L: 38
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "-57"
	)
	@Export("write")
	public void write(byte[] var1, int var2, int var3) throws IOException {
		this.sink.write(var1, var2, var3); // L: 43
	} // L: 44

	protected void finalize() {
		this.close(); // L: 58
	} // L: 59
}
