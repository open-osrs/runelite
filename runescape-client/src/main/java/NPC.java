import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("tu")
	@ObfuscatedGetter(
		intValue = -558114619
	)
	static int field1262;
	@ObfuscatedName("s")
	static byte[][][] field1259;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lcb;"
	)
	@Export("World_request")
	static UrlRequest World_request;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	@Export("definition")
	NPCComposition definition;
	@ObfuscatedName("q")
	String field1258;

	NPC() {
		this.field1258 = ""; // L: 11
	} // L: 13

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "0"
	)
	void method2338(String var1) {
		this.field1258 = var1 == null ? "" : var1; // L: 16
	} // L: 17

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Lhv;",
		garbageValue = "-238822980"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) { // L: 96
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? class114.SequenceDefinition_get(super.sequence) : null; // L: 97
			SequenceDefinition var2 = super.movementSequence != -1 && (super.idleSequence != super.movementSequence || var1 == null) ? class114.SequenceDefinition_get(super.movementSequence) : null; // L: 98
			Model var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 99
			if (var3 == null) { // L: 100
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 101
				super.defaultHeight = var3.height; // L: 102
				if (super.spotAnimation != -1 && super.spotAnimationFrame != -1) { // L: 103
					Model var4 = class136.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame); // L: 104
					if (var4 != null) { // L: 105
						var4.offsetBy(0, -super.spotAnimationHeight, 0); // L: 106
						Model[] var5 = new Model[]{var3, var4}; // L: 107
						var3 = new Model(var5, 2); // L: 108
					}
				}

				if (this.definition.size == 1) { // L: 111
					var3.isSingleTile = true;
				}

				if (super.field1140 != 0 && Client.cycle >= super.field1196 && Client.cycle < super.field1197) { // L: 112
					var3.overrideHue = super.field1143; // L: 113
					var3.overrideSaturation = super.field1199; // L: 114
					var3.overrideLuminance = super.field1153; // L: 115
					var3.overrideAmount = super.field1140; // L: 116
				} else {
					var3.overrideAmount = 0; // L: 119
				}

				return var3; // L: 121
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "922322997"
	)
	final String method2342() {
		if (!this.field1258.isEmpty()) { // L: 20
			return this.field1258; // L: 21
		} else {
			NPCComposition var1 = this.definition; // L: 23
			if (var1.transforms != null) { // L: 24
				var1 = var1.transform(); // L: 25
				if (var1 == null) { // L: 26
					var1 = this.definition; // L: 27
				}
			}

			return var1.name; // L: 30
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ILgd;B)V",
		garbageValue = "1"
	)
	final void method2340(int var1, class193 var2) {
		int var3 = super.pathX[0]; // L: 34
		int var4 = super.pathY[0]; // L: 35
		if (var1 == 0) { // L: 36
			--var3; // L: 37
			++var4; // L: 38
		}

		if (var1 == 1) { // L: 40
			++var4;
		}

		if (var1 == 2) { // L: 41
			++var3; // L: 42
			++var4; // L: 43
		}

		if (var1 == 3) { // L: 45
			--var3;
		}

		if (var1 == 4) { // L: 46
			++var3;
		}

		if (var1 == 5) { // L: 47
			--var3; // L: 48
			--var4; // L: 49
		}

		if (var1 == 6) { // L: 51
			--var4;
		}

		if (var1 == 7) { // L: 52
			++var3; // L: 53
			--var4; // L: 54
		}

		if (super.sequence != -1 && class114.SequenceDefinition_get(super.sequence).field2206 == 1) { // L: 56
			super.sequence = -1;
		}

		if (super.pathLength < 9) { // L: 57
			++super.pathLength;
		}

		for (int var5 = super.pathLength; var5 > 0; --var5) { // L: 58
			super.pathX[var5] = super.pathX[var5 - 1]; // L: 59
			super.pathY[var5] = super.pathY[var5 - 1]; // L: 60
			super.pathTraversed[var5] = super.pathTraversed[var5 - 1]; // L: 61
		}

		super.pathX[0] = var3; // L: 63
		super.pathY[0] = var4; // L: 64
		super.pathTraversed[0] = var2; // L: 65
	} // L: 66

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "83074574"
	)
	final void method2341(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && class114.SequenceDefinition_get(super.sequence).field2206 == 1) { // L: 69
			super.sequence = -1;
		}

		if (!var3) { // L: 70
			int var4 = var1 - super.pathX[0]; // L: 71
			int var5 = var2 - super.pathY[0]; // L: 72
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) { // L: 73
				if (super.pathLength < 9) { // L: 74
					++super.pathLength;
				}

				for (int var6 = super.pathLength; var6 > 0; --var6) { // L: 75
					super.pathX[var6] = super.pathX[var6 - 1]; // L: 76
					super.pathY[var6] = super.pathY[var6 - 1]; // L: 77
					super.pathTraversed[var6] = super.pathTraversed[var6 - 1]; // L: 78
				}

				super.pathX[0] = var1; // L: 80
				super.pathY[0] = var2; // L: 81
				super.pathTraversed[0] = class193.field2251; // L: 82
				return; // L: 83
			}
		}

		super.pathLength = 0; // L: 86
		super.field1200 = 0; // L: 87
		super.field1194 = 0; // L: 88
		super.pathX[0] = var1; // L: 89
		super.pathY[0] = var2; // L: 90
		super.x = super.field1167 * 64 + super.pathX[0] * 128; // L: 91
		super.y = super.field1167 * 64 + super.pathY[0] * 128; // L: 92
	} // L: 93

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-4"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null; // L: 125
	}
}
