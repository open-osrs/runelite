import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("x")
class class17 implements SSLSession {
	@ObfuscatedName("x")
	@Export("ByteArrayPool_altSizeArrayCounts")
	public static int[] ByteArrayPool_altSizeArrayCounts;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1069442965
	)
	static int field99;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lz;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Lz;)V"
	)
	class17(class12 var1) {
		this.this$1 = var1; // L: 134
	}

	public int getApplicationBufferSize() {
		return 0; // L: 137
	}

	public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
		return null; // L: 197
	}

	public byte[] getId() {
		throw new UnsupportedOperationException(); // L: 152
	}

	public long getLastAccessedTime() {
		throw new UnsupportedOperationException(); // L: 157
	}

	public Certificate[] getLocalCertificates() {
		throw new UnsupportedOperationException(); // L: 162
	}

	public int getPacketBufferSize() {
		throw new UnsupportedOperationException(); // L: 172
	}

	public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
		return this.this$1.field63; // L: 182
	}

	public String getPeerHost() {
		throw new UnsupportedOperationException(); // L: 187
	}

	public int getPeerPort() {
		return 0; // L: 192
	}

	public String getProtocol() {
		throw new UnsupportedOperationException(); // L: 202
	}

	public Object getValue(String var1) {
		throw new UnsupportedOperationException(); // L: 212
	}

	public void invalidate() {
		throw new UnsupportedOperationException(); // L: 222
	}

	public boolean isValid() {
		throw new UnsupportedOperationException(); // L: 227
	}

	public void putValue(String var1, Object var2) {
		throw new UnsupportedOperationException(); // L: 232
	}

	public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
		return null; // L: 177
	}

	public SSLSessionContext getSessionContext() {
		throw new UnsupportedOperationException(); // L: 207
	}

	public long getCreationTime() {
		throw new UnsupportedOperationException(); // L: 147
	}

	public void removeValue(String var1) {
		throw new UnsupportedOperationException(); // L: 237
	}

	public Principal getLocalPrincipal() {
		throw new UnsupportedOperationException(); // L: 167
	}

	public String[] getValueNames() {
		throw new UnsupportedOperationException(); // L: 217
	}

	public String getCipherSuite() {
		throw new UnsupportedOperationException(); // L: 142
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1793849187"
	)
	public static int method232(int var0, int var1, int var2) {
		int var3 = VarpDefinition.method3374(var2 - var1 + 1); // L: 43
		var3 <<= var1; // L: 44
		var0 |= var3; // L: 45
		return var0; // L: 46
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "113"
	)
	@Export("Widget_resetModelFrames")
	static final void Widget_resetModelFrames(int var0) {
		if (WorldMapSection2.loadInterface(var0)) { // L: 11760
			Widget[] var1 = SoundCache.Widget_interfaceComponents[var0]; // L: 11761

			for (int var2 = 0; var2 < var1.length; ++var2) { // L: 11762
				Widget var3 = var1[var2]; // L: 11763
				if (var3 != null) { // L: 11764
					var3.modelFrame = 0; // L: 11765
					var3.modelFrameCycle = 0; // L: 11766
				}
			}

		}
	} // L: 11768
}
