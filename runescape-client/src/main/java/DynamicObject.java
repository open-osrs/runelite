import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
@Implements("DynamicObject")
public class DynamicObject extends Entity {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -550843083
	)
	@Export("id")
	int id;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 174390429
	)
	@Export("type")
	int type;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 89407283
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1374963731
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -2010464009
	)
	@Export("x")
	int x;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 647351421
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
		intValue = 2125087057
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 561855979
	)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		descriptor = "(IIIIIIIZLej;)V"
	)
	DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Entity var9) {
		this.id = var1; // L: 20
		this.type = var2; // L: 21
		this.orientation = var3; // L: 22
		this.plane = var4; // L: 23
		this.x = var5; // L: 24
		this.y = var6; // L: 25
		if (var7 != -1) { // L: 26
			this.sequenceDefinition = class105.SequenceDefinition_get(var7); // L: 27
			this.frame = 0; // L: 28
			this.cycleStart = Client.cycle - 1; // L: 29
			if (this.sequenceDefinition.field3551 == 0 && var9 != null && var9 instanceof DynamicObject) { // L: 30
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Leh;",
		garbageValue = "-2070677844"
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

		ObjectDefinition var12 = ScriptEvent.getObjectDefinition(this.id); // L: 62
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
			int var9 = var8[var4][var7] + var8[var4][var6] + var8[var5][var6] + var8[var5][var7] >> 2; // L: 80
			int var10 = (this.x << 7) + (var2 << 6); // L: 81
			int var11 = (this.y << 7) + (var3 << 6); // L: 82
			return var12.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame); // L: 83
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1129350300"
	)
	static final int method2357(int var0, int var1, int var2) {
		int var3 = var0 / var2; // L: 436
		int var4 = var0 & var2 - 1; // L: 437
		int var5 = var1 / var2; // L: 438
		int var6 = var1 & var2 - 1; // L: 439
		int var7 = WorldMapID.method665(var3, var5); // L: 440
		int var8 = WorldMapID.method665(var3 + 1, var5); // L: 441
		int var9 = WorldMapID.method665(var3, var5 + 1); // L: 442
		int var10 = WorldMapID.method665(var3 + 1, var5 + 1); // L: 443
		int var11 = PendingSpawn.method1841(var7, var8, var4, var2); // L: 444
		int var12 = PendingSpawn.method1841(var9, var10, var4, var2); // L: 445
		return PendingSpawn.method1841(var11, var12, var6, var2); // L: 446
	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-41"
	)
	static boolean method2362(int var0) {
		return var0 == 57 || var0 == 58 || var0 == 1007 || var0 == 25 || var0 == 30; // L: 8956
	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-2144644905"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (ScriptFrame.loadInterface(var0)) { // L: 10342
			class69.updateInterface(Widget.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6); // L: 10343
		}
	} // L: 10344
}
