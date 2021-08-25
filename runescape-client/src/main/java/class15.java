import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import java.security.Security;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.TlsClientProtocol;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

@ObfuscatedName("h")
public class class15 extends SSLSocketFactory {
	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("redHintArrowSprite")
	static SpritePixels redHintArrowSprite;
	@ObfuscatedName("n")
	SecureRandom field77;

	static {
		if (Security.getProvider("BC") == null) {
			Security.addProvider(new BouncyCastleProvider());
		}

	}

	class15() {
		this.field77 = new SecureRandom();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;B)Ljavax/net/ssl/SSLSocket;",
		garbageValue = "0"
	)
	SSLSocket method195(String var1, TlsClientProtocol var2) {
		return new class12(this, var2, var1);
	}

	public Socket createSocket(Socket var1, String var2, int var3, boolean var4) throws IOException {
		if (var1 == null) {
			var1 = new Socket();
		}

		if (!var1.isConnected()) {
			var1.connect(new InetSocketAddress(var2, var3));
		}

		TlsClientProtocol var5 = new TlsClientProtocol(var1.getInputStream(), var1.getOutputStream(), this.field77);
		return this.method195(var2, var5);
	}

	public String[] getDefaultCipherSuites() {
		return null;
	}

	public Socket createSocket(String var1, int var2) throws IOException, UnknownHostException {
		return null;
	}

	public Socket createSocket(String var1, int var2, InetAddress var3, int var4) throws IOException, UnknownHostException {
		return null;
	}

	public Socket createSocket(InetAddress var1, int var2, InetAddress var3, int var4) throws IOException {
		return null;
	}

	public Socket createSocket(InetAddress var1, int var2) throws IOException {
		return null;
	}

	public String[] getSupportedCipherSuites() {
		return null;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lkk;Lkk;Lkk;B)V",
		garbageValue = "51"
	)
	public static void method210(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		SequenceDefinition.SequenceDefinition_archive = var0;
		SequenceDefinition.SequenceDefinition_animationsArchive = var1;
		SequenceDefinition.SequenceDefinition_skeletonsArchive = var2;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2090726924"
	)
	public static int method192(int var0) {
		return var0 >> 17 & 7;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ILiy;ZI)V",
		garbageValue = "-500490039"
	)
	static void method214(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = NetSocket.getWorldMap().getMapArea(var0);
		int var4 = class129.localPlayer.plane;
		int var5 = (class129.localPlayer.x >> 7) + FloorOverlayDefinition.baseX;
		int var6 = (class129.localPlayer.y >> 7) + class320.baseY;
		Coord var7 = new Coord(var4, var5, var6);
		NetSocket.getWorldMap().method6367(var3, var7, var1, var2);
	}
}
