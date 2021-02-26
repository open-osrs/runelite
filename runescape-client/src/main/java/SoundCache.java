import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dy")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("musicSampleIndex")
	AbstractArchive musicSampleIndex;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("musicSamples")
	NodeHashTable musicSamples;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("rawSounds")
	NodeHashTable rawSounds;

	@ObfuscatedSignature(
		descriptor = "(Lig;Lig;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		this.musicSamples = new NodeHashTable(256); // L: 9
		this.rawSounds = new NodeHashTable(256); // L: 10
		this.soundEffectIndex = var1; // L: 13
		this.musicSampleIndex = var2; // L: 14
	} // L: 15

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II[II)Ldm;",
		garbageValue = "-166733310"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12); // L: 18
		var4 |= var1 << 16; // L: 19
		long var5 = (long)var4; // L: 20
		RawSound var7 = (RawSound)this.rawSounds.get(var5); // L: 21
		if (var7 != null) { // L: 22
			return var7;
		} else if (var3 != null && var3[0] <= 0) {
			return null; // L: 23
		} else {
			SoundEffect var8 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2); // L: 24
			if (var8 == null) { // L: 25
				return null;
			} else {
				var7 = var8.toRawSound(); // L: 26
				this.rawSounds.put(var7, var5); // L: 27
				if (var3 != null) {
					var3[0] -= var7.samples.length; // L: 28
				}

				return var7; // L: 29
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II[IS)Ldm;",
		garbageValue = "-10083"
	)
	@Export("getMusicSample0")
	RawSound getMusicSample0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12); // L: 33
		var4 |= var1 << 16; // L: 34
		long var5 = (long)var4 ^ 4294967296L; // L: 35
		RawSound var7 = (RawSound)this.rawSounds.get(var5); // L: 36
		if (var7 != null) { // L: 37
			return var7;
		} else if (var3 != null && var3[0] <= 0) { // L: 38
			return null;
		} else {
			VorbisSample var8 = (VorbisSample)this.musicSamples.get(var5); // L: 39
			if (var8 == null) { // L: 40
				var8 = VorbisSample.readMusicSample(this.musicSampleIndex, var1, var2); // L: 41
				if (var8 == null) { // L: 42
					return null;
				}

				this.musicSamples.put(var8, var5); // L: 43
			}

			var7 = var8.toRawSound(var3); // L: 45
			if (var7 == null) { // L: 46
				return null;
			} else {
				var8.remove(); // L: 47
				this.rawSounds.put(var7, var5); // L: 48
				return var7; // L: 49
			}
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I[IB)Ldm;",
		garbageValue = "15"
	)
	@Export("getSoundEffect")
	public RawSound getSoundEffect(int var1, int[] var2) {
		if (this.soundEffectIndex.getGroupCount() == 1) { // L: 53
			return this.getSoundEffect0(0, var1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) == 1) {
			return this.getSoundEffect0(var1, 0, var2); // L: 54
		} else {
			throw new RuntimeException(); // L: 55
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I[II)Ldm;",
		garbageValue = "-1589130009"
	)
	@Export("getMusicSample")
	public RawSound getMusicSample(int var1, int[] var2) {
		if (this.musicSampleIndex.getGroupCount() == 1) { // L: 59
			return this.getMusicSample0(0, var1, var2);
		} else if (this.musicSampleIndex.getGroupFileCount(var1) == 1) {
			return this.getMusicSample0(var1, 0, var2); // L: 60
		} else {
			throw new RuntimeException(); // L: 61
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1989438161"
	)
	@Export("inventoryQuantityFormat")
	static final String inventoryQuantityFormat(int var0) {
		if (var0 < 100000) { // L: 413
			return "<col=ffff00>" + var0 + "</col>";
		} else {
			return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + "K" + "</col>" : "<col=00ff80>" + var0 / 1000000 + "M" + "</col>"; // L: 414 415
		}
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(Lcv;II)V",
		garbageValue = "-701578069"
	)
	static final void method2689(Actor var0, int var1) {
		ParamComposition.worldToScreen(var0.x, var0.y, var1); // L: 4879
	} // L: 4880
}
