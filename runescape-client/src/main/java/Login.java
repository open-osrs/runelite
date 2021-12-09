import java.io.IOException;
import java.net.Socket;
import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bx")
@Implements("Login")
public class Login {
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1436584639
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "[Lpa;"
	)
	@Export("runesSprite")
	static IndexedSprite[] runesSprite;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	static IndexedSprite field894;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	static IndexedSprite field864;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "[Lpa;"
	)
	@Export("title_muteSprite")
	static IndexedSprite[] title_muteSprite;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	static IndexedSprite field888;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1895069117
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1313078647
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("i")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1613024797
	)
	static int field871;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1878883127
	)
	static int field872;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1993247493
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("ak")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("ad")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("bp")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("bd")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("ba")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("bq")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("bz")
	static boolean field880;
	@ObfuscatedName("bu")
	static boolean field881;
	@ObfuscatedName("bb")
	static boolean field882;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -898693427
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("bn")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 1090106223
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -1897185599
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 138220479
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		longValue = 4939952729510016701L
	)
	static long field890;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		longValue = 8615875209427169179L
	)
	static long field869;
	@ObfuscatedName("cn")
	static String[] field892;
	@ObfuscatedName("cv")
	static String[] field893;

	static {
		xPadding = 0; // L: 39
		loginBoxX = xPadding + 202; // L: 58
		Login_loadingPercent = 10; // L: 60
		Login_loadingText = ""; // L: 61
		field871 = -1; // L: 79
		field872 = 1; // L: 82
		loginIndex = 0; // L: 86
		Login_response0 = ""; // L: 87
		Login_response1 = ""; // L: 88
		Login_response2 = ""; // L: 89
		Login_response3 = ""; // L: 90
		Login_username = ""; // L: 91
		Login_password = ""; // L: 92
		field880 = false; // L: 99
		field881 = false; // L: 100
		field882 = true; // L: 103
		currentLoginField = 0; // L: 104
		worldSelectOpen = false; // L: 108
		hoveredWorldIndex = -1; // L: 116
		worldSelectPage = 0; // L: 117
		worldSelectPagesCount = 0; // L: 118
		new DecimalFormat("##0.00"); // L: 121
		new class118();
		field890 = -1L; // L: 129
		field869 = -1L; // L: 130
		field892 = new String[]{"title.jpg"}; // L: 133
		field893 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
	} // L: 136

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(S)[Ldx;",
		garbageValue = "160"
	)
	static class116[] method1994() {
		return new class116[]{class116.field1421, class116.field1415, class116.field1416, class116.field1423, class116.field1418, class116.field1419}; // L: 25
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-721408272"
	)
	static int method1993(int var0, int var1, int var2) {
		if ((Tiles.Tiles_renderFlags[var0][var1][var2] & 8) != 0) { // L: 456
			return 0;
		} else {
			return var0 > 0 && (Tiles.Tiles_renderFlags[1][var1][var2] & 2) != 0 ? var0 - 1 : var0; // L: 457
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "675537632"
	)
	static final int method1995(int var0, int var1) {
		if (var0 == -1) { // L: 495
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 496
			if (var1 < 2) { // L: 497
				var1 = 2;
			} else if (var1 > 126) { // L: 498
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 499
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/Socket;IIB)Lmd;",
		garbageValue = "-5"
	)
	public static AbstractSocket method1965(Socket var0, int var1, int var2) throws IOException {
		return new BufferedNetSocket(var0, var1, var2); // L: 10
	}
}
