import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
	@ObfuscatedName("o")
	@Export("musicTrackBoolean")
	public static boolean musicTrackBoolean;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1712801751
	)
	@Export("id")
	int id;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 2015197805
	)
	@Export("type")
	int type;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1555173169
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -393716715
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -332192069
	)
	@Export("x")
	int x;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1639785979
	)
	@Export("y")
	int y;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lgn;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -724114563
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 343705565
	)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		descriptor = "(IIIIIIIZLgt;)V"
	)
	DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Renderable var9) {
		this.id = var1;
		this.type = var2;
		this.orientation = var3;
		this.plane = var4;
		this.x = var5;
		this.y = var6;
		if (var7 != -1) {
			this.sequenceDefinition = UserComparator5.SequenceDefinition_get(var7);
			this.frame = 0;
			this.cycleStart = Client.cycle - 1;
			if (this.sequenceDefinition.field2078 == 0 && var9 != null && var9 instanceof DynamicObject) {
				DynamicObject var10 = (DynamicObject)var9;
				if (this.sequenceDefinition == var10.sequenceDefinition) {
					this.frame = var10.frame;
					this.cycleStart = var10.cycleStart;
					return;
				}
			}

			if (var8 && this.sequenceDefinition.frameCount != -1) {
				if (!this.sequenceDefinition.method3690()) {
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.frameIds.length);
					this.cycleStart -= (int)(Math.random() * (double)this.sequenceDefinition.frameLengths[this.frame]);
				} else {
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.method3647());
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
		int var2;
		if (this.sequenceDefinition != null) {
			int var1 = Client.cycle - this.cycleStart;
			if (var1 > 100 && this.sequenceDefinition.frameCount > 0) {
				var1 = 100;
			}

			if (this.sequenceDefinition.method3690()) {
				var2 = this.sequenceDefinition.method3647();
				this.frame += var1;
				var1 = 0;
				if (this.frame >= var2) {
					this.frame = var2 - this.sequenceDefinition.frameCount;
					if (this.frame < 0 || this.frame > var2) {
						this.sequenceDefinition = null;
					}
				}
			} else {
				label79: {
					do {
						do {
							if (var1 <= this.sequenceDefinition.frameLengths[this.frame]) {
								break label79;
							}

							var1 -= this.sequenceDefinition.frameLengths[this.frame];
							++this.frame;
						} while(this.frame < this.sequenceDefinition.frameIds.length);

						this.frame -= this.sequenceDefinition.frameCount;
					} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length);

					this.sequenceDefinition = null;
				}
			}

			this.cycleStart = Client.cycle - var1;
		}

		ObjectComposition var12 = class148.getObjectDefinition(this.id);
		if (var12.transforms != null) {
			var12 = var12.transform();
		}

		if (var12 == null) {
			return null;
		} else {
			int var3;
			if (this.orientation != 1 && this.orientation != 3) {
				var2 = var12.sizeX;
				var3 = var12.sizeY;
			} else {
				var2 = var12.sizeY;
				var3 = var12.sizeX;
			}

			int var4 = (var2 >> 1) + this.x;
			int var5 = (var2 + 1 >> 1) + this.x;
			int var6 = (var3 >> 1) + this.y;
			int var7 = (var3 + 1 >> 1) + this.y;
			int[][] var8 = Tiles.Tiles_heights[this.plane];
			int var9 = var8[var4][var7] + var8[var4][var6] + var8[var5][var6] + var8[var5][var7] >> 2;
			int var10 = (this.x << 7) + (var2 << 6);
			int var11 = (this.y << 7) + (var3 << 6);
			return var12.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame);
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2047180013"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0;
		if (var0 < 0 || var0 >= 65536) {
			var0 >>>= 16;
			var1 += 16;
		}

		if (var0 >= 256) {
			var0 >>>= 8;
			var1 += 8;
		}

		if (var0 >= 16) {
			var0 >>>= 4;
			var1 += 4;
		}

		if (var0 >= 4) {
			var0 >>>= 2;
			var1 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			++var1;
		}

		return var0 + var1;
	}
}
