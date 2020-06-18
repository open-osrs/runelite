import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ag")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("h")
	static int[] field198;
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		signature = "Lig;"
	)
	@Export("archive5")
	static Archive archive5;
	@ObfuscatedName("lj")
	@ObfuscatedGetter(
		intValue = 677341381
	)
	@Export("menuX")
	static int menuX;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 2128861857
	)
	@Export("width")
	int width;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1397318075
	)
	@Export("height")
	int height;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -2033449825
	)
	@Export("x")
	int x;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 2045769543
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		signature = "Laa;"
	)
	final WorldMapManager this$0;

	@ObfuscatedSignature(
		signature = "(Laa;)V"
	)
	WorldMapRectangle(WorldMapManager var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(III)I",
		garbageValue = "-429068240"
	)
	public static int method347(int var0, int var1) {
		int var2 = var0 >>> 31;
		return (var0 + var2) / var1 - var2;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(ZI)V",
		garbageValue = "-349989095"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		Login.Login_response1 = "";
		Login.Login_response2 = "Enter your username/email & password.";
		Login.Login_response3 = "";
		Login.loginIndex = 2;
		if (var0) {
			Login.Login_password = "";
		}

		if (Login.Login_username == null || Login.Login_username.length() <= 0) {
			if (NetSocket.clientPreferences.rememberedUsername != null) {
				Login.Login_username = NetSocket.clientPreferences.rememberedUsername;
				Client.Login_isUsernameRemembered = true;
			} else {
				Client.Login_isUsernameRemembered = false;
			}
		}

		class22.method225();
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Lhd;IIII)V",
		garbageValue = "-127200615"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field2679 == null) {
			throw new RuntimeException();
		} else {
			var0.field2679[var1] = var2;
			var0.field2680[var1] = var3;
		}
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		signature = "(IIIILlz;Lhh;I)V",
		garbageValue = "866321883"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, Sprite var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2;
		if (var6 > 4225 && var6 < 90000) {
			int var7 = Client.camAngleY & 2047;
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7];
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7];
			int var10 = var3 * var8 + var9 * var2 >> 16;
			int var11 = var3 * var9 - var8 * var2 >> 16;
			double var12 = Math.atan2((double)var10, (double)var11);
			int var14 = var5.width / 2 - 25;
			int var15 = (int)(Math.sin(var12) * (double)var14);
			int var16 = (int)(Math.cos(var12) * (double)var14);
			byte var17 = 20;
			UrlRequester.redHintArrowSprite.method6435(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
		} else {
			GrandExchangeOffer.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5);
		}

	}
}
