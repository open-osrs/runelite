import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bc")
@Implements("World")
public class World {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -287203745
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -886714627
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("v")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("b")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	@Export("World_request")
	static UrlRequest World_request;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1193469645
	)
	@Export("id")
	int id;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1795384885
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1923976783
	)
	@Export("population")
	int population;
	@ObfuscatedName("r")
	@Export("host")
	String host;
	@ObfuscatedName("p")
	@Export("activity")
	String activity;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1414521915
	)
	@Export("location")
	int location;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -2013336123
	)
	@Export("index")
	int index;

	static {
		World_count = 0; // L: 14
		World_listCount = 0; // L: 15
		World_sortOption2 = new int[]{1, 1, 1, 1}; // L: 16
		World_sortOption1 = new int[]{0, 1, 2, 3}; // L: 17
	}

	World() {
	} // L: 27

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-8093"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (1 & this.properties) != 0; // L: 247
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1692154963"
	)
	boolean method1722() {
		return (2 & this.properties) != 0; // L: 251
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1903102242"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (4 & this.properties) != 0; // L: 255
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1999947926"
	)
	boolean method1686() {
		return (8 & this.properties) != 0; // L: 259
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-399759618"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (536870912 & this.properties) != 0; // L: 263
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1001248152"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (33554432 & this.properties) != 0; // L: 267
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "8"
	)
	boolean method1689() {
		return (1073741824 & this.properties) != 0; // L: 271
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "1"
	)
	static void method1728(int var0, int var1, int var2, int var3) {
		for (ObjectSound var4 = (ObjectSound)ObjectSound.objectSounds.last(); var4 != null; var4 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 53
			if (var4.soundEffectId != -1 || var4.soundEffectIds != null) { // L: 54
				int var5 = 0; // L: 55
				if (var1 > var4.field926) { // L: 56
					var5 += var1 - var4.field926;
				} else if (var1 < var4.x) { // L: 57
					var5 += var4.x - var1;
				}

				if (var2 > var4.field927) { // L: 58
					var5 += var2 - var4.field927;
				} else if (var2 < var4.y) { // L: 59
					var5 += var4.y - var2;
				}

				if (var5 - 64 <= var4.field929 && class12.clientPreferences.areaSoundEffectsVolume != 0 && var0 == var4.plane) { // L: 60
					var5 -= 64; // L: 71
					if (var5 < 0) { // L: 72
						var5 = 0;
					}

					int var6 = (var4.field929 - var5) * class12.clientPreferences.areaSoundEffectsVolume / var4.field929; // L: 73
					if (var4.stream1 == null) { // L: 74
						if (var4.soundEffectId >= 0) { // L: 75
							SoundEffect var7 = SoundEffect.readSoundEffect(class14.archive4, var4.soundEffectId, 0); // L: 76
							if (var7 != null) { // L: 77
								RawSound var8 = var7.toRawSound().resample(class3.decimator); // L: 78
								RawPcmStream var9 = RawPcmStream.createRawPcmStream(var8, 100, var6); // L: 79
								var9.setNumLoops(-1); // L: 80
								FloorOverlayDefinition.pcmStreamMixer.addSubStream(var9); // L: 81
								var4.stream1 = var9; // L: 82
							}
						}
					} else {
						var4.stream1.method888(var6); // L: 86
					}

					if (var4.stream2 == null) { // L: 87
						if (var4.soundEffectIds != null && (var4.field923 -= var3) <= 0) { // L: 88
							int var11 = (int)(Math.random() * (double)var4.soundEffectIds.length); // L: 89
							SoundEffect var12 = SoundEffect.readSoundEffect(class14.archive4, var4.soundEffectIds[var11], 0); // L: 90
							if (var12 != null) { // L: 91
								RawSound var13 = var12.toRawSound().resample(class3.decimator); // L: 92
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var13, 100, var6); // L: 93
								var10.setNumLoops(0); // L: 94
								FloorOverlayDefinition.pcmStreamMixer.addSubStream(var10); // L: 95
								var4.stream2 = var10; // L: 96
								var4.field923 = var4.field934 + (int)(Math.random() * (double)(var4.field932 - var4.field934)); // L: 97
							}
						}
					} else {
						var4.stream2.method888(var6); // L: 102
						if (!var4.stream2.hasNext()) { // L: 103
							var4.stream2 = null; // L: 104
						}
					}
				} else {
					if (var4.stream1 != null) { // L: 61
						FloorOverlayDefinition.pcmStreamMixer.removeSubStream(var4.stream1); // L: 62
						var4.stream1 = null; // L: 63
					}

					if (var4.stream2 != null) { // L: 65
						FloorOverlayDefinition.pcmStreamMixer.removeSubStream(var4.stream2); // L: 66
						var4.stream2 = null; // L: 67
					}
				}
			}
		}

	} // L: 108

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljp;IIIZI)V",
		garbageValue = "1369105170"
	)
	public static void method1684(AbstractArchive var0, int var1, int var2, int var3, boolean var4) {
		class232.musicPlayerStatus = 1; // L: 40
		JagexCache.musicTrackArchive = var0; // L: 41
		class232.musicTrackGroupId = var1; // L: 42
		class232.musicTrackFileId = var2; // L: 43
		LoginPacket.musicTrackVolume = var3; // L: 44
		VarpDefinition.musicTrackBoolean = var4; // L: 45
		class232.pcmSampleLength = 10000; // L: 46
	} // L: 47

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZI)I",
		garbageValue = "306511777"
	)
	static int method1713(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) { // L: 1810
			WorldMapCacheName.Interpreter_intStackSize -= 3; // L: 1811
			class69.queueSoundEffect(Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize], Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 2]); // L: 1812
			return 1; // L: 1813
		} else if (var0 == ScriptOpcodes.SOUND_SONG) { // L: 1815
			FontName.playSong(Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]); // L: 1816
			return 1; // L: 1817
		} else if (var0 == ScriptOpcodes.SOUND_JINGLE) { // L: 1819
			WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 1820
			class311.method5486(Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize], Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]); // L: 1821
			return 1; // L: 1822
		} else {
			int var3;
			if (var0 == 3203) { // L: 1824
				var3 = Math.min(Math.max(Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize], 0), 100); // L: 1825
				class23.method306(Math.round(2.55F * (float)var3)); // L: 1826
				return 1; // L: 1827
			} else if (var0 == 3204) { // L: 1829
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Math.round((float)class12.clientPreferences.musicVolume / 2.55F); // L: 1830
				return 1; // L: 1831
			} else if (var0 == 3205) { // L: 1833
				var3 = Math.min(Math.max(Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize], 0), 100); // L: 1834
				class20.updateSoundEffectVolume(Math.round((float)var3 * 1.27F)); // L: 1835
				return 1; // L: 1836
			} else if (var0 == 3206) { // L: 1838
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Math.round((float)class12.clientPreferences.soundEffectsVolume / 1.27F); // L: 1839
				return 1; // L: 1840
			} else if (var0 == 3207) { // L: 1842
				var3 = Math.min(Math.max(Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize], 0), 100); // L: 1843
				Occluder.method4088(Math.round(1.27F * (float)var3)); // L: 1844
				return 1; // L: 1845
			} else if (var0 == 3208) { // L: 1847
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Math.round((float)class12.clientPreferences.areaSoundEffectsVolume / 1.27F); // L: 1848
				return 1; // L: 1849
			} else {
				return 2; // L: 1851
			}
		}
	}

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(Liv;I)Liv;",
		garbageValue = "-1947834223"
	)
	static Widget method1731(Widget var0) {
		Widget var1 = HorizontalAlignment.method2731(var0); // L: 11104
		if (var1 == null) {
			var1 = var0.parent; // L: 11105
		}

		return var1; // L: 11106
	}
}
