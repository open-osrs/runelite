import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kj")
@Implements("ModeWhere")
public enum ModeWhere implements Enumerated {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3715("", 0, new class288[]{class288.field3673}),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3696("", 1, new class288[]{class288.field3674, class288.field3673}),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3697("", 2, new class288[]{class288.field3674, class288.field3672, class288.field3673}),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3700("", 3, new class288[]{class288.field3674}),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3699("", 4),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3708("", 5, new class288[]{class288.field3674, class288.field3673}),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3714("", 6, new class288[]{class288.field3673}),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3702("", 8, new class288[]{class288.field3674, class288.field3673}),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3703("", 9, new class288[]{class288.field3674, class288.field3672}),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3704("", 10, new class288[]{class288.field3674}),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3705("", 11, new class288[]{class288.field3674}),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3706("", 12, new class288[]{class288.field3674, class288.field3673}),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	field3707("", 13, new class288[]{class288.field3674});

	@ObfuscatedName("st")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("ej")
	@ObfuscatedGetter(
		intValue = -622819047
	)
	static int field3713;
	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	static Widget field3698;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1787126939
	)
	@Export("id")
	final int id;
	@ObfuscatedName("a")
	final Set field3709;

	static {
		method5239();
	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Lkr;)V"
	)
	ModeWhere(String var3, int var4, class288[] var5) {
		this.field3709 = new HashSet();
		this.id = var4;
		class288[] var6 = var5;

		for (int var7 = 0; var7 < var6.length; ++var7) {
			class288 var8 = var6[var7];
			this.field3709.add(var8);
		}

	}

	ModeWhere(String var3, int var4) {
		this.field3709 = new HashSet();
		this.id = var4;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1806959663"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljy;Ljy;Ljy;I)V",
		garbageValue = "-744949904"
	)
	public static void method5251(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		HitSplatDefinition.HitSplatDefinition_archive = var0;
		class163.field1913 = var1;
		HitSplatDefinition.HitSplatDefinition_fontsArchive = var2;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljy;Ljy;I)V",
		garbageValue = "1090262769"
	)
	public static void method5237(AbstractArchive var0, AbstractArchive var1) {
		DevicePcmPlayerProvider.HealthBarDefinition_archive = var0;
		HealthBarDefinition.HitSplatDefinition_spritesArchive = var1;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ZZI)Lof;",
		garbageValue = "-1135953364"
	)
	static IndexedSprite method5247(boolean var0, boolean var1) {
		return var0 ? (var1 ? GraphicsDefaults.field3919 : class172.options_buttons_2Sprite) : (var1 ? UserComparator5.field1239 : GrandExchangeOfferOwnWorldComparator.options_buttons_0Sprite);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZI)I",
		garbageValue = "1089223533"
	)
	static int method5243(int var0, Script var1, boolean var2) {
		int var3 = -1;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			var4 = UrlRequester.getWidget(var3);
		} else {
			var4 = var2 ? GrandExchangeOffer.scriptDotWidget : Interpreter.scriptActiveWidget;
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) {
			Interpreter.Interpreter_intStackSize -= 4;
			var4.rawX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var4.rawY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			var4.xAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
			var4.yAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
			AttackOption.invalidateWidget(var4);
			Script.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				AttackOption.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) {
			Interpreter.Interpreter_intStackSize -= 4;
			var4.rawWidth = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var4.rawHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			var4.widthAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
			var4.heightAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
			AttackOption.invalidateWidget(var4);
			Script.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				AttackOption.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) {
			boolean var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
			if (var5 != var4.isHidden) {
				var4.isHidden = var5;
				AttackOption.invalidateWidget(var4);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) {
			var4.noClickThrough = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) {
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Ljava/lang/String;",
		garbageValue = "71"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2];
		int var4 = 0;

		for (int var5 = 0; var5 < var2; ++var5) {
			int var6 = var0[var5 + var1] & 255;
			if (var6 != 0) {
				if (var6 >= 128 && var6 < 160) {
					char var7 = class303.cp1252AsciiExtension[var6 - 128];
					if (var7 == 0) {
						var7 = '?';
					}

					var6 = var7;
				}

				var3[var4++] = (char)var6;
			}
		}

		return new String(var3, 0, var4);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)[Lkj;",
		garbageValue = "48"
	)
	static ModeWhere[] method5239() {
		return new ModeWhere[]{field3705, field3702, field3707, field3700, field3703, field3696, field3714, field3715, field3697, field3699, field3708, field3706, field3704};
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1673386275"
	)
	static void method5238() {
		Login.Login_username = Login.Login_username.trim();
		if (Login.Login_username.length() == 0) {
			Client.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
		} else {
			long var1;
			try {
				URL var3 = new URL(UserComparator5.method2167("services", false) + "m=accountappeal/login.ws");
				URLConnection var4 = var3.openConnection();
				var4.setRequestProperty("connection", "close");
				var4.setDoInput(true);
				var4.setDoOutput(true);
				var4.setConnectTimeout(5000);
				OutputStreamWriter var5 = new OutputStreamWriter(var4.getOutputStream());
				var5.write("data1=req");
				var5.flush();
				InputStream var6 = var4.getInputStream();
				Buffer var7 = new Buffer(new byte[1000]);

				while (true) {
					int var8 = var6.read(var7.array, var7.offset, 1000 - var7.offset);
					if (var8 == -1) {
						var7.offset = 0;
						long var10 = var7.readLong();
						var1 = var10;
						break;
					}

					var7.offset += var8;
					if (var7.offset >= 1000) {
						var1 = 0L;
						break;
					}
				}
			} catch (Exception var14) {
				var1 = 0L;
			}

			int var0;
			if (var1 == 0L) {
				var0 = 5;
			} else {
				var0 = Client.method1381(var1, Login.Login_username);
			}

			switch(var0) {
			case 2:
				Client.setLoginResponseString(Strings.field3495, Strings.field3354, Strings.field3319);
				Login.loginIndex = 6;
				break;
			case 3:
				Client.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 4:
				Client.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
				break;
			case 5:
				Client.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
				break;
			case 6:
				Client.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 7:
				Client.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
			}

		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lkt;Lkt;Lkt;B)V",
		garbageValue = "-64"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (MouseRecorder.canvasWidth - 765) / 2;
		Login.loginBoxX = Login.xPadding + 202;
		WorldMapSection2.loginBoxCenter = Login.loginBoxX + 180;
		if (Login.worldSelectOpen) {
			GraphicsObject.method1646(var0, var1);
		} else {
			Login.leftTitleSprite.drawAt(Login.xPadding, 0);
			Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			UserComparator4.logoSprite.drawAt(Login.xPadding + 382 - UserComparator4.logoSprite.subWidth / 2, 18);
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
			short var16;
			int var17;
			short var18;
			if (Client.gameState == 20) {
				class304.titleboxSprite.drawAt(Login.loginBoxX + 180 - class304.titleboxSprite.subWidth / 2, 271 - class304.titleboxSprite.subHeight / 2);
				var16 = 201;
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var16, 16776960, 0);
				var17 = var16 + 15;
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var17, 16776960, 0);
				var17 += 15;
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var17, 16776960, 0);
				var17 += 15;
				var17 += 7;
				if (Login.loginIndex != 4) {
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var17, 16777215, 0);
					var18 = 200;

					for (var5 = class107.method2292(); var0.stringWidth(var5) > var18; var5 = var5.substring(0, var5.length() - 1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var5), Login.loginBoxX + 180 - 70, var17, 16777215, 0);
					var17 += 15;

					for (var6 = class16.method176(Login.Login_password); var0.stringWidth(var6) > var18; var6 = var6.substring(1)) {
					}

					var0.draw("Password: " + var6, Login.loginBoxX + 180 - 108, var17, 16777215, 0);
					var17 += 15;
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11) {
				class304.titleboxSprite.drawAt(Login.loginBoxX, 171);
				short var11;
				if (Login.loginIndex == 0) {
					var16 = 251;
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var16, 16776960, 0);
					var17 = var16 + 30;
					var4 = Login.loginBoxX + 180 - 80;
					var11 = 291;
					Login.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
					var0.drawLines("New User", var4 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var4 = Login.loginBoxX + 180 + 80;
					Login.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
					var0.drawLines("Existing User", var4 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (Login.loginIndex == 1) {
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0);
					var16 = 236;
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var16, 16777215, 0);
					var17 = var16 + 15;
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var17, 16777215, 0);
					var17 += 15;
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var17, 16777215, 0);
					var17 += 15;
					var4 = Login.loginBoxX + 180 - 80;
					var11 = 321;
					Login.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
					var0.drawCentered("Continue", var4, var11 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180 + 80;
					Login.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
					var0.drawCentered("Cancel", var4, var11 + 5, 16777215, 0);
				} else {
					int var7;
					if (Login.loginIndex == 2) {
						var16 = 201;
						var0.drawCentered(Login.Login_response1, WorldMapSection2.loginBoxCenter, var16, 16776960, 0);
						var17 = var16 + 15;
						var0.drawCentered(Login.Login_response2, WorldMapSection2.loginBoxCenter, var17, 16776960, 0);
						var17 += 15;
						var0.drawCentered(Login.Login_response3, WorldMapSection2.loginBoxCenter, var17, 16776960, 0);
						var17 += 15;
						var17 += 7;
						var0.draw("Login: ", WorldMapSection2.loginBoxCenter - 110, var17, 16777215, 0);
						var18 = 200;

						for (var5 = class107.method2292(); var0.stringWidth(var5) > var18; var5 = var5.substring(1)) {
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? ScriptFrame.colorStartTag(16776960) + "|" : ""), WorldMapSection2.loginBoxCenter - 70, var17, 16777215, 0);
						var17 += 15;

						for (var6 = class16.method176(Login.Login_password); var0.stringWidth(var6) > var18; var6 = var6.substring(1)) {
						}

						var0.draw("Password: " + var6 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? ScriptFrame.colorStartTag(16776960) + "|" : ""), WorldMapSection2.loginBoxCenter - 108, var17, 16777215, 0);
						var17 += 15;
						var16 = 277;
						var7 = WorldMapSection2.loginBoxCenter + -117;
						IndexedSprite var14 = method5247(Client.Login_isUsernameRemembered, Login.field829);
						var14.drawAt(var7, var16);
						var7 = var7 + var14.subWidth + 5;
						var1.draw("Remember username", var7, var16 + 13, 16776960, 0);
						var7 = WorldMapSection2.loginBoxCenter + 24;
						var14 = method5247(Decimator.clientPreferences.hideUsername, Login.field819);
						var14.drawAt(var7, var16);
						var7 = var7 + var14.subWidth + 5;
						var1.draw("Hide username", var7, var16 + 13, 16776960, 0);
						var17 = var16 + 15;
						int var9 = WorldMapSection2.loginBoxCenter - 80;
						short var10 = 321;
						Login.titlebuttonSprite.drawAt(var9 - 73, var10 - 20);
						var0.drawCentered("Login", var9, var10 + 5, 16777215, 0);
						var9 = WorldMapSection2.loginBoxCenter + 80;
						Login.titlebuttonSprite.drawAt(var9 - 73, var10 - 20);
						var0.drawCentered("Cancel", var9, var10 + 5, 16777215, 0);
						var16 = 357;
						switch(Login.field809) {
						case 2:
							World.field703 = "Having trouble logging in?";
							break;
						default:
							World.field703 = "Can't login? Click here.";
						}

						GameEngine.field127 = new Bounds(WorldMapSection2.loginBoxCenter, var16, var1.stringWidth(World.field703), 11);
						class307.field3766 = new Bounds(WorldMapSection2.loginBoxCenter, var16, var1.stringWidth("Still having trouble logging in?"), 11);
						var1.drawCentered(World.field703, WorldMapSection2.loginBoxCenter, var16, 16777215, 0);
					} else if (Login.loginIndex == 3) {
						var16 = 201;
						var0.drawCentered("Invalid credentials.", Login.loginBoxX + 180, var16, 16776960, 0);
						var17 = var16 + 20;
						var1.drawCentered("For accounts created after 24th November 2010, please use your", Login.loginBoxX + 180, var17, 16776960, 0);
						var17 += 15;
						var1.drawCentered("email address to login. Otherwise please login with your username.", Login.loginBoxX + 180, var17, 16776960, 0);
						var17 += 15;
						var4 = Login.loginBoxX + 180;
						var11 = 276;
						Login.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
						var2.drawCentered("Try again", var4, var11 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var11 = 326;
						Login.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
						var2.drawCentered("Forgotten password?", var4, var11 + 5, 16777215, 0);
					} else {
						short var8;
						if (Login.loginIndex == 4) {
							var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0);
							var16 = 236;
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var16, 16777215, 0);
							var17 = var16 + 15;
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var17, 16777215, 0);
							var17 += 15;
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var17, 16777215, 0);
							var17 += 15;
							var0.draw("PIN: " + class16.method176(HorizontalAlignment.otp) + (Client.cycle % 40 < 20 ? ScriptFrame.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var17, 16777215, 0);
							var17 -= 8;
							var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var17, 16776960, 0);
							var17 += 15;
							var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var17, 16776960, 0);
							var4 = 180 + Login.loginBoxX - 9 + var0.stringWidth("for 30 days: ") + 15;
							int var21 = var17 - var0.ascent;
							IndexedSprite var19;
							if (Login.field820) {
								var19 = class172.options_buttons_2Sprite;
							} else {
								var19 = GrandExchangeOfferOwnWorldComparator.options_buttons_0Sprite;
							}

							var19.drawAt(var4, var21);
							var17 += 15;
							var7 = Login.loginBoxX + 180 - 80;
							var8 = 321;
							Login.titlebuttonSprite.drawAt(var7 - 73, var8 - 20);
							var0.drawCentered("Continue", var7, var8 + 5, 16777215, 0);
							var7 = Login.loginBoxX + 180 + 80;
							Login.titlebuttonSprite.drawAt(var7 - 73, var8 - 20);
							var0.drawCentered("Cancel", var7, var8 + 5, 16777215, 0);
							var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var8 + 36, 255, 0);
						} else if (Login.loginIndex == 5) {
							var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0);
							var16 = 221;
							var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var16, 16776960, 0);
							var17 = var16 + 15;
							var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var17, 16776960, 0);
							var17 += 15;
							var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var17, 16776960, 0);
							var17 += 15;
							var17 += 14;
							var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var17, 16777215, 0);
							var18 = 174;

							for (var5 = class107.method2292(); var0.stringWidth(var5) > var18; var5 = var5.substring(1)) {
							}

							var0.draw(AbstractFont.escapeBrackets(var5) + (Client.cycle % 40 < 20 ? ScriptFrame.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var17, 16777215, 0);
							var17 += 15;
							int var13 = Login.loginBoxX + 180 - 80;
							short var20 = 321;
							Login.titlebuttonSprite.drawAt(var13 - 73, var20 - 20);
							var0.drawCentered("Recover", var13, var20 + 5, 16777215, 0);
							var13 = Login.loginBoxX + 180 + 80;
							Login.titlebuttonSprite.drawAt(var13 - 73, var20 - 20);
							var0.drawCentered("Back", var13, var20 + 5, 16777215, 0);
							var20 = 356;
							var1.drawCentered("Still having trouble logging in?", WorldMapSection2.loginBoxCenter, var20, 268435455, 0);
						} else if (Login.loginIndex == 6) {
							var16 = 201;
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var16, 16776960, 0);
							var17 = var16 + 15;
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var17, 16776960, 0);
							var17 += 15;
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var17, 16776960, 0);
							var17 += 15;
							var4 = Login.loginBoxX + 180;
							var11 = 321;
							Login.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
							var0.drawCentered("Back", var4, var11 + 5, 16777215, 0);
						} else if (Login.loginIndex == 7) {
							var16 = 216;
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var16, 16776960, 0);
							var17 = var16 + 15;
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var17, 16776960, 0);
							var17 += 15;
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var17, 16776960, 0);
							var17 += 15;
							var4 = Login.loginBoxX + 180 - 80;
							var11 = 321;
							Login.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
							var0.drawCentered("Set Date of Birth", var4, var11 + 5, 16777215, 0);
							var4 = Login.loginBoxX + 180 + 80;
							Login.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
							var0.drawCentered("Back", var4, var11 + 5, 16777215, 0);
						} else if (Login.loginIndex == 8) {
							var16 = 216;
							var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var16, 16776960, 0);
							var17 = var16 + 15;
							var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var17, 16776960, 0);
							var17 += 15;
							var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var17, 16776960, 0);
							var17 += 15;
							var4 = Login.loginBoxX + 180 - 80;
							var11 = 321;
							Login.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
							var0.drawCentered("Privacy Policy", var4, var11 + 5, 16777215, 0);
							var4 = Login.loginBoxX + 180 + 80;
							Login.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
							var0.drawCentered("Back", var4, var11 + 5, 16777215, 0);
						} else if (Login.loginIndex == 12) {
							var16 = 201;
							String var12 = "";
							var5 = "";
							var6 = "";
							switch(Login.field804) {
							case 0:
								var12 = "Your account has been disabled.";
								var5 = Strings.field3298;
								var6 = "";
								break;
							case 1:
								var12 = "Account locked as we suspect it has been stolen.";
								var5 = Strings.field3467;
								var6 = "";
								break;
							default:
								class107.Login_promptCredentials(false);
							}

							var0.drawCentered(var12, Login.loginBoxX + 180, var16, 16776960, 0);
							var17 = var16 + 15;
							var2.drawCentered(var5, Login.loginBoxX + 180, var17, 16776960, 0);
							var17 += 15;
							var2.drawCentered(var6, Login.loginBoxX + 180, var17, 16776960, 0);
							var17 += 15;
							var7 = Login.loginBoxX + 180;
							var8 = 276;
							Login.titlebuttonSprite.drawAt(var7 - 73, var8 - 20);
							var0.drawCentered("Support Page", var7, var8 + 5, 16777215, 0);
							var7 = Login.loginBoxX + 180;
							var8 = 326;
							Login.titlebuttonSprite.drawAt(var7 - 73, var8 - 20);
							var0.drawCentered("Back", var7, var8 + 5, 16777215, 0);
						} else if (Login.loginIndex == 24) {
							var16 = 221;
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var16, 16777215, 0);
							var17 = var16 + 15;
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var17, 16777215, 0);
							var17 += 15;
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var17, 16777215, 0);
							var17 += 15;
							var4 = Login.loginBoxX + 180;
							var11 = 301;
							Login.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
							var0.drawCentered("Ok", var4, var11 + 5, 16777215, 0);
						}
					}
				}
			}

			if (Client.gameState >= 10) {
				int[] var15 = new int[4];
				Rasterizer2D.Rasterizer2D_getClipArray(var15);
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, Client.canvasHeight);
				class6.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle);
				class6.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle);
				Rasterizer2D.Rasterizer2D_setClipArray(var15);
			}

			FileSystem.title_muteSprite[Decimator.clientPreferences.titleMusicDisabled ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463);
			if (Client.gameState > 5 && GrandExchangeOfferWorldComparator.clientLanguage == Language.Language_EN) {
				if (MidiPcmStream.field2846 != null) {
					var17 = Login.xPadding + 5;
					var18 = 463;
					byte var23 = 100;
					byte var22 = 35;
					MidiPcmStream.field2846.drawAt(var17, var18);
					var0.drawCentered("World" + " " + Client.worldId, var23 / 2 + var17, var22 / 2 + var18 - 2, 16777215, 0);
					if (NPC.World_request != null) {
						var1.drawCentered("Loading...", var23 / 2 + var17, var22 / 2 + var18 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var23 / 2 + var17, var22 / 2 + var18 + 12, 16777215, 0);
					}
				} else {
					MidiPcmStream.field2846 = class117.SpriteBuffer_getIndexedSpriteByName(class270.archive8, "sl_button", "");
				}
			}

		}
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-892538682"
	)
	static final boolean method5252() {
		return Client.isMenuOpen;
	}
}
