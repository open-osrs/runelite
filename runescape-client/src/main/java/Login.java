import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cg")
@Implements("Login")
public class Login {
	@ObfuscatedName("sg")
	@ObfuscatedSignature(
		descriptor = "Lcm;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1122392293
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "[Low;"
	)
	@Export("runesSprite")
	static IndexedSprite[] runesSprite;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1338288751
	)
	static int field1018;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lci;"
	)
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1015989971
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1156735553
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("a")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1968264881
	)
	static int field993;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1162562217
	)
	static int field994;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -233331579
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("ad")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("af")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("ao")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("ai")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("av")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("az")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("an")
	static boolean field1003;
	@ObfuscatedName("ah")
	static boolean field1012;
	@ObfuscatedName("br")
	static boolean field1005;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -819418163
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("bt")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -2104276991
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1497007259
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1387381071
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		longValue = 5781312275370513963L
	)
	static long field991;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		longValue = -4852859935044639761L
	)
	static long field1016;

	static {
		xPadding = 0; // L: 38
		loginBoxX = xPadding + 202; // L: 55
		Login_loadingPercent = 10; // L: 57
		Login_loadingText = ""; // L: 58
		field993 = -1; // L: 65
		field994 = 1; // L: 68
		loginIndex = 0; // L: 72
		Login_response0 = ""; // L: 73
		Login_response1 = ""; // L: 74
		Login_response2 = ""; // L: 75
		Login_response3 = ""; // L: 76
		Login_username = ""; // L: 77
		Login_password = ""; // L: 78
		field1003 = false; // L: 85
		field1012 = false; // L: 86
		field1005 = true; // L: 89
		currentLoginField = 0; // L: 90
		worldSelectOpen = false; // L: 94
		hoveredWorldIndex = -1; // L: 102
		worldSelectPage = 0; // L: 103
		worldSelectPagesCount = 0; // L: 104
		new DecimalFormat("##0.00"); // L: 107
		new class124();
		field991 = -1L; // L: 115
		field1016 = -1L; // L: 116
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Lke;",
		garbageValue = "-1050375469"
	)
	public static FloorOverlayDefinition method1968(int var0) {
		FloorOverlayDefinition var1 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var0); // L: 26
		if (var1 != null) { // L: 27
			return var1;
		} else {
			byte[] var2 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var0); // L: 28
			var1 = new FloorOverlayDefinition(); // L: 29
			if (var2 != null) { // L: 30
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode(); // L: 31
			FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var1, (long)var0); // L: 32
			return var1; // L: 33
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Lne;",
		garbageValue = "283131350"
	)
	public static class373 method1969(int var0) {
		int var1 = class371.field4124[var0]; // L: 11
		if (var1 == 1) { // L: 12
			return class373.field4126; // L: 13
		} else if (var1 == 2) { // L: 15
			return class373.field4128; // L: 16
		} else {
			return var1 == 3 ? class373.field4134 : null; // L: 18 19 21
		}
	}

	@ObfuscatedName("u")
	public static int method1967(long var0) {
		return (int)(var0 >>> 0 & 127L); // L: 56
	}
}
