import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aw")
public class class26 extends class14 {
	@ObfuscatedName("qg")
	@Export("ClanChat_inClanChat")
	static boolean ClanChat_inClanChat;
	@ObfuscatedName("j")
	@Export("SpriteBuffer_yOffsets")
	public static int[] SpriteBuffer_yOffsets;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("archive4")
	static Archive archive4;
	@ObfuscatedName("ow")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static class370 HitSplatDefinition_cachedSprites;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = -6615327962346059687L
	)
	long field212;
	@ObfuscatedName("e")
	String field206;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1300359525
	)
	int field208;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lv;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lv;)V"
	)
	class26(class2 var1) {
		this.this$0 = var1;
		this.field212 = -1L; // L: 93
		this.field206 = null; // L: 94
		this.field208 = 0; // L: 95
	} // L: 97

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "73833784"
	)
	void vmethod363(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 100
			--var1.offset; // L: 101
			this.field212 = var1.readLong(); // L: 102
		}

		this.field206 = var1.readStringCp1252NullTerminatedOrNull(); // L: 104
		this.field208 = var1.readUnsignedShort(); // L: 105
	} // L: 106

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lb;I)V",
		garbageValue = "1885623446"
	)
	void vmethod354(ClanSettings var1) {
		var1.method126(this.field212, this.field206, this.field208); // L: 109
	} // L: 110

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;I)V",
		garbageValue = "-1576725209"
	)
	public static void method344(File var0) {
		FileSystem.FileSystem_cacheDir = var0; // L: 16
		if (!FileSystem.FileSystem_cacheDir.exists()) { // L: 17
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true; // L: 18
		}
	} // L: 19

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1566691777"
	)
	static int method351(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 28
		if (var2 == null) { // L: 29
			return 0;
		} else if (var1 == -1) { // L: 30
			return 0;
		} else {
			int var3 = 0; // L: 31

			for (int var4 = 0; var4 < var2.quantities.length; ++var4) { // L: 32
				if (var2.ids[var4] == var1) {
					var3 += var2.quantities[var4]; // L: 33
				}
			}

			return var3; // L: 35
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2003470705"
	)
	protected static final void method350() {
		class160.clock.mark(); // L: 406

		int var0;
		for (var0 = 0; var0 < 32; ++var0) { // L: 407
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) { // L: 408
			GameEngine.clientTickTimes[var0] = 0L;
		}

		class372.gameCyclesToDo = 0; // L: 409
	} // L: 410

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "46"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[SoundSystem.Client_plane][var0][var1]; // L: 7442
		if (var2 == null) { // L: 7443
			DevicePcmPlayerProvider.scene.removeGroundItemPile(SoundSystem.Client_plane, var0, var1); // L: 7444
		} else {
			long var3 = -99999999L; // L: 7447
			TileItem var5 = null; // L: 7448

			TileItem var6;
			for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 7449 7450 7458
				ItemComposition var7 = class250.ItemDefinition_get(var6.id); // L: 7451
				long var11 = (long)var7.price; // L: 7452
				if (var7.isStackable == 1) { // L: 7453
					var11 *= (long)(var6.quantity + 1);
				}

				if (var11 > var3) { // L: 7454
					var3 = var11; // L: 7455
					var5 = var6; // L: 7456
				}
			}

			if (var5 == null) { // L: 7460
				DevicePcmPlayerProvider.scene.removeGroundItemPile(SoundSystem.Client_plane, var0, var1); // L: 7461
			} else {
				var2.addLast(var5); // L: 7464
				TileItem var13 = null; // L: 7465
				TileItem var8 = null; // L: 7466

				for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 7467 7468 7473
					if (var5.id != var6.id) { // L: 7469
						if (var13 == null) { // L: 7470
							var13 = var6;
						}

						if (var13.id != var6.id && var8 == null) { // L: 7471
							var8 = var6;
						}
					}
				}

				long var9 = UserComparator3.calculateTag(var0, var1, 3, false, 0); // L: 7475
				DevicePcmPlayerProvider.scene.newGroundItemPile(SoundSystem.Client_plane, var0, var1, ItemContainer.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, SoundSystem.Client_plane), var5, var9, var13, var8); // L: 7476
			}
		}
	} // L: 7445 7462 7477
}
