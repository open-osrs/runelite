import java.applet.Applet;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("mr")
@Implements("BufferedNetSocket")
public class BufferedNetSocket extends AbstractSocket {
	@ObfuscatedName("n")
	@Export("socket")
	Socket socket;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	@Export("source")
	BufferedSource source;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("sink")
	BufferedSink sink;

	BufferedNetSocket(Socket var1, int var2, int var3) throws IOException {
		this.socket = var1;
		this.socket.setSoTimeout(30000);
		this.socket.setTcpNoDelay(true);
		this.socket.setReceiveBufferSize(65536);
		this.socket.setSendBufferSize(65536);
		this.source = new BufferedSource(this.socket.getInputStream(), var2);
		this.sink = new BufferedSink(this.socket.getOutputStream(), var3);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "4535"
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
		descriptor = "(B)I",
		garbageValue = "61"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() throws IOException {
		return this.source.readUnsignedByte();
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1430321597"
	)
	@Export("available")
	public int available() throws IOException {
		return this.source.available();
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "823949627"
	)
	@Export("isAvailable")
	public boolean isAvailable(int var1) throws IOException {
		return this.source.isAvailable(var1);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "593938417"
	)
	@Export("read")
	public int read(byte[] var1, int var2, int var3) throws IOException {
		return this.source.read(var1, var2, var3);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "-4"
	)
	@Export("write")
	public void write(byte[] var1, int var2, int var3) throws IOException {
		this.sink.write(var1, var2, var3);
	}

	protected void finalize() {
		this.close();
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Z",
		garbageValue = "106915676"
	)
	static boolean method6116(String var0, int var1, String var2) {
		if (var1 == 0) {
			try {
				if (!class29.field172.startsWith("win")) {
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
					throw new Exception();
				} else {
					String var13 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

					for (int var4 = 0; var4 < var0.length(); ++var4) {
						if (var13.indexOf(var0.charAt(var4)) == -1) {
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
					return true;
				}
			} catch (Throwable var8) {
				return false;
			}
		} else if (var1 == 1) {
			try {
				Applet var7 = class29.applet;
				Object[] var5 = new Object[]{(new URL(class29.applet.getCodeBase(), var0)).toString()};
				Object var3 = JSObject.getWindow(var7).call(var2, var5);
				return var3 != null;
			} catch (Throwable var9) {
				return false;
			}
		} else if (var1 == 2) {
			try {
				class29.applet.getAppletContext().showDocument(new URL(class29.applet.getCodeBase(), var0), "_blank");
				return true;
			} catch (Exception var10) {
				return false;
			}
		} else if (var1 == 3) {
			try {
				class27.method398(class29.applet, "loggedout");
			} catch (Throwable var12) {
			}

			try {
				class29.applet.getAppletContext().showDocument(new URL(class29.applet.getCodeBase(), var0), "_top");
				return true;
			} catch (Exception var11) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
