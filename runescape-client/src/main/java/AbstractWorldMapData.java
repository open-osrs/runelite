import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("tk")
	@ObfuscatedGetter(
		intValue = -508466371
	)
	static int field2851;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1205484999
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1189289885
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1037344187
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1460800009
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 716017053
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1555977189
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1656704067
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 96165071
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("w")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("b")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("t")
	byte[][][] field2845;
	@ObfuscatedName("g")
	byte[][][] field2847;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "[[[[Liy;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("n")
	boolean field2848;
	@ObfuscatedName("e")
	boolean field2850;

	AbstractWorldMapData() {
		this.groupId = -1; // L: 14
		this.fileId = -1; // L: 15
		new LinkedList();
		this.field2848 = false; // L: 26
		this.field2850 = false;
	} // L: 29

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "933342926"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "39"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field2848 && this.field2850; // L: 32
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Llp;B)V",
		garbageValue = "1"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) { // L: 36
			byte[] var2 = var1.takeFile(this.groupId, this.fileId); // L: 37
			if (var2 != null) { // L: 38
				this.readGeography(new Buffer(var2)); // L: 39
				this.field2848 = true; // L: 40
				this.field2850 = true; // L: 41
			}

		}
	} // L: 43

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2016462267"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null; // L: 46
		this.floorOverlayIds = null; // L: 47
		this.field2845 = null; // L: 48
		this.field2847 = null; // L: 49
		this.decorations = null; // L: 50
		this.field2848 = false; // L: 51
		this.field2850 = false; // L: 52
	} // L: 53

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IILpx;I)V",
		garbageValue = "1843686575"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte(); // L: 56
		if (var4 != 0) { // L: 57
			if ((var4 & 1) != 0) { // L: 60
				this.method4769(var1, var2, var3, var4); // L: 61
			} else {
				this.method4770(var1, var2, var3, var4); // L: 64
			}

		}
	} // L: 58 66

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IILpx;IB)V",
		garbageValue = "18"
	)
	void method4769(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0; // L: 69
		if (var5) { // L: 70
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedByte(); // L: 71
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte(); // L: 73
	} // L: 74

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IILpx;IB)V",
		garbageValue = "44"
	)
	void method4770(int var1, int var2, Buffer var3, int var4) {
		int var5 = ((var4 & 24) >> 3) + 1; // L: 77
		boolean var6 = (var4 & 2) != 0; // L: 78
		boolean var7 = (var4 & 4) != 0; // L: 79
		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte(); // L: 80
		int var8;
		int var9;
		int var11;
		if (var6) { // L: 81
			var8 = var3.readUnsignedByte(); // L: 82

			for (var9 = 0; var9 < var8; ++var9) { // L: 83
				int var14 = var3.readUnsignedByte(); // L: 84
				if (var14 != 0) { // L: 85
					this.floorOverlayIds[var9][var1][var2] = (short)var14; // L: 86
					var11 = var3.readUnsignedByte(); // L: 87
					this.field2845[var9][var1][var2] = (byte)(var11 >> 2); // L: 88
					this.field2847[var9][var1][var2] = (byte)(var11 & 3); // L: 89
				}
			}
		}

		if (var7) { // L: 93
			for (var8 = 0; var8 < var5; ++var8) { // L: 94
				var9 = var3.readUnsignedByte(); // L: 95
				if (var9 != 0) { // L: 96
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9]; // L: 99

					for (var11 = 0; var11 < var9; ++var11) { // L: 100
						int var12 = var3.method7532(); // L: 101
						int var13 = var3.readUnsignedByte(); // L: 102
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3); // L: 103
					}
				}
			}
		}

	} // L: 107

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "608097340"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX; // L: 112
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2122627873"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY; // L: 116
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Lkt;",
		garbageValue = "406038723"
	)
	public static GameBuild method4799(int var0) {
		GameBuild[] var1 = new GameBuild[]{GameBuild.LIVE, GameBuild.BUILDLIVE, GameBuild.WIP, GameBuild.RC}; // L: 21
		GameBuild[] var2 = var1; // L: 23

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 24
			GameBuild var4 = var2[var3]; // L: 25
			if (var0 == var4.buildId) { // L: 27
				return var4;
			}
		}

		return null; // L: 31
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Llp;Llp;ZII)V",
		garbageValue = "-598382128"
	)
	static void method4800(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) { // L: 183
			if (var3 == 4) { // L: 184
				class126.method2799(4); // L: 185
			}

		} else {
			if (var3 == 0) { // L: 189
				WorldMapData_1.method4706(var2); // L: 190
			} else {
				class126.method2799(var3); // L: 193
			}

			Rasterizer2D.Rasterizer2D_clear(); // L: 195
			byte[] var4 = var0.takeFileByNames("title.jpg", ""); // L: 196
			UserComparator6.leftTitleSprite = Frames.method4217(var4); // L: 197
			SecureRandomCallable.rightTitleSprite = UserComparator6.leftTitleSprite.mirrorHorizontally(); // L: 198
			int var5 = Client.worldProperties; // L: 199
			if ((var5 & 536870912) != 0) { // L: 201
				Clock.logoSprite = JagexCache.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", ""); // L: 202
			} else if ((var5 & 1073741824) != 0) { // L: 204
				Clock.logoSprite = JagexCache.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", ""); // L: 205
			} else {
				Clock.logoSprite = JagexCache.SpriteBuffer_getIndexedSpriteByName(var1, "logo", ""); // L: 208
			}

			Login.titleboxSprite = JagexCache.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", ""); // L: 211
			Login.titlebuttonSprite = JagexCache.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", ""); // L: 212
			Clock.field1839 = JagexCache.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", ""); // L: 213
			Login.field882 = JagexCache.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", ""); // L: 214
			JagexCache.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", ""); // L: 215
			int var7 = var1.getGroupId("runes"); // L: 218
			int var8 = var1.getFileId(var7, ""); // L: 219
			IndexedSprite[] var6 = ItemContainer.method2062(var1, var7, var8); // L: 220
			Login.runesSprite = var6; // L: 222
			var8 = var1.getGroupId("title_mute"); // L: 225
			int var9 = var1.getFileId(var8, ""); // L: 226
			IndexedSprite[] var11 = ItemContainer.method2062(var1, var8, var9); // L: 227
			class358.title_muteSprite = var11; // L: 229
			class67.options_buttons_0Sprite = JagexCache.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", ""); // L: 230
			Login.field888 = JagexCache.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", ""); // L: 231
			class101.options_buttons_2Sprite = JagexCache.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", ""); // L: 232
			UrlRequester.field1354 = JagexCache.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", ""); // L: 233
			class16.field81 = class67.options_buttons_0Sprite.subWidth; // L: 234
			class268.field3212 = class67.options_buttons_0Sprite.subHeight; // L: 235
			class193.loginScreenRunesAnimation = new LoginScreenAnimation(Login.runesSprite); // L: 236
			if (var2) { // L: 237
				Login.Login_username = ""; // L: 238
				Login.Login_password = ""; // L: 239
				Login.field876 = new String[8]; // L: 240
				Login.field896 = 0; // L: 241
			}

			WorldMapCacheName.field2912 = 0; // L: 243
			class92.otp = ""; // L: 244
			Login.field900 = true; // L: 245
			Login.worldSelectOpen = false; // L: 246
			if (!class12.clientPreferences.method2226()) { // L: 247
				Archive var12 = AbstractUserComparator.archive6; // L: 248
				var9 = var12.getGroupId("scape main"); // L: 250
				int var10 = var12.getFileId(var9, ""); // L: 251
				UserComparator4.method2573(2, var12, var9, var10, 255, false); // L: 252
			} else {
				UrlRequester.method2538(2); // L: 255
			}

			MouseRecorder.method2088(false); // L: 256
			Login.clearLoginScreen = true; // L: 257
			Login.xPadding = (GraphicsObject.canvasWidth - 765) / 2; // L: 258
			Login.loginBoxX = Login.xPadding + 202; // L: 259
			Decimator.loginBoxCenter = Login.loginBoxX + 180; // L: 260
			UserComparator6.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 261
			SecureRandomCallable.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 262
			Clock.logoSprite.drawAt(Login.xPadding + 382 - Clock.logoSprite.subWidth / 2, 18); // L: 263
		}
	} // L: 187 264

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-707674670"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) { // L: 4722
			if (WorldMapDecoration.loadInterface(var0)) { // L: 4723
				Widget[] var1 = NetSocket.Widget_interfaceComponents[var0]; // L: 4724

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 4725
					Widget var3 = var1[var2]; // L: 4726
					if (var3.onLoad != null) { // L: 4727
						ScriptEvent var4 = new ScriptEvent(); // L: 4728
						var4.widget = var3; // L: 4729
						var4.args = var3.onLoad; // L: 4730
						class10.runScript(var4, 5000000, 0); // L: 4731
					}
				}

			}
		}
	} // L: 4734
}
