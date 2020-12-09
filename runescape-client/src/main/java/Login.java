import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cp")
@Implements("Login")
public class Login {
	@ObfuscatedName("v")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1016567537
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("titlebuttonSprite")
	static IndexedSprite titlebuttonSprite;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "[Llo;"
	)
	@Export("title_muteSprite")
	static IndexedSprite[] title_muteSprite;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1536172433
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 998116607
	)
	@Export("loginBoxCenter")
	static int loginBoxCenter;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 306504333
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("s")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1412635043
	)
	static int field1199;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2065092859
	)
	static int field1190;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 107403273
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("ah")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("am")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("aa")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("ao")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("ab")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("aw")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("ar")
	static boolean field1192;
	@ObfuscatedName("az")
	static boolean field1180;
	@ObfuscatedName("by")
	static boolean field1200;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1147044109
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("bf")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1824198351
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1471948757
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1925512311
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		longValue = -8936390045791734837L
	)
	static long field1208;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		longValue = -247323236330071045L
	)
	static long field1209;

	static {
		xPadding = 0;
		loginBoxX = xPadding + 202;
		Login_loadingPercent = 10;
		Login_loadingText = "";
		field1199 = -1;
		field1190 = 1;
		loginIndex = 0;
		Login_response0 = "";
		Login_response1 = "";
		Login_response2 = "";
		Login_response3 = "";
		Login_username = "";
		Login_password = "";
		field1192 = false;
		field1180 = false;
		field1200 = true;
		currentLoginField = 0;
		worldSelectOpen = false;
		hoveredWorldIndex = -1;
		worldSelectPage = 0;
		worldSelectPagesCount = 0;
		new DecimalFormat("##0.00");
		new class171();
		field1208 = -1L;
		field1209 = -1L;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1905829152"
	)
	static int method2152() {
		return ++Messages.Messages_count - 1;
	}
}
