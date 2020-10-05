import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cm")
@Implements("GraphicsObject")
public final class GraphicsObject extends Entity {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1326465881
	)
	int height;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1027327973
	)
	int id;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1536729399
	)
	int cycleStart;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1152665819
	)
	int plane;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1500063053
	)
	int x;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1460229241
	)
	int y;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1933421917
	)
	int frame;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1610487487
	)
	int frameCycle;
	@ObfuscatedName("m")
	boolean isFinished;

	GraphicsObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.frame = 0; // L: 16
		this.frameCycle = 0; // L: 17
		this.isFinished = false; // L: 18
		this.id = var1; // L: 21
		this.plane = var2; // L: 22
		this.x = var3; // L: 23
		this.y = var4; // L: 24
		this.height = var5; // L: 25
		this.cycleStart = var7 + var6; // L: 26
		int var8 = Tiles.SpotAnimationDefinition_get(this.id).sequence; // L: 27
		if (var8 != -1) { // L: 28
			this.isFinished = false; // L: 29
			this.sequenceDefinition = WorldMapRegion.SequenceDefinition_get(var8); // L: 30
		} else {
			this.isFinished = true; // L: 32
		}

	} // L: 33

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1653124671"
	)
	final void advance(int var1) {
		if (!this.isFinished) { // L: 36
			this.frameCycle += var1; // L: 37

			while (this.frameCycle > this.sequenceDefinition.frameLengths[this.frame]) { // L: 38
				this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame]; // L: 39
				++this.frame; // L: 40
				if (this.frame >= this.sequenceDefinition.frameIds.length) { // L: 41
					this.isFinished = true; // L: 42
					break;
				}
			}

		}
	} // L: 46

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Ler;",
		garbageValue = "-2026237468"
	)
	protected final Model getModel() {
		SpotAnimationDefinition var1 = Tiles.SpotAnimationDefinition_get(this.id); // L: 49
		Model var2;
		if (!this.isFinished) { // L: 51
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1); // L: 52
		}

		return var2 == null ? null : var2; // L: 53
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "104"
	)
	static void method2091() {
		try {
			File var0 = new File(UserComparator2.userHomeDirectory, "random.dat"); // L: 283
			int var2;
			if (var0.exists()) { // L: 284
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0); // L: 285
			} else {
				label38:
				for (int var1 = 0; var1 < class69.field570.length; ++var1) { // L: 288
					for (var2 = 0; var2 < UserComparator4.field2005.length; ++var2) { // L: 289
						File var3 = new File(UserComparator4.field2005[var2] + class69.field570[var1] + File.separatorChar + "random.dat"); // L: 290
						if (var3.exists()) { // L: 291
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var3, "rw", 25L), 24, 0); // L: 292
							break label38; // L: 293
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) { // L: 298
				RandomAccessFile var4 = new RandomAccessFile(var0, "rw"); // L: 299
				var2 = var4.read(); // L: 300
				var4.seek(0L); // L: 301
				var4.write(var2); // L: 302
				var4.seek(0L); // L: 303
				var4.close(); // L: 304
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0); // L: 305
			}
		} catch (IOException var5) { // L: 308
		}

	} // L: 309

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1643627841"
	)
	public static void method2095() {
		try {
			if (class206.musicPlayerStatus == 1) { // L: 65
				int var0 = class206.midiPcmStream.method3806(); // L: 66
				if (var0 > 0 && class206.midiPcmStream.isReady()) { // L: 67
					var0 -= FaceNormal.pcmSampleLength; // L: 68
					if (var0 < 0) { // L: 69
						var0 = 0;
					}

					class206.midiPcmStream.setPcmStreamVolume(var0); // L: 70
					return; // L: 71
				}

				class206.midiPcmStream.clear(); // L: 73
				class206.midiPcmStream.removeAll(); // L: 74
				if (class204.musicTrackArchive != null) { // L: 75
					class206.musicPlayerStatus = 2;
				} else {
					class206.musicPlayerStatus = 0; // L: 76
				}

				class206.musicTrack = null; // L: 77
				class39.soundCache = null; // L: 78
			}
		} catch (Exception var2) { // L: 81
			var2.printStackTrace(); // L: 82
			class206.midiPcmStream.clear(); // L: 83
			class206.musicPlayerStatus = 0; // L: 84
			class206.musicTrack = null; // L: 85
			class39.soundCache = null; // L: 86
			class204.musicTrackArchive = null; // L: 87
		}

	} // L: 89
}
