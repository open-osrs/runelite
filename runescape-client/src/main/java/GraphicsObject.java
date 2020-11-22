import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
@Implements("GraphicsObject")
public final class GraphicsObject extends Entity {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 494289481
	)
	@Export("id")
	int id;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -770993721
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 2046486035
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 467633941
	)
	@Export("x")
	int x;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1569589891
	)
	@Export("height")
	int height;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1673763885
	)
	@Export("y")
	int y;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -300375293
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 687860479
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("t")
	@Export("isFinished")
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
		int var8 = HealthBarUpdate.SpotAnimationDefinition_get(this.id).sequence; // L: 27
		if (var8 != -1) { // L: 28
			this.isFinished = false; // L: 29
			this.sequenceDefinition = class105.SequenceDefinition_get(var8); // L: 30
		} else {
			this.isFinished = true; // L: 32
		}

	} // L: 33

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-825901935"
	)
	@Export("advance")
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Leh;",
		garbageValue = "-2070677844"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = HealthBarUpdate.SpotAnimationDefinition_get(this.id); // L: 49
		Model var2;
		if (!this.isFinished) { // L: 51
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1); // L: 52
		}

		return var2 == null ? null : var2; // L: 53
	}

	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1882927898"
	)
	static int method2122() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1909
			int var0 = 0; // L: 1910

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) { // L: 1911
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount; // L: 1912
			}

			return var0 * 10000 / Client.field953; // L: 1914
		} else {
			return 10000;
		}
	}
}
