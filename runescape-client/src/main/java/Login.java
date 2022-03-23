import java.net.MalformedURLException;
import java.net.URL;
import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bv")
@Implements("Login")
public class Login {
	@ObfuscatedName("o")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1208455943
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lqx;"
	)
	static IndexedSprite field882;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lqx;"
	)
	static IndexedSprite field913;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;
	@ObfuscatedName("k")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lcl;"
	)
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1898905069
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -802532583
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("t")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 424820649
	)
	static int field892;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1250677803
	)
	static int field897;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 26859459
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("ap")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("ai")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("bk")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("bz")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("bl")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("be")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	static StudioGame field917;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -864612433
	)
	static int field899;
	@ObfuscatedName("bg")
	static String[] field900;
	@ObfuscatedName("bs")
	static boolean field901;
	@ObfuscatedName("bx")
	static boolean field902;
	@ObfuscatedName("bj")
	static boolean field903;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1722988803
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("cd")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 1052242699
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 971393423
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 2024146027
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		longValue = 939352785293546991L
	)
	static long field911;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		longValue = 1361954428784605633L
	)
	static long field912;
	@ObfuscatedName("cg")
	static String[] field881;
	@ObfuscatedName("cz")
	static String[] field914;

	static {
		xPadding = 0; // L: 47
		loginBoxX = xPadding + 202;
		Login_loadingPercent = 10; // L: 68
		Login_loadingText = ""; // L: 69
		field892 = -1;
		field897 = 1; // L: 90
		loginIndex = 0; // L: 94
		Login_response0 = ""; // L: 95
		Login_response1 = ""; // L: 96
		Login_response2 = ""; // L: 97
		Login_response3 = ""; // L: 98
		Login_username = ""; // L: 99
		Login_password = ""; // L: 100
		field899 = 0; // L: 102
		field900 = new String[8]; // L: 103
		field901 = false; // L: 114
		field902 = false; // L: 115
		field903 = true; // L: 118
		currentLoginField = 0; // L: 119
		worldSelectOpen = false; // L: 123
		hoveredWorldIndex = -1; // L: 131
		worldSelectPage = 0; // L: 132
		worldSelectPagesCount = 0; // L: 133
		new DecimalFormat("##0.00"); // L: 136
		new class120();
		field911 = -1L; // L: 144
		field912 = -1L;
		field881 = new String[]{"title.jpg"}; // L: 148
		field914 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"}; // L: 151
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "2031996356"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		class6.addChatMessage(var0, var1, var2, (String)null); // L: 19
	} // L: 20

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Llq;Llq;ZLmr;I)V",
		garbageValue = "-1379223824"
	)
	public static void method1944(AbstractArchive var0, AbstractArchive var1, boolean var2, Font var3) {
		WorldMapID.ItemDefinition_archive = var0; // L: 84
		GameEngine.ItemDefinition_modelArchive = var1; // L: 85
		HealthBar.ItemDefinition_inMembersWorld = var2; // L: 86
		ArchiveLoader.ItemDefinition_fileCount = WorldMapID.ItemDefinition_archive.getGroupFileCount(10); // L: 87
		class239.ItemDefinition_fontPlain11 = var3; // L: 88
	} // L: 89

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-333067271"
	)
	static boolean method1945(String var0) {
		if (var0 == null) { // L: 138
			return false;
		} else {
			try {
				new URL(var0);
				return true; // L: 145
			} catch (MalformedURLException var2) { // L: 142
				return false; // L: 143
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "105"
	)
	static int method1883(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 28
		if (var2 == null) { // L: 29
			return 0;
		} else if (var1 == -1) { // L: 30
			return 0;
		} else {
			int var3 = 0; // L: 31

			for (int var4 = 0; var4 < var2.quantities.length; ++var4) { // L: 32
				if (var2.ids[var4] == var1) {
					var3 += var2.quantities[var4]; // L: 33
				}
			}

			return var3; // L: 35
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2147483647"
	)
	public static int method1894(int var0) {
		--var0; // L: 61
		var0 |= var0 >>> 1; // L: 62
		var0 |= var0 >>> 2; // L: 63
		var0 |= var0 >>> 4; // L: 64
		var0 |= var0 >>> 8; // L: 65
		var0 |= var0 >>> 16; // L: 66
		return var0 + 1; // L: 67
	}
}
