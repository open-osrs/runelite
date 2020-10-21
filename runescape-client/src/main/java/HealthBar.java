import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("HealthBar")
public class HealthBar extends Node {
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1819103189
	)
	@Export("ItemDefinition_fileCount")
	public static int ItemDefinition_fileCount;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1100752365
	)
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	@Export("definition")
	HealthBarDefinition definition;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("updates")
	IterableNodeDeque updates;

	@ObfuscatedSignature(
		descriptor = "(Lix;)V"
	)
	HealthBar(HealthBarDefinition var1) {
		this.updates = new IterableNodeDeque(); // L: 12
		this.definition = var1; // L: 15
	} // L: 16

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "184587772"
	)
	@Export("put")
	void put(int var1, int var2, int var3, int var4) {
		HealthBarUpdate var5 = null; // L: 19
		int var6 = 0; // L: 20

		for (HealthBarUpdate var7 = (HealthBarUpdate)this.updates.last(); var7 != null; var7 = (HealthBarUpdate)this.updates.previous()) { // L: 21
			++var6; // L: 22
			if (var7.cycle == var1) { // L: 23
				var7.set(var1, var2, var3, var4); // L: 24
				return; // L: 25
			}

			if (var7.cycle <= var1) { // L: 27
				var5 = var7;
			}
		}

		if (var5 == null) { // L: 29
			if (var6 < 4) { // L: 30
				this.updates.addLast(new HealthBarUpdate(var1, var2, var3, var4));
			}

		} else {
			IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(var1, var2, var3, var4), var5); // L: 33
			if (var6 >= 4) {
				this.updates.last().remove(); // L: 34
			}

		}
	} // L: 31 35

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)Lce;",
		garbageValue = "1695918285"
	)
	@Export("get")
	HealthBarUpdate get(int var1) {
		HealthBarUpdate var2 = (HealthBarUpdate)this.updates.last(); // L: 38
		if (var2 != null && var2.cycle <= var1) { // L: 39
			for (HealthBarUpdate var3 = (HealthBarUpdate)this.updates.previous(); var3 != null && var3.cycle <= var1; var3 = (HealthBarUpdate)this.updates.previous()) { // L: 40 41
				var2.remove(); // L: 42
				var2 = var3; // L: 43
			}

			if (this.definition.int5 + var2.cycle + var2.cycleOffset > var1) { // L: 47
				return var2;
			} else {
				var2.remove(); // L: 49
				return null; // L: 50
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "112420094"
	)
	@Export("isEmpty")
	boolean isEmpty() {
		return this.updates.method4990(); // L: 55
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Liw;Liw;ZII)V",
		garbageValue = "265238448"
	)
	static void method2141(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) { // L: 128
			if (var3 == 4) { // L: 129
				Login.loginIndex = 4; // L: 130
			}

		} else {
			Login.loginIndex = var3; // L: 134
			Rasterizer2D.Rasterizer2D_clear(); // L: 135
			byte[] var4 = var0.takeFileByNames("title.jpg", ""); // L: 136
			Login.leftTitleSprite = class39.convertJpgToSprite(var4); // L: 137
			Login.rightTitleSprite = Login.leftTitleSprite.mirrorHorizontally(); // L: 138
			AbstractArchive.method4386(var1, Client.worldProperties); // L: 139
			Tiles.titleboxSprite = Canvas.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", ""); // L: 140
			Login.titlebuttonSprite = Canvas.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", ""); // L: 141
			int var6 = var1.getGroupId("runes"); // L: 144
			int var7 = var1.getFileId(var6, ""); // L: 145
			IndexedSprite[] var5 = UserComparator5.method3540(var1, var6, var7); // L: 146
			class278.runesSprite = var5; // L: 148
			var7 = var1.getGroupId("title_mute"); // L: 151
			int var8 = var1.getFileId(var7, ""); // L: 152
			IndexedSprite[] var10 = UserComparator5.method3540(var1, var7, var8); // L: 153
			DefaultsGroup.title_muteSprite = var10; // L: 155
			Login.options_buttons_0Sprite = Canvas.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", ""); // L: 156
			class69.field583 = Canvas.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", ""); // L: 157
			Login.options_buttons_2Sprite = Canvas.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", ""); // L: 158
			DevicePcmPlayerProvider.field439 = Canvas.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", ""); // L: 159
			class225.field2576 = Login.options_buttons_0Sprite.subWidth; // L: 160
			class232.field2780 = Login.options_buttons_0Sprite.subHeight; // L: 161
			Login.loginScreenRunesAnimation = new LoginScreenAnimation(class278.runesSprite); // L: 162
			if (var2) { // L: 163
				Login.Login_username = ""; // L: 164
				Login.Login_password = ""; // L: 165
			}

			class169.field2035 = 0; // L: 167
			EnumDefinition.otp = ""; // L: 168
			Login.field1227 = true; // L: 169
			Login.worldSelectOpen = false; // L: 170
			if (!GrandExchangeOfferAgeComparator.clientPreferences.titleMusicDisabled) { // L: 171
				Archive var11 = ApproximateRouteStrategy.archive6; // L: 172
				var8 = var11.getGroupId("scape main"); // L: 174
				int var9 = var11.getFileId(var8, ""); // L: 175
				class206.musicPlayerStatus = 1; // L: 177
				class23.musicTrackArchive = var11; // L: 178
				TileItem.musicTrackGroupId = var8; // L: 179
				class206.musicTrackFileId = var9; // L: 180
				class206.musicTrackVolume = 255; // L: 181
				class195.musicTrackBoolean = false; // L: 182
				MusicPatch.pcmSampleLength = 2; // L: 183
			} else {
				VertexNormal.method3133(2); // L: 187
			}

			WorldMapSection0.method323(false); // L: 188
			Login.clearLoginScreen = true; // L: 189
			Login.xPadding = (ItemContainer.canvasWidth - 765) / 2; // L: 190
			Login.loginBoxX = Login.xPadding + 202; // L: 191
			AttackOption.loginBoxCenter = Login.loginBoxX + 180; // L: 192
			Login.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 193
			Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 194
			SecureRandomFuture.logoSprite.drawAt(Login.xPadding + 382 - SecureRandomFuture.logoSprite.subWidth / 2, 18); // L: 195
		}
	} // L: 132 196

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-614067797"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		Login.Login_response1 = ""; // L: 818
		Login.Login_response2 = "Enter your username/email & password."; // L: 819
		Login.Login_response3 = ""; // L: 820
		Login.loginIndex = 2; // L: 821
		if (var0) { // L: 822
			Login.Login_password = "";
		}

		MusicPatch.method4038(); // L: 823
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 825
			Login.currentLoginField = 1; // L: 826
		} else {
			Login.currentLoginField = 0; // L: 829
		}

	} // L: 832
}
