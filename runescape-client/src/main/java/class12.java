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

@ObfuscatedName("w")
class class12 extends SSLSocket {
	@ObfuscatedName("uq")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -380169429
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -1896109667
	)
	public static int field61;
	@ObfuscatedName("o")
	Certificate[] field63;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lg;"
	)
	final class15 this$0;
	// $FF: synthetic field
	final TlsClientProtocol val$tlsClientProtocol;
	// $FF: synthetic field
	final String val$host;

	@ObfuscatedSignature(
		descriptor = "(Lg;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;Ljava/lang/String;)V"
	)
	class12(class15 var1, TlsClientProtocol var2, String var3) {
		this.this$0 = var1; // L: 88
		this.val$tlsClientProtocol = var2;
		this.val$host = var3;
	}

	public synchronized void close() throws IOException {
		this.val$tlsClientProtocol.close(); // L: 103
	} // L: 104

	public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
	} // L: 107

	public boolean getEnableSessionCreation() {
		return false; // L: 111
	}

	public String[] getEnabledCipherSuites() {
		return null; // L: 116
	}

	public String[] getEnabledProtocols() {
		return null; // L: 121
	}

	public SSLSession getSession() {
		return new class17(this); // L: 131
	}

	public OutputStream getOutputStream() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream(); // L: 98
	}

	public String[] getSupportedCipherSuites() {
		return null; // L: 246
	}

	public boolean getWantClientAuth() {
		return false; // L: 256
	}

	public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
	} // L: 260

	public void setEnabledCipherSuites(String[] var1) {
	} // L: 266

	public void setEnabledProtocols(String[] var1) {
	} // L: 269

	public void setNeedClientAuth(boolean var1) {
	} // L: 272

	public void setUseClientMode(boolean var1) {
	} // L: 275

	public void startHandshake() throws IOException {
		this.val$tlsClientProtocol.connect(new class13(this)); // L: 282
	} // L: 332

	public InputStream getInputStream() throws IOException {
		return this.val$tlsClientProtocol.getInputStream(); // L: 93
	}

	public boolean getNeedClientAuth() {
		return false; // L: 126
	}

	public boolean getUseClientMode() {
		return false; // L: 251
	}

	public void setEnableSessionCreation(boolean var1) {
	} // L: 263

	public String[] getSupportedProtocols() {
		return null; // L: 241
	}

	public void setWantClientAuth(boolean var1) {
	} // L: 278

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Lbo;",
		garbageValue = "1838920898"
	)
	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return (Message)Messages.Messages_hashTable.get((long)var0); // L: 40
	}
}
