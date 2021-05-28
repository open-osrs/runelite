import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
public class class169 implements WorldMapSection {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 398172859
	)
	int field2018;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -829119157
	)
	int field2011;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 2102107219
	)
	int field2012;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -620257867
	)
	int field2016;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1859823215
	)
	int field2014;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -466083281
	)
	int field2015;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -558728135
	)
	int field2010;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -77605471
	)
	int field2017;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 832342515
	)
	int field2013;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -701591619
	)
	int field2019;

	class169() {
	} // L: 18

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lfo;I)V",
		garbageValue = "1120913212"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2014) { // L: 21
			var1.regionLowX = this.field2014;
		}

		if (var1.regionHighX < this.field2014) {
			var1.regionHighX = this.field2014; // L: 22
		}

		if (var1.regionLowY > this.field2015) { // L: 23
			var1.regionLowY = this.field2015;
		}

		if (var1.regionHighY < this.field2015) { // L: 24
			var1.regionHighY = this.field2015;
		}

	} // L: 25

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "264048682"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field2018 && var1 < this.field2018 + this.field2011) { // L: 28
			return var2 >= (this.field2012 << 6) + (this.field2010 << 3) && var2 <= (this.field2012 << 6) + (this.field2010 << 3) + 7 && var3 >= (this.field2016 << 6) + (this.field2017 << 3) && var3 <= (this.field2016 << 6) + (this.field2017 << 3) + 7; // L: 31
		} else {
			return false; // L: 29
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-11"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field2014 << 6) + (this.field2013 << 3) && var1 <= (this.field2014 << 6) + (this.field2013 << 3) + 7 && var2 >= (this.field2015 << 6) + (this.field2019 << 3) && var2 <= (this.field2015 << 6) + (this.field2019 << 3) + 7; // L: 35
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "1943891890"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 39
			return null; // L: 40
		} else {
			int[] var4 = new int[]{var2 + (this.field2014 * 64 - this.field2012 * 64) + (this.field2013 * 8 - this.field2010 * 8), var3 + (this.field2015 * 64 - this.field2016 * 64) + (this.field2019 * 8 - this.field2017 * 8)}; // L: 42 43 44
			return var4; // L: 45
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(III)Lii;",
		garbageValue = "691158162"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 49
			return null; // L: 50
		} else {
			int var3 = this.field2012 * 64 - this.field2014 * 64 + (this.field2010 * 8 - this.field2013 * 8) + var1; // L: 52
			int var4 = var2 + (this.field2016 * 64 - this.field2015 * 64) + (this.field2017 * 8 - this.field2019 * 8); // L: 53
			return new Coord(this.field2018, var3, var4); // L: 54
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-1138667895"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field2018 = var1.readUnsignedByte(); // L: 58
		this.field2011 = var1.readUnsignedByte(); // L: 59
		this.field2012 = var1.readUnsignedShort(); // L: 60
		this.field2010 = var1.readUnsignedByte(); // L: 61
		this.field2016 = var1.readUnsignedShort(); // L: 62
		this.field2017 = var1.readUnsignedByte(); // L: 63
		this.field2014 = var1.readUnsignedShort(); // L: 64
		this.field2013 = var1.readUnsignedByte(); // L: 65
		this.field2015 = var1.readUnsignedShort(); // L: 66
		this.field2019 = var1.readUnsignedByte(); // L: 67
		this.method3529(); // L: 68
	} // L: 69

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-186236256"
	)
	void method3529() {
	} // L: 71

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-309944500"
	)
	static void method3549(int var0, int var1, int var2, int var3) {
		for (ObjectSound var4 = (ObjectSound)ObjectSound.objectSounds.last(); var4 != null; var4 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 99
			if (var4.soundEffectId != -1 || var4.soundEffectIds != null) { // L: 100
				int var5 = 0; // L: 101
				if (var1 > var4.field956) { // L: 102
					var5 += var1 - var4.field956;
				} else if (var1 < var4.x) { // L: 103
					var5 += var4.x - var1;
				}

				if (var2 > var4.field957) { // L: 104
					var5 += var2 - var4.field957;
				} else if (var2 < var4.y) { // L: 105
					var5 += var4.y - var2;
				}

				if (var5 - 64 <= var4.field958 && ObjectComposition.clientPreferences.areaSoundEffectsVolume != 0 && var0 == var4.plane) { // L: 106
					var5 -= 64; // L: 117
					if (var5 < 0) { // L: 118
						var5 = 0;
					}

					int var6 = (var4.field958 - var5) * ObjectComposition.clientPreferences.areaSoundEffectsVolume / var4.field958; // L: 119
					if (var4.stream1 == null) { // L: 120
						if (var4.soundEffectId >= 0) { // L: 121
							SoundEffect var7 = SoundEffect.readSoundEffect(class32.archive4, var4.soundEffectId, 0); // L: 122
							if (var7 != null) { // L: 123
								RawSound var8 = var7.toRawSound().resample(TileItem.decimator); // L: 124
								RawPcmStream var9 = RawPcmStream.createRawPcmStream(var8, 100, var6); // L: 125
								var9.setNumLoops(-1); // L: 126
								class308.pcmStreamMixer.addSubStream(var9); // L: 127
								var4.stream1 = var9; // L: 128
							}
						}
					} else {
						var4.stream1.method845(var6); // L: 132
					}

					if (var4.stream2 == null) { // L: 133
						if (var4.soundEffectIds != null && (var4.field954 -= var3) <= 0) { // L: 134
							int var11 = (int)(Math.random() * (double)var4.soundEffectIds.length); // L: 135
							SoundEffect var12 = SoundEffect.readSoundEffect(class32.archive4, var4.soundEffectIds[var11], 0); // L: 136
							if (var12 != null) { // L: 137
								RawSound var13 = var12.toRawSound().resample(TileItem.decimator); // L: 138
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var13, 100, var6); // L: 139
								var10.setNumLoops(0); // L: 140
								class308.pcmStreamMixer.addSubStream(var10); // L: 141
								var4.stream2 = var10; // L: 142
								var4.field954 = var4.field961 + (int)(Math.random() * (double)(var4.field964 - var4.field961)); // L: 143
							}
						}
					} else {
						var4.stream2.method845(var6); // L: 148
						if (!var4.stream2.hasNext()) { // L: 149
							var4.stream2 = null; // L: 150
						}
					}
				} else {
					if (var4.stream1 != null) { // L: 107
						class308.pcmStreamMixer.removeSubStream(var4.stream1); // L: 108
						var4.stream1 = null; // L: 109
					}

					if (var4.stream2 != null) { // L: 111
						class308.pcmStreamMixer.removeSubStream(var4.stream2); // L: 112
						var4.stream2 = null; // L: 113
					}
				}
			}
		}

	} // L: 154
}
