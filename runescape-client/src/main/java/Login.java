import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cy")
@Implements("Login")
public class Login {
	@ObfuscatedName("v")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -798516213
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Lly;"
	)
	@Export("runesSprite")
	static IndexedSprite[] runesSprite;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "[Lly;"
	)
	@Export("title_muteSprite")
	static IndexedSprite[] title_muteSprite;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("options_buttons_2Sprite")
	static IndexedSprite options_buttons_2Sprite;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -491759097
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1990930167
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("m")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1379115269
	)
	static int field1206;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1813136613
	)
	static int field1207;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1401481889
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("aa")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("as")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("aw")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("az")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("ah")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("ap")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("af")
	static boolean field1222;
	@ObfuscatedName("av")
	static boolean field1216;
	@ObfuscatedName("bn")
	static boolean field1217;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -557955143
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("bx")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 933074711
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1816463307
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 1081007071
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		longValue = -6454888937678848821L
	)
	static long field1213;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		longValue = 2692717295757623997L
	)
	static long field1226;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	@Export("archive20")
	static Archive archive20;
	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;

	static {
		xPadding = 0; // L: 38
		loginBoxX = xPadding + 202; // L: 55
		Login_loadingPercent = 10; // L: 57
		Login_loadingText = ""; // L: 58
		field1206 = -1; // L: 65
		field1207 = 1; // L: 68
		loginIndex = 0; // L: 72
		Login_response0 = ""; // L: 73
		Login_response1 = ""; // L: 74
		Login_response2 = ""; // L: 75
		Login_response3 = ""; // L: 76
		Login_username = ""; // L: 77
		Login_password = ""; // L: 78
		field1222 = false; // L: 85
		field1216 = false; // L: 86
		field1217 = true; // L: 89
		currentLoginField = 0; // L: 90
		worldSelectOpen = false; // L: 94
		hoveredWorldIndex = -1; // L: 102
		worldSelectPage = 0; // L: 103
		worldSelectPagesCount = 0; // L: 104
		new DecimalFormat("##0.00"); // L: 107
		new class171();
		field1213 = -1L; // L: 115
		field1226 = -1L; // L: 116
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2056829974"
	)
	public static boolean method2244(int var0) {
		return (var0 >> 30 & 1) != 0; // L: 25
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ILcl;ZB)I",
		garbageValue = "23"
	)
	static int method2223(int var0, Script var1, boolean var2) {
		Widget var3 = class237.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1307
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) { // L: 1308
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = MusicPatch.Widget_unpackTargetMask(class60.getWidgetFlags(var3)); // L: 1309
			return 1; // L: 1310
		} else if (var0 != ScriptOpcodes.IF_GETOP) { // L: 1312
			if (var0 == ScriptOpcodes.IF_GETOPBASE) { // L: 1319
				if (var3.dataText == null) { // L: 1320
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1321
				}

				return 1; // L: 1322
			} else {
				return 2; // L: 1324
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1313
			--var4; // L: 1314
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1315
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1316
			} else {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1317
		}
	}
}
