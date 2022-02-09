import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.TlsClientProtocol;

@ObfuscatedName("h")
class class12 extends SSLSocket {
	@ObfuscatedName("sk")
	@ObfuscatedGetter(
		intValue = -536820815
	)
	static int field75;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("ObjectDefinition_archive")
	static AbstractArchive ObjectDefinition_archive;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 708907497
	)
	static int field74;
	@ObfuscatedName("c")
	Certificate[] field71;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lp;"
	)
	final class15 this$0;
	// $FF: synthetic field
	final TlsClientProtocol val$tlsClientProtocol;
	// $FF: synthetic field
	final String val$host;

	@ObfuscatedSignature(
		descriptor = "(Lp;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;Ljava/lang/String;)V"
	)
	class12(class15 var1, TlsClientProtocol var2, String var3) {
		this.this$0 = var1; // L: 90
		this.val$tlsClientProtocol = var2;
		this.val$host = var3;
	}

	public String[] getSupportedCipherSuites() {
		return null; // L: 248
	}

	public OutputStream getOutputStream() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream(); // L: 100
	}

	public synchronized void close() throws IOException {
		this.val$tlsClientProtocol.close(); // L: 105
	} // L: 106

	public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
	} // L: 109

	public boolean getEnableSessionCreation() {
		return false; // L: 113
	}

	public String[] getEnabledCipherSuites() {
		return null; // L: 118
	}

	public String[] getEnabledProtocols() {
		return null; // L: 123
	}

	public boolean getNeedClientAuth() {
		return false; // L: 128
	}

	public boolean getUseClientMode() {
		return false; // L: 253
	}

	public boolean getWantClientAuth() {
		return false; // L: 258
	}

	public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
	} // L: 262

	public void setEnabledCipherSuites(String[] var1) {
	} // L: 268

	public void setEnabledProtocols(String[] var1) {
	} // L: 271

	public void setNeedClientAuth(boolean var1) {
	} // L: 274

	public void setUseClientMode(boolean var1) {
	} // L: 277

	public void startHandshake() throws IOException {
		this.val$tlsClientProtocol.connect(new class13(this)); // L: 284
	} // L: 334

	public void setWantClientAuth(boolean var1) {
	} // L: 280

	public SSLSession getSession() {
		return new class17(this); // L: 133
	}

	public InputStream getInputStream() throws IOException {
		return this.val$tlsClientProtocol.getInputStream(); // L: 95
	}

	public String[] getSupportedProtocols() {
		return null; // L: 243
	}

	public void setEnableSessionCreation(boolean var1) {
	} // L: 265

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Float;Ljava/lang/Float;I)V",
		garbageValue = "-1321795090"
	)
	static void method155(Float var0, Float var1) {
		if (var0 + class112.field1386 < 1.3333334F) { // L: 297
			float var2 = var0 - 2.0F; // L: 298
			float var3 = var0 - 1.0F; // L: 299
			float var4 = (float)Math.sqrt((double)(var2 * var2 - 4.0F * var3 * var3)); // L: 300
			float var5 = (var4 + -var2) * 0.5F; // L: 301
			if (var1 + class112.field1386 > var5) { // L: 302
				var1 = var5 - class112.field1386; // L: 303
			} else {
				var5 = 0.5F * (-var2 - var4); // L: 306
				if (var1 < class112.field1386 + var5) { // L: 307
					var1 = var5 + class112.field1386; // L: 308
				}
			}
		} else {
			var0 = 1.3333334F - class112.field1386; // L: 313
			var1 = 0.33333334F - class112.field1386; // L: 314
		}

	} // L: 316

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)V",
		garbageValue = "-3"
	)
	static final void method158(String var0, int var1) {
		PacketBufferNode var2 = class135.getPacketBufferNode(ClientPacket.field2907, Client.packetWriter.isaacCipher); // L: 222
		var2.packetBuffer.writeByte(GrandExchangeEvents.stringCp1252NullTerminatedByteSize(var0) + 1); // L: 223
		var2.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 224
		var2.packetBuffer.writeByte(var1); // L: 225
		Client.packetWriter.addNode(var2); // L: 226
	} // L: 227

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(IIIILpt;Ljq;I)V",
		garbageValue = "-178422566"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2; // L: 11842
		if (var6 > 4225 && var6 < 90000) { // L: 11843
			int var7 = Client.camAngleY & 2047; // L: 11844
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 11845
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 11846
			int var10 = var9 * var2 + var3 * var8 >> 16; // L: 11847
			int var11 = var3 * var9 - var8 * var2 >> 16; // L: 11848
			double var12 = Math.atan2((double)var10, (double)var11); // L: 11849
			int var14 = var5.width / 2 - 25; // L: 11850
			int var15 = (int)(Math.sin(var12) * (double)var14); // L: 11851
			int var16 = (int)(Math.cos(var12) * (double)var14); // L: 11852
			byte var17 = 20; // L: 11853
			class78.redHintArrowSprite.method7801(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256); // L: 11854
		} else {
			Interpreter.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5); // L: 11856
		}

	} // L: 11857
}
