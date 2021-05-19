import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
@Implements("SpotAnimationDefinition")
public class SpotAnimationDefinition extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("SpotAnimationDefinition_archive")
	static AbstractArchive SpotAnimationDefinition_archive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("SpotAnimationDefinition_modelArchive")
	static AbstractArchive SpotAnimationDefinition_modelArchive;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("SpotAnimationDefinition_cached")
	static EvictingDualNodeHashTable SpotAnimationDefinition_cached;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("SpotAnimationDefinition_cachedModels")
	static EvictingDualNodeHashTable SpotAnimationDefinition_cachedModels;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 380385743
	)
	@Export("id")
	int id;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 130190351
	)
	@Export("archive")
	int archive;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 507083685
	)
	@Export("sequence")
	public int sequence;
	@ObfuscatedName("v")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("b")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("q")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("i")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -118030919
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1475991545
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -170389419
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 97378291
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1756548977
	)
	@Export("contrast")
	int contrast;

	static {
		SpotAnimationDefinition_cached = new EvictingDualNodeHashTable(64); // L: 14
		SpotAnimationDefinition_cachedModels = new EvictingDualNodeHashTable(30); // L: 15
	}

	SpotAnimationDefinition() {
		this.sequence = -1; // L: 18
		this.widthScale = 128; // L: 23
		this.heightScale = 128; // L: 24
		this.orientation = 0; // L: 25
		this.ambient = 0; // L: 26
		this.contrast = 0; // L: 27
	} // L: 29

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnk;B)V",
		garbageValue = "-108"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 49
			if (var2 == 0) { // L: 50
				return; // L: 53
			}

			this.decodeNext(var1, var2); // L: 51
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lnk;II)V",
		garbageValue = "-113504660"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 56
			this.archive = var1.readUnsignedShort();
		} else if (var2 == 2) { // L: 57
			this.sequence = var1.readUnsignedShort();
		} else if (var2 == 4) { // L: 58
			this.widthScale = var1.readUnsignedShort();
		} else if (var2 == 5) { // L: 59
			this.heightScale = var1.readUnsignedShort();
		} else if (var2 == 6) { // L: 60
			this.orientation = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 61
			this.ambient = var1.readUnsignedByte();
		} else if (var2 == 8) { // L: 62
			this.contrast = var1.readUnsignedByte();
		} else {
			int var3;
			int var4;
			if (var2 == 40) { // L: 63
				var3 = var1.readUnsignedByte(); // L: 64
				this.recolorFrom = new short[var3]; // L: 65
				this.recolorTo = new short[var3]; // L: 66

				for (var4 = 0; var4 < var3; ++var4) { // L: 67
					this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 68
					this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 69
				}
			} else if (var2 == 41) { // L: 72
				var3 = var1.readUnsignedByte(); // L: 73
				this.retextureFrom = new short[var3]; // L: 74
				this.retextureTo = new short[var3]; // L: 75

				for (var4 = 0; var4 < var3; ++var4) { // L: 76
					this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 77
					this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 78
				}
			}
		}

	} // L: 82

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgj;",
		garbageValue = "11"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		Model var2 = (Model)SpotAnimationDefinition_cachedModels.get((long)this.id); // L: 85
		if (var2 == null) { // L: 86
			ModelData var3 = ModelData.ModelData_get(SpotAnimationDefinition_modelArchive, this.archive, 0); // L: 87
			if (var3 == null) { // L: 88
				return null;
			}

			int var4;
			if (this.recolorFrom != null) { // L: 89
				for (var4 = 0; var4 < this.recolorFrom.length; ++var4) { // L: 90
					var3.recolor(this.recolorFrom[var4], this.recolorTo[var4]); // L: 91
				}
			}

			if (this.retextureFrom != null) { // L: 94
				for (var4 = 0; var4 < this.retextureFrom.length; ++var4) { // L: 95
					var3.retexture(this.retextureFrom[var4], this.retextureTo[var4]); // L: 96
				}
			}

			var2 = var3.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30); // L: 99
			SpotAnimationDefinition_cachedModels.put(var2, (long)this.id); // L: 100
		}

		Model var5;
		if (this.sequence != -1 && var1 != -1) { // L: 103
			var5 = Player.SequenceDefinition_get(this.sequence).transformSpotAnimationModel(var2, var1);
		} else {
			var5 = var2.toSharedSpotAnimationModel(true); // L: 104
		}

		if (this.widthScale != 128 || this.heightScale != 128) { // L: 105
			var5.scale(this.widthScale, this.heightScale, this.widthScale);
		}

		if (this.orientation != 0) { // L: 106
			if (this.orientation == 90) { // L: 107
				var5.rotateY90Ccw();
			}

			if (this.orientation == 180) { // L: 108
				var5.rotateY90Ccw(); // L: 109
				var5.rotateY90Ccw(); // L: 110
			}

			if (this.orientation == 270) { // L: 112
				var5.rotateY90Ccw(); // L: 113
				var5.rotateY90Ccw(); // L: 114
				var5.rotateY90Ccw(); // L: 115
			}
		}

		return var5; // L: 118
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "18"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0; // L: 539
		if (class266.garbageCollector == null || !class266.garbageCollector.isValid()) { // L: 540
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator(); // L: 542

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next(); // L: 543
					if (var2.isValid()) { // L: 545
						class266.garbageCollector = var2; // L: 546
						GameEngine.garbageCollectorLastCheckTimeMs = -1L; // L: 547
						GameEngine.garbageCollectorLastCollectionTime = -1L; // L: 548
					}
				}
			} catch (Throwable var11) { // L: 553
			}
		}

		if (class266.garbageCollector != null) { // L: 555
			long var9 = Archive.currentTimeMillis(); // L: 556
			long var3 = class266.garbageCollector.getCollectionTime(); // L: 557
			if (GameEngine.garbageCollectorLastCollectionTime != -1L) { // L: 558
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime; // L: 559
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs; // L: 560
				if (0L != var7) { // L: 561
					var0 = (int)(100L * var5 / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3; // L: 563
			GameEngine.garbageCollectorLastCheckTimeMs = var9; // L: 564
		}

		return var0; // L: 566
	}
}
