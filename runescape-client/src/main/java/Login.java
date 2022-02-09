import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
@Implements("Login")
public class Login {
	@ObfuscatedName("l")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -553097527
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "[Lpg;"
	)
	@Export("runesSprite")
	static IndexedSprite[] runesSprite;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	static IndexedSprite field894;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lcc;"
	)
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1080882323
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1892263241
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("b")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 2124652173
	)
	static int field914;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1998991991
	)
	static int field918;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 445480309
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("ai")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("am")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("be")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("bt")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("bn")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("bz")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 2048872381
	)
	static int field910;
	@ObfuscatedName("bg")
	static String[] field911;
	@ObfuscatedName("ba")
	static boolean field912;
	@ObfuscatedName("bv")
	static boolean field913;
	@ObfuscatedName("bj")
	static boolean field893;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -93095323
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("ch")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 1771944375
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -564927075
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -351069605
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		longValue = -2785638114199309409L
	)
	static long field922;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		longValue = -5124268576715020243L
	)
	static long field923;
	@ObfuscatedName("cr")
	static String[] field924;
	@ObfuscatedName("co")
	static String[] field925;

	static {
		xPadding = 0; // L: 47
		loginBoxX = xPadding + 202; // L: 66
		Login_loadingPercent = 10; // L: 68
		Login_loadingText = ""; // L: 69
		field914 = -1; // L: 87
		field918 = 1; // L: 90
		loginIndex = 0; // L: 94
		Login_response0 = ""; // L: 95
		Login_response1 = ""; // L: 96
		Login_response2 = ""; // L: 97
		Login_response3 = ""; // L: 98
		Login_username = ""; // L: 99
		Login_password = ""; // L: 100
		field910 = 0; // L: 102
		field911 = new String[8]; // L: 103
		field912 = false; // L: 114
		field913 = false; // L: 115
		field893 = true; // L: 118
		currentLoginField = 0; // L: 119
		worldSelectOpen = false; // L: 123
		hoveredWorldIndex = -1; // L: 131
		worldSelectPage = 0; // L: 132
		worldSelectPagesCount = 0; // L: 133
		new DecimalFormat("##0.00"); // L: 136
		new class118();
		field922 = -1L; // L: 144
		field923 = -1L; // L: 145
		field924 = new String[]{"title.jpg"}; // L: 148
		field925 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"}; // L: 151
	}
}
