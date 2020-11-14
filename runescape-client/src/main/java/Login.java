import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
@Implements("Login")
public class Login {
	@ObfuscatedName("b")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1744707789
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("titlebuttonSprite")
	static IndexedSprite titlebuttonSprite;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("leftTitleSprite")
	static Sprite leftTitleSprite;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("rightTitleSprite")
	static Sprite rightTitleSprite;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("options_buttons_0Sprite")
	static IndexedSprite options_buttons_0Sprite;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("options_buttons_2Sprite")
	static IndexedSprite options_buttons_2Sprite;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lcg;"
	)
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1076468107
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1330731251
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("a")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1371548097
	)
	static int field1216;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 402121111
	)
	static int field1217;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1682315035
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("ai")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("ax")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("ag")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("aq")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("aw")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("an")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("al")
	static boolean field1230;
	@ObfuscatedName("ap")
	static boolean field1229;
	@ObfuscatedName("bf")
	static boolean field1227;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -1450671401
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("bl")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -374959449
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1738897563
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1533348533
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		longValue = -8374739296205492955L
	)
	static long field1223;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		longValue = 3745631578629079475L
	)
	static long field1241;

	static {
		xPadding = 0; // L: 38
		loginBoxX = xPadding + 202; // L: 55
		Login_loadingPercent = 10;
		Login_loadingText = "";
		field1216 = -1; // L: 65
		field1217 = 1; // L: 68
		loginIndex = 0; // L: 72
		Login_response0 = ""; // L: 73
		Login_response1 = ""; // L: 74
		Login_response2 = ""; // L: 75
		Login_response3 = ""; // L: 76
		Login_username = ""; // L: 77
		Login_password = ""; // L: 78
		field1230 = false; // L: 85
		field1229 = false; // L: 86
		field1227 = true; // L: 89
		currentLoginField = 0; // L: 90
		worldSelectOpen = false; // L: 94
		hoveredWorldIndex = -1; // L: 102
		worldSelectPage = 0; // L: 103
		worldSelectPagesCount = 0; // L: 104
		new DecimalFormat("##0.00"); // L: 107
		new class171();
		field1223 = -1L; // L: 115
		field1241 = -1L; // L: 116
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "-1829542828"
	)
	public static String method2219(CharSequence var0) {
		long var3 = 0L; // L: 44
		int var5 = var0.length(); // L: 45

		for (int var6 = 0; var6 < var5; ++var6) { // L: 46
			var3 *= 37L; // L: 47
			char var7 = var0.charAt(var6); // L: 48
			if (var7 >= 'A' && var7 <= 'Z') { // L: 49
				var3 += (long)(var7 + 1 - 65);
			} else if (var7 >= 'a' && var7 <= 'z') { // L: 50
				var3 += (long)(var7 + 1 - 97);
			} else if (var7 >= '0' && var7 <= '9') {
				var3 += (long)(var7 + 27 - 48); // L: 51
			}

			if (var3 >= 177917621779460413L) { // L: 52
				break;
			}
		}

		while (var3 % 37L == 0L && var3 != 0L) { // L: 54
			var3 /= 37L;
		}

		String var8 = class69.base37DecodeLong(var3);
		if (var8 == null) {
			var8 = "";
		}

		return var8;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lmp;"
	)
	@Export("newRunException")
	public static RunException newRunException(Throwable var0, String var1) {
		RunException var2;
		if (var0 instanceof RunException) { // L: 57
			var2 = (RunException)var0; // L: 58
			var2.message = var2.message + ' ' + var1; // L: 59
		} else {
			var2 = new RunException(var0, var1); // L: 61
		}

		return var2; // L: 62
	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-560858239"
	)
	static final void method2200() {
		for (Projectile var0 = (Projectile)Client.projectiles.last(); var0 != null; var0 = (Projectile)Client.projectiles.previous()) { // L: 4878 4879 4896
			if (var0.plane == GrandExchangeOfferUnitPriceComparator.Client_plane && Client.cycle <= var0.cycleEnd) { // L: 4880
				if (Client.cycle >= var0.cycleStart) { // L: 4881
					if (var0.targetIndex > 0) { // L: 4882
						NPC var1 = Client.npcs[var0.targetIndex - 1]; // L: 4883
						if (var1 != null && var1.x >= 0 && var1.x < 13312 && var1.y >= 0 && var1.y < 13312) { // L: 4884
							var0.setDestination(var1.x, var1.y, GrandExchangeOfferWorldComparator.getTileHeight(var1.x, var1.y, var0.plane) - var0.endHeight, Client.cycle);
						}
					}

					if (var0.targetIndex < 0) { // L: 4886
						int var2 = -var0.targetIndex - 1; // L: 4888
						Player var3;
						if (var2 == Client.localPlayerIndex) { // L: 4889
							var3 = PlayerType.localPlayer;
						} else {
							var3 = Client.players[var2]; // L: 4890
						}

						if (var3 != null && var3.x >= 0 && var3.x < 13312 && var3.y >= 0 && var3.y < 13312) {
							var0.setDestination(var3.x, var3.y, GrandExchangeOfferWorldComparator.getTileHeight(var3.x, var3.y, var0.plane) - var0.endHeight, Client.cycle); // L: 4891
						}
					}

					var0.advance(Client.field743); // L: 4893
					ModeWhere.scene.drawEntity(GrandExchangeOfferUnitPriceComparator.Client_plane, (int)var0.x, (int)var0.y, (int)var0.z, 60, var0, var0.yaw, -1L, false); // L: 4894
				}
			} else {
				var0.remove();
			}
		}

	} // L: 4898
}
