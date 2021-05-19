import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
public class class169 implements WorldMapSection {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -782257189
	)
	int field2017;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 909746241
	)
	int field2013;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1319843895
	)
	int field2014;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -920944403
	)
	int field2015;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1564454979
	)
	int field2019;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -734700081
	)
	int field2016;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1538730207
	)
	int field2012;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -2021929301
	)
	int field2018;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1236356559
	)
	int field2020;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -86863827
	)
	int field2021;

	class169() {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lfe;I)V",
		garbageValue = "-1549282997"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2019) { // L: 21
			var1.regionLowX = this.field2019;
		}

		if (var1.regionHighX < this.field2019) {
			var1.regionHighX = this.field2019; // L: 22
		}

		if (var1.regionLowY > this.field2016) { // L: 23
			var1.regionLowY = this.field2016;
		}

		if (var1.regionHighY < this.field2016) { // L: 24
			var1.regionHighY = this.field2016;
		}

	} // L: 25

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1758075186"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field2017 && var1 < this.field2013 + this.field2017) { // L: 28
			return var2 >= (this.field2014 << 6) + (this.field2012 << 3) && var2 <= (this.field2014 << 6) + (this.field2012 << 3) + 7 && var3 >= (this.field2015 << 6) + (this.field2018 << 3) && var3 <= (this.field2015 << 6) + (this.field2018 << 3) + 7; // L: 31
		} else {
			return false; // L: 29
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "226487857"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field2019 << 6) + (this.field2020 << 3) && var1 <= (this.field2019 << 6) + (this.field2020 << 3) + 7 && var2 >= (this.field2016 << 6) + (this.field2021 << 3) && var2 <= (this.field2016 << 6) + (this.field2021 << 3) + 7; // L: 35
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "118"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 39
			return null; // L: 40
		} else {
			int[] var4 = new int[]{var2 + (this.field2019 * 64 - this.field2014 * 64) + (this.field2020 * 8 - this.field2012 * 8), var3 + (this.field2016 * 64 - this.field2015 * 64) + (this.field2021 * 8 - this.field2018 * 8)}; // L: 43 44
			return var4; // L: 45
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(III)Lia;",
		garbageValue = "-400477740"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 49
			return null; // L: 50
		} else {
			int var3 = this.field2014 * 64 - this.field2019 * 64 + (this.field2012 * 8 - this.field2020 * 8) + var1; // L: 52
			int var4 = var2 + (this.field2015 * 64 - this.field2016 * 64) + (this.field2018 * 8 - this.field2021 * 8); // L: 53
			return new Coord(this.field2017, var3, var4); // L: 54
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lnk;B)V",
		garbageValue = "45"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field2017 = var1.readUnsignedByte(); // L: 58
		this.field2013 = var1.readUnsignedByte(); // L: 59
		this.field2014 = var1.readUnsignedShort(); // L: 60
		this.field2012 = var1.readUnsignedByte(); // L: 61
		this.field2015 = var1.readUnsignedShort(); // L: 62
		this.field2018 = var1.readUnsignedByte(); // L: 63
		this.field2019 = var1.readUnsignedShort(); // L: 64
		this.field2020 = var1.readUnsignedByte(); // L: 65
		this.field2016 = var1.readUnsignedShort(); // L: 66
		this.field2021 = var1.readUnsignedByte(); // L: 67
		this.method3477(); // L: 68
	} // L: 69

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-910102378"
	)
	void method3477() {
	} // L: 71

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1096176570"
	)
	static String method3495(int var0) {
		return "<img=" + var0 + ">"; // L: 18
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljp;ZII)V",
		garbageValue = "878052857"
	)
	static void method3494(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) { // L: 147
			if (var3 == 4) { // L: 148
				Login.loginIndex = 4; // L: 149
			}

		} else {
			Login.loginIndex = var3; // L: 153
			Rasterizer2D.Rasterizer2D_clear(); // L: 154
			byte[] var4 = var0.takeFileByNames("title.jpg", ""); // L: 155
			Canvas.leftTitleSprite = WorldMapAreaData.convertJpgToSprite(var4); // L: 156
			class12.rightTitleSprite = Canvas.leftTitleSprite.mirrorHorizontally(); // L: 157
			int var5 = Client.worldProperties; // L: 158
			if ((var5 & 536870912) != 0) { // L: 160
				FontName.logoSprite = MenuAction.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", ""); // L: 161
			} else if ((var5 & 1073741824) != 0) { // L: 163
				FontName.logoSprite = MenuAction.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", ""); // L: 164
			} else {
				FontName.logoSprite = MenuAction.SpriteBuffer_getIndexedSpriteByName(var1, "logo", ""); // L: 167
			}

			ItemContainer.titleboxSprite = MenuAction.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", ""); // L: 170
			Login.titlebuttonSprite = MenuAction.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", ""); // L: 171
			Login.runesSprite = GameObject.method4235(var1, "runes", ""); // L: 172
			FontName.title_muteSprite = GameObject.method4235(var1, "title_mute", ""); // L: 173
			GrandExchangeOfferUnitPriceComparator.options_buttons_0Sprite = MenuAction.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", ""); // L: 174
			InterfaceParent.field1134 = MenuAction.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", ""); // L: 175
			GrandExchangeEvent.options_buttons_2Sprite = MenuAction.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", ""); // L: 176
			class225.field2684 = MenuAction.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", ""); // L: 177
			TaskHandler.field1466 = GrandExchangeOfferUnitPriceComparator.options_buttons_0Sprite.subWidth; // L: 178
			class125.field1456 = GrandExchangeOfferUnitPriceComparator.options_buttons_0Sprite.subHeight; // L: 179
			AttackOption.loginScreenRunesAnimation = new LoginScreenAnimation(Login.runesSprite); // L: 180
			if (var2) { // L: 181
				Login.Login_username = ""; // L: 182
				Login.Login_password = ""; // L: 183
			}

			PendingSpawn.field1204 = 0; // L: 185
			class16.otp = ""; // L: 186
			Login.field1008 = true; // L: 187
			Login.worldSelectOpen = false; // L: 188
			if (!class12.clientPreferences.titleMusicDisabled) { // L: 189
				Archive var6 = class29.archive6; // L: 190
				int var7 = var6.getGroupId("scape main"); // L: 192
				int var8 = var6.getFileId(var7, ""); // L: 193
				class229.method4321(2, var6, var7, var8, 255, false); // L: 194
			} else {
				class390.method6744(2); // L: 197
			}

			if (NetCache.NetCache_socket != null) { // L: 199
				try {
					Buffer var12 = new Buffer(4); // L: 201
					var12.writeByte(3); // L: 202
					var12.writeMedium(0); // L: 203
					NetCache.NetCache_socket.write(var12.array, 0, 4); // L: 204
				} catch (IOException var11) {
					try {
						NetCache.NetCache_socket.close(); // L: 208
					} catch (Exception var10) { // L: 210
					}

					++NetCache.NetCache_ioExceptions; // L: 211
					NetCache.NetCache_socket = null; // L: 212
				}
			}

			Login.clearLoginScreen = true; // L: 215
			Login.xPadding = (GameEngine.canvasWidth - 765) / 2; // L: 216
			Login.loginBoxX = Login.xPadding + 202; // L: 217
			class21.loginBoxCenter = Login.loginBoxX + 180; // L: 218
			Canvas.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 219
			class12.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 220
			FontName.logoSprite.drawAt(Login.xPadding + 382 - FontName.logoSprite.subWidth / 2, 18); // L: 221
		}
	} // L: 151 222

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1486014533"
	)
	public static void method3493() {
		VarpDefinition.VarpDefinition_cached.clear(); // L: 41
	} // L: 42
}
