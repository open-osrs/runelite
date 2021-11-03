import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("z")
class class17 implements SSLSession {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lk;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Lk;)V"
	)
	class17(class12 var1) {
		this.this$1 = var1; // L: 117
	}

	public int getApplicationBufferSize() {
		return 0; // L: 119
	}

	public String getCipherSuite() {
		throw new UnsupportedOperationException(); // L: 123
	}

	public byte[] getId() {
		throw new UnsupportedOperationException(); // L: 131
	}

	public long getLastAccessedTime() {
		throw new UnsupportedOperationException(); // L: 135
	}

	public Principal getLocalPrincipal() {
		throw new UnsupportedOperationException(); // L: 143
	}

	public int getPacketBufferSize() {
		throw new UnsupportedOperationException(); // L: 147
	}

	public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
		return null; // L: 151
	}

	public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
		return this.this$1.field53; // L: 155
	}

	public String getPeerHost() {
		throw new UnsupportedOperationException(); // L: 159
	}

	public int getPeerPort() {
		return 0; // L: 163
	}

	public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
		return null; // L: 167
	}

	public String getProtocol() {
		throw new UnsupportedOperationException(); // L: 171
	}

	public SSLSessionContext getSessionContext() {
		throw new UnsupportedOperationException(); // L: 175
	}

	public Object getValue(String var1) {
		throw new UnsupportedOperationException(); // L: 179
	}

	public boolean isValid() {
		throw new UnsupportedOperationException(); // L: 191
	}

	public void removeValue(String var1) {
		throw new UnsupportedOperationException(); // L: 199
	}

	public void invalidate() {
		throw new UnsupportedOperationException(); // L: 187
	}

	public long getCreationTime() {
		throw new UnsupportedOperationException(); // L: 127
	}

	public String[] getValueNames() {
		throw new UnsupportedOperationException(); // L: 183
	}

	public Certificate[] getLocalCertificates() {
		throw new UnsupportedOperationException(); // L: 139
	}

	public void putValue(String var1, Object var2) {
		throw new UnsupportedOperationException(); // L: 195
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-560273502"
	)
	@Export("hslToRgb")
	static final int hslToRgb(int var0, int var1, int var2) {
		if (var2 > 179) { // L: 592
			var1 /= 2;
		}

		if (var2 > 192) { // L: 593
			var1 /= 2;
		}

		if (var2 > 217) { // L: 594
			var1 /= 2;
		}

		if (var2 > 243) { // L: 595
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2; // L: 596
		return var3; // L: 597
	}
}
