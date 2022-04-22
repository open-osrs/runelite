import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("no")
@Implements("BufferedNetSocket")
public class BufferedNetSocket extends AbstractSocket {
	@ObfuscatedName("o")
	@Export("Tiles_hue")
	static int[] Tiles_hue;
	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("archive3")
	static Archive archive3;
	@ObfuscatedName("v")
	@Export("socket")
	Socket socket;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	@Export("source")
	BufferedSource source;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
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
		descriptor = "(S)V",
		garbageValue = "-13138"
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-891040314"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() throws IOException {
		return this.source.readUnsignedByte(); // L: 30
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "46"
	)
	@Export("available")
	public int available() throws IOException {
		return this.source.available(); // L: 26
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "27"
	)
	@Export("isAvailable")
	public boolean isAvailable(int var1) throws IOException {
		return this.source.isAvailable(var1); // L: 22
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "([BIIB)I",
		garbageValue = "-118"
	)
	@Export("read")
	public int read(byte[] var1, int var2, int var3) throws IOException {
		return this.source.read(var1, var2, var3); // L: 34
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-1359342670"
	)
	@Export("write")
	public void write(byte[] var1, int var2, int var3) throws IOException {
		this.sink.write(var1, var2, var3); // L: 38
	} // L: 39

	protected void finalize() {
		this.close(); // L: 51
	} // L: 52
}
