import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("w")
	@Export("SpriteBuffer_spritePalette")
	public static int[] SpriteBuffer_spritePalette;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 474414413
	)
	@Export("ItemDefinition_fileCount")
	public static int ItemDefinition_fileCount;
	@ObfuscatedName("dy")
	static boolean field1178;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -816446717
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 499681629
	)
	@Export("health")
	int health;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1965761205
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 2010428701
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 12
		this.health = var2; // L: 13
		this.health2 = var3; // L: 14
		this.cycleOffset = var4; // L: 15
	} // L: 16

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "57"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 19
		this.health = var2; // L: 20
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Lfl;",
		garbageValue = "-224224957"
	)
	@Export("getParamDefinition")
	public static ParamComposition getParamDefinition(int var0) {
		ParamComposition var1 = (ParamComposition)ParamComposition.ParamDefinition_cached.get((long)var0); // L: 21
		if (var1 != null) { // L: 22
			return var1;
		} else {
			byte[] var2 = ParamComposition.ParamDefinition_archive.takeFile(11, var0); // L: 23
			var1 = new ParamComposition(); // L: 24
			if (var2 != null) { // L: 25
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 26
			ParamComposition.ParamDefinition_cached.put(var1, (long)var0); // L: 27
			return var1; // L: 28
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lkq;Lkq;ZIB)V",
		garbageValue = "8"
	)
	static void method2182(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) { // L: 182
			if (var3 == 4) { // L: 183
				Player.method2159(4); // L: 184
			}

		} else {
			if (var3 == 0) { // L: 188
				Tiles.method2027(var2); // L: 189
			} else {
				Player.method2159(var3); // L: 192
			}

			Rasterizer2D.Rasterizer2D_clear(); // L: 194
			byte[] var4 = var0.takeFileByNames("title.jpg", ""); // L: 195
			class260.leftTitleSprite = class125.method2743(var4); // L: 196
			FriendSystem.rightTitleSprite = class260.leftTitleSprite.mirrorHorizontally(); // L: 197
			class131.method2787(var1, Client.worldProperties); // L: 198
			Login.titleboxSprite = class91.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", ""); // L: 199
			class259.titlebuttonSprite = class91.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", ""); // L: 200
			Login.field894 = class91.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", ""); // L: 201
			class138.field1613 = class91.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", ""); // L: 202
			class91.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", ""); // L: 203
			Login.runesSprite = Huffman.method5278(var1, "runes", ""); // L: 204
			class371.title_muteSprite = Huffman.method5278(var1, "title_mute", ""); // L: 205
			Script.options_buttons_0Sprite = class91.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", ""); // L: 206
			class143.field1638 = class91.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", ""); // L: 207
			class1.options_buttons_2Sprite = class91.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", ""); // L: 208
			Bounds.field4220 = class91.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", ""); // L: 209
			FriendSystem.field812 = Script.options_buttons_0Sprite.subWidth; // L: 210
			class133.field1560 = Script.options_buttons_0Sprite.subHeight; // L: 211
			Login.loginScreenRunesAnimation = new LoginScreenAnimation(Login.runesSprite); // L: 212
			if (var2) { // L: 213
				Login.Login_username = ""; // L: 214
				Login.Login_password = ""; // L: 215
			}

			GameObject.field2588 = 0; // L: 217
			class145.otp = ""; // L: 218
			Login.field893 = true; // L: 219
			Login.worldSelectOpen = false; // L: 220
			if (!class424.clientPreferences.titleMusicDisabled) { // L: 221
				Archive var5 = WorldMapLabelSize.archive6; // L: 222
				int var6 = var5.getGroupId("scape main"); // L: 224
				int var7 = var5.getFileId(var6, ""); // L: 225
				class259.method4997(2, var5, var6, var7, 255, false); // L: 226
			} else {
				class259.method4998(2); // L: 229
			}

			UserComparator4.method2434(false); // L: 230
			Login.clearLoginScreen = true; // L: 231
			Login.xPadding = (DirectByteArrayCopier.canvasWidth - 765) / 2; // L: 232
			Login.loginBoxX = Login.xPadding + 202; // L: 233
			class4.loginBoxCenter = Login.loginBoxX + 180; // L: 234
			class260.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 235
			FriendSystem.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 236
			class28.logoSprite.drawAt(Login.xPadding + 382 - class28.logoSprite.subWidth / 2, 18); // L: 237
		}
	} // L: 186 238
}
