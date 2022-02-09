import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

@ObfuscatedName("q")
class class13 extends DefaultTlsClient {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lje;"
	)
	@Export("huffman")
	static Huffman huffman;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Leg;"
	)
	static ClanChannel field78;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lh;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Lh;)V"
	)
	class13(class12 var1) {
		this.this$1 = var1; // L: 284
	}

	public Hashtable getClientExtensions() throws IOException {
		Hashtable var1 = super.getClientExtensions(); // L: 287
		if (var1 == null) { // L: 288
			var1 = new Hashtable(); // L: 289
		}

		byte[] var2 = this.this$1.val$host.getBytes(); // L: 291
		ByteArrayOutputStream var3 = new ByteArrayOutputStream(); // L: 292
		DataOutputStream var4 = new DataOutputStream(var3); // L: 293
		var4.writeShort(var2.length + 3); // L: 294
		var4.writeByte(0); // L: 295
		var4.writeShort(var2.length); // L: 296
		var4.write(var2); // L: 297
		var4.close(); // L: 298
		var1.put(0, var3.toByteArray()); // L: 299
		return var1; // L: 300
	}

	public TlsAuthentication getAuthentication() throws IOException {
		return new class11(this); // L: 305
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-670757670"
	)
	@Export("loadInterface")
	public static boolean loadInterface(int var0) {
		if (class145.Widget_loadedInterfaces[var0]) { // L: 207
			return true;
		} else if (!UserComparator6.Widget_archive.tryLoadGroup(var0)) { // L: 208
			return false;
		} else {
			int var1 = UserComparator6.Widget_archive.getGroupFileCount(var0); // L: 209
			if (var1 == 0) { // L: 210
				class145.Widget_loadedInterfaces[var0] = true; // L: 211
				return true; // L: 212
			} else {
				if (Widget.Widget_interfaceComponents[var0] == null) { // L: 214
					Widget.Widget_interfaceComponents[var0] = new Widget[var1];
				}

				for (int var2 = 0; var2 < var1; ++var2) { // L: 215
					if (Widget.Widget_interfaceComponents[var0][var2] == null) { // L: 216
						byte[] var3 = UserComparator6.Widget_archive.takeFile(var0, var2); // L: 217
						if (var3 != null) { // L: 218
							Widget.Widget_interfaceComponents[var0][var2] = new Widget(); // L: 219
							Widget.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16); // L: 220
							if (var3[0] == -1) { // L: 221
								Widget.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
							} else {
								Widget.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3)); // L: 222
							}
						}
					}
				}

				class145.Widget_loadedInterfaces[var0] = true; // L: 226
				return true; // L: 227
			}
		}
	}
}
