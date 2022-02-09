import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bk")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("f")
	@Export("formattedOperatingSystemName")
	public static String formattedOperatingSystemName;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 588213751
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 315923437
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Lkz;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0; // L: 9
		this.archive = var1; // L: 12
		this.groupCount = var1.getGroupCount(); // L: 13
	} // L: 14

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0; // L: 17

		for (int var1 = 0; var1 < this.groupCount; ++var1) { // L: 18
			if (!this.archive.method5530(var1) || this.archive.method5557(var1)) {
				++this.loadedCount; // L: 19
			}
		}

		return this.loadedCount >= this.groupCount; // L: 21
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lkq;Ljava/lang/String;Ljava/lang/String;I)[Lpt;",
		garbageValue = "1930156810"
	)
	public static SpritePixels[] method2061(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1); // L: 83
		int var4 = var0.getFileId(var3, var2); // L: 84
		return UserList.method6415(var0, var3, var4); // L: 85
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "([BB)[B",
		garbageValue = "70"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 424
		int var2 = var1.readUnsignedByte(); // L: 425
		int var3 = var1.readInt(); // L: 426
		if (var3 < 0 || AbstractArchive.field3910 != 0 && var3 > AbstractArchive.field3910) { // L: 427
			throw new RuntimeException(); // L: 428
		} else if (var2 == 0) { // L: 430
			byte[] var6 = new byte[var3]; // L: 431
			var1.readBytes(var6, 0, var3); // L: 432
			return var6; // L: 433
		} else {
			int var4 = var1.readInt(); // L: 436
			if (var4 >= 0 && (AbstractArchive.field3910 == 0 || var4 <= AbstractArchive.field3910)) { // L: 437
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

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIZI)V",
		garbageValue = "57386745"
	)
	@Export("insertMenuItem")
	static final void insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, boolean var6) {
		if (!Client.isMenuOpen) { // L: 9341
			if (Client.menuOptionsCount < 500) { // L: 9342
				Client.menuActions[Client.menuOptionsCount] = var0; // L: 9343
				Client.menuTargets[Client.menuOptionsCount] = var1; // L: 9344
				Client.menuOpcodes[Client.menuOptionsCount] = var2; // L: 9345
				Client.menuIdentifiers[Client.menuOptionsCount] = var3; // L: 9346
				Client.menuArguments1[Client.menuOptionsCount] = var4; // L: 9347
				Client.menuArguments2[Client.menuOptionsCount] = var5; // L: 9348
				Client.menuShiftClick[Client.menuOptionsCount] = var6; // L: 9349
				++Client.menuOptionsCount; // L: 9350
			}

		}
	} // L: 9352
}
