import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cp")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("pr")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	static class353 field1210;
	@ObfuscatedName("n")
	@Export("cacheParentPaths")
	static String[] cacheParentPaths;
	@ObfuscatedName("ol")
	@ObfuscatedSignature(
		descriptor = "[Ljf;"
	)
	static Widget[] field1207;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	@Export("definition")
	NPCComposition definition;

	NPC() {
	} // L: 12

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IBI)V",
		garbageValue = "-1295452505"
	)
	final void method2258(int var1, byte var2) {
		int var3 = super.pathX[0]; // L: 15
		int var4 = super.pathY[0]; // L: 16
		if (var1 == 0) { // L: 17
			--var3; // L: 18
			++var4; // L: 19
		}

		if (var1 == 1) { // L: 21
			++var4;
		}

		if (var1 == 2) { // L: 22
			++var3; // L: 23
			++var4; // L: 24
		}

		if (var1 == 3) { // L: 26
			--var3;
		}

		if (var1 == 4) { // L: 27
			++var3;
		}

		if (var1 == 5) { // L: 28
			--var3; // L: 29
			--var4; // L: 30
		}

		if (var1 == 6) { // L: 32
			--var4;
		}

		if (var1 == 7) { // L: 33
			++var3; // L: 34
			--var4; // L: 35
		}

		if (super.sequence != -1 && MouseHandler.SequenceDefinition_get(super.sequence).field1956 == 1) { // L: 37
			super.sequence = -1;
		}

		if (super.pathLength < 9) { // L: 38
			++super.pathLength;
		}

		for (int var5 = super.pathLength; var5 > 0; --var5) { // L: 39
			super.pathX[var5] = super.pathX[var5 - 1]; // L: 40
			super.pathY[var5] = super.pathY[var5 - 1]; // L: 41
			super.pathTraversed[var5] = super.pathTraversed[var5 - 1]; // L: 42
		}

		super.pathX[0] = var3;
		super.pathY[0] = var4;
		super.pathTraversed[0] = var2;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Lhl;",
		garbageValue = "461766541"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) { // L: 77
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? MouseHandler.SequenceDefinition_get(super.sequence) : null; // L: 78
			SequenceDefinition var2 = super.movementSequence == -1 || super.idleSequence == super.movementSequence && var1 != null ? null : MouseHandler.SequenceDefinition_get(super.movementSequence); // L: 79
			Model var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 80
			if (var3 == null) { // L: 81
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 82
				super.defaultHeight = var3.height; // L: 83
				if (super.spotAnimation != -1 && super.spotAnimationFrame != -1) { // L: 84
					Model var4 = BZip2State.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame); // L: 85
					if (var4 != null) { // L: 86
						var4.offsetBy(0, -super.field1126, 0); // L: 87
						Model[] var5 = new Model[]{var3, var4}; // L: 88
						var3 = new Model(var5, 2); // L: 89
					}
				}

				if (this.definition.size == 1) { // L: 92
					var3.isSingleTile = true;
				}

				return var3; // L: 93
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "-124"
	)
	final void method2249(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && MouseHandler.SequenceDefinition_get(super.sequence).field1956 == 1) { // L: 50
			super.sequence = -1;
		}

		if (!var3) { // L: 51
			int var4 = var1 - super.pathX[0]; // L: 52
			int var5 = var2 - super.pathY[0]; // L: 53
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) { // L: 54
				if (super.pathLength < 9) { // L: 55
					++super.pathLength;
				}

				for (int var6 = super.pathLength; var6 > 0; --var6) { // L: 56
					super.pathX[var6] = super.pathX[var6 - 1]; // L: 57
					super.pathY[var6] = super.pathY[var6 - 1];
					super.pathTraversed[var6] = super.pathTraversed[var6 - 1];
				}

				super.pathX[0] = var1; // L: 61
				super.pathY[0] = var2;
				super.pathTraversed[0] = 1; // L: 63
				return; // L: 64
			}
		}

		super.pathLength = 0; // L: 67
		super.field1144 = 0; // L: 68
		super.field1085 = 0; // L: 69
		super.pathX[0] = var1; // L: 70
		super.pathY[0] = var2; // L: 71
		super.x = super.pathX[0] * 128 + super.field1087 * 64; // L: 72
		super.y = super.pathY[0] * 128 + super.field1087 * 64; // L: 73
	} // L: 74

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-532391824"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null; // L: 97
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lnf;III)I",
		garbageValue = "2110206967"
	)
	static int method2251(IterableNodeHashTable var0, int var1, int var2) {
		if (var0 == null) {
			return var2;
		} else {
			IntegerNode var3 = (IntegerNode)var0.get((long)var1);
			return var3 == null ? var2 : var3.integer;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "569144046"
	)
	public static void method2248() {
		if (MouseHandler.MouseHandler_instance != null) { // L: 44
			synchronized(MouseHandler.MouseHandler_instance) { // L: 45
				MouseHandler.MouseHandler_instance = null; // L: 46
			} // L: 47
		}

	} // L: 49

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1285705264"
	)
	static final boolean method2265(int var0, int var1) {
		ObjectComposition var2 = KitDefinition.getObjectDefinition(var0); // L: 601
		if (var1 == 11) { // L: 602
			var1 = 10;
		}

		if (var1 >= 5 && var1 <= 8) {
			var1 = 4; // L: 603
		}

		return var2.method3305(var1); // L: 604
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([BIS)I",
		garbageValue = "-944"
	)
	public static int method2256(byte[] var0, int var1) {
		int var3 = -1; // L: 58

		for (int var4 = 0; var4 < var1; ++var4) { // L: 59
			var3 = var3 >>> 8 ^ Buffer.crc32Table[(var3 ^ var0[var4]) & 255]; // L: 60
		}

		var3 = ~var3; // L: 62
		return var3; // L: 65
	}
}
