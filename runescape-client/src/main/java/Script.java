import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
public class Script extends DualNode {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = 1391677451
	)
	static int selectedItemId;
	@ObfuscatedName("k")
	int[] opcodes;
	@ObfuscatedName("s")
	int[] intOperands;
	@ObfuscatedName("t")
	String[] stringOperands;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1204485325
	)
	int localIntCount;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1685131019
	)
	int localStringCount;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1488258005
	)
	int intArgumentCount;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 395196509
	)
	int stringArgumentCount;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "[Llq;"
	)
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128); // L: 12
	}

	Script() {
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)[Llq;",
		garbageValue = "-502401324"
	)
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1]; // L: 153
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lby;B)V",
		garbageValue = "-76"
	)
	public static void runScriptEvent(ScriptEvent var0) {
		class280.runScript(var0, 500000); // L: 97
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IB)Lib;",
		garbageValue = "-77"
	)
	public static VarcInt method2324(int var0) {
		VarcInt var1 = (VarcInt)VarcInt.VarcInt_cached.get((long)var0); // L: 17
		if (var1 != null) { // L: 18
			return var1;
		} else {
			byte[] var2 = VarcInt.VarcInt_archive.takeFile(19, var0);
			var1 = new VarcInt();
			if (var2 != null) { // L: 21
				var1.method4488(new Buffer(var2));
			}

			VarcInt.VarcInt_cached.put(var1, (long)var0); // L: 22
			return var1; // L: 23
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lic;I)V",
		garbageValue = "-1494987066"
	)
	public static void method2325(AbstractArchive var0) {
		StructDefinition.StructDefinition_archive = var0; // L: 19
	} // L: 20

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;ZB)[B",
		garbageValue = "15"
	)
	public static byte[] method2323(Object var0, boolean var1) {
		if (var0 == null) { // L: 30
			return null;
		} else if (var0 instanceof byte[]) { // L: 31
			byte[] var6 = (byte[])((byte[])var0); // L: 32
			if (var1) { // L: 33
				int var4 = var6.length;
				byte[] var5 = new byte[var4];
				System.arraycopy(var6, 0, var5, 0, var4);
				return var5;
			} else {
				return var6; // L: 43
			}
		} else if (var0 instanceof AbstractByteArrayCopier) { // L: 45
			AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0; // L: 46
			return var2.get(); // L: 47
		} else {
			throw new IllegalArgumentException(); // L: 49
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lic;IIIZI)V",
		garbageValue = "1897584620"
	)
	public static void method2322(AbstractArchive var0, int var1, int var2, int var3, boolean var4) {
		class206.musicPlayerStatus = 1; // L: 34
		class204.musicTrackArchive = var0; // L: 35
		BuddyRankComparator.musicTrackGroupId = var1; // L: 36
		class206.musicTrackFileId = var2; // L: 37
		Tiles.musicTrackVolume = var3; // L: 38
		class206.musicTrackBoolean = var4; // L: 39
		FaceNormal.pcmSampleLength = 10000; // L: 40
	} // L: 41

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "934802837"
	)
	public static boolean method2326() {
		try {
			if (class206.musicPlayerStatus == 2) { // L: 93
				if (class206.musicTrack == null) { // L: 94
					class206.musicTrack = MusicTrack.readTrack(class204.musicTrackArchive, BuddyRankComparator.musicTrackGroupId, class206.musicTrackFileId); // L: 95
					if (class206.musicTrack == null) { // L: 96
						return false;
					}
				}

				if (class39.soundCache == null) { // L: 98
					class39.soundCache = new SoundCache(ModelData0.soundEffectsArchive, class206.musicSamplesArchive);
				}

				if (class206.midiPcmStream.loadMusicTrack(class206.musicTrack, class206.musicPatchesArchive, class39.soundCache, 22050)) { // L: 99
					class206.midiPcmStream.clearAll(); // L: 100
					class206.midiPcmStream.setPcmStreamVolume(Tiles.musicTrackVolume); // L: 101
					class206.midiPcmStream.setMusicTrack(class206.musicTrack, class206.musicTrackBoolean); // L: 102
					class206.musicPlayerStatus = 0; // L: 103
					class206.musicTrack = null; // L: 104
					class39.soundCache = null; // L: 105
					class204.musicTrackArchive = null; // L: 106
					return true; // L: 107
				}
			}
		} catch (Exception var1) { // L: 111
			var1.printStackTrace(); // L: 112
			class206.midiPcmStream.clear(); // L: 113
			class206.musicPlayerStatus = 0; // L: 114
			class206.musicTrack = null; // L: 115
			class39.soundCache = null; // L: 116
			class204.musicTrackArchive = null; // L: 117
		}

		return false; // L: 119
	}
}
