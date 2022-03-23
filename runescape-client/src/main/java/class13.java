import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

@ObfuscatedName("j")
class class13 extends DefaultTlsClient {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lc;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Lc;)V"
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

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "1"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase(); // L: 11841
		short[] var2 = new short[16]; // L: 11842
		int var3 = 0; // L: 11843

		for (int var4 = 0; var4 < ArchiveLoader.ItemDefinition_fileCount; ++var4) { // L: 11844
			ItemComposition var9 = class67.ItemDefinition_get(var4); // L: 11845
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) { // L: 11846 11847 11848
				if (var3 >= 250) { // L: 11849
					PendingSpawn.foundItemIdCount = -1; // L: 11850
					class14.foundItemIds = null; // L: 11851
					return; // L: 11852
				}

				if (var3 >= var2.length) { // L: 11854
					short[] var6 = new short[var2.length * 2]; // L: 11855

					for (int var7 = 0; var7 < var3; ++var7) { // L: 11856
						var6[var7] = var2[var7];
					}

					var2 = var6; // L: 11857
				}

				var2[var3++] = (short)var4; // L: 11859
			}
		}

		class14.foundItemIds = var2; // L: 11861
		MouseRecorder.foundItemIndex = 0; // L: 11862
		PendingSpawn.foundItemIdCount = var3; // L: 11863
		String[] var8 = new String[PendingSpawn.foundItemIdCount]; // L: 11864

		for (int var5 = 0; var5 < PendingSpawn.foundItemIdCount; ++var5) { // L: 11865
			var8[var5] = class67.ItemDefinition_get(var2[var5]).name;
		}

		class193.method3880(var8, class14.foundItemIds); // L: 11866
	} // L: 11867
}
