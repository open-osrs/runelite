import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("a")
public class class7 {
	@ObfuscatedName("tz")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "[Loi;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;
	@ObfuscatedName("go")
	@ObfuscatedGetter(
		intValue = 765932163
	)
	static int field26;
	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "[Loc;"
	)
	@Export("headIconHintSprites")
	static SpritePixels[] headIconHintSprites;
	@ObfuscatedName("n")
	ExecutorService field17;
	@ObfuscatedName("c")
	Future field18;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	final Buffer field19;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lk;"
	)
	final class3 field20;

	@ObfuscatedSignature(
		descriptor = "(Lot;Lk;)V"
	)
	public class7(Buffer var1, class3 var2) {
		this.field17 = Executors.newSingleThreadExecutor();
		this.field19 = var1;
		this.field20 = var2;
		this.method56();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-719473894"
	)
	public boolean method53() {
		return this.field18.isDone();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "108"
	)
	public void method54() {
		this.field17.shutdown();
		this.field17 = null;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Lot;",
		garbageValue = "-213685854"
	)
	public Buffer method61() {
		try {
			return (Buffer)this.field18.get();
		} catch (Exception var2) {
			return null;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1922663133"
	)
	void method56() {
		this.field18 = this.field17.submit(new class1(this, this.field19, this.field20));
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "1975094482"
	)
	@Export("ByteArrayPool_getArray")
	public static synchronized byte[] ByteArrayPool_getArray(int var0) {
		return ByteArrayPool.ByteArrayPool_getArrayBool(var0, false);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIILff;IS)V",
		garbageValue = "6552"
	)
	static void method63(int var0, int var1, int var2, ObjectComposition var3, int var4) {
		ObjectSound var5 = new ObjectSound();
		var5.plane = var0;
		var5.x = var1 * 128;
		var5.y = var2 * 128;
		int var6 = var3.sizeX;
		int var7 = var3.sizeY;
		if (var4 == 1 || var4 == 3) {
			var6 = var3.sizeY;
			var7 = var3.sizeX;
		}

		var5.field806 = (var6 + var1) * 128;
		var5.field801 = (var7 + var2) * 128;
		var5.soundEffectId = var3.ambientSoundId;
		var5.field804 = var3.field1864 * 128;
		var5.field805 = var3.int5;
		var5.field800 = var3.int6;
		var5.soundEffectIds = var3.soundEffectIds;
		if (var3.transforms != null) {
			var5.obj = var3;
			var5.set();
		}

		ObjectSound.objectSounds.addFirst(var5);
		if (var5.soundEffectIds != null) {
			var5.field808 = var5.field805 + (int)(Math.random() * (double)(var5.field800 - var5.field805));
		}

	}
}
