import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
@Implements("GraphicsObject")
public final class GraphicsObject extends Renderable {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 652996061
	)
	@Export("id")
	int id;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 791668409
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -188159569
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1936566135
	)
	@Export("x")
	int x;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1356555865
	)
	@Export("y")
	int y;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -2049551863
	)
	@Export("height")
	int height;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 938422053
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1003613529
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("q")
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
		int var8 = Friend.SpotAnimationDefinition_get(this.id).sequence; // L: 27
		if (var8 != -1) { // L: 28
			this.isFinished = false; // L: 29
			this.sequenceDefinition = Player.SequenceDefinition_get(var8); // L: 30
		} else {
			this.isFinished = true; // L: 32
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1887073818"
	)
	@Export("advance")
	final void advance(int var1) {
		if (!this.isFinished) {
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Lgj;",
		garbageValue = "-220627570"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = Friend.SpotAnimationDefinition_get(this.id); // L: 49
		Model var2;
		if (!this.isFinished) { // L: 51
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1); // L: 52
		}

		return var2 == null ? null : var2; // L: 53
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lmo;III)I",
		garbageValue = "-1747152974"
	)
	static int method1937(IterableNodeHashTable var0, int var1, int var2) {
		if (var0 == null) { // L: 33
			return var2;
		} else {
			IntegerNode var3 = (IntegerNode)var0.get((long)var1); // L: 34
			return var3 == null ? var2 : var3.integer; // L: 35 36
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)Lof;",
		garbageValue = "104"
	)
	static IndexedSprite method1938() {
		IndexedSprite var0 = new IndexedSprite(); // L: 165
		var0.width = class396.SpriteBuffer_spriteWidth; // L: 166
		var0.height = class396.SpriteBuffer_spriteHeight; // L: 167
		var0.xOffset = class243.SpriteBuffer_xOffsets[0]; // L: 168
		var0.yOffset = class396.SpriteBuffer_yOffsets[0]; // L: 169
		var0.subWidth = ArchiveDiskActionHandler.SpriteBuffer_spriteWidths[0]; // L: 170
		var0.subHeight = class372.SpriteBuffer_spriteHeights[0]; // L: 171
		var0.palette = AccessFile.SpriteBuffer_spritePalette; // L: 172
		var0.pixels = class396.SpriteBuffer_pixels[0]; // L: 173
		class243.SpriteBuffer_xOffsets = null; // L: 175
		class396.SpriteBuffer_yOffsets = null; // L: 176
		ArchiveDiskActionHandler.SpriteBuffer_spriteWidths = null; // L: 177
		class372.SpriteBuffer_spriteHeights = null; // L: 178
		AccessFile.SpriteBuffer_spritePalette = null; // L: 179
		class396.SpriteBuffer_pixels = null; // L: 180
		return var0; // L: 182
	}
}
