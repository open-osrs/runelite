import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("c")
	@Export("ItemDefinition_inMembersWorld")
	public static boolean ItemDefinition_inMembersWorld;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("musicSampleIndex")
	AbstractArchive musicSampleIndex;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("musicSamples")
	NodeHashTable musicSamples;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("rawSounds")
	NodeHashTable rawSounds;

	@ObfuscatedSignature(
		descriptor = "(Liw;Liw;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		this.musicSamples = new NodeHashTable(256); // L: 9
		this.rawSounds = new NodeHashTable(256); // L: 10
		this.soundEffectIndex = var1; // L: 13
		this.musicSampleIndex = var2; // L: 14
	} // L: 15

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II[II)Ldo;",
		garbageValue = "16776960"
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
				if (var3 != null) { // L: 28
					var3[0] -= var7.samples.length;
				}

				return var7; // L: 29
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II[II)Ldo;",
		garbageValue = "-716229534"
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I[II)Ldo;",
		garbageValue = "-541178737"
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I[II)Ldo;",
		garbageValue = "-1523377894"
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

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "50"
	)
	static final void method2646(int var0) {
		int[] var1 = InterfaceParent.sceneMinimapSprite.pixels; // L: 5674
		int var2 = var1.length; // L: 5675

		int var3;
		for (var3 = 0; var3 < var2; ++var3) { // L: 5676
			var1[var3] = 0;
		}

		int var4;
		int var5;
		for (var3 = 1; var3 < 103; ++var3) { // L: 5677
			var4 = (103 - var3) * 2048 + 24628; // L: 5678

			for (var5 = 1; var5 < 103; ++var5) { // L: 5679
				if ((Tiles.Tiles_renderFlags[var0][var5][var3] & 24) == 0) { // L: 5680
					ModeWhere.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var5][var3] & 8) != 0) { // L: 5681
					ModeWhere.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3);
				}

				var4 += 4; // L: 5682
			}
		}

		var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10); // L: 5685
		var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16; // L: 5686
		InterfaceParent.sceneMinimapSprite.setRaster(); // L: 5687

		int var6;
		for (var5 = 1; var5 < 103; ++var5) { // L: 5688
			for (var6 = 1; var6 < 103; ++var6) { // L: 5689
				if ((Tiles.Tiles_renderFlags[var0][var6][var5] & 24) == 0) { // L: 5690
					Canvas.drawObject(var0, var6, var5, var3, var4);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var6][var5] & 8) != 0) { // L: 5691
					Canvas.drawObject(var0 + 1, var6, var5, var3, var4);
				}
			}
		}

		Client.mapIconCount = 0; // L: 5694

		for (var5 = 0; var5 < 104; ++var5) { // L: 5695
			for (var6 = 0; var6 < 104; ++var6) { // L: 5696
				long var7 = ModeWhere.scene.getFloorDecorationTag(GrandExchangeOfferUnitPriceComparator.Client_plane, var5, var6); // L: 5697
				if (var7 != 0L) { // L: 5698
					int var9 = ObjectSound.Entity_unpackID(var7); // L: 5699
					int var10 = ScriptEvent.getObjectDefinition(var9).mapIconId; // L: 5700
					if (var10 >= 0 && class194.WorldMapElement_get(var10).field3248) { // L: 5701 5702
						Client.mapIcons[Client.mapIconCount] = class194.WorldMapElement_get(var10).getSpriteBool(false); // L: 5705
						Client.mapIconXs[Client.mapIconCount] = var5; // L: 5706
						Client.mapIconYs[Client.mapIconCount] = var6; // L: 5707
						++Client.mapIconCount; // L: 5708
					}
				}
			}
		}

		class22.rasterProvider.apply(); // L: 5713
	} // L: 5714
}
