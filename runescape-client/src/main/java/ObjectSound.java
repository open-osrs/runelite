import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("oz")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	static class339 field935;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1117134453
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1380268011
	)
	@Export("x")
	int x;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 381586537
	)
	@Export("y")
	int y;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 858005117
	)
	int field926;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 2023231639
	)
	int field927;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 260916973
	)
	int field929;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -226676411
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lbk;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 378956141
	)
	int field934;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -848976241
	)
	int field932;
	@ObfuscatedName("x")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1700564665
	)
	int field923;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	@Export("obj")
	ObjectComposition obj;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lbk;"
	)
	@Export("stream2")
	RawPcmStream stream2;

	static {
		objectSounds = new NodeDeque(); // L: 11
	}

	ObjectSound() {
	} // L: 27

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-89"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId; // L: 30
		ObjectComposition var2 = this.obj.transform(); // L: 31
		if (var2 != null) { // L: 32
			this.soundEffectId = var2.ambientSoundId; // L: 33
			this.field929 = var2.int4 * 128; // L: 34
			this.field934 = var2.int5; // L: 35
			this.field932 = var2.int6; // L: 36
			this.soundEffectIds = var2.soundEffectIds; // L: 37
		} else {
			this.soundEffectId = -1; // L: 40
			this.field929 = 0; // L: 41
			this.field934 = 0; // L: 42
			this.field932 = 0; // L: 43
			this.soundEffectIds = null; // L: 44
		}

		if (var1 != this.soundEffectId && this.stream1 != null) { // L: 46
			FloorOverlayDefinition.pcmStreamMixer.removeSubStream(this.stream1); // L: 47
			this.stream1 = null; // L: 48
		}

	} // L: 50

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "1381719532"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 381
		int var2 = var1.readUnsignedByte(); // L: 382
		int var3 = var1.readInt(); // L: 383
		if (var3 < 0 || AbstractArchive.field3611 != 0 && var3 > AbstractArchive.field3611) { // L: 384
			throw new RuntimeException(); // L: 385
		} else if (var2 == 0) { // L: 387
			byte[] var6 = new byte[var3]; // L: 388
			var1.readBytes(var6, 0, var3); // L: 389
			return var6; // L: 390
		} else {
			int var4 = var1.readInt(); // L: 393
			if (var4 >= 0 && (AbstractArchive.field3611 == 0 || var4 <= AbstractArchive.field3611)) { // L: 394
				byte[] var5 = new byte[var4]; // L: 397
				if (var2 == 1) { // L: 398
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5); // L: 399
				}

				return var5; // L: 400
			} else {
				throw new RuntimeException(); // L: 395
			}
		}
	}
}
