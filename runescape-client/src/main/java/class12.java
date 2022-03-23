import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.TlsClientProtocol;

@ObfuscatedName("c")
class class12 extends SSLSocket {
	@ObfuscatedName("sz")
	@ObfuscatedGetter(
		intValue = 596645521
	)
	static int field62;
	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	static Widget field64;
	@ObfuscatedName("v")
	Certificate[] field65;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ls;"
	)
	final class15 this$0;
	// $FF: synthetic field
	final TlsClientProtocol val$tlsClientProtocol;
	// $FF: synthetic field
	final String val$host;

	@ObfuscatedSignature(
		descriptor = "(Ls;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;Ljava/lang/String;)V"
	)
	class12(class15 var1, TlsClientProtocol var2, String var3) {
		this.this$0 = var1; // L: 88
		this.val$tlsClientProtocol = var2;
		this.val$host = var3;
	}

	public OutputStream getOutputStream() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream(); // L: 98
	}

	public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
	} // L: 107

	public String[] getEnabledCipherSuites() {
		return null; // L: 116
	}

	public String[] getEnabledProtocols() {
		return null; // L: 121
	}

	public SSLSession getSession() {
		return new class17(this); // L: 131
	}

	public String[] getSupportedProtocols() {
		return null; // L: 241
	}

	public String[] getSupportedCipherSuites() {
		return null; // L: 246
	}

	public boolean getUseClientMode() {
		return false; // L: 251
	}

	public boolean getWantClientAuth() {
		return false; // L: 256
	}

	public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
	} // L: 260

	public void setEnableSessionCreation(boolean var1) {
	} // L: 263

	public void setWantClientAuth(boolean var1) {
	} // L: 278

	public boolean getEnableSessionCreation() {
		return false; // L: 111
	}

	public void setUseClientMode(boolean var1) {
	} // L: 275

	public void setEnabledProtocols(String[] var1) {
	} // L: 269

	public void startHandshake() throws IOException {
		this.val$tlsClientProtocol.connect(new class13(this)); // L: 282
	} // L: 332

	public synchronized void close() throws IOException {
		this.val$tlsClientProtocol.close(); // L: 103
	} // L: 104

	public void setNeedClientAuth(boolean var1) {
	} // L: 272

	public void setEnabledCipherSuites(String[] var1) {
	} // L: 266

	public boolean getNeedClientAuth() {
		return false; // L: 126
	}

	public InputStream getInputStream() throws IOException {
		return this.val$tlsClientProtocol.getInputStream(); // L: 93
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfd;",
		garbageValue = "50"
	)
	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0); // L: 21
		if (var1 != null) { // L: 22
			return var1;
		} else {
			byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0); // L: 23
			var1 = new InvDefinition(); // L: 24
			if (var2 != null) { // L: 25
				var1.decode(new Buffer(var2));
			}

			InvDefinition.InvDefinition_cached.put(var1, (long)var0); // L: 26
			return var1; // L: 27
		}
	}
}
