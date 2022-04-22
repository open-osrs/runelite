import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ac")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("ItemDefinition_archive")
	static AbstractArchive ItemDefinition_archive;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1560740679
	)
	static int field311;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("Widget_spritesArchive")
	static AbstractArchive Widget_spritesArchive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("musicSampleIndex")
	AbstractArchive musicSampleIndex;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("musicSamples")
	NodeHashTable musicSamples;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("rawSounds")
	NodeHashTable rawSounds;

	@ObfuscatedSignature(
		descriptor = "(Lln;Lln;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		this.musicSamples = new NodeHashTable(256); // L: 9
		this.rawSounds = new NodeHashTable(256); // L: 10
		this.soundEffectIndex = var1; // L: 13
		this.musicSampleIndex = var2; // L: 14
	} // L: 15

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II[II)Lat;",
		garbageValue = "-1555701815"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12); // L: 18
		var4 |= var1 << 16; // L: 19
		long var5 = (long)var4; // L: 20
		RawSound var7 = (RawSound)this.rawSounds.get(var5); // L: 21
		if (var7 != null) { // L: 22
			return var7;
		} else if (var3 != null && var3[0] <= 0) { // L: 23
			return null;
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II[II)Lat;",
		garbageValue = "-1329492986"
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

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I[II)Lat;",
		garbageValue = "-1579364603"
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I[IB)Lat;",
		garbageValue = "74"
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "662567928"
	)
	static int method779(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 66
		if (var1 == null) { // L: 67
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count; // L: 68 69
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1695145836"
	)
	static void method768() {
		if (TileItem.loadWorlds()) { // L: 1844
			Login.worldSelectOpen = true; // L: 1845
			Login.worldSelectPage = 0; // L: 1846
			Login.worldSelectPagesCount = 0; // L: 1847
		}

	} // L: 1849

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-2116988411"
	)
	static final int method772(int var0, int var1) {
		if (var0 == -1) { // L: 934
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 935
			if (var1 < 2) { // L: 936
				var1 = 2;
			} else if (var1 > 126) { // L: 937
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 938
		}
	}

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2105059803"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.field746) { // L: 3608
			class273.midiPcmStream.clear(); // L: 3610
			class273.musicPlayerStatus = 1; // L: 3611
			class273.musicTrackArchive = null; // L: 3612
		} else if (var0 != -1 && var0 != Client.currentTrackGroupId && class131.clientPreferences.method2321() != 0 && !Client.field746) { // L: 3615
			NPCComposition.method3530(2, class16.archive6, var0, 0, class131.clientPreferences.method2321(), false); // L: 3616
		}

		Client.currentTrackGroupId = var0; // L: 3618
	} // L: 3619

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1445752455"
	)
	static final boolean method781(int var0) {
		if (var0 < 0) { // L: 8792
			return false;
		} else {
			int var1 = Client.menuOpcodes[var0]; // L: 8793
			if (var1 >= 2000) { // L: 8794
				var1 -= 2000;
			}

			return var1 == 1007; // L: 8795
		}
	}
}
