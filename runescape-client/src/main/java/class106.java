import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
public class class106 {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 2138418587
	)
	int field1338;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -967225705
	)
	int field1339;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1767393285
	)
	int field1340;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -818178637
	)
	int field1337;

	class106(int var1, int var2, int var3, int var4) {
		this.field1338 = var1; // L: 10
		this.field1339 = var2; // L: 11
		this.field1340 = var3; // L: 12
		this.field1337 = var4; // L: 13
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2088462326"
	)
	int method2375() {
		return this.field1338; // L: 17
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1716458247"
	)
	int method2360() {
		return this.field1339; // L: 21
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1297519754"
	)
	int method2367() {
		return this.field1340; // L: 25
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1743321878"
	)
	int method2363() {
		return this.field1337; // L: 29
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)[Lja;",
		garbageValue = "-2024232904"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.PlayerType_playerModerator, PlayerType.PlayerType_normal, PlayerType.PlayerType_ironman, PlayerType.PlayerType_jagexModerator, PlayerType.PlayerType_hardcoreIronman, PlayerType.field3544, PlayerType.PlayerType_ultimateIronman}; // L: 20
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)[Lee;",
		garbageValue = "895185577"
	)
	static VerticalAlignment[] method2373() {
		return new VerticalAlignment[]{VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field1676, VerticalAlignment.field1679}; // L: 14
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "-194944054"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 406
		int var2 = var1.readUnsignedByte(); // L: 407
		int var3 = var1.readInt(); // L: 408
		if (var3 < 0 || AbstractArchive.field3599 != 0 && var3 > AbstractArchive.field3599) { // L: 409
			throw new RuntimeException(); // L: 410
		} else if (var2 == 0) { // L: 412
			byte[] var6 = new byte[var3]; // L: 413
			var1.readBytes(var6, 0, var3); // L: 414
			return var6; // L: 415
		} else {
			int var4 = var1.readInt(); // L: 418
			if (var4 >= 0 && (AbstractArchive.field3599 == 0 || var4 <= AbstractArchive.field3599)) { // L: 419
				byte[] var5 = new byte[var4]; // L: 422
				if (var2 == 1) { // L: 423
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5); // L: 424
				}

				return var5; // L: 425
			} else {
				throw new RuntimeException(); // L: 420
			}
		}
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-47"
	)
	static final int method2372() {
		if (class4.clientPreferences.roofsHidden) { // L: 4849
			return SoundSystem.Client_plane;
		} else {
			int var0 = ItemContainer.getTileHeight(ObjectSound.cameraX, Canvas.cameraZ, SoundSystem.Client_plane); // L: 4850
			return var0 - class160.cameraY < 800 && (Tiles.Tiles_renderFlags[SoundSystem.Client_plane][ObjectSound.cameraX >> 7][Canvas.cameraZ >> 7] & 4) != 0 ? SoundSystem.Client_plane : 3; // L: 4851 4852
		}
	}
}
