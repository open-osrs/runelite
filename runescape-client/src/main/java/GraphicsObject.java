import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
@Implements("GraphicsObject")
public final class GraphicsObject extends Entity {
	@ObfuscatedName("si")
	@ObfuscatedGetter(
		longValue = 4282492011964986707L
	)
	static long field1139;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("archive10")
	static Archive archive10;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 555151267
	)
	@Export("id")
	int id;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 953571075
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 35157473
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1616692737
	)
	@Export("x")
	int x;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -2135993151
	)
	@Export("y")
	int y;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1585173771
	)
	@Export("height")
	int height;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1643713967
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1415873335
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("z")
	@Export("isFinished")
	boolean isFinished;

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
		int var8 = class4.SpotAnimationDefinition_get(this.id).sequence;
		if (var8 != -1) {
			this.isFinished = false;
			this.sequenceDefinition = NetSocket.SequenceDefinition_get(var8);
		} else {
			this.isFinished = true;
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1084299452"
	)
	@Export("advance")
	final void advance(int var1) {
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

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Lef;",
		garbageValue = "1832696685"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = class4.SpotAnimationDefinition_get(this.id);
		Model var2;
		if (!this.isFinished) {
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1);
		}

		return var2 == null ? null : var2;
	}
}
