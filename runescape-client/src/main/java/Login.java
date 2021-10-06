import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bi")
@Implements("Login")
public class Login {
	@ObfuscatedName("su")
	@ObfuscatedGetter(
		intValue = 1480284863
	)
	static int field906;
	@ObfuscatedName("q")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -14906911
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "[Loz;"
	)
	@Export("runesSprite")
	static IndexedSprite[] runesSprite;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static IndexedSprite field873;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static IndexedSprite field876;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static IndexedSprite field877;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lcl;"
	)
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 583338115
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1550771085
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("u")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1565942121
	)
	static int field884;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 439157501
	)
	static int field869;
	@ObfuscatedName("am")
	static String field894;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -241225043
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("ai")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("af")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("bz")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("bt")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("bg")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("bf")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("bm")
	static boolean field904;
	@ObfuscatedName("bv")
	static boolean field895;
	@ObfuscatedName("bb")
	static boolean field900;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -585931493
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("be")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -1479872751
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 1321055669
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 109893835
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		longValue = 554376868223177391L
	)
	static long field885;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		longValue = -2022270398878791713L
	)
	static long field905;
	@ObfuscatedName("cp")
	static String[] field890;
	@ObfuscatedName("cl")
	static String[] field907;

	static {
		xPadding = 0;
		loginBoxX = xPadding + 202;
		Login_loadingPercent = 10;
		Login_loadingText = "";
		field884 = -1;
		field869 = 1;
		loginIndex = 0;
		Login_response0 = "";
		Login_response1 = "";
		Login_response2 = "";
		Login_response3 = "";
		Login_username = "";
		Login_password = "";
		field904 = false;
		field895 = false;
		field900 = true;
		currentLoginField = 0;
		worldSelectOpen = false;
		hoveredWorldIndex = -1;
		worldSelectPage = 0;
		worldSelectPagesCount = 0;
		new DecimalFormat("##0.00");
		new class111();
		field885 = -1L;
		field905 = -1L;
		field890 = new String[]{"title.jpg"};
		field907 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-235084475"
	)
	static void method1930() {
		if (Login_username == null || Login_username.length() <= 0) {
			if (WorldMapDecorationType.clientPreferences.rememberedUsername != null) {
				Login_username = WorldMapDecorationType.clientPreferences.rememberedUsername;
				Client.Login_isUsernameRemembered = true;
			} else {
				Client.Login_isUsernameRemembered = false;
			}

		}
	}
}
