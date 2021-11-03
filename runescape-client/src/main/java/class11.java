import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.Certificate;
import org.bouncycastle.crypto.tls.CertificateRequest;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import org.bouncycastle.crypto.tls.TlsCredentials;

@ObfuscatedName("y")
class class11 implements TlsAuthentication {
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("archive5")
	static Archive archive5;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lt;"
	)
	final class13 this$2;

	@ObfuscatedSignature(
		descriptor = "(Lt;)V"
	)
	class11(class13 var1) {
		this.this$2 = var1; // L: 248
	}

	public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
		return null; // L: 270
	}

	public void notifyServerCertificate(Certificate var1) throws IOException {
		try {
			CertificateFactory var2 = CertificateFactory.getInstance("X.509"); // L: 251
			LinkedList var3 = new LinkedList(); // L: 252
			org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList(); // L: 254

			for (int var5 = 0; var5 < var4.length; ++var5) { // L: 255
				org.bouncycastle.asn1.x509.Certificate var6 = var4[var5]; // L: 256
				var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded()))); // L: 258
			}

			this.this$2.this$1.field53 = (java.security.cert.Certificate[])((java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0])); // L: 262
		} catch (CertificateException var7) { // L: 264
			throw new IOException(var7); // L: 265
		}
	} // L: 267

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IZIZI)V",
		garbageValue = "-1739783749"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (WorldMapEvent.World_worlds != null) { // L: 171
			FriendSystem.doWorldSorting(0, WorldMapEvent.World_worlds.length - 1, var0, var1, var2, var3); // L: 172
		}

	} // L: 174

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-233699552"
	)
	static final void method107(String var0, int var1) {
		PacketBufferNode var2 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2746, Client.packetWriter.isaacCipher); // L: 242
		var2.packetBuffer.writeByte(Client.stringCp1252NullTerminatedByteSize(var0) + 1); // L: 243
		var2.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 244
		var2.packetBuffer.writeByte(var1); // L: 245
		Client.packetWriter.addNode(var2); // L: 246
	} // L: 247
}
