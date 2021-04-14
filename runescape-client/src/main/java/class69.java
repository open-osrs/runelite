import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bv")
public class class69 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljc;"
	)
	@Export("reflectionChecks")
	public static IterableNodeDeque reflectionChecks;
	@ObfuscatedName("g")
	@Export("Widget_loadedInterfaces")
	public static boolean[] Widget_loadedInterfaces;
	@ObfuscatedName("hz")
	@ObfuscatedGetter(
		intValue = -1660652965
	)
	@Export("cameraYaw")
	static int cameraYaw;

	static {
		reflectionChecks = new IterableNodeDeque(); // L: 17
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-2099962248"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		Projectile.addChatMessage(var0, var1, var2, (String)null); // L: 19
	} // L: 20

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-798312209"
	)
	static void method1166() {
		class9.field69 = null; // L: 48
		Tiles.field1092 = null; // L: 49
		Tiles.field1091 = null; // L: 50
		class362.field4079 = null; // L: 51
		MidiPcmStream.field2489 = null; // L: 52
		SecureRandomCallable.field1106 = null; // L: 53
		WorldMapLabelSize.field1570 = null; // L: 54
		Tiles.Tiles_hue = null; // L: 55
		Tiles.Tiles_saturation = null; // L: 56
		Tiles.Tiles_lightness = null; // L: 57
		GrandExchangeOfferOwnWorldComparator.Tiles_hueMultiplier = null; // L: 58
		class375.field4136 = null; // L: 59
	} // L: 60

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "-75599229"
	)
	public static int method1168(CharSequence var0) {
		boolean var2 = false; // L: 70
		boolean var3 = false; // L: 71
		int var4 = 0; // L: 72
		int var5 = var0.length(); // L: 73

		for (int var6 = 0; var6 < var5; ++var6) { // L: 74
			char var7 = var0.charAt(var6); // L: 75
			if (var6 == 0) { // L: 76
				if (var7 == '-') { // L: 77
					var2 = true; // L: 78
					continue;
				}

				if (var7 == '+') { // L: 81
					continue;
				}
			}

			int var9;
			if (var7 >= '0' && var7 <= '9') { // L: 83
				var9 = var7 - '0';
			} else if (var7 >= 'A' && var7 <= 'Z') { // L: 84
				var9 = var7 - '7';
			} else {
				if (var7 < 'a' || var7 > 'z') { // L: 85
					throw new NumberFormatException(); // L: 86
				}

				var9 = var7 - 'W';
			}

			if (var9 >= 10) { // L: 87
				throw new NumberFormatException();
			}

			if (var2) { // L: 88
				var9 = -var9;
			}

			int var8 = var9 + var4 * 10; // L: 89
			if (var4 != var8 / 10) { // L: 90
				throw new NumberFormatException();
			}

			var4 = var8; // L: 91
			var3 = true; // L: 92
		}

		if (!var3) { // L: 94
			throw new NumberFormatException();
		} else {
			return var4; // L: 97
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-582278156"
	)
	public static boolean method1165(int var0) {
		return (var0 >> 29 & 1) != 0; // L: 33
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-30"
	)
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z'; // L: 168
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ILcc;ZI)I",
		garbageValue = "1950994133"
	)
	static int method1169(int var0, Script var1, boolean var2) {
		Widget var3 = class139.getWidget(Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]); // L: 1251
		if (var0 == ScriptOpcodes.IF_GETX) { // L: 1252
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.x; // L: 1253
			return 1; // L: 1254
		} else if (var0 == ScriptOpcodes.IF_GETY) { // L: 1256
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.y; // L: 1257
			return 1; // L: 1258
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) { // L: 1260
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.width; // L: 1261
			return 1; // L: 1262
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) { // L: 1264
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.height; // L: 1265
			return 1; // L: 1266
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) { // L: 1268
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1269
			return 1; // L: 1270
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) { // L: 1272
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.parentId; // L: 1273
			return 1; // L: 1274
		} else {
			return 2; // L: 1276
		}
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1186664585"
	)
	static String method1164(int var0) {
		if (var0 < 0) { // L: 9049
			return "";
		} else {
			return Client.menuTargets[var0].length() > 0 ? Client.menuActions[var0] + " " + Client.menuTargets[var0] : Client.menuActions[var0]; // L: 9050 9051
		}
	}
}
