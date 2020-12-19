import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
@Implements("GraphicsObject")
public final class GraphicsObject extends Entity {
	@ObfuscatedName("a")
	public static String[] field1117;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1733253917
	)
	@Export("id")
	int id;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -561629891
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 843078799
	)
	@Export("y")
	int y;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -391213595
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1438235689
	)
	@Export("x")
	int x;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 697288519
	)
	@Export("height")
	int height;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -737281837
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -2023288775
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("z")
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
		int var8 = TileItem.SpotAnimationDefinition_get(this.id).sequence; // L: 27
		if (var8 != -1) { // L: 28
			this.isFinished = false; // L: 29
			this.sequenceDefinition = ParamDefinition.SequenceDefinition_get(var8); // L: 30
		} else {
			this.isFinished = true; // L: 32
		}

	} // L: 33

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1007700617"
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Leh;",
		garbageValue = "-1814248977"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = TileItem.SpotAnimationDefinition_get(this.id); // L: 49
		Model var2;
		if (!this.isFinished) { // L: 51
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1); // L: 52
		}

		return var2 == null ? null : var2; // L: 53
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "14"
	)
	public static void method2090() {
		synchronized(KeyHandler.KeyHandler_instance) { // L: 164
			++KeyHandler.KeyHandler_idleCycles; // L: 165
			KeyHandler.field415 = KeyHandler.field417; // L: 166
			KeyHandler.field414 = 0; // L: 167
			int var1;
			if (KeyHandler.field410 < 0) { // L: 168
				for (var1 = 0; var1 < 112; ++var1) { // L: 169
					KeyHandler.KeyHandler_pressedKeys[var1] = false;
				}

				KeyHandler.field410 = KeyHandler.field401; // L: 170
			} else {
				while (KeyHandler.field401 != KeyHandler.field410) { // L: 173
					var1 = KeyHandler.field408[KeyHandler.field401]; // L: 174
					KeyHandler.field401 = KeyHandler.field401 + 1 & 127; // L: 175
					if (var1 < 0) { // L: 176
						KeyHandler.KeyHandler_pressedKeys[~var1] = false;
					} else {
						if (!KeyHandler.KeyHandler_pressedKeys[var1] && KeyHandler.field414 < KeyHandler.field413.length - 1) { // L: 178
							KeyHandler.field413[++KeyHandler.field414 - 1] = var1; // L: 179
						}

						KeyHandler.KeyHandler_pressedKeys[var1] = true; // L: 181
					}
				}
			}

			if (KeyHandler.field414 > 0) { // L: 185
				KeyHandler.KeyHandler_idleCycles = 0;
			}

			KeyHandler.field417 = KeyHandler.field419; // L: 186
		}
	} // L: 188
}
