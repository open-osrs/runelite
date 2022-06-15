import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("co")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	@Export("definition")
	NPCComposition definition;
	@ObfuscatedName("v")
	String field1261;

	NPC() {
		this.field1261 = ""; // L: 11
	} // L: 13

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1916980767"
	)
	void method2373(String var1) {
		this.field1261 = var1 == null ? "" : var1; // L: 16
	} // L: 17

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Lhy;",
		garbageValue = "1081110576"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) { // L: 96
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? ScriptFrame.SequenceDefinition_get(super.sequence) : null; // L: 97
			SequenceDefinition var2 = super.movementSequence == -1 || super.movementSequence == super.idleSequence && var1 != null ? null : ScriptFrame.SequenceDefinition_get(super.movementSequence); // L: 98
			Model var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 99
			if (var3 == null) { // L: 100
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 101
				super.defaultHeight = var3.height; // L: 102
				if (super.spotAnimation != -1 && super.spotAnimationFrame != -1) { // L: 103
					Model var4 = ObjectSound.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame); // L: 104
					if (var4 != null) { // L: 105
						var4.offsetBy(0, -super.spotAnimationHeight, 0); // L: 106
						Model[] var5 = new Model[]{var3, var4}; // L: 107
						var3 = new Model(var5, 2); // L: 108
					}
				}

				if (this.definition.size == 1) { // L: 111
					var3.isSingleTile = true;
				}

				if (super.field1133 != 0 && Client.cycle >= super.field1189 && Client.cycle < super.field1135) { // L: 112
					var3.overrideHue = super.field1191; // L: 113
					var3.overrideSaturation = super.field1192; // L: 114
					var3.overrideLuminance = super.field1193; // L: 115
					var3.overrideAmount = super.field1133; // L: 116
				} else {
					var3.overrideAmount = 0; // L: 119
				}

				return var3; // L: 121
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "56"
	)
	final String method2360() {
		if (!this.field1261.isEmpty()) { // L: 20
			return this.field1261; // L: 21
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILgn;I)V",
		garbageValue = "376054191"
	)
	final void method2361(int var1, class192 var2) {
		int var3 = super.pathX[0];
		int var4 = super.pathY[0];
		if (var1 == 0) {
			--var3;
			++var4;
		}

		if (var1 == 1) {
			++var4;
		}

		if (var1 == 2) { // L: 41
			++var3;
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

		if (super.sequence != -1 && ScriptFrame.SequenceDefinition_get(super.sequence).field2188 == 1) { // L: 56
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "1894796101"
	)
	final void method2362(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && ScriptFrame.SequenceDefinition_get(super.sequence).field2188 == 1) {
			super.sequence = -1;
		}

		if (!var3) {
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
				super.pathTraversed[0] = class192.field2212; // L: 82
				return; // L: 83
			}
		}

		super.pathLength = 0; // L: 86
		super.field1203 = 0; // L: 87
		super.field1202 = 0; // L: 88
		super.pathX[0] = var1; // L: 89
		super.pathY[0] = var2; // L: 90
		super.x = super.pathX[0] * 128 + super.field1205 * 64; // L: 91
		super.y = super.field1205 * 64 + super.pathY[0] * 128; // L: 92
	} // L: 93

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "9013641"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null; // L: 125
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "17"
	)
	public static void method2365() {
		if (MouseHandler.MouseHandler_instance != null) {
			synchronized(MouseHandler.MouseHandler_instance) {
				MouseHandler.MouseHandler_instance = null;
			} // L: 40
		}

	} // L: 42

	@ObfuscatedName("c")
	public static String method2382(long var0) {
		Calendar.Calendar_calendar.setTime(new Date(var0)); // L: 31
		int var2 = Calendar.Calendar_calendar.get(7); // L: 32
		int var3 = Calendar.Calendar_calendar.get(5); // L: 33
		int var4 = Calendar.Calendar_calendar.get(2); // L: 34
		int var5 = Calendar.Calendar_calendar.get(1); // L: 35
		int var6 = Calendar.Calendar_calendar.get(11); // L: 36
		int var7 = Calendar.Calendar_calendar.get(12); // L: 37
		int var8 = Calendar.Calendar_calendar.get(13); // L: 38
		return Calendar.DAYS_OF_THE_WEEK[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT"; // L: 39
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-839633711"
	)
	public static void method2379() {
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear(); // L: 69
	} // L: 70

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(Lkb;IIII)V",
		garbageValue = "1069482621"
	)
	@Export("drawCompass")
	static final void drawCompass(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.getSpriteMask(false); // L: 12156
		if (var4 != null) { // L: 12157
			if (Client.minimapState < 3) { // L: 12158
				class267.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 12159
			}

		}
	} // L: 12160
}
