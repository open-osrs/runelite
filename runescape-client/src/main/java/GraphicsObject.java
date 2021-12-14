import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bs")
@Implements("GraphicsObject")
public class GraphicsObject extends Renderable {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("Widget_spritesArchive")
	static AbstractArchive Widget_spritesArchive;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1199566727
	)
	@Export("id")
	int id;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1643038475
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 575956663
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1504982005
	)
	@Export("x")
	int x;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1721998219
	)
	@Export("y")
	int y;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 826937289
	)
	@Export("height")
	int height;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lgn;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -991958815
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 126754465
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("r")
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
		int var8 = AccessFile.SpotAnimationDefinition_get(this.id).sequence;
		if (var8 != -1) {
			this.isFinished = false;
			this.sequenceDefinition = UserComparator5.SequenceDefinition_get(var8);
		} else {
			this.isFinished = true;
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-41"
	)
	@Export("advance")
	final void advance(int var1) {
		if (!this.isFinished) {
			this.frameCycle += var1;
			if (!this.sequenceDefinition.method3690()) {
				while (this.frameCycle > this.sequenceDefinition.frameLengths[this.frame]) {
					this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame];
					++this.frame;
					if (this.frame >= this.sequenceDefinition.frameIds.length) {
						this.isFinished = true;
						break;
					}
				}
			} else {
				this.frame += var1;
				if (this.frame >= this.sequenceDefinition.method3647()) {
					this.isFinished = true;
				}
			}

		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Lgo;",
		garbageValue = "202861607"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = AccessFile.SpotAnimationDefinition_get(this.id);
		Model var2;
		if (!this.isFinished) {
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1);
		}

		return var2 == null ? null : var2;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1965398967"
	)
	@Export("itemContainerSetItem")
	static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
		ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var4 == null) {
			var4 = new ItemContainer();
			ItemContainer.itemContainers.put(var4, (long)var0);
		}

		if (var4.ids.length <= var1) {
			int[] var5 = new int[var1 + 1];
			int[] var6 = new int[var1 + 1];

			int var7;
			for (var7 = 0; var7 < var4.ids.length; ++var7) {
				var5[var7] = var4.ids[var7];
				var6[var7] = var4.quantities[var7];
			}

			for (var7 = var4.ids.length; var7 < var1; ++var7) {
				var5[var7] = -1;
				var6[var7] = 0;
			}

			var4.ids = var5;
			var4.quantities = var6;
		}

		var4.ids[var1] = var2;
		var4.quantities[var1] = var3;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-76"
	)
	public static void method1956() {
		if (NetCache.NetCache_socket != null) {
			NetCache.NetCache_socket.close();
		}

	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "54739776"
	)
	static final void method1955(int var0) {
		if (class242.loadInterface(var0)) {
			class328.drawModelComponents(MouseRecorder.Widget_interfaceComponents[var0], -1);
		}
	}

	public GraphicsObject() {
	}
}
