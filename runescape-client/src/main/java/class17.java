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
		this.this$1 = var1;
	}

	public int getApplicationBufferSize() {
		return 0;
	}

	public void invalidate() {
		throw new UnsupportedOperationException();
	}

	public long getCreationTime() {
		throw new UnsupportedOperationException();
	}

	public byte[] getId() {
		throw new UnsupportedOperationException();
	}

	public long getLastAccessedTime() {
		throw new UnsupportedOperationException();
	}

	public Certificate[] getLocalCertificates() {
		throw new UnsupportedOperationException();
	}

	public void putValue(String var1, Object var2) {
		throw new UnsupportedOperationException();
	}

	public int getPacketBufferSize() {
		throw new UnsupportedOperationException();
	}

	public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
		return this.this$1.field67;
	}

	public int getPeerPort() {
		return 0;
	}

	public String getProtocol() {
		throw new UnsupportedOperationException();
	}

	public SSLSessionContext getSessionContext() {
		throw new UnsupportedOperationException();
	}

	public Object getValue(String var1) {
		throw new UnsupportedOperationException();
	}

	public String[] getValueNames() {
		throw new UnsupportedOperationException();
	}

	public Principal getLocalPrincipal() {
		throw new UnsupportedOperationException();
	}

	public boolean isValid() {
		throw new UnsupportedOperationException();
	}

	public String getPeerHost() {
		throw new UnsupportedOperationException();
	}

	public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
		return null;
	}

	public void removeValue(String var1) {
		throw new UnsupportedOperationException();
	}

	public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
		return null;
	}

	public String getCipherSuite() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1239241420"
	)
	protected static final void method292() {
		class91.clock.mark();

		int var0;
		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.clientTickTimes[var0] = 0L;
		}

		GameEngine.gameCyclesToDo = 0;
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "40"
	)
	static final void method291(int var0) {
		if (var0 >= 0) {
			int var1 = Client.menuArguments1[var0];
			int var2 = Client.menuArguments2[var0];
			int var3 = Client.menuOpcodes[var0];
			int var4 = Client.menuIdentifiers[var0];
			String var5 = Client.menuActions[var0];
			String var6 = Client.menuTargets[var0];
			Decimator.menuAction(var1, var2, var3, var4, var5, var6, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
		}
	}
}
