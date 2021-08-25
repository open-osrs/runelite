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

@ObfuscatedName("y")
class class11 implements TlsAuthentication {
	@ObfuscatedName("e")
	public static short[][] field54;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 2144032175
	)
	@Export("loginBoxCenter")
	static int loginBoxCenter;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;
	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("fontBold12")
	static Font fontBold12;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lf;"
	)
	final class13 this$2;

	@ObfuscatedSignature(
		descriptor = "(Lf;)V"
	)
	class11(class13 var1) {
		this.this$2 = var1;
	}

	public void notifyServerCertificate(Certificate var1) throws IOException {
		try {
			CertificateFactory var2 = CertificateFactory.getInstance("X.509");
			LinkedList var3 = new LinkedList();
			org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList();

			for (int var5 = 0; var5 < var4.length; ++var5) {
				org.bouncycastle.asn1.x509.Certificate var6 = var4[var5];
				var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded())));
			}

			this.this$2.this$1.field60 = (java.security.cert.Certificate[])((java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0]));
		} catch (CertificateException var7) {
			throw new IOException(var7);
		}
	}

	public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
		return null;
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1237234444"
	)
	static final void method115() {
		for (int var0 = 0; var0 < Players.Players_count; ++var0) {
			Player var1 = Client.players[Players.Players_indices[var0]];
			var1.clearIsInFriendsChat();
		}

	}
}
