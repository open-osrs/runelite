import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.Iterator;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("n")
class class17 implements SSLSession {
	@ObfuscatedName("ta")
	@ObfuscatedGetter(
		intValue = 1306614653
	)
	static int field88;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("NpcDefinition_modelArchive")
	public static AbstractArchive NpcDefinition_modelArchive;
	@ObfuscatedName("ai")
	static String field89;
	@ObfuscatedName("hh")
	@Export("regionLandArchiveIds")
	static int[] regionLandArchiveIds;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lw;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Lw;)V"
	)
	class17(class12 var1) {
		this.this$1 = var1; // L: 131
	}

	public int getApplicationBufferSize() {
		return 0; // L: 134
	}

	public String getPeerHost() {
		throw new UnsupportedOperationException(); // L: 184
	}

	public long getCreationTime() {
		throw new UnsupportedOperationException(); // L: 144
	}

	public String getCipherSuite() {
		throw new UnsupportedOperationException(); // L: 139
	}

	public long getLastAccessedTime() {
		throw new UnsupportedOperationException(); // L: 154
	}

	public void removeValue(String var1) {
		throw new UnsupportedOperationException(); // L: 234
	}

	public int getPacketBufferSize() {
		throw new UnsupportedOperationException(); // L: 169
	}

	public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
		return null; // L: 174
	}

	public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
		return this.this$1.field63; // L: 179
	}

	public int getPeerPort() {
		return 0; // L: 189
	}

	public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
		return null; // L: 194
	}

	public byte[] getId() {
		throw new UnsupportedOperationException(); // L: 149
	}

	public String[] getValueNames() {
		throw new UnsupportedOperationException(); // L: 214
	}

	public void invalidate() {
		throw new UnsupportedOperationException(); // L: 219
	}

	public boolean isValid() {
		throw new UnsupportedOperationException(); // L: 224
	}

	public SSLSessionContext getSessionContext() {
		throw new UnsupportedOperationException(); // L: 204
	}

	public Principal getLocalPrincipal() {
		throw new UnsupportedOperationException(); // L: 164
	}

	public Object getValue(String var1) {
		throw new UnsupportedOperationException(); // L: 209
	}

	public String getProtocol() {
		throw new UnsupportedOperationException(); // L: 199
	}

	public void putValue(String var1, Object var2) {
		throw new UnsupportedOperationException(); // L: 229
	}

	public Certificate[] getLocalCertificates() {
		throw new UnsupportedOperationException(); // L: 159
	}

	@ObfuscatedName("a")
	public static int method236(long var0) {
		return (int)(var0 >>> 0 & 127L); // L: 60
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1814027423"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0; // L: 602
		if (WorldMapData_1.garbageCollector == null || !WorldMapData_1.garbageCollector.isValid()) { // L: 603
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator(); // L: 605

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next(); // L: 606
					if (var2.isValid()) { // L: 608
						WorldMapData_1.garbageCollector = var2; // L: 609
						GameEngine.garbageCollectorLastCheckTimeMs = -1L; // L: 610
						GameEngine.garbageCollectorLastCollectionTime = -1L; // L: 611
					}
				}
			} catch (Throwable var11) { // L: 616
			}
		}

		if (WorldMapData_1.garbageCollector != null) { // L: 618
			long var9 = class113.method2624(); // L: 619
			long var3 = WorldMapData_1.garbageCollector.getCollectionTime(); // L: 620
			if (GameEngine.garbageCollectorLastCollectionTime != -1L) { // L: 621
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime; // L: 622
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs; // L: 623
				if (0L != var7) { // L: 624
					var0 = (int)(var5 * 100L / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3; // L: 626
			GameEngine.garbageCollectorLastCheckTimeMs = var9; // L: 627
		}

		return var0; // L: 629
	}
}
