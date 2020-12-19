import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("le")
@Implements("BufferedNetSocket")
public class BufferedNetSocket extends AbstractSocket {
	@ObfuscatedName("h")
	@Export("socket")
	Socket socket;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	@Export("source")
	BufferedSource source;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Llf;"
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-10"
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() throws IOException {
		return this.source.readUnsignedByte(); // L: 30
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1974658106"
	)
	@Export("available")
	public int available() throws IOException {
		return this.source.available(); // L: 26
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-7"
	)
	@Export("isAvailable")
	public boolean isAvailable(int var1) throws IOException {
		return this.source.isAvailable(var1); // L: 22
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "([BIIB)I",
		garbageValue = "98"
	)
	@Export("read")
	public int read(byte[] var1, int var2, int var3) throws IOException {
		return this.source.read(var1, var2, var3); // L: 34
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-2028715299"
	)
	@Export("write")
	public void write(byte[] var1, int var2, int var3) throws IOException {
		this.sink.write(var1, var2, var3); // L: 38
	} // L: 39

	protected void finalize() {
		this.close(); // L: 51
	} // L: 52
}
