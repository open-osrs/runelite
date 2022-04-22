import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cy")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	@Export("definition")
	NPCComposition definition;

	NPC() {
	} // L: 12

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ILgm;I)V",
		garbageValue = "-1427084845"
	)
	final void method2347(int var1, class193 var2) {
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

		if (super.sequence != -1 && class163.SequenceDefinition_get(super.sequence).field2158 == 1) { // L: 37
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

		super.pathX[0] = var3; // L: 44
		super.pathY[0] = var4; // L: 45
		super.pathTraversed[0] = var2; // L: 46
	} // L: 47

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Liq;",
		garbageValue = "103"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) { // L: 77
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? class163.SequenceDefinition_get(super.sequence) : null; // L: 78
			SequenceDefinition var2 = super.movementSequence != -1 && (super.idleSequence != super.movementSequence || var1 == null) ? class163.SequenceDefinition_get(super.movementSequence) : null; // L: 79
			Model var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 80
			if (var3 == null) { // L: 81
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 82
				super.defaultHeight = var3.height; // L: 83
				if (super.spotAnimation != -1 && super.spotAnimationFrame != -1) { // L: 84
					Model var4 = ClientPreferences.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame); // L: 85
					if (var4 != null) { // L: 86
						var4.offsetBy(0, -super.spotAnimationHeight, 0); // L: 87
						Model[] var5 = new Model[]{var3, var4}; // L: 88
						var3 = new Model(var5, 2); // L: 89
					}
				}

				if (this.definition.size == 1) { // L: 92
					var3.isSingleTile = true;
				}

				if (super.field1122 != 0 && Client.cycle >= super.field1167 && Client.cycle < super.field1168) { // L: 93
					var3.overrideHue = super.field1169; // L: 94
					var3.overrideSaturation = super.field1114; // L: 95
					var3.overrideLuminance = super.field1171; // L: 96
					var3.overrideAmount = super.field1122; // L: 97
				} else {
					var3.overrideAmount = 0; // L: 100
				}

				return var3; // L: 102
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "646080626"
	)
	final void method2348(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && class163.SequenceDefinition_get(super.sequence).field2158 == 1) { // L: 50
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
					super.pathY[var6] = super.pathY[var6 - 1]; // L: 58
					super.pathTraversed[var6] = super.pathTraversed[var6 - 1]; // L: 59
				}

				super.pathX[0] = var1; // L: 61
				super.pathY[0] = var2; // L: 62
				super.pathTraversed[0] = class193.field2185; // L: 63
				return;
			}
		}

		super.pathLength = 0;
		super.field1170 = 0;
		super.field1179 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.x = super.pathX[0] * 128 + super.field1150 * 64;
		super.y = super.pathY[0] * 128 + super.field1150 * 64;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-323504433"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null; // L: 106
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "20"
	)
	static void method2360() {
		Tiles.Tiles_underlays = null; // L: 64
		class14.Tiles_overlays = null; // L: 65
		class147.Tiles_shapes = null; // L: 66
		Tiles.field983 = null; // L: 67
		class420.field4545 = null; // L: 68
		class392.field4374 = null; // L: 69
		Tiles.field998 = null; // L: 70
		BufferedNetSocket.Tiles_hue = null; // L: 71
		class116.Tiles_saturation = null; // L: 72
		Tiles.Tiles_lightness = null; // L: 73
		class357.Tiles_hueMultiplier = null; // L: 74
		class361.field4213 = null; // L: 75
	} // L: 76

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZI)I",
		garbageValue = "-1163810213"
	)
	static int method2361(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? WorldMapID.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 1248
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) { // L: 1249
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapID.Widget_unpackTargetMask(class326.getWidgetFlags(var3)); // L: 1250
			return 1; // L: 1251
		} else if (var0 != ScriptOpcodes.CC_GETOP) { // L: 1253
			if (var0 == ScriptOpcodes.CC_GETOPBASE) { // L: 1260
				if (var3.dataText == null) { // L: 1261
					Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1262
				}

				return 1; // L: 1263
			} else {
				return 2; // L: 1265
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1254
			--var4; // L: 1255
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1256
				Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1257
			} else {
				Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1258
		}
	}
}
