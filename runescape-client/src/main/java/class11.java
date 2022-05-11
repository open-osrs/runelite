import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.Certificate;
import org.bouncycastle.crypto.tls.CertificateRequest;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import org.bouncycastle.crypto.tls.TlsCredentials;

@ObfuscatedName("c")
class class11 implements TlsAuthentication {
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 824355601
	)
	@Export("cacheGamebuild")
	static int cacheGamebuild;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lb;"
	)
	final class13 this$2;

	@ObfuscatedSignature(
		descriptor = "(Lb;)V"
	)
	class11(class13 var1) {
		this.this$2 = var1; // L: 303
	}

	public void notifyServerCertificate(Certificate var1) throws IOException {
		try {
			CertificateFactory var2 = CertificateFactory.getInstance("X.509"); // L: 307
			LinkedList var3 = new LinkedList(); // L: 308
			org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList(); // L: 310

			for (int var5 = 0; var5 < var4.length; ++var5) { // L: 311
				org.bouncycastle.asn1.x509.Certificate var6 = var4[var5]; // L: 312
				var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded()))); // L: 314
			}

			this.this$2.this$1.field63 = (java.security.cert.Certificate[])((java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0])); // L: 318
		} catch (CertificateException var7) { // L: 320
			throw new IOException(var7); // L: 321
		}
	} // L: 323

	public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
		return null; // L: 327
	}
}
