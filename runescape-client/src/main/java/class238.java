import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("il")
public class class238 {
	static {
		Math.sqrt(8192.0D); // L: 9
	} // L: 10

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/security/SecureRandom;",
		garbageValue = "15"
	)
	static SecureRandom method4380() {
		SecureRandom var0 = new SecureRandom(); // L: 39
		var0.nextInt(); // L: 40
		return var0; // L: 41
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-111"
	)
	@Export("isAlphaNumeric")
	public static boolean isAlphaNumeric(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z'; // L: 176
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lbt;I)V",
		garbageValue = "128863813"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false; // L: 259
		if (var0.sound != null) { // L: 260
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1); // L: 261
		}

	} // L: 262

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "745123443"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 424
		int var2 = var1.readUnsignedByte(); // L: 425
		int var3 = var1.readInt(); // L: 426
		if (var3 < 0 || AbstractArchive.field3278 != 0 && var3 > AbstractArchive.field3278) { // L: 427
			throw new RuntimeException(); // L: 428
		} else if (var2 == 0) { // L: 430
			byte[] var6 = new byte[var3]; // L: 431
			var1.readBytes(var6, 0, var3); // L: 432
			return var6; // L: 433
		} else {
			int var4 = var1.readInt(); // L: 436
			if (var4 >= 0 && (AbstractArchive.field3278 == 0 || var4 <= AbstractArchive.field3278)) { // L: 437
				byte[] var5 = new byte[var4]; // L: 440
				if (var2 == 1) { // L: 441
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5); // L: 442
				}

				return var5; // L: 443
			} else {
				throw new RuntimeException(); // L: 438
			}
		}
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1399862547"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = ObjectComposition.getPacketBufferNode(ClientPacket.field2252, Client.packetWriter.isaacCipher); // L: 11532
		var0.packetBuffer.writeByte(0); // L: 11533
		Client.packetWriter.addNode(var0); // L: 11534
	} // L: 11535
}
