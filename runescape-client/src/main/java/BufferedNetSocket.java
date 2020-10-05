import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lk")
public class BufferedNetSocket extends AbstractSocket {
	@ObfuscatedName("z")
	Socket socket;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	BufferedSource source;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
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

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-147773206"
	)
	public void close() {
		this.sink.close(); // L: 42

		try {
			this.socket.close(); // L: 44
		} catch (IOException var2) { // L: 46
		}

		this.source.close(); // L: 47
	} // L: 48

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-99"
	)
	public int readUnsignedByte() throws IOException {
		return this.source.readUnsignedByte(); // L: 30
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "12"
	)
	public int available() throws IOException {
		return this.source.available(); // L: 26
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-78"
	)
	public boolean isAvailable(int var1) throws IOException {
		return this.source.isAvailable(var1); // L: 22
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "-1533815985"
	)
	public int read(byte[] var1, int var2, int var3) throws IOException {
		return this.source.read(var1, var2, var3); // L: 34
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "52"
	)
	public void write(byte[] var1, int var2, int var3) throws IOException {
		this.sink.write(var1, var2, var3); // L: 38
	} // L: 39

	protected void finalize() {
		this.close(); // L: 51
	} // L: 52
}
