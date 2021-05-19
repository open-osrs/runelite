import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lp")
@Implements("BufferedNetSocket")
public class BufferedNetSocket extends AbstractSocket {
	@ObfuscatedName("v")
	@Export("ItemDefinition_inMembersWorld")
	static boolean ItemDefinition_inMembersWorld;
	@ObfuscatedName("h")
	@Export("socket")
	Socket socket;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("source")
	BufferedSource source;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lly;"
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
		garbageValue = "-36"
	)
	@Export("close")
	public void close() {
		this.sink.close();

		try {
			this.socket.close();
		} catch (IOException var2) {
		}

		this.source.close();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2027143758"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() throws IOException {
		return this.source.readUnsignedByte(); // L: 30
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-640327653"
	)
	@Export("available")
	public int available() throws IOException {
		return this.source.available(); // L: 26
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1880004365"
	)
	@Export("isAvailable")
	public boolean isAvailable(int var1) throws IOException {
		return this.source.isAvailable(var1); // L: 22
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "-1936066161"
	)
	@Export("read")
	public int read(byte[] var1, int var2, int var3) throws IOException {
		return this.source.read(var1, var2, var3); // L: 34
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "1752522959"
	)
	@Export("write")
	public void write(byte[] var1, int var2, int var3) throws IOException {
		this.sink.write(var1, var2, var3); // L: 38
	}

	protected void finalize() {
		this.close();
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1689772773"
	)
	@Export("itemContainerSetItem")
	static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
		ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 39
		if (var4 == null) { // L: 40
			var4 = new ItemContainer(); // L: 41
			ItemContainer.itemContainers.put(var4, (long)var0); // L: 42
		}

		if (var4.ids.length <= var1) { // L: 44
			int[] var5 = new int[var1 + 1]; // L: 45
			int[] var6 = new int[var1 + 1]; // L: 46

			int var7;
			for (var7 = 0; var7 < var4.ids.length; ++var7) { // L: 47
				var5[var7] = var4.ids[var7]; // L: 48
				var6[var7] = var4.quantities[var7]; // L: 49
			}

			for (var7 = var4.ids.length; var7 < var1; ++var7) { // L: 51
				var5[var7] = -1; // L: 52
				var6[var7] = 0; // L: 53
			}

			var4.ids = var5; // L: 55
			var4.quantities = var6; // L: 56
		}

		var4.ids[var1] = var2; // L: 58
		var4.quantities[var1] = var3; // L: 59
	} // L: 60
}
