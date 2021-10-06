import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bs")
@Implements("GraphicsObject")
public class GraphicsObject extends Renderable {
	@ObfuscatedName("tl")
	@ObfuscatedGetter(
		intValue = 1912460385
	)
	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	@Export("pcmPlayerProvider")
	public static class45 pcmPlayerProvider;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1241403237
	)
	@Export("id")
	int id;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1581300753
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -310896907
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1472337471
	)
	@Export("x")
	int x;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -798111629
	)
	@Export("y")
	int y;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1131119735
	)
	@Export("height")
	int height;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1894648295
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 295957163
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("i")
	@Export("isFinished")
	boolean isFinished;

	public GraphicsObject()
	{

	}

	GraphicsObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.frame = 0;
		this.frameCycle = 0;
		this.isFinished = false;
		this.id = var1;
		this.plane = var2;
		this.x = var3;
		this.y = var4;
		this.height = var5;
		this.cycleStart = var7 + var6;
		int var8 = class21.SpotAnimationDefinition_get(this.id).sequence;
		if (var8 != -1) {
			this.isFinished = false;
			this.sequenceDefinition = KitDefinition.SequenceDefinition_get(var8);
		} else {
			this.isFinished = true;
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-35"
	)
	@Export("advance")
	void advance(int var1) {
		if (!this.isFinished) {
			this.frameCycle += var1;

			while (this.frameCycle > this.sequenceDefinition.frameLengths[this.frame]) {
				this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame];
				++this.frame;
				if (this.frame >= this.sequenceDefinition.frameIds.length) {
					this.isFinished = true;
					break;
				}
			}

		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Lhl;",
		garbageValue = "126"
	)
	@Export("getModel")
	protected Model getModel() {
		SpotAnimationDefinition var1 = class21.SpotAnimationDefinition_get(this.id);
		Model var2;
		if (!this.isFinished) {
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1);
		}

		return var2 == null ? null : var2;
	}
}
