import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
@Implements("Login")
public class Login {
	@ObfuscatedName("c")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 559672353
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "[Loi;"
	)
	@Export("runesSprite")
	static IndexedSprite[] runesSprite;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	@Export("titlebuttonSprite")
	static IndexedSprite titlebuttonSprite;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lcn;"
	)
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1729619027
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1908760531
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("w")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -267030897
	)
	static int field874;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 504956167
	)
	static int field883;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1833095583
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("af")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("ax")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("bd")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("bt")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("bf")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("bp")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("be")
	static boolean field891;
	@ObfuscatedName("bq")
	static boolean field904;
	@ObfuscatedName("bk")
	static boolean field893;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 445492341
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("bg")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -333225241
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -1733678977
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 2104871065
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		longValue = 5033881165607082799L
	)
	static long field902;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		longValue = -6780688488603410813L
	)
	static long field875;
	@ObfuscatedName("cc")
	static String[] field869;
	@ObfuscatedName("cn")
	static String[] field892;

	static {
		xPadding = 0;
		loginBoxX = xPadding + 202;
		Login_loadingPercent = 10;
		Login_loadingText = "";
		field874 = -1;
		field883 = 1;
		loginIndex = 0;
		Login_response0 = "";
		Login_response1 = "";
		Login_response2 = "";
		Login_response3 = "";
		Login_username = "";
		Login_password = "";
		field891 = false;
		field904 = false;
		field893 = true;
		currentLoginField = 0;
		worldSelectOpen = false;
		hoveredWorldIndex = -1;
		worldSelectPage = 0;
		worldSelectPagesCount = 0;
		new DecimalFormat("##0.00");
		new class111();
		field902 = -1L;
		field875 = -1L;
		field869 = new String[]{"title.jpg"};
		field892 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1599063881"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
			int var3 = GraphicsObject.getTileHeight(var0, var1, class391.Client_plane) - var2;
			var0 -= WorldMapSection2.cameraX;
			var3 -= SpotAnimationDefinition.cameraY;
			var1 -= DevicePcmPlayerProvider.cameraZ;
			int var4 = Rasterizer3D.Rasterizer3D_sine[ApproximateRouteStrategy.cameraPitch];
			int var5 = Rasterizer3D.Rasterizer3D_cosine[ApproximateRouteStrategy.cameraPitch];
			int var6 = Rasterizer3D.Rasterizer3D_sine[Fonts.cameraYaw];
			int var7 = Rasterizer3D.Rasterizer3D_cosine[Fonts.cameraYaw];
			int var8 = var6 * var1 + var0 * var7 >> 16;
			var1 = var7 * var1 - var0 * var6 >> 16;
			var0 = var8;
			var8 = var5 * var3 - var4 * var1 >> 16;
			var1 = var3 * var4 + var5 * var1 >> 16;
			if (var1 >= 50) {
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2;
				Client.viewportTempY = var8 * Client.viewportZoom / var1 + Client.viewportHeight / 2;
			} else {
				Client.viewportTempX = -1;
				Client.viewportTempY = -1;
			}

		} else {
			Client.viewportTempX = -1;
			Client.viewportTempY = -1;
		}
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "16711935"
	)
	static void method1915() {
		if (Client.oculusOrbState == 1) {
			Client.field741 = true;
		}

	}
}
