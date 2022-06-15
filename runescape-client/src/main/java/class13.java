import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

@ObfuscatedName("r")
class class13 extends DefaultTlsClient {
	@ObfuscatedName("w")
	@Export("SpriteBuffer_spritePalette")
	public static int[] SpriteBuffer_spritePalette;
	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "[Lqu;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lz;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Lz;)V"
	)
	class13(class12 var1) {
		this.this$1 = var1; // L: 285
	}

	public Hashtable getClientExtensions() throws IOException {
		Hashtable var1 = super.getClientExtensions(); // L: 288
		if (var1 == null) { // L: 289
			var1 = new Hashtable(); // L: 290
		}

		byte[] var2 = this.this$1.val$host.getBytes(); // L: 292
		ByteArrayOutputStream var3 = new ByteArrayOutputStream(); // L: 293
		DataOutputStream var4 = new DataOutputStream(var3); // L: 294
		var4.writeShort(var2.length + 3); // L: 295
		var4.writeByte(0); // L: 296
		var4.writeShort(var2.length); // L: 297
		var4.write(var2); // L: 298
		var4.close(); // L: 299
		var1.put(0, var3.toByteArray()); // L: 300
		return var1; // L: 301
	}

	public TlsAuthentication getAuthentication() throws IOException {
		return new class11(this); // L: 306
	}
}
