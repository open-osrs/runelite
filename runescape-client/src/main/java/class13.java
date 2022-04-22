import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

@ObfuscatedName("k")
class class13 extends DefaultTlsClient {
	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lw;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Lw;)V"
	)
	class13(class12 var1) {
		this.this$1 = var1; // L: 227
	}

	public Hashtable getClientExtensions() throws IOException {
		Hashtable var1 = super.getClientExtensions(); // L: 229
		if (var1 == null) { // L: 230
			var1 = new Hashtable(); // L: 231
		}

		byte[] var2 = this.this$1.val$host.getBytes(); // L: 233
		ByteArrayOutputStream var3 = new ByteArrayOutputStream(); // L: 234
		DataOutputStream var4 = new DataOutputStream(var3); // L: 235
		var4.writeShort(var2.length + 3); // L: 236
		var4.writeByte(0); // L: 237
		var4.writeShort(var2.length); // L: 238
		var4.write(var2); // L: 239
		var4.close(); // L: 240
		var1.put(0, var3.toByteArray()); // L: 241
		return var1; // L: 242
	}

	public TlsAuthentication getAuthentication() throws IOException {
		return new class11(this); // L: 246
	}

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-547008186"
	)
	static final void method163(int var0, int var1, int var2) {
		if (WorldMapLabelSize.cameraX < var0) { // L: 3729
			WorldMapLabelSize.cameraX = (var0 - WorldMapLabelSize.cameraX) * ArchiveDisk.field4309 / 1000 + WorldMapLabelSize.cameraX + Script.field955; // L: 3730
			if (WorldMapLabelSize.cameraX > var0) { // L: 3731
				WorldMapLabelSize.cameraX = var0;
			}
		}

		if (WorldMapLabelSize.cameraX > var0) { // L: 3733
			WorldMapLabelSize.cameraX -= (WorldMapLabelSize.cameraX - var0) * ArchiveDisk.field4309 / 1000 + Script.field955; // L: 3734
			if (WorldMapLabelSize.cameraX < var0) { // L: 3735
				WorldMapLabelSize.cameraX = var0;
			}
		}

		if (ItemContainer.cameraY < var1) { // L: 3737
			ItemContainer.cameraY = (var1 - ItemContainer.cameraY) * ArchiveDisk.field4309 / 1000 + ItemContainer.cameraY + Script.field955; // L: 3738
			if (ItemContainer.cameraY > var1) { // L: 3739
				ItemContainer.cameraY = var1;
			}
		}

		if (ItemContainer.cameraY > var1) { // L: 3741
			ItemContainer.cameraY -= (ItemContainer.cameraY - var1) * ArchiveDisk.field4309 / 1000 + Script.field955; // L: 3742
			if (ItemContainer.cameraY < var1) { // L: 3743
				ItemContainer.cameraY = var1;
			}
		}

		if (class154.cameraZ < var2) { // L: 3745
			class154.cameraZ = (var2 - class154.cameraZ) * ArchiveDisk.field4309 / 1000 + class154.cameraZ + Script.field955; // L: 3746
			if (class154.cameraZ > var2) { // L: 3747
				class154.cameraZ = var2;
			}
		}

		if (class154.cameraZ > var2) { // L: 3749
			class154.cameraZ -= (class154.cameraZ - var2) * ArchiveDisk.field4309 / 1000 + Script.field955; // L: 3750
			if (class154.cameraZ < var2) { // L: 3751
				class154.cameraZ = var2;
			}
		}

	} // L: 3753

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "109"
	)
	static int method164(int var0, int var1) {
		int var2 = var1 - 334; // L: 5445
		if (var2 < 0) { // L: 5446
			var2 = 0;
		} else if (var2 > 100) { // L: 5447
			var2 = 100;
		}

		int var3 = (Client.zoomWidth - Client.zoomHeight) * var2 / 100 + Client.zoomHeight; // L: 5448
		return var0 * var3 / 256; // L: 5449
	}
}
