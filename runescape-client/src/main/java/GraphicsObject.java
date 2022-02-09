import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
@Implements("GraphicsObject")
public class GraphicsObject extends Renderable {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -262909963
	)
	@Export("id")
	int id;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 599378473
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -627398169
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1998050683
	)
	@Export("x")
	int x;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -608274421
	)
	@Export("y")
	int y;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1971033417
	)
	@Export("height")
	int height;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lgm;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 630808285
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 924799293
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("a")
	@Export("isFinished")
	boolean isFinished;

	GraphicsObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.frame = 0; // L: 16
		this.frameCycle = 0; // L: 17
		this.isFinished = false; // L: 18
		this.id = var1; // L: 21
		this.plane = var2; // L: 22
		this.x = var3;
		this.y = var4;
		this.height = var5;
		this.cycleStart = var7 + var6;
		int var8 = Widget.SpotAnimationDefinition_get(this.id).sequence; // L: 27
		if (var8 != -1) {
			this.isFinished = false;
			this.sequenceDefinition = class78.SequenceDefinition_get(var8);
		} else {
			this.isFinished = true;
		}

	} // L: 33

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "267286155"
	)
	@Export("advance")
	final void advance(int var1) {
		if (!this.isFinished) { // L: 36
			this.frameCycle += var1; // L: 37
			if (!this.sequenceDefinition.method3600()) {
				while (this.frameCycle > this.sequenceDefinition.frameLengths[this.frame]) {
					this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame];
					++this.frame;
					if (this.frame >= this.sequenceDefinition.frameIds.length) { // L: 42
						this.isFinished = true;
						break;
					}
				}
			} else {
				this.frame += var1; // L: 49
				if (this.frame >= this.sequenceDefinition.method3637()) { // L: 50
					this.isFinished = true;
				}
			}

		}
	} // L: 52

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)Lgf;",
		garbageValue = "39"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = Widget.SpotAnimationDefinition_get(this.id); // L: 55
		Model var2;
		if (!this.isFinished) { // L: 57
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1); // L: 58
		}

		return var2 == null ? null : var2; // L: 59
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "562525808"
	)
	@Export("addChatMessage")
	static void addChatMessage(int var0, String var1, String var2, String var3) {
		ChatChannel var4 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 23
		if (var4 == null) { // L: 24
			var4 = new ChatChannel(); // L: 25
			Messages.Messages_channels.put(var0, var4); // L: 26
		}

		Message var5 = var4.addMessage(var0, var1, var2, var3); // L: 28
		Messages.Messages_hashTable.put(var5, (long)var5.count); // L: 29
		Messages.Messages_queue.add(var5); // L: 30
		Client.chatCycle = Client.cycleCntr; // L: 31
	} // L: 32

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Lbl;",
		garbageValue = "73"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = class9.method83(var1, var0); // L: 38
		Script var4 = Projectile.method1969(var3, var0); // L: 39
		if (var4 != null) { // L: 40
			return var4; // L: 41
		} else {
			var3 = BoundaryObject.method4275(var2, var0); // L: 43
			var4 = Projectile.method1969(var3, var0); // L: 44
			return var4 != null ? var4 : null; // L: 45 48
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-534888453"
	)
	public static void method1890() {
		ItemComposition.ItemDefinition_cachedSprites.clear(); // L: 548
	} // L: 549

	public GraphicsObject() {
	}
}
