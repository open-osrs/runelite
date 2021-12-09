import java.applet.Applet;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("cr")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("b")
	@Export("javaVersion")
	public static String javaVersion;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("Widget_fontsArchive")
	static AbstractArchive Widget_fontsArchive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	@Export("definition")
	NPCComposition definition;

	NPC() {
	} // L: 12

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILgj;I)V",
		garbageValue = "1330012132"
	)
	final void method2319(int var1, class185 var2) {
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

		if (super.sequence != -1 && UserComparator5.SequenceDefinition_get(super.sequence).field2097 == 1) { // L: 37
			super.sequence = -1;
		}

		if (super.pathLength < 9) { // L: 38
			++super.pathLength;
		}

		for (int var5 = super.pathLength; var5 > 0; --var5) { // L: 39
			super.pathX[var5] = super.pathX[var5 - 1]; // L: 40
			super.pathY[var5] = super.pathY[var5 - 1]; // L: 41
			super.field1153[var5] = super.field1153[var5 - 1]; // L: 42
		}

		super.pathX[0] = var3; // L: 44
		super.pathY[0] = var4; // L: 45
		super.field1153[0] = var2; // L: 46
	} // L: 47

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Lgo;",
		garbageValue = "202861607"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? UserComparator5.SequenceDefinition_get(super.sequence) : null; // L: 78
			SequenceDefinition var2 = super.movementSequence == -1 || super.idleSequence == super.movementSequence && var1 != null ? null : UserComparator5.SequenceDefinition_get(super.movementSequence); // L: 79
			Model var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			if (var3 == null) { // L: 81
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				if (super.spotAnimation != -1 && super.spotAnimationFrame != -1) { // L: 84
					Model var4 = AccessFile.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame);
					if (var4 != null) {
						var4.offsetBy(0, -super.field1131, 0); // L: 87
						Model[] var5 = new Model[]{var3, var4}; // L: 88
						var3 = new Model(var5, 2);
					}
				}

				if (this.definition.size == 1) { // L: 92
					var3.isSingleTile = true;
				}

				if (super.field1146 != 0 && Client.cycle >= super.field1141 && Client.cycle < super.field1140) { // L: 93
					var3.field2494 = super.field1143;
					var3.field2495 = super.field1144; // L: 95
					var3.field2479 = super.field1095; // L: 96
					var3.field2474 = super.field1146;
				} else {
					var3.field2474 = 0;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-2138088750"
	)
	final void method2315(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && UserComparator5.SequenceDefinition_get(super.sequence).field2097 == 1) { // L: 50
			super.sequence = -1;
		}

		if (!var3) { // L: 51
			int var4 = var1 - super.pathX[0]; // L: 52
			int var5 = var2 - super.pathY[0]; // L: 53
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) { // L: 54
				if (super.pathLength < 9) { // L: 55
					++super.pathLength;
				}

				for (int var6 = super.pathLength; var6 > 0; --var6) {
					super.pathX[var6] = super.pathX[var6 - 1]; // L: 57
					super.pathY[var6] = super.pathY[var6 - 1];
					super.field1153[var6] = super.field1153[var6 - 1];
				}

				super.pathX[0] = var1;
				super.pathY[0] = var2;
				super.field1153[0] = class185.field2123; // L: 63
				return;
			}
		}

		super.pathLength = 0;
		super.field1098 = 0;
		super.field1117 = 0; // L: 69
		super.pathX[0] = var1; // L: 70
		super.pathY[0] = var2;
		super.x = super.field1120 * 64 + super.pathX[0] * 128; // L: 72
		super.y = super.pathY[0] * 128 + super.field1120 * 64;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;B)Z",
		garbageValue = "68"
	)
	static boolean method2314(String var0, int var1, String var2) {
		if (var1 == 0) { // L: 56
			try {
				if (!class29.field177.startsWith("win")) { // L: 58
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) { // L: 59
					throw new Exception();
				} else {
					String var11 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*"; // L: 60

					for (int var4 = 0; var4 < var0.length(); ++var4) { // L: 61
						if (var11.indexOf(var0.charAt(var4)) == -1) { // L: 62
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\""); // L: 64
					return true; // L: 65
				}
			} catch (Throwable var5) { // L: 67
				return false; // L: 68
			}
		} else if (var1 == 1) { // L: 71
			try {
				Object var10 = class27.method433(class29.field172, var2, new Object[]{(new URL(class29.field172.getCodeBase(), var0)).toString()}); // L: 73
				return var10 != null; // L: 74
			} catch (Throwable var6) { // L: 76
				return false; // L: 77
			}
		} else if (var1 == 2) { // L: 80
			try {
				class29.field172.getAppletContext().showDocument(new URL(class29.field172.getCodeBase(), var0), "_blank"); // L: 82
				return true; // L: 83
			} catch (Exception var7) { // L: 85
				return false; // L: 86
			}
		} else if (var1 == 3) { // L: 89
			try {
				Applet var3 = class29.field172; // L: 91
				JSObject.getWindow(var3).call("loggedout", (Object[])null); // L: 94
			} catch (Throwable var9) { // L: 97
			}

			try {
				class29.field172.getAppletContext().showDocument(new URL(class29.field172.getCodeBase(), var0), "_top"); // L: 99
				return true; // L: 100
			} catch (Exception var8) { // L: 102
				return false; // L: 103
			}
		} else {
			throw new IllegalArgumentException(); // L: 106
		}
	}
}
