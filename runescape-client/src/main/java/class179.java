import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
public class class179 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	static final class179 field2100;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	static final class179 field2099;
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("archive19")
	static Archive archive19;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1748165695
	)
	@Export("value")
	final int value;

	static {
		field2100 = new class179(0); // L: 4
		field2099 = new class179(1); // L: 5
	}

	class179(int var1) {
		this.value = var1; // L: 9
	} // L: 10

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljp;II)V",
		garbageValue = "-2058248289"
	)
	static void method3633(Archive var0, int var1) {
		if (class125.NetCache_reference != null) { // L: 60
			class125.NetCache_reference.offset = var1 * 8 + 5; // L: 61
			int var2 = class125.NetCache_reference.readInt(); // L: 62
			int var3 = class125.NetCache_reference.readInt(); // L: 63
			var0.loadIndex(var2, var3); // L: 64
		} else {
			DirectByteArrayCopier.requestNetFile((Archive)null, 255, 255, 0, (byte)0, true); // L: 67
			NetCache.NetCache_archives[var1] = var0; // L: 68
		}
	} // L: 65 69

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljv;Ljv;ZII)V",
		garbageValue = "-905944907"
	)
	static void method3634(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) { // L: 128
			if (var3 == 4) { // L: 129
				Login.loginIndex = 4; // L: 130
			}

		} else {
			Login.loginIndex = var3; // L: 134
			Rasterizer2D.Rasterizer2D_clear(); // L: 135
			byte[] var4 = var0.takeFileByNames("title.jpg", ""); // L: 136
			Login.leftTitleSprite = ParamComposition.convertJpgToSprite(var4); // L: 137
			class20.rightTitleSprite = Login.leftTitleSprite.mirrorHorizontally(); // L: 138
			GrandExchangeOfferAgeComparator.method5068(var1, Client.worldProperties); // L: 139
			class260.titleboxSprite = EnumComposition.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", ""); // L: 140
			Login.titlebuttonSprite = EnumComposition.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", ""); // L: 141
			int var6 = var1.getGroupId("runes"); // L: 144
			int var7 = var1.getFileId(var6, ""); // L: 145
			IndexedSprite[] var5 = VerticalAlignment.method2799(var1, var6, var7); // L: 146
			Login.runesSprite = var5; // L: 148
			var7 = var1.getGroupId("title_mute"); // L: 151
			int var8 = var1.getFileId(var7, ""); // L: 152
			IndexedSprite[] var9 = VerticalAlignment.method2799(var1, var7, var8); // L: 153
			Decimator.title_muteSprite = var9; // L: 155
			FriendSystem.options_buttons_0Sprite = EnumComposition.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", ""); // L: 156
			Decimator.field553 = EnumComposition.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", ""); // L: 157
			GrandExchangeOffer.options_buttons_2Sprite = EnumComposition.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", ""); // L: 158
			ClanChannel.field33 = EnumComposition.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", ""); // L: 159
			Skeleton.field2287 = FriendSystem.options_buttons_0Sprite.subWidth; // L: 160
			WorldMapIcon_1.field1937 = FriendSystem.options_buttons_0Sprite.subHeight; // L: 161
			class24.loginScreenRunesAnimation = new LoginScreenAnimation(Login.runesSprite); // L: 162
			if (var2) { // L: 163
				Login.Login_username = ""; // L: 164
				Login.Login_password = ""; // L: 165
			}

			class5.field53 = 0; // L: 167
			Varps.otp = ""; // L: 168
			Login.field1043 = true; // L: 169
			Login.worldSelectOpen = false; // L: 170
			if (!ObjectComposition.clientPreferences.titleMusicDisabled) { // L: 171
				class6.method60(2, UrlRequest.archive6, "scape main", "", 255, false);
			} else {
				class159.method3192(2); // L: 172
			}

			StudioGame.method4847(false); // L: 173
			Login.clearLoginScreen = true; // L: 174
			Login.xPadding = (class32.canvasWidth - 765) / 2; // L: 175
			Login.loginBoxX = Login.xPadding + 202; // L: 176
			UserComparator4.loginBoxCenter = Login.loginBoxX + 180; // L: 177
			Login.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 178
			class20.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 179
			Fonts.logoSprite.drawAt(Login.xPadding + 382 - Fonts.logoSprite.subWidth / 2, 18); // L: 180
		}
	} // L: 132 181

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIS)I",
		garbageValue = "4030"
	)
	public static int method3635(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) { // L: 17
			int var6 = var3; // L: 18
			var3 = var4; // L: 19
			var4 = var6; // L: 20
		}

		var2 &= 3; // L: 22
		if (var2 == 0) { // L: 23
			return var1;
		} else if (var2 == 1) { // L: 24
			return 7 - var0 - (var3 - 1);
		} else {
			return var2 == 2 ? 7 - var1 - (var4 - 1) : var0; // L: 25
		}
	}
}
