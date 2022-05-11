import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

@ObfuscatedName("b")
class class13 extends DefaultTlsClient {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lw;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Lw;)V"
	)
	class13(class12 var1) {
		this.this$1 = var1; // L: 282
	}

	public Hashtable getClientExtensions() throws IOException {
		Hashtable var1 = super.getClientExtensions(); // L: 285
		if (var1 == null) { // L: 286
			var1 = new Hashtable(); // L: 287
		}

		byte[] var2 = this.this$1.val$host.getBytes(); // L: 289
		ByteArrayOutputStream var3 = new ByteArrayOutputStream(); // L: 290
		DataOutputStream var4 = new DataOutputStream(var3); // L: 291
		var4.writeShort(var2.length + 3); // L: 292
		var4.writeByte(0); // L: 293
		var4.writeShort(var2.length); // L: 294
		var4.write(var2); // L: 295
		var4.close(); // L: 296
		var1.put(0, var3.toByteArray()); // L: 297
		return var1; // L: 298
	}

	public TlsAuthentication getAuthentication() throws IOException {
		return new class11(this); // L: 303
	}
}
