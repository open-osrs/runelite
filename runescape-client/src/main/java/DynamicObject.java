import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cw")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1608906951
	)
	static int field1311;
	@ObfuscatedName("er")
	@ObfuscatedGetter(
		intValue = 1685580933
	)
	@Export("port3")
	static int port3;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1583763067
	)
	@Export("id")
	int id;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1077688157
	)
	@Export("type")
	int type;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1461018485
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 242558127
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -345704253
	)
	@Export("x")
	int x;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -2021063101
	)
	@Export("y")
	int y;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -765264835
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1029669135
	)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		descriptor = "(IIIIIIIZLem;)V"
	)
	DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Renderable var9) {
		this.id = var1; // L: 20
		this.type = var2; // L: 21
		this.orientation = var3; // L: 22
		this.plane = var4; // L: 23
		this.x = var5; // L: 24
		this.y = var6; // L: 25
		if (var7 != -1) { // L: 26
			this.sequenceDefinition = InterfaceParent.SequenceDefinition_get(var7); // L: 27
			this.frame = 0; // L: 28
			this.cycleStart = Client.cycle - 1; // L: 29
			if (this.sequenceDefinition.field3548 == 0 && var9 != null && var9 instanceof DynamicObject) { // L: 30
				DynamicObject var10 = (DynamicObject)var9; // L: 31
				if (var10.sequenceDefinition == this.sequenceDefinition) { // L: 32
					this.frame = var10.frame; // L: 33
					this.cycleStart = var10.cycleStart; // L: 34
					return; // L: 35
				}
			}

			if (var8 && this.sequenceDefinition.frameCount != -1) { // L: 38
				this.frame = (int)(Math.random() * (double)this.sequenceDefinition.frameIds.length); // L: 39
				this.cycleStart -= (int)(Math.random() * (double)this.sequenceDefinition.frameLengths[this.frame]); // L: 40
			}
		}

	} // L: 43

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Lef;",
		garbageValue = "127"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.sequenceDefinition != null) { // L: 46
			int var1 = Client.cycle - this.cycleStart; // L: 47
			if (var1 > 100 && this.sequenceDefinition.frameCount > 0) { // L: 48
				var1 = 100;
			}

			label55: {
				do {
					do {
						if (var1 <= this.sequenceDefinition.frameLengths[this.frame]) { // L: 49
							break label55;
						}

						var1 -= this.sequenceDefinition.frameLengths[this.frame]; // L: 50
						++this.frame; // L: 51
					} while(this.frame < this.sequenceDefinition.frameIds.length); // L: 52

					this.frame -= this.sequenceDefinition.frameCount; // L: 53
				} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length); // L: 54

				this.sequenceDefinition = null; // L: 55
			}

			this.cycleStart = Client.cycle - var1; // L: 60
		}

		ObjectComposition var12 = WorldMapAreaData.getObjectDefinition(this.id); // L: 62
		if (var12.transforms != null) { // L: 63
			var12 = var12.transform();
		}

		if (var12 == null) { // L: 64
			return null;
		} else {
			int var2;
			int var3;
			if (this.orientation != 1 && this.orientation != 3) { // L: 67
				var2 = var12.sizeX; // L: 72
				var3 = var12.sizeY; // L: 73
			} else {
				var2 = var12.sizeY; // L: 68
				var3 = var12.sizeX; // L: 69
			}

			int var4 = (var2 >> 1) + this.x; // L: 75
			int var5 = (var2 + 1 >> 1) + this.x; // L: 76
			int var6 = (var3 >> 1) + this.y; // L: 77
			int var7 = (var3 + 1 >> 1) + this.y; // L: 78
			int[][] var8 = Tiles.Tiles_heights[this.plane]; // L: 79
			int var9 = var8[var4][var6] + var8[var5][var6] + var8[var4][var7] + var8[var5][var7] >> 2; // L: 80
			int var10 = (this.x << 7) + (var2 << 6); // L: 81
			int var11 = (this.y << 7) + (var3 << 6); // L: 82
			return var12.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame); // L: 83
		}
	}
}
