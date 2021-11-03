import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bc")
@Implements("Login")
public class Login {
	@ObfuscatedName("sx")
	@ObfuscatedGetter(
		intValue = -1142922893
	)
	static int field888;
	@ObfuscatedName("w")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1881631583
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "[Loe;"
	)
	@Export("runesSprite")
	static IndexedSprite[] runesSprite;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	@Export("titlebuttonSprite")
	static IndexedSprite titlebuttonSprite;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	static IndexedSprite field854;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	static IndexedSprite field868;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 797188883
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1992009983
	)
	@Export("loginBoxCenter")
	static int loginBoxCenter;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1093783929
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("h")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -363966187
	)
	static int field866;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 145692399
	)
	static int field865;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1403617165
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("aa")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("ay")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("bg")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("bl")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("bx")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("bd")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("br")
	static boolean field873;
	@ObfuscatedName("bj")
	static boolean field860;
	@ObfuscatedName("bu")
	static boolean field875;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1227235195
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("bp")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -1790436313
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 1898699407
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -1924078953
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		longValue = 499385346435017525L
	)
	static long field876;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		longValue = 5345571883375832633L
	)
	static long field884;
	@ObfuscatedName("cd")
	static String[] field885;
	@ObfuscatedName("cj")
	static String[] field871;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		longValue = -5916182875581069641L
	)
	static long field889;
	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("fontBold12")
	static Font fontBold12;

	static {
		xPadding = 0; // L: 39
		loginBoxX = xPadding + 202; // L: 58
		Login_loadingPercent = 10;
		Login_loadingText = "";
		field866 = -1; // L: 79
		field865 = 1; // L: 82
		loginIndex = 0; // L: 86
		Login_response0 = ""; // L: 87
		Login_response1 = ""; // L: 88
		Login_response2 = ""; // L: 89
		Login_response3 = ""; // L: 90
		Login_username = ""; // L: 91
		Login_password = ""; // L: 92
		field873 = false; // L: 99
		field860 = false;
		field875 = true;
		currentLoginField = 0;
		worldSelectOpen = false;
		hoveredWorldIndex = -1; // L: 116
		worldSelectPage = 0; // L: 117
		worldSelectPagesCount = 0; // L: 118
		new DecimalFormat("##0.00"); // L: 121
		new class111();
		field876 = -1L; // L: 129
		field884 = -1L; // L: 130
		field885 = new String[]{"title.jpg"}; // L: 133
		field871 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
	} // L: 136

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)[Lcr;",
		garbageValue = "814491633"
	)
	static AttackOption[] method1950() {
		return new AttackOption[]{AttackOption.AttackOption_hidden, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_alwaysRightClick, AttackOption.field1228, AttackOption.field1226}; // L: 12072
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "485926741"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null; // L: 100

		try {
			var0 = DevicePcmPlayerProvider.getPreferencesFile("", RouteStrategy.field1986.name, true); // L: 102
			Buffer var1 = class408.clientPreferences.toBuffer(); // L: 103
			var0.write(var1.array, 0, var1.offset); // L: 104
		} catch (Exception var3) { // L: 106
		}

		try {
			if (var0 != null) { // L: 108
				var0.closeSync(true); // L: 109
			}
		} catch (Exception var2) { // L: 112
		}

	} // L: 113

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-126"
	)
	static void method1952() {
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 59
			if (ArchiveDiskActionHandler.field3662 == 0) { // L: 60
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 61
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 62
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start(); // L: 63
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5); // L: 64
			}

			ArchiveDiskActionHandler.field3662 = 600; // L: 66
		}
	} // L: 68
}
