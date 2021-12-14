import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("if")
public class class253 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	public static final class253 field2918;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	public static final class253 field2911;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	public static final class253 field2912;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	public static final class253 field2913;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	public static final class253 field2914;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	public static final class253 field2915;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	public static final class253 field2916;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	public static final class253 field2917;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	public static final class253 field2920;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	public static final class253 field2919;

	static {
		field2918 = new class253(2);
		field2911 = new class253(4);
		field2912 = new class253(6);
		field2913 = new class253(14);
		field2914 = new class253(5);
		field2915 = new class253(5);
		field2916 = new class253(4);
		field2917 = new class253(3);
		field2920 = new class253(15);
		field2919 = new class253(7);
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2"
	)
	class253(int var1) {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[Lpg;",
		garbageValue = "-850723008"
	)
	@Export("FillMode_values")
	public static FillMode[] FillMode_values() {
		return new FillMode[]{FillMode.SOLID, FillMode.field4552, FillMode.field4553};
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Llx;Llx;Llx;I)V",
		garbageValue = "1280031541"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (class186.canvasWidth - 765) / 2;
		Login.loginBoxX = Login.xPadding + 202;
		class138.loginBoxCenter = Login.loginBoxX + 180;
		if (Login.worldSelectOpen) {
			Language.method5841(var0, var1);
		} else {
			WorldMapCacheName.leftTitleSprite.drawAt(Login.xPadding, 0);
			NPC.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18);
			int var4;
			if (Client.gameState == 0 || Client.gameState == 5) {
				byte var3 = 20;
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1);
				var4 = 253 - var3;
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409);
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150 + Login.Login_loadingPercent * 3, var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0);
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1);
			}

			String var5;
			String var6;
			String var7;
			short var23;
			int var24;
			short var25;
			if (Client.gameState == 20) {
				AbstractByteArrayCopier.titleboxSprite.drawAt(Login.loginBoxX + 180 - AbstractByteArrayCopier.titleboxSprite.subWidth / 2, 271 - AbstractByteArrayCopier.titleboxSprite.subHeight / 2);
				var23 = 201;
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0);
				var24 = var23 + 15;
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0);
				var24 += 15;
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0);
				var24 += 15;
				var24 += 7;
				if (Login.loginIndex != 4 && Login.loginIndex != 10) {
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var24, 16777215, 0);
					var25 = 200;
					var5 = SecureRandomFuture.clientPreferences.hideUsername ? LoginPacket.method5019(Login.Login_username) : Login.Login_username;

					for (var6 = var5; var0.stringWidth(var6) > var25; var6 = var6.substring(0, var6.length() - 1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var6), Login.loginBoxX + 180 - 70, var24, 16777215, 0);
					var24 += 15;

					for (var7 = LoginPacket.method5019(Login.Login_password); var0.stringWidth(var7) > var25; var7 = var7.substring(1)) {
					}

					var0.draw("Password: " + var7, Login.loginBoxX + 180 - 108, var24, 16777215, 0);
					var24 += 15;
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11) {
				AbstractByteArrayCopier.titleboxSprite.drawAt(Login.loginBoxX, 171);
				short var18;
				if (Login.loginIndex == 0) {
					var23 = 251;
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var23, 16776960, 0);
					var24 = var23 + 30;
					var4 = Login.loginBoxX + 180 - 80;
					var18 = 291;
					class19.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
					var0.drawLines("New User", var4 - 73, var18 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var4 = Login.loginBoxX + 180 + 80;
					class19.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
					var0.drawLines("Existing User", var4 - 73, var18 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (Login.loginIndex == 1) {
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0);
					var23 = 236;
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16777215, 0);
					var24 = var23 + 15;
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16777215, 0);
					var24 += 15;
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16777215, 0);
					var24 += 15;
					var4 = Login.loginBoxX + 180 - 80;
					var18 = 321;
					class19.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
					var0.drawCentered("Continue", var4, var18 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180 + 80;
					class19.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
					var0.drawCentered("Cancel", var4, var18 + 5, 16777215, 0);
				} else if (Login.loginIndex == 2) {
					var23 = 201;
					var0.drawCentered(Login.Login_response1, class138.loginBoxCenter, var23, 16776960, 0);
					var24 = var23 + 15;
					var0.drawCentered(Login.Login_response2, class138.loginBoxCenter, var24, 16776960, 0);
					var24 += 15;
					var0.drawCentered(Login.Login_response3, class138.loginBoxCenter, var24, 16776960, 0);
					var24 += 15;
					var24 += 7;
					var0.draw("Login: ", class138.loginBoxCenter - 110, var24, 16777215, 0);
					var25 = 200;
					var5 = SecureRandomFuture.clientPreferences.hideUsername ? LoginPacket.method5019(Login.Login_username) : Login.Login_username;

					for (var6 = var5; var0.stringWidth(var6) > var25; var6 = var6.substring(1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var6) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? UserComparator5.colorStartTag(16776960) + "|" : ""), class138.loginBoxCenter - 70, var24, 16777215, 0);
					var24 += 15;

					for (var7 = LoginPacket.method5019(Login.Login_password); var0.stringWidth(var7) > var25; var7 = var7.substring(1)) {
					}

					var0.draw("Password: " + var7 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? UserComparator5.colorStartTag(16776960) + "|" : ""), class138.loginBoxCenter - 108, var24, 16777215, 0);
					var24 += 15;
					var23 = 277;
					int var8 = class138.loginBoxCenter + -117;
					boolean var10 = Client.Login_isUsernameRemembered;
					boolean var11 = Login.field880;
					IndexedSprite var9 = var10 ? (var11 ? Login.field888 : LoginType.options_buttons_2Sprite) : (var11 ? UserComparator9.field1336 : KeyHandler.options_buttons_0Sprite);
					var9.drawAt(var8, var23);
					var8 = var8 + var9.subWidth + 5;
					var1.draw("Remember username", var8, var23 + 13, 16776960, 0);
					var8 = class138.loginBoxCenter + 24;
					boolean var14 = SecureRandomFuture.clientPreferences.hideUsername;
					boolean var15 = Login.field881;
					IndexedSprite var13 = var14 ? (var15 ? Login.field888 : LoginType.options_buttons_2Sprite) : (var15 ? UserComparator9.field1336 : KeyHandler.options_buttons_0Sprite);
					var13.drawAt(var8, var23);
					var8 = var8 + var13.subWidth + 5;
					var1.draw("Hide username", var8, var23 + 13, 16776960, 0);
					var24 = var23 + 15;
					int var16 = class138.loginBoxCenter - 80;
					short var17 = 321;
					class19.titlebuttonSprite.drawAt(var16 - 73, var17 - 20);
					var0.drawCentered("Login", var16, var17 + 5, 16777215, 0);
					var16 = class138.loginBoxCenter + 80;
					class19.titlebuttonSprite.drawAt(var16 - 73, var17 - 20);
					var0.drawCentered("Cancel", var16, var17 + 5, 16777215, 0);
					var23 = 357;
					switch(Login.field872) {
					case 2:
						class10.field58 = "Having trouble logging in?";
						break;
					default:
						class10.field58 = "Can't login? Click here.";
					}

					WorldMapData_1.field2652 = new Bounds(class138.loginBoxCenter, var23, var1.stringWidth(class10.field58), 11);
					MouseRecorder.field1044 = new Bounds(class138.loginBoxCenter, var23, var1.stringWidth("Still having trouble logging in?"), 11);
					var1.drawCentered(class10.field58, class138.loginBoxCenter, var23, 16777215, 0);
				} else if (Login.loginIndex == 3) {
					var23 = 201;
					var0.drawCentered("Invalid credentials.", Login.loginBoxX + 180, var23, 16776960, 0);
					var24 = var23 + 20;
					var1.drawCentered("For accounts created after 24th November 2010, please use your", Login.loginBoxX + 180, var24, 16776960, 0);
					var24 += 15;
					var1.drawCentered("email address to login. Otherwise please login with your username.", Login.loginBoxX + 180, var24, 16776960, 0);
					var24 += 15;
					var4 = Login.loginBoxX + 180;
					var18 = 276;
					class19.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
					var2.drawCentered("Try again", var4, var18 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180;
					var18 = 326;
					class19.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
					var2.drawCentered("Forgotten password?", var4, var18 + 5, 16777215, 0);
				} else {
					int var20;
					short var27;
					if (Login.loginIndex == 4) {
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0);
						var23 = 236;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16777215, 0);
						var24 = var23 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16777215, 0);
						var24 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16777215, 0);
						var24 += 15;
						var0.draw("PIN: " + LoginPacket.method5019(BufferedSource.otp) + (Client.cycle % 40 < 20 ? UserComparator5.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var24, 16777215, 0);
						var24 -= 8;
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var24, 16776960, 0);
						var24 += 15;
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var24, 16776960, 0);
						var4 = Login.loginBoxX + 180 - 9 + var0.stringWidth("for 30 days: ") + 15;
						int var28 = var24 - var0.ascent;
						IndexedSprite var26;
						if (Login.field882) {
							var26 = LoginType.options_buttons_2Sprite;
						} else {
							var26 = KeyHandler.options_buttons_0Sprite;
						}

						var26.drawAt(var4, var28);
						var24 += 15;
						var20 = Login.loginBoxX + 180 - 80;
						var27 = 321;
						class19.titlebuttonSprite.drawAt(var20 - 73, var27 - 20);
						var0.drawCentered("Continue", var20, var27 + 5, 16777215, 0);
						var20 = Login.loginBoxX + 180 + 80;
						class19.titlebuttonSprite.drawAt(var20 - 73, var27 - 20);
						var0.drawCentered("Cancel", var20, var27 + 5, 16777215, 0);
						var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var27 + 36, 255, 0);
					} else if (Login.loginIndex == 5) {
						var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0);
						var23 = 221;
						var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0);
						var24 = var23 + 15;
						var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0);
						var24 += 15;
						var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0);
						var24 += 15;
						var24 += 14;
						var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var24, 16777215, 0);
						var25 = 174;
						var5 = SecureRandomFuture.clientPreferences.hideUsername ? LoginPacket.method5019(Login.Login_username) : Login.Login_username;

						for (var6 = var5; var0.stringWidth(var6) > var25; var6 = var6.substring(1)) {
						}

						var0.draw(AbstractFont.escapeBrackets(var6) + (Client.cycle % 40 < 20 ? UserComparator5.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var24, 16777215, 0);
						var24 += 15;
						var20 = Login.loginBoxX + 180 - 80;
						var27 = 321;
						class19.titlebuttonSprite.drawAt(var20 - 73, var27 - 20);
						var0.drawCentered("Recover", var20, var27 + 5, 16777215, 0);
						var20 = Login.loginBoxX + 180 + 80;
						class19.titlebuttonSprite.drawAt(var20 - 73, var27 - 20);
						var0.drawCentered("Back", var20, var27 + 5, 16777215, 0);
						var27 = 356;
						var1.drawCentered("Still having trouble logging in?", class138.loginBoxCenter, var27, 268435455, 0);
					} else if (Login.loginIndex == 6) {
						var23 = 201;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0);
						var24 = var23 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0);
						var24 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0);
						var24 += 15;
						var4 = Login.loginBoxX + 180;
						var18 = 321;
						class19.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
						var0.drawCentered("Back", var4, var18 + 5, 16777215, 0);
					} else if (Login.loginIndex == 7) {
						var23 = 216;
						var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var23, 16776960, 0);
						var24 = var23 + 15;
						var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var24, 16776960, 0);
						var24 += 15;
						var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var24, 16776960, 0);
						var24 += 15;
						var4 = Login.loginBoxX + 180 - 80;
						var18 = 321;
						class19.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
						var0.drawCentered("Set Date of Birth", var4, var18 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180 + 80;
						class19.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
						var0.drawCentered("Back", var4, var18 + 5, 16777215, 0);
					} else if (Login.loginIndex == 8) {
						var23 = 216;
						var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var23, 16776960, 0);
						var24 = var23 + 15;
						var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var24, 16776960, 0);
						var24 += 15;
						var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var24, 16776960, 0);
						var24 += 15;
						var4 = Login.loginBoxX + 180 - 80;
						var18 = 321;
						class19.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
						var0.drawCentered("Privacy Policy", var4, var18 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180 + 80;
						class19.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
						var0.drawCentered("Back", var4, var18 + 5, 16777215, 0);
					} else if (Login.loginIndex == 9) {
						var23 = 221;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0);
						var24 = var23 + 25;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0);
						var24 += 25;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0);
						var4 = Login.loginBoxX + 180;
						var18 = 311;
						class19.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
						var0.drawCentered("Try again", var4, var18 + 5, 16777215, 0);
					} else if (Login.loginIndex == 10) {
						var24 = Login.loginBoxX + 180;
						var25 = 209;
						var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var25, 16776960, 0);
						var4 = var25 + 20;
						Login.field894.drawAt(var24 - 109, var4);
						Login.field864.drawAt(var24 - 48, var4 + 18);
					} else if (Login.loginIndex == 12) {
						var24 = class138.loginBoxCenter;
						var25 = 216;
						var2.drawCentered("Before using this app, please read and accept our", var24, var25, 16777215, 0);
						var4 = var25 + 17;
						var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var24, var4, 16777215, 0);
						var4 += 17;
						var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var24, var4, 16777215, 0);
						var4 += 17;
						var2.drawCentered("By accepting, you agree to these documents.", var24, var4, 16777215, 0);
						var24 = class138.loginBoxCenter - 80;
						var25 = 311;
						class19.titlebuttonSprite.drawAt(var24 - 73, var25 - 20);
						var0.drawCentered("Accept", var24, var25 + 5, 16777215, 0);
						var24 = class138.loginBoxCenter + 80;
						class19.titlebuttonSprite.drawAt(var24 - 73, var25 - 20);
						var0.drawCentered("Decline", var24, var25 + 5, 16777215, 0);
					} else if (Login.loginIndex == 13) {
						var23 = 231;
						var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var23, 16777215, 0);
						var24 = var23 + 20;
						var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var24, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var23 = 311;
						class19.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 14) {
						var23 = 201;
						String var19 = "";
						var5 = "";
						var6 = "";
						switch(Login.field871) {
						case 0:
							var19 = "Your account has been disabled.";
							var5 = Strings.field3523;
							var6 = "";
							break;
						case 1:
							var19 = "Account locked as we suspect it has been stolen.";
							var5 = Strings.field3562;
							var6 = "";
							break;
						default:
							class67.Login_promptCredentials(false);
						}

						var0.drawCentered(var19, Login.loginBoxX + 180, var23, 16776960, 0);
						var24 = var23 + 15;
						var2.drawCentered(var5, Login.loginBoxX + 180, var24, 16776960, 0);
						var24 += 15;
						var2.drawCentered(var6, Login.loginBoxX + 180, var24, 16776960, 0);
						var24 += 15;
						var20 = Login.loginBoxX + 180;
						var27 = 276;
						class19.titlebuttonSprite.drawAt(var20 - 73, var27 - 20);
						var0.drawCentered("Support Page", var20, var27 + 5, 16777215, 0);
						var20 = Login.loginBoxX + 180;
						var27 = 326;
						class19.titlebuttonSprite.drawAt(var20 - 73, var27 - 20);
						var0.drawCentered("Back", var20, var27 + 5, 16777215, 0);
					} else if (Login.loginIndex == 24) {
						var23 = 221;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16777215, 0);
						var24 = var23 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16777215, 0);
						var24 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16777215, 0);
						var24 += 15;
						var4 = Login.loginBoxX + 180;
						var18 = 301;
						class19.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
						var0.drawCentered("Ok", var4, var18 + 5, 16777215, 0);
					}
				}
			}

			if (Client.gameState >= 10) {
				int[] var21 = new int[4];
				Rasterizer2D.Rasterizer2D_getClipArray(var21);
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, BoundaryObject.canvasHeight);
				Client.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle);
				Client.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle);
				Rasterizer2D.Rasterizer2D_setClipArray(var21);
			}

			Login.title_muteSprite[SecureRandomFuture.clientPreferences.titleMusicDisabled ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463);
			if (Client.gameState > 5 && ScriptFrame.clientLanguage == Language.Language_EN) {
				if (class21.field118 != null) {
					var24 = Login.xPadding + 5;
					var25 = 463;
					byte var29 = 100;
					byte var22 = 35;
					class21.field118.drawAt(var24, var25);
					var0.drawCentered("World" + " " + Client.worldId, var29 / 2 + var24, var22 / 2 + var25 - 2, 16777215, 0);
					if (HorizontalAlignment.World_request != null) {
						var1.drawCentered("Loading...", var29 / 2 + var24, var22 / 2 + var25 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var29 / 2 + var24, var22 / 2 + var25 + 12, 16777215, 0);
					}
				} else {
					class21.field118 = ClientPreferences.SpriteBuffer_getIndexedSpriteByName(UserComparator6.archive8, "sl_button", "");
				}
			}

		}
	}
}
