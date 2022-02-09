import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import java.security.Security;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.TlsClientProtocol;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

@ObfuscatedName("p")
public class class15 extends SSLSocketFactory {
	@ObfuscatedName("c")
	SecureRandom field88;

	static {
		if (Security.getProvider("BC") == null) { // L: 40
			Security.addProvider(new BouncyCastleProvider());
		}

	} // L: 41

	class15() {
		this.field88 = new SecureRandom(); // L: 43
	} // L: 45

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;I)Ljavax/net/ssl/SSLSocket;",
		garbageValue = "2008156590"
	)
	SSLSocket method183(String var1, TlsClientProtocol var2) {
		return new class12(this, var2, var1); // L: 90
	}

	public String[] getDefaultCipherSuites() {
		return null; // L: 61
	}

	public String[] getSupportedCipherSuites() {
		return null; // L: 66
	}

	public Socket createSocket(Socket var1, String var2, int var3, boolean var4) throws IOException {
		if (var1 == null) { // L: 49
			var1 = new Socket(); // L: 50
		}

		if (!var1.isConnected()) { // L: 52
			var1.connect(new InetSocketAddress(var2, var3)); // L: 53
		}

		TlsClientProtocol var5 = new TlsClientProtocol(var1.getInputStream(), var1.getOutputStream(), this.field88); // L: 55
		return this.method183(var2, var5); // L: 56
	}

	public Socket createSocket(InetAddress var1, int var2, InetAddress var3, int var4) throws IOException {
		return null; // L: 86
	}

	public Socket createSocket(InetAddress var1, int var2) throws IOException {
		return null; // L: 76
	}

	public Socket createSocket(String var1, int var2, InetAddress var3, int var4) throws IOException, UnknownHostException {
		return null; // L: 81
	}

	public Socket createSocket(String var1, int var2) throws IOException, UnknownHostException {
		return null; // L: 71
	}
}
