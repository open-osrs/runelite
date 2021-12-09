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

@ObfuscatedName("u")
class class17 implements SSLSession {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("StructDefinition_archive")
	static AbstractArchive StructDefinition_archive;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1007360263
	)
	static int field93;
	@ObfuscatedName("ha")
	@ObfuscatedGetter(
		intValue = -303525593
	)
	static int field90;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ld;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Ld;)V"
	)
	class17(class12 var1) {
		this.this$1 = var1; // L: 133
	}

	public int getApplicationBufferSize() {
		return 0; // L: 136
	}

	public void invalidate() {
		throw new UnsupportedOperationException(); // L: 221
	}

	public long getCreationTime() {
		throw new UnsupportedOperationException(); // L: 146
	}

	public byte[] getId() {
		throw new UnsupportedOperationException(); // L: 151
	}

	public long getLastAccessedTime() {
		throw new UnsupportedOperationException(); // L: 156
	}

	public Certificate[] getLocalCertificates() {
		throw new UnsupportedOperationException(); // L: 161
	}

	public void putValue(String var1, Object var2) {
		throw new UnsupportedOperationException(); // L: 231
	}

	public int getPacketBufferSize() {
		throw new UnsupportedOperationException(); // L: 171
	}

	public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
		return this.this$1.field67; // L: 181
	}

	public int getPeerPort() {
		return 0; // L: 191
	}

	public String getProtocol() {
		throw new UnsupportedOperationException(); // L: 201
	}

	public SSLSessionContext getSessionContext() {
		throw new UnsupportedOperationException(); // L: 206
	}

	public Object getValue(String var1) {
		throw new UnsupportedOperationException(); // L: 211
	}

	public String[] getValueNames() {
		throw new UnsupportedOperationException(); // L: 216
	}

	public Principal getLocalPrincipal() {
		throw new UnsupportedOperationException(); // L: 166
	}

	public boolean isValid() {
		throw new UnsupportedOperationException(); // L: 226
	}

	public String getPeerHost() {
		throw new UnsupportedOperationException(); // L: 186
	}

	public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
		return null; // L: 176
	}

	public void removeValue(String var1) {
		throw new UnsupportedOperationException(); // L: 236
	}

	public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
		return null; // L: 196
	}

	public String getCipherSuite() {
		throw new UnsupportedOperationException(); // L: 141
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1239241420"
	)
	protected static final void method292() {
		class91.clock.mark(); // L: 405

		int var0;
		for (var0 = 0; var0 < 32; ++var0) { // L: 406
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) { // L: 407
			GameEngine.clientTickTimes[var0] = 0L;
		}

		GameEngine.gameCyclesToDo = 0; // L: 408
	} // L: 409

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "40"
	)
	static final void method291(int var0) {
		if (var0 >= 0) { // L: 9004
			int var1 = Client.menuArguments1[var0]; // L: 9005
			int var2 = Client.menuArguments2[var0]; // L: 9006
			int var3 = Client.menuOpcodes[var0]; // L: 9007
			int var4 = Client.menuIdentifiers[var0]; // L: 9008
			String var5 = Client.menuActions[var0]; // L: 9009
			String var6 = Client.menuTargets[var0]; // L: 9010
			Decimator.menuAction(var1, var2, var3, var4, var5, var6, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 9011
		}
	} // L: 9012
}
